/**
 * PcspI01ServiceRemoteServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.satnet.safariview.jboss_net.services.PcspI01Service;

public class PcspI01ServiceRemoteServiceLocator extends org.apache.axis.client.Service implements net.satnet.safariview.jboss_net.services.PcspI01Service.PcspI01ServiceRemoteService {

    public PcspI01ServiceRemoteServiceLocator() {
    }


    public PcspI01ServiceRemoteServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PcspI01ServiceRemoteServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PcspI01Service
    private java.lang.String PcspI01Service_address = "https://safariview.satnet.net/jboss-net/services/PcspI01Service";

    public java.lang.String getPcspI01ServiceAddress() {
        return PcspI01Service_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PcspI01ServiceWSDDServiceName = "PcspI01Service";

    public java.lang.String getPcspI01ServiceWSDDServiceName() {
        return PcspI01ServiceWSDDServiceName;
    }

    public void setPcspI01ServiceWSDDServiceName(java.lang.String name) {
        PcspI01ServiceWSDDServiceName = name;
    }

    public net.satnet.safariview.jboss_net.services.PcspI01Service.PcspI01ServiceRemote getPcspI01Service() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PcspI01Service_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPcspI01Service(endpoint);
    }

    public net.satnet.safariview.jboss_net.services.PcspI01Service.PcspI01ServiceRemote getPcspI01Service(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            net.satnet.safariview.jboss_net.services.PcspI01Service.PcspI01ServiceSoapBindingStub _stub = new net.satnet.safariview.jboss_net.services.PcspI01Service.PcspI01ServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPcspI01ServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPcspI01ServiceEndpointAddress(java.lang.String address) {
        PcspI01Service_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (net.satnet.safariview.jboss_net.services.PcspI01Service.PcspI01ServiceRemote.class.isAssignableFrom(serviceEndpointInterface)) {
                net.satnet.safariview.jboss_net.services.PcspI01Service.PcspI01ServiceSoapBindingStub _stub = new net.satnet.safariview.jboss_net.services.PcspI01Service.PcspI01ServiceSoapBindingStub(new java.net.URL(PcspI01Service_address), this);
                _stub.setPortName(getPcspI01ServiceWSDDServiceName());
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
        if ("PcspI01Service".equals(inputPortName)) {
            return getPcspI01Service();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://safariview.satnet.net/jboss-net/services/PcspI01Service", "PcspI01ServiceRemoteService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://safariview.satnet.net/jboss-net/services/PcspI01Service", "PcspI01Service"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PcspI01Service".equals(portName)) {
            setPcspI01ServiceEndpointAddress(address);
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
