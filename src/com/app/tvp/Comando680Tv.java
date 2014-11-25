package com.app.tvp;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;

import tvcable.app.comarch.utils.Conversiones;
import tvcable.app.comarch.utils.Paquete;

import ec.com.grupotvcable.wsdltvpagada.*;
import com.app.tv.tvp_equivalencias.*;

public class Comando680Tv {

	private ParametrosTV parametros;
	private Respuesta response;
	private StringBuilder paquete = new StringBuilder();
	private String tamanio;
	private int idServicio;
	private String fPago;
	private int cCredito;
	private int credito;
	private Integer datoC1;

	/**
	 * @param args
	 */
	
	public Comando680Tv(ParametrosTV parametrosTv)
	{
		parametros = parametrosTv;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Respuesta EjecutarReset() throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException, IOException, ParseException, Excepciones
	{
		String estado = parametros.cmd.getDetalle().getTVpagada().getEstadoC();
		credito = parametros.cmd.getDetalle().getTVpagada().getCredito();
		datoC1 = Integer.valueOf(parametros.cmd.getDetalle().getTVpagada().getDatoC1());
		String tipoippv = parametros.getValue("ippv").toString();
		//bsi_code,es el codigo de la ciudad
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+parametros.getValue("bsiciudad"))).replace(' ', '0'));
		//head end number
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal("0")).replace(' ','0'));
		//Equip_Type
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal("0")).replace(' ','0'));
		//Equip_Sub_Type
		paquete.append(String.format("%4s", Conversiones.DecimalToHexadecimal("0")).replace(' ', '0'));
		//Serial_Number
		paquete.append(Conversiones.AsciiToHexadecimal(parametros.cmd.getDetalle().getTVpagada().getSerie()));
		//Bit_Mask_1, valor enviado dependiendo de lo que se quiera guardar.
		String bitmask = "6C7";
		paquete.append(String.format("%8s",bitmask).replace(' ','0'));
		idServicio = parametros.cmd.getDetalle().getTVpagada().getIdServicio();
		fPago = parametros.cmd.getDetalle().getTVpagada().getFormaPago();
		cCredito = parametros.cmd.getDetalle().getTVpagada().getCredito();
		//**********************************************************
		// calcular el credito de la caja cuando es por primera vez.
		//**********************************************************
		//System.out.println("Servicio"+idServicio);
		//credito = parametros.CalculaCredito(idServicio, fPago, cCredito, datoC1);
		//System.out.println("Credito"+cCredito);
		int compra;
		if (cCredito != 0)
		{
		 compra = cCredito/4;
		}
		else
		{
		  compra = 0;
		}
		// Credit_Alloewd
		//paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+cCredito)).replace(' ','0'));
		paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+credito)).replace(' ','0'));
		// Purchased_Alloewd
		paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+compra)).replace(' ','0'));
		//MAX_Pack_Cost
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal("10")).replace(' ', '0'));
		// **************************************************
		String zone = "2"; String pais = "0"; String moneda = "1";; String canal = "3";
		//TimeZoneHandle
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(zone)).replace(' ', '0'));
		//Country_Code
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(pais)).replace(' ','0'));
		//Currency_Region
		paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(moneda)).replace(' ', '0'));
		//EPG_Region
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+parametros.getValue("region"))).replace(' ', '0'));
		//TurnOn_VC
		String turnOn = "200";	
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(turnOn)).replace(' ','0'));
		//TurnOff_VC
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal("0")).replace(' ','0'));
		//Output_Channel_#
		paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(canal)).replace(' ','0'));
		
		//Feature_Setting, configurado deacuerdo al tipodeco.
		String feature = "";
		if (estado == "M" || credito == 0 || tipoippv == "N") 
		{
			feature = "FBF";
		}
		else
		{
	   		feature = "1FBF";
		}
		paquete.append(String.format("%4s",feature).replace(' ', '0'));
		
		tamanio = Integer.toString(Paquete.PaqueteLength(paquete.toString()));
    	tamanio = ""+(Integer.valueOf(tamanio)+6);
				
		parametros.setValue("Tamanio",String.format("%4s",Conversiones.DecimalToHexadecimal(tamanio)).replace(' ','0'));
		parametros.setValue("Paquete", paquete);
		parametros.setValue("Comando",String.format("%4s",Conversiones.DecimalToHexadecimal("680")).replace(' ','0'));

		response = new GuardarComandoTV().guardarDAC(parametros);
		
		return response;
	}
}
