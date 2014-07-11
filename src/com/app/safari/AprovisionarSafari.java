package com.app.safari;

import java.io.IOException;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import tvcable.app.comarch.utils.Codigos;
import ec.com.grupotvcable.wsdlsafari.Cabecera;
import ec.com.grupotvcable.wsdlsafari.Comando;
import ec.com.grupotvcable.wsdlsafari.Mensaje;
import ec.com.grupotvcable.wsdlsafari.Respuesta;
import ec.com.grupotvcable.wsdlsafari.Safari;

public class AprovisionarSafari {


	private static final int CREACION_SIP 			= 1001;
	private static final int CREACION_SIP_TMP 		= 1101;

	private static final int ACTUALIZACION_E1 		= 1002;
	private static final int ACTUALIZACION 			= 1003;
	private static final int CALL_FEATURE		 	= 1004;
	private static final int ELIMINACION_SIP	 	= 1005;

	private static final int CONSULTA_LINEA	 		= 1010;

	private static final int CONSULTA_HUNT_GROUP	= 2001;
	private static final int CREACION_HUNT_GROUP	= 2002;
	private static final int ELIMINACION_HUNT_GROUP	= 2003;

	private static final int CONSULTA_E1 			= 3002;
	
	private static final int CREACION_LINEA_EXTENDIDA		= 100;
	
	
	private Cabecera Cab = null;
	private Respuesta Resp = new Respuesta();
	private Safari Saf = null;



	private SafariImp SafImp = null; 
	//private static final int prueba = 778322;
	private Comando Cmd = null;


	public AprovisionarSafari(Comando cmd) throws ServiceException {
		this.Cmd = cmd;
		Saf = cmd.getDetalle().getSafari();
		Cab = cmd.getCabecera();
		//SafImp = new SafariImp(cmd.getCabecera().getIDEmpresa(), cmd.getDetalle().getSafari());
	}


	public Respuesta Aprovisionar() throws IOException, Exception{

		/*if(Saf.getTelefono() == prueba){//para redirecionar al servidor de desarrollo.
			WsdlSafariClient client = new WsdlSafariClient();
			WsdlSafari service = client.getWsdlSafariSOAP();
			Resp = service.aprovSafari(Cmd);
		}else{*/

		Mensaje Mens = new Mensaje();

		if(Cab.getNegocio()==Codigos.SETEL){
			
			
			/*String current_user ;//= Cmd.getDetalle().getIntraway().getInterfaz().getDatoI1();
			String current_user_name ;//= Cmd.getDetalle().getIntraway().getInterfaz().getDatoI2();
			String current_schema ;//= Cmd.getDetalle().getIntraway().getInterfaz().getCustomer4();
				
			
			FileInputStream fis = null;
			Properties prop = new Properties();
			String path = getClass().getProtectionDomain().getCodeSource().
			getLocation().toString().substring(5);
			path = path.substring(0, path.length()-25);

			try {
				fis = new FileInputStream(new File( path + "/userTest.properties"));
				prop.load(fis);
			} catch(IOException e) {
			}

			String[] tmp_users 		= prop.getProperty("users_test").split(",");
			String[] tmp_schemas 	= prop.getProperty("schema_test").split(",");
			String schema_Prod 		= prop.getProperty("schema_produccion");
			
			String pref 			= "";

			for(String usu : tmp_users)
				if(current_user.equals(usu))
					for(String schema : tmp_schemas)
						if(current_schema.equals(schema)){
							pref = prop.getProperty("pref_intraway");
							break;
						}
		
			
			*/
			//redirecciono al SafariNAC
			if(Cab.getIDEmpresa()!=94 && Cab.getIDEmpresa()!=63){
				//le cambio para que aprovisione en el safariNAC
				Cab.setIDEmpresa(65);
				//agrego un digito mas a la linea
				Saf.setDatoS1("0"+Saf.getDatoS1());
			}
			
			System.out.println("getIDEmpresa "+Cab.getIDEmpresa());
		
			SafImp = new SafariImp(Cmd.getCabecera().getIDEmpresa(), Cmd.getDetalle().getSafari());
			if(Saf.getAccion().equals("SIP")){
				
				switch(Cab.getInterface()){

				case CREACION_SIP:
					Mens = CreacionSip();
					break;
				case ACTUALIZACION:
					Mens = Actualizacion();
					break;
				case CALL_FEATURE:
					Mens = Call_Feature();
					break;
				case ELIMINACION_SIP:
					Mens = EliminacionSip();
					break;
				case CONSULTA_LINEA:
					Mens = ConsultaLinea();
					break;
				case CREACION_SIP_TMP:
					Mens = CreacionSip_TMP();
					break;
				case CREACION_LINEA_EXTENDIDA:
					Mens = CreacionLineaExtendida();
					break;
				
				}
			
			}else if(Saf.getAccion().equals("E1")){
				
				if(Cab.getInterface() == ACTUALIZACION_E1){
					
					//Mens = new SafariIE1(Cab.getIDEmpresa(), Saf).CambioPlan();
					Mens = new SafariSsh(Cab.getIDEmpresa(), Saf).CambioPlan();
					
				}else if(Cab.getInterface() == CONSULTA_E1)
					Mens = SafImp.ConsultaE1();
			}
			else if(Saf.getAccion().equals("HG")){
				
				switch(Cab.getInterface()){

				case CONSULTA_HUNT_GROUP:
					Mens = ConsultaHuntGroup();
					break;
				case CREACION_HUNT_GROUP:
					Mens = CreaHuntGroup();
					break;
				case ELIMINACION_HUNT_GROUP:
					Mens = EliminaHuntGroup();
					break;
				}
				
			}
			
		}else{
			Mens.setCodError(0);
			Mens.setDetMensaje(Codigos.MensNegocioIncorrecto);
			Resp.setMensaje(Mens);
			return Resp;
		}
		Resp.setMensaje(Mens);

		//}
		return Resp; 
	}




	

	private Mensaje CreacionLineaExtendida() throws RemoteException {
		//creo linea en safari
		if(Saf.getDatoS2().equals("STD-FULL-PRE"))
			Saf.setDatoS2("STD-FULL-POST");
		
		return SafImp.CreateLineaSip_Extendida();
	}


	private Mensaje ConsultaHuntGroup() {
		return SafImp.ConsultaHuntGroup();
	}

	private Mensaje CreaHuntGroup() throws RemoteException {
		return SafImp.CreaHuntGroup();
	}
	
	private Mensaje EliminaHuntGroup() throws RemoteException {
		return SafImp.EliminaHuntGroup();
	}

	private Mensaje EliminacionSip() {
		return SafImp.DeleteLineaSip();
	}


	public Mensaje CreacionSip() throws ServiceException{
		return SafImp.CreateLineaSip();
	}

	public Mensaje CreacionSip_TMP() throws ServiceException{
		return SafImp.CreateLineaSip_TMP();
	}

	public Mensaje Actualizacion() throws IOException, Exception{
		return SafImp.UpdateLineaSip();
	}


	public Mensaje Call_Feature() throws ServiceException, RemoteException{
		return SafImp.CallFeatures();
	}

	public Mensaje ConsultaLinea() throws ServiceException, RemoteException{
		return SafImp.ConsultaLinea();
	}


}
