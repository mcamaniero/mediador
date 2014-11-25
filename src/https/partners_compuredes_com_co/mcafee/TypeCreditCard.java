
package https.partners_compuredes_com_co.mcafee;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;


/**
 * <p>Java class for typeCreditCard.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCreditCard">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VISA"/>
 *     &lt;enumeration value="MASTERCARD"/>
 *     &lt;enumeration value="AMEX"/>
 *     &lt;enumeration value="Discover"/>
 *     &lt;enumeration value="Diners_Club"/>
 *     &lt;enumeration value="JCB"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum TypeCreditCard {

    AMEX("AMEX"),
    @XmlEnumValue("Diners_Club")
    DINERS_CLUB("Diners_Club"),
    @XmlEnumValue("Discover")
    DISCOVER("Discover"),
    JCB("JCB"),
    MASTERCARD("MASTERCARD"),
    VISA("VISA");
    private final String value;

    TypeCreditCard(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeCreditCard fromValue(String v) {
        for (TypeCreditCard c: TypeCreditCard.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v.toString());
    }

}
