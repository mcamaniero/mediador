 package com.app.tvp;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.app.dao.EntityManagerHelper;
import com.app.tv.tvp_admsessions.dao.AdmSessionsDAO;
import com.app.tv.tvp_channelmap.dao.TvpChannelmap;
import com.app.tv.tvp_channelmap.dao.TvpChannelmapDAO;
import com.app.tv.tvp_consultatv.dao.TvpConsultatv;
import com.app.tv.tvp_consultatv.dao.TvpConsultatvDAO;
import com.app.tv.tvp_consultatvfinish.dao.TvpConsultatvfinish;
import com.app.tv.tvp_consultatvfinish.dao.TvpConsultatvfinishDAO;
import com.app.tv.tvp_equicomandos.dao.TvpEquicomandos;
import com.app.tv.tvp_equicomandos.dao.TvpEquicomandosDAO;
import com.app.tv.tvp_equivalencias.dao.TvpEquivalencias;
import com.app.tv.tvp_equivalencias.dao.TvpEquivalenciasDAO;
import com.app.tv.tvp_ordenacc.dao.TvpOrdenacc;
import com.app.tv.tvp_ordenacc.dao.TvpOrdenaccDAO;

import ec.com.grupotvcable.wsdltvpagada.Cabecera;
import ec.com.grupotvcable.wsdltvpagada.IdEvento;
import ec.com.grupotvcable.wsdltvpagada.IdPaquete;
import ec.com.grupotvcable.wsdltvpagada.IdPaquetes;
import ec.com.grupotvcable.wsdltvpagada.NumPaq;
import ec.com.grupotvcable.wsdltvpagada.Respuesta;
import tvcable.app.comarch.utils.Conversiones;
import tvcable.app.comarch.utils.Paquete;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


/**
 * @author rortiz
 *
 */
public class ComandosACC {
	
	private ParametrosTV parametros;
	private StringBuilder paquete = new StringBuilder();
	private StringBuilder converterId = new StringBuilder();
	private StringBuilder EncodedServiceNumber = new StringBuilder();
	private StringBuilder EncodeServicePackage = new StringBuilder();

	
	private int entriesToFollow;
	private String serviceNumber;
	private int intPaquetes=0;
	private int intEventos;
	private int intServicios;
	private int encodedServiceToFollow;
	private List<IdPaquete> lstpaquete = null;
	private List<IdEvento> lstevento = null ;
	private int ciudad;
	private int accion;
	private String StatusWord1;
	private String ChannelMap;
	private int tipoa;
	
	private ComandosTVP comandosTvp = new ComandosTVP();
	private Respuesta respuesta ;	
	private String tamanio;
	private String comando;
	private Integer maxId;
	private int limite;
	private String Activo;
	private String estadoDeco;
	private Object sessionid;
	private int numeropaquete;
	private Integer sessionId;
	
	private Date fecha = null ;
	private String datetime;
	private Integer sessionReportType;
	private Cabecera cabecera = new Cabecera();

    private int tipoPromocion;
    private IdPaquetes idpaquetes = new IdPaquetes();
    private IdPaquete paq = new IdPaquete();
    private IdPaquete paq2 = new IdPaquete();
    private IdPaquete paq3 = new IdPaquete();
    private int sizereal;
    private int[] pays;
    private int lstpaquetesize;

	
	
	/**
	 * @param parametro
	 */
	public ComandosACC(ParametrosTV parametro){
		parametros = parametro;
	}

	/**
	 * @return StringBuilder paquete
	 */
	/**
	 * 
	 * Comando Para Realizar Activacion y Refresh 
	 * 
	 * @return
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 * @throws SecurityException 
	 * @throws IllegalArgumentException 
	 * @throws Excepciones 
	 */
	
	public StringBuilder Comando262() throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException, Excepciones
	{
		System.out.println("Inicio del Comando262");
		//"262"
		ciudad = parametros.cmd.getCabecera().getIDEmpresa();
		
		//ConverterID
		parametros.SetearIdConvertidor(parametros.cmd.getDetalle().getTVpagada().getIdConvertidor());
		converterId.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+Integer.valueOf(parametros.getValue("idConvertidor").toString())/8)).replace(' ', '0'));
		System.out.println("Parte1"+String.format("%4s",Conversiones.DecimalToHexadecimal(""+Integer.valueOf(parametros.getValue("idConvertidor").toString())/8)).replace(' ', '0'));
	    converterId.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+Integer.valueOf(parametros.getValue("idConvertidor").toString())%8)).replace(' ', '0'));
	    System.out.println("Parte2"+String.format("%4s",Conversiones.DecimalToHexadecimal(""+Integer.valueOf(parametros.getValue("idConvertidor").toString())%8)).replace(' ', '0'));
	    paquete.append(converterId.toString());

	    //SerialNumber 		= ;
		paquete.append(Conversiones.AsciiToHexadecimal(parametros.cmd.getDetalle().getTVpagada().getSerie()));

		//ConverterType 
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getTipoD())).replace(' ','0'));
		
		//Valores seteados por defecto DEPENDIENDO DE ALGUNOS FACTORES.
		String FieldStatusWord1 = "0C04";//FieldStatusWord1 0001101000010100   0010000000100000
		paquete.append(FieldStatusWord1);
   
		//Valores seteados por defecto
		String FieldStatusWord2 = "0";//FieldStatusWord2 0001101000010000   0010000000100000								   
		paquete.append(String.format("%4s",FieldStatusWord2).replace(' ', '0'));
		
		//PhoneIndex = ;
		paquete.append(String.format("%4s", "0").replace(' ','0'));
		
		//HubNumber  = ;
		paquete.append(String.format("%4s", "0").replace(' ','0'));
		
		//Master/Slave Type =;
		paquete.append(String.format("%4s", "0").replace(' ','0'));		
		
		//Master/Slave Key  =;
		paquete.append(String.format("%8s", "0").replace(' ','0'));		
		
		//Alternate International
		paquete.append(String.format("%4s", "0").replace(' ','0'));
		
		//Account Number 24
		int cuenta = parametros.cmd.getDetalle().getTVpagada().getIdAccount();
		String cuenta1 = String.format("%12s", cuenta).replace(' ', '0');
		paquete.append(Conversiones.AsciiToHexadecimal(cuenta1));
		
		//TelephoneNumber = "0";//FSW1 20
		paquete.append(String.format("%20s","0").replace(' ', '0'));
		
  
//		 * Valores seteados por defecto, dependiendo de otros valores.

		//StatusWord1

	 	//String StatusWord1 = "0009";
