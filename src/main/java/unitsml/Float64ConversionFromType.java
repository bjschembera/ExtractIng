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
 * Type for the element for providing factors for a conversion equation from another unit; y = d + ((b / c) (x + a))
 * 
 * <p>Java-Klasse für Float64ConversionFromType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Float64ConversionFromType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}ConversionNote" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}initialUnit"/>
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}id use="required""/>
 *       &lt;attribute name="initialAddend" type="{http://www.w3.org/2001/XMLSchema}double" default="0" />
 *       &lt;attribute name="initialAddendDecimalPlace" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="multiplicand" type="{http://www.w3.org/2001/XMLSchema}double" default="1" />
 *       &lt;attribute name="multiplicandDigits" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *       &lt;attribute name="divisor" type="{http://www.w3.org/2001/XMLSchema}double" default="1" />
 *       &lt;attribute name="divisorDigits" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *       &lt;attribute name="finalAddend" type="{http://www.w3.org/2001/XMLSchema}double" default="0" />
 *       &lt;attribute name="finalAddendDecimalPlace" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="exact" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Float64ConversionFromType", propOrder = {
    "conversionNote"
})
public class Float64ConversionFromType {

    @XmlElement(name = "ConversionNote")
    protected List<NoteType> conversionNote;
    @XmlAttribute(name = "id", namespace = "http://www.w3.org/XML/1998/namespace", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "initialAddend")
    protected Double initialAddend;
    @XmlAttribute(name = "initialAddendDecimalPlace")
    protected Byte initialAddendDecimalPlace;
    @XmlAttribute(name = "multiplicand")
    protected Double multiplicand;
    @XmlAttribute(name = "multiplicandDigits")
    @XmlSchemaType(name = "unsignedByte")
    protected Short multiplicandDigits;
    @XmlAttribute(name = "divisor")
    protected Double divisor;
    @XmlAttribute(name = "divisorDigits")
    @XmlSchemaType(name = "unsignedByte")
    protected Short divisorDigits;
    @XmlAttribute(name = "finalAddend")
    protected Double finalAddend;
    @XmlAttribute(name = "finalAddendDecimalPlace")
    protected Byte finalAddendDecimalPlace;
    @XmlAttribute(name = "exact")
    protected Boolean exact;
    @XmlAttribute(name = "initialUnit", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String initialUnit;

    /**
     * Gets the value of the conversionNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conversionNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConversionNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NoteType }
     * 
     * 
     */
    public List<NoteType> getConversionNote() {
        if (conversionNote == null) {
            conversionNote = new ArrayList<NoteType>();
        }
        return this.conversionNote;
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
     * Ruft den Wert der initialAddend-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getInitialAddend() {
        if (initialAddend == null) {
            return  0.0D;
        } else {
            return initialAddend;
        }
    }

    /**
     * Legt den Wert der initialAddend-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInitialAddend(Double value) {
        this.initialAddend = value;
    }

    /**
     * Ruft den Wert der initialAddendDecimalPlace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getInitialAddendDecimalPlace() {
        return initialAddendDecimalPlace;
    }

    /**
     * Legt den Wert der initialAddendDecimalPlace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setInitialAddendDecimalPlace(Byte value) {
        this.initialAddendDecimalPlace = value;
    }

    /**
     * Ruft den Wert der multiplicand-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getMultiplicand() {
        if (multiplicand == null) {
            return  1.0D;
        } else {
            return multiplicand;
        }
    }

    /**
     * Legt den Wert der multiplicand-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMultiplicand(Double value) {
        this.multiplicand = value;
    }

    /**
     * Ruft den Wert der multiplicandDigits-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getMultiplicandDigits() {
        return multiplicandDigits;
    }

    /**
     * Legt den Wert der multiplicandDigits-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setMultiplicandDigits(Short value) {
        this.multiplicandDigits = value;
    }

    /**
     * Ruft den Wert der divisor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getDivisor() {
        if (divisor == null) {
            return  1.0D;
        } else {
            return divisor;
        }
    }

    /**
     * Legt den Wert der divisor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDivisor(Double value) {
        this.divisor = value;
    }

    /**
     * Ruft den Wert der divisorDigits-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDivisorDigits() {
        return divisorDigits;
    }

    /**
     * Legt den Wert der divisorDigits-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDivisorDigits(Short value) {
        this.divisorDigits = value;
    }

    /**
     * Ruft den Wert der finalAddend-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getFinalAddend() {
        if (finalAddend == null) {
            return  0.0D;
        } else {
            return finalAddend;
        }
    }

    /**
     * Legt den Wert der finalAddend-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFinalAddend(Double value) {
        this.finalAddend = value;
    }

    /**
     * Ruft den Wert der finalAddendDecimalPlace-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getFinalAddendDecimalPlace() {
        return finalAddendDecimalPlace;
    }

    /**
     * Legt den Wert der finalAddendDecimalPlace-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setFinalAddendDecimalPlace(Byte value) {
        this.finalAddendDecimalPlace = value;
    }

    /**
     * Ruft den Wert der exact-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isExact() {
        if (exact == null) {
            return false;
        } else {
            return exact;
        }
    }

    /**
     * Legt den Wert der exact-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExact(Boolean value) {
        this.exact = value;
    }

    /**
     * Ruft den Wert der initialUnit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialUnit() {
        return initialUnit;
    }

    /**
     * Legt den Wert der initialUnit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialUnit(String value) {
        this.initialUnit = value;
    }

}
