/**
 * UpdateMenuPassResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.app.tvp.cas.cliente.objetos.wrappers;

public class UpdateMenuPassResponse  implements java.io.Serializable {
    private com.app.tvp.cas.cliente.objetos.UpdateMenuPassResponse updateMenuPassResult;

    public UpdateMenuPassResponse() {
    }

    public UpdateMenuPassResponse(
           com.app.tvp.cas.cliente.objetos.UpdateMenuPassResponse updateMenuPassResult) {
           this.updateMenuPassResult = updateMenuPassResult;
    }


    /**
     * Gets the updateMenuPassResult value for this UpdateMenuPassResponse.
     * 
     * @return updateMenuPassResult
     */
    public com.app.tvp.cas.cliente.objetos.UpdateMenuPassResponse getUpdateMenuPassResult() {
        return updateMenuPassResult;
    }


    /**
     * Sets the updateMenuPassResult value for this UpdateMenuPassResponse.
     * 
     * @param updateMenuPassResult
     */
    public void setUpdateMenuPassResult(com.app.tvp.cas.cliente.objetos.UpdateMenuPassResponse updateMenuPassResult) {
        this.updateMenuPassResult = updateMenuPassResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateMenuPassResponse)) return false;
        UpdateMenuPassResponse other = (UpdateMenuPassResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.updateMenuPassResult==null && other.getUpdateMenuPassResult()==null) || 
             (this.updateMenuPassResult!=null &&
              this.updateMenuPassResult.equals(other.getUpdateMenuPassResult())));
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
        if (getUpdateMenuPassResult() != null) {
            _hashCode += getUpdateMenuPassResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateMenuPassResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">UpdateMenuPassResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("updateMenuPassResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UpdateMenuPassResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service", "UpdateMenuPassResponse"));
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