//	 	String StatusWord1 = "0409";
	 	
		accion = parametros.cmd.getDetalle().getTVpagada().getAccion();
		tipoa = parametros.cmd.getDetalle().getTVpagada().getTipoD();

		if (ciudad != 65)
		{
			if (accion > 0 )
			{
				if (accion != 5)
				{
					StatusWord1 = "0409";
				}
				else
				{
					StatusWord1 = "0008";
				}
			}
			else
			{
				throw new Excepciones(12);
			}
		}
		else
		{
			if (accion == 5)
			{
				StatusWord1 = "2008";
			}
			else
			{
				if (tipoa != 500003)
				{
					StatusWord1 = "0009";//con 0009 no cambia servicio
				}
				else
				{	
					StatusWord1 = "0409";
				}
			}
		}
		
	 	paquete.append(StatusWord1);

		//PurchaseLimit FSW1 Bit 5		
		paquete.append(String.format("%4s", "0").replace(' ','0'));
		
		//TimeoutLimit //FSW1
		paquete.append(String.format("%4s", "0").replace(' ', '0'));
		
		//EmergencyAlertMask//FSW1
		paquete.append(String.format("%4s", "0").replace(' ','0'));		
		
		//TuningType
		paquete.append(String.format("%4s", "0").replace(' ','0'));		
		
		String TimeZone 	= "0";/// Revisar con Wendy
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(TimeZone)).replace(' ','0'));	
		
		//ConverterStatus OJO
		
		StringBuilder ConverterStatus = new StringBuilder();
		//ConverterStatus.append(String.format("%2s",Conversiones.AsciiToHexadecimal("B")).replace(' ', '0'));
		//ConverterStatus.append(String.format("%2s",Conversiones.DecimalToHexadecimal("0")).replace(' ', '0'));
		if (parametros.cmd.getDetalle().getTVpagada().getTipoA()!= 500007 && parametros.cmd.getDetalle().getTVpagada().getTipoA()!= 500003)
		{
			ConverterStatus.append("434C");
		}
		else
		{
			ConverterStatus.append("4C41");
		}
		
		paquete.append(ConverterStatus.toString());
		
		parametros.SetearServicio(parametros);
		int servicio = Integer.valueOf(parametros.getValue("idServicio").toString());

	    if (parametros.cmd.getDetalle().getTVpagada().getIdServicio()!=0)
	    {
	    	intServicios =1;
	    }

	    /***********************************************/
	    
        tipoPromocion = parametros.cmd.getDetalle().getTVpagada().getTipoPromocion();
        int promocion = parametros.SetearPromocionACC(parametros,tipoPromocion);
        
        if (tipoPromocion > 0 && promocion !=0)
        {
        	
               if (parametros.cmd.getDetalle().getTVpagada().getIdPaquetes()  != null)
               {           
                            lstpaquete = parametros.cmd.getDetalle().getTVpagada().getIdPaquetes().getIdPaquete();
                            //lstpaquetesize = parametros.cmd.getDetalle().getTVpagada().getIdPaquetes().getIdPaquete().size()/2;
                            lstpaquetesize = parametros.cmd.getDetalle().getTVpagada().getIdPaquetes().getIdPaquete().size();
               }else
               {
                     
                     lstpaquetesize = 0;
               }


		        if (lstpaquetesize>0)
		        {
		                sizereal = lstpaquetesize +1;
		                pays = new int[sizereal];
		              for (int i=0;i<lstpaquete.size();i++)//desde Titan               
		              //for (int i=0;i<lstpaquete.size()/2;i++)//desde SP
		                   {    
		                        if (lstpaquete.get(i).getIdPaquete()>0)
		                        {
		                              pays[i]=lstpaquete.get(i).getIdPaquete();
		                        }
		                   }
		
		
		              pays[sizereal-1]= promocion;
		              
		            switch(lstpaquetesize)
		            {
		                  case 1:
		                             idpaquetes.setCantP(2);
		                             lstpaquete = idpaquetes.getIdPaquete();
		                             
		                             paq.setIdPaquete(pays[0]);
		                             lstpaquete.add(paq);                     
		
		                             paq2.setIdPaquete(pays[1]);
		                             lstpaquete.add(paq2);
		                             
		                             idpaquetes.getIdPaquete().addAll(lstpaquete);
		                        break;
		                        
		                  case 2:
		
		                             idpaquetes.setCantP(3);
		                             lstpaquete = idpaquetes.getIdPaquete();
		                             
		                             paq.setIdPaquete(pays[0]);
		                             lstpaquete.add(paq);
		                             
		                             paq2.setIdPaquete(pays[1]);
		                             lstpaquete.add(paq2);
		                             
		                             paq3.setIdPaquete(pays[2]);
		                             lstpaquete.add(paq3);                                
		                             
		                             idpaquetes.getIdPaquete().addAll(lstpaquete);
		                             
		                        break;
		            }
		        }
		        else
		        {
		                        pays = new int[1];
		                        pays[0]= promocion;                
		                             idpaquetes.setCantP(1);
		                             lstpaquete = idpaquetes.getIdPaquete();
		                             
		                             paq.setIdPaquete(pays[0]);//200010 //880154 //880156
		                             lstpaquete.add(paq);
		                             
		                             idpaquetes.getIdPaquete().addAll(lstpaquete);
		            
		        }
		        parametros.cmd.getDetalle().getTVpagada().setIdPaquetes(idpaquetes);
        }
        

	    
	    /***********************************************/
	    
	    if (parametros.cmd.getDetalle().getTVpagada().getIdPaquetes() != null)
	    {
	    	lstpaquete = parametros.cmd.getDetalle().getTVpagada().getIdPaquetes().getIdPaquete();

	    	intPaquetes = parametros.contarPaquete(lstpaquete,parametros);
	    	if (ciudad ==96)
	    	{
	    		parametros.Paychannelsmap(parametros);
	    	}
	    }
	    else
	    {
	    	intPaquetes = 0;
	    }
	    
	    if (parametros.cmd.getDetalle().getTVpagada().getTipoA()!= 500003)
	    {
		    if (parametros.cmd.getDetalle().getTVpagada().getIdEventos() != null)
		    {
		    	lstevento  = parametros.cmd.getDetalle().getTVpagada().getIdEventos().getIdEvento();
			    intEventos = lstevento.size();
			    
		          if (lstevento.get(0).getIdEvento()==0)
		          {
		        	  intEventos=0;
		          }			    
		    }
		    else
		    {
		    	intEventos = 0;
		    }
	    }
		
	    
	  //ChannelMap = "1";//Se envia el codigo del channel map
		switch(ciudad)
		{
		case 65:
			ChannelMap = "1";
		break;
		
		case 63:
			ChannelMap = "11";
		break;
		
		case 94:
			ChannelMap = "11";
		break;
		
		case 96:
			ChannelMap = parametros.ChannelMapCiudad(parametros);
			//ChannelMap = "1";			
		break;
		
		}
		  
		
		paquete.append(String.format("%4s", Conversiones.DecimalToHexadecimal(ChannelMap)).replace(' ','0'));
		
		//Con esto seteamos el output channel sera el 3 o 4 
		String OutputChannel3 = "0";
	    paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(OutputChannel3)).replace(' ', '0'));

	    //Output Frequency Map
	    paquete.append(String.format("%2s", "0").replace(' ','0'));	    
		
	    //Aux 12V Option
	    paquete.append(String.format("%2s", "0").replace(' ','0'));
		
	    //Amplifier
	      paquete.append(String.format("%12s", "0").replace(' ', '0'));
	    
	    //Encoded Services To Follow
	    // es de acuerdo a la cantidad de: Servicios, paquetes y eventos que se envien.

	    encodedServiceToFollow = intServicios + intPaquetes + intEventos;

	    paquete.append(String.format("%4s", ""+encodedServiceToFollow).replace(' ','0'));
	    
	    EncodedServiceNumber.append("00");
		//Bit 13 : Activado o Desactivado
		if (parametros.cmd.getDetalle().getTVpagada().getAccion()==5)
		{
			EncodedServiceNumber.append("0");
		} 
		else 
		{
			EncodedServiceNumber.append("1");
		}
		//Bit 00 al 12 : ServiceNumber
		
		EncodedServiceNumber.append(String.format("%13s",Conversiones.DecimalToBinario(""+servicio)).replace(' ','0'));
		paquete.append(String.format("%4s",Conversiones.BinarioToHexadecimal(EncodedServiceNumber.toString())).replace(' ', '0'));
		
		if (intPaquetes >0)
        {
	        //for (int i=0;i<lstpaquete.size()/2;i++) //desde SP
	        for (int i=0;i<lstpaquete.size();i++) //desde Titan
	        {	
	        	if (lstpaquete.get(i).getIdPaquete()>0)
	        	{        		
        		/*
	        		EncodeServicePackage.delete(0, 15);
		        	

		        	//Bit 14-15 : estan abiertos, valor por default 0
		        	EncodeServicePackage.append("00");
		    		//Bit 13 : Activado o Desactivado
		    		if (parametros.cmd.getDetalle().getTVpagada().getAccion()==5)
		    		{
		    			EncodeServicePackage.append("0");
		    		} 
		    		else
		    		{
		    			EncodeServicePackage.append("1");
		    		}*/
		    		//Bit 00 al 12 : ServiceNumber
		    		parametros.SetearPaqueteSP(parametros,lstpaquete.get(i).getIdPaquete());
		    		ArrayList<Integer> newpaquete = (ArrayList<Integer>)parametros.getValue("paqueteadi");
					for (int o: newpaquete) 
					{
						//EncodeServicePackage.append(String.format("%13s",Conversiones.DecimalToBinario(""+parametros.getValue("idPaquete").toString())).replace(' ','0'));
						
						//EncodeServicePackage.delete(0, 15);
						EncodeServicePackage.delete(0, EncodeServicePackage.length());
			        	//Bit 14-15 : estan abiertos, valor por default 0
			        	EncodeServicePackage.append("00");
			    		//Bit 13 : Activado o Desactivado
						if (parametros.cmd.getDetalle().getTVpagada().getAccion()==5)
			    		{
			    			EncodeServicePackage.append("0");
			    		} 
			    		else
			    		{
			    			EncodeServicePackage.append("1");
			    		}
						EncodeServicePackage.append(String.format("%13s",Conversiones.DecimalToBinario(""+o)).replace(' ','0'));
					
						paquete.append(String.format("%4s",Conversiones.BinarioToHexadecimal(EncodeServicePackage.toString())).replace(' ', '0'));
					}
					
	        	}
	        }

        }
		
	/*	Antes de cambios en la configuracion de paquetes para Cuenca Y Machala
		if (intPaquetes >0)
        {
	        for (int i=0;i<lstpaquete.size()/2;i++)
	        {	
	        	if (lstpaquete.get(i).getIdPaquete()>0)
	        	{        		
		        	EncodeServicePackage.delete(0, 15);

		        	//Bit 14-15 : estan abiertos, valor por default 0
		        	EncodeServicePackage.append("00");
		    		//Bit 13 : Activado o Desactivado
		    		if (parametros.cmd.getDetalle().getTVpagada().getAccion()==2)
		    		{
		    			EncodeServicePackage.append("0");
		    		} 
		    		else
		    		{
		    			EncodeServicePackage.append("1");
		    		}
		    		//Bit 00 al 12 : ServiceNumber
		    		parametros.SetearPaqueteSP(parametros,lstpaquete.get(i).getIdPaquete());
		    		EncodeServicePackage.append(String.format("%13s",Conversiones.DecimalToBinario(""+parametros.getValue("idPaquete").toString())).replace(' ','0'));
		    		paquete.append(String.format("%4s",Conversiones.BinarioToHexadecimal(EncodeServicePackage.toString())).replace(' ', '0'));
	
	        	}
	        }

        }*/

        if (intEventos > 0)
        {
	        
	        //for (int i=0;i<lstevento.size()/2;i++) // desde SP
	        for (int i=0;i<lstevento.size();i++) //desde Titan	
	        {	
	          if (lstevento.get(0).getIdEvento()>0)
	          {
	        	if (i == 0)
	        	{
		        		
		        	//System.out.println("Entro Evento");	        		
		        		
		        	//EncodeServicePackage.delete(0, 15);
		        	EncodeServicePackage.delete(0, EncodeServicePackage.length());
	
		        	//Bit 14-15 : estan abiertos, valor por default 0
		        	EncodeServicePackage.append("00");
		    		//Bit 13 : Activado o Desactivado
		    		if (parametros.cmd.getDetalle().getTVpagada().getAccion()==2)
		    		{
		    			EncodeServicePackage.append("0");
		    		} 
		    		else
		    		{
		    			EncodeServicePackage.append("1");
		    		}
		    		
		    		EncodeServicePackage.append(String.format("%13s",Conversiones.DecimalToBinario(""+lstevento.get(0).getIdEvento())).replace(' ','0'));
		    		paquete.append(String.format("%4s",Conversiones.BinarioToHexadecimal(EncodeServicePackage.toString())).replace(' ', '0'));
	        	}
	          }
	        }

        }
      
		System.out.println("Fin de Creacion Comando262 "+paquete);
		
		return paquete;
	}

	
	/**
	 * @return StringBuilder paquete
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 * @throws SecurityException 
	 * @throws IllegalArgumentException 
	 * @throws Excepciones 
	 */
	public StringBuilder Comando462() throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException, Excepciones
	{
		System.out.println("Inicio de Creacion del Comando462");
		
		//ConverterID
		parametros.SetearIdConvertidor(parametros.cmd.getDetalle().getTVpagada().getIdConvertidor());
		converterId.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+Integer.valueOf(parametros.getValue("idConvertidor").toString())/8)).replace(' ', '0'));
	    converterId.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+Integer.valueOf(parametros.getValue("idConvertidor").toString())%8)).replace(' ', '0'));
	    paquete.append(converterId.toString());

	    //SerialNumber
		paquete.append(Conversiones.AsciiToHexadecimal(parametros.cmd.getDetalle().getTVpagada().getSerie()));

		//Filler
		paquete.append(String.format("%16s", "0").replace(' ', '0'));
		
		//ConverterType 
		//if (parametros.cmd.getDetalle().getTVpagada().getTipoD() !=32)
		//{
			paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getTipoD())).replace(' ','0'));
		//}
		//else
		//{
		//	paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+30)).replace(' ','0'));
		//}
		/**
		 *Valores seteados por defecto 
		 */
			
			//String FieldStatusWord1 ="0404";
			//String StatusWord1 = "0400";	
			
