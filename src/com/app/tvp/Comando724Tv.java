/**
 * 
 */
package com.app.tvp;

import java.io.IOException;
import java.text.ParseException;

import tvcable.app.comarch.utils.Conversiones;
import tvcable.app.comarch.utils.Paquete;
import ec.com.grupotvcable.wsdltvpagada.*;

/**
 * @author rortiz
 *
 */
public class Comando724Tv {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	private Respuesta respuesta;
	private ParametrosTV parametros;
	private StringBuilder paquete = new StringBuilder();
	private int tamanio;
	private String bsi;
	
	public Comando724Tv(ParametrosTV parametrosTv)
	{
		parametros = parametrosTv;
	}
	public Respuesta EjecutarRecoleccionIndividual() throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException, IOException, ParseException, Excepciones
	{
		System.out.println("Empieza Comando 724");		
		//bsi = 
		paquete .append(String.format("%4s",Conversiones.DecimalToHexadecimal(parametros.getValue("bsiciudad").toString())).replace(' ', '0'));
		//Serial_Number
		paquete.append(Conversiones.AsciiToHexadecimal(parametros.cmd.getDetalle().getTVpagada().getSerie()));
		
		tamanio = Paquete.PaqueteLength(paquete.toString());
		tamanio = tamanio+6;
		parametros.setValue("Tamanio",String.format("%4s",Conversiones.DecimalToHexadecimal(""+tamanio)).replace(' ','0'));
		parametros.setValue("Paquete", paquete);
		parametros.setValue("Comando",String.format("%4s",Conversiones.DecimalToHexadecimal("724")).replace(' ','0'));

		respuesta = new GuardarComandoTV().guardarDAC(parametros);
		System.out.println("Termina Comando 724");
		return respuesta;		
	}
	
	public void EjecutarEnvioConfirmacion() throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException, IOException, ParseException, Excepciones
	{		
		// Crea el comando de Respuesta al DAC
		System.out.println("Empieza Comando 726");
		//paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(parametros.getValue("bsiciudad").toString())).replace(' ', '0'));
		bsi=String.format("%4s",Conversiones.DecimalToHexadecimal(parametros.getValue("bsiciudad").toString())).replace(' ', '0');
		
		//paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal("1")).replace(' ', '0'));
		paquete.append(bsi);
		paquete.append("01");
		
		tamanio = Paquete.PaqueteLength(paquete.toString());
		tamanio = tamanio + 6;
		
		parametros.setValue("Tamanio",String.format("%4s",Conversiones.DecimalToHexadecimal(""+tamanio)).replace(' ','0'));
		parametros.setValue("Paquete", paquete);
		parametros.setValue("Comando",String.format("%4s",Conversiones.DecimalToHexadecimal("726")).replace(' ','0'));
		System.out.println("Termina Comando 726");
		
		new GuardarComandoTV().guardarDAC(parametros);
	}
}
