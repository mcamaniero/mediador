package com.app.tvp;


import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;

import tvcable.app.comarch.utils.Conversiones;

import com.app.dao.EntityManagerHelper;
//import com.app.tv.tvp_Dalvi.TvpDalvi;
//import com.app.tv.tvp_Dalvi.TvpDalviDAO;

import com.app.tv.tvp_Dalvi.dao.TvpDalvi;
import com.app.tv.tvp_Dalvi.dao.TvpDalviDAO;
import com.app.tv.tvp_ordenacc.dao.TvpOrdenacc;
import com.app.tv.tvp_ordenacc.dao.TvpOrdenaccDAO;
import com.app.tv.tvp_ordendac.dao.TvpOrdendac;
import com.app.tv.tvp_ordendac.dao.TvpOrdendacDAO;


import ec.com.grupotvcable.wsdltvpagada.*;


public class ObtenerCadena {

	private Respuesta respuesta = new ObjectFactory().createRespuesta();
	private Mensaje mensaje = new ObjectFactory().createMensaje();

	private Comando cmd;
	private boolean flag = true;

	private int contadorA = 2500;
	//private int contadorA = 3000;
	private int contadorB = 0;
	private int eventos = 0;
	private boolean si_continue = true;
	private boolean _continue = true;
	private int accion;
	private int ubicacion;
	private int usuario;
	private int interfase;
	private int comandores;
	private StringBuilder paquete801;
	private boolean pasarRecoleccion = false;
	private String mora;
	private Integer pass;
	
	/**
	 * @param args
	 */

