/**
 * TvCableIntegrationServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.app.tvp.cas.cliente;

public class TvCableIntegrationServiceLocator extends org.apache.axis.client.Service implements com.app.tvp.cas.cliente.TvCableIntegrationService {

    public TvCableIntegrationServiceLocator() {
    }


    public TvCableIntegrationServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TvCableIntegrationServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_ITvCableIntegrationService
    //private java.lang.String BasicHttpBinding_ITvCableIntegrationService_address = "http://ns.bayteq.com:8090/TvCableIntegrationService.svc";
    private java.lang.String BasicHttpBinding_ITvCableIntegrationService_address = "http://192.168.21.191:8090/TvCableIntegrationService.svc";

    public java.lang.String getBasicHttpBinding_ITvCableIntegrationServiceAddress() {
        return BasicHttpBinding_ITvCableIntegrationService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_ITvCableIntegrationServiceWSDDServiceName = "BasicHttpBinding_ITvCableIntegrationService";

    public java.lang.String getBasicHttpBinding_ITvCableIntegrationServiceWSDDServiceName() {
        return BasicHttpBinding_ITvCableIntegrationServiceWSDDServiceName;
    }

    public void setBasicHttpBinding_ITvCableIntegrationServiceWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_ITvCableIntegrationServiceWSDDServiceName = name;
    }

    public com.app.tvp.cas.cliente.ITvCableIntegrationService getBasicHttpBinding_ITvCableIntegrationService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_ITvCableIntegrationService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_ITvCableIntegrationService(endpoint);
    }

    public com.app.tvp.cas.cliente.ITvCableIntegrationService getBasicHttpBinding_ITvCableIntegrationService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.app.tvp.cas.cliente.BasicHttpBinding_ITvCableIntegrationServiceStub _stub = new com.app.tvp.cas.cliente.BasicHttpBinding_ITvCableIntegrationServiceStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_ITvCableIntegrationServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_ITvCableIntegrationServiceEndpointAddress(java.lang.String address) {
        BasicHttpBinding_ITvCableIntegrationService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.app.tvp.cas.cliente.ITvCableIntegrationService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.app.tvp.cas.cliente.BasicHttpBinding_ITvCableIntegrationServiceStub _stub = new com.app.tvp.cas.cliente.BasicHttpBinding_ITvCableIntegrationServiceStub(new java.net.URL(BasicHttpBinding_ITvCableIntegrationService_address), this);
                _stub.setPortName(getBasicHttpBinding_ITvCableIntegrationServiceWSDDServiceName());
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
        if ("BasicHttpBinding_ITvCableIntegrationService".equals(inputPortName)) {
            return getBasicHttpBinding_ITvCableIntegrationService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "TvCableIntegrationService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "BasicHttpBinding_ITvCableIntegrationService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_ITvCableIntegrationService".equals(portName)) {
            setBasicHttpBinding_ITvCableIntegrationServiceEndpointAddress(address);
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
