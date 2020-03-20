//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.02.05 um 05:02:22 PM CET 
//


package exptml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für instrumentType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="instrumentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:exptml:schema:draft:0.5}name"/>
 *         &lt;element ref="{urn:exptml:schema:draft:0.5}description"/>
 *         &lt;element ref="{urn:exptml:schema:draft:0.5}type"/>
 *         &lt;element ref="{urn:exptml:schema:draft:0.5}partnum" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:exptml:schema:draft:0.5}serialnum" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:exptml:schema:draft:0.5}software" minOccurs="0"/>
 *         &lt;element ref="{urn:exptml:schema:draft:0.5}location" minOccurs="0"/>
 *         &lt;element ref="{urn:exptml:schema:draft:0.5}history" minOccurs="0"/>
 *         &lt;element ref="{urn:exptml:schema:draft:0.5}date" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:exptml:schema:draft:0.5}file" minOccurs="0"/>
 *         &lt;element ref="{urn:exptml:schema:draft:0.5}relationships" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="0.5" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "instrumentType", propOrder = {
    "name",
    "description",
    "type",
    "partnum",
    "serialnum",
    "software",
    "location",
    "history",
    "date",
    "file",
    "relationships"
})
public class InstrumentType {

    @XmlElement(required = true)
    protected SmallTextType name;
    @XmlElement(required = true)
    protected LargeTextType description;
    @XmlElement(required = true)
    protected SmallTextType type;
    protected List<VendorIdType> partnum;
    protected List<VendorIdType> serialnum;
    protected SoftwareType software;
    protected SmallTextType location;
    protected ExptmlHistoryType history;
    protected List<ExptmlDateType> date;
    protected UriType file;
    protected AnyXmlType relationships;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SmallTextType }
     *     
     */
    public SmallTextType getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SmallTextType }
     *     
     */
    public void setName(SmallTextType value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der description-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LargeTextType }
     *     
     */
    public LargeTextType getDescription() {
        return description;
    }

    /**
     * Legt den Wert der description-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LargeTextType }
     *     
     */
    public void setDescription(LargeTextType value) {
        this.description = value;
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SmallTextType }
     *     
     */
    public SmallTextType getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SmallTextType }
     *     
     */
    public void setType(SmallTextType value) {
        this.type = value;
    }

    /**
     * Gets the value of the partnum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VendorIdType }
     * 
     * 
     */
    public List<VendorIdType> getPartnum() {
        if (partnum == null) {
            partnum = new ArrayList<VendorIdType>();
        }
        return this.partnum;
    }

    /**
     * Gets the value of the serialnum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serialnum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSerialnum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VendorIdType }
     * 
     * 
     */
    public List<VendorIdType> getSerialnum() {
        if (serialnum == null) {
            serialnum = new ArrayList<VendorIdType>();
        }
        return this.serialnum;
    }

    /**
     * Ruft den Wert der software-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SoftwareType }
     *     
     */
    public SoftwareType getSoftware() {
        return software;
    }

    /**
     * Legt den Wert der software-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SoftwareType }
     *     
     */
    public void setSoftware(SoftwareType value) {
        this.software = value;
    }

    /**
     * Ruft den Wert der location-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SmallTextType }
     *     
     */
    public SmallTextType getLocation() {
        return location;
    }

    /**
     * Legt den Wert der location-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SmallTextType }
     *     
     */
    public void setLocation(SmallTextType value) {
        this.location = value;
    }

    /**
     * Ruft den Wert der history-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExptmlHistoryType }
     *     
     */
    public ExptmlHistoryType getHistory() {
        return history;
    }

    /**
     * Legt den Wert der history-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExptmlHistoryType }
     *     
     */
    public void setHistory(ExptmlHistoryType value) {
        this.history = value;
    }

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
     * {@link ExptmlDateType }
     * 
     * 
     */
    public List<ExptmlDateType> getDate() {
        if (date == null) {
            date = new ArrayList<ExptmlDateType>();
        }
        return this.date;
    }

    /**
     * Ruft den Wert der file-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UriType }
     *     
     */
    public UriType getFile() {
        return file;
    }

    /**
     * Legt den Wert der file-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UriType }
     *     
     */
    public void setFile(UriType value) {
        this.file = value;
    }

    /**
     * Ruft den Wert der relationships-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AnyXmlType }
     *     
     */
    public AnyXmlType getRelationships() {
        return relationships;
    }

    /**
     * Legt den Wert der relationships-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyXmlType }
     *     
     */
    public void setRelationships(AnyXmlType value) {
        this.relationships = value;
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
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "0.5";
        } else {
            return version;
        }
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

}
