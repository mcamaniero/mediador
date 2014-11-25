/**
 * RemovePacksResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.app.tvp.cas.cliente.objetos.wrappers;

public class RemovePacksResponse  implements java.io.Serializable {
    private com.app.tvp.cas.cliente.objetos.RemovePacksResponse removePacksResult;

    public RemovePacksResponse() {
    }

    public RemovePacksResponse(
           com.app.tvp.cas.cliente.objetos.RemovePacksResponse removePacksResult) {
           this.removePacksResult = removePacksResult;
    }


    /**
     * Gets the removePacksResult value for this RemovePacksResponse.
     * 
     * @return removePacksResult
     */
    public com.app.tvp.cas.cliente.objetos.RemovePacksResponse getRemovePacksResult() {
        return removePacksResult;
    }


    /**
     * Sets the removePacksResult value for this RemovePacksResponse.
     * 
     * @param removePacksResult
     */
    public void setRemovePacksResult(com.app.tvp.cas.cliente.objetos.RemovePacksResponse removePacksResult) {
        this.removePacksResult = removePacksResult;
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
        _equals = true && 
            ((this.removePacksResult==null && other.getRemovePacksResult()==null) || 
             (this.removePacksResult!=null &&
              this.removePacksResult.equals(other.getRemovePacksResult())));
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
        if (getRemovePacksResult() != null) {
            _hashCode += getRemovePacksResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemovePacksResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">RemovePacksResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removePacksResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RemovePacksResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service", "RemovePacksResponse"));
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
