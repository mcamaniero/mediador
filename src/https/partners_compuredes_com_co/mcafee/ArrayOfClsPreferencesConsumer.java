
package https.partners_compuredes_com_co.mcafee;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfClsPreferencesConsumer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClsPreferencesConsumer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clsPreferencesConsumer" type="{https://partners.compuredes.com.co/mcafee}clsPreferencesConsumer" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClsPreferencesConsumer", propOrder = {
    "clsPreferencesConsumer"
})
public class ArrayOfClsPreferencesConsumer {

    @XmlElement(required = true, nillable = true)
    protected List<ClsPreferencesConsumer> clsPreferencesConsumer;

    /**
     * Gets the value of the clsPreferencesConsumer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clsPreferencesConsumer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClsPreferencesConsumer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClsPreferencesConsumer }
     * 
     * 
     */
    public List<ClsPreferencesConsumer> getClsPreferencesConsumer() {
        if (clsPreferencesConsumer == null) {
            clsPreferencesConsumer = new ArrayList<ClsPreferencesConsumer>();
        }
        return this.clsPreferencesConsumer;
    }

}
