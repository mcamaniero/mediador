package com.app.safari;

import static tvcable.app.comarch.utils.Codigos.CUENCA;
import static tvcable.app.comarch.utils.Codigos.GUAYAQUIL;
import static tvcable.app.comarch.utils.Codigos.QUITO;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import net.satnet.safariview.jboss_net.services.PcspI01Service.PcspI01ServiceRemote;
import net.satnet.safariview.jboss_net.services.PcspI01Service.PcspI01ServiceRemoteServiceLocator;
import net.satnet.safariview.jboss_net.services.SVConfigService.SVConfigServiceRemote;
import net.satnet.safariview.jboss_net.services.SVConfigService.SVConfigServiceRemoteServiceLocator;
import tvcable.app.comarch.utils.Codigos;

import com.app.safari.e1.TrunkGrp;
import com.app.safari.huntgroup.HuntGroup;
import com.cedarpointcom.safariview2.server.oss.config.SVAttribute;
import com.cedarpointcom.safariview2.server.oss.config.SVConfigDesc;
import com.cedarpointcom.safariview2.server.oss.config.SVConfigRequest;
import com.cedarpointcom.www.SVConfigService.SVConfigResp;
import com.packetcable.www.pcsp.i01.PcspArg;
import com.packetcable.www.pcsp.i01.PcspObj;

import ec.com.grupotvcable.wsdlsafari.Mensaje;
import ec.com.grupotvcable.wsdlsafari.Safari;

public class SafariImp extends Parametros{

	private PcspI01ServiceRemoteServiceLocator locatorSip = new PcspI01ServiceRemoteServiceLocator();
	private PcspI01ServiceRemote ClienteSip = null;

	private SVConfigServiceRemoteServiceLocator locatorE1 = new SVConfigServiceRemoteServiceLocator();
	private SVConfigServiceRemote ClienteHuntGroup = null;

	private String sessionToken;

	public static final int ADD = 1;
	public static final int UPDATE = 2;

	private Safari DetalleSafari = null;

	private String IpSeleccionada = "";

	public SafariImp(int idCiudad, Safari saf) throws ServiceException {

		super();

		if(saf.getAccion().equals("SIP")){
			ClienteSip = locatorSip.getPcspI01Service();
			
			//.out.println("Cliente SIP "+ClienteSip);
			sessionToken = login(user_webservice, password_webservice);

			System.out.println("sessionToken SIP "+sessionToken);
		}else if (saf.getAccion().equals("HG") || saf.getAccion().equals("E1")){
			ClienteHuntGroup = locatorE1.getSVConfigService();

			//.out.println("Cliente SIP "+ClienteSip);
			sessionToken = login(user_webservice, password_webservice);
			
		}

		DetalleSafari = saf;

		System.out.println("SAFARI CIUDAD: "+idCiudad);
		
		switch (idCiudad){
		case GUAYAQUIL: IpSeleccionada = telnet_gye_host; break;
		case QUITO: IpSeleccionada = telnet_uio_host; break;
		case CUENCA: IpSeleccionada = telnet_cue_host; 
		}
		System.out.println("SAFARI IP Seleccionada: "+IpSeleccionada);
		

	}


	private String login( String userid, String password ) {
		String token = null;
		try {
			if(ClienteSip!=null){
				token = ClienteSip.login( userid, password, null);
				System.out.println("Abrio coneccion "+token);
			}else{
				token = ClienteHuntGroup.login( userid, password);
				System.out.println("ClienteHuntGroup Abrio coneccion "+token);
			}
		}
		catch ( RemoteException re ) {
			re.printStackTrace( );
		}
		return token;
	}


	private void logout( String sessionToken ) {
		try {
			if(ClienteSip!=null){
				ClienteSip.logout(sessionToken );
				System.out.println("ClienteSip Cerro coneccion "+sessionToken);
			}else{
				ClienteHuntGroup.logout(sessionToken );
				System.out.println("ClienteHuntGroup Cerro coneccion "+sessionToken);
			}
		}
		catch ( RemoteException re ) {
			re.printStackTrace( );
		}
	}


	private PcspObj GetSubscriber( String sessionToken, String phoneNumber) {

		PcspObj resultObj = null;

		try{
			PcspArg[] argsObjs = new PcspArg[1];
			PcspArg pcspObjIn = new PcspArg();
			pcspObjIn.setEntityName( "PcspService" );
			pcspObjIn.setKey( phoneNumber );//numero telefonico
			pcspObjIn.setCmsAddress( IpSeleccionada );
			pcspObjIn.setToken( sessionToken ); // token is obtained from call to login()
			argsObjs[0] = pcspObjIn;
			// The assumption here is that the m_service handle is a global variable and
			// was initialized previously
			PcspObj[] resultObjs = ClienteSip.get( argsObjs );
			resultObj = resultObjs[0] ;

			//System.out.println("Resultado: "+resultObj.getXmlEncoding());

			//if ( resultObj.getCmdStatus( ) != OPERATION_SUCCEEDED )
			//	System.out.println("Error: " + resultObj.getErrorMessage() );
		}
		catch ( Exception e ) {
			e.printStackTrace();
		}
		return resultObj;
	}


