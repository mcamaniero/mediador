package com.app.intraway;

import intrawayWS.cliente.InterfaceObjInput;
import intrawayWS.cliente.InterfaceObjOutput;
import intrawayWS.cliente.IntrawayWSDLLocator;
import intrawayWS.cliente.IntrawayWSDLPortType;

import java.io.IOException;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import tvcable.app.comarch.utils.Codigos;

import com.app.intraway.consulta.GetDocsisStatus;
import com.app.intraway.consulta.GetDocsisTrafficReport;
import com.app.intraway.consulta.GetReport;
import com.app.intraway.parametros.Interface500Encoding;
import com.app.intraway.parametros.Interface600Encoding;
import com.app.intraway.parametros.Interface602Encoding;
import com.app.intraway.parametros.Interface610Encoding;
import com.app.intraway.parametros.Interface612Encoding;
import com.app.intraway.parametros.Interface620Encoding;
import com.app.intraway.parametros.Interface622Encoding;
import com.app.intraway.parametros.Interface626Encoding;
import com.app.intraway.parametros.Interface628Encoding;
import com.app.intraway.parametros.Interface630Encoding;
import com.app.intraway.parametros.Interface820Encoding;
import com.app.intraway.parametros.Interface822Encoding;
import com.app.intraway.parametros.Interface824Encoding;
import com.app.intraway.parametros.Interface830Encoding;

import ec.com.grupotvcable.wsdlintraway.Cabecera;
import ec.com.grupotvcable.wsdlintraway.Comando;
import ec.com.grupotvcable.wsdlintraway.Estandar;
import ec.com.grupotvcable.wsdlintraway.Interfaz;
import ec.com.grupotvcable.wsdlintraway.Mensaje;
import ec.com.grupotvcable.wsdlintraway.ObjectFactory;
import ec.com.grupotvcable.wsdlmcafee.Respuesta;
import ec.com.grupotvcable.wsdlmcafee.WsdlMcAfeeImpl;




public class Interfaces {

	public static final String AuthKey = "key-secreto-titan";

	protected IntrawayWSDLLocator locator = null;
	protected IntrawayWSDLPortType Cliente = null;

	protected Mensaje Mens = new ObjectFactory().createMensaje();
	protected Comando Cmd = null;

	protected Cabecera Cab = null;
	protected Estandar Est = null;
	protected Interfaz Inter = null;

	private InterfaceObjInput Input = null;

	int idServicio = 0;

	private String Prefijo = "";

