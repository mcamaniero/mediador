package com.app.tvp;


import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.List;

import com.app.dao.EntityManagerHelper;
//import com.app.tv.tvp_Dalvi.*;

import com.app.tv.tvp_Dalvi.dao.TvpDalvi;
import com.app.tv.tvp_Dalvi.dao.TvpDalviDAO;
import com.app.tv.tvp_ordenacc.dao.TvpOrdenacc;
import com.app.tv.tvp_ordenacc.dao.TvpOrdenaccDAO;
import com.app.tv.tvp_ordendac.dao.TvpOrdendac;
import com.app.tv.tvp_ordendac.dao.TvpOrdendacDAO;
import com.app.tv.tvp_puertosACC.dao.TvpPuertosAcc;
import com.app.tv.tvp_puertosACC.dao.TvpPuertosAccDAO;
//import com.app.tv.tvp_puertosDAC.dao.TvpPuertosDac;
import com.app.tv.tvp_puertosDAC.*;
import com.app.tv.tvp_puertosDHACC.TvpPuertosDhacc;
import com.app.tv.tvp_puertosDHACC.TvpPuertosDhaccDAO;
import com.app.tv.tvp_puertosDHDAC.TvpPuertosDhdac;
import com.app.tv.tvp_puertosDHDAC.TvpPuertosDhdacDAO;

import ec.com.grupotvcable.wsdltvpagada.*;

public class GuardarComandoTV {
	private int puerto;
	private long clave;
	private int ciudad;
	private Respuesta respuesta ;
	private byte[] Response = null;
	private String ciudadLaboratorio;
	private Integer ciudadLab;
	private int accion;
	private Mensaje mensaje = new ObjectFactory().createMensaje();
	private Integer puertod;
	private Integer puertoh;
	private Integer solouno;
	private TvpPuertosDhdac tvppuertosdh;
	private TvpPuertosDhacc tvppuertosah;
	

	public GuardarComandoTV() {
		// TODO Auto-generated constructor stu
	}

	public Respuesta guardarDAC(ParametrosTV paquete) throws IllegalArgumentException, 
														SecurityException, 
														IllegalAccessException, 
														NoSuchFieldException, 
														UnsupportedEncodingException, 
														IOException, 
														ParseException, Excepciones
	{
		TvpOrdendac ordendac = new TvpOrdendac();
		 
		clave = System.currentTimeMillis();
		//clave=0;

		EntityManagerHelper.beginTransaction();
		ordendac.setClave(clave);
		ordendac.setId(Integer.valueOf(paquete.getValue("LogId").toString()));
		ordendac.setComando(paquete.getValue("Comando").toString());
		ordendac.setPaquete(paquete.getValue("Paquete").toString());
		ordendac.setTamanio(paquete.getValue("Tamanio").toString());				
		ordendac.setEstado("P");
		ordendac.setRespuesta(Response);

		ciudad = paquete.cmd.getCabecera().getIDEmpresa();

		tvppuertosdh = new TvpPuertosDhdacDAO().findById(ciudad);			
		puertod = tvppuertosdh.getPuertodesde();
		puertoh = tvppuertosdh.getPuertohasta();
			
		puerto = new TvpPuertosDacDAO().findById(ciudad).getPuertoDac();
		TvpPuertosDac tblpuertosdac = new TvpPuertosDac();
		
		if (paquete.PuertoPrueba)
		{	
		  if (paquete.cmd.getDetalle().getTVpagada().getUbicacion()!=23)//Para separar actividades de Laboratorio
		  {	  															//con peticiones Call Center, ATC, etc
			  tblpuertosdac.setCiudadId(ciudad); 
			  puerto = new TvpPuertosDacDAO().findById(ciudad).getPuertoDac();
			  ordendac.setPuerto(""+puerto);
			  if (puerto >=puertod && puerto < puertoh)//antes hasta 2015								
			  {
				  puerto ++;
				  tblpuertosdac.setPuertoDac(puerto);
			  }
			  else if (puerto ==puertoh)//antes 2015								
			  {
				  tblpuertosdac.setPuertoDac(puertod);
			  }
			  new TvpPuertosDacDAO().update(tblpuertosdac);
			
		  }
		  else
		  {
			    ciudadLaboratorio = ciudad+"1";
			    ciudadLab = Integer.valueOf(ciudadLaboratorio);
				System.out.println("Ciudad LAboratorio"+ciudadLab);
			    tvppuertosdh = new TvpPuertosDhdacDAO().findById(ciudadLab);			
				puertod = tvppuertosdh.getPuertodesde();
				puertoh = tvppuertosdh.getPuertohasta();
				solouno = tvppuertosdh.getSolouno();
				
				tblpuertosdac.setCiudadId(ciudad); 
				puerto = new TvpPuertosDacDAO().findById(ciudad).getPuertoDac();
				ordendac.setPuerto(""+puerto);
				if (puerto >=puertod && puerto < puertoh)//antes hasta 2015								
				{
					puerto ++;
					tblpuertosdac.setPuertoDac(puerto);
				}
				else if (puerto ==puertoh)//antes 2015								
				{
					tblpuertosdac.setPuertoDac(puertod);
				}
				new TvpPuertosDacDAO().update(tblpuertosdac);
		  }
		}
		else
		{                	
			System.out.println("PuertoPruebaGYE2000");
			ordendac.setPuerto(""+2000);				
		}
       	
		new TvpOrdendacDAO().save(ordendac);
		EntityManagerHelper.commit();
		//clave=ordendac.getClave();
		EntityManagerHelper.closeEntityManager();
    	System.out.println("CLAVEP-"+clave);
			respuesta = new ObtenerCadena(paquete.cmd).ConsultarEstadoDAC(paquete, clave);
		
		return respuesta;

	}

