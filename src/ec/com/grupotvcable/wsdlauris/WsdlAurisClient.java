
package ec.com.grupotvcable.wsdlauris;

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

public class WsdlAurisClient {

    private static XFireProxyFactory proxyFactory = new XFireProxyFactory();
    private HashMap endpoints = new HashMap();
    private Service service0;

    public WsdlAurisClient() {
        create0();
        Endpoint WsdlAurisLocalEndpointEP = service0 .addEndpoint(new QName("http://www.grupotvcable.com.ec/WsdlAuris/", "WsdlAurisLocalEndpoint"), new QName("http://www.grupotvcable.com.ec/WsdlAuris/", "WsdlAurisLocalBinding"), "xfire.local://WsdlAuris");
        endpoints.put(new QName("http://www.grupotvcable.com.ec/WsdlAuris/", "WsdlAurisLocalEndpoint"), WsdlAurisLocalEndpointEP);
        Endpoint WsdlAurisSOAPEP = service0 .addEndpoint(new QName("http://www.grupotvcable.com.ec/WsdlAuris/", "WsdlAurisSOAP"), new QName("http://www.grupotvcable.com.ec/WsdlAuris/", "WsdlAurisSOAP"), "http://192.168.0.108/WsAprovisionamiento/services/WsdlAuris");
        endpoints.put(new QName("http://www.grupotvcable.com.ec/WsdlAuris/", "WsdlAurisSOAP"), WsdlAurisSOAPEP);
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
        service0 = asf.create((ec.com.grupotvcable.wsdlauris.WsdlAuris.class), props);
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://www.grupotvcable.com.ec/WsdlAuris/", "WsdlAurisLocalBinding"), "urn:xfire:transport:local");
        }
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://www.grupotvcable.com.ec/WsdlAuris/", "WsdlAurisSOAP"), "http://schemas.xmlsoap.org/soap/http");
        }
    }

    public WsdlAuris getWsdlAurisLocalEndpoint() {
        return ((WsdlAuris)(this).getEndpoint(new QName("http://www.grupotvcable.com.ec/WsdlAuris/", "WsdlAurisLocalEndpoint")));
    }

    public WsdlAuris getWsdlAurisLocalEndpoint(String url) {
        WsdlAuris var = getWsdlAurisLocalEndpoint();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

    public WsdlAuris getWsdlAurisSOAP() {
        return ((WsdlAuris)(this).getEndpoint(new QName("http://www.grupotvcable.com.ec/WsdlAuris/", "WsdlAurisSOAP")));
    }

    public WsdlAuris getWsdlAurisSOAP(String url) {
        WsdlAuris var = getWsdlAurisSOAP();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

    public static void main(String[] args) {
        

        WsdlAurisClient client = new WsdlAurisClient();
        
		//create a default service endpoint
        WsdlAuris service = client.getWsdlAurisSOAP();
        
		//TODO: Add custom client code here
        		//
        		//service.yourServiceOperationHere();
        
		System.out.println("test client completed");
        		System.exit(0);
    }

}
