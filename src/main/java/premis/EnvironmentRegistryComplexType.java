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
 * <p>Java-Klasse für environmentRegistryComplexType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="environmentRegistryComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}environmentRegistryName"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}environmentRegistryKey"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}environmentRegistryRole" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "environmentRegistryComplexType", propOrder = {
    "environmentRegistryName",
    "environmentRegistryKey",
    "environmentRegistryRole"
})
public class EnvironmentRegistryComplexType {

    @XmlElement(required = true)
    protected String environmentRegistryName;
    @XmlElement(required = true)
    protected String environmentRegistryKey;
    protected StringPlusAuthority environmentRegistryRole;

    /**
     * Ruft den Wert der environmentRegistryName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvironmentRegistryName() {
        return environmentRegistryName;
    }

    /**
     * Legt den Wert der environmentRegistryName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvironmentRegistryName(String value) {
        this.environmentRegistryName = value;
    }

    /**
     * Ruft den Wert der environmentRegistryKey-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvironmentRegistryKey() {
        return environmentRegistryKey;
    }

    /**
     * Legt den Wert der environmentRegistryKey-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvironmentRegistryKey(String value) {
        this.environmentRegistryKey = value;
    }

    /**
     * Ruft den Wert der environmentRegistryRole-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StringPlusAuthority }
     *     
     */
    public StringPlusAuthority getEnvironmentRegistryRole() {
        return environmentRegistryRole;
    }

    /**
     * Legt den Wert der environmentRegistryRole-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StringPlusAuthority }
     *     
     */
    public void setEnvironmentRegistryRole(StringPlusAuthority value) {
        this.environmentRegistryRole = value;
    }

}
