//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.02.05 um 05:02:22 PM CET 
//


package exptml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für salutationType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="salutationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Dr."/>
 *     &lt;enumeration value="Mr."/>
 *     &lt;enumeration value="Mrs."/>
 *     &lt;enumeration value="Ms."/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "salutationType")
@XmlEnum
public enum SalutationType {

    @XmlEnumValue("Dr.")
    DR("Dr."),
    @XmlEnumValue("Mr.")
    MR("Mr."),
    @XmlEnumValue("Mrs.")
    MRS("Mrs."),
    @XmlEnumValue("Ms.")
    MS("Ms.");
    private final String value;

    SalutationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SalutationType fromValue(String v) {
        for (SalutationType c: SalutationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
