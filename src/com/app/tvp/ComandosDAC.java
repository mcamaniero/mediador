package com.app.tvp;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;


import com.app.tv.tvp_consultatv.dao.TvpConsultatv;
import com.app.tv.tvp_consultatv.dao.TvpConsultatvDAO;
import com.app.tv.tvp_parametros.dao.TvpParametrosDAO;

import ec.com.grupotvcable.wsdltvpagada.*;

import tvcable.app.comarch.utils.Conversiones;
import tvcable.app.comarch.utils.Paquete;


/**
 * @author rortiz
 * 
 */

/**
 * @author rortiz
 *
 */
public class ComandosDAC {

	/**
	 * @param args
	 * String bsi
	 * String head
	 * String tipo
	 * String serie
	 * String accion
	 * String numeve1
	 * int eventos
	 */
	private String bsi;
	private String head;
	private String tipo;
	private String subtipo;
	private String serie;
	private String numeve1 = null;
	private int eventos;
	
	private ParametrosTV parametros;
	
	private StringBuilder paquete = new StringBuilder();
	private StringBuilder subpaquete = new StringBuilder();
	
	private static SimpleDateFormat FormatoFecha = new SimpleDateFormat("yyyy/MM/dd");
	private static SimpleDateFormat FormatoHora = new SimpleDateFormat("HH:mm");
	
	private String componentes;
	private int idServicio;
	private String fPago;
	private int cCredito;
	private int credito;
	private Integer contarEvento;
	private int tipoPromocion;
	private String Mora;
	private Integer vcm;
	private int operationCode;
	private String tamanio;
	private Respuesta respuesta;
	private String[] temp;
	
	
	//private String num_changed_services;
	//private StringBuilder numeroServicios = new StringBuilder();
	//private StringBuilder codigoServicio = new StringBuilder();
	//private String serviceNumber;
	
	//private int problema;	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}


	
	public ComandosDAC(ParametrosTV parametro) throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException{
		parametros = parametro;
	}

