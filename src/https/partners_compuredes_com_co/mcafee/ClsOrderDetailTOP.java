
package https.partners_compuredes_com_co.mcafee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clsOrderDetailTOP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clsOrderDetailTOP">
 *   &lt;complexContent>
 *     &lt;extension base="{https://partners.compuredes.com.co/mcafee}BaseObject">
 *       &lt;sequence>
 *         &lt;element name="PartnerGeneratedOrderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrderDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeskTopCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NumberOfMailBoxes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SubscriptionLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ServiceLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProductLanguageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderTypeSchema" type="{https://partners.compuredes.com.co/mcafee}typeOrderTypeSchema"/>
 *         &lt;element name="AutoRenewalFlag" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsOrderDetailTOP", propOrder = {
    "partnerGeneratedOrderID",
    "productType",
    "orderDate",
    "deskTopCount",
    "numberOfMailBoxes",
    "subscriptionLength",
    "serviceLevel",
    "paymentType",
    "productLanguageCode",
    "orderTypeSchema",
    "autoRenewalFlag"
})
public class ClsOrderDetailTOP
    extends BaseObject
{

    @XmlElement(name = "PartnerGeneratedOrderID")
    protected String partnerGeneratedOrderID;
    @XmlElement(name = "ProductType")
    protected String productType;
    @XmlElement(name = "OrderDate")
    protected String orderDate;
    @XmlElement(name = "DeskTopCount")
    protected int deskTopCount;
    @XmlElement(name = "NumberOfMailBoxes")
    protected int numberOfMailBoxes;
    @XmlElement(name = "SubscriptionLength")
    protected int subscriptionLength;
    @XmlElement(name = "ServiceLevel")
    protected String serviceLevel;
    @XmlElement(name = "PaymentType")
    protected int paymentType;
    @XmlElement(name = "ProductLanguageCode")
    protected String productLanguageCode;
    @XmlElement(required = true)
    protected TypeOrderTypeSchema orderTypeSchema;
    @XmlElement(name = "AutoRenewalFlag")
    protected int autoRenewalFlag;

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
     * Gets the value of the productType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Sets the value of the productType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
    }

    /**
     * Gets the value of the orderDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * Sets the value of the orderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderDate(String value) {
        this.orderDate = value;
    }

    /**
     * Gets the value of the deskTopCount property.
     * 
     */
    public int getDeskTopCount() {
        return deskTopCount;
    }

    /**
     * Sets the value of the deskTopCount property.
     * 
     */
    public void setDeskTopCount(int value) {
        this.deskTopCount = value;
    }

    /**
     * Gets the value of the numberOfMailBoxes property.
     * 
     */
    public int getNumberOfMailBoxes() {
        return numberOfMailBoxes;
    }

    /**
     * Sets the value of the numberOfMailBoxes property.
     * 
     */
    public void setNumberOfMailBoxes(int value) {
        this.numberOfMailBoxes = value;
    }

    /**
     * Gets the value of the subscriptionLength property.
     * 
     */
    public int getSubscriptionLength() {
        return subscriptionLength;
    }

    /**
     * Sets the value of the subscriptionLength property.
     * 
     */
    public void setSubscriptionLength(int value) {
        this.subscriptionLength = value;
    }

    /**
     * Gets the value of the serviceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLevel() {
        return serviceLevel;
    }

    /**
     * Sets the value of the serviceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLevel(String value) {
        this.serviceLevel = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     */
    public int getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     */
    public void setPaymentType(int value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the productLanguageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductLanguageCode() {
        return productLanguageCode;
    }

    /**
     * Sets the value of the productLanguageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductLanguageCode(String value) {
        this.productLanguageCode = value;
    }

    /**
     * Gets the value of the orderTypeSchema property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOrderTypeSchema }
     *     
     */
    public TypeOrderTypeSchema getOrderTypeSchema() {
        return orderTypeSchema;
    }

    /**
     * Sets the value of the orderTypeSchema property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOrderTypeSchema }
     *     
     */
    public void setOrderTypeSchema(TypeOrderTypeSchema value) {
        this.orderTypeSchema = value;
    }

    /**
     * Gets the value of the autoRenewalFlag property.
     * 
     */
    public int getAutoRenewalFlag() {
        return autoRenewalFlag;
    }

    /**
     * Sets the value of the autoRenewalFlag property.
     * 
     */
    public void setAutoRenewalFlag(int value) {
        this.autoRenewalFlag = value;
    }

}
