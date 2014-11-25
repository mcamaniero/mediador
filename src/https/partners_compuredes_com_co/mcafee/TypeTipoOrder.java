
package https.partners_compuredes_com_co.mcafee;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for typeTipoOrder.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeTipoOrder">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NewOrder"/>
 *     &lt;enumeration value="TrialOrder"/>
 *     &lt;enumeration value="Update"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum TypeTipoOrder {

    @XmlEnumValue("NewOrder")
    NEW_ORDER("NewOrder"),
    @XmlEnumValue("TrialOrder")
    TRIAL_ORDER("TrialOrder"),
    @XmlEnumValue("Update")
    UPDATE("Update");
    private final String value;

    TypeTipoOrder(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeTipoOrder fromValue(String v) {
        for (TypeTipoOrder c: TypeTipoOrder.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
