
package ec.com.grupotvcable.wsdlmcafeeconsultaweb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Respuesta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Respuesta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodError" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DetMensaje" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IdMcAfee" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isFamiliaProtegida" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PasswordMcAfee" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Respuesta", propOrder = {
    "codError",
    "detMensaje",
    "idMcAfee",
    "isFamiliaProtegida",
    "passwordMcAfee"
})
public class Respuesta {

    @XmlElement(name = "CodError", required = true)
    protected String codError;
    @XmlElement(name = "DetMensaje", required = true)
    protected String detMensaje;
    @XmlElement(name = "IdMcAfee", required = true)
    protected String idMcAfee;
    @XmlElement(required = true)
    protected String isFamiliaProtegida;
    @XmlElement(name = "PasswordMcAfee", required = true)
    protected String passwordMcAfee;

    /**
     * Gets the value of the codError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodError() {
        return codError;
    }

    /**
     * Sets the value of the codError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodError(String value) {
        this.codError = value;
    }

    /**
     * Gets the value of the detMensaje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetMensaje() {
        return detMensaje;
    }

    /**
     * Sets the value of the detMensaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetMensaje(String value) {
        this.detMensaje = value;
    }

    /**
     * Gets the value of the idMcAfee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdMcAfee() {
        return idMcAfee;
    }

    /**
     * Sets the value of the idMcAfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdMcAfee(String value) {
        this.idMcAfee = value;
    }

    /**
     * Gets the value of the isFamiliaProtegida property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsFamiliaProtegida() {
        return isFamiliaProtegida;
    }

    /**
     * Sets the value of the isFamiliaProtegida property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsFamiliaProtegida(String value) {
        this.isFamiliaProtegida = value;
    }

    /**
     * Gets the value of the passwordMcAfee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordMcAfee() {
        return passwordMcAfee;
    }

    /**
     * Sets the value of the passwordMcAfee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordMcAfee(String value) {
        this.passwordMcAfee = value;
    }

}
