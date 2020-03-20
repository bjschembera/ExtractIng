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
 * <p>Java-Klasse für environmentFunctionComplexType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="environmentFunctionComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}environmentFunctionType"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}environmentFunctionLevel"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "environmentFunctionComplexType", propOrder = {
    "environmentFunctionType",
    "environmentFunctionLevel"
})
public class EnvironmentFunctionComplexType {

    @XmlElement(required = true)
    protected StringPlusAuthority environmentFunctionType;
    @XmlElement(required = true)
    protected String environmentFunctionLevel;

    /**
     * Ruft den Wert der environmentFunctionType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StringPlusAuthority }
     *     
     */
    public StringPlusAuthority getEnvironmentFunctionType() {
        return environmentFunctionType;
    }

    /**
     * Legt den Wert der environmentFunctionType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StringPlusAuthority }
     *     
     */
    public void setEnvironmentFunctionType(StringPlusAuthority value) {
        this.environmentFunctionType = value;
    }

    /**
     * Ruft den Wert der environmentFunctionLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvironmentFunctionLevel() {
        return environmentFunctionLevel;
    }

    /**
     * Legt den Wert der environmentFunctionLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvironmentFunctionLevel(String value) {
        this.environmentFunctionLevel = value;
    }

}