//		String FieldStatusWord1 = "0010000000100000";
//		paquete.append(String.format("%4s",Conversiones.BinarioToHexadecimal(FieldStatusWord1)).replace(' ', '0'));

		String FieldStatusWord1 ="0404"; // para machala
		//String FieldStatusWord1 ="2020";
		paquete.append(FieldStatusWord1);
		
		
		/**
		 *Valores seteados por defecto 
		 */
		//String FieldStatusWord2 = "0010000000100000";
		String FieldStatusWord2 = "0";
		paquete.append(String.format("%4s",Conversiones.BinarioToHexadecimal(FieldStatusWord2)).replace(' ', '0'));		
		
		/**
		 *Valores seteados por defecto 
		 */
		String FieldStatusWord3 = "0000000000000000";
		paquete.append(String.format("%4s",Conversiones.BinarioToHexadecimal(FieldStatusWord3)).replace(' ', '0'));		
		
		/**
		 *Valores seteados por defecto 
		 */
		String FieldStatusWord4	= "0000000000000000";	
		paquete.append(String.format("%4s",Conversiones.BinarioToHexadecimal(FieldStatusWord4)).replace(' ', '0'));		
		
		//PhoneIndex 
		paquete.append(String.format("%4s", "0").replace(' ','0'));
		
		//HubNumber  
		paquete.append(String.format("%4s", "0").replace(' ','0'));
		
		//Master/Slave Type 
		paquete.append(String.format("%4s", "0").replace(' ','0'));		
		
		//Master/Slave Key  
		paquete.append(String.format("%8s", "0").replace(' ','0'));		

		//ConverterGroup  
		paquete.append(String.format("%4s", "0").replace(' ','0'));	
		
		//ConverterSubGroup1 
		paquete.append(String.format("%4s", "0").replace(' ','0'));		
		
		//ConverterSubGroup2 
		paquete.append(String.format("%4s", "0").replace(' ','0'));		
		
		//ConverterSubGroup3  
		paquete.append(String.format("%4s", "0").replace(' ','0'));		
		
		//Account Number
		int cuenta = parametros.cmd.getDetalle().getTVpagada().getIdAccount();
		String cuenta1 = String.format("%12s", cuenta);
		paquete.append(Conversiones.AsciiToHexadecimal(cuenta1));
	
		//TelephoneNumber = "0";//FSW1
		paquete.append(String.format("%24s", "0").replace(' ','0'));
		
		//Filler = ;
		paquete.append(String.format("%8s", "0").replace(' ', '0'));		
		
		/**
		 *Valores seteados por defecto 
		 */
		//String StatusWord1 = "0400";
//  	String StatusWord1 = "0010011010110101";
//		paquete.append(String.format("%4s",Conversiones.BinarioToHexadecimal(StatusWord1)).replace(' ','0'));
		//String StatusWord1 = "0409";
		accion = parametros.cmd.getDetalle().getTVpagada().getAccion();
		if (accion == 6)
		{	
			StatusWord1 = "0409";
		}
		else if (accion == 5)
		{
			StatusWord1 = "0008";
		}
		//String StatusWord1 = "26B5";
		paquete.append(StatusWord1);
		
		/**
		 *Valores seteados por defecto 
		 */
		String StatusWord2 = "0000000000000000";
		paquete.append(String.format("%4s",Conversiones.BinarioToHexadecimal(StatusWord2)).replace(' ', '0'));		
		/**
		 *Valores seteados por defecto 
		 */	
		String StatusWord3 = "0000000000000000";
		paquete.append(String.format("%4s",Conversiones.BinarioToHexadecimal(StatusWord3)).replace(' ','0'));
		
		//PurchaseLimit FSW1 Bit 5		
		paquete.append(String.format("%4s", "0").replace(' ','0'));
		
		//TimeoutLimit
		paquete.append(String.format("%4s", "0").replace(' ','0'));
		
		//EmergencyAlertMask 
		paquete.append(String.format("%4s", "0").replace(' ','0'));		
		
		//TuningType	
		paquete.append(String.format("%4s", "0").replace(' ','0'));		
		
		String TimeZone 	= "0";/// Revisar con Wendy
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(TimeZone)).replace(' ','0'));	
		
		//ConverterStatus 	= ; OJO
		
		StringBuilder ConverterStatus = new StringBuilder();//BO
		ConverterStatus.append(String.format("%2s",Conversiones.AsciiToHexadecimal("C")).replace(' ', '0'));
//		ConverterStatus.append(String.format("%2s",Conversiones.AsciiToHexadecimal("O")).replace(' ', '0'));
		ConverterStatus.append(String.format("%2s",Conversiones.DecimalToHexadecimal("0")).replace(' ', '0'));
//		ConverterStatus.append("4C41");
		paquete.append(ConverterStatus.toString());
				
		//Se envia el codigo del channel map
		ChannelMap = "11";
		//System.out.println("Channel Map"+ChannelMap);
		/*switch (ciudad)
		{
			case 65:
				ChannelMap = "1";
			break;
			
			case 63:
				ChannelMap = "11";
			break;
				
			case 94:
				ChannelMap = "11";
			break;
				
			case 96:
				ChannelMap = "11";
			break;
		}*/
		paquete.append(String.format("%4s", ChannelMap).replace(' ','0'));
		
		//Con esto seteamos que el output channel sera el 3 o 4 
		String OutputChannel3 = "0";
	    paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(OutputChannel3)).replace(' ', '0'));
		
	    //UHF Output Channel Number
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		
	    //Input Frequency Map
	    paquete.append(String.format("%4s", "0").replace(' ','0'));	    
		
	    //Output Frequency Map
	    paquete.append(String.format("%4s", "0").replace(' ','0'));	    
		
	    //Aux 12V Option
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		
	    //Amplifier
	    paquete.append(String.format("%24s", "0").replace(' ','0'));

	    //Converter Subtype Features Installed 1/4
	    paquete.append(String.format("%4s", "0").replace(' ','0'));

	    //Converter Subtype Features Installed 2/4
	    paquete.append(String.format("%4s", "0").replace(' ','0'));		

	    //Converter Subtype Features Installed 3/4
	    paquete.append(String.format("%4s", "0").replace(' ','0'));	    

	    //Converter Subtype Features Installed 4/4
	    paquete.append(String.format("%4s", "0").replace(' ','0'));

	    //Interactive Program Guide (IPG) Region Code
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		
	    //Filler
	    paquete.append(String.format("%4s", "0").replace(' ','0'));

	    //DCR Frequency Map
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		
	    //SEGA Frequency Map
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		
	    //Audio Compression Mode
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
	    
	    //Copy Protection Mode
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
	    
	    //Language Specifier
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
	    
	    //Open 01
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
	    //Open 02
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
	    //Open 03
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
	    //Open 04
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 05
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 06
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 07
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 08
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 09
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 10
	    //paquete.append(Conversiones.AsciiToHexadecimal("    "));
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 11
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 12
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 13
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 14
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 15
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 16
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 17
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 18
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 19
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		
	   
	    
	    if (parametros.cmd.getDetalle().getTVpagada().getIdPaquetes() != null)
	    {
	    	lstpaquete = parametros.cmd.getDetalle().getTVpagada().getIdPaquetes().getIdPaquete();
	    	intPaquetes = lstpaquete.size();
	    }
	    else
	    {
	    	intPaquetes = 0;
	    }
	    
	    
	    //Encoded Services To Follow
	    //encodedServiceToFollow = 1 + intPaquetes/2 ; //Para SP
	    encodedServiceToFollow = 1 + intPaquetes ;
	    //paquete.append(String.format("%4s", "1").replace(' ','0'));	    
	    paquete.append(String.format("%4s", encodedServiceToFollow).replace(' ','0'));
