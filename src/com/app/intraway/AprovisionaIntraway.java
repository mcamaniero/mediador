package com.app.intraway;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.Properties;

import javax.xml.rpc.ServiceException;

import ec.com.grupotvcable.wsdlintraway.Comando;
import tvcable.app.comarch.utils.Codigos;

import ec.com.grupotvcable.wsdlintraway.Mensaje;
import ec.com.grupotvcable.wsdlintraway.Respuesta; 
import ec.com.grupotvcable.wsdlmcafee.WsdlMcAfeeImpl;

public class AprovisionaIntraway {

	private Comando Cmd = null;


	public AprovisionaIntraway(Comando comando) {
		this.Cmd = comando;
	}


	public Respuesta Aprovisionar() throws RemoteException, ServiceException, IntrawayExceptions {
		Respuesta Resp = new Respuesta();
		Mensaje Men = new Mensaje();

		Resp.setCabecera(Cmd.getCabecera());

			if(Cmd.getDetalle().getIntraway().getInterfaz().getTn()!= null 
					&& !Cmd.getDetalle().getIntraway().getInterfaz().getTn().equals("")){
				String tnTmp = Cmd.getDetalle().getIntraway().getInterfaz().getTn();
				if(tnTmp.substring(0, 4).equals("DULP")){
					Cmd.getDetalle().getIntraway().getInterfaz().setTn(tnTmp.substring(4, tnTmp.length()));
				}
			}

			if(Cmd.getDetalle().getIntraway().getInterfaz().getMACAddress()!= null 
					&& !Cmd.getDetalle().getIntraway().getInterfaz().getMACAddress().equals("")){
				String macTmp = Cmd.getDetalle().getIntraway().getInterfaz().getMACAddress();
				if(macTmp.substring(0, 4).equals("DULP")){
					Cmd.getDetalle().getIntraway().getInterfaz().setMACAddress(macTmp.substring(4, macTmp.length()));
				}
			}

			if(Cmd.getDetalle().getIntraway().getInterfaz().getUsername()!= null 
					&& !Cmd.getDetalle().getIntraway().getInterfaz().getUsername().equals("")){
				String emailTmp = Cmd.getDetalle().getIntraway().getInterfaz().getUsername();
				if(emailTmp.substring(0, 3).equals("dlp")){
					Cmd.getDetalle().getIntraway().getInterfaz().setUsername(emailTmp.substring(3, emailTmp.length()));
				}
			}
			
			String current_user = Cmd.getDetalle().getIntraway().getInterfaz().getDatoI1();
			String current_user_name = Cmd.getDetalle().getIntraway().getInterfaz().getDatoI2();
			String current_schema = Cmd.getDetalle().getIntraway().getInterfaz().getCustomer4();
			String current_cpartyid = Cmd.getDetalle().getIntraway().getEstandar().getAuthKey();

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
			String[] tmp_allow_cpartyid 	= prop.getProperty("cpartyid_test").split(",");
			String schema_Prod 		= prop.getProperty("schema_produccion");


			String pref 			= "";
			boolean isCpartyId_Allow = false;
			boolean isUser_Allow = false;
			boolean isSchema_Allow = false;


			for(String cparty_id : tmp_allow_cpartyid){
				if(current_cpartyid.equals(cparty_id)){
					isCpartyId_Allow = true;
					break;
				}
			}

			for(String usu : tmp_users)
				if(current_user.equals(usu)){
					isUser_Allow = true;
					break;
				}	

			for(String schema : tmp_schemas)
				if(current_schema.equals(schema)){
					isSchema_Allow = true;
					break;
				}


			if(isSchema_Allow && isCpartyId_Allow)
				pref = prop.getProperty("pref_intraway");
			if(isSchema_Allow && isUser_Allow)
				pref = prop.getProperty("pref_intraway");


			if(schema_Prod.equals(current_schema) || !pref.equals(""))
				Men = new Interfaces(Cmd, pref).getRespuesta();
			else {
				Men.setCodError(1000);
				Men.setDetMensaje("Usuario: "+current_user+"-"+current_user_name+" y Schema: "+current_schema+" no Autorizados para Aprovisionamiento Intraway");
			}


			Resp.setMensaje(Men);

		//}


		return Resp;
	}



}
