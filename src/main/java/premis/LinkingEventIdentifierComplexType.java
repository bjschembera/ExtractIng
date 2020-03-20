//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.02.05 um 05:02:22 PM CET 
//


package premis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für linkingEventIdentifierComplexType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="linkingEventIdentifierComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}linkingEventIdentifierType"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}linkingEventIdentifierValue"/>
 *       &lt;/sequence>
 *       &lt;attribute name="LinkEventXmlID" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="simpleLink" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "linkingEventIdentifierComplexType", propOrder = {
    "linkingEventIdentifierType",
    "linkingEventIdentifierValue"
})
public class LinkingEventIdentifierComplexType {

    @XmlElement(required = true)
    protected StringPlusAuthority linkingEventIdentifierType;
    @XmlElement(required = true)
    protected String linkingEventIdentifierValue;
    @XmlAttribute(name = "LinkEventXmlID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object linkEventXmlID;
    @XmlAttribute(name = "simpleLink")
    @XmlSchemaType(name = "anyURI")
    protected String simpleLink;

    /**
     * Ruft den Wert der linkingEventIdentifierType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StringPlusAuthority }
     *     
     */
    public StringPlusAuthority getLinkingEventIdentifierType() {
        return linkingEventIdentifierType;
    }

    /**
     * Legt den Wert der linkingEventIdentifierType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StringPlusAuthority }
     *     
     */
    public void setLinkingEventIdentifierType(StringPlusAuthority value) {
        this.linkingEventIdentifierType = value;
    }

    /**
     * Ruft den Wert der linkingEventIdentifierValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkingEventIdentifierValue() {
        return linkingEventIdentifierValue;
    }

    /**
     * Legt den Wert der linkingEventIdentifierValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkingEventIdentifierValue(String value) {
        this.linkingEventIdentifierValue = value;
    }

    /**
     * Ruft den Wert der linkEventXmlID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLinkEventXmlID() {
        return linkEventXmlID;
    }

    /**
     * Legt den Wert der linkEventXmlID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLinkEventXmlID(Object value) {
        this.linkEventXmlID = value;
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
