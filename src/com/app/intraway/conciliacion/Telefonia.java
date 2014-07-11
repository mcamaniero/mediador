package com.app.intraway.conciliacion;

import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.xml.rpc.ServiceException;

import org.apache.commons.httpclient.HttpException;
import org.jdom.JDOMException;

import com.app.dao.EntityManagerHelper;
import com.app.dao.conciliacion.cms.AdmConciliacionCmsDAO;
import com.app.dao.conciliacion.linea.AdmConciliacionLinea;
import com.app.dao.conciliacion.linea.AdmConciliacionLineaDAO;
import com.app.dao.titan.Querys;
import com.app.intraway.consulta.GetReport;
import com.app.intraway.consulta.ids.ClienteCrm;
import com.app.intraway.consulta.ids.Linea;
import com.app.safari.EliminarLineaWeb;
import com.app.safari.e1.SubscriberTrunkGrp;
import com.app.tv.tvp_admsessions.dao.AdmSessions;
import com.app.tv.tvp_admsessions.dao.AdmSessionsDAO;

public class Telefonia{

	private ClienteCrm Cliente;
	private Integer Sesion;
	private List<Vector> ContratosCMMTA;

	private ExecutorService execSvcMTA;
	private ExecutorService execSvcSIP;

	private boolean buscarDialUp;
	private boolean buscarEmail;

