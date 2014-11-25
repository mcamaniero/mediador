
package ec.com.grupotvcable.wsdlauditoriatitaniw;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Mta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Mta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MacAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Modelo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MtaProfile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IdProducto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IdProductoPadre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EndPoints" type="{http://www.grupotvcable.com.ec/WsdlAuditoriaTitanIw/}EndPoints" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mta", propOrder = {
    "macAddress",
    "modelo",
    "mtaProfile",
    "idProducto",
    "idProductoPadre",
    "estado",
    "endPoints"
})
public class Mta {

    @XmlElement(name = "MacAddress", required = true)
    protected String macAddress;
    @XmlElement(name = "Modelo", required = true)
    protected String modelo;
    @XmlElement(name = "MtaProfile", required = true)
    protected String mtaProfile;
    @XmlElement(name = "IdProducto", required = true)
    protected String idProducto;
    @XmlElement(name = "IdProductoPadre", required = true)
    protected String idProductoPadre;
    @XmlElement(name = "Estado", required = true)
    protected String estado;
    @XmlElement(name = "EndPoints", required = true)
    protected List<EndPoints> endPoints;

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
     * Gets the value of the modelo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Sets the value of the modelo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelo(String value) {
        this.modelo = value;
    }

    /**
     * Gets the value of the mtaProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtaProfile() {
        return mtaProfile;
    }

    /**
     * Sets the value of the mtaProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMtaProfile(String value) {
        this.mtaProfile = value;
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
     * Gets the value of the idProductoPadre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdProductoPadre() {
        return idProductoPadre;
    }

    /**
     * Sets the value of the idProductoPadre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdProductoPadre(String value) {
        this.idProductoPadre = value;
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
     * Gets the value of the endPoints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endPoints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndPoints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EndPoints }
     * 
     * 
     */
    public List<EndPoints> getEndPoints() {
        if (endPoints == null) {
            endPoints = new ArrayList<EndPoints>();
        }
        return this.endPoints;
    }

}
