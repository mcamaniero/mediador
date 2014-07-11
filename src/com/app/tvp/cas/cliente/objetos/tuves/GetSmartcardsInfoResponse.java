/**
 * GetSmartcardsInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.app.tvp.cas.cliente.objetos.tuves;

public class GetSmartcardsInfoResponse  implements java.io.Serializable {
    private com.app.tvp.cas.cliente.PropertyChangedEventHandler propertyChanged;

    private java.lang.String returnField;

    private com.app.tvp.cas.cliente.objetos.tuves.InfoType[] smartCardInfoField;

    public GetSmartcardsInfoResponse() {
    }

    public GetSmartcardsInfoResponse(
           com.app.tvp.cas.cliente.PropertyChangedEventHandler propertyChanged,
           java.lang.String returnField,
           com.app.tvp.cas.cliente.objetos.tuves.InfoType[] smartCardInfoField) {
           this.propertyChanged = propertyChanged;
           this.returnField = returnField;
           this.smartCardInfoField = smartCardInfoField;
    }


    /**
     * Gets the propertyChanged value for this GetSmartcardsInfoResponse.
     * 
     * @return propertyChanged
     */
    public com.app.tvp.cas.cliente.PropertyChangedEventHandler getPropertyChanged() {
        return propertyChanged;
    }


    /**
     * Sets the propertyChanged value for this GetSmartcardsInfoResponse.
     * 
     * @param propertyChanged
     */
    public void setPropertyChanged(com.app.tvp.cas.cliente.PropertyChangedEventHandler propertyChanged) {
        this.propertyChanged = propertyChanged;
    }


    /**
     * Gets the returnField value for this GetSmartcardsInfoResponse.
     * 
     * @return returnField
     */
    public java.lang.String getReturnField() {
        return returnField;
    }


    /**
     * Sets the returnField value for this GetSmartcardsInfoResponse.
     * 
     * @param returnField
     */
    public void setReturnField(java.lang.String returnField) {
        this.returnField = returnField;
    }


    /**
     * Gets the smartCardInfoField value for this GetSmartcardsInfoResponse.
     * 
     * @return smartCardInfoField
     */
    public com.app.tvp.cas.cliente.objetos.tuves.InfoType[] getSmartCardInfoField() {
        return smartCardInfoField;
    }


    /**
     * Sets the smartCardInfoField value for this GetSmartcardsInfoResponse.
     * 
     * @param smartCardInfoField
     */
    public void setSmartCardInfoField(com.app.tvp.cas.cliente.objetos.tuves.InfoType[] smartCardInfoField) {
        this.smartCardInfoField = smartCardInfoField;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSmartcardsInfoResponse)) return false;
        GetSmartcardsInfoResponse other = (GetSmartcardsInfoResponse) obj;
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
            ((this.returnField==null && other.getReturnField()==null) || 
             (this.returnField!=null &&
              this.returnField.equals(other.getReturnField()))) &&
            ((this.smartCardInfoField==null && other.getSmartCardInfoField()==null) || 
             (this.smartCardInfoField!=null &&
              java.util.Arrays.equals(this.smartCardInfoField, other.getSmartCardInfoField())));
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
        if (getReturnField() != null) {
            _hashCode += getReturnField().hashCode();
        }
        if (getSmartCardInfoField() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSmartCardInfoField());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSmartCardInfoField(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSmartcardsInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service.WRTuvesService", "getSmartcardsInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyChanged");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service.WRTuvesService", "PropertyChanged"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.ComponentModel", "PropertyChangedEventHandler"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service.WRTuvesService", "returnField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smartCardInfoField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service.WRTuvesService", "smartCardInfoField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service.WRTuvesService", "InfoType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service.WRTuvesService", "InfoType"));
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
