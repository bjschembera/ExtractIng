//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.02.05 um 05:02:22 PM CET 
//


package unitsml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for dimension.
 * 
 * <p>Java-Klasse für DimensionType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DimensionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}Length" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}Mass" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}Time" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}ElectricCurrent" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}ThermodynamicTemperature" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}AmountOfSubstance" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}LuminousIntensity" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}PlaneAngle" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}Item" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}id use="required""/>
 *       &lt;attribute name="dimensionless" type="{http://www.w3.org/2001/XMLSchema}boolean" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DimensionType", propOrder = {
    "lengthAndMassAndTime"
})
public class DimensionType {

    @XmlElements({
        @XmlElement(name = "Length", type = LengthType.class),
        @XmlElement(name = "Mass", type = MassType.class),
        @XmlElement(name = "Time", type = TimeType.class),
        @XmlElement(name = "ElectricCurrent", type = ElectricCurrentType.class),
        @XmlElement(name = "ThermodynamicTemperature", type = ThermodynamicTemperatureType.class),
        @XmlElement(name = "AmountOfSubstance", type = AmountOfSubstanceType.class),
        @XmlElement(name = "LuminousIntensity", type = LuminousIntensityType.class),
        @XmlElement(name = "PlaneAngle", type = PlaneAngleType.class),
        @XmlElement(name = "Item", type = ItemType.class)
    })
    protected List<Object> lengthAndMassAndTime;
    @XmlAttribute(name = "id", namespace = "http://www.w3.org/XML/1998/namespace", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "dimensionless")
    protected Boolean dimensionless;

    /**
     * Gets the value of the lengthAndMassAndTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lengthAndMassAndTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLengthAndMassAndTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LengthType }
     * {@link MassType }
     * {@link TimeType }
     * {@link ElectricCurrentType }
     * {@link ThermodynamicTemperatureType }
     * {@link AmountOfSubstanceType }
     * {@link LuminousIntensityType }
     * {@link PlaneAngleType }
     * {@link ItemType }
     * 
     * 
     */
    public List<Object> getLengthAndMassAndTime() {
        if (lengthAndMassAndTime == null) {
            lengthAndMassAndTime = new ArrayList<Object>();
        }
        return this.lengthAndMassAndTime;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der dimensionless-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDimensionless() {
        if (dimensionless == null) {
            return false;
        } else {
            return dimensionless;
        }
    }

    /**
     * Legt den Wert der dimensionless-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDimensionless(Boolean value) {
        this.dimensionless = value;
    }

}
