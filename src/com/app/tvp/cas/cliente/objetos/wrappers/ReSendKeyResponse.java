/**
 * ReSendKeyResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.app.tvp.cas.cliente.objetos.wrappers;

public class ReSendKeyResponse  implements java.io.Serializable {
    private com.app.tvp.cas.cliente.objetos.ReSendKeyResponse reSendKeyResult;

    public ReSendKeyResponse() {
    }

    public ReSendKeyResponse(
           com.app.tvp.cas.cliente.objetos.ReSendKeyResponse reSendKeyResult) {
           this.reSendKeyResult = reSendKeyResult;
    }


    /**
     * Gets the reSendKeyResult value for this ReSendKeyResponse.
     * 
     * @return reSendKeyResult
     */
    public com.app.tvp.cas.cliente.objetos.ReSendKeyResponse getReSendKeyResult() {
        return reSendKeyResult;
    }


    /**
     * Sets the reSendKeyResult value for this ReSendKeyResponse.
     * 
     * @param reSendKeyResult
     */
    public void setReSendKeyResult(com.app.tvp.cas.cliente.objetos.ReSendKeyResponse reSendKeyResult) {
        this.reSendKeyResult = reSendKeyResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReSendKeyResponse)) return false;
        ReSendKeyResponse other = (ReSendKeyResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reSendKeyResult==null && other.getReSendKeyResult()==null) || 
             (this.reSendKeyResult!=null &&
              this.reSendKeyResult.equals(other.getReSendKeyResult())));
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
        if (getReSendKeyResult() != null) {
            _hashCode += getReSendKeyResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReSendKeyResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ReSendKeyResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reSendKeyResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReSendKeyResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service", "ReSendKeyResponse"));
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
