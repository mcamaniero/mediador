package com.app.intraway.consulta.ids;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.RemoteException;
import java.util.GregorianCalendar;

import javax.xml.rpc.ServiceException;

import org.apache.commons.httpclient.HttpException;
import org.jdom.JDOMException;

import com.app.dao.AllDAO;
import com.app.dao.EntityManagerHelper;
import com.app.dao.Intraway;
import com.app.dao.IntrawayImpl;
import com.app.dao.conciliacion.AdmConciliacionDAO;
import com.app.dao.conciliacion.cms.AdmConciliacionCms;
import com.app.dao.conciliacion.cms.AdmConciliacionCmsDAO;
import com.app.intraway.consulta.GetDocsisStatus;
import com.app.intraway.consulta.GetReport;
import com.app.intraway.parametros2.Interfaces;


public class CableModem extends Producto{

	private String Macaddress;
	private String CantCPE;
	private String ServicePackege;
	private String Serial;
	private Mta mta;

	public CableModem(String idProducto, String idProductoPadre){
		super(null,null,null,null,idProducto,idProductoPadre,null);
	}

	public CableModem(String userEliminacion, String remoteHost, String remoteIp){
		this.setRemoteHost(remoteHost);
		this.setRemoteIp(remoteIp);
		this.setUserEliminacion(userEliminacion);
	}

	public CableModem(String userEliminacion, String remoteHost, String remoteIp, String nombre, String estado, String idProducto, String idProductoPadre, 
			String macaddress, String cantCPE, String servicePackege, String serial) {
		super(userEliminacion, remoteHost, remoteIp, nombre, idProducto, idProductoPadre, estado);
		this.setCantCPE(cantCPE);
		this.setMacaddress(macaddress);
		this.setServicePackege(servicePackege);
		this.setSerial(serial);    
	}
	public String getMacaddress() {
		return Macaddress;
	}

	public void setMacaddress(String macaddress) {
		Macaddress = macaddress;
	}

	public String getCantCPE() {
		return CantCPE;
	}

	public void setCantCPE(String cantCPE) {
		CantCPE = cantCPE;
	}
	public Mta getMta() {
		return mta;
	}
	public void setMta(Mta mta) {
		this.mta = mta;
	}
	public String getServicePackege() {
		return ServicePackege;
	}
	public void setServicePackege(String servicePackege) {
		ServicePackege = servicePackege;
	}
	public String getSerial() {
		return Serial;
	}
	public void setSerial(String serial) {
		Serial = serial;
	}

	public String EliminarEspacio() throws RemoteException, ServiceException{

		Intraway LogIntraway = new IntrawayImpl().Guardar(this);
		String resultado = new Interfaces(this, Interfaces.INTERFAZ_CM, this.UserEliminacion).EjecutarAccion(Interfaces.ACCION_ELIMINAR);

		String[] resul = resultado.split(":");
		String codError = resul[0].trim();
		String detError = resul[1].trim();

		LogIntraway.setCodError(codError);
		LogIntraway.setDetMensaje(detError);
		LogIntraway.setFechaResp(GregorianCalendar.getInstance().getTime());

		EntityManagerHelper.beginTransaction();
		new AllDAO().update(LogIntraway);
		EntityManagerHelper.commit();

		return codError+","+detError;

	}


	public String EliminarBloqueo() throws RemoteException, ServiceException {

		Intraway LogIntraway = new IntrawayImpl().Guardar(this);
		String resultado = new Interfaces(this, Interfaces.INTERFAZ_BLOQUEO_CM, this.UserEliminacion).EjecutarAccion(Interfaces.ACCION_ELIMINAR);

		String[] resul = resultado.split(":");
		String codError = resul[0].trim();
		String detError = resul[1].trim();

		LogIntraway.setCodError(codError);
		LogIntraway.setDetMensaje(detError);
		LogIntraway.setFechaResp(GregorianCalendar.getInstance().getTime());

		EntityManagerHelper.beginTransaction();
		new AllDAO().update(LogIntraway);
		EntityManagerHelper.commit();

		return codError+","+detError;
	}

