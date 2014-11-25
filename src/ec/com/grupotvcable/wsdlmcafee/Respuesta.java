
package ec.com.grupotvcable.wsdlmcafee;

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
 *         &lt;element name="Referencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "referencia"
})
public class Respuesta {

    @XmlElement(name = "CodError", required = true)
    protected String codError;
    @XmlElement(name = "DetMensaje", required = true)
    protected String detMensaje;
    @XmlElement(name = "IdMcAfee", required = true)
    protected String idMcAfee;
    @XmlElement(name = "Referencia", required = true)
    protected String referencia;

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

}