	/**
	 * Recibe los datos provenientes del WSDL, una vez 
	 * realizadas las conversiones correspondientes, se 
	 * insertan los datos en un StringBuilder paquete.
	 * 
	 * Comando para Crear un Evento PPV en el DAC
	 * 
	 * @return
	 * @throws IllegalArgumentException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 * @throws Excepciones 
	 */
	public StringBuilder ComandoDAC630() throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException, Excepciones
	{
		System.out.println("Inicio de Creacion Comando 710");
		bsi = String.format("%4s",Conversiones.DecimalToHexadecimal(parametros.getValue("bsiciudad").toString())).replace(' ', '0');       
		paquete.append(bsi);
		// Service_handle --> Codigo del Canal -->Codigocanal
		String Canal = Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getCodigoCanal());
		paquete.append(String.format("%8s",Canal).replace(' ','0'));
		int ubicacion = parametros.cmd.getDetalle().getTVpagada().getUbicacion();
		// Program Handle --> Codigo del Evento a programar --> IdEvento
		if (ubicacion != 23)
		{
			contarEvento = parametros.cmd.getDetalle().getTVpagada().getIdEventos().getCantE();
			//this.contarEvento--;
			for (int i=0;i<contarEvento;i++)				
			{
				eventos = parametros.cmd.getDetalle().getTVpagada().getIdEventos().getIdEvento().get(i).getIdEvento(); 
				paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+eventos)).replace(' ', '0'));
			}			
		}
		else
		{
			contarEvento = parametros.cmd.getDetalle().getTVpagada().getIdEventos().getIdEvento().size();
			//System.out.println("ContarEvento"+contarEvento);
			for (int i=0;i<contarEvento;i++)				
			{
				eventos = parametros.cmd.getDetalle().getTVpagada().getIdEventos().getIdEvento().get(i).getIdEvento(); 
				paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+eventos)).replace(' ', '0'));
			}
		}
		//}


		//System.out.println("Eventos"+eventos);
		// Program Name --> Nombre del Evento 
		String nombre = parametros.cmd.getDetalle().getTVpagada().getDescEvento();
		
		if (nombre.length()<=30)
		{
			paquete.append(Conversiones.AsciiToHexadecimal(String.format("%30s", nombre)));
		}
		else
		{
		//	paquete.append(Conversiones.AsciiToHexadecimal(String.format("%30s", nombre.substring(0, 29))));
			throw new Excepciones(4);
		}
		//System.out.println("Nombre"+nombre);
		// Altgernate_program name --> Nombre alternativo, Igual que el nombre.
		if (nombre.length()<=30)
		{
			paquete.append(Conversiones.AsciiToHexadecimal(String.format("%30s", nombre)));
		}
		else
		{
		//	paquete.append(Conversiones.AsciiToHexadeci	mal(String.format("%30s", nombre.substring(0, 29))));
			throw new Excepciones(4);
		}
		//Epoch_Start_Time = 
	    paquete.append(Conversiones.AsciiToHexadecimal(parametros.cmd.getDetalle().getTVpagada().getDatoC1()));
	    //System.out.println(Conversiones.AsciiToHexadecimal(parametros.cmd.getDetalle().getTVpagada().getDatoC1()));
		//Epoch_End_Time = 
	    paquete.append(Conversiones.AsciiToHexadecimal(parametros.cmd.getDetalle().getTVpagada().getDatoC2()));
		//Epoch_Duration = 
		paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getDuracionEvento())).replace(' ','0'));		
		//Interestial_Period = 
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getInterstitial())).replace(' ','0'));
		//Preview_Time = 
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getTiempoLibre())).replace(' ', '0'));
		//MPAA_Advisory = 
		paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getMpaa())).replace(' ','0'));
		//Violent_Content_Advisory = 
		paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getContenidoViolento())).replace(' ','0'));
		//Sexual_Content_Advisory = 
		paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getContenidoSexual())).replace(' ', '0'));
		//Language_Content_Advisory = 
		paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getLenguaje())).replace(' ', '0'));
		//Rating_Region = 
		paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getRating())).replace(' ','0'));
		//Impulse_Purchasable = 
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getTiempoCompra())).replace(' ', '0'));
		//Package_Count = 0, Costo del Evento.
		paquete.append(String.format("%2s","0").replace(' ', '0'));
		//Program_Name_Display_Time = 
		paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getTiempoDisplay())).replace(' ', '0'));
		//Purchase_Cost = 
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getCostoEvento())).replace(' ', '0'));	
		//Purchase_Price =
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getPrecioEvento())).replace(' ', '0'));
		//Anytime_Free_Prev_Duration = 
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getAnyTime())).replace(' ', '0'));
		//Feature_Setting
		//paquete.append(String.format("%4s","23B").replace(' ', '0'));
		paquete.append(String.format("%4s","8").replace(' ', '0'));		

		System.out.println("Fin de Creacion Comando 710-"+paquete);
		return paquete;		
	}

	/**
	 * Recibe los datos provenientes del WSDL, una vez 
	 * realizadas las conversiones correspondientes, se 
	 * insertan los datos en un StringBuilder paquete.
	 * 
	 * Comando para modificar un Evento PPV
	 * 
	 * @return
	 * @throws IllegalArgumentException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 */
	public StringBuilder ComandoDAC631() throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException, Excepciones
	{
		System.out.println("Inicio de Creacion Comando 711");
		bsi = String.format("%4s",Conversiones.DecimalToHexadecimal(parametros.getValue("bsiciudad").toString())).replace(' ', '0');       
		paquete.append(bsi);
		// Service_handle --> Codigo del Canal -->Codigocanal
		String Canal = Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getCodigoCanal());
		paquete.append(String.format("%8s",Canal).replace(' ','0'));
		int ubicacion = parametros.cmd.getDetalle().getTVpagada().getUbicacion();
		// Program Handle --> Codigo del Evento a programar --> IdEvento
		
		if (ubicacion != 23)
		{
			contarEvento = parametros.cmd.getDetalle().getTVpagada().getIdEventos().getCantE();
		}
		else
		{
			contarEvento = parametros.cmd.getDetalle().getTVpagada().getIdEventos().getIdEvento().size();
		}
		for (int i=0;i<contarEvento;i++)				
		{
			eventos = parametros.cmd.getDetalle().getTVpagada().getIdEventos().getIdEvento().get(i).getIdEvento(); 
			paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+eventos)).replace(' ', '0'));
		}
		
		// Program Name --> Nombre del Evento 
		String nombre = parametros.cmd.getDetalle().getTVpagada().getDescEvento();
		if (nombre.length()<=30)
		{
			paquete.append(Conversiones.AsciiToHexadecimal(String.format("%30s", nombre)));
		}
		else
		{
			paquete.append(Conversiones.AsciiToHexadecimal(String.format("%30s", nombre.substring(0, 29))));
			//throw new Excepciones(4);
		}
		// Altgernate_program name --> Nombre alternativo, Igual que el nombre.
		if (nombre.length()<=30)
		{
			paquete.append(Conversiones.AsciiToHexadecimal(String.format("%30s", nombre)));
		}
		else
		{
			paquete.append(Conversiones.AsciiToHexadecimal(String.format("%30s", nombre.substring(0, 29))));
			//throw new Excepciones(4);
		}

		//Epoch_Start_Time = 
		paquete.append(Conversiones.AsciiToHexadecimal(parametros.cmd.getDetalle().getTVpagada().getDatoC1()));
		//Epoch_End_Time = 
		 paquete.append(Conversiones.AsciiToHexadecimal(parametros.cmd.getDetalle().getTVpagada().getDatoC2()));
		
		//Epoch_Duration = 
		paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getDuracionEvento())).replace(' ','0'));		
		//Interestial_Period = 
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getInterstitial())).replace(' ','0'));
		//Preview_Time = 
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getTiempoLibre())).replace(' ', '0'));
		//MPAA_Advisory = 
		paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getMpaa())).replace(' ','0'));
		//Violent_Content_Advisory = 
		paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getContenidoViolento())).replace(' ','0'));
		//Sexual_Content_Advisory = 
		paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getContenidoSexual())).replace(' ', '0'));
		//Language_Content_Advisory = 
		paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getLenguaje())).replace(' ', '0'));
		//Rating_Region = 
		paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getRating())).replace(' ','0'));
		//Impulse_Purchasable = 
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getTiempoCompra())).replace(' ', '0'));
		//Package_Count = 0, Costo del Evento.
		paquete.append(String.format("%2s","0").replace(' ', '0'));
		//Program_Name_Display_Time = 
		paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getTiempoDisplay())).replace(' ', '0'));
		//Purchase_Cost = 
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getCostoEvento())).replace(' ', '0'));	
		//Purchase_Price =
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getPrecioEvento())).replace(' ', '0'));
		//Anytime_Free_Prev_Duration = 
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getAnyTime())).replace(' ', '0'));
		//Feature_Setting
		paquete.append(String.format("%4s","23B").replace(' ', '0'));
		
		System.out.println("Inicio de Creacion Comando 711-"+paquete);
		
		return paquete;		
	}
	
	/**
	 * Recibe los datos provenientes del WSDL, una vez 
	 * realizadas las conversiones correspondientes, se 
	 * insertan los datos en un StringBuilder paquete.
	 * 
	 * Comando para eliminar un evento PPV
	 * 
	 * @return
	 * @throws IllegalArgumentException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 */
	public StringBuilder ComandoDAC633() throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException
	{
		System.out.println("Inicio de Creacion Comando 712");
		
		bsi = String.format("%4s",Conversiones.DecimalToHexadecimal(parametros.getValue("bsiciudad").toString())).replace(' ', '0');		
		paquete.append(bsi);
		//Service_Handle 8
		paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getCodigoCanal())).replace(' ', '0'));
		//Program_Handle 8
		int contarEvento = parametros.cmd.getDetalle().getTVpagada().getIdEventos().getCantE();
		for (int i=0;i<contarEvento;i++)				
		{
			eventos = parametros.cmd.getDetalle().getTVpagada().getIdEventos().getIdEvento().get(i).getIdEvento(); 
			paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+eventos)).replace(' ', '0'));
		}
		
		//Epoch_Start_Time = 
		paquete.append(Conversiones.AsciiToHexadecimal(parametros.cmd.getDetalle().getTVpagada().getDatoC1()));

		//Epoch_End_Time = 
		 paquete.append(Conversiones.AsciiToHexadecimal(parametros.cmd.getDetalle().getTVpagada().getDatoC2()));
		
		System.out.println("Inicio de Creacion Comando 712-"+paquete);
		
		return paquete;		
	}
	
	/**
	 * Recibe los datos provenientes del WSDL, una vez 
	 * realizadas las conversiones correspondientes, se 
	 * insertan los datos en un StringBuilder paquete.
	 * 
	 * Comando para borrar o limpiar la clave de pin (control de padres)
	 * 
	 * @return StringBuilder paquete
	 * @throws IllegalArgumentException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 * @throws Excepciones 
	 */
	public StringBuilder ComandoDAC665() throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException, Excepciones
    {
          System.out.println("Inicio de Creacion Comando 706");
          // bsi
          paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(parametros.getValue("bsiciudad").toString())).replace(' ', '0'));
          //HeadEnd_Handle
          paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+parametros.getValue("headend"))).replace(' ', '0'));
          //Equip_Type
          paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getTipoD())).replace(' ','0'));
          //Equip_Sub_Type
          paquete.append(String.format("%4s", Conversiones.DecimalToHexadecimal("0")).replace(' ', '0'));
          //Serial_Number
          if (!parametros.cmd.getDetalle().getTVpagada().getSerie().equals(""))
          {
                //System.out.println("ddd"+parametros.cmd.getDetalle().getTVpagada().getSerie());   
                paquete.append(Conversiones.AsciiToHexadecimal(parametros.cmd.getDetalle().getTVpagada().getSerie()));
          }
          else
          {           
                throw new Excepciones(1);
          }
          
          System.out.println("Inicio de Creacion Comando 706-"+paquete);
          
          return paquete;         
          
    }
	
	public StringBuilder ComandoDAC684() throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException
	{		
		
		System.out.println("Inicio de Creacion Comando 704");
		
		String tipoc = "";
		bsi = String.format("%4s",Conversiones.DecimalToHexadecimal(parametros.getValue("bsiciudad").toString())).replace(' ', '0');
		head = String.format("%4s","0").replace(' ','0');

		tipo = String.format("%4s",Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getTipoD())).replace(' ', '0');
		subtipo = String.format("%4s","0").replace(' ','0');
		serie = Conversiones.AsciiToHexadecimal(parametros.cmd.getDetalle().getTVpagada().getSerie());
		int consulta = parametros.cmd.getDetalle().getTVpagada().getTipoC();
		paquete.append(bsi);
	
		String componente = "000111110";
		componentes=String.format("%32s", componente).replace(' ', '0');
		componentes=String.format("%8s",Conversiones.BinarioToHexadecimal(componentes)).replace(' ', '0');
		if (consulta == 6)
		{	
			// Para ejecutar comando 770
			parametros.setValue("Comando", "770");
			paquete.append(serie);
			paquete.append(componentes);
		}
		else
		{
			
			parametros.setValue("Comando", "684");
			paquete.append(head);
			paquete.append(tipo);
			paquete.append(subtipo);
			paquete.append(serie);
			paquete.append(String.format("%2s", Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getTipoC())).replace(' ', '0'));
			//System.out.println("TipoC"+ parametros.cmd.getDetalle().getTVpagada().getTipoC());
		}
		
		System.out.println("Inicio de Creacion Comando 704-"+paquete);
		
		return paquete;
	}
	
	/**
	 * Recibe los datos provenientes del WSDL, una vez 
	 * realizadas las conversiones correspondientes, se 
	 * insertan los datos en un StringBuilder paquete.
	 * 
	 * Comando para Refrescar las caracteristicas del Decodificador.
	 * 
	 * @return
	 * @throws IllegalArgumentException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 */
	
	public StringBuilder ComandoDAC680_old() throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException
	{
		String estado = parametros.cmd.getDetalle().getTVpagada().getEstadoC();
		int credito = parametros.cmd.getDetalle().getTVpagada().getCredito();
		int datoC1 = Integer.valueOf(parametros.cmd.getDetalle().getTVpagada().getDatoC1());
		String tipoippv = parametros.getValue("ippv").toString();
		//bsi = 
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(parametros.getValue("bsiciudad").toString())).replace(' ', '0'));
		//head = 
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal("0")).replace(' ','0'));
		//Equip_Type
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getTipoD())).replace(' ','0'));
		//Equip_Sub_Type
		paquete.append(String.format("%4s", Conversiones.DecimalToHexadecimal("0")).replace(' ', '0'));
		//Serial_Number
		paquete.append(Conversiones.AsciiToHexadecimal(parametros.cmd.getDetalle().getTVpagada().getSerie()));
		//Bit_Mask_1, valor enviado dependiendo de lo que se quiera guardar.
		//String bitmask = "647";
		String bitmask = "6C7";
		
		paquete.append(String.format("%8s",bitmask).replace(' ','0'));
		//System.out.println();
		
		idServicio = parametros.cmd.getDetalle().getTVpagada().getIdServicio();
		fPago = parametros.cmd.getDetalle().getTVpagada().getFormaPago();
		cCredito = parametros.cmd.getDetalle().getTVpagada().getCredito();
		//Credit_Allowed
		credito = parametros.CalculaCredito(idServicio, fPago, cCredito, datoC1);
		credito = 0;
		paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+credito)).replace(' ','0'));	
		//Purchased_Allowed
		paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal("0")).replace(' ','0'));
		//MAX_Pack_Cost
		paquete.append(String.format("%4s", Conversiones.DecimalToHexadecimal("0")).replace(' ', '0'));
		// **************************************************
		//TimeZoneHandle
		String Zone = "2";
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(Zone)).replace(' ', '0'));
		//Country_Code
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal("0")).replace(' ','0'));
		//Currency_Region
		String moneda = "1";
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(moneda)));
		//EPG_Region
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(parametros.getValue("region").toString())).replace(' ', '0'));
		//TurnOn_VC "200"11001000
		String turnOn = "200";	
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(turnOn)).replace(' ','0'));
		//TurnOff_VC
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal("0")).replace(' ','0'));
		//Output_Channel_#
		paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal("3")).replace(' ','0'));
		
		//Feature_Setting, configurado deacuerdo al tipodeco.
		String feature = "";
		if (estado == "M" || credito == 0 || tipoippv == "N") 
		{
			feature = "FFF";
		}
		else
		{
	   		feature = "1FFF";
		}
				
		paquete.append(String.format("%8s",Conversiones.AsciiToHexadecimal(feature)).replace(' ', '0'));
		
		return paquete;		
	}
	
	
	public StringBuilder ComandoDAC680() throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException 
	{
		
		System.out.println("Inicio de Creacion Comando 715");
		
		String estado = parametros.cmd.getDetalle().getTVpagada().getEstadoC();
		 credito = parametros.cmd.getDetalle().getTVpagada().getCredito();
		 int datoC1 = Integer.valueOf(parametros.cmd.getDetalle().getTVpagada().getDatoC1());

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
		//System.out.println("Credit"+this.cCredito);
		paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+cCredito)).replace(' ','0'));
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
		

		System.out.println("Fin de Creacion Comando 715-"+paquete);
		
		return paquete;
		
	}
	
	
	
	/**
	 * Recibe los datos provenientes del WSDL, una vez 
	 * realizadas las conversiones correspondientes, se 
	 * insertan los datos en un StringBuilder paquete.
	 *
	 * Comando para activar y desactivar eventos digitales.
	 * 
	 * @return StringBuilder paquete
	 * @throws IllegalArgumentException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 */
	public StringBuilder ComandoDAC694() throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException{
		
		 System.out.println("Inicio de Creacion Comando 703");
		
		 bsi = String.format("%4s",Conversiones.DecimalToHexadecimal(parametros.getValue("bsiciudad").toString())).replace(' ', '0');
		 eventos = 0;
		 int numdecos = 0;
		 numdecos = 1;
		 //numdecos = parametros.cmd.getDetalle().getTVpagada().getIdEventos().getIdEvento().size();
		 //numdecos = parametros.cmd.getDetalle().getTVpagada().getIdEventos().getCantE();
		 
		 paquete.append(bsi);
		 paquete.append(String.format("%4s",numdecos).replace(' ', '0'));
		 //System.out.println("numdecos"+numdecos);
		 for (int i= 0; i<numdecos; i++ )
		 {
			 head = String.format("%4s","0").replace(' ','0');
			 tipo = String.format("%4s",Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getTipoD())).replace(' ', '0');
			 subtipo = String.format("%4s","0").replace(' ','0');
			 serie = Conversiones.AsciiToHexadecimal(parametros.cmd.getDetalle().getTVpagada().getSerie());
			 eventos = parametros.cmd.getDetalle().getTVpagada().getIdEventos().getIdEvento().get(i).getIdEvento();
			 String seventos = Conversiones.DecimalToBinario(""+eventos);
			 seventos = String.format("%32s", seventos).replace(' ','0');

			 // Verificacion de Activacion o Desactivacion del Evento.
			 int accion = parametros.cmd.getDetalle().getTVpagada().getAccion();

			 char accionc ;
			 if (accion == 3) {
					accionc = '1';   /* Autorizacion */
				}
				else { 
					accionc = '0'; /* Desautorizacion */
				}
				//System.out.println("antesSEVENTOS"+seventos);
			StringBuffer bevento = new StringBuffer(seventos);
			
			bevento.setCharAt(1, accionc);    // Bit 30 Verifica si Activa o Desactiva el Evento.
			seventos = bevento.toString();
			//System.out.println("despuesSEVENTOS"+seventos);			
			seventos = String.format("%8s",Conversiones.BinarioToHexadecimal(seventos)).replace(' ', '0');

			// fin de la verificacion. 
		
			 // Relleno los datos.	 
			 subpaquete.append(head);
			 subpaquete.append(tipo);
			 subpaquete.append(subtipo);
			 subpaquete.append(serie);
			 subpaquete.append(seventos);
			 paquete.append(subpaquete);
		 }
		 
		 System.out.println("Fin de Creacion Comando 703-"+paquete);
		 
		return paquete;
	}
	
	/**
 	 * Recibe los datos provenientes del WSDL, una vez 
	 * realizadas las conversiones correspondientes, se 
	 * insertan los datos en un StringBuilder paquete.
	 * 
	 * @return StringBuilder paquete
	 * @throws IllegalArgumentException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 */
	public StringBuilder ComandoDAC777() throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException{
		bsi = String.format("%4s",Conversiones.DecimalToHexadecimal(parametros.getValue("bsiciudad").toString())).replace(' ', '0');
		int numeve = Integer.valueOf(parametros.getValue("numeve").toString());
		numeve1 = Conversiones.DecimalToHexadecimal(String.valueOf(numeve));
		int eventos = 0;
		paquete.append(bsi);
		paquete.append(String.format("%04d", numeve1));
		for (int i= 1; i<numeve ; i++ )
		{
			eventos = parametros.cmd.getDetalle().getTVpagada().getIdEventos().getIdEvento().get(i).getIdEvento();
			// Convierto los datos.
	  		head = String.format("%4s","0").replace(' ','0');
		    tipo = String.format("%4s",Conversiones.DecimalToHexadecimal(parametros.getValue("equiptype").toString())).replace(' ', '0');	      
		    serie = Conversiones.AsciiToHexadecimal(parametros.cmd.getDetalle().getTVpagada().getSerie());	      
			String seventos = Conversiones.DecimalToHexadecimal(String.valueOf(eventos));
			seventos = Conversiones.HexadecimalToBinario(seventos);
			String.format("%32d", seventos);
			// setear el binario.
			int accion =0;
		    accion = Integer.valueOf(Conversiones.DecimalToHexadecimal(""+accion));

			// Relleno los datos.
			subpaquete.append(bsi);
			subpaquete.append(head);
			subpaquete.append(tipo);
			String.format("%08d", seventos);
			subpaquete.append(seventos);
			subpaquete.append(String.format("%02d",accion));

			paquete.append(subpaquete);
		} 

	return paquete;
	}
	
	
	/**
	 * Recibe los datos provenientes del WSDL, una vez 
	 * realizadas las conversiones correspondientes, se 
	 * insertan los datos en un StringBuilder paquete.
	 * 
	 * Comando para Eliminar Decodificadores
	 * 
	 * @return
	 * @throws IllegalArgumentException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 */
	public StringBuilder ComandoDAC663() throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException
	{
		System.out.println("Inicio de Creacion Comando 714");
		//bsi = 
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(parametros.getValue("bsiciudad").toString())).replace(' ', '0'));
		//head = 
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal("0")).replace(' ','0'));
		//Equip_Type
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal("0")).replace(' ','0'));
		//Equip_Sub_Type
		paquete.append(String.format("%4s", Conversiones.DecimalToHexadecimal("0")).replace(' ', '0'));
		//Serial_Number
		paquete.append(Conversiones.AsciiToHexadecimal(parametros.cmd.getDetalle().getTVpagada().getSerie()));
		
		System.out.println("Fin de Creacion Comando 714-"+paquete);
		
		return paquete;		
	}
	public StringBuilder ComandoDAC770() throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException
	{
		
		System.out.println("Inicio de Creacion Comando 716");
		
		//bsi = 
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(parametros.getValue("bsiciudad").toString())).replace(' ', '0'));
		//Serial_Number
		paquete.append(Conversiones.AsciiToHexadecimal(parametros.cmd.getDetalle().getTVpagada().getSerie()));
		//Components_Requested
		//String component_requested = "1E";
		//paquete.append(String.format("%32s",Conversiones.BinarioToHexadecimal("1110")).replace(' ', '0'));
		paquete.append(String.format("%8s",Conversiones.BinarioToHexadecimal("1100111110")).replace(' ', '0'));
		System.out.println("Fin de Creacion Comando 716");
		
		return paquete;		
	}	
	public StringBuilder ComandoDAC724_old() throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException
	{
		
		System.out.println("Inicio de Creacion Comando 724");
		
		String tipoc = "";
		bsi = String.format("%4s",Conversiones.DecimalToHexadecimal(parametros.getValue("bsiciudad").toString())).replace(' ', '0');
//		head = String.format("%4s","0").replace(' ','0');
		head = String.format("%4s",Conversiones.DecimalToHexadecimal(parametros.getValue("headend").toString())).replace(' ','0');
		tipo = String.format("%4s",Conversiones.DecimalToHexadecimal(parametros.getValue("equiptype").toString())).replace(' ', '0');
		subtipo = String.format("%4s","0").replace(' ','0');
		serie = Conversiones.AsciiToHexadecimal(parametros.cmd.getDetalle().getTVpagada().getSerie());
		int consulta = parametros.cmd.getDetalle().getTVpagada().getTipoC();
		paquete.append(bsi);
	
		String componente = "000111110";
		componentes=String.format("%32s", componente).replace(' ', '0');
		componentes=String.format("%8s",Conversiones.BinarioToHexadecimal(componentes)).replace(' ', '0');
		if (consulta == 6)
		{	
			// Para ejecutar comando 770
			parametros.setValue("Comando", "770");
			paquete.append(serie);
			paquete.append(componentes);
		}
		else
		{
			parametros.setValue("Comando", "684");
			paquete.append(head);
			paquete.append(tipo);
			paquete.append(subtipo);
			paquete.append(serie);
			paquete.append(String.format("%2s", Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getTipoC())).replace(' ', '0'));
		}
		
		System.out.println("Fin de Creacion Comando 724-"+paquete);
		
		return paquete;	
	}

	public StringBuilder ComandoDAC724() throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException, UnsupportedEncodingException, IOException, ParseException, Excepciones
	{
		
		int usuario = parametros.cmd.getDetalle().getTVpagada().getTipoA();
		
		//System.out.println("usuario "+usuario);
		if (usuario!= 500005 && usuario!= 500007 && usuario!= 500006 && usuario!= 500004 && usuario!= 500003)
		{
			/****************************
			 * 
			 */
			String tipoc = "";
			bsi = String.format("%4s",Conversiones.DecimalToHexadecimal(parametros.getValue("bsiciudad").toString())).replace(' ', '0');
			head = String.format("%4s","0").replace(' ','0');

			tipo = String.format("%4s",Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getTipoD())).replace(' ', '0');
			subtipo = String.format("%4s","0").replace(' ','0');
			serie = Conversiones.AsciiToHexadecimal(parametros.cmd.getDetalle().getTVpagada().getSerie());
			int consulta = parametros.cmd.getDetalle().getTVpagada().getTipoC();
			paquete.append(bsi);
		
			String componente = "000111110";
			componentes=String.format("%32s", componente).replace(' ', '0');
			componentes=String.format("%8s",Conversiones.BinarioToHexadecimal(componentes)).replace(' ', '0');
			if (consulta == 6)
			{	
				// Para ejecutar comando 770
				parametros.setValue("Comando", "770");
				paquete.append(serie);
				paquete.append(componentes);
			}
			else
			{
				
				parametros.setValue("Comando", "684");
				paquete.append(head);
				paquete.append(tipo);
				paquete.append(subtipo);
				paquete.append(serie);
				paquete.append(String.format("%2s", Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getTipoC())).replace(' ', '0'));
				//System.out.println("TipoC"+ parametros.cmd.getDetalle().getTVpagada().getTipoC());
			}
			
			
			tamanio = Integer.toString(Paquete.PaqueteLength(paquete.toString()));
			tamanio = ""+(Integer.valueOf(tamanio)+6);

			parametros.setValue("Tamanio",String.format("%4s",Conversiones.DecimalToHexadecimal(""+tamanio)).replace(' ','0'));
			parametros.setValue("Paquete", paquete);
			parametros.setValue("Comando",String.format("%4s",Conversiones.DecimalToHexadecimal("684")).replace(' ','0'));

			
			respuesta = new GuardarComandoTV().guardarDAC(parametros);
			
			/******************************
			 * 
			 */
			
			
			
			
			tipoc = "";
			bsi = "";
			serie = "";
			consulta = 0;
			paquete.delete(0,paquete.length());
			
			bsi = String.format("%4s",Conversiones.DecimalToHexadecimal(parametros.getValue("bsiciudad").toString())).replace(' ', '0');
			serie = Conversiones.AsciiToHexadecimal(parametros.cmd.getDetalle().getTVpagada().getSerie());
			consulta = parametros.cmd.getDetalle().getTVpagada().getTipoC();
			paquete.append(bsi);
		
			componente = "000111110";
			componentes=String.format("%32s", componente).replace(' ', '0');
			componentes=String.format("%8s",Conversiones.BinarioToHexadecimal(componentes)).replace(' ', '0');
			if (consulta == 6)
			{	
				parametros.setValue("Comando", "770");
				paquete.append(serie);
				paquete.append(componentes);
			}
			else
			{
				parametros.setValue("Comando", "684");
				paquete.append(serie);
			}
			
			
		}
		else
		{
			System.out.println("Inicio de Creacion Comando 724 - laboratorio");
			
			String tipoc = "";
			bsi = String.format("%4s",Conversiones.DecimalToHexadecimal(parametros.getValue("bsiciudad").toString())).replace(' ', '0');
			serie = Conversiones.AsciiToHexadecimal(parametros.cmd.getDetalle().getTVpagada().getSerie());
			int consulta = parametros.cmd.getDetalle().getTVpagada().getTipoC();
			paquete.append(bsi);
		
			String componente = "000111110";
			componentes=String.format("%32s", componente).replace(' ', '0');
			componentes=String.format("%8s",Conversiones.BinarioToHexadecimal(componentes)).replace(' ', '0');
			if (consulta == 6)
			{	
				// Para ejecutar comando 770
				parametros.setValue("Comando", "770");
				paquete.append(serie);
				paquete.append(componentes);
			}
			else
			{
				
				parametros.setValue("Comando", "684");
	//			paquete.append(bsi);
	//			paquete.append(tipo);
	//			paquete.append(subtipo);
				paquete.append(serie);
	//			paquete.append(String.format("%2s", Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getTipoC())).replace(' ', '0'));
			}
			
			System.out.println("Fin de Creacion Comando 724-"+paquete);
		}
		return paquete;	
	}

	
	/** 760 Anterior - Se va a separar el comando este queda como respaldo
	 * 
	 * Recibe los datos provenientes del WSDL, una vez 
	 * realizadas las conversiones correspondientes, se 
	 * insertan los datos en un StringBuilder paquete.
	 * 
	 * Comando maestro para resetear decos, actualiza servicios, eventos, paquetes 
	 * creditos.
	 * 
	 * @return
	 * @throws IllegalArgumentException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 * @throws Excepciones 
	 */
	public StringBuilder ComandoDAC760() throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException, Excepciones
	{
		
        
        System.out.println("Inicio de Creacion Comando 702 holaaaaa");
        
        String msg = "";
        String bit = "";
        String requestType = "2";
        
  
              int ubicacion = parametros.cmd.getDetalle().getTVpagada().getUbicacion();

              /** IDENTIFIER COMPONENT **/
              //bsi =
            	System.out.println("IdEmpresa = "+parametros.cmd.getCabecera().getIDEmpresa());
               
              new TvpParametrosDAO().findById(parametros.cmd.getCabecera().getIDEmpresa()).getBsi().toString();
//              paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(parametros.getValue("bsiciudad").toString())).replace(' ', '0'));
              /** Modificacion obtencion datos de base datos **/
              paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(new TvpParametrosDAO().findById(parametros.cmd.getCabecera().getIDEmpresa()).getBsi().toString())).replace(' ', '0'));              
              //request_type 1Add-2Change-3Delete      
              paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(requestType)).replace(' ', '0'));
              //Serial_Number
              parametros.SetearSerie(parametros.cmd.getDetalle().getTVpagada().getSerie());
              String serie = parametros.getValue("Serie").toString();
              //System.out.println("ahora"+serie);
              paquete.append(Conversiones.AsciiToHexadecimal(serie));

              /** PLANT COMPONENT**/
              
              //Msg_SUbType     value=2
              msg = "2";
              paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(msg)).replace(' ', '0'));        
              //Bit_Mask
              
              bit = "20";
              paquete.append(String.format("%8s",bit).replace(' ', '0'));            

              //HeadEnd_Handle
