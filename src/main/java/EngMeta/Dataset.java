//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.02.05 um 05:02:22 PM CET 
//


package EngMeta;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import dtc.dateType.DateType;
import dtc.dateType.DescriptionType;
import dtc.dateType.FunderIdentifierType;
import dtc.dateType.RelatedIdentifierType;
import dtc.dateType.RelationType;
import dtc.dateType.TitleType;
import premis.FormatComplexType;
import premis.RightsStatementComplexType;
import premis.StorageComplexType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contact" type="{}personOrOrganization" maxOccurs="unbounded"/>
 *         &lt;element name="creator" type="{}personOrOrganization" maxOccurs="unbounded"/>
 *         &lt;element name="contributor" type="{}personOrOrganization" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="project" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="level" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="fundingReference" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="funderName">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="funderIdentifier" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="funderIdentifierType" use="required" type="{http://datacite.org/schema/kernel-4}funderIdentifierType" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="awardNumber" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="awardURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="awardTitle" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="worked" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="workedNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="titleType" type="{http://datacite.org/schema/kernel-4}titleType" />
 *                 &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="description" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="br" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="0"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *                 &lt;attribute name="descriptionType" use="required" type="{http://datacite.org/schema/kernel-4}descriptionType" />
 *                 &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="resourceType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="resourceTypeGeneral" use="required" type="{http://datacite.org/schema/kernel-4}resourceType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="keywords" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="keyword" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="vocabulary" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="vocabularyURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="subjects" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="subject" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="subjectScheme" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="schemeURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                           &lt;attribute name="valueURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                           &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dates" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="date" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="dateType" use="required" type="{http://datacite.org/schema/kernel-4}dateType" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mode" maxOccurs="3" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Simulation"/>
 *               &lt;enumeration value="Experiment"/>
 *               &lt;enumeration value="Analysis"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="measuredVariable" type="{}variable" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="controlledVariable" type="{}variable" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="system" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="phase" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="component" type="{}component" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="component" type="{}component" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="parameter" type="{}variable" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="grid" type="{}spacialResolution" minOccurs="0"/>
 *                   &lt;element name="temporalResolution" type="{}temporalResolution" minOccurs="0"/>
 *                   &lt;element name="boundaryCondition" type="{}boundaryCondition" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="provenance" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="step" type="{}processingStep" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="storage" type="{http://www.loc.gov/premis/v3}storageComplexType"/>
 *         &lt;element name="format" type="{http://www.loc.gov/premis/v3}formatComplexType"/>
 *         &lt;element name="identifier" type="{}pid" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="checksum" type="{}checksumType" minOccurs="0"/>
 *         &lt;element name="rightsStatement" type="{http://www.loc.gov/premis/v3}rightsStatementComplexType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="context" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                   &lt;element name="referencePublication" type="{}publication"/>
 *                   &lt;element name="relatedResource" type="{}fileOrResource"/>
 *                   &lt;element name="relatedIdentifier">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="relatedIdentifierType" use="required" type="{http://datacite.org/schema/kernel-4}relatedIdentifierType" />
 *                           &lt;attribute name="relationType" use="required" type="{http://datacite.org/schema/kernel-4}relationType" />
 *                           &lt;attribute name="relatedMetadataScheme" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="schemeURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                           &lt;attribute name="schemeType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "contact",
    "creator",
    "contributor",
    "project",
    "fundingReference",
    "worked",
    "workedNote",
    "title",
    "description",
    "resourceType",
    "keywords",
    "subjects",
    "dates",
    "version",
    "mode",
    "measuredVariable",
    "controlledVariable",
    "system",
    "provenance",
    "size",
    "storage",
    "format",
    "identifier",
    "checksum",
    "rightsStatement",
    "context"
})
@XmlRootElement(name = "dataset")
public class Dataset {

