
package https.partners_compuredes_com_co.mcafee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clsOrdenConsumer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clsOrdenConsumer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="objArticulos" type="{https://partners.compuredes.com.co/mcafee}ArrayOfClsItemsConsumer" minOccurs="0"/>
 *         &lt;element name="Referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clsOrdenConsumer", propOrder = {
    "objArticulos",
    "referencia",
    "id"
})
public class ClsOrdenConsumer {

    protected ArrayOfClsItemsConsumer objArticulos;
    @XmlElement(name = "Referencia")
    protected String referencia;
    @XmlElement(name = "Id")
    protected String id;

    /**
     * Gets the value of the objArticulos property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfClsItemsConsumer }
     *     
     */
    public ArrayOfClsItemsConsumer getObjArticulos() {
        return objArticulos;
    }

    /**
     * Sets the value of the objArticulos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfClsItemsConsumer }
     *     
     */
    public void setObjArticulos(ArrayOfClsItemsConsumer value) {
        this.objArticulos = value;
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

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
