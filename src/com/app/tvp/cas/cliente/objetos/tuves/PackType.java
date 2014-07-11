/**
 * PackType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.app.tvp.cas.cliente.objetos.tuves;

public class PackType  implements java.io.Serializable {
    private com.app.tvp.cas.cliente.PropertyChangedEventHandler propertyChanged;

    private boolean coreField;

    private java.lang.String nameField;

    public PackType() {
    }

    public PackType(
           com.app.tvp.cas.cliente.PropertyChangedEventHandler propertyChanged,
           boolean coreField,
           java.lang.String nameField) {
           this.propertyChanged = propertyChanged;
           this.coreField = coreField;
           this.nameField = nameField;
    }


    /**
     * Gets the propertyChanged value for this PackType.
     * 
     * @return propertyChanged
     */
    public com.app.tvp.cas.cliente.PropertyChangedEventHandler getPropertyChanged() {
        return propertyChanged;
    }


    /**
     * Sets the propertyChanged value for this PackType.
     * 
     * @param propertyChanged
     */
    public void setPropertyChanged(com.app.tvp.cas.cliente.PropertyChangedEventHandler propertyChanged) {
        this.propertyChanged = propertyChanged;
    }


    /**
     * Gets the coreField value for this PackType.
     * 
     * @return coreField
     */
    public boolean isCoreField() {
        return coreField;
    }


    /**
     * Sets the coreField value for this PackType.
     * 
     * @param coreField
     */
    public void setCoreField(boolean coreField) {
        this.coreField = coreField;
    }


    /**
     * Gets the nameField value for this PackType.
     * 
     * @return nameField
     */
    public java.lang.String getNameField() {
        return nameField;
    }


    /**
     * Sets the nameField value for this PackType.
     * 
     * @param nameField
     */
    public void setNameField(java.lang.String nameField) {
        this.nameField = nameField;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PackType)) return false;
        PackType other = (PackType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.propertyChanged==null && other.getPropertyChanged()==null) || 
             (this.propertyChanged!=null &&
              this.propertyChanged.equals(other.getPropertyChanged()))) &&
            this.coreField == other.isCoreField() &&
            ((this.nameField==null && other.getNameField()==null) || 
             (this.nameField!=null &&
              this.nameField.equals(other.getNameField())));
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
        if (getPropertyChanged() != null) {
            _hashCode += getPropertyChanged().hashCode();
        }
        _hashCode += (isCoreField() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getNameField() != null) {
            _hashCode += getNameField().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PackType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service.WRTuvesService", "PackType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyChanged");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service.WRTuvesService", "PropertyChanged"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.ComponentModel", "PropertyChangedEventHandler"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coreField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service.WRTuvesService", "coreField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service.WRTuvesService", "nameField"));
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
