/**
 * EGetInformationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.app.tvp.cas.cliente.objetos;

public class EGetInformationResponse  extends com.app.tvp.cas.cliente.objetos.ResponseWebTransaction  implements java.io.Serializable {
    private com.app.tvp.cas.cliente.objetos.tuves.GetInformationResponse getInformationResponse;

    public EGetInformationResponse() {
    }

    public EGetInformationResponse(
           java.lang.String resultCode,
           java.lang.String resultDescription,
           com.app.tvp.cas.cliente.objetos.tuves.GetInformationResponse getInformationResponse) {
        super(
            resultCode,
            resultDescription);
        this.getInformationResponse = getInformationResponse;
    }


    /**
     * Gets the getInformationResponse value for this EGetInformationResponse.
     * 
     * @return getInformationResponse
     */
    public com.app.tvp.cas.cliente.objetos.tuves.GetInformationResponse getGetInformationResponse() {
        return getInformationResponse;
    }


    /**
     * Sets the getInformationResponse value for this EGetInformationResponse.
     * 
     * @param getInformationResponse
     */
    public void setGetInformationResponse(com.app.tvp.cas.cliente.objetos.tuves.GetInformationResponse getInformationResponse) {
        this.getInformationResponse = getInformationResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EGetInformationResponse)) return false;
        EGetInformationResponse other = (EGetInformationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.getInformationResponse==null && other.getGetInformationResponse()==null) || 
             (this.getInformationResponse!=null &&
              this.getInformationResponse.equals(other.getGetInformationResponse())));
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
        if (getGetInformationResponse() != null) {
            _hashCode += getGetInformationResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EGetInformationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service", "EGetInformationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getInformationResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service", "getInformationResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service.WRTuvesService", "getInformationResponse"));
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
