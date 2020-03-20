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
 * <p>Java-Klasse für objectCharacteristicsComplexType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="objectCharacteristicsComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}compositionLevel" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}fixity" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}size" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}format" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}creatingApplication" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}inhibitors" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}objectCharacteristicsExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "objectCharacteristicsComplexType", propOrder = {
    "compositionLevel",
    "fixity",
    "size",
    "format",
    "creatingApplication",
    "inhibitors",
    "objectCharacteristicsExtension"
})
public class ObjectCharacteristicsComplexType {

    protected CompositionLevelComplexType compositionLevel;
    protected List<FixityComplexType> fixity;
    protected Long size;
    @XmlElement(required = true)
    protected List<FormatComplexType> format;
    protected List<CreatingApplicationComplexType> creatingApplication;
    protected List<InhibitorsComplexType> inhibitors;
    protected List<ExtensionComplexType> objectCharacteristicsExtension;

    /**
     * Ruft den Wert der compositionLevel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CompositionLevelComplexType }
     *     
     */
    public CompositionLevelComplexType getCompositionLevel() {
        return compositionLevel;
    }

    /**
     * Legt den Wert der compositionLevel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CompositionLevelComplexType }
     *     
     */
    public void setCompositionLevel(CompositionLevelComplexType value) {
        this.compositionLevel = value;
    }

    /**
     * Gets the value of the fixity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fixity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFixity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FixityComplexType }
     * 
     * 
     */
    public List<FixityComplexType> getFixity() {
        if (fixity == null) {
            fixity = new ArrayList<FixityComplexType>();
        }
        return this.fixity;
    }

    /**
     * Ruft den Wert der size-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSize() {
        return size;
    }

    /**
     * Legt den Wert der size-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSize(Long value) {
        this.size = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the format property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormatComplexType }
     * 
     * 
     */
    public List<FormatComplexType> getFormat() {
        if (format == null) {
            format = new ArrayList<FormatComplexType>();
        }
        return this.format;
    }

    /**
     * Gets the value of the creatingApplication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creatingApplication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreatingApplication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreatingApplicationComplexType }
     * 
     * 
     */
    public List<CreatingApplicationComplexType> getCreatingApplication() {
        if (creatingApplication == null) {
            creatingApplication = new ArrayList<CreatingApplicationComplexType>();
        }
        return this.creatingApplication;
    }

    /**
     * Gets the value of the inhibitors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inhibitors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInhibitors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InhibitorsComplexType }
     * 
     * 
     */
    public List<InhibitorsComplexType> getInhibitors() {
        if (inhibitors == null) {
            inhibitors = new ArrayList<InhibitorsComplexType>();
        }
        return this.inhibitors;
    }

    /**
     * Gets the value of the objectCharacteristicsExtension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objectCharacteristicsExtension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjectCharacteristicsExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtensionComplexType }
     * 
     * 
     */
    public List<ExtensionComplexType> getObjectCharacteristicsExtension() {
        if (objectCharacteristicsExtension == null) {
            objectCharacteristicsExtension = new ArrayList<ExtensionComplexType>();
        }
        return this.objectCharacteristicsExtension;
    }

}
