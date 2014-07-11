/**
 * RemovePacksResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.app.tvp.cas.cliente.objetos;

public class RemovePacksResponse  extends com.app.tvp.cas.cliente.objetos.ResponseWebTransaction  implements java.io.Serializable {
    private java.lang.String answer;

    private java.lang.String returnValue;

    public RemovePacksResponse() {
    }

    public RemovePacksResponse(
           java.lang.String resultCode,
           java.lang.String resultDescription,
           java.lang.String answer,
           java.lang.String returnValue) {
        super(
            resultCode,
            resultDescription);
        this.answer = answer;
        this.returnValue = returnValue;
    }


    /**
     * Gets the answer value for this RemovePacksResponse.
     * 
     * @return answer
     */
    public java.lang.String getAnswer() {
        return answer;
    }


    /**
     * Sets the answer value for this RemovePacksResponse.
     * 
     * @param answer
     */
    public void setAnswer(java.lang.String answer) {
        this.answer = answer;
    }


    /**
     * Gets the returnValue value for this RemovePacksResponse.
     * 
     * @return returnValue
     */
    public java.lang.String getReturnValue() {
        return returnValue;
    }


    /**
     * Sets the returnValue value for this RemovePacksResponse.
     * 
     * @param returnValue
     */
    public void setReturnValue(java.lang.String returnValue) {
        this.returnValue = returnValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemovePacksResponse)) return false;
        RemovePacksResponse other = (RemovePacksResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.answer==null && other.getAnswer()==null) || 
             (this.answer!=null &&
              this.answer.equals(other.getAnswer()))) &&
            ((this.returnValue==null && other.getReturnValue()==null) || 
             (this.returnValue!=null &&
              this.returnValue.equals(other.getReturnValue())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAnswer() != null) {
            _hashCode += getAnswer().hashCode();
        }
        if (getReturnValue() != null) {
            _hashCode += getReturnValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemovePacksResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service", "RemovePacksResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("answer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service", "Answer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service", "ReturnValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
