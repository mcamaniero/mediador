
package https.partners_compuredes_com_co.mcafee;

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

public class wsCrTransSvcClient {

    private static XFireProxyFactory proxyFactory = new XFireProxyFactory();
    private HashMap endpoints = new HashMap();
    private Service service0;

    public wsCrTransSvcClient() {
        create0();
        Endpoint wsCrTransSvcSoapEP = service0 .addEndpoint(new QName("https://partners.compuredes.com.co/mcafee", "wsCrTransSvcSoap"), new QName("https://partners.compuredes.com.co/mcafee", "wsCrTransSvcSoap"), "https://partners.compuredes.com.co/mcafee/wsCrTransSvc.asmx");
        endpoints.put(new QName("https://partners.compuredes.com.co/mcafee", "wsCrTransSvcSoap"), wsCrTransSvcSoapEP);
        Endpoint wsCrTransSvcSoapLocalEndpointEP = service0 .addEndpoint(new QName("https://partners.compuredes.com.co/mcafee", "wsCrTransSvcSoapLocalEndpoint"), new QName("https://partners.compuredes.com.co/mcafee", "wsCrTransSvcSoapLocalBinding"), "xfire.local://wsCrTransSvc");
        endpoints.put(new QName("https://partners.compuredes.com.co/mcafee", "wsCrTransSvcSoapLocalEndpoint"), wsCrTransSvcSoapLocalEndpointEP);
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
        service0 = asf.create((https.partners_compuredes_com_co.mcafee.wsCrTransSvcSoap.class), props);
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("https://partners.compuredes.com.co/mcafee", "wsCrTransSvcSoapLocalBinding"), "urn:xfire:transport:local");
        }
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("https://partners.compuredes.com.co/mcafee", "wsCrTransSvcSoap"), "http://schemas.xmlsoap.org/soap/http");
        }
    }

    public wsCrTransSvcSoap getwsCrTransSvcSoap() {
        return ((wsCrTransSvcSoap)(this).getEndpoint(new QName("https://partners.compuredes.com.co/mcafee", "wsCrTransSvcSoap")));
    }

    public wsCrTransSvcSoap getwsCrTransSvcSoap(String url) {
        wsCrTransSvcSoap var = getwsCrTransSvcSoap();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

    public wsCrTransSvcSoap getwsCrTransSvcSoapLocalEndpoint() {
        return ((wsCrTransSvcSoap)(this).getEndpoint(new QName("https://partners.compuredes.com.co/mcafee", "wsCrTransSvcSoapLocalEndpoint")));
    }

    public wsCrTransSvcSoap getwsCrTransSvcSoapLocalEndpoint(String url) {
        wsCrTransSvcSoap var = getwsCrTransSvcSoapLocalEndpoint();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

    public static void main(String[] args) {
        

        wsCrTransSvcClient client = new wsCrTransSvcClient();
        
		//create a default service endpoint
        wsCrTransSvcSoap service = client.getwsCrTransSvcSoap();
        
		//TODO: Add custom client code here
        		//
        		//service.yourServiceOperationHere();
        
		System.out.println("test client completed");
        		System.exit(0);
    }

}
