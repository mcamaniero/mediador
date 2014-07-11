
package ec.com.grupotvcable.wsdlauris;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Telefono complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Telefono">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Telefono" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Telefono", propOrder = {
    "telefono"
})
public class Telefono {

    @XmlElement(name = "Telefono")
    protected int telefono;

    /**
     * Gets the value of the telefono property.
     * 
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * Sets the value of the telefono property.
     * 
     */
    public void setTelefono(int value) {
        this.telefono = value;
    }

}
