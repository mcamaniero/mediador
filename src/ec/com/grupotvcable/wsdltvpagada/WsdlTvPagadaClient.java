
package ec.com.grupotvcable.wsdltvpagada;

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

public class WsdlTvPagadaClient {

    private static XFireProxyFactory proxyFactory = new XFireProxyFactory();
    private HashMap endpoints = new HashMap();
    private Service service0;

    public WsdlTvPagadaClient() {
        create0();
        Endpoint WsdlTvPagadaSOAPEP = service0 .addEndpoint(new QName("http://www.grupotvcable.com.ec/WsdlTvPagada/", "WsdlTvPagadaSOAP"), new QName("http://www.grupotvcable.com.ec/WsdlTvPagada/", "WsdlTvPagadaSOAP"), "http://192.168.0.108/WsAprovisionamiento/services/WsdlTvPagada");
        endpoints.put(new QName("http://www.grupotvcable.com.ec/WsdlTvPagada/", "WsdlTvPagadaSOAP"), WsdlTvPagadaSOAPEP);
        Endpoint WsdlTvPagadaLocalEndpointEP = service0 .addEndpoint(new QName("http://www.grupotvcable.com.ec/WsdlTvPagada/", "WsdlTvPagadaLocalEndpoint"), new QName("http://www.grupotvcable.com.ec/WsdlTvPagada/", "WsdlTvPagadaLocalBinding"), "xfire.local://WsdlTvPagada");
        endpoints.put(new QName("http://www.grupotvcable.com.ec/WsdlTvPagada/", "WsdlTvPagadaLocalEndpoint"), WsdlTvPagadaLocalEndpointEP);
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
        service0 = asf.create((ec.com.grupotvcable.wsdltvpagada.WsdlTvPagada.class), props);
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://www.grupotvcable.com.ec/WsdlTvPagada/", "WsdlTvPagadaLocalBinding"), "urn:xfire:transport:local");
        }
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://www.grupotvcable.com.ec/WsdlTvPagada/", "WsdlTvPagadaSOAP"), "http://schemas.xmlsoap.org/soap/http");
        }
    }

    public WsdlTvPagada getWsdlTvPagadaSOAP() {
        return ((WsdlTvPagada)(this).getEndpoint(new QName("http://www.grupotvcable.com.ec/WsdlTvPagada/", "WsdlTvPagadaSOAP")));
    }

    public WsdlTvPagada getWsdlTvPagadaSOAP(String url) {
        WsdlTvPagada var = getWsdlTvPagadaSOAP();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

    public WsdlTvPagada getWsdlTvPagadaLocalEndpoint() {
        return ((WsdlTvPagada)(this).getEndpoint(new QName("http://www.grupotvcable.com.ec/WsdlTvPagada/", "WsdlTvPagadaLocalEndpoint")));
    }

    public WsdlTvPagada getWsdlTvPagadaLocalEndpoint(String url) {
        WsdlTvPagada var = getWsdlTvPagadaLocalEndpoint();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

    public static void main(String[] args) {
     
        WsdlTvPagadaClient client = new WsdlTvPagadaClient();
        
		//create a default service endpoint
        WsdlTvPagada service = client.getWsdlTvPagadaSOAP();
        
		Respuesta res = service.aprovTvPagada(new Comando());
        
		System.out.println("test client completed "+res.getMensaje().getDetMensaje());
       
        
		System.exit(0);
    }

}
