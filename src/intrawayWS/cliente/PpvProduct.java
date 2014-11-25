/**
 * PpvProduct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package intrawayWS.cliente;

public class PpvProduct  implements java.io.Serializable {
    private java.lang.String productCRMId;

    private java.lang.String productControllerId;

    private java.lang.String productName;

    private java.lang.String productBeginDate;

    private java.lang.String productEndDate;

    private java.lang.String productPrice;

    private java.lang.String productValidityStart;

    private java.lang.String productValidityEnd;

    private intrawayWS.cliente.PpvEvent[] productEvents;

    public PpvProduct() {
    }

    public PpvProduct(
           java.lang.String productCRMId,
           java.lang.String productControllerId,
           java.lang.String productName,
           java.lang.String productBeginDate,
           java.lang.String productEndDate,
           java.lang.String productPrice,
           java.lang.String productValidityStart,
           java.lang.String productValidityEnd,
           intrawayWS.cliente.PpvEvent[] productEvents) {
           this.productCRMId = productCRMId;
           this.productControllerId = productControllerId;
           this.productName = productName;
           this.productBeginDate = productBeginDate;
           this.productEndDate = productEndDate;
           this.productPrice = productPrice;
           this.productValidityStart = productValidityStart;
           this.productValidityEnd = productValidityEnd;
           this.productEvents = productEvents;
    }


    /**
     * Gets the productCRMId value for this PpvProduct.
     * 
     * @return productCRMId
     */
    public java.lang.String getProductCRMId() {
        return productCRMId;
    }


    /**
     * Sets the productCRMId value for this PpvProduct.
     * 
     * @param productCRMId
     */
    public void setProductCRMId(java.lang.String productCRMId) {
        this.productCRMId = productCRMId;
    }


    /**
     * Gets the productControllerId value for this PpvProduct.
     * 
     * @return productControllerId
     */
    public java.lang.String getProductControllerId() {
        return productControllerId;
    }


    /**
     * Sets the productControllerId value for this PpvProduct.
     * 
     * @param productControllerId
     */
    public void setProductControllerId(java.lang.String productControllerId) {
        this.productControllerId = productControllerId;
    }


    /**
     * Gets the productName value for this PpvProduct.
     * 
     * @return productName
     */
    public java.lang.String getProductName() {
        return productName;
    }


    /**
     * Sets the productName value for this PpvProduct.
     * 
     * @param productName
     */
    public void setProductName(java.lang.String productName) {
        this.productName = productName;
    }


    /**
     * Gets the productBeginDate value for this PpvProduct.
     * 
     * @return productBeginDate
     */
    public java.lang.String getProductBeginDate() {
        return productBeginDate;
    }


    /**
     * Sets the productBeginDate value for this PpvProduct.
     * 
     * @param productBeginDate
     */
    public void setProductBeginDate(java.lang.String productBeginDate) {
        this.productBeginDate = productBeginDate;
    }


    /**
     * Gets the productEndDate value for this PpvProduct.
     * 
     * @return productEndDate
     */
    public java.lang.String getProductEndDate() {
        return productEndDate;
    }


    /**
     * Sets the productEndDate value for this PpvProduct.
     * 
     * @param productEndDate
     */
    public void setProductEndDate(java.lang.String productEndDate) {
        this.productEndDate = productEndDate;
    }


    /**
     * Gets the productPrice value for this PpvProduct.
     * 
     * @return productPrice
     */
    public java.lang.String getProductPrice() {
        return productPrice;
    }


    /**
     * Sets the productPrice value for this PpvProduct.
     * 
     * @param productPrice
     */
    public void setProductPrice(java.lang.String productPrice) {
        this.productPrice = productPrice;
    }


    /**
     * Gets the productValidityStart value for this PpvProduct.
     * 
     * @return productValidityStart
     */
    public java.lang.String getProductValidityStart() {
        return productValidityStart;
    }


    /**
     * Sets the productValidityStart value for this PpvProduct.
     * 
     * @param productValidityStart
     */
    public void setProductValidityStart(java.lang.String productValidityStart) {
        this.productValidityStart = productValidityStart;
    }


    /**
     * Gets the productValidityEnd value for this PpvProduct.
     * 
     * @return productValidityEnd
     */
    public java.lang.String getProductValidityEnd() {
        return productValidityEnd;
    }


    /**
     * Sets the productValidityEnd value for this PpvProduct.
     * 
     * @param productValidityEnd
     */
    public void setProductValidityEnd(java.lang.String productValidityEnd) {
        this.productValidityEnd = productValidityEnd;
    }


    /**
     * Gets the productEvents value for this PpvProduct.
     * 
     * @return productEvents
     */
    public intrawayWS.cliente.PpvEvent[] getProductEvents() {
        return productEvents;
    }


    /**
     * Sets the productEvents value for this PpvProduct.
     * 
     * @param productEvents
     */
    public void setProductEvents(intrawayWS.cliente.PpvEvent[] productEvents) {
        this.productEvents = productEvents;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PpvProduct)) return false;
        PpvProduct other = (PpvProduct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.productCRMId==null && other.getProductCRMId()==null) || 
             (this.productCRMId!=null &&
              this.productCRMId.equals(other.getProductCRMId()))) &&
            ((this.productControllerId==null && other.getProductControllerId()==null) || 
             (this.productControllerId!=null &&
              this.productControllerId.equals(other.getProductControllerId()))) &&
            ((this.productName==null && other.getProductName()==null) || 
             (this.productName!=null &&
              this.productName.equals(other.getProductName()))) &&
            ((this.productBeginDate==null && other.getProductBeginDate()==null) || 
             (this.productBeginDate!=null &&
              this.productBeginDate.equals(other.getProductBeginDate()))) &&
            ((this.productEndDate==null && other.getProductEndDate()==null) || 
             (this.productEndDate!=null &&
              this.productEndDate.equals(other.getProductEndDate()))) &&
            ((this.productPrice==null && other.getProductPrice()==null) || 
             (this.productPrice!=null &&
              this.productPrice.equals(other.getProductPrice()))) &&
            ((this.productValidityStart==null && other.getProductValidityStart()==null) || 
             (this.productValidityStart!=null &&
              this.productValidityStart.equals(other.getProductValidityStart()))) &&
            ((this.productValidityEnd==null && other.getProductValidityEnd()==null) || 
             (this.productValidityEnd!=null &&
              this.productValidityEnd.equals(other.getProductValidityEnd()))) &&
            ((this.productEvents==null && other.getProductEvents()==null) || 
             (this.productEvents!=null &&
              java.util.Arrays.equals(this.productEvents, other.getProductEvents())));
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
        if (getProductCRMId() != null) {
            _hashCode += getProductCRMId().hashCode();
        }
        if (getProductControllerId() != null) {
            _hashCode += getProductControllerId().hashCode();
        }
        if (getProductName() != null) {
            _hashCode += getProductName().hashCode();
        }
        if (getProductBeginDate() != null) {
            _hashCode += getProductBeginDate().hashCode();
        }
        if (getProductEndDate() != null) {
            _hashCode += getProductEndDate().hashCode();
        }
        if (getProductPrice() != null) {
            _hashCode += getProductPrice().hashCode();
        }
        if (getProductValidityStart() != null) {
            _hashCode += getProductValidityStart().hashCode();
        }
        if (getProductValidityEnd() != null) {
            _hashCode += getProductValidityEnd().hashCode();
        }
        if (getProductEvents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductEvents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductEvents(), i);
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
        new org.apache.axis.description.TypeDesc(PpvProduct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "PpvProduct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productCRMId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productCRMId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productControllerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productControllerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productBeginDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productBeginDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productValidityStart");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productValidityStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productValidityEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productValidityEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productEvents");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productEvents"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "PpvEvent"));
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
