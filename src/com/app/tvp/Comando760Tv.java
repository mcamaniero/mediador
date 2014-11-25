package com.app.tvp;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import tvcable.app.comarch.utils.Conversiones;
import tvcable.app.comarch.utils.Paquete;

import ec.com.grupotvcable.wsdltvpagada.*;

import com.app.tv.tvp_equivalencias.*;

public class Comando760Tv {

	private ParametrosTV parametros;
	private Respuesta response;
	private StringBuilder paquete = new StringBuilder();
	private StringBuilder subpaquete = new StringBuilder();
	private String tamanio;
	private int idServicio;
	private String fPago;
	private int cCredito;
	private int credito;
	private Integer datoC1;

	/**
	 * @param args
	 */
	
	public Comando760Tv(ParametrosTV parametrosTv)
	{
		parametros = parametrosTv;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Respuesta EjecutarChange() throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException, IOException, ParseException, Excepciones
	{
		
		
		String msg = "";
		String bit = "";
		String requestType = "2";  // CREAR UN DECODIFICADOR DIGITAL
		
		/** IDENTIFIER COMPONENT **/
		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(parametros.getValue("bsiciudad").toString())).replace(' ', '0'));
		//request_type 1Add-2Change-3Delete		
		paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(requestType)).replace(' ', '0'));
		//Serial_Number
		System.out.println(parametros.cmd.getDetalle().getTVpagada().getSerie());
		paquete.append(Conversiones.AsciiToHexadecimal(parametros.cmd.getDetalle().getTVpagada().getSerie()));
		
		
			
		/** PLANT COMPONENT**/
			
		
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
		System.out.println("Entro A comandot");
		
		
		tamanio = Integer.toString(Paquete.PaqueteLength(paquete.toString()));
    	tamanio = ""+(Integer.valueOf(tamanio)+6);
				
		parametros.setValue("Tamanio",String.format("%4s",Conversiones.DecimalToHexadecimal(tamanio)).replace(' ','0'));
		parametros.setValue("Paquete", paquete);
		System.out.println("Comando"+String.format("%4s",Conversiones.DecimalToHexadecimal("760")).replace(' ','0'));
		parametros.setValue("Comando",String.format("%4s",Conversiones.DecimalToHexadecimal("760")).replace(' ','0'));
		parametros.setValue("repetir", false);
		
		
		response = new GuardarComandoTV().guardarDAC(parametros);
		return response;
	}
	
	public Respuesta EjecutarRefresh() throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException, IOException, ParseException, Excepciones
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
			if (operationCode == 5)//23
			{
				paquete.append(String.format("%2s", "0").replace(' ', '0'));
			}
			else
			{
				paquete.append(String.format("%2s", "1").replace(' ', '0'));
			}
			
			paquete.append(String.format("%2s",Conversiones.DecimalToHexadecimal(""+operationCode)).replace(' ','0'));
			
		
			/**
			 * 
			 */	

	
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
		}
		
			//Cantidad de Servicios.

		paquete.append(String.format("%4s",Conversiones.DecimalToHexadecimal(""+c)).replace(' ','0'));
		
		paquete.append(subpaquete);
		
		System.out.println("Fin de Creacion Comando 702-"+paquete);
		
		tamanio = Integer.toString(Paquete.PaqueteLength(paquete.toString()));
    	tamanio = ""+(Integer.valueOf(tamanio)+6);
				
		parametros.setValue("Tamanio",String.format("%4s",Conversiones.DecimalToHexadecimal(tamanio)).replace(' ','0'));
		parametros.setValue("Paquete", paquete);
		System.out.println("Comando"+String.format("%4s",Conversiones.DecimalToHexadecimal("760")).replace(' ','0'));
		parametros.setValue("Comando",String.format("%4s",Conversiones.DecimalToHexadecimal("760")).replace(' ','0'));
		parametros.setValue("repetir", false);
		
		response = new GuardarComandoTV().guardarDAC(parametros);
		
		return response;
	}
	
}
