package com.app.tvp;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.List;

import tvcable.app.comarch.utils.Conversiones;
import tvcable.app.comarch.utils.Paquete;

/**
 * @author rortiz
 *
 */
public class ComandosTVP {

	private String tamanio = null;
	private StringBuilder paquete = null;
	private int comando = 0;
	private int ciudad = 0;
	private int SequenceNumber;
	private StringBuilder cadenaComando;
	
	public ComandosTVP(){

	}

	public ParametrosTV EjecutaComandoTVPDAC(ParametrosTV parametros) throws NumberFormatException, 
														IllegalArgumentException, 
														SecurityException, 
														IllegalAccessException, 
														NoSuchFieldException,
														Excepciones, IOException, ParseException
	{
		comando = Integer.valueOf(parametros.getValue("codcomando").toString());
		ciudad = parametros.cmd.getCabecera().getNegocio();
		parametros.Setearciudad(ciudad);
		ComandosDAC cmdDAC = new ComandosDAC(parametros);

		switch(comando)
		{
		    case 630:
		    	paquete = cmdDAC.ComandoDAC630();
		    	tamanio = Integer.toString(Paquete.PaqueteLength(paquete.toString()));
		    	tamanio = ""+(Integer.valueOf(tamanio)+6);
		  	break; 
		  	
	
			case 631:
				paquete = cmdDAC.ComandoDAC631();
		    	tamanio = Integer.toString(Paquete.PaqueteLength(paquete.toString()));
		    	tamanio = ""+(Integer.valueOf(tamanio)+6);
			break; 
	
			case 633:
				paquete = cmdDAC.ComandoDAC633();
		    	tamanio = Integer.toString(Paquete.PaqueteLength(paquete.toString()));
		    	tamanio = ""+(Integer.valueOf(tamanio)+6);
			break; 
			case 663:
				paquete = cmdDAC.ComandoDAC663();
		    	tamanio = Integer.toString(Paquete.PaqueteLength(paquete.toString()));
		    	tamanio = ""+(Integer.valueOf(tamanio)+6);
			break;
			
			case 665:
				paquete = cmdDAC.ComandoDAC665();
		    	tamanio = Integer.toString(Paquete.PaqueteLength(paquete.toString()));
		    	tamanio = ""+(Integer.valueOf(tamanio)+6);				
			break;
			
			case 688:
			break;
			
			case 684:
				paquete = cmdDAC.ComandoDAC684();
				tamanio = Integer.toString(Paquete.PaqueteLength(paquete.toString()));
				tamanio = ""+(Integer.valueOf(tamanio)+6);

					if (parametros.getValue("Comando").toString().equals("770"))
					{
						comando = Integer.valueOf(parametros.getValue("Comando").toString());
					}
			break;
				
			// Activar y desactivar eventos PPV.
			case 694: 
				paquete = cmdDAC.ComandoDAC694();
				tamanio = Integer.toString(Paquete.PaqueteLength(paquete.toString()));
				tamanio = ""+(Integer.valueOf(tamanio)+6);
			break;
			
			// Refrescar un Decodificador RETE 760.
			case 760:
				//if (parametros.cmd.getDetalle().getTVpagada().getAccion()!=3)
				//{
					paquete = cmdDAC.ComandoDAC760();
				//}
				//else
				//{
				//	System.out.println("paso para el refresh");
				//	paquete = cmdDAC.ComandoDAC680();
				//	comando = 680;
				//}
				tamanio = Integer.toString(Paquete.PaqueteLength(paquete.toString()));
				tamanio = ""+(Integer.valueOf(tamanio)+6);
			break;
	
			case 660:
				paquete = cmdDAC.ComandoDAC660();
				tamanio = Integer.toString(Paquete.PaqueteLength(paquete.toString()));
				tamanio = ""+(Integer.valueOf(tamanio)+6);
			break;
			

			/*case 713:
					paquete = cmdDAC.ComandoDAC713();
					comando = 760;
					tamanio = Integer.toString(Paquete.PaqueteLength(paquete.toString()));
					tamanio = ""+(Integer.valueOf(tamanio)+6);
			break;*/

			case 713:
				paquete = cmdDAC.ComandoDAC713();
				comando = 760;
				tamanio = Integer.toString(Paquete.PaqueteLength(paquete.toString()));
				tamanio = ""+(Integer.valueOf(tamanio)+6);
				System.out.println("");
			break;

			
			case 761:
			break;
			
			case 777:
				paquete = cmdDAC.ComandoDAC777();
				tamanio = Integer.toString(Paquete.PaqueteLength(paquete.toString()));
				tamanio = ""+(Integer.valueOf(tamanio)+6);
			break;
	
			case 724:
				/*
				paquete = cmdDAC.ComandoDAC724();
				comando = Integer.valueOf(parametros.getValue("Comando").toString());
				tamanio = Integer.toString(Paquete.PaqueteLength(paquete.toString()));
				tamanio = ""+(Integer.valueOf(tamanio)+6);
				*/
				paquete = cmdDAC.ComandoDAC724();
				System.out.println("PAQUETEE"+this.paquete);
				tamanio = Integer.toString(Paquete.PaqueteLength(paquete.toString()));
				tamanio = ""+(Integer.valueOf(tamanio)+6);
			break;
			
			case 680:
				paquete = cmdDAC.ComandoDAC680();
				tamanio = Integer.toString(Paquete.PaqueteLength(paquete.toString()));
				tamanio = ""+(Integer.valueOf(tamanio)+6);				
			break;
			
			case 770:
				paquete = cmdDAC.ComandoDAC770();
				tamanio = Integer.toString(Paquete.PaqueteLength(paquete.toString()));
				tamanio = ""+(Integer.valueOf(tamanio)+6);				
			break;
	
			case 763:
			break;
			
			case 720:
				paquete = cmdDAC.ComandoDAC720();
				tamanio = Integer.toString(Paquete.PaqueteLength(paquete.toString()));
				tamanio = ""+(Integer.valueOf(tamanio)+6);						
				break;
				
			case 722:
				paquete = cmdDAC.ComandoDAC722();
				tamanio = Integer.toString(Paquete.PaqueteLength(paquete.toString()));
				tamanio = ""+(Integer.valueOf(tamanio)+6);						
				break;
				
			case 801:
				paquete = cmdDAC.ComandoDAC801();
				comando = 0001;
				tamanio = Integer.toString(Paquete.PaqueteLength(paquete.toString()));
				tamanio = ""+(Integer.valueOf(tamanio)+6);										
				break;
				
			case 802:
				break;
				

			case 806:
				paquete = cmdDAC.ComandoDAC806();
				comando = 0001;
				tamanio = Integer.toString(Paquete.PaqueteLength(paquete.toString()));
				tamanio = ""+(Integer.valueOf(tamanio)+6);										
				break;	
				
			case 807:
				paquete = cmdDAC.ComandoDAC807();
				comando = 760;
				tamanio = Integer.toString(Paquete.PaqueteLength(paquete.toString()));
				tamanio = ""+(Integer.valueOf(tamanio)+6);										
			break;		
				
		}
		parametros.setValue("Tamanio",String.format("%4s",Conversiones.DecimalToHexadecimal(tamanio)).replace(' ','0'));
		parametros.setValue("Paquete", paquete);
		parametros.setValue("Comando",String.format("%4s",Conversiones.DecimalToHexadecimal(""+comando)).replace(' ','0'));
		
		return parametros;
	}


