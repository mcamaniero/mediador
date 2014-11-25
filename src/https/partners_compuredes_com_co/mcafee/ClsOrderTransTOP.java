
package https.partners_compuredes_com_co.mcafee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clsOrderTransTOP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clsOrderTransTOP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="subPartnerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subPartnerPass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="replyAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeOrder" type="{https://partners.compuredes.com.co/mcafee}typeTipoOrder"/>
 *         &lt;element name="contactTOP" type="{https://partners.compuredes.com.co/mcafee}clsContactTOP" minOccurs="0"/>
 *         &lt;element name="orderDetailTOP" type="{https://partners.compuredes.com.co/mcafee}clsOrderDetailTOP" minOccurs="0"/>
 *         &lt;element name="updateTOP" type="{https://partners.compuredes.com.co/mcafee}clsUpdateTop" minOccurs="0"/>
 *         &lt;element name="userTrans" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsOrderTransTOP", propOrder = {
    "subPartnerID",
    "subPartnerPass",
    "replyAddress",
    "typeOrder",
    "contactTOP",
    "orderDetailTOP",
    "updateTOP",
    "userTrans"
})
public class ClsOrderTransTOP {

    protected String subPartnerID;
    protected String subPartnerPass;
    protected String replyAddress;
    @XmlElement(required = true)
    protected TypeTipoOrder typeOrder;
    protected ClsContactTOP contactTOP;
    protected ClsOrderDetailTOP orderDetailTOP;
    protected ClsUpdateTop updateTOP;
    protected String userTrans;

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
     * Gets the value of the replyAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyAddress() {
        return replyAddress;
    }

    /**
     * Sets the value of the replyAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyAddress(String value) {
        this.replyAddress = value;
    }

    /**
     * Gets the value of the typeOrder property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTipoOrder }
     *     
     */
    public TypeTipoOrder getTypeOrder() {
        return typeOrder;
    }

    /**
     * Sets the value of the typeOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTipoOrder }
     *     
     */
    public void setTypeOrder(TypeTipoOrder value) {
        this.typeOrder = value;
    }

    /**
     * Gets the value of the contactTOP property.
     * 
     * @return
     *     possible object is
     *     {@link ClsContactTOP }
     *     
     */
    public ClsContactTOP getContactTOP() {
        return contactTOP;
    }

    /**
     * Sets the value of the contactTOP property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClsContactTOP }
     *     
     */
    public void setContactTOP(ClsContactTOP value) {
        this.contactTOP = value;
    }

    /**
     * Gets the value of the orderDetailTOP property.
     * 
     * @return
     *     possible object is
     *     {@link ClsOrderDetailTOP }
     *     
     */
    public ClsOrderDetailTOP getOrderDetailTOP() {
        return orderDetailTOP;
    }

    /**
     * Sets the value of the orderDetailTOP property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClsOrderDetailTOP }
     *     
     */
    public void setOrderDetailTOP(ClsOrderDetailTOP value) {
        this.orderDetailTOP = value;
    }

    /**
     * Gets the value of the updateTOP property.
     * 
     * @return
     *     possible object is
     *     {@link ClsUpdateTop }
     *     
     */
    public ClsUpdateTop getUpdateTOP() {
        return updateTOP;
    }

    /**
     * Sets the value of the updateTOP property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClsUpdateTop }
     *     
     */
    public void setUpdateTOP(ClsUpdateTop value) {
        this.updateTOP = value;
    }

    /**
     * Gets the value of the userTrans property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserTrans() {
        return userTrans;
    }

    /**
     * Sets the value of the userTrans property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserTrans(String value) {
        this.userTrans = value;
    }

}
