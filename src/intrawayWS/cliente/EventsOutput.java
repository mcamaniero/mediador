/**
 * EventsOutput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package intrawayWS.cliente;

public class EventsOutput  implements java.io.Serializable {
    private intrawayWS.cliente.EventOutput[] event;

    public EventsOutput() {
    }

    public EventsOutput(
           intrawayWS.cliente.EventOutput[] event) {
           this.event = event;
    }


    /**
     * Gets the event value for this EventsOutput.
     * 
     * @return event
     */
    public intrawayWS.cliente.EventOutput[] getEvent() {
        return event;
    }


    /**
     * Sets the event value for this EventsOutput.
     * 
     * @param event
     */
    public void setEvent(intrawayWS.cliente.EventOutput[] event) {
        this.event = event;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EventsOutput)) return false;
        EventsOutput other = (EventsOutput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.event==null && other.getEvent()==null) || 
             (this.event!=null &&
              java.util.Arrays.equals(this.event, other.getEvent())));
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
        if (getEvent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEvent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEvent(), i);
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
        new org.apache.axis.description.TypeDesc(EventsOutput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "EventsOutput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("event");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Event"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "EventOutput"));
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
