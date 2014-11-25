
package ec.com.grupotvcable.wsdlauris;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Pines complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Pines">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Pines" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pines", propOrder = {
    "pines"
})
public class Pines {

    @XmlElement(name = "Pines", required = true)
    protected String pines;

    /**
     * Gets the value of the pines property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPines() {
        return pines;
    }

    /**
     * Sets the value of the pines property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPines(String value) {
        this.pines = value;
    }

}
