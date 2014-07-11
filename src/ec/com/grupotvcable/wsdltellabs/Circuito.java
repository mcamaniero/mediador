
package ec.com.grupotvcable.wsdltellabs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Circuito complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Circuito">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdCircuito" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NomCircuito" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EstCircuito" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Circuito", propOrder = {
    "idCircuito",
    "nomCircuito",
    "estCircuito"
})
public class Circuito {

    @XmlElement(name = "IdCircuito")
    protected int idCircuito;
    @XmlElement(name = "NomCircuito", required = true)
    protected String nomCircuito;
    @XmlElement(name = "EstCircuito", required = true)
    protected String estCircuito;

    /**
     * Gets the value of the idCircuito property.
     * 
     */
    public int getIdCircuito() {
        return idCircuito;
    }

    /**
     * Sets the value of the idCircuito property.
     * 
     */
    public void setIdCircuito(int value) {
        this.idCircuito = value;
    }

    /**
     * Gets the value of the nomCircuito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomCircuito() {
        return nomCircuito;
    }

    /**
     * Sets the value of the nomCircuito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomCircuito(String value) {
        this.nomCircuito = value;
    }

    /**
     * Gets the value of the estCircuito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstCircuito() {
        return estCircuito;
    }

    /**
     * Sets the value of the estCircuito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstCircuito(String value) {
        this.estCircuito = value;
    }

}
