/**
 * NAGRA.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package intrawayWS.cliente;

public class NAGRA  implements java.io.Serializable {
    private java.lang.String idServicio;

    private java.lang.String idProducto;

    private java.lang.String idVenta;

    private java.lang.String idServicioPadre;

    private java.lang.String idProductoPadre;

    private java.lang.String idVentaPadre;

    private java.lang.String STBId;

    private java.lang.String smartCardId;

    private java.lang.String inventorySN;

    private java.lang.String STBType;

    private java.lang.String STBTypeCRMId;

    private java.lang.String zone;

    private java.lang.String zoneCRMId;

    private java.lang.String controller;

    private java.lang.String controllerCRMId;

    private java.lang.String defaultProduct;

    private java.lang.String defaultProductCRMId;

    private java.lang.String profile;

    private java.lang.String profileCRMId;

    private java.lang.String ZIPCode;

    private java.lang.String disabled;

    private java.lang.String fechaAlta;

    private java.lang.String fechaModif;

    private java.lang.String fechaActivacion;

    private intrawayWS.cliente.NAGRAProducts[] products;

    public NAGRA() {
    }

    public NAGRA(
           java.lang.String idServicio,
           java.lang.String idProducto,
           java.lang.String idVenta,
           java.lang.String idServicioPadre,
           java.lang.String idProductoPadre,
           java.lang.String idVentaPadre,
           java.lang.String STBId,
           java.lang.String smartCardId,
           java.lang.String inventorySN,
           java.lang.String STBType,
           java.lang.String STBTypeCRMId,
           java.lang.String zone,
           java.lang.String zoneCRMId,
           java.lang.String controller,
           java.lang.String controllerCRMId,
           java.lang.String defaultProduct,
           java.lang.String defaultProductCRMId,
           java.lang.String profile,
           java.lang.String profileCRMId,
           java.lang.String ZIPCode,
           java.lang.String disabled,
           java.lang.String fechaAlta,
           java.lang.String fechaModif,
           java.lang.String fechaActivacion,
           intrawayWS.cliente.NAGRAProducts[] products) {
           this.idServicio = idServicio;
           this.idProducto = idProducto;
           this.idVenta = idVenta;
           this.idServicioPadre = idServicioPadre;
           this.idProductoPadre = idProductoPadre;
           this.idVentaPadre = idVentaPadre;
           this.STBId = STBId;
           this.smartCardId = smartCardId;
           this.inventorySN = inventorySN;
           this.STBType = STBType;
           this.STBTypeCRMId = STBTypeCRMId;
           this.zone = zone;
           this.zoneCRMId = zoneCRMId;
           this.controller = controller;
           this.controllerCRMId = controllerCRMId;
           this.defaultProduct = defaultProduct;
           this.defaultProductCRMId = defaultProductCRMId;
           this.profile = profile;
           this.profileCRMId = profileCRMId;
           this.ZIPCode = ZIPCode;
           this.disabled = disabled;
           this.fechaAlta = fechaAlta;
           this.fechaModif = fechaModif;
           this.fechaActivacion = fechaActivacion;
           this.products = products;
    }


    /**
     * Gets the idServicio value for this NAGRA.
     * 
     * @return idServicio
     */
    public java.lang.String getIdServicio() {
        return idServicio;
    }


    /**
     * Sets the idServicio value for this NAGRA.
     * 
     * @param idServicio
     */
    public void setIdServicio(java.lang.String idServicio) {
        this.idServicio = idServicio;
    }


    /**
     * Gets the idProducto value for this NAGRA.
     * 
     * @return idProducto
     */
    public java.lang.String getIdProducto() {
        return idProducto;
    }


    /**
     * Sets the idProducto value for this NAGRA.
     * 
     * @param idProducto
     */
    public void setIdProducto(java.lang.String idProducto) {
        this.idProducto = idProducto;
    }


    /**
     * Gets the idVenta value for this NAGRA.
     * 
     * @return idVenta
     */
    public java.lang.String getIdVenta() {
        return idVenta;
    }


    /**
     * Sets the idVenta value for this NAGRA.
     * 
     * @param idVenta
     */
    public void setIdVenta(java.lang.String idVenta) {
        this.idVenta = idVenta;
    }


    /**
     * Gets the idServicioPadre value for this NAGRA.
     * 
     * @return idServicioPadre
     */
    public java.lang.String getIdServicioPadre() {
        return idServicioPadre;
    }


    /**
     * Sets the idServicioPadre value for this NAGRA.
     * 
     * @param idServicioPadre
     */
    public void setIdServicioPadre(java.lang.String idServicioPadre) {
        this.idServicioPadre = idServicioPadre;
    }


    /**
     * Gets the idProductoPadre value for this NAGRA.
     * 
     * @return idProductoPadre
     */
    public java.lang.String getIdProductoPadre() {
        return idProductoPadre;
    }


    /**
     * Sets the idProductoPadre value for this NAGRA.
     * 
     * @param idProductoPadre
     */
    public void setIdProductoPadre(java.lang.String idProductoPadre) {
        this.idProductoPadre = idProductoPadre;
    }


    /**
     * Gets the idVentaPadre value for this NAGRA.
     * 
     * @return idVentaPadre
     */
    public java.lang.String getIdVentaPadre() {
        return idVentaPadre;
    }


    /**
     * Sets the idVentaPadre value for this NAGRA.
     * 
     * @param idVentaPadre
     */
    public void setIdVentaPadre(java.lang.String idVentaPadre) {
        this.idVentaPadre = idVentaPadre;
    }


    /**
     * Gets the STBId value for this NAGRA.
     * 
     * @return STBId
     */
    public java.lang.String getSTBId() {
        return STBId;
    }


    /**
     * Sets the STBId value for this NAGRA.
     * 
     * @param STBId
     */
    public void setSTBId(java.lang.String STBId) {
        this.STBId = STBId;
    }


    /**
     * Gets the smartCardId value for this NAGRA.
     * 
     * @return smartCardId
     */
    public java.lang.String getSmartCardId() {
        return smartCardId;
    }


    /**
     * Sets the smartCardId value for this NAGRA.
     * 
     * @param smartCardId
     */
    public void setSmartCardId(java.lang.String smartCardId) {
        this.smartCardId = smartCardId;
    }


    /**
     * Gets the inventorySN value for this NAGRA.
     * 
     * @return inventorySN
     */
    public java.lang.String getInventorySN() {
        return inventorySN;
    }


    /**
     * Sets the inventorySN value for this NAGRA.
     * 
     * @param inventorySN
     */
    public void setInventorySN(java.lang.String inventorySN) {
        this.inventorySN = inventorySN;
    }


    /**
     * Gets the STBType value for this NAGRA.
     * 
     * @return STBType
     */
    public java.lang.String getSTBType() {
        return STBType;
    }


    /**
     * Sets the STBType value for this NAGRA.
     * 
     * @param STBType
     */
    public void setSTBType(java.lang.String STBType) {
        this.STBType = STBType;
    }


    /**
     * Gets the STBTypeCRMId value for this NAGRA.
     * 
     * @return STBTypeCRMId
     */
    public java.lang.String getSTBTypeCRMId() {
        return STBTypeCRMId;
    }


    /**
     * Sets the STBTypeCRMId value for this NAGRA.
     * 
     * @param STBTypeCRMId
     */
    public void setSTBTypeCRMId(java.lang.String STBTypeCRMId) {
        this.STBTypeCRMId = STBTypeCRMId;
    }


    /**
     * Gets the zone value for this NAGRA.
     * 
     * @return zone
     */
    public java.lang.String getZone() {
        return zone;
    }


    /**
     * Sets the zone value for this NAGRA.
     * 
     * @param zone
     */
    public void setZone(java.lang.String zone) {
        this.zone = zone;
    }


    /**
     * Gets the zoneCRMId value for this NAGRA.
     * 
     * @return zoneCRMId
     */
    public java.lang.String getZoneCRMId() {
        return zoneCRMId;
    }


    /**
     * Sets the zoneCRMId value for this NAGRA.
     * 
     * @param zoneCRMId
     */
    public void setZoneCRMId(java.lang.String zoneCRMId) {
        this.zoneCRMId = zoneCRMId;
    }


    /**
     * Gets the controller value for this NAGRA.
     * 
     * @return controller
     */
    public java.lang.String getController() {
        return controller;
    }


    /**
     * Sets the controller value for this NAGRA.
     * 
     * @param controller
     */
    public void setController(java.lang.String controller) {
        this.controller = controller;
    }


    /**
     * Gets the controllerCRMId value for this NAGRA.
     * 
     * @return controllerCRMId
     */
    public java.lang.String getControllerCRMId() {
        return controllerCRMId;
    }


    /**
     * Sets the controllerCRMId value for this NAGRA.
     * 
     * @param controllerCRMId
     */
    public void setControllerCRMId(java.lang.String controllerCRMId) {
        this.controllerCRMId = controllerCRMId;
    }


    /**
     * Gets the defaultProduct value for this NAGRA.
     * 
     * @return defaultProduct
     */
    public java.lang.String getDefaultProduct() {
        return defaultProduct;
    }


    /**
     * Sets the defaultProduct value for this NAGRA.
     * 
     * @param defaultProduct
     */
    public void setDefaultProduct(java.lang.String defaultProduct) {
        this.defaultProduct = defaultProduct;
    }


    /**
     * Gets the defaultProductCRMId value for this NAGRA.
     * 
     * @return defaultProductCRMId
     */
    public java.lang.String getDefaultProductCRMId() {
        return defaultProductCRMId;
    }


    /**
     * Sets the defaultProductCRMId value for this NAGRA.
     * 
     * @param defaultProductCRMId
     */
    public void setDefaultProductCRMId(java.lang.String defaultProductCRMId) {
        this.defaultProductCRMId = defaultProductCRMId;
    }


    /**
     * Gets the profile value for this NAGRA.
     * 
     * @return profile
     */
    public java.lang.String getProfile() {
        return profile;
    }


    /**
     * Sets the profile value for this NAGRA.
     * 
     * @param profile
     */
    public void setProfile(java.lang.String profile) {
        this.profile = profile;
    }


    /**
     * Gets the profileCRMId value for this NAGRA.
     * 
     * @return profileCRMId
     */
    public java.lang.String getProfileCRMId() {
        return profileCRMId;
    }


    /**
     * Sets the profileCRMId value for this NAGRA.
     * 
     * @param profileCRMId
     */
    public void setProfileCRMId(java.lang.String profileCRMId) {
        this.profileCRMId = profileCRMId;
    }


    /**
     * Gets the ZIPCode value for this NAGRA.
     * 
     * @return ZIPCode
     */
    public java.lang.String getZIPCode() {
        return ZIPCode;
    }


    /**
     * Sets the ZIPCode value for this NAGRA.
     * 
     * @param ZIPCode
     */
    public void setZIPCode(java.lang.String ZIPCode) {
        this.ZIPCode = ZIPCode;
    }


    /**
     * Gets the disabled value for this NAGRA.
     * 
     * @return disabled
     */
    public java.lang.String getDisabled() {
        return disabled;
    }


    /**
     * Sets the disabled value for this NAGRA.
     * 
     * @param disabled
     */
    public void setDisabled(java.lang.String disabled) {
        this.disabled = disabled;
    }


    /**
     * Gets the fechaAlta value for this NAGRA.
     * 
     * @return fechaAlta
     */
    public java.lang.String getFechaAlta() {
        return fechaAlta;
    }


    /**
     * Sets the fechaAlta value for this NAGRA.
     * 
     * @param fechaAlta
     */
    public void setFechaAlta(java.lang.String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }


    /**
     * Gets the fechaModif value for this NAGRA.
     * 
     * @return fechaModif
     */
    public java.lang.String getFechaModif() {
        return fechaModif;
    }


    /**
     * Sets the fechaModif value for this NAGRA.
     * 
     * @param fechaModif
     */
    public void setFechaModif(java.lang.String fechaModif) {
        this.fechaModif = fechaModif;
    }


    /**
     * Gets the fechaActivacion value for this NAGRA.
     * 
     * @return fechaActivacion
     */
    public java.lang.String getFechaActivacion() {
        return fechaActivacion;
    }


    /**
     * Sets the fechaActivacion value for this NAGRA.
     * 
     * @param fechaActivacion
     */
    public void setFechaActivacion(java.lang.String fechaActivacion) {
        this.fechaActivacion = fechaActivacion;
    }


    /**
     * Gets the products value for this NAGRA.
     * 
     * @return products
     */
    public intrawayWS.cliente.NAGRAProducts[] getProducts() {
        return products;
    }


    /**
     * Sets the products value for this NAGRA.
     * 
     * @param products
     */
    public void setProducts(intrawayWS.cliente.NAGRAProducts[] products) {
        this.products = products;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NAGRA)) return false;
        NAGRA other = (NAGRA) obj;
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
            ((this.STBId==null && other.getSTBId()==null) || 
             (this.STBId!=null &&
              this.STBId.equals(other.getSTBId()))) &&
            ((this.smartCardId==null && other.getSmartCardId()==null) || 
             (this.smartCardId!=null &&
              this.smartCardId.equals(other.getSmartCardId()))) &&
            ((this.inventorySN==null && other.getInventorySN()==null) || 
             (this.inventorySN!=null &&
              this.inventorySN.equals(other.getInventorySN()))) &&
            ((this.STBType==null && other.getSTBType()==null) || 
             (this.STBType!=null &&
              this.STBType.equals(other.getSTBType()))) &&
            ((this.STBTypeCRMId==null && other.getSTBTypeCRMId()==null) || 
             (this.STBTypeCRMId!=null &&
              this.STBTypeCRMId.equals(other.getSTBTypeCRMId()))) &&
            ((this.zone==null && other.getZone()==null) || 
             (this.zone!=null &&
              this.zone.equals(other.getZone()))) &&
            ((this.zoneCRMId==null && other.getZoneCRMId()==null) || 
             (this.zoneCRMId!=null &&
              this.zoneCRMId.equals(other.getZoneCRMId()))) &&
            ((this.controller==null && other.getController()==null) || 
             (this.controller!=null &&
              this.controller.equals(other.getController()))) &&
            ((this.controllerCRMId==null && other.getControllerCRMId()==null) || 
             (this.controllerCRMId!=null &&
              this.controllerCRMId.equals(other.getControllerCRMId()))) &&
            ((this.defaultProduct==null && other.getDefaultProduct()==null) || 
             (this.defaultProduct!=null &&
              this.defaultProduct.equals(other.getDefaultProduct()))) &&
            ((this.defaultProductCRMId==null && other.getDefaultProductCRMId()==null) || 
             (this.defaultProductCRMId!=null &&
              this.defaultProductCRMId.equals(other.getDefaultProductCRMId()))) &&
            ((this.profile==null && other.getProfile()==null) || 
             (this.profile!=null &&
              this.profile.equals(other.getProfile()))) &&
            ((this.profileCRMId==null && other.getProfileCRMId()==null) || 
             (this.profileCRMId!=null &&
              this.profileCRMId.equals(other.getProfileCRMId()))) &&
            ((this.ZIPCode==null && other.getZIPCode()==null) || 
             (this.ZIPCode!=null &&
              this.ZIPCode.equals(other.getZIPCode()))) &&
            ((this.disabled==null && other.getDisabled()==null) || 
             (this.disabled!=null &&
              this.disabled.equals(other.getDisabled()))) &&
            ((this.fechaAlta==null && other.getFechaAlta()==null) || 
             (this.fechaAlta!=null &&
              this.fechaAlta.equals(other.getFechaAlta()))) &&
            ((this.fechaModif==null && other.getFechaModif()==null) || 
             (this.fechaModif!=null &&
              this.fechaModif.equals(other.getFechaModif()))) &&
            ((this.fechaActivacion==null && other.getFechaActivacion()==null) || 
             (this.fechaActivacion!=null &&
              this.fechaActivacion.equals(other.getFechaActivacion()))) &&
            ((this.products==null && other.getProducts()==null) || 
             (this.products!=null &&
              java.util.Arrays.equals(this.products, other.getProducts())));
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
        if (getSTBId() != null) {
            _hashCode += getSTBId().hashCode();
        }
        if (getSmartCardId() != null) {
            _hashCode += getSmartCardId().hashCode();
        }
        if (getInventorySN() != null) {
            _hashCode += getInventorySN().hashCode();
        }
        if (getSTBType() != null) {
            _hashCode += getSTBType().hashCode();
        }
        if (getSTBTypeCRMId() != null) {
            _hashCode += getSTBTypeCRMId().hashCode();
        }
        if (getZone() != null) {
            _hashCode += getZone().hashCode();
        }
        if (getZoneCRMId() != null) {
            _hashCode += getZoneCRMId().hashCode();
        }
        if (getController() != null) {
            _hashCode += getController().hashCode();
        }
        if (getControllerCRMId() != null) {
            _hashCode += getControllerCRMId().hashCode();
        }
        if (getDefaultProduct() != null) {
            _hashCode += getDefaultProduct().hashCode();
        }
        if (getDefaultProductCRMId() != null) {
            _hashCode += getDefaultProductCRMId().hashCode();
        }
        if (getProfile() != null) {
            _hashCode += getProfile().hashCode();
        }
        if (getProfileCRMId() != null) {
            _hashCode += getProfileCRMId().hashCode();
        }
        if (getZIPCode() != null) {
            _hashCode += getZIPCode().hashCode();
        }
        if (getDisabled() != null) {
            _hashCode += getDisabled().hashCode();
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
        if (getProducts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProducts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProducts(), i);
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
        new org.apache.axis.description.TypeDesc(NAGRA.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "NAGRA"));
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
        elemField.setFieldName("STBId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "STBId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smartCardId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SmartCardId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventorySN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "InventorySN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STBType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "STBType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STBTypeCRMId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "STBTypeCRMId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Zone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zoneCRMId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZoneCRMId"));
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
        elemField.setFieldName("controllerCRMId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ControllerCRMId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DefaultProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultProductCRMId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DefaultProductCRMId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Profile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profileCRMId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ProfileCRMId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZIPCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZIPCode"));
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
        elemField.setFieldName("products");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Products"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "NAGRAProducts"));
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
