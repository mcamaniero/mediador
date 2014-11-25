/**
 * MensajesObj.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package intrawayWS.cliente;

public class MensajesObj  implements java.io.Serializable {
    private java.lang.String idMensajeCRM;

    private java.lang.String nombre;

    private java.lang.String descripcion;

    private java.lang.String removible;

    public MensajesObj() {
    }

    public MensajesObj(
           java.lang.String idMensajeCRM,
           java.lang.String nombre,
           java.lang.String descripcion,
           java.lang.String removible) {
           this.idMensajeCRM = idMensajeCRM;
           this.nombre = nombre;
           this.descripcion = descripcion;
           this.removible = removible;
    }


    /**
     * Gets the idMensajeCRM value for this MensajesObj.
     * 
     * @return idMensajeCRM
     */
    public java.lang.String getIdMensajeCRM() {
        return idMensajeCRM;
    }


    /**
     * Sets the idMensajeCRM value for this MensajesObj.
     * 
     * @param idMensajeCRM
     */
    public void setIdMensajeCRM(java.lang.String idMensajeCRM) {
        this.idMensajeCRM = idMensajeCRM;
    }


    /**
     * Gets the nombre value for this MensajesObj.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this MensajesObj.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the descripcion value for this MensajesObj.
     * 
     * @return descripcion
     */
    public java.lang.String getDescripcion() {
        return descripcion;
    }


    /**
     * Sets the descripcion value for this MensajesObj.
     * 
     * @param descripcion
     */
    public void setDescripcion(java.lang.String descripcion) {
        this.descripcion = descripcion;
    }


    /**
     * Gets the removible value for this MensajesObj.
     * 
     * @return removible
     */
    public java.lang.String getRemovible() {
        return removible;
    }


    /**
     * Sets the removible value for this MensajesObj.
     * 
     * @param removible
     */
    public void setRemovible(java.lang.String removible) {
        this.removible = removible;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MensajesObj)) return false;
        MensajesObj other = (MensajesObj) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idMensajeCRM==null && other.getIdMensajeCRM()==null) || 
             (this.idMensajeCRM!=null &&
              this.idMensajeCRM.equals(other.getIdMensajeCRM()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.descripcion==null && other.getDescripcion()==null) || 
             (this.descripcion!=null &&
              this.descripcion.equals(other.getDescripcion()))) &&
            ((this.removible==null && other.getRemovible()==null) || 
             (this.removible!=null &&
              this.removible.equals(other.getRemovible())));
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
        if (getIdMensajeCRM() != null) {
            _hashCode += getIdMensajeCRM().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getDescripcion() != null) {
            _hashCode += getDescripcion().hashCode();
        }
        if (getRemovible() != null) {
            _hashCode += getRemovible().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MensajesObj.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "mensajesObj"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idMensajeCRM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idMensajeCRM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removible");
        elemField.setXmlName(new javax.xml.namespace.QName("", "removible"));
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
