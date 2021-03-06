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
 * <p>Java-Klasse für agentComplexType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="agentComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}agentIdentifier" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}agentName" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}agentType" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}agentVersion" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}agentNote" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}agentExtension" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}linkingEventIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}linkingRightsStatementIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}linkingEnvironmentIdentifier" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "agentComplexType", propOrder = {
    "agentIdentifier",
    "agentName",
    "agentType",
    "agentVersion",
    "agentNote",
    "agentExtension",
    "linkingEventIdentifier",
    "linkingRightsStatementIdentifier",
    "linkingEnvironmentIdentifier"
})
public class AgentComplexType {

    @XmlElement(required = true)
    protected List<AgentIdentifierComplexType> agentIdentifier;
    protected List<StringPlusAuthority> agentName;
    protected StringPlusAuthority agentType;
    protected String agentVersion;
    protected List<String> agentNote;
    protected List<ExtensionComplexType> agentExtension;
    protected List<LinkingEventIdentifierComplexType> linkingEventIdentifier;
    protected List<LinkingRightsStatementIdentifierComplexType> linkingRightsStatementIdentifier;
    protected List<LinkingEnvironmentIdentifierComplexType> linkingEnvironmentIdentifier;
    @XmlAttribute(name = "xmlID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String xmlID;
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * Gets the value of the agentIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agentIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgentIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgentIdentifierComplexType }
     * 
     * 
     */
    public List<AgentIdentifierComplexType> getAgentIdentifier() {
        if (agentIdentifier == null) {
            agentIdentifier = new ArrayList<AgentIdentifierComplexType>();
        }
        return this.agentIdentifier;
    }

    /**
     * Gets the value of the agentName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agentName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgentName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StringPlusAuthority }
     * 
     * 
     */
    public List<StringPlusAuthority> getAgentName() {
        if (agentName == null) {
            agentName = new ArrayList<StringPlusAuthority>();
        }
        return this.agentName;
    }

    /**
     * Ruft den Wert der agentType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StringPlusAuthority }
     *     
     */
    public StringPlusAuthority getAgentType() {
        return agentType;
    }

    /**
     * Legt den Wert der agentType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StringPlusAuthority }
     *     
     */
    public void setAgentType(StringPlusAuthority value) {
        this.agentType = value;
    }

    /**
     * Ruft den Wert der agentVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentVersion() {
        return agentVersion;
    }

    /**
     * Legt den Wert der agentVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentVersion(String value) {
        this.agentVersion = value;
    }

    /**
     * Gets the value of the agentNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agentNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgentNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAgentNote() {
        if (agentNote == null) {
            agentNote = new ArrayList<String>();
        }
        return this.agentNote;
    }

    /**
     * Gets the value of the agentExtension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agentExtension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgentExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionComplexType }
     * 
     * 
     */
    public List<ExtensionComplexType> getAgentExtension() {
        if (agentExtension == null) {
            agentExtension = new ArrayList<ExtensionComplexType>();
        }
        return this.agentExtension;
    }

    /**
     * Gets the value of the linkingEventIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkingEventIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkingEventIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinkingEventIdentifierComplexType }
     * 
     * 
     */
    public List<LinkingEventIdentifierComplexType> getLinkingEventIdentifier() {
        if (linkingEventIdentifier == null) {
            linkingEventIdentifier = new ArrayList<LinkingEventIdentifierComplexType>();
        }
        return this.linkingEventIdentifier;
    }

    /**
     * Gets the value of the linkingRightsStatementIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkingRightsStatementIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkingRightsStatementIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinkingRightsStatementIdentifierComplexType }
     * 
     * 
     */
    public List<LinkingRightsStatementIdentifierComplexType> getLinkingRightsStatementIdentifier() {
        if (linkingRightsStatementIdentifier == null) {
            linkingRightsStatementIdentifier = new ArrayList<LinkingRightsStatementIdentifierComplexType>();
        }
        return this.linkingRightsStatementIdentifier;
    }

    /**
     * Gets the value of the linkingEnvironmentIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkingEnvironmentIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkingEnvironmentIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinkingEnvironmentIdentifierComplexType }
     * 
     * 
     */
    public List<LinkingEnvironmentIdentifierComplexType> getLinkingEnvironmentIdentifier() {
        if (linkingEnvironmentIdentifier == null) {
            linkingEnvironmentIdentifier = new ArrayList<LinkingEnvironmentIdentifierComplexType>();
        }
        return this.linkingEnvironmentIdentifier;
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
