
package ec.com.grupotvcable.wsdlwimax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Wimax complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Wimax">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MacAddress" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Ip" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BsiIdentificar" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NombreC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Citem" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Servicio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustomConfing" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PortVlan" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Accion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RegistroChannel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DatoW1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DatoW2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Wimax", propOrder = {
    "macAddress",
    "ip",
    "bsiIdentificar",
    "nombreC",
    "citem",
    "servicio",
    "customConfing",
    "portVlan",
    "accion",
    "registroChannel",
    "datoW1",
    "datoW2"
})
public class Wimax {

    @XmlElement(name = "MacAddress")
    protected int macAddress;
    @XmlElement(name = "Ip", required = true)
    protected String ip;
    @XmlElement(name = "BsiIdentificar", required = true)
    protected String bsiIdentificar;
    @XmlElement(name = "NombreC", required = true)
    protected String nombreC;
    @XmlElement(name = "Citem")
    protected int citem;
    @XmlElement(name = "Servicio", required = true)
    protected String servicio;
    @XmlElement(name = "CustomConfing", required = true)
    protected String customConfing;
    @XmlElement(name = "PortVlan", required = true)
    protected String portVlan;
    @XmlElement(name = "Accion")
    protected int accion;
    @XmlElement(name = "RegistroChannel", required = true)
    protected String registroChannel;
    @XmlElement(name = "DatoW1", required = true)
    protected String datoW1;
    @XmlElement(name = "DatoW2", required = true)
    protected String datoW2;

    /**
     * Gets the value of the macAddress property.
     * 
     */
    public int getMacAddress() {
        return macAddress;
    }

    /**
     * Sets the value of the macAddress property.
     * 
     */
    public void setMacAddress(int value) {
        this.macAddress = value;
    }

    /**
     * Gets the value of the ip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIp() {
        return ip;
    }

    /**
     * Sets the value of the ip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIp(String value) {
        this.ip = value;
    }

    /**
     * Gets the value of the bsiIdentificar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBsiIdentificar() {
        return bsiIdentificar;
    }

    /**
     * Sets the value of the bsiIdentificar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBsiIdentificar(String value) {
        this.bsiIdentificar = value;
    }

    /**
     * Gets the value of the nombreC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreC() {
        return nombreC;
    }

    /**
     * Sets the value of the nombreC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreC(String value) {
        this.nombreC = value;
    }

    /**
     * Gets the value of the citem property.
     * 
     */
    public int getCitem() {
        return citem;
    }

    /**
     * Sets the value of the citem property.
     * 
     */
    public void setCitem(int value) {
        this.citem = value;
    }

    /**
     * Gets the value of the servicio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicio() {
        return servicio;
    }

    /**
     * Sets the value of the servicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicio(String value) {
        this.servicio = value;
    }

    /**
     * Gets the value of the customConfing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomConfing() {
        return customConfing;
    }

    /**
     * Sets the value of the customConfing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomConfing(String value) {
        this.customConfing = value;
    }

    /**
     * Gets the value of the portVlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortVlan() {
        return portVlan;
    }

    /**
     * Sets the value of the portVlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortVlan(String value) {
        this.portVlan = value;
    }

    /**
     * Gets the value of the accion property.
     * 
     */
    public int getAccion() {
        return accion;
    }

    /**
     * Sets the value of the accion property.
     * 
     */
    public void setAccion(int value) {
        this.accion = value;
    }

    /**
     * Gets the value of the registroChannel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistroChannel() {
        return registroChannel;
    }

    /**
     * Sets the value of the registroChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistroChannel(String value) {
        this.registroChannel = value;
    }

    /**
     * Gets the value of the datoW1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoW1() {
        return datoW1;
    }

    /**
     * Sets the value of the datoW1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoW1(String value) {
        this.datoW1 = value;
    }

    /**
     * Gets the value of the datoW2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoW2() {
        return datoW2;
    }

    /**
     * Sets the value of the datoW2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoW2(String value) {
        this.datoW2 = value;
    }

}
