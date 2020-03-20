//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.02.05 um 05:02:22 PM CET 
//


package exptml;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für valueType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="valueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:exptml:schema:draft:0.5}mantissa"/>
 *         &lt;element ref="{urn:exptml:schema:draft:0.5}exponent"/>
 *         &lt;element ref="{urn:exptml:schema:draft:0.5}unit" minOccurs="0"/>
 *         &lt;element ref="{urn:exptml:schema:draft:0.5}tolerance" minOccurs="0"/>
 *         &lt;element ref="{urn:exptml:schema:draft:0.5}error" minOccurs="0"/>
 *         &lt;element ref="{urn:exptml:schema:draft:0.5}sigfigs" minOccurs="0"/>
 *         &lt;element ref="{urn:exptml:schema:draft:0.5}reference" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "valueType", propOrder = {
    "mantissa",
    "exponent",
    "unit",
    "tolerance",
    "error",
    "sigfigs",
    "reference"
})
public class ValueType {

    @XmlElement(required = true, nillable = true)
    protected BigDecimal mantissa;
    @XmlElement(required = true, nillable = true)
    protected BigInteger exponent;
    @XmlElement(nillable = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object unit;
    @XmlElement(nillable = true)
    protected BigDecimal tolerance;
    @XmlElement(nillable = true)
    protected BigDecimal error;
    @XmlElement(nillable = true)
    protected BigInteger sigfigs;
    protected UriType reference;
    @XmlAttribute(name = "name")
    @XmlSchemaType(name = "anySimpleType")
    protected String name;
    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "anySimpleType")
    protected String id;

    /**
     * Ruft den Wert der mantissa-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMantissa() {
        return mantissa;
    }

    /**
     * Legt den Wert der mantissa-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMantissa(BigDecimal value) {
        this.mantissa = value;
    }

    /**
     * Ruft den Wert der exponent-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExponent() {
        return exponent;
    }

    /**
     * Legt den Wert der exponent-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExponent(BigInteger value) {
        this.exponent = value;
    }

    /**
     * Ruft den Wert der unit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getUnit() {
        return unit;
    }

    /**
     * Legt den Wert der unit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setUnit(Object value) {
        this.unit = value;
    }

    /**
     * Ruft den Wert der tolerance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTolerance() {
        return tolerance;
    }

    /**
     * Legt den Wert der tolerance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTolerance(BigDecimal value) {
        this.tolerance = value;
    }

    /**
     * Ruft den Wert der error-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getError() {
        return error;
    }

    /**
     * Legt den Wert der error-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setError(BigDecimal value) {
        this.error = value;
    }

    /**
     * Ruft den Wert der sigfigs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSigfigs() {
        return sigfigs;
    }

    /**
     * Legt den Wert der sigfigs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSigfigs(BigInteger value) {
        this.sigfigs = value;
    }

    /**
     * Ruft den Wert der reference-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UriType }
     *     
     */
    public UriType getReference() {
        return reference;
    }

    /**
     * Legt den Wert der reference-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UriType }
     *     
     */
    public void setReference(UriType value) {
        this.reference = value;
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

}