	private String GetSubscriberHuntGroup( String sessionToken, String phoneNumber) {
		String resp = "";
		try{
			SVConfigDesc desc = new SVConfigDesc();
			desc.setObjType("HuntGroup");
			// Now create a request object and load in the descriptor, action,
			// session token, and Safari IP
			SVConfigRequest req = new SVConfigRequest();
			req.setSessionToken( sessionToken ); // token is returned from call to login() method
			req.setAction("get"); // GET operation
			req.setConfigDesc( desc ); // descriptor containing object type to get
			req.setCmsIPAddr(IpSeleccionada); // IP Address of target Safari
			// Make the call to send the request to SafariView and print out result
			SVConfigResp response = ClienteHuntGroup.sendRequest( req );

			resp = new HuntGroup(response, phoneNumber).getMembers();

			//System.out.println("GET operation response = " + SVConfigRespToString(response) );

		}
		catch ( Exception e ) {
			e.printStackTrace();
		}
		return resp;
	}

	
	private String GetSubscriberE1( String sessionToken, String phoneNumber) {
		String resp = "";
		try{
			SVConfigDesc desc = new SVConfigDesc();
			desc.setObjType("TrunkGrp");
			// Now create a request object and load in the descriptor, action,
			// session token, and Safari IP
			SVConfigRequest req = new SVConfigRequest();
			req.setSessionToken( sessionToken ); // token is returned from call to login() method
			req.setAction("get"); // GET operation
			req.setConfigDesc( desc ); // descriptor containing object type to get
			req.setCmsIPAddr(IpSeleccionada); // IP Address of target Safari
			// Make the call to send the request to SafariView and print out result
			SVConfigResp response = ClienteHuntGroup.sendRequest( req );

			resp = new TrunkGrp(response, phoneNumber).getValues();

			//System.out.println("GET operation response E1 = " + SVConfigRespToString(response) );

		}
		catch ( Exception e ) {
			e.printStackTrace();
		}
		return resp;
	}

	private String SVConfigDescToString(SVConfigDesc desc ) {
		StringBuffer sb = new StringBuffer();
		SVAttribute[] retattrs = desc.getAttributes();
		sb.append(" SVConfigDesc ").append(": objType = ").	append(desc.getObjType());
		sb.append(" attrs = ").append( SVAttrsToString(retattrs) );
		return sb.toString();
	}

	// Takes an SVAttribute[] array and prints it out
	private String SVAttrsToString(SVAttribute[] attrarray ) {
		if ( attrarray == null || attrarray.length == 0 )
			return new String( "SVAttributes: count = 0");

		StringBuffer sb = new StringBuffer();
		sb.append(" SVAttributes: count = ").append( attrarray.length ).append(", ");
		if ( attrarray != null && attrarray.length > 0 ) {
			for ( int i=0; i<attrarray.length; i++ ){
				sb.append("\n "+i+": ").append(attrarray[i].getKey()).
				append(", ").append(attrarray[i].getValue());
			}
		}
		return sb.toString();
	}

	private String SVConfigRespToString(SVConfigResp resp ) {
		StringBuffer sb = new StringBuffer("SVConfigResp: ");
		sb.append("\n status = ").append(resp.getStatus()).append("\n message = ").
		append( resp.getMessage() );
		SVConfigDesc[] descs = resp.getPayload();
		sb.append("\n payload = ");

		if ( resp.getPayload() != null ) {
			for ( int i=0; i<resp.getPayload().length; i++) {
				sb.append("\n").append(SVConfigDescToString(descs[i]));
			}
		}
		return sb.toString();
	}

	private PcspObj NewLineaSip( String sessionToken, String xmlData ) {

		PcspObj resultObj = null;

		try{
			PcspObj[] argsObjs = new PcspObj[1];
			PcspObj pcspObjIn = new PcspObj();
			pcspObjIn.setEntityName( "PcspService" );
			pcspObjIn.setCmdStatus( ADD ); // Use value of one for add request
			pcspObjIn.setXmlEncoding( xmlData ); // XML data defining subscriber
			// as described in the SV Provisioning Spec
			pcspObjIn.setToken( sessionToken ); // token is obtained from call to login()
			argsObjs[0] = pcspObjIn;
			// The assumption here is that the m_service handle is a global variable and
			// was initialized previously
			PcspObj[] resultObjs = ClienteSip.put( argsObjs );
			resultObj = resultObjs[0] ;
			//if ( resultObj.getCmdStatus( ) != OPERATION_SUCCEEDED )
			//	System.out.println("Error: " + resultObj.getErrorMessage() );
		}
		catch ( Exception e ) {
			e.printStackTrace();
		}
		return resultObj;
	}


