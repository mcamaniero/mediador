
package https.partners_compuredes_com_co.mcafee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="tipoLogin" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "tipoLogin"
})
@XmlRootElement(name = "wmCreateSession")
public class WmCreateSession {

    protected int tipoLogin;

    /**
     * Gets the value of the tipoLogin property.
     * 
     */
    public int getTipoLogin() {
        return tipoLogin;
    }

    /**
     * Sets the value of the tipoLogin property.
     * 
     */
    public void setTipoLogin(int value) {
        this.tipoLogin = value;
    }

}
