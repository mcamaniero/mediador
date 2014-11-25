
package ec.com.grupotvcable.wsdlintraway2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Estandar complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Estandar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AuthKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ClienteCRM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IdProducto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IdProductoPadre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IdServicio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IdServicioPadre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IdVenta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IdVentaPadre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IdPromotor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FechaDiferida" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IdEstado" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Estandar", propOrder = {
    "authKey",
    "clienteCRM",
    "idProducto",
    "idProductoPadre",
    "idServicio",
    "idServicioPadre",
    "idVenta",
    "idVentaPadre",
    "idPromotor",
    "fechaDiferida",
    "idEstado"
})
public class Estandar {

    @XmlElement(name = "AuthKey", required = true)
    protected String authKey;
    @XmlElement(name = "ClienteCRM", required = true)
    protected String clienteCRM;
    @XmlElement(name = "IdProducto", required = true)
    protected String idProducto;
    @XmlElement(name = "IdProductoPadre", required = true)
    protected String idProductoPadre;
    @XmlElement(name = "IdServicio", required = true)
    protected String idServicio;
    @XmlElement(name = "IdServicioPadre", required = true)
    protected String idServicioPadre;
    @XmlElement(name = "IdVenta", required = true)
    protected String idVenta;
    @XmlElement(name = "IdVentaPadre", required = true)
    protected String idVentaPadre;
    @XmlElement(name = "IdPromotor", required = true)
    protected String idPromotor;
    @XmlElement(name = "FechaDiferida", required = true)
    protected String fechaDiferida;
    @XmlElement(name = "IdEstado", required = true)
    protected String idEstado;

    /**
     * Gets the value of the authKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthKey() {
        return authKey;
    }

    /**
     * Sets the value of the authKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthKey(String value) {
        this.authKey = value;
    }

    /**
     * Gets the value of the clienteCRM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClienteCRM() {
        return clienteCRM;
    }

    /**
     * Sets the value of the clienteCRM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClienteCRM(String value) {
        this.clienteCRM = value;
    }

    /**
     * Gets the value of the idProducto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdProducto() {
        return idProducto;
    }

    /**
     * Sets the value of the idProducto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdProducto(String value) {
        this.idProducto = value;
    }

    /**
     * Gets the value of the idProductoPadre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdProductoPadre() {
        return idProductoPadre;
    }

    /**
     * Sets the value of the idProductoPadre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdProductoPadre(String value) {
        this.idProductoPadre = value;
    }

    /**
     * Gets the value of the idServicio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdServicio() {
        return idServicio;
    }

    /**
     * Sets the value of the idServicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdServicio(String value) {
        this.idServicio = value;
    }

    /**
     * Gets the value of the idServicioPadre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdServicioPadre() {
        return idServicioPadre;
    }

    /**
     * Sets the value of the idServicioPadre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdServicioPadre(String value) {
        this.idServicioPadre = value;
    }

    /**
     * Gets the value of the idVenta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdVenta() {
        return idVenta;
    }

    /**
     * Sets the value of the idVenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdVenta(String value) {
        this.idVenta = value;
    }

    /**
     * Gets the value of the idVentaPadre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdVentaPadre() {
        return idVentaPadre;
    }

    /**
     * Sets the value of the idVentaPadre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdVentaPadre(String value) {
        this.idVentaPadre = value;
    }

    /**
     * Gets the value of the idPromotor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPromotor() {
        return idPromotor;
    }

    /**
     * Sets the value of the idPromotor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPromotor(String value) {
        this.idPromotor = value;
    }

    /**
     * Gets the value of the fechaDiferida property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaDiferida() {
        return fechaDiferida;
    }

    /**
     * Sets the value of the fechaDiferida property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaDiferida(String value) {
        this.fechaDiferida = value;
    }

    /**
     * Gets the value of the idEstado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdEstado() {
        return idEstado;
    }

    /**
     * Sets the value of the idEstado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdEstado(String value) {
        this.idEstado = value;
    }

}
