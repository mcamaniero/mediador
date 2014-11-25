
package ec.com.grupotvcable.wsdlauris;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Detalle complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Detalle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Auris" type="{http://www.grupotvcable.com.ec/WsdlAuris/}Auris"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Detalle", propOrder = {
    "auris"
})
public class Detalle {

    @XmlElement(name = "Auris", required = true)
    protected Auris auris;

    /**
     * Gets the value of the auris property.
     * 
     * @return
     *     possible object is
     *     {@link Auris }
     *     
     */
    public Auris getAuris() {
        return auris;
    }

    /**
     * Sets the value of the auris property.
     * 
     * @param value
     *     allowed object is
     *     {@link Auris }
     *     
     */
    public void setAuris(Auris value) {
        this.auris = value;
    }

}