	private  PcspObj ActualizacionLineaSip( String sessionToken, String xmlData ) {

		PcspObj resultObj = null;

		try{
			PcspObj[] argsObjs = new PcspObj[1];

			PcspObj pcspObjIn = new PcspObj();
			pcspObjIn.setEntityName( "PcspService" );
			pcspObjIn.setCmdStatus( UPDATE ); // Use value of 2 for modify request
			pcspObjIn.setXmlEncoding( xmlData ); // XML data defining changes to a
			// subscriber as described in the SV
			// Provisioning Spec
			pcspObjIn.setToken( sessionToken ); // token is obtained from call to login()
			argsObjs[0] = pcspObjIn;
			// The assumption here is that the cliente handle is a global variable and
			// was initialized previously
			PcspObj[] resultObjs = ClienteSip.modify( argsObjs );
			resultObj = resultObjs[0];
			//if ( resultObj.getCmdStatus( ) != OPERATION_SUCCEEDED )
			//System.out.println("Error: " + resultObj.getErrorMessage() );
		}
		catch ( Exception e ) {
			e.printStackTrace();
		}
		return resultObj;
	}



	private String getXmlNuevaLineaSIP(){

		StringBuilder cadena = new StringBuilder(24);
		cadena.append("<PcspService>");//telefono
		cadena.append("<ServiceId>"+ DetalleSafari.getDatoS1().substring(4) +"</ServiceId>");
		cadena.append("<AdminStatus>"+ DetalleSafari.getEstado()+"</AdminStatus>");
		cadena.append("<DisplayName>"+ DetalleSafari.getDatoS1().substring(4) +"</DisplayName>");//numero de contrato del cliente

		cadena.append("<Extension>");
		
		cadena.append("<PCSPServiceExtension>");

		cadena.append("<cpc:SIPConfig>");
		cadena.append("<cpc:sipDestAddr>"+DetalleSafari.getIp()+"</cpc:sipDestAddr>");
		cadena.append("<cpc:sipAddressType>ENDPOINT</cpc:sipAddressType>");
		cadena.append("<cpc:sipAuthUser>"+ DetalleSafari.getDatoS1().substring(4) +"</cpc:sipAuthUser>");
		cadena.append("<cpc:sipAuthPassword>"+ DetalleSafari.getDatoS3()+"</cpc:sipAuthPassword>");
		cadena.append("</cpc:SIPConfig>");

		
		cadena.append("<cmsAddress>"+ IpSeleccionada +"</cmsAddress>");
		cadena.append("<sipEndpointProfile>"+ DetalleSafari.getEndpointProfile() +"</sipEndpointProfile>");
		cadena.append("<homeExchangeId>"+ DetalleSafari.getDatoS2() +"</homeExchangeId>");
		cadena.append("<languageId>"+ DetalleSafari.getLenguaje() +"</languageId>");

		/*if(DetalleSafari.getBarredLevelType()!=null && !DetalleSafari.getBarredLevelType().equals("")){
			cadena.append("<barredLevel>"+ DetalleSafari.getBarredLevelType() +"</barredLevel>");
			cadena.append("<barredLevelEnabled>"+ DetalleSafari.getDatoS3() +"</barredLevelEnabled>");
			cadena.append("<barredPin>"+ DetalleSafari.getBarredPin() +"</barredPin>");
		}*/

		//cadena.append("<reversePolarity>1</reversePolarity>");//1FALSE	2TRUE

		/*if(DetalleSafari.getDatoS2().equals("STD-FULL-LOCUTOR"))	
			cadena.append("<reversePolarity>1</reversePolarity>");
		else cadena.append("<reversePolarity>0</reversePolarity>");*/
		
		
		cadena.append("</PCSPServiceExtension>");
		cadena.append("</Extension>");
		cadena.append("</PcspService>");

		System.out.println("********Nueva Linea SIP: "+cadena.toString());

		return cadena.toString();
	}



