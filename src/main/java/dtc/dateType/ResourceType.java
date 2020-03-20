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
 * <p>Java-Klasse für resourceType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="resourceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Audiovisual"/>
 *     &lt;enumeration value="Collection"/>
 *     &lt;enumeration value="Dataset"/>
 *     &lt;enumeration value="Event"/>
 *     &lt;enumeration value="Image"/>
 *     &lt;enumeration value="InteractiveResource"/>
 *     &lt;enumeration value="Model"/>
 *     &lt;enumeration value="PhysicalObject"/>
 *     &lt;enumeration value="Service"/>
 *     &lt;enumeration value="Software"/>
 *     &lt;enumeration value="Sound"/>
 *     &lt;enumeration value="Text"/>
 *     &lt;enumeration value="Workflow"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "resourceType")
@XmlEnum
public enum ResourceType {

    @XmlEnumValue("Audiovisual")
    AUDIOVISUAL("Audiovisual"),
    @XmlEnumValue("Collection")
    COLLECTION("Collection"),
    @XmlEnumValue("Dataset")
    DATASET("Dataset"),
    @XmlEnumValue("Event")
    EVENT("Event"),
    @XmlEnumValue("Image")
    IMAGE("Image"),
    @XmlEnumValue("InteractiveResource")
    INTERACTIVE_RESOURCE("InteractiveResource"),
    @XmlEnumValue("Model")
    MODEL("Model"),
    @XmlEnumValue("PhysicalObject")
    PHYSICAL_OBJECT("PhysicalObject"),
    @XmlEnumValue("Service")
    SERVICE("Service"),
    @XmlEnumValue("Software")
    SOFTWARE("Software"),
    @XmlEnumValue("Sound")
    SOUND("Sound"),
    @XmlEnumValue("Text")
    TEXT("Text"),
    @XmlEnumValue("Workflow")
    WORKFLOW("Workflow"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ResourceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResourceType fromValue(String v) {
        for (ResourceType c: ResourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
