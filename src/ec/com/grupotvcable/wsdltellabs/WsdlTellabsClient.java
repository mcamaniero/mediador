
package ec.com.grupotvcable.wsdltellabs;

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

public class WsdlTellabsClient {

    private static XFireProxyFactory proxyFactory = new XFireProxyFactory();
    private HashMap endpoints = new HashMap();
    private Service service0;

    public WsdlTellabsClient() {
        create0();
        Endpoint WsdlTellabsSOAPEP = service0 .addEndpoint(new QName("http://www.grupotvcable.com.ec/WsdlTellabs/", "WsdlTellabsSOAP"), new QName("http://www.grupotvcable.com.ec/WsdlTellabs/", "WsdlTellabsSOAP"), "http://192.168.0.108/WsAprovisionamiento/services/WsdlTellabs");
        endpoints.put(new QName("http://www.grupotvcable.com.ec/WsdlTellabs/", "WsdlTellabsSOAP"), WsdlTellabsSOAPEP);
        Endpoint WsdlTellabsLocalEndpointEP = service0 .addEndpoint(new QName("http://www.grupotvcable.com.ec/WsdlTellabs/", "WsdlTellabsLocalEndpoint"), new QName("http://www.grupotvcable.com.ec/WsdlTellabs/", "WsdlTellabsLocalBinding"), "xfire.local://WsdlTellabs");
        endpoints.put(new QName("http://www.grupotvcable.com.ec/WsdlTellabs/", "WsdlTellabsLocalEndpoint"), WsdlTellabsLocalEndpointEP);
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
        service0 = asf.create((ec.com.grupotvcable.wsdltellabs.WsdlTellabs.class), props);
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://www.grupotvcable.com.ec/WsdlTellabs/", "WsdlTellabsSOAP"), "http://schemas.xmlsoap.org/soap/http");
        }
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://www.grupotvcable.com.ec/WsdlTellabs/", "WsdlTellabsLocalBinding"), "urn:xfire:transport:local");
        }
    }

    public WsdlTellabs getWsdlTellabsSOAP() {
        return ((WsdlTellabs)(this).getEndpoint(new QName("http://www.grupotvcable.com.ec/WsdlTellabs/", "WsdlTellabsSOAP")));
    }

    public WsdlTellabs getWsdlTellabsSOAP(String url) {
        WsdlTellabs var = getWsdlTellabsSOAP();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

    public WsdlTellabs getWsdlTellabsLocalEndpoint() {
        return ((WsdlTellabs)(this).getEndpoint(new QName("http://www.grupotvcable.com.ec/WsdlTellabs/", "WsdlTellabsLocalEndpoint")));
    }

    public WsdlTellabs getWsdlTellabsLocalEndpoint(String url) {
        WsdlTellabs var = getWsdlTellabsLocalEndpoint();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

    public static void main(String[] args) {
        

        WsdlTellabsClient client = new WsdlTellabsClient();
        
		//create a default service endpoint
        WsdlTellabs service = client.getWsdlTellabsSOAP();
        
        
        Comando cmd = new Comando();
        
		Respuesta res = service.aprovTellabs(cmd );
		//TODO: Add custom client code here
        		//
        		//service.yourServiceOperationHere();
        
		System.out.println("test client completed "+res.getMensaje().getDetMensaje() );
        		System.exit(0);
    }

}
