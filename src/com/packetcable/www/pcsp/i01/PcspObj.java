/**
 * PcspObj.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.packetcable.www.pcsp.i01;

public class PcspObj  implements java.io.Serializable {
    private int cmdId;

    private int cmdStatus;

    private java.lang.String entityName;

    private java.lang.String errorMessage;

    private java.lang.String key;

    private java.lang.String token;

    private java.lang.String xmlEncoding;

    public PcspObj() {
    }

    public PcspObj(
           int cmdId,
           int cmdStatus,
           java.lang.String entityName,
           java.lang.String errorMessage,
           java.lang.String key,
           java.lang.String token,
           java.lang.String xmlEncoding) {
           this.cmdId = cmdId;
           this.cmdStatus = cmdStatus;
           this.entityName = entityName;
           this.errorMessage = errorMessage;
           this.key = key;
           this.token = token;
           this.xmlEncoding = xmlEncoding;
    }


    /**
     * Gets the cmdId value for this PcspObj.
     * 
     * @return cmdId
     */
    public int getCmdId() {
        return cmdId;
    }


    /**
     * Sets the cmdId value for this PcspObj.
     * 
     * @param cmdId
     */
    public void setCmdId(int cmdId) {
        this.cmdId = cmdId;
    }


    /**
     * Gets the cmdStatus value for this PcspObj.
     * 
     * @return cmdStatus
     */
    public int getCmdStatus() {
        return cmdStatus;
    }


    /**
     * Sets the cmdStatus value for this PcspObj.
     * 
     * @param cmdStatus
     */
    public void setCmdStatus(int cmdStatus) {
        this.cmdStatus = cmdStatus;
    }


    /**
     * Gets the entityName value for this PcspObj.
     * 
     * @return entityName
     */
    public java.lang.String getEntityName() {
        return entityName;
    }


    /**
     * Sets the entityName value for this PcspObj.
     * 
     * @param entityName
     */
    public void setEntityName(java.lang.String entityName) {
        this.entityName = entityName;
    }


    /**
     * Gets the errorMessage value for this PcspObj.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this PcspObj.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the key value for this PcspObj.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this PcspObj.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the token value for this PcspObj.
     * 
     * @return token
     */
    public java.lang.String getToken() {
        return token;
    }


    /**
     * Sets the token value for this PcspObj.
     * 
     * @param token
     */
    public void setToken(java.lang.String token) {
        this.token = token;
    }


    /**
     * Gets the xmlEncoding value for this PcspObj.
     * 
     * @return xmlEncoding
     */
    public java.lang.String getXmlEncoding() {
        return xmlEncoding;
    }


    /**
     * Sets the xmlEncoding value for this PcspObj.
     * 
     * @param xmlEncoding
     */
    public void setXmlEncoding(java.lang.String xmlEncoding) {
        this.xmlEncoding = xmlEncoding;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PcspObj)) return false;
        PcspObj other = (PcspObj) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.cmdId == other.getCmdId() &&
            this.cmdStatus == other.getCmdStatus() &&
            ((this.entityName==null && other.getEntityName()==null) || 
             (this.entityName!=null &&
              this.entityName.equals(other.getEntityName()))) &&
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage()))) &&
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.token==null && other.getToken()==null) || 
             (this.token!=null &&
              this.token.equals(other.getToken()))) &&
            ((this.xmlEncoding==null && other.getXmlEncoding()==null) || 
             (this.xmlEncoding!=null &&
              this.xmlEncoding.equals(other.getXmlEncoding())));
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
        _hashCode += getCmdId();
        _hashCode += getCmdStatus();
        if (getEntityName() != null) {
            _hashCode += getEntityName().hashCode();
        }
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getToken() != null) {
            _hashCode += getToken().hashCode();
        }
        if (getXmlEncoding() != null) {
            _hashCode += getXmlEncoding().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PcspObj.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.packetcable.com/pcsp/i01", "PcspObj"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmdId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmdId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmdStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmdStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("", "token"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlEncoding");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlEncoding"));
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
