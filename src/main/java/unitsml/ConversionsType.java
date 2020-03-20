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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for the container for providing conversion information to other units.
 * 
 * <p>Java-Klasse für ConversionsType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ConversionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}Float64ConversionFrom" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}SpecialConversionFrom" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}WSDLConversionFrom" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversionsType", propOrder = {
    "float64ConversionFrom",
    "specialConversionFrom",
    "wsdlConversionFrom"
})
public class ConversionsType {

    @XmlElement(name = "Float64ConversionFrom")
    protected List<Float64ConversionFromType> float64ConversionFrom;
    @XmlElement(name = "SpecialConversionFrom")
    protected List<SpecialConversionFromType> specialConversionFrom;
    @XmlElement(name = "WSDLConversionFrom")
    protected List<WSDLConversionFromType> wsdlConversionFrom;

    /**
     * Element for providing factors for a conversion equation from another unit; y = d + ((b / c) (x + a)). Note: The related "conversion to" equation is a simple inversion of the above equation; i.e., x = ((c / b) (y - d)) - a.Gets the value of the float64ConversionFrom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the float64ConversionFrom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFloat64ConversionFrom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Float64ConversionFromType }
     * 
     * 
     */
    public List<Float64ConversionFromType> getFloat64ConversionFrom() {
        if (float64ConversionFrom == null) {
            float64ConversionFrom = new ArrayList<Float64ConversionFromType>();
        }
        return this.float64ConversionFrom;
    }

    /**
     * Element for describing a conversion that cannot be described by the linear expression in the element Float64ConversionFrom.Gets the value of the specialConversionFrom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialConversionFrom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialConversionFrom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialConversionFromType }
     * 
     * 
     */
    public List<SpecialConversionFromType> getSpecialConversionFrom() {
        if (specialConversionFrom == null) {
            specialConversionFrom = new ArrayList<SpecialConversionFromType>();
        }
        return this.specialConversionFrom;
    }

    /**
     * Element for providing conversion based on SOAP/WSDL calls to a remote server.Gets the value of the wsdlConversionFrom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsdlConversionFrom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWSDLConversionFrom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSDLConversionFromType }
     * 
     * 
     */
    public List<WSDLConversionFromType> getWSDLConversionFrom() {
        if (wsdlConversionFrom == null) {
            wsdlConversionFrom = new ArrayList<WSDLConversionFromType>();
        }
        return this.wsdlConversionFrom;
    }

}