//              paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+parametros.getValue("headend"))).replace(' ', '0'));
              paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(new TvpParametrosDAO().findById(parametros.cmd.getCabecera().getIDEmpresa()).getHeadend().toString())).replace(' ', '0'));              
              
              //Upstream_Plant_Handle
//              paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+parametros.getValue("up"))).replace(' ', '0'));
              paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(new TvpParametrosDAO().findById(parametros.cmd.getCabecera().getIDEmpresa()).getUp().toString())).replace(' ', '0'));
              
              //Downstream_Plant_Handle
//              paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+parametros.getValue("down"))).replace(' ', '0'));
              paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(new TvpParametrosDAO().findById(parametros.cmd.getCabecera().getIDEmpresa()).getDown().toString())).replace(' ', '0'));              
              
              //Reserved1
              paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal("0")).replace(' ', '0'));
              //Reserved2
              paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal("0")).replace(' ', '0'));
              //VCM_Handle
             // System.out.println(parametros.getValue("vcm").toString());
              
              Mora  = "0";
              boolean mora = false;
              

              if (Mora.equals("1"))
              {
                    if (parametros.cmd.getCabecera().getIDEmpresa()==63)
                    {
                         vcm= 43;
                    }
                    else if (parametros.cmd.getCabecera().getIDEmpresa()==94)
                    {
                         vcm = 42;
                    }
                    mora  = true;
                    operationCode = 6;           
              }
              else
              {
            	  System.out.println(parametros.cmd.getDetalle().getTVpagada().getEstadoC());
            	  System.out.println(parametros.cmd.getCabecera().getIDEmpresa());
            	  operationCode = parametros.cmd.getDetalle().getTVpagada().getAccion();
            	  operationCode = parametros.cmd.getDetalle().getTVpagada().getAccion();
            	  if (parametros.cmd.getDetalle().getTVpagada().getEstadoC().equals("Y"))
            		  vcm = new TvpParametrosDAO().findById(Integer.valueOf(""+parametros.cmd.getCabecera().getIDEmpresa() +"2")).getVcm();
            	  else
            	  {
                    vcm = new TvpParametrosDAO().findById(parametros.cmd.getCabecera().getIDEmpresa()).getVcm();
                    System.out.println("d"+ vcm);
            	  }
              }

              paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+vcm)).replace(' ', '0'));
              
              
              /** STATE COMPONENT **/
              //Msg_SUbType     value=3
              msg = "03";
              bit = "3";
              //paquete.append(msg);       
              paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(msg)).replace(' ', '0'));
              //Bit_Mask
              paquete.append(String.format("%8s",bit).replace(' ', '0'));
            //On_Plant_Flag, si la ubicacion es no instalado entonces va Off plant (0)
              /*if (ubicacion == 23)//23
              {
                    System.out.println("Ubicacion"+ubicacion);
                    paquete.append(String.format("%2s", "0").replace(' ', '0'));
              }
              else
              {
                    paquete.append(String.format("%2s", "1").replace(' ', '0'));
              }
              */
              //Operation_Code
              
              
              if (operationCode == 5)//23
              {
                    paquete.append(String.format("%2s", "0").replace(' ', '0'));
              }
              else
              {
                    paquete.append(String.format("%2s", "1").replace(' ', '0'));
              }
              
              paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(""+operationCode)).replace(' ','0'));
              
              if (parametros.cmd.getDetalle().getTVpagada().getTipoD()==4002 || parametros.cmd.getDetalle().getTVpagada().getTipoD()==4082 || parametros.cmd.getDetalle().getTVpagada().getTipoD()==7032)
              {
                    //// Tipod para HArvest
                    parametros.setValue("tipodeco", parametros.cmd.getDetalle().getTVpagada().getTipoD());
                    parametros.setValue("ciudaddeco",parametros.cmd.getCabecera().getIDEmpresa());
              }

              
  //if (Integer.valueOf(parametros.getValue("vcm").toString())!=42)
  if (!mora)
  {
        //System.out.println("VCM ENTRO");
              /** FEATURE COMPONENT**/
              
              //Msg_SUbType     value=2
              String estado = parametros.cmd.getDetalle().getTVpagada().getEstadoC();
              String tipoippv = parametros.getValue("ippv").toString();
              int compra;
              bit = "6C7";
              
              msg = "4";
              paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal("4")).replace(' ', '0'));  
              paquete.append(String.format("%8s",bit).replace(' ', '0'));            
              cCredito = parametros.cmd.getDetalle().getTVpagada().getCredito();
              //**********************************************************
              // calcular el credito de la caja cuando es por primera vez.
              //**********************************************************
              //credito = parametros.CalculaCredito(idServicio, fPago, cCredito, datoC1);
        
              /*if (cCredito != 0)
              {
               compra = cCredito/4;
              }
              else
              {
                compra = 0;
              }*/
              
              if (cCredito != 0)
              {
               compra = cCredito/5;
              }
              else
              {
                compra = 0;
              }
              
              // Credit_Alloewd
              paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+cCredito)).replace(' ','0'));            
              // Purchased_Alloewd
              paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+compra)).replace(' ','0'));
              //MAX_Pack_Cost
              //paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal("10")).replace(' ', '0'));
              paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal("5")).replace(' ', '0'));
              // **************************************************
              String zone = "2"; String pais = "0"; String moneda = "1";; String canal = "3";
              //TimeZoneHandle
              paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(zone)).replace(' ', '0'));

              //EPG_Region
