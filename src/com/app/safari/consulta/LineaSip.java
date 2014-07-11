package com.app.safari.consulta;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.xml.rpc.ServiceException;

import org.apache.commons.httpclient.HttpException;
import org.jdom.JDOMException;

import com.app.intraway.consulta.ids.General;

import ec.com.grupotvcable.wsdlsafari.Cabecera;
import ec.com.grupotvcable.wsdlsafari.Comando;
import ec.com.grupotvcable.wsdlsafari.Detalle;
import ec.com.grupotvcable.wsdlsafari.Respuesta;
import ec.com.grupotvcable.wsdlsafari.Safari;
import ec.com.grupotvcable.wsdlsafari.WsdlSafari;
import ec.com.grupotvcable.wsdlsafari.WsdlSafariClient;


public class LineaSip extends General{

	public static final int ELIMINACION_SIP	= 1005;
	public static final int ACTUALIZACION	= 1003;


	public LineaSip() {
		super (null,null,null);
	}

	public LineaSip(String userEliminacion, String remoteHost, String remoteAddr) {
		super(remoteHost, remoteAddr, userEliminacion);
	}



	private Comando Sip(int ciudad, String fono, String plan, int interfaz){
		//CREACION_SIP 		= 1001;
		//CREACION_SIP_TMP	= 1101;
		//CREACION_E1 		= 1002;
		//ACTUALIZACION 	= 1003;
		//CALL_FEATURE		= 1004;
		//ELIMINACION_SIP	= 1005;
		//CONSULTA			= 1010;

		Comando cmd = new Comando();
		Cabecera cab = new Cabecera();
		cab.setIDEmpresa(ciudad);//94 gye    63 uio    65 cue
		cab.setInterface(interfaz);
		cab.setNegocio(1);
		cab.setSecuencia(1);
		cmd.setCabecera(cab);

		Detalle det = new Detalle();
		Safari saf = new Safari();

		String est = "1";
		if(plan.equals("STD-SUS-MORA31") || plan.equals("STD-SUS-TITULAR"))
			est = "0";

		saf.setEstado(est); //1activo  0suspendido
		saf.setDatoS1(fono);//TELEFONO
		saf.setDatoS2(plan);//HomeExchageId
		saf.setAccion("SIP");

		saf.setDatoS4(this.UserEliminacion);
		//saf.setIp(this.getRemoteIp());
		

		det.setSafari(saf );
		cmd.setDetalle(det);

		return cmd;

	}




	public File Regularizacion(File fichero) throws HttpException, IOException, ServiceException, JDOMException {
		FileReader fr = new FileReader (fichero);
		BufferedReader br = new BufferedReader(fr);

		String accion = br.readLine().trim();
		fr.close();
		System.out.println(accion);


		if ( accion.equals("eliminacion") ){
			return Eliminacion(fichero);
		}else if( accion.equals("modificacion") ){
			return Modificacion(fichero);
		}

		return new File("CabeceraIncorrecta");

	}



	public File Eliminacion(File archivo) throws HttpException, IOException, ServiceException, JDOMException{

		BufferedReader br = new BufferedReader(new FileReader(archivo));

		File resultado = new File("/tmp/titan/resp_"+archivo.getName());
		PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter(resultado)));

		WsdlSafariClient client = new WsdlSafariClient();
		WsdlSafari service = client.getWsdlSafariHttpPort();


		String linea = null;
		while((linea=br.readLine())!=null){// Lectura del fichero
			if(!linea.equals("eliminacion")){
				String[] resul 		= linea.split(",");
				String ciudad 		= resul[0].trim();
				String fono 		= resul[1].trim();
				String respuesta 	= "";

				Respuesta res = service.aprovSafari( 
						Sip(Integer.parseInt(ciudad),fono, "STD-SUS-MORA31", ELIMINACION_SIP) );

				respuesta = ","+res.getMensaje().getCodError()+","+res.getMensaje().getDetMensaje();
				salida.println(linea+respuesta);
				
			}//fin de eliminacion

		}//fin del while

		salida.close();
		br.close();

		return resultado;
	}


	public File Modificacion(File archivo) throws HttpException, IOException, ServiceException, JDOMException{

		BufferedReader br = new BufferedReader(new FileReader(archivo));

		File resultado = new File("/tmp/titan/resp_"+archivo.getName());
		FileWriter fw = new FileWriter(resultado);
		PrintWriter salida = new PrintWriter(new BufferedWriter(fw));

		WsdlSafariClient client = new WsdlSafariClient();
		WsdlSafari service = client.getWsdlSafariHttpPort();

		
		String linea = null;
		while((linea=br.readLine())!=null){// Lectura del fichero
			if(!linea.equals("modificacion")){
				String[] resul 		= linea.split(",");
				String ciudad 		= resul[0].trim();
				String fono		 	= resul[1].trim();
				String homeExchange	= resul[2].trim();
				String respuesta 	= "";

				Respuesta res = service.aprovSafari( 
						Sip(Integer.parseInt(ciudad),fono,homeExchange, ACTUALIZACION) );
				
				respuesta = ","+res.getMensaje().getCodError()+","+res.getMensaje().getDetMensaje();
				salida.println(linea+respuesta);
			}//fin de eliminacion

		}//fin del while

		salida.close();
		br.close();

		return resultado;
	}


}
