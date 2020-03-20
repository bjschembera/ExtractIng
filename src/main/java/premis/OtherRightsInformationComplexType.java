//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.02.05 um 05:02:22 PM CET 
//


package premis;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für otherRightsInformationComplexType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="otherRightsInformationComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}otherRightsDocumentationIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}otherRightsBasis"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}otherRightsApplicableDates" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}otherRightsNote" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "otherRightsInformationComplexType", propOrder = {
    "otherRightsDocumentationIdentifier",
    "otherRightsBasis",
    "otherRightsApplicableDates",
    "otherRightsNote"
})
public class OtherRightsInformationComplexType {

    protected List<OtherRightsDocumentationIdentifierComplexType> otherRightsDocumentationIdentifier;
    @XmlElement(required = true)
    protected StringPlusAuthority otherRightsBasis;
    protected StartAndEndDateComplexType otherRightsApplicableDates;
    protected List<String> otherRightsNote;

    /**
     * Gets the value of the otherRightsDocumentationIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherRightsDocumentationIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherRightsDocumentationIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherRightsDocumentationIdentifierComplexType }
     * 
     * 
     */
    public List<OtherRightsDocumentationIdentifierComplexType> getOtherRightsDocumentationIdentifier() {
        if (otherRightsDocumentationIdentifier == null) {
            otherRightsDocumentationIdentifier = new ArrayList<OtherRightsDocumentationIdentifierComplexType>();
        }
        return this.otherRightsDocumentationIdentifier;
    }

    /**
     * Ruft den Wert der otherRightsBasis-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StringPlusAuthority }
     *     
     */
    public StringPlusAuthority getOtherRightsBasis() {
        return otherRightsBasis;
    }

    /**
     * Legt den Wert der otherRightsBasis-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StringPlusAuthority }
     *     
     */
    public void setOtherRightsBasis(StringPlusAuthority value) {
        this.otherRightsBasis = value;
    }

    /**
     * Ruft den Wert der otherRightsApplicableDates-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StartAndEndDateComplexType }
     *     
     */
    public StartAndEndDateComplexType getOtherRightsApplicableDates() {
        return otherRightsApplicableDates;
    }

    /**
     * Legt den Wert der otherRightsApplicableDates-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StartAndEndDateComplexType }
     *     
     */
    public void setOtherRightsApplicableDates(StartAndEndDateComplexType value) {
        this.otherRightsApplicableDates = value;
    }

    /**
     * Gets the value of the otherRightsNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherRightsNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherRightsNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOtherRightsNote() {
        if (otherRightsNote == null) {
            otherRightsNote = new ArrayList<String>();
        }
        return this.otherRightsNote;
    }

}
