package com.app.intraway.parametros2;

import intrawayWS.cliente.InterfaceObjInput;
import intrawayWS.cliente.InterfaceObjOutput;
import intrawayWS.cliente.IntrawayWSDLLocator;
import intrawayWS.cliente.IntrawayWSDLPortType;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.app.intraway.consulta.ids.CableModem;
import com.app.intraway.consulta.ids.CallFeature;
import com.app.intraway.consulta.ids.DialUp;
import com.app.intraway.consulta.ids.Email;
import com.app.intraway.consulta.ids.Linea;
import com.app.intraway.consulta.ids.Mta;

public class Interfaces {

	public static final String AuthKey = "key-secreto-wstitan";
	
	public static final String ACCION_ELIMINAR 	= "0";
	public static final String ACCION_BLOQUEAR 	= "1";
	public static final String ACCION_MODIFICAR = "2";
	public static final String ACCION_SUSPENDER = "4";
	
	public static final int INTERFAZ_CM 			= 620;
	public static final int INTERFAZ_ACTIVAR_CM		= 622;
	public static final int INTERFAZ_ACTIVAR_MTA	= 822;
	public static final int INTERFAZ_BLOQUEO_CM 	= 626;
	public static final int INTERFAZ_MTA 			= 820;
	public static final int INTERFAZ_LINEA 			= 824;
	public static final int INTERFAZ_CALLFEATURE 	= 830;
	
	public static final int INTERFAZ_EMAIL 			= 600;
	public static final int INTERFAZ_DIALUP			= 610;
	
	protected final IntrawayWSDLLocator locator = new IntrawayWSDLLocator();
	protected IntrawayWSDLPortType Cliente = null;
	private InterfaceObjInput Input = null;
	
	int idServicio = 0;
	
	//private String IdEstado = "0";
	private String IdClienteCRM;
	private String IdEmpresaCRM;
	private String IdVenta;
	private String IdVentaPadre;
	private String IdServicio;
	private String IdProducto;
	private String IdServicioPadre;
	private String IdProductoPadre;
	private String Interfaz;
	private String IdPromotor = "0";
	
	private String XmlEncoding;
	
