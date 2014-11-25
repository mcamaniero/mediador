/**
 * 
 */
package com.app.tvp;

import java.io.IOException;
import java.util.List;

//import org.apache.commons.codec.binary.BinaryCodec;
//import org.jaxen.expr.BinaryExpr;
//import org.jaxen.function.CeilingFunction;

import tvcable.app.comarch.utils.Conversiones;

import ec.com.grupotvcable.wsdltvpagada.*;

/// Aqui se debe leer desde la tabla para obtener los datos y crear los archivos con los comandos

public class ComandosDALVI {

	private String NombreArchivo="";
	private static final String RUTA_PREOUT = "/tmp/PreOut/";//en el momento del ejecutable esto cambiará a /tmp/PreOut/

	//escritura de respuesta simulacion ya que esto hace dalvi

	private String NombreLectura = "";
	public static String RUTA_PREIN = "/tmp/PreIn/";
	//public static String RUTA_PREIN = "C:/";
	public static int Tiempo_Lectura = 2000;
	private StringBuilder cadenaComando = new StringBuilder();
	private LineaCadena lineaCadena = new LineaCadena();
	private TVpagada tvP = null;

	private PreOut preIn = null;
	private String linea1;
	private ParametrosTV parametros;
	private int idpaquete;
	private int[] eve;
	private String[] temp;
	
	
	public ComandosDALVI(ParametrosTV parametro, int comando) throws IOException {
        parametros = parametro;
		tvP = parametro.cmd.getDetalle().getTVpagada();

		//simulacion DALVI

	}

	//Update Services and Channels 
	public StringBuilder ComandoDALVI20(){
		//headEndId -- seteado en 1
		linea1 = lineaCadena.LineaCadena("L1_1", Conversiones.AsciiToHexadecimal("1"));
		cadenaComando.append(linea1);
		return cadenaComando;
	}

