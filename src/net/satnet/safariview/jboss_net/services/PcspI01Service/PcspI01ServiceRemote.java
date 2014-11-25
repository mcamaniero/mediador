/**
 * PcspI01ServiceRemote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.satnet.safariview.jboss_net.services.PcspI01Service;

public interface PcspI01ServiceRemote extends java.rmi.Remote {
    public com.packetcable.www.pcsp.i01.PcspObj[] get(com.packetcable.www.pcsp.i01.PcspArg[] args) throws java.rmi.RemoteException;
    public com.packetcable.www.pcsp.i01.PcspObj[] put(com.packetcable.www.pcsp.i01.PcspObj[] objs) throws java.rmi.RemoteException;
    public com.packetcable.www.pcsp.i01.PcspObj[] delete(com.packetcable.www.pcsp.i01.PcspArg[] args) throws java.rmi.RemoteException;
    public com.packetcable.www.pcsp.i01.PcspObj[] modify(com.packetcable.www.pcsp.i01.PcspObj[] objs) throws java.rmi.RemoteException;
    public com.packetcable.www.pcsp.i01.PcspObj[] auditMta(com.packetcable.www.pcsp.i01.PcspArg[] args) throws java.rmi.RemoteException;
    public int cmdStatus(boolean isCmd, int code, int subCode, java.lang.String vendorExtension) throws java.rmi.RemoteException;
    public java.lang.String test(java.lang.String string_1) throws java.rmi.RemoteException;
    public com.cedarpointcom.safariview2.common.SVResponse makeRequest(com.cedarpointcom.safariview2.common.SVRequest in0) throws java.rmi.RemoteException;
    public java.lang.String login(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException;
    public void logout(java.lang.String in0) throws java.rmi.RemoteException;
}
