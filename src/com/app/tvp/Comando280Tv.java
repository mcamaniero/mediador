package com.app.tvp;

import tvcable.app.comarch.utils.Conversiones;

public class Comando280Tv {

	
	private ParametrosTV parametros;
	private StringBuilder converterId = new StringBuilder();;
	private StringBuilder paquete = new StringBuilder();;

	public Comando280Tv(ParametrosTV parametro) {
		parametros = parametro;
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param args
	 */
	
	public StringBuilder Comando280() throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException
	{	
		System.out.println("Inicio de Creacion del Comando280 POR ");
		/**
		 *Obtengo los datos provenientes del WSDL y los convierto a Hexadecimal 
		 */
		
		//ConverterId
		parametros.SetearIdConvertidor(""+parametros.getValue("serieidaudit"));
		converterId.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+Integer.valueOf(parametros.getValue("idConvertidor").toString())/8)).replace(' ', '0'));
	    converterId.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+Integer.valueOf(parametros.getValue("idConvertidor").toString())%8)).replace(' ', '0'));
	    paquete.append(converterId.toString());
		
		//SerialNumber 	
	    //Para TITAN
		//paquete.append(Conversiones.AsciiToHexadecimal(parametros.cmd.getDetalle().getTVpagada().getSerie()));
	    //PARA SP
	    //System.out.println(parametros.cmd.getDetalle().getTVpagada().getSerie());
	    //System.out.println(String.format("%12s",parametros.cmd.getDetalle().getTVpagada().getSerie()));	    
	    //System.out.println(Conversiones.AsciiToHexadecimal(String.format("%12s",parametros.cmd.getDetalle().getTVpagada().getSerie()).replace(' ','0')));
		System.out.println("Serie"+parametros.getValue("numeroserieaudit"));
	    paquete.append(Conversiones.AsciiToHexadecimal(String.format("%12s",""+parametros.getValue("numeroserieaudit")).replace(' ', '0')));
	    /*PARASP*/
		//ConverterType 
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+""+parametros.getValue("tipoaudit"))).replace(' ','0'));

		//paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+3)).replace(' ','0'));
		System.out.println("paquete"+paquete);
		System.out.println("Fin de Creacion del Comando280 "+paquete);
		
		return paquete;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

}
