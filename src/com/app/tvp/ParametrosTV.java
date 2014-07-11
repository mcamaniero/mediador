package com.app.tvp;


import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import tvcable.app.comarch.utils.Conversiones;

import com.app.tv.adm_promociones.dao.AdmPromociones;
import com.app.tv.adm_promociones.dao.AdmPromocionesDAO;
import com.app.tv.tvp_channelmap.dao.TvpChannelmap;
import com.app.tv.tvp_channelmap.dao.TvpChannelmapDAO;
import com.app.tv.tvp_equicomandos.dao.*;
import com.app.tv.tvp_equivalencias.*;
import com.app.tv.tvp_equivalencias.dao.TvpEquivalencias;
import com.app.tv.tvp_equivalencias.dao.TvpEquivalenciasDAO;

//import com.app.tv.tvp_promociones.dao.*;
import com.app.tv.tvp_ordendac.dao.TvpOrdendac;
import com.app.tv.tvp_ordendac.dao.TvpOrdendacDAO;

import com.app.tv.tvp_tipodeco.dao.*;

import ec.com.grupotvcable.wsdltvpagada.*;


public class ParametrosTV extends baseClass
{
	// Datos Extras para el DAC, seteados dependiendo de ciudad.
	protected int bsiciudad =0;
	protected int vcm = 0;
	protected int headend =0;
	protected int down = 0;
	protected int up = 0;
	protected int region = 0;
	protected int ciu;

	//Datos del Comando 680
	protected int Credito;
			
	// Datos del comando.
	protected int comando;
	protected String ippv;
	protected int controlador;
	protected int codcomando;
	protected String codComandoDth;

	// Datos de la Orden a enviar a la Base.
	protected String Tamanio;
	protected String Comando;
	protected StringBuilder Paquete;
	protected int idServicio;
	protected int idPaquete;
	protected String idConvertidor;
	

	// Datos de Servicios y Paquetes recibidos del WSDL
	protected int Int_Servicio;
	protected StringBuilder Int_Paquete;
	protected Integer servicioadi[];
    protected ArrayList<Integer> paqueteadi = new ArrayList<Integer> (5);
    protected ArrayList<Integer> eventoadi = new ArrayList<Integer> (5);
	private List<IdPaquete> lstpaquete = null;
	
	
	// Datos del RecordType
	protected String eStatusWork;
	protected String eData;
	protected String eTrama;
	protected Integer LogId;
	
	// Datos Extra para envio de Comandos
	protected int equiptype = 4002;
	
	protected Comando cmd;
   
	protected String lastFlag = "0";
	
	protected boolean PuertoPrueba = true;//para definir los puertos que se ejecuten en desarrollo o produccion
	protected int ciudadservicio = 0;
	//protected boolean PuertoPrueba = false;	

	//Para Comandos DALVI
	protected StringBuilder cadenaComando;
	private Integer paqueteTitan;
	private List<TvpEquivalencias> equiv;
	private int tipod;
	private int ciudadDalvi;
	private String DUPL = null;
	private String DUP = null;
	private int finalserie;

	//Para Channel Map
	protected StringBuilder stringChannel = new StringBuilder();
	
	private StringBuilder paquete = new StringBuilder();
	/**
	 * Para Turnos TvPagada
	**/
	
	protected int idControlador=0;
	
	protected int idEmpresaPr = 0;
	protected int InterfasePr = 0; 
	protected int ClientePr = 0;				//Codigo del Contrato
	protected String SeriePr = "";        //Serie del Equipo
	protected String Serie = "";        //Serie del Equipo	
	protected int idServicioPr=0;			//Servicio de Archivo Excel	
	protected String idConvertidorPr="";
	protected String idPaquetesPr ="";		//Paquetes separados por guion - Tomados del Archivo Excel
	protected String idEventoPr = "";		//90903 Emelce 90905 liga
	protected String accionPr = "";			      
	protected int tipoDPr= 0;
	private int ciudad;
	private int intPaquetes;
	private String payChannelMap = "";
	private String ChannelMap;
	protected int contar;
	private int c = 0;
	private int intpa;
	private int cantidadCodigos;
	private String con;
	protected boolean repetir = true;
	
	
	/**
	 * Para Auditoria
	 */
	protected String numeroserieaudit = "";
	protected int tipoaudit = 0;
	protected int serieidaudit = 0;
	private Integer activarpaquete;
	private int count;
		private String msg = "";
	private String bit ="";
	private String cuenta ="";
	private String location_code ="";
	private String STB = "";
	private String Treatment="";
	private String FIPS="";
	private StringBuilder account_id = new StringBuilder();

