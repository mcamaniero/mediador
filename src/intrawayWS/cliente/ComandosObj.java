/**
 * ComandosObj.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package intrawayWS.cliente;

public class ComandosObj  implements java.io.Serializable {
    private java.lang.String grupo;

    public ComandosObj() {
    }

    public ComandosObj(
           java.lang.String grupo) {
           this.grupo = grupo;
    }


    /**
     * Gets the grupo value for this ComandosObj.
     * 
     * @return grupo
     */
    public java.lang.String getGrupo() {
        return grupo;
    }


    /**
     * Sets the grupo value for this ComandosObj.
     * 
     * @param grupo
     */
    public void setGrupo(java.lang.String grupo) {
        this.grupo = grupo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ComandosObj)) return false;
        ComandosObj other = (ComandosObj) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.grupo==null && other.getGrupo()==null) || 
             (this.grupo!=null &&
              this.grupo.equals(other.getGrupo())));
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
        if (getGrupo() != null) {
            _hashCode += getGrupo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ComandosObj.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "comandosObj"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grupo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "grupo"));
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
