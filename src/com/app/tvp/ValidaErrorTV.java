package com.app.tvp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

//import org.jaxen.function.SubstringFunction;

import com.app.tv.adm_errorestvp.dao.AdmErrorestvp;
import com.app.tv.adm_errorestvp.dao.AdmErrorestvpDAO;
import com.app.tv.tvp_equivalencias.dao.TvpEquivalencias;
import com.app.tv.tvp_equivalencias.dao.TvpEquivalenciasDAO;
//import com.app.tv.tvp_Dalvi.TvpDalvi;
//import com.app.tv.tvp_Dalvi.TvpDalviDAO;
//import com.app.tv.tvp_equivalencias.TvpEquivalencias;
//import com.app.tv.tvp_equivalencias.TvpEquivalenciasDAO;

import tvcable.app.comarch.utils.Conversiones;

import ec.com.grupotvcable.wsdltvpagada.*;

public class ValidaErrorTV {
	//private static final String RUTA_PREIN = "/tmp/PreIn/";
	private String comandRes;
	private String binario;
	private String eCodeWord;
	private String actionCode;
	private Mensaje mensaje;

	private DatosExtrasTVP datosExtra = new ObjectFactory().createDatosExtrasTVP();
	private NumEve numEve = new ObjectFactory().createNumEve();
	private String SerialNumber;
	private String ConverterId;
	private String FieldStatusWord1;
	private String FieldStatusWord2;
	private String PhoneIndex;
	private String HubNumber;
	private String MasterSlaveType;
	private String MasterSlaveKey;
	private String Filler;
	private String TelephoneNumber;
	private String PurchaseLimit;
	private String TimeoutLimit;
	private String EmergencyAlertMask;
	private String tuningType;
	private String TimeZone;
	private String ConverterStatus;
	private String OutputChannel;
	private String FrequencyMap;
	private String Aux12VOPtion;
	private String Amplifier;
	private String EncodedServicesTo;
	private int comienza;
	private int termina;
	private int servicios;
	private String obtenerBits;
	private boolean flag = true;
	//private String rutaCDR = "/usr/RecoleccionPPV/";// esta ruta deberai cambairse por la ruta en linux //usr/javaSerialLinux/CDR /usr/RecoleccionPPV/
	private String rutaCDR = "C:/ArchivosCDR/RecoleccionIndividual/";// esta ruta deberai cambairse por la ruta en linux //usr/javaSerialLinux/CDR /usr/RecoleccionPPV/
	private String extensionCDR = ".cdr";
	private LineaCadena lineaCadena;
	private String numeroSerie;
	private StringBuilder lineaCdr = new StringBuilder();
	private String fecha;
	private String AccountNumber;
	private int tramafinal;
	private int tramainicial;
	private Integer valorUno;
	private Integer valorDos;
	private int totalConverterId;
	private int lastFlag;
	private String seriedeco1;
	private String seriedeco2;
	private int ciudad;
	private Integer pay;
	private List<TvpEquivalencias> paquetesTitan;
	private int servicio;
	private String obtenerBitsServicio;
	private Integer EventoId = 0;
	
