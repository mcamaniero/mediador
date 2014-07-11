
package https.partners_compuredes_com_co.mcafee;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


/**
 * <p>Java class for clsHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clsHeader">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubPartnerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubPartnerPass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsHeader", propOrder = {
    "subPartnerID",
    "subPartnerPass"
})
public class ClsHeader {

    @XmlElement(name = "SubPartnerID")
    protected String subPartnerID;
    @XmlElement(name = "SubPartnerPass")
    protected String subPartnerPass;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the subPartnerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubPartnerID() {
        return subPartnerID;
    }

    /**
     * Sets the value of the subPartnerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubPartnerID(String value) {
        this.subPartnerID = value;
    }

    /**
     * Gets the value of the subPartnerPass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubPartnerPass() {
        return subPartnerPass;
    }

    /**
     * Sets the value of the subPartnerPass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubPartnerPass(String value) {
        this.subPartnerPass = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
