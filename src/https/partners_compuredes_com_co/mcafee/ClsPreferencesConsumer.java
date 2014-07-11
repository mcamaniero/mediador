
package https.partners_compuredes_com_co.mcafee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clsPreferencesConsumer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clsPreferencesConsumer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PreferenceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferenceValor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsPreferencesConsumer", propOrder = {
    "preferenceName",
    "preferenceValor"
})
public class ClsPreferencesConsumer {

    @XmlElement(name = "PreferenceName")
    protected String preferenceName;
    @XmlElement(name = "PreferenceValor")
    protected String preferenceValor;

    /**
     * Gets the value of the preferenceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferenceName() {
        return preferenceName;
    }

    /**
     * Sets the value of the preferenceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferenceName(String value) {
        this.preferenceName = value;
    }

    /**
     * Gets the value of the preferenceValor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferenceValor() {
        return preferenceValor;
    }

    /**
     * Sets the value of the preferenceValor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferenceValor(String value) {
        this.preferenceValor = value;
    }

}
