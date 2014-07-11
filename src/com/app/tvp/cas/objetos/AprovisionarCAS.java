package com.app.tvp.cas.objetos;

import java.rmi.RemoteException;
import java.util.List;
import java.util.StringTokenizer;

import com.app.tvp.ParametrosTV;
import com.app.tvp.cas.cliente.ITvCableIntegrationServiceProxy;
import com.app.tvp.cas.cliente.objetos.AddPacksResponse;
import com.app.tvp.cas.cliente.objetos.DisconnectResponse;
import com.app.tvp.cas.cliente.objetos.EGetInformationResponse;
import com.app.tvp.cas.cliente.objetos.InstallResponse;
import com.app.tvp.cas.cliente.objetos.ReconnectResponse;
import com.app.tvp.cas.cliente.objetos.RemovePacksResponse;
import com.app.tvp.cas.cliente.objetos.SettopBox;
import com.app.tvp.cas.cliente.objetos.UninstallResponse;
import com.app.tvp.cas.cliente.objetos.tuves.GetInformationResponse;
import com.app.tvp.cas.cliente.objetos.tuves.InformationType;
import com.app.tvp.cas.util.CargarProperties;
import com.app.tvp.cas.util.ComandosCAS;
import com.app.tvp.cas.util.Encriptacion;
import com.app.tvp.cas.util.consultas.ConsultasBSDESA;
import com.app.tvp.cas.util.consultas.ConsultasTytanPU;

import ec.com.grupotvcable.wsdltvpagada.Respuesta;
import ec.com.grupotvcable.wsdltvpagada.Comando;
import ec.com.grupotvcable.wsdltvpagada.Mensaje;

public class AprovisionarCAS 
{
	private ParametrosTV parametrosTv = null; 
	private ITvCableIntegrationServiceProxy proxy = null;
	private int codigoError = -1;
	private boolean ejecutoDisconnectAntes = false;
	
	public AprovisionarCAS(ParametrosTV param)
	{
		parametrosTv = param;
		proxy = new ITvCableIntegrationServiceProxy();
	}
	
	public Respuesta aprovisionar()
	{
		Respuesta retorno = null;
		try
		{
			String comandosDTH = (String)parametrosTv.getValue("codComandoDth");
			if(comandosDTH!=null)
			{
				StringTokenizer st = new StringTokenizer(comandosDTH,"|");
				DatosCAS parametrosCAS = new DatosCAS();
				CargarProperties paramProperties = CargarProperties.instanciar();
				Comando comd = (Comando)parametrosTv.getValue("cmd");
				parametrosCAS.setUsername(paramProperties.getUser());
				parametrosCAS.setPassword(Encriptacion.encriptar(paramProperties.getKey()));
				parametrosCAS.setSequence(String.valueOf(comd.getCabecera().getSecuencia()));
				parametrosCAS.setSmartcard(comd.getDetalle().getTVpagada().getSerie());
				parametrosCAS.setUser_id(String.valueOf(comd.getDetalle().getTVpagada().getTipoA()));
				parametrosCAS.setReference_number(null);
				parametrosCAS.setNotes(null);
				parametrosCAS.setCustomer_id(null);
				parametrosCAS.setZone(null);
				StringBuilder sbRespuesta = new StringBuilder();
				while(st.hasMoreTokens())
				{
					String comandoDth = st.nextToken();
					try
					{
						int comando = Integer.parseInt(comandoDth);
						if(ComandosCAS.INSTALL==comando)
						{
							//Ejecutamos el comando install
							sbRespuesta.append(install(parametrosCAS, comd));
						}
						else if(ComandosCAS.UNINSTALL==comando)
						{
							//Ejecutamos el comando uninstall
							sbRespuesta.append(uninstall(parametrosCAS, comd));
						}
						else if(ComandosCAS.DISCONNECT==comando)
						{
							//Ejecutamos el comando disconnect
							sbRespuesta.append(disconnect(parametrosCAS, comd));
							ejecutoDisconnectAntes = true;
						}
						else if(ComandosCAS.RECONNECT==comando)
						{
							//Ejecutamos el comando reconect
							sbRespuesta.append(reconnect(parametrosCAS, comd));
						}
						else if(ComandosCAS.ADD_PACKS==comando)
						{
							//Ejecutamos el comando addPacks
							sbRespuesta.append(addPacks(parametrosCAS, comd));
						}
						else if(ComandosCAS.REMOVE_PACKS==comando)
						{
							//Ejecutamos el comando removePacks
							sbRespuesta.append(removePacks(parametrosCAS, comd));
						}
						else if(ComandosCAS.GET_INFORMATION==comando)
						{
							//Ejecutamos el comando getInformation
							sbRespuesta.append(getInformation(parametrosCAS, comd));
						}
						sbRespuesta.append("&");
					}
					catch(NumberFormatException nfe)
					{
						System.out.println("Error conversion de comando a entero "+nfe.getMessage());
						break;
					}
				}
				retorno = new Respuesta();
				retorno.setCabecera(comd.getCabecera());
				Mensaje mensaje = new Mensaje();
				mensaje.setCodError(codigoError);
				mensaje.setDetMensaje(sbRespuesta.toString());
				retorno.setMensaje(mensaje);
			}
		}
		catch(NoSuchFieldException nsfe)
		{
			System.out.println("Excepcion Propiedad no Encontrada "+nsfe.getMessage());
		}
		catch(IllegalAccessException iae)
		{
			System.out.println("Excepcion Acceso Ilegal "+iae.getMessage());
		}
		catch(RemoteException re)
		{
			System.out.println("Error al invocar al web service de aprovicionamiendo "+re.getMessage());
		}
		return retorno;
	}
	
