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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for the container for defining derived units in terms of their root units. This allows a precise definition of a wide range of units. The goal is to improve interoperability among applications and databases which use derived units based on commonly encountered base units.
 * 
 * <p>Java-Klasse für RootUnitsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RootUnitsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}EnumeratedRootUnit" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}ExternalRootUnit" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RootUnitsType", propOrder = {
    "enumeratedRootUnit",
    "externalRootUnit"
})
public class RootUnitsType {

    @XmlElement(name = "EnumeratedRootUnit")
    protected List<EnumeratedRootUnitType> enumeratedRootUnit;
    @XmlElement(name = "ExternalRootUnit")
    protected List<ExternalRootUnitType> externalRootUnit;

    /**
     * Element for a root unit (from an extensive enumerated list) allowing an optional prefix and power. E.g., mm^2 Gets the value of the enumeratedRootUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enumeratedRootUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnumeratedRootUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnumeratedRootUnitType }
     * 
     * 
     */
    public List<EnumeratedRootUnitType> getEnumeratedRootUnit() {
        if (enumeratedRootUnit == null) {
            enumeratedRootUnit = new ArrayList<EnumeratedRootUnitType>();
        }
        return this.enumeratedRootUnit;
    }

    /**
     * Element for those special cases where the root unit needed is not included in the enumerated list in the above element.Gets the value of the externalRootUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalRootUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalRootUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalRootUnitType }
     * 
     * 
     */
    public List<ExternalRootUnitType> getExternalRootUnit() {
        if (externalRootUnit == null) {
            externalRootUnit = new ArrayList<ExternalRootUnitType>();
        }
        return this.externalRootUnit;
    }

}
