//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.02.05 um 05:02:22 PM CET 
//


package premis;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für linkingAgentIdentifierComplexType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="linkingAgentIdentifierComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}linkingAgentIdentifierType"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}linkingAgentIdentifierValue"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}linkingAgentRole" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="LinkAgentXmlID" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="simpleLink" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "linkingAgentIdentifierComplexType", propOrder = {
    "linkingAgentIdentifierType",
    "linkingAgentIdentifierValue",
    "linkingAgentRole"
})
public class LinkingAgentIdentifierComplexType {

    @XmlElement(required = true)
    protected StringPlusAuthority linkingAgentIdentifierType;
    @XmlElement(required = true)
    protected String linkingAgentIdentifierValue;
    protected List<StringPlusAuthority> linkingAgentRole;
    @XmlAttribute(name = "LinkAgentXmlID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object linkAgentXmlID;
    @XmlAttribute(name = "simpleLink")
    @XmlSchemaType(name = "anyURI")
    protected String simpleLink;

    /**
     * Ruft den Wert der linkingAgentIdentifierType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StringPlusAuthority }
     *     
     */
    public StringPlusAuthority getLinkingAgentIdentifierType() {
        return linkingAgentIdentifierType;
    }

    /**
     * Legt den Wert der linkingAgentIdentifierType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StringPlusAuthority }
     *     
     */
    public void setLinkingAgentIdentifierType(StringPlusAuthority value) {
        this.linkingAgentIdentifierType = value;
    }

    /**
     * Ruft den Wert der linkingAgentIdentifierValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkingAgentIdentifierValue() {
        return linkingAgentIdentifierValue;
    }

    /**
     * Legt den Wert der linkingAgentIdentifierValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkingAgentIdentifierValue(String value) {
        this.linkingAgentIdentifierValue = value;
    }

    /**
     * Gets the value of the linkingAgentRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkingAgentRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkingAgentRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPlusAuthority }
     * 
     * 
     */
    public List<StringPlusAuthority> getLinkingAgentRole() {
        if (linkingAgentRole == null) {
            linkingAgentRole = new ArrayList<StringPlusAuthority>();
        }
        return this.linkingAgentRole;
    }

    /**
     * Ruft den Wert der linkAgentXmlID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLinkAgentXmlID() {
        return linkAgentXmlID;
    }

    /**
     * Legt den Wert der linkAgentXmlID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLinkAgentXmlID(Object value) {
        this.linkAgentXmlID = value;
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
