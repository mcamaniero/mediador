/**
 * SendMessageResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.app.tvp.cas.cliente.objetos.wrappers;

public class SendMessageResponse  implements java.io.Serializable {
    private com.app.tvp.cas.cliente.objetos.SendMessageResponse sendMessageResult;

    public SendMessageResponse() {
    }

    public SendMessageResponse(
           com.app.tvp.cas.cliente.objetos.SendMessageResponse sendMessageResult) {
           this.sendMessageResult = sendMessageResult;
    }


    /**
     * Gets the sendMessageResult value for this SendMessageResponse.
     * 
     * @return sendMessageResult
     */
    public com.app.tvp.cas.cliente.objetos.SendMessageResponse getSendMessageResult() {
        return sendMessageResult;
    }


    /**
     * Sets the sendMessageResult value for this SendMessageResponse.
     * 
     * @param sendMessageResult
     */
    public void setSendMessageResult(com.app.tvp.cas.cliente.objetos.SendMessageResponse sendMessageResult) {
        this.sendMessageResult = sendMessageResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SendMessageResponse)) return false;
        SendMessageResponse other = (SendMessageResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sendMessageResult==null && other.getSendMessageResult()==null) || 
             (this.sendMessageResult!=null &&
              this.sendMessageResult.equals(other.getSendMessageResult())));
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
        if (getSendMessageResult() != null) {
            _hashCode += getSendMessageResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SendMessageResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">SendMessageResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendMessageResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SendMessageResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service", "SendMessageResponse"));
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
