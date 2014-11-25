
package ec.com.grupotvcable.wsdlauditoriatitaniw;

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

public class WsdlAuditoriaTitanIwClient {

    private static XFireProxyFactory proxyFactory = new XFireProxyFactory();
    private HashMap endpoints = new HashMap();
    private Service service0;

    public WsdlAuditoriaTitanIwClient() {
        create0();
        Endpoint WsdlAuditoriaTitanIwLocalEndpointEP = service0 .addEndpoint(new QName("http://www.grupotvcable.com.ec/WsdlAuditoriaTitanIw/", "WsdlAuditoriaTitanIwLocalEndpoint"), new QName("http://www.grupotvcable.com.ec/WsdlAuditoriaTitanIw/", "WsdlAuditoriaTitanIwLocalBinding"), "xfire.local://WsdlAuditoriaTitanIw");
        endpoints.put(new QName("http://www.grupotvcable.com.ec/WsdlAuditoriaTitanIw/", "WsdlAuditoriaTitanIwLocalEndpoint"), WsdlAuditoriaTitanIwLocalEndpointEP);
        Endpoint WsdlAuditoriaTitanIwSOAPEP = service0 .addEndpoint(new QName("http://www.grupotvcable.com.ec/WsdlAuditoriaTitanIw/", "WsdlAuditoriaTitanIwSOAP"), new QName("http://www.grupotvcable.com.ec/WsdlAuditoriaTitanIw/", "WsdlAuditoriaTitanIwSOAP"), "http://192.168.0.114:8081/Titan/services/WsdlAuditoriaTitanIw");
        endpoints.put(new QName("http://www.grupotvcable.com.ec/WsdlAuditoriaTitanIw/", "WsdlAuditoriaTitanIwSOAP"), WsdlAuditoriaTitanIwSOAPEP);
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
        service0 = asf.create((ec.com.grupotvcable.wsdlauditoriatitaniw.WsdlAuditoriaTitanIw.class), props);
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://www.grupotvcable.com.ec/WsdlAuditoriaTitanIw/", "WsdlAuditoriaTitanIwLocalBinding"), "urn:xfire:transport:local");
        }
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://www.grupotvcable.com.ec/WsdlAuditoriaTitanIw/", "WsdlAuditoriaTitanIwSOAP"), "http://schemas.xmlsoap.org/soap/http");
        }
    }

    public WsdlAuditoriaTitanIw getWsdlAuditoriaTitanIwLocalEndpoint() {
        return ((WsdlAuditoriaTitanIw)(this).getEndpoint(new QName("http://www.grupotvcable.com.ec/WsdlAuditoriaTitanIw/", "WsdlAuditoriaTitanIwLocalEndpoint")));
    }

    public WsdlAuditoriaTitanIw getWsdlAuditoriaTitanIwLocalEndpoint(String url) {
        WsdlAuditoriaTitanIw var = getWsdlAuditoriaTitanIwLocalEndpoint();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

    public WsdlAuditoriaTitanIw getWsdlAuditoriaTitanIwSOAP() {
        return ((WsdlAuditoriaTitanIw)(this).getEndpoint(new QName("http://www.grupotvcable.com.ec/WsdlAuditoriaTitanIw/", "WsdlAuditoriaTitanIwSOAP")));
    }

    public WsdlAuditoriaTitanIw getWsdlAuditoriaTitanIwSOAP(String url) {
        WsdlAuditoriaTitanIw var = getWsdlAuditoriaTitanIwSOAP();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

    public static void main(String[] args) {
        

        WsdlAuditoriaTitanIwClient client = new WsdlAuditoriaTitanIwClient();
        
		//create a default service endpoint
        WsdlAuditoriaTitanIw service = client.getWsdlAuditoriaTitanIwSOAP();
        
		//TODO: Add custom client code here
        		//
        		//service.yourServiceOperationHere();
        
		System.out.println("test client completed");
        		System.exit(0);
    }

}
