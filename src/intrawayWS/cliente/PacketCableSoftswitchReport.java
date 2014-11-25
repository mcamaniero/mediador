/**
 * PacketCableSoftswitchReport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package intrawayWS.cliente;

public class PacketCableSoftswitchReport  implements java.io.Serializable {
    private java.lang.String softSwitchName;

    private java.lang.String softSwitchCRMId;

    private java.lang.String gatewayControllerName;

    private java.lang.String gatewayControllerCRMId;

    public PacketCableSoftswitchReport() {
    }

    public PacketCableSoftswitchReport(
           java.lang.String softSwitchName,
           java.lang.String softSwitchCRMId,
           java.lang.String gatewayControllerName,
           java.lang.String gatewayControllerCRMId) {
           this.softSwitchName = softSwitchName;
           this.softSwitchCRMId = softSwitchCRMId;
           this.gatewayControllerName = gatewayControllerName;
           this.gatewayControllerCRMId = gatewayControllerCRMId;
    }


    /**
     * Gets the softSwitchName value for this PacketCableSoftswitchReport.
     * 
     * @return softSwitchName
     */
    public java.lang.String getSoftSwitchName() {
        return softSwitchName;
    }


    /**
     * Sets the softSwitchName value for this PacketCableSoftswitchReport.
     * 
     * @param softSwitchName
     */
    public void setSoftSwitchName(java.lang.String softSwitchName) {
        this.softSwitchName = softSwitchName;
    }


    /**
     * Gets the softSwitchCRMId value for this PacketCableSoftswitchReport.
     * 
     * @return softSwitchCRMId
     */
    public java.lang.String getSoftSwitchCRMId() {
        return softSwitchCRMId;
    }


    /**
     * Sets the softSwitchCRMId value for this PacketCableSoftswitchReport.
     * 
     * @param softSwitchCRMId
     */
    public void setSoftSwitchCRMId(java.lang.String softSwitchCRMId) {
        this.softSwitchCRMId = softSwitchCRMId;
    }


    /**
     * Gets the gatewayControllerName value for this PacketCableSoftswitchReport.
     * 
     * @return gatewayControllerName
     */
    public java.lang.String getGatewayControllerName() {
        return gatewayControllerName;
    }


    /**
     * Sets the gatewayControllerName value for this PacketCableSoftswitchReport.
     * 
     * @param gatewayControllerName
     */
    public void setGatewayControllerName(java.lang.String gatewayControllerName) {
        this.gatewayControllerName = gatewayControllerName;
    }


    /**
     * Gets the gatewayControllerCRMId value for this PacketCableSoftswitchReport.
     * 
     * @return gatewayControllerCRMId
     */
    public java.lang.String getGatewayControllerCRMId() {
        return gatewayControllerCRMId;
    }


    /**
     * Sets the gatewayControllerCRMId value for this PacketCableSoftswitchReport.
     * 
     * @param gatewayControllerCRMId
     */
    public void setGatewayControllerCRMId(java.lang.String gatewayControllerCRMId) {
        this.gatewayControllerCRMId = gatewayControllerCRMId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PacketCableSoftswitchReport)) return false;
        PacketCableSoftswitchReport other = (PacketCableSoftswitchReport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.softSwitchName==null && other.getSoftSwitchName()==null) || 
             (this.softSwitchName!=null &&
              this.softSwitchName.equals(other.getSoftSwitchName()))) &&
            ((this.softSwitchCRMId==null && other.getSoftSwitchCRMId()==null) || 
             (this.softSwitchCRMId!=null &&
              this.softSwitchCRMId.equals(other.getSoftSwitchCRMId()))) &&
            ((this.gatewayControllerName==null && other.getGatewayControllerName()==null) || 
             (this.gatewayControllerName!=null &&
              this.gatewayControllerName.equals(other.getGatewayControllerName()))) &&
            ((this.gatewayControllerCRMId==null && other.getGatewayControllerCRMId()==null) || 
             (this.gatewayControllerCRMId!=null &&
              this.gatewayControllerCRMId.equals(other.getGatewayControllerCRMId())));
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
        if (getSoftSwitchName() != null) {
            _hashCode += getSoftSwitchName().hashCode();
        }
        if (getSoftSwitchCRMId() != null) {
            _hashCode += getSoftSwitchCRMId().hashCode();
        }
        if (getGatewayControllerName() != null) {
            _hashCode += getGatewayControllerName().hashCode();
        }
        if (getGatewayControllerCRMId() != null) {
            _hashCode += getGatewayControllerCRMId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PacketCableSoftswitchReport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "PacketCableSoftswitchReport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("softSwitchName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SoftSwitchName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("softSwitchCRMId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SoftSwitchCRMId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayControllerName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GatewayControllerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayControllerCRMId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "GatewayControllerCRMId"));
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