/*
		//Encoded Service Number   
		StringBuilder EncodedServiceNumber = new StringBuilder();
		//Bit 14-15 : estan abiertos, valor por default 0
		EncodedServiceNumber.append("00");
		//Bit 13 : Activado o Desactivado
		//if (parametros.cmd.getDetalle().getTVpagada().getAccion()==2)
		if (parametros.cmd.getDetalle().getTVpagada().getAccion()==5)
		{
			EncodedServiceNumber.append("0");
			System.out.println("Entro por el 0462 0");
		} 
		else //(parametros.cmd.getDetalle().getTVpagada().getAccion()==3)
		{
			EncodedServiceNumber.append("1");
			System.out.println("Entro por el 0462 1");
		}
		//Bit 00 al 12 : ServiceNumber
		
		System.out.println("pppppp"+parametros.cmd.getDetalle().getTVpagada().getIdServicio());
		
		parametros.SetearServicio(parametros);
		int servicio = Integer.valueOf(parametros.getValue("idServicio").toString());
		//EncodedServiceNumber.append(String.format("%13s",Conversiones.DecimalToBinario(""+parametros.cmd.getDetalle().getTVpagada().getIdServicio())).replace(' ','0'));
		EncodedServiceNumber.append(String.format("%13s",Conversiones.DecimalToBinario(""+servicio)).replace(' ','0'));
		
		paquete.append(String.format("%4s",Conversiones.BinarioToHexadecimal(EncodedServiceNumber.toString())).replace(' ', '0'));
		*/
		//paquete.append(String.format("%4s",Conversiones.BinarioToHexadecimal(EncodedServiceNumber.toString())).replace(' ', '0'));
		
	    //Bit 14-15 : estan abiertos, valor por default 0
		EncodedServiceNumber.append("00");
		//Bit 13 : Activado o Desactivado
		//if (parametros.cmd.getDetalle().getTVpagada().getAccion()==5)
		if (accion==5)
		{
			EncodedServiceNumber.append("0");
			//System.out.println("Entro por el 0");
		} 
		else //(parametros.cmd.getDetalle().getTVpagada().getAccion()==3)
		{
			EncodedServiceNumber.append("1");
			//System.out.println("Entro por el 1");
		}
		//Bit 00 al 12 : ServiceNumber
		parametros.SetearServicio(parametros);
		int servicio = Integer.valueOf(parametros.getValue("idServicio").toString());
		//EncodedServiceNumber.append(String.format("%13s",Conversiones.DecimalToBinario(""+parametros.cmd.getDetalle().getTVpagada().getIdServicio())).replace(' ','0'));		
		EncodedServiceNumber.append(String.format("%13s",Conversiones.DecimalToBinario(""+servicio)).replace(' ','0'));
		paquete.append(String.format("%4s",Conversiones.BinarioToHexadecimal(EncodedServiceNumber.toString())).replace(' ', '0'));
		
		if (intPaquetes >0)
        {
			System.out.println("Entro");
	        //for (int i=0;i<lstpaquete.size()/2;i++) //Desde SP
	        for (int i=0;i<lstpaquete.size();i++)	 //Desde Titan       	 
	        {	
	        	if (lstpaquete.get(i).getIdPaquete()>0)
	        	{        		
        		
	        		EncodeServicePackage.delete(0, 15);
		        	
/* Antes de cambio de configuracion de servicios de 
		        	//Bit 14-15 : estan abiertos, valor por default 0
		        	EncodeServicePackage.append("00");
		    		//Bit 13 : Activado o Desactivado
		    		if (parametros.cmd.getDetalle().getTVpagada().getAccion()==5)
		    		{
		    			EncodeServicePackage.append("0");
		    		} 
		    		else
		    		{
		    			EncodeServicePackage.append("1");
		    		}*/
		    		//Bit 00 al 12 : ServiceNumber
		    		
		    		parametros.SetearPaqueteSP(parametros,lstpaquete.get(i).getIdPaquete());
		    		ArrayList<Integer> newpaquete = (ArrayList<Integer>)parametros.getValue("paqueteadi");
					for (int o: newpaquete) 
					{
						//EncodeServicePackage.append(String.format("%13s",Conversiones.DecimalToBinario(""+parametros.getValue("idPaquete").toString())).replace(' ','0'));
						//EncodeServicePackage.delete(0, 15);
						EncodeServicePackage.delete(0, EncodeServicePackage.length());
			        	//Bit 14-15 : estan abiertos, valor por default 0
			        	EncodeServicePackage.append("00");
			    		//Bit 13 : Activado o Desactivado
			    		if (parametros.cmd.getDetalle().getTVpagada().getAccion()==5)
			    		{
			    			EncodeServicePackage.append("0");
			    		} 
			    		else
			    		{
			    			EncodeServicePackage.append("1");
			    		}
			    		//Bit 00 al 12 : ServiceNumber
						EncodeServicePackage.append(String.format("%13s",Conversiones.DecimalToBinario(""+o)).replace(' ','0'));					
						paquete.append(String.format("%4s",Conversiones.BinarioToHexadecimal(EncodeServicePackage.toString())).replace(' ', '0'));
					}
					
	        	}
	        }

        }
		
		
		System.out.println("Fin de Creacion del Comando462 "+paquete);
		
		return paquete;		
	}
	
	/**
	 * @return StringBuilder paquete
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 * @throws SecurityException 
	 * @throws IllegalArgumentException 
	 */
	public StringBuilder Comando264() throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException
	{
		System.out.println("Inicio de Creacion del Comando264 ");
		
		/**
		 *Obtengo los datos provenientes del WSDL y los convierto a Hexadecimal 
		 */

		//ConverterId 	
		parametros.SetearIdConvertidor(parametros.cmd.getDetalle().getTVpagada().getIdConvertidor());
		converterId.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+Integer.valueOf(parametros.getValue("idConvertidor").toString())/8)).replace(' ', '0'));
	    converterId.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+Integer.valueOf(parametros.getValue("idConvertidor").toString())%8)).replace(' ', '0'));
	    paquete.append(converterId.toString());
		
		//SerialNumber 	
		paquete.append(Conversiones.AsciiToHexadecimal(parametros.cmd.getDetalle().getTVpagada().getSerie()));
		
		//ConverterType  
		paquete.append(String.format("%4s",""+0).replace(' ', '0'));
		//paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getTipoD())).replace(' ','0'));
		System.out.println("Fin de Creacion del Comando264 "+paquete);
		
		return paquete;
		
	}
	
	/**
	 * @return StringBuilder paquete
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 * @throws SecurityException 
	 * @throws IllegalArgumentException 
	 */
	public StringBuilder Comando265() throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException
	{	
		System.out.println("Inicio de Creacion del Comando265 ");
		/**
		 *Obtengo los datos provenientes del WSDL y los convierto a Hexadecimal 
		 */
		
		//ConverterId 
	    //converterId.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+Integer.valueOf(parametros.cmd.getDetalle().getTVpagada().getIdConvertidor())/8)).replace(' ', '0'));
	    //converterId.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+Integer.valueOf(parametros.cmd.getDetalle().getTVpagada().getIdConvertidor())%8)).replace(' ', '0'));
		//paquete.append(converterId.toString());	
		
		parametros.SetearIdConvertidor(parametros.cmd.getDetalle().getTVpagada().getIdConvertidor());
		converterId.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+Integer.valueOf(parametros.getValue("idConvertidor").toString())/8)).replace(' ', '0'));
	    converterId.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+Integer.valueOf(parametros.getValue("idConvertidor").toString())%8)).replace(' ', '0'));
	    paquete.append(converterId.toString());
		
		//SerialNumber
		paquete.append(Conversiones.AsciiToHexadecimal(parametros.cmd.getDetalle().getTVpagada().getSerie()));
		
		//ConverterType 	
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal((""+parametros.cmd.getDetalle().getTVpagada().getTipoD()))).replace(' ','0'));

		//ActionCode        
		if (parametros.cmd.getDetalle().getTVpagada().getAccion()==4)
		{	 
			paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal("2")).replace(' ','0'));
		}
		
		System.out.println("Fin de Creacion del Comando265 "+paquete);
		
		return paquete;
	}
	
	/**
	 * @return StringBuilder paquete
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 * @throws SecurityException 
	 * @throws IllegalArgumentException 
	 */
	public StringBuilder Comando280() throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException
	{	
		System.out.println("Inicio de Creacion del Comando280Tv ");
		/**
		 *Obtengo los datos provenientes del WSDL y los convierto a Hexadecimal 
		 */
		
		//ConverterId	 
		parametros.SetearIdConvertidor(parametros.cmd.getDetalle().getTVpagada().getIdConvertidor());
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
		
	    paquete.append(Conversiones.AsciiToHexadecimal(String.format("%12s",parametros.cmd.getDetalle().getTVpagada().getSerie()).replace(' ', '0')));
	    /*PARASP*/
		//ConverterType 
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getTipoD())).replace(' ','0'));

		//paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+3)).replace(' ','0'));
		
		System.out.println("Fin de Creacion del Comando280Tv "+paquete);
		
		return paquete;
	}
	
	/**
	 * @return StringBuilder paquete
	 */
	public StringBuilder Comando296()
	{
		System.out.println("Inicio de Creacion del Comando296 ");

		/**
		 *Obtengo los datos provenientes del WSDL y los convierto a Hexadecimal 
		 */

		//EntriesToFollow
		entriesToFollow = parametros.cmd.getDetalle().getTVpagada().getIdPaquetes().getCantP();
		paquete.append(String.format("%4s",entriesToFollow).replace(' ', '0'));
		for(int i=0;i<entriesToFollow;i++)
		{
			paquete.append(Conversiones.AsciiToHexadecimal(parametros.cmd.getDetalle().getTVpagada().getSerie()));	
    		//Bit 14-15 : estan abiertos, valor por default 0
			EncodedServiceNumber.append("00");
    		//Bit 13 : Activado o Desactivado
    		if (parametros.cmd.getDetalle().getTVpagada().getAccion()==2)
    		{
    			System.out.println("entro por el 0");
    			EncodedServiceNumber.append("0");
    		} 
    		else
    		{
    			System.out.println("entro por el 1");
    			EncodedServiceNumber.append("1");
    		}
    		//Bit 00 al 12 : ServiceNumber
    		
    		serviceNumber = ""+parametros.cmd.getDetalle().getTVpagada().getIdPaquetes().getIdPaquete().get(i).getIdPaquete();
    		serviceNumber = String.format("%13s", Conversiones.DecimalToBinario(serviceNumber)).replace(' ', '0');
    		EncodedServiceNumber.append(serviceNumber);
    		//System.out.println("encodeservice"+EncodedServiceNumber.toString());
    		paquete.append(String.format("%4s",Conversiones.BinarioToHexadecimal(EncodedServiceNumber.toString())).replace(' ', '0'));
		}
		

		
		System.out.println("Fin de Creacion del Comando296 "+paquete);
		
		return paquete;
	}
	
	/**
	 * @return StringBuilder paquete
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 * @throws SecurityException 
	 * @throws IllegalArgumentException 
	 */
	public StringBuilder Comando263() throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException
	{
		System.out.println("Inicio de Creacion del Comando263 ");
		
		/**
		 *Obtengo los datos provenientes del WSDL y los convierto a Hexadecimal 
		 */

		//ConverterId 	
		parametros.SetearIdConvertidor(parametros.cmd.getDetalle().getTVpagada().getIdConvertidor());
		converterId.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+Integer.valueOf(parametros.getValue("idConvertidor").toString())/8)).replace(' ', '0'));
	    converterId.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+Integer.valueOf(parametros.getValue("idConvertidor").toString())%8)).replace(' ', '0'));
	    paquete.append(converterId.toString());

		//SerialNumber 	
		paquete.append(Conversiones.AsciiToHexadecimal(parametros.cmd.getDetalle().getTVpagada().getSerie()));
		
		//ConverterType  
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getTipoD())).replace(' ','0'));
		System.out.println("Fin de Creacion del Comando263 "+paquete);
		
		return paquete;
	}
	
	public StringBuilder Comando260() throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException
	{
		System.out.println("Inicio de Creacion del Comando260");
		
		//ConverterID
		parametros.SetearIdConvertidor(parametros.cmd.getDetalle().getTVpagada().getIdConvertidor());
		converterId.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+Integer.valueOf(parametros.getValue("idConvertidor").toString())/8)).replace(' ', '0'));
	    converterId.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+Integer.valueOf(parametros.getValue("idConvertidor").toString())%8)).replace(' ', '0'));
	    paquete.append(converterId.toString());	
		
		//SerialNumber
		paquete.append(Conversiones.AsciiToHexadecimal(parametros.cmd.getDetalle().getTVpagada().getSerie()));

		
		//ConverterType 
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getTipoD())).replace(' ','0'));
		
		
		// Valores seteados por defecto 
		 
		//String FieldStatusWord1 = "0010000000100000";
		//0000010000000100
		
		//String FieldStatusWord1 ="2020";
		//paquete.append(String.format("%4s",Conversiones.BinarioToHexadecimal(FieldStatusWord1)).replace(' ', '0'));
		String FieldStatusWord1 ="0404"; // para Machala
		paquete.append(FieldStatusWord1);
		
		// Valores seteados por defecto 
		 
		String FieldStatusWord2 = "0010000000100000";
		paquete.append(String.format("%4s",Conversiones.BinarioToHexadecimal(FieldStatusWord2)).replace(' ', '0'));		
		
		//PhoneIndex 
		paquete.append(String.format("%4s", "0").replace(' ','0'));
		
		//HubNumber  
		paquete.append(String.format("%4s", "0").replace(' ','0'));
		
		//Master/Slave Type 
		paquete.append(String.format("%4s", "0").replace(' ','0'));		
		
		//Master/Slave Key  
		paquete.append(String.format("%8s", "0").replace(' ','0'));		

		//Alternate International Frequency
		paquete.append(String.format("%4s", "0").replace(' ','0'));	
			
		//Account Number
		int cuenta = 0;
		String cuenta1 = String.format("%12s", cuenta).replace(' ', '0');
		paquete.append(Conversiones.AsciiToHexadecimal(cuenta1));
	
		//TelephoneNumber = "0";//FSW1
		paquete.append(String.format("%20s", "0").replace(' ','0'));

		
		// Valores seteados por defecto 
		 
		//String StatusWord1 = "0010011010110101";
		
		
		//String StatusWord1 = "26B5";
		//paquete.append(String.format("%4s",Conversiones.BinarioToHexadecimal(StatusWord1)).replace(' ','0'));
		String StatusWord1 = "0400"; // Para Machala
		paquete.append(StatusWord1);
		
		// Valores seteados por defecto 
		 
		
		//PurchaseLimit FSW1 Bit 5		
		paquete.append(String.format("%4s", "0").replace(' ','0'));
		
		//TimeoutLimit
		paquete.append(String.format("%4s", "0").replace(' ','0'));
		
		//EmergencyAlertMask 
		paquete.append(String.format("%4s", "0").replace(' ','0'));		
		
		//TuningType	
		paquete.append(String.format("%4s", "0").replace(' ','0'));		
		
		String TimeZone 	= "0";/// Revisar con Wendy
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(TimeZone)).replace(' ','0'));	
		
		//ConverterStatus 	= ; OJO
		
		StringBuilder ConverterStatus = new StringBuilder();//BO
		ConverterStatus.append(String.format("%2s",Conversiones.AsciiToHexadecimal("C")).replace(' ', '0'));
		ConverterStatus.append(String.format("%2s",Conversiones.AsciiToHexadecimal("0")).replace(' ', '0'));
		paquete.append(ConverterStatus.toString());
				

		String ChannelMap = "0";//Se envia el codigo del channel map		
		paquete.append(String.format("%4s", ChannelMap).replace(' ','0'));
		
	    //UHF Output Channel 3
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		
	    //Frequency Map
	    paquete.append(String.format("%2s", "0").replace(' ','0'));	  

	    //Aux 12V Option
	    paquete.append(String.format("%2s", "0").replace(' ','0'));
		
	    //Amplifier
	    paquete.append(String.format("%12s", "0").replace(' ','0'));

	    //Encoded Services To Follow
	    paquete.append(String.format("%4s", "0").replace(' ','0'));	    
