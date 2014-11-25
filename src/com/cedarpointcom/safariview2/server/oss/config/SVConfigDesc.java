/**
 * SVConfigDesc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cedarpointcom.safariview2.server.oss.config;

public class SVConfigDesc  implements java.io.Serializable {
    private com.cedarpointcom.safariview2.server.oss.config.SVAttribute[] attributes;

    private java.lang.String objType;

    public SVConfigDesc() {
    }

    public SVConfigDesc(
           com.cedarpointcom.safariview2.server.oss.config.SVAttribute[] attributes,
           java.lang.String objType) {
           this.attributes = attributes;
           this.objType = objType;
    }


    /**
     * Gets the attributes value for this SVConfigDesc.
     * 
     * @return attributes
     */
    public com.cedarpointcom.safariview2.server.oss.config.SVAttribute[] getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this SVConfigDesc.
     * 
     * @param attributes
     */
    public void setAttributes(com.cedarpointcom.safariview2.server.oss.config.SVAttribute[] attributes) {
        this.attributes = attributes;
    }


    /**
     * Gets the objType value for this SVConfigDesc.
     * 
     * @return objType
     */
    public java.lang.String getObjType() {
        return objType;
    }


    /**
     * Sets the objType value for this SVConfigDesc.
     * 
     * @param objType
     */
    public void setObjType(java.lang.String objType) {
        this.objType = objType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SVConfigDesc)) return false;
        SVConfigDesc other = (SVConfigDesc) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              java.util.Arrays.equals(this.attributes, other.getAttributes()))) &&
            ((this.objType==null && other.getObjType()==null) || 
             (this.objType!=null &&
              this.objType.equals(other.getObjType())));
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
        if (getAttributes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttributes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttributes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getObjType() != null) {
            _hashCode += getObjType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SVConfigDesc.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://config.oss.server.safariview2.cedarpointcom.com", "SVConfigDesc"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://config.oss.server.safariview2.cedarpointcom.com", "SVAttribute"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "objType"));
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
