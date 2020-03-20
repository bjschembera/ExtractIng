//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.02.05 um 05:02:22 PM CET 
//


package premis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für otherRightsDocumentationIdentifierComplexType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="otherRightsDocumentationIdentifierComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}otherRightsDocumentationIdentifierType"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}otherRightsDocumentationIdentifierValue"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}otherRightsDocumentationRole" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "otherRightsDocumentationIdentifierComplexType", propOrder = {
    "otherRightsDocumentationIdentifierType",
    "otherRightsDocumentationIdentifierValue",
    "otherRightsDocumentationRole"
})
public class OtherRightsDocumentationIdentifierComplexType {

    @XmlElement(required = true)
    protected StringPlusAuthority otherRightsDocumentationIdentifierType;
    @XmlElement(required = true)
    protected String otherRightsDocumentationIdentifierValue;
    protected StringPlusAuthority otherRightsDocumentationRole;

    /**
     * Ruft den Wert der otherRightsDocumentationIdentifierType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StringPlusAuthority }
     *     
     */
    public StringPlusAuthority getOtherRightsDocumentationIdentifierType() {
        return otherRightsDocumentationIdentifierType;
    }

    /**
     * Legt den Wert der otherRightsDocumentationIdentifierType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StringPlusAuthority }
     *     
     */
    public void setOtherRightsDocumentationIdentifierType(StringPlusAuthority value) {
        this.otherRightsDocumentationIdentifierType = value;
    }

    /**
     * Ruft den Wert der otherRightsDocumentationIdentifierValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherRightsDocumentationIdentifierValue() {
        return otherRightsDocumentationIdentifierValue;
    }

    /**
     * Legt den Wert der otherRightsDocumentationIdentifierValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherRightsDocumentationIdentifierValue(String value) {
        this.otherRightsDocumentationIdentifierValue = value;
    }

    /**
     * Ruft den Wert der otherRightsDocumentationRole-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StringPlusAuthority }
     *     
     */
    public StringPlusAuthority getOtherRightsDocumentationRole() {
        return otherRightsDocumentationRole;
    }

    /**
     * Legt den Wert der otherRightsDocumentationRole-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StringPlusAuthority }
     *     
     */
    public void setOtherRightsDocumentationRole(StringPlusAuthority value) {
        this.otherRightsDocumentationRole = value;
    }

}
