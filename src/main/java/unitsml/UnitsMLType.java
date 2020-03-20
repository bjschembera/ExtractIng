//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.02.05 um 05:02:22 PM CET 
//


package unitsml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * ComplexType for the root element of an UnitsML document.
 * 
 * <p>Java-Klasse für UnitsMLType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UnitsMLType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}UnitSet" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}CountedItemSet" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}QuantitySet" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}DimensionSet" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}PrefixSet" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitsMLType", propOrder = {
    "unitSet",
    "countedItemSet",
    "quantitySet",
    "dimensionSet",
    "prefixSet"
})
public class UnitsMLType {

    @XmlElement(name = "UnitSet")
    protected UnitSetType unitSet;
    @XmlElement(name = "CountedItemSet")
    protected CountedItemSetType countedItemSet;
    @XmlElement(name = "QuantitySet")
    protected QuantitySetType quantitySet;
    @XmlElement(name = "DimensionSet")
    protected DimensionSetType dimensionSet;
    @XmlElement(name = "PrefixSet")
    protected PrefixSetType prefixSet;

    /**
     * Ruft den Wert der unitSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UnitSetType }
     *     
     */
    public UnitSetType getUnitSet() {
        return unitSet;
    }

    /**
     * Legt den Wert der unitSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitSetType }
     *     
     */
    public void setUnitSet(UnitSetType value) {
        this.unitSet = value;
    }

    /**
     * Ruft den Wert der countedItemSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CountedItemSetType }
     *     
     */
    public CountedItemSetType getCountedItemSet() {
        return countedItemSet;
    }

    /**
     * Legt den Wert der countedItemSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CountedItemSetType }
     *     
     */
    public void setCountedItemSet(CountedItemSetType value) {
        this.countedItemSet = value;
    }

    /**
     * Ruft den Wert der quantitySet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link QuantitySetType }
     *     
     */
    public QuantitySetType getQuantitySet() {
        return quantitySet;
    }

    /**
     * Legt den Wert der quantitySet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantitySetType }
     *     
     */
    public void setQuantitySet(QuantitySetType value) {
        this.quantitySet = value;
    }

    /**
     * Ruft den Wert der dimensionSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DimensionSetType }
     *     
     */
    public DimensionSetType getDimensionSet() {
        return dimensionSet;
    }

    /**
     * Legt den Wert der dimensionSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionSetType }
     *     
     */
    public void setDimensionSet(DimensionSetType value) {
        this.dimensionSet = value;
    }

    /**
     * Ruft den Wert der prefixSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PrefixSetType }
     *     
     */
    public PrefixSetType getPrefixSet() {
        return prefixSet;
    }

    /**
     * Legt den Wert der prefixSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefixSetType }
     *     
     */
    public void setPrefixSet(PrefixSetType value) {
        this.prefixSet = value;
    }

}
