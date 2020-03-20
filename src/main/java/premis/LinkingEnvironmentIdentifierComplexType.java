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
 * <p>Java-Klasse für linkingEnvironmentIdentifierComplexType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="linkingEnvironmentIdentifierComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}linkingEnvironmentIdentifierType"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}linkingEnvironmentIdentifierValue"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}linkingEnvironmentRole" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "linkingEnvironmentIdentifierComplexType", propOrder = {
    "linkingEnvironmentIdentifierType",
    "linkingEnvironmentIdentifierValue",
    "linkingEnvironmentRole"
})
public class LinkingEnvironmentIdentifierComplexType {

    @XmlElement(required = true)
    protected String linkingEnvironmentIdentifierType;
    @XmlElement(required = true)
    protected String linkingEnvironmentIdentifierValue;
    protected List<StringPlusAuthority> linkingEnvironmentRole;
    @XmlAttribute(name = "LinkEventXmlID")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object linkEventXmlID;
    @XmlAttribute(name = "simpleLink")
    @XmlSchemaType(name = "anyURI")
    protected String simpleLink;

    /**
     * Ruft den Wert der linkingEnvironmentIdentifierType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkingEnvironmentIdentifierType() {
        return linkingEnvironmentIdentifierType;
    }

    /**
     * Legt den Wert der linkingEnvironmentIdentifierType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkingEnvironmentIdentifierType(String value) {
        this.linkingEnvironmentIdentifierType = value;
    }

    /**
     * Ruft den Wert der linkingEnvironmentIdentifierValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkingEnvironmentIdentifierValue() {
        return linkingEnvironmentIdentifierValue;
    }

    /**
     * Legt den Wert der linkingEnvironmentIdentifierValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkingEnvironmentIdentifierValue(String value) {
        this.linkingEnvironmentIdentifierValue = value;
    }

    /**
     * Gets the value of the linkingEnvironmentRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkingEnvironmentRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkingEnvironmentRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPlusAuthority }
     * 
     * 
     */
    public List<StringPlusAuthority> getLinkingEnvironmentRole() {
        if (linkingEnvironmentRole == null) {
            linkingEnvironmentRole = new ArrayList<StringPlusAuthority>();
        }
        return this.linkingEnvironmentRole;
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