//              paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+parametros.getValue("region"))).replace(' ', '0'));
              paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(new TvpParametrosDAO().findById(parametros.cmd.getCabecera().getIDEmpresa()).getRegion().toString())).replace(' ', '0'));              

              //Country_Code
              paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal("1")).replace(' ','0'));
              //TurnOn_VC
              String turnOn = "200";  
              paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(turnOn)).replace(' ','0'));
              //TurnOff_VC
              paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal("0")).replace(' ','0'));
              //Output_Channel_#
              paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(canal)).replace(' ','0'));
              
              //Feature_Setting, configurado deacuerdo al tipodeco.
              String feature = "";
              if (estado == "M" || cCredito == 0 || tipoippv == "N") 
              {
                    feature = "FBF";
              }
              else
              {
                    feature = "1FBF";
              }
            
              paquete.append(String.format("%8s",feature).replace(' ', '0'));
              
              
              /**
               * 
               */   
              paquete.append(parametros.SetearHouseHoldId(parametros.cmd.getDetalle().getTVpagada().getIdAccount()));
  
              
              /***
               * Business System Owner Component 
               */
              //Modificado para Digitalizacion Salinas
              /*if (parametros.cmd.getDetalle().getTVpagada().getDatoC1().equals("TRANSFERSALINAS"))
              {
            	  
            	  System.out.println("SALINAS");
	              msg = "06";
	              paquete.append(msg);       
	              paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal("7")).replace(' ', '0'));
              }else if (parametros.cmd.getDetalle().getTVpagada().getDatoC1()=="TRANSFERGUAYAQUIL")
              {
            	  System.out.println("GYE");
	              msg = "06";
	              paquete.append(msg);       
	              paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal("2")).replace(' ', '0'));
            	  
              }*/
              
              /** AUTHORIZATION COMPONENT **/
              
              //Msg_SubType     value=7
              msg = "07";
              paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(msg)).replace(' ', '0'));
              //paquete.append(msg);       
              //Clear_All_Packages_Flag
              paquete.append("01");
              //Clear_All_Services_Flag
              paquete.append("01");
              //Clear_All_Programs_Flag
              paquete.append("01");
              int c=0;
              // Si la operacion es desactivar (CORTAR) no envio ningun servicio. Consultar con el 
              // Ing Zuñiga y preguntarle y aclararle el riesgo.
              if (operationCode != 5)
              {
                    //*******************************************
                    // Identifico si existe promociones vigentes.
                    //*******************************************
                    Integer[] promo = new Integer[6];
                    Integer promo1 = parametros.cmd.getDetalle().getTVpagada().getTipoPromocion();
                    String promo2 = parametros.cmd.getDetalle().getTVpagada().getDatoC2();
                    parametros.SetearServicio(parametros);
                    int servicio = Integer.valueOf(parametros.getValue("idServicio").toString());
                    int servicioTitan = parametros.cmd.getDetalle().getTVpagada().getIdServicio();
                    /*if (promo1 != null)
                    {
                       promo[0] = promo1;
                       String[] promociones = promo2.split(";");
                       int cont = 1;
                       for (int k=0; k < promociones.length; k++)
                       {
                          promo[cont] = Integer.valueOf(promociones[k]);
                          cont = cont+1;
                       }
                    }*/
                         
                    //******************************************************
                    // Extraigo los paquetes enviados desde el web service.
                    //******************************************************
                    int[] pay = null;
                    int[] payTitan = null;
                    
                    if (parametros.cmd.getDetalle().getTVpagada().getTipoA() == 500004)
                    {
                        if (parametros.cmd.getDetalle().getTVpagada().getDatoC1() != "" &&parametros.cmd.getDetalle().getTVpagada().getDatoC1() != "0")
                        {
                         temp = parametros.cmd.getDetalle().getTVpagada().getDatoC1().split("-");   
                                // print splitted substrings 
                         //System.out.println("lenght"+temp.length);

                                for(int i =0; i < temp.length ; i++)
                                {
                                          pay = new int[temp.length];  
                                          //  System.out.println("pay-"+Integer.valueOf(temp[i].toString()));
                                parametros.SetearPaquete(parametros, Integer.valueOf(temp[i].toString()));
                                parametros.SetearPaqueteExtra(parametros, Integer.valueOf(temp[i].toString()));
                                
                                pay[i] = Integer.valueOf(parametros.getValue("idPaquete").toString());                                       
                                }
                        }
                    }
                    else
                    {
              if (parametros.cmd.getDetalle().getTVpagada().getIdPaquetes() != null  )
                    {                 
                               List<IdPaquete> lstpaquete = parametros.cmd.getDetalle().getTVpagada().getIdPaquetes().getIdPaquete();   
                               pay = new int[lstpaquete.size()];  
                               
                               // desde Titan 
                               for (int i=0; i < parametros.cmd.getDetalle().getTVpagada().getIdPaquetes().getIdPaquete().size(); i++)
                               //desde SP
                               //for (int i=0; i < parametros.cmd.getDetalle().getTVpagada().getIdPaquetes().getIdPaquete().size()/2; i++)                                    
                               {
                                     if (lstpaquete.get(i).getIdPaquete()!=0)
                                     {     
                                     //System.out.println("Pauqete"+lstpaquete.get(i).getIdPaquete());
                                     parametros.SetearPaquete(parametros, lstpaquete.get(i).getIdPaquete());
                                     parametros.SetearPaqueteExtra(parametros, lstpaquete.get(i).getIdPaquete());
                                     
                                     pay[i] = Integer.valueOf(parametros.getValue("idPaquete").toString());                                       
                                     }
                               }     
                    }
                    }


                    //******************************************************
                    // Extraigo los paquetes enviados desde el web service.
                    //******************************************************
                    int[] eve = null;
                    if (parametros.cmd.getDetalle().getTVpagada().getIdEventos() != null )
                    {
                               
                               List<IdEvento> lstevento = parametros.cmd.getDetalle().getTVpagada().getIdEventos().getIdEvento();
                               //System.out.println("SIZE"+lstevento.size());
                               eve = new int[lstevento.size()];   
                               
                               // desde Titan 
                               for (int i=0; i < parametros.cmd.getDetalle().getTVpagada().getIdEventos().getIdEvento().size(); i++)
                               //desde SP
                               //for (int i=0; i < parametros.cmd.getDetalle().getTVpagada().getIdEventos().getIdEvento().size()/2; i++)                                      
                               {
                                     ///System.out.println("SIZddd");
                                     if (lstevento.get(i).getIdEvento()!=0)
                                     {                                        	 
                                    	 eve[i] = lstevento.get(i).getIdEvento();                                    
                                     }
                               }
                               
                               
                               
                    }
                  // validar la guia digital, es decir cambiar.
                    
                    tipoPromocion = parametros.cmd.getDetalle().getTVpagada().getTipoPromocion();
                    if (tipoPromocion >= 1)
                    {
                         this.parametros.SetearPromocion(parametros, tipoPromocion);
                    }
                    
                    
                    parametros.VerificarCodigoExtra(servicioTitan, pay, servicio,pay);
                    
                    subpaquete.append("01");
                    subpaquete.append("01");
                    subpaquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+servicio)).replace(' ', '0'));
                    subpaquete.append(String.format("%8s","0").replace(' ','0'));
                    c++;
                    
                  Integer newservicio[] = (Integer[])parametros.getValue("servicioadi"); 
                    ArrayList<Integer> newpaquete = (ArrayList<Integer>)parametros.getValue("paqueteadi");
                    ArrayList<Integer> neweventoVip = (ArrayList<Integer>)parametros.getValue("eventoadi");
                    //System.out.println("Evento antes");
                    int[] newevento = (int[]) eve;
                    
                    for (int o: newservicio) 
                    {                       
                         subpaquete.append("01");
                         if (o == 200010)
                         {
                               subpaquete.append("02");
                         }
                         else
                         {
                               subpaquete.append("01");//01 servicio - 02 guia - 03 eventos
                         }
                         subpaquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+o)).replace(' ', '0'));
                         subpaquete.append(String.format("%8s","0").replace(' ','0'));
                         c++;
                    }
                    //System.out.println("C Antes de los paquetes "+c);
                    
                    
                    for (int o: newpaquete) 
                    {
                         if (o!= 0)
                         {
                               subpaquete.append("01");
                               /*
                               if(o==9990964 || o==9990963)
                               {
                                subpaquete.append("02");
                               }
                               else
                               {
                               subpaquete.append("01");
                               }*/
  
                               if(o==9990964 || o==9990963 || o==9991021)
                               {
                            	   subpaquete.append("02");
                               }
                               else if (o== 32769)
                               {
                            	   subpaquete.append("05");
                               }
                               else
                               {
                            	   subpaquete.append("01");
                               }
                               
                               subpaquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+o)).replace(' ', '0'));                              
                               subpaquete.append(String.format("%8s","0").replace(' ','0'));
                               c++;
                          }
                    }
                    