	/**
	 * @param args
	 */
	public ValidaErrorTV(Mensaje ejecutaMensaje){
		// TODO Auto-generated constructor stub
		mensaje = ejecutaMensaje;
	}
	public Mensaje ValidarErrorDAC(ParametrosTV paquete) throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException, IOException, ParseException
	{

		comandRes = Conversiones.HexadecimalToDecimal(paquete.getValue("eStatusWork").toString());
		System.out.println("Comando Respuesta"+comandRes);
		if (Integer.valueOf(comandRes) == 725)
		{
			tramafinal   = paquete.getValue("eTrama").toString().length() -2;
			tramainicial   = paquete.getValue("eTrama").toString().length() -4;
		}
		switch(Integer.valueOf(comandRes))
		{
			case 1389:
				mensaje.setCodError(5001);
				mensaje.setDetMensaje("Problemas de Comunicacion, por favor vuelva a enviar el comando.");
				datosExtra.setActivo("Puertos");
				
			break;
			
			case 1:
				//System.out.println("eTrama"+paquete.getValue("eTrama").toString());
				paquete.setValue("eData", paquete.getValue("eTrama").toString().substring(4,8));
				binario = Conversiones.HexadecimalToBinario(paquete.getValue("eData").toString());
				binario = String.format("%016d",Integer.valueOf(binario));


				binario = binario.substring(15, 16);

				//if (Integer.valueOf(binario)==1)
				if (binario.equals("1"))
				{
					mensaje.setCodError(Integer.valueOf(comandRes));
					mensaje.setDetMensaje("Proceso Realizado con Exito");
					datosExtra.setActivo("Pasamos");
				}
				else 
				{
					

					eCodeWord = Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(8, 12));

					AdmErrorestvp errores = new AdmErrorestvpDAO().findByStrErrorDac(""+eCodeWord).get(0);
				
					try
					{
						mensaje.setCodError(Integer.valueOf(errores.getStrError()));
						mensaje.setDetMensaje(errores.getStrErrorString());
						datosExtra.setActivo(binario);
					}
					catch (Exception e)
					{
						mensaje.setCodError(5003);
						mensaje.setDetMensaje("Error no Especificado");
					}
				}
			break;
	
			case 685:
				// Encabezado del Return Message  -  rortiz 21/06/08
				//BSI_Code    = Conversiones.HexadecimalToDecimal(recordType.geteTrama().substring(4, 8));
				//hEndNumber  = Conversiones.HexadecimalToDecimal(recordType.geteTrama().substring(8, 12));
				//equipType   = 
				//datosExtra.setTipoDeco(Integer.valueOf(Conversiones.HexadecimalToDecimal(paquete.geteTrama().substring(12, 16))));		
				datosExtra.setTipoDeco(Integer.valueOf(Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(12, 16))));							
				//equipSType  = Conversiones.HexadecimalToDecimal(recordType.geteTrama().substring(16, 20));
				//serialNumb  = Conversiones.HexadecimalToDecimal(paquete.geteTrama().substring(20, 44));								
				actionCode = Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(44, 46));
			
				datosExtra = new ValidarActionCode(datosExtra).ActionCode(actionCode,paquete);
				mensaje.setCodError(1);
				mensaje.setDetMensaje("Consulta Realizada");
				
				
			break;
	        
			case 721:
			break;
			
			case 725:
				paquete.setValue("lastFlag",Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(220, 222)));
				lastFlag = Integer.valueOf(paquete.getValue("lastFlag").toString());
				System.out.println("lastFlag"+lastFlag);
              if (lastFlag!=5)
              {	  
				lineaCadena = new LineaCadena();	
				//numeroSerie = paquete.cmd.getDetalle().getTVpagada().getSerie();
				//lineaCadena.crearArchivo(rutaCDR, paquete.cmd.getCabecera().getIDEmpresa()+extensionCDR);
				//datosExtra.setUnitAddres(Integer.valueOf(Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(220, 222))));
				//lastFlag = datosExtra.getUnitAddres();
//				lastFlag = Integer.valueOf(Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(220, 222)));
				
				System.out.println("lastFlag"+paquete.getValue("lastFlag").toString());
				
				if (lastFlag==6)
				{
//					lineaCadena.GuardarRegistro(paquete,lastFlag);
					//this.lineaCdr.append("94");                   
//					this.lineaCdr.append(paquete.getValue("ciu"));
					//BSI_Code  		= Conversiones.HexadecimalToDecimal(recordType.geteTrama().substring(4 , 8));
					//Serial    		= Conversiones.HexadecimalToDecimal(recordType.geteTrama().substring(8 , 32));				
					//this.lineaCdr.append(Conversiones.HexadecimalToAscii(paquete.getValue("eTrama").toString().substring(8, 32)));
					 seriedeco1 = Conversiones.HexadecimalToAscii(paquete.getValue("eTrama").toString().substring(8, 32));
//					 this.lineaCdr.append(seriedeco1);					
					//Package_Handle    = Conversiones.HexadecimalToDecimal(recordType.geteTrama().substring(32, 40));
					//Program_Handle    = Conversiones.HexadecimalToDecimal(recordType.geteTrama().substring(40, 48));
//					paquete.setValue("PPV1", Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(40, 48)));
//					this.lineaCdr.append(Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(40, 48)));
					//Polldate 			= Conversiones.HexadecimalToDecimal(recordType.geteTrama().substring(48, 80));
//					paquete.setValue("PollDate1", Conversiones.HexadecimalToAscii(paquete.getValue("eTrama").toString().substring(48, 80)));
					//this.lineaCdr.append(Conversiones.HexadecimalToAscii(paquete.getValue("eTrama").toString().substring(48, 80)));
//					fecha = this.lineaCadena.CambiarFormato(Conversiones.HexadecimalToAscii(paquete.getValue("eTrama").toString().substring(48, 80)));
//					this.lineaCdr.append(fecha.trim());					
					//Feature	    	= Conversiones.HexadecimalToDecimal(recordType.geteTrama().substring(80, 82));
					//Epoch_Start_Time  = Conversiones.HexadecimalToDecimal(recordType.geteTrama().substring(82, 114));
//					fechaStartTime = this.lineaCadena.CambiarFormatoStartTime(Conversiones.HexadecimalToAscii(paquete.getValue("eTrama").toString().substring(82, 114)));
//					this.lineaCdr.append(fechaStartTime.trim());					
					//Serial_Number  	= Conversiones.HexadecimalToDecimal(recordType.geteTrama().substring(114,138));
					//Package_Service   = Conversiones.HexadecimalToDecimal(recordType.geteTrama().substring(138,146));
					//Program_Handle    = Conversiones.HexadecimalToDecimal(recordType.geteTrama().substring(146,154));
					//PollDate  		= Conversiones.HexadecimalToDecimal(recordType.geteTrama().substring(154,186));
					//Feature_Setting	= Conversiones.HexadecimalToDecimal(recordType.geteTrama().substring(186,188));
					//Epoch_Start_Time	= Conversiones.HexadecimalToDecimal(recordType.geteTrama().substring(188,220));
					//Last_Record_Flag	= Conversiones.HexadecimalToDecimal(recordType.geteTrama().substring(220,222));
					
					//this.lineaCadena.LineaCDR(this.lineaCdr.toString());
					//this.lineaCadena.Close();
					this.lineaCadena.GuardarRegistro(paquete,lastFlag);					 

				}
				else if (lastFlag==7)
				{
					
					System.out.println("UnitAddres == 7");
					
					
					//this.lineaCdr.append(paquete.getValue("ciu"));	
					//BSI_Code  		= Conversiones.HexadecimalToDecimal(recordType.geteTrama().substring(4 , 8));
					//Serial    		= Conversiones.HexadecimalToDecimal(recordType.geteTrama().substring(8 , 32));
					//this.lineaCdr.append(Conversiones.HexadecimalToAscii(paquete.getValue("eTrama").toString().substring(8, 32)));
					 seriedeco1 = Conversiones.HexadecimalToAscii(paquete.getValue("eTrama").toString().substring(8, 32));

					//this.lineaCdr.append(seriedeco1);
					//Package_Handle    = Conversiones.HexadecimalToDecimal(recordType.geteTrama().substring(32, 40));			
					//Program_Handle    = Conversiones.HexadecimalToDecimal(recordType.geteTrama().substring(40, 48));
					//this.lineaCdr.append(Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(40, 48)));
					//Polldate 			= Conversiones.HexadecimalToDecimal(recordType.geteTrama().substring(48, 80));			
					//this.lineaCdr.append(Conversiones.HexadecimalToAscii(paquete.getValue("eTrama").toString().substring(48, 80)));
					//fecha = this.lineaCadena.CambiarFormato(Conversiones.HexadecimalToAscii(paquete.getValue("eTrama").toString().substring(48, 80)));
					//this.lineaCdr.append(fecha.trim());						
					//Feature	    	= Conversiones.HexadecimalToDecimal(recordType.geteTrama().substring(80, 82));
					//Epoch_Start_Time  = Conversiones.HexadecimalToDecimal(recordType.geteTrama().substring(82, 114));
					//fechaStartTime = this.lineaCadena.CambiarFormatoStartTime(Conversiones.HexadecimalToAscii(paquete.getValue("eTrama").toString().substring(82, 114)));
					//this.lineaCdr.append(fechaStartTime.trim());				
					// Segundo_Registro
					//this.lineaCdr.append("-");
					//this.lineaCdr.append(paquete.getValue("ciu"));					
					//Serial_Number  	= Conversiones.HexadecimalToDecimal(recordType.geteTrama().substring(114,138));
					//this.lineaCdr.append(Conversiones.HexadecimalToAscii(paquete.getValue("eTrama").toString().substring(114, 138)));
					 seriedeco2 = Conversiones.HexadecimalToAscii(paquete.getValue("eTrama").toString().substring(114, 138));

					//this.lineaCdr.append(seriedeco2);
					//Package_Service   = Conversiones.HexadecimalToDecimal(recordType.geteTrama().substring(138,146));
					//Program_Handle    = Conversiones.HexadecimalToDecimal(recordType.geteTrama().substring(146,154));				
					//this.lineaCdr.append(Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(146, 154)));
					//PollDate  		= Conversiones.HexadecimalToDecimal(recordType.geteTrama().substring(154,186));
					//this.lineaCdr.append(Conversiones.HexadecimalToAscii(paquete.getValue("eTrama").toString().substring(154, 186)));
					//fecha = this.lineaCadena.CambiarFormato(Conversiones.HexadecimalToAscii(paquete.getValue("eTrama").toString().substring(154, 186)));
					//this.lineaCdr.append(fecha.trim());						
					//Feature_Setting	= Conversiones.HexadecimalToDecimal(recordType.geteTrama().substring(186,188));
					//Epoch_Start_Time	= Conversiones.HexadecimalToDecimal(recordType.geteTrama().substring(188,220));
					//fechaStartTime = this.lineaCadena.CambiarFormatoStartTime(Conversiones.HexadecimalToAscii(paquete.getValue("eTrama").toString().substring(188, 220)));
					//this.lineaCdr.append(fechaStartTime.trim());
					//Last_Record_Flag	= Conversiones.HexadecimalToDecimal(recordType.geteTrama().substring(220,222));
					/*StringTokenizer st = new StringTokenizer(this.lineaCdr.toString());			
					while (st.hasMoreTokens())
					{
						this.lineaCadena.LineaCDR(this.lineaCdr.toString());
					}
					this.lineaCadena.Close();*/
					//String [] temp = null;
					//temp = this.lineaCdr.toString().split("-");

					//for (int i = 0 ; i < temp.length ; i++) 
					//{
					//this.lineaCadena.LineaCDR(temp[i].toString());
					//}						
					    this.lineaCadena.GuardarRegistro(paquete,lastFlag);
					//this.lineaCadena.Close();
				}
				
//				numEve.setCantE(Integer.valueOf(Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(222, 224))));
//				datosExtra.setNumEve(numEve);
				datosExtra.setUnitAddres(Integer.valueOf(Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(tramainicial, tramafinal))));				
				System.out.println("pp"+datosExtra.getUnitAddres());
              }
              else
              {
  				mensaje.setCodError(1);
				mensaje.setDetMensaje("Recoleccion Realizada con Exito");
              }
				
				
			break;
	
			case 771:
				
				
				
				/* Type Component */	 
				//msgSubType = 4-6
				//bitMask    = 6-14
				//unitAddress =14-46 
				//datosExtra.setUnitAddres(Integer.parseInt(Conversiones.HexadecimalToAscii(paquete.getValue("eTrama").toString().substring(14, 46))));
				//equipType   = 46-50
				datosExtra.setTipoDeco(Integer.valueOf(Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(46, 50))));
				
				//equiSType   = 50-54 
				//recordType.geteTrama().substring(50, 54 );
	
				/* Plant Component */
				//msgSubType 		= 54-56
				//bitMask    		= 56-64
				//headEndHandle 	= 64-72
				//upstream_plant   	= 72-80
				//downstream_plant 	= 80-88
				//reserved1			= 88-96
				//reserved1			= 96-104
				//VCM_Handle       	= 104-112
				//datosExtra.setCodMap(Integer.valueOf(Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(104, 112))));

				/* State Component */
				//msgSubType      = 112-114
				//bitMask         = 114-122
				//onPlantFlag     = 122-124				
				datosExtra.setIdServ(Integer.valueOf(Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(122, 124))));
				//operationCode   = 124-126  
				//datosExtra.setActivo(Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(124, 126)));
	
				/* Feature Component */
				//msgSubType      = 126-128
				//bitMask         = 128-136
				//creditAllowed   = 136-144
				datosExtra.setCredito(Integer.valueOf(Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(136, 144))));
				//purchasAllowed  = 144-152
				//maxPackCost     = 152-156
				//timeZoneId      = 156-160
				//EPG_Region      = 160-164
				//regionConfig    = 164-168
				//turnOn          = 168-172
				//turnOff         = 172-176
				//outPut          = 176-178
				//featureSetting  = 178-186
	
				/* Status Component */
				//msgSubType      = 186-188
				
				//initializedFlag = 188-190
				//activatedFlag   = 190-192
				datosExtra.setActivo(Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(190, 192)));
				//respondingFlag  = 192-194
				datosExtra.setCodMap(Integer.valueOf(Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(192, 194))));
				//installDate     = 194-226
	
				/* Business System Owner Component */
				//msgSubType      = 226-228
				//respondingFlag  = 228-232
				
				/* Cable Card */
				//msgSubType    		  = 232-234		
				//Bit_Mask 				  = 234-242
				//Cable Card Id           = 238-272
				//Host Id				  = 272-306
				//Data		      		  = 306-334
				//Override			      = 334-336

				/* MCSC */
				//msgSubType    		  = 336-338		
				//Bit_Mask 		          = 338-346
				//New Serial Number       = 346-370
				//Autoreport              = 370-372
				//Mating_Status		      = 374-376
				//Date/Time               = 376-384

				

				/* Device */

				//msgSubType    		  = 226-228		
				//Bit_Mask 		          = 228-236
				String idaccount = Conversiones.HexadecimalToAscii(paquete.getValue("eTrama").toString().substring(306, 346));
				datosExtra.setPlant(idaccount.trim().substring(2, idaccount.trim().length()));
				//Location                = 434-458
				//STB_Mac_Address	      = 458-482
				//Treatment_Type          = 482-484
				//FIPS_CODE               = 484-496				

				
				mensaje.setCodError(1);
				mensaje.setDetMensaje("Consulta Realizada");
				
				

	
			break;
		}
		mensaje.setDatosExtrasTVP(datosExtra);
        //mensaje.setCodError(1);
        //mensaje.setDetMensaje("Proceso Realizado con Exito");
		return mensaje;
	}

	public Mensaje ValidarErrorACC(ParametrosTV paquete) throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException
	{
		
		if (paquete.getValue("eStatusWork").toString().equals(5001))
		{
			comandRes = ""+5001;
		}
		else
		{
			comandRes = Conversiones.HexadecimalToDecimal(paquete.getValue("eStatusWork").toString());
		}
		
		switch(Integer.valueOf(comandRes))
		{
		
			case 5001:
				mensaje.setCodError(5001);
				mensaje.setDetMensaje("Existio Error en la Comunicacion");
			break;
		
			case 1:
					
					paquete.setValue("eData", paquete.getValue("eTrama").toString().substring(4,8));
					binario = Conversiones.HexadecimalToBinario(paquete.getValue("eData").toString());
					binario = String.format("%16s",binario).replace(' ', '0');
					binario = binario.substring(15, 16);	
					System.out.println("binario"+binario);
					if (binario.equals("1"))
					{
						
						if (paquete.cmd.getCabecera().getInterface()!=713)
						{
							mensaje.setCodError(Integer.valueOf(comandRes));
							mensaje.setDetMensaje("Proceso Realizado con Exito");
						}
						else
						{
							mensaje.setCodError(Integer.valueOf(comandRes));
							mensaje.setDetMensaje("Proceso Realizado con Exito");
							

							datosExtra.setUnitAddres(Integer.valueOf(Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(16, 24))));

						}
					}
					else if (Integer.valueOf(binario)==0)
					{
						//System.out.println(paquete.getValue("eTrama").toString().substring(8, 12));
						eCodeWord = Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(8, 12));
						AdmErrorestvp errores = new AdmErrorestvpDAO().findByStrErrorAcc(""+eCodeWord).get(0);
						
						try
						{
						 
							mensaje.setCodError(Integer.valueOf(errores.getStrError()));
							/*if (mensaje.getCodError()==10036 || mensaje.getCodError()==10047)
							{

								valorUno = Integer.valueOf(Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(16, 20)))*8;
								valorDos = Integer.valueOf(Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(20, 24)));
								totalConverterId = valorUno + valorDos;
								//paquete.getValue("eTrama").toString().substring(4, 12);
								ConverterId		= ""+totalConverterId;
								System.out.println("unitaddres"+ConverterId);
							}*/
							mensaje.setDetMensaje(errores.getStrErrorString());
							datosExtra.setActivo(binario);
							datosExtra.setUnitAddres(1);
						}
						catch (Exception e)
						{
							mensaje.setCodError(5003);
							mensaje.setDetMensaje("Error no Especificado");
						}						
						
						
					}					
			break;
	
			case 281:
				valorUno = Integer.valueOf(Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(4, 8)))*8;
				valorDos = Integer.valueOf(Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(8, 12)));
				totalConverterId = valorUno + valorDos;
				//paquete.getValue("eTrama").toString().substring(4, 12);
				ConverterId		= ""+totalConverterId;
				System.out.println("ConverterId"+ConverterId);
				
				
				datosExtra.setUnitAddres(Integer.valueOf(ConverterId));
				
				SerialNumber		=
				Conversiones.HexadecimalToAscii(paquete.getValue("eTrama").toString().substring(12, 36));
				//System.out.println("SerialNumber"+paquete.getValue("eTrama").toString().substring(12, 36));
