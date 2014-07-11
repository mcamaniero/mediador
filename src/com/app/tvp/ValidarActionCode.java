package com.app.tvp;
/**
 * @author wvasquez
 *
 */


import java.util.List;

import com.app.tv.tvp_equivalencias.dao.TvpEquivalencias;
import com.app.tv.tvp_equivalencias.dao.TvpEquivalenciasDAO;
import com.app.tv.tvp_serviciospaychannelsciudad.dao.TvpServiciosPayChannelsCiudad;
import com.app.tv.tvp_serviciospaychannelsciudad.dao.TvpServiciosPayChannelsCiudadDAO;

import tvcable.app.comarch.utils.Conversiones;
import ec.com.grupotvcable.wsdltvpagada.*;

public class ValidarActionCode {

	private DatosExtrasTVP datosExtra;
	private int intSeparadorA;
	private int intSeparadorB;
	private int numeroServicios;
	private int comienzo;
	private int termino;
	private ParametrosTV parametros;
	private Integer paq;
	private int ciudad;
	private int codigoInterno;
	private int codigoInternoBase;
	
	private int cantidadCodInt = 0;
	private int[] arreglo=new int[15];
	
	private String codigoInternoS;
	private String codigoInternoBaseS;
	private int contador;
	private int mayor =0;
	private int servicio = 0;
	private int paquete = 0;
	private StringBuilder serviciosRestantes = new StringBuilder();
	private int codigoInternoPayChannel;
	private String codigoPayChannel;
	private String servcodint = "";
	private int contadorRestantes;
	private int lenght;
	private String[] temp;
	private List<TvpServiciosPayChannelsCiudad> serviciosGroupBy;
	private int tempcodigoint;
	private int contar;
	private int serviciosGroup;
	int[] anArray;
	private List<TvpEquivalencias> serviciosCodInt;
	private int contadorigual;
	private List<TvpServiciosPayChannelsCiudad> paquetesGroupBy;
	private List<TvpEquivalencias> paquetesCodInt;
	private int paqueteGroupTitan;
	private int contadorPaquetes =0;
	private int lenPaquete ;
	private int paqueteTitan = 0;
	private int[] paquetePaquete;
	private boolean flag = false;
	/**
	 * @param args
	 */
	public ValidarActionCode(DatosExtrasTVP ejecutaDatosExtra)
	{
		datosExtra = ejecutaDatosExtra;
	}
	public DatosExtrasTVP ActionCode(String actionCode, ParametrosTV paquete) throws NumberFormatException, IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException
	{   /// Todos los datos extra del ActionCode van
		/// Desde el bit 46 en adelante
		//System.out.println("ActionCode"+actionCode);
		switch (Integer.valueOf(actionCode))
		{
			case 1:
				//numChangedServices = 
				numeroServicios = Integer.valueOf(Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(46, 50)));
				//serviceHandled     =
				comienzo = 50;
				termino  = 58;
					datosExtra.setCodMap(numeroServicios);
				/*for (int i=0;i<numeroServicios;i++)
				{
					datosExtra.setIdServ(Integer.valueOf(Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(comienzo, termino))));
					comienzo = comienzo + 8;
					termino  = termino  + 8;
				}*/
				   int CantPaquetes=1;
				   NumPaq numPaquetes = new ObjectFactory().createNumPaq();
					for (int i=0;i<numeroServicios;i++)
				   {
					if (Integer.valueOf(Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(comienzo, termino)))!=0)
					{
						numPaquetes.setCantP(CantPaquetes);
						IdPay idPay = new ObjectFactory().createIdPay();
						idPay.setIdPay(Integer.valueOf(Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(comienzo, termino))));
						numPaquetes.getIdPay().add(idPay);
						datosExtra.setNumPaq(numPaquetes);
						CantPaquetes++;
						comienzo = comienzo + 8;
						termino  = termino  + 8;
					}
				   }
				
				

			break;
	
			case 3:		
				
				//ACK_NAK          = 
				//Conversiones.HexadecimalToDecimal(recordType.geteTrama().substring(46, 50));
				//creditAllowed    = 
				datosExtra.setCredito(Integer.valueOf(Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(50, 58))));
				//purchasedAllowed = 
				//Conversiones.HexadecimalToDecimal(recordType.geteTrama().substring(58, 66));
				//maxPackCost      = 
				//Conversiones.HexadecimalToDecimal(recordType.geteTrama().substring(66, 70));
				//timeZoneHandle   = 
				//Conversiones.HexadecimalToDecimal(recordType.geteTrama().substring(70, 74));
				//countryCode      = 
				//Conversiones.HexadecimalToDecimal(recordType.geteTrama().substring(74, 78));
				//currencyRegion   = 
				//Conversiones.HexadecimalToDecimal(recordType.geteTrama().substring(78, 80));
				//EPG_Region       = 
				//Conversiones.Hexa	decimalToDecimal(recordType.geteTrama().substring(80, 84));
				//turnOnVC         = 
				//Conversiones.HexadecimalToDecimal(recordType.geteTrama().substring(84, 88));
				//turnOffVC        = 
				//Conversiones.HexadecimalToDecimal(recordType.geteTrama().substring(88, 92));
				//outputChannel    = 
				//Conversiones.HexadecimalToDecimal(recordType.geteTrama().substring(92, 94));
				//featureSetting   = 
				System.out.println(Conversiones.DecimalToBinario(Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(94, 98))));
			break;
	
			case 4:
				//numChangedServices = 

				intSeparadorA = 50;
				intSeparadorB = 58;

				int nServPaquetes = Integer.valueOf(Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(46, 50)));
				
				//System.out.println("Servicio Paquetes"+nServPaquetes);
				ciudad = paquete.cmd.getCabecera().getIDEmpresa();
				
					/**
					 *  Obtener Codigo de Servicio
					 */
				
				serviciosGroupBy = new TvpServiciosPayChannelsCiudadDAO().findByCiudadServicioLike("ciudadServicio", ciudad,"tipo",1);

				for(int i=0;i<serviciosGroupBy.size();i++)
				{
					intSeparadorA = 50;
					intSeparadorB = 58;

						  cantidadCodInt =0;
						  
						  serviciosCodInt = new TvpEquivalenciasDAO().findAllServiciosCodInt("ciudadServicio", ciudad, "codigoTitan", serviciosGroupBy.get(i).getCodigoTitan());
                          serviciosGroup = serviciosGroupBy.get(i).getCodigoTitan();

                            contar = paquete.contarCodigosServicios(serviciosGroup,ciudad);
                            /*if (serviciosGroup == 202)
                            {
                            	System.out.println("contar"+contar);
                            }*/
						  contadorRestantes =0;
						  contador =0;  
						  for (int j=0; j<nServPaquetes;j++)
						  { 			
						    codigoInterno = Integer.valueOf(Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(intSeparadorA, intSeparadorB)));
						    //System.out.println("codigoInterno"+codigoInterno);
							for (int k=0; k<serviciosCodInt.size();k++)
							{
								if (codigoInterno == serviciosCodInt.get(k).getCodigoInterno())
								{
									contador ++;
								}	
							}

							intSeparadorA = intSeparadorA + 8;
							intSeparadorB = intSeparadorB + 8;							
						  }
