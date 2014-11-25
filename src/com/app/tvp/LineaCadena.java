/**
 * 
 */
package com.app.tvp;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import tvcable.app.comarch.utils.Conversiones;

import com.app.dao.EntityManagerHelper;
import com.app.tv.tvp_recoleccionPPV.dao.*;




/**
 * @author rortiz
 *
 */
public class LineaCadena {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String cadena;
	private FileWriter fw;
	private BufferedWriter bw;
	private PrintWriter pw;
	private long clave;
	private String fecha;
	private String fechaStartTime;
	public LineaCadena()
	{}
	public String LineaCadena(final String cadena1, final String cadena2)
	{
		cadena = cadena1 +"="+ cadena2;
		return cadena;
	}
	
	public String LineaEspacio()
	{
		return "-";
	}
	
	public void crearArchivo(String rutaCdr, String nombreArchivo) throws IOException
	{
		fw = new FileWriter(rutaCdr+nombreArchivo,true);
		bw = new BufferedWriter(fw);
		pw = new PrintWriter(bw);	
	}
	
	public void NuevaLinea(String dato1, String dato2){
		pw.println(dato1+"="+dato2);
	}
	
	public void LineaCDR(String lineaCDR)
	{
		pw.println(lineaCDR);
	}
	
	public void Close(){
		pw.close();
	}
	
	public String CambiarFormato(String fecha) throws ParseException
	{
	      SimpleDateFormat sdfSource = new SimpleDateFormat("yyyy/MM/dd HH:mm");
	      Date date = sdfSource.parse(fecha);
	      SimpleDateFormat sdfDestination = new SimpleDateFormat("dd/MM/yyyyhh:mm");
	      fecha = sdfDestination.format(date);
	      
	      return fecha;
	}
	
	public void GuardarRegistro(ParametrosTV paquete, int numEven) throws IllegalArgumentException, SecurityException, ParseException, IllegalAccessException, NoSuchFieldException
	{
		
		System.out.println("FLAG"+numEven);
		
		if (numEven ==6)
		{
			fecha = this.CambiarFormato(Conversiones.HexadecimalToAscii(paquete.getValue("eTrama").toString().substring(48, 80)));
			fechaStartTime = this.CambiarFormato(Conversiones.HexadecimalToAscii(paquete.getValue("eTrama").toString().substring(82, 114)));
			TvpRecoleccionPpv recoleccionPPV = new TvpRecoleccionPpv();
			clave = System.currentTimeMillis();		
			EntityManagerHelper.beginTransaction();
			recoleccionPPV.setId(clave);
			//recoleccionPPV.setIdempresa(Integer.valueOf(paquete.getValue("ciu").toString()));
			recoleccionPPV.setIdempresa(paquete.cmd.getCabecera().getIDEmpresa());			
			recoleccionPPV.setStrSerial(Conversiones.HexadecimalToAscii(paquete.getValue("eTrama").toString().substring(8, 32)));
			recoleccionPPV.setIdEvento(Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(40, 48)));
			recoleccionPPV.setPolldate(fecha.trim());
			recoleccionPPV.setDate(fechaStartTime.trim());
			recoleccionPPV.setIdTipoRecoleccion(1);// Tipos de Recolecion 1 Individual 2 Colectiva
			recoleccionPPV.setState("P");
			new TvpRecoleccionPpvDAO().save(recoleccionPPV);	
			EntityManagerHelper.commit();
			EntityManagerHelper.closeEntityManager();
		}
		else if (numEven ==7)
		{
			TvpRecoleccionPpv recoleccionPPV = new TvpRecoleccionPpv();
			System.out.println("ProcesandoEvento");
			EntityManagerHelper.beginTransaction();

			fecha = this.CambiarFormato(Conversiones.HexadecimalToAscii(paquete.getValue("eTrama").toString().substring(48, 80)));
			fechaStartTime = this.CambiarFormato(Conversiones.HexadecimalToAscii(paquete.getValue("eTrama").toString().substring(82, 114)));
			clave = System.currentTimeMillis();		

			recoleccionPPV.setId(clave);
			//recoleccionPPV.setIdempresa(Integer.valueOf(paquete.getValue("ciu").toString()));
			recoleccionPPV.setIdempresa(paquete.cmd.getCabecera().getIDEmpresa());
			recoleccionPPV.setStrSerial(Conversiones.HexadecimalToAscii(paquete.getValue("eTrama").toString().substring(8, 32)));
			recoleccionPPV.setIdEvento(Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(40, 48)));
			recoleccionPPV.setPolldate(fecha.trim());
			recoleccionPPV.setDate(fechaStartTime.trim());				
			recoleccionPPV.setState("P");
			recoleccionPPV.setIdTipoRecoleccion(1);// Tipos de Recolecion 1 Individual 2 Colectiva
			new TvpRecoleccionPpvDAO().save(recoleccionPPV);	
			EntityManagerHelper.commit();			
			EntityManagerHelper.closeEntityManager();
	
       	   try 
	        {
		          Thread.sleep(1000);
		     } 
	        catch (InterruptedException e) 
	        {
			        // TODO Auto-generated catch block
			        e.printStackTrace();
		    }
			
			EntityManagerHelper.beginTransaction();
			
			fecha = this.CambiarFormato(Conversiones.HexadecimalToAscii(paquete.getValue("eTrama").toString().substring(154, 186)));
			fechaStartTime = this.CambiarFormato(Conversiones.HexadecimalToAscii(paquete.getValue("eTrama").toString().substring(188, 220)));
			clave = System.currentTimeMillis();		
			
			recoleccionPPV.setId(clave);
			//recoleccionPPV.setIdempresa(Integer.valueOf(paquete.getValue("ciu").toString()));
			recoleccionPPV.setIdempresa(paquete.cmd.getCabecera().getIDEmpresa());
			recoleccionPPV.setStrSerial(Conversiones.HexadecimalToAscii(paquete.getValue("eTrama").toString().substring(114, 138)));
			recoleccionPPV.setIdEvento(Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(146, 154)));
			recoleccionPPV.setPolldate(fecha.trim());
			recoleccionPPV.setDate(fechaStartTime.trim());				
			recoleccionPPV.setState("P");
			recoleccionPPV.setIdTipoRecoleccion(1);// Tipos de Recolecion 1 Individual 2 Colectiva				
			new TvpRecoleccionPpvDAO().save(recoleccionPPV);	
			EntityManagerHelper.commit();			
			EntityManagerHelper.closeEntityManager();					

		}

	}
	


}
