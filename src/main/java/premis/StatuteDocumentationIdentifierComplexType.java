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
 * <p>Java-Klasse für statuteDocumentationIdentifierComplexType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="statuteDocumentationIdentifierComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}statuteDocumentationIdentifierType"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}statuteDocumentationIdentifierValue"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}statuteDocumentationRole" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statuteDocumentationIdentifierComplexType", propOrder = {
    "statuteDocumentationIdentifierType",
    "statuteDocumentationIdentifierValue",
    "statuteDocumentationRole"
})
public class StatuteDocumentationIdentifierComplexType {

    @XmlElement(required = true)
    protected StringPlusAuthority statuteDocumentationIdentifierType;
    @XmlElement(required = true)
    protected String statuteDocumentationIdentifierValue;
    protected StringPlusAuthority statuteDocumentationRole;

    /**
     * Ruft den Wert der statuteDocumentationIdentifierType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StringPlusAuthority }
     *     
     */
    public StringPlusAuthority getStatuteDocumentationIdentifierType() {
        return statuteDocumentationIdentifierType;
    }

    /**
     * Legt den Wert der statuteDocumentationIdentifierType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StringPlusAuthority }
     *     
     */
    public void setStatuteDocumentationIdentifierType(StringPlusAuthority value) {
        this.statuteDocumentationIdentifierType = value;
    }

    /**
     * Ruft den Wert der statuteDocumentationIdentifierValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatuteDocumentationIdentifierValue() {
        return statuteDocumentationIdentifierValue;
    }

    /**
     * Legt den Wert der statuteDocumentationIdentifierValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatuteDocumentationIdentifierValue(String value) {
        this.statuteDocumentationIdentifierValue = value;
    }

    /**
     * Ruft den Wert der statuteDocumentationRole-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StringPlusAuthority }
     *     
     */
    public StringPlusAuthority getStatuteDocumentationRole() {
        return statuteDocumentationRole;
    }

    /**
     * Legt den Wert der statuteDocumentationRole-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StringPlusAuthority }
     *     
     */
    public void setStatuteDocumentationRole(StringPlusAuthority value) {
        this.statuteDocumentationRole = value;
    }

}
