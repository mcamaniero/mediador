/**
 * SchedulesOutput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package intrawayWS.cliente;

public class SchedulesOutput  implements java.io.Serializable {
    private intrawayWS.cliente.ScheduleOutput[] schedule;

    public SchedulesOutput() {
    }

    public SchedulesOutput(
           intrawayWS.cliente.ScheduleOutput[] schedule) {
           this.schedule = schedule;
    }


    /**
     * Gets the schedule value for this SchedulesOutput.
     * 
     * @return schedule
     */
    public intrawayWS.cliente.ScheduleOutput[] getSchedule() {
        return schedule;
    }


    /**
     * Sets the schedule value for this SchedulesOutput.
     * 
     * @param schedule
     */
    public void setSchedule(intrawayWS.cliente.ScheduleOutput[] schedule) {
        this.schedule = schedule;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SchedulesOutput)) return false;
        SchedulesOutput other = (SchedulesOutput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.schedule==null && other.getSchedule()==null) || 
             (this.schedule!=null &&
              java.util.Arrays.equals(this.schedule, other.getSchedule())));
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
        if (getSchedule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSchedule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSchedule(), i);
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
        new org.apache.axis.description.TypeDesc(SchedulesOutput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "SchedulesOutput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schedule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Schedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "ScheduleOutput"));
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
