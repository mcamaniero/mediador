
package https.partners_compuredes_com_co.mcafee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clsOrderTransConsumer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clsOrderTransConsumer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="strSesTransac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subPartnerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoPeticion" type="{https://partners.compuredes.com.co/mcafee}typeTipoPeticion"/>
 *         &lt;element name="clienteConsumer" type="{https://partners.compuredes.com.co/mcafee}clsClientConsumer" minOccurs="0"/>
 *         &lt;element name="ordenConsumer" type="{https://partners.compuredes.com.co/mcafee}clsOrdenConsumer" minOccurs="0"/>
 *         &lt;element name="paymentConsumer" type="{https://partners.compuredes.com.co/mcafee}clsPaymentConsumer" minOccurs="0"/>
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
@XmlType(name = "clsOrderTransConsumer", propOrder = {
    "strSesTransac",
    "subPartnerID",
    "tipoPeticion",
    "clienteConsumer",
    "ordenConsumer",
    "paymentConsumer",
    "userTrans"
})
public class ClsOrderTransConsumer {

    protected String strSesTransac;
    protected String subPartnerID;
    @XmlElement(required = true)
    protected TypeTipoPeticion tipoPeticion;
    protected ClsClientConsumer clienteConsumer;
    protected ClsOrdenConsumer ordenConsumer;
    protected ClsPaymentConsumer paymentConsumer;
    protected String userTrans;

    /**
     * Gets the value of the strSesTransac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrSesTransac() {
        return strSesTransac;
    }

    /**
     * Sets the value of the strSesTransac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrSesTransac(String value) {
        this.strSesTransac = value;
    }

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
     * Gets the value of the tipoPeticion property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTipoPeticion }
     *     
     */
    public TypeTipoPeticion getTipoPeticion() {
        return tipoPeticion;
    }

    /**
     * Sets the value of the tipoPeticion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTipoPeticion }
     *     
     */
    public void setTipoPeticion(TypeTipoPeticion value) {
        this.tipoPeticion = value;
    }

    /**
     * Gets the value of the clienteConsumer property.
     * 
     * @return
     *     possible object is
     *     {@link ClsClientConsumer }
     *     
     */
    public ClsClientConsumer getClienteConsumer() {
        return clienteConsumer;
    }

    /**
     * Sets the value of the clienteConsumer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClsClientConsumer }
     *     
     */
    public void setClienteConsumer(ClsClientConsumer value) {
        this.clienteConsumer = value;
    }

    /**
     * Gets the value of the ordenConsumer property.
     * 
     * @return
     *     possible object is
     *     {@link ClsOrdenConsumer }
     *     
     */
    public ClsOrdenConsumer getOrdenConsumer() {
        return ordenConsumer;
    }

    /**
     * Sets the value of the ordenConsumer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClsOrdenConsumer }
     *     
     */
    public void setOrdenConsumer(ClsOrdenConsumer value) {
        this.ordenConsumer = value;
    }

    /**
     * Gets the value of the paymentConsumer property.
     * 
     * @return
     *     possible object is
     *     {@link ClsPaymentConsumer }
     *     
     */
    public ClsPaymentConsumer getPaymentConsumer() {
        return paymentConsumer;
    }

    /**
     * Sets the value of the paymentConsumer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClsPaymentConsumer }
     *     
     */
    public void setPaymentConsumer(ClsPaymentConsumer value) {
        this.paymentConsumer = value;
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
