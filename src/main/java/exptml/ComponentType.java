//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.02.05 um 05:02:22 PM CET 
//


package exptml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für componentType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="componentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:exptml:schema:draft:0.5}name" minOccurs="0"/>
 *         &lt;element ref="{urn:exptml:schema:draft:0.5}role"/>
 *         &lt;element ref="{urn:exptml:schema:draft:0.5}state"/>
 *         &lt;element ref="{urn:exptml:schema:draft:0.5}part" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{urn:exptml:schema:draft:0.5}concentration"/>
 *           &lt;element ref="{urn:exptml:schema:draft:0.5}dilution"/>
 *           &lt;element ref="{urn:exptml:schema:draft:0.5}mass"/>
 *           &lt;element ref="{urn:exptml:schema:draft:0.5}volume"/>
 *         &lt;/choice>
 *         &lt;element ref="{urn:exptml:schema:draft:0.5}concentration" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "componentType", propOrder = {
    "content"
})
public class ComponentType {

    @XmlElementRefs({
        @XmlElementRef(name = "dilution", namespace = "urn:exptml:schema:draft:0.5", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "state", namespace = "urn:exptml:schema:draft:0.5", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "part", namespace = "urn:exptml:schema:draft:0.5", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "volume", namespace = "urn:exptml:schema:draft:0.5", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "name", namespace = "urn:exptml:schema:draft:0.5", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "concentration", namespace = "urn:exptml:schema:draft:0.5", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "role", namespace = "urn:exptml:schema:draft:0.5", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mass", namespace = "urn:exptml:schema:draft:0.5", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;
    @XmlAttribute(name = "id", required = true)
    protected String id;

    /**
     * Ruft das restliche Contentmodell ab. 
     * 
     * <p>
     * Sie rufen diese "catch-all"-Eigenschaft aus folgendem Grund ab: 
     * Der Feldname "Concentration" wird von zwei verschiedenen Teilen eines Schemas verwendet. Siehe: 
     * Zeile 474 von file:/home/hpcbsche/git/harvester/import/exptml_common.xsd
     * Zeile 469 von file:/home/hpcbsche/git/harvester/import/exptml_common.xsd
     * <p>
     * Um diese Eigenschaft zu entfernen, wenden Sie eine Eigenschaftenanpassung für eine
     * der beiden folgenden Deklarationen an, um deren Namen zu ändern: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ValueType }{@code >}
     * {@link JAXBElement }{@code <}{@link SmallTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link PartType }{@code >}
     * {@link JAXBElement }{@code <}{@link ValueType }{@code >}
     * {@link JAXBElement }{@code <}{@link SmallTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link ValueType }{@code >}
     * {@link JAXBElement }{@code <}{@link SmallTextType }{@code >}
     * {@link JAXBElement }{@code <}{@link ValueType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
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
