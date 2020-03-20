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


/**
 * Type for the quantity.
 * 
 * <p>Java-Klasse für QuantityType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="QuantityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}QuantityName" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}QuantitySymbol" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}UnitReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}QuantityVersionHistory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}QuantityDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}QuantityHistory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}QuantityRemark" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}dimensionURL"/>
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}id use="required""/>
 *       &lt;attribute name="quantityType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="base"/>
 *             &lt;enumeration value="derived"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityType", propOrder = {
    "quantityName",
    "quantitySymbol",
    "unitReference",
    "quantityVersionHistory",
    "quantityDefinition",
    "quantityHistory",
    "quantityRemark"
})
public class QuantityType {

    @XmlElement(name = "QuantityName", required = true)
    protected List<NameType> quantityName;
    @XmlElement(name = "QuantitySymbol")
    protected List<SymbolType> quantitySymbol;
    @XmlElement(name = "UnitReference")
    protected List<ReferenceType> unitReference;
    @XmlElement(name = "QuantityVersionHistory")
    protected List<NoteType> quantityVersionHistory;
    @XmlElement(name = "QuantityDefinition")
    protected List<DefinitionType> quantityDefinition;
    @XmlElement(name = "QuantityHistory")
    protected List<HistoryType> quantityHistory;
    @XmlElement(name = "QuantityRemark")
    protected List<RemarkType> quantityRemark;
    @XmlAttribute(name = "id", namespace = "http://www.w3.org/XML/1998/namespace", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "quantityType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String quantityType;
    @XmlAttribute(name = "dimensionURL")
    @XmlSchemaType(name = "anyURI")
    protected String dimensionURL;

    /**
     * Gets the value of the quantityName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantityName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantityName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     * 
     * 
     */
    public List<NameType> getQuantityName() {
        if (quantityName == null) {
            quantityName = new ArrayList<NameType>();
        }
        return this.quantityName;
    }

    /**
     * Element containing various quantity symbols.Gets the value of the quantitySymbol property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantitySymbol property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantitySymbol().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SymbolType }
     * 
     * 
     */
    public List<SymbolType> getQuantitySymbol() {
        if (quantitySymbol == null) {
            quantitySymbol = new ArrayList<SymbolType>();
        }
        return this.quantitySymbol;
    }

    /**
     * Element for specifying particular units associated with the quantity.Gets the value of the unitReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceType }
     * 
     * 
     */
    public List<ReferenceType> getUnitReference() {
        if (unitReference == null) {
            unitReference = new ArrayList<ReferenceType>();
        }
        return this.unitReference;
    }

    /**
     * Element for descriptive information, including version changes to the quantity.Gets the value of the quantityVersionHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantityVersionHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantityVersionHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoteType }
     * 
     * 
     */
    public List<NoteType> getQuantityVersionHistory() {
        if (quantityVersionHistory == null) {
            quantityVersionHistory = new ArrayList<NoteType>();
        }
        return this.quantityVersionHistory;
    }

    /**
     * Gets the value of the quantityDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantityDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantityDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DefinitionType }
     * 
     * 
     */
    public List<DefinitionType> getQuantityDefinition() {
        if (quantityDefinition == null) {
            quantityDefinition = new ArrayList<DefinitionType>();
        }
        return this.quantityDefinition;
    }

    /**
     * Gets the value of the quantityHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantityHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantityHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HistoryType }
     * 
     * 
     */
    public List<HistoryType> getQuantityHistory() {
        if (quantityHistory == null) {
            quantityHistory = new ArrayList<HistoryType>();
        }
        return this.quantityHistory;
    }

    /**
     * Gets the value of the quantityRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantityRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantityRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemarkType }
     * 
     * 
     */
    public List<RemarkType> getQuantityRemark() {
        if (quantityRemark == null) {
            quantityRemark = new ArrayList<RemarkType>();
        }
        return this.quantityRemark;
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
     * Ruft den Wert der quantityType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityType() {
        return quantityType;
    }

    /**
     * Legt den Wert der quantityType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityType(String value) {
        this.quantityType = value;
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
