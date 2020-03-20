//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.02.05 um 05:02:22 PM CET 
//


package premis;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für relatedEventIdentifierComplexType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="relatedEventIdentifierComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}relatedEventIdentifierType"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}relatedEventIdentifierValue"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}relatedEventSequence" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RelEventXmlID" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="simpleLink" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "relatedEventIdentifierComplexType", propOrder = {
    "relatedEventIdentifierType",
    "relatedEventIdentifierValue",
    "relatedEventSequence"
})
public class RelatedEventIdentifierComplexType {

    @XmlElement(required = true)
    protected StringPlusAuthority relatedEventIdentifierType;
    @XmlElement(required = true)
    protected String relatedEventIdentifierValue;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger relatedEventSequence;
    @XmlAttribute(name = "RelEventXmlID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object relEventXmlID;
    @XmlAttribute(name = "simpleLink")
    @XmlSchemaType(name = "anyURI")
    protected String simpleLink;

    /**
     * Ruft den Wert der relatedEventIdentifierType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StringPlusAuthority }
     *     
     */
    public StringPlusAuthority getRelatedEventIdentifierType() {
        return relatedEventIdentifierType;
    }

    /**
     * Legt den Wert der relatedEventIdentifierType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StringPlusAuthority }
     *     
     */
    public void setRelatedEventIdentifierType(StringPlusAuthority value) {
        this.relatedEventIdentifierType = value;
    }

    /**
     * Ruft den Wert der relatedEventIdentifierValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedEventIdentifierValue() {
        return relatedEventIdentifierValue;
    }

    /**
     * Legt den Wert der relatedEventIdentifierValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedEventIdentifierValue(String value) {
        this.relatedEventIdentifierValue = value;
    }

    /**
     * Ruft den Wert der relatedEventSequence-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRelatedEventSequence() {
        return relatedEventSequence;
    }

    /**
     * Legt den Wert der relatedEventSequence-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRelatedEventSequence(BigInteger value) {
        this.relatedEventSequence = value;
    }

    /**
     * Ruft den Wert der relEventXmlID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRelEventXmlID() {
        return relEventXmlID;
    }

    /**
     * Legt den Wert der relEventXmlID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRelEventXmlID(Object value) {
        this.relEventXmlID = value;
    }

    /**
     * Ruft den Wert der simpleLink-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimpleLink() {
        return simpleLink;
    }

    /**
     * Legt den Wert der simpleLink-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimpleLink(String value) {
        this.simpleLink = value;
    }

}
