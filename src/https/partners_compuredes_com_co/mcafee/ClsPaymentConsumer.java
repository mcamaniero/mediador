
package https.partners_compuredes_com_co.mcafee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clsPaymentConsumer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clsPaymentConsumer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoPago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoAutorizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tarjetaConsumer" type="{https://partners.compuredes.com.co/mcafee}clsCreditCardConsumer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsPaymentConsumer", propOrder = {
    "tipoPago",
    "codigoAutorizacion",
    "tarjetaConsumer"
})
public class ClsPaymentConsumer {

    protected String tipoPago;
    protected String codigoAutorizacion;
    protected ClsCreditCardConsumer tarjetaConsumer;

    /**
     * Gets the value of the tipoPago property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPago() {
        return tipoPago;
    }

    /**
     * Sets the value of the tipoPago property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPago(String value) {
        this.tipoPago = value;
    }

    /**
     * Gets the value of the codigoAutorizacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoAutorizacion() {
        return codigoAutorizacion;
    }

    /**
     * Sets the value of the codigoAutorizacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoAutorizacion(String value) {
        this.codigoAutorizacion = value;
    }

    /**
     * Gets the value of the tarjetaConsumer property.
     * 
     * @return
     *     possible object is
     *     {@link ClsCreditCardConsumer }
     *     
     */
    public ClsCreditCardConsumer getTarjetaConsumer() {
        return tarjetaConsumer;
    }

    /**
     * Sets the value of the tarjetaConsumer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClsCreditCardConsumer }
     *     
     */
    public void setTarjetaConsumer(ClsCreditCardConsumer value) {
        this.tarjetaConsumer = value;
    }

}
