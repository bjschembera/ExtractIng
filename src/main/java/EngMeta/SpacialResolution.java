//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.02.05 um 05:02:22 PM CET 
//


package EngMeta;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Spacial resolution of the observation. Can be defined:
 * 		  - either by a reference to a file with the definition of the grid
 * 		  - a specification by the number of Cells and/or Blocks (countCells, countBlocks)
 * 		  - the number of grid-points in x,y and z dimension (countX, countY, countZ) together with distance between theses points and unit (equidistant grid)
 * 		  - a scaling formula
 * 		  - a set of points, defined by x-coordinate, y-coordinate (and z-coordinate) together with the unit
 * 		  
 * 
 * <p>Java-Klasse für spacialResolution complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="spacialResolution">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="file" type="{}fileOrResource" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="countCells" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="countBlocks" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="targetCores" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="countX" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="countY" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="countZ" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="scalingFormula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="point" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="positionX" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="positionY" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="positionZ" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                 &lt;/sequence>
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
@XmlType(name = "spacialResolution", propOrder = {
    "file",
    "countCells",
    "countBlocks",
    "targetCores",
    "countX",
    "countY",
    "countZ",
    "unit",
    "distance",
    "scalingFormula",
    "point"
})
public class SpacialResolution {

    protected List<FileOrResource> file;
    protected BigInteger countCells;
    protected BigInteger countBlocks;
    protected BigInteger targetCores;
    @XmlElement(required = true)
    protected BigInteger countX;
    @XmlElement(required = true)
    protected BigInteger countY;
    @XmlElement(required = true)
    protected BigInteger countZ;
    protected String unit;
    protected BigDecimal distance;
    protected String scalingFormula;
    protected List<SpacialResolution.Point> point;

    /**
     * Gets the value of the file property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the file property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileOrResource }
     * 
     * 
     */
    public List<FileOrResource> getFile() {
        if (file == null) {
            file = new ArrayList<FileOrResource>();
        }
        return this.file;
    }

    /**
     * Ruft den Wert der countCells-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCountCells() {
        return countCells;
    }

    /**
     * Legt den Wert der countCells-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCountCells(BigInteger value) {
        this.countCells = value;
    }

    /**
     * Ruft den Wert der countBlocks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCountBlocks() {
        return countBlocks;
    }

    /**
     * Legt den Wert der countBlocks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCountBlocks(BigInteger value) {
        this.countBlocks = value;
    }

    /**
     * Ruft den Wert der targetCores-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTargetCores() {
        return targetCores;
    }

    /**
     * Legt den Wert der targetCores-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTargetCores(BigInteger value) {
        this.targetCores = value;
    }

    /**
     * Ruft den Wert der countX-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCountX() {
        return countX;
    }

    /**
     * Legt den Wert der countX-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCountX(BigInteger value) {
        this.countX = value;
    }

    /**
     * Ruft den Wert der countY-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCountY() {
        return countY;
    }

    /**
     * Legt den Wert der countY-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCountY(BigInteger value) {
        this.countY = value;
    }

    /**
     * Ruft den Wert der countZ-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCountZ() {
        return countZ;
    }

    /**
     * Legt den Wert der countZ-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCountZ(BigInteger value) {
        this.countZ = value;
    }

    /**
     * Ruft den Wert der unit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Legt den Wert der unit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Ruft den Wert der distance-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDistance() {
        return distance;
    }

    /**
     * Legt den Wert der distance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDistance(BigDecimal value) {
        this.distance = value;
    }

    /**
     * Ruft den Wert der scalingFormula-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScalingFormula() {
        return scalingFormula;
    }

    /**
     * Legt den Wert der scalingFormula-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScalingFormula(String value) {
        this.scalingFormula = value;
    }

    /**
     * Gets the value of the point property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the point property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpacialResolution.Point }
     * 
     * 
     */
    public List<SpacialResolution.Point> getPoint() {
        if (point == null) {
            point = new ArrayList<SpacialResolution.Point>();
        }
        return this.point;
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
     *         &lt;element name="positionX" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="positionY" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="positionZ" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
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
        "positionX",
        "positionY",
        "positionZ"
    })
    public static class Point {

        @XmlElement(required = true)
        protected BigDecimal positionX;
        @XmlElement(required = true)
        protected BigDecimal positionY;
        @XmlElement(required = true)
        protected BigDecimal positionZ;

        /**
         * Ruft den Wert der positionX-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPositionX() {
            return positionX;
        }

        /**
         * Legt den Wert der positionX-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPositionX(BigDecimal value) {
            this.positionX = value;
        }

        /**
         * Ruft den Wert der positionY-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPositionY() {
            return positionY;
        }

        /**
         * Legt den Wert der positionY-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPositionY(BigDecimal value) {
            this.positionY = value;
        }

        /**
         * Ruft den Wert der positionZ-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPositionZ() {
            return positionZ;
        }

        /**
         * Legt den Wert der positionZ-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPositionZ(BigDecimal value) {
            this.positionZ = value;
        }

    }

}