    protected int tipodeco = 0;
    protected int ciudaddeco = 0;
    
	public ParametrosTV(Comando comandos) {
		cmd = comandos;
	}
    
	
	/** 
	 *  Setea las variables: BSI,VCM,HEAD,DOWN,UP,REGION
	 *  dependiendo de la ciudad.
	 *  
	 * @param ciudad
	 */
	public void Setearciudad(int ciudadSetear)
	{
		//this.ciu = ciudad;
		int ciudad = ciudadSetear;
		/**
		 * Escoger bsi para enviar provsioning 
		 **/	
		
		//switch(this.ciu)
		//switch(ciudadSetear)
		switch(ciudad)
		{
		case 94:
			bsiciudad = 2;
			vcm = 2;
			//vcm = 42;
			headend = 2;
			up = 113;
			down = 2;
			region = 1;
			break;
		case 63:
			bsiciudad = 1;
			vcm = 11;
			headend = 1;
			up = 11;
			down = 1;
			region = 2;
			break;
			
		case 65:
			bsiciudad = 3;
			vcm = 50;
			headend = 3;
			up = 350;
			down = 3;
			region = 3;
			break;

		case 96: //Machala
			bsiciudad = 4;
			vcm = 60;
			headend = 4;
			up = 360;
			down = 4;
			region = 4;
			break;

		case 67: //Ambato
			bsiciudad = 6;
			vcm = 80;
			headend = 6;
			up = 380;
			down = 6;
			region = 6;
			break;	

		case 98: //Manta
			bsiciudad = 5;
			vcm = 70;
			headend = 5;
			up = 370;
			down = 5;
			region = 5;
			break;

			
		case 95: //Manta
			bsiciudad = 5;
			vcm = 70;
			headend = 5;
			up = 370;
			down = 5;
			region = 5;
			break;

			
			
		case 99: //Manta
			bsiciudad = 7;
			vcm = 90;
			headend = 7;
			up = 0;
			down = 7;
			region = 7;
			break;
		}
	}

	
	/**
	 * Define el comando correcto en base al controlador enviado.
	 * y setea los datos: Controlador, comando y IPPV (este ultimo para verificar si el deco
	 * puede comprar por control remoto)
	 * 
	 * @param controladores
	 * @param comandotv
	 * @param tipodeco
	 */
	public void Definircomando(int controladores, int comandotv,int tipodeco) 

	{
		comando = comandotv;
		controlador = controladores;
		TvpEquicomandos Comand = new TvpEquicomandosDAO().findById(comando);
		if (controladores == 100)
		{
			ippv = new TvpTipodecoDAO().findById(tipodeco).getIppv();
		}
			
		switch (controlador)
		{
		case 100 :
			codcomando = Comand.getCodigoDac();
			break;        
		case 101 :
			codcomando = Comand.getCodigoAcc();
			break;	      
		case 102 :
			codcomando = Comand.getCodigoDalvi();
			break;
		case 103 :
			codComandoDth = Comand.getCodigoDth();
			break;
		default :
			codcomando = Comand.getCodigoDac();
		}
	}
	
