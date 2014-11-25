
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

public class wsCrLoginSvcClient {

    private static XFireProxyFactory proxyFactory = new XFireProxyFactory();
    private HashMap endpoints = new HashMap();
    private Service service0;

    public wsCrLoginSvcClient() {
        create0();
        Endpoint wsCrLoginSvcSoapLocalEndpointEP = service0 .addEndpoint(new QName("https://partners.compuredes.com.co/mcafee", "wsCrLoginSvcSoapLocalEndpoint"), new QName("https://partners.compuredes.com.co/mcafee", "wsCrLoginSvcSoapLocalBinding"), "xfire.local://wsCrLoginSvc");
        endpoints.put(new QName("https://partners.compuredes.com.co/mcafee", "wsCrLoginSvcSoapLocalEndpoint"), wsCrLoginSvcSoapLocalEndpointEP);
        Endpoint wsCrLoginSvcSoapEP = service0 .addEndpoint(new QName("https://partners.compuredes.com.co/mcafee", "wsCrLoginSvcSoap"), new QName("https://partners.compuredes.com.co/mcafee", "wsCrLoginSvcSoap"), "http://testmc.compuredes.com.co/mcafee/wsCrLoginSvc.asmx");
        endpoints.put(new QName("https://partners.compuredes.com.co/mcafee", "wsCrLoginSvcSoap"), wsCrLoginSvcSoapEP);
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
        service0 = asf.create((https.partners_compuredes_com_co.mcafee.wsCrLoginSvcSoap.class), props);
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("https://partners.compuredes.com.co/mcafee", "wsCrLoginSvcSoapLocalBinding"), "urn:xfire:transport:local");
        }
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("https://partners.compuredes.com.co/mcafee", "wsCrLoginSvcSoap"), "http://schemas.xmlsoap.org/soap/http");
        }
    }

    public wsCrLoginSvcSoap getwsCrLoginSvcSoapLocalEndpoint() {
        return ((wsCrLoginSvcSoap)(this).getEndpoint(new QName("https://partners.compuredes.com.co/mcafee", "wsCrLoginSvcSoapLocalEndpoint")));
    }

    public wsCrLoginSvcSoap getwsCrLoginSvcSoapLocalEndpoint(String url) {
        wsCrLoginSvcSoap var = getwsCrLoginSvcSoapLocalEndpoint();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

    public wsCrLoginSvcSoap getwsCrLoginSvcSoap() {
        return ((wsCrLoginSvcSoap)(this).getEndpoint(new QName("https://partners.compuredes.com.co/mcafee", "wsCrLoginSvcSoap")));
    }

    public wsCrLoginSvcSoap getwsCrLoginSvcSoap(String url) {
        wsCrLoginSvcSoap var = getwsCrLoginSvcSoap();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

    public static void main(String[] args) {
        

        wsCrLoginSvcClient client = new wsCrLoginSvcClient();
        
		//create a default service endpoint
        wsCrLoginSvcSoap service = client.getwsCrLoginSvcSoap();
        
		//TODO: Add custom client code here
        		//
        		//service.yourServiceOperationHere();
        
		System.out.println("test client completed");
        		System.exit(0);
    }

}