//                    subpaquete.append("01");
                    


                    
                    
                    

                    /*
                    for (int o: newpaquete) 
                    {
                         if (o!= 0)
                         {
                               subpaquete.append("01");
                               subpaquete.append("01");
                               subpaquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+o)).replace(' ', '0'));                              
                               subpaquete.append(String.format("%8s","0").replace(' ','0'));
                               c++;
                          }
                    }*/
                    //System.out.println("C Despues de los paquetes "+c);
                    if (newevento != null)
                    {
                         for (int o: newevento) 
                         {
                               
                               if (o!= 0)
                               {
                                    // System.out.println("Evento"+o);
                                     
                                     subpaquete.append("01");
                                     subpaquete.append("03");
                                     subpaquete.append(String.format("%8s","0").replace(' ','0'));                                       
                                     subpaquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+o)).replace(' ', '0'));                                    
                                     c++;
                               }
                         }
                    }
                    


                    //System.out.println("C Despues de los paquetes "+c);
                    
                    for (int o: neweventoVip) 
                    {
                         if (o!= 0)
                         {                            
                               /*subpaquete.append("01");
                               if (o==40701 || o==40706 || o==50185 || o==40702 )
                               {
                                     subpaquete.append("02");                                         
                               }
                               else
                               {
                                     subpaquete.append("03");
                               }*/
                        	 
                             subpaquete.append("01");
                             if(parametros.cmd.getDetalle().getTVpagada().getIdServicio()==212)
                             {
                          	      subpaquete.append("02");
                             }
                             else
                             {
	                               if (o==40701 || o==40706 || o==50185 || o==40702 )
	                               {
	                                     subpaquete.append("02");                                         
	                               }
	                               else
	                               {
	                                     subpaquete.append("03");
	                               }
                             }

                        	 
                        	 
                               //System.out.println(o);
                               subpaquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+o)).replace(' ', '0'));                              
                               subpaquete.append(String.format("%8s","0").replace(' ','0'));
                               c++;
                         }
                    }
                    //System.out.println("C Despues de los eventos "+c);
        }
        
              //Cantidad de Servicios.

        paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+c)).replace(' ','0'));
        
        //Todos los subpaquetes
        paquete.append(subpaquete);
  }else
  {
        /** FEATURE COMPONENT**/
        
        //Msg_SUbType     value=2
        String estado = parametros.cmd.getDetalle().getTVpagada().getEstadoC();
        String tipoippv = parametros.getValue("ippv").toString();
        int compra;
        bit = "6C7";
        
        msg = "4";
        paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal("4")).replace(' ', '0'));  
        paquete.append(String.format("%8s",bit).replace(' ', '0'));            
        cCredito = 0;//parametros.cmd.getDetalle().getTVpagada().getCredito();
        //**********************************************************
        // calcular el credito de la caja cuando es por primera vez.
        //**********************************************************
        //credito = parametros.CalculaCredito(idServicio, fPago, cCredito, datoC1);
  
        if (cCredito != 0)
        {
         compra = cCredito/5;
        }
        else
        {
          compra = 0;
        }
        // Credit_Alloewd
        paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+cCredito)).replace(' ','0'));            
        // Purchased_Alloewd
        paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+compra)).replace(' ','0'));
        //MAX_Pack_Cost
        //paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal("10")).replace(' ', '0'));
        paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal("5")).replace(' ', '0'));
        // **************************************************
        String zone = "2"; String pais = "0"; String moneda = "1";; String canal = "3";
        //TimeZoneHandle
        paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(zone)).replace(' ', '0'));
        //EPG_Region
        paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+parametros.getValue("region"))).replace(' ', '0'));                  
        //Country_Code
        paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal("1")).replace(' ','0'));
        //TurnOn_VC
        String turnOn = "200";  
        paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(turnOn)).replace(' ','0'));
        //TurnOff_VC
        paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal("0")).replace(' ','0'));
        //Output_Channel_#
        paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(canal)).replace(' ','0'));
        
        //Feature_Setting, configurado deacuerdo al tipodeco.
        String feature = "";
        if (estado == "M" || cCredito == 0 || tipoippv == "N") 
        {
              //System.out.println("Entro M");
              feature = "FBF";
        }
        else
        {
              feature = "1FBF";
        }
      
        paquete.append(String.format("%8s",feature).replace(' ', '0'));
        
        
  }

        System.out.println("Fin de Creacion Comando 702-"+paquete);
        
        
  return paquete; 
	}
	/***
	 * 760 Nuevo - Se separo el comando, para solventar problema con el controlador
	 * @return
	 * @throws IllegalArgumentException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 * @throws Excepciones
	 */
	public StringBuilder ComandoDAC760_cambio() throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException, Excepciones
	{
		
		System.out.println("Inicio de Creacion Comando 702");
		
		String msg = "";
		String bit = "";
		String requestType = "2";
		
	
			int ubicacion = parametros.cmd.getDetalle().getTVpagada().getUbicacion();

			/** IDENTIFIER COMPONENT **/
			//bsi = 
			paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(parametros.getValue("bsiciudad").toString())).replace(' ', '0'));
			//request_type 1Add-2Change-3Delete		
			paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(requestType)).replace(' ', '0'));
			//Serial_Number
			paquete.append(Conversiones.AsciiToHexadecimal(parametros.cmd.getDetalle().getTVpagada().getSerie()));


			/** PLANT COMPONENT**/
			
			//Msg_SUbType	value=2
			msg = "2";
			paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(msg)).replace(' ', '0'));		
			//Bit_Mask
			bit = "20";
			paquete.append(String.format("%8s",bit).replace(' ', '0'));		
			//HeadEnd_Handle
			paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+parametros.getValue("headend"))).replace(' ', '0'));
			//Upstream_Plant_Handle
			paquete.append(String.format("%8s",
			Conversiones.DecimalToHexadecimal(""+parametros.getValue("up"))).replace(' ', '0'));
			//Downstream_Plant_Handle
			paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+parametros.getValue("down"))).replace(' ', '0'));
			//Reserved1
			paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal("0")).replace(' ', '0'));
			//Reserved2
			paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal("0")).replace(' ', '0'));
			//VCM_Handle
			paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(parametros.getValue("vcm").toString())).replace(' ', '0'));
			
			
			/** STATE COMPONENT **/
			//Msg_SUbType	value=3
			msg = "03";
			bit = "3";
			//paquete.append(msg);		
			paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(msg)).replace(' ', '0'));
			//Bit_Mask
			paquete.append(String.format("%8s",bit).replace(' ', '0'));
		    //On_Plant_Flag, si la ubicacion es no instalado entonces va Off plant (0)
			/*if (ubicacion == 23)//23
			{
				System.out.println("Ubicacion"+ubicacion);
				paquete.append(String.format("%2s", "0").replace(' ', '0'));
			}
			else
			{
				paquete.append(String.format("%2s", "1").replace(' ', '0'));
			}
			*/
			//Operation_Code
			
			int operationCode = parametros.cmd.getDetalle().getTVpagada().getAccion();
			//int operationCode = 2;			
			if (operationCode == 5)//23
			{
				paquete.append(String.format("%2s", "0").replace(' ', '0'));
			}
			else
			{
				paquete.append(String.format("%2s", "1").replace(' ', '0'));
			}
			paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal("--")).replace(' ','0'));
			paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(""+operationCode)).replace(' ','0'));
			paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal("--")).replace(' ','0'));

			System.out.println("FEATURE COMPONENT");
			
			/** FEATURE COMPONENT**/
			
			//Msg_SUbType	value=2
			String estado = parametros.cmd.getDetalle().getTVpagada().getEstadoC();
			String tipoippv = parametros.getValue("ippv").toString();
			int compra;
			bit = "6C7";
			
			msg = "4";
			paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal("4")).replace(' ', '0'));	
			paquete.append(String.format("%8s",bit).replace(' ', '0'));		
			cCredito = parametros.cmd.getDetalle().getTVpagada().getCredito();
			//**********************************************************
			// calcular el credito de la caja cuando es por primera vez.
			//**********************************************************
			//credito = parametros.CalculaCredito(idServicio, fPago, cCredito, datoC1);
		
			if (cCredito != 0)
			{
			 compra = cCredito/4;
			}
			else
			{
			  compra = 0;
			}
			
			// Credit_Alloewd
			paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+cCredito)).replace(' ','0'));			
			// Purchased_Alloewd
			paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+compra)).replace(' ','0'));
			//MAX_Pack_Cost
			paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal("10")).replace(' ', '0'));
			// **************************************************
			String zone = "2"; String pais = "0"; String moneda = "1";; String canal = "3";
			//TimeZoneHandle
			paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(zone)).replace(' ', '0'));
			//EPG_Region
			paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+parametros.getValue("region"))).replace(' ', '0'));			
			//Country_Code
			paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal("1")).replace(' ','0'));
			//TurnOn_VC
			String turnOn = "200";	
			paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(turnOn)).replace(' ','0'));
			//TurnOff_VC
			paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal("0")).replace(' ','0'));
			//Output_Channel_#
			paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(canal)).replace(' ','0'));
			
			//Feature_Setting, configurado deacuerdo al tipodeco.
			String feature = "";
			if (estado == "M" || cCredito == 0 || tipoippv == "N") 
			{
				feature = "FBF";
			}
			else
			{
		   		feature = "1FBF";
			}
			System.out.println(feature);
			paquete.append(String.format("%8s",feature).replace(' ', '0'));
			
			
			/**
			 * 
			 */	

			System.out.println("AUTHORIZATION COMPONENT");
			/** AUTHORIZATION COMPONENT **/
			
			//Msg_SubType	value=7
			msg = "07";
			paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(msg)).replace(' ', '0'));
			//paquete.append(msg);		
			//Clear_All_Packages_Flag
			paquete.append("01");
			//Clear_All_Services_Flag
			paquete.append("01");
			//Clear_All_Programs_Flag
			paquete.append("01");
			int c=0;
			// Si la operacion es desactivar (CORTAR) no envio ningun servicio. Consultar con el 
			// Ing Zuñiga y preguntarle y aclararle el riesgo.
			if (operationCode != 5)
			{
				//*******************************************
				// Identifico si existe promociones vigentes.
				//*******************************************
				Integer[] promo = new Integer[6];
				Integer promo1 = parametros.cmd.getDetalle().getTVpagada().getTipoPromocion();
				String promo2 = parametros.cmd.getDetalle().getTVpagada().getDatoC2();
				parametros.SetearServicio(parametros);
				int servicio = Integer.valueOf(parametros.getValue("idServicio").toString());
				int servicioTitan = parametros.cmd.getDetalle().getTVpagada().getIdServicio();
				if (promo1 != null)
				{
				   promo[0] = promo1;
				   String[] promociones = promo2.split(";");
				   int cont = 1;
				   for (int k=0; k < promociones.length; k++)
				   {
					 promo[cont] = Integer.valueOf(promociones[k]);
					 cont = cont+1;
				   }
				}
					
				//******************************************************
				// Extraigo los paquetes enviados desde el web service.
				//******************************************************
				int[] pay = null;
				int[] payTitan = null;
				
			if (parametros.cmd.getDetalle().getTVpagada().getIdPaquetes() != null  )
				{			
						List<IdPaquete> lstpaquete = parametros.cmd.getDetalle().getTVpagada().getIdPaquetes().getIdPaquete();	
						pay = new int[lstpaquete.size()];	
						
						for (int i=0; i < parametros.cmd.getDetalle().getTVpagada().getIdPaquetes().getIdPaquete().size(); i++)
						{
							if (lstpaquete.get(i).getIdPaquete()!=0)
							{	
							parametros.SetearPaquete(parametros, lstpaquete.get(i).getIdPaquete());
							pay[i] = Integer.valueOf(parametros.getValue("idPaquete").toString());							
							}
						}	
				}
				//******************************************************
				// Extraigo los paquetes enviados desde el web service.
				//******************************************************
				int[] eve = null;
				if (parametros.cmd.getDetalle().getTVpagada().getIdEventos() != null )
				{
						List<IdEvento> lstevento = parametros.cmd.getDetalle().getTVpagada().getIdEventos().getIdEvento();
						eve = new int[lstevento.size()]; 
						for (int i=0; i < lstevento.size(); i++)
						{
							eve[i] = lstevento.get(i).getIdEvento();
						}
				}
			    // validar la guia digital, es decir cambiar.
				
				parametros.VerificarCodigoExtra(servicioTitan, pay, servicio,pay);
				
				subpaquete.append("01");
				subpaquete.append("01");
				System.out.println("Servicio"+servicio);
				subpaquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+servicio)).replace(' ', '0'));
				subpaquete.append(String.format("%8s","0").replace(' ','0'));
				c++;
				
			    Integer newservicio[] = (Integer[])parametros.getValue("servicioadi"); 
				ArrayList<Integer> newpaquete = (ArrayList<Integer>)parametros.getValue("paqueteadi");
				ArrayList<Integer> neweventoVip = (ArrayList<Integer>)parametros.getValue("eventoadi");
				
				for (int o: newservicio) 
				{					
					subpaquete.append("01");
					if (o == 200010)
					{
						subpaquete.append("02");
					}
					else
					{
						subpaquete.append("01");//01 servicio - 02 guia - 03 eventos
					}
					subpaquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+o)).replace(' ', '0'));
					subpaquete.append(String.format("%8s","0").replace(' ','0'));
