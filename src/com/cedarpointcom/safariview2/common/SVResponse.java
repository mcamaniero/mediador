/**
 * SVResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cedarpointcom.safariview2.common;

public class SVResponse  implements java.io.Serializable {
    private java.lang.String statusString;

    private java.lang.Object payload;

    private java.lang.String message;

    private int status;

    private com.cedarpointcom.safariview2.common.DeviceInfo deviceInfo;

    public SVResponse() {
    }

    public SVResponse(
           java.lang.String statusString,
           java.lang.Object payload,
           java.lang.String message,
           int status,
           com.cedarpointcom.safariview2.common.DeviceInfo deviceInfo) {
           this.statusString = statusString;
           this.payload = payload;
           this.message = message;
           this.status = status;
           this.deviceInfo = deviceInfo;
    }


    /**
     * Gets the statusString value for this SVResponse.
     * 
     * @return statusString
     */
    public java.lang.String getStatusString() {
        return statusString;
    }


    /**
     * Sets the statusString value for this SVResponse.
     * 
     * @param statusString
     */
    public void setStatusString(java.lang.String statusString) {
        this.statusString = statusString;
    }


    /**
     * Gets the payload value for this SVResponse.
     * 
     * @return payload
     */
    public java.lang.Object getPayload() {
        return payload;
    }


    /**
     * Sets the payload value for this SVResponse.
     * 
     * @param payload
     */
    public void setPayload(java.lang.Object payload) {
        this.payload = payload;
    }


    /**
     * Gets the message value for this SVResponse.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this SVResponse.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the status value for this SVResponse.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SVResponse.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the deviceInfo value for this SVResponse.
     * 
     * @return deviceInfo
     */
    public com.cedarpointcom.safariview2.common.DeviceInfo getDeviceInfo() {
        return deviceInfo;
    }


    /**
     * Sets the deviceInfo value for this SVResponse.
     * 
     * @param deviceInfo
     */
    public void setDeviceInfo(com.cedarpointcom.safariview2.common.DeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SVResponse)) return false;
        SVResponse other = (SVResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.statusString==null && other.getStatusString()==null) || 
             (this.statusString!=null &&
              this.statusString.equals(other.getStatusString()))) &&
            ((this.payload==null && other.getPayload()==null) || 
             (this.payload!=null &&
              this.payload.equals(other.getPayload()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            this.status == other.getStatus() &&
            ((this.deviceInfo==null && other.getDeviceInfo()==null) || 
             (this.deviceInfo!=null &&
              this.deviceInfo.equals(other.getDeviceInfo())));
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
        if (getStatusString() != null) {
            _hashCode += getStatusString().hashCode();
        }
        if (getPayload() != null) {
            _hashCode += getPayload().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        _hashCode += getStatus();
        if (getDeviceInfo() != null) {
            _hashCode += getDeviceInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SVResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://common.safariview2.cedarpointcom.com", "SVResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payload");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payload"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://common.safariview2.cedarpointcom.com", "DeviceInfo"));
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
