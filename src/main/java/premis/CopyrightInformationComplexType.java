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
 * <p>Java-Klasse für copyrightInformationComplexType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="copyrightInformationComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}copyrightStatus"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}copyrightJurisdiction"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}copyrightStatusDeterminationDate" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}copyrightNote" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}copyrightDocumentationIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}copyrightApplicableDates" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "copyrightInformationComplexType", propOrder = {
    "copyrightStatus",
    "copyrightJurisdiction",
    "copyrightStatusDeterminationDate",
    "copyrightNote",
    "copyrightDocumentationIdentifier",
    "copyrightApplicableDates"
})
public class CopyrightInformationComplexType {

    @XmlElement(required = true)
    protected StringPlusAuthority copyrightStatus;
    @XmlElement(required = true)
    protected CountryCode copyrightJurisdiction;
    protected String copyrightStatusDeterminationDate;
    protected List<String> copyrightNote;
    protected List<CopyrightDocumentationIdentifierComplexType> copyrightDocumentationIdentifier;
    protected StartAndEndDateComplexType copyrightApplicableDates;

    /**
     * Ruft den Wert der copyrightStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StringPlusAuthority }
     *     
     */
    public StringPlusAuthority getCopyrightStatus() {
        return copyrightStatus;
    }

    /**
     * Legt den Wert der copyrightStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StringPlusAuthority }
     *     
     */
    public void setCopyrightStatus(StringPlusAuthority value) {
        this.copyrightStatus = value;
    }

    /**
     * Ruft den Wert der copyrightJurisdiction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CountryCode }
     *     
     */
    public CountryCode getCopyrightJurisdiction() {
        return copyrightJurisdiction;
    }

    /**
     * Legt den Wert der copyrightJurisdiction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCode }
     *     
     */
    public void setCopyrightJurisdiction(CountryCode value) {
        this.copyrightJurisdiction = value;
    }

    /**
     * Ruft den Wert der copyrightStatusDeterminationDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyrightStatusDeterminationDate() {
        return copyrightStatusDeterminationDate;
    }

    /**
     * Legt den Wert der copyrightStatusDeterminationDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyrightStatusDeterminationDate(String value) {
        this.copyrightStatusDeterminationDate = value;
    }

    /**
     * Gets the value of the copyrightNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the copyrightNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCopyrightNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCopyrightNote() {
        if (copyrightNote == null) {
            copyrightNote = new ArrayList<String>();
        }
        return this.copyrightNote;
    }

    /**
     * Gets the value of the copyrightDocumentationIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the copyrightDocumentationIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCopyrightDocumentationIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CopyrightDocumentationIdentifierComplexType }
     * 
     * 
     */
    public List<CopyrightDocumentationIdentifierComplexType> getCopyrightDocumentationIdentifier() {
        if (copyrightDocumentationIdentifier == null) {
            copyrightDocumentationIdentifier = new ArrayList<CopyrightDocumentationIdentifierComplexType>();
        }
        return this.copyrightDocumentationIdentifier;
    }

    /**
     * Ruft den Wert der copyrightApplicableDates-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StartAndEndDateComplexType }
     *     
     */
    public StartAndEndDateComplexType getCopyrightApplicableDates() {
        return copyrightApplicableDates;
    }

    /**
     * Legt den Wert der copyrightApplicableDates-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StartAndEndDateComplexType }
     *     
     */
    public void setCopyrightApplicableDates(StartAndEndDateComplexType value) {
        this.copyrightApplicableDates = value;
    }

}
