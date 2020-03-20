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
 * <p>Java-Klasse für rightsStatementIdentifierComplexType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="rightsStatementIdentifierComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}rightsStatementIdentifierType"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}rightsStatementIdentifierValue"/>
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
@XmlType(name = "rightsStatementIdentifierComplexType", propOrder = {
    "rightsStatementIdentifierType",
    "rightsStatementIdentifierValue"
})
public class RightsStatementIdentifierComplexType {

    @XmlElement(required = true)
    protected StringPlusAuthority rightsStatementIdentifierType;
    @XmlElement(required = true)
    protected String rightsStatementIdentifierValue;
    @XmlAttribute(name = "simpleLink")
    @XmlSchemaType(name = "anyURI")
    protected String simpleLink;

    /**
     * Ruft den Wert der rightsStatementIdentifierType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StringPlusAuthority }
     *     
     */
    public StringPlusAuthority getRightsStatementIdentifierType() {
        return rightsStatementIdentifierType;
    }

    /**
     * Legt den Wert der rightsStatementIdentifierType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StringPlusAuthority }
     *     
     */
    public void setRightsStatementIdentifierType(StringPlusAuthority value) {
        this.rightsStatementIdentifierType = value;
    }

    /**
     * Ruft den Wert der rightsStatementIdentifierValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightsStatementIdentifierValue() {
        return rightsStatementIdentifierValue;
    }

    /**
     * Legt den Wert der rightsStatementIdentifierValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightsStatementIdentifierValue(String value) {
        this.rightsStatementIdentifierValue = value;
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
