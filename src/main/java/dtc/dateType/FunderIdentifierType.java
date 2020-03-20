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
 * <p>Java-Klasse für funderIdentifierType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="funderIdentifierType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ISNI"/>
 *     &lt;enumeration value="GRID"/>
 *     &lt;enumeration value="Crossref Funder ID"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "funderIdentifierType")
@XmlEnum
public enum FunderIdentifierType {

    ISNI("ISNI"),
    GRID("GRID"),
    @XmlEnumValue("Crossref Funder ID")
    CROSSREF_FUNDER_ID("Crossref Funder ID"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    FunderIdentifierType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FunderIdentifierType fromValue(String v) {
        for (FunderIdentifierType c: FunderIdentifierType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