	private String getXmlNuevaLineaSIP_TMP(){
		System.out.println("getXmlNuevaLineaSIP_TMP");
		
		StringBuilder cadena = new StringBuilder(24);
		cadena.append("<PcspService>");//telefono
		cadena.append("<ServiceId>"+ DetalleSafari.getDatoS1().substring(4) +"</ServiceId>");
		cadena.append("<AdminStatus>"+ DetalleSafari.getEstado()+"</AdminStatus>");
		cadena.append("<DisplayName>"+ DetalleSafari.getDatoS1().substring(4) +"</DisplayName>");//numero de contrato del cliente

		cadena.append("<Extension>");
		cadena.append("<PCSPServiceExtension>");
		
		cadena.append("<homeExchangeId>"+ DetalleSafari.getDatoS2() +"</homeExchangeId>");
		
		cadena.append("<cmsAddress>"+ IpSeleccionada +"</cmsAddress>");

		cadena.append("</PCSPServiceExtension>");
		cadena.append("</Extension>");
		cadena.append("</PcspService>");

		System.out.println("********Nueva Linea SIP TMP: "+cadena.toString());

		return cadena.toString();
	}

	
	private String getXmlNuevaLineaSIP_Extendida(){

		StringBuilder cadena = new StringBuilder(24);
		cadena.append("<PcspService>");//telefono
		cadena.append("<ServiceId>"+ DetalleSafari.getDatoS1().substring(4)+"</ServiceId>");
		cadena.append("<AdminStatus>1</AdminStatus>");
		cadena.append("<DisplayName>L.E.N.</DisplayName>");

		
		cadena.append("<ListOfCallFeatures>");
		cadena.append(getFeature(DetalleSafari.getFeature(), DetalleSafari.getEstado()));
		cadena.append("</ListOfCallFeatures>");
		
		cadena.append("<Extension>");
		
		cadena.append("<PCSPServiceExtension>");

		cadena.append("<cpc:SIPConfig>");
		cadena.append("<cpc:sipDestAddr>"+DetalleSafari.getIp()+"</cpc:sipDestAddr>");
		cadena.append("<cpc:sipAddressType>ENDPOINT</cpc:sipAddressType>");
		cadena.append("<cpc:sipAuthUser>"+ DetalleSafari.getDatoS1().substring(4) +"</cpc:sipAuthUser>");
		cadena.append("<cpc:sipAuthPassword>"+DetalleSafari.getDatoS3()+"</cpc:sipAuthPassword>");
		cadena.append("</cpc:SIPConfig>");

			
		cadena.append("<cmsAddress>"+ IpSeleccionada +"</cmsAddress>");

		
		cadena.append("<homeExchangeId>"+ DetalleSafari.getDatoS2() +"</homeExchangeId>");
		
		cadena.append("</PCSPServiceExtension>");
		cadena.append("</Extension>");
		cadena.append("</PcspService>");

		System.out.println("********Nueva Linea SIP Extendida: "+cadena.toString());

		return cadena.toString();
	}

	
	
	private String getXmlActualizacion(){
		StringBuilder cadena = new StringBuilder();

		cadena.append("<PcspService>");	//DatoS1 es el telefono   ej: 59346002400 = 6002400
		cadena.append("<ServiceId>"+ DetalleSafari.getDatoS1().substring(4) +"</ServiceId>");

		if(DetalleSafari.getEstado() != null && !DetalleSafari.getEstado().equals(""))
			cadena.append("<AdminStatus>"+ DetalleSafari.getEstado()+"</AdminStatus>");

		cadena.append("<DisplayName>"+ DetalleSafari.getDatoS1().substring(4) +"</DisplayName>");//numero de contrato del cliente

		cadena.append("<Extension>");
		cadena.append("<PCSPServiceExtension>");
		
				
		cadena.append("<cpc:SIPConfig>");
			if(DetalleSafari.getIp() != null && !DetalleSafari.getIp().equals(""))
				cadena.append("<cpc:sipDestAddr>"+DetalleSafari.getIp()+"</cpc:sipDestAddr>");
			
			cadena.append("<cpc:sipAddressType>ENDPOINT</cpc:sipAddressType>");
		
			cadena.append("<cpc:sipAuthUser>"+ DetalleSafari.getDatoS1().substring(4) +"</cpc:sipAuthUser>");
		
			if(DetalleSafari.getDatoS3() != null && !DetalleSafari.getDatoS3().equals(""))
				cadena.append("<cpc:sipAuthPassword>"+ DetalleSafari.getDatoS3()+"</cpc:sipAuthPassword>");
		cadena.append("</cpc:SIPConfig>");


		cadena.append("<cmsAddress>"+ IpSeleccionada +"</cmsAddress>");

		if(DetalleSafari.getEndpointProfile() != null && !DetalleSafari.getEndpointProfile().equals(""))
			cadena.append("<sipEndpointProfile>"+ DetalleSafari.getEndpointProfile() +"</sipEndpointProfile>");

		if(DetalleSafari.getDatoS2() != null && !DetalleSafari.getDatoS2().equals(""))
			cadena.append("<homeExchangeId>"+ DetalleSafari.getDatoS2() +"</homeExchangeId>");

		if(DetalleSafari.getLenguaje() > 0 )
			cadena.append("<languageId>"+ DetalleSafari.getLenguaje() +"</languageId>");

		
		if(DetalleSafari.getBarredLevelType()!=null && !DetalleSafari.getBarredLevelType().equals("")
				){

			String barredLevel = DetalleSafari.getBarredLevelType();
			if(barredLevel.equals("Disabled"))
				barredLevel="";//para quitar el barrel le envio vacio
			cadena.append("<barredLevel>"+ barredLevel +"</barredLevel>");
			cadena.append("<barredLevelEnabled>"+ (barredLevel.equals("") ? "" : DetalleSafari.getDatoS4()) +"</barredLevelEnabled>");
			cadena.append("<barredPin>"+ (barredLevel.equals("") ? "" : DetalleSafari.getBarredPin()) +"</barredPin>");

		}


		//esto es para locutorios
		if(DetalleSafari.getFeature() != null && DetalleSafari.getFeature().equals("REVERSE_POLARITY"))
			cadena.append("<reversePolarity>"+DetalleSafari.getEstado()+"</reversePolarity>");
		//else cadena.append("<reversePolarity>0</reversePolarity>");
			
		cadena.append("</PCSPServiceExtension>");
		cadena.append("</Extension>");
		cadena.append("</PcspService>");

		System.out.println("********Update Linea SIP: "+cadena.toString());

		return cadena.toString();
	}


