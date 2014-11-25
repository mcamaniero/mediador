
package https.partners_compuredes_com_co.mcafee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clsCreditCardConsumer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clsCreditCardConsumer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoTarjeta" type="{https://partners.compuredes.com.co/mcafee}typeCreditCard"/>
 *         &lt;element name="numeroTarjeta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expiracionMes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expiracionAno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tarjetaNombres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tarjetaApellidos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tarjetaDir1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tarjetaDir2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tarjetaCiudad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tarjetaEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tarjetaZIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tarjetaPais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tarjetaTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tarjetaFax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsCreditCardConsumer", propOrder = {
    "tipoTarjeta",
    "numeroTarjeta",
    "expiracionMes",
    "expiracionAno",
    "tarjetaNombres",
    "tarjetaApellidos",
    "tarjetaDir1",
    "tarjetaDir2",
    "tarjetaCiudad",
    "tarjetaEstado",
    "tarjetaZIP",
    "tarjetaPais",
    "tarjetaTel",
    "tarjetaFax"
})
public class ClsCreditCardConsumer {

    @XmlElement(required = true)
    protected TypeCreditCard tipoTarjeta;
    protected String numeroTarjeta;
    protected String expiracionMes;
    protected String expiracionAno;
    protected String tarjetaNombres;
    protected String tarjetaApellidos;
    protected String tarjetaDir1;
    protected String tarjetaDir2;
    protected String tarjetaCiudad;
    protected String tarjetaEstado;
    protected String tarjetaZIP;
    protected String tarjetaPais;
    protected String tarjetaTel;
    protected String tarjetaFax;

    /**
     * Gets the value of the tipoTarjeta property.
     * 
     * @return
     *     possible object is
     *     {@link TypeCreditCard }
     *     
     */
    public TypeCreditCard getTipoTarjeta() {
        return tipoTarjeta;
    }

    /**
     * Sets the value of the tipoTarjeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeCreditCard }
     *     
     */
    public void setTipoTarjeta(TypeCreditCard value) {
        this.tipoTarjeta = value;
    }

    /**
     * Gets the value of the numeroTarjeta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    /**
     * Sets the value of the numeroTarjeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTarjeta(String value) {
        this.numeroTarjeta = value;
    }

    /**
     * Gets the value of the expiracionMes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiracionMes() {
        return expiracionMes;
    }

    /**
     * Sets the value of the expiracionMes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiracionMes(String value) {
        this.expiracionMes = value;
    }

    /**
     * Gets the value of the expiracionAno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiracionAno() {
        return expiracionAno;
    }

    /**
     * Sets the value of the expiracionAno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiracionAno(String value) {
        this.expiracionAno = value;
    }

    /**
     * Gets the value of the tarjetaNombres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarjetaNombres() {
        return tarjetaNombres;
    }

    /**
     * Sets the value of the tarjetaNombres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarjetaNombres(String value) {
        this.tarjetaNombres = value;
    }

    /**
     * Gets the value of the tarjetaApellidos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarjetaApellidos() {
        return tarjetaApellidos;
    }

    /**
     * Sets the value of the tarjetaApellidos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarjetaApellidos(String value) {
        this.tarjetaApellidos = value;
    }

    /**
     * Gets the value of the tarjetaDir1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarjetaDir1() {
        return tarjetaDir1;
    }

    /**
     * Sets the value of the tarjetaDir1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarjetaDir1(String value) {
        this.tarjetaDir1 = value;
    }

    /**
     * Gets the value of the tarjetaDir2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarjetaDir2() {
        return tarjetaDir2;
    }

    /**
     * Sets the value of the tarjetaDir2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarjetaDir2(String value) {
        this.tarjetaDir2 = value;
    }

    /**
     * Gets the value of the tarjetaCiudad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarjetaCiudad() {
        return tarjetaCiudad;
    }

    /**
     * Sets the value of the tarjetaCiudad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarjetaCiudad(String value) {
        this.tarjetaCiudad = value;
    }

    /**
     * Gets the value of the tarjetaEstado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarjetaEstado() {
        return tarjetaEstado;
    }

    /**
     * Sets the value of the tarjetaEstado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarjetaEstado(String value) {
        this.tarjetaEstado = value;
    }

    /**
     * Gets the value of the tarjetaZIP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarjetaZIP() {
        return tarjetaZIP;
    }

    /**
     * Sets the value of the tarjetaZIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarjetaZIP(String value) {
        this.tarjetaZIP = value;
    }

    /**
     * Gets the value of the tarjetaPais property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarjetaPais() {
        return tarjetaPais;
    }

    /**
     * Sets the value of the tarjetaPais property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarjetaPais(String value) {
        this.tarjetaPais = value;
    }

    /**
     * Gets the value of the tarjetaTel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarjetaTel() {
        return tarjetaTel;
    }

    /**
     * Sets the value of the tarjetaTel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarjetaTel(String value) {
        this.tarjetaTel = value;
    }

    /**
     * Gets the value of the tarjetaFax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarjetaFax() {
        return tarjetaFax;
    }

    /**
     * Sets the value of the tarjetaFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarjetaFax(String value) {
        this.tarjetaFax = value;
    }

}
