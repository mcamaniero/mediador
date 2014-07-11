/**
 * PcspArg.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.packetcable.www.pcsp.i01;

public class PcspArg  implements java.io.Serializable {
    private int cmdId;

    private java.lang.String cmsAddress;

    private java.lang.String entityName;

    private int flags;

    private java.lang.String key;

    private java.lang.String keyType;

    private java.lang.String token;

    public PcspArg() {
    }

    public PcspArg(
           int cmdId,
           java.lang.String cmsAddress,
           java.lang.String entityName,
           int flags,
           java.lang.String key,
           java.lang.String keyType,
           java.lang.String token) {
           this.cmdId = cmdId;
           this.cmsAddress = cmsAddress;
           this.entityName = entityName;
           this.flags = flags;
           this.key = key;
           this.keyType = keyType;
           this.token = token;
    }


    /**
     * Gets the cmdId value for this PcspArg.
     * 
     * @return cmdId
     */
    public int getCmdId() {
        return cmdId;
    }


    /**
     * Sets the cmdId value for this PcspArg.
     * 
     * @param cmdId
     */
    public void setCmdId(int cmdId) {
        this.cmdId = cmdId;
    }


    /**
     * Gets the cmsAddress value for this PcspArg.
     * 
     * @return cmsAddress
     */
    public java.lang.String getCmsAddress() {
        return cmsAddress;
    }


    /**
     * Sets the cmsAddress value for this PcspArg.
     * 
     * @param cmsAddress
     */
    public void setCmsAddress(java.lang.String cmsAddress) {
        this.cmsAddress = cmsAddress;
    }


    /**
     * Gets the entityName value for this PcspArg.
     * 
     * @return entityName
     */
    public java.lang.String getEntityName() {
        return entityName;
    }


    /**
     * Sets the entityName value for this PcspArg.
     * 
     * @param entityName
     */
    public void setEntityName(java.lang.String entityName) {
        this.entityName = entityName;
    }


    /**
     * Gets the flags value for this PcspArg.
     * 
     * @return flags
     */
    public int getFlags() {
        return flags;
    }


    /**
     * Sets the flags value for this PcspArg.
     * 
     * @param flags
     */
    public void setFlags(int flags) {
        this.flags = flags;
    }


    /**
     * Gets the key value for this PcspArg.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this PcspArg.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the keyType value for this PcspArg.
     * 
     * @return keyType
     */
    public java.lang.String getKeyType() {
        return keyType;
    }


    /**
     * Sets the keyType value for this PcspArg.
     * 
     * @param keyType
     */
    public void setKeyType(java.lang.String keyType) {
        this.keyType = keyType;
    }


    /**
     * Gets the token value for this PcspArg.
     * 
     * @return token
     */
    public java.lang.String getToken() {
        return token;
    }


    /**
     * Sets the token value for this PcspArg.
     * 
     * @param token
     */
    public void setToken(java.lang.String token) {
        this.token = token;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PcspArg)) return false;
        PcspArg other = (PcspArg) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.cmdId == other.getCmdId() &&
            ((this.cmsAddress==null && other.getCmsAddress()==null) || 
             (this.cmsAddress!=null &&
              this.cmsAddress.equals(other.getCmsAddress()))) &&
            ((this.entityName==null && other.getEntityName()==null) || 
             (this.entityName!=null &&
              this.entityName.equals(other.getEntityName()))) &&
            this.flags == other.getFlags() &&
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.keyType==null && other.getKeyType()==null) || 
             (this.keyType!=null &&
              this.keyType.equals(other.getKeyType()))) &&
            ((this.token==null && other.getToken()==null) || 
             (this.token!=null &&
              this.token.equals(other.getToken())));
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
        if (getCmsAddress() != null) {
            _hashCode += getCmsAddress().hashCode();
        }
        if (getEntityName() != null) {
            _hashCode += getEntityName().hashCode();
        }
        _hashCode += getFlags();
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getKeyType() != null) {
            _hashCode += getKeyType().hashCode();
        }
        if (getToken() != null) {
            _hashCode += getToken().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PcspArg.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.packetcable.com/pcsp/i01", "PcspArg"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmdId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmdId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmsAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmsAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entityName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("", "key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "keyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("token");
        elemField.setXmlName(new javax.xml.namespace.QName("", "token"));
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