	public Respuesta guardarACC(ParametrosTV paquete) throws IllegalArgumentException, 
	SecurityException, 
	IllegalAccessException, 
	NoSuchFieldException, UnsupportedEncodingException
	{
		TvpOrdenacc ordenacc = new TvpOrdenacc();
		clave = System.currentTimeMillis();
		
		EntityManagerHelper.beginTransaction();
			ordenacc.setClave(clave);
			ordenacc.setId(Integer.valueOf(paquete.getValue("LogId").toString()));
			ordenacc.setComando(paquete.getValue("Comando").toString());			
			ordenacc.setPaquete(paquete.getValue("Paquete").toString());			
			ordenacc.setTamanio(paquete.getValue("Tamanio").toString());				
			ordenacc.setEstado("P");
			ordenacc.setRespuesta(Response);
		
			ciudad = paquete.cmd.getCabecera().getIDEmpresa();

			tvppuertosah = new TvpPuertosDhaccDAO().findById(ciudad);			
			puertod = tvppuertosah.getPuertodesde();
			puertoh = tvppuertosah.getPuertohasta();
			solouno = tvppuertosah.getSolouno();
			
			TvpPuertosAcc tblpuertosacc = new TvpPuertosAcc();
			
			
			if (paquete.PuertoPrueba)
			{
				switch(ciudad)
				{
					case 63:

					if (solouno ==0)
					{
						ordenacc.setPuerto(""+puertod);										
						tblpuertosacc.setPuertoAcc(puertod);
					}
					else
					{
						puerto = new TvpPuertosAccDAO().findById(ciudad).getPuertoAcc();
						ordenacc.setPuerto(""+puerto);
						
						tblpuertosacc.setCiudadId(ciudad); 
//							if (puerto >=3011 && puerto < 3012)//<3015
							if (puerto >=puertod && puerto < puertoh)//<3015							
							{
								puerto ++;
								tblpuertosacc.setPuertoAcc(puerto);
							}
//							else if (puerto ==3012)// hasta 3015
							else if (puerto ==puertoh)// hasta 3015
							{
//								puerto = 3011;						
								tblpuertosacc.setPuertoAcc(puertod);
							}
							new TvpPuertosAccDAO().update(tblpuertosacc);				
					 }
					break;
	
					case 94:
						if (solouno ==0)
						{
							ordenacc.setPuerto(""+puertod);										
							tblpuertosacc.setPuertoAcc(puertod);
						}
						else
						{
							puerto = new TvpPuertosAccDAO().findById(ciudad).getPuertoAcc();	                	
							ordenacc.setPuerto(""+puerto);
							
							tblpuertosacc.setCiudadId(ciudad); 
//							if (puerto >=3001 && puerto < 3004)//debe ser 3005
							if (puerto >=puertod && puerto < puertoh)//debe ser 3005							
							{
								puerto ++;
								tblpuertosacc.setPuertoAcc(puerto);
							}
//							else if (puerto ==3004)//debe ser 3005
							else if (puerto ==puertoh)//debe ser 3005							
							{
//								puerto = 3001;
								tblpuertosacc.setPuertoAcc(puertod);
							}
							new TvpPuertosAccDAO().update(tblpuertosacc);	
						}
					break;
					
					case 65:

						if (solouno ==0)
						{
							//System.out.println("entro solo uno");
							//puerto = puertod;
							ordenacc.setPuerto(""+puertod);										
							tblpuertosacc.setPuertoAcc(puertod);
						}
						else
						{
							puerto = new TvpPuertosAccDAO().findById(ciudad).getPuertoAcc();	                	
							ordenacc.setPuerto(""+puerto);
							
							tblpuertosacc.setCiudadId(ciudad); 
//							if (puerto >=4001 && puerto < 4002)//debe ser 3005
							if (puerto >=puertod && puerto < puertoh)//debe ser 3005							
							{
								puerto++;
								tblpuertosacc.setPuertoAcc(puerto);
							}
//							else if (puerto ==4002)//debe ser 3005
							else if (puerto ==puertoh)//debe ser 3005							
							{
//								puerto = 4001;
								tblpuertosacc.setPuertoAcc(puertod);
							}
							new TvpPuertosAccDAO().update(tblpuertosacc);
						}
					break;					
					
					case 96:
						if (solouno ==0)
						{
							ordenacc.setPuerto(""+puertod);										
							tblpuertosacc.setPuertoAcc(puertod);
						}
						else
						{						
							puerto = new TvpPuertosAccDAO().findById(ciudad).getPuertoAcc();	                	
							ordenacc.setPuerto(""+puerto);

							tblpuertosacc.setCiudadId(ciudad); 
//							if (puerto >=4011 && puerto < 4012)//debe ser 3005
							if (puerto >=puertod && puerto < puertoh)//debe ser 3005							
							{
								puerto ++;
								tblpuertosacc.setPuertoAcc(puerto);
							}
//							else if (puerto ==4012)//debe ser 3005
							else if (puerto ==puertoh)//debe ser 3005							
							{
//								puerto = 4011;
								tblpuertosacc.setPuertoAcc(puertod);
							}
							new TvpPuertosAccDAO().update(tblpuertosacc);
						}

					break;			
				}
			}
			else
			{
				System.out.println("4012");
		 		ordenacc.setPuerto(""+4001);	
			}
		
		new TvpOrdenaccDAO().save(ordenacc);
		EntityManagerHelper.commit();
		EntityManagerHelper.closeEntityManager();
		
		respuesta = new ObtenerCadena(paquete.cmd).ConsultarEstadoACC(paquete, clave);
		return respuesta;
	}
	