	public String EliminarMta() throws RemoteException, ServiceException{
		return this.getMta().EliminarEspacio();
	}


	public String EliminarArbol() throws RemoteException, ServiceException{

		StringBuilder Resp = new StringBuilder();
		//if(!isIdCero()){
		System.out.println("Contrato: "+this.getIdEmpresaCRM()+" "+this.getIdClienteCRM());
		if(getMta()!=null){
			/*for(Linea lin : getMta().getEndPoint()){
					lin.EliminarCallFeature();	//elimino el callfeature
					lin.EliminarEspacio();		//elimino la linea
				}*/
			Resp.append( EliminarMta() );	//elimino el Espacio del MTA
		}
		Resp.append( EliminarEspacio() );
		//}else
		//Resp.append("No se puede Eliminar, espacios tienen idProducto 0, Favor solicitar a Tec Requerimientos Iway.");

		return Resp.toString();
	}


	public String ActivarCM(String mac) throws RemoteException, ServiceException{

		this.setMacaddress(mac);
		Intraway LogIntraway = new IntrawayImpl().Guardar(this);
		String resultado = new Interfaces(this, Interfaces.INTERFAZ_ACTIVAR_CM, this.UserEliminacion).EjecutarAccion(Interfaces.ACCION_MODIFICAR);

		String[] resul = resultado.split(":");
		String codError = resul[0].trim();
		String detError = resul[1].trim();

		LogIntraway.setCodError(codError);
		LogIntraway.setDetMensaje(detError);
		LogIntraway.setFechaResp(GregorianCalendar.getInstance().getTime());

		EntityManagerHelper.beginTransaction();
		new AllDAO().update(LogIntraway);
		EntityManagerHelper.commit();

		return codError+","+detError;
		
	}
	
	public String ActivarMTA(String mac, String model) throws RemoteException, ServiceException{

		this.getMta().setMacaddress(mac);
		if(model!= null && !model.equals("")){
			this.getMta().setMtaModel(model.trim());
			if(model.equals("TM402G"))
				this.getMta().setMtaModel("3080");
			else if(model.equals("AMBIT22"))
				this.getMta().setMtaModel("U10C022");
			else if(model.equals("AMBIT34"))
				this.getMta().setMtaModel("U10C034");
		}
		
		Intraway LogIntraway = new IntrawayImpl().Guardar(this.getMta());
		String resultado = new Interfaces(this.getMta(), Interfaces.INTERFAZ_ACTIVAR_MTA, this.UserEliminacion).EjecutarAccion(Interfaces.ACCION_MODIFICAR);

		String[] resul = resultado.split(":");
		String codError = resul[0].trim();
		String detError = resul[1].trim();

		LogIntraway.setCodError(codError);
		LogIntraway.setDetMensaje(detError);
		LogIntraway.setFechaResp(GregorianCalendar.getInstance().getTime());

		EntityManagerHelper.beginTransaction();
		new AllDAO().update(LogIntraway);
		EntityManagerHelper.commit();

		return codError+","+detError;
		
	}

	public File Regularizacion(File archivo) throws IOException, ServiceException, JDOMException{

		FileReader fr = new FileReader (archivo);
		BufferedReader br = new BufferedReader(fr);

		String accion = br.readLine().trim();
		fr.close();
		System.out.println(accion);

		if ( accion.equals("modificacion") ){
			return ActualizarLinea(archivo);
		}else if( accion.equals("eliminacion total") ){
			return EliminarTMPTotal(archivo);
		}else if( accion.equals("eliminacion") ){
			return EliminarTMP(archivo);
		}

		return new File("CabeceraIncorrecta");
		//return accion.equals("modificacion") ? ActualizarTMP(archivo) : EliminarTMP(archivo);
	}

