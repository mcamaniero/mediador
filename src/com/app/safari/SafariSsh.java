package com.app.safari;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import tvcable.app.comarch.utils.Codigos;


import com.app.safari.e1.SubscriberTrunkGrp;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.UserInfo;

import ec.com.grupotvcable.wsdlsafari.Mensaje;
import ec.com.grupotvcable.wsdlsafari.Safari;

public class SafariSsh extends Parametros{

	private OutputStream out = null;
	private InputStream in = null;
	private String Password = "";
	
	private int Ciudad = 0;
	private Safari Saf = null;

	private Channel channel = null;
	private Session session = null;
	private JSch jsch;

	SafariSsh(int ciudad, Safari saf){

		jsch = new JSch();
		Ciudad = ciudad;
		Saf = saf;

		try {
			switch(ciudad){
			case Codigos.QUITO:
				session = jsch.getSession(this.ssh_uio_username, this.ssh_uio_host, Integer.parseInt(this.ssh_uio_port));
				Password = this.ssh_uio_password;
				break;
			case Codigos.GUAYAQUIL:
				session = jsch.getSession(this.ssh_gye_username, this.ssh_gye_host, Integer.parseInt(this.ssh_gye_port));
				Password = this.ssh_gye_password;
				break;
			case Codigos.CUENCA:
				session = jsch.getSession(this.ssh_nac_username, this.ssh_nac_host, Integer.parseInt(this.ssh_nac_port));
				Password = this.ssh_nac_password;
			}
			session.setUserInfo(new MyUserInfo());
			session.connect();

		} catch (JSchException e) {
			e.printStackTrace();
		}

	}


	public Mensaje CambioPlan(){

		String resp[] = new SubscriberTrunkGrp(Ciudad, Saf.getDatoS1().substring(4)).getValues();
		Mensaje mens = new Mensaje();

		if(resp != null){
			
			String resourceGrpNumber = "";
			
			for(String r : resp){
				  String[] rr = r.split(":");
				  if(rr[0].trim().equals("resourceGrpNumber")){
					  resourceGrpNumber = rr[1];
					  System.out.println("Piloto: "+Saf.getDatoS1().substring(4));
					  System.out.println("resourceGrpNumber: "+resourceGrpNumber);
					  break;
				  }
			}
			
			String TrunkGrp = "TrunkGrp "+resourceGrpNumber.trim()+"\n";
			String ExchangeProfileName = "ExchangeProfileName "+Saf.getDatoS2().trim()+"\n";
			String end = "end\n";

			
			try {
				channel = session.openChannel("shell");

				out=channel.getOutputStream();
				in=channel.getInputStream();
				channel.connect();


				Write(TrunkGrp);
				Write(ExchangeProfileName);
				Write(end);
				Write(end);

				channel.disconnect();
				session.disconnect();

				mens.setCodError(1);//verificar el cod error
	        	mens.setDetMensaje("Proceso realizado con exito");
	        	
			} catch (JSchException e) {
				mens.setCodError(1000);//verificar el cod error
	        	mens.setDetMensaje(e.getMessage());
				e.printStackTrace();
			} catch (IOException e) {
				mens.setCodError(1000);//verificar el cod error
	        	mens.setDetMensaje(e.getMessage());
				e.printStackTrace();
			}
		}else{
			mens.setCodError(3);//verificar el cod error
        	mens.setDetMensaje("No se encontro el numero Piloto "+Saf.getDatoS1());
		}

		return mens;
	}




	private String Write(String str) throws IOException{

		//System.out.println("Comando "+str);

		out.write(str.getBytes());
		out.flush();
		boolean sigue = false;
		StringBuilder resp = new StringBuilder();
		while(true){
			while(in.available()>0){
				int i = in.read();

				char c = (char)i;
				resp.append(c);
				System.out.print(c);
				if(resp.toString().length()>2 && resp.toString().substring(resp.toString().length()-2).equals("# ")){
					sigue = true;
					break;
				}

			}
			try{Thread.sleep(15);}catch(Exception ee){}
			if(sigue)break;
		}			

		System.out.println("Termino: "+resp.toString());

		return resp.toString();

	}



	class MyUserInfo implements UserInfo{
		public String getPassphrase() {
			return null;
		}

		public String getPassword() {
			return Password;
		}

		public boolean promptPassphrase(String arg0) {
			return true;
		}

		public boolean promptPassword(String arg0) {
			return true;
		}

		public boolean promptYesNo(String arg0) {
			return true;
		}

		public void showMessage(String arg0) {
			System.out.println("---showMessage: "+arg0);
		}
	}

}