//					System.out.println("ServicioEnviar "+o);
					c++;
				}
				
				for (int o: newpaquete) 
				{
					if (o!= 0)
					{
						subpaquete.append("01");
						subpaquete.append("01");
						subpaquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+o)).replace(' ', '0'));						
						subpaquete.append(String.format("%8s","0").replace(' ','0'));
						c++;
					}
				}

			   
				
				for (int o: neweventoVip) 
				{
					if (o!= 0)
					{
						subpaquete.append("01");
						subpaquete.append("03");
						subpaquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+o)).replace(' ', '0'));						
						subpaquete.append(String.format("%8s","0").replace(' ','0'));
						c++;
					}
				}
		
		
			//Cantidad de Servicios.

		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+c)).replace(' ','0'));
		}
//		System.out.println("///"+c);
		//Todos los subpaquetes
		paquete.append(subpaquete);
		
		System.out.println("Fin de Creacion Comando 702-"+paquete);
		
		
 	return paquete;	
	}
	
	/***
	 * 713 Anterior - Se va a separar el comando este queda como respaldo
	 */
	public StringBuilder ComandoDAC713() throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException
	{
		
		System.out.println("Inicio de Creacion Comando 713");
		
		String msg = "";
		String bit = "";
		String requestType = "1";  // CREAR UN DECODIFICADOR DIGITAL
		
		/** IDENTIFIER COMPONENT **/
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(parametros.getValue("bsiciudad").toString())).replace(' ', '0'));
		//request_type 1Add-2Change-3Delete		
		paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(requestType)).replace(' ', '0'));
		//Serial_Number
		paquete.append(Conversiones.AsciiToHexadecimal(parametros.cmd.getDetalle().getTVpagada().getSerie()));
		
		/** TYPE COMPONENT **/
		msg = "1";
		paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(msg)).replace(' ', '0'));		
		//Bit_Mask	
		bit = "7";
		paquete.append(String.format("%8s",bit).replace(' ', '0'));
		//Unit_Address
		paquete.append(Conversiones.AsciiToHexadecimal(parametros.cmd.getDetalle().getTVpagada().getIdConvertidor()));
		//Equip_Type
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getTipoD())).replace(' ','0'));
		//Equip_Sub_Type
		paquete.append(String.format("%4s", Conversiones.DecimalToHexadecimal("2")).replace(' ', '0'));			
		
		
		/** PLANT COMPONENT**/
		
		
		msg = "2";
		paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(msg)).replace(' ', '0'));		
		//Bit_Mask
		//bit = "3F";
		//bit = "27";
		if (parametros.cmd.getCabecera().getIDEmpresa() == 99)
		{
			bit = "9";
		}else
		{
			bit = "27";
		}
		
		
		
		
		//bit = "22";
		paquete.append(String.format("%8s",bit).replace(' ', '0'));		