	private String getXmlFeature(){
		StringBuilder cadena = new StringBuilder();

		cadena.append("<PcspService>");
		cadena.append("<ServiceId>"+ DetalleSafari.getDatoS1().substring(4) +"</ServiceId>");

		cadena.append("<ListOfCallFeatures>");
		cadena.append(getFeature(DetalleSafari.getFeature(), DetalleSafari.getEstado()));
		cadena.append("</ListOfCallFeatures>");

		cadena.append("<Extension>");
		cadena.append("<PCSPServiceExtension>");
		cadena.append("<cmsAddress>"+ IpSeleccionada +"</cmsAddress>");
		cadena.append("</PCSPServiceExtension>");
		cadena.append("</Extension>");
		cadena.append("</PcspService>");

		//System.out.println("getXmlFeature "+cadena.toString());

		return cadena.toString();
	}


	private String getFeature(String feacture, String estado) {

		String Subscribed = "";

		if(estado.equals("0"))
			Subscribed = "false";
		else if(estado.equals("1"))
			Subscribed = "true";

		String fono= DetalleSafari.getDatoS4(); //para la linea virtual o linea axtendida
		System.out.println("FONO: "+fono);
		//lita feacture
		//CfCFV CfCFV
		//CfCW	CfCW
		//CfHG
		//CfTWC CfTWC
		//CfCND CfCND
		//CfVN

		//DatoS4 telefono de virtual line o extended line

		StringBuilder cadena = new StringBuilder();
		cadena .append("<"+feacture+">");
		cadena.append("<Subscribed>"+Subscribed+"</Subscribed>");
		cadena.append("<AdminStatus>"+estado+"</AdminStatus>");
		if(feacture.equals("CfVN")){
			cadena.append("<UserParams><ListOfVN><VNData>");
			cadena.append("<VnIndex>0</VnIndex>");
			cadena.append("<VnDN>"+fono.substring(4)+"</VnDN>");
			cadena.append("<VnRingPattern>r1_wt1</VnRingPattern>");
			cadena.append("</VNData></ListOfVN></UserParams>");
		}
		
		System.out.println("do not disturb "+feacture);
		if(feacture.equals("CfDND")){
			System.out.println(" Entro a donotdisturb "+feacture);
			
			cadena.append("<UserParams>");
			cadena.append("<Active>true</Active>");
			cadena.append("</UserParams>");
			
		}
		if(feacture.equals("CfCFV")){//para la linea extendida
			if(fono.equals("")){
				cadena.append("<UserParams>");
				cadena.append("<Active>false</Active>");
				cadena.append("<ForwardTo></ForwardTo>");
				cadena.append("</UserParams>");
			}else{
				cadena.append("<UserParams>");
				cadena.append("<Active>true</Active>");
				cadena.append("<ForwardTo>0"+fono.substring(3)+"</ForwardTo>");
				cadena.append("</UserParams>");
			}
		}
		cadena.append("</"+feacture+">");

		System.out.println("Feature: "+cadena.toString());
		
		return cadena.toString();
	}

	//terminacion  eliminar del safari



	public Mensaje CreateLineaSip() {
		Mensaje mens = new Mensaje();
		if(sessionToken != null){

			PcspObj resultObjs = NewLineaSip(sessionToken, this.getXmlNuevaLineaSIP());
			if(resultObjs.getCmdStatus()==0){
				mens.setCodError(1);
				mens.setDetMensaje("Proceso Realizado con Éxito. Operation Success");
			}else{
				mens.setCodError(resultObjs.getCmdStatus());
				mens.setDetMensaje(resultObjs.getErrorMessage());
			}
		}else{
			mens.setCodError(1002);
			mens.setDetMensaje(Codigos.FalloConeccion_1002);
		}

		logout(sessionToken);

		return mens;
	}


