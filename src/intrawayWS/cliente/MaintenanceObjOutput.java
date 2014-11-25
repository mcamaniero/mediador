/**
 * MaintenanceObjOutput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package intrawayWS.cliente;

public class MaintenanceObjOutput  implements java.io.Serializable {
    private java.lang.String idEntradaCaller;

    private java.lang.String idError;

    private java.lang.String errorStr;

    private java.lang.String output;

    public MaintenanceObjOutput() {
    }

    public MaintenanceObjOutput(
           java.lang.String idEntradaCaller,
           java.lang.String idError,
           java.lang.String errorStr,
           java.lang.String output) {
           this.idEntradaCaller = idEntradaCaller;
           this.idError = idError;
           this.errorStr = errorStr;
           this.output = output;
    }


    /**
     * Gets the idEntradaCaller value for this MaintenanceObjOutput.
     * 
     * @return idEntradaCaller
     */
    public java.lang.String getIdEntradaCaller() {
        return idEntradaCaller;
    }


    /**
     * Sets the idEntradaCaller value for this MaintenanceObjOutput.
     * 
     * @param idEntradaCaller
     */
    public void setIdEntradaCaller(java.lang.String idEntradaCaller) {
        this.idEntradaCaller = idEntradaCaller;
    }


    /**
     * Gets the idError value for this MaintenanceObjOutput.
     * 
     * @return idError
     */
    public java.lang.String getIdError() {
        return idError;
    }


    /**
     * Sets the idError value for this MaintenanceObjOutput.
     * 
     * @param idError
     */
    public void setIdError(java.lang.String idError) {
        this.idError = idError;
    }


    /**
     * Gets the errorStr value for this MaintenanceObjOutput.
     * 
     * @return errorStr
     */
    public java.lang.String getErrorStr() {
        return errorStr;
    }


    /**
     * Sets the errorStr value for this MaintenanceObjOutput.
     * 
     * @param errorStr
     */
    public void setErrorStr(java.lang.String errorStr) {
        this.errorStr = errorStr;
    }


    /**
     * Gets the output value for this MaintenanceObjOutput.
     * 
     * @return output
     */
    public java.lang.String getOutput() {
        return output;
    }


    /**
     * Sets the output value for this MaintenanceObjOutput.
     * 
     * @param output
     */
    public void setOutput(java.lang.String output) {
        this.output = output;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MaintenanceObjOutput)) return false;
        MaintenanceObjOutput other = (MaintenanceObjOutput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idEntradaCaller==null && other.getIdEntradaCaller()==null) || 
             (this.idEntradaCaller!=null &&
              this.idEntradaCaller.equals(other.getIdEntradaCaller()))) &&
            ((this.idError==null && other.getIdError()==null) || 
             (this.idError!=null &&
              this.idError.equals(other.getIdError()))) &&
            ((this.errorStr==null && other.getErrorStr()==null) || 
             (this.errorStr!=null &&
              this.errorStr.equals(other.getErrorStr()))) &&
            ((this.output==null && other.getOutput()==null) || 
             (this.output!=null &&
              this.output.equals(other.getOutput())));
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
        if (getIdEntradaCaller() != null) {
            _hashCode += getIdEntradaCaller().hashCode();
        }
        if (getIdError() != null) {
            _hashCode += getIdError().hashCode();
        }
        if (getErrorStr() != null) {
            _hashCode += getErrorStr().hashCode();
        }
        if (getOutput() != null) {
            _hashCode += getOutput().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MaintenanceObjOutput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "MaintenanceObjOutput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idEntradaCaller");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idEntradaCaller"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idError");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorStr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorStr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("output");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Output"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