	/**
	 * Calcula el valor del credito de la caja en funcion del servicio, forma de pago
	 * credito anterior y numero de decos.
	 * 
	 * @param servicio
	 * @param formaP
	 * @param creditocmd
	 * @param numdecos
	 */
	public int CalculaCredito(int servicio, String formaP, int creditocmd, int numdecos)
	{
		List<TvpEquivalencias> Cred = new TvpEquivalenciasDAO().findByCodigoTitan(servicio);
		if (creditocmd != 0 && formaP != null && numdecos == 0) 
		{
			if (formaP.equals("OFI"))   // Si la forma de pago es Oficina
			{
				Credito = 10;
			}
			else if (numdecos > 1)  // Si el numero de decos del contrato es mayo de 1 entonces es otro credito asignado.
				{
				 Credito = Cred.get(0).getCadicional();
				}
				else   // Si no el credito es el normal.
				{
				 Credito = Cred.get(0).getCprincipal();	
				}
		   }
		return Credito;
	}
	/**
	 * Verifica los codigos extras de los servicios o paquetes,
	 * exclusivo para DAC.
	 * 
	 * @param servicio
	 * @param paquete
	 */
	public void VerificarCodigoExtra(int servicioTitan, int[] paquete, int servicio, int[] paqueteSP)
	{
		  	// Verifico primero los codigos extras de los servicios.
					
		List<TvpEquivalencias> Numserv = new TvpEquivalenciasDAO().findByFourPropertiesFull("codigoTitan", servicioTitan, "tequivalencia", "S","codigoInterno",servicio, "tcontrolador", controlador,"ciudadServicio",this.ciudadservicio);
			servicioadi = new Integer[Numserv.size()];

		    for (int i=0; i < Numserv.size(); i++)
			{
			 servicioadi[i] = Numserv.get(i).getCodigoInterno();
			}
		    
		    List<TvpEquivalencias> NumServpaq = new TvpEquivalenciasDAO().findByThreePropertiesString("codigoTitan", servicioTitan, "tequivalencia", "P","tcontrolador",controlador);

		    for (int p=0; p<NumServpaq.size();p++)
		    {
		    	paqueteadi.add(NumServpaq.get(p).getCodigoInterno());
		    }
		    /*
            if (tipodeco > 0)
            {
              paqueteadi.add(32769);
              
            }*/
		    if (ciudaddeco == 94 || ciudaddeco == 63)
		    {
		     
			    if (tipodeco == 4002 || tipodeco == 4082 || tipodeco == 7032)
			    {
			    	System.out.println("entro harvest");
			    	paqueteadi.add(32769);   	
			    }
		    }


			// Verifico los codigos extras de los paquetes.
		    /*
		    if (paqueteSP != null)
		    {
		    	//System.out.println("PaqueteSP"+paqueteSP.length);
				for (int k=0; k < paqueteSP.length; k++)
				{
					System.out.println("paqueteSP"+paqueteSP[k]);
					
					if (paqueteSP[k] != 0)
					{
						paqueteadi.add(paqueteSP[k]);
						List<TvpEquivalencias> Numpaq = new TvpEquivalenciasDAO().findByThreePropertiesPackageTitan("codigoInterno", paqueteSP[k], "tequivalencia", "P","tcontrolador",controlador);
						paqueteTitan = Numpaq.get(0).getCodigoTitan();
						System.out.println("---paqueteTitan---"+paqueteTitan);
						List<TvpEquivalencias> NumpaqControlador = new TvpEquivalenciasDAO().findByThreePropertiesPackageControlador("codigoTitan", paqueteTitan, "tequivalencia", "P","tcontrolador",controlador);

						for (int j=0; j < NumpaqControlador.size(); j++)
						{

						 paqueteadi.add(NumpaqControlador.get(j).getCodigoInterno());
						}
					}
				}
		    }*/
		    
		    List<TvpEquivalencias> NumServeve = new TvpEquivalenciasDAO().findByThreePropertiesString("codigoTitan", servicioTitan, "tequivalencia", "C","tcontrolador",controlador);
		    if (!NumServeve.isEmpty())
		    {
//		    System.out.println("Eventoadi-"+NumServeve.size());
		    
		    	for (int j=0; j < NumServeve.size();j++)
		    	{
//		    			System.out.println("Evento-"+NumServeve.get(j).getCodigoInterno());
		    			this.eventoadi.add(NumServeve.get(j).getCodigoInterno());		    			
		    	}
		    }
		    
		    

	}
	
