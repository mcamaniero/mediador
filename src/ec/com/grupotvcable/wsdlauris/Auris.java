
package ec.com.grupotvcable.wsdlauris;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Auris complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Auris">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Pin" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ProductoPlaneta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Fono" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ListaFono" type="{http://www.grupotvcable.com.ec/WsdlAuris/}ListaFono"/>
 *         &lt;element name="CodEstado" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CodAcceso" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Referencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ListaPin" type="{http://www.grupotvcable.com.ec/WsdlAuris/}ListaPin"/>
 *         &lt;element name="DatoA1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DatoA2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DatoA3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DatoA4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Auris", propOrder = {
    "pin",
    "productoPlaneta",
    "monto",
    "fono",
    "listaFono",
    "codEstado",
    "codAcceso",
    "referencia",
    "listaPin",
    "datoA1",
    "datoA2",
    "datoA3",
    "datoA4"
})
public class Auris {

    @XmlElement(name = "Pin")
    protected int pin;
    @XmlElement(name = "ProductoPlaneta")
    protected int productoPlaneta;
    @XmlElement(name = "Monto")
    protected int monto;
    @XmlElement(name = "Fono")
    protected int fono;
    @XmlElement(name = "ListaFono", required = true)
    protected ListaFono listaFono;
    @XmlElement(name = "CodEstado")
    protected int codEstado;
    @XmlElement(name = "CodAcceso")
    protected int codAcceso;
    @XmlElement(name = "Referencia", required = true)
    protected String referencia;
    @XmlElement(name = "ListaPin", required = true)
    protected ListaPin listaPin;
    @XmlElement(name = "DatoA1", required = true)
    protected String datoA1;
    @XmlElement(name = "DatoA2", required = true)
    protected String datoA2;
    @XmlElement(name = "DatoA3", required = true)
    protected String datoA3;
    @XmlElement(name = "DatoA4", required = true)
    protected String datoA4;

    /**
     * Gets the value of the pin property.
     * 
     */
    public int getPin() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     */
    public void setPin(int value) {
        this.pin = value;
    }

    /**
     * Gets the value of the productoPlaneta property.
     * 
     */
    public int getProductoPlaneta() {
        return productoPlaneta;
    }

    /**
     * Sets the value of the productoPlaneta property.
     * 
     */
    public void setProductoPlaneta(int value) {
        this.productoPlaneta = value;
    }

    /**
     * Gets the value of the monto property.
     * 
     */
    public int getMonto() {
        return monto;
    }

    /**
     * Sets the value of the monto property.
     * 
     */
    public void setMonto(int value) {
        this.monto = value;
    }

    /**
     * Gets the value of the fono property.
     * 
     */
    public int getFono() {
        return fono;
    }

    /**
     * Sets the value of the fono property.
     * 
     */
    public void setFono(int value) {
        this.fono = value;
    }

    /**
     * Gets the value of the listaFono property.
     * 
     * @return
     *     possible object is
     *     {@link ListaFono }
     *     
     */
    public ListaFono getListaFono() {
        return listaFono;
    }

    /**
     * Sets the value of the listaFono property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaFono }
     *     
     */
    public void setListaFono(ListaFono value) {
        this.listaFono = value;
    }

    /**
     * Gets the value of the codEstado property.
     * 
     */
    public int getCodEstado() {
        return codEstado;
    }

    /**
     * Sets the value of the codEstado property.
     * 
     */
    public void setCodEstado(int value) {
        this.codEstado = value;
    }

    /**
     * Gets the value of the codAcceso property.
     * 
     */
    public int getCodAcceso() {
        return codAcceso;
    }

    /**
     * Sets the value of the codAcceso property.
     * 
     */
    public void setCodAcceso(int value) {
        this.codAcceso = value;
    }

    /**
     * Gets the value of the referencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * Sets the value of the referencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencia(String value) {
        this.referencia = value;
    }

    /**
     * Gets the value of the listaPin property.
     * 
     * @return
     *     possible object is
     *     {@link ListaPin }
     *     
     */
    public ListaPin getListaPin() {
        return listaPin;
    }

    /**
     * Sets the value of the listaPin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaPin }
     *     
     */
    public void setListaPin(ListaPin value) {
        this.listaPin = value;
    }

    /**
     * Gets the value of the datoA1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoA1() {
        return datoA1;
    }

    /**
     * Sets the value of the datoA1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoA1(String value) {
        this.datoA1 = value;
    }

    /**
     * Gets the value of the datoA2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoA2() {
        return datoA2;
    }

    /**
     * Sets the value of the datoA2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoA2(String value) {
        this.datoA2 = value;
    }

    /**
     * Gets the value of the datoA3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoA3() {
        return datoA3;
    }

    /**
     * Sets the value of the datoA3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoA3(String value) {
        this.datoA3 = value;
    }

    /**
     * Gets the value of the datoA4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoA4() {
        return datoA4;
    }

    /**
     * Sets the value of the datoA4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoA4(String value) {
        this.datoA4 = value;
    }

}
