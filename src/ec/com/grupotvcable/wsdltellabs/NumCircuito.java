
package ec.com.grupotvcable.wsdltellabs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NumCircuito complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumCircuito">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Circuito" type="{http://www.grupotvcable.com.ec/WsdlTellabs/}Circuito" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CantC" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumCircuito", propOrder = {
    "circuito"
})
public class NumCircuito {

    @XmlElement(name = "Circuito", required = true)
    protected List<Circuito> circuito;
    @XmlAttribute(name = "CantC")
    protected Integer cantC;

    /**
     * Gets the value of the circuito property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the circuito property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCircuito().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Circuito }
     * 
     * 
     */
    public List<Circuito> getCircuito() {
        if (circuito == null) {
            circuito = new ArrayList<Circuito>();
        }
        return this.circuito;
    }

    /**
     * Gets the value of the cantC property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCantC() {
        return cantC;
    }

    /**
     * Sets the value of the cantC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCantC(Integer value) {
        this.cantC = value;
    }

}
