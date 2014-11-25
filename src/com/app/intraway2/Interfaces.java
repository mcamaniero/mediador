package com.app.intraway2;

import intrawayWS.cliente.InterfaceObjInput;
import intrawayWS.cliente.InterfaceObjOutput;
import intrawayWS.cliente.IntrawayWSDLLocator;
import intrawayWS.cliente.IntrawayWSDLPortType;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import tvcable.app.comarch.utils.Codigos;

import com.app.intraway.consulta.GetDocsisStatus;
import com.app.intraway.consulta.GetDocsisTrafficReport;
import com.app.intraway.parametros2.Interface500Encoding;
import com.app.intraway.parametros2.Interface600Encoding;
import com.app.intraway.parametros2.Interface602Encoding;
import com.app.intraway.parametros2.Interface610Encoding;
import com.app.intraway.parametros2.Interface612Encoding;
import com.app.intraway.parametros2.Interface620Encoding;
import com.app.intraway.parametros2.Interface622Encoding;
import com.app.intraway.parametros2.Interface626Encoding;
import com.app.intraway.parametros2.Interface628Encoding;
import com.app.intraway.parametros2.Interface630Encoding;
import com.app.intraway.parametros2.Interface820Encoding;
import com.app.intraway.parametros2.Interface822Encoding;
import com.app.intraway.parametros2.Interface824Encoding;
import com.app.intraway.parametros2.Interface830Encoding;

import ec.com.grupotvcable.wsdlintraway2.*;


public class Interfaces {

	public static final String AuthKey = "key-secreto-wstitan";
	
	protected final IntrawayWSDLLocator locator = new IntrawayWSDLLocator();
	protected IntrawayWSDLPortType Cliente = null;

	protected Mensaje Mens = new ObjectFactory().createMensaje();
	protected Comando Cmd = null;

	protected Cabecera Cab = null;
	protected Estandar Est = null;
	protected Interfaz Inter = null;
	
	private InterfaceObjInput Input = null;
	
	int idServicio = 0;
	
