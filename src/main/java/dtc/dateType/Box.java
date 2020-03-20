//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.02.05 um 05:02:22 PM CET 
//


package dtc.dateType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für box complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="box">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="westBoundLongitude" type="{http://datacite.org/schema/kernel-4}longitudeType"/>
 *         &lt;element name="eastBoundLongitude" type="{http://datacite.org/schema/kernel-4}longitudeType"/>
 *         &lt;element name="southBoundLatitude" type="{http://datacite.org/schema/kernel-4}latitudeType"/>
 *         &lt;element name="northBoundLatitude" type="{http://datacite.org/schema/kernel-4}latitudeType"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "box", propOrder = {

})
public class Box {

    protected float westBoundLongitude;
    protected float eastBoundLongitude;
    protected float southBoundLatitude;
    protected float northBoundLatitude;

    /**
     * Ruft den Wert der westBoundLongitude-Eigenschaft ab.
     * 
     */
    public float getWestBoundLongitude() {
        return westBoundLongitude;
    }

    /**
     * Legt den Wert der westBoundLongitude-Eigenschaft fest.
     * 
     */
    public void setWestBoundLongitude(float value) {
        this.westBoundLongitude = value;
    }

    /**
     * Ruft den Wert der eastBoundLongitude-Eigenschaft ab.
     * 
     */
    public float getEastBoundLongitude() {
        return eastBoundLongitude;
    }

    /**
     * Legt den Wert der eastBoundLongitude-Eigenschaft fest.
     * 
     */
    public void setEastBoundLongitude(float value) {
        this.eastBoundLongitude = value;
    }

    /**
     * Ruft den Wert der southBoundLatitude-Eigenschaft ab.
     * 
     */
    public float getSouthBoundLatitude() {
        return southBoundLatitude;
    }

    /**
     * Legt den Wert der southBoundLatitude-Eigenschaft fest.
     * 
     */
    public void setSouthBoundLatitude(float value) {
        this.southBoundLatitude = value;
    }

    /**
     * Ruft den Wert der northBoundLatitude-Eigenschaft ab.
     * 
     */
    public float getNorthBoundLatitude() {
        return northBoundLatitude;
    }

    /**
     * Legt den Wert der northBoundLatitude-Eigenschaft fest.
     * 
     */
    public void setNorthBoundLatitude(float value) {
        this.northBoundLatitude = value;
    }

}
