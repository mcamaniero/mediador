/**
 * TOCOM.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package intrawayWS.cliente;

public class TOCOM  implements java.io.Serializable {
    private java.lang.String idServicio;

    private java.lang.String idProducto;

    private java.lang.String idVenta;

    private java.lang.String idServicioPadre;

    private java.lang.String idProductoPadre;

    private java.lang.String idVentaPadre;

    private java.lang.String serialNumber;

    private java.lang.String converterId;

    private java.lang.String hub;

    private java.lang.String controller;

    private java.lang.String defaultService;

    private java.lang.String disabled;

    private java.lang.String PPVEnabled;

    private java.lang.String fechaAlta;

    private java.lang.String fechaModif;

    private java.lang.String fechaActivacion;

    private intrawayWS.cliente.TOCOMServices[] servicios;

    public TOCOM() {
    }

    public TOCOM(
           java.lang.String idServicio,
           java.lang.String idProducto,
           java.lang.String idVenta,
           java.lang.String idServicioPadre,
           java.lang.String idProductoPadre,
           java.lang.String idVentaPadre,
           java.lang.String serialNumber,
           java.lang.String converterId,
           java.lang.String hub,
           java.lang.String controller,
           java.lang.String defaultService,
           java.lang.String disabled,
           java.lang.String PPVEnabled,
           java.lang.String fechaAlta,
           java.lang.String fechaModif,
           java.lang.String fechaActivacion,
           intrawayWS.cliente.TOCOMServices[] servicios) {
           this.idServicio = idServicio;
           this.idProducto = idProducto;
           this.idVenta = idVenta;
           this.idServicioPadre = idServicioPadre;
           this.idProductoPadre = idProductoPadre;
           this.idVentaPadre = idVentaPadre;
           this.serialNumber = serialNumber;
           this.converterId = converterId;
           this.hub = hub;
           this.controller = controller;
           this.defaultService = defaultService;
           this.disabled = disabled;
           this.PPVEnabled = PPVEnabled;
           this.fechaAlta = fechaAlta;
           this.fechaModif = fechaModif;
           this.fechaActivacion = fechaActivacion;
           this.servicios = servicios;
    }


    /**
     * Gets the idServicio value for this TOCOM.
     * 
     * @return idServicio
     */
    public java.lang.String getIdServicio() {
        return idServicio;
    }


    /**
     * Sets the idServicio value for this TOCOM.
     * 
     * @param idServicio
     */
    public void setIdServicio(java.lang.String idServicio) {
        this.idServicio = idServicio;
    }


    /**
     * Gets the idProducto value for this TOCOM.
     * 
     * @return idProducto
     */
    public java.lang.String getIdProducto() {
        return idProducto;
    }


    /**
     * Sets the idProducto value for this TOCOM.
     * 
     * @param idProducto
     */
    public void setIdProducto(java.lang.String idProducto) {
        this.idProducto = idProducto;
    }


    /**
     * Gets the idVenta value for this TOCOM.
     * 
     * @return idVenta
     */
    public java.lang.String getIdVenta() {
        return idVenta;
    }


    /**
     * Sets the idVenta value for this TOCOM.
     * 
     * @param idVenta
     */
    public void setIdVenta(java.lang.String idVenta) {
        this.idVenta = idVenta;
    }


    /**
     * Gets the idServicioPadre value for this TOCOM.
     * 
     * @return idServicioPadre
     */
    public java.lang.String getIdServicioPadre() {
        return idServicioPadre;
    }


    /**
     * Sets the idServicioPadre value for this TOCOM.
     * 
     * @param idServicioPadre
     */
    public void setIdServicioPadre(java.lang.String idServicioPadre) {
        this.idServicioPadre = idServicioPadre;
    }


    /**
     * Gets the idProductoPadre value for this TOCOM.
     * 
     * @return idProductoPadre
     */
    public java.lang.String getIdProductoPadre() {
        return idProductoPadre;
    }


    /**
     * Sets the idProductoPadre value for this TOCOM.
     * 
     * @param idProductoPadre
     */
    public void setIdProductoPadre(java.lang.String idProductoPadre) {
        this.idProductoPadre = idProductoPadre;
    }


    /**
     * Gets the idVentaPadre value for this TOCOM.
     * 
     * @return idVentaPadre
     */
    public java.lang.String getIdVentaPadre() {
        return idVentaPadre;
    }


    /**
     * Sets the idVentaPadre value for this TOCOM.
     * 
     * @param idVentaPadre
     */
    public void setIdVentaPadre(java.lang.String idVentaPadre) {
        this.idVentaPadre = idVentaPadre;
    }


    /**
     * Gets the serialNumber value for this TOCOM.
     * 
     * @return serialNumber
     */
    public java.lang.String getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this TOCOM.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(java.lang.String serialNumber) {
        this.serialNumber = serialNumber;
    }


    /**
     * Gets the converterId value for this TOCOM.
     * 
     * @return converterId
     */
    public java.lang.String getConverterId() {
        return converterId;
    }


    /**
     * Sets the converterId value for this TOCOM.
     * 
     * @param converterId
     */
    public void setConverterId(java.lang.String converterId) {
        this.converterId = converterId;
    }


    /**
     * Gets the hub value for this TOCOM.
     * 
     * @return hub
     */
    public java.lang.String getHub() {
        return hub;
    }


    /**
     * Sets the hub value for this TOCOM.
     * 
     * @param hub
     */
    public void setHub(java.lang.String hub) {
        this.hub = hub;
    }


    /**
     * Gets the controller value for this TOCOM.
     * 
     * @return controller
     */
    public java.lang.String getController() {
        return controller;
    }


    /**
     * Sets the controller value for this TOCOM.
     * 
     * @param controller
     */
    public void setController(java.lang.String controller) {
        this.controller = controller;
    }


    /**
     * Gets the defaultService value for this TOCOM.
     * 
     * @return defaultService
     */
    public java.lang.String getDefaultService() {
        return defaultService;
    }


    /**
     * Sets the defaultService value for this TOCOM.
     * 
     * @param defaultService
     */
    public void setDefaultService(java.lang.String defaultService) {
        this.defaultService = defaultService;
    }


    /**
     * Gets the disabled value for this TOCOM.
     * 
     * @return disabled
     */
    public java.lang.String getDisabled() {
        return disabled;
    }


    /**
     * Sets the disabled value for this TOCOM.
     * 
     * @param disabled
     */
    public void setDisabled(java.lang.String disabled) {
        this.disabled = disabled;
    }


    /**
     * Gets the PPVEnabled value for this TOCOM.
     * 
     * @return PPVEnabled
     */
    public java.lang.String getPPVEnabled() {
        return PPVEnabled;
    }


    /**
     * Sets the PPVEnabled value for this TOCOM.
     * 
     * @param PPVEnabled
     */
    public void setPPVEnabled(java.lang.String PPVEnabled) {
        this.PPVEnabled = PPVEnabled;
    }


    /**
     * Gets the fechaAlta value for this TOCOM.
     * 
     * @return fechaAlta
     */
    public java.lang.String getFechaAlta() {
        return fechaAlta;
    }


    /**
     * Sets the fechaAlta value for this TOCOM.
     * 
     * @param fechaAlta
     */
    public void setFechaAlta(java.lang.String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }


    /**
     * Gets the fechaModif value for this TOCOM.
     * 
     * @return fechaModif
     */
    public java.lang.String getFechaModif() {
        return fechaModif;
    }


    /**
     * Sets the fechaModif value for this TOCOM.
     * 
     * @param fechaModif
     */
    public void setFechaModif(java.lang.String fechaModif) {
        this.fechaModif = fechaModif;
    }


    /**
     * Gets the fechaActivacion value for this TOCOM.
     * 
     * @return fechaActivacion
     */
    public java.lang.String getFechaActivacion() {
        return fechaActivacion;
    }


    /**
     * Sets the fechaActivacion value for this TOCOM.
     * 
     * @param fechaActivacion
     */
    public void setFechaActivacion(java.lang.String fechaActivacion) {
        this.fechaActivacion = fechaActivacion;
    }


    /**
     * Gets the servicios value for this TOCOM.
     * 
     * @return servicios
     */
    public intrawayWS.cliente.TOCOMServices[] getServicios() {
        return servicios;
    }


    /**
     * Sets the servicios value for this TOCOM.
     * 
     * @param servicios
     */
    public void setServicios(intrawayWS.cliente.TOCOMServices[] servicios) {
        this.servicios = servicios;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TOCOM)) return false;
        TOCOM other = (TOCOM) obj;
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
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              this.serialNumber.equals(other.getSerialNumber()))) &&
            ((this.converterId==null && other.getConverterId()==null) || 
             (this.converterId!=null &&
              this.converterId.equals(other.getConverterId()))) &&
            ((this.hub==null && other.getHub()==null) || 
             (this.hub!=null &&
              this.hub.equals(other.getHub()))) &&
            ((this.controller==null && other.getController()==null) || 
             (this.controller!=null &&
              this.controller.equals(other.getController()))) &&
            ((this.defaultService==null && other.getDefaultService()==null) || 
             (this.defaultService!=null &&
              this.defaultService.equals(other.getDefaultService()))) &&
            ((this.disabled==null && other.getDisabled()==null) || 
             (this.disabled!=null &&
              this.disabled.equals(other.getDisabled()))) &&
            ((this.PPVEnabled==null && other.getPPVEnabled()==null) || 
             (this.PPVEnabled!=null &&
              this.PPVEnabled.equals(other.getPPVEnabled()))) &&
            ((this.fechaAlta==null && other.getFechaAlta()==null) || 
             (this.fechaAlta!=null &&
              this.fechaAlta.equals(other.getFechaAlta()))) &&
            ((this.fechaModif==null && other.getFechaModif()==null) || 
             (this.fechaModif!=null &&
              this.fechaModif.equals(other.getFechaModif()))) &&
            ((this.fechaActivacion==null && other.getFechaActivacion()==null) || 
             (this.fechaActivacion!=null &&
              this.fechaActivacion.equals(other.getFechaActivacion()))) &&
            ((this.servicios==null && other.getServicios()==null) || 
             (this.servicios!=null &&
              java.util.Arrays.equals(this.servicios, other.getServicios())));
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
        if (getSerialNumber() != null) {
            _hashCode += getSerialNumber().hashCode();
        }
        if (getConverterId() != null) {
            _hashCode += getConverterId().hashCode();
        }
        if (getHub() != null) {
            _hashCode += getHub().hashCode();
        }
        if (getController() != null) {
            _hashCode += getController().hashCode();
        }
        if (getDefaultService() != null) {
            _hashCode += getDefaultService().hashCode();
        }
        if (getDisabled() != null) {
            _hashCode += getDisabled().hashCode();
        }
        if (getPPVEnabled() != null) {
            _hashCode += getPPVEnabled().hashCode();
        }
        if (getFechaAlta() != null) {
            _hashCode += getFechaAlta().hashCode();
        }
        if (getFechaModif() != null) {
            _hashCode += getFechaModif().hashCode();
        }
        if (getFechaActivacion() != null) {
            _hashCode += getFechaActivacion().hashCode();
        }
        if (getServicios() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServicios());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServicios(), i);
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
        new org.apache.axis.description.TypeDesc(TOCOM.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "TOCOM"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idServicio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idServicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idProducto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idProducto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idVenta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idVenta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idServicioPadre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idServicioPadre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idProductoPadre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idProductoPadre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idVentaPadre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idVentaPadre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SerialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("converterId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ConverterId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hub");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Hub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controller");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Controller"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultService");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DefaultService"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Disabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PPVEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PPVEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaAlta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FechaAlta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaModif");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FechaModif"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaActivacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FechaActivacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicios");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Servicios"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "TOCOMServices"));
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