	/**
	 * 
	 * Obtiene el codigo del Servicio enviado por Titan y se encarga de escoger
	 * el valor del paquete segun su homologacion y ciudad
	 * 
	 * @param parametros
	 * @throws IllegalArgumentException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 * @throws Excepciones

	 */
	
	
	public void SetearServicio(ParametrosTV parametros) throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException, Excepciones
	{
		tipod = parametros.cmd.getDetalle().getTVpagada().getTipoD() ;
		ciudad = parametros.cmd.getCabecera().getIDEmpresa();
					 
		if (tipod != 10001 && tipod != 10002 && tipod != 100002 && tipod != 100003)
		{
			if (ciudad == 65 || ciudad == 96)
			{
				//equiv = new TvpEquivalenciasDAO().findByThreePropertiesCiudad("codigoTitan",parametros.cmd.getDetalle().getTVpagada().getIdServicio() , "tcontrolador", controlador, "tequivalencia","S","cprincipal",ciudad);
				equiv = new TvpEquivalenciasDAO().findByThreePropertiesCiudad("codigoTitan",parametros.cmd.getDetalle().getTVpagada().getIdServicio() , "tcontrolador", controlador, "tequivalencia","S","ciudadServicio",ciudad);
			}
			else
			{
//				System.out.println("aa"+parametros.cmd.getDetalle().getTVpagada().getIdServicio());
				//equiv = new TvpEquivalenciasDAO().findByThreeProperties("codigoTitan",parametros.cmd.getDetalle().getTVpagada().getIdServicio() , "tcontrolador", controlador, "tequivalencia","S");
				equiv = new TvpEquivalenciasDAO().findByThreePropertiesCiudad("codigoTitan",parametros.cmd.getDetalle().getTVpagada().getIdServicio() , "tcontrolador", controlador, "tequivalencia","S","ciudadServicio",ciudad);
			}
		}
		else
		{
			ciudadDalvi = parametros.cmd.getCabecera().getIDEmpresa();
//			System.out.println("Controlador"+controlador);
//			System.out.println("Controlador///////////////");
			equiv = new TvpEquivalenciasDAO().findByThreePropertiesDALVI("codigoTitan",parametros.cmd.getDetalle().getTVpagada().getIdServicio() , "tcontrolador", controlador, "tequivalencia","S","ciudadServicio",ciudadDalvi);
		}

		try
		{
			this.setValue("idServicio", Integer.valueOf(equiv.get(0).getCodigoInterno()));
		}
		catch(Exception e)
		{
			throw new Excepciones(6);
		}
	}
	/**
	 * 
	 * Obtiene el codigo del Paquete enviado por Titan y se encarga de escoger
	 * el valor del paquete segun su homologacion y ciudad
	 * 
	 * @param parametros
	 * @throws IllegalArgumentException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 * @throws Excepciones

	 */
	public void SetearPaquete(ParametrosTV parametros,int idpaquete) throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException, Excepciones
	{		
//	System.out.println("Entro SetearPaquete");
		List<TvpEquivalencias> equiv = new TvpEquivalenciasDAO().findByThreeProperties("codigoTitan",idpaquete , "tcontrolador", controlador, "tequivalencia","P");
			
	    
		try
		{
//			System.out.println("idPaquete"+ Integer.valueOf(equiv.get(0).getCodigoInterno()));
	    	this.setValue("idPaquete", Integer.valueOf(equiv.get(0).getCodigoInterno()));
	    	/*
		    List<TvpEquivalencias> NumServeve = new TvpEquivalenciasDAO().findByThreePropertiesString("codigoTitan", idpaquete, "tequivalencia", "C","tcontrolador",controlador);
		    if (!NumServeve.isEmpty())
		    {
		    System.out.println("Eventoadi-"+NumServeve.size());
		    
		    	for (int j=0; j < NumServeve.size();j++)
		    	{
		    			System.out.println("Evento-"+NumServeve.get(j).getCodigoInterno());
		    			this.eventoadi.add(NumServeve.get(j).getCodigoInterno());		    			
		    	}
		    }*/
	    	

		}
		catch (Exception e)
		{
			throw new Excepciones(15);
		}
	    
	}

	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public void SetearPaqueteDALVI(ParametrosTV parametros,int idpaquete) throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException, Excepciones
	{		
//	System.out.println("Entro SetearPaquete");
		List<TvpEquivalencias> equiv = new TvpEquivalenciasDAO().findByThreePropertiesDALVI("codigoTitan",idpaquete , "tcontrolador", controlador, "tequivalencia","P","ciudadServicio",parametros.cmd.getCabecera().getIDEmpresa());
			
	    
		try
		{
//			System.out.println("idPaquete"+ Integer.valueOf(equiv.get(0).getCodigoInterno()));
	    	this.setValue("idPaquete", Integer.valueOf(equiv.get(0).getCodigoInterno()));
	    	/*
		    List<TvpEquivalencias> NumServeve = new TvpEquivalenciasDAO().findByThreePropertiesString("codigoTitan", idpaquete, "tequivalencia", "C","tcontrolador",controlador);
		    if (!NumServeve.isEmpty())
		    {
		    System.out.println("Eventoadi-"+NumServeve.size());
		    
		    	for (int j=0; j < NumServeve.size();j++)
		    	{
		    			System.out.println("Evento-"+NumServeve.get(j).getCodigoInterno());
		    			this.eventoadi.add(NumServeve.get(j).getCodigoInterno());		    			
		    	}
		    }*/
	    	

		}
		catch (Exception e)
		{
			throw new Excepciones(15);
		}
	    
	}

	
	/**
	 * 
	 * Obtiene el codigo del Paquete enviado por Titan y se encarga de escoger
	 * el valor del paquete segun su homologacion y ciudad
	 * 
	 * @param parametros
	 * @throws IllegalArgumentException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 * @throws Excepciones

	 */
	public void SetearPaqueteExtra(ParametrosTV parametros,int idpaquete) throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException, Excepciones
	{		
	
		// Verifico los codigos extras de los paquetes.
	    
		
		
		List<TvpEquivalencias> equiv = new TvpEquivalenciasDAO().findByThreeProperties("codigoTitan",idpaquete , "tcontrolador", controlador, "tequivalencia","P");
			
	    
		try
		{
//			System.out.println("idPaquete"+ Integer.valueOf(equiv.get(0).getCodigoInterno()));
	    	this.setValue("idPaquete", Integer.valueOf(equiv.get(0).getCodigoInterno()));
	    	//System.out.println("Paquete 1-"+equiv.get(0).getCodigoInterno());
			paqueteadi.add(Integer.valueOf(equiv.get(0).getCodigoInterno()));
			
			List<TvpEquivalencias> NumpaqControlador = new TvpEquivalenciasDAO().findByThreePropertiesPackageDigitalControlador("codigoTitan", idpaquete, "tequivalencia", "P","tcontrolador",controlador,"ciudadServicio",parametros.cmd.getCabecera().getIDEmpresa());

			for (int j=0; j < NumpaqControlador.size(); j++)
			{
			//	System.out.println("Paquete-"+j+"-"+NumpaqControlador.get(j).getCodigoInterno());
			 paqueteadi.add(NumpaqControlador.get(j).getCodigoInterno());
			}
	    	
	    	
	    	
		    List<TvpEquivalencias> NumServeve = new TvpEquivalenciasDAO().findByThreePropertiesString("codigoTitan", idpaquete, "tequivalencia", "C","tcontrolador",controlador);
		    if (!NumServeve.isEmpty())
		    {
//		    System.out.println("Eventoadi-"+NumServeve.size());
		    
		    	for (int j=0; j < NumServeve.size();j++)
		    	{
//		    			System.out.println("Evento-"+NumServeve.get(j).getCodigoInterno());
		    			this.eventoadi.add(NumServeve.get(j).getCodigoInterno());		    			
		    	}
		    }
	    	

		}
		catch (Exception e)
		{
			throw new Excepciones(6);
		}
		
		
		/////////////////////////////////////////////////




	}
	
	
	/**
	 * 
	 * Selecciona el PayChannel especificado para cada combinacion de Servicios
	 * y Paquetes - Esto esta indicado para la ciudad de Machala
	 * 
	 * @param parametros
	 */
	public void Paychannelsmap(ParametrosTV parametros)
	{
		lstpaquete = parametros.cmd.getDetalle().getTVpagada().getIdPaquetes().getIdPaquete();
    	intPaquetes = lstpaquete.size();
    	
    	if (ciudad == 96)
    	{
	        //for (int i=0;i<intPaquetes/2;i++)// desde SP
    		for (int i=0;i<intPaquetes;i++) //desde Titan
	        {	
	        	if (lstpaquete.get(i).getIdPaquete()>0)
	        	{   //intpa = (intPaquetes/2)-1;
	        		//if (i==(intPaquetes/2)-1) //desde SP
	        		if (i==(intPaquetes)-1) //desde Titan	        			
	        		{
	        			stringChannel.append(""+lstpaquete.get(i).getIdPaquete());
	        		}
	        		else
	        		{
	        			stringChannel.append(""+lstpaquete.get(i).getIdPaquete());
	        			stringChannel.append("-");
	        		}
	        	}
	        	else
	        	{
	        		stringChannel.append("x");
	        	}
	        	
	        }
	        
    	}
//    	System.out.println();
    	
	}
/**
 * 
 * Para validar el que ChannelMap Escoger, Esto debido a la variedad de Channel Maps 
 * existentes para evitar pirateria
 * 
 * @param parametros
 * @return
 * @throws IllegalArgumentException
 * @throws SecurityException
 * @throws IllegalAccessException
 * @throws NoSuchFieldException
 * @throws Excepciones
 */	
	public String ChannelMapCiudad(ParametrosTV parametros) throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException, Excepciones
	{	
		    if (parametros.cmd.getDetalle().getTVpagada().getIdPaquetes() != null)
		    {
		    	if (payChannelMap.equals("y"))
		    	{
		    		
		    		ChannelMap = "1";
		    	}
		    	else
		    	{
		    		payChannelMap = parametros.getValue("stringChannel").toString();
		    		if (payChannelMap.equals("x"))
		    		{
		    			c= 0;
		    		}
		    		else
		    		{
		    			c = 1;
		    		}
		    			    		
		    		if (c!=0)
		    		{
//		    			System.out.println("Entro ");
//		    			System.out.println("*-*-"+payChannelMap);
			    		List<TvpChannelmap> channel = new TvpChannelmapDAO().findByServicePay("servicioId", parametros.cmd.getDetalle().getTVpagada().getIdServicio(), "paqueteId", payChannelMap);
			    		
			    		try
			    		{
			    			ChannelMap = channel.get(0).getChannelMapId().toString();
			    		}
			    		catch(Exception e)
			    		{
			    			//throw new Excepciones(13);
			    			ChannelMap = "1";
			    		}
		    		}
		    		else
		    		{
				    	List<TvpChannelmap> channel = new TvpChannelmapDAO().findByServicePay("servicioId", parametros.cmd.getDetalle().getTVpagada().getIdServicio(), "paqueteId", "0");
				    	try
				    	{
				    		ChannelMap = channel.get(0).getChannelMapId().toString();
				    	}
				    	catch(Exception e)
				    	{
				    		//throw new Excepciones(13);
				    		ChannelMap = "1";
				    	}
		    		}
		    	}
		    }
		    else
		    {
		    	
			    	List<TvpChannelmap> channel = new TvpChannelmapDAO().findByServicePay("servicioId", parametros.cmd.getDetalle().getTVpagada().getIdServicio(), "paqueteId", "0");
			    	try
			    	{
			    		ChannelMap = channel.get(0).getChannelMapId().toString();
			    	}
			    	catch(Exception e)
			    	{
			    		//throw new Excepciones(13);
			    		ChannelMap = "1";
			    	}		    	
		    }
		    
		    return ChannelMap;
	}
	