	public Telefonia(Integer sesion, boolean buscarDialUp, boolean buscarEmail, String tipoSesion) {
		this.Sesion = sesion;
		this.buscarDialUp = buscarDialUp;
		this.buscarEmail = buscarEmail;

		//lee los productos de las tablas de titan
		List<Vector> products = new Querys().findAllTelefonia2(tipoSesion);

		System.out.println("Tipo Sesion "+tipoSesion);
		try{
			EntityManagerHelper.beginTransaction();

			for(Vector tmp : products){
				//System.out.println(tmp);
				String tipo 			= tmp.get(3)==null?"":tmp.get(3).toString();

				if(tipoSesion.equals(tipo)){
					String ciudad 			= tmp.get(0).toString();
					String clienteCrm 		= tmp.get(1).toString();
					String idProducto 		= tmp.get(2).toString();
					String idProductoCm 	= "";
					String macT 			= "";
					String mtamacT 			= "";
					String servicePackageT 	= "";
					String cpsT 			= "";
					String fonoT 			= tmp.get(5)==null?"":tmp.get(5).toString();
					String homeExchangeT 	= tmp.get(6)==null?"":tmp.get(6).toString();
					String estadoT 			= tmp.get(4)==null?"":tmp.get(4).toString();
					String activitytype		= tmp.get(7)==null?"":tmp.get(7).toString();

					AdmConciliacionLinea entity = new AdmConciliacionLinea(0,ciudad,clienteCrm, idProducto, idProductoCm, macT, mtamacT, servicePackageT, cpsT, fonoT, homeExchangeT, estadoT,
							"","","","","","","",GregorianCalendar.getInstance().getTime(),Sesion,tipo, activitytype);

					new AdmConciliacionLineaDAO().save(entity);
				}

			}
			EntityManagerHelper.commit();

		}catch(Exception e){
			e.printStackTrace();
			EntityManagerHelper.rollback();
		}


		ContratosCMMTA = new AdmConciliacionCmsDAO().findAllViewTelefonia();

		execSvcMTA = Executors.newFixedThreadPool(3);
		execSvcSIP = Executors.newFixedThreadPool(4);

		for(Vector con : ContratosCMMTA ){
			if(con.get(2).toString().equals("eMTA Line") )
				execSvcMTA.execute( new TelefoniaIW(con.get(0).toString(), con.get(1).toString(), Sesion ));

			if(con.get(2).toString().equals("SIP Line") )
				execSvcSIP.execute( new TelefoniaSafari(con.get(0).toString(), con.get(1).toString(), Sesion ));

			if(con.get(2).toString().equals("Troncal E1") )
				execSvcSIP.execute( new TelefoniaSafariE1(con.get(0).toString(), con.get(1).toString(), Sesion ));

		}

		execSvcMTA.shutdown();
		execSvcSIP.shutdown();


		while(true){
			if(execSvcMTA.isTerminated() && execSvcSIP.isTerminated()){ 
				//actualizo la sesion
				List<AdmSessions> objSesion = new AdmSessionsDAO().findBySesionTel(Sesion);
				if(objSesion.size()>0){
					EntityManagerHelper.beginTransaction();
					AdmSessions entity = objSesion.get(0);
					entity.setSesionTelFecha(GregorianCalendar.getInstance().getTime());
					new AdmSessionsDAO().update(entity );
					EntityManagerHelper.commit();
				}
				break;
			}

			try {
				Thread.sleep(15000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}




	class TelefoniaIW implements Runnable{

		String Ciudad;
		String Contrato;
		Integer Sesion;
		private List<AdmConciliacionLinea> RegistrosCMMTA;


		TelefoniaIW(String ciudad, String contrato, Integer sesion){
			this.Ciudad = ciudad;
			this.Contrato = contrato;
			this.Sesion = sesion;
		}

		public void run() {

			ClienteCrm clientIW = null;

			try {
				clientIW = new GetReport(Ciudad, Contrato,null, null, null, buscarDialUp, buscarEmail).getClienteCrm();
				if(!clientIW.getNombre().equals("NO EXISTE EL CLIENTE")){

					//saco los CM de titan
					RegistrosCMMTA = new AdmConciliacionLineaDAO().findByProperty(AdmConciliacionLineaDAO.CLIENTECRM, Contrato,
							"sesion", Sesion, "ciudad", Ciudad, "tipo", "eMTA Line");

					//cliente creado con los ids d la base de datos

					for(AdmConciliacionLinea tmpCm : RegistrosCMMTA){
						Linea cmTmp = new Linea(tmpCm.getIdproducto(),"0");
						cmTmp.setEpHomeExchange(tmpCm.getHomeexchangeT());
						cmTmp.setEstado(tmpCm.getEstadoT());
						cmTmp.setTN(tmpCm.getFonoT());

						for(Linea lin : clientIW.getLineas()){

							if(lin.getIdProducto().equals(tmpCm.getIdproducto())){
								EntityManagerHelper.beginTransaction();

								tmpCm.setEstadoIw(lin.getEstado().equals("Activo")?"A":"S");
								tmpCm.setFonoIw(lin.getTN());
								tmpCm.setHomeexchangeIw(lin.getEpHomeExchange());
								tmpCm.setMtamacIw(lin.getMtaPadre().getMacaddress());

								new AdmConciliacionLineaDAO().update(tmpCm);

								EntityManagerHelper.commit();
							}
						}

					}

				}

			} catch (HttpException e) {
				e.printStackTrace();
			} catch (ServiceException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (JDOMException e) {
				e.printStackTrace();
			}

		}
	}




	class TelefoniaSafari implements Runnable{

		String Ciudad;
		String Contrato;
		Integer Sesion;
		private List<AdmConciliacionLinea> RegistrosCMMTA;

		TelefoniaSafari(String ciudad, String contrato, Integer sesion){
			this.Ciudad = ciudad;
			this.Contrato = contrato;
			this.Sesion = sesion;
		}

		public void run() {

			//saco los CM de titan
			RegistrosCMMTA = new AdmConciliacionLineaDAO().findByProperty(AdmConciliacionLineaDAO.CLIENTECRM, Contrato,
					"sesion", Sesion, "ciudad", Ciudad, "tipo", "SIP Line");

			for(AdmConciliacionLinea tmpCm : RegistrosCMMTA){
				com.app.safari.Linea linea = new EliminarLineaWeb(tmpCm.getFonoT().substring(4), Ciudad, "jcalle" ).ConsultarLinea();

				System.out.println(tmpCm.getFonoT()+"linea sip "+linea.getServiceId());

				//si se encontro
				if(!linea.getServiceId().equals("")){
					EntityManagerHelper.beginTransaction();
					tmpCm.setHomeexchangeIw(linea.getHomeExchangeId());
					tmpCm.setEstadoIw(linea.getAdminStatus().equals("ACTIVE")?"A":"S");
					tmpCm.setMtamacIw(linea.getSipDestAddr());
					tmpCm.setFonoIw(linea.getServiceId());
					new AdmConciliacionLineaDAO().update(tmpCm);
					EntityManagerHelper.commit();
				}

			}
		}
	}

	class TelefoniaSafariE1 implements Runnable{

		String Ciudad;
		String Contrato;
		Integer Sesion;
		private List<AdmConciliacionLinea> RegistrosCMMTA;

		TelefoniaSafariE1(String ciudad, String contrato, Integer sesion){
			this.Ciudad = ciudad;
			this.Contrato = contrato;
			this.Sesion = sesion;
		}

		public void run() {

			//saco los CM de titan
			RegistrosCMMTA = new AdmConciliacionLineaDAO().findByProperty(AdmConciliacionLineaDAO.CLIENTECRM, Contrato,
					"sesion", Sesion, "ciudad", Ciudad, "tipo", "Troncal E1");

			for(AdmConciliacionLinea tmpCm : RegistrosCMMTA){

				String resp[] = new SubscriberTrunkGrp(Integer.parseInt(Ciudad), tmpCm.getFonoT().substring(4)).getValues();

				//si se encontro
				if( resp != null){
					String homeExchage	= "";
					String numero		= "";
					for(String r : resp){
						String[] rr = r.split(":");
						if(rr[0].equals("ExchangeProfileName"))
							homeExchage = rr[1];
						if(rr[0].equals("billingNumber"))
							numero 		= rr[1];
					}

					EntityManagerHelper.beginTransaction();

					tmpCm.setHomeexchangeIw(homeExchage);
					tmpCm.setFonoIw(numero);

					new AdmConciliacionLineaDAO().update(tmpCm);
					EntityManagerHelper.commit();
				}

			}
		}
	}


	public static void main(String a[]){
		new Telefonia(2, false, false,"eMTA Line");
	}



}