	/*public String ActualizarTMP(File archivo) throws HttpException, IOException, ServiceException, JDOMException{
	return "";
	}*/




	public File ActualizarLinea(File archivo) throws HttpException, IOException, ServiceException, JDOMException{

		BufferedReader br = new BufferedReader(new FileReader(archivo));

		File resultado = new File("/tmp/titan/resp_"+archivo.getName());
		FileWriter fw = new FileWriter(resultado);
		PrintWriter salida = new PrintWriter(new BufferedWriter(fw));

		String linea = null;
		while((linea=br.readLine())!=null){// Lectura del fichero
			if(!linea.equals("modificacion")){
				String[] resul = linea.split(",");
				String ciudad = resul[0].trim();
				String contrato = resul[1].trim();
				String fono = resul[2].trim();
				String homeexchange = resul[3].trim();
				String puerto = resul[4].trim();

				ClienteCrm cliente = new GetReport(ciudad,contrato,this.UserEliminacion, this.getRemoteHost(), this.getRemoteIp()).getClienteCrm();
				System.out.println("Modificacion Contrato: "+ciudad+" "+contrato+" "+cliente.getCm());

				String respuesta = "";
				if(cliente!=null) {
					if (cliente.getCm()!=null){
						for ( CableModem cm : cliente.getCm() ){
							if(cm!=null && cm.getMta()!=null && cm.getMta().getEndPoint()!=null){
								for(Linea lin : cm.getMta().getEndPoint()){
									if ( lin.getTN().equals(fono) ){
										lin.setEpHomeExchange(homeexchange);
										lin.setEndPointNumber(puerto);
										String accion = Interfaces.ACCION_MODIFICAR;
										if( homeexchange.equals("STD-SUS-MORA31") 
												|| homeexchange.equals("STD-SUS-TITULAR"))
											accion = Interfaces.ACCION_SUSPENDER;

										respuesta = ","+lin.EjecutarAccion(accion);
									}

								}
							}
						}
						if(respuesta.equals(""))
							respuesta = ",0,Linea no encontrada";

					}else{
						respuesta = ",0,CMs no encontrado";
					}

				}else{
					respuesta = ",0,Cliente no encontrado";
				}

				salida.println(linea+respuesta);


			}//fin if modificacion

		}//fin while
		salida.close();
		br.close();

		return resultado;
	}



	/*public File ActualizarCM(File archivo) throws HttpException, IOException, ServiceException, JDOMException{

		BufferedReader br = new BufferedReader(new FileReader(archivo));

		File resultado = new File("/tmp/titan/resp_"+archivo.getName());
		FileWriter fw = new FileWriter(resultado);
		PrintWriter salida = new PrintWriter(new BufferedWriter(fw));

		String linea = null;
		while((linea=br.readLine())!=null){// Lectura del fichero
			if(!linea.equals("eliminacion")){
				String[] resul = linea.split(",");
				String ciudad = resul[0].trim();
				String contrato = resul[1].trim();
				String idproducto = resul[2].trim();

				String respuesta = "";

				ClienteCrm cliente = new GetReport(ciudad,contrato, this.UserEliminacion, this.getRemoteHost(), this.getRemoteIp() ).getClienteCrm();
				System.out.println("Eliminacion Contrato: "+ciudad+" "+contrato);

				if(cliente!=null && cliente.getCm()!=null){
					for ( CableModem cm : cliente.getCm() ){
						if(cm!=null){
							if(cm.getIdProducto().equals(idproducto)){
								respuesta = "," + cm.CrearBloqueo();
							}

						}
					}
					if(respuesta.equals(""))
						respuesta = ",0,CM no encontrado";

					salida.println(linea+respuesta);
				}else{
					respuesta = ",0,Cliente no encontrado";
					salida.println(linea+respuesta);
				}


			}//fin de eliminacion

		}//fin del while

		salida.close();
		br.close();

		return resultado;
	}
	 */