	public Interfaces(Comando comando) throws ServiceException, RemoteException {
		
		this.Cmd = comando;
		Cab = Cmd.getCabecera();
		Est = Cmd.getDetalle().getIntraway().getEstandar();
		Inter = Cmd.getDetalle().getIntraway().getInterfaz();

		Cliente = locator.getIntrawayWSDLPort();
		Input = getInterfaceObjInput();


		if( Cab.getIDEmpresa().equals(""+Codigos.MACHALA )){
			if(Cab.getInterface().equals("600")){
				Inter.setServidorEmailCRMId("26");
			}else if(Cab.getInterface().equals("602")){
				Inter.setDominio("oro.satnet.net");
			}
		}else if( Cab.getIDEmpresa().equals(""+Codigos.AMBATO)){
			if(Cab.getInterface().equals("600")){
				Inter.setServidorEmailCRMId("2");
			}else if(Cab.getInterface().equals("602")){
				Inter.setDominio("amb.satnet.net");
			}
		}else if( Cab.getIDEmpresa().equals(""+Codigos.MANTA) ){
			if(Cab.getInterface().equals("600")){
				Inter.setServidorEmailCRMId("27");
			}else if(Cab.getInterface().equals("602")){
				Inter.setDominio("mnb.satnet.net");
			}
		}
		
		
		switch(Integer.parseInt(Cab.getInterface())){
		case 500: 
			//IdTipoClienteCRM es est.getClienteCRM()
			Input.setXmlEncoding(new Interface500Encoding(Inter.getNombre(), Inter.getUsername(),
					Inter.getPassword(), Inter.getIdTipoCliente(), 
					Inter.getEmailNoticias(),Inter.getIdCicloFactCRM()).getXMLEncoding());
			break;//Gestión de clientes
		case 600: 
			Input.setXmlEncoding(new Interface600Encoding(Inter.getCantidad(),
				Inter.getQuotamax(), Inter.getServidorEmailCRMId()
				).getXMLEncoding()); 
			break;//Creación de Espacios para cuentas de Correo.
		case 602: Input.setXmlEncoding( 
				new Interface602Encoding(Inter.getUsername(), Inter.getDominio(),
				Inter.getPassword(), Inter.getDiskQuota(), Inter.getNoticias(),
				Inter.getName(), Cmd ).getXMLEncoding() ); 
			break;//Creación de cuentas de correo
		case 610: Input.setXmlEncoding(new Interface610Encoding(Inter.getServicTypeCRMId()).getXMLEncoding());
			break;//Creación espacios DialUp
			//610 falta campo FacTrafico
		case 612: Input.setXmlEncoding(new Interface612Encoding(Inter.getPassword(),
				Inter.getUsername()).getXMLEncoding());  
			break;//Creación Cuenta DialUp
		case 620: Input.setXmlEncoding(new Interface620Encoding(Inter.getCantCPE(),Inter.getEnableAccounting(), Inter.getHub(),
				Inter.getNodo(), Inter.getBuscarTagCRM(), Inter.getDocsis(), Inter.getProductName(), Inter.getIspMtaCrmId(),
				Inter.getBandPackageCRMId(), Inter.getPrepaidPolicyCRMId(), Inter.getIdISPCRM(), Inter.getServicePackageCRMId(),
				Inter.getActivactionCode()).getXMLEncoding());
			break;//Gestión de Espacios Cable MODEM DOCSIS
		case 622: Input.setXmlEncoding(new Interface622Encoding(Inter.getMACAddress(), Inter.getNoBoot()
					).getXMLEncoding());	 
			break;//Activación de Cable MODEM
		case 626: Input.setXmlEncoding(new Interface626Encoding(Inter.getSnmpGroupCRMID(), 
				Inter.getNoBoot()).getXMLEncoding()); 
			break;//Filtros, Bloque al CPs						//idMensajeCRM        //Datos
		case 628: Input.setXmlEncoding(new Interface628Encoding(Inter.getCustomer3(), 
				Inter.getCustomer4()).getXMLEncoding()); 
			break;//Mensajes
		case 630: Input.setXmlEncoding(new Interface630Encoding(Inter.getCantidad()).getXMLEncoding()); 
			break;//Activación PCS Adicionales asociadas a un Cable MODEM
		case 820: Input.setXmlEncoding(new Interface820Encoding(Inter.getCmsCMDID(), Inter.getIspMtaCrmId(),
				Inter.getProfileCRMId(), Inter.getProductName(), Inter.getProvisioning(),
				Inter.getHostName(), Inter.getActivactionCode(), Inter.getSendtoController()).getXMLEncoding());
			break;//Creación de Espacios para MTAs
			//820 getCmsCMDID  verificar(es CmsCRMID)
		case 822: Input.setXmlEncoding(new Interface822Encoding(Inter.getMACAddress(), 
				Inter.getLinesQTy(), Inter.getMtaModelCRMId(), Inter.getNoBoot(),
				Inter.getSendtoController()).getXMLEncoding()); 
			break;//Activación de MTAs
		case 824: Input.setXmlEncoding(new Interface824Encoding(Inter.getEndpointNumber(), Inter.getTn(),
				Inter.getProfileCRMId(), Inter.getHomeExchangeCRMId(),
				Inter.getProvisioning(), Inter.getSendtoController()).getXMLEncoding()); 
			break;//Asignación de Números Telefónicos a Endpoints
		case 830: Input.setXmlEncoding(new Interface830Encoding(Inter.getFeatureCrmId(),
				Inter.getActive(), Inter.getCustomer1(), Inter.getCustomer2(),
				Inter.getCustomer3(), Inter.getCustomer4(), Inter.getSendtoController()
				).getXMLEncoding());break;
			//Gestión de Servicios Adicionales de EndPoints
		case 999: new GetDocsisStatus(""+Cab.getIDEmpresa(), ""+Est.getIdVenta(), ""+Est.getIdProducto(), ""+Est.getIdServicio());break;
		
		//Consulta
		case 998: new GetDocsisTrafficReport(""+Cab.getIDEmpresa(), ""+Est.getClienteCRM());break;
		
		//Consulta											cliente				cantidad registros
		//case 997: new GetReport(""+Cab.getIDEmpresa(), ""+Est.getAuthKey(), Est.getIdEstado());break;
		
		}
		
		setDatosRespuesta();
	}

	
	private InterfaceObjInput getInterfaceObjInput(){
		Input = new InterfaceObjInput();
		Input.setIdInterface(""+Cab.getInterface());
		Input.setIdEstado(""+Est.getIdEstado());
		Input.setAsyncronic("0");//siempre va en cero porque va ser Sincronico
		//segun wendy va vacio
		Input.setFechaDiferido("");//revisar formato/ est.getFechaDiferida().toString()
		Input.setIdCliente(""+Est.getClienteCRM());
		Input.setIdEmpresa(""+Cab.getIDEmpresa());
		Input.setIdVenta(""+Est.getIdVenta());
		Input.setIdVentaPadre(""+Est.getIdVentaPadre());
		
		Input.setIdProducto(Est.getIdProducto());
		
		Input.setIdServicioPadre(Est.getIdServicioPadre());
		Input.setIdProductoPadre(Est.getIdProductoPadre());
		Input.setIdPromotor(Est.getIdPromotor());
		//Input.setXmlEncoding(); este campo lo llena cada interfaz
		Input.setIdEntradaCaller("0");
		
		//int idServicio=0;
		if(Cab.getInterface().equals("500"))
			idServicio=0;
		else if(Cab.getInterface().equals("600") || Cab.getInterface().equals("602"))
			idServicio=3;
		else if(Cab.getInterface().equals("610") || Cab.getInterface().equals("612"))
			idServicio=4;
		else if(Cab.getInterface().equals("620") || Cab.getInterface().equals("622") || Cab.getInterface().equals("626")  || Cab.getInterface().equals("628"))
			idServicio=1;
		else if(Cab.getInterface().equals("820") || Cab.getInterface().equals("822"))
			idServicio=20;
		else if(Cab.getInterface().equals("824"))
			idServicio=21;
		else if(Cab.getInterface().equals("830"))
			idServicio=22;
		
		//System.out.println("***servicio "+idServicio);
		Cmd.getDetalle().getIntraway().getEstandar().setIdServicio(""+idServicio);

		Input.setIdServicio(""+idServicio);
		//System.out.println("-----idservicio "+Est.getClienteCRM()+" "+idServicio);
		return Input;
	}
	
	
	
	private void setDatosRespuesta() throws RemoteException{
		InterfaceObjInput[] arrayInte = new InterfaceObjInput[1];
		arrayInte[0] = Input;
		String doAtomic = "0";
		
		//System.out.println("XML: "+Input.getXmlEncoding());
		if(Input.getXmlEncoding()!=null){
			InterfaceObjOutput[] resp = Cliente.put(AuthKey, arrayInte, doAtomic);
			InterfaceObjOutput res = resp[0];
			setErrores(res);
		}
	}
	
	
	private void setErrores(InterfaceObjOutput err){
		
		//String entrada = err.getIdEntradaCaller();
		//String error = err.getIdError();
		//String strError = err.getErrorStr();
		
		//System.out.println(new Date().toString()+" Error :"+error+" - "+strError);
		
		//int codError = Integer.parseInt(error);
		
		Mens.setCodError(err.getIdError());
		Mens.setDetMensaje(err.getErrorStr());
		
		
	}
	
	
	protected Mensaje getRespuesta(){
		return this.Mens;
	}
	
}
