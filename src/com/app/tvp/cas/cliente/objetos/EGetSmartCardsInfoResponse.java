/**
 * EGetSmartCardsInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.app.tvp.cas.cliente.objetos;

public class EGetSmartCardsInfoResponse  extends com.app.tvp.cas.cliente.objetos.ResponseWebTransaction  implements java.io.Serializable {
    private com.app.tvp.cas.cliente.objetos.tuves.GetSmartcardsInfoResponse getSmartcardsInfoResponse;

    public EGetSmartCardsInfoResponse() {
    }

    public EGetSmartCardsInfoResponse(
           java.lang.String resultCode,
           java.lang.String resultDescription,
           com.app.tvp.cas.cliente.objetos.tuves.GetSmartcardsInfoResponse getSmartcardsInfoResponse) {
        super(
            resultCode,
            resultDescription);
        this.getSmartcardsInfoResponse = getSmartcardsInfoResponse;
    }


    /**
     * Gets the getSmartcardsInfoResponse value for this EGetSmartCardsInfoResponse.
     * 
     * @return getSmartcardsInfoResponse
     */
    public com.app.tvp.cas.cliente.objetos.tuves.GetSmartcardsInfoResponse getGetSmartcardsInfoResponse() {
        return getSmartcardsInfoResponse;
    }


    /**
     * Sets the getSmartcardsInfoResponse value for this EGetSmartCardsInfoResponse.
     * 
     * @param getSmartcardsInfoResponse
     */
    public void setGetSmartcardsInfoResponse(com.app.tvp.cas.cliente.objetos.tuves.GetSmartcardsInfoResponse getSmartcardsInfoResponse) {
        this.getSmartcardsInfoResponse = getSmartcardsInfoResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EGetSmartCardsInfoResponse)) return false;
        EGetSmartCardsInfoResponse other = (EGetSmartCardsInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.getSmartcardsInfoResponse==null && other.getGetSmartcardsInfoResponse()==null) || 
             (this.getSmartcardsInfoResponse!=null &&
              this.getSmartcardsInfoResponse.equals(other.getGetSmartcardsInfoResponse())));
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
        if (getGetSmartcardsInfoResponse() != null) {
            _hashCode += getGetSmartcardsInfoResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EGetSmartCardsInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service", "EGetSmartCardsInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getSmartcardsInfoResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service", "getSmartcardsInfoResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/TvCable.Integration.Service.WRTuvesService", "getSmartcardsInfoResponse"));
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
