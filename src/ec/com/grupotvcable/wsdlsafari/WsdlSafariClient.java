
package ec.com.grupotvcable.wsdlsafari;

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

public class WsdlSafariClient {

	private static XFireProxyFactory proxyFactory = new XFireProxyFactory();
	private HashMap endpoints = new HashMap();
	private Service service0;

	public WsdlSafariClient() {
		create0();
		Endpoint WsdlSafariLocalEndpointEP = service0 .addEndpoint(new QName("http://www.grupotvcable.com.ec/WsdlSafari/", "WsdlSafariLocalEndpoint"), new QName("http://www.grupotvcable.com.ec/WsdlSafari/", "WsdlSafariLocalBinding"), "xfire.local://WsdlSafari");
		endpoints.put(new QName("http://www.grupotvcable.com.ec/WsdlSafari/", "WsdlSafariLocalEndpoint"), WsdlSafariLocalEndpointEP);
		Endpoint WsdlSafariHttpPortEP = service0 .addEndpoint(new QName("http://www.grupotvcable.com.ec/WsdlSafari/", "WsdlSafariHttpPort"), new QName("http://www.grupotvcable.com.ec/WsdlSafari/", "WsdlSafariHttpBinding"), "http://192.168.21.205/Titan/services/WsdlSafari");
		endpoints.put(new QName("http://www.grupotvcable.com.ec/WsdlSafari/", "WsdlSafariHttpPort"), WsdlSafariHttpPortEP);
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
		service0 = asf.create((ec.com.grupotvcable.wsdlsafari.WsdlSafari.class), props);
		{
			AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://www.grupotvcable.com.ec/WsdlSafari/", "WsdlSafariLocalBinding"), "urn:xfire:transport:local");
		}
		{
			AbstractSoapBinding soapBinding = asf.createSoap11Binding(service0, new QName("http://www.grupotvcable.com.ec/WsdlSafari/", "WsdlSafariHttpBinding"), "http://schemas.xmlsoap.org/soap/http");
		}
	}

	public WsdlSafari getWsdlSafariLocalEndpoint() {
		return ((WsdlSafari)(this).getEndpoint(new QName("http://www.grupotvcable.com.ec/WsdlSafari/", "WsdlSafariLocalEndpoint")));
	}

	public WsdlSafari getWsdlSafariLocalEndpoint(String url) {
		WsdlSafari var = getWsdlSafariLocalEndpoint();
		org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
		return var;
	}

	public WsdlSafari getWsdlSafariHttpPort() {
		return ((WsdlSafari)(this).getEndpoint(new QName("http://www.grupotvcable.com.ec/WsdlSafari/", "WsdlSafariHttpPort")));
	}

	public WsdlSafari getWsdlSafariHttpPort(String url) {
		WsdlSafari var = getWsdlSafariHttpPort();
		org.codehaus.xfire.client.Client.getInstance(var).setUrl(url);
		return var;
	}


}
