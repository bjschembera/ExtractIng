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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für personType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="personType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:exptml:schema:draft:0.5}name" maxOccurs="unbounded"/>
 *         &lt;element ref="{urn:exptml:schema:draft:0.5}salutation" minOccurs="0"/>
 *         &lt;element ref="{urn:exptml:schema:draft:0.5}initials" minOccurs="0"/>
 *         &lt;element ref="{urn:exptml:schema:draft:0.5}degree" minOccurs="0"/>
 *         &lt;element ref="{urn:exptml:schema:draft:0.5}employer" minOccurs="0"/>
 *         &lt;element ref="{urn:exptml:schema:draft:0.5}address" minOccurs="0"/>
 *         &lt;element ref="{urn:exptml:schema:draft:0.5}position" minOccurs="0"/>
 *         &lt;element ref="{urn:exptml:schema:draft:0.5}phone" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:exptml:schema:draft:0.5}email" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "personType", propOrder = {
    "name",
    "salutation",
    "initials",
    "degree",
    "employer",
    "address",
    "position",
    "phone",
    "email"
})
public class PersonType {

    @XmlElement(required = true)
    protected List<SmallTextType> name;
    @XmlElement(nillable = true)
    @XmlSchemaType(name = "string")
    protected SalutationType salutation;
    protected SmallTextType initials;
    protected SmallTextType degree;
    protected EmployerType employer;
    protected MediumTextType address;
    protected SmallTextType position;
    protected List<PhoneType> phone;
    protected List<EmailType> email;

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SmallTextType }
     * 
     * 
     */
    public List<SmallTextType> getName() {
        if (name == null) {
            name = new ArrayList<SmallTextType>();
        }
        return this.name;
    }

    /**
     * Ruft den Wert der salutation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SalutationType }
     *     
     */
    public SalutationType getSalutation() {
        return salutation;
    }

    /**
     * Legt den Wert der salutation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SalutationType }
     *     
     */
    public void setSalutation(SalutationType value) {
        this.salutation = value;
    }

    /**
     * Ruft den Wert der initials-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SmallTextType }
     *     
     */
    public SmallTextType getInitials() {
        return initials;
    }

    /**
     * Legt den Wert der initials-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SmallTextType }
     *     
     */
    public void setInitials(SmallTextType value) {
        this.initials = value;
    }

    /**
     * Ruft den Wert der degree-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SmallTextType }
     *     
     */
    public SmallTextType getDegree() {
        return degree;
    }

    /**
     * Legt den Wert der degree-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SmallTextType }
     *     
     */
    public void setDegree(SmallTextType value) {
        this.degree = value;
    }

    /**
     * Ruft den Wert der employer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link EmployerType }
     *     
     */
    public EmployerType getEmployer() {
        return employer;
    }

    /**
     * Legt den Wert der employer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployerType }
     *     
     */
    public void setEmployer(EmployerType value) {
        this.employer = value;
    }

    /**
     * Ruft den Wert der address-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MediumTextType }
     *     
     */
    public MediumTextType getAddress() {
        return address;
    }

    /**
     * Legt den Wert der address-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MediumTextType }
     *     
     */
    public void setAddress(MediumTextType value) {
        this.address = value;
    }

    /**
     * Ruft den Wert der position-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SmallTextType }
     *     
     */
    public SmallTextType getPosition() {
        return position;
    }

    /**
     * Legt den Wert der position-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SmallTextType }
     *     
     */
    public void setPosition(SmallTextType value) {
        this.position = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoneType }
     * 
     * 
     */
    public List<PhoneType> getPhone() {
        if (phone == null) {
            phone = new ArrayList<PhoneType>();
        }
        return this.phone;
    }

    /**
     * Gets the value of the email property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the email property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailType }
     * 
     * 
     */
    public List<EmailType> getEmail() {
        if (email == null) {
            email = new ArrayList<EmailType>();
        }
        return this.email;
    }

}
