
package ec.com.grupotvcable.wsdlauditoriatitaniw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EjecutaConsulta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EjecutaConsulta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDEmpresa" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ClienteCRM" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Contrato" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EjecutaConsulta", propOrder = {
    "idEmpresa",
    "clienteCRM",
    "contrato"
})
public class EjecutaConsulta {

    @XmlElement(name = "IDEmpresa")
    protected int idEmpresa;
    @XmlElement(name = "ClienteCRM", required = true)
    protected String clienteCRM;
    @XmlElement(name = "Contrato", required = true)
    protected String contrato;

    /**
     * Gets the value of the idEmpresa property.
     * 
     */
    public int getIDEmpresa() {
        return idEmpresa;
    }

    /**
     * Sets the value of the idEmpresa property.
     * 
     */
    public void setIDEmpresa(int value) {
        this.idEmpresa = value;
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
     * Gets the value of the contrato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContrato() {
        return contrato;
    }

    /**
     * Sets the value of the contrato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContrato(String value) {
        this.contrato = value;
    }

}
