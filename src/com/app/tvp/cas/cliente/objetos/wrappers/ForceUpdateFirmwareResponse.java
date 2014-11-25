/**
 * ForceUpdateFirmwareResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.app.tvp.cas.cliente.objetos.wrappers;

public class ForceUpdateFirmwareResponse  implements java.io.Serializable {
    private com.app.tvp.cas.cliente.objetos.ForceUpdateFirmwareResponse forceUpdateFirmwareResult;

    public ForceUpdateFirmwareResponse() {
    }

    public ForceUpdateFirmwareResponse(
           com.app.tvp.cas.cliente.objetos.ForceUpdateFirmwareResponse forceUpdateFirmwareResult) {
           this.forceUpdateFirmwareResult = forceUpdateFirmwareResult;
    }


    /**
     * Gets the forceUpdateFirmwareResult value for this ForceUpdateFirmwareResponse.
     * 
     * @return forceUpdateFirmwareResult
     */
    public com.app.tvp.cas.cliente.objetos.ForceUpdateFirmwareResponse getForceUpdateFirmwareResult() {
        return forceUpdateFirmwareResult;
    }


    /**
     * Sets the forceUpdateFirmwareResult value for this ForceUpdateFirmwareResponse.
     * 
     * @param forceUpdateFirmwareResult
     */
    public void setForceUpdateFirmwareResult(com.app.tvp.cas.cliente.objetos.ForceUpdateFirmwareResponse forceUpdateFirmwareResult) {
        this.forceUpdateFirmwareResult = forceUpdateFirmwareResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ForceUpdateFirmwareResponse)) return false;
        ForceUpdateFirmwareResponse other = (ForceUpdateFirmwareResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.forceUpdateFirmwareResult==null && other.getForceUpdateFirmwareResult()==null) || 
             (this.forceUpdateFirmwareResult!=null &&
              this.forceUpdateFirmwareResult.equals(other.getForceUpdateFirmwareResult())));
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
        if (getForceUpdateFirmwareResult() != null) {
            _hashCode += getForceUpdateFirmwareResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ForceUpdateFirmwareResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ForceUpdateFirmwareResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forceUpdateFirmwareResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ForceUpdateFirmwareResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service", "ForceUpdateFirmwareResponse"));
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