	public File EliminarTMP(File archivo) throws HttpException, IOException, ServiceException, JDOMException{

		BufferedReader br = new BufferedReader(new FileReader(archivo));

		File resultado = new File("/tmp/titan/resp_"+archivo.getName());
		FileWriter fw = new FileWriter(resultado);
		PrintWriter salida = new PrintWriter(new BufferedWriter(fw));

		String linea = null;
		while((linea=br.readLine())!=null){// Lectura del fichero
			if(!linea.equals("eliminacion")){
				String[] resul 		= linea.split(",");
				String ciudad 		= resul[0].trim();
				String contrato 	= resul[1].trim();
				String idproducto 	= resul[2].trim();

				String respuesta 	= "";

				ClienteCrm cliente = new GetReport(ciudad,contrato, this.UserEliminacion, this.getRemoteHost(), this.getRemoteIp() ).getClienteCrm();
				System.out.println("Eliminacion Contrato: "+ciudad+" "+contrato);

				if(cliente!=null && cliente.getCm()!=null){
					for ( CableModem cm : cliente.getCm() ){
						if(cm!=null){
							if(cm.getIdProducto().equals(idproducto)){
								if(cm.getMta()!=null)
									respuesta = cm.EliminarMta();	//elimino el Espacio del MTA
								else respuesta = respuesta + ",0,MTA no encontrado";
								respuesta = respuesta + "," + cm.EliminarEspacio();
							}

						}
					}
					if(respuesta.equals(""))
						respuesta = ",0,CM no encontrado";

					salida.println(linea+respuesta);
				}else{
					respuesta = ",0,Cliente no encontrado";
					salida.println(linea+respuesta);
				}


			}//fin de eliminacion

		}//fin del while

		salida.close();
		br.close();

		return resultado;
	}

	public File EliminarTMPTotal(File archivo) throws HttpException, IOException, ServiceException, JDOMException{

		BufferedReader br = new BufferedReader(new FileReader(archivo));

		File resultado = new File("/tmp/titan/resp_"+archivo.getName());
		FileWriter fw = new FileWriter(resultado);
		PrintWriter salida = new PrintWriter(new BufferedWriter(fw));

		String linea = null;
		while((linea=br.readLine())!=null){// Lectura del fichero
			if(!linea.equals("eliminacion total")){
				String[] resul 		= linea.split(",");
				String ciudad 		= resul[0].trim();
				String contrato 	= resul[1].trim();
				
				String respuesta 	= "";

				ClienteCrm cliente = new GetReport(ciudad,contrato, this.UserEliminacion, this.getRemoteHost(), this.getRemoteIp() ).getClienteCrm();
				System.out.println("Eliminacion Contrato: "+ciudad+" "+contrato);

				if(cliente!=null && cliente.getCm()!=null){
					for ( CableModem cm : cliente.getCm() ){
						if(cm!=null){
							if(cm.getMta()!=null)
								respuesta = cm.EliminarMta();	//elimino el Espacio del MTA
							else respuesta = respuesta + ",0,MTA no encontrado";
							respuesta = respuesta + "," + cm.EliminarEspacio();
						}
					}
					if(respuesta.equals(""))
						respuesta = ",0,CM no encontrado";

					salida.println(linea+respuesta);
				}else{
					respuesta = ",0,Cliente no encontrado";
					salida.println(linea+respuesta);
				}

			}//fin de eliminacion
		}//fin del while

		salida.close();
		br.close();

		return resultado;
	}



	@Override
	public boolean equals(Object obj){
		//System.out.println("ID: "+this.IdProducto+" "+((CableModem)obj).getIdProducto());

		/*return (this.IdProducto.equals( ((CableModem)obj).getIdProducto() ) 
				&& this.getIdProductoPadre().equals(((CableModem)obj).getIdProductoPadre())) 
				? true : false;*/

		return (this.IdProducto.equals( ((CableModem)obj).getIdProducto() )) 
		? true : false;
	}


