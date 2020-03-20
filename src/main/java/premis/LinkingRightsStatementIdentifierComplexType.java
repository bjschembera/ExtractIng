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
 * <p>Java-Klasse für linkingRightsStatementIdentifierComplexType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="linkingRightsStatementIdentifierComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}linkingRightsStatementIdentifierType"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}linkingRightsStatementIdentifierValue"/>
 *       &lt;/sequence>
 *       &lt;attribute name="LinkPermissionStatementXmlID" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="simpleLink" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "linkingRightsStatementIdentifierComplexType", propOrder = {
    "linkingRightsStatementIdentifierType",
    "linkingRightsStatementIdentifierValue"
})
public class LinkingRightsStatementIdentifierComplexType {

    @XmlElement(required = true)
    protected StringPlusAuthority linkingRightsStatementIdentifierType;
    @XmlElement(required = true)
    protected String linkingRightsStatementIdentifierValue;
    @XmlAttribute(name = "LinkPermissionStatementXmlID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object linkPermissionStatementXmlID;
    @XmlAttribute(name = "simpleLink")
    @XmlSchemaType(name = "anyURI")
    protected String simpleLink;

    /**
     * Ruft den Wert der linkingRightsStatementIdentifierType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StringPlusAuthority }
     *     
     */
    public StringPlusAuthority getLinkingRightsStatementIdentifierType() {
        return linkingRightsStatementIdentifierType;
    }

    /**
     * Legt den Wert der linkingRightsStatementIdentifierType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StringPlusAuthority }
     *     
     */
    public void setLinkingRightsStatementIdentifierType(StringPlusAuthority value) {
        this.linkingRightsStatementIdentifierType = value;
    }

    /**
     * Ruft den Wert der linkingRightsStatementIdentifierValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkingRightsStatementIdentifierValue() {
        return linkingRightsStatementIdentifierValue;
    }

    /**
     * Legt den Wert der linkingRightsStatementIdentifierValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkingRightsStatementIdentifierValue(String value) {
        this.linkingRightsStatementIdentifierValue = value;
    }

    /**
     * Ruft den Wert der linkPermissionStatementXmlID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLinkPermissionStatementXmlID() {
        return linkPermissionStatementXmlID;
    }

    /**
     * Legt den Wert der linkPermissionStatementXmlID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLinkPermissionStatementXmlID(Object value) {
        this.linkPermissionStatementXmlID = value;
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
