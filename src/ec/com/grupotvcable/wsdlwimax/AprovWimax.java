
package ec.com.grupotvcable.wsdlwimax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ejecutaComando" type="{http://www.grupotvcable.com.ec/WsdlWimax/}Comando"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ejecutaComando"
})
@XmlRootElement(name = "AprovWimax")
public class AprovWimax {

    @XmlElement(required = true)
    protected Comando ejecutaComando;

    /**
     * Gets the value of the ejecutaComando property.
     * 
     * @return
     *     possible object is
     *     {@link Comando }
     *     
     */
    public Comando getEjecutaComando() {
        return ejecutaComando;
    }

    /**
     * Sets the value of the ejecutaComando property.
     * 
     * @param value
     *     allowed object is
     *     {@link Comando }
     *     
     */
    public void setEjecutaComando(Comando value) {
        this.ejecutaComando = value;
    }

}
