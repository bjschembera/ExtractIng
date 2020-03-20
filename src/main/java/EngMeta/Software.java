//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.02.05 um 05:02:22 PM CET 
//


package EngMeta;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import premis.LicenseInformationComplexType;


/**
 * Software or code, described according to the CodeMeta-Schema (https://codemeta.github.io/). The Software must have a name and can be described further by version (softwareVersion), programmingLanguage, operatingSystem. An unbounded number of contributors can be specified. The location of the software can be specified by an URL, (an URL to the) SoftwareSourceCode, (an URL to the) SoftwareApplication and/or the codeRepository. The attribution of the software can be given by contributor, citation and referencePublication. License specifies the license under which the software was used.
 * 
 * <p>Java-Klasse für software complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="software">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contributor" type="{}personOrOrganization" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="softwareVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="programmingLanguage" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="operatingSystem" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="SoftwareSourceCode" type="{}fileOrResource" minOccurs="0"/>
 *         &lt;element name="SoftwareApplication" type="{}fileOrResource" minOccurs="0"/>
 *         &lt;element name="codeRepository" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="licence" type="{http://www.loc.gov/premis/v3}licenseInformationComplexType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="citation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="referencePublication" type="{}publication" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "software", propOrder = {
    "name",
    "contributor",
    "softwareVersion",
    "programmingLanguage",
    "operatingSystem",
    "url",
    "softwareSourceCode",
    "softwareApplication",
    "codeRepository",
    "licence",
    "citation",
    "referencePublication"
})
public class Software {

    @XmlElement(required = true)
    protected String name;
    protected List<PersonOrOrganization> contributor;
    @XmlElement(required = true)
    protected String softwareVersion;
    protected List<String> programmingLanguage;
    protected List<String> operatingSystem;
    @XmlElement(name = "URL")
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlElement(name = "SoftwareSourceCode")
    protected FileOrResource softwareSourceCode;
    @XmlElement(name = "SoftwareApplication")
    protected FileOrResource softwareApplication;
    @XmlSchemaType(name = "anyURI")
    protected String codeRepository;
    protected List<LicenseInformationComplexType> licence;
    protected String citation;
    protected Publication referencePublication;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the contributor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contributor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContributor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonOrOrganization }
     * 
     * 
     */
    public List<PersonOrOrganization> getContributor() {
        if (contributor == null) {
            contributor = new ArrayList<PersonOrOrganization>();
        }
        return this.contributor;
    }

    /**
     * Ruft den Wert der softwareVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwareVersion() {
        return softwareVersion;
    }

    /**
     * Legt den Wert der softwareVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareVersion(String value) {
        this.softwareVersion = value;
    }

    /**
     * Gets the value of the programmingLanguage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the programmingLanguage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProgrammingLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProgrammingLanguage() {
        if (programmingLanguage == null) {
            programmingLanguage = new ArrayList<String>();
        }
        return this.programmingLanguage;
    }

    /**
     * Gets the value of the operatingSystem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operatingSystem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperatingSystem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOperatingSystem() {
        if (operatingSystem == null) {
            operatingSystem = new ArrayList<String>();
        }
        return this.operatingSystem;
    }

    /**
     * Ruft den Wert der url-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Legt den Wert der url-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Ruft den Wert der softwareSourceCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FileOrResource }
     *     
     */
    public FileOrResource getSoftwareSourceCode() {
        return softwareSourceCode;
    }

    /**
     * Legt den Wert der softwareSourceCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FileOrResource }
     *     
     */
    public void setSoftwareSourceCode(FileOrResource value) {
        this.softwareSourceCode = value;
    }

    /**
     * Ruft den Wert der softwareApplication-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FileOrResource }
     *     
     */
    public FileOrResource getSoftwareApplication() {
        return softwareApplication;
    }

    /**
     * Legt den Wert der softwareApplication-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FileOrResource }
     *     
     */
    public void setSoftwareApplication(FileOrResource value) {
        this.softwareApplication = value;
    }

    /**
     * Ruft den Wert der codeRepository-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeRepository() {
        return codeRepository;
    }

    /**
     * Legt den Wert der codeRepository-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeRepository(String value) {
        this.codeRepository = value;
    }

    /**
     * Gets the value of the licence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the licence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLicence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LicenseInformationComplexType }
     * 
     * 
     */
    public List<LicenseInformationComplexType> getLicence() {
        if (licence == null) {
            licence = new ArrayList<LicenseInformationComplexType>();
        }
        return this.licence;
    }

    /**
     * Ruft den Wert der citation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitation() {
        return citation;
    }

    /**
     * Legt den Wert der citation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitation(String value) {
        this.citation = value;
    }

    /**
     * Ruft den Wert der referencePublication-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Publication }
     *     
     */
    public Publication getReferencePublication() {
        return referencePublication;
    }

    /**
     * Legt den Wert der referencePublication-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Publication }
     *     
     */
    public void setReferencePublication(Publication value) {
        this.referencePublication = value;
    }

}
