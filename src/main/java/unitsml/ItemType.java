//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.02.05 um 05:02:22 PM CET 
//


package unitsml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type of the quantity represented by a counted item, e.g., electron
 * 
 * <p>Java-Klasse für ItemType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}powerRational"/>
 *       &lt;attribute name="itemURL" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="itemSymbol" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemType")
public class ItemType {

    @XmlAttribute(name = "itemURL", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String itemURL;
    @XmlAttribute(name = "itemSymbol")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String itemSymbol;
    @XmlAttribute(name = "powerNumerator")
    protected Byte powerNumerator;
    @XmlAttribute(name = "powerDenominator")
    protected Byte powerDenominator;

    /**
     * Ruft den Wert der itemURL-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemURL() {
        return itemURL;
    }

    /**
     * Legt den Wert der itemURL-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemURL(String value) {
        this.itemURL = value;
    }

    /**
     * Ruft den Wert der itemSymbol-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemSymbol() {
        return itemSymbol;
    }

    /**
     * Legt den Wert der itemSymbol-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemSymbol(String value) {
        this.itemSymbol = value;
    }

    /**
     * Ruft den Wert der powerNumerator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public byte getPowerNumerator() {
        if (powerNumerator == null) {
            return ((byte) 1);
        } else {
            return powerNumerator;
        }
    }

    /**
     * Legt den Wert der powerNumerator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setPowerNumerator(Byte value) {
        this.powerNumerator = value;
    }

    /**
     * Ruft den Wert der powerDenominator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public byte getPowerDenominator() {
        if (powerDenominator == null) {
            return ((byte) 1);
        } else {
            return powerDenominator;
        }
    }

    /**
     * Legt den Wert der powerDenominator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setPowerDenominator(Byte value) {
        this.powerDenominator = value;
    }

}
