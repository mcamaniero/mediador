
package https.partners_compuredes_com_co.mcafee;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for typeSaludation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeSaludation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Mr"/>
 *     &lt;enumeration value="Ms"/>
 *     &lt;enumeration value="Mrs"/>
 *     &lt;enumeration value="Miss"/>
 *     &lt;enumeration value="Dr"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum TypeSaludation {

    @XmlEnumValue("Dr")
    DR("Dr"),
    @XmlEnumValue("Miss")
    MISS("Miss"),
    @XmlEnumValue("Mr")
    MR("Mr"),
    @XmlEnumValue("Mrs")
    MRS("Mrs"),
    @XmlEnumValue("Ms")
    MS("Ms");
    private final String value;

    TypeSaludation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeSaludation fromValue(String v) {
        for (TypeSaludation c: TypeSaludation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