	public Mensaje CreateLineaSip_TMP() {
		System.out.println("CreateLineaSip_TMP");
		Mensaje mens = new Mensaje();
		if(sessionToken != null){

			PcspObj resultObjs = NewLineaSip(sessionToken, this.getXmlNuevaLineaSIP_TMP());
			if(resultObjs.getCmdStatus()==0){
				mens.setCodError(1);
				mens.setDetMensaje("Proceso Realizado con Éxito. Operation Success");
			}else{
				mens.setCodError(resultObjs.getCmdStatus());
				mens.setDetMensaje(resultObjs.getErrorMessage());
			}
		}else{
			mens.setCodError(1002);
			mens.setDetMensaje(Codigos.FalloConeccion_1002);
		}

		logout(sessionToken);

		return mens;
	}

	
	public Mensaje CreateLineaSip_Extendida() {
		Mensaje mens = new Mensaje();
		if(sessionToken != null){

			PcspObj resultObjs = NewLineaSip(sessionToken, this.getXmlNuevaLineaSIP_Extendida());
			if(resultObjs.getCmdStatus()==0){
				mens.setCodError(1);
				mens.setDetMensaje("Proceso Realizado con Éxito. Operation Success");
			}else{
				mens.setCodError(resultObjs.getCmdStatus());
				mens.setDetMensaje(resultObjs.getErrorMessage());
			}
		}else{
			mens.setCodError(1002);
			mens.setDetMensaje(Codigos.FalloConeccion_1002);
		}

		logout(sessionToken);

		return mens;
	}


	public Mensaje UpdateLineaSip() throws RemoteException {
		Mensaje mens = new Mensaje();

		System.out.println("UpdateLineaSip");
		if(sessionToken != null ){

			if( DetalleSafari.getDatoS1() == null || DetalleSafari.getDatoS1().equals("")){
				mens.setCodError(2);
				mens.setDetMensaje("Faltan Parametros: Telefono es requerido");

			}else{

				System.out.println("UpdateLineaSip");
				PcspObj resultObjs = this.ActualizacionLineaSip(sessionToken, getXmlActualizacion());

				if(resultObjs.getCmdStatus()==0){
					mens.setCodError(1);
					mens.setDetMensaje("Proceso Realizado con Éxito. Operation Success");
				}else{
					mens.setCodError(resultObjs.getCmdStatus());
					mens.setDetMensaje(resultObjs.getErrorMessage());
				}

			}

		}else{
			mens.setCodError(1002);
			mens.setDetMensaje(Codigos.FalloConeccion_1002);
		}

		logout(sessionToken);
		return mens;
	}



	/*private SVConfigResp ActualizacionTroncalE1() throws RemoteException{
		// Populate descriptor
		SVConfigDesc desc = new SVConfigDesc();
		desc.setObjType("TrunkGrp");
		// Set up the attributes only for the required fields in this case
		SVAttribute[] attrs = new SVAttribute[2];
		// Must set the mtaProfileName, as that is a ‘key’ field in order to
		// determine which MTA profile to update
		attrs[0] = new SVAttribute("resourceGrpNumber", ""+DetalleSafari.getIdTroncal() );
		// Set several other attributes in the update request
		attrs[1] = new SVAttribute("ExchangeProfileName", DetalleSafari.getDatoS2() );
		desc.setAttributes( attrs );
		// Now create a request object and load in the descriptor, action, and Safari IP
		SVConfigRequest req = new SVConfigRequest();
		req.setSessionToken( sessionToken ); // token is returned from call to login() method
		req.setAction("update"); // UPDATE operation
		req.setConfigDesc(desc); // descriptor containing object type to get
		req.setCmsIPAddr( IpSeleccionada ); // IP Address of target Safari managed by
		// SafariView
		// Make the call to send the request to SafariView and print out result
		//SVConfigResp response = ClienteE1.sendRequest(req);
		//System.out.println("ADD operation response = " + SVConfigRespToString(response));

		return ClienteE1.sendRequest(req);

	}*/


	public Mensaje CallFeatures() throws RemoteException {

		Mensaje mens = new Mensaje();

		if(sessionToken != null){
			PcspObj resultSaf = null;

			System.out.println("******CallFeatures");

			resultSaf = this.ActualizacionLineaSip(sessionToken, getXmlFeature());

			if(resultSaf.getCmdStatus()==0){
				mens.setCodError(1);
				mens.setDetMensaje("Proceso Realizado con Éxito. Operation Success");
			}else{
				mens.setCodError(resultSaf.getCmdStatus());//verificar el cod error
				mens.setDetMensaje(resultSaf.getErrorMessage());
			}
			//}

		}else{
			mens.setCodError(1002);
			mens.setDetMensaje(Codigos.FalloConeccion_1002);
		}

		logout(sessionToken);
		return mens;
	}



