/**
 * SVRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cedarpointcom.safariview2.common;

public class SVRequest  implements java.io.Serializable {
    private java.lang.String sessionToken;

    private java.lang.String deviceId;

    private java.lang.String reqCategory;

    private java.lang.String reqType;

    private java.lang.String reqAction;

    private java.lang.Object payload;

    public SVRequest() {
    }

    public SVRequest(
           java.lang.String sessionToken,
           java.lang.String deviceId,
           java.lang.String reqCategory,
           java.lang.String reqType,
           java.lang.String reqAction,
           java.lang.Object payload) {
           this.sessionToken = sessionToken;
           this.deviceId = deviceId;
           this.reqCategory = reqCategory;
           this.reqType = reqType;
           this.reqAction = reqAction;
           this.payload = payload;
    }


    /**
     * Gets the sessionToken value for this SVRequest.
     * 
     * @return sessionToken
     */
    public java.lang.String getSessionToken() {
        return sessionToken;
    }


    /**
     * Sets the sessionToken value for this SVRequest.
     * 
     * @param sessionToken
     */
    public void setSessionToken(java.lang.String sessionToken) {
        this.sessionToken = sessionToken;
    }


    /**
     * Gets the deviceId value for this SVRequest.
     * 
     * @return deviceId
     */
    public java.lang.String getDeviceId() {
        return deviceId;
    }


    /**
     * Sets the deviceId value for this SVRequest.
     * 
     * @param deviceId
     */
    public void setDeviceId(java.lang.String deviceId) {
        this.deviceId = deviceId;
    }


    /**
     * Gets the reqCategory value for this SVRequest.
     * 
     * @return reqCategory
     */
    public java.lang.String getReqCategory() {
        return reqCategory;
    }


    /**
     * Sets the reqCategory value for this SVRequest.
     * 
     * @param reqCategory
     */
    public void setReqCategory(java.lang.String reqCategory) {
        this.reqCategory = reqCategory;
    }


    /**
     * Gets the reqType value for this SVRequest.
     * 
     * @return reqType
     */
    public java.lang.String getReqType() {
        return reqType;
    }


    /**
     * Sets the reqType value for this SVRequest.
     * 
     * @param reqType
     */
    public void setReqType(java.lang.String reqType) {
        this.reqType = reqType;
    }


    /**
     * Gets the reqAction value for this SVRequest.
     * 
     * @return reqAction
     */
    public java.lang.String getReqAction() {
        return reqAction;
    }


    /**
     * Sets the reqAction value for this SVRequest.
     * 
     * @param reqAction
     */
    public void setReqAction(java.lang.String reqAction) {
        this.reqAction = reqAction;
    }


    /**
     * Gets the payload value for this SVRequest.
     * 
     * @return payload
     */
    public java.lang.Object getPayload() {
        return payload;
    }


    /**
     * Sets the payload value for this SVRequest.
     * 
     * @param payload
     */
    public void setPayload(java.lang.Object payload) {
        this.payload = payload;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SVRequest)) return false;
        SVRequest other = (SVRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sessionToken==null && other.getSessionToken()==null) || 
             (this.sessionToken!=null &&
              this.sessionToken.equals(other.getSessionToken()))) &&
            ((this.deviceId==null && other.getDeviceId()==null) || 
             (this.deviceId!=null &&
              this.deviceId.equals(other.getDeviceId()))) &&
            ((this.reqCategory==null && other.getReqCategory()==null) || 
             (this.reqCategory!=null &&
              this.reqCategory.equals(other.getReqCategory()))) &&
            ((this.reqType==null && other.getReqType()==null) || 
             (this.reqType!=null &&
              this.reqType.equals(other.getReqType()))) &&
            ((this.reqAction==null && other.getReqAction()==null) || 
             (this.reqAction!=null &&
              this.reqAction.equals(other.getReqAction()))) &&
            ((this.payload==null && other.getPayload()==null) || 
             (this.payload!=null &&
              this.payload.equals(other.getPayload())));
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
        if (getSessionToken() != null) {
            _hashCode += getSessionToken().hashCode();
        }
        if (getDeviceId() != null) {
            _hashCode += getDeviceId().hashCode();
        }
        if (getReqCategory() != null) {
            _hashCode += getReqCategory().hashCode();
        }
        if (getReqType() != null) {
            _hashCode += getReqType().hashCode();
        }
        if (getReqAction() != null) {
            _hashCode += getReqAction().hashCode();
        }
        if (getPayload() != null) {
            _hashCode += getPayload().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SVRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://common.safariview2.cedarpointcom.com", "SVRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionToken");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reqCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reqCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reqType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reqType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reqAction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reqAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payload");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payload"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
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
