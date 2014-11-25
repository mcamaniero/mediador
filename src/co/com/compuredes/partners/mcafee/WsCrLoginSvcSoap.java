/**
 * WsCrLoginSvcSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package co.com.compuredes.partners.mcafee;

public interface WsCrLoginSvcSoap extends java.rmi.Remote {

    /**
     * Metodo para el login, tipo 1 = CONSUMER, tipo 2 = TOP
     */
    public java.lang.String wmCreateSession(int tipoLogin) throws java.rmi.RemoteException;
}
