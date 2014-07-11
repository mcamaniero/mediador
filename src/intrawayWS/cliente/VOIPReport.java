/**
 * VOIPReport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package intrawayWS.cliente;

public class VOIPReport  implements java.io.Serializable {
    private java.lang.String idProducto;

    private java.lang.String idVenta;

    private java.lang.String fechaAlta;

    private java.lang.String fechaModif;

    private java.lang.String fechaActivacion;

    private java.lang.String activo;

    private java.lang.String TN;

    private java.lang.String lineType;

    private java.lang.String SIPUser;

    private java.lang.String deviceFQDN;

    private java.lang.String devicePort;

    private java.lang.String adminStatus;

    private java.lang.String routingProfile;

    private java.lang.String endpointProfile;

    private java.lang.String carrierProfile;

    private java.lang.String softSwitchProfile;

    private java.lang.String gateway;

    private java.lang.String padre;

    private intrawayWS.cliente.VOIPCallFeaturesReport[] callFeatures;

    public VOIPReport() {
    }

    public VOIPReport(
           java.lang.String idProducto,
           java.lang.String idVenta,
           java.lang.String fechaAlta,
           java.lang.String fechaModif,
           java.lang.String fechaActivacion,
           java.lang.String activo,
           java.lang.String TN,
           java.lang.String lineType,
           java.lang.String SIPUser,
           java.lang.String deviceFQDN,
           java.lang.String devicePort,
           java.lang.String adminStatus,
           java.lang.String routingProfile,
           java.lang.String endpointProfile,
           java.lang.String carrierProfile,
           java.lang.String softSwitchProfile,
           java.lang.String gateway,
           java.lang.String padre,
           intrawayWS.cliente.VOIPCallFeaturesReport[] callFeatures) {
           this.idProducto = idProducto;
           this.idVenta = idVenta;
           this.fechaAlta = fechaAlta;
           this.fechaModif = fechaModif;
           this.fechaActivacion = fechaActivacion;
           this.activo = activo;
           this.TN = TN;
           this.lineType = lineType;
           this.SIPUser = SIPUser;
           this.deviceFQDN = deviceFQDN;
           this.devicePort = devicePort;
           this.adminStatus = adminStatus;
           this.routingProfile = routingProfile;
           this.endpointProfile = endpointProfile;
           this.carrierProfile = carrierProfile;
           this.softSwitchProfile = softSwitchProfile;
           this.gateway = gateway;
           this.padre = padre;
           this.callFeatures = callFeatures;
    }


    /**
     * Gets the idProducto value for this VOIPReport.
     * 
     * @return idProducto
     */
    public java.lang.String getIdProducto() {
        return idProducto;
    }


    /**
     * Sets the idProducto value for this VOIPReport.
     * 
     * @param idProducto
     */
    public void setIdProducto(java.lang.String idProducto) {
        this.idProducto = idProducto;
    }


    /**
     * Gets the idVenta value for this VOIPReport.
     * 
     * @return idVenta
     */
    public java.lang.String getIdVenta() {
        return idVenta;
    }


    /**
     * Sets the idVenta value for this VOIPReport.
     * 
     * @param idVenta
     */
    public void setIdVenta(java.lang.String idVenta) {
        this.idVenta = idVenta;
    }


    /**
     * Gets the fechaAlta value for this VOIPReport.
     * 
     * @return fechaAlta
     */
    public java.lang.String getFechaAlta() {
        return fechaAlta;
    }


    /**
     * Sets the fechaAlta value for this VOIPReport.
     * 
     * @param fechaAlta
     */
    public void setFechaAlta(java.lang.String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }


    /**
     * Gets the fechaModif value for this VOIPReport.
     * 
     * @return fechaModif
     */
    public java.lang.String getFechaModif() {
        return fechaModif;
    }


    /**
     * Sets the fechaModif value for this VOIPReport.
     * 
     * @param fechaModif
     */
    public void setFechaModif(java.lang.String fechaModif) {
        this.fechaModif = fechaModif;
    }


    /**
     * Gets the fechaActivacion value for this VOIPReport.
     * 
     * @return fechaActivacion
     */
    public java.lang.String getFechaActivacion() {
        return fechaActivacion;
    }


    /**
     * Sets the fechaActivacion value for this VOIPReport.
     * 
     * @param fechaActivacion
     */
    public void setFechaActivacion(java.lang.String fechaActivacion) {
        this.fechaActivacion = fechaActivacion;
    }


    /**
     * Gets the activo value for this VOIPReport.
     * 
     * @return activo
     */
    public java.lang.String getActivo() {
        return activo;
    }


    /**
     * Sets the activo value for this VOIPReport.
     * 
     * @param activo
     */
    public void setActivo(java.lang.String activo) {
        this.activo = activo;
    }


    /**
     * Gets the TN value for this VOIPReport.
     * 
     * @return TN
     */
    public java.lang.String getTN() {
        return TN;
    }


    /**
     * Sets the TN value for this VOIPReport.
     * 
     * @param TN
     */
    public void setTN(java.lang.String TN) {
        this.TN = TN;
    }


    /**
     * Gets the lineType value for this VOIPReport.
     * 
     * @return lineType
     */
    public java.lang.String getLineType() {
        return lineType;
    }


    /**
     * Sets the lineType value for this VOIPReport.
     * 
     * @param lineType
     */
    public void setLineType(java.lang.String lineType) {
        this.lineType = lineType;
    }


    /**
     * Gets the SIPUser value for this VOIPReport.
     * 
     * @return SIPUser
     */
    public java.lang.String getSIPUser() {
        return SIPUser;
    }


    /**
     * Sets the SIPUser value for this VOIPReport.
     * 
     * @param SIPUser
     */
    public void setSIPUser(java.lang.String SIPUser) {
        this.SIPUser = SIPUser;
    }


    /**
     * Gets the deviceFQDN value for this VOIPReport.
     * 
     * @return deviceFQDN
     */
    public java.lang.String getDeviceFQDN() {
        return deviceFQDN;
    }


    /**
     * Sets the deviceFQDN value for this VOIPReport.
     * 
     * @param deviceFQDN
     */
    public void setDeviceFQDN(java.lang.String deviceFQDN) {
        this.deviceFQDN = deviceFQDN;
    }


    /**
     * Gets the devicePort value for this VOIPReport.
     * 
     * @return devicePort
     */
    public java.lang.String getDevicePort() {
        return devicePort;
    }


    /**
     * Sets the devicePort value for this VOIPReport.
     * 
     * @param devicePort
     */
    public void setDevicePort(java.lang.String devicePort) {
        this.devicePort = devicePort;
    }


    /**
     * Gets the adminStatus value for this VOIPReport.
     * 
     * @return adminStatus
     */
    public java.lang.String getAdminStatus() {
        return adminStatus;
    }


    /**
     * Sets the adminStatus value for this VOIPReport.
     * 
     * @param adminStatus
     */
    public void setAdminStatus(java.lang.String adminStatus) {
        this.adminStatus = adminStatus;
    }


    /**
     * Gets the routingProfile value for this VOIPReport.
     * 
     * @return routingProfile
     */
    public java.lang.String getRoutingProfile() {
        return routingProfile;
    }


    /**
     * Sets the routingProfile value for this VOIPReport.
     * 
     * @param routingProfile
     */
    public void setRoutingProfile(java.lang.String routingProfile) {
        this.routingProfile = routingProfile;
    }


    /**
     * Gets the endpointProfile value for this VOIPReport.
     * 
     * @return endpointProfile
     */
    public java.lang.String getEndpointProfile() {
        return endpointProfile;
    }


    /**
     * Sets the endpointProfile value for this VOIPReport.
     * 
     * @param endpointProfile
     */
    public void setEndpointProfile(java.lang.String endpointProfile) {
        this.endpointProfile = endpointProfile;
    }


    /**
     * Gets the carrierProfile value for this VOIPReport.
     * 
     * @return carrierProfile
     */
    public java.lang.String getCarrierProfile() {
        return carrierProfile;
    }


    /**
     * Sets the carrierProfile value for this VOIPReport.
     * 
     * @param carrierProfile
     */
    public void setCarrierProfile(java.lang.String carrierProfile) {
        this.carrierProfile = carrierProfile;
    }


    /**
     * Gets the softSwitchProfile value for this VOIPReport.
     * 
     * @return softSwitchProfile
     */
    public java.lang.String getSoftSwitchProfile() {
        return softSwitchProfile;
    }


    /**
     * Sets the softSwitchProfile value for this VOIPReport.
     * 
     * @param softSwitchProfile
     */
    public void setSoftSwitchProfile(java.lang.String softSwitchProfile) {
        this.softSwitchProfile = softSwitchProfile;
    }


    /**
     * Gets the gateway value for this VOIPReport.
     * 
     * @return gateway
     */
    public java.lang.String getGateway() {
        return gateway;
    }


    /**
     * Sets the gateway value for this VOIPReport.
     * 
     * @param gateway
     */
    public void setGateway(java.lang.String gateway) {
        this.gateway = gateway;
    }


    /**
     * Gets the padre value for this VOIPReport.
     * 
     * @return padre
     */
    public java.lang.String getPadre() {
        return padre;
    }


    /**
     * Sets the padre value for this VOIPReport.
     * 
     * @param padre
     */
    public void setPadre(java.lang.String padre) {
        this.padre = padre;
    }


    /**
     * Gets the callFeatures value for this VOIPReport.
     * 
     * @return callFeatures
     */
    public intrawayWS.cliente.VOIPCallFeaturesReport[] getCallFeatures() {
        return callFeatures;
    }


    /**
     * Sets the callFeatures value for this VOIPReport.
     * 
     * @param callFeatures
     */
    public void setCallFeatures(intrawayWS.cliente.VOIPCallFeaturesReport[] callFeatures) {
        this.callFeatures = callFeatures;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VOIPReport)) return false;
        VOIPReport other = (VOIPReport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idProducto==null && other.getIdProducto()==null) || 
             (this.idProducto!=null &&
              this.idProducto.equals(other.getIdProducto()))) &&
            ((this.idVenta==null && other.getIdVenta()==null) || 
             (this.idVenta!=null &&
              this.idVenta.equals(other.getIdVenta()))) &&
            ((this.fechaAlta==null && other.getFechaAlta()==null) || 
             (this.fechaAlta!=null &&
              this.fechaAlta.equals(other.getFechaAlta()))) &&
            ((this.fechaModif==null && other.getFechaModif()==null) || 
             (this.fechaModif!=null &&
              this.fechaModif.equals(other.getFechaModif()))) &&
            ((this.fechaActivacion==null && other.getFechaActivacion()==null) || 
             (this.fechaActivacion!=null &&
              this.fechaActivacion.equals(other.getFechaActivacion()))) &&
            ((this.activo==null && other.getActivo()==null) || 
             (this.activo!=null &&
              this.activo.equals(other.getActivo()))) &&
            ((this.TN==null && other.getTN()==null) || 
             (this.TN!=null &&
              this.TN.equals(other.getTN()))) &&
            ((this.lineType==null && other.getLineType()==null) || 
             (this.lineType!=null &&
              this.lineType.equals(other.getLineType()))) &&
            ((this.SIPUser==null && other.getSIPUser()==null) || 
             (this.SIPUser!=null &&
              this.SIPUser.equals(other.getSIPUser()))) &&
            ((this.deviceFQDN==null && other.getDeviceFQDN()==null) || 
             (this.deviceFQDN!=null &&
              this.deviceFQDN.equals(other.getDeviceFQDN()))) &&
            ((this.devicePort==null && other.getDevicePort()==null) || 
             (this.devicePort!=null &&
              this.devicePort.equals(other.getDevicePort()))) &&
            ((this.adminStatus==null && other.getAdminStatus()==null) || 
             (this.adminStatus!=null &&
              this.adminStatus.equals(other.getAdminStatus()))) &&
            ((this.routingProfile==null && other.getRoutingProfile()==null) || 
             (this.routingProfile!=null &&
              this.routingProfile.equals(other.getRoutingProfile()))) &&
            ((this.endpointProfile==null && other.getEndpointProfile()==null) || 
             (this.endpointProfile!=null &&
              this.endpointProfile.equals(other.getEndpointProfile()))) &&
            ((this.carrierProfile==null && other.getCarrierProfile()==null) || 
             (this.carrierProfile!=null &&
              this.carrierProfile.equals(other.getCarrierProfile()))) &&
            ((this.softSwitchProfile==null && other.getSoftSwitchProfile()==null) || 
             (this.softSwitchProfile!=null &&
              this.softSwitchProfile.equals(other.getSoftSwitchProfile()))) &&
            ((this.gateway==null && other.getGateway()==null) || 
             (this.gateway!=null &&
              this.gateway.equals(other.getGateway()))) &&
            ((this.padre==null && other.getPadre()==null) || 
             (this.padre!=null &&
              this.padre.equals(other.getPadre()))) &&
            ((this.callFeatures==null && other.getCallFeatures()==null) || 
             (this.callFeatures!=null &&
              java.util.Arrays.equals(this.callFeatures, other.getCallFeatures())));
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
        if (getIdProducto() != null) {
            _hashCode += getIdProducto().hashCode();
        }
        if (getIdVenta() != null) {
            _hashCode += getIdVenta().hashCode();
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
        if (getActivo() != null) {
            _hashCode += getActivo().hashCode();
        }
        if (getTN() != null) {
            _hashCode += getTN().hashCode();
        }
        if (getLineType() != null) {
            _hashCode += getLineType().hashCode();
        }
        if (getSIPUser() != null) {
            _hashCode += getSIPUser().hashCode();
        }
        if (getDeviceFQDN() != null) {
            _hashCode += getDeviceFQDN().hashCode();
        }
        if (getDevicePort() != null) {
            _hashCode += getDevicePort().hashCode();
        }
        if (getAdminStatus() != null) {
            _hashCode += getAdminStatus().hashCode();
        }
        if (getRoutingProfile() != null) {
            _hashCode += getRoutingProfile().hashCode();
        }
        if (getEndpointProfile() != null) {
            _hashCode += getEndpointProfile().hashCode();
        }
        if (getCarrierProfile() != null) {
            _hashCode += getCarrierProfile().hashCode();
        }
        if (getSoftSwitchProfile() != null) {
            _hashCode += getSoftSwitchProfile().hashCode();
        }
        if (getGateway() != null) {
            _hashCode += getGateway().hashCode();
        }
        if (getPadre() != null) {
            _hashCode += getPadre().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VOIPReport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "VOIPReport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("fechaAlta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FechaAlta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaModif");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FechaModif"));
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
        elemField.setFieldName("TN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LineType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SIPUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SIPUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceFQDN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DeviceFQDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devicePort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DevicePort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adminStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AdminStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routingProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RoutingProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endpointProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EndpointProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CarrierProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("softSwitchProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SoftSwitchProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gateway");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Gateway"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("padre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Padre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callFeatures");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CallFeatures"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "VOIPCallFeaturesReport"));
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
