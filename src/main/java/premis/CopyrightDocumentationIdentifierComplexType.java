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
 * <p>Java-Klasse für copyrightDocumentationIdentifierComplexType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="copyrightDocumentationIdentifierComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}copyrightDocumentationIdentifierType"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}copyrightDocumentationIdentifierValue"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}copyrightDocumentationRole" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "copyrightDocumentationIdentifierComplexType", propOrder = {
    "copyrightDocumentationIdentifierType",
    "copyrightDocumentationIdentifierValue",
    "copyrightDocumentationRole"
})
public class CopyrightDocumentationIdentifierComplexType {

    @XmlElement(required = true)
    protected StringPlusAuthority copyrightDocumentationIdentifierType;
    @XmlElement(required = true)
    protected String copyrightDocumentationIdentifierValue;
    protected StringPlusAuthority copyrightDocumentationRole;

    /**
     * Ruft den Wert der copyrightDocumentationIdentifierType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StringPlusAuthority }
     *     
     */
    public StringPlusAuthority getCopyrightDocumentationIdentifierType() {
        return copyrightDocumentationIdentifierType;
    }

    /**
     * Legt den Wert der copyrightDocumentationIdentifierType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StringPlusAuthority }
     *     
     */
    public void setCopyrightDocumentationIdentifierType(StringPlusAuthority value) {
        this.copyrightDocumentationIdentifierType = value;
    }

    /**
     * Ruft den Wert der copyrightDocumentationIdentifierValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyrightDocumentationIdentifierValue() {
        return copyrightDocumentationIdentifierValue;
    }

    /**
     * Legt den Wert der copyrightDocumentationIdentifierValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyrightDocumentationIdentifierValue(String value) {
        this.copyrightDocumentationIdentifierValue = value;
    }

    /**
     * Ruft den Wert der copyrightDocumentationRole-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StringPlusAuthority }
     *     
     */
    public StringPlusAuthority getCopyrightDocumentationRole() {
        return copyrightDocumentationRole;
    }

    /**
     * Legt den Wert der copyrightDocumentationRole-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StringPlusAuthority }
     *     
     */
    public void setCopyrightDocumentationRole(StringPlusAuthority value) {
        this.copyrightDocumentationRole = value;
    }

}