/*
                          if (serviciosGroup == 202)
                          {
                          	System.out.println("contar"+contar);
                          	System.out.println("contador"+contador);
                          }*/

						  
						  
					if (contador == contar-1)
					{
				
							this.servicio = serviciosGroup;
								
					}
					
				}
				datosExtra.setIdServ(this.servicio);
/**
 *  Obtengo Codigos que no se Encuentran en Servicio para Usarlos e Identificar los Paquetes
 */				
				
			    serviciosCodInt = new TvpEquivalenciasDAO().findAllServiciosCodInt("ciudadServicio", ciudad, "codigoTitan", this.servicio);

			    intSeparadorA = 50;
				intSeparadorB = 58;
			    
				int arr=0;
				int b[] = new int[nServPaquetes];
				int codigosInternosTomados[] = new int[20];
				int contarCodigoInterno = 0;
				int CantP=1;
				
				for(int contarPaquetes=0;contarPaquetes<nServPaquetes;contarPaquetes++)
				{
					contadorigual = 0;
					codigoInterno = Integer.valueOf(Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(intSeparadorA, intSeparadorB)));
					for (int contarCodigos=0;contarCodigos<serviciosCodInt.size();contarCodigos++)
					{
						if (codigoInterno == serviciosCodInt.get(contarCodigos).getCodigoInterno())
						{			
							contadorigual ++;
						}
					}
					if (contadorigual == 0)
					{
						//System.out.println("codigoInterno"+codigoInterno);
						if (codigoInterno!=100250)
						{
							//System.out.println("codigoInterno"+codigoInterno);
							b[arr]=codigoInterno;
							arr++;
						}
						
					}
					intSeparadorA = intSeparadorA + 8;
					intSeparadorB = intSeparadorB + 8;	
				}

		/**
		 *  Obtener los Codigos de los Paquetes Contratados
		 */		
				
				paquetesGroupBy = new TvpServiciosPayChannelsCiudadDAO().findByCiudadServicioLike("ciudadServicio", ciudad,"tipo",2);	
				
				for (int paquetesGroup=0;paquetesGroup<paquetesGroupBy.size();paquetesGroup++)
				{
					paqueteGroupTitan = paquetesGroupBy.get(paquetesGroup).getCodigoTitan();
					//System.out.println("paqueteGroupTitan"+paqueteGroupTitan);
					paquetesCodInt = new TvpEquivalenciasDAO().findAllServiciosCodInt("ciudadServicio", ciudad, "codigoTitan", this.paqueteGroupTitan);
					contar = paquete.contarCodigosServicios(paqueteGroupTitan,ciudad)-1;

					
					
					for (int l=0; l<b.length;l++ )
					{
						if (b[l]!=0)
						{		


							//System.out.println("b[1]-"+b[l]);
							 for (int m=0;m<paquetesCodInt.size();m++)
							 { 
									if (b[l] == paquetesCodInt.get(m).getCodigoInterno())
									{
										if (b[l]==100200)
										{
											//System.out.println("HBO DIG-"+b[l]);
											contadorPaquetes =1;
											flag=true;
										}else if (b[l]==100205)
										{
											contadorPaquetes =1;
											flag=true;											
										}else if (b[l]==40701)
										{
											contadorPaquetes =1;
											flag=true;											
										}else if (b[l]==1840002)
										{
											contadorPaquetes =1;
											flag=true;											
										}else if (b[l]==100250)
										{
											contadorPaquetes =1;
											flag=true;											
										}
										else
										{
											contadorPaquetes ++;
											flag  =true;
											
										}
										
								 /*
								 if (b[l]==100200 || b[l]==100205 || b[l]==40701 || b[l]==1840002 || b[l]==100250 )
								 {
										contadorPaquetes =1;
										flag=true;											
								 }
								 else
								 {
									 	contadorPaquetes ++;
										flag  =true;	
								 }*/
								
										
										//System.out.println("mas mas"+paqueteGroupTitan);
									}	
							 }
						}

					}
					
					

					
					if (flag)
					{	
						if (paqueteGroupTitan==300)
						{
							System.out.println("contar-"+contar+"-contadorPaquetes-"+contadorPaquetes);						
						}
						if (paqueteGroupTitan==301)
						{
							System.out.println("contar-"+contar+"-contadorPaquetes-"+contadorPaquetes);						
						}
						
						if (contar == contadorPaquetes )
						{
									codigosInternosTomados[contarCodigoInterno]=paqueteGroupTitan;
									contarCodigoInterno ++;
						}
				    }
					
					
					flag=false;
					
			
					

					contadorPaquetes = 0;
				}
				
				
				
				
				//if (paqueteTitan != 0)
				if (codigosInternosTomados[0] != 0)					
				{
					//cantP= 1;
				   NumPaq numPaq = new ObjectFactory().createNumPaq();
				   for(int m =0;m<codigosInternosTomados.length;m++)
				   {
					if (codigosInternosTomados[m]!=0)
					{
						numPaq.setCantP(CantP);
						IdPay idPay = new ObjectFactory().createIdPay();
						//idPay.setIdPay(paqueteTitan);
						idPay.setIdPay(codigosInternosTomados[m]);
						numPaq.getIdPay().add(idPay);
						datosExtra.setNumPaq(numPaq);
						CantP++;
					}
				   }
				   //numPaq.setCantP(CantP);
				   //datosExtra.setNumPaq(numPaq);
				   
				   		
				   System.out.println("Cantidades"+CantP);
				   System.out.println("CantidadesP"+numPaq.getCantP());
				}	
				
				/*for (int v=0;v<=codigosInternosTomados.length;v++)
				{
					System.out.println("Paquetes"+codigosInternosTomados[v]);
				}*/
				
				//intSeparadorA = 50;
				//intSeparadorB = 58;

				

	/*			
				serviciosGroupBy = new TvpServiciosPayChannelsCiudadDAO().findByCiudadServicioLike("ciudadServicio", ciudad,"tipo",2);

				
				for (int i=0;i<nServPaquetes;i++)
				{
					//packageHandle 	=
					IdPay idPay = new ObjectFactory().createIdPay();
					
					codigoInterno = Integer.valueOf(Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(intSeparadorA, intSeparadorB)));
					List<TvpEquivalencias> serviciosCodInt = new TvpEquivalenciasDAO().findByCodInt("ciudadServicio", ciudad, "codigoTitan", this.servicio, "codigoInterno",codigoInterno);
					try{
						serviciosCodInt.get(0).getCodigoTitan();
					}catch(Exception e)
					{
						this.serviciosRestantes.append(codigoInterno);
						this.serviciosRestantes.append("-");
					}
					this.codigoInternoBaseS ="";

					List<TvpEquivalencias> servicios = new TvpEquivalenciasDAO().findByServicios("codigoInterno", codigoInterno, "codInt", 1,"tcontrolador",100,"tequivalencia","S");
					
					if (!servicios.isEmpty())
				    {
						
					  //datosExtra.setIdServ(servicios.get(0).getCodigoTitan());	
						
					}
					else
					{
					  paq=Integer.valueOf(Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(intSeparadorA, intSeparadorB)));
					  List<TvpEquivalencias> paquetes = new TvpEquivalenciasDAO().findByServicios("codigoInterno", paq, "codInt", 1,"tcontrolador",100,"tequivalencia","P");					  
					  if (!paquetes.isEmpty())
					  {
						  idPay.setIdPay(paquetes.get(0).getCodigoTitan());
						  numPaq.getIdPay().add(idPay);
					  }
					}
					intSeparadorA = intSeparadorA + 8;
					intSeparadorB = intSeparadorB + 8;
					
					//System.out.println("intSeparadorA"+intSeparadorA);
					//System.out.println("intSeparadorB"+intSeparadorB);
					
				}	
				
				lenght = this.serviciosRestantes.toString().length()-1;
				this.codigoInternoBaseS= this.serviciosRestantes.toString().substring(0, lenght);

				
				//System.out.println("serviciosRestantes-"+this.serviciosRestantes.toString());
				//System.out.println("serviciosRestantes-"+this.codigoInternoBaseS);
				
	       		  String delimitador = "-";
	       		  temp = this.codigoInternoBaseS.split(delimitador);	
	       		  // print splitted substrings
	       		  mayor = 0;
				for(int i=0;i<serviciosGroupBy.size();i++)
				{
  				  List<TvpEquivalencias> serviciosCodInt = new TvpEquivalenciasDAO().findAllServiciosCodInt("ciudadServicio", ciudad, "codigoTitan", serviciosGroupBy.get(i).getCodigoTitan());
  				  //System.out.println("servisosCodInt"+serviciosCodInt.size());
  				  contador = 0;
	       		  for(int j =0; j < temp.length ; j++)
	       		  {
	       			 tempcodigoint = Integer.valueOf(temp[j].toString());

	       			 if (serviciosCodInt.size()<=this.temp.length)
	       			 {	 
		       			 for (int k=0;k<serviciosCodInt.size();k++)
		       			  {
		       				 if (this.tempcodigoint == serviciosCodInt.get(k).getCodigoInterno()) 
		       				 {
		       					contador++;
		       				 }

		       				
		       			  }
		       			 
							
							if (contador > mayor)
							{
								this.mayor = contador;
								this.paquete = serviciosGroupBy.get(i).getCodigoTitan();
							}
							
	       			  }
	       		  }
				}
				
				System.out.println("Paquete"+this.paquete);
				

				
				datosExtra.setNumPaq(numPaq);*/
			break;
	
			case 5:	
				
				intSeparadorA = 58;
				intSeparadorB = 66;
				NumEve numEve = new ObjectFactory().createNumEve();		
				numEve.setCantE(Integer.valueOf(Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(46, 50))));
				
				//numEve.setCantE(contarEvento);
				if (numEve.getCantE()!=0)
				{
					for (int i=0;i<numEve.getCantE();i++)				
					{
						IdEve idEve = new ObjectFactory().createIdEve();
						idEve.setIdEve(Integer.valueOf(Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(intSeparadorA, intSeparadorB))));
						
						//numEve.getIdEve().add(idEve);
						System.out.println("cod eve"+Integer.valueOf(Conversiones.HexadecimalToDecimal(paquete.getValue("eTrama").toString().substring(intSeparadorA, intSeparadorB))));
						numEve.getIdEve().add(idEve);

						intSeparadorA = intSeparadorA + 16;
						intSeparadorB = intSeparadorB + 16;
					}
				}
				datosExtra.setNumEve(numEve);
				
			break;
		}
		return datosExtra;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
