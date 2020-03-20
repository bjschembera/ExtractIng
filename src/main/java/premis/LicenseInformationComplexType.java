//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.02.05 um 05:02:22 PM CET 
//


package premis;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für licenseInformationComplexType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="licenseInformationComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element ref="{http://www.loc.gov/premis/v3}licenseDocumentationIdentifier" maxOccurs="unbounded"/>
 *           &lt;element ref="{http://www.loc.gov/premis/v3}licenseTerms" minOccurs="0"/>
 *           &lt;element ref="{http://www.loc.gov/premis/v3}licenseNote" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.loc.gov/premis/v3}licenseApplicableDates" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element ref="{http://www.loc.gov/premis/v3}licenseTerms"/>
 *           &lt;element ref="{http://www.loc.gov/premis/v3}licenseNote" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element ref="{http://www.loc.gov/premis/v3}licenseApplicableDates" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element ref="{http://www.loc.gov/premis/v3}licenseNote" maxOccurs="unbounded"/>
 *           &lt;element ref="{http://www.loc.gov/premis/v3}licenseApplicableDates" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}licenseApplicableDates"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "licenseInformationComplexType", propOrder = {
    "content"
})
public class LicenseInformationComplexType {

    @XmlElementRefs({
        @XmlElementRef(name = "licenseDocumentationIdentifier", namespace = "http://www.loc.gov/premis/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "licenseNote", namespace = "http://www.loc.gov/premis/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "licenseApplicableDates", namespace = "http://www.loc.gov/premis/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "licenseTerms", namespace = "http://www.loc.gov/premis/v3", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Ruft das restliche Contentmodell ab. 
     * 
     * <p>
     * Sie rufen diese "catch-all"-Eigenschaft aus folgendem Grund ab: 
     * Der Feldname "LicenseTerms" wird von zwei verschiedenen Teilen eines Schemas verwendet. Siehe: 
     * Zeile 573 von file:/home/hpcbsche/git/harvester/import/premis.xsd
     * Zeile 568 von file:/home/hpcbsche/git/harvester/import/premis.xsd
     * <p>
     * Um diese Eigenschaft zu entfernen, wenden Sie eine Eigenschaftenanpassung für eine
     * der beiden folgenden Deklarationen an, um deren Namen zu ändern: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link LicenseDocumentationIdentifierComplexType }{@code >}
     * {@link JAXBElement }{@code <}{@link StartAndEndDateComplexType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

}