	public Interfaces(Object comando, int interfaz, String userEliminacion) throws ServiceException, RemoteException {
		
		Interfaz = ""+interfaz;
		
		Cliente = locator.getIntrawayWSDLPort();
				
		switch(interfaz){
		case INTERFAZ_CM: 
			
				CableModem cm = (CableModem)comando;
				IdClienteCRM = cm.getIdClienteCRM();
				IdEmpresaCRM = cm.getIdEmpresaCRM();
				
				XmlEncoding = new Interface620Encoding("1", "1",
				"", "", IdEmpresaCRM.equals("94") ? "323" : "321", "1.1", "Eliminacion por "+userEliminacion, "0", 
				"0", "0", "provisioning", "telefonia", "").getXMLEncoding();
				
				IdVenta="0";
				IdVentaPadre="0";
				IdServicio = "1";
				IdProducto = cm.getIdProducto();
				IdServicioPadre = "21";
				IdProductoPadre = "0";
				
			break;
			
		case INTERFAZ_ACTIVAR_CM: 
			
			CableModem cma = (CableModem)comando;
			IdClienteCRM = cma.getIdClienteCRM();
			IdEmpresaCRM = cma.getIdEmpresaCRM();
			
			XmlEncoding = new Interface622Encoding(cma.getMacaddress(), "false").getXMLEncoding();
			
			IdVenta="0";
			IdVentaPadre="0";
			IdServicio = "1";
			IdProducto = cma.getIdProducto();
			IdServicioPadre = "0";
			IdProductoPadre = "0";
			
		break;
		
		case INTERFAZ_ACTIVAR_MTA: 
			
			Mta amta = (Mta)comando;
			IdClienteCRM = amta.getIdClienteCRM();
			IdEmpresaCRM = amta.getIdEmpresaCRM();
			
			XmlEncoding = new Interface822Encoding(amta.getMacaddress(),"2",amta.getMtaModel(),"false","TRUE").getXMLEncoding();
			
			IdVenta="0";
			IdVentaPadre="0";
			IdServicio = "20";
			IdProducto = amta.getIdProducto();
			IdServicioPadre = "1";
			IdProductoPadre = amta.getIdProductoPadre();
			
		break;
			
		case INTERFAZ_BLOQUEO_CM: 
			
			CableModem cmb = (CableModem)comando;
			IdClienteCRM = cmb.getIdClienteCRM();
			IdEmpresaCRM = cmb.getIdEmpresaCRM();
			
			XmlEncoding = new Interface626Encoding("BLOQ_IP_ALL_CPE","TRUE").getXMLEncoding();
			
			IdVenta="0";
			IdVentaPadre="0";
			IdServicio = "1";
			IdProducto = cmb.getIdProducto();
			IdServicioPadre = "21";
			IdProductoPadre = "0";
			
		break;
		case INTERFAZ_MTA: 
				Mta mta = (Mta)comando;
				
				IdClienteCRM = mta.getIdClienteCRM();
				IdEmpresaCRM = mta.getIdEmpresaCRM();
				
				XmlEncoding = new Interface820Encoding(IdEmpresaCRM.equals("94") ? "gye01" : "uio01", 
						"50", mta.getMtaProfile(),
						"mta", "", "", 
						"", "TRUE").getXMLEncoding(); //TRUE para q elimine al safari
				
				IdVenta="0";
				IdVentaPadre="0";
				IdServicio = "20";
				IdProducto = mta.getIdProducto();
				IdServicioPadre = "21";
				IdProductoPadre = mta.getIdProductoPadre();
		
			break;//Creación de Espacios para MTAs
		case INTERFAZ_LINEA: 
				Linea linea = (Linea)comando;
				XmlEncoding = new Interface824Encoding(linea.getEndPointNumber(), linea.getTN(), linea.getEpProfile(),
						linea.getEpHomeExchange(), "0", "TRUE").getXMLEncoding(); 
				
				IdClienteCRM 	= linea.getIdClienteCRM();
				IdEmpresaCRM 	= linea.getIdEmpresaCRM();
				IdVenta			= "0";
				IdVentaPadre	= "0";
				IdServicio 		= "21";
				IdProducto 		= linea.getIdProducto();
				IdServicioPadre = "20";
				IdProductoPadre = linea.getIdProductoPadre();
			
			break;//Asignación de Números Telefónicos a Endpoints
		
		case INTERFAZ_CALLFEATURE: 
				CallFeature call = (CallFeature)comando;
				XmlEncoding = new Interface830Encoding(call.getNombre(), "1", call.getCustom1(),
						call.getCustom2(), "", "", "TRUE").getXMLEncoding();
				
				IdClienteCRM = call.getIdClienteCRM();
				IdEmpresaCRM = call.getIdEmpresaCRM();
				IdVenta="0";
				IdVentaPadre="0";
				IdServicio = "22";
				IdProducto = call.getIdProducto();
				IdServicioPadre = "21";
				IdProductoPadre = call.getIdProductoPadre();
				
				break;
				
		case INTERFAZ_EMAIL: 
			Email email = (Email)comando;
			XmlEncoding = new Interface600Encoding("1", email.getDiskQuota(),
					email.getServidorEmailCrmId()).getXMLEncoding();
			
			IdClienteCRM = email.getIdClienteCRM();
			IdEmpresaCRM = email.getIdEmpresaCRM();
			IdVenta="0";
			IdVentaPadre="0";
			IdServicio = "3";
			IdProducto = email.getIdProducto();
			IdServicioPadre = "1";
			IdProductoPadre = email.getIdProductoPadre();
			
			break;
			
		case INTERFAZ_DIALUP: 
			DialUp dial = (DialUp)comando;
			XmlEncoding = new Interface610Encoding("0").getXMLEncoding();
			
			IdClienteCRM = dial.getIdClienteCRM();
			IdEmpresaCRM = dial.getIdEmpresaCRM();
			IdVenta="0";
			IdVentaPadre="0";
			IdServicio = "4";
			IdProducto = dial.getIdProducto();
			IdServicioPadre = "0";
			IdProductoPadre = dial.getIdProductoPadre();
			
			break;
		}
		
	}

	
	//retorno 0 : Proceso realizado con exito
	//relizo un split para separar el codigo del mensaje
	public String EjecutarAccion(String idEstado) throws RemoteException{
		Input = new InterfaceObjInput();
		Input.setIdInterface(Interfaz);
		Input.setIdEstado(idEstado);
		Input.setAsyncronic("0");//siempre va en cero porque va ser Sincronico
		Input.setFechaDiferido("");
		Input.setIdCliente(IdClienteCRM);
		Input.setIdEmpresa(IdEmpresaCRM);
		Input.setIdVenta(IdVenta);
		Input.setIdVentaPadre(IdVentaPadre);
		Input.setIdProducto(IdProducto);
		Input.setIdServicioPadre(IdServicioPadre);
		Input.setIdProductoPadre(IdProductoPadre);
		
		Input.setIdPromotor(IdPromotor);
		Input.setXmlEncoding(XmlEncoding);
		Input.setIdEntradaCaller("0");
		Input.setIdServicio(IdServicio);
		
		InterfaceObjInput[] arrayInte = new InterfaceObjInput[1];
		arrayInte[0] = Input;
		String doAtomic = "0";
		
		InterfaceObjOutput[] resp = Cliente.put(AuthKey, arrayInte, doAtomic);
		//InterfaceObjOutput res = resp[0];
		
		System.out.println("Resp: "+resp[0].getIdError()+" : "+resp[0].getErrorStr());
	
		return (resp[0].getIdError().trim().equals("0")?"1":resp[0].getIdError().trim())+":"+resp[0].getErrorStr().trim();
		
	}
	
	
	

	
}
