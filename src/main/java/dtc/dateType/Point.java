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
 * <p>Java-Klasse für point complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="point">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="pointLongitude" type="{http://datacite.org/schema/kernel-4}longitudeType"/>
 *         &lt;element name="pointLatitude" type="{http://datacite.org/schema/kernel-4}latitudeType"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "point", propOrder = {

})
public class Point {

    protected float pointLongitude;
    protected float pointLatitude;

    /**
     * Ruft den Wert der pointLongitude-Eigenschaft ab.
     * 
     */
    public float getPointLongitude() {
        return pointLongitude;
    }

    /**
     * Legt den Wert der pointLongitude-Eigenschaft fest.
     * 
     */
    public void setPointLongitude(float value) {
        this.pointLongitude = value;
    }

    /**
     * Ruft den Wert der pointLatitude-Eigenschaft ab.
     * 
     */
    public float getPointLatitude() {
        return pointLatitude;
    }

    /**
     * Legt den Wert der pointLatitude-Eigenschaft fest.
     * 
     */
    public void setPointLatitude(float value) {
        this.pointLatitude = value;
    }

}
