//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.02.05 um 05:02:22 PM CET 
//


package premis;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für creatingApplicationComplexType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="creatingApplicationComplexType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;sequence>
 *           &lt;element ref="{http://www.loc.gov/premis/v3}creatingApplicationName"/>
 *           &lt;element ref="{http://www.loc.gov/premis/v3}creatingApplicationVersion" minOccurs="0"/>
 *           &lt;element ref="{http://www.loc.gov/premis/v3}dateCreatedByApplication" minOccurs="0"/>
 *           &lt;element ref="{http://www.loc.gov/premis/v3}creatingApplicationExtension" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element ref="{http://www.loc.gov/premis/v3}creatingApplicationVersion"/>
 *           &lt;element ref="{http://www.loc.gov/premis/v3}dateCreatedByApplication" minOccurs="0"/>
 *           &lt;element ref="{http://www.loc.gov/premis/v3}creatingApplicationExtension" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element ref="{http://www.loc.gov/premis/v3}dateCreatedByApplication"/>
 *           &lt;element ref="{http://www.loc.gov/premis/v3}creatingApplicationExtension" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;element ref="{http://www.loc.gov/premis/v3}creatingApplicationExtension" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "creatingApplicationComplexType", propOrder = {
    "content"
})
public class CreatingApplicationComplexType {

    @XmlElementRefs({
        @XmlElementRef(name = "creatingApplicationName", namespace = "http://www.loc.gov/premis/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dateCreatedByApplication", namespace = "http://www.loc.gov/premis/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "creatingApplicationVersion", namespace = "http://www.loc.gov/premis/v3", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "creatingApplicationExtension", namespace = "http://www.loc.gov/premis/v3", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Ruft das restliche Contentmodell ab. 
     * 
     * <p>
     * Sie rufen diese "catch-all"-Eigenschaft aus folgendem Grund ab: 
     * Der Feldname "CreatingApplicationVersion" wird von zwei verschiedenen Teilen eines Schemas verwendet. Siehe: 
     * Zeile 373 von file:/home/hpcbsche/git/harvester/import/premis.xsd
     * Zeile 367 von file:/home/hpcbsche/git/harvester/import/premis.xsd
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
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link ExtensionComplexType }{@code >}
     * {@link JAXBElement }{@code <}{@link StringPlusAuthority }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

}