	private PcspObj DeleteSubscriber( String sessionToken, String phoneNumber) {
		PcspObj resultObj = null; 
		try {

			// First set up the interaface objects needed for the call.
			PcspArg[] argObjs = new PcspArg[1];
			PcspArg arg1 = new PcspArg( );
			arg1.setEntityName( "PcspService" );
			arg1.setKey( phoneNumber ); // The subscriber phone number must be the key.
			arg1.setCmsAddress( IpSeleccionada );
			arg1.setToken( sessionToken ); // Valid token is obtained from call to login()
			argObjs[0] = arg1;
			// The assumption here is that the m_service handle is a global variable and
			// was initialized previously
			PcspObj[] response = ClienteSip.delete( argObjs );
			resultObj = response[0];
			//if ( resultObj.getCmdStatus( ) != OPERATION_SUCCEEDED ) {
			//	System.out.println("Error: " + resultObj.getErrorMessage( );
			//}

		}catch ( Exception e ) {
			e.printStackTrace();
		}

		logout(sessionToken);

		return resultObj;
	}




	public Mensaje DeleteLineaSip() {
		Mensaje mens = new Mensaje();
		if ( sessionToken != null ) {
			if(DetalleSafari.getDatoS1()==null || DetalleSafari.getDatoS1().equals("")){
				mens.setCodError(1001);
				mens.setDetMensaje("error: DatoS1(Telefono) null");
				logout(sessionToken);
				return mens;
			}
			PcspObj resultSaf = DeleteSubscriber(sessionToken, DetalleSafari.getDatoS1().substring(4));//telefono

			if(resultSaf.getCmdStatus()==0){
				String errorCua = "";
				//enviar la linea a CUARENTENA
				if( DetalleSafari.getDatoS4() != null 
						&& !DetalleSafari.getDatoS4().equals("")
						&& DetalleSafari.getDatoS4().equals("CUARENTENA")){
					
					sessionToken = login(user_webservice, password_webservice);
					DetalleSafari.setEstado("3");//out_of_Service
					Mensaje msg = this.CreateLineaSip_TMP();
					this.logout(sessionToken);
					errorCua = "Creacion de Linea Cuarentena: "+msg.getDetMensaje();
				}
				String mensaje = "Proceso Realizado con Éxito. Operation Success";
				mens.setCodError(1);
				mens.setDetMensaje(mensaje+" "+errorCua);
			}else{
				mens.setCodError(resultSaf.getCmdStatus());
				mens.setDetMensaje(resultSaf.getErrorMessage());
			}
		}else{
			mens.setCodError(2001);
			mens.setDetMensaje(Codigos.FalloConeccion_1002);
		}

		logout(sessionToken);
		return mens;
	}



	public Mensaje ConsultaLinea() {
		Mensaje mens = new Mensaje();
		if ( sessionToken != null ) {
			if(DetalleSafari.getDatoS1()==null || DetalleSafari.getDatoS1().equals("")){
				mens.setCodError(1001);
				mens.setDetMensaje("error: DatoS1(Telefono) null");
				logout(sessionToken);
				return mens;
			}
			PcspObj resultSaf = GetSubscriber(sessionToken, DetalleSafari.getDatoS1().substring(4));//telefono

			if(resultSaf.getCmdStatus()==0){
				mens.setCodError(1);
				mens.setDetMensaje(resultSaf.getXmlEncoding());
			}else{
				mens.setCodError(resultSaf.getCmdStatus());
				mens.setDetMensaje(resultSaf.getErrorMessage());
			}
		}else{
			mens.setCodError(2001);
			mens.setDetMensaje(Codigos.FalloConeccion_1002);
		}

		logout(sessionToken);
		return mens;
	}


	
	public Mensaje CrearHuntGroup() throws RemoteException {
		Mensaje mens = new Mensaje();
		if ( sessionToken != null ) {

			String resultSaf = AddSubscriberHuntGroup(sessionToken);

			mens.setCodError(1);
			mens.setDetMensaje(resultSaf);

		}else{
			mens.setCodError(2001);
			mens.setDetMensaje(Codigos.FalloConeccion_1002);
		}

		logout(sessionToken);
		return mens;
	}

	
	