	public ObtenerCadena(Comando comandos) {
		// TODO Auto-generated constructor stub
		cmd = comandos;
	}
	public Respuesta ConsultarEstadoDAC(ParametrosTV paquete, long clave) throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException,IOException, ParseException, Excepciones 
    {
		
	  usuario = paquete.cmd.getDetalle().getTVpagada().getTipoA();
	  interfase = paquete.cmd.getCabecera().getInterface();   
	  ubicacion = paquete.cmd.getDetalle().getTVpagada().getUbicacion();
	  
	  if ( (interfase == 700 && (usuario!= 500005 && usuario!= 500007 && usuario!= 500006 && usuario!= 500004 && usuario!= 500003) && ubicacion ==20) ||
		   (interfase == 702 && (usuario!= 500005 && usuario!= 500007 && usuario!= 500006 && usuario!= 500004 && usuario!= 500003) && ubicacion ==20) ||
		   (interfase == 704 && (usuario!= 500005 && usuario!= 500007 && usuario!= 500006 && usuario!= 500004 && usuario!= 500003) && ubicacion ==20) ||
		   (interfase == 703 && (usuario!= 500005 && usuario!= 500007 && usuario!= 500006 && usuario!= 500004 && usuario!= 500003) && ubicacion ==20) ||
		   (interfase == 713 && (usuario!= 500005 && usuario!= 500007 && usuario!= 500006 && usuario!= 500004 && usuario!= 500003) && ubicacion ==20) ||
		   (interfase == 714 && (usuario!= 500005 && usuario!= 500007 && usuario!= 500006 && usuario!= 500004 && usuario!= 500003) && ubicacion ==20) ||
		   (interfase == 807 && (usuario!= 500005 && usuario!= 500007 && usuario!= 500006 && usuario!= 500004 && usuario!= 500003) && ubicacion ==20) //||
		   //(interfase == 705 && (usuario!= 500005 && usuario!= 500007 && usuario!= 500006 && usuario!= 500004 && usuario!= 500003) && ubicacion ==20)
		   ) 
	  {		  
		  	mensaje.setCodError(1);
			mensaje.setDetMensaje("Peticion Enviada para Ejecucion en el Controlador");
			respuesta.setMensaje(mensaje);
			respuesta.setCabecera(cmd.getCabecera());
	  }
	  else
	  {
		while(flag)
		{
			TvpOrdendac ordenDAC = new TvpOrdendacDAO().findById(clave);
	        if (ordenDAC.getEstado().equals("R"))
	        {
	        	
	        	
	        	
	        	
	        	 if (interfase == 801)
	        	 {	
	        		 System.out.println("Entro al if");
	        		 paquete801 = new Comando801Tv(paquete).Comando801DAC();
	        	 }
	        	 else
	        	 {
			        	paquete.setValue("eTrama", new String(ordenDAC.getRespuesta(),"UTF8"));
			        	
			        	/***
			        	 * ajustar validacion para String index out of range : eStatusWork
			        	 */ 
			        	
			            paquete.setValue("eStatusWork", paquete.getValue("eTrama").toString().substring(0,4));
			            mensaje = new ValidaErrorTV(mensaje).ValidarErrorDAC(paquete);
			            if (mensaje.getDatosExtrasTVP().getUnitAddres()==1)
			            {
			            	si_continue = false;
			            }
			            
			            /***
			             * Cambios por fallos en comandos DAC
			             */
		/*	            if (interfase == 700 || interfase== 701 || interfase == 702 || interfase == 709 || interfase == 713 || paquete.cmd.getDetalle().getTVpagada().getAccion()==5 || ubicacion == 23)	            
			            {
			            	si_continue = false;
			            }*/
			            System.out.println("INTERFASE"+interfase);
			            mora = paquete.cmd.getDetalle().getTVpagada().getDatoC1();
			            
			            if (interfase == 716 || interfase == 701 || interfase == 702 || interfase == 807  || interfase == 713 || interfase == 700 || interfase == 709 || paquete.cmd.getDetalle().getTVpagada().getAccion()==5 || ubicacion == 23)	            
			            {
			            	if (interfase == 705 && (ubicacion == 23 || ubicacion ==20) )
			            	{
			            		si_continue = true;	
			            	}
			            	else
			            	{
			            		si_continue = false;
			            	}
			            }
		                //si_continue = true;
			            if (!Boolean.valueOf(paquete.getValue("repetir").toString()))
			            {
			            	si_continue = false;
			            }
	        }////////////////////////////////////////////////////////////////////////////////////////////////
	            		//new TvpOrdendacDAO().delete(ordenDAC);
	            flag = false;
	        }                       
	        else
	        {
	          if (ubicacion == 23)
	          {
	        	  contadorA = 6000;
	          }
		        try 
		        {
		           Thread.sleep(contadorA/2);
		           contadorB=contadorB+contadorA;
	           
		           if (contadorB == contadorA*50)
		           {
		        	   if (ubicacion==20)
		        	   {
		        		   mensaje.setCodError(5002);
		        		   mensaje.setDetMensaje("Su Peticion sera ejecutada Posteriormente en el Controlador ");
		        	   }
		        	   else if (ubicacion ==23)
		        	   {
		        		   mensaje.setCodError(5002);
		        		   mensaje.setDetMensaje("Su Peticion sera ejecutada posteriormente");		        		   
		        	   }

		        	   EntityManagerHelper.beginTransaction();
			        	   ordenDAC.setClave(clave);
			        	   ordenDAC.setComando(ordenDAC.getComando());
			        	   ordenDAC.setEstado("P");
			        	   ordenDAC.setPaquete(ordenDAC.getPaquete());
			        	   ordenDAC.setPuerto(ordenDAC.getPuerto());
			        	   ordenDAC.setRespuesta(ordenDAC.getRespuesta());
			        	   ordenDAC.setTamanio(ordenDAC.getTamanio());
		        	   EntityManagerHelper.commit();
		        	   EntityManagerHelper.closeEntityManager();
		        	   
		        	   flag = false;
		        	   si_continue = false;
		           }
		        } catch (InterruptedException e) {
		        // TODO Auto-generated catch block
		        e.printStackTrace();
		        }
	        }
	    }

		if (si_continue)
		 {
			 comandores = Integer.valueOf(Conversiones.HexadecimalToDecimal(paquete.getValue("Comando").toString()));
			 if (comandores ==724 && cmd.getDetalle().getTVpagada().getTipoC()==2 )
			 {
				 	comandores = 684;
			 }
			 System.out.println("ComandRes"+comandores);
			 System.out.println("LASTFLAG"+Integer.valueOf(paquete.getValue("lastFlag").toString()));
			 pass = Integer.valueOf(paquete.getValue("lastFlag").toString());
		  switch(Integer.valueOf(comandores))			 
	      {
		  
		  
	         case 760:
		        	System.out.println("Mensaje+/");
	        	accion = paquete.cmd.getDetalle().getTVpagada().getAccion();
	        	//if (paquete.cmd.getDetalle().getTVpagada().getAccion()!=5)
	        	/*if (accion!=5)
	        	{
	        			System.out.println("Refresh");
	        			respuesta = new Comando680Tv(paquete).EjecutarReset();
	        	}*/
	        //	System.out.println("Entro");
	        	/*System.out.println("mora"+mora);
	        	if (mora.equals("1"))
	        	{
	        		interfase = 782;
	        	}*/
	        	
	         if (this._continue)	
	         {	 
	        	 System.out.println("Mensaje+/++");
	        	switch (interfase)
	        	{
	        		case 700:
	        			respuesta = new Comando760Tv(paquete).EjecutarRefresh();
	        			break;
	        			
	        		case 702:
	        			respuesta = new Comando760Tv(paquete).EjecutarRefresh();
	        			break;
	        			
	        		case 713:
	        			respuesta = new Comando760Tv(paquete).EjecutarChange();
	        			break;
	        			
	        		case 782:
	        		//	respuesta = new Comando760TvMora(paquete).ComandoDAC760();
	        			break;
	        		
	        	}
	         }	
	         break;
	         // Esto para verificar si estamos realizando el comando de consulta o si estamos realizando
	         // el comando de recoleccion individual
	        case 684:

	        	 
	         	 eventos = Integer.valueOf(paquete.getValue("lastFlag").toString());

	        	 if(cmd.getDetalle().getTVpagada().getTipoC()==2 && eventos !=0)
		            {
		               //while(eventos  !=5)
		               //{
			                //respuesta = new Comando724Tv(paquete).EjecutarRecoleccionIndividual();
			                //eventos = respuesta.getMensaje().getDatosExtrasTVP().getUnitAddres();
	        		        //System.out.println("PPV antes-"+eventos);
	        		        //System.out.println("PASO");
			                if (eventos !=5)
			                {
			                  //System.out.println("PPV despues-"+eventos);
			                  new Comando724Tv(paquete).EjecutarEnvioConfirmacion();
			                  mensaje.setCodError(20001);
			                  mensaje.setDetMensaje("Recoleccion realizada con Exito");
			                  respuesta.setMensaje(mensaje);
			                  
			                  pasarRecoleccion=true;
			                }
			                else
			                {
			                	if (pasarRecoleccion)
			                	{
			                	  new Comando724Tv(paquete).EjecutarEnvioConfirmacion();
			                	  mensaje.setCodError(20002);
					              mensaje.setDetMensaje("El Equipo no posee Eventos Cargados");
					              respuesta.setMensaje(mensaje);
					              pasarRecoleccion = false;
					             // System.out.println("paso por true");
			                	}else
			                	{
			                		 // System.out.println("paso por false");
				                	  mensaje.setCodError(20002);
						              mensaje.setDetMensaje("El Equipo no posee Eventos Cargados");
						              respuesta.setMensaje(mensaje);			                		
			                	}
			                }
		           }
	        	 
		           else
		           {
		        	//new Comando724Tv(paquete).EjecutarEnvioConfirmacion();
		            respuesta.setMensaje(mensaje);
		            respuesta.setCabecera(cmd.getCabecera());
		           }
	        break;
	        
	        case 726:
	        	if (pass==5||pass==0)
	        	{
	        		respuesta.setMensaje(mensaje);
		            respuesta.setCabecera(cmd.getCabecera());
	        	}else
	        	{
	        		new Comando724Tv(paquete).EjecutarEnvioConfirmacion();
	        	}
	        	
	        	break;
	        
	        case 801:
	        	/****
	        	 * 
	        	 */
	        	paquete801 = new Comando801Tv(paquete).Comando801DAC();
	        	
	        	/****
	        	 */
	        	
	        	break;
	        
	        default:
	        	
	        	System.out.println("Mensaje"+mensaje);
	            respuesta.setMensaje(mensaje);
	            respuesta.setCabecera(cmd.getCabecera());
	         }
		 }
		 else
		 {
	        	System.out.println("Mensaje"+mensaje);			 
			respuesta.setMensaje(mensaje);
			respuesta.setCabecera(cmd.getCabecera());
		 }
	 }
		 return respuesta;
    }

