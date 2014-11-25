
package ec.com.grupotvcable.wsdltellabs;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DatosExtrasTDD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatosExtrasTDD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tecnologia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumCircuito" type="{http://www.grupotvcable.com.ec/WsdlTellabs/}NumCircuito" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Customer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Velocidad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Nodo1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Nodo2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EstConexion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FechaCrea" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="BC" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Lport1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Lport2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosExtrasTDD", propOrder = {
    "tecnologia",
    "numCircuito",
    "customer",
    "velocidad",
    "nodo1",
    "nodo2",
    "estConexion",
    "fechaCrea",
    "bc",
    "be",
    "lport1",
    "lport2"
})
public class DatosExtrasTDD {

    @XmlElement(name = "Tecnologia", required = true)
    protected String tecnologia;
    @XmlElement(name = "NumCircuito", required = true)
    protected List<NumCircuito> numCircuito;
    @XmlElement(name = "Customer", required = true)
    protected String customer;
    @XmlElement(name = "Velocidad")
    protected int velocidad;
    @XmlElement(name = "Nodo1", required = true)
    protected String nodo1;
    @XmlElement(name = "Nodo2", required = true)
    protected String nodo2;
    @XmlElement(name = "EstConexion", required = true)
    protected String estConexion;
    @XmlElement(name = "FechaCrea", required = true)
    protected XMLGregorianCalendar fechaCrea;
    @XmlElement(name = "BC")
    protected int bc;
    @XmlElement(name = "BE")
    protected int be;
    @XmlElement(name = "Lport1", required = true)
    protected String lport1;
    @XmlElement(name = "Lport2", required = true)
    protected String lport2;

    /**
     * Gets the value of the tecnologia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTecnologia() {
        return tecnologia;
    }

    /**
     * Sets the value of the tecnologia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTecnologia(String value) {
        this.tecnologia = value;
    }

    /**
     * Gets the value of the numCircuito property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numCircuito property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumCircuito().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumCircuito }
     * 
     * 
     */
    public List<NumCircuito> getNumCircuito() {
        if (numCircuito == null) {
            numCircuito = new ArrayList<NumCircuito>();
        }
        return this.numCircuito;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomer(String value) {
        this.customer = value;
    }

    /**
     * Gets the value of the velocidad property.
     * 
     */
    public int getVelocidad() {
        return velocidad;
    }

    /**
     * Sets the value of the velocidad property.
     * 
     */
    public void setVelocidad(int value) {
        this.velocidad = value;
    }

    /**
     * Gets the value of the nodo1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodo1() {
        return nodo1;
    }

    /**
     * Sets the value of the nodo1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodo1(String value) {
        this.nodo1 = value;
    }

    /**
     * Gets the value of the nodo2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodo2() {
        return nodo2;
    }

    /**
     * Sets the value of the nodo2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodo2(String value) {
        this.nodo2 = value;
    }

    /**
     * Gets the value of the estConexion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstConexion() {
        return estConexion;
    }

    /**
     * Sets the value of the estConexion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstConexion(String value) {
        this.estConexion = value;
    }

    /**
     * Gets the value of the fechaCrea property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCrea() {
        return fechaCrea;
    }

    /**
     * Sets the value of the fechaCrea property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCrea(XMLGregorianCalendar value) {
        this.fechaCrea = value;
    }

    /**
     * Gets the value of the bc property.
     * 
     */
    public int getBC() {
        return bc;
    }

    /**
     * Sets the value of the bc property.
     * 
     */
    public void setBC(int value) {
        this.bc = value;
    }

    /**
     * Gets the value of the be property.
     * 
     */
    public int getBE() {
        return be;
    }

    /**
     * Sets the value of the be property.
     * 
     */
    public void setBE(int value) {
        this.be = value;
    }

    /**
     * Gets the value of the lport1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLport1() {
        return lport1;
    }

    /**
     * Sets the value of the lport1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLport1(String value) {
        this.lport1 = value;
    }

    /**
     * Gets the value of the lport2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLport2() {
        return lport2;
    }

    /**
     * Sets the value of the lport2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLport2(String value) {
        this.lport2 = value;
    }

}
