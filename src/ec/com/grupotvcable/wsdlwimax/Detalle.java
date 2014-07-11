
package ec.com.grupotvcable.wsdlwimax;

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
 *         &lt;element name="Wimax" type="{http://www.grupotvcable.com.ec/WsdlWimax/}Wimax"/>
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
    "wimax"
})
public class Detalle {

    @XmlElement(name = "Wimax", required = true)
    protected Wimax wimax;

    /**
     * Gets the value of the wimax property.
     * 
     * @return
     *     possible object is
     *     {@link Wimax }
     *     
     */
    public Wimax getWimax() {
        return wimax;
    }

    /**
     * Sets the value of the wimax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Wimax }
     *     
     */
    public void setWimax(Wimax value) {
        this.wimax = value;
    }

}
