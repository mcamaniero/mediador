/**
 * PacketCableEndPointsReport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package IntrawayWSDL_pkg;

public class PacketCableEndPointsReport  implements java.io.Serializable {
    private java.lang.String idServicio;

    private java.lang.String idProducto;

    private java.lang.String idVenta;

    private java.lang.String idServicioPadre;

    private java.lang.String idProductoPadre;

    private java.lang.String idVentaPadre;

    private java.lang.String endpointNumber;

    private java.lang.String TN;

    private java.lang.String epProfile;

    private java.lang.String epHomeExchange;

    private java.lang.String fechaAlta;

    private java.lang.String fechaActivacion;

    private java.lang.String activo;

    private intrawayWS.cliente.PacketCableCallFeaturesReport[] callFeatures;

    private intrawayWS.cliente.PacketCableSoftswitchReport[] softswitch;

    private java.lang.String epType;

    private java.lang.String username;

    public PacketCableEndPointsReport() {
    }

    public PacketCableEndPointsReport(
           java.lang.String idServicio,
           java.lang.String idProducto,
           java.lang.String idVenta,
           java.lang.String idServicioPadre,
           java.lang.String idProductoPadre,
           java.lang.String idVentaPadre,
           java.lang.String endpointNumber,
           java.lang.String TN,
           java.lang.String epProfile,
           java.lang.String epHomeExchange,
           java.lang.String fechaAlta,
           java.lang.String fechaActivacion,
           java.lang.String activo,
           intrawayWS.cliente.PacketCableCallFeaturesReport[] callFeatures,
           intrawayWS.cliente.PacketCableSoftswitchReport[] softswitch,
           java.lang.String epType,
           java.lang.String username) {
           this.idServicio = idServicio;
           this.idProducto = idProducto;
           this.idVenta = idVenta;
           this.idServicioPadre = idServicioPadre;
           this.idProductoPadre = idProductoPadre;
           this.idVentaPadre = idVentaPadre;
           this.endpointNumber = endpointNumber;
           this.TN = TN;
           this.epProfile = epProfile;
           this.epHomeExchange = epHomeExchange;
           this.fechaAlta = fechaAlta;
           this.fechaActivacion = fechaActivacion;
           this.activo = activo;
           this.callFeatures = callFeatures;
           this.softswitch = softswitch;
           this.epType = epType;
           this.username = username;
    }


    /**
     * Gets the idServicio value for this PacketCableEndPointsReport.
     * 
     * @return idServicio
     */
    public java.lang.String getIdServicio() {
        return idServicio;
    }


    /**
     * Sets the idServicio value for this PacketCableEndPointsReport.
     * 
     * @param idServicio
     */
    public void setIdServicio(java.lang.String idServicio) {
        this.idServicio = idServicio;
    }


    /**
     * Gets the idProducto value for this PacketCableEndPointsReport.
     * 
     * @return idProducto
     */
    public java.lang.String getIdProducto() {
        return idProducto;
    }


    /**
     * Sets the idProducto value for this PacketCableEndPointsReport.
     * 
     * @param idProducto
     */
    public void setIdProducto(java.lang.String idProducto) {
        this.idProducto = idProducto;
    }


    /**
     * Gets the idVenta value for this PacketCableEndPointsReport.
     * 
     * @return idVenta
     */
    public java.lang.String getIdVenta() {
        return idVenta;
    }


    /**
     * Sets the idVenta value for this PacketCableEndPointsReport.
     * 
     * @param idVenta
     */
    public void setIdVenta(java.lang.String idVenta) {
        this.idVenta = idVenta;
    }


    /**
     * Gets the idServicioPadre value for this PacketCableEndPointsReport.
     * 
     * @return idServicioPadre
     */
    public java.lang.String getIdServicioPadre() {
        return idServicioPadre;
    }


    /**
     * Sets the idServicioPadre value for this PacketCableEndPointsReport.
     * 
     * @param idServicioPadre
     */
    public void setIdServicioPadre(java.lang.String idServicioPadre) {
        this.idServicioPadre = idServicioPadre;
    }


    /**
     * Gets the idProductoPadre value for this PacketCableEndPointsReport.
     * 
     * @return idProductoPadre
     */
    public java.lang.String getIdProductoPadre() {
        return idProductoPadre;
    }


    /**
     * Sets the idProductoPadre value for this PacketCableEndPointsReport.
     * 
     * @param idProductoPadre
     */
    public void setIdProductoPadre(java.lang.String idProductoPadre) {
        this.idProductoPadre = idProductoPadre;
    }


    /**
     * Gets the idVentaPadre value for this PacketCableEndPointsReport.
     * 
     * @return idVentaPadre
     */
    public java.lang.String getIdVentaPadre() {
        return idVentaPadre;
    }


    /**
     * Sets the idVentaPadre value for this PacketCableEndPointsReport.
     * 
     * @param idVentaPadre
     */
    public void setIdVentaPadre(java.lang.String idVentaPadre) {
        this.idVentaPadre = idVentaPadre;
    }


    /**
     * Gets the endpointNumber value for this PacketCableEndPointsReport.
     * 
     * @return endpointNumber
     */
    public java.lang.String getEndpointNumber() {
        return endpointNumber;
    }


    /**
     * Sets the endpointNumber value for this PacketCableEndPointsReport.
     * 
     * @param endpointNumber
     */
    public void setEndpointNumber(java.lang.String endpointNumber) {
        this.endpointNumber = endpointNumber;
    }


    /**
     * Gets the TN value for this PacketCableEndPointsReport.
     * 
     * @return TN
     */
    public java.lang.String getTN() {
        return TN;
    }


    /**
     * Sets the TN value for this PacketCableEndPointsReport.
     * 
     * @param TN
     */
    public void setTN(java.lang.String TN) {
        this.TN = TN;
    }


    /**
     * Gets the epProfile value for this PacketCableEndPointsReport.
     * 
     * @return epProfile
     */
    public java.lang.String getEpProfile() {
        return epProfile;
    }


    /**
     * Sets the epProfile value for this PacketCableEndPointsReport.
     * 
     * @param epProfile
     */
    public void setEpProfile(java.lang.String epProfile) {
        this.epProfile = epProfile;
    }


    /**
     * Gets the epHomeExchange value for this PacketCableEndPointsReport.
     * 
     * @return epHomeExchange
     */
    public java.lang.String getEpHomeExchange() {
        return epHomeExchange;
    }


    /**
     * Sets the epHomeExchange value for this PacketCableEndPointsReport.
     * 
     * @param epHomeExchange
     */
    public void setEpHomeExchange(java.lang.String epHomeExchange) {
        this.epHomeExchange = epHomeExchange;
    }


    /**
     * Gets the fechaAlta value for this PacketCableEndPointsReport.
     * 
     * @return fechaAlta
     */
    public java.lang.String getFechaAlta() {
        return fechaAlta;
    }


    /**
     * Sets the fechaAlta value for this PacketCableEndPointsReport.
     * 
     * @param fechaAlta
     */
    public void setFechaAlta(java.lang.String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }


    /**
     * Gets the fechaActivacion value for this PacketCableEndPointsReport.
     * 
     * @return fechaActivacion
     */
    public java.lang.String getFechaActivacion() {
        return fechaActivacion;
    }


    /**
     * Sets the fechaActivacion value for this PacketCableEndPointsReport.
     * 
     * @param fechaActivacion
     */
    public void setFechaActivacion(java.lang.String fechaActivacion) {
        this.fechaActivacion = fechaActivacion;
    }


    /**
     * Gets the activo value for this PacketCableEndPointsReport.
     * 
     * @return activo
     */
    public java.lang.String getActivo() {
        return activo;
    }


    /**
     * Sets the activo value for this PacketCableEndPointsReport.
     * 
     * @param activo
     */
    public void setActivo(java.lang.String activo) {
        this.activo = activo;
    }


    /**
     * Gets the callFeatures value for this PacketCableEndPointsReport.
     * 
     * @return callFeatures
     */
    public intrawayWS.cliente.PacketCableCallFeaturesReport[] getCallFeatures() {
        return callFeatures;
    }


    /**
     * Sets the callFeatures value for this PacketCableEndPointsReport.
     * 
     * @param callFeatures
     */
    public void setCallFeatures(intrawayWS.cliente.PacketCableCallFeaturesReport[] callFeatures) {
        this.callFeatures = callFeatures;
    }


    /**
     * Gets the softswitch value for this PacketCableEndPointsReport.
     * 
     * @return softswitch
     */
    public intrawayWS.cliente.PacketCableSoftswitchReport[] getSoftswitch() {
        return softswitch;
    }


    /**
     * Sets the softswitch value for this PacketCableEndPointsReport.
     * 
     * @param softswitch
     */
    public void setSoftswitch(intrawayWS.cliente.PacketCableSoftswitchReport[] softswitch) {
        this.softswitch = softswitch;
    }


    /**
     * Gets the epType value for this PacketCableEndPointsReport.
     * 
     * @return epType
     */
    public java.lang.String getEpType() {
        return epType;
    }


    /**
     * Sets the epType value for this PacketCableEndPointsReport.
     * 
     * @param epType
     */
    public void setEpType(java.lang.String epType) {
        this.epType = epType;
    }


    /**
     * Gets the username value for this PacketCableEndPointsReport.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this PacketCableEndPointsReport.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PacketCableEndPointsReport)) return false;
        PacketCableEndPointsReport other = (PacketCableEndPointsReport) obj;
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
            ((this.endpointNumber==null && other.getEndpointNumber()==null) || 
             (this.endpointNumber!=null &&
              this.endpointNumber.equals(other.getEndpointNumber()))) &&
            ((this.TN==null && other.getTN()==null) || 
             (this.TN!=null &&
              this.TN.equals(other.getTN()))) &&
            ((this.epProfile==null && other.getEpProfile()==null) || 
             (this.epProfile!=null &&
              this.epProfile.equals(other.getEpProfile()))) &&
            ((this.epHomeExchange==null && other.getEpHomeExchange()==null) || 
             (this.epHomeExchange!=null &&
              this.epHomeExchange.equals(other.getEpHomeExchange()))) &&
            ((this.fechaAlta==null && other.getFechaAlta()==null) || 
             (this.fechaAlta!=null &&
              this.fechaAlta.equals(other.getFechaAlta()))) &&
            ((this.fechaActivacion==null && other.getFechaActivacion()==null) || 
             (this.fechaActivacion!=null &&
              this.fechaActivacion.equals(other.getFechaActivacion()))) &&
            ((this.activo==null && other.getActivo()==null) || 
             (this.activo!=null &&
              this.activo.equals(other.getActivo()))) &&
            ((this.callFeatures==null && other.getCallFeatures()==null) || 
             (this.callFeatures!=null &&
              java.util.Arrays.equals(this.callFeatures, other.getCallFeatures()))) &&
            ((this.softswitch==null && other.getSoftswitch()==null) || 
             (this.softswitch!=null &&
              java.util.Arrays.equals(this.softswitch, other.getSoftswitch()))) &&
            ((this.epType==null && other.getEpType()==null) || 
             (this.epType!=null &&
              this.epType.equals(other.getEpType()))) &&
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername())));
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
        if (getEndpointNumber() != null) {
            _hashCode += getEndpointNumber().hashCode();
        }
        if (getTN() != null) {
            _hashCode += getTN().hashCode();
        }
        if (getEpProfile() != null) {
            _hashCode += getEpProfile().hashCode();
        }
        if (getEpHomeExchange() != null) {
            _hashCode += getEpHomeExchange().hashCode();
        }
        if (getFechaAlta() != null) {
            _hashCode += getFechaAlta().hashCode();
        }
        if (getFechaActivacion() != null) {
            _hashCode += getFechaActivacion().hashCode();
        }
        if (getActivo() != null) {
            _hashCode += getActivo().hashCode();
        }
        if (getCallFeatures() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCallFeatures());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCallFeatures(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSoftswitch() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSoftswitch());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSoftswitch(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEpType() != null) {
            _hashCode += getEpType().hashCode();
        }
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PacketCableEndPointsReport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "PacketCableEndPointsReport"));
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
        elemField.setFieldName("endpointNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EndpointNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("epProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "epProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("epHomeExchange");
        elemField.setXmlName(new javax.xml.namespace.QName("", "epHomeExchange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaAlta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FechaAlta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaActivacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FechaActivacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Activo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callFeatures");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callFeatures"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "PacketCableCallFeaturesReport"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("softswitch");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Softswitch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "PacketCableSoftswitchReport"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("epType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "epType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("", "username"));
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
