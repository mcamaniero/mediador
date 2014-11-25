/**
 * InformationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.app.tvp.cas.cliente.objetos.tuves;

public class InformationType  implements java.io.Serializable {
    private com.app.tvp.cas.cliente.PropertyChangedEventHandler propertyChanged;

    private java.lang.String dealerField;

    private java.lang.Double mastercardField;

    private java.lang.String[] packsField;

    private java.lang.String pinField;

    private com.app.tvp.cas.cliente.objetos.tuves.SettopboxType settopboxField;

    private double[] slavesmartcardsField;

    private double smartcardField;

    public InformationType() {
    }

    public InformationType(
           com.app.tvp.cas.cliente.PropertyChangedEventHandler propertyChanged,
           java.lang.String dealerField,
           java.lang.Double mastercardField,
           java.lang.String[] packsField,
           java.lang.String pinField,
           com.app.tvp.cas.cliente.objetos.tuves.SettopboxType settopboxField,
           double[] slavesmartcardsField,
           double smartcardField) {
           this.propertyChanged = propertyChanged;
           this.dealerField = dealerField;
           this.mastercardField = mastercardField;
           this.packsField = packsField;
           this.pinField = pinField;
           this.settopboxField = settopboxField;
           this.slavesmartcardsField = slavesmartcardsField;
           this.smartcardField = smartcardField;
    }


    /**
     * Gets the propertyChanged value for this InformationType.
     * 
     * @return propertyChanged
     */
    public com.app.tvp.cas.cliente.PropertyChangedEventHandler getPropertyChanged() {
        return propertyChanged;
    }


    /**
     * Sets the propertyChanged value for this InformationType.
     * 
     * @param propertyChanged
     */
    public void setPropertyChanged(com.app.tvp.cas.cliente.PropertyChangedEventHandler propertyChanged) {
        this.propertyChanged = propertyChanged;
    }


    /**
     * Gets the dealerField value for this InformationType.
     * 
     * @return dealerField
     */
    public java.lang.String getDealerField() {
        return dealerField;
    }


    /**
     * Sets the dealerField value for this InformationType.
     * 
     * @param dealerField
     */
    public void setDealerField(java.lang.String dealerField) {
        this.dealerField = dealerField;
    }


    /**
     * Gets the mastercardField value for this InformationType.
     * 
     * @return mastercardField
     */
    public java.lang.Double getMastercardField() {
        return mastercardField;
    }


    /**
     * Sets the mastercardField value for this InformationType.
     * 
     * @param mastercardField
     */
    public void setMastercardField(java.lang.Double mastercardField) {
        this.mastercardField = mastercardField;
    }


    /**
     * Gets the packsField value for this InformationType.
     * 
     * @return packsField
     */
    public java.lang.String[] getPacksField() {
        return packsField;
    }


    /**
     * Sets the packsField value for this InformationType.
     * 
     * @param packsField
     */
    public void setPacksField(java.lang.String[] packsField) {
        this.packsField = packsField;
    }


    /**
     * Gets the pinField value for this InformationType.
     * 
     * @return pinField
     */
    public java.lang.String getPinField() {
        return pinField;
    }


    /**
     * Sets the pinField value for this InformationType.
     * 
     * @param pinField
     */
    public void setPinField(java.lang.String pinField) {
        this.pinField = pinField;
    }


    /**
     * Gets the settopboxField value for this InformationType.
     * 
     * @return settopboxField
     */
    public com.app.tvp.cas.cliente.objetos.tuves.SettopboxType getSettopboxField() {
        return settopboxField;
    }


    /**
     * Sets the settopboxField value for this InformationType.
     * 
     * @param settopboxField
     */
    public void setSettopboxField(com.app.tvp.cas.cliente.objetos.tuves.SettopboxType settopboxField) {
        this.settopboxField = settopboxField;
    }


    /**
     * Gets the slavesmartcardsField value for this InformationType.
     * 
     * @return slavesmartcardsField
     */
    public double[] getSlavesmartcardsField() {
        return slavesmartcardsField;
    }


    /**
     * Sets the slavesmartcardsField value for this InformationType.
     * 
     * @param slavesmartcardsField
     */
    public void setSlavesmartcardsField(double[] slavesmartcardsField) {
        this.slavesmartcardsField = slavesmartcardsField;
    }


    /**
     * Gets the smartcardField value for this InformationType.
     * 
     * @return smartcardField
     */
    public double getSmartcardField() {
        return smartcardField;
    }


    /**
     * Sets the smartcardField value for this InformationType.
     * 
     * @param smartcardField
     */
    public void setSmartcardField(double smartcardField) {
        this.smartcardField = smartcardField;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InformationType)) return false;
        InformationType other = (InformationType) obj;
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
            ((this.dealerField==null && other.getDealerField()==null) || 
             (this.dealerField!=null &&
              this.dealerField.equals(other.getDealerField()))) &&
            ((this.mastercardField==null && other.getMastercardField()==null) || 
             (this.mastercardField!=null &&
              this.mastercardField.equals(other.getMastercardField()))) &&
            ((this.packsField==null && other.getPacksField()==null) || 
             (this.packsField!=null &&
              java.util.Arrays.equals(this.packsField, other.getPacksField()))) &&
            ((this.pinField==null && other.getPinField()==null) || 
             (this.pinField!=null &&
              this.pinField.equals(other.getPinField()))) &&
            ((this.settopboxField==null && other.getSettopboxField()==null) || 
             (this.settopboxField!=null &&
              this.settopboxField.equals(other.getSettopboxField()))) &&
            ((this.slavesmartcardsField==null && other.getSlavesmartcardsField()==null) || 
             (this.slavesmartcardsField!=null &&
              java.util.Arrays.equals(this.slavesmartcardsField, other.getSlavesmartcardsField()))) &&
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
        if (getDealerField() != null) {
            _hashCode += getDealerField().hashCode();
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
        if (getPinField() != null) {
            _hashCode += getPinField().hashCode();
        }
        if (getSettopboxField() != null) {
            _hashCode += getSettopboxField().hashCode();
        }
        if (getSlavesmartcardsField() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSlavesmartcardsField());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSlavesmartcardsField(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Double(getSmartcardField()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InformationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service.WRTuvesService", "InformationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyChanged");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service.WRTuvesService", "PropertyChanged"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.ComponentModel", "PropertyChangedEventHandler"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dealerField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service.WRTuvesService", "dealerField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pinField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service.WRTuvesService", "pinField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("settopboxField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service.WRTuvesService", "settopboxField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service.WRTuvesService", "SettopboxType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slavesmartcardsField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service.WRTuvesService", "slavesmartcardsField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "double"));
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