	/**
	 * Esto se lo desarrollo para poder seleccionar el paquete homologado para
	 * el controlador ACC
	 * 
	 * @param parametros
	 * @param idpaquete
	 * @throws IllegalArgumentException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 * @throws Excepciones
	 */
	public void SetearPaqueteSP(ParametrosTV parametros,int idpaquete) throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException, Excepciones
	{		
		ciudad = parametros.cmd.getCabecera().getIDEmpresa();
		this.paqueteadi.clear();
		count=0;		
		List<TvpEquivalencias> equiv = new TvpEquivalenciasDAO().findByThreePropertiesSP("codigoTitan",idpaquete , "tcontrolador", controlador, "tequivalencia","P","ciudadServicio",ciudad);
		//System.out.println("Ciudad"+parametros.cmd.getCabecera().getIDEmpresa());
				if (parametros.cmd.getCabecera().getIDEmpresa()==65) 
				{

						try
						{
							for(int i=0;i<equiv.size();i++)
							{
								if ((parametros.cmd.getDetalle().getTVpagada().getIdServicio()==201) && (equiv.get(i).getCodigoInterno()==162 || equiv.get(i).getCodigoInterno()==167 ))
								{
									if (count==0)
									{
										this.paqueteadi.add(200);
										contar++;
									}
									
								}
								else
								{
//									System.out.println("PruebaJ"+equiv.get(i).getCodigoInterno());
									this.paqueteadi.add(equiv.get(i).getCodigoInterno());
								}
							}		
						}
						catch (Exception e)
						{
							throw new Excepciones(6);
						}
				}
				else
				{
					try
					{
						for(int i=0;i<equiv.size();i++)
						{
//							System.out.println("PruebaJ"+equiv.get(i).getCodigoInterno());
							this.paqueteadi.add(equiv.get(i).getCodigoInterno());
						}		
					}
					catch (Exception e)
					{
						throw new Excepciones(6);
					}	
				}
	}
	
