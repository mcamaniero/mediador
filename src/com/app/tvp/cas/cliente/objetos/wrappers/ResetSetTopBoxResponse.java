/**
 * ResetSetTopBoxResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.app.tvp.cas.cliente.objetos.wrappers;

public class ResetSetTopBoxResponse  implements java.io.Serializable {
    private com.app.tvp.cas.cliente.objetos.ResetSetTopBoxResponse resetSetTopBoxResult;

    public ResetSetTopBoxResponse() {
    }

    public ResetSetTopBoxResponse(
           com.app.tvp.cas.cliente.objetos.ResetSetTopBoxResponse resetSetTopBoxResult) {
           this.resetSetTopBoxResult = resetSetTopBoxResult;
    }


    /**
     * Gets the resetSetTopBoxResult value for this ResetSetTopBoxResponse.
     * 
     * @return resetSetTopBoxResult
     */
    public com.app.tvp.cas.cliente.objetos.ResetSetTopBoxResponse getResetSetTopBoxResult() {
        return resetSetTopBoxResult;
    }


    /**
     * Sets the resetSetTopBoxResult value for this ResetSetTopBoxResponse.
     * 
     * @param resetSetTopBoxResult
     */
    public void setResetSetTopBoxResult(com.app.tvp.cas.cliente.objetos.ResetSetTopBoxResponse resetSetTopBoxResult) {
        this.resetSetTopBoxResult = resetSetTopBoxResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResetSetTopBoxResponse)) return false;
        ResetSetTopBoxResponse other = (ResetSetTopBoxResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resetSetTopBoxResult==null && other.getResetSetTopBoxResult()==null) || 
             (this.resetSetTopBoxResult!=null &&
              this.resetSetTopBoxResult.equals(other.getResetSetTopBoxResult())));
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
        if (getResetSetTopBoxResult() != null) {
            _hashCode += getResetSetTopBoxResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResetSetTopBoxResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ResetSetTopBoxResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resetSetTopBoxResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ResetSetTopBoxResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service", "ResetSetTopBoxResponse"));
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
