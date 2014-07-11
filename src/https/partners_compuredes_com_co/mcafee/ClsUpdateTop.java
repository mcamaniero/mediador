
package https.partners_compuredes_com_co.mcafee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clsUpdateTop complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clsUpdateTop">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PartnerGeneratedOrderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CancelStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsUpdateTop", propOrder = {
    "partnerGeneratedOrderID",
    "cancelStatus",
    "updateDate"
})
public class ClsUpdateTop {

    @XmlElement(name = "PartnerGeneratedOrderID")
    protected String partnerGeneratedOrderID;
    @XmlElement(name = "CancelStatus")
    protected String cancelStatus;
    @XmlElement(name = "UpdateDate")
    protected String updateDate;

    /**
     * Gets the value of the partnerGeneratedOrderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerGeneratedOrderID() {
        return partnerGeneratedOrderID;
    }

    /**
     * Sets the value of the partnerGeneratedOrderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerGeneratedOrderID(String value) {
        this.partnerGeneratedOrderID = value;
    }

    /**
     * Gets the value of the cancelStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelStatus() {
        return cancelStatus;
    }

    /**
     * Sets the value of the cancelStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelStatus(String value) {
        this.cancelStatus = value;
    }

    /**
     * Gets the value of the updateDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateDate() {
        return updateDate;
    }

    /**
     * Sets the value of the updateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateDate(String value) {
        this.updateDate = value;
    }

}
