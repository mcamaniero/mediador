/**
 * GetInformationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.app.tvp.cas.cliente.objetos.tuves;

public class GetInformationResponse  implements java.io.Serializable {
    private com.app.tvp.cas.cliente.PropertyChangedEventHandler propertyChanged;

    private java.lang.String answerField;

    private com.app.tvp.cas.cliente.objetos.tuves.InformationType informationField;

    private int returnField;

    public GetInformationResponse() {
    }

    public GetInformationResponse(
           com.app.tvp.cas.cliente.PropertyChangedEventHandler propertyChanged,
           java.lang.String answerField,
           com.app.tvp.cas.cliente.objetos.tuves.InformationType informationField,
           int returnField) {
           this.propertyChanged = propertyChanged;
           this.answerField = answerField;
           this.informationField = informationField;
           this.returnField = returnField;
    }


    /**
     * Gets the propertyChanged value for this GetInformationResponse.
     * 
     * @return propertyChanged
     */
    public com.app.tvp.cas.cliente.PropertyChangedEventHandler getPropertyChanged() {
        return propertyChanged;
    }


    /**
     * Sets the propertyChanged value for this GetInformationResponse.
     * 
     * @param propertyChanged
     */
    public void setPropertyChanged(com.app.tvp.cas.cliente.PropertyChangedEventHandler propertyChanged) {
        this.propertyChanged = propertyChanged;
    }


    /**
     * Gets the answerField value for this GetInformationResponse.
     * 
     * @return answerField
     */
    public java.lang.String getAnswerField() {
        return answerField;
    }


    /**
     * Sets the answerField value for this GetInformationResponse.
     * 
     * @param answerField
     */
    public void setAnswerField(java.lang.String answerField) {
        this.answerField = answerField;
    }


    /**
     * Gets the informationField value for this GetInformationResponse.
     * 
     * @return informationField
     */
    public com.app.tvp.cas.cliente.objetos.tuves.InformationType getInformationField() {
        return informationField;
    }


    /**
     * Sets the informationField value for this GetInformationResponse.
     * 
     * @param informationField
     */
    public void setInformationField(com.app.tvp.cas.cliente.objetos.tuves.InformationType informationField) {
        this.informationField = informationField;
    }


    /**
     * Gets the returnField value for this GetInformationResponse.
     * 
     * @return returnField
     */
    public int getReturnField() {
        return returnField;
    }


    /**
     * Sets the returnField value for this GetInformationResponse.
     * 
     * @param returnField
     */
    public void setReturnField(int returnField) {
        this.returnField = returnField;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetInformationResponse)) return false;
        GetInformationResponse other = (GetInformationResponse) obj;
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
            ((this.answerField==null && other.getAnswerField()==null) || 
             (this.answerField!=null &&
              this.answerField.equals(other.getAnswerField()))) &&
            ((this.informationField==null && other.getInformationField()==null) || 
             (this.informationField!=null &&
              this.informationField.equals(other.getInformationField()))) &&
            this.returnField == other.getReturnField();
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
        if (getAnswerField() != null) {
            _hashCode += getAnswerField().hashCode();
        }
        if (getInformationField() != null) {
            _hashCode += getInformationField().hashCode();
        }
        _hashCode += getReturnField();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetInformationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service.WRTuvesService", "getInformationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyChanged");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service.WRTuvesService", "PropertyChanged"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/System.ComponentModel", "PropertyChangedEventHandler"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("answerField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service.WRTuvesService", "answerField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("informationField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service.WRTuvesService", "informationField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service.WRTuvesService", "InformationType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service.WRTuvesService", "returnField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
