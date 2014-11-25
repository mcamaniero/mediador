/**
 * SVConfigServiceRemote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.satnet.safariview.jboss_net.services.SVConfigService;

public interface SVConfigServiceRemote extends java.rmi.Remote {
    public com.cedarpointcom.www.SVConfigService.SVConfigResp sendRequest(com.cedarpointcom.safariview2.server.oss.config.SVConfigRequest in0) throws java.rmi.RemoteException;
    public java.lang.String test(java.lang.String in0) throws java.rmi.RemoteException;
    public java.lang.String login(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException;
    public void logout(java.lang.String in0) throws java.rmi.RemoteException;
}
