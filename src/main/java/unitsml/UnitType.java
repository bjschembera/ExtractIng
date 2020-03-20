//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.02.05 um 05:02:22 PM CET 
//


package unitsml;

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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Type for the unit.
 * 
 * <p>Java-Klasse für UnitType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UnitType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}UnitSystem" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}UnitName" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}UnitSymbol" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}CodeListValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}RootUnits" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}Conversions" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}QuantityReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}UnitVersionHistory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}UnitDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}UnitHistory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}UnitRemark" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}dimensionURL"/>
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}id use="required""/>
 *       &lt;attribute name="timeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitType", propOrder = {
    "unitSystem",
    "unitName",
    "unitSymbol",
    "codeListValue",
    "rootUnits",
    "conversions",
    "quantityReference",
    "unitVersionHistory",
    "unitDefinition",
    "unitHistory",
    "unitRemark"
})
public class UnitType {

    @XmlElement(name = "UnitSystem")
    protected List<SystemType> unitSystem;
    @XmlElement(name = "UnitName", required = true)
    protected List<NameType> unitName;
    @XmlElement(name = "UnitSymbol")
    protected List<SymbolType> unitSymbol;
    @XmlElement(name = "CodeListValue")
    protected List<CodeListValueType> codeListValue;
    @XmlElement(name = "RootUnits")
    protected RootUnitsType rootUnits;
    @XmlElement(name = "Conversions")
    protected ConversionsType conversions;
    @XmlElement(name = "QuantityReference")
    protected List<ReferenceType> quantityReference;
    @XmlElement(name = "UnitVersionHistory")
    protected List<NoteType> unitVersionHistory;
    @XmlElement(name = "UnitDefinition")
    protected List<DefinitionType> unitDefinition;
    @XmlElement(name = "UnitHistory")
    protected List<HistoryType> unitHistory;
    @XmlElement(name = "UnitRemark")
    protected List<RemarkType> unitRemark;
    @XmlAttribute(name = "id", namespace = "http://www.w3.org/XML/1998/namespace", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "timeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;
    @XmlAttribute(name = "dimensionURL")
    @XmlSchemaType(name = "anyURI")
    protected String dimensionURL;

    /**
     * Container for describing the system(s) of units.Gets the value of the unitSystem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitSystem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitSystem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SystemType }
     * 
     * 
     */
    public List<SystemType> getUnitSystem() {
        if (unitSystem == null) {
            unitSystem = new ArrayList<SystemType>();
        }
        return this.unitSystem;
    }

    /**
     * Gets the value of the unitName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     * 
     * 
     */
    public List<NameType> getUnitName() {
        if (unitName == null) {
            unitName = new ArrayList<NameType>();
        }
        return this.unitName;
    }

    /**
     * Gets the value of the unitSymbol property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitSymbol property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitSymbol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SymbolType }
     * 
     * 
     */
    public List<SymbolType> getUnitSymbol() {
        if (unitSymbol == null) {
            unitSymbol = new ArrayList<SymbolType>();
        }
        return this.unitSymbol;
    }

    /**
     * Gets the value of the codeListValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the codeListValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodeListValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeListValueType }
     * 
     * 
     */
    public List<CodeListValueType> getCodeListValue() {
        if (codeListValue == null) {
            codeListValue = new ArrayList<CodeListValueType>();
        }
        return this.codeListValue;
    }

    /**
     * Container for defining derived units in terms of their root units. This allows a precise definition of a wide range of units. The goal is to improve interoperability among applications and databases which use derived units based on commonly encountered root units.
     * 
     * @return
     *     possible object is
     *     {@link RootUnitsType }
     *     
     */
    public RootUnitsType getRootUnits() {
        return rootUnits;
    }

    /**
     * Legt den Wert der rootUnits-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RootUnitsType }
     *     
     */
    public void setRootUnits(RootUnitsType value) {
        this.rootUnits = value;
    }

    /**
     * Ruft den Wert der conversions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ConversionsType }
     *     
     */
    public ConversionsType getConversions() {
        return conversions;
    }

    /**
     * Legt den Wert der conversions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionsType }
     *     
     */
    public void setConversions(ConversionsType value) {
        this.conversions = value;
    }

    /**
     * Gets the value of the quantityReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantityReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantityReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getQuantityReference() {
        if (quantityReference == null) {
            quantityReference = new ArrayList<ReferenceType>();
        }
        return this.quantityReference;
    }

    /**
     * Element for descriptive information, including version changes to the unit.Gets the value of the unitVersionHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitVersionHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitVersionHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoteType }
     * 
     * 
     */
    public List<NoteType> getUnitVersionHistory() {
        if (unitVersionHistory == null) {
            unitVersionHistory = new ArrayList<NoteType>();
        }
        return this.unitVersionHistory;
    }

    /**
     * Gets the value of the unitDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DefinitionType }
     * 
     * 
     */
    public List<DefinitionType> getUnitDefinition() {
        if (unitDefinition == null) {
            unitDefinition = new ArrayList<DefinitionType>();
        }
        return this.unitDefinition;
    }

    /**
     * Gets the value of the unitHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HistoryType }
     * 
     * 
     */
    public List<HistoryType> getUnitHistory() {
        if (unitHistory == null) {
            unitHistory = new ArrayList<HistoryType>();
        }
        return this.unitHistory;
    }

    /**
     * Gets the value of the unitRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemarkType }
     * 
     * 
     */
    public List<RemarkType> getUnitRemark() {
        if (unitRemark == null) {
            unitRemark = new ArrayList<RemarkType>();
        }
        return this.unitRemark;
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
     * Ruft den Wert der timeStamp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**
     * Legt den Wert der timeStamp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }

    /**
     * Ruft den Wert der dimensionURL-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimensionURL() {
        return dimensionURL;
    }

    /**
     * Legt den Wert der dimensionURL-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimensionURL(String value) {
        this.dimensionURL = value;
    }

}
