/**
 * ScheduleOutput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package intrawayWS.cliente;

public class ScheduleOutput  implements java.io.Serializable {
    private java.lang.String packageScheduleId;

    private java.lang.String CRMId;

    private java.lang.String price;

    private java.lang.String beginDate;

    private java.lang.String beginTime;

    private java.lang.String duration;

    private java.lang.String purchaseWindow;

    private intrawayWS.cliente.EventsOutput[] events;

    public ScheduleOutput() {
    }

    public ScheduleOutput(
           java.lang.String packageScheduleId,
           java.lang.String CRMId,
           java.lang.String price,
           java.lang.String beginDate,
           java.lang.String beginTime,
           java.lang.String duration,
           java.lang.String purchaseWindow,
           intrawayWS.cliente.EventsOutput[] events) {
           this.packageScheduleId = packageScheduleId;
           this.CRMId = CRMId;
           this.price = price;
           this.beginDate = beginDate;
           this.beginTime = beginTime;
           this.duration = duration;
           this.purchaseWindow = purchaseWindow;
           this.events = events;
    }


    /**
     * Gets the packageScheduleId value for this ScheduleOutput.
     * 
     * @return packageScheduleId
     */
    public java.lang.String getPackageScheduleId() {
        return packageScheduleId;
    }


    /**
     * Sets the packageScheduleId value for this ScheduleOutput.
     * 
     * @param packageScheduleId
     */
    public void setPackageScheduleId(java.lang.String packageScheduleId) {
        this.packageScheduleId = packageScheduleId;
    }


    /**
     * Gets the CRMId value for this ScheduleOutput.
     * 
     * @return CRMId
     */
    public java.lang.String getCRMId() {
        return CRMId;
    }


    /**
     * Sets the CRMId value for this ScheduleOutput.
     * 
     * @param CRMId
     */
    public void setCRMId(java.lang.String CRMId) {
        this.CRMId = CRMId;
    }


    /**
     * Gets the price value for this ScheduleOutput.
     * 
     * @return price
     */
    public java.lang.String getPrice() {
        return price;
    }


    /**
     * Sets the price value for this ScheduleOutput.
     * 
     * @param price
     */
    public void setPrice(java.lang.String price) {
        this.price = price;
    }


    /**
     * Gets the beginDate value for this ScheduleOutput.
     * 
     * @return beginDate
     */
    public java.lang.String getBeginDate() {
        return beginDate;
    }


    /**
     * Sets the beginDate value for this ScheduleOutput.
     * 
     * @param beginDate
     */
    public void setBeginDate(java.lang.String beginDate) {
        this.beginDate = beginDate;
    }


    /**
     * Gets the beginTime value for this ScheduleOutput.
     * 
     * @return beginTime
     */
    public java.lang.String getBeginTime() {
        return beginTime;
    }


    /**
     * Sets the beginTime value for this ScheduleOutput.
     * 
     * @param beginTime
     */
    public void setBeginTime(java.lang.String beginTime) {
        this.beginTime = beginTime;
    }


    /**
     * Gets the duration value for this ScheduleOutput.
     * 
     * @return duration
     */
    public java.lang.String getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this ScheduleOutput.
     * 
     * @param duration
     */
    public void setDuration(java.lang.String duration) {
        this.duration = duration;
    }


    /**
     * Gets the purchaseWindow value for this ScheduleOutput.
     * 
     * @return purchaseWindow
     */
    public java.lang.String getPurchaseWindow() {
        return purchaseWindow;
    }


    /**
     * Sets the purchaseWindow value for this ScheduleOutput.
     * 
     * @param purchaseWindow
     */
    public void setPurchaseWindow(java.lang.String purchaseWindow) {
        this.purchaseWindow = purchaseWindow;
    }


    /**
     * Gets the events value for this ScheduleOutput.
     * 
     * @return events
     */
    public intrawayWS.cliente.EventsOutput[] getEvents() {
        return events;
    }


    /**
     * Sets the events value for this ScheduleOutput.
     * 
     * @param events
     */
    public void setEvents(intrawayWS.cliente.EventsOutput[] events) {
        this.events = events;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ScheduleOutput)) return false;
        ScheduleOutput other = (ScheduleOutput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.packageScheduleId==null && other.getPackageScheduleId()==null) || 
             (this.packageScheduleId!=null &&
              this.packageScheduleId.equals(other.getPackageScheduleId()))) &&
            ((this.CRMId==null && other.getCRMId()==null) || 
             (this.CRMId!=null &&
              this.CRMId.equals(other.getCRMId()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.beginDate==null && other.getBeginDate()==null) || 
             (this.beginDate!=null &&
              this.beginDate.equals(other.getBeginDate()))) &&
            ((this.beginTime==null && other.getBeginTime()==null) || 
             (this.beginTime!=null &&
              this.beginTime.equals(other.getBeginTime()))) &&
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration()))) &&
            ((this.purchaseWindow==null && other.getPurchaseWindow()==null) || 
             (this.purchaseWindow!=null &&
              this.purchaseWindow.equals(other.getPurchaseWindow()))) &&
            ((this.events==null && other.getEvents()==null) || 
             (this.events!=null &&
              java.util.Arrays.equals(this.events, other.getEvents())));
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
        if (getPackageScheduleId() != null) {
            _hashCode += getPackageScheduleId().hashCode();
        }
        if (getCRMId() != null) {
            _hashCode += getCRMId().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getBeginDate() != null) {
            _hashCode += getBeginDate().hashCode();
        }
        if (getBeginTime() != null) {
            _hashCode += getBeginTime().hashCode();
        }
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        if (getPurchaseWindow() != null) {
            _hashCode += getPurchaseWindow().hashCode();
        }
        if (getEvents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEvents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEvents(), i);
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
        new org.apache.axis.description.TypeDesc(ScheduleOutput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "ScheduleOutput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageScheduleId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PackageScheduleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CRMId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CRMId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beginDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BeginDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beginTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "BeginTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseWindow");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PurchaseWindow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("events");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Events"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "EventsOutput"));
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