	private String install(DatosCAS datos,Comando cmd) throws NoSuchFieldException,IllegalAccessException,RemoteException
	{
		String retorno = null;
		//Sacar SetTopBox, Packs y mastercard
		SettopBox stb = obtenerSetTopBox(datos.getSmartcard());
		List<String> packs = obtenerPacks(Integer.valueOf(parametrosTv.getValue("controlador").toString()),cmd.getDetalle().getTVpagada().getIdServicio());
		String mastercard = obtenerMasterCard(datos.getSmartcard());
		InstallResponse respuesta = proxy.install(datos.getUsername(),datos.getPassword(),datos.getSequence(),datos.getSmartcard(),stb,packs.toArray(new String[packs.size()]),mastercard,datos.getUser_id(),datos.getReference_number(),datos.getNotes(),datos.getCustomer_id(),datos.getZone());
		retorno = armarRespuesta("Install",respuesta.getReturnValue(),respuesta.getAnswer(),respuesta.getResultCode(),respuesta.getResultDescription());
		return retorno;
	}
	private String uninstall(DatosCAS datos,Comando cmd) throws RemoteException
	{
		String retorno = null;
		UninstallResponse respuesta = proxy.uninstall(datos.getUsername(),datos.getPassword(),datos.getSequence(),datos.getSmartcard(),datos.getUser_id(),datos.getReference_number(),datos.getNotes(),datos.getCustomer_id(),datos.getZone());
		retorno = armarRespuesta("Uninstall",respuesta.getReturnValue(),respuesta.getAnswer(),respuesta.getResultCode(),respuesta.getResultDescription());
		return retorno;
	}
	private String disconnect(DatosCAS datos,Comando cmd) throws RemoteException
	{
		String retorno = null;
		DisconnectResponse respuesta = proxy.disconnect(datos.getUsername(),datos.getPassword(),datos.getSequence(),datos.getSmartcard(),datos.getUser_id(),datos.getReference_number(),datos.getNotes(),datos.getCustomer_id(),datos.getZone());
		retorno = armarRespuesta("Disconnect",respuesta.getReturnValue(),respuesta.getAnswer(),respuesta.getResultCode(),respuesta.getResultDescription());
		return retorno;
	}
	private String reconnect(DatosCAS datos,Comando cmd) throws NoSuchFieldException,IllegalAccessException,RemoteException
	{
		String retorno = null;
		int idPaquetes = cmd.getDetalle().getTVpagada().getIdServicio();//Packs con los que va a reconectar (Si no se ejecuto antes disconnect)
		if(ejecutoDisconnectAntes)
		{
			//Sacar Packs de tv nacional
			idPaquetes = 0;
		}
		List<String> packs = obtenerPacks(Integer.valueOf(parametrosTv.getValue("controlador").toString()),idPaquetes);
		ReconnectResponse respuesta = proxy.reconnect(datos.getUsername(),datos.getPassword(),datos.getSequence(),datos.getSmartcard(),packs.toArray(new String[packs.size()]),datos.getUser_id(),datos.getReference_number(),datos.getNotes(),datos.getCustomer_id(),datos.getZone());
		retorno = armarRespuesta("Reconnect",respuesta.getReturnValue(),respuesta.getAnswer(),respuesta.getResultCode(),respuesta.getResultDescription()); 
		return retorno;
	}
	private String addPacks(DatosCAS datos,Comando cmd) throws NoSuchFieldException,IllegalAccessException,RemoteException
	{
		String retorno = null;
		//Sacar los packs a añadir
		List<String> packs = obtenerPacks(Integer.valueOf(parametrosTv.getValue("controlador").toString()),cmd.getDetalle().getTVpagada().getIdServicio());
		AddPacksResponse respuesta = proxy.addPacks(datos.getUsername(),datos.getPassword(),datos.getSequence(),datos.getSmartcard(),packs.toArray(new String[packs.size()]),datos.getUser_id(),datos.getReference_number(),datos.getNotes(),datos.getCustomer_id(),datos.getZone());
		retorno = armarRespuesta("AddPacks",respuesta.getReturnValue(),respuesta.getAnswer(),respuesta.getResultCode(),respuesta.getResultDescription());
		return retorno;
	}
	private String removePacks(DatosCAS datos,Comando cmd) throws NoSuchFieldException,IllegalAccessException,RemoteException
	{
		String retorno = null;
		//Sacar los packs a quitar
		List<String> packs = obtenerPacks(Integer.valueOf(parametrosTv.getValue("controlador").toString()),cmd.getDetalle().getTVpagada().getIdServicio());
		RemovePacksResponse respuesta = proxy.removePacks(datos.getUsername(),datos.getPassword(),datos.getSequence(),datos.getSmartcard(),packs.toArray(new String[packs.size()]),datos.getUser_id(),datos.getReference_number(),datos.getNotes(),datos.getCustomer_id(),datos.getZone());
		retorno = armarRespuesta("RemovePacks",respuesta.getReturnValue(),respuesta.getAnswer(),respuesta.getResultCode(),respuesta.getResultDescription());
		return retorno;
	}
	private String getInformation(DatosCAS datos,Comando cmd) throws RemoteException
	{
		StringBuilder retorno = new StringBuilder();
		EGetInformationResponse respuesta = proxy.getInformation(datos.getUsername(),datos.getPassword(),datos.getSequence(),datos.getSmartcard(),datos.getUser_id(),datos.getReference_number(),datos.getNotes(),datos.getCustomer_id(),datos.getZone());
		GetInformationResponse aux = respuesta.getGetInformationResponse();
		if(aux==null)
		{
			retorno.append(armarRespuesta("GetInformation",null,null,respuesta.getResultCode(),respuesta.getResultDescription()));
		}
		else
		{
			retorno.append(armarRespuesta("GetInformation",String.valueOf(aux.getReturnField()),aux.getAnswerField(),respuesta.getResultCode(),respuesta.getResultDescription()));
			retorno.append(":");
			InformationType infRecibida = aux.getInformationField();
			retorno.append(infRecibida.getSmartcardField());
			retorno.append(";");
			retorno.append(infRecibida.getMastercardField());
			retorno.append(";");
			retorno.append(infRecibida.getPinField());
			retorno.append(";");
			retorno.append(infRecibida.getDealerField());
			retorno.append(";");
			retorno.append(infRecibida.getSettopboxField().getCodeField());
			retorno.append(";");
			retorno.append(infRecibida.getSettopboxField().getBrandField());
			retorno.append(";");
			retorno.append(infRecibida.getSettopboxField().getModelField());
			retorno.append(";");
			retorno.append(infRecibida.getSettopboxField().getFirmwareField());
			retorno.append(";");
			int i=0;
			//cargamos los paquetes que tiene
			for(i=0;i<infRecibida.getPacksField().length;i++)
			{
				if(i==0)
				{
					retorno.append("[");
				}
				retorno.append(infRecibida.getPacksField()[i]);
				retorno.append(";");
				if(i==(infRecibida.getPacksField().length-1))
				{
					retorno.append("]");
				}
			}
			//cargamos las slavesmartcards
			for(i=0;i<infRecibida.getSlavesmartcardsField().length;i++)
			{
				if(i==0)
				{
					retorno.append("[");
				}
				retorno.append(infRecibida.getSlavesmartcardsField()[i]);
				retorno.append(";");
				if(i==(infRecibida.getSlavesmartcardsField().length-1))
				{
					retorno.append("]");
				}
			}
		}
		return retorno.toString();
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////
	private SettopBox obtenerSetTopBox(String smartcard)
	{
		SettopBox retorno = null;
		ConsultasBSDESA con = new ConsultasBSDESA();
		ObjetoConsultaSetTopBox aux = con.obtenerSetTopBox(smartcard);
		if(aux!=null)
		{
			retorno = new SettopBox();
			retorno.setBrand(null);
			retorno.setCode(aux.getSerieSTB());
			retorno.setFirmware(null);
			retorno.setModel(null);
		}
		return retorno;
	}
	private String obtenerMasterCard(String smartcard)
	{
		String retorno = null;
		ConsultasBSDESA con = new ConsultasBSDESA();
		ObjetoConsultaMasterCard aux = con.obtenerTarjetasPrincipal(smartcard);
		if(aux!=null)
		{
			retorno = aux.getMastercard();
		}
		return retorno;
	}
	private List<String> obtenerPacks(int controlador,int idServicio)
	{
		List<String> retorno = null;
		ConsultasTytanPU con = new ConsultasTytanPU();
		retorno = con.obtenerCodigoPaquetes(controlador, idServicio);
		return retorno;
	}
	private String armarRespuesta(String comandoEjecutado,String tuvesCode,String tuvesAnswer,String bCode,String bMessage)
	{
		StringBuilder retorno = new StringBuilder();
		if(comandoEjecutado!=null)
		{
			comandoEjecutado = comandoEjecutado.trim();
			if(comandoEjecutado.length()<1)
			{
				comandoEjecutado = "ND";
			}
		}
		else
		{
			comandoEjecutado = "ND";
		}
		if(tuvesCode!=null)
		{
			tuvesCode = tuvesCode.trim();
			if(tuvesCode.length()<1)
			{
				tuvesCode = "ND";
			}
			else
			{
				if(!tuvesCode.equalsIgnoreCase("0"))
				{
					codigoError = 17;
				}
			}
		}
		else
		{
			tuvesCode = "ND";
		}
		if(tuvesAnswer!=null)
		{
			tuvesAnswer = tuvesAnswer.trim();
			if(tuvesAnswer.length()<1)
			{
				tuvesAnswer = "ND";
			}
		}
		else
		{
			tuvesAnswer = "ND";
		}
		if(bCode!=null)
		{
			bCode = bCode.trim();
			if(bCode.length()<1)
			{
				bCode = "ND";
			}
			else
			{
				if(!bCode.equalsIgnoreCase("0"))
				{
					codigoError = 17;
				}
			}
		}
		else
		{
			bCode = "ND";
		}
		if(bMessage!=null)
		{
			bMessage = bMessage.trim();
			if(bMessage.length()<1)
			{
				bMessage = "ND";
			}
		}
		else
		{
			bMessage = "ND";
		}
		retorno.append(comandoEjecutado);
		retorno.append(":");
		retorno.append(bCode);
		retorno.append("|");
		retorno.append(bMessage);
		retorno.append(":");
		retorno.append(tuvesCode);
		retorno.append("|");
		retorno.append(tuvesAnswer);
		return retorno.toString();
	}
}