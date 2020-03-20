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
 * <p>Java-Klasse für relatedObjectIdentifierComplexType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="relatedObjectIdentifierComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}relatedObjectIdentifierType"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}relatedObjectIdentifierValue"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}relatedObjectSequence" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RelObjectXmlID" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="simpleLink" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "relatedObjectIdentifierComplexType", propOrder = {
    "relatedObjectIdentifierType",
    "relatedObjectIdentifierValue",
    "relatedObjectSequence"
})
public class RelatedObjectIdentifierComplexType {

    @XmlElement(required = true)
    protected StringPlusAuthority relatedObjectIdentifierType;
    @XmlElement(required = true)
    protected String relatedObjectIdentifierValue;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger relatedObjectSequence;
    @XmlAttribute(name = "RelObjectXmlID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object relObjectXmlID;
    @XmlAttribute(name = "simpleLink")
    @XmlSchemaType(name = "anyURI")
    protected String simpleLink;

    /**
     * Ruft den Wert der relatedObjectIdentifierType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StringPlusAuthority }
     *     
     */
    public StringPlusAuthority getRelatedObjectIdentifierType() {
        return relatedObjectIdentifierType;
    }

    /**
     * Legt den Wert der relatedObjectIdentifierType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StringPlusAuthority }
     *     
     */
    public void setRelatedObjectIdentifierType(StringPlusAuthority value) {
        this.relatedObjectIdentifierType = value;
    }

    /**
     * Ruft den Wert der relatedObjectIdentifierValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedObjectIdentifierValue() {
        return relatedObjectIdentifierValue;
    }

    /**
     * Legt den Wert der relatedObjectIdentifierValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedObjectIdentifierValue(String value) {
        this.relatedObjectIdentifierValue = value;
    }

    /**
     * Ruft den Wert der relatedObjectSequence-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRelatedObjectSequence() {
        return relatedObjectSequence;
    }

    /**
     * Legt den Wert der relatedObjectSequence-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRelatedObjectSequence(BigInteger value) {
        this.relatedObjectSequence = value;
    }

    /**
     * Ruft den Wert der relObjectXmlID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRelObjectXmlID() {
        return relObjectXmlID;
    }

    /**
     * Legt den Wert der relObjectXmlID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRelObjectXmlID(Object value) {
        this.relObjectXmlID = value;
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
