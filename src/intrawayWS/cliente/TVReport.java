/**
 * TVReport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package intrawayWS.cliente;

public class TVReport  implements java.io.Serializable {
    private intrawayWS.cliente.ACC[] ACC;

    private intrawayWS.cliente.DAC[] DAC;

    private intrawayWS.cliente.TOCOM[] TOCOM;

    private intrawayWS.cliente.NAGRA[] NAGRAVISION;

    private intrawayWS.cliente.SYSMAN[] SYSMAN;

    public TVReport() {
    }

    public TVReport(
           intrawayWS.cliente.ACC[] ACC,
           intrawayWS.cliente.DAC[] DAC,
           intrawayWS.cliente.TOCOM[] TOCOM,
           intrawayWS.cliente.NAGRA[] NAGRAVISION,
           intrawayWS.cliente.SYSMAN[] SYSMAN) {
           this.ACC = ACC;
           this.DAC = DAC;
           this.TOCOM = TOCOM;
           this.NAGRAVISION = NAGRAVISION;
           this.SYSMAN = SYSMAN;
    }


    /**
     * Gets the ACC value for this TVReport.
     * 
     * @return ACC
     */
    public intrawayWS.cliente.ACC[] getACC() {
        return ACC;
    }


    /**
     * Sets the ACC value for this TVReport.
     * 
     * @param ACC
     */
    public void setACC(intrawayWS.cliente.ACC[] ACC) {
        this.ACC = ACC;
    }


    /**
     * Gets the DAC value for this TVReport.
     * 
     * @return DAC
     */
    public intrawayWS.cliente.DAC[] getDAC() {
        return DAC;
    }


    /**
     * Sets the DAC value for this TVReport.
     * 
     * @param DAC
     */
    public void setDAC(intrawayWS.cliente.DAC[] DAC) {
        this.DAC = DAC;
    }


    /**
     * Gets the TOCOM value for this TVReport.
     * 
     * @return TOCOM
     */
    public intrawayWS.cliente.TOCOM[] getTOCOM() {
        return TOCOM;
    }


    /**
     * Sets the TOCOM value for this TVReport.
     * 
     * @param TOCOM
     */
    public void setTOCOM(intrawayWS.cliente.TOCOM[] TOCOM) {
        this.TOCOM = TOCOM;
    }


    /**
     * Gets the NAGRAVISION value for this TVReport.
     * 
     * @return NAGRAVISION
     */
    public intrawayWS.cliente.NAGRA[] getNAGRAVISION() {
        return NAGRAVISION;
    }


    /**
     * Sets the NAGRAVISION value for this TVReport.
     * 
     * @param NAGRAVISION
     */
    public void setNAGRAVISION(intrawayWS.cliente.NAGRA[] NAGRAVISION) {
        this.NAGRAVISION = NAGRAVISION;
    }


    /**
     * Gets the SYSMAN value for this TVReport.
     * 
     * @return SYSMAN
     */
    public intrawayWS.cliente.SYSMAN[] getSYSMAN() {
        return SYSMAN;
    }


    /**
     * Sets the SYSMAN value for this TVReport.
     * 
     * @param SYSMAN
     */
    public void setSYSMAN(intrawayWS.cliente.SYSMAN[] SYSMAN) {
        this.SYSMAN = SYSMAN;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TVReport)) return false;
        TVReport other = (TVReport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ACC==null && other.getACC()==null) || 
             (this.ACC!=null &&
              java.util.Arrays.equals(this.ACC, other.getACC()))) &&
            ((this.DAC==null && other.getDAC()==null) || 
             (this.DAC!=null &&
              java.util.Arrays.equals(this.DAC, other.getDAC()))) &&
            ((this.TOCOM==null && other.getTOCOM()==null) || 
             (this.TOCOM!=null &&
              java.util.Arrays.equals(this.TOCOM, other.getTOCOM()))) &&
            ((this.NAGRAVISION==null && other.getNAGRAVISION()==null) || 
             (this.NAGRAVISION!=null &&
              java.util.Arrays.equals(this.NAGRAVISION, other.getNAGRAVISION()))) &&
            ((this.SYSMAN==null && other.getSYSMAN()==null) || 
             (this.SYSMAN!=null &&
              java.util.Arrays.equals(this.SYSMAN, other.getSYSMAN())));
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
        if (getACC() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getACC());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getACC(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDAC() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDAC());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDAC(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTOCOM() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTOCOM());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTOCOM(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNAGRAVISION() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNAGRAVISION());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNAGRAVISION(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSYSMAN() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSYSMAN());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSYSMAN(), i);
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
        new org.apache.axis.description.TypeDesc(TVReport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "TVReport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACC");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ACC"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "ACC"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DAC");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DAC"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "DAC"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TOCOM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TOCOM"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "TOCOM"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NAGRAVISION");
        elemField.setXmlName(new javax.xml.namespace.QName("", "NAGRAVISION"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "NAGRA"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SYSMAN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SYSMAN"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "SYSMAN"));
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
