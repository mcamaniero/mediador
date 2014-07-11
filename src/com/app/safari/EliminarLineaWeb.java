package com.app.safari;

import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import ec.com.grupotvcable.wsdlsafari.Cabecera;
import ec.com.grupotvcable.wsdlsafari.Comando;
import ec.com.grupotvcable.wsdlsafari.Detalle;
import ec.com.grupotvcable.wsdlsafari.Respuesta;
import ec.com.grupotvcable.wsdlsafari.Safari;
import ec.com.grupotvcable.wsdlsafari.WsdlSafari;
import ec.com.grupotvcable.wsdlsafari.WsdlSafariClient;
import ec.com.grupotvcable.wsdlsafari.WsdlSafariImpl;

public class EliminarLineaWeb {

	private String Linea = "";
	private String Safari = "";
	private String Usuario = "";

	public EliminarLineaWeb(String linea, String safari, String usuario) {
		this.Linea = linea;
		this.Safari = safari;
		this.Usuario = usuario;

	}


	public Linea ConsultarLinea(){

		//ELIMINACION_SIP	= 1005;

		Comando cmd = new Comando();
		Cabecera cab = new Cabecera();
		cab.setIDEmpresa(Integer.parseInt(Safari));//94 gye    63 uio    65 nac
		cab.setInterface(1010);
		cab.setNegocio(1);
		cab.setSecuencia(100);
		cmd.setCabecera(cab);

		Detalle det = new Detalle();
		Safari saf = new Safari();
		saf.setEstado("1"); //1activo  0suspendido
		saf.setDatoS1("593x"+Linea);//TELEFONO
		saf.setAccion("SIP");
		saf.setDatoS4(Usuario);//TELEFONO

		det.setSafari(saf );
		cmd.setDetalle(det);

		//WsdlSafariClient client = new WsdlSafariClient();
		//WsdlSafari service = client.getWsdlSafariHttpPort();

		Respuesta res = new WsdlSafariImpl().aprovSafari(cmd);

		//Respuesta res = service.aprovSafari(cmd);

		return getResultado(res.getMensaje().getDetMensaje());
	}


	public String EliminarLinea(){

		//ELIMINACION_SIP	= 1005;

		Comando cmd = new Comando();
		Cabecera cab = new Cabecera();
		cab.setIDEmpresa(Integer.parseInt(Safari));//94 gye    63 uio    65 nac
		cab.setInterface(1005);
		cab.setNegocio(1);
		cab.setSecuencia(100);
		cmd.setCabecera(cab);

		Detalle det = new Detalle();
		Safari saf = new Safari();
		saf.setEstado("1"); //1activo  0suspendido
		saf.setDatoS1("593x"+Linea);//TELEFONO
		saf.setAccion("SIP");
		saf.setDatoS4(Usuario);//TELEFONO

		det.setSafari(saf );
		cmd.setDetalle(det);

		WsdlSafariClient client = new WsdlSafariClient();
		WsdlSafari service = client.getWsdlSafariHttpPort();

		Respuesta res = service.aprovSafari(cmd);

		return res.getMensaje().getCodError()+" "+res.getMensaje().getDetMensaje();
	}