	public Interfaces(Comando comando, String pref) throws ServiceException, RemoteException, IntrawayExceptions {

		this.Prefijo = pref;
		this.Cmd = comando;

		Cab = Cmd.getCabecera();
		Est = Cmd.getDetalle().getIntraway().getEstandar();
		Inter = Cmd.getDetalle().getIntraway().getInterfaz();

		//si es para la linea extendida
		if(comando.getCabecera().getInterface() == 100){

			ec.com.grupotvcable.wsdlsafari.Comando cmdSaf = new
			ec.com.grupotvcable.wsdlsafari.Comando();

			ec.com.grupotvcable.wsdlsafari.Cabecera cab = new ec.com.grupotvcable.wsdlsafari.Cabecera();

			//empresa de la linea extendida
			cab.setIDEmpresa(Integer.parseInt(comando.getDetalle().getIntraway().getInterfaz().getProfileCRMId()));

			int est = comando.getDetalle().getIntraway().getEstandar().getIdEstado();
			int interfaz = 0;
			String idEstado = "0";
			if(est==1){
				interfaz = 100;
				idEstado = "1";
			}else if(est==2){
				interfaz = 1003;
				idEstado = "1";
			}else if(est==4){
				interfaz = 1003;
				idEstado = "0";
			}else if(est==0){
				interfaz = 1005;
				idEstado = "0";
			}


			cab.setInterface(interfaz);
			cab.setNegocio(1);
			cab.setSecuencia(comando.getCabecera().getSecuencia());
			cmdSaf.setCabecera(cab);

			ec.com.grupotvcable.wsdlsafari.Detalle det = new ec.com.grupotvcable.wsdlsafari.Detalle();

			ec.com.grupotvcable.wsdlsafari.Safari saf = new ec.com.grupotvcable.wsdlsafari.Safari();

			saf.setEstado(idEstado); //1activo  0suspendido
			saf.setDatoS1(comando.getDetalle().getIntraway().getInterfaz().getSendtoController());//numero de la linea extendidad
			saf.setDatoS2(comando.getDetalle().getIntraway().getInterfaz().getHomeExchangeCRMId());//HomeExchageId
			saf.setAccion("SIP");

			saf.setDatoS3(""+comando.getDetalle().getIntraway().getEstandar().getClienteCRM());//numero de cuenta d titan para la linea extendida
			saf.setDatoS4(comando.getDetalle().getIntraway().getInterfaz().getTn()); //linea padre que va en el callfeature
			saf.setFeature("CfCFV"); //CfCFV  CfCW
			saf.setIp("1.1.1.1");

			det.setSafari(saf);
			cmdSaf.setDetalle(det);

			ec.com.grupotvcable.wsdlsafari.Respuesta res = 
				new ec.com.grupotvcable.wsdlsafari.WsdlSafariImpl().aprovSafari(cmdSaf);

			Mens.setCodError(res.getMensaje().getCodError());
			Mens.setDetMensaje(res.getMensaje().getDetMensaje());


		}else if(comando.getCabecera().getInterface() == 900){

			String IdEstado 		= "";

			if(Est.getIdEstado()==1)
				IdEstado 		= "A";

			if(Est.getIdEstado()==2)
				IdEstado 		= "R";

			if(Est.getIdEstado()==4)
				IdEstado 		= "S";


			String Correo 			= Inter.getUsername();
			int IdEmpresa 			= Cab.getIDEmpresa();
			String Sistema 			= "TITAN";
			String Interfaz 		= "900";
			String Cuenta 			= ""+Est.getClienteCRM();
			String IdProducto 		= ""+Est.getIdProducto();
			int PlanMcAfeeTvCable 	= Est.getIdVenta();
			String ClienteCRM 		= ""+Est.getClienteCRM();
			String IdProductoCRM 	= ""+Est.getIdProducto();
			String Nombre 			= Inter.getName();

			String IdMcAfee 		= Inter.getSendtoController();
			String Referencia 		= Inter.getActivactionCode();


			Respuesta res = new WsdlMcAfeeImpl().aprovMcAfee(IdEmpresa, Sistema, 
					Interfaz, IdEstado, Cuenta, IdProducto, Correo, 
					PlanMcAfeeTvCable, ClienteCRM, IdProductoCRM, IdMcAfee, 
					Referencia, Nombre);

			Mens.setCodError(Integer.parseInt(res.getCodError()));
			Mens.setDetMensaje(res.getDetMensaje()+";IdMcAfee="+res.getIdMcAfee()+";Referencia="+res.getReferencia()+";");

			//actualizo la cuenta de correo
		}else if(comando.getCabecera().getInterface() == 910){

			String IdEstado 		= "R";
			String Correo 			= Inter.getUsername();
			int IdEmpresa 			= Cab.getIDEmpresa();
			String Sistema 			= "TITAN";
			String Interfaz 		= "910";
			String Cuenta 			= ""+Est.getClienteCRM();
			String IdProducto 		= ""+Est.getIdProducto();
			int PlanMcAfeeTvCable 	= 0;
			String ClienteCRM 		= ""+Est.getClienteCRM();
			String IdProductoCRM 	= ""+Est.getIdProducto();
			String Nombre 			= Inter.getName();

			String IdMcAfee 		= Inter.getSendtoController();
			String Referencia 		= "0";

			Respuesta res = new WsdlMcAfeeImpl().aprovMcAfee(IdEmpresa, Sistema, 
					Interfaz, IdEstado, Cuenta, IdProducto, Correo, 
					PlanMcAfeeTvCable, ClienteCRM, IdProductoCRM, IdMcAfee, 
					Referencia, Nombre);

			Mens.setCodError(Integer.parseInt(res.getCodError()));
			Mens.setDetMensaje(res.getDetMensaje());

		}else{


			locator = new IntrawayWSDLLocator();
			Cliente = locator.getIntrawayWSDLPort();
			Input = getInterfaceObjInput();


			/*if( Cab.getIDEmpresa() == Codigos.MACHALA ){
				if(Cab.getInterface() == 600){
					Inter.setServidorEmailCRMId("26");
				}else if(Cab.getInterface() == 602){
					Inter.setDominio("oro.satnet.net");
				}
			}else if( Cab.getIDEmpresa() == Codigos.AMBATO ){
				if(Cab.getInterface() == 600){
					Inter.setServidorEmailCRMId("2");
				}else if(Cab.getInterface() == 602){
					Inter.setDominio("amb.satnet.net");
				}
			}else if( Cab.getIDEmpresa() == Codigos.MANTA ){
				if(Cab.getInterface() == 600){
					Inter.setServidorEmailCRMId("27");
				}else if(Cab.getInterface() == 602){
					Inter.setDominio("mnb.satnet.net");
				}
			}*/


			switch(Cab.getInterface()){

			case 500: 
				//IdTipoClienteCRM es est.getClienteCRM()
				Input.setXmlEncoding(new Interface500Encoding(Inter.getNombre(), pref+Inter.getUsername(),
						Inter.getPassword(), Inter.getIdTipoCliente(), 
						Inter.getEmailNoticias(),Inter.getIdCicloFactCRM()).getXMLEncoding());
				break;//Gestión de clientes
			case 600: 
				Input.setXmlEncoding(new Interface600Encoding(Inter.getCantidad(),
						Inter.getQuotamax(), Inter.getServidorEmailCRMId()
				).getXMLEncoding()); 
				break;//Creación de Espacios para cuentas de Correo.
			case 602: Input.setXmlEncoding(new Interface602Encoding(Inter.getUsername(), Inter.getDominio(),
					Inter.getPassword(), Inter.getDiskQuota(), Inter.getNoticias(),
					Inter.getName(), Cmd).getXMLEncoding()); 
			break;//Creación de cuentas de correo
			case 610: Input.setXmlEncoding(new Interface610Encoding(Inter.getServicTypeCRMId()).getXMLEncoding());
			break;//Creación espacios DialUp
			//610 falta campo FacTrafico
			case 612: Input.setXmlEncoding(new Interface612Encoding(Inter.getPassword(),
					Inter.getUsername()).getXMLEncoding());  
			break;//Creación Cuenta DialUp
			case 620: Input.setXmlEncoding(new Interface620Encoding(Inter.getUSChannelID(), Inter.getStartingBalance(),
					Inter.getCantCPE(), Integer.parseInt(Inter.getEnableAccounting()), Inter.getHub(), Inter.getNodo(), 
					Inter.getBuscarTagCRM(), Inter.getDocsis(), Inter.getProductName(), Inter.getIspMtaCrmId(), 
					Inter.getBandPackageCRMId(), Inter.getPrepaidPolicyCRMId(), Inter.getIdISPCRM(), 
					Inter.getServicePackageCRMId(), Inter.getDSFreq(), Inter.getActivactionCode(), 
					Inter.getPeriodicalBaseBalance(), Inter.isNoBoot()).getXMLEncoding());
			break;//Gestión de Espacios Cable MODEM DOCSIS
			case 622: Input.setXmlEncoding(new Interface622Encoding(Inter.getMACAddress(), Inter.isNoBoot()
			).getXMLEncoding());	 
			break;//Activación de Cable MODEM
			case 626: Input.setXmlEncoding(new Interface626Encoding(Inter.getSnmpGroupCRMID(), 
					Inter.isNoBoot()).getXMLEncoding()); 
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
					Inter.getLinesQTy(), Inter.getMtaModelCRMId(), Inter.isNoBoot(),
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
			case 997: new GetReport(""+Cab.getIDEmpresa(), ""+Est.getAuthKey(), Est.getIdEstado());break;

			default:
				throw new IntrawayExceptions(20018,"Interfase a procesar no existe.");
			}


			setDatosRespuesta();

		}

	}