	/**
	 * Verifica si es que el cliente tiene promociones.
	 * 
	 * @param promocion codigos de la promociones a activar en el deco.
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 * @throws SecurityException 
	 * @throws IllegalArgumentException 
	 * 
	 */
	/*
	public void ValidarPromociones(Integer[] promocion)
	{
	 // Verifico si se han enviado promociones de servicios.
		int paq = 0;
		for (int i=0; i < promocion.length; i++)
		{
		 int idpromo = promocion[i];
		 List<TvpPromociones> datopromo = new TvpPromocionesDAO().findByIdPromocion(idpromo);
		 for (int j=0; j < datopromo.size();j++)
		 {
			 if (datopromo.get(j).getTipo() == "S") 
			 {
				 Int_Servicio = datopromo.get(j).getCodigoInterno();
		     }
			 else
			 {
				 paq = paq++;
				 paqueteadi[paq] = datopromo.get(j).getCodigoInterno();
			 }
		 }
		}
	}*/

/**
 *  Selecciona desde base que a que tipo de controlador va ser enviada la orden 
 *  de Aprovisionamiento
 */
	public void Definircontrolador(int tipoD) throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException {
		// TODO Auto-generated method stub		
		TvpTipodeco tipoDeco = new TvpTipodecoDAO().findById(tipoD);
        this.setValue("controlador", tipoDeco.getTipocontrolador());
	}
	
	
	/**
	 *  Setea el IdConvertidor de los equipos analogicos, esto para evitar duplicados o caracteres desconocidos
	 *  
	 */
	