	 public Respuesta ConsultarEstadoACC(ParametrosTV paquete, long clave) throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException, UnsupportedEncodingException

     {
		 usuario = paquete.cmd.getDetalle().getTVpagada().getTipoA();
		 interfase = paquete.cmd.getCabecera().getInterface(); 
		 ubicacion = paquete.cmd.getDetalle().getTVpagada().getUbicacion();
		 //System.out.println("Usuario"+usuario+"Ubicacion"+ubicacion+"Interfase"+interfase);
	  /*if ( (interfase == 700 && (usuario!= 500005 && usuario!= 500004 && usuario!= 500003) && ubicacion ==20) ||
		   (interfase == 702 && (usuario!= 500005 && usuario!= 500004 && usuario!= 500003) && ubicacion ==20) ||
		   (interfase == 704 && (usuario!= 500005 && usuario!= 500004 && usuario!= 500003) && ubicacion ==20) ||
		   (interfase == 703 && (usuario!= 500005 && usuario!= 500004 && usuario!= 500003) && ubicacion ==20))
	  {		*/
		  
	  if ( (interfase == 700 && (usuario!= 500005 && usuario!= 500007 && usuario!= 500006 && usuario!= 500004 && usuario!= 500003) && ubicacion ==20) ||
		   (interfase == 702 && (usuario!= 500005 && usuario!= 500007 && usuario!= 500006 && usuario!= 500004 && usuario!= 500003) && ubicacion ==20) ||
		   (interfase == 704 && (usuario!= 500005 && usuario!= 500007 && usuario!= 500006 && usuario!= 500004 && usuario!= 500003) && ubicacion ==20) ||
		   (interfase == 703 && (usuario!= 500005 && usuario!= 500007 && usuario!= 500006 && usuario!= 500004 && usuario!= 500003) && ubicacion ==20) ||
		   (interfase == 713 && (usuario!= 500005 && usuario!= 500007 && usuario!= 500006 && usuario!= 500004 && usuario!= 500003) && ubicacion ==20) ||
		   (interfase == 714 && (usuario!= 500005 && usuario!= 500007 && usuario!= 500006 && usuario!= 500004 && usuario!= 500003) && ubicacion ==20))		 
	  {   
			mensaje.setCodError(1);
			mensaje.setDetMensaje("Peticion Enviada para Ejecucion en el Controlador");
			respuesta.setMensaje(mensaje);
			respuesta.setCabecera(cmd.getCabecera());
	  }
	  else
	  {		 
	     while(flag)
	     {
	          TvpOrdenacc ordenACC = new TvpOrdenaccDAO().findById(clave);
	          if (ordenACC.getEstado().equals("R"))
	          {
	        	  System.out.println("Interfase"+interfase);
	        	 if (interfase == 801)
	        	 {	
	        		 System.out.println("Entro al if");
	        		 paquete801 = new Comando801Tv(paquete).Comando801();
	        	 }
	        	 else
	        	 {
		        	  paquete.setValue("eTrama", new String(ordenACC.getRespuesta(),"UTF8"));
		              paquete.setValue("eStatusWork", paquete.getValue("eTrama").toString().substring(0,4));
		              mensaje = new ValidaErrorTV(mensaje).ValidarErrorACC(paquete);;
	             //new TvpOrdenaccDAO().delete(ordenACC);
	        	 }
	             flag = false;
	          }                       
	          else
	          {
			     try 
			     {
			           Thread.sleep(contadorA);
			           contadorB=contadorB+contadorA;

			           if (contadorB == contadorA*100)
			           {
			        	   mensaje.setCodError(5002);
			        	   mensaje.setDetMensaje("Su Peticion sera ejecutada posteriormente");

			        	   EntityManagerHelper.beginTransaction();
				        	   ordenACC.setClave(clave);
				        	   ordenACC.setComando(ordenACC.getComando());
				        	   ordenACC.setEstado("P");
				        	   ordenACC.setPaquete(ordenACC.getPaquete());
				        	   ordenACC.setPuerto(ordenACC.getPuerto());
				        	   ordenACC.setRespuesta(ordenACC.getRespuesta());
				        	   ordenACC.setTamanio(ordenACC.getTamanio());
			        	   EntityManagerHelper.commit();
			        	   EntityManagerHelper.closeEntityManager();
			        	   
			        	   flag = false;
			           }
		         } catch (InterruptedException e) {
			        // TODO Auto-generated catch block
		        	 e.printStackTrace();
			     }         
	          }
	    }
	    respuesta.setMensaje(mensaje);
	    respuesta.setCabecera(cmd.getCabecera());
	  }
	    return respuesta; 
   }
	 
