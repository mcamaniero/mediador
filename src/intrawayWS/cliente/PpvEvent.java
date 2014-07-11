/**
 * PpvEvent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package intrawayWS.cliente;

public class PpvEvent  implements java.io.Serializable {
    private java.lang.String eventControllerId;

    private java.lang.String eventName;

    private java.lang.String eventBeginTime;

    private java.lang.String eventDuration;

    private java.lang.String eventChannelNo;

    private java.lang.String eventChannelName;

    public PpvEvent() {
    }

    public PpvEvent(
           java.lang.String eventControllerId,
           java.lang.String eventName,
           java.lang.String eventBeginTime,
           java.lang.String eventDuration,
           java.lang.String eventChannelNo,
           java.lang.String eventChannelName) {
           this.eventControllerId = eventControllerId;
           this.eventName = eventName;
           this.eventBeginTime = eventBeginTime;
           this.eventDuration = eventDuration;
           this.eventChannelNo = eventChannelNo;
           this.eventChannelName = eventChannelName;
    }


    /**
     * Gets the eventControllerId value for this PpvEvent.
     * 
     * @return eventControllerId
     */
    public java.lang.String getEventControllerId() {
        return eventControllerId;
    }


    /**
     * Sets the eventControllerId value for this PpvEvent.
     * 
     * @param eventControllerId
     */
    public void setEventControllerId(java.lang.String eventControllerId) {
        this.eventControllerId = eventControllerId;
    }


    /**
     * Gets the eventName value for this PpvEvent.
     * 
     * @return eventName
     */
    public java.lang.String getEventName() {
        return eventName;
    }


    /**
     * Sets the eventName value for this PpvEvent.
     * 
     * @param eventName
     */
    public void setEventName(java.lang.String eventName) {
        this.eventName = eventName;
    }


    /**
     * Gets the eventBeginTime value for this PpvEvent.
     * 
     * @return eventBeginTime
     */
    public java.lang.String getEventBeginTime() {
        return eventBeginTime;
    }


    /**
     * Sets the eventBeginTime value for this PpvEvent.
     * 
     * @param eventBeginTime
     */
    public void setEventBeginTime(java.lang.String eventBeginTime) {
        this.eventBeginTime = eventBeginTime;
    }


    /**
     * Gets the eventDuration value for this PpvEvent.
     * 
     * @return eventDuration
     */
    public java.lang.String getEventDuration() {
        return eventDuration;
    }


    /**
     * Sets the eventDuration value for this PpvEvent.
     * 
     * @param eventDuration
     */
    public void setEventDuration(java.lang.String eventDuration) {
        this.eventDuration = eventDuration;
    }


    /**
     * Gets the eventChannelNo value for this PpvEvent.
     * 
     * @return eventChannelNo
     */
    public java.lang.String getEventChannelNo() {
        return eventChannelNo;
    }


    /**
     * Sets the eventChannelNo value for this PpvEvent.
     * 
     * @param eventChannelNo
     */
    public void setEventChannelNo(java.lang.String eventChannelNo) {
        this.eventChannelNo = eventChannelNo;
    }


    /**
     * Gets the eventChannelName value for this PpvEvent.
     * 
     * @return eventChannelName
     */
    public java.lang.String getEventChannelName() {
        return eventChannelName;
    }


    /**
     * Sets the eventChannelName value for this PpvEvent.
     * 
     * @param eventChannelName
     */
    public void setEventChannelName(java.lang.String eventChannelName) {
        this.eventChannelName = eventChannelName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PpvEvent)) return false;
        PpvEvent other = (PpvEvent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.eventControllerId==null && other.getEventControllerId()==null) || 
             (this.eventControllerId!=null &&
              this.eventControllerId.equals(other.getEventControllerId()))) &&
            ((this.eventName==null && other.getEventName()==null) || 
             (this.eventName!=null &&
              this.eventName.equals(other.getEventName()))) &&
            ((this.eventBeginTime==null && other.getEventBeginTime()==null) || 
             (this.eventBeginTime!=null &&
              this.eventBeginTime.equals(other.getEventBeginTime()))) &&
            ((this.eventDuration==null && other.getEventDuration()==null) || 
             (this.eventDuration!=null &&
              this.eventDuration.equals(other.getEventDuration()))) &&
            ((this.eventChannelNo==null && other.getEventChannelNo()==null) || 
             (this.eventChannelNo!=null &&
              this.eventChannelNo.equals(other.getEventChannelNo()))) &&
            ((this.eventChannelName==null && other.getEventChannelName()==null) || 
             (this.eventChannelName!=null &&
              this.eventChannelName.equals(other.getEventChannelName())));
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
        if (getEventControllerId() != null) {
            _hashCode += getEventControllerId().hashCode();
        }
        if (getEventName() != null) {
            _hashCode += getEventName().hashCode();
        }
        if (getEventBeginTime() != null) {
            _hashCode += getEventBeginTime().hashCode();
        }
        if (getEventDuration() != null) {
            _hashCode += getEventDuration().hashCode();
        }
        if (getEventChannelNo() != null) {
            _hashCode += getEventChannelNo().hashCode();
        }
        if (getEventChannelName() != null) {
            _hashCode += getEventChannelName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PpvEvent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "PpvEvent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventControllerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventControllerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventBeginTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventBeginTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventChannelNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventChannelNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventChannelName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventChannelName"));
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