/*
					datosExtra.setPlant("Serial Number"+SerialNumber);
*/
				//ConverterType	=				
				datosExtra.setTipoDeco(Integer.valueOf(Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(36, 40))));				
				
				FieldStatusWord1 = 
				Conversiones.HexadecimalToBinario(paquete.getValue("eTrama").toString().substring(40, 44));				
				//System.out.println("FSW1"+FieldStatusWord1);
				FieldStatusWord2 = 			 
				Conversiones.DecimalToBinario(Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(44, 48)));				
				
				PhoneIndex		=
				Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(48, 52));				
				
				HubNumber 		= 
				Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(52, 56));
				
				MasterSlaveType=
				Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(56, 60));			
				
				MasterSlaveKey =
				Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(60, 68));				
				
				Filler =
				Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(68, 72));			
				
				//AccountNumber =
				System.out.println(Conversiones.HexadecimalToAscii(paquete.getValue("eTrama").toString().substring(72, 96)));
				System.out.println("TIPOAA"+paquete.cmd.getDetalle().getTVpagada().getTipoA());
				if (paquete.cmd.getDetalle().getTVpagada().getTipoA()==500003)
				{
					datosExtra.setPlant("Serial Number"+SerialNumber);						
				}
				else if (paquete.cmd.getDetalle().getTVpagada().getTipoA()==500005
						||paquete.cmd.getDetalle().getTVpagada().getTipoA()==500006
						||paquete.cmd.getDetalle().getTVpagada().getTipoA()==500007
						)
				{
					    ConverterStatus	=
						Conversiones.HexadecimalToAscii(paquete.getValue("eTrama").toString().substring(140, 144));				
						System.out.println("ConverterStatus"+ConverterStatus);
						datosExtra.setPlant(ConverterStatus);					
				}
				else if (paquete.cmd.getDetalle().getTVpagada().getTipoA()==500008)
				{
					datosExtra.setPlant(Conversiones.HexadecimalToAscii(paquete.getValue("eTrama").toString().substring(72, 96)));
					
				}
				TelephoneNumber	=
				Conversiones.HexadecimalToAscii(paquete.getValue("eTrama").toString().substring(96, 116));				

				//StatusWord		=
				System.out.println(Conversiones.HexadecimalToBinario(paquete.getValue("eTrama").toString().substring(116, 120)));
				datosExtra.setActivo(Conversiones.HexadecimalToBinario(paquete.getValue("eTrama").toString().substring(116, 120)));

				PurchaseLimit	=
				Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(120, 124));				

				TimeoutLimit		=
				Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(124, 128));
				
				EmergencyAlertMask=
				Conversiones.DecimalToBinario(Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(128, 132)));				
				
				tuningType		=
				Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(132, 136));
				
				TimeZone			=
				Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(136, 140));				
				
				
				
				//ChannelMap		=
				datosExtra.setCodMap(Integer.valueOf(Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(144, 148))));				
				
				OutputChannel	=		 
				Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(148, 152));				
				
				FrequencyMap		=
				Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(152, 154));				
				
				Aux12VOPtion		=			 
				Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(154, 156));				
				
				Amplifier		=
				Conversiones.HexadecimalToAscii(paquete.getValue("eTrama").toString().substring(156, 168));
				
				EncodedServicesTo=
				Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(168, 172));				
				//EncodedServiceNum=				
				//comienza = 172;
				//termina = comienza + 4;
				
				
