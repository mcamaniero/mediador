/**
 * 
 */
package com.app.tvp;
import java.io.*;
/**
 * @author rortiz
 *
 */
public class ArchivosCDR {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	//	EscribirArchivosCDR();
			// Validamos si existe el fichero		
	}
	private ParametrosTV parametros;
	private CDR cdr ;
	private String sFicheroComarch = "comarch.cdr";
	private String sFicheroTvc = "tvc.cdr";
	private FileWriter fw;
	private BufferedWriter bw;
	private PrintWriter pw;
	private StringBuilder cadenaComarch = new StringBuilder();
	private StringBuilder cadenaTvc = new StringBuilder();
	private int ciudad;
	private String serieDeco;
	public ArchivosCDR(ParametrosTV paquete)
	{
		parametros = paquete;
	}
	
	public void EscribirArchivosCDR() throws IOException
	{
		cdr = new CDR("C:/ArchivosCDR", sFicheroComarch);
		ciudad = parametros.cmd.getCabecera().getIDEmpresa();
		serieDeco = parametros.cmd.getDetalle().getTVpagada().getSerie();
		
		cadenaComarch.append("comarch");
		
		
		cdr.NuevaLineaCDR(1, cadenaComarch);

		cdr.Close();
		
		cdr = new CDR("C:/ArchivosCDR", sFicheroTvc);
		
		cadenaTvc.append("tvc");
		
		cdr.NuevaLineaCDR(2, cadenaTvc);
		
		cdr.Close();
	}
}
