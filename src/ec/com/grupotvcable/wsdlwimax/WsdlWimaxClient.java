
package ec.com.grupotvcable.wsdlwimax;

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

public class WsdlWimaxClient {

    private static XFireProxyFactory proxyFactory = new XFireProxyFactory();
    private HashMap endpoints = new HashMap();
    private Service service0;

    public WsdlWimaxClient() {
        create0();
        Endpoint WsdlWimaxSOAPEP = service0 .addEndpoint(new QName("http://www.grupotvcable.com.ec/WsdlWimax/", "WsdlWimaxSOAP"), new QName("http://www.grupotvcable.com.ec/WsdlWimax/", "WsdlWimaxSOAP"), "http://192.168.0.108/WsAprovisionamiento/services/WsdlWimax");
        endpoints.put(new QName("http://www.grupotvcable.com.ec/WsdlWimax/", "WsdlWimaxSOAP"), WsdlWimaxSOAPEP);
        Endpoint WsdlWimaxLocalEndpointEP = service0 .addEndpoint(new QName("http://www.grupotvcable.com.ec/WsdlWimax/", "WsdlWimaxLocalEndpoint"), new QName("http://www.grupotvcable.com.ec/WsdlWimax/", "WsdlWimaxLocalBinding"), "xfire.local://WsdlWimax");
        endpoints.put(new QName("http://www.grupotvcable.com.ec/WsdlWimax/", "WsdlWimaxLocalEndpoint"), WsdlWimaxLocalEndpointEP);
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
        service0 = asf.create((ec.com.grupotvcable.wsdlwimax.WsdlWimax.class), props);
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://www.grupotvcable.com.ec/WsdlWimax/", "WsdlWimaxSOAP"), "http://schemas.xmlsoap.org/soap/http");
        }
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://www.grupotvcable.com.ec/WsdlWimax/", "WsdlWimaxLocalBinding"), "urn:xfire:transport:local");
        }
    }

    public WsdlWimax getWsdlWimaxSOAP() {
        return ((WsdlWimax)(this).getEndpoint(new QName("http://www.grupotvcable.com.ec/WsdlWimax/", "WsdlWimaxSOAP")));
    }

    public WsdlWimax getWsdlWimaxSOAP(String url) {
        WsdlWimax var = getWsdlWimaxSOAP();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

    public WsdlWimax getWsdlWimaxLocalEndpoint() {
        return ((WsdlWimax)(this).getEndpoint(new QName("http://www.grupotvcable.com.ec/WsdlWimax/", "WsdlWimaxLocalEndpoint")));
    }

    public WsdlWimax getWsdlWimaxLocalEndpoint(String url) {
        WsdlWimax var = getWsdlWimaxLocalEndpoint();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

    public static void main(String[] args) {
        

        WsdlWimaxClient client = new WsdlWimaxClient();
        
		//create a default service endpoint
        WsdlWimax service = client.getWsdlWimaxSOAP();
        
        Respuesta res = service.aprovWimax(new Comando());
        
		//TODO: Add custom client code here
        		//
        		//service.yourServiceOperationHere();
        
		System.out.println("test client completed "+res.getMensaje().getDetMensaje());
        		System.exit(0);
    }

}
