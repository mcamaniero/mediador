/**
 * WsCrLoginSvcLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.compuredes.partners.mcafee;

public class WsCrLoginSvcLocator extends org.apache.axis.client.Service implements co.com.compuredes.partners.mcafee.WsCrLoginSvc {

    public WsCrLoginSvcLocator() {
    }


    public WsCrLoginSvcLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WsCrLoginSvcLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for wsCrLoginSvcSoap12
    private java.lang.String wsCrLoginSvcSoap12_address = "http://testmc.compuredes.com.co/mcafee/wsCrLoginSvc.asmx";

    public java.lang.String getwsCrLoginSvcSoap12Address() {
        return wsCrLoginSvcSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String wsCrLoginSvcSoap12WSDDServiceName = "wsCrLoginSvcSoap12";

    public java.lang.String getwsCrLoginSvcSoap12WSDDServiceName() {
        return wsCrLoginSvcSoap12WSDDServiceName;
    }

    public void setwsCrLoginSvcSoap12WSDDServiceName(java.lang.String name) {
        wsCrLoginSvcSoap12WSDDServiceName = name;
    }

    public co.com.compuredes.partners.mcafee.WsCrLoginSvcSoap getwsCrLoginSvcSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(wsCrLoginSvcSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getwsCrLoginSvcSoap12(endpoint);
    }

    public co.com.compuredes.partners.mcafee.WsCrLoginSvcSoap getwsCrLoginSvcSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            co.com.compuredes.partners.mcafee.WsCrLoginSvcSoap12Stub _stub = new co.com.compuredes.partners.mcafee.WsCrLoginSvcSoap12Stub(portAddress, this);
            _stub.setPortName(getwsCrLoginSvcSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setwsCrLoginSvcSoap12EndpointAddress(java.lang.String address) {
        wsCrLoginSvcSoap12_address = address;
    }


    // Use to get a proxy class for wsCrLoginSvcSoap
    //SItio de Produccion jcalle
    private java.lang.String wsCrLoginSvcSoap_address = "https://partners.compuredes.com.co/mcafee/wsCrLoginSvc.asmx";
    
    
    
    
    
    //private java.lang.String wsCrLoginSvcSoap_address = "http://testmc.compuredes.com.co/mcafee/wsCrLoginSvc.asmx";

    public java.lang.String getwsCrLoginSvcSoapAddress() {
        return wsCrLoginSvcSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String wsCrLoginSvcSoapWSDDServiceName = "wsCrLoginSvcSoap";

    public java.lang.String getwsCrLoginSvcSoapWSDDServiceName() {
        return wsCrLoginSvcSoapWSDDServiceName;
    }

    public void setwsCrLoginSvcSoapWSDDServiceName(java.lang.String name) {
        wsCrLoginSvcSoapWSDDServiceName = name;
    }

    public co.com.compuredes.partners.mcafee.WsCrLoginSvcSoap getwsCrLoginSvcSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(wsCrLoginSvcSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getwsCrLoginSvcSoap(endpoint);
    }

    public co.com.compuredes.partners.mcafee.WsCrLoginSvcSoap getwsCrLoginSvcSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            co.com.compuredes.partners.mcafee.WsCrLoginSvcSoapStub _stub = new co.com.compuredes.partners.mcafee.WsCrLoginSvcSoapStub(portAddress, this);
            _stub.setPortName(getwsCrLoginSvcSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setwsCrLoginSvcSoapEndpointAddress(java.lang.String address) {
        wsCrLoginSvcSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (co.com.compuredes.partners.mcafee.WsCrLoginSvcSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                co.com.compuredes.partners.mcafee.WsCrLoginSvcSoap12Stub _stub = new co.com.compuredes.partners.mcafee.WsCrLoginSvcSoap12Stub(new java.net.URL(wsCrLoginSvcSoap12_address), this);
                _stub.setPortName(getwsCrLoginSvcSoap12WSDDServiceName());
                return _stub;
            }
            if (co.com.compuredes.partners.mcafee.WsCrLoginSvcSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                co.com.compuredes.partners.mcafee.WsCrLoginSvcSoapStub _stub = new co.com.compuredes.partners.mcafee.WsCrLoginSvcSoapStub(new java.net.URL(wsCrLoginSvcSoap_address), this);
                _stub.setPortName(getwsCrLoginSvcSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("wsCrLoginSvcSoap12".equals(inputPortName)) {
            return getwsCrLoginSvcSoap12();
        }
        else if ("wsCrLoginSvcSoap".equals(inputPortName)) {
            return getwsCrLoginSvcSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("https://partners.compuredes.com.co/mcafee", "wsCrLoginSvc");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("https://partners.compuredes.com.co/mcafee", "wsCrLoginSvcSoap12"));
            ports.add(new javax.xml.namespace.QName("https://partners.compuredes.com.co/mcafee", "wsCrLoginSvcSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("wsCrLoginSvcSoap12".equals(portName)) {
            setwsCrLoginSvcSoap12EndpointAddress(address);
        }
        else 
if ("wsCrLoginSvcSoap".equals(portName)) {
            setwsCrLoginSvcSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