/*		//HeadEnd_Handle
		paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+parametros.getValue("headend"))).replace(' ', '0'));
		//Upstream_Plant_Handle
		paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+parametros.getValue("up"))).replace(' ', '0'));
		//Downstream_Plant_Handle
		paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+parametros.getValue("down"))).replace(' ', '0'));
*/
		
      //HeadEnd_Handle
      paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(new TvpParametrosDAO().findById(parametros.cmd.getCabecera().getIDEmpresa()).getHeadend().toString())).replace(' ', '0'));              
      //Upstream_Plant_Handle
      paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(new TvpParametrosDAO().findById(parametros.cmd.getCabecera().getIDEmpresa()).getUp().toString())).replace(' ', '0'));
      //Downstream_Plant_Handle
      paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(new TvpParametrosDAO().findById(parametros.cmd.getCabecera().getIDEmpresa()).getDown().toString())).replace(' ', '0'));              
    
		
		//Reserved1
		paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal("0")).replace(' ', '0'));
		//Reserved2
		paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal("0")).replace(' ', '0'));
		//VCM_Handle
		//paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(parametros.getValue("vcm").toString())).replace(' ', '0'));
		vcm = new TvpParametrosDAO().findById(parametros.cmd.getCabecera().getIDEmpresa()).getVcm();
        paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+vcm)).replace(' ', '0'));
		
		/** STATE COMPONENT **/
		
		
		//Msg_SUbType	value=3
		msg = "03";
		bit = "3";
		//paquete.append(msg);		
		paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(msg)).replace(' ', '0'));
		//Bit_Mask
		paquete.append(String.format("%8s",bit).replace(' ', '0'));
		//On_Plant_Flag, si es un equipo nuevo va siempre uno.
		paquete.append(String.format("%2s", "1").replace(' ', '0'));
		//Operation_Code
		int operationCode = parametros.cmd.getDetalle().getTVpagada().getAccion();
		paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(""+operationCode)).replace(' ','0'));
		
		
		/** FEATURE COMPONENT **/
		msg = "4";
		int credito = 0; int compra=0; int max=0;
		int zona = 2;int pais = 0;int canal = 3; int Vcon = 1; int Vcoff = 1;
		
		paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(msg)).replace(' ', '0'));		
		//Bit_Mask
		bit = "330";
		paquete.append(String.format("%8s",bit).replace(' ', '0'));	
		//credito
		paquete.append(String.format("%8s",""+credito).replace(' ', '0'));
		//compra
		paquete.append(String.format("%8s",""+compra).replace(' ', '0'));
		//Max
		paquete.append(String.format("%4s",""+max).replace(' ', '0'));
		//Zona
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+zona)).replace(' ', '0'));
		//pais
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+pais)).replace(' ', '0'));
		//region
//		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+parametros.getValue("region"))).replace(' ', '0'));
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(new TvpParametrosDAO().findById(parametros.cmd.getCabecera().getIDEmpresa()).getRegion().toString())).replace(' ', '0'));		
		//Vcon
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+Vcon)).replace(' ', '0'));
		//Vcoff
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+Vcoff)).replace(' ', '0'));
		//Canal
		paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(""+canal)).replace(' ', '0'));
		//Feature
		String feature = "1F7F";
		paquete.append(String.format("%8s",feature).replace(' ', '0'));

		System.out.println("Fin de Creacion Comando 713-"+paquete);
		
	return paquete;		
	}
	/***
	 *  713 Nuevo - Se separo el comando para solventar problemas en el controlador
	 * @return 
	 * @throws IllegalArgumentException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 */
	public StringBuilder ComandoDAC713_OLD() throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException
	{
		
		System.out.println("Inicio de Creacion Comando 713");
		
		String msg = "";
		String bit = "";
		String requestType = "1";  // CREAR UN DECODIFICADOR DIGITAL
		
		/** IDENTIFIER COMPONENT **/
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(parametros.getValue("bsiciudad").toString())).replace(' ', '0'));
		//request_type 1Add-2Change-3Delete		
		paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(requestType)).replace(' ', '0'));
		//Serial_Number
		paquete.append(Conversiones.AsciiToHexadecimal(parametros.cmd.getDetalle().getTVpagada().getSerie()));
		
		
		/** TYPE COMPONENT **/
		
		msg = "1";
		paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(msg)).replace(' ', '0'));		
		//Bit_Mask	
		bit = "7";
		paquete.append(String.format("%8s",bit).replace(' ', '0'));
		//Unit_Address
		paquete.append(Conversiones.AsciiToHexadecimal(parametros.cmd.getDetalle().getTVpagada().getIdConvertidor()));
		//Equip_Type
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getTipoD())).replace(' ','0'));
		//Equip_Sub_Type
		paquete.append(String.format("%4s", Conversiones.DecimalToHexadecimal("2")).replace(' ', '0'));			
		
		
		
		/** PLANT COMPONENT**/
			
		/*
		msg = "2";
		paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(msg)).replace(' ', '0'));		
		//Bit_Mask
		//bit = "3F";
		bit = "9";
		//bit = "22";
		paquete.append(String.format("%8s",bit).replace(' ', '0'));		
		//HeadEnd_Handle
		paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+parametros.getValue("headend"))).replace(' ', '0'));
		//Upstream_Plant_Handle
		paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+parametros.getValue("up"))).replace(' ', '0'));
		//Downstream_Plant_Handle
		paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+parametros.getValue("down"))).replace(' ', '0'));
		//Reserved1
		paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal("0")).replace(' ', '0'));
		//Reserved2
		paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal("0")).replace(' ', '0'));
		//VCM_Handle
		paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(parametros.getValue("vcm").toString())).replace(' ', '0'));
			
		*/
		
		/** STATE COMPONENT **/
		/*
		
		//Msg_SUbType	value=3
		msg = "03";
		bit = "3";
		//paquete.append(msg);		
		paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(msg)).replace(' ', '0'));
		//Bit_Mask
		paquete.append(String.format("%8s",bit).replace(' ', '0'));
		//On_Plant_Flag, si es un equipo nuevo va siempre uno.
		paquete.append(String.format("%2s", "1").replace(' ', '0'));
		//Operation_Code
		int operationCode = parametros.cmd.getDetalle().getTVpagada().getAccion();
		paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(""+operationCode)).replace(' ','0'));
		*/
		


		System.out.println("Fin de Creacion Comando 713-"+paquete);
		
	return paquete;		
	}
	
	
	public StringBuilder ComandoDAC660() throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException, Excepciones
	{
		String tipoc = "";
		
		bsi = String.format("%4s",Conversiones.DecimalToHexadecimal(parametros.getValue("bsiciudad").toString())).replace(' ', '0');
		head = String.format("%4s","0").replace(' ','0');
		tipo = String.format("%4s",Conversiones.DecimalToHexadecimal(parametros.getValue("equiptype").toString())).replace(' ', '0');
		subtipo = String.format("%4s","0").replace(' ','0');
		serie = Conversiones.AsciiToHexadecimal(parametros.cmd.getDetalle().getTVpagada().getSerie());
		String unitaddress = Conversiones.AsciiToHexadecimal(parametros.cmd.getDetalle().getTVpagada().getIdConvertidor());
		String initflag = String.format("%2s","0").replace(' ','0');
		/*int servicio = parametros.cmd.getDetalle().getTVpagada().getIdServicio();
		int[] pay = null;
		int c=0;
		
		parametros.VerificarCodigoExtra(servicio, pay);
		subpaquete.append("01");
		subpaquete.append("01");
		subpaquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+servicio)).replace(' ', '0'));
		subpaquete.append(String.format("%8s","0").replace(' ','0'));
		c++;
		
	    Integer newservicio[] = (Integer[])parametros.getValue("servicioadi");
	    */
		
	    //ArrayList<Integer> newpaquete = (ArrayList<Integer>)parametros.getValue("paqueteadi");
		/*
	    for (int o: newservicio) 
		{
			subpaquete.append("01");
			subpaquete.append("02");
			subpaquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+o)).replace(' ', '0'));
			subpaquete.append(String.format("%8s","0").replace(' ','0'));
			c++;
		}
		*/
	    /*
		for (int o: newpaquete) 
		{
			if (o!= 0)
			{
				System.out.println("Entro newpaquete o" + o);
				subpaquete.append("01");
				subpaquete.append("01");
				subpaquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+o)).replace(' ', '0'));
				subpaquete.append(String.format("%8s","0").replace(' ','0'));
				c++;
			}
		}*/
		paquete.append(bsi);
		paquete.append(head);
		paquete.append(tipo);
		paquete.append(subtipo);
		paquete.append(serie);
		paquete.append(unitaddress);
		paquete.append(initflag);
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+1)).replace(' ','0'));
//		paquete.append(String.format("%3s",""+1).replace(' ','0'));
//		paquete.append(String.format("%6s",""+0).replace(' ','0'));
//		paquete.append(String.format("%24s",Conversiones.DecimalToHexadecimal(""+81011)).replace(' ','0'));
        paquete.append("1");
        parametros.SetearServicio(parametros);
		int servicio = Integer.valueOf(parametros.getValue("idServicio").toString());	
		//paquete.append(String.format("%7s",Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getIdServicio())).replace(' ','0'));
		paquete.append(String.format("%7s",Conversiones.DecimalToHexadecimal(""+servicio)).replace(' ','0'));
		//paquete.append("01000186A4");
		/*		
		paquete.append("01");
		paquete.append("01");
		paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+81011)).replace(' ', '0'));
		paquete.append(String.format("%8s","0").replace(' ','0'));
		*/	
		System.out.println("paquete"+paquete);
		
		
		return paquete;
	}



	public StringBuilder ComandoDAC720() {
		// TODO Auto-generated method stub
		return null;
	}



	public StringBuilder ComandoDAC722() {
		// TODO Auto-generated method stub
		return null;
	}


/***
 * Comando para ejecucion de auditoria - Primero Consulta y luego inmediatamente
 * en ObtenerCadena compara el status que posee el equipo en Titan vs Controlador
 * Atencion 1 hora de trabajo en total
 * @return
 */
	public StringBuilder ComandoDAC801() {
		// TODO Auto-generated method stub
		//TvpOrdenacc ordenacc = new TvpOrdenacc();
		
		paquete.append("00000000433443313333303338384335001E");
		return paquete;
	}
	
	public StringBuilder ComandoDAC805() throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException, Excepciones, UnsupportedEncodingException 
	{
		
		
		paquete.append("00000000433443313333303338384335001E");
		return paquete;
	}	
	
	
	public StringBuilder ComandoDAC806() throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException, Excepciones, UnsupportedEncodingException
	{
		System.out.println("Inicio de Creacion Comando 702 holaaaaa");
		
		String msg = "";
		String bit = "";
		String requestType = "2";
		
	
			int ubicacion = parametros.cmd.getDetalle().getTVpagada().getUbicacion();

			/** IDENTIFIER COMPONENT **/
			//bsi = 
			paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(parametros.getValue("bsiciudad").toString())).replace(' ', '0'));
			//request_type 1Add-2Change-3Delete		
			paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(requestType)).replace(' ', '0'));
			//Serial_Number
			parametros.SetearSerie(parametros.cmd.getDetalle().getTVpagada().getSerie());
			String serie = parametros.getValue("Serie").toString();
			System.out.println("ahora"+serie);