	//Update a Decoders Service mask 
	public StringBuilder ComandoDALVI22() throws NumberFormatException, IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException,Excepciones
	{
		//máscara
		
		parametros.SetearServicio(parametros);
		
		//int serviceMask=tvP.getIdServicio();
		int serviceMask=Integer.valueOf(parametros.getValue("idServicio").toString());
		
		//CALCULO DE LA MASCARA//

		StringBuilder cadenaBits = new StringBuilder(49);
		
		//numero de eventos
		int numEvento;
		int eventos=0;
		//numero de paquetes
		int numPaq;			
		int paquetes=0;

		//en cada lugar voy a almacenar mi bit
		int bits[]	= new int[49];//0-48
///Pruebas
		//bit del idservicio
		bits[serviceMask]=1;

		if (tvP.getTipoA()==500005 || tvP.getTipoA() == 500004)
		{
			if (parametros.cmd.getDetalle().getTVpagada().getIdEventos()!=null)
			{
				List<IdEvento> lstevento = parametros.cmd.getDetalle().getTVpagada().getIdEventos().getIdEvento();
				if (lstevento.size()>0 || lstevento!=null)
				{
						
						for (int i=0; i < lstevento.size(); i++)
						{
							
							if (i==0)
							{
								eventos =lstevento.get(i).getIdEvento(); 
								System.out.println("Eventos"+eventos);
								bits[eventos] = 1;
							}
							
						}
				}
			}
		}
		else
		{	
			if(tvP.getIdEventos() != null)
			{	
				numEvento = tvP.getIdEventos().getCantE();
				//bits de eventos
				for (int i= 0; i<numEvento ; i++ )
				{
					eventos = tvP.getIdEventos().getIdEvento().get(i).getIdEvento();
					
					bits[eventos]=1;			
				}
	
			}
		}
		
		System.out.println("paso por paquetes");
		/*
		if(tvP.getIdPaquetes() !=  null)
		{	
			numPaq = tvP.getIdPaquetes().getCantP();	
			//bits de paquetes
			
            if (parametros.cmd.getDetalle().getTVpagada().getTipoA() == 500004)
            {
            	System.out.println("entro por 500004");
            	System.out.println("datoc1"+parametros.cmd.getDetalle().getTVpagada().getDatoC1());
            	if (parametros.cmd.getDetalle().getTVpagada().getDatoC1() != "" && parametros.cmd.getDetalle().getTVpagada().getDatoC1() != "0")
            	{
            	 temp = parametros.cmd.getDetalle().getTVpagada().getDatoC1().split("-");	
	       		  // print splitted substrings 
            	 
            	 System.out.println(temp);
	       		  for(int i =0; i < temp.length ; i++)
	       		  {
	       			  System.out.println("paq"+Integer.valueOf(temp[i].toString()));
					parametros.SetearPaqueteDALVI(parametros, Integer.valueOf(temp[i].toString()));
					//paquetes = tvP.getIdPaquetes().getIdPaquete().get(i).getIdPaquete();
					paquetes = Integer.valueOf(parametros.getValue("idPaquete").toString());
					
					bits[paquetes]=1;
                  
	       		  }
            	}
            }
            else
            {
				for (int i= 0; i<numPaq ; i++ )
				{
					idpaquete = tvP.getIdPaquetes().getIdPaquete().get(i).getIdPaquete();
					if (idpaquete!=0)
					{
						parametros.SetearPaqueteDALVI(parametros, idpaquete);
						//paquetes = tvP.getIdPaquetes().getIdPaquete().get(i).getIdPaquete();
						paquetes = Integer.valueOf(parametros.getValue("idPaquete").toString());
						bits[paquetes]=1;
					}
				}
            }
		}*/
         
		if (parametros.cmd.getDetalle().getTVpagada().getTipoA() == 500004)
        {
              if (parametros.cmd.getDetalle().getTVpagada().getDatoC1() != "" && parametros.cmd.getDetalle().getTVpagada().getDatoC1() != "0" )
              {
               temp = parametros.cmd.getDetalle().getTVpagada().getDatoC1().split("-");      
                      // print splitted substrings 
                      for(int i =0; i < temp.length ; i++)
                      {
                         parametros.SetearPaqueteDALVI(parametros, Integer.valueOf(temp[i].toString()));
                         //paquetes = tvP.getIdPaquetes().getIdPaquete().get(i).getIdPaquete();
                         paquetes = Integer.valueOf(parametros.getValue("idPaquete").toString());
                         
                         bits[paquetes]=1;
              
                      }
              }
        }
        else
        {
              if(tvP.getIdPaquetes() !=  null)
              {     
                    numPaq = tvP.getIdPaquetes().getCantP();            
                    for (int i= 0; i<numPaq ; i++ )
                         {
                               idpaquete = tvP.getIdPaquetes().getIdPaquete().get(i).getIdPaquete();
                               if (idpaquete!=0)
                               {
                               parametros.SetearPaqueteDALVI(parametros, idpaquete);
                               //paquetes = tvP.getIdPaquetes().getIdPaquete().get(i).getIdPaquete();
                               paquetes = Integer.valueOf(parametros.getValue("idPaquete").toString());
                               bits[paquetes]=1;
                               }
                         }
              }
        }

		//saco la referencia de mi ultimo bit seteado a uno para cortar la cadena
		int mayor=0;

		for(int i=1; i<49; i++)
		{
			if(bits[i]==1)
			{		
				mayor=i;
			}
		}
		for(int i=mayor; i>=1; i--)
		{
			cadenaBits.append(bits[i]);
		}

		//DecoderId (HEX)
		cadenaComando.append(lineaCadena.LineaCadena("L1_1",Conversiones.DecimalToHexadecimal(tvP.getSerie())));
		cadenaComando.append(lineaCadena.LineaEspacio());
		//ServiceMask (HEX)
		if(tvP.getAccion() != 5)// =2 =>desconexion
		{	

			if(cadenaBits.length() % 4 == 0)
			{
				System.out.println("cadenaBits-"+cadenaBits);
				cadenaComando.append(lineaCadena.LineaCadena("S1_1", "0"+Conversiones.BinarioToHexadecimal(cadenaBits.toString())));
				cadenaComando.append(lineaCadena.LineaEspacio());
			}
			else
			{
				System.out.println("cadenaBits else-"+cadenaBits);
				cadenaComando.append(lineaCadena.LineaCadena("S1_1", Conversiones.BinarioToHexadecimal(cadenaBits.toString())));
				cadenaComando.append(lineaCadena.LineaEspacio());
			}
		}
		else
		{
			System.out.println("cadenacorte");
			cadenaComando.append(lineaCadena.LineaCadena("S1_1","0"));
			cadenaComando.append(lineaCadena.LineaEspacio());
		}
		//onScreenId valor constante
		cadenaComando.append(lineaCadena.LineaCadena("I1_1", "0"));
		cadenaComando.append(lineaCadena.LineaEspacio());
		//updateType valor constante
		cadenaComando.append(lineaCadena.LineaCadena("B1_1", "1"));
		
		System.out.println(cadenaComando);
		
	return cadenaComando;

	}
	//Get Data of a Decoder 
	public StringBuilder ComandoDALVI24(){
		//DecoderId
		cadenaComando.append(lineaCadena.LineaCadena("L1_1", Conversiones.DecimalToHexadecimal(tvP.getSerie())));

		return cadenaComando;
	}
	//Add a Free-Decoder to a Subscriber 
	public StringBuilder ComandoDALVI35(){
		//subscriberId
		
		cadenaComando.append(lineaCadena.LineaCadena("L1_1", String.valueOf(tvP.getIdAccount())));
		cadenaComando.append(lineaCadena.LineaEspacio());
		//decoderId
		cadenaComando.append(lineaCadena.LineaCadena("L1_2",Conversiones.DecimalToHexadecimal(tvP.getSerie())));
		cadenaComando.append(lineaCadena.LineaEspacio());
		//optional valor constante = 1	
		cadenaComando.append(lineaCadena.LineaCadena("B1_1", "1"));
	
		return cadenaComando;
	}
	//Disable a Pay Per View Event 
	public StringBuilder ComandoDALVI47(){	
		//headEndId valor constante

		cadenaComando.append(lineaCadena.LineaCadena("L1_1", "1"));
		cadenaComando.append(lineaCadena.LineaEspacio());
		//ppvId
		cadenaComando.append(lineaCadena.LineaCadena("L2_1", tvP.getIdEventos().toString()));
		
		return cadenaComando;
	}
}
