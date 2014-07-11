
package ec.com.grupotvcable.wsdlintraway2;

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

import ec.com.grupotvcable.wsdlintraway2.Respuesta;
import ec.com.grupotvcable.wsdlintraway2.WsdlIntraway;
import ec.com.grupotvcable.wsdlintraway2.WsdlIntrawayClient;
import ec.com.grupotvcable.wsdlintraway2.Cabecera;
import ec.com.grupotvcable.wsdlintraway2.Comando;
import ec.com.grupotvcable.wsdlintraway2.Detalle;
import ec.com.grupotvcable.wsdlintraway2.Estandar;
import ec.com.grupotvcable.wsdlintraway2.Interfaz;
import ec.com.grupotvcable.wsdlintraway2.Intraway;

public class WsdlIntrawayClient {

    private static XFireProxyFactory proxyFactory = new XFireProxyFactory();
    private HashMap endpoints = new HashMap();
    private Service service0;

    public WsdlIntrawayClient() {
        create0();
        Endpoint WsdlIntrawayLocalEndpointEP = service0 .addEndpoint(new QName("http://www.grupotvcable.com.ec/WsdlIntraway2/", "WsdlIntrawayLocalEndpoint"), new QName("http://www.grupotvcable.com.ec/WsdlIntraway2/", "WsdlIntrawayLocalBinding"), "xfire.local://WsdlIntraway");
        endpoints.put(new QName("http://www.grupotvcable.com.ec/WsdlIntraway2/", "WsdlIntrawayLocalEndpoint"), WsdlIntrawayLocalEndpointEP);
        Endpoint WsdlIntrawaySOAPEP = service0 .addEndpoint(new QName("http://www.grupotvcable.com.ec/WsdlIntraway2/", "WsdlIntrawaySOAP"), new QName("http://www.grupotvcable.com.ec/WsdlIntraway2/", "WsdlIntrawaySOAP"), "http://192.168.0.114:8081/crm/services/WsdlIntraway2");
        endpoints.put(new QName("http://www.grupotvcable.com.ec/WsdlIntraway2/", "WsdlIntrawaySOAP"), WsdlIntrawaySOAPEP);
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
        service0 = asf.create((ec.com.grupotvcable.wsdlintraway2.WsdlIntraway.class), props);
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://www.grupotvcable.com.ec/WsdlIntraway2/", "WsdlIntrawayLocalBinding"), "urn:xfire:transport:local");
        }
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://www.grupotvcable.com.ec/WsdlIntraway2/", "WsdlIntrawaySOAP"), "http://schemas.xmlsoap.org/soap/http");
        }
    }

    public WsdlIntraway getWsdlIntrawayLocalEndpoint() {
        return ((WsdlIntraway)(this).getEndpoint(new QName("http://www.grupotvcable.com.ec/WsdlIntraway2/", "WsdlIntrawayLocalEndpoint")));
    }

    public WsdlIntraway getWsdlIntrawayLocalEndpoint(String url) {
        WsdlIntraway var = getWsdlIntrawayLocalEndpoint();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

    public WsdlIntraway getWsdlIntrawaySOAP() {
        return ((WsdlIntraway)(this).getEndpoint(new QName("http://www.grupotvcable.com.ec/WsdlIntraway2/", "WsdlIntrawaySOAP")));
    }

    public WsdlIntraway getWsdlIntrawaySOAP(String url) {
        WsdlIntraway var = getWsdlIntrawaySOAP();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }
    
    
    
    
    
    private Comando getI628(){//asignacion de mensajes al CM
		Comando cmd = new Comando();
		Cabecera cab = new Cabecera();
		cab.setIDEmpresa("94");
		cab.setInterface("628");
		cab.setNegocio("2");// suratel
		cab.setSecuencia("276");
		cmd.setCabecera(cab );

		Detalle det = new Detalle();
		Intraway intra = new Intraway();

		Estandar est = new Estandar();
		est.setIdEstado("0");//bien
		est.setClienteCRM("80001234");//bien
		est.setIdVenta("0");//bien
		est.setIdVentaPadre("0");//bien
		est.setIdServicio("1");//bien
		est.setIdProducto("8000125");//bien
		est.setIdServicioPadre("0");//bien
		est.setIdProductoPadre("0");//bien
		est.setIdPromotor("0");//bien

		intra.setEstandar(est );

		Interfaz inter = new Interfaz();
		
		//1   CmBloqueado
		//2   RecordarPago
		//3   CmRemov2
		//4   Dial Up Removible
		//5   DialUp Removible 2
		
		inter.setCustomer3("2");
		inter.setCustomer4("");
		inter.setDatoI1("7");
		intra.setInterfaz(inter );
		det.setIntraway(intra );
		cmd.setDetalle(det );
		return cmd;
	}
	
    

    public static void main(String[] args) {
        

    	WsdlIntrawayClient client = new WsdlIntrawayClient();
		WsdlIntraway service = client.getWsdlIntrawaySOAP();
		Respuesta res = service.aprovIntraway(client.getI628());
				
		System.out.println("test client completed "+res.getMensaje().getCodError());
		System.out.println("test client completed "+res.getMensaje().getDetMensaje());

          		System.exit(0);
    }

}
