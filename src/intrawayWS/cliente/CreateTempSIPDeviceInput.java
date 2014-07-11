/**
 * CreateTempSIPDeviceInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package intrawayWS.cliente;

public class CreateTempSIPDeviceInput  implements java.io.Serializable {
    private java.lang.String macaddress;

    private java.lang.String deviceTypeCrmId;

    public CreateTempSIPDeviceInput() {
    }

    public CreateTempSIPDeviceInput(
           java.lang.String macaddress,
           java.lang.String deviceTypeCrmId) {
           this.macaddress = macaddress;
           this.deviceTypeCrmId = deviceTypeCrmId;
    }


    /**
     * Gets the macaddress value for this CreateTempSIPDeviceInput.
     * 
     * @return macaddress
     */
    public java.lang.String getMacaddress() {
        return macaddress;
    }


    /**
     * Sets the macaddress value for this CreateTempSIPDeviceInput.
     * 
     * @param macaddress
     */
    public void setMacaddress(java.lang.String macaddress) {
        this.macaddress = macaddress;
    }


    /**
     * Gets the deviceTypeCrmId value for this CreateTempSIPDeviceInput.
     * 
     * @return deviceTypeCrmId
     */
    public java.lang.String getDeviceTypeCrmId() {
        return deviceTypeCrmId;
    }


    /**
     * Sets the deviceTypeCrmId value for this CreateTempSIPDeviceInput.
     * 
     * @param deviceTypeCrmId
     */
    public void setDeviceTypeCrmId(java.lang.String deviceTypeCrmId) {
        this.deviceTypeCrmId = deviceTypeCrmId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateTempSIPDeviceInput)) return false;
        CreateTempSIPDeviceInput other = (CreateTempSIPDeviceInput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.macaddress==null && other.getMacaddress()==null) || 
             (this.macaddress!=null &&
              this.macaddress.equals(other.getMacaddress()))) &&
            ((this.deviceTypeCrmId==null && other.getDeviceTypeCrmId()==null) || 
             (this.deviceTypeCrmId!=null &&
              this.deviceTypeCrmId.equals(other.getDeviceTypeCrmId())));
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
        if (getMacaddress() != null) {
            _hashCode += getMacaddress().hashCode();
        }
        if (getDeviceTypeCrmId() != null) {
            _hashCode += getDeviceTypeCrmId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateTempSIPDeviceInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "createTempSIPDeviceInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("macaddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "macaddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceTypeCrmId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceTypeCrmId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
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
