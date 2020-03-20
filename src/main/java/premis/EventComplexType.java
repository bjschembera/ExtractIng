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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java-Klasse für eventComplexType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="eventComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}eventIdentifier"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}eventType"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}eventDateTime"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}eventDetailInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}eventOutcomeInformation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}linkingAgentIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}linkingObjectIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="xmlID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="version" type="{http://www.loc.gov/premis/v3}version3" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eventComplexType", propOrder = {
    "eventIdentifier",
    "eventType",
    "eventDateTime",
    "eventDetailInformation",
    "eventOutcomeInformation",
    "linkingAgentIdentifier",
    "linkingObjectIdentifier"
})
public class EventComplexType {

    @XmlElement(required = true)
    protected EventIdentifierComplexType eventIdentifier;
    @XmlElement(required = true)
    protected StringPlusAuthority eventType;
    @XmlElement(required = true)
    protected String eventDateTime;
    protected List<EventDetailInformationComplexType> eventDetailInformation;
    protected List<EventOutcomeInformationComplexType> eventOutcomeInformation;
    protected List<LinkingAgentIdentifierComplexType> linkingAgentIdentifier;
    protected List<LinkingObjectIdentifierComplexType> linkingObjectIdentifier;
    @XmlAttribute(name = "xmlID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String xmlID;
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * Ruft den Wert der eventIdentifier-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EventIdentifierComplexType }
     *     
     */
    public EventIdentifierComplexType getEventIdentifier() {
        return eventIdentifier;
    }

    /**
     * Legt den Wert der eventIdentifier-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EventIdentifierComplexType }
     *     
     */
    public void setEventIdentifier(EventIdentifierComplexType value) {
        this.eventIdentifier = value;
    }

    /**
     * Ruft den Wert der eventType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StringPlusAuthority }
     *     
     */
    public StringPlusAuthority getEventType() {
        return eventType;
    }

    /**
     * Legt den Wert der eventType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StringPlusAuthority }
     *     
     */
    public void setEventType(StringPlusAuthority value) {
        this.eventType = value;
    }

    /**
     * Ruft den Wert der eventDateTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventDateTime() {
        return eventDateTime;
    }

    /**
     * Legt den Wert der eventDateTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventDateTime(String value) {
        this.eventDateTime = value;
    }

    /**
     * Gets the value of the eventDetailInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventDetailInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventDetailInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventDetailInformationComplexType }
     * 
     * 
     */
    public List<EventDetailInformationComplexType> getEventDetailInformation() {
        if (eventDetailInformation == null) {
            eventDetailInformation = new ArrayList<EventDetailInformationComplexType>();
        }
        return this.eventDetailInformation;
    }

    /**
     * Gets the value of the eventOutcomeInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventOutcomeInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventOutcomeInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventOutcomeInformationComplexType }
     * 
     * 
     */
    public List<EventOutcomeInformationComplexType> getEventOutcomeInformation() {
        if (eventOutcomeInformation == null) {
            eventOutcomeInformation = new ArrayList<EventOutcomeInformationComplexType>();
        }
        return this.eventOutcomeInformation;
    }

    /**
     * Gets the value of the linkingAgentIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkingAgentIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkingAgentIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinkingAgentIdentifierComplexType }
     * 
     * 
     */
    public List<LinkingAgentIdentifierComplexType> getLinkingAgentIdentifier() {
        if (linkingAgentIdentifier == null) {
            linkingAgentIdentifier = new ArrayList<LinkingAgentIdentifierComplexType>();
        }
        return this.linkingAgentIdentifier;
    }

    /**
     * Gets the value of the linkingObjectIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkingObjectIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkingObjectIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinkingObjectIdentifierComplexType }
     * 
     * 
     */
    public List<LinkingObjectIdentifierComplexType> getLinkingObjectIdentifier() {
        if (linkingObjectIdentifier == null) {
            linkingObjectIdentifier = new ArrayList<LinkingObjectIdentifierComplexType>();
        }
        return this.linkingObjectIdentifier;
    }

    /**
     * Ruft den Wert der xmlID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlID() {
        return xmlID;
    }

    /**
     * Legt den Wert der xmlID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlID(String value) {
        this.xmlID = value;
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

}