//				List<TvpEquivalencias> serviciosCodInt = new TvpEquivalenciasDAO().findAllServiciosCodInt("ciudadServicio", ciudad, "codigoTitan", serviciosGroupBy.get(i).getCodigoTitan());
				ciudad = paquete.cmd.getCabecera().getIDEmpresa();
				try
				{
					obtenerBitsServicio = Conversiones.HexadecimalToBinario(paquete.getValue("eTrama").toString().substring(172, 176));
					obtenerBitsServicio = obtenerBitsServicio.substring(2,obtenerBitsServicio.length());
					servicio = Integer.valueOf(Conversiones.BinarioToDecimal(obtenerBitsServicio));
					List<TvpEquivalencias> servicioTitan = new TvpEquivalenciasDAO().findByServicios("ciudadServicio", ciudad, "codigoInterno", servicio, "tcontrolador", 101, "tequivalencia", "S");
	
	
					datosExtra.setIdServ(servicioTitan.get(0).getCodigoTitan());				
				}
				catch(Exception e)
				{}
				comienza = 176;
				termina = comienza + 4;

				servicios = Integer.valueOf(EncodedServicesTo)-1;
				NumPaq numPaq = new ObjectFactory().createNumPaq();
				numPaq.setCantP(servicios);
				//System.out.println("Numero Servicios"+servicios);
				for (int i = 0;i<servicios;i++)
				{
					IdPay idPay = new ObjectFactory().createIdPay();
					obtenerBits = Conversiones.HexadecimalToBinario(paquete.getValue("eTrama").toString().substring(comienza, termina));
					obtenerBits = obtenerBits.substring(2,obtenerBits.length());
					//System.out.println(obtenerBits);
					pay = Integer.valueOf(Conversiones.BinarioToDecimal(obtenerBits));
					System.out.println("payChannel"+pay.toString().length());
					System.out.println("payChannel"+pay);
					
					if (pay.toString().length()<4)
					{
						
						if (pay == 167)
						{
							paquetesTitan = new TvpEquivalenciasDAO().findByServiciosPayChannels("ciudadServicio", ciudad, "codigoInterno",Integer.valueOf(Conversiones.BinarioToDecimal(obtenerBits)) , "codInt", 0);
						}
						else
						{
							paquetesTitan = new TvpEquivalenciasDAO().findByServiciosPayChannels("ciudadServicio", ciudad, "codigoInterno",Integer.valueOf(Conversiones.BinarioToDecimal(obtenerBits)) , "codInt", 1);
						}
						
						try
						{
							idPay.setIdPay(paquetesTitan.get(0).getCodigoTitan());
						}
						catch(Exception e)
						{
							
						}						
					}
					else
					{
						EventoId = pay;
						//idPay.setIdPay(pay);
					}
					//System.out.println("ServicioTitan"+206);
					//System.out.println("Codigo Interno"+idPay.getIdPay());
					

					numPaq.getIdPay().add(idPay);
					comienza= comienza+4;
					termina = termina+4;					
				}

				if (this.EventoId>0)
				{
					NumEve numEve = new ObjectFactory().createNumEve();
					numEve.setCantE(1);
					IdEve idEve = new ObjectFactory().createIdEve();
					idEve.setIdEve(this.EventoId);
					numEve.getIdEve().add(idEve);
					datosExtra.setNumEve(numEve);
					numPaq.setCantP(servicios-1);
				}				
				
				datosExtra.setNumPaq(numPaq);				

				//System.out.println("Activo"+datosExtra.getActivo());
				//System.out.println("StatusWord1"+Conversiones.HexadecimalToBinario(paquete.getValue("eTrama").toString().substring(116, 120)));
				
				//System.out.println("ConverterType"+Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(36, 40)));
				//System.out.println("ChannelMap"+Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(144, 148)));
				
