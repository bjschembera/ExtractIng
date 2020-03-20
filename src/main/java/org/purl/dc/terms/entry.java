//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.02.05 um 05:13:43 PM CET 
//


package org.purl.dc.terms;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.purl.dc.elements._1.SimpleLiteral;


/**
 * 
 *     		This is included as a convenience for schema authors who need to define a root
 *     		or container element for all of the DC elements and element refinements.
 *     	
 * 
 * <p>Java-Klasse für elementOrRefinementContainer complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="elementOrRefinementContainer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;group ref="{http://purl.org/dc/terms/}elementsAndRefinementsGroup"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entry", propOrder = {
    "any"
})




@XmlRootElement

public class entry {

    @XmlElementRef(name = "any", namespace = "http://purl.org/dc/elements/1.1/", type = JAXBElement.class, required = false)
    protected List<JAXBElement<SimpleLiteral>> any;

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * {@link JAXBElement }{@code <}{@link SimpleLiteral }{@code >}
     * 
     * 
     */
    public List<JAXBElement<SimpleLiteral>> getAny() {
        if (any == null) {
            any = new ArrayList<JAXBElement<SimpleLiteral>>();
        }
        return this.any;
    }

}
