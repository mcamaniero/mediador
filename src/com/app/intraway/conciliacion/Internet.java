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
import com.app.dao.conciliacion.cms.AdmConciliacionCms;
import com.app.dao.conciliacion.cms.AdmConciliacionCmsDAO;
import com.app.dao.titan.Querys;
import com.app.intraway.consulta.GetReport;
import com.app.intraway.consulta.ids.CableModem;
import com.app.intraway.consulta.ids.ClienteCrm;
import com.app.tv.tvp_admsessions.dao.AdmSessions;
import com.app.tv.tvp_admsessions.dao.AdmSessionsDAO;

public class Internet{

	private ClienteCrm Cliente;
	private Integer Sesion;
	private List<Vector> ContratosCM;

	private ExecutorService execSvcCM;
	
	public Internet() {
	}

	public Internet(Integer sesion, boolean buscarDialUp, boolean buscarEmail) {

		this.Sesion = sesion;

		//lee los productos de las tablas de titan
		List<Vector> products = new Querys().findAllCMS2();

		EntityManagerHelper.beginTransaction();

		System.out.println("Numero Registros Encontrados "+products.size());
		
		try{
			
			int key = 1;
			for(Vector tmp : products){
				//System.out.println(tmp);

				String ciudad 			= tmp.get(0)==null ? "" : tmp.get(0).toString();
				String clienteCrm 		= tmp.get(1)==null ? "" : tmp.get(1).toString();
				String idProducto 		= tmp.get(2)==null ? "" : tmp.get(2).toString();
				String macT 			= tmp.get(5)==null ? "" : tmp.get(5).toString();
				String servicePackageT 	= tmp.get(6)==null ? "" : tmp.get(6).toString();
				String cpsT 			= tmp.get(7)==null ? "" : tmp.get(7).toString();
				String estadoT 			= tmp.get(4)==null ? "" : tmp.get(4).toString();
				String activitytype		= tmp.get(8)==null ? "" : tmp.get(8).toString();


				AdmConciliacionCms entity = new AdmConciliacionCms(0,ciudad,clienteCrm, idProducto, macT, servicePackageT, cpsT, estadoT,
						"","","","", GregorianCalendar.getInstance().getTime(), Sesion, activitytype);

				new AdmConciliacionCmsDAO().save(entity);

				key++;

			}
			
			EntityManagerHelper.commit();

			ContratosCM = new AdmConciliacionCmsDAO().findAllViewCM();

			execSvcCM = Executors.newFixedThreadPool(4);

			for(Vector con : ContratosCM )
				execSvcCM.execute( new InternetIW(con.get(0).toString(), con.get(1).toString(), Sesion,
													buscarDialUp, buscarEmail));

			execSvcCM.shutdown();


		}catch(Exception e){
			e.printStackTrace();
			EntityManagerHelper.rollback();
		}
		
		
		
		while(true){
			if(execSvcCM.isTerminated()){ 
				//actualizo la sesion
				List<AdmSessions> objSesion = new AdmSessionsDAO().findBySesionInt(Sesion);
				if(objSesion.size()>0){
					EntityManagerHelper.beginTransaction();
					AdmSessions entity = objSesion.get(0);
					entity.setSesionIntFecha(GregorianCalendar.getInstance().getTime());
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

	

	public ClienteCrm getCliente() {
		return Cliente;
	}

	public void setCliente(ClienteCrm cliente) {
		Cliente = cliente;
	}






	class InternetIW implements Runnable{

		String Ciudad;
		String Contrato;
		Integer Sesion;
		boolean BuscarDialUp = false;
		boolean BuscarEmail = false;
		private List<AdmConciliacionCms> RegistrosCM;


		InternetIW(String ciudad, String contrato, Integer sesion, boolean buscarDialUp,
				boolean buscarEmail){
			this.Ciudad = ciudad;
			this.Contrato = contrato;
			this.Sesion = sesion;
			this.BuscarDialUp = buscarDialUp;
			this.BuscarEmail = buscarEmail;
		}

		public void run() {

			ClienteCrm clientIW = null;

			try {
				clientIW = new GetReport(Ciudad, Contrato,null, null, null, BuscarDialUp, BuscarEmail).getClienteCrm();
				if(!clientIW.getNombre().equals("NO EXISTE EL CLIENTE")){

					//saco los CM de titan
					RegistrosCM = new AdmConciliacionCmsDAO().findByProperty(AdmConciliacionCmsDAO.CLIENTECRM, Contrato,
							"sesion", Sesion, "ciudad", Ciudad);

					//cliente creado con los ids d la base de datos
					ClienteCrm clienteBD = new ClienteCrm(Ciudad, Contrato);
					CableModem	[] cm = new CableModem[RegistrosCM.size()];

					int i = 0;
					for(AdmConciliacionCms tmpCm : RegistrosCM){
						CableModem cmTmp = new CableModem(tmpCm.getIdproducto(),"0");
						cmTmp.setCantCPE(tmpCm.getCpsT());
						cmTmp.setMacaddress(tmpCm.getMacT());
						cmTmp.setServicePackege(tmpCm.getServicepackageT());
						cmTmp.setEstado(tmpCm.getEstadoT());

						cm[i] = cmTmp;
						cm[i].setAdmConciliacionCm(tmpCm);
						i++;
					}
					clienteBD.setCm(cm);
					clientIW.equals(clienteBD);

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



	
	public static void main(String ar[]){
		
		new Internet(125, false, false);
		
	}




}
