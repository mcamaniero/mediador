
package ec.com.grupotvcable.wsdlauditoriatitaniw;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EndPoints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EndPoints">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HomeExchange" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IdProducto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IdProductoPadre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CallFeature" type="{http://www.grupotvcable.com.ec/WsdlAuditoriaTitanIw/}CallFeature" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndPoints", propOrder = {
    "telefono",
    "homeExchange",
    "idProducto",
    "idProductoPadre",
    "estado",
    "callFeature"
})
public class EndPoints {

    @XmlElement(required = true)
    protected String telefono;
    @XmlElement(name = "HomeExchange", required = true)
    protected String homeExchange;
    @XmlElement(name = "IdProducto", required = true)
    protected String idProducto;
    @XmlElement(name = "IdProductoPadre", required = true)
    protected String idProductoPadre;
    @XmlElement(name = "Estado", required = true)
    protected String estado;
    @XmlElement(name = "CallFeature", required = true)
    protected List<CallFeature> callFeature;

    /**
     * Gets the value of the telefono property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Sets the value of the telefono property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono(String value) {
        this.telefono = value;
    }

    /**
     * Gets the value of the homeExchange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeExchange() {
        return homeExchange;
    }

    /**
     * Sets the value of the homeExchange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeExchange(String value) {
        this.homeExchange = value;
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
     * Gets the value of the callFeature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callFeature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallFeature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CallFeature }
     * 
     * 
     */
    public List<CallFeature> getCallFeature() {
        if (callFeature == null) {
            callFeature = new ArrayList<CallFeature>();
        }
        return this.callFeature;
    }

}