	private InterfaceObjInput getInterfaceObjInput(){


		Input = new InterfaceObjInput();
		Input.setIdInterface(""+Cab.getInterface());
		Input.setIdEstado(""+Est.getIdEstado());
		Input.setAsyncronic("0");//siempre va en cero porque va ser Sincronico
		Input.setFechaDiferido("");
		Input.setIdCliente(Prefijo + Est.getClienteCRM());	//--------pref
		Input.setIdEmpresa(""+Cab.getIDEmpresa());
		Input.setIdVenta(""+Est.getIdVenta());
		Input.setIdVentaPadre(""+Est.getIdVentaPadre());

		if(Est.getIdProducto()>0)
			Input.setIdProducto(Prefijo+Est.getIdProducto());	//--------pref
		else Input.setIdProducto("0");

		Input.setIdServicioPadre(""+Est.getIdServicioPadre());

		if(Est.getIdProductoPadre()>0)
			Input.setIdProductoPadre(Prefijo+Est.getIdProductoPadre());	//--------pref
		else Input.setIdProductoPadre("0");

		Input.setIdPromotor(Est.getIdPromotor());
		//Input.setXmlEncoding(); este campo lo llena cada interfaz
		Input.setIdEntradaCaller("0");

		//int idServicio=0;
		if(Cab.getInterface()==500)
			idServicio=0;
		else if(Cab.getInterface()==600 || Cab.getInterface()==602)
			idServicio=3;
		else if(Cab.getInterface()==610 || Cab.getInterface()==612)
			idServicio=4;
		else if(Cab.getInterface()==620 || Cab.getInterface()==622 || Cab.getInterface()==626  || Cab.getInterface()==628)
			idServicio=1;
		else if(Cab.getInterface()==820 || Cab.getInterface()==822)
			idServicio=20;
		else if(Cab.getInterface()==824)
			idServicio=21;
		else if(Cab.getInterface()==830)
			idServicio=22;

		//System.out.println("***servicio "+idServicio);
		Cmd.getDetalle().getIntraway().getEstandar().setIdServicio(idServicio);

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
		String error = err.getIdError();
		String strError = err.getErrorStr();

		//System.out.println(new Date().toString()+" Error :"+error+" - "+strError);

		int codError = Integer.parseInt(error);

		switch (codError){
		case 0:

			//validacion para la lineas de cuarentenas
			String msg = "";
			if( Cab.getInterface() == 824 && Est.getIdEstado() == 0 
					&& Inter.getCustomer1()!= null
					&& !Inter.getCustomer1().equals("")
					&& Inter.getCustomer1().equals("CUARENTENA")){
				System.out.println("Creacion de Linea CUARENTENA");
				msg = setLineaCuarentena824();
			}

			Mens.setCodError(1);
			Mens.setDetMensaje("Proceso Realizado con Éxito."+strError+" "+msg); break;
			
		case 1000:
			Mens.setCodError(20007);
			Mens.setDetMensaje("Cliente ya existe. "+strError); break;
		case 1020:
			Mens.setCodError(20008);
			Mens.setDetMensaje("Cliente no existe. "+strError); break;
		case 1010:
			Mens.setCodError(20001);
			Mens.setDetMensaje("El Usuario ya Existe "+strError); break;
		case 8:
			Mens.setCodError(20014);
			Mens.setDetMensaje("Falta Parámetros para el servicio especificado. "+strError); break;
		case 1120:
			Mens.setCodError(20011);
			Mens.setDetMensaje("El Cablemodem ya Existe. "+strError); break;
		case 1100:
			Mens.setCodError(20009);
			Mens.setDetMensaje("El Cablemodem no existe. "+strError); break;
		case 1130:
			Mens.setCodError(20015);
			Mens.setDetMensaje("La MacAddress se encuentra asociada a un cable modem de otro cliente. "+strError); break;
		case 1180:
			Mens.setCodError(20012);
			Mens.setDetMensaje("No se encontró ningún Service Packaqe utilizando el CRM ID. "+strError); break;
		case 1185:
			Mens.setCodError(20012);
			Mens.setDetMensaje("No se encontro ningun ISP utilizando el ISP CRM Id que fue enviado. "+strError); break;
		case 255:
			Mens.setCodError(20016);
			Mens.setDetMensaje("Codigo de Producto y/o Producto Padre ya Exite y/o se encuentra en otro Cliente. "+strError); break;
		case -1:
			Mens.setCodError(20002);
			Mens.setDetMensaje("El usuario ya existe en el grupo de emails. "+strError); break;
			//verificar desde aqui los errores q genera el intraway
		case 23:
			Mens.setCodError(20003);
			Mens.setDetMensaje("Entrada Caller enviado ya existe. "+strError); break;
		case 24:
			Mens.setCodError(20004);
			Mens.setDetMensaje("El dominio no existe. "+strError); break;
		case 25:
			Mens.setCodError(20005);
			Mens.setDetMensaje("El usuario no existe. Borrando cuentas de Email del producto. "+strError); break;
		case 26:
			Mens.setCodError(20006);
			Mens.setDetMensaje("El usuario no existe. Modificando el Email del grupo de emails. "+strError); break;
		case 27:
			Mens.setCodError(20010);
			Mens.setDetMensaje("El nombre de usuario de cliente ya existe. Cuando es correo. "+strError); break;
		case 28:
			Mens.setCodError(20013);
			Mens.setDetMensaje("La capacidad Máxima de Email es menor a la que el cliente esta utilizando. "+strError); break;
		default:
			Mens.setCodError(Integer.parseInt(error));
		Mens.setDetMensaje(strError);
		}

	}