	private String AddSubscriberHuntGroup(String sessionToken) throws RemoteException {
		
		/*
		2.- Comercialmente y técnicamente se ha definido que para la creación de hunt group 
			se debe tener mínimo 4 líneas telefónicas, incluido la línea telefónica piloto.
			es decir, 3 líneas miembros + línea piloto. No se debe crear hunt groups 
			con un número menor de líneas.

		3.- SafariC3 únicamente permite crear hunt groups máximo de 15 líneas telefónicas,
			El máximo número de líneas telefónicas que pueden conformar un Hunt Group 
			es 15, incluido el piloto.

		4.- Un hunt group puede estar conformado por líneas SIP y MTAs, por separado
			o mixtas de cada tipo.

			huntNoAnsTimer: 15
			huntIterations: 1
			huntGroupEnable
			huntAlgorithm: UCD
			
			-Campos con valores particulares son:
			
			huntOverflowDN  <huntOverflowDN>
			huntMemberxDN 
			
			donde x=1,2,...,14

		 */
		
		
		SVConfigDesc desc = new SVConfigDesc();
		desc.setObjType("HuntGroup");
		
		SVAttribute[] attrs = new SVAttribute[9];
		attrs[0] = new SVAttribute("huntGroupDN", "66000010" );//The DN for the HuntGroup
		attrs[1] = new SVAttribute("huntNoAnsTimer", "15" );//Hunt Group No Answer Timer (secs)
		attrs[2] = new SVAttribute("huntIterations", "1" );//Hunt Group iterations
		attrs[3] = new SVAttribute("huntAlgorithm", "UCD" );//Hunting Algorithm
		attrs[4] = new SVAttribute("huntGroupEnable", "" );//Hunt Group is enabled
		
		attrs[5] = new SVAttribute("huntOverflowDN", "66000010" );//Overflow DN for the HuntGroup
		
		attrs[6] = new SVAttribute("huntMember1DN", "66000011" );//Member Directory Number 1
		attrs[7] = new SVAttribute("huntMember2DN", "66000012" );//Member Directory Number 2
		attrs[8] = new SVAttribute("huntMember3DN", "66000013" );//Member Directory Number 3
		
		desc.setAttributes( attrs );
		
		SVConfigRequest req = new SVConfigRequest();
		req.setSessionToken( sessionToken ); 
		req.setAction("add");
		req.setConfigDesc(desc);
		req.setCmsIPAddr(IpSeleccionada);
		
		SVConfigResp response = ClienteHuntGroup.sendRequest(req);
		String resp = SVConfigRespToString(response);
		
		System.out.println("GET operation response = " + resp);

		return resp;
	}
	
	
	private String DeleteSubscriberHuntGroup(String sessionToken) throws RemoteException {
		
		SVConfigDesc desc = new SVConfigDesc();
		desc.setObjType("HuntGroup");
		
		SVAttribute[] attrs = new SVAttribute[2];
		attrs[0] = new SVAttribute("huntGroupDN", "66000010" );//The DN for the HuntGroup
		
		
		SVConfigRequest req = new SVConfigRequest();
		req.setSessionToken( sessionToken ); 
		req.setAction("delete");
		req.setConfigDesc(desc);
		req.setCmsIPAddr(IpSeleccionada);
		
		SVConfigResp response = ClienteHuntGroup.sendRequest(req);
		String resp = SVConfigRespToString(response);
		
		System.out.println("Delete operation response = " + resp);

		return resp;
	}
		
	public Mensaje EliminaHuntGroup() throws RemoteException {
		Mensaje mens = new Mensaje();
		if ( sessionToken != null ) {

			String resultSaf = DeleteSubscriberHuntGroup(sessionToken);

			mens.setCodError(1);
			mens.setDetMensaje(resultSaf);

		}else{
			mens.setCodError(2001);
			mens.setDetMensaje(Codigos.FalloConeccion_1002);
		}

		logout(sessionToken);
		return mens;
	}
	
	public Mensaje CreaHuntGroup() throws RemoteException {
		Mensaje mens = new Mensaje();
		if ( sessionToken != null ) {

			String resultSaf = AddSubscriberHuntGroup(sessionToken);

			mens.setCodError(1);
			mens.setDetMensaje(resultSaf);

		}else{
			mens.setCodError(2001);
			mens.setDetMensaje(Codigos.FalloConeccion_1002);
		}

		logout(sessionToken);
		return mens;
	}
	

	public Mensaje ConsultaHuntGroup() {
		Mensaje mens = new Mensaje();
		if ( sessionToken != null ) {

			String resultSaf = GetSubscriberHuntGroup(sessionToken, DetalleSafari.getDatoS1().substring(4));//telefono

			mens.setCodError(1);
			mens.setDetMensaje(resultSaf);

		}else{
			mens.setCodError(2001);
			mens.setDetMensaje(Codigos.FalloConeccion_1002);
		}

		logout(sessionToken);
		return mens;
	}
	
	
	public Mensaje ConsultaE1() {
		Mensaje mens = new Mensaje();
		if ( sessionToken != null ) {

			String resultSaf = GetSubscriberE1(sessionToken, DetalleSafari.getDatoS1().substring(4));//telefono

			mens.setCodError(1);
			mens.setDetMensaje(resultSaf);

		}else{
			mens.setCodError(2001);
			mens.setDetMensaje(Codigos.FalloConeccion_1002);
		}

		logout(sessionToken);
		return mens;
	}

}
