/**
 * RebootSetTopBoxResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.app.tvp.cas.cliente.objetos.wrappers;

public class RebootSetTopBoxResponse  implements java.io.Serializable {
    private com.app.tvp.cas.cliente.objetos.RebootSetTopBoxResponse rebootSetTopBoxResult;

    public RebootSetTopBoxResponse() {
    }

    public RebootSetTopBoxResponse(
           com.app.tvp.cas.cliente.objetos.RebootSetTopBoxResponse rebootSetTopBoxResult) {
           this.rebootSetTopBoxResult = rebootSetTopBoxResult;
    }


    /**
     * Gets the rebootSetTopBoxResult value for this RebootSetTopBoxResponse.
     * 
     * @return rebootSetTopBoxResult
     */
    public com.app.tvp.cas.cliente.objetos.RebootSetTopBoxResponse getRebootSetTopBoxResult() {
        return rebootSetTopBoxResult;
    }


    /**
     * Sets the rebootSetTopBoxResult value for this RebootSetTopBoxResponse.
     * 
     * @param rebootSetTopBoxResult
     */
    public void setRebootSetTopBoxResult(com.app.tvp.cas.cliente.objetos.RebootSetTopBoxResponse rebootSetTopBoxResult) {
        this.rebootSetTopBoxResult = rebootSetTopBoxResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RebootSetTopBoxResponse)) return false;
        RebootSetTopBoxResponse other = (RebootSetTopBoxResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rebootSetTopBoxResult==null && other.getRebootSetTopBoxResult()==null) || 
             (this.rebootSetTopBoxResult!=null &&
              this.rebootSetTopBoxResult.equals(other.getRebootSetTopBoxResult())));
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
        if (getRebootSetTopBoxResult() != null) {
            _hashCode += getRebootSetTopBoxResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RebootSetTopBoxResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">RebootSetTopBoxResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rebootSetTopBoxResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RebootSetTopBoxResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service", "RebootSetTopBoxResponse"));
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