///////////////////////////////////////////////////////////////////////////////////////////////////////////
			/*	System.out.println("ConverterId-"+ConverterId);
				System.out.println("SerialNumber-"+SerialNumber);
				System.out.println("FSW1-"+FieldStatusWord1);
				System.out.println("FSW2-"+FieldStatusWord2);
				System.out.println("PhoneIndex-"+PhoneIndex);
				System.out.println("HubNumber-"+HubNumber);
				System.out.println("MasterSlaveType-"+MasterSlaveType);
				System.out.println("MasterSlaveKey-"+MasterSlaveKey);
				System.out.println("Filler-"+Filler);
				System.out.println("Account Number-"+AccountNumber);
				System.out.println("TelephoneNumber-"+TelephoneNumber);
				System.out.println("PurchaseLimit-"+PurchaseLimit);
				System.out.println("TimeoutLimit-"+TimeoutLimit);
				System.out.println("EmergencyAlertMask-"+EmergencyAlertMask);
				System.out.println("tuningType-"+tuningType);
				System.out.println("TimeZone-"+TimeZone);
				System.out.println("ConverterStatus-"+ConverterStatus);
				System.out.println("OutputChannel-"+OutputChannel);
				System.out.println("FrequencyMap-"+FrequencyMap);
				System.out.println("Aux12-"+Aux12VOPtion);
				System.out.println("Amplifier-"+Amplifier);
				*/
				System.out.println("EncodedServicesTo-"+EncodedServicesTo);
				
				mensaje.setCodError(1);
				mensaje.setDetMensaje("Consulta Realizada con Exito");
