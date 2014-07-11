/**
 * InfoType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.app.tvp.cas.cliente.objetos.tuves;

public class InfoType  implements java.io.Serializable {
    private com.app.tvp.cas.cliente.PropertyChangedEventHandler propertyChanged;

    private java.lang.Double mastercardField;

    private com.app.tvp.cas.cliente.objetos.tuves.PackType[] packsField;

    private java.lang.String settopboxField;

    private double smartcardField;

    public InfoType() {
    }

    public InfoType(
           com.app.tvp.cas.cliente.PropertyChangedEventHandler propertyChanged,
           java.lang.Double mastercardField,
           com.app.tvp.cas.cliente.objetos.tuves.PackType[] packsField,
           java.lang.String settopboxField,
           double smartcardField) {
           this.propertyChanged = propertyChanged;
           this.mastercardField = mastercardField;
           this.packsField = packsField;
           this.settopboxField = settopboxField;
           this.smartcardField = smartcardField;
    }


    /**
     * Gets the propertyChanged value for this InfoType.
     * 
     * @return propertyChanged
     */
    public com.app.tvp.cas.cliente.PropertyChangedEventHandler getPropertyChanged() {
        return propertyChanged;
    }


    /**
     * Sets the propertyChanged value for this InfoType.
     * 
     * @param propertyChanged
     */
    public void setPropertyChanged(com.app.tvp.cas.cliente.PropertyChangedEventHandler propertyChanged) {
        this.propertyChanged = propertyChanged;
    }


    /**
     * Gets the mastercardField value for this InfoType.
     * 
     * @return mastercardField
     */
    public java.lang.Double getMastercardField() {
        return mastercardField;
    }


    /**
     * Sets the mastercardField value for this InfoType.
     * 
     * @param mastercardField
     */
    public void setMastercardField(java.lang.Double mastercardField) {
        this.mastercardField = mastercardField;
    }


    /**
     * Gets the packsField value for this InfoType.
     * 
     * @return packsField
     */
    public com.app.tvp.cas.cliente.objetos.tuves.PackType[] getPacksField() {
        return packsField;
    }


    /**
     * Sets the packsField value for this InfoType.
     * 
     * @param packsField
     */
    public void setPacksField(com.app.tvp.cas.cliente.objetos.tuves.PackType[] packsField) {
        this.packsField = packsField;
    }


    /**
     * Gets the settopboxField value for this InfoType.
     * 
     * @return settopboxField
     */
    public java.lang.String getSettopboxField() {
        return settopboxField;
    }


    /**
     * Sets the settopboxField value for this InfoType.
     * 
     * @param settopboxField
     */
    public void setSettopboxField(java.lang.String settopboxField) {
        this.settopboxField = settopboxField;
    }


    /**
     * Gets the smartcardField value for this InfoType.
     * 
     * @return smartcardField
     */
    public double getSmartcardField() {
        return smartcardField;
    }


    /**
     * Sets the smartcardField value for this InfoType.
     * 
     * @param smartcardField
     */
    public void setSmartcardField(double smartcardField) {
        this.smartcardField = smartcardField;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InfoType)) return false;
        InfoType other = (InfoType) obj;
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
            ((this.mastercardField==null && other.getMastercardField()==null) || 
             (this.mastercardField!=null &&
              this.mastercardField.equals(other.getMastercardField()))) &&
            ((this.packsField==null && other.getPacksField()==null) || 
             (this.packsField!=null &&
              java.util.Arrays.equals(this.packsField, other.getPacksField()))) &&
            ((this.settopboxField==null && other.getSettopboxField()==null) || 
             (this.settopboxField!=null &&
              this.settopboxField.equals(other.getSettopboxField()))) &&
            this.smartcardField == other.getSmartcardField();
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
        if (getMastercardField() != null) {
            _hashCode += getMastercardField().hashCode();
        }
        if (getPacksField() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPacksField());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPacksField(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSettopboxField() != null) {
            _hashCode += getSettopboxField().hashCode();
        }
        _hashCode += new Double(getSmartcardField()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InfoType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service.WRTuvesService", "InfoType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyChanged");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service.WRTuvesService", "PropertyChanged"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.ComponentModel", "PropertyChangedEventHandler"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mastercardField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service.WRTuvesService", "mastercardField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packsField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service.WRTuvesService", "packsField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service.WRTuvesService", "PackType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service.WRTuvesService", "PackType"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("settopboxField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service.WRTuvesService", "settopboxField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smartcardField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service.WRTuvesService", "smartcardField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
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
