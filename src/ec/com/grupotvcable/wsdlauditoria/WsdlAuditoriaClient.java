
package ec.com.grupotvcable.wsdlauditoria;

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

public class WsdlAuditoriaClient {

    private static XFireProxyFactory proxyFactory = new XFireProxyFactory();
    private HashMap endpoints = new HashMap();
    private Service service0;

    public WsdlAuditoriaClient() {
        create0();
        Endpoint WsdlAuditoriaLocalEndpointEP = service0 .addEndpoint(new QName("http://www.grupotvcable.com.ec/WsdlAuditoria", "WsdlAuditoriaLocalEndpoint"), new QName("http://www.grupotvcable.com.ec/WsdlAuditoria", "WsdlAuditoriaLocalBinding"), "xfire.local://WsdlAuditoria");
        endpoints.put(new QName("http://www.grupotvcable.com.ec/WsdlAuditoria", "WsdlAuditoriaLocalEndpoint"), WsdlAuditoriaLocalEndpointEP);
        Endpoint WsdlAuditoriaSOAPEP = service0 .addEndpoint(new QName("http://www.grupotvcable.com.ec/WsdlAuditoria", "WsdlAuditoriaSOAP"), new QName("http://www.grupotvcable.com.ec/WsdlAuditoria", "WsdlAuditoriaSOAP"), "http://192.168.0.114:8081/WsAprovisionamiento/services/WsdlAuditoria");
        endpoints.put(new QName("http://www.grupotvcable.com.ec/WsdlAuditoria", "WsdlAuditoriaSOAP"), WsdlAuditoriaSOAPEP);
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
        service0 = asf.create((ec.com.grupotvcable.wsdlauditoria.WsdlAuditoria.class), props);
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://www.grupotvcable.com.ec/WsdlAuditoria", "WsdlAuditoriaLocalBinding"), "urn:xfire:transport:local");
        }
        {
            AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://www.grupotvcable.com.ec/WsdlAuditoria", "WsdlAuditoriaSOAP"), "http://schemas.xmlsoap.org/soap/http");
        }
    }

    public WsdlAuditoria getWsdlAuditoriaLocalEndpoint() {
        return ((WsdlAuditoria)(this).getEndpoint(new QName("http://www.grupotvcable.com.ec/WsdlAuditoria", "WsdlAuditoriaLocalEndpoint")));
    }

    public WsdlAuditoria getWsdlAuditoriaLocalEndpoint(String url) {
        WsdlAuditoria var = getWsdlAuditoriaLocalEndpoint();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

    public WsdlAuditoria getWsdlAuditoriaSOAP() {
        return ((WsdlAuditoria)(this).getEndpoint(new QName("http://www.grupotvcable.com.ec/WsdlAuditoria", "WsdlAuditoriaSOAP")));
    }

    public WsdlAuditoria getWsdlAuditoriaSOAP(String url) {
        WsdlAuditoria var = getWsdlAuditoriaSOAP();
        org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
        return var;
    }

    public static void main(String[] args) {
        

        WsdlAuditoriaClient client = new WsdlAuditoriaClient();
        WsdlAuditoria service = client.getWsdlAuditoriaSOAP();
        String Tipo = "101";
		String Sesion = "125";
		String AuthKey = "key-secreto-auditoria-titan";
		String resp = service.auditoriaIwSafari(Tipo, Sesion, AuthKey);
        
		//TODO: Add custom client code here
        		//
        		//service.yourServiceOperationHere();
        
		System.out.println("test client completed "+resp);
        		System.exit(0);
    }

}
