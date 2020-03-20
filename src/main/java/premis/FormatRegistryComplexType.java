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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für formatRegistryComplexType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="formatRegistryComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}formatRegistryName"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}formatRegistryKey"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}formatRegistryRole" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="simpleLink" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "formatRegistryComplexType", propOrder = {
    "formatRegistryName",
    "formatRegistryKey",
    "formatRegistryRole"
})
public class FormatRegistryComplexType {

    @XmlElement(required = true)
    protected StringPlusAuthority formatRegistryName;
    @XmlElement(required = true)
    protected StringPlusAuthority formatRegistryKey;
    protected StringPlusAuthority formatRegistryRole;
    @XmlAttribute(name = "simpleLink")
    @XmlSchemaType(name = "anyURI")
    protected String simpleLink;

    /**
     * Ruft den Wert der formatRegistryName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StringPlusAuthority }
     *     
     */
    public StringPlusAuthority getFormatRegistryName() {
        return formatRegistryName;
    }

    /**
     * Legt den Wert der formatRegistryName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StringPlusAuthority }
     *     
     */
    public void setFormatRegistryName(StringPlusAuthority value) {
        this.formatRegistryName = value;
    }

    /**
     * Ruft den Wert der formatRegistryKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StringPlusAuthority }
     *     
     */
    public StringPlusAuthority getFormatRegistryKey() {
        return formatRegistryKey;
    }

    /**
     * Legt den Wert der formatRegistryKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StringPlusAuthority }
     *     
     */
    public void setFormatRegistryKey(StringPlusAuthority value) {
        this.formatRegistryKey = value;
    }

    /**
     * Ruft den Wert der formatRegistryRole-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StringPlusAuthority }
     *     
     */
    public StringPlusAuthority getFormatRegistryRole() {
        return formatRegistryRole;
    }

    /**
     * Legt den Wert der formatRegistryRole-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StringPlusAuthority }
     *     
     */
    public void setFormatRegistryRole(StringPlusAuthority value) {
        this.formatRegistryRole = value;
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
