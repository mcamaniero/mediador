/**
 * PacketCableReport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package intrawayWS.cliente;

public class PacketCableReport  implements java.io.Serializable {
    private java.lang.String idServicio;

    private java.lang.String idProducto;

    private java.lang.String idVenta;

    private java.lang.String idServicioPadre;

    private java.lang.String idProductoPadre;

    private java.lang.String idVentaPadre;

    private java.lang.String macaddress;

    private java.lang.String linesQty;

    private java.lang.String fechaAlta;

    private java.lang.String fechaActivacion;

    private java.lang.String activo;

    private java.lang.String ispMTA;

    private java.lang.String mtaProfile;

    private java.lang.String mtaModel;

    private java.lang.String activationCode;

    private java.lang.String mtaType;

    private intrawayWS.cliente.PacketCableEndPointsReport[] endPoints;

    public PacketCableReport() {
    }

    public PacketCableReport(
           java.lang.String idServicio,
           java.lang.String idProducto,
           java.lang.String idVenta,
           java.lang.String idServicioPadre,
           java.lang.String idProductoPadre,
           java.lang.String idVentaPadre,
           java.lang.String macaddress,
           java.lang.String linesQty,
           java.lang.String fechaAlta,
           java.lang.String fechaActivacion,
           java.lang.String activo,
           java.lang.String ispMTA,
           java.lang.String mtaProfile,
           java.lang.String mtaModel,
           java.lang.String activationCode,
           java.lang.String mtaType,
           intrawayWS.cliente.PacketCableEndPointsReport[] endPoints) {
           this.idServicio = idServicio;
           this.idProducto = idProducto;
           this.idVenta = idVenta;
           this.idServicioPadre = idServicioPadre;
           this.idProductoPadre = idProductoPadre;
           this.idVentaPadre = idVentaPadre;
           this.macaddress = macaddress;
           this.linesQty = linesQty;
           this.fechaAlta = fechaAlta;
           this.fechaActivacion = fechaActivacion;
           this.activo = activo;
           this.ispMTA = ispMTA;
           this.mtaProfile = mtaProfile;
           this.mtaModel = mtaModel;
           this.activationCode = activationCode;
           this.mtaType = mtaType;
           this.endPoints = endPoints;
    }


    /**
     * Gets the idServicio value for this PacketCableReport.
     * 
     * @return idServicio
     */
    public java.lang.String getIdServicio() {
        return idServicio;
    }


    /**
     * Sets the idServicio value for this PacketCableReport.
     * 
     * @param idServicio
     */
    public void setIdServicio(java.lang.String idServicio) {
        this.idServicio = idServicio;
    }


    /**
     * Gets the idProducto value for this PacketCableReport.
     * 
     * @return idProducto
     */
    public java.lang.String getIdProducto() {
        return idProducto;
    }


    /**
     * Sets the idProducto value for this PacketCableReport.
     * 
     * @param idProducto
     */
    public void setIdProducto(java.lang.String idProducto) {
        this.idProducto = idProducto;
    }


    /**
     * Gets the idVenta value for this PacketCableReport.
     * 
     * @return idVenta
     */
    public java.lang.String getIdVenta() {
        return idVenta;
    }


    /**
     * Sets the idVenta value for this PacketCableReport.
     * 
     * @param idVenta
     */
    public void setIdVenta(java.lang.String idVenta) {
        this.idVenta = idVenta;
    }


    /**
     * Gets the idServicioPadre value for this PacketCableReport.
     * 
     * @return idServicioPadre
     */
    public java.lang.String getIdServicioPadre() {
        return idServicioPadre;
    }


    /**
     * Sets the idServicioPadre value for this PacketCableReport.
     * 
     * @param idServicioPadre
     */
    public void setIdServicioPadre(java.lang.String idServicioPadre) {
        this.idServicioPadre = idServicioPadre;
    }


    /**
     * Gets the idProductoPadre value for this PacketCableReport.
     * 
     * @return idProductoPadre
     */
    public java.lang.String getIdProductoPadre() {
        return idProductoPadre;
    }


    /**
     * Sets the idProductoPadre value for this PacketCableReport.
     * 
     * @param idProductoPadre
     */
    public void setIdProductoPadre(java.lang.String idProductoPadre) {
        this.idProductoPadre = idProductoPadre;
    }


    /**
     * Gets the idVentaPadre value for this PacketCableReport.
     * 
     * @return idVentaPadre
     */
    public java.lang.String getIdVentaPadre() {
        return idVentaPadre;
    }


    /**
     * Sets the idVentaPadre value for this PacketCableReport.
     * 
     * @param idVentaPadre
     */
    public void setIdVentaPadre(java.lang.String idVentaPadre) {
        this.idVentaPadre = idVentaPadre;
    }


    /**
     * Gets the macaddress value for this PacketCableReport.
     * 
     * @return macaddress
     */
    public java.lang.String getMacaddress() {
        return macaddress;
    }


    /**
     * Sets the macaddress value for this PacketCableReport.
     * 
     * @param macaddress
     */
    public void setMacaddress(java.lang.String macaddress) {
        this.macaddress = macaddress;
    }


    /**
     * Gets the linesQty value for this PacketCableReport.
     * 
     * @return linesQty
     */
    public java.lang.String getLinesQty() {
        return linesQty;
    }


    /**
     * Sets the linesQty value for this PacketCableReport.
     * 
     * @param linesQty
     */
    public void setLinesQty(java.lang.String linesQty) {
        this.linesQty = linesQty;
    }


    /**
     * Gets the fechaAlta value for this PacketCableReport.
     * 
     * @return fechaAlta
     */
    public java.lang.String getFechaAlta() {
        return fechaAlta;
    }


    /**
     * Sets the fechaAlta value for this PacketCableReport.
     * 
     * @param fechaAlta
     */
    public void setFechaAlta(java.lang.String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }


    /**
     * Gets the fechaActivacion value for this PacketCableReport.
     * 
     * @return fechaActivacion
     */
    public java.lang.String getFechaActivacion() {
        return fechaActivacion;
    }


    /**
     * Sets the fechaActivacion value for this PacketCableReport.
     * 
     * @param fechaActivacion
     */
    public void setFechaActivacion(java.lang.String fechaActivacion) {
        this.fechaActivacion = fechaActivacion;
    }


    /**
     * Gets the activo value for this PacketCableReport.
     * 
     * @return activo
     */
    public java.lang.String getActivo() {
        return activo;
    }


    /**
     * Sets the activo value for this PacketCableReport.
     * 
     * @param activo
     */
    public void setActivo(java.lang.String activo) {
        this.activo = activo;
    }


    /**
     * Gets the ispMTA value for this PacketCableReport.
     * 
     * @return ispMTA
     */
    public java.lang.String getIspMTA() {
        return ispMTA;
    }


    /**
     * Sets the ispMTA value for this PacketCableReport.
     * 
     * @param ispMTA
     */
    public void setIspMTA(java.lang.String ispMTA) {
        this.ispMTA = ispMTA;
    }


    /**
     * Gets the mtaProfile value for this PacketCableReport.
     * 
     * @return mtaProfile
     */
    public java.lang.String getMtaProfile() {
        return mtaProfile;
    }


    /**
     * Sets the mtaProfile value for this PacketCableReport.
     * 
     * @param mtaProfile
     */
    public void setMtaProfile(java.lang.String mtaProfile) {
        this.mtaProfile = mtaProfile;
    }


    /**
     * Gets the mtaModel value for this PacketCableReport.
     * 
     * @return mtaModel
     */
    public java.lang.String getMtaModel() {
        return mtaModel;
    }


    /**
     * Sets the mtaModel value for this PacketCableReport.
     * 
     * @param mtaModel
     */
    public void setMtaModel(java.lang.String mtaModel) {
        this.mtaModel = mtaModel;
    }


    /**
     * Gets the activationCode value for this PacketCableReport.
     * 
     * @return activationCode
     */
    public java.lang.String getActivationCode() {
        return activationCode;
    }


    /**
     * Sets the activationCode value for this PacketCableReport.
     * 
     * @param activationCode
     */
    public void setActivationCode(java.lang.String activationCode) {
        this.activationCode = activationCode;
    }


    /**
     * Gets the mtaType value for this PacketCableReport.
     * 
     * @return mtaType
     */
    public java.lang.String getMtaType() {
        return mtaType;
    }


    /**
     * Sets the mtaType value for this PacketCableReport.
     * 
     * @param mtaType
     */
    public void setMtaType(java.lang.String mtaType) {
        this.mtaType = mtaType;
    }


    /**
     * Gets the endPoints value for this PacketCableReport.
     * 
     * @return endPoints
     */
    public intrawayWS.cliente.PacketCableEndPointsReport[] getEndPoints() {
        return endPoints;
    }


    /**
     * Sets the endPoints value for this PacketCableReport.
     * 
     * @param endPoints
     */
    public void setEndPoints(intrawayWS.cliente.PacketCableEndPointsReport[] endPoints) {
        this.endPoints = endPoints;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PacketCableReport)) return false;
        PacketCableReport other = (PacketCableReport) obj;
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
            ((this.macaddress==null && other.getMacaddress()==null) || 
             (this.macaddress!=null &&
              this.macaddress.equals(other.getMacaddress()))) &&
            ((this.linesQty==null && other.getLinesQty()==null) || 
             (this.linesQty!=null &&
              this.linesQty.equals(other.getLinesQty()))) &&
            ((this.fechaAlta==null && other.getFechaAlta()==null) || 
             (this.fechaAlta!=null &&
              this.fechaAlta.equals(other.getFechaAlta()))) &&
            ((this.fechaActivacion==null && other.getFechaActivacion()==null) || 
             (this.fechaActivacion!=null &&
              this.fechaActivacion.equals(other.getFechaActivacion()))) &&
            ((this.activo==null && other.getActivo()==null) || 
             (this.activo!=null &&
              this.activo.equals(other.getActivo()))) &&
            ((this.ispMTA==null && other.getIspMTA()==null) || 
             (this.ispMTA!=null &&
              this.ispMTA.equals(other.getIspMTA()))) &&
            ((this.mtaProfile==null && other.getMtaProfile()==null) || 
             (this.mtaProfile!=null &&
              this.mtaProfile.equals(other.getMtaProfile()))) &&
            ((this.mtaModel==null && other.getMtaModel()==null) || 
             (this.mtaModel!=null &&
              this.mtaModel.equals(other.getMtaModel()))) &&
            ((this.activationCode==null && other.getActivationCode()==null) || 
             (this.activationCode!=null &&
              this.activationCode.equals(other.getActivationCode()))) &&
            ((this.mtaType==null && other.getMtaType()==null) || 
             (this.mtaType!=null &&
              this.mtaType.equals(other.getMtaType()))) &&
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
        if (getMacaddress() != null) {
            _hashCode += getMacaddress().hashCode();
        }
        if (getLinesQty() != null) {
            _hashCode += getLinesQty().hashCode();
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
        if (getIspMTA() != null) {
            _hashCode += getIspMTA().hashCode();
        }
        if (getMtaProfile() != null) {
            _hashCode += getMtaProfile().hashCode();
        }
        if (getMtaModel() != null) {
            _hashCode += getMtaModel().hashCode();
        }
        if (getActivationCode() != null) {
            _hashCode += getActivationCode().hashCode();
        }
        if (getMtaType() != null) {
            _hashCode += getMtaType().hashCode();
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
        new org.apache.axis.description.TypeDesc(PacketCableReport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "PacketCableReport"));
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
        elemField.setFieldName("macaddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Macaddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linesQty");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LinesQty"));
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
        elemField.setFieldName("ispMTA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ispMTA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mtaProfile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mtaProfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mtaModel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mtaModel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ActivationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mtaType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mtaType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endPoints");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endPoints"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "PacketCableEndPointsReport"));
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
