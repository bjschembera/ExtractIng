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
 * <p>Java-Klasse für fixityComplexType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="fixityComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}messageDigestAlgorithm"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}messageDigest"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}messageDigestOriginator" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fixityComplexType", propOrder = {
    "messageDigestAlgorithm",
    "messageDigest",
    "messageDigestOriginator"
})
public class FixityComplexType {

    @XmlElement(required = true)
    protected StringPlusAuthority messageDigestAlgorithm;
    @XmlElement(required = true)
    protected String messageDigest;
    protected StringPlusAuthority messageDigestOriginator;

    /**
     * Ruft den Wert der messageDigestAlgorithm-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StringPlusAuthority }
     *     
     */
    public StringPlusAuthority getMessageDigestAlgorithm() {
        return messageDigestAlgorithm;
    }

    /**
     * Legt den Wert der messageDigestAlgorithm-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StringPlusAuthority }
     *     
     */
    public void setMessageDigestAlgorithm(StringPlusAuthority value) {
        this.messageDigestAlgorithm = value;
    }

    /**
     * Ruft den Wert der messageDigest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageDigest() {
        return messageDigest;
    }

    /**
     * Legt den Wert der messageDigest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageDigest(String value) {
        this.messageDigest = value;
    }

    /**
     * Ruft den Wert der messageDigestOriginator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StringPlusAuthority }
     *     
     */
    public StringPlusAuthority getMessageDigestOriginator() {
        return messageDigestOriginator;
    }

    /**
     * Legt den Wert der messageDigestOriginator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StringPlusAuthority }
     *     
     */
    public void setMessageDigestOriginator(StringPlusAuthority value) {
        this.messageDigestOriginator = value;
    }

}