///////////////////////////////////////////////////////////////////////////////////////////////////////////
				
				
				
			break;
		}
		mensaje.setDatosExtrasTVP(datosExtra);
		return mensaje;
	}	
	

	public Mensaje ValidarErrorDALVI(ParametrosTV paquete) throws IOException, IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException 
	{
		//lectura de archivo			
		String p="";
		String c="";
		String s="";
		String sm="";
	//  Cuando obtenga 0 se debera setear el estado del comando en R(procesado) y posteriormente trasladado
    //	la tabala de comandos ejecutados correctamente
		
		int codError=0;//variable del error
		String decoderState="";
		String serviceMask="";

//		File f = new File(ComandosDALVI.RUTA_PREIN + "/0000000.txt/");//cambia ruta en Linux

//		File f = new File("/usr/Phanton/00000000.RLY"); 
//		FileInputStream fis = new FileInputStream(f);
//		BufferedReader entrada = new BufferedReader(new InputStreamReader(fis)); 
	//System.out.println("antes del while");
	//	while(flag)
		//{
	//		if ( f.exists() ) 
	//		{
				//p = entrada.readLine();// solo la primera linea -- ojo en el momento de pasar producción debe ser la primeera linea
		
		
				comandRes = paquete.getValue("eStatusWork").toString();
				System.out.println("Comand res"+comandRes);

				//codError=Integer.valueOf(paquete.getValue("eTrama").toString().substring(6,7));
				
				String [] temp = null;
				
			    temp = paquete.getValue("eTrama").toString().split("=");

			    for (int i = 0 ; i < temp.length ; i++) 
			    {
			          	if (i==0)
			          	{
			          		
			          		codError = Integer.valueOf(String.format("%3s",temp[i+1].toString()).replace(' ', '0'));
			          	}
				}		
				
			AdmErrorestvp errores = new AdmErrorestvpDAO().findByStrErrorDalvi(""+codError).get(0);
			try
			{
				switch(Integer.valueOf(comandRes))
				{	
				case 20:
					mensaje.setCodError(Integer.valueOf(errores.getStrError()));
					mensaje.setDetMensaje(errores.getStrErrorString());
					/*
					if (codError==0)
					{
						mensaje.setCodError(Integer.valueOf(errores.getStrError()));					
						mensaje.setDetMensaje(errores.getStrErrorString());
					}
					else if (codError==1)
					{				
						mensaje.setDetMensaje(errores.getStrErrorString());
						//mensaje.setDetMensaje("HeadEnd ID no es valido");
					}
					else if(codError==2)
					{
						mensaje.setDetMensaje(errores.getStrErrorString());
						//mensaje.setDetMensaje("No se cargaron los servicios");
					}
					else if(codError==26)
					{
						mensaje.setDetMensaje(errores.getStrErrorString());
						//mensaje.setDetMensaje("Actualizacion en progreso");
					}*/
				break;

				case 22:
					
					mensaje.setCodError(Integer.valueOf(errores.getStrError()));
					if (codError==0)
					{
						mensaje.setDetMensaje("Proceso Realizado con Exito");
					}
					else
					{		
						mensaje.setDetMensaje(errores.getStrErrorString());
						//mensaje.setDetMensaje("Id del decodificador no se encuentra en el sistema");

					}
	
					
					//mensaje.setCodError(codError);
/*					mensaje.setCodError(Integer.valueOf(errores.getStrError()));
					if (codError==0)
					{
						mensaje.setDetMensaje("Proceso Realizado con Exito");
					}
					else if (codError==41)
					{		
						mensaje.setDetMensaje(errores.getStrErrorString());
						//mensaje.setDetMensaje("Id del decodificador no se encuentra en el sistema");
					}*/
				break;
/*
				case 24:

					
					//mensaje.setCodError(codError);
					mensaje.setCodError(Integer.valueOf(errores.getStrError()));
					sm=entrada.readLine();//Service Mask	(HEX)
					serviceMask=sm.substring(5);

					String cadenaBits=Long.toBinaryString(Long.parseLong(serviceMask,16));


					//paso a un arreglo mi cadena de binarios.
					char[] bitsServiceMaskTmp = cadenaBits.toCharArray();

					char[] bitsServiceMask = new char[bitsServiceMaskTmp.length + 1];

					for(int i=1;i<=bitsServiceMaskTmp.length;i++)
					{
						bitsServiceMask[i] = bitsServiceMaskTmp[i-1];
					}

					List<String> lstEvent = new ArrayList<String>();


					//mis posiciones de bits 
					for(int i=1;i<bitsServiceMask.length;i++)
					{

						if(bitsServiceMask[i]=='1')
						{
							lstEvent.add(String.valueOf(i));

						}
					}

					int cantP=0;

					int cantE=0;


					List<TvpEquivalencias> equiv;


//					contadores de servicios, eventos y paquetes			    		    

					for(int i=0; i<lstEvent.size(); i++)
					{

						equiv = new TvpEquivalenciasDAO().findByIdpaquete(Integer.parseInt(lstEvent.get(i)));


						if(equiv.get(0).getTipoEquiv().equals("P") || equiv.get(0).getTipoEquiv().equals("S"))
						{

							if(equiv.get(0).getTipoEquiv().equals("S"))
							{
								datosExtra.setIdServ(Integer.parseInt(lstEvent.get(i)));
							}
							else
							{
								cantP++;
							}
						}
						else 			    	
						{	
							cantE++;
						}
					}

					NumPaq numPaquetes= new NumPaq();
					numPaquetes.setCantP(cantP);

					NumEve numEventos=new NumEve();
					numEventos.setCantE(cantE);

					List<IdPay> idPaquete=numPaquetes.getIdPay();
					IdPay idPaquetes; 

					List<IdEve> idEvento=numEventos.getIdEve();
					IdEve idEventos;

					for(int i=0; i<lstEvent.size(); i++)
					{

						equiv = new TvpEquivalenciasDAO().findByIdpaquete(Integer.parseInt(lstEvent.get(i)));

						if (equiv.get(0).getTipoEquiv().equals("P") || equiv.get(0).getTipoEquiv().equals("S"))
						{

							if (equiv.get(0).getTipoEquiv().equals("P") || equiv.get(0).getTipoEquiv().equals("S"))
							{
								if (equiv.get(0).getTipoEquiv().equals("P"))
								{	
									idPaquetes = new IdPay();
									idPaquetes.setIdPay(Integer.parseInt(lstEvent.get(i)));
									idPaquete.add(idPaquetes);
								}
							}
							else
							{
								idEventos = new IdEve();
								idEventos.setIdEve(Integer.parseInt(lstEvent.get(i)));
								idEvento.add(idEventos);
							}
						}

					}

					//seteo mis valores		    		    
					datosExtra.setNumPaq(numPaquetes);

					datosExtra.setNumEve(numEventos);

					entrada.readLine();//Subscriber ID

					s=entrada.readLine(); //decoderState
					decoderState=s.substring(5);

					datosExtra.setActivo(decoderState);

					if (codError==0)
					{
						mensaje.setDetMensaje("Everything was processed OK (without error)");
					}
					else if (codError==41)
					{				
						mensaje.setDetMensaje("Decoder ID not on the system");

					}

					mensaje.setDatosExtrasTVP(datosExtra);

					break;
*/
				case 35://PREGUNTAR WENDY YA QUE NO CONSTA EN EL MANUAL

					//mensaje.setCodError(codError);
					mensaje.setCodError(Integer.valueOf(errores.getStrError()));
					if (codError==0)
					{
						mensaje.setDetMensaje("Proceso Realizado con Exito");
					}
					else if (codError==41)
					{				
						mensaje.setDetMensaje("El Id del Decodificador no se encuentra en el sistema");

					}
					else if (codError==50)
					{				
						mensaje.setDetMensaje("Subscribers ID not found");

					}
					else if (codError==59)
					{				
						mensaje.setDetMensaje("Decoder Not available to assign");

					}
				break;

				case 47:
					
					//mensaje.setCodError(codError);
					mensaje.setCodError(Integer.valueOf(errores.getStrError()));
					if (codError==0)
					{
						mensaje.setDetMensaje("Proceso Realizado con Exito");
					}
					else if (codError==81)
					{				
						mensaje.setDetMensaje("ID de PPV no encontrado");

					}
					else if (codError==82)
					{				
						mensaje.setDetMensaje("PPV State Invalid (0 to 7)");

					}

				break;

		}
	  }
	  catch (Exception e)
	  {
	   mensaje.setCodError(5002);
	   mensaje.setDetMensaje("Error no Especificado");
	  }

		
		return mensaje;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
