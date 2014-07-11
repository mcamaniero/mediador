package com.app.mail;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

public class EnvioMail{


	//private String Host = "tvc-srvgye2.grupotvcable.com";
	//private String Host = "tvc-srvexgye.grupotvcable.com";
	private String Host = "192.168.0.250";
	private String From = "notificacionhelpdesksistemas@tvcable.com.ec";
	private Address [] Direcciones = null;

	//private String UserName = "jcalle";
	//private String Password = "27joncalle";

	private String Ciudad="";
	private String Controlador="";
	private String Puerto="";
	private String Observaciones="";
	private int Prioridad = 0;
	

	public EnvioMail(String ciudad, String controlador, String puerto, 
			String observaciones, int prioridad){

		this.Ciudad = ciudad;
		this.Controlador = controlador;
		this.Puerto = puerto;
		this.Observaciones = observaciones;
		this.Prioridad = prioridad;
		
		//System.out.println ("Enviando Mails..." + new java.util.Date());

		Properties prop = new Properties();
		prop.put("mail.smtp.host", Host);
		//prop.put("mail.smtp.auth", "true");
		
		FileInputStream fis = null;
		Properties prop2 = new Properties();
		
		try {
			fis = new FileInputStream(new File("/usr/mails.properties"));
			prop2.load(fis);
		} catch(IOException e) {
			e.printStackTrace();
		}
		String[] usersMails	= prop2.getProperty("users_mails").split(",");
		
		try{
			/*Direcciones = new Address []{
					new InternetAddress ("jcalle@tvcable.com.ec"),
					new InternetAddress ("rortiz@tvcable.com.ec"),
			};*/

			Direcciones = new Address[usersMails.length];
			for (int i = 0; i < usersMails.length ; i++ )
				Direcciones[i] = new InternetAddress (usersMails[i]);
			
			
			//SMTPAuthentication auth = new SMTPAuthentication();
			Session session = Session.getInstance(prop);
			Message msg = getMessage(session, From, Direcciones);
			//System.out.println ("Enviando ..." );

			Transport.send(msg);

			//System.out.println ("Mensaje enviado!");


		}catch (AddressException e1) {
			e1.printStackTrace();
		}catch (MessagingException e) {
			e.printStackTrace();
		}


	}


	private MimeMessage getMessage(Session session, String from, Address [] direcciones){

		try{
			MimeMessage msg = new MimeMessage(session);

			String contenido = "<style> <!-- "+
			"td{ "+
			"	border: 1px solid #A5C7E4;"+ 
			"	padding: 3px;"+
			"}"+
			"table{"+ 
			"	border-collapse: collapse;"+
			"	background-attachment: fixed;"+
			"	background-color: #F0F7FB;"+
			"	font-family: Verdana, Arial, Helvetica, sans-serif;"+
			"	font-size: 11px;"+
			"}"+
			".style2 {"+
			"	font-size: 14px;"+
			"	font-weight: bold;"+
			"}"+
			"--></style>"+
			"<br/><table width=\"460\" align=\"center\">"+
			"  <tr bgcolor=\"#0099FF\">"+
			"    <td height=\"36\" colspan=\"2\" align=\"center\" bgcolor=\"#62A0FF\">" +
			"<span class=\"style2\">SIS - APROVISIONAMIENTO</span></td>"+
			"  </tr>"+
			"  <tr>"+
			"    <td width=\"153\" height=\"29\"><strong>CIUDAD</strong></td>"+
			"    <td width=\"296\">"+Ciudad+"</td>"+
			"  </tr>"+
			"  <tr>"+
			"    <td height=\"29\"><strong>CONTROLADOR</strong></td>"+
			"    <td>"+Controlador+"</td>"+
			"  </tr>"+
			"  <tr>"+
			"    <td height=\"29\"><strong>PUERTO</strong></td>"+
			"    <td>"+Puerto+"</td>"+
			"  </tr>"+
			"  <tr>"+
			"    <td height=\"100%\"><strong>OBSERVACIONES</strong></td>"+
			"    <td>"+Observaciones+"</td>"+
			"  </tr>"+
			"</table>";

			msg.setContent(contenido, "text/html");

			msg.setSubject("SIS-APROVISIONAMIENTO");
			if(Prioridad > 0)
			msg.addHeader("X-Priority", ""+Prioridad);

			msg.addRecipients(Message.RecipientType.TO, direcciones);
			msg.setFrom(new InternetAddress(from,Controlador+" SIS-APROVISIONAMIENTO"));
			return msg;

		}catch (UnsupportedEncodingException ex){
			ex.printStackTrace();
			return null;
		}catch (MessagingException ex){
			ex.printStackTrace();
			return null;
		} 

	}


	
	public static void main(String a[]){
		new EnvioMail("", "", "","",1);

	}

}




