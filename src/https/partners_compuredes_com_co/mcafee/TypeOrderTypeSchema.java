
package https.partners_compuredes_com_co.mcafee;

import javax.xml.bind.annotation.XmlEnum;


/**
 * <p>Java class for typeOrderTypeSchema.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeOrderTypeSchema">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TPFSB"/>
 *     &lt;enumeration value="SMS"/>
 *     &lt;enumeration value="TPFSBT"/>
 *     &lt;enumeration value="TPFSBAT"/>
 *     &lt;enumeration value="SMST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlEnum
public enum TypeOrderTypeSchema {

    SMS,
    SMST,
    TPFSB,
    TPFSBAT,
    TPFSBT;

    public String value() {
        return name();
    }

    public static TypeOrderTypeSchema fromValue(String v) {
        return valueOf(v);
    }

}
