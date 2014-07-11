
package ec.com.grupotvcable.wsdltellabs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Tellabs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tellabs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodEnlace" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TipEnlace" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CodCircuito" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DatoT1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DatoT2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DatoT3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DatoT4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tellabs", propOrder = {
    "codEnlace",
    "tipEnlace",
    "codCircuito",
    "datoT1",
    "datoT2",
    "datoT3",
    "datoT4"
})
public class Tellabs {

    @XmlElement(name = "CodEnlace", required = true)
    protected String codEnlace;
    @XmlElement(name = "TipEnlace")
    protected int tipEnlace;
    @XmlElement(name = "CodCircuito", required = true)
    protected String codCircuito;
    @XmlElement(name = "DatoT1", required = true)
    protected String datoT1;
    @XmlElement(name = "DatoT2", required = true)
    protected String datoT2;
    @XmlElement(name = "DatoT3", required = true)
    protected String datoT3;
    @XmlElement(name = "DatoT4", required = true)
    protected String datoT4;

    /**
     * Gets the value of the codEnlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEnlace() {
        return codEnlace;
    }

    /**
     * Sets the value of the codEnlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEnlace(String value) {
        this.codEnlace = value;
    }

    /**
     * Gets the value of the tipEnlace property.
     * 
     */
    public int getTipEnlace() {
        return tipEnlace;
    }

    /**
     * Sets the value of the tipEnlace property.
     * 
     */
    public void setTipEnlace(int value) {
        this.tipEnlace = value;
    }

    /**
     * Gets the value of the codCircuito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCircuito() {
        return codCircuito;
    }

    /**
     * Sets the value of the codCircuito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCircuito(String value) {
        this.codCircuito = value;
    }

    /**
     * Gets the value of the datoT1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoT1() {
        return datoT1;
    }

    /**
     * Sets the value of the datoT1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoT1(String value) {
        this.datoT1 = value;
    }

    /**
     * Gets the value of the datoT2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoT2() {
        return datoT2;
    }

    /**
     * Sets the value of the datoT2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoT2(String value) {
        this.datoT2 = value;
    }

    /**
     * Gets the value of the datoT3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoT3() {
        return datoT3;
    }

    /**
     * Sets the value of the datoT3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoT3(String value) {
        this.datoT3 = value;
    }

    /**
     * Gets the value of the datoT4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoT4() {
        return datoT4;
    }

    /**
     * Sets the value of the datoT4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoT4(String value) {
        this.datoT4 = value;
    }

}