	public Respuesta guardarDalvi(ParametrosTV paquete) throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException, IOException
	{
		
		com.app.tv.tvp_Dalvi.dao.TvpDalvi tvpDalvi = new TvpDalvi();

	   try 
	   {
	          Thread.sleep(1000);
	   } 
       catch (InterruptedException e) 
       {
		        // TODO Auto-generated catch block
		        e.printStackTrace();
	    }

		clave = System.currentTimeMillis();
		ciudad = paquete.cmd.getCabecera().getIDEmpresa();
		EntityManagerHelper.beginTransaction();
			tvpDalvi.setId(Long.valueOf(paquete.getValue("LogId").toString()));
			tvpDalvi.setCiudad(ciudad);
			//System.out.println("CiudadDALVI"+paquete.cmd.getCabecera().getIDEmpresa());
			tvpDalvi.setComando(Integer.valueOf(paquete.getValue("codcomando").toString()));
			tvpDalvi.setEstado("P");
			tvpDalvi.setTrama(paquete.getValue("cadenaComando").toString());
			tvpDalvi.setRespuesta("");
			new TvpDalviDAO().save(tvpDalvi);			
		EntityManagerHelper.commit();
		EntityManagerHelper.closeEntityManager();
		
		
		respuesta = new ObtenerCadena(paquete.cmd).ConsultarEstadoDALVI(paquete, clave);
		return respuesta;
	}
}
