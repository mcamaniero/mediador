/**
 * DocsisTrafficReportObjOutput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package intrawayWS.cliente;

public class DocsisTrafficReportObjOutput  implements java.io.Serializable {
    private java.lang.String idClienteCRM;

    private intrawayWS.cliente.DocsisTrafficReportCMObjOutput[] cableModems;

    public DocsisTrafficReportObjOutput() {
    }

    public DocsisTrafficReportObjOutput(
           java.lang.String idClienteCRM,
           intrawayWS.cliente.DocsisTrafficReportCMObjOutput[] cableModems) {
           this.idClienteCRM = idClienteCRM;
           this.cableModems = cableModems;
    }


    /**
     * Gets the idClienteCRM value for this DocsisTrafficReportObjOutput.
     * 
     * @return idClienteCRM
     */
    public java.lang.String getIdClienteCRM() {
        return idClienteCRM;
    }


    /**
     * Sets the idClienteCRM value for this DocsisTrafficReportObjOutput.
     * 
     * @param idClienteCRM
     */
    public void setIdClienteCRM(java.lang.String idClienteCRM) {
        this.idClienteCRM = idClienteCRM;
    }


    /**
     * Gets the cableModems value for this DocsisTrafficReportObjOutput.
     * 
     * @return cableModems
     */
    public intrawayWS.cliente.DocsisTrafficReportCMObjOutput[] getCableModems() {
        return cableModems;
    }


    /**
     * Sets the cableModems value for this DocsisTrafficReportObjOutput.
     * 
     * @param cableModems
     */
    public void setCableModems(intrawayWS.cliente.DocsisTrafficReportCMObjOutput[] cableModems) {
        this.cableModems = cableModems;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocsisTrafficReportObjOutput)) return false;
        DocsisTrafficReportObjOutput other = (DocsisTrafficReportObjOutput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idClienteCRM==null && other.getIdClienteCRM()==null) || 
             (this.idClienteCRM!=null &&
              this.idClienteCRM.equals(other.getIdClienteCRM()))) &&
            ((this.cableModems==null && other.getCableModems()==null) || 
             (this.cableModems!=null &&
              java.util.Arrays.equals(this.cableModems, other.getCableModems())));
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
        if (getIdClienteCRM() != null) {
            _hashCode += getIdClienteCRM().hashCode();
        }
        if (getCableModems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCableModems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCableModems(), i);
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
        new org.apache.axis.description.TypeDesc(DocsisTrafficReportObjOutput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "DocsisTrafficReportObjOutput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idClienteCRM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idClienteCRM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cableModems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CableModems"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "DocsisTrafficReportCMObjOutput"));
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