	public void SetearSerie(String serial) throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException
	{
		int codigo = 0;

		if (serial.startsWith("DUPL"))
		{	
		   this.Serie=serial.substring(4,serial.length());
		}
		else if (serial.startsWith("DULP")) 
		{
			this.Serie=serial.substring(4,serial.length());			
		}else if (serial.startsWith("DUP"))
		{
			this.Serie=serial.substring(3,serial.length());	
//			System.out.println(this.Serie);
//			System.out.println(serial);
		}else
		{
			this.Serie = serial;
		}
		
	}
	
	
	public void SetearIdConvertidor(String serie) throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException
	{
		int codigo = 0;

		if (serie.startsWith("DUPL")|| serie.startsWith("DULP") || serie.startsWith("DUP"))
		{	
		   codigo = 0;
		}
		else
		{
			codigo = 2;
		}
		
		

		switch(codigo)
		{
			case 0:
				this.setValue("idConvertidor","00000000");
			break;
			
			case 1:
				this.setValue("idConvertidor","00000000");
			break;
			
			case 2:
			if (serie.startsWith("M") || serie.startsWith("C"))
			{
				this.setValue("idConvertidor",serie.substring(1,serie.length()) );
//				System.out.println("id"+serie.substring(1,serie.length()));
			}
			else
			{
				String[] temp;
			 
			  /* delimitador */
			  String delimeter = "-";
			  
			  temp = serie.split(delimeter);
			  
			  for(int i =0; i < temp.length ; i++)
			  {
				  if (i==0)
				  {
					  this.setValue("idConvertidor",temp[i] );
				  }
		      }
	         }
			break;
		
		}
	}

	/**
	 *  Es 
	 *  
	 */


	public int contarPaquete( List<IdPaquete> lstpaquete, ParametrosTV parametros) throws Excepciones {
		// TODO Auto-generated method stub
		ciudad = parametros.cmd.getCabecera().getIDEmpresa();
		count = 0;
        //for (int i=0;i<lstpaquete.size()/2;i++)//desde SP
        for (int i=0;i<lstpaquete.size();i++)//desde Titan
        {	
        	if (lstpaquete.get(i).getIdPaquete()>0)
        	{     
        		this.paqueteadi.clear();
        		
        		List<TvpEquivalencias> equiv = new TvpEquivalenciasDAO().findByThreePropertiesSP("codigoTitan",lstpaquete.get(i).getIdPaquete() , "tcontrolador", controlador, "tequivalencia","P","ciudadServicio",ciudad);

        		try
        		{
        			for(int j=0;j<equiv.size();j++)
        			{
						if ((parametros.cmd.getDetalle().getTVpagada().getIdServicio()==201) && (equiv.get(j).getCodigoInterno()==162 || equiv.get(j).getCodigoInterno()==167 ))
						{
							if (count==0)
							{
								contar++;
								count++;
							}
						}
						else
						{
							contar++;
						}
        				
        			}		
        		}
        		catch (Exception e)
        		{
        			throw new Excepciones(6);
        		}
        	}
        }

		return contar;
	}	
		
