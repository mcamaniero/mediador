
package ec.com.grupotvcable.wsdlmcafee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Collection;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.codehaus.xfire.XFireRuntimeException;
import org.codehaus.xfire.aegis.AegisBindingProvider;
import org.codehaus.xfire.annotations.AnnotationServiceFactory;
import org.codehaus.xfire.annotations.jsr181.Jsr181WebAnnotations;
import org.codehaus.xfire.client.XFireProxyFactory;
import org.codehaus.xfire.jaxb2.JaxbTypeRegistry;
import org.codehaus.xfire.service.Endpoint;
import org.codehaus.xfire.service.Service;
import org.codehaus.xfire.soap.AbstractSoapBinding;
import org.codehaus.xfire.transport.TransportManager;

import ec.com.grupotvcable.wsdlintraway.WsdlIntraway;
import ec.com.grupotvcable.wsdlintraway.WsdlIntrawayClient;

public class WsdlMcAfeeClient {

	private static XFireProxyFactory proxyFactory = new XFireProxyFactory();
	private HashMap endpoints = new HashMap();
	private Service service0;

	public WsdlMcAfeeClient() {
		create0();
		Endpoint WsdlMcAfeeLocalEndpointEP = service0 .addEndpoint(new QName("http://www.grupotvcable.com.ec/WsdlMcAfee/", "WsdlMcAfeeLocalEndpoint"), new QName("http://www.grupotvcable.com.ec/WsdlMcAfee/", "WsdlMcAfeeLocalBinding"), "xfire.local://WsdlMcAfee");
		endpoints.put(new QName("http://www.grupotvcable.com.ec/WsdlMcAfee/", "WsdlMcAfeeLocalEndpoint"), WsdlMcAfeeLocalEndpointEP);
		Endpoint WsdlMcAfeeSOAPEP = service0 .addEndpoint(new QName("http://www.grupotvcable.com.ec/WsdlMcAfee/", "WsdlMcAfeeSOAP"), new QName("http://www.grupotvcable.com.ec/WsdlMcAfee/", "WsdlMcAfeeSOAP"), "http://192.168.21.205/Titan/services/WsdlMcAfee");
		endpoints.put(new QName("http://www.grupotvcable.com.ec/WsdlMcAfee/", "WsdlMcAfeeSOAP"), WsdlMcAfeeSOAPEP);
	}

	public Object getEndpoint(Endpoint endpoint) {	
		try {
			return proxyFactory.create((endpoint).getBinding(), (endpoint).getUrl());
		} catch (MalformedURLException e) {
			throw new XFireRuntimeException("Invalid URL", e);
		}
	}

	public Object getEndpoint(QName name) {
		Endpoint endpoint = ((Endpoint) endpoints.get((name)));
		if ((endpoint) == null) {
			throw new IllegalStateException("No such endpoint!");
		}
		return getEndpoint((endpoint));
	}

	public Collection getEndpoints() {
		return endpoints.values();
	}

	private void create0() {
		TransportManager tm = (org.codehaus.xfire.XFireFactory.newInstance().getXFire().getTransportManager());
		HashMap props = new HashMap();
		props.put("annotations.allow.interface", true);
		AnnotationServiceFactory asf = new AnnotationServiceFactory(new Jsr181WebAnnotations(), tm, new AegisBindingProvider(new JaxbTypeRegistry()));
		asf.setBindingCreationEnabled(false);
		service0 = asf.create((ec.com.grupotvcable.wsdlmcafee.WsdlMcAfee.class), props);
		{
			AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://www.grupotvcable.com.ec/WsdlMcAfee/", "WsdlMcAfeeSOAP"), "http://schemas.xmlsoap.org/soap/http");
		}
		{
			AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://www.grupotvcable.com.ec/WsdlMcAfee/", "WsdlMcAfeeLocalBinding"), "urn:xfire:transport:local");
		}
	}

	public WsdlMcAfee getWsdlMcAfeeLocalEndpoint() {
		return ((WsdlMcAfee)(this).getEndpoint(new QName("http://www.grupotvcable.com.ec/WsdlMcAfee/", "WsdlMcAfeeLocalEndpoint")));
	}

