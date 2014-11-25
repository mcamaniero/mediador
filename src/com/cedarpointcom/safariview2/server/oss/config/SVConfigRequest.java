/**
 * SVConfigRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cedarpointcom.safariview2.server.oss.config;

public class SVConfigRequest  implements java.io.Serializable {
    private java.lang.String action;

    private java.lang.String cmsIPAddr;

    private com.cedarpointcom.safariview2.server.oss.config.SVConfigDesc configDesc;

    private java.lang.String sessionToken;

    public SVConfigRequest() {
    }

    public SVConfigRequest(
           java.lang.String action,
           java.lang.String cmsIPAddr,
           com.cedarpointcom.safariview2.server.oss.config.SVConfigDesc configDesc,
           java.lang.String sessionToken) {
           this.action = action;
           this.cmsIPAddr = cmsIPAddr;
           this.configDesc = configDesc;
           this.sessionToken = sessionToken;
    }


    /**
     * Gets the action value for this SVConfigRequest.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this SVConfigRequest.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }


    /**
     * Gets the cmsIPAddr value for this SVConfigRequest.
     * 
     * @return cmsIPAddr
     */
    public java.lang.String getCmsIPAddr() {
        return cmsIPAddr;
    }


    /**
     * Sets the cmsIPAddr value for this SVConfigRequest.
     * 
     * @param cmsIPAddr
     */
    public void setCmsIPAddr(java.lang.String cmsIPAddr) {
        this.cmsIPAddr = cmsIPAddr;
    }


    /**
     * Gets the configDesc value for this SVConfigRequest.
     * 
     * @return configDesc
     */
    public com.cedarpointcom.safariview2.server.oss.config.SVConfigDesc getConfigDesc() {
        return configDesc;
    }


    /**
     * Sets the configDesc value for this SVConfigRequest.
     * 
     * @param configDesc
     */
    public void setConfigDesc(com.cedarpointcom.safariview2.server.oss.config.SVConfigDesc configDesc) {
        this.configDesc = configDesc;
    }


    /**
     * Gets the sessionToken value for this SVConfigRequest.
     * 
     * @return sessionToken
     */
    public java.lang.String getSessionToken() {
        return sessionToken;
    }


    /**
     * Sets the sessionToken value for this SVConfigRequest.
     * 
     * @param sessionToken
     */
    public void setSessionToken(java.lang.String sessionToken) {
        this.sessionToken = sessionToken;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SVConfigRequest)) return false;
        SVConfigRequest other = (SVConfigRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.cmsIPAddr==null && other.getCmsIPAddr()==null) || 
             (this.cmsIPAddr!=null &&
              this.cmsIPAddr.equals(other.getCmsIPAddr()))) &&
            ((this.configDesc==null && other.getConfigDesc()==null) || 
             (this.configDesc!=null &&
              this.configDesc.equals(other.getConfigDesc()))) &&
            ((this.sessionToken==null && other.getSessionToken()==null) || 
             (this.sessionToken!=null &&
              this.sessionToken.equals(other.getSessionToken())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getCmsIPAddr() != null) {
            _hashCode += getCmsIPAddr().hashCode();
        }
        if (getConfigDesc() != null) {
            _hashCode += getConfigDesc().hashCode();
        }
        if (getSessionToken() != null) {
            _hashCode += getSessionToken().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SVConfigRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://config.oss.server.safariview2.cedarpointcom.com", "SVConfigRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmsIPAddr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmsIPAddr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("configDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "configDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://config.oss.server.safariview2.cedarpointcom.com", "SVConfigDesc"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionToken");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