//			paquete.append(Conversiones.AsciiToHexadecimal(parametros.cmd.getDetalle().getTVpagada().getSerie()));
			paquete.append(Conversiones.AsciiToHexadecimal(serie));

			/** PLANT COMPONENT**/
			
			//Msg_SUbType	value=2
			msg = "2";
			paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(msg)).replace(' ', '0'));		
			//Bit_Mask
			bit = "20";
			paquete.append(String.format("%8s",bit).replace(' ', '0'));		
			//HeadEnd_Handle
			paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+parametros.getValue("headend"))).replace(' ', '0'));
			//Upstream_Plant_Handle
			paquete.append(String.format("%8s",
			Conversiones.DecimalToHexadecimal(""+parametros.getValue("up"))).replace(' ', '0'));
			//Downstream_Plant_Handle
			paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+parametros.getValue("down"))).replace(' ', '0'));
			//Reserved1
			paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal("0")).replace(' ', '0'));
			//Reserved2
			paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal("0")).replace(' ', '0'));
			//VCM_Handle
			System.out.println(parametros.getValue("vcm").toString());

			Mora  = parametros.cmd.getDetalle().getTVpagada().getDatoC1();
			//Mora  = "0";
			boolean mora = false;
			if (Mora.equals("1"))
			{
				if (parametros.cmd.getCabecera().getIDEmpresa()==63)
				{
					vcm= 43;
				}
				else if (parametros.cmd.getCabecera().getIDEmpresa()==94)
				{
					vcm = 42;
				}
				mora  = true;
				operationCode = 6;		
			}
			else
			{
				operationCode = parametros.cmd.getDetalle().getTVpagada().getAccion();
				vcm = Integer.valueOf(parametros.getValue("vcm").toString());
			}
			System.out.println("VCM"+vcm+"-OpCode"+operationCode);
			
			//paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(parametros.getValue("vcm").toString())).replace(' ', '0'));
			paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+vcm)).replace(' ', '0'));
			
			
			/** STATE COMPONENT **/
			//Msg_SUbType	value=3
			msg = "03";
			bit = "3";
			//paquete.append(msg);		
			paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(msg)).replace(' ', '0'));
			//Bit_Mask
			paquete.append(String.format("%8s",bit).replace(' ', '0'));
		    //On_Plant_Flag, si la ubicacion es no instalado entonces va Off plant (0)

			//Operation_Code
			
			
			if (operationCode == 5)//23
			{
				paquete.append(String.format("%2s", "0").replace(' ', '0'));
			}
			else
			{
				paquete.append(String.format("%2s", "1").replace(' ', '0'));
			}
			
			paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(""+operationCode)).replace(' ','0'));
			

			/** FEATURE COMPONENT**/
			
			//Msg_SUbType	value=2
			String estado = parametros.cmd.getDetalle().getTVpagada().getEstadoC();
			String tipoippv = parametros.getValue("ippv").toString();
			int compra;
			bit = "6C7";
			
			msg = "4";
			paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal("4")).replace(' ', '0'));	
			paquete.append(String.format("%8s",bit).replace(' ', '0'));		
			cCredito = 50;//parametros.cmd.getDetalle().getTVpagada().getCredito();
			//**********************************************************
			// calcular el credito de la caja cuando es por primera vez.
			//**********************************************************
			//credito = parametros.CalculaCredito(idServicio, fPago, cCredito, datoC1);

			System.out.println("Credito"+cCredito);
			if (cCredito != 0)
			{
			 compra = cCredito/5;
			}
			else
			{
			  compra = 0;
			}
			
			// Credit_Alloewd
			paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+cCredito)).replace(' ','0'));			
			// Purchased_Alloewd
			paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+compra)).replace(' ','0'));
			//MAX_Pack_Cost
			//paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal("10")).replace(' ', '0'));
			paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal("5")).replace(' ', '0'));
			// **************************************************
			String zone = "2"; String pais = "0"; String moneda = "1";; String canal = "3";
			//TimeZoneHandle
			paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(zone)).replace(' ', '0'));
			//EPG_Region
			paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+parametros.getValue("region"))).replace(' ', '0'));			
			//Country_Code
			paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal("1")).replace(' ','0'));
			//TurnOn_VC
			String turnOn = "200";	
			paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(turnOn)).replace(' ','0'));
			//TurnOff_VC
			paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal("0")).replace(' ','0'));
			//Output_Channel_#
			paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(canal)).replace(' ','0'));
			
			//Feature_Setting, configurado deacuerdo al tipodeco.
			String feature = "";
			if (estado == "M" || cCredito == 0 || tipoippv == "N") 
			{
				feature = "FBF";
			}
			else
			{
		   		feature = "1FBF";
			}
		    
			paquete.append(String.format("%8s",feature).replace(' ', '0'));
			
			
			
			
			System.out.println("paquete"+paquete);
			
			return paquete;
		
	}

	public StringBuilder ComandoDAC807() throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException, Excepciones, UnsupportedEncodingException
	{
		System.out.println("Inicio de Creacion Comando 702 Restitucion de Cupos y activacion IPPV Feature");
		
		String msg = "";
		String bit = "";
		String requestType = "2";
		
	
			int ubicacion = parametros.cmd.getDetalle().getTVpagada().getUbicacion();

			/** IDENTIFIER COMPONENT **/
			//bsi = 
			paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(parametros.getValue("bsiciudad").toString())).replace(' ', '0'));
			//request_type 1Add-2Change-3Delete		
			paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(requestType)).replace(' ', '0'));
			//Serial_Number
			parametros.SetearSerie(parametros.cmd.getDetalle().getTVpagada().getSerie());
			String serie = parametros.getValue("Serie").toString();
			System.out.println("ahora"+serie);
//			paquete.append(Conversiones.AsciiToHexadecimal(parametros.cmd.getDetalle().getTVpagada().getSerie()));
			paquete.append(Conversiones.AsciiToHexadecimal(serie));

			/** PLANT COMPONENT**/
			
			//Msg_SUbType	value=2
			msg = "2";
			paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(msg)).replace(' ', '0'));		
			//Bit_Mask
			bit = "20";
			paquete.append(String.format("%8s",bit).replace(' ', '0'));		
			//HeadEnd_Handle
			paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+parametros.getValue("headend"))).replace(' ', '0'));
			//Upstream_Plant_Handle
			paquete.append(String.format("%8s",
			Conversiones.DecimalToHexadecimal(""+parametros.getValue("up"))).replace(' ', '0'));
			//Downstream_Plant_Handle
			paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+parametros.getValue("down"))).replace(' ', '0'));
			//Reserved1
			paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal("0")).replace(' ', '0'));
			//Reserved2
			paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal("0")).replace(' ', '0'));
			//VCM_Handle
			System.out.println(parametros.getValue("vcm").toString());

			Mora  = parametros.cmd.getDetalle().getTVpagada().getDatoC1();
			//Mora  = "0";
			boolean mora = false;
			if (Mora.equals("1"))
			{
				if (parametros.cmd.getCabecera().getIDEmpresa()==63)
				{
					vcm= 43;
				}
				else if (parametros.cmd.getCabecera().getIDEmpresa()==94)
				{
					vcm = 42;
				}
				mora  = true;
				operationCode = 6;		
			}
			else
			{
				operationCode = parametros.cmd.getDetalle().getTVpagada().getAccion();
				vcm = Integer.valueOf(parametros.getValue("vcm").toString());
			}
			System.out.println("VCM"+vcm+"-OpCode"+operationCode);
			
			//paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(parametros.getValue("vcm").toString())).replace(' ', '0'));
			paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+vcm)).replace(' ', '0'));
			
			
			/** STATE COMPONENT **/
			//Msg_SUbType	value=3
			msg = "03";
			bit = "3";
			//paquete.append(msg);		
			paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(msg)).replace(' ', '0'));
			//Bit_Mask
			paquete.append(String.format("%8s",bit).replace(' ', '0'));
		    //On_Plant_Flag, si la ubicacion es no instalado entonces va Off plant (0)

			//Operation_Code
			
			
			if (operationCode == 5)//23
			{
				paquete.append(String.format("%2s", "0").replace(' ', '0'));
			}
			else
			{
				paquete.append(String.format("%2s", "1").replace(' ', '0'));
			}
			
			paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(""+operationCode)).replace(' ','0'));
			

			/** FEATURE COMPONENT**/
			
			//Msg_SUbType	value=2
			String estado = parametros.cmd.getDetalle().getTVpagada().getEstadoC();
			String tipoippv = parametros.getValue("ippv").toString();
			int compra;
			bit = "6C7";
			
			msg = "4";
			paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal("4")).replace(' ', '0'));	
			paquete.append(String.format("%8s",bit).replace(' ', '0'));		
			cCredito = 50;//parametros.cmd.getDetalle().getTVpagada().getCredito();
			//**********************************************************
			// calcular el credito de la caja cuando es por primera vez.
			//**********************************************************
			//credito = parametros.CalculaCredito(idServicio, fPago, cCredito, datoC1);

			System.out.println("Credito"+cCredito);
			if (cCredito != 0)
			{
			 compra = cCredito/5;
			}
			else
			{
			  compra = 0;
			}
			
			// Credit_Alloewd
			paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+cCredito)).replace(' ','0'));			
			// Purchased_Alloewd
			paquete.append(String.format("%8s",Conversiones.DecimalToHexadecimal(""+compra)).replace(' ','0'));
			//MAX_Pack_Cost
			//paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal("10")).replace(' ', '0'));
			paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal("5")).replace(' ', '0'));
			// **************************************************
			String zone = "2"; String pais = "0"; String moneda = "1";; String canal = "3";
			//TimeZoneHandle
			paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(zone)).replace(' ', '0'));
			//EPG_Region
			paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+parametros.getValue("region"))).replace(' ', '0'));			
			//Country_Code
			paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal("1")).replace(' ','0'));
			//TurnOn_VC
			String turnOn = "200";	
			paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(turnOn)).replace(' ','0'));
			//TurnOff_VC
			paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal("0")).replace(' ','0'));
			//Output_Channel_#
			paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(canal)).replace(' ','0'));
			
			//Feature_Setting, configurado deacuerdo al tipodeco.
			String feature = "";
			/*if (estado == "M" || cCredito == 0 || tipoippv == "N") 
			{
				feature = "FBF";
			}
			else
			{*/
		   		feature = "1FBF";
			//}
		    System.out.println(feature);
			paquete.append(String.format("%8s",feature).replace(' ', '0'));
			
			
			
			
			System.out.println("paquete"+paquete);
			
			return paquete;
		
	}
	
	
	
}