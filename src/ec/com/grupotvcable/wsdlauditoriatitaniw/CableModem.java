
package ec.com.grupotvcable.wsdlauditoriatitaniw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CableModem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CableModem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MacAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ServicePackege" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Cpe" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IdProducto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Mta" type="{http://www.grupotvcable.com.ec/WsdlAuditoriaTitanIw/}Mta"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CableModem", propOrder = {
    "macAddress",
    "servicePackege",
    "cpe",
    "idProducto",
    "estado",
    "mta"
})
public class CableModem {

    @XmlElement(name = "MacAddress", required = true)
    protected String macAddress;
    @XmlElement(name = "ServicePackege", required = true)
    protected String servicePackege;
    @XmlElement(name = "Cpe", required = true)
    protected String cpe;
    @XmlElement(name = "IdProducto", required = true)
    protected String idProducto;
    @XmlElement(name = "Estado", required = true)
    protected String estado;
    @XmlElement(name = "Mta", required = true)
    protected Mta mta;

    /**
     * Gets the value of the macAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * Sets the value of the macAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMacAddress(String value) {
        this.macAddress = value;
    }

    /**
     * Gets the value of the servicePackege property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicePackege() {
        return servicePackege;
    }

    /**
     * Sets the value of the servicePackege property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicePackege(String value) {
        this.servicePackege = value;
    }

    /**
     * Gets the value of the cpe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpe() {
        return cpe;
    }

    /**
     * Sets the value of the cpe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpe(String value) {
        this.cpe = value;
    }

    /**
     * Gets the value of the idProducto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdProducto() {
        return idProducto;
    }

    /**
     * Sets the value of the idProducto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdProducto(String value) {
        this.idProducto = value;
    }

    /**
     * Gets the value of the estado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Gets the value of the mta property.
     * 
     * @return
     *     possible object is
     *     {@link Mta }
     *     
     */
    public Mta getMta() {
        return mta;
    }

    /**
     * Sets the value of the mta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mta }
     *     
     */
    public void setMta(Mta value) {
        this.mta = value;
    }

}