	/**
	 * @param parametros
	 * @param cmd
	 * @return
	 * @throws IllegalArgumentException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws NoSuchFieldException
	 * 
	 * Creacion de Comandos ACC 
	 * rortiz
	 */
	public ParametrosTV EjecutaComandoTVPACC(ParametrosTV parametros) throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException,Excepciones , UnsupportedEncodingException
	{
		comando = Integer.valueOf(parametros.getValue("codcomando").toString());
		
		if (comando == 462)
		{
			comando = 262;
		}
		
		ComandosACC cmdACC = new ComandosACC(parametros);
		
		System.out.println("Comando"+comando);
		
		switch(comando)
		{
		case 1:		
			break;
			
			//Refrescar decodificador-Cortar
			//Reconectar Decodificador-Activar
			//Desactivar Eventos
			
			case 262:
				//paquete = new ComandosACC(parametros).Comando262();
				paquete = cmdACC.Comando262();
				tamanio = Integer.toString(Paquete.PaqueteLength(paquete.toString()));
				tamanio = ""+(Integer.valueOf(tamanio)+6);
			break;


			
			case 462:			
				//paquete = new ComandosACC(parametros).Comando462();
				paquete = cmdACC.Comando462();
				tamanio = Integer.toString(Paquete.PaqueteLength(paquete.toString()));
				tamanio = ""+(Integer.valueOf(tamanio)+6);
			break;
			
			case 463:			
				paquete = new ComandosACC(parametros).Comando463();	
				comando = 462;
				tamanio = Integer.toString(Paquete.PaqueteLength(paquete.toString()));
				tamanio = ""+(Integer.valueOf(tamanio)+6);
			break;
			
			case 464:			
				paquete = new ComandosACC(parametros).Comando464();	
				comando = 462;
				tamanio = Integer.toString(Paquete.PaqueteLength(paquete.toString()));
				tamanio = ""+(Integer.valueOf(tamanio)+6);
			break;
			
			//Inicializar decodificador
			case 264:  
				paquete = new ComandosACC(parametros).Comando264();
				tamanio = Integer.toString(Paquete.PaqueteLength(paquete.toString()));
				tamanio = ""+(Integer.valueOf(tamanio)+6);
			break;
				
			//Limpiar Clave de PIN
			case 265: 	
				paquete = new ComandosACC(parametros).Comando265();
				tamanio = Integer.toString(Paquete.PaqueteLength(paquete.toString()));
				tamanio = ""+(Integer.valueOf(tamanio)+6);
			break;
			
			//Consultar Decodificador
			case 280: 		
				paquete = new ComandosACC(parametros).Comando280();
				tamanio = Integer.toString(Paquete.PaqueteLength(paquete.toString()));
				tamanio = ""+(Integer.valueOf(tamanio)+6);
			break;
			
			//Activar/Desactivar Grupo Eventos
			case 296: 
				paquete = new ComandosACC(parametros).Comando296();
				tamanio = Integer.toString(Paquete.PaqueteLength(paquete.toString()));
				tamanio = ""+(Integer.valueOf(tamanio)+6);
			break;
			
			//Eliminar Decodificador	
			case 263: 
				paquete = new ComandosACC(parametros).Comando263();
				tamanio = Integer.toString(Paquete.PaqueteLength(paquete.toString()));
				tamanio = ""+(Integer.valueOf(tamanio)+6);
			break;
			
			//Crear Decodificador	
			case 260: 
				paquete = new ComandosACC(parametros).Comando260();
				tamanio = Integer.toString(Paquete.PaqueteLength(paquete.toString()));
				tamanio = ""+(Integer.valueOf(tamanio)+6);
			break;
			
			case 801:
				paquete = cmdACC.ComandoACC801();
				tamanio = Integer.toString(Paquete.PaqueteLength(paquete.toString()));
				tamanio = ""+(Integer.valueOf(tamanio)+6);										
			break;
			
		}

		parametros.setValue("Tamanio",String.format("%4s",Conversiones.DecimalToHexadecimal(tamanio)).replace(' ','0'));
		parametros.setValue("Paquete", paquete);
		parametros.setValue("Comando",String.format("%4s",Conversiones.DecimalToHexadecimal(""+comando)).replace(' ','0'));
		
		return parametros;
	}

	
	
	
	
