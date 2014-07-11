
package https.partners_compuredes_com_co.mcafee;

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
 *         &lt;element name="OrderTransTOP" type="{https://partners.compuredes.com.co/mcafee}clsOrderTransTOP" minOccurs="0"/>
 *         &lt;element name="sessionTransaction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "orderTransTOP",
    "sessionTransaction"
})
@XmlRootElement(name = "wmOrderTOP")
public class WmOrderTOP {

    @XmlElement(name = "OrderTransTOP")
    protected ClsOrderTransTOP orderTransTOP;
    protected String sessionTransaction;

    /**
     * Gets the value of the orderTransTOP property.
     * 
     * @return
     *     possible object is
     *     {@link ClsOrderTransTOP }
     *     
     */
    public ClsOrderTransTOP getOrderTransTOP() {
        return orderTransTOP;
    }

    /**
     * Sets the value of the orderTransTOP property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClsOrderTransTOP }
     *     
     */
    public void setOrderTransTOP(ClsOrderTransTOP value) {
        this.orderTransTOP = value;
    }

    /**
     * Gets the value of the sessionTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionTransaction() {
        return sessionTransaction;
    }

    /**
     * Sets the value of the sessionTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionTransaction(String value) {
        this.sessionTransaction = value;
    }

}
