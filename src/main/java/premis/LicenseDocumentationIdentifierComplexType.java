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
 * <p>Java-Klasse für licenseDocumentationIdentifierComplexType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="licenseDocumentationIdentifierComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}licenseDocumentationIdentifierType"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}licenseDocumentationIdentifierValue"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}licenseDocumentationRole" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "licenseDocumentationIdentifierComplexType", propOrder = {
    "licenseDocumentationIdentifierType",
    "licenseDocumentationIdentifierValue",
    "licenseDocumentationRole"
})
public class LicenseDocumentationIdentifierComplexType {

    @XmlElement(required = true)
    protected StringPlusAuthority licenseDocumentationIdentifierType;
    @XmlElement(required = true)
    protected String licenseDocumentationIdentifierValue;
    protected StringPlusAuthority licenseDocumentationRole;

    /**
     * Ruft den Wert der licenseDocumentationIdentifierType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StringPlusAuthority }
     *     
     */
    public StringPlusAuthority getLicenseDocumentationIdentifierType() {
        return licenseDocumentationIdentifierType;
    }

    /**
     * Legt den Wert der licenseDocumentationIdentifierType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StringPlusAuthority }
     *     
     */
    public void setLicenseDocumentationIdentifierType(StringPlusAuthority value) {
        this.licenseDocumentationIdentifierType = value;
    }

    /**
     * Ruft den Wert der licenseDocumentationIdentifierValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseDocumentationIdentifierValue() {
        return licenseDocumentationIdentifierValue;
    }

    /**
     * Legt den Wert der licenseDocumentationIdentifierValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseDocumentationIdentifierValue(String value) {
        this.licenseDocumentationIdentifierValue = value;
    }

    /**
     * Ruft den Wert der licenseDocumentationRole-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StringPlusAuthority }
     *     
     */
    public StringPlusAuthority getLicenseDocumentationRole() {
        return licenseDocumentationRole;
    }

    /**
     * Legt den Wert der licenseDocumentationRole-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StringPlusAuthority }
     *     
     */
    public void setLicenseDocumentationRole(StringPlusAuthority value) {
        this.licenseDocumentationRole = value;
    }

}
