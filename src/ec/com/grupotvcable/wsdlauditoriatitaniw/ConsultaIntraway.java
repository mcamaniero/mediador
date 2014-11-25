
package ec.com.grupotvcable.wsdlauditoriatitaniw;

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
 *         &lt;element name="EjecutaConsulta" type="{http://www.grupotvcable.com.ec/WsdlAuditoriaTitanIw/}EjecutaConsulta"/>
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
    "ejecutaConsulta"
})
@XmlRootElement(name = "ConsultaIntraway")
public class ConsultaIntraway {

    @XmlElement(name = "EjecutaConsulta", required = true)
    protected EjecutaConsulta ejecutaConsulta;

    /**
     * Gets the value of the ejecutaConsulta property.
     * 
     * @return
     *     possible object is
     *     {@link EjecutaConsulta }
     *     
     */
    public EjecutaConsulta getEjecutaConsulta() {
        return ejecutaConsulta;
    }

    /**
     * Sets the value of the ejecutaConsulta property.
     * 
     * @param value
     *     allowed object is
     *     {@link EjecutaConsulta }
     *     
     */
    public void setEjecutaConsulta(EjecutaConsulta value) {
        this.ejecutaConsulta = value;
    }

}
