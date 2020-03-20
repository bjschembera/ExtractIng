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
 * <p>Java-Klasse für descriptionType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="descriptionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Abstract"/>
 *     &lt;enumeration value="Methods"/>
 *     &lt;enumeration value="SeriesInformation"/>
 *     &lt;enumeration value="TableOfContents"/>
 *     &lt;enumeration value="TechnicalInfo"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "descriptionType")
@XmlEnum
public enum DescriptionType {

    @XmlEnumValue("Abstract")
    ABSTRACT("Abstract"),
    @XmlEnumValue("Methods")
    METHODS("Methods"),
    @XmlEnumValue("SeriesInformation")
    SERIES_INFORMATION("SeriesInformation"),
    @XmlEnumValue("TableOfContents")
    TABLE_OF_CONTENTS("TableOfContents"),
    @XmlEnumValue("TechnicalInfo")
    TECHNICAL_INFO("TechnicalInfo"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    DescriptionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DescriptionType fromValue(String v) {
        for (DescriptionType c: DescriptionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
