/**
 * DAC.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package intrawayWS.cliente;

public class DAC  implements java.io.Serializable {
    private java.lang.String idServicio;

    private java.lang.String idProducto;

    private java.lang.String idVenta;

    private java.lang.String idServicioPadre;

    private java.lang.String idProductoPadre;

    private java.lang.String idVentaPadre;

    private java.lang.String serialNumber;

    private java.lang.String unitAddress;

    private java.lang.String converterType;

    private java.lang.String headend;

    private java.lang.String channelmap;

    private java.lang.String controller;

    private java.lang.String defaultService;

    private java.lang.String disabled;

    private java.lang.String PPVEnabled;

    private java.lang.String fechaAlta;

    private java.lang.String fechaModif;

    private java.lang.String fechaActivacion;

    private intrawayWS.cliente.DACServices[] servicios;

    public DAC() {
    }

    public DAC(
           java.lang.String idServicio,
           java.lang.String idProducto,
           java.lang.String idVenta,
           java.lang.String idServicioPadre,
           java.lang.String idProductoPadre,
           java.lang.String idVentaPadre,
           java.lang.String serialNumber,
           java.lang.String unitAddress,
           java.lang.String converterType,
           java.lang.String headend,
           java.lang.String channelmap,
           java.lang.String controller,
           java.lang.String defaultService,
           java.lang.String disabled,
           java.lang.String PPVEnabled,
           java.lang.String fechaAlta,
           java.lang.String fechaModif,
           java.lang.String fechaActivacion,
           intrawayWS.cliente.DACServices[] servicios) {
           this.idServicio = idServicio;
           this.idProducto = idProducto;
           this.idVenta = idVenta;
           this.idServicioPadre = idServicioPadre;
           this.idProductoPadre = idProductoPadre;
           this.idVentaPadre = idVentaPadre;
           this.serialNumber = serialNumber;
           this.unitAddress = unitAddress;
           this.converterType = converterType;
           this.headend = headend;
           this.channelmap = channelmap;
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
     * Gets the idServicio value for this DAC.
     * 
     * @return idServicio
     */
    public java.lang.String getIdServicio() {
        return idServicio;
    }


    /**
     * Sets the idServicio value for this DAC.
     * 
     * @param idServicio
     */
    public void setIdServicio(java.lang.String idServicio) {
        this.idServicio = idServicio;
    }


    /**
     * Gets the idProducto value for this DAC.
     * 
     * @return idProducto
     */
    public java.lang.String getIdProducto() {
        return idProducto;
    }


    /**
     * Sets the idProducto value for this DAC.
     * 
     * @param idProducto
     */
    public void setIdProducto(java.lang.String idProducto) {
        this.idProducto = idProducto;
    }


    /**
     * Gets the idVenta value for this DAC.
     * 
     * @return idVenta
     */
    public java.lang.String getIdVenta() {
        return idVenta;
    }


    /**
     * Sets the idVenta value for this DAC.
     * 
     * @param idVenta
     */
    public void setIdVenta(java.lang.String idVenta) {
        this.idVenta = idVenta;
    }


    /**
     * Gets the idServicioPadre value for this DAC.
     * 
     * @return idServicioPadre
     */
    public java.lang.String getIdServicioPadre() {
        return idServicioPadre;
    }


    /**
     * Sets the idServicioPadre value for this DAC.
     * 
     * @param idServicioPadre
     */
    public void setIdServicioPadre(java.lang.String idServicioPadre) {
        this.idServicioPadre = idServicioPadre;
    }


    /**
     * Gets the idProductoPadre value for this DAC.
     * 
     * @return idProductoPadre
     */
    public java.lang.String getIdProductoPadre() {
        return idProductoPadre;
    }


    /**
     * Sets the idProductoPadre value for this DAC.
     * 
     * @param idProductoPadre
     */
    public void setIdProductoPadre(java.lang.String idProductoPadre) {
        this.idProductoPadre = idProductoPadre;
    }


    /**
     * Gets the idVentaPadre value for this DAC.
     * 
     * @return idVentaPadre
     */
    public java.lang.String getIdVentaPadre() {
        return idVentaPadre;
    }


    /**
     * Sets the idVentaPadre value for this DAC.
     * 
     * @param idVentaPadre
     */
    public void setIdVentaPadre(java.lang.String idVentaPadre) {
        this.idVentaPadre = idVentaPadre;
    }


    /**
     * Gets the serialNumber value for this DAC.
     * 
     * @return serialNumber
     */
    public java.lang.String getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this DAC.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(java.lang.String serialNumber) {
        this.serialNumber = serialNumber;
    }


    /**
     * Gets the unitAddress value for this DAC.
     * 
     * @return unitAddress
     */
    public java.lang.String getUnitAddress() {
        return unitAddress;
    }


    /**
     * Sets the unitAddress value for this DAC.
     * 
     * @param unitAddress
     */
    public void setUnitAddress(java.lang.String unitAddress) {
        this.unitAddress = unitAddress;
    }


    /**
     * Gets the converterType value for this DAC.
     * 
     * @return converterType
     */
    public java.lang.String getConverterType() {
        return converterType;
    }


    /**
     * Sets the converterType value for this DAC.
     * 
     * @param converterType
     */
    public void setConverterType(java.lang.String converterType) {
        this.converterType = converterType;
    }


    /**
     * Gets the headend value for this DAC.
     * 
     * @return headend
     */
    public java.lang.String getHeadend() {
        return headend;
    }


    /**
     * Sets the headend value for this DAC.
     * 
     * @param headend
     */
    public void setHeadend(java.lang.String headend) {
        this.headend = headend;
    }


    /**
     * Gets the channelmap value for this DAC.
     * 
     * @return channelmap
     */
    public java.lang.String getChannelmap() {
        return channelmap;
    }


    /**
     * Sets the channelmap value for this DAC.
     * 
     * @param channelmap
     */
    public void setChannelmap(java.lang.String channelmap) {
        this.channelmap = channelmap;
    }


    /**
     * Gets the controller value for this DAC.
     * 
     * @return controller
     */
    public java.lang.String getController() {
        return controller;
    }


    /**
     * Sets the controller value for this DAC.
     * 
     * @param controller
     */
    public void setController(java.lang.String controller) {
        this.controller = controller;
    }


    /**
     * Gets the defaultService value for this DAC.
     * 
     * @return defaultService
     */
    public java.lang.String getDefaultService() {
        return defaultService;
    }


    /**
     * Sets the defaultService value for this DAC.
     * 
     * @param defaultService
     */
    public void setDefaultService(java.lang.String defaultService) {
        this.defaultService = defaultService;
    }


    /**
     * Gets the disabled value for this DAC.
     * 
     * @return disabled
     */
    public java.lang.String getDisabled() {
        return disabled;
    }


    /**
     * Sets the disabled value for this DAC.
     * 
     * @param disabled
     */
    public void setDisabled(java.lang.String disabled) {
        this.disabled = disabled;
    }


    /**
     * Gets the PPVEnabled value for this DAC.
     * 
     * @return PPVEnabled
     */
    public java.lang.String getPPVEnabled() {
        return PPVEnabled;
    }


    /**
     * Sets the PPVEnabled value for this DAC.
     * 
     * @param PPVEnabled
     */
    public void setPPVEnabled(java.lang.String PPVEnabled) {
        this.PPVEnabled = PPVEnabled;
    }


    /**
     * Gets the fechaAlta value for this DAC.
     * 
     * @return fechaAlta
     */
    public java.lang.String getFechaAlta() {
        return fechaAlta;
    }


    /**
     * Sets the fechaAlta value for this DAC.
     * 
     * @param fechaAlta
     */
    public void setFechaAlta(java.lang.String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }


    /**
     * Gets the fechaModif value for this DAC.
     * 
     * @return fechaModif
     */
    public java.lang.String getFechaModif() {
        return fechaModif;
    }


    /**
     * Sets the fechaModif value for this DAC.
     * 
     * @param fechaModif
     */
    public void setFechaModif(java.lang.String fechaModif) {
        this.fechaModif = fechaModif;
    }


    /**
     * Gets the fechaActivacion value for this DAC.
     * 
     * @return fechaActivacion
     */
    public java.lang.String getFechaActivacion() {
        return fechaActivacion;
    }


    /**
     * Sets the fechaActivacion value for this DAC.
     * 
     * @param fechaActivacion
     */
    public void setFechaActivacion(java.lang.String fechaActivacion) {
        this.fechaActivacion = fechaActivacion;
    }


    /**
     * Gets the servicios value for this DAC.
     * 
     * @return servicios
     */
    public intrawayWS.cliente.DACServices[] getServicios() {
        return servicios;
    }


    /**
     * Sets the servicios value for this DAC.
     * 
     * @param servicios
     */
    public void setServicios(intrawayWS.cliente.DACServices[] servicios) {
        this.servicios = servicios;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DAC)) return false;
        DAC other = (DAC) obj;
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
            ((this.unitAddress==null && other.getUnitAddress()==null) || 
             (this.unitAddress!=null &&
              this.unitAddress.equals(other.getUnitAddress()))) &&
            ((this.converterType==null && other.getConverterType()==null) || 
             (this.converterType!=null &&
              this.converterType.equals(other.getConverterType()))) &&
            ((this.headend==null && other.getHeadend()==null) || 
             (this.headend!=null &&
              this.headend.equals(other.getHeadend()))) &&
            ((this.channelmap==null && other.getChannelmap()==null) || 
             (this.channelmap!=null &&
              this.channelmap.equals(other.getChannelmap()))) &&
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
        if (getUnitAddress() != null) {
            _hashCode += getUnitAddress().hashCode();
        }
        if (getConverterType() != null) {
            _hashCode += getConverterType().hashCode();
        }
        if (getHeadend() != null) {
            _hashCode += getHeadend().hashCode();
        }
        if (getChannelmap() != null) {
            _hashCode += getChannelmap().hashCode();
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
        new org.apache.axis.description.TypeDesc(DAC.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "DAC"));
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
        elemField.setFieldName("unitAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UnitAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("converterType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ConverterType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headend");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Headend"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelmap");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Channelmap"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "DACServices"));
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