	public int contarCodigosServicios(int Servicio, int Ciudad)
	{
		
		List<TvpEquivalencias> equiv = new TvpEquivalenciasDAO().findByContarCodigos("codigoTitan", Servicio, "ciudadServicio", Ciudad);
		
		con = ""+equiv.get(0);
		cantidadCodigos = Integer.valueOf(con);
		return cantidadCodigos;
	}

	
	/**
	 * Esto se lo desarrollo para poder seleccionar el paquete homologado para
	 * el controlador ACC
	 * 
	 * @param parametros
	 * @param idpaquete
	 * @throws IllegalArgumentException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 * @throws Excepciones
	 */
	public void SetearPromocion(ParametrosTV parametros,int tipoPromocion) throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException, Excepciones
	{		
/*		ciudad = parametros.cmd.getCabecera().getIDEmpresa();
		//this.paqueteadi.clear();
		
		List<AdmPromociones> idpaquete = new AdmPromocionesDAO().findByPromocion(tipoPromocion);
	
		activarpaquete = idpaquete.get(0).getPromocionactivar();
		
		List<TvpEquivalencias> equiv = new TvpEquivalenciasDAO().findByThreePropertiesSP("codigoTitan",activarpaquete , "tcontrolador", controlador, "tequivalencia","P","ciudadServicio",ciudad);

	    
		try
		{
			for(int i=0;i<equiv.size();i++)
			{
				this.paqueteadi.add(equiv.get(i).getCodigoInterno());
			}		
		}
		catch (Exception e)
		{
			throw new Excepciones(6);
		}
*/
		
		ciudad = parametros.cmd.getCabecera().getIDEmpresa();

    	List<AdmPromociones> idpaquete = new AdmPromocionesDAO().findByPromocionCity(tipoPromocion,ciudad);
		if (idpaquete.size()>0)
		{
			activarpaquete = idpaquete.get(0).getPromocionactivar();
			List<TvpEquivalencias> equiv = new TvpEquivalenciasDAO().findByThreePropertiesSP("codigoTitan",activarpaquete , "tcontrolador", controlador, "tequivalencia","P","ciudadServicio",ciudad);
	
		    
			try
			{
				for(int i=0;i<equiv.size();i++)
				{
					this.paqueteadi.add(equiv.get(i).getCodigoInterno());
				}		
			}
			catch (Exception e)
			{
				throw new Excepciones(6);
			}
		}
	}
    public void SetearPromociond(ParametrosTV parametros,int tipoPromocion) throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException, Excepciones
    {                              
                   ciudad = parametros.cmd.getCabecera().getIDEmpresa();
                     List<AdmPromociones> idpaquete = new AdmPromocionesDAO().findByPromocionCity(tipoPromocion,ciudad);
                   if (idpaquete.size()>0)
                   {
                                   activarpaquete = idpaquete.get(0).getPromocionactivar();
                                   List<TvpEquivalencias> equiv = new TvpEquivalenciasDAO().findByThreePropertiesSP("codigoTitan",activarpaquete , "tcontrolador", controlador, "tequivalencia","P","ciudadServicio",ciudad);
    
                       
                                   try
                                   {
                                                   for(int i=0;i<equiv.size();i++)
                                                   {
                                                                  this.paqueteadi.add(equiv.get(i).getCodigoInterno());
                                                   }                              
                                   }
                                   catch (Exception e)
                                   {
                                                   throw new Excepciones(6);
                                   }
                   }              
    }

    public int SetearPromocionACC(ParametrosTV parametros,int tipoPromocion) throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException, Excepciones
    {
                   ciudad = parametros.cmd.getCabecera().getIDEmpresa();
                   if (tipoPromocion != 0)
                   {
                                   List<AdmPromociones> idpaquete = new AdmPromocionesDAO().findByPromocionCity(tipoPromocion,ciudad);
                   
                                   if (idpaquete.size()>0)
                                   {
                                                   activarpaquete = idpaquete.get(0).getPromocionactivar();
                                   }
                                   else
                                   {
                                                   activarpaquete = 0;
                                   }
                   }else
                   {
                                   activarpaquete = 0;
                   }
                                   
                   return  activarpaquete;
    }

	
	public StringBuilder SetearHouseHoldId(int cpartyid_account) 
    {
          msg = "0A";
          bit = "00000001";//String.format("%8s","0001").replace(' ', '0');
          cuenta = Conversiones.AsciiToHexadecimal(String.format("%20s","TI "+cpartyid_account));  
          location_code = "303030303030303030303030";//Conversiones.AsciiToHexadecimal(String.format("%12s",0).replace(' ', '0'));//"000000000000000000000000";
          STB = "303030303030303030303030";//Conversiones.AsciiToHexadecimal(String.format("%12s",0).replace(' ', '0'));//"000000000000000000000000";
          Treatment = "30";//String.format("%2s",0).replace(' ', '0');//"0";
          FIPS = "202020202020";//Conversiones.AsciiToHexadecimal(String.format("%6s","000000").replace(' ', '0'));//"000000000000";
        
        account_id.append(msg);
        account_id.append(bit);
        account_id.append(cuenta);
        account_id.append(location_code);
        account_id.append(STB);
        account_id.append(Treatment);
        account_id.append(FIPS);
          return account_id;           
    }

	
	
	
}
