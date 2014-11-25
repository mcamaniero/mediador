
package ec.com.grupotvcable.wsdlmcafeeconsultaweb;

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

public class WsdlMcAfeeConsultaWebClient {

    private static XFireProxyFactory proxyFactory = new XFireProxyFactory();
    private HashMap endpoints = new HashMap();
    private Service service0;

    public WsdlMcAfeeConsultaWebClient() {
        create0();
        Endpoint WsdlMcAfeeConsultaWebLocalEndpointEP = service0 .addEndpoint(new QName("http://www.grupotvcable.com.ec/WsdlMcAfeeConsultaWeb/", "WsdlMcAfeeConsultaWebLocalEndpoint"), new QName("http://www.grupotvcable.com.ec/WsdlMcAfeeConsultaWeb/", "WsdlMcAfeeConsultaWebLocalBinding"), "xfire.local://WsdlMcAfeeConsultaWeb");
        endpoints.put(new QName("http://www.grupotvcable.com.ec/WsdlMcAfeeConsultaWeb/", "WsdlMcAfeeConsultaWebLocalEndpoint"), WsdlMcAfeeConsultaWebLocalEndpointEP);
        Endpoint WsdlMcAfeeConsultaWebSOAPEP = service0 .addEndpoint(new QName("http://www.grupotvcable.com.ec/WsdlMcAfeeConsultaWeb/", "WsdlMcAfeeConsultaWebSOAP"), new QName("http://www.grupotvcable.com.ec/WsdlMcAfeeConsultaWeb/", "WsdlMcAfeeConsultaWebSOAP"), "http://www.example.org/");
        endpoints.put(new QName("http://www.grupotvcable.com.ec/WsdlMcAfeeConsultaWeb/", "WsdlMcAfeeConsultaWebSOAP"), WsdlMcAfeeConsultaWebSOAPEP);
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
        service0 = asf.create((ec.com.grupotvcable.wsdlmcafeeconsultaweb.WsdlMcAfeeConsultaWeb.class), props);
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://www.grupotvcable.com.ec/WsdlMcAfeeConsultaWeb/", "WsdlMcAfeeConsultaWebLocalBinding"), "urn:xfire:transport:local");
        }
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://www.grupotvcable.com.ec/WsdlMcAfeeConsultaWeb/", "WsdlMcAfeeConsultaWebSOAP"), "http://schemas.xmlsoap.org/soap/http");
        }
    }

    public WsdlMcAfeeConsultaWeb getWsdlMcAfeeConsultaWebLocalEndpoint() {
        return ((WsdlMcAfeeConsultaWeb)(this).getEndpoint(new QName("http://www.grupotvcable.com.ec/WsdlMcAfeeConsultaWeb/", "WsdlMcAfeeConsultaWebLocalEndpoint")));
    }

    public WsdlMcAfeeConsultaWeb getWsdlMcAfeeConsultaWebLocalEndpoint(String url) {
        WsdlMcAfeeConsultaWeb var = getWsdlMcAfeeConsultaWebLocalEndpoint();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

    public WsdlMcAfeeConsultaWeb getWsdlMcAfeeConsultaWebSOAP() {
        return ((WsdlMcAfeeConsultaWeb)(this).getEndpoint(new QName("http://www.grupotvcable.com.ec/WsdlMcAfeeConsultaWeb/", "WsdlMcAfeeConsultaWebSOAP")));
    }

    public WsdlMcAfeeConsultaWeb getWsdlMcAfeeConsultaWebSOAP(String url) {
        WsdlMcAfeeConsultaWeb var = getWsdlMcAfeeConsultaWebSOAP();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

    public static void main(String[] args) {
        

        WsdlMcAfeeConsultaWebClient client = new WsdlMcAfeeConsultaWebClient();
        
		//create a default service endpoint
        WsdlMcAfeeConsultaWeb service = client.getWsdlMcAfeeConsultaWebSOAP();
        
		//TODO: Add custom client code here
        		//
        		//service.yourServiceOperationHere();
        
        Respuesta res = service.consultar("prueba15@tvcable.com.ec", "tvc20180792172");
        
		System.out.println("test client completed "+res.getPasswordMcAfee());
        		System.exit(0);
    }

}