	/**
	 * Compara un CM consultado de IW con una lista de CM consultados de BaseTitan
	 * @param cm
	 * @return
	 */
	public boolean ExiteEnIw(CableModem[] cm) {
		//System.out.println(getIdClienteCRM());

		for(CableModem tmp : cm){
			if(this.equals(tmp)){
				//si existe guado en la base que si existe

				//String sp = getServicePackege().substring(getServicePackege().length()-1);
				//System.out.println(getIdClienteCRM()+" getServicePackege: "+getServicePackege());
				
				tmp.getAdmConciliacion().setExiste(true);
				tmp.getAdmConciliacion().setEstadoIw(this.getEstado());
				tmp.getAdmConciliacion().setAddressIw(this.getMacaddress());
				EntityManagerHelper.beginTransaction();
				new AdmConciliacionDAO().update(tmp.getAdmConciliacion());
				EntityManagerHelper.commit();
				
				/*EntityManagerHelper.beginTransaction();
				if(tmp.getAdmConciliacion() != null){
					tmp.getAdmConciliacion().setIsExiste(true);
					tmp.getAdmConciliacion().setIsCorrecto(this.getMacaddress());
					tmp.getAdmConciliacion().setIdprodpadre_iw(this.getEstado().equals("Activo")?"A":"S");
					new AdmConciliacionDAO().update(tmp.getAdmConciliacion());
				}
				if(tmp.getAdmConciliacionCm() != null){
					tmp.getAdmConciliacionCm().setCpsIw(this.getCantCPE());
					tmp.getAdmConciliacionCm().setEstadoIw(getEstado().equals("Activo")?"A":"S");
					tmp.getAdmConciliacionCm().setMacIw(this.getMacaddress());
					tmp.getAdmConciliacionCm().setServicepackageIw(this.getServicePackege());
					new AdmConciliacionCmsDAO().update(tmp.getAdmConciliacionCm());

				}

				EntityManagerHelper.commit();*/

				//getMta().ExiteEnIw(tmp.getMta());

				//return true;
			}/*else{

				try {
					if(tmp.getAdmConciliacion() != null){

						GetDocsisStatus idprod = new GetDocsisStatus(this.getIdEmpresaCRM(),"0",this.getIdProducto(),"1");

						if(idprod.getIdClienteCrm()!=null && !	idprod.getIdClienteCrm().equals("")){

							EntityManagerHelper.beginTransaction();
							tmp.getAdmConciliacion().setIsCorrecto(idprod.getMacCm());
							tmp.getAdmConciliacion().setIdprodpadre(idprod.getIdClienteCrm());
							new AdmConciliacionDAO().update(tmp.getAdmConciliacion());

							EntityManagerHelper.commit();
						}
					}


				} catch (RemoteException e) {
					e.printStackTrace();
				} catch (ServiceException e) {
					e.printStackTrace();
				}


			}*/

		}

		return false;
	}

	public void setAdmConciliacionCM(AdmConciliacionCms tmpCm) {
		// TODO Auto-generated method stub

	}



	public Linea[] getAllLineas(){
		return (getMta()!=null) ? getMta().getEndPoint() : null;
	}



	/*public boolean ExiteEnIwByIdProducto() {

		GetDocsisStatus idprod = null;
		try {
			idprod = new GetDocsisStatus(this.getIdEmpresaCRM(),"0",this.getIdProducto(),"1");

			if(idprod.getIdClienteCrm()!=null &&  !idprod.getIdClienteCrm().equals("")){

				EntityManagerHelper.beginTransaction();
				this.getAdmConciliacion().setIsCorrecto(idprod.getMacCm());
				this.getAdmConciliacion().setIdprodpadre(idprod.getIdClienteCrm());
				new AdmConciliacionDAO().update(this.getAdmConciliacion());

				EntityManagerHelper.commit();
				return true;
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}*/


}
