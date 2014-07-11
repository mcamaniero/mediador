/**
 * PackageOutput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package intrawayWS.cliente;

public class PackageOutput  implements java.io.Serializable {
    private java.lang.String packageId;

    private java.lang.String name;

    private java.lang.String category;

    private intrawayWS.cliente.SchedulesOutput[] schedules;

    public PackageOutput() {
    }

    public PackageOutput(
           java.lang.String packageId,
           java.lang.String name,
           java.lang.String category,
           intrawayWS.cliente.SchedulesOutput[] schedules) {
           this.packageId = packageId;
           this.name = name;
           this.category = category;
           this.schedules = schedules;
    }


    /**
     * Gets the packageId value for this PackageOutput.
     * 
     * @return packageId
     */
    public java.lang.String getPackageId() {
        return packageId;
    }


    /**
     * Sets the packageId value for this PackageOutput.
     * 
     * @param packageId
     */
    public void setPackageId(java.lang.String packageId) {
        this.packageId = packageId;
    }


    /**
     * Gets the name value for this PackageOutput.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this PackageOutput.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the category value for this PackageOutput.
     * 
     * @return category
     */
    public java.lang.String getCategory() {
        return category;
    }


    /**
     * Sets the category value for this PackageOutput.
     * 
     * @param category
     */
    public void setCategory(java.lang.String category) {
        this.category = category;
    }


    /**
     * Gets the schedules value for this PackageOutput.
     * 
     * @return schedules
     */
    public intrawayWS.cliente.SchedulesOutput[] getSchedules() {
        return schedules;
    }


    /**
     * Sets the schedules value for this PackageOutput.
     * 
     * @param schedules
     */
    public void setSchedules(intrawayWS.cliente.SchedulesOutput[] schedules) {
        this.schedules = schedules;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PackageOutput)) return false;
        PackageOutput other = (PackageOutput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.packageId==null && other.getPackageId()==null) || 
             (this.packageId!=null &&
              this.packageId.equals(other.getPackageId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.schedules==null && other.getSchedules()==null) || 
             (this.schedules!=null &&
              java.util.Arrays.equals(this.schedules, other.getSchedules())));
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
        if (getPackageId() != null) {
            _hashCode += getPackageId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getSchedules() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSchedules());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSchedules(), i);
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
        new org.apache.axis.description.TypeDesc(PackageOutput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "PackageOutput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PackageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Category"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schedules");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Schedules"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "SchedulesOutput"));
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
