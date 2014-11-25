
package https.partners_compuredes_com_co.mcafee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="wmOrderTOPResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "wmOrderTOPResult"
})
@XmlRootElement(name = "wmOrderTOPResponse")
public class WmOrderTOPResponse {

    protected String wmOrderTOPResult;

    /**
     * Gets the value of the wmOrderTOPResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWmOrderTOPResult() {
        return wmOrderTOPResult;
    }

    /**
     * Sets the value of the wmOrderTOPResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWmOrderTOPResult(String value) {
        this.wmOrderTOPResult = value;
    }

}
