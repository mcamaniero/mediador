
package ec.com.grupotvcable.wsdlauditoriatitaniw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CallFeature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CallFeature">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CallFeature" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Feature" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IdProducto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IdProductoPadre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Custom1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Custom2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Custom3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Custom4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallFeature", propOrder = {
    "callFeature",
    "feature",
    "idProducto",
    "idProductoPadre",
    "estado",
    "custom1",
    "custom2",
    "custom3",
    "custom4"
})
public class CallFeature {

    @XmlElement(name = "CallFeature", required = true)
    protected String callFeature;
    @XmlElement(name = "Feature", required = true)
    protected String feature;
    @XmlElement(name = "IdProducto", required = true)
    protected String idProducto;
    @XmlElement(name = "IdProductoPadre", required = true)
    protected String idProductoPadre;
    @XmlElement(name = "Estado", required = true)
    protected String estado;
    @XmlElement(name = "Custom1", required = true)
    protected String custom1;
    @XmlElement(name = "Custom2", required = true)
    protected String custom2;
    @XmlElement(name = "Custom3", required = true)
    protected String custom3;
    @XmlElement(name = "Custom4", required = true)
    protected String custom4;

    /**
     * Gets the value of the callFeature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallFeature() {
        return callFeature;
    }

    /**
     * Sets the value of the callFeature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallFeature(String value) {
        this.callFeature = value;
    }

    /**
     * Gets the value of the feature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeature() {
        return feature;
    }

    /**
     * Sets the value of the feature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeature(String value) {
        this.feature = value;
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
     * Gets the value of the custom1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustom1() {
        return custom1;
    }

    /**
     * Sets the value of the custom1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustom1(String value) {
        this.custom1 = value;
    }

    /**
     * Gets the value of the custom2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustom2() {
        return custom2;
    }

    /**
     * Sets the value of the custom2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustom2(String value) {
        this.custom2 = value;
    }

    /**
     * Gets the value of the custom3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustom3() {
        return custom3;
    }

    /**
     * Sets the value of the custom3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustom3(String value) {
        this.custom3 = value;
    }

    /**
     * Gets the value of the custom4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustom4() {
        return custom4;
    }

    /**
     * Sets the value of the custom4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustom4(String value) {
        this.custom4 = value;
    }

}