	/**   
	 * @param parametros
	 * @param cmd
	 * @return
	 * @throws NoSuchFieldException 
	 * amerchan
	 * armar archivos dalvi
	 * @throws IOException 
	 * @throws Excepciones 
	 * 
	 */
//	public Respuesta EjecutaComandoTVDalvi(ParametrosTV parametros) throws NumberFormatException, IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException, IOException{
	public ParametrosTV EjecutaComandoTVDalvi(ParametrosTV parametros) throws NumberFormatException, IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException, IOException, Excepciones{	
		
		
//		Respuesta Resp = new ObjectFactory().createRespuesta();	
//	    Mensaje mensaje = new ObjectFactory().createMensaje();	
		comando = Integer.valueOf(parametros.getValue("codcomando").toString());
		
		ComandosDALVI cmdDalvi = new ComandosDALVI(parametros,comando);

		switch(comando)
		{
			case 20:			
			cadenaComando = cmdDalvi.ComandoDALVI20();
			break;
		
			case 22:
			cadenaComando = cmdDalvi.ComandoDALVI22();
			parametros.setValue("cadenaComando", cadenaComando);
			break;

			case 24:
			cadenaComando = cmdDalvi.ComandoDALVI24();
			parametros.setValue("cadenaComando", cadenaComando);			
			break;		

			case 35:
			cmdDalvi.ComandoDALVI35();			
			break;	

			case 47:
			cmdDalvi.ComandoDALVI47();						
			break;		
		}
		/*
		mensaje = new ValidaErrorTV(mensaje).ValidarErrorDALVI(comando);
		
		Resp.setMensaje(mensaje);
		Resp.setCabecera(parametros.cmd.getCabecera());
		*/
		/*
		//VIA FTP-- 
		boolean ban = true;
		
		while(ban){
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//consulta al directorio PreIn
			boolean consulta = true;
			
			if(consulta){
				ban = false;

				BufferedReader reader = new BufferedReader(
								new InputStreamReader(
								new FileInputStream("fichero.txt")));
				String linea=null;
				while (null!=(linea=reader.readLine())){
					System.out.println("Linea:" + linea);

					//eliminar el archivo
				}
			}
			
		}*/
		//procesas la respuesta
		//return Resp;
		return parametros;
	}
}
