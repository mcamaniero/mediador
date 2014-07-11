
package ec.com.grupotvcable.agenciavirtual;

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

public class WsdlAgenciaVirtualClient {

	private static XFireProxyFactory proxyFactory = new XFireProxyFactory();
    private HashMap endpoints = new HashMap();
    private Service service0;

    public WsdlAgenciaVirtualClient() {
        create0();
        Endpoint WsdlAgenciaVirtualHttpPortEP = service0 .addEndpoint(new QName("http://www.grupotvcable.com.ec/AgenciaVirtual/", "WsdlAgenciaVirtualHttpPort"), new QName("http://www.grupotvcable.com.ec/AgenciaVirtual/", "WsdlAgenciaVirtualHttpBinding"), "http://192.168.0.114:8081/WsAprovisionamiento/services/WsdlAgenciaVirtual");
        endpoints.put(new QName("http://www.grupotvcable.com.ec/AgenciaVirtual/", "WsdlAgenciaVirtualHttpPort"), WsdlAgenciaVirtualHttpPortEP);
        Endpoint AgenciaVirtualLocalEndpointEP = service0 .addEndpoint(new QName("http://www.grupotvcable.com.ec/AgenciaVirtual/", "AgenciaVirtualLocalEndpoint"), new QName("http://www.grupotvcable.com.ec/AgenciaVirtual/", "AgenciaVirtualLocalBinding"), "xfire.local://WsdlAgenciaVirtual");
        endpoints.put(new QName("http://www.grupotvcable.com.ec/AgenciaVirtual/", "AgenciaVirtualLocalEndpoint"), AgenciaVirtualLocalEndpointEP);
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
        service0 = asf.create((ec.com.grupotvcable.agenciavirtual.AgenciaVirtual.class), props);
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://www.grupotvcable.com.ec/AgenciaVirtual/", "AgenciaVirtualLocalBinding"), "urn:xfire:transport:local");
        }
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://www.grupotvcable.com.ec/AgenciaVirtual/", "WsdlAgenciaVirtualHttpBinding"), "http://schemas.xmlsoap.org/soap/http");
        }
    }

    public AgenciaVirtual getWsdlAgenciaVirtualHttpPort() {
        return ((AgenciaVirtual)(this).getEndpoint(new QName("http://www.grupotvcable.com.ec/AgenciaVirtual/", "WsdlAgenciaVirtualHttpPort")));
    }

    public AgenciaVirtual getWsdlAgenciaVirtualHttpPort(String url) {
        AgenciaVirtual var = getWsdlAgenciaVirtualHttpPort();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

    public AgenciaVirtual getAgenciaVirtualLocalEndpoint() {
        return ((AgenciaVirtual)(this).getEndpoint(new QName("http://www.grupotvcable.com.ec/AgenciaVirtual/", "AgenciaVirtualLocalEndpoint")));
    }

    public AgenciaVirtual getAgenciaVirtualLocalEndpoint(String url) {
        AgenciaVirtual var = getAgenciaVirtualLocalEndpoint();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

    public static void main(String[] args) {
        

        WsdlAgenciaVirtualClient client = new WsdlAgenciaVirtualClient();
        
		//create a default service endpoint
        AgenciaVirtual service = client.getWsdlAgenciaVirtualHttpPort();
        
        Respuesta res = service.recuperarClave("giacor522", "gye.satnet.net");
        
        System.out.println("test client completed "+res.getCodError());
        System.out.println("test client completed "+res.getDetMensaje());
		System.out.println("test client completed "+res.getClave());
        		System.exit(0);
    }

}
