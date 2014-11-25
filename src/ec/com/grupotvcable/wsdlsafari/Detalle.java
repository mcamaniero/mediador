
package ec.com.grupotvcable.wsdlsafari;

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
 *         &lt;element name="Safari" type="{http://www.grupotvcable.com.ec/WsdlSafari/}Safari"/>
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
    "safari"
})
public class Detalle {

    @XmlElement(name = "Safari", required = true)
    protected Safari safari;

    /**
     * Gets the value of the safari property.
     * 
     * @return
     *     possible object is
     *     {@link Safari }
     *     
     */
    public Safari getSafari() {
        return safari;
    }

    /**
     * Sets the value of the safari property.
     * 
     * @param value
     *     allowed object is
     *     {@link Safari }
     *     
     */
    public void setSafari(Safari value) {
        this.safari = value;
    }

}
