
package https.partners_compuredes_com_co.mcafee;

import javax.xml.bind.annotation.XmlEnum;


/**
 * <p>Java class for typeTipoPeticion.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeTipoPeticion">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NEW"/>
 *     &lt;enumeration value="UPDATE"/>
 *     &lt;enumeration value="UPDPROFILE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum TypeTipoPeticion {

    NEW,
    UPDATE,
    UPDPROFILE;

    public String value() {
        return name();
    }

    public static TypeTipoPeticion fromValue(String v) {
        return valueOf(v);
    }

}
