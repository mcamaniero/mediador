package com.app.mcafee;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.mail.Address;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

public class EnvioMailMcAfeeRecuperaClave extends CorreoMcAfee{


	private Address [] Direcciones = null;

	private String Asunto = "Recuperacion de Clave del Producto Seguridad en Internet";
	
	public EnvioMailMcAfeeRecuperaClave(String correo, String nombres, 
			String clave, String ciudad){

		super(ciudad);
		
		try {
			Direcciones = new Address []{
					//new InternetAddress ("jcalle@tvcable.com.ec"),
					new InternetAddress (correo),
			};
		} catch (AddressException e1) {
			e1.printStackTrace();
		}


		String path = getClass().getProtectionDomain().getCodeSource().
		getLocation().toString().substring(5);
		path = path.substring(0, path.length()-34);

		System.out.println("PATH EMAIL "+path);
	
		BufferedReader bf = null;
		StringBuilder contenido = new StringBuilder();

		try {
			bf = new BufferedReader(new FileReader(path +"/emailR.html"));

			String sCadena;
			while ((sCadena = bf.readLine())!=null) {
				if(sCadena.trim().equals("Estimado"))
					sCadena="Estimado <b>"+nombres.toUpperCase()+"</b>";

				if(sCadena.trim().equals("CLAVE"))
					sCadena="<b>"+clave+"</b>";

				contenido.append(sCadena);
			} 

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		this.EnviarCorreo(Asunto, contenido.toString(), Direcciones);

	}





	public static void main(String a[]){
		//new EnvioMailMcAfee("joncalle@gmail.com","Jonathan Calberto Calle Zuñiga", "abc123");
		
	}
	
	

}




