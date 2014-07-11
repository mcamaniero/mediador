/**
 * SVConfigResp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cedarpointcom.www.SVConfigService;

public class SVConfigResp  implements java.io.Serializable {
    private java.lang.String addInfo;

    private java.lang.String message;

    private com.cedarpointcom.safariview2.server.oss.config.SVConfigDesc[] payload;

    private int status;

    private java.lang.String statusString;

    public SVConfigResp() {
    }

    public SVConfigResp(
           java.lang.String addInfo,
           java.lang.String message,
           com.cedarpointcom.safariview2.server.oss.config.SVConfigDesc[] payload,
           int status,
           java.lang.String statusString) {
           this.addInfo = addInfo;
           this.message = message;
           this.payload = payload;
           this.status = status;
           this.statusString = statusString;
    }


    /**
     * Gets the addInfo value for this SVConfigResp.
     * 
     * @return addInfo
     */
    public java.lang.String getAddInfo() {
        return addInfo;
    }


    /**
     * Sets the addInfo value for this SVConfigResp.
     * 
     * @param addInfo
     */
    public void setAddInfo(java.lang.String addInfo) {
        this.addInfo = addInfo;
    }


    /**
     * Gets the message value for this SVConfigResp.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this SVConfigResp.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the payload value for this SVConfigResp.
     * 
     * @return payload
     */
    public com.cedarpointcom.safariview2.server.oss.config.SVConfigDesc[] getPayload() {
        return payload;
    }


    /**
     * Sets the payload value for this SVConfigResp.
     * 
     * @param payload
     */
    public void setPayload(com.cedarpointcom.safariview2.server.oss.config.SVConfigDesc[] payload) {
        this.payload = payload;
    }


    /**
     * Gets the status value for this SVConfigResp.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SVConfigResp.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the statusString value for this SVConfigResp.
     * 
     * @return statusString
     */
    public java.lang.String getStatusString() {
        return statusString;
    }


    /**
     * Sets the statusString value for this SVConfigResp.
     * 
     * @param statusString
     */
    public void setStatusString(java.lang.String statusString) {
        this.statusString = statusString;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SVConfigResp)) return false;
        SVConfigResp other = (SVConfigResp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addInfo==null && other.getAddInfo()==null) || 
             (this.addInfo!=null &&
              this.addInfo.equals(other.getAddInfo()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.payload==null && other.getPayload()==null) || 
             (this.payload!=null &&
              java.util.Arrays.equals(this.payload, other.getPayload()))) &&
            this.status == other.getStatus() &&
            ((this.statusString==null && other.getStatusString()==null) || 
             (this.statusString!=null &&
              this.statusString.equals(other.getStatusString())));
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
        if (getAddInfo() != null) {
            _hashCode += getAddInfo().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getPayload() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayload());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayload(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getStatus();
        if (getStatusString() != null) {
            _hashCode += getStatusString().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SVConfigResp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.cedarpointcom.com/SVConfigService", "SVConfigResp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payload");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payload"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://config.oss.server.safariview2.cedarpointcom.com", "SVConfigDesc"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statusString"));
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
