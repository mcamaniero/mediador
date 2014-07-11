
package ec.com.grupotvcable.wsdlauris;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Mensaje complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Mensaje">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodError" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DetMensaje" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DatosExtrasAuris" type="{http://www.grupotvcable.com.ec/WsdlAuris/}DatosExtrasAuris"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mensaje", propOrder = {
    "codError",
    "detMensaje",
    "datosExtrasAuris"
})
public class Mensaje {

    @XmlElement(name = "CodError")
    protected int codError;
    @XmlElement(name = "DetMensaje", required = true)
    protected String detMensaje;
    @XmlElement(name = "DatosExtrasAuris", required = true)
    protected DatosExtrasAuris datosExtrasAuris;

    /**
     * Gets the value of the codError property.
     * 
     */
    public int getCodError() {
        return codError;
    }

    /**
     * Sets the value of the codError property.
     * 
     */
    public void setCodError(int value) {
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
     * Gets the value of the datosExtrasAuris property.
     * 
     * @return
     *     possible object is
     *     {@link DatosExtrasAuris }
     *     
     */
    public DatosExtrasAuris getDatosExtrasAuris() {
        return datosExtrasAuris;
    }

    /**
     * Sets the value of the datosExtrasAuris property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosExtrasAuris }
     *     
     */
    public void setDatosExtrasAuris(DatosExtrasAuris value) {
        this.datosExtrasAuris = value;
    }

}
