/**
 * AuditObjOutput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package intrawayWS.cliente;

public class AuditObjOutput  implements java.io.Serializable {
    private java.lang.String idEmpresaCRM;

    private java.lang.String idClienteCRM;

    private intrawayWS.cliente.AuditDOCSISObjOutput[] DOCSIS;

    private intrawayWS.cliente.AuditPacketCableObjOutput[] packetCable;

    public AuditObjOutput() {
    }

    public AuditObjOutput(
           java.lang.String idEmpresaCRM,
           java.lang.String idClienteCRM,
           intrawayWS.cliente.AuditDOCSISObjOutput[] DOCSIS,
           intrawayWS.cliente.AuditPacketCableObjOutput[] packetCable) {
           this.idEmpresaCRM = idEmpresaCRM;
           this.idClienteCRM = idClienteCRM;
           this.DOCSIS = DOCSIS;
           this.packetCable = packetCable;
    }


    /**
     * Gets the idEmpresaCRM value for this AuditObjOutput.
     * 
     * @return idEmpresaCRM
     */
    public java.lang.String getIdEmpresaCRM() {
        return idEmpresaCRM;
    }


    /**
     * Sets the idEmpresaCRM value for this AuditObjOutput.
     * 
     * @param idEmpresaCRM
     */
    public void setIdEmpresaCRM(java.lang.String idEmpresaCRM) {
        this.idEmpresaCRM = idEmpresaCRM;
    }


    /**
     * Gets the idClienteCRM value for this AuditObjOutput.
     * 
     * @return idClienteCRM
     */
    public java.lang.String getIdClienteCRM() {
        return idClienteCRM;
    }


    /**
     * Sets the idClienteCRM value for this AuditObjOutput.
     * 
     * @param idClienteCRM
     */
    public void setIdClienteCRM(java.lang.String idClienteCRM) {
        this.idClienteCRM = idClienteCRM;
    }


    /**
     * Gets the DOCSIS value for this AuditObjOutput.
     * 
     * @return DOCSIS
     */
    public intrawayWS.cliente.AuditDOCSISObjOutput[] getDOCSIS() {
        return DOCSIS;
    }


    /**
     * Sets the DOCSIS value for this AuditObjOutput.
     * 
     * @param DOCSIS
     */
    public void setDOCSIS(intrawayWS.cliente.AuditDOCSISObjOutput[] DOCSIS) {
        this.DOCSIS = DOCSIS;
    }


    /**
     * Gets the packetCable value for this AuditObjOutput.
     * 
     * @return packetCable
     */
    public intrawayWS.cliente.AuditPacketCableObjOutput[] getPacketCable() {
        return packetCable;
    }


    /**
     * Sets the packetCable value for this AuditObjOutput.
     * 
     * @param packetCable
     */
    public void setPacketCable(intrawayWS.cliente.AuditPacketCableObjOutput[] packetCable) {
        this.packetCable = packetCable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuditObjOutput)) return false;
        AuditObjOutput other = (AuditObjOutput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idEmpresaCRM==null && other.getIdEmpresaCRM()==null) || 
             (this.idEmpresaCRM!=null &&
              this.idEmpresaCRM.equals(other.getIdEmpresaCRM()))) &&
            ((this.idClienteCRM==null && other.getIdClienteCRM()==null) || 
             (this.idClienteCRM!=null &&
              this.idClienteCRM.equals(other.getIdClienteCRM()))) &&
            ((this.DOCSIS==null && other.getDOCSIS()==null) || 
             (this.DOCSIS!=null &&
              java.util.Arrays.equals(this.DOCSIS, other.getDOCSIS()))) &&
            ((this.packetCable==null && other.getPacketCable()==null) || 
             (this.packetCable!=null &&
              java.util.Arrays.equals(this.packetCable, other.getPacketCable())));
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
        if (getIdEmpresaCRM() != null) {
            _hashCode += getIdEmpresaCRM().hashCode();
        }
        if (getIdClienteCRM() != null) {
            _hashCode += getIdClienteCRM().hashCode();
        }
        if (getDOCSIS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDOCSIS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDOCSIS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPacketCable() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPacketCable());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPacketCable(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AuditObjOutput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "AuditObjOutput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idEmpresaCRM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idEmpresaCRM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idClienteCRM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idClienteCRM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DOCSIS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DOCSIS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "AuditDOCSISObjOutput"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packetCable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PacketCable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "AuditPacketCableObjOutput"));
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
