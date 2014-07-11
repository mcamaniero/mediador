/**
 * AuditPacketCableObjOutput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package intrawayWS.cliente;

public class AuditPacketCableObjOutput  implements java.io.Serializable {
    private java.lang.String idServicio;

    private java.lang.String idProducto;

    private java.lang.String idVenta;

    private java.lang.String idServicioPadre;

    private java.lang.String idProductoPadre;

    private java.lang.String idVentaPadre;

    private java.lang.String MACAddress;

    private intrawayWS.cliente.AuditPacketCableEndPointObjOutput[] endPoints;

    public AuditPacketCableObjOutput() {
    }

    public AuditPacketCableObjOutput(
           java.lang.String idServicio,
           java.lang.String idProducto,
           java.lang.String idVenta,
           java.lang.String idServicioPadre,
           java.lang.String idProductoPadre,
           java.lang.String idVentaPadre,
           java.lang.String MACAddress,
           intrawayWS.cliente.AuditPacketCableEndPointObjOutput[] endPoints) {
           this.idServicio = idServicio;
           this.idProducto = idProducto;
           this.idVenta = idVenta;
           this.idServicioPadre = idServicioPadre;
           this.idProductoPadre = idProductoPadre;
           this.idVentaPadre = idVentaPadre;
           this.MACAddress = MACAddress;
           this.endPoints = endPoints;
    }


    /**
     * Gets the idServicio value for this AuditPacketCableObjOutput.
     * 
     * @return idServicio
     */
    public java.lang.String getIdServicio() {
        return idServicio;
    }


    /**
     * Sets the idServicio value for this AuditPacketCableObjOutput.
     * 
     * @param idServicio
     */
    public void setIdServicio(java.lang.String idServicio) {
        this.idServicio = idServicio;
    }


    /**
     * Gets the idProducto value for this AuditPacketCableObjOutput.
     * 
     * @return idProducto
     */
    public java.lang.String getIdProducto() {
        return idProducto;
    }


    /**
     * Sets the idProducto value for this AuditPacketCableObjOutput.
     * 
     * @param idProducto
     */
    public void setIdProducto(java.lang.String idProducto) {
        this.idProducto = idProducto;
    }


    /**
     * Gets the idVenta value for this AuditPacketCableObjOutput.
     * 
     * @return idVenta
     */
    public java.lang.String getIdVenta() {
        return idVenta;
    }


    /**
     * Sets the idVenta value for this AuditPacketCableObjOutput.
     * 
     * @param idVenta
     */
    public void setIdVenta(java.lang.String idVenta) {
        this.idVenta = idVenta;
    }


    /**
     * Gets the idServicioPadre value for this AuditPacketCableObjOutput.
     * 
     * @return idServicioPadre
     */
    public java.lang.String getIdServicioPadre() {
        return idServicioPadre;
    }


    /**
     * Sets the idServicioPadre value for this AuditPacketCableObjOutput.
     * 
     * @param idServicioPadre
     */
    public void setIdServicioPadre(java.lang.String idServicioPadre) {
        this.idServicioPadre = idServicioPadre;
    }


    /**
     * Gets the idProductoPadre value for this AuditPacketCableObjOutput.
     * 
     * @return idProductoPadre
     */
    public java.lang.String getIdProductoPadre() {
        return idProductoPadre;
    }


    /**
     * Sets the idProductoPadre value for this AuditPacketCableObjOutput.
     * 
     * @param idProductoPadre
     */
    public void setIdProductoPadre(java.lang.String idProductoPadre) {
        this.idProductoPadre = idProductoPadre;
    }


    /**
     * Gets the idVentaPadre value for this AuditPacketCableObjOutput.
     * 
     * @return idVentaPadre
     */
    public java.lang.String getIdVentaPadre() {
        return idVentaPadre;
    }


    /**
     * Sets the idVentaPadre value for this AuditPacketCableObjOutput.
     * 
     * @param idVentaPadre
     */
    public void setIdVentaPadre(java.lang.String idVentaPadre) {
        this.idVentaPadre = idVentaPadre;
    }


    /**
     * Gets the MACAddress value for this AuditPacketCableObjOutput.
     * 
     * @return MACAddress
     */
    public java.lang.String getMACAddress() {
        return MACAddress;
    }


    /**
     * Sets the MACAddress value for this AuditPacketCableObjOutput.
     * 
     * @param MACAddress
     */
    public void setMACAddress(java.lang.String MACAddress) {
        this.MACAddress = MACAddress;
    }


    /**
     * Gets the endPoints value for this AuditPacketCableObjOutput.
     * 
     * @return endPoints
     */
    public intrawayWS.cliente.AuditPacketCableEndPointObjOutput[] getEndPoints() {
        return endPoints;
    }


    /**
     * Sets the endPoints value for this AuditPacketCableObjOutput.
     * 
     * @param endPoints
     */
    public void setEndPoints(intrawayWS.cliente.AuditPacketCableEndPointObjOutput[] endPoints) {
        this.endPoints = endPoints;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AuditPacketCableObjOutput)) return false;
        AuditPacketCableObjOutput other = (AuditPacketCableObjOutput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idServicio==null && other.getIdServicio()==null) || 
             (this.idServicio!=null &&
              this.idServicio.equals(other.getIdServicio()))) &&
            ((this.idProducto==null && other.getIdProducto()==null) || 
             (this.idProducto!=null &&
              this.idProducto.equals(other.getIdProducto()))) &&
            ((this.idVenta==null && other.getIdVenta()==null) || 
             (this.idVenta!=null &&
              this.idVenta.equals(other.getIdVenta()))) &&
            ((this.idServicioPadre==null && other.getIdServicioPadre()==null) || 
             (this.idServicioPadre!=null &&
              this.idServicioPadre.equals(other.getIdServicioPadre()))) &&
            ((this.idProductoPadre==null && other.getIdProductoPadre()==null) || 
             (this.idProductoPadre!=null &&
              this.idProductoPadre.equals(other.getIdProductoPadre()))) &&
            ((this.idVentaPadre==null && other.getIdVentaPadre()==null) || 
             (this.idVentaPadre!=null &&
              this.idVentaPadre.equals(other.getIdVentaPadre()))) &&
            ((this.MACAddress==null && other.getMACAddress()==null) || 
             (this.MACAddress!=null &&
              this.MACAddress.equals(other.getMACAddress()))) &&
            ((this.endPoints==null && other.getEndPoints()==null) || 
             (this.endPoints!=null &&
              java.util.Arrays.equals(this.endPoints, other.getEndPoints())));
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
        if (getIdServicio() != null) {
            _hashCode += getIdServicio().hashCode();
        }
        if (getIdProducto() != null) {
            _hashCode += getIdProducto().hashCode();
        }
        if (getIdVenta() != null) {
            _hashCode += getIdVenta().hashCode();
        }
        if (getIdServicioPadre() != null) {
            _hashCode += getIdServicioPadre().hashCode();
        }
        if (getIdProductoPadre() != null) {
            _hashCode += getIdProductoPadre().hashCode();
        }
        if (getIdVentaPadre() != null) {
            _hashCode += getIdVentaPadre().hashCode();
        }
        if (getMACAddress() != null) {
            _hashCode += getMACAddress().hashCode();
        }
        if (getEndPoints() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEndPoints());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEndPoints(), i);
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
        new org.apache.axis.description.TypeDesc(AuditPacketCableObjOutput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "AuditPacketCableObjOutput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idServicio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idServicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idProducto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idProducto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idVenta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idVenta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idServicioPadre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idServicioPadre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idProductoPadre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idProductoPadre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idVentaPadre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idVentaPadre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MACAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MACAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endPoints");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EndPoints"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "AuditPacketCableEndPointObjOutput"));
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
