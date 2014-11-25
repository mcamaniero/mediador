/**
 * AddPacksResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.app.tvp.cas.cliente.objetos.wrappers;

public class AddPacksResponse  implements java.io.Serializable {
    private com.app.tvp.cas.cliente.objetos.AddPacksResponse addPacksResult;

    public AddPacksResponse() {
    }

    public AddPacksResponse(
           com.app.tvp.cas.cliente.objetos.AddPacksResponse addPacksResult) {
           this.addPacksResult = addPacksResult;
    }


    /**
     * Gets the addPacksResult value for this AddPacksResponse.
     * 
     * @return addPacksResult
     */
    public com.app.tvp.cas.cliente.objetos.AddPacksResponse getAddPacksResult() {
        return addPacksResult;
    }


    /**
     * Sets the addPacksResult value for this AddPacksResponse.
     * 
     * @param addPacksResult
     */
    public void setAddPacksResult(com.app.tvp.cas.cliente.objetos.AddPacksResponse addPacksResult) {
        this.addPacksResult = addPacksResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AddPacksResponse)) return false;
        AddPacksResponse other = (AddPacksResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.addPacksResult==null && other.getAddPacksResult()==null) || 
             (this.addPacksResult!=null &&
              this.addPacksResult.equals(other.getAddPacksResult())));
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
        if (getAddPacksResult() != null) {
            _hashCode += getAddPacksResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AddPacksResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">AddPacksResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addPacksResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AddPacksResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service", "AddPacksResponse"));
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
