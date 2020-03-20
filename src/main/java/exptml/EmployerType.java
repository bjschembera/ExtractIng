//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.02.05 um 05:02:22 PM CET 
//


package exptml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für employerType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="employerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:exptml:schema:draft:0.5}employertype"/>
 *         &lt;element ref="{urn:exptml:schema:draft:0.5}employername"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employerType", propOrder = {
    "employertype",
    "employername"
})
public class EmployerType {

    @XmlElement(required = true)
    protected SmallTextType employertype;
    @XmlElement(required = true)
    protected SmallTextType employername;

    /**
     * Ruft den Wert der employertype-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SmallTextType }
     *     
     */
    public SmallTextType getEmployertype() {
        return employertype;
    }

    /**
     * Legt den Wert der employertype-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SmallTextType }
     *     
     */
    public void setEmployertype(SmallTextType value) {
        this.employertype = value;
    }

    /**
     * Ruft den Wert der employername-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SmallTextType }
     *     
     */
    public SmallTextType getEmployername() {
        return employername;
    }

    /**
     * Legt den Wert der employername-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SmallTextType }
     *     
     */
    public void setEmployername(SmallTextType value) {
        this.employername = value;
    }

}
