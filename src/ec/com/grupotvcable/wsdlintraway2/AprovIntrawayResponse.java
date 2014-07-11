
package ec.com.grupotvcable.wsdlintraway2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consultaRespuesta" type="{http://www.grupotvcable.com.ec/WsdlIntraway2/}Respuesta"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "consultaRespuesta"
})
@XmlRootElement(name = "AprovIntrawayResponse")
public class AprovIntrawayResponse {

    @XmlElement(required = true)
    protected Respuesta consultaRespuesta;

    /**
     * Gets the value of the consultaRespuesta property.
     * 
     * @return
     *     possible object is
     *     {@link Respuesta }
     *     
     */
    public Respuesta getConsultaRespuesta() {
        return consultaRespuesta;
    }

    /**
     * Sets the value of the consultaRespuesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Respuesta }
     *     
     */
    public void setConsultaRespuesta(Respuesta value) {
        this.consultaRespuesta = value;
    }

}
