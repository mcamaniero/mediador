/**
 * SettopboxType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.app.tvp.cas.cliente.objetos.tuves;

public class SettopboxType  implements java.io.Serializable {
    private com.app.tvp.cas.cliente.PropertyChangedEventHandler propertyChanged;

    private java.lang.String brandField;

    private java.lang.String codeField;

    private java.lang.String firmwareField;

    private java.lang.String modelField;

    public SettopboxType() {
    }

    public SettopboxType(
           com.app.tvp.cas.cliente.PropertyChangedEventHandler propertyChanged,
           java.lang.String brandField,
           java.lang.String codeField,
           java.lang.String firmwareField,
           java.lang.String modelField) {
           this.propertyChanged = propertyChanged;
           this.brandField = brandField;
           this.codeField = codeField;
           this.firmwareField = firmwareField;
           this.modelField = modelField;
    }


    /**
     * Gets the propertyChanged value for this SettopboxType.
     * 
     * @return propertyChanged
     */
    public com.app.tvp.cas.cliente.PropertyChangedEventHandler getPropertyChanged() {
        return propertyChanged;
    }


    /**
     * Sets the propertyChanged value for this SettopboxType.
     * 
     * @param propertyChanged
     */
    public void setPropertyChanged(com.app.tvp.cas.cliente.PropertyChangedEventHandler propertyChanged) {
        this.propertyChanged = propertyChanged;
    }


    /**
     * Gets the brandField value for this SettopboxType.
     * 
     * @return brandField
     */
    public java.lang.String getBrandField() {
        return brandField;
    }


    /**
     * Sets the brandField value for this SettopboxType.
     * 
     * @param brandField
     */
    public void setBrandField(java.lang.String brandField) {
        this.brandField = brandField;
    }


    /**
     * Gets the codeField value for this SettopboxType.
     * 
     * @return codeField
     */
    public java.lang.String getCodeField() {
        return codeField;
    }


    /**
     * Sets the codeField value for this SettopboxType.
     * 
     * @param codeField
     */
    public void setCodeField(java.lang.String codeField) {
        this.codeField = codeField;
    }


    /**
     * Gets the firmwareField value for this SettopboxType.
     * 
     * @return firmwareField
     */
    public java.lang.String getFirmwareField() {
        return firmwareField;
    }


    /**
     * Sets the firmwareField value for this SettopboxType.
     * 
     * @param firmwareField
     */
    public void setFirmwareField(java.lang.String firmwareField) {
        this.firmwareField = firmwareField;
    }


    /**
     * Gets the modelField value for this SettopboxType.
     * 
     * @return modelField
     */
    public java.lang.String getModelField() {
        return modelField;
    }


    /**
     * Sets the modelField value for this SettopboxType.
     * 
     * @param modelField
     */
    public void setModelField(java.lang.String modelField) {
        this.modelField = modelField;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SettopboxType)) return false;
        SettopboxType other = (SettopboxType) obj;
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
            ((this.brandField==null && other.getBrandField()==null) || 
             (this.brandField!=null &&
              this.brandField.equals(other.getBrandField()))) &&
            ((this.codeField==null && other.getCodeField()==null) || 
             (this.codeField!=null &&
              this.codeField.equals(other.getCodeField()))) &&
            ((this.firmwareField==null && other.getFirmwareField()==null) || 
             (this.firmwareField!=null &&
              this.firmwareField.equals(other.getFirmwareField()))) &&
            ((this.modelField==null && other.getModelField()==null) || 
             (this.modelField!=null &&
              this.modelField.equals(other.getModelField())));
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
        if (getBrandField() != null) {
            _hashCode += getBrandField().hashCode();
        }
        if (getCodeField() != null) {
            _hashCode += getCodeField().hashCode();
        }
        if (getFirmwareField() != null) {
            _hashCode += getFirmwareField().hashCode();
        }
        if (getModelField() != null) {
            _hashCode += getModelField().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SettopboxType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service.WRTuvesService", "SettopboxType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyChanged");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service.WRTuvesService", "PropertyChanged"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.ComponentModel", "PropertyChangedEventHandler"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("brandField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service.WRTuvesService", "brandField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service.WRTuvesService", "codeField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firmwareField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service.WRTuvesService", "firmwareField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service.WRTuvesService", "modelField"));
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