    @XmlElement(required = true)
    protected List<PersonOrOrganization> contact;
    @XmlElement(required = true)
    protected List<PersonOrOrganization> creator;
    protected List<PersonOrOrganization> contributor;
    protected List<Dataset.Project> project;
    protected List<Dataset.FundingReference> fundingReference;
    @XmlElement(defaultValue = "1")
    protected boolean worked;
    protected String workedNote;
    @XmlElement(required = true)
    protected List<Dataset.Title> title;
    protected List<Dataset.Description> description;
    protected Dataset.ResourceType resourceType;
    protected Dataset.Keywords keywords;
    protected Dataset.Subjects subjects;
    protected Dataset.Dates dates;
    @XmlElement(required = true)
    protected String version;
    protected List<String> mode;
    protected List<Variable> measuredVariable;
    protected List<Variable> controlledVariable;
    protected List<Dataset.System> system;
    protected Dataset.Provenance provenance;
    protected long size;
    @XmlElement(required = true)
    protected StorageComplexType storage;
    @XmlElement(required = true)
    protected FormatComplexType format;
    protected List<Pid> identifier;
    protected ChecksumType checksum;
    protected List<RightsStatementComplexType> rightsStatement;
    protected Dataset.Context context;

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonOrOrganization }
     * 
     * 
     */
    public List<PersonOrOrganization> getContact() {
        if (contact == null) {
            contact = new ArrayList<PersonOrOrganization>();
        }
        return this.contact;
    }

    /**
     * Gets the value of the creator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonOrOrganization }
     * 
     * 
     */
    public List<PersonOrOrganization> getCreator() {
        if (creator == null) {
            creator = new ArrayList<PersonOrOrganization>();
        }
        return this.creator;
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
     * Gets the value of the project property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the project property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dataset.Project }
     * 
     * 
     */
    public List<Dataset.Project> getProject() {
        if (project == null) {
            project = new ArrayList<Dataset.Project>();
        }
        return this.project;
    }

    /**
     * Gets the value of the fundingReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fundingReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFundingReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dataset.FundingReference }
     * 
     * 
     */
    public List<Dataset.FundingReference> getFundingReference() {
        if (fundingReference == null) {
            fundingReference = new ArrayList<Dataset.FundingReference>();
        }
        return this.fundingReference;
    }

    /**
     * Ruft den Wert der worked-Eigenschaft ab.
     * 
     */
    public boolean isWorked() {
        return worked;
    }

    /**
     * Legt den Wert der worked-Eigenschaft fest.
     * 
     */
    public void setWorked(boolean value) {
        this.worked = value;
    }

    /**
     * Ruft den Wert der workedNote-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkedNote() {
        return workedNote;
    }

    /**
     * Legt den Wert der workedNote-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkedNote(String value) {
        this.workedNote = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the title property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dataset.Title }
     * 
     * 
     */
    public List<Dataset.Title> getTitle() {
        if (title == null) {
            title = new ArrayList<Dataset.Title>();
        }
        return this.title;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dataset.Description }
     * 
     * 
     */
    public List<Dataset.Description> getDescription() {
        if (description == null) {
            description = new ArrayList<Dataset.Description>();
        }
        return this.description;
    }

    /**
     * Ruft den Wert der resourceType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Dataset.ResourceType }
     *     
     */
    public Dataset.ResourceType getResourceType() {
        return resourceType;
    }

    /**
     * Legt den Wert der resourceType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Dataset.ResourceType }
     *     
     */
    public void setResourceType(Dataset.ResourceType value) {
        this.resourceType = value;
    }

    /**
     * Ruft den Wert der keywords-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Dataset.Keywords }
     *     
     */
    public Dataset.Keywords getKeywords() {
        return keywords;
    }

    /**
     * Legt den Wert der keywords-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Dataset.Keywords }
     *     
     */
    public void setKeywords(Dataset.Keywords value) {
        this.keywords = value;
    }

    /**
     * Ruft den Wert der subjects-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Dataset.Subjects }
     *     
     */
    public Dataset.Subjects getSubjects() {
        return subjects;
    }

    /**
     * Legt den Wert der subjects-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Dataset.Subjects }
     *     
     */
    public void setSubjects(Dataset.Subjects value) {
        this.subjects = value;
    }

    /**
     * Ruft den Wert der dates-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Dataset.Dates }
     *     
     */
    public Dataset.Dates getDates() {
        return dates;
    }

    /**
     * Legt den Wert der dates-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Dataset.Dates }
     *     
     */
    public void setDates(Dataset.Dates value) {
        this.dates = value;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMode() {
        if (mode == null) {
            mode = new ArrayList<String>();
        }
        return this.mode;
    }

    /**
     * Gets the value of the measuredVariable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measuredVariable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasuredVariable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Variable }
     * 
     * 
     */
    public List<Variable> getMeasuredVariable() {
        if (measuredVariable == null) {
            measuredVariable = new ArrayList<Variable>();
        }
        return this.measuredVariable;
    }

    /**
     * Gets the value of the controlledVariable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the controlledVariable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getControlledVariable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Variable }
     * 
     * 
     */
    public List<Variable> getControlledVariable() {
        if (controlledVariable == null) {
            controlledVariable = new ArrayList<Variable>();
        }
        return this.controlledVariable;
    }

    /**
     * Gets the value of the system property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the system property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSystem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dataset.System }
     * 
     * 
     */
    public List<Dataset.System> getSystem() {
        if (system == null) {
            system = new ArrayList<Dataset.System>();
        }
        return this.system;
    }

    /**
     * Ruft den Wert der provenance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Dataset.Provenance }
     *     
     */
    public Dataset.Provenance getProvenance() {
        return provenance;
    }

    /**
     * Legt den Wert der provenance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Dataset.Provenance }
     *     
     */
    public void setProvenance(Dataset.Provenance value) {
        this.provenance = value;
    }

    /**
     * Ruft den Wert der size-Eigenschaft ab.
     * 
     */
    public long getSize() {
        return size;
    }

    /**
     * Legt den Wert der size-Eigenschaft fest.
     * 
     */
    public void setSize(long value) {
        this.size = value;
    }

    /**
     * Ruft den Wert der storage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StorageComplexType }
     *     
     */
    public StorageComplexType getStorage() {
        return storage;
    }

    /**
     * Legt den Wert der storage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StorageComplexType }
     *     
     */
    public void setStorage(StorageComplexType value) {
        this.storage = value;
    }

    /**
     * Ruft den Wert der format-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FormatComplexType }
     *     
     */
    public FormatComplexType getFormat() {
        return format;
    }

    /**
     * Legt den Wert der format-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FormatComplexType }
     *     
     */
    public void setFormat(FormatComplexType value) {
        this.format = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pid }
     * 
     * 
     */
    public List<Pid> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<Pid>();
        }
        return this.identifier;
    }

    /**
     * Ruft den Wert der checksum-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ChecksumType }
     *     
     */
    public ChecksumType getChecksum() {
        return checksum;
    }

    /**
     * Legt den Wert der checksum-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ChecksumType }
     *     
     */
    public void setChecksum(ChecksumType value) {
        this.checksum = value;
    }

    /**
     * Gets the value of the rightsStatement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rightsStatement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRightsStatement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RightsStatementComplexType }
     * 
     * 
     */
    public List<RightsStatementComplexType> getRightsStatement() {
        if (rightsStatement == null) {
            rightsStatement = new ArrayList<RightsStatementComplexType>();
        }
        return this.rightsStatement;
    }

    /**
     * Ruft den Wert der context-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Dataset.Context }
     *     
     */
    public Dataset.Context getContext() {
        return context;
    }

    /**
     * Legt den Wert der context-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Dataset.Context }
     *     
     */
    public void setContext(Dataset.Context value) {
        this.context = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;element name="referencePublication" type="{}publication"/>
     *         &lt;element name="relatedResource" type="{}fileOrResource"/>
     *         &lt;element name="relatedIdentifier">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="relatedIdentifierType" use="required" type="{http://datacite.org/schema/kernel-4}relatedIdentifierType" />
     *                 &lt;attribute name="relationType" use="required" type="{http://datacite.org/schema/kernel-4}relationType" />
     *                 &lt;attribute name="relatedMetadataScheme" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="schemeURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *                 &lt;attribute name="schemeType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "referencePublicationOrRelatedResourceOrRelatedIdentifier"
    })
    public static class Context {

        @XmlElements({
            @XmlElement(name = "referencePublication", type = Publication.class),
            @XmlElement(name = "relatedResource", type = FileOrResource.class),
            @XmlElement(name = "relatedIdentifier", type = Dataset.Context.RelatedIdentifier.class)
        })
        protected List<Object> referencePublicationOrRelatedResourceOrRelatedIdentifier;

        /**
         * Gets the value of the referencePublicationOrRelatedResourceOrRelatedIdentifier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the referencePublicationOrRelatedResourceOrRelatedIdentifier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReferencePublicationOrRelatedResourceOrRelatedIdentifier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Publication }
         * {@link FileOrResource }
         * {@link Dataset.Context.RelatedIdentifier }
         * 
         * 
         */
        public List<Object> getReferencePublicationOrRelatedResourceOrRelatedIdentifier() {
            if (referencePublicationOrRelatedResourceOrRelatedIdentifier == null) {
                referencePublicationOrRelatedResourceOrRelatedIdentifier = new ArrayList<Object>();
            }
            return this.referencePublicationOrRelatedResourceOrRelatedIdentifier;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="relatedIdentifierType" use="required" type="{http://datacite.org/schema/kernel-4}relatedIdentifierType" />
         *       &lt;attribute name="relationType" use="required" type="{http://datacite.org/schema/kernel-4}relationType" />
         *       &lt;attribute name="relatedMetadataScheme" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="schemeURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
         *       &lt;attribute name="schemeType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class RelatedIdentifier {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "relatedIdentifierType", required = true)
            protected RelatedIdentifierType relatedIdentifierType;
            @XmlAttribute(name = "relationType", required = true)
            protected RelationType relationType;
            @XmlAttribute(name = "relatedMetadataScheme")
            @XmlSchemaType(name = "anySimpleType")
            protected String relatedMetadataScheme;
            @XmlAttribute(name = "schemeURI")
            @XmlSchemaType(name = "anyURI")
            protected String schemeURI;
            @XmlAttribute(name = "schemeType")
            @XmlSchemaType(name = "anySimpleType")
            protected String schemeType;

            /**
             * Ruft den Wert der value-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Legt den Wert der value-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Ruft den Wert der relatedIdentifierType-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link RelatedIdentifierType }
             *     
             */
            public RelatedIdentifierType getRelatedIdentifierType() {
                return relatedIdentifierType;
            }

            /**
             * Legt den Wert der relatedIdentifierType-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link RelatedIdentifierType }
             *     
             */
            public void setRelatedIdentifierType(RelatedIdentifierType value) {
                this.relatedIdentifierType = value;
            }

            /**
             * Ruft den Wert der relationType-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link RelationType }
             *     
             */
            public RelationType getRelationType() {
                return relationType;
            }

            /**
             * Legt den Wert der relationType-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link RelationType }
             *     
             */
            public void setRelationType(RelationType value) {
                this.relationType = value;
            }

            /**
             * Ruft den Wert der relatedMetadataScheme-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRelatedMetadataScheme() {
                return relatedMetadataScheme;
            }

            /**
             * Legt den Wert der relatedMetadataScheme-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRelatedMetadataScheme(String value) {
                this.relatedMetadataScheme = value;
            }

            /**
             * Ruft den Wert der schemeURI-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSchemeURI() {
                return schemeURI;
            }

            /**
             * Legt den Wert der schemeURI-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSchemeURI(String value) {
                this.schemeURI = value;
            }

            /**
             * Ruft den Wert der schemeType-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSchemeType() {
                return schemeType;
            }

            /**
             * Legt den Wert der schemeType-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSchemeType(String value) {
                this.schemeType = value;
            }

        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="date" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="dateType" use="required" type="{http://datacite.org/schema/kernel-4}dateType" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "date"
    })
    public static class Dates {

        protected List<Dataset.Dates.Date> date;

        /**
         * Gets the value of the date property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the date property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Dataset.Dates.Date }
         * 
         * 
         */
        public List<Dataset.Dates.Date> getDate() {
            if (date == null) {
                date = new ArrayList<Dataset.Dates.Date>();
            }
            return this.date;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="dateType" use="required" type="{http://datacite.org/schema/kernel-4}dateType" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Date {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "dateType", required = true)
            protected DateType dateType;

            /**
             * Ruft den Wert der value-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Legt den Wert der value-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Ruft den Wert der dateType-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link DateType }
             *     
             */
            public DateType getDateType() {
                return dateType;
            }

            /**
             * Legt den Wert der dateType-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link DateType }
             *     
             */
            public void setDateType(DateType value) {
                this.dateType = value;
            }

        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="br" maxOccurs="unbounded" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="0"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/choice>
     *       &lt;attribute name="descriptionType" use="required" type="{http://datacite.org/schema/kernel-4}descriptionType" />
     *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "content"
    })
    public static class Description {

        @XmlElementRef(name = "br", type = JAXBElement.class, required = false)
        @XmlMixed
        protected List<Serializable> content;
        @XmlAttribute(name = "descriptionType", required = true)
        protected DescriptionType descriptionType;
        @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
        protected String lang;

        /**
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
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link String }
         * 
         * 
         */
        public List<Serializable> getContent() {
            if (content == null) {
                content = new ArrayList<Serializable>();
            }
            return this.content;
        }

        /**
         * Ruft den Wert der descriptionType-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link DescriptionType }
         *     
         */
        public DescriptionType getDescriptionType() {
            return descriptionType;
        }

        /**
         * Legt den Wert der descriptionType-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link DescriptionType }
         *     
         */
        public void setDescriptionType(DescriptionType value) {
            this.descriptionType = value;
        }

        /**
         * Ruft den Wert der lang-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLang() {
            return lang;
        }

        /**
         * Legt den Wert der lang-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLang(String value) {
            this.lang = value;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;all>
     *         &lt;element name="funderName">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="funderIdentifier" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="funderIdentifierType" use="required" type="{http://datacite.org/schema/kernel-4}funderIdentifierType" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="awardNumber" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="awardURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="awardTitle" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/all>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class FundingReference {

        @XmlElement(required = true)
        protected String funderName;
        protected Dataset.FundingReference.FunderIdentifier funderIdentifier;
        protected Dataset.FundingReference.AwardNumber awardNumber;
        protected String awardTitle;

        /**
         * Ruft den Wert der funderName-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFunderName() {
            return funderName;
        }

        /**
         * Legt den Wert der funderName-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFunderName(String value) {
            this.funderName = value;
        }

        /**
         * Ruft den Wert der funderIdentifier-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Dataset.FundingReference.FunderIdentifier }
         *     
         */
        public Dataset.FundingReference.FunderIdentifier getFunderIdentifier() {
            return funderIdentifier;
        }

        /**
         * Legt den Wert der funderIdentifier-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Dataset.FundingReference.FunderIdentifier }
         *     
         */
        public void setFunderIdentifier(Dataset.FundingReference.FunderIdentifier value) {
            this.funderIdentifier = value;
        }

        /**
         * Ruft den Wert der awardNumber-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Dataset.FundingReference.AwardNumber }
         *     
         */
        public Dataset.FundingReference.AwardNumber getAwardNumber() {
            return awardNumber;
        }

        /**
         * Legt den Wert der awardNumber-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Dataset.FundingReference.AwardNumber }
         *     
         */
        public void setAwardNumber(Dataset.FundingReference.AwardNumber value) {
            this.awardNumber = value;
        }

        /**
         * Ruft den Wert der awardTitle-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwardTitle() {
            return awardTitle;
        }

        /**
         * Legt den Wert der awardTitle-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwardTitle(String value) {
            this.awardTitle = value;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="awardURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class AwardNumber {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "awardURI")
            @XmlSchemaType(name = "anyURI")
            protected String awardURI;

            /**
             * Ruft den Wert der value-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Legt den Wert der value-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Ruft den Wert der awardURI-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAwardURI() {
                return awardURI;
            }

            /**
             * Legt den Wert der awardURI-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAwardURI(String value) {
                this.awardURI = value;
            }

        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="funderIdentifierType" use="required" type="{http://datacite.org/schema/kernel-4}funderIdentifierType" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class FunderIdentifier {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "funderIdentifierType", required = true)
            protected FunderIdentifierType funderIdentifierType;

            /**
             * Ruft den Wert der value-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Legt den Wert der value-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Ruft den Wert der funderIdentifierType-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link FunderIdentifierType }
             *     
             */
            public FunderIdentifierType getFunderIdentifierType() {
                return funderIdentifierType;
            }

            /**
             * Legt den Wert der funderIdentifierType-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link FunderIdentifierType }
             *     
             */
            public void setFunderIdentifierType(FunderIdentifierType value) {
                this.funderIdentifierType = value;
            }

        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="keyword" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="vocabulary" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="vocabularyURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "keyword"
    })
    public static class Keywords {

        @XmlElement(required = true)
        protected List<Dataset.Keywords.Keyword> keyword;

        /**
         * Gets the value of the keyword property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the keyword property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKeyword().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Dataset.Keywords.Keyword }
         * 
         * 
         */
        public List<Dataset.Keywords.Keyword> getKeyword() {
            if (keyword == null) {
                keyword = new ArrayList<Dataset.Keywords.Keyword>();
            }
            return this.keyword;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="vocabulary" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="vocabularyURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Keyword {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "vocabulary")
            protected String vocabulary;
            @XmlAttribute(name = "vocabularyURL")
            @XmlSchemaType(name = "anyURI")
            protected String vocabularyURL;

            /**
             * Ruft den Wert der value-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Legt den Wert der value-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Ruft den Wert der vocabulary-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVocabulary() {
                return vocabulary;
            }

            /**
             * Legt den Wert der vocabulary-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVocabulary(String value) {
                this.vocabulary = value;
            }

            /**
             * Ruft den Wert der vocabularyURL-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVocabularyURL() {
                return vocabularyURL;
            }

            /**
             * Legt den Wert der vocabularyURL-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVocabularyURL(String value) {
                this.vocabularyURL = value;
            }

        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="level" type="{http://www.w3.org/2001/XMLSchema}integer" default="0" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Project {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "level")
        protected BigInteger level;

        /**
         * Ruft den Wert der value-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Legt den Wert der value-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Ruft den Wert der level-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getLevel() {
            if (level == null) {
                return new BigInteger("0");
            } else {
                return level;
            }
        }

        /**
         * Legt den Wert der level-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setLevel(BigInteger value) {
            this.level = value;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="step" type="{}processingStep" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "step"
    })
    public static class Provenance {

        @XmlElement(required = true)
        protected List<ProcessingStep> step;

        /**
         * Gets the value of the step property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the step property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStep().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProcessingStep }
         * 
         * 
         */
        public List<ProcessingStep> getStep() {
            if (step == null) {
                step = new ArrayList<ProcessingStep>();
            }
            return this.step;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="resourceTypeGeneral" use="required" type="{http://datacite.org/schema/kernel-4}resourceType" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class ResourceType {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "resourceTypeGeneral", required = true)
        protected dtc.dateType.ResourceType resourceTypeGeneral;

        /**
         * Ruft den Wert der value-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Legt den Wert der value-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Ruft den Wert der resourceTypeGeneral-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link dtc.dateType.ResourceType }
         *     
         */
        public dtc.dateType.ResourceType getResourceTypeGeneral() {
            return resourceTypeGeneral;
        }

        /**
         * Legt den Wert der resourceTypeGeneral-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link dtc.dateType.ResourceType }
         *     
         */
        public void setResourceTypeGeneral(dtc.dateType.ResourceType value) {
            this.resourceTypeGeneral = value;
        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="subject" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="subjectScheme" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="schemeURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *                 &lt;attribute name="valueURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *                 &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "subject"
    })
    public static class Subjects {

        @XmlElement(required = true)
        protected List<Dataset.Subjects.Subject> subject;

        /**
         * Gets the value of the subject property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subject property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubject().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Dataset.Subjects.Subject }
         * 
         * 
         */
        public List<Dataset.Subjects.Subject> getSubject() {
            if (subject == null) {
                subject = new ArrayList<Dataset.Subjects.Subject>();
            }
            return this.subject;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="subjectScheme" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="schemeURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
         *       &lt;attribute name="valueURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
         *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Subject {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "subjectScheme")
            @XmlSchemaType(name = "anySimpleType")
            protected String subjectScheme;
            @XmlAttribute(name = "schemeURI")
            @XmlSchemaType(name = "anyURI")
            protected String schemeURI;
            @XmlAttribute(name = "valueURI")
            @XmlSchemaType(name = "anyURI")
            protected String valueURI;
            @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
            protected String lang;

            /**
             * Ruft den Wert der value-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Legt den Wert der value-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Ruft den Wert der subjectScheme-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSubjectScheme() {
                return subjectScheme;
            }

            /**
             * Legt den Wert der subjectScheme-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSubjectScheme(String value) {
                this.subjectScheme = value;
            }

            /**
             * Ruft den Wert der schemeURI-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSchemeURI() {
                return schemeURI;
            }

            /**
             * Legt den Wert der schemeURI-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSchemeURI(String value) {
                this.schemeURI = value;
            }

            /**
             * Ruft den Wert der valueURI-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValueURI() {
                return valueURI;
            }

            /**
             * Legt den Wert der valueURI-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValueURI(String value) {
                this.valueURI = value;
            }

            /**
             * Ruft den Wert der lang-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLang() {
                return lang;
            }

            /**
             * Legt den Wert der lang-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLang(String value) {
                this.lang = value;
            }

        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="phase" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="component" type="{}component" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="component" type="{}component" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="parameter" type="{}variable" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="grid" type="{}spacialResolution" minOccurs="0"/>
     *         &lt;element name="temporalResolution" type="{}temporalResolution" minOccurs="0"/>
     *         &lt;element name="boundaryCondition" type="{}boundaryCondition" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "phase",
        "component",
        "parameter",
        "grid",
        "temporalResolution",
        "boundaryCondition"
    })
    public static class System {

        protected List<Dataset.System.Phase> phase;
        protected List<Component> component;
        protected List<Variable> parameter;
        protected SpacialResolution grid;
        protected TemporalResolution temporalResolution;
        protected BoundaryCondition boundaryCondition;
        @XmlAttribute(name = "id")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String id;

        /**
         * Gets the value of the phase property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the phase property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPhase().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Dataset.System.Phase }
         * 
         * 
         */
        public List<Dataset.System.Phase> getPhase() {
            if (phase == null) {
                phase = new ArrayList<Dataset.System.Phase>();
            }
            return this.phase;
        }

        /**
         * Gets the value of the component property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the component property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getComponent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Component }
         * 
         * 
         */
        public List<Component> getComponent() {
            if (component == null) {
                component = new ArrayList<Component>();
            }
            return this.component;
        }

        /**
         * Gets the value of the parameter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the parameter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParameter().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Variable }
         * 
         * 
         */
        public List<Variable> getParameter() {
            if (parameter == null) {
                parameter = new ArrayList<Variable>();
            }
            return this.parameter;
        }

        /**
         * Ruft den Wert der grid-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link SpacialResolution }
         *     
         */
        public SpacialResolution getGrid() {
            return grid;
        }

        /**
         * Legt den Wert der grid-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link SpacialResolution }
         *     
         */
        public void setGrid(SpacialResolution value) {
            this.grid = value;
        }

        /**
         * Ruft den Wert der temporalResolution-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link TemporalResolution }
         *     
         */
        public TemporalResolution getTemporalResolution() {
            return temporalResolution;
        }

        /**
         * Legt den Wert der temporalResolution-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link TemporalResolution }
         *     
         */
        public void setTemporalResolution(TemporalResolution value) {
            this.temporalResolution = value;
        }

        /**
         * Ruft den Wert der boundaryCondition-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BoundaryCondition }
         *     
         */
        public BoundaryCondition getBoundaryCondition() {
            return boundaryCondition;
        }

        /**
         * Legt den Wert der boundaryCondition-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BoundaryCondition }
         *     
         */
        public void setBoundaryCondition(BoundaryCondition value) {
            this.boundaryCondition = value;
        }

        /**
         * Ruft den Wert der id-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Legt den Wert der id-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="component" type="{}component" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "component"
        })
        public static class Phase {

            protected List<Component> component;
            @XmlAttribute(name = "name", required = true)
            protected String name;

            /**
             * Gets the value of the component property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the component property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getComponent().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Component }
             * 
             * 
             */
            public List<Component> getComponent() {
                if (component == null) {
                    component = new ArrayList<Component>();
                }
                return this.component;
            }

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

        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="titleType" type="{http://datacite.org/schema/kernel-4}titleType" />
     *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Title {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "titleType")
        protected TitleType titleType;
        @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
        protected String lang;

        /**
         * Ruft den Wert der value-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Legt den Wert der value-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Ruft den Wert der titleType-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link TitleType }
         *     
         */
        public TitleType getTitleType() {
            return titleType;
        }

        /**
         * Legt den Wert der titleType-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link TitleType }
         *     
         */
        public void setTitleType(TitleType value) {
            this.titleType = value;
        }

        /**
         * Ruft den Wert der lang-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLang() {
            return lang;
        }

        /**
         * Legt den Wert der lang-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLang(String value) {
            this.lang = value;
        }

    }

}
