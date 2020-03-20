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
 * <p>Java-Klasse für environmentDesignationComplexType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="environmentDesignationComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}environmentName"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}environmentVersion" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}environmentOrigin" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}environmentDesignationNote" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}environmentDesignationExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "environmentDesignationComplexType", propOrder = {
    "environmentName",
    "environmentVersion",
    "environmentOrigin",
    "environmentDesignationNote",
    "environmentDesignationExtension"
})
public class EnvironmentDesignationComplexType {

    @XmlElement(required = true)
    protected StringPlusAuthority environmentName;
    protected String environmentVersion;
    protected String environmentOrigin;
    protected List<String> environmentDesignationNote;
    protected List<String> environmentDesignationExtension;

    /**
     * Ruft den Wert der environmentName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StringPlusAuthority }
     *     
     */
    public StringPlusAuthority getEnvironmentName() {
        return environmentName;
    }

    /**
     * Legt den Wert der environmentName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StringPlusAuthority }
     *     
     */
    public void setEnvironmentName(StringPlusAuthority value) {
        this.environmentName = value;
    }

    /**
     * Ruft den Wert der environmentVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvironmentVersion() {
        return environmentVersion;
    }

    /**
     * Legt den Wert der environmentVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvironmentVersion(String value) {
        this.environmentVersion = value;
    }

    /**
     * Ruft den Wert der environmentOrigin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvironmentOrigin() {
        return environmentOrigin;
    }

    /**
     * Legt den Wert der environmentOrigin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvironmentOrigin(String value) {
        this.environmentOrigin = value;
    }

    /**
     * Gets the value of the environmentDesignationNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the environmentDesignationNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnvironmentDesignationNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEnvironmentDesignationNote() {
        if (environmentDesignationNote == null) {
            environmentDesignationNote = new ArrayList<String>();
        }
        return this.environmentDesignationNote;
    }

    /**
     * Gets the value of the environmentDesignationExtension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the environmentDesignationExtension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnvironmentDesignationExtension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEnvironmentDesignationExtension() {
        if (environmentDesignationExtension == null) {
            environmentDesignationExtension = new ArrayList<String>();
        }
        return this.environmentDesignationExtension;
    }

}