	private Linea getResultado(String xml) {

		String Error = "";
		String DetMensaje = "";


		String ServiceId = "";
		String AdminStatus = "";
		String DisplayName = "";
		String HomeExchangeId = "";
		String SipDestAddr = "";
		String MtaAddress = "";
		String NetworkType = "";
		String PasswordSip = "";
		HashMap<String,String> listOfCallFeatures = null;


		System.out.println(xml);

		Linea lin = null;

		SAXBuilder builder = new SAXBuilder(false); 
		Document doc = null;

		try {
			doc = builder.build(new StringReader(xml));
		} catch (JDOMException e1) {
			System.out.println(e1.getMessage());
			Error = "JDOMException";
			DetMensaje = xml;
			lin = new Linea("","","","","","","",null);
			lin.setError(Error);
			lin.setDetMensaje(DetMensaje);
			return lin;
		} catch (IOException e1) {
			e1.printStackTrace();
			Error = "Error2 IOException";
			DetMensaje = e1.getMessage();
			lin = new Linea("","","","","","","",null);
			lin.setError(Error);
			lin.setDetMensaje(DetMensaje);
			return lin;
		}


		// Obtenemos la etiqueta raíz  
		Element e = doc.getRootElement();  

		List<Element> hijosRaiz = e.getChildren();


		boolean ban1=true;

		for(Element ee : hijosRaiz){
			//System.out.println("hijo "+ee.getName()+" valor: "+ee.getValue());
			if ( ee.getName().equals("ServiceId") )
				ServiceId = ee.getValue();
			else if ( ee.getName().equals("AdminStatus") ){
				if(ee.getValue().equals("0"))
					AdminStatus = "SUSPENDED";
				else if(ee.getValue().equals("1"))
					AdminStatus = "ACTIVE";
				else AdminStatus = ee.getValue();

			}else if ( ee.getName().equals("DisplayName") )
				DisplayName = ee.getValue();

			else if ( ee.getName().equals("ListOfCallFeatures") )
				listOfCallFeatures = getFeatures(ee.getChildren());

			else if ( ee.getName().equals("Extension") ){

				String tmpMtaSip  = "";
				String nameMtaSip = "";
				String tmpPassSip = "";
				String namePassSip = "";
				try{
					tmpMtaSip  = ((Element)((Element)((Element)ee.getChildren().get(0)).getChildren().get(0)).getChildren().get(0)).getValue();
					nameMtaSip = ((Element)((Element)((Element)ee.getChildren().get(0)).getChildren().get(0)).getChildren().get(0)).getName();
					//System.out.println("tmpMtaSip "+tmpMtaSip);
					//System.out.println("nameMtaSip "+nameMtaSip);

					if( nameMtaSip.equals("sipDestAddr") ){
						SipDestAddr = tmpMtaSip;
						NetworkType = "SIP";
					}else {
						MtaAddress = tmpMtaSip;
						NetworkType = "VOIP";
					}

					try{
						PasswordSip  = ((Element)((Element)((Element)ee.getChildren().get(0)).getChildren().get(0)).getChildren().get(3)).getValue();
					}catch(Exception eex){

					}

					int tam = ((Element)ee.getChildren().get(0)).getChildren().size();
					for(int i = 0; i < tam; i++)
						if( ((Element)((Element)ee.getChildren().get(0)).getChildren().get(i)).getName().equals("homeExchangeId") )
							HomeExchangeId = ((Element)((Element)ee.getChildren().get(0)).getChildren().get(i)).getValue();

				}catch(Exception excep){

				}


			}

		}


		System.out.println(ServiceId+" "+AdminStatus+" "+DisplayName+" "+PasswordSip+" "+MtaAddress+" "+HomeExchangeId+" "+SipDestAddr+" "+listOfCallFeatures.size());

		return new Linea(ServiceId, AdminStatus, DisplayName, HomeExchangeId, 
				SipDestAddr, MtaAddress, NetworkType, PasswordSip, listOfCallFeatures);
	}


	private HashMap<String, String> getFeatures(List<Element> children) {
		// TODO Auto-generated method stub

		HashMap <String, String> map = new HashMap<String, String>();

		for(Element q : children){

			if(q.getName().equals("CfCFV")){
				String html = "";
				System.out.println("-- "+q.getChildren().get(2));
				if(q.getChildren().get(2)!=null && ((Element)q.getChildren().get(2)).getName().equals("UserParams")){
					Element tmpUser = (Element)q.getChildren().get(2);
					if(tmpUser.getChildren().size()>1 && tmpUser.getChildren().get(0)!=null && tmpUser.getChildren().get(1)!=null)
						html = "<br/>"+((Element)tmpUser.getChildren().get(0)).getName()+": "+((Element)tmpUser.getChildren().get(0)).getValue() +
						"<br/>"+((Element)tmpUser.getChildren().get(1)).getName()+": "+((Element)tmpUser.getChildren().get(1)).getValue();
					System.out.println(html);
				}
				map.put("CfCFV", "Sensitive Call Forwarding"+html);


			}if(q.getName().equals("CfCND"))
				map.put("CfCND", "Calling Number Delivery"); 
			if(q.getName().equals("CfCW"))
				map.put("CfCW", "Call Waiting"); 
			if(q.getName().equals("CfTWC"))
				map.put("CfTWC", "Three Way Calling"); 
			if(q.getName().equals("CfDND"))
				map.put("CfDND", "Do Not Disturb"); 
			if(q.getName().equals("CfHG"))
				map.put("CfHG", "Hunt Group"); 
			if(q.getName().equals("CfVN"))
				map.put("CfVN", "Virtual Number"); 

			//System.out.println(q.getName()+map.size());

		}

		return map;
	}

	public static void main(String a[]){
		new EliminarLineaWeb("6021047","94","jcalle").ConsultarLinea();
	}


}