   public Respuesta ConsultarEstadoDALVI(ParametrosTV paquete, long clave) throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException, IOException
   {
	   	usuario = paquete.cmd.getDetalle().getTVpagada().getTipoA();
		interfase = paquete.cmd.getCabecera().getInterface(); 
		ubicacion = paquete.cmd.getDetalle().getTVpagada().getUbicacion();
	  /*if ( (interfase == 700 && (usuario!= 500005 && usuario!= 500004 && usuario!= 500003) && ubicacion ==20) ||
		   (interfase == 702 && (usuario!= 500005 && usuario!= 500004 && usuario!= 500003) && ubicacion ==20) ||
		   (interfase == 704 && (usuario!= 500005 && usuario!= 500004 && usuario!= 500003) && ubicacion ==20) ||
		   (interfase == 703 && (usuario!= 500005 && usuario!= 500004 && usuario!= 500003) && ubicacion ==20))
		  {		  	  */
		  
		  if ( (interfase == 700 && (usuario!= 500005 && usuario!= 500007 && usuario!= 500006 && usuario!= 500004 && usuario!= 500003) && ubicacion ==20) ||
			   (interfase == 702 && (usuario!= 500005 && usuario!= 500007 && usuario!= 500006 && usuario!= 500004 && usuario!= 500003) && ubicacion ==20) ||
			   (interfase == 704 && (usuario!= 500005 && usuario!= 500007 && usuario!= 500006 && usuario!= 500004 && usuario!= 500003) && ubicacion ==20) ||
			   (interfase == 703 && (usuario!= 500005 && usuario!= 500007 && usuario!= 500006 && usuario!= 500004 && usuario!= 500003) && ubicacion ==20))
		  {
				mensaje.setCodError(1);
				mensaje.setDetMensaje("Peticion Enviada para Ejecucion en el Controlador");
				respuesta.setMensaje(mensaje);
				respuesta.setCabecera(cmd.getCabecera());
		  }
		  else
		  {	   
	   
			while (flag)
			{
		      //TvpDalvi tvpDalvi = new TvpDalviDAO().findById(clave);
		      TvpDalvi tvpDalvi = new TvpDalviDAO().findById(Long.valueOf(paquete.getValue("LogId").toString()));
		      if (tvpDalvi.getEstado().equals("R"))
		      {
		      	paquete.setValue("eTrama",""+tvpDalvi.getRespuesta());
		        paquete.setValue("eStatusWork",""+tvpDalvi.getComando());
		        mensaje = new ValidaErrorTV(mensaje).ValidarErrorDALVI(paquete);
		    	  //mensaje = new ValidaErrorTV(mensaje).ValidarErrorDALVI(tvpDalvi.getComando());
		         flag = false;
		      }                       
		      else
		      {
			     try 
			     {
			           Thread.sleep(contadorA);
			           contadorB=contadorB+contadorA;
			           
			           if (contadorB == contadorA*100)
			           {
			        	   mensaje.setCodError(5002);

			        	   mensaje.setDetMensaje("Su Peticion sera ejecutada posteriormente");
		
			        	   EntityManagerHelper.beginTransaction();
				        	   tvpDalvi.setId(clave);
				        	   tvpDalvi.setComando(tvpDalvi.getComando());
				        	   tvpDalvi.setEstado("P");
				        	   tvpDalvi.setTrama(tvpDalvi.getTrama());
				        	   tvpDalvi.setRespuesta(tvpDalvi.getRespuesta());   
			        	   EntityManagerHelper.commit();
			        	   EntityManagerHelper.closeEntityManager();
			        	   flag = false;
			        	   //si_continue = false;
			           
			           }
		         } catch (InterruptedException e) {
			        // TODO Auto-generated catch block
		        	 e.printStackTrace();
			     }         
		      }
			}
			respuesta.setCabecera(cmd.getCabecera());
			respuesta.setMensaje(mensaje);
		  }
		  return respuesta;
   }	 
 }