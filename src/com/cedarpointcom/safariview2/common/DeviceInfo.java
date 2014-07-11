/**
 * DeviceInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.cedarpointcom.safariview2.common;

public class DeviceInfo  implements java.io.Serializable {
    private boolean connected;

    private java.lang.String deviceType;

    private java.lang.String genericAttrs;

    private boolean hasPoorConnection;

    private java.lang.String host;

    private java.lang.String id;

    private boolean inSync;

    private boolean liveUpgrade;

    private java.lang.String location;

    private java.lang.String name;

    private java.lang.String notes;

    private int port;

    private java.lang.String severity;

    private boolean trapsEnabled;

    private java.lang.String version;

    private java.lang.Object versionNumber;

    public DeviceInfo() {
    }

    public DeviceInfo(
           boolean connected,
           java.lang.String deviceType,
           java.lang.String genericAttrs,
           boolean hasPoorConnection,
           java.lang.String host,
           java.lang.String id,
           boolean inSync,
           boolean liveUpgrade,
           java.lang.String location,
           java.lang.String name,
           java.lang.String notes,
           int port,
           java.lang.String severity,
           boolean trapsEnabled,
           java.lang.String version,
           java.lang.Object versionNumber) {
           this.connected = connected;
           this.deviceType = deviceType;
           this.genericAttrs = genericAttrs;
           this.hasPoorConnection = hasPoorConnection;
           this.host = host;
           this.id = id;
           this.inSync = inSync;
           this.liveUpgrade = liveUpgrade;
           this.location = location;
           this.name = name;
           this.notes = notes;
           this.port = port;
           this.severity = severity;
           this.trapsEnabled = trapsEnabled;
           this.version = version;
           this.versionNumber = versionNumber;
    }


    /**
     * Gets the connected value for this DeviceInfo.
     * 
     * @return connected
     */
    public boolean isConnected() {
        return connected;
    }


    /**
     * Sets the connected value for this DeviceInfo.
     * 
     * @param connected
     */
    public void setConnected(boolean connected) {
        this.connected = connected;
    }


    /**
     * Gets the deviceType value for this DeviceInfo.
     * 
     * @return deviceType
     */
    public java.lang.String getDeviceType() {
        return deviceType;
    }


    /**
     * Sets the deviceType value for this DeviceInfo.
     * 
     * @param deviceType
     */
    public void setDeviceType(java.lang.String deviceType) {
        this.deviceType = deviceType;
    }


    /**
     * Gets the genericAttrs value for this DeviceInfo.
     * 
     * @return genericAttrs
     */
    public java.lang.String getGenericAttrs() {
        return genericAttrs;
    }


    /**
     * Sets the genericAttrs value for this DeviceInfo.
     * 
     * @param genericAttrs
     */
    public void setGenericAttrs(java.lang.String genericAttrs) {
        this.genericAttrs = genericAttrs;
    }


    /**
     * Gets the hasPoorConnection value for this DeviceInfo.
     * 
     * @return hasPoorConnection
     */
    public boolean isHasPoorConnection() {
        return hasPoorConnection;
    }


    /**
     * Sets the hasPoorConnection value for this DeviceInfo.
     * 
     * @param hasPoorConnection
     */
    public void setHasPoorConnection(boolean hasPoorConnection) {
        this.hasPoorConnection = hasPoorConnection;
    }


    /**
     * Gets the host value for this DeviceInfo.
     * 
     * @return host
     */
    public java.lang.String getHost() {
        return host;
    }


    /**
     * Sets the host value for this DeviceInfo.
     * 
     * @param host
     */
    public void setHost(java.lang.String host) {
        this.host = host;
    }


    /**
     * Gets the id value for this DeviceInfo.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this DeviceInfo.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the inSync value for this DeviceInfo.
     * 
     * @return inSync
     */
    public boolean isInSync() {
        return inSync;
    }


    /**
     * Sets the inSync value for this DeviceInfo.
     * 
     * @param inSync
     */
    public void setInSync(boolean inSync) {
        this.inSync = inSync;
    }


    /**
     * Gets the liveUpgrade value for this DeviceInfo.
     * 
     * @return liveUpgrade
     */
    public boolean isLiveUpgrade() {
        return liveUpgrade;
    }


    /**
     * Sets the liveUpgrade value for this DeviceInfo.
     * 
     * @param liveUpgrade
     */
    public void setLiveUpgrade(boolean liveUpgrade) {
        this.liveUpgrade = liveUpgrade;
    }


    /**
     * Gets the location value for this DeviceInfo.
     * 
     * @return location
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this DeviceInfo.
     * 
     * @param location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }


    /**
     * Gets the name value for this DeviceInfo.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DeviceInfo.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notes value for this DeviceInfo.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this DeviceInfo.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the port value for this DeviceInfo.
     * 
     * @return port
     */
    public int getPort() {
        return port;
    }


    /**
     * Sets the port value for this DeviceInfo.
     * 
     * @param port
     */
    public void setPort(int port) {
        this.port = port;
    }


    /**
     * Gets the severity value for this DeviceInfo.
     * 
     * @return severity
     */
    public java.lang.String getSeverity() {
        return severity;
    }


    /**
     * Sets the severity value for this DeviceInfo.
     * 
     * @param severity
     */
    public void setSeverity(java.lang.String severity) {
        this.severity = severity;
    }


    /**
     * Gets the trapsEnabled value for this DeviceInfo.
     * 
     * @return trapsEnabled
     */
    public boolean isTrapsEnabled() {
        return trapsEnabled;
    }


    /**
     * Sets the trapsEnabled value for this DeviceInfo.
     * 
     * @param trapsEnabled
     */
    public void setTrapsEnabled(boolean trapsEnabled) {
        this.trapsEnabled = trapsEnabled;
    }


    /**
     * Gets the version value for this DeviceInfo.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this DeviceInfo.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the versionNumber value for this DeviceInfo.
     * 
     * @return versionNumber
     */
    public java.lang.Object getVersionNumber() {
        return versionNumber;
    }


    /**
     * Sets the versionNumber value for this DeviceInfo.
     * 
     * @param versionNumber
     */
    public void setVersionNumber(java.lang.Object versionNumber) {
        this.versionNumber = versionNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeviceInfo)) return false;
        DeviceInfo other = (DeviceInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.connected == other.isConnected() &&
            ((this.deviceType==null && other.getDeviceType()==null) || 
             (this.deviceType!=null &&
              this.deviceType.equals(other.getDeviceType()))) &&
            ((this.genericAttrs==null && other.getGenericAttrs()==null) || 
             (this.genericAttrs!=null &&
              this.genericAttrs.equals(other.getGenericAttrs()))) &&
            this.hasPoorConnection == other.isHasPoorConnection() &&
            ((this.host==null && other.getHost()==null) || 
             (this.host!=null &&
              this.host.equals(other.getHost()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            this.inSync == other.isInSync() &&
            this.liveUpgrade == other.isLiveUpgrade() &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            this.port == other.getPort() &&
            ((this.severity==null && other.getSeverity()==null) || 
             (this.severity!=null &&
              this.severity.equals(other.getSeverity()))) &&
            this.trapsEnabled == other.isTrapsEnabled() &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.versionNumber==null && other.getVersionNumber()==null) || 
             (this.versionNumber!=null &&
              this.versionNumber.equals(other.getVersionNumber())));
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
        _hashCode += (isConnected() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDeviceType() != null) {
            _hashCode += getDeviceType().hashCode();
        }
        if (getGenericAttrs() != null) {
            _hashCode += getGenericAttrs().hashCode();
        }
        _hashCode += (isHasPoorConnection() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getHost() != null) {
            _hashCode += getHost().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        _hashCode += (isInSync() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isLiveUpgrade() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        _hashCode += getPort();
        if (getSeverity() != null) {
            _hashCode += getSeverity().hashCode();
        }
        _hashCode += (isTrapsEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getVersionNumber() != null) {
            _hashCode += getVersionNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeviceInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://common.safariview2.cedarpointcom.com", "DeviceInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connected");
        elemField.setXmlName(new javax.xml.namespace.QName("", "connected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genericAttrs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "genericAttrs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasPoorConnection");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasPoorConnection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inSync");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inSync"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("liveUpgrade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "liveUpgrade"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("port");
        elemField.setXmlName(new javax.xml.namespace.QName("", "port"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "severity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trapsEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trapsEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("versionNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "versionNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
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