	private String setLineaCuarentena824(){

		//Solicitado por MCamañero y la supertel
		//las lineas tienen que entrar a cuarentena despues de ser eliminadas
		//se envia a crear la linea directamente a SAFARI con 
		//estatus = out_of_service
		//homeexchange = mora-31
		
		System.out.println("setLineaCuarentena824 "+Cab.getIDEmpresa());
		
		ec.com.grupotvcable.wsdlsafari.Comando cmd = new ec.com.grupotvcable.wsdlsafari.Comando();
		ec.com.grupotvcable.wsdlsafari.Cabecera cab = new ec.com.grupotvcable.wsdlsafari.Cabecera();

		cab.setIDEmpresa(Cab.getIDEmpresa());//94 gye    63 uio    65 nac
		cab.setInterface(1101);//interfaz de creacion de linea
		cab.setNegocio(1);
		cab.setSecuencia(101);
		cmd.setCabecera(cab);

		ec.com.grupotvcable.wsdlsafari.Detalle det = new ec.com.grupotvcable.wsdlsafari.Detalle();
		ec.com.grupotvcable.wsdlsafari.Safari saf = new ec.com.grupotvcable.wsdlsafari.Safari();
		saf.setEstado("3"); //1activo  0suspendido 3out_off_service
		saf.setDatoS1(Inter.getTn());//TELEFONO
		saf.setDatoS2(Inter.getHomeExchangeCRMId());
		saf.setDatoS4(Inter.getDatoI1());
		saf.setAccion("SIP");


		det.setSafari(saf);
		cmd.setDetalle(det);

		ec.com.grupotvcable.wsdlsafari.Respuesta res = null;
		String mng = "";
		int  error = 0;
		try {
			res = new com.app.safari.AprovisionarSafari(cmd).Aprovisionar();
			mng = res.getMensaje().getDetMensaje();
			error = res.getMensaje().getCodError();
		} catch (IOException e) {
			e.printStackTrace();
			mng = e.getMessage();
			error = 2;
		} catch (ServiceException e) {
			e.printStackTrace();
			mng = e.getMessage();
			error = 2;
		} catch (Exception e) {
			e.printStackTrace();
			mng = e.getMessage();
			error = 2;
		}

		System.out.println("Respuesta de creacion de linea cuarentena "+error);
		System.out.println("Respuesta de creacion de linea cuarentena "+mng);

		return "Creacion Linea Cuarentena: "+Inter.getTn()+" Res: "+error+" "+mng;

	}


	protected Mensaje getRespuesta(){
		return this.Mens;
	}

}
