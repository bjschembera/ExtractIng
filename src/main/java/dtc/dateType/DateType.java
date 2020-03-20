//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.02.05 um 05:02:22 PM CET 
//


package dtc.dateType;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für dateType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="dateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Accepted"/>
 *     &lt;enumeration value="Available"/>
 *     &lt;enumeration value="Collected"/>
 *     &lt;enumeration value="Copyrighted"/>
 *     &lt;enumeration value="Created"/>
 *     &lt;enumeration value="Issued"/>
 *     &lt;enumeration value="Submitted"/>
 *     &lt;enumeration value="Updated"/>
 *     &lt;enumeration value="Valid"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dateType")
@XmlEnum
public enum DateType {

    @XmlEnumValue("Accepted")
    ACCEPTED("Accepted"),
    @XmlEnumValue("Available")
    AVAILABLE("Available"),
    @XmlEnumValue("Collected")
    COLLECTED("Collected"),
    @XmlEnumValue("Copyrighted")
    COPYRIGHTED("Copyrighted"),
    @XmlEnumValue("Created")
    CREATED("Created"),
    @XmlEnumValue("Issued")
    ISSUED("Issued"),
    @XmlEnumValue("Submitted")
    SUBMITTED("Submitted"),
    @XmlEnumValue("Updated")
    UPDATED("Updated"),
    @XmlEnumValue("Valid")
    VALID("Valid");
    private final String value;

    DateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DateType fromValue(String v) {
        for (DateType c: DateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