/*
		//Encoded Service Number   
		StringBuilder EncodedServiceNumber = new StringBuilder();
		//Bit 14-15 : estan abiertos, valor por default 0
		EncodedServiceNumber.append("00");
		//Bit 13 : Activado o Desactivado
		if (parametros.cmd.getDetalle().getTVpagada().getAccion()==2)
		{
			EncodedServiceNumber.append("0");
			System.out.println("Entro por el 0260 0");
		} 
		else //(parametros.cmd.getDetalle().getTVpagada().getAccion()==3)
		{
			EncodedServiceNumber.append("1");
			System.out.println("Entro por el 0260 1");
		}
		//Bit 00 al 12 : ServiceNumber
		EncodedServiceNumber.append(String.format("%13s",Conversiones.DecimalToBinario(""+parametros.cmd.getDetalle().getTVpagada().getIdServicio())).replace(' ','0'));
		System.out.println(String.format("%4s",Conversiones.BinarioToHexadecimal(EncodedServiceNumber.toString())).replace(' ', '0'));
		paquete.append(String.format("%4s",Conversiones.BinarioToHexadecimal(EncodedServiceNumber.toString())).replace(' ', '0'));
		*/
		//paquete.append(String.format("%4s",Conversiones.BinarioToHexadecimal(EncodedServiceNumber.toString())).replace(' ', '0'));
		
		System.out.println("Fin de Creacion del Comando260 "+paquete);
		
		return paquete;
	}
	///////////////nuevoS comandoS
	
	public StringBuilder Comando463() throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException, Excepciones
	{
		System.out.println("Inicio de Creacion del Comando463");
		
		//ConverterID
		parametros.SetearIdConvertidor(parametros.cmd.getDetalle().getTVpagada().getIdConvertidor());
		converterId.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+Integer.valueOf(parametros.getValue("idConvertidor").toString())/8)).replace(' ', '0'));
	    converterId.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+Integer.valueOf(parametros.getValue("idConvertidor").toString())%8)).replace(' ', '0'));
	    paquete.append(converterId.toString());
	    
		//SerialNumber
		paquete.append(Conversiones.AsciiToHexadecimal(parametros.cmd.getDetalle().getTVpagada().getSerie()));

		//Filler
		paquete.append(String.format("%16s", "0").replace(' ', '0'));
		
		//ConverterType 
		//if (parametros.cmd.getDetalle().getTVpagada().getTipoD() !=32)
		//{
			paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getTipoD())).replace(' ','0'));
		//}
		//else
		//{
		//	paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+30)).replace(' ','0'));
		//}
		/**
		 *Valores seteados por defecto 
		 */
		String FieldStatusWord1 = "0010000000100000";
		paquete.append(String.format("%4s",Conversiones.BinarioToHexadecimal(FieldStatusWord1)).replace(' ', '0'));
		//System.out.println("Hasta el FieldStatus1"+paquete);
		/**
		 *Valores seteados por defecto 
		 */
		String FieldStatusWord2 = "0010000000100000";
		paquete.append(String.format("%4s",Conversiones.BinarioToHexadecimal(FieldStatusWord2)).replace(' ', '0'));		
		
		/**
		 *Valores seteados por defecto 
		 */
		String FieldStatusWord3 = "0000000000000000";
		paquete.append(String.format("%4s",Conversiones.BinarioToHexadecimal(FieldStatusWord3)).replace(' ', '0'));		
		
		/**
		 *Valores seteados por defecto 
		 */
		String FieldStatusWord4	= "0000000000000000";	
		paquete.append(String.format("%4s",Conversiones.BinarioToHexadecimal(FieldStatusWord4)).replace(' ', '0'));		
		
		//PhoneIndex 
		paquete.append(String.format("%4s", "0").replace(' ','0'));
		
		//HubNumber  
		paquete.append(String.format("%4s", "0").replace(' ','0'));
		
		//Master/Slave Type 
		paquete.append(String.format("%4s", "0").replace(' ','0'));		
		
		//Master/Slave Key  
		paquete.append(String.format("%8s", "0").replace(' ','0'));		

		//ConverterGroup  
		paquete.append(String.format("%4s", "0").replace(' ','0'));	
		
		//ConverterSubGroup1 
		paquete.append(String.format("%4s", "0").replace(' ','0'));		
		
		//ConverterSubGroup2 
		paquete.append(String.format("%4s", "0").replace(' ','0'));		
		
		//ConverterSubGroup3  
		paquete.append(String.format("%4s", "0").replace(' ','0'));		
		
		//Account Number
		int cuenta = parametros.cmd.getDetalle().getTVpagada().getIdAccount();
		String cuenta1 = String.format("%12s", cuenta);
		paquete.append(Conversiones.AsciiToHexadecimal(cuenta1));
	
		//TelephoneNumber = "0";//FSW1
		paquete.append(String.format("%24s", "0").replace(' ','0'));
		
		//Filler = ;
		paquete.append(String.format("%8s", "0").replace(' ', '0'));		
		
		/**
		 *Valores seteados por defecto 
		 */
		String StatusWord1 = "0010011010110101";
		paquete.append(String.format("%4s",Conversiones.BinarioToHexadecimal(StatusWord1)).replace(' ','0'));
		/**
		 *Valores seteados por defecto 
		 */
		String StatusWord2 = "0000000000000000";
		paquete.append(String.format("%4s",Conversiones.BinarioToHexadecimal(StatusWord2)).replace(' ', '0'));		
		/**
		 *Valores seteados por defecto 
		 */	
		String StatusWord3 = "0000000000000000";
		paquete.append(String.format("%4s",Conversiones.BinarioToHexadecimal(StatusWord3)).replace(' ','0'));
		
		//PurchaseLimit FSW1 Bit 5		
		paquete.append(String.format("%4s", "0").replace(' ','0'));
		
		//TimeoutLimit
		paquete.append(String.format("%4s", "0").replace(' ','0'));
		
		//EmergencyAlertMask 
		paquete.append(String.format("%4s", "0").replace(' ','0'));		
		
		//TuningType	
		paquete.append(String.format("%4s", "0").replace(' ','0'));		
		
		String TimeZone 	= "0";/// Revisar con Wendy
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(TimeZone)).replace(' ','0'));	
		
		//ConverterStatus 	= ; OJO
		
		StringBuilder ConverterStatus = new StringBuilder();
		ConverterStatus.append(String.format("%2s",Conversiones.AsciiToHexadecimal("C")).replace(' ', '0'));
		ConverterStatus.append(String.format("%2s",Conversiones.DecimalToHexadecimal("0")).replace(' ', '0'));
		paquete.append(ConverterStatus.toString());
				
		String ChannelMap = "11";//Se envia el codigo del channel map
		paquete.append(String.format("%4s", ChannelMap).replace(' ','0'));
		
		//Con esto seteamos que el output channel sera el 3 o 4 
		String OutputChannel3 = "0";
	    paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(OutputChannel3)).replace(' ', '0'));
		
	    //UHF Output Channel Number
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		
	    //Input Frequency Map
	    paquete.append(String.format("%4s", "0").replace(' ','0'));	    
		
	    //Output Frequency Map
	    paquete.append(String.format("%4s", "0").replace(' ','0'));	    
		
	    //Aux 12V Option
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		
	    //Amplifier
	    paquete.append(String.format("%24s", "0").replace(' ','0'));

	    //Converter Subtype Features Installed 1/4
	    paquete.append(String.format("%4s", "0").replace(' ','0'));

	    //Converter Subtype Features Installed 2/4
	    paquete.append(String.format("%4s", "0").replace(' ','0'));		

	    //Converter Subtype Features Installed 3/4
	    paquete.append(String.format("%4s", "0").replace(' ','0'));	    

	    //Converter Subtype Features Installed 4/4
	    paquete.append(String.format("%4s", "0").replace(' ','0'));

	    //Interactive Program Guide (IPG) Region Code
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		
	    //Filler
	    paquete.append(String.format("%4s", "0").replace(' ','0'));

	    //DCR Frequency Map
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		
	    //SEGA Frequency Map
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		
	    //Audio Compression Mode
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
	    
	    //Copy Protection Mode
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
	    
	    //Language Specifier
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
	    
	    //Open 01
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
	    //Open 02
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
	    //Open 03
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
	    //Open 04
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 05
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 06
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 07
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 08
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 09
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 10
	    //paquete.append(Conversiones.AsciiToHexadecimal("    "));
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 11
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 12
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 13
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 14
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 15
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 16
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 17
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 18
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 19
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		/*
	    //Encoded Services To Follow
	    paquete.append(String.format("%4s", "1").replace(' ','0'));	    

		//paquete.append(String.format("%4s",Conversiones.BinarioToHexadecimal(EncodedServiceNumber.toString())).replace(' ', '0'));
		
	    //Bit 14-15 : estan abiertos, valor por default 0
		EncodedServiceNumber.append("00");
		//Bit 13 : Activado o Desactivado
		if (parametros.cmd.getDetalle().getTVpagada().getAccion()==5)
		{
			EncodedServiceNumber.append("0");
			System.out.println("Entro por el 0");
		} 
		else //(parametros.cmd.getDetalle().getTVpagada().getAccion()==3)
		{
			EncodedServiceNumber.append("1");
			System.out.println("Entro por el 1");
		}
		//Bit 00 al 12 : ServiceNumber
		parametros.SetearServicio(parametros);
		int servicio = Integer.valueOf(parametros.getValue("idServicio").toString());
		//EncodedServiceNumber.append(String.format("%13s",Conversiones.DecimalToBinario(""+parametros.cmd.getDetalle().getTVpagada().getIdServicio())).replace(' ','0'));		
		EncodedServiceNumber.append(String.format("%13s",Conversiones.DecimalToBinario(""+servicio)).replace(' ','0'));
		paquete.append(String.format("%4s",Conversiones.BinarioToHexadecimal(EncodedServiceNumber.toString())).replace(' ', '0'));
		*/
