
package ec.com.grupotvcable.wsdltellabs;

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
 *         &lt;element name="Tellabs" type="{http://www.grupotvcable.com.ec/WsdlTellabs/}Tellabs"/>
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
    "tellabs"
})
public class Detalle {

    @XmlElement(name = "Tellabs", required = true)
    protected Tellabs tellabs;

    /**
     * Gets the value of the tellabs property.
     * 
     * @return
     *     possible object is
     *     {@link Tellabs }
     *     
     */
    public Tellabs getTellabs() {
        return tellabs;
    }

    /**
     * Sets the value of the tellabs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tellabs }
     *     
     */
    public void setTellabs(Tellabs value) {
        this.tellabs = value;
    }

}