	public WsdlMcAfee getWsdlMcAfeeLocalEndpoint(String url) {
		WsdlMcAfee var = getWsdlMcAfeeLocalEndpoint();
		org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
		return var;
	}

	public WsdlMcAfee getWsdlMcAfeeSOAP() {
		return ((WsdlMcAfee)(this).getEndpoint(new QName("http://www.grupotvcable.com.ec/WsdlMcAfee/", "WsdlMcAfeeSOAP")));
	}

	public WsdlMcAfee getWsdlMcAfeeSOAP(String url) {
		WsdlMcAfee var = getWsdlMcAfeeSOAP();
		org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
		return var;
	}

	public static void mainss(String[] args) throws NumberFormatException, IOException {


		File archivo = new File ("c:/mcafee.csv");
		FileReader fr = new FileReader (archivo);
		BufferedReader br = new BufferedReader(fr);

		WsdlMcAfeeClient client = new WsdlMcAfeeClient();
		WsdlMcAfee service = client.getWsdlMcAfeeSOAP();

		String linea = null;

		while((linea=br.readLine())!=null){// Lectura del fichero

			System.out.println(linea);
			String[] resul = linea.split(",");
			String orden = resul[0].trim();
			String idmcafee = resul[1].trim();
			String account_id = "";
			String citem_id = "";
			String mail = "regularizacion@titan.jc";
			

			
			//TODO: Add custom client code here
			//
			//service.yourServiceOperationHere();
			String IdEstado 		= "T";
			String Correo 			= mail;
			int IdEmpresa 			= 63;
			String Sistema 			= "TITAN";
			String Interfaz 		= "900";
			String Cuenta 			= account_id;
			String IdProducto 		= citem_id;
			int PlanMcAfeeTvCable 	= 0; //proteccion total
			String ClienteCRM 		= "0";
			String IdProductoCRM 	= "0";
			String Nombre 			= "";

			String IdMcAfee 		= idmcafee;
			String Referencia 		= orden;

			Respuesta res = service.aprovMcAfee(IdEmpresa, Sistema, Interfaz, IdEstado, 
					Cuenta, IdProducto, Correo, PlanMcAfeeTvCable, ClienteCRM, 
					IdProductoCRM, IdMcAfee, Referencia, Nombre );

			System.out.println(res.getCodError());
			System.out. println(res.getDetMensaje());
			System.out.println(res.getIdMcAfee());
			System.out.println(res.getReferencia());

			System.out.println("test client completed");

		}
		fr.close(); 

		System.exit(0);



	}


	public static void main(String[] args) {

		System.out.println("Aprovisionando...");
		WsdlMcAfeeClient client = new WsdlMcAfeeClient();

		//create a default service endpoint
		WsdlMcAfee service = client.getWsdlMcAfeeSOAP();

		//TODO: Add custom client code here
		//
		//service.yourServiceOperationHere();
		String IdEstado 		= "T" ; // A,T R recomect y se seta nueva,mnete la clabe de tvp
		String Correo 			= "correo_prueba_servidor_03@tvcable.com.ec";
		int IdEmpresa 			= 63;
		String Sistema 			= "TITAN";
		String Interfaz 		= "900"; // 900, 910 para seteo de claves
		String Cuenta 			= "0";
		String IdProducto 		= "0";
		int PlanMcAfeeTvCable 	= 1; //proteccion total codigo del plan 1,2,3,4,5
		String ClienteCRM 		= "0";
		String IdProductoCRM 	= "0";	
		String Nombre 			= "";
		
		String IdMcAfee 		= "3331";  //CCID 
		String Referencia 		= "7481"; //ORDEN
		
		Respuesta res = service.aprovMcAfee(IdEmpresa, Sistema, Interfaz, IdEstado, 
				Cuenta, IdProducto, Correo, PlanMcAfeeTvCable, ClienteCRM, 
				IdProductoCRM, IdMcAfee, Referencia, Nombre );

		System.out.println(res.getCodError());
		System.out.println(res.getDetMensaje());
		System.out.println(res.getIdMcAfee());
		System.out.println(res.getReferencia());

		System.out.println("test client completed");
		System.exit(0);


		
		

	}


}
