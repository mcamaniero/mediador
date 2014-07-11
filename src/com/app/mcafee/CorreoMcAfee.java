package com.app.mcafee;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Properties;

import javax.mail.Address;
import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.search.FromStringTerm;
import javax.mail.search.SearchTerm;
import javax.mail.search.SentDateTerm;

import com.app.mcafee.dao.LogMcAfee;
import com.app.mcafee.dao.LogMcAfeeDAO;

public  class CorreoMcAfee {

	//protected String Host 		= "tvc-srvgye2.grupotvcable.com";
	//protected String Host 		= "tvc-srvexgye.grupotvcable.com";
	
	
	
	
	
	protected String Host 		= "192.168.0.250";
	                              //"tvc-srvexgye.grupotvcable.com"
								  //"tvc-srvexuio.grupotvcable.com"	
	protected String FromGYE 	= "internetseguro.gye@tvcable.com.ec";
	protected String FromUIO 	= "internetseguro.uio@tvcable.com.ec";
	protected String FromCUE 	= "internetseguro.cue@tvcable.com.ec";

	protected String Password 	= "pruebadesarrollo123";
	protected String UserName 	= "";

	protected String From 		= "";

	private Session 	Sesion;
	private Message 	Mensaje;
	private MimeMessage MineMensaje;

	public CorreoMcAfee(String ciudad){

		if(ciudad.equals("94"))
			From = this.FromGYE;
		else if(ciudad.equals("63"))
			From = this.FromUIO;
		else if(ciudad.equals("65"))
			From = this.FromCUE;
		else From = this.FromGYE;

		UserName = From.split("@")[0];

		Properties prop = new Properties();
		
		FileInputStream fis = null;
		Properties prop2 = new Properties();
		
		try {
			fis = new FileInputStream(new File("/usr/hosts.properties"));
			prop2.load(fis);
			String[] Host	= prop2.getProperty("HOST").split(",");
			prop.put("mail.smtp.host", Host[0]);	
		} catch(IOException e) {
			//e.printStackTrace();
			prop.put("mail.smtp.host", Host);
		}
		

		
		//prop.put("mail.smtp.host", Host);
		
		prop.put("mail.smtp.auth", "true");
		prop.setProperty("mail.pop3.disabletop", "true");
		
		SMTPAuthentication auth = new SMTPAuthentication();
		Sesion = Session.getInstance(prop , auth );

	}


	protected void BorrarMensajes(){

		try {

			// Get the store
			
			Store store = Sesion.getStore("pop3");
			store.connect(Host, UserName, Password);

			// Get folder
			Folder folder = store.getFolder("INBOX");
			folder.open(Folder.READ_WRITE);

			SearchTerm st = new SentDateTerm(1, new Date());
			Message[] message = folder.search(st);

			for (int i=0, n=message.length; i<n; i++) {


 
			}

			// Close connection
			folder.close(true);
			store.close();

		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	protected void EnviarCorreo(String asunto, String textoCorreo, Address... direcciones){

		try {

			MineMensaje = new MimeMessage(Sesion);
			MineMensaje.setContent(textoCorreo, "text/html");
			MineMensaje.setSubject(asunto);
			MineMensaje.addRecipients(Message.RecipientType.TO, direcciones);
			MineMensaje.setFrom(new InternetAddress(From,"Grupo TvCable Internet Seguro"));

			Mensaje = MineMensaje;

			Transport.send(Mensaje);

		} catch (MessagingException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}


	protected void ReEnviarCorreo(){

		try {

			Store store = Sesion.getStore("pop3");
			store.connect(Host, UserName, Password);
			Folder folder = store.getFolder("INBOX");
			folder.open(Folder.READ_WRITE);

			SearchTerm st = new FromStringTerm("postmaster@tvcable.com.ec");
			Message[] message = folder.search(st);

			for (int i=0, n=message.length; i<n; i++) {
				StringBuilder strMens = new StringBuilder();

				Multipart multipart = (Multipart)message[i].getContent();
				System.out.println(multipart.getBodyPart(0).getContent());

				strMens.append("\nEstimados Favor su revision. \n\n\n");
				strMens.append(multipart.getBodyPart(0).getContent());

				String correo = "";
				String ll[] = multipart.getBodyPart(0).getContent().toString().split("\n");

				for(String l : ll)
					if(l.indexOf("To:")>0){
						String res[] = l.split(":");
						correo = res[1].trim();
					}


				LogMcAfee datos = new LogMcAfeeDAO().findByCorreo(correo).get(0);

				strMens.append("\nSISTEMA		: "+datos.getSistema());
				strMens.append("\nCUENTA		: "+datos.getCuenta());
				strMens.append("\nIDPRODUCTO	: "+datos.getIdProducto());
				strMens.append("\nNOMBRE		: "+datos.getNombre());


				System.out.println("MENSAJE A REENVIAR");
				message[i].setFlag(Flags.Flag.DELETED, true);

				Mensaje = new MimeMessage(this.Sesion);
				Mensaje.setSubject("Fwd: " + message[i].getSubject());

				Mensaje.setFrom(new InternetAddress(this.From));
				Mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(this.From));
				Mensaje.setContent(strMens.toString(), "text/html");

				Transport.send(Mensaje);

			}
			
			folder.close(true);
			store.close();

		} catch (MessagingException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	class SMTPAuthentication extends javax.mail.Authenticator{
		public PasswordAuthentication getPasswordAuthentication(){
			return new PasswordAuthentication(UserName, Password);
		}
	}



	public static void main(String a[]){
		new CorreoMcAfee("65").ReEnviarCorreo();
	}


}