///// nuevo
		
		
	    if (parametros.cmd.getDetalle().getTVpagada().getIdServicio()!=0)
	    {
	    	intServicios =1;
	    }

	    List<IdEvento> lstevento = parametros.cmd.getDetalle().getTVpagada().getIdEventos().getIdEvento();
	    intEventos = lstevento.size();
	    encodedServiceToFollow = intServicios + intPaquetes + intEventos;
	    //System.out.println("encodedServiceto"+encodedServiceToFollow);
	    paquete.append(String.format("%4s", ""+encodedServiceToFollow).replace(' ','0'));
	    
	    EncodedServiceNumber.append("00");
		//Bit 13 : Activado o Desactivado
		if (parametros.cmd.getDetalle().getTVpagada().getAccion()==2)
		{
			EncodedServiceNumber.append("0");
		//	System.out.println("Entro por el 0");
		} 
		else //(parametros.cmd.getDetalle().getTVpagada().getAccion()==3)
		{
			EncodedServiceNumber.append("1");
		//	System.out.println("Entro por el 1");
		}
		//Bit 00 al 12 : ServiceNumber
		parametros.SetearServicio(parametros);
		int servicio = Integer.valueOf(parametros.getValue("idServicio").toString());
		//EncodedServiceNumber.append(String.format("%13s",Conversiones.DecimalToBinario(""+parametros.cmd.getDetalle().getTVpagada().getIdServicio())).replace(' ','0'));		
		EncodedServiceNumber.append(String.format("%13s",Conversiones.DecimalToBinario(""+servicio)).replace(' ','0'));
		//System.out.println("EncodedServiceNumber"+EncodedServiceNumber);
		paquete.append(String.format("%4s",Conversiones.BinarioToHexadecimal(EncodedServiceNumber.toString())).replace(' ', '0'));
		
		
		 if (Integer.valueOf(parametros.cmd.getDetalle().getTVpagada().getIdEventos().getIdEvento().size()) != null)
	        {
		        //int valor = parametros.cmd.getDetalle().getTVpagada().getIdEventos().getCantE();
		       
		       // int valor = parametros.cmd.getDetalle().getTVpagada().getIdEventos().getIdEvento().size()/2;
		        
		        for (int i=0;i<lstevento.size();i++)
		        {	
		        	if (i == 0)
		        	{
			        	EncodeServicePackage.delete(0, 15);
			    		
						/**
						 * Obtenemos el id del paquete y lo enmascaramos con los bits extra para definir si se autoriza
						 * o no.
						 */
			        	//Bit 14-15 : estan abiertos, valor por default 0
			        	EncodeServicePackage.append("00");
			    		//Bit 13 : Activado o Desactivado
			    		if (parametros.cmd.getDetalle().getTVpagada().getAccion()==2)
			    		{
			    			EncodeServicePackage.append("0");
			    		} 
			    		else
			    		{
			    			EncodeServicePackage.append("1");
			    		}
			    		//Bit 00 al 12 : ServiceNumber
		
			    		//EncodeServicePackage.append(String.format("%13s",Conversiones.DecimalToBinario(""+parametros.cmd.getDetalle().getTVpagada().getIdPaquetes().getIdPaquete().get(i).getIdPaquete())).replace(' ','0'));
			    		EncodeServicePackage.append(String.format("%13s",Conversiones.DecimalToBinario(""+lstevento.get(i).getIdEvento())).replace(' ','0'));
			    		/**
			    		 * hasta aqui creacion del Encode Service Number
			    		 */
			    		paquete.append(String.format("%4s",Conversiones.BinarioToHexadecimal(EncodeServicePackage.toString())).replace(' ', '0'));
		        	}
		        }

	        }
	        /*
	        int[] eve = null;
			if (parametros.cmd.getDetalle().getTVpagada().getIdEventos() != null)
			{
				List<IdEvento> lstevento = parametros.cmd.getDetalle().getTVpagada().getIdEventos().getIdEvento();
				 
				for (int i=0; i < lstevento.size(); i++)
				{
					System.out.println("venmaos"+lstevento.get(i).getIdEvento());
				}
			}*/
	       
	        if (Integer.valueOf(parametros.cmd.getDetalle().getTVpagada().getIdEventos().getIdEvento().size()) != null)
	        {
		        //int valor = parametros.cmd.getDetalle().getTVpagada().getIdEventos().getCantE();
		       
		       // int valor = parametros.cmd.getDetalle().getTVpagada().getIdEventos().getIdEvento().size()/2;
		        
		        for (int i=0;i<lstevento.size();i++)
		        {	
		        	if (i == 0)
		        	{
		        	EncodeServicePackage.delete(0, 15);
		    		

		        	//Bit 14-15 : estan abiertos, valor por default 0
		        	EncodeServicePackage.append("00");
		    		//Bit 13 : Activado o Desactivado
		    		if (parametros.cmd.getDetalle().getTVpagada().getAccion()==2)
		    		{
		    			EncodeServicePackage.append("0");
		    		} 
		    		else
		    		{
		    			EncodeServicePackage.append("1");
		    		}
		    		//Bit 00 al 12 : ServiceNumber
		    		System.out.println("holados"+lstevento.get(i).getIdEvento());
		    		//EncodeServicePackage.append(String.format("%13s",Conversiones.DecimalToBinario(""+parametros.cmd.getDetalle().getTVpagada().getIdPaquetes().getIdPaquete().get(i).getIdPaquete())).replace(' ','0'));
		    		//EncodeServicePackage.append(String.format("%13s",Conversiones.DecimalToBinario(""+parametros.cmd.getDetalle().getTVpagada().getIdEventos().getIdEvento().get(i).getIdEvento())).replace(' ','0'));
		    		EncodeServicePackage.append(String.format("%13s",Conversiones.DecimalToBinario(""+lstevento.get(i).getIdEvento())).replace(' ','0'));
		    		paquete.append(String.format("%4s",Conversiones.BinarioToHexadecimal(EncodeServicePackage.toString())).replace(' ', '0'));
		        	}
		        }

	        }
		System.out.println("Fin de Creacion del Comando463 "+paquete);
		
		return paquete;
		
		
	}
	public StringBuilder Comando464() throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException, Excepciones
	{
		System.out.println("Inicio de Creacion del Comando462 Advance ");
		
		//ConverterID
		parametros.SetearIdConvertidor(parametros.cmd.getDetalle().getTVpagada().getIdConvertidor());
		converterId.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+Integer.valueOf(parametros.getValue("idConvertidor").toString())/8)).replace(' ', '0'));
	    converterId.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+Integer.valueOf(parametros.getValue("idConvertidor").toString())%8)).replace(' ', '0'));
	    paquete.append(converterId.toString());
	    /*
		converterId.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+Integer.valueOf(parametros.cmd.getDetalle().getTVpagada().getIdConvertidor())/8)).replace(' ', '0'));
	    converterId.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+Integer.valueOf(parametros.cmd.getDetalle().getTVpagada().getIdConvertidor())%8)).replace(' ', '0'));
		paquete.append(converterId.toString());
		*/
		//SerialNumber
		paquete.append(Conversiones.AsciiToHexadecimal(parametros.cmd.getDetalle().getTVpagada().getSerie()));

		//Filler
		paquete.append(String.format("%16s", "0").replace(' ', '0'));
		
		//ConverterType 
		//if (parametros.cmd.getDetalle().getTVpagada().getTipoD() !=32)
		//{
			paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+parametros.cmd.getDetalle().getTVpagada().getTipoD())).replace(' ','0'));
		//}
		//else
		//{
		//	paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+30)).replace(' ','0'));
		//}
		/**
		 *Valores seteados por defecto 
		 */
		String FieldStatusWord1 = "0010000000100000";
		paquete.append(String.format("%4s",Conversiones.BinarioToHexadecimal(FieldStatusWord1)).replace(' ', '0'));
		//System.out.println("Hasta el FieldStatus1"+paquete);
		/**
		 *Valores seteados por defecto 
		 */
		String FieldStatusWord2 = "0010000000100000";
		paquete.append(String.format("%4s",Conversiones.BinarioToHexadecimal(FieldStatusWord2)).replace(' ', '0'));		
		
		/**
		 *Valores seteados por defecto 
		 */
		String FieldStatusWord3 = "0000000000000000";
		paquete.append(String.format("%4s",Conversiones.BinarioToHexadecimal(FieldStatusWord3)).replace(' ', '0'));		
		
		/**
		 *Valores seteados por defecto 
		 */
		String FieldStatusWord4	= "0000000000000000";	
		paquete.append(String.format("%4s",Conversiones.BinarioToHexadecimal(FieldStatusWord4)).replace(' ', '0'));		
		
		//PhoneIndex 
		paquete.append(String.format("%4s", "0").replace(' ','0'));
		
		//HubNumber  
		paquete.append(String.format("%4s", "0").replace(' ','0'));
		
		//Master/Slave Type 
		paquete.append(String.format("%4s", "0").replace(' ','0'));		
		
		//Master/Slave Key  
		paquete.append(String.format("%8s", "0").replace(' ','0'));		

		//ConverterGroup  
		paquete.append(String.format("%4s", "0").replace(' ','0'));	
		
		//ConverterSubGroup1 
		paquete.append(String.format("%4s", "0").replace(' ','0'));		
		
		//ConverterSubGroup2 
		paquete.append(String.format("%4s", "0").replace(' ','0'));		
		
		//ConverterSubGroup3  
		paquete.append(String.format("%4s", "0").replace(' ','0'));		
		
		//Account Number
		int cuenta = parametros.cmd.getDetalle().getTVpagada().getIdAccount();
		String cuenta1 = String.format("%12s", cuenta);
		paquete.append(Conversiones.AsciiToHexadecimal(cuenta1));
	
		//TelephoneNumber = "0";//FSW1
		paquete.append(String.format("%24s", "0").replace(' ','0'));
		
		//Filler = ;
		paquete.append(String.format("%8s", "0").replace(' ', '0'));		
		
		/**
		 *Valores seteados por defecto 
		 */
		String StatusWord1 = "0010011010110101";
		paquete.append(String.format("%4s",Conversiones.BinarioToHexadecimal(StatusWord1)).replace(' ','0'));
		/**
		 *Valores seteados por defecto 
		 */
		String StatusWord2 = "0000000000000000";
		paquete.append(String.format("%4s",Conversiones.BinarioToHexadecimal(StatusWord2)).replace(' ', '0'));		
		/**
		 *Valores seteados por defecto 
		 */	
		String StatusWord3 = "0000000000000000";
		paquete.append(String.format("%4s",Conversiones.BinarioToHexadecimal(StatusWord3)).replace(' ','0'));
		
		//PurchaseLimit FSW1 Bit 5		
		paquete.append(String.format("%4s", "0").replace(' ','0'));
		
		//TimeoutLimit
		paquete.append(String.format("%4s", "0").replace(' ','0'));
		
		//EmergencyAlertMask 
		paquete.append(String.format("%4s", "0").replace(' ','0'));		
		
		//TuningType	
		paquete.append(String.format("%4s", "0").replace(' ','0'));		
		
		String TimeZone 	= "0";/// Revisar con Wendy
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(TimeZone)).replace(' ','0'));	
		
		//ConverterStatus 	= ; OJO
		
		StringBuilder ConverterStatus = new StringBuilder();
		ConverterStatus.append(String.format("%2s",Conversiones.AsciiToHexadecimal("C")).replace(' ', '0'));
		ConverterStatus.append(String.format("%2s",Conversiones.DecimalToHexadecimal("0")).replace(' ', '0'));
		paquete.append(ConverterStatus.toString());
				
		String ChannelMap = "11";//Se envia el codigo del channel map
		paquete.append(String.format("%4s", ChannelMap).replace(' ','0'));
		
		//Con esto seteamos que el output channel sera el 3 o 4 
		String OutputChannel3 = "0";
	    paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(OutputChannel3)).replace(' ', '0'));
		
	    //UHF Output Channel Number
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		
	    //Input Frequency Map
	    paquete.append(String.format("%4s", "0").replace(' ','0'));	    
		
	    //Output Frequency Map
	    paquete.append(String.format("%4s", "0").replace(' ','0'));	    
		
	    //Aux 12V Option
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		
	    //Amplifier
	    paquete.append(String.format("%24s", "0").replace(' ','0'));

	    //Converter Subtype Features Installed 1/4
	    paquete.append(String.format("%4s", "0").replace(' ','0'));

	    //Converter Subtype Features Installed 2/4
	    paquete.append(String.format("%4s", "0").replace(' ','0'));		

	    //Converter Subtype Features Installed 3/4
	    paquete.append(String.format("%4s", "0").replace(' ','0'));	    

	    //Converter Subtype Features Installed 4/4
	    paquete.append(String.format("%4s", "0").replace(' ','0'));

	    //Interactive Program Guide (IPG) Region Code
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		
	    //Filler
	    paquete.append(String.format("%4s", "0").replace(' ','0'));

	    //DCR Frequency Map
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		
	    //SEGA Frequency Map
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		
	    //Audio Compression Mode
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
	    
	    //Copy Protection Mode
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
	    
	    //Language Specifier
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
	    
	    //Open 01
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
	    //Open 02
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
	    //Open 03
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
	    //Open 04
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 05
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 06
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 07
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 08
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 09
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 10
	    //paquete.append(Conversiones.AsciiToHexadecimal("    "));
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 11
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 12
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 13
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 14
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 15
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 16
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 17
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 18
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		//Open 19
	    paquete.append(String.format("%4s", "0").replace(' ','0'));
		
	    //Encoded Services To Follow
	    //paquete.append(String.format("%4s", "1").replace(' ','0'));	    


	    if (parametros.cmd.getDetalle().getTVpagada().getIdPaquetes() != null)
	    {
	    	List<IdPaquete> lstpaquete = parametros.cmd.getDetalle().getTVpagada().getIdPaquetes().getIdPaquete();
	    	intEventos = lstpaquete.size();
	    }
	    else
	    {
	    	intEventos = 0;
	    }
	    
	    if (parametros.cmd.getDetalle().getTVpagada().getIdEventos() != null)
	    {
		    List<IdEvento> lstevento = parametros.cmd.getDetalle().getTVpagada().getIdEventos().getIdEvento();
		    intEventos = lstevento.size();
	    }
	    else
	    {
	    	intEventos = 0;
	    }
	    
	    encodedServiceToFollow = intServicios + intPaquetes + intEventos;

	    paquete.append(String.format("%4s", ""+encodedServiceToFollow).replace(' ','0'));
	    
		//paquete.append(String.format("%4s",Conversiones.BinarioToHexadecimal(EncodedServiceNumber.toString())).replace(' ', '0'));
		
	    //Bit 14-15 : estan abiertos, valor por default 0
		EncodedServiceNumber.append("00");
		//Bit 13 : Activado o Desactivado
		if (parametros.cmd.getDetalle().getTVpagada().getAccion()==5)
		{
			EncodedServiceNumber.append("0");
		} 
		else //(parametros.cmd.getDetalle().getTVpagada().getAccion()==3)
		{
			EncodedServiceNumber.append("1");
		}
		//Bit 00 al 12 : ServiceNumber
		parametros.SetearServicio(parametros);
		int servicio = Integer.valueOf(parametros.getValue("idServicio").toString());
		//EncodedServiceNumber.append(String.format("%13s",Conversiones.DecimalToBinario(""+parametros.cmd.getDetalle().getTVpagada().getIdServicio())).replace(' ','0'));		
		EncodedServiceNumber.append(String.format("%13s",Conversiones.DecimalToBinario(""+servicio)).replace(' ','0'));
		paquete.append(String.format("%4s",Conversiones.BinarioToHexadecimal(EncodedServiceNumber.toString())).replace(' ', '0'));
		
		
        if (intPaquetes>0)
        {
        
	        for (int i=0;i<lstpaquete.size();i++)
	        {	
	        	if (i == 0)
	        	{
		        	EncodeServicePackage.delete(0, 15);

		        	//Bit 14-15 : estan abiertos, valor por default 0
		        	EncodeServicePackage.append("00");
		    		//Bit 13 : Activado o Desactivado
		    		if (parametros.cmd.getDetalle().getTVpagada().getAccion()==2)
		    		{
		    			EncodeServicePackage.append("0");
		    		} 
		    		else
		    		{
		    			EncodeServicePackage.append("1");
		    		}
		    		//Bit 00 al 12 : ServiceNumber
	
		    		//EncodeServicePackage.append(String.format("%13s",Conversiones.DecimalToBinario(""+parametros.cmd.getDetalle().getTVpagada().getIdPaquetes().getIdPaquete().get(i).getIdPaquete())).replace(' ','0'));
		    		parametros.SetearPaquete(parametros,lstpaquete.get(i).getIdPaquete());
		    		//EncodeServicePackage.append(String.format("%13s",Conversiones.DecimalToBinario(""+lstpaquete.get(i).getIdPaquete())).replace(' ','0'));
		    		EncodeServicePackage.append(String.format("%13s",Conversiones.DecimalToBinario(""+parametros.getValue("idPaquete").toString())).replace(' ','0'));

		    		paquete.append(String.format("%4s",Conversiones.BinarioToHexadecimal(EncodeServicePackage.toString())).replace(' ', '0'));
	        	}
	        }

        }

     
        //if (Integer.valueOf(parametros.cmd.getDetalle().getTVpagada().getIdEventos().getIdEvento().size()) != null)
		/*if (intEventos > 0)
        {
			
			System.out.println("Entro");
			System.out.println("lstevento.size()"+lstevento.size());
	        for (int i=0;i<lstevento.size();i++)
	        {	
	        	System.out.println("LST"+lstevento.get(i).getIdEvento());			
	        	EncodeServicePackage.delete(0, 15);
	    		
	        	System.out.println("LST"+lstevento.get(i).getIdEvento());
	        	//Bit 14-15 : estan abiertos, valor por default 0
	        	EncodeServicePackage.append("00");
	    		//Bit 13 : Activado o Desactivado
	    		if (parametros.cmd.getDetalle().getTVpagada().getAccion()==2)
	    		{
	    			EncodeServicePackage.append("0");
	    		} 
	    		else
	    		{
	    			EncodeServicePackage.append("1");
	    		}
	    		//Bit 00 al 12 : ServiceNumber
	    		System.out.println("holados"+lstevento.get(i).getIdEvento());
	    		//EncodeServicePackage.append(String.format("%13s",Conversiones.DecimalToBinario(""+parametros.cmd.getDetalle().getTVpagada().getIdPaquetes().getIdPaquete().get(i).getIdPaquete())).replace(' ','0'));
	    		//EncodeServicePackage.append(String.format("%13s",Conversiones.DecimalToBinario(""+parametros.cmd.getDetalle().getTVpagada().getIdEventos().getIdEvento().get(i).getIdEvento())).replace(' ','0'));
	    		EncodeServicePackage.append(String.format("%13s",Conversiones.DecimalToBinario(""+lstevento.get(i).getIdEvento())).replace(' ','0'));
	    		paquete.append(String.format("%4s",Conversiones.BinarioToHexadecimal(EncodeServicePackage.toString())).replace(' ', '0'));
	        	}
        }

	*/
		
		System.out.println("Fin de Creacion del Comando462 Advance "+paquete);
		
		return paquete;		
	}

	public StringBuilder ComandoACC802() throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException, Excepciones, UnsupportedEncodingException {
		// TODO Auto-generated method stub
		
	    sessionid = new AdmSessionsDAO().sessionid().get(0).getSesionTv();
		
		List<TvpConsultatv> tvpconsulta = new TvpConsultatvDAO().findAll();
	    
	    for (int p=0; p<tvpconsulta.size();p++)
	    {
	    	TvpConsultatvfinish tvpconsultafinish = new TvpConsultatvfinish();
			
			EntityManagerHelper.beginTransaction();
			 
			 tvpconsultafinish.setCpartyId(tvpconsulta.get(p).getCpartyId());
			 tvpconsultafinish.setCpartyIdAccount(tvpconsulta.get(p).getCpartyAccountId());
			 tvpconsultafinish.setDecoSerie(tvpconsulta.get(p).getApaddress());
			 tvpconsultafinish.setDecoId("");
			 tvpconsultafinish.setDecoIdControlador(0);
			 
			 tvpconsultafinish.setEstadoControlador("");
			 tvpconsultafinish.setEstadoTitan(tvpconsulta.get(p).getActivitytype());
			 tvpconsultafinish.setServicioControlador("");
			 tvpconsultafinish.setServicioTitan(""+tvpconsulta.get(p).getTariffPlanVariantName());
			 tvpconsultafinish.setConsultatvId(tvpconsulta.get(p).getId());
			 tvpconsultafinish.setSessionId(tvpconsulta.get(p).getSessionId());
			 sessionId = tvpconsulta.get(p).getId();
			 tvpconsultafinish.setPaychannelsTitan("");
			 tvpconsultafinish.setPaychannelsControlador("");
			 tvpconsultafinish.setSessionReportType(tvpconsulta.get(p).getSystemIdActive());
			 sessionReportType = tvpconsulta.get(p).getSystemIdActive();
			 tvpconsultafinish.setCiudad(tvpconsulta.get(p).getSystemIdActive());
			 
			 DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			 java.util.Date date = new java.util.Date();
			// datetime = dateFormat.format(date);
			 
			 tvpconsultafinish.setFecha(date);
			 
			 
			 
			new TvpConsultatvfinishDAO().save(tvpconsultafinish);
			EntityManagerHelper.commit();
			EntityManagerHelper.closeEntityManager();
				
				parametros.setValue("serie", tvpconsulta.get(p).getApaddress());
				parametros.setValue("serieid", 0);	
				parametros.setValue("tipo", 30);

				paquete = new Comando280Tv(parametros).Comando280();
				System.out.println("paquete"+paquete);
				tamanio = Integer.toString(Paquete.PaqueteLength(paquete.toString()));
				tamanio = ""+(Integer.valueOf(tamanio)+6);
				
				parametros.setValue("Tamanio",String.format("%4s",Conversiones.DecimalToHexadecimal(tamanio)).replace(' ','0'));
				parametros.setValue("Paquete", paquete);
				parametros.setValue("Comando",String.format("%4s",Conversiones.DecimalToHexadecimal(""+280)).replace(' ','0'));
				parametros.setValue("LogId", 0);
				switch(sessionReportType)
				{
				case 5:
					cabecera.setIDEmpresa(65);
				     break;
				case 6:
					 cabecera.setIDEmpresa(96);
					 break;
				}
				parametros.cmd.setCabecera(cabecera);
				respuesta = new GuardarComandoTV().guardarACC(parametros);
				
				maxId = new TvpConsultatvfinishDAO().smax(this.sessionId,this.sessionReportType);
				System.out.println("SS"+maxId);
				
				EntityManagerHelper.beginTransaction();
				 tvpconsultafinish.setId(maxId);
				 tvpconsultafinish.setCpartyId(tvpconsulta.get(p).getCpartyId());
				 tvpconsultafinish.setCpartyIdAccount(tvpconsulta.get(p).getCpartyAccountId());
				 tvpconsultafinish.setDecoId(""+respuesta.getMensaje().getDatosExtrasTVP().getUnitAddres());
				 tvpconsultafinish.setDecoSerie(tvpconsulta.get(p).getApaddress());
				 limite = respuesta.getMensaje().getDatosExtrasTVP().getActivo().length();
				 Activo = respuesta.getMensaje().getDatosExtrasTVP().getActivo().substring(limite-1, limite);
				 if (Integer.valueOf(Activo) == 1)
				 {
					 estadoDeco = "A";
				 }
				 else
				 {
					 estadoDeco = "S";
				 }

				 tvpconsultafinish.setEstadoTitan(tvpconsulta.get(p).getActivitytype());
				 tvpconsultafinish.setEstadoControlador(""+estadoDeco);				 
				 tvpconsultafinish.setServicioTitan(""+tvpconsulta.get(p).getTariffPlanVariantName());
				 tvpconsultafinish.setServicioControlador(""+respuesta.getMensaje().getDatosExtrasTVP().getIdServ());
				 
				 tvpconsultafinish.setConsultatvId(tvpconsulta.get(p).getId());
				 tvpconsultafinish.setSessionId(tvpconsulta.get(p).getSessionId());
				 tvpconsultafinish.setPaychannelsTitan("");
				 //numeropaquete = respuesta.getMensaje().getDatosExtrasTVP().getNumPaq().getIdPay().size();
					if (respuesta.getMensaje().getDatosExtrasTVP().getNumPaq() != null)
					{
						for(int i=0;i<respuesta.getMensaje().getDatosExtrasTVP().getNumPaq().getIdPay().size();i++)
						{
							System.out.println("idPaquete"+respuesta.getMensaje().getDatosExtrasTVP().getNumPaq().getIdPay().get(i).getIdPay());
						}
					}
				 
				 tvpconsultafinish.setPaychannelsControlador("");	

				 tvpconsultafinish.setFecha(date);
				 
				new TvpConsultatvfinishDAO().update(tvpconsultafinish);
				EntityManagerHelper.commit();
				EntityManagerHelper.closeEntityManager();				
				
	    }

	    System.out.println("Salio del loop");
		/*
	    List<TvpConsultatvfinish> tvpconsultafinish = new TvpConsultatvfinishDAO().findAll();
	    
	    
	    for (int p=0; p<tvpconsultafinish.size();p++)
	    {
	    	
	    }
	    */
	    
		return paquete;
	}
	
	
	public StringBuilder ComandoACC801() throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException, Excepciones, UnsupportedEncodingException 
	{
		
		
		paquete.append("00000000433443313333303338384335001E");
		return paquete;
	}
	
}
