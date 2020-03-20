//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.02.05 um 05:02:22 PM CET 
//


package exptml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für containerType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="containerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:exptml:schema:draft:0.5}container"/>
 *         &lt;element ref="{urn:exptml:schema:draft:0.5}material"/>
 *         &lt;element ref="{urn:exptml:schema:draft:0.5}grade" minOccurs="0"/>
 *         &lt;element ref="{urn:exptml:schema:draft:0.5}condition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "containerType", propOrder = {
    "container",
    "material",
    "grade",
    "condition"
})
public class ContainerType {

    @XmlElement(required = true)
    protected SmallTextType container;
    @XmlElement(required = true)
    protected SmallTextType material;
    protected SmallTextType grade;
    protected List<ConditionType> condition;

    /**
     * Ruft den Wert der container-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SmallTextType }
     *     
     */
    public SmallTextType getContainer() {
        return container;
    }

    /**
     * Legt den Wert der container-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SmallTextType }
     *     
     */
    public void setContainer(SmallTextType value) {
        this.container = value;
    }

    /**
     * Ruft den Wert der material-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SmallTextType }
     *     
     */
    public SmallTextType getMaterial() {
        return material;
    }

    /**
     * Legt den Wert der material-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SmallTextType }
     *     
     */
    public void setMaterial(SmallTextType value) {
        this.material = value;
    }

    /**
     * Ruft den Wert der grade-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SmallTextType }
     *     
     */
    public SmallTextType getGrade() {
        return grade;
    }

    /**
     * Legt den Wert der grade-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SmallTextType }
     *     
     */
    public void setGrade(SmallTextType value) {
        this.grade = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the condition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConditionType }
     * 
     * 
     */
    public List<ConditionType> getCondition() {
        if (condition == null) {
            condition = new ArrayList<ConditionType>();
        }
        return this.condition;
    }

}
