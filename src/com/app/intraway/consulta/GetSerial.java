package com.app.intraway.consulta;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import tvcable.app.comarch.utils.Codigos;

public class GetSerial {

	private String UrlCiudad = null;
	private String Serial = "";
	
	private final static String urlUIO = "http://ispmonitor.satnet.net/public/docsisclients.aspx";
	private final static String urlGYE = "http://ispmonitor.gye.satnet.net/public/docsisclients.aspx";
	private final static String urlCUE = "http://ispmonitor.cue.satnet.net/public/docsisclients.aspx";
    
	
	private HttpClient ClienteISPMonitor = new HttpClient();
	GetMethod Get = null;
	
	
	public GetSerial(String ciudad, String contrato) throws HttpException, IOException, JDOMException {
		
		if ( Integer.parseInt(ciudad.trim()) == Codigos.GUAYAQUIL )
			UrlCiudad = urlGYE;
		else if ( Integer.parseInt(ciudad.trim()) == Codigos.QUITO )
			UrlCiudad = urlUIO;
		else if ( Integer.parseInt(ciudad.trim()) == Codigos.CUENCA )
			UrlCiudad = urlCUE;
		
		Get = new GetMethod(UrlCiudad+"?accounts="+contrato);
		//HttpMethodParams params = new HttpMethodParams();
		//params.setParameter("accounts", contrato);
		//Get.setParams(params);

		int statusCode = ClienteISPMonitor.executeMethod(Get);
		System.out.println("statusCode ClienteISPMonitor:"+statusCode);
		SetSerial(Get.getResponseBodyAsStream());
		
	}

	
	
	private void SetSerial(InputStream request) throws JDOMException, IOException{
		
		SAXBuilder builder = new SAXBuilder(false); 
		Document doc = builder.build(request);
		
		/*<clients>
			<client account="14689304">
				<cablemodem macaddress="00:15:CE:94:64:FC" mta="0015ce9464fd" model="TM602G">
					<serial>865BNE89C495264</serial>
				</cablemodem>
			</client>
		</clients>*/
		
	    // Obtenemos la etiqueta raíz  
        Element raiz = doc.getRootElement();  
        
        // Recorremos los hijos de la etiqueta raíz 
        Element e = raiz.getChild("client");
        List<Element> hijosRaiz = e.getChildren();
        
        if( hijosRaiz.get(0).getContentSize() > 0 )
        	Serial = hijosRaiz.get(0).getChild("serial").getValue();
        else Serial = "No pudo ser consutado";
   	
	}


	public String getSerial() {
		return Serial;
	}

	
	
}
