
package ec.com.grupotvcable.wsdlauditoriatitaniw;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TipoCliente" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CableModem" type="{http://www.grupotvcable.com.ec/WsdlAuditoriaTitanIw/}CableModem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.grupotvcable.com.ec/WsdlAuditoriaTitanIw/}Email" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DialUp" type="{http://www.grupotvcable.com.ec/WsdlAuditoriaTitanIw/}DialUp" maxOccurs="unbounded" minOccurs="0"/>
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
    "nombre",
    "userName",
    "tipoCliente",
    "cableModem",
    "email",
    "dialUp"
})
public class Respuesta {

    @XmlElement(name = "CodError", required = true)
    protected String codError;
    @XmlElement(name = "DetMensaje", required = true)
    protected String detMensaje;
    @XmlElement(name = "Nombre", required = true)
    protected String nombre;
    @XmlElement(name = "UserName", required = true)
    protected String userName;
    @XmlElement(name = "TipoCliente", required = true)
    protected String tipoCliente;
    @XmlElement(name = "CableModem", required = true)
    protected List<CableModem> cableModem;
    @XmlElement(name = "Email", required = true)
    protected List<Email> email;
    @XmlElement(name = "DialUp", required = true)
    protected List<DialUp> dialUp;

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
     * Gets the value of the nombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the tipoCliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCliente() {
        return tipoCliente;
    }

    /**
     * Sets the value of the tipoCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCliente(String value) {
        this.tipoCliente = value;
    }

    /**
     * Gets the value of the cableModem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cableModem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCableModem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CableModem }
     * 
     * 
     */
    public List<CableModem> getCableModem() {
        if (cableModem == null) {
            cableModem = new ArrayList<CableModem>();
        }
        return this.cableModem;
    }

    /**
     * Gets the value of the email property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the email property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Email }
     * 
     * 
     */
    public List<Email> getEmail() {
        if (email == null) {
            email = new ArrayList<Email>();
        }
        return this.email;
    }

    /**
     * Gets the value of the dialUp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dialUp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDialUp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DialUp }
     * 
     * 
     */
    public List<DialUp> getDialUp() {
        if (dialUp == null) {
            dialUp = new ArrayList<DialUp>();
        }
        return this.dialUp;
    }

}
