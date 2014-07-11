/**
 * CreateTempMTAInput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package intrawayWS.cliente;

public class CreateTempMTAInput  implements java.io.Serializable {
    private java.lang.String sysDescr;

    private java.lang.String macaddress;

    private java.lang.String linesQty;

    public CreateTempMTAInput() {
    }

    public CreateTempMTAInput(
           java.lang.String sysDescr,
           java.lang.String macaddress,
           java.lang.String linesQty) {
           this.sysDescr = sysDescr;
           this.macaddress = macaddress;
           this.linesQty = linesQty;
    }


    /**
     * Gets the sysDescr value for this CreateTempMTAInput.
     * 
     * @return sysDescr
     */
    public java.lang.String getSysDescr() {
        return sysDescr;
    }


    /**
     * Sets the sysDescr value for this CreateTempMTAInput.
     * 
     * @param sysDescr
     */
    public void setSysDescr(java.lang.String sysDescr) {
        this.sysDescr = sysDescr;
    }


    /**
     * Gets the macaddress value for this CreateTempMTAInput.
     * 
     * @return macaddress
     */
    public java.lang.String getMacaddress() {
        return macaddress;
    }


    /**
     * Sets the macaddress value for this CreateTempMTAInput.
     * 
     * @param macaddress
     */
    public void setMacaddress(java.lang.String macaddress) {
        this.macaddress = macaddress;
    }


    /**
     * Gets the linesQty value for this CreateTempMTAInput.
     * 
     * @return linesQty
     */
    public java.lang.String getLinesQty() {
        return linesQty;
    }


    /**
     * Sets the linesQty value for this CreateTempMTAInput.
     * 
     * @param linesQty
     */
    public void setLinesQty(java.lang.String linesQty) {
        this.linesQty = linesQty;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateTempMTAInput)) return false;
        CreateTempMTAInput other = (CreateTempMTAInput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sysDescr==null && other.getSysDescr()==null) || 
             (this.sysDescr!=null &&
              this.sysDescr.equals(other.getSysDescr()))) &&
            ((this.macaddress==null && other.getMacaddress()==null) || 
             (this.macaddress!=null &&
              this.macaddress.equals(other.getMacaddress()))) &&
            ((this.linesQty==null && other.getLinesQty()==null) || 
             (this.linesQty!=null &&
              this.linesQty.equals(other.getLinesQty())));
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
        if (getSysDescr() != null) {
            _hashCode += getSysDescr().hashCode();
        }
        if (getMacaddress() != null) {
            _hashCode += getMacaddress().hashCode();
        }
        if (getLinesQty() != null) {
            _hashCode += getLinesQty().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateTempMTAInput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "createTempMTAInput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sysDescr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sysDescr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("macaddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "macaddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linesQty");
        elemField.setXmlName(new javax.xml.namespace.QName("", "linesQty"));
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
