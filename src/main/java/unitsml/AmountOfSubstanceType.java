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
 * Type of the quantity amount of substance.
 * 
 * <p>Java-Klasse für AmountOfSubstanceType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AmountOfSubstanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}powerRational"/>
 *       &lt;attribute name="symbol" type="{http://www.w3.org/2001/XMLSchema}token" fixed="N" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountOfSubstanceType")
public class AmountOfSubstanceType {

    @XmlAttribute(name = "symbol")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String symbol;
    @XmlAttribute(name = "powerNumerator")
    protected Byte powerNumerator;
    @XmlAttribute(name = "powerDenominator")
    protected Byte powerDenominator;

    /**
     * Ruft den Wert der symbol-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbol() {
        if (symbol == null) {
            return "N";
        } else {
            return symbol;
        }
    }

    /**
     * Legt den Wert der symbol-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbol(String value) {
        this.symbol = value;
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
