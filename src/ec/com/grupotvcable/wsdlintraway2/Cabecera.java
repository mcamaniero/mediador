
package ec.com.grupotvcable.wsdlintraway2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Cabecera complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Cabecera">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Negocio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Interface" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Secuencia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cabecera", propOrder = {
    "idEmpresa",
    "negocio",
    "_interface",
    "secuencia"
})
public class Cabecera {

    @XmlElement(name = "IDEmpresa", required = true)
    protected String idEmpresa;
    @XmlElement(name = "Negocio", required = true)
    protected String negocio;
    @XmlElement(name = "Interface", required = true)
    protected String _interface;
    @XmlElement(name = "Secuencia", required = true)
    protected String secuencia;

    /**
     * Gets the value of the idEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDEmpresa() {
        return idEmpresa;
    }

    /**
     * Sets the value of the idEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDEmpresa(String value) {
        this.idEmpresa = value;
    }

    /**
     * Gets the value of the negocio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegocio() {
        return negocio;
    }

    /**
     * Sets the value of the negocio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegocio(String value) {
        this.negocio = value;
    }

    /**
     * Gets the value of the interface property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterface() {
        return _interface;
    }

    /**
     * Sets the value of the interface property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterface(String value) {
        this._interface = value;
    }

    /**
     * Gets the value of the secuencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecuencia() {
        return secuencia;
    }

    /**
     * Sets the value of the secuencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecuencia(String value) {
        this.secuencia = value;
    }

}
