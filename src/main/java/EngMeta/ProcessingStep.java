//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.02.05 um 05:02:22 PM CET 
//


package EngMeta;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import exptml.InstrumentType;


/**
 * Specification of one processingStep in the data life cycle of the data with actor (pseudonymized), date, used method, software and hardware, input and output (files).
 * 
 * <p>Java-Klasse für processingStep complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="processingStep">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="generation"/>
 *               &lt;enumeration value="postprocessing"/>
 *               &lt;enumeration value="analysis"/>
 *               &lt;enumeration value="other"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="actor" type="{}personOrOrganization" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="method" type="{}method" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="errorMethod" type="{}method" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="input" type="{}fileOrResource" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tool" type="{}software" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="executionCommand" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="instrument" type="{urn:exptml:schema:draft:0.5}instrumentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="environment" type="{}environment" minOccurs="0"/>
 *         &lt;element name="system" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
 *         &lt;element name="output" type="{}fileOrResource" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="order" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "processingStep", propOrder = {
    "type",
    "actor",
    "date",
    "method",
    "errorMethod",
    "input",
    "tool",
    "executionCommand",
    "instrument",
    "environment",
    "system",
    "output"
})
public class ProcessingStep {

    @XmlElement(required = true)
    protected String type;
    protected List<PersonOrOrganization> actor;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    protected List<Method> method;
    protected List<Method> errorMethod;
    protected List<FileOrResource> input;
    protected List<Software> tool;
    protected List<String> executionCommand;
    protected List<InstrumentType> instrument;
    protected Environment environment;
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object system;
    protected List<FileOrResource> output;
    @XmlAttribute(name = "order")
    protected BigInteger order;

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the actor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonOrOrganization }
     * 
     * 
     */
    public List<PersonOrOrganization> getActor() {
        if (actor == null) {
            actor = new ArrayList<PersonOrOrganization>();
        }
        return this.actor;
    }

    /**
     * Ruft den Wert der date-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Legt den Wert der date-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the method property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the method property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Method }
     * 
     * 
     */
    public List<Method> getMethod() {
        if (method == null) {
            method = new ArrayList<Method>();
        }
        return this.method;
    }

    /**
     * Gets the value of the errorMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errorMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrorMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Method }
     * 
     * 
     */
    public List<Method> getErrorMethod() {
        if (errorMethod == null) {
            errorMethod = new ArrayList<Method>();
        }
        return this.errorMethod;
    }

    /**
     * Gets the value of the input property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the input property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileOrResource }
     * 
     * 
     */
    public List<FileOrResource> getInput() {
        if (input == null) {
            input = new ArrayList<FileOrResource>();
        }
        return this.input;
    }

    /**
     * Gets the value of the tool property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tool property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTool().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Software }
     * 
     * 
     */
    public List<Software> getTool() {
        if (tool == null) {
            tool = new ArrayList<Software>();
        }
        return this.tool;
    }

    /**
     * Gets the value of the executionCommand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the executionCommand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExecutionCommand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExecutionCommand() {
        if (executionCommand == null) {
            executionCommand = new ArrayList<String>();
        }
        return this.executionCommand;
    }

    /**
     * Gets the value of the instrument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instrument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstrumentType }
     * 
     * 
     */
    public List<InstrumentType> getInstrument() {
        if (instrument == null) {
            instrument = new ArrayList<InstrumentType>();
        }
        return this.instrument;
    }

    /**
     * Ruft den Wert der environment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Environment }
     *     
     */
    public Environment getEnvironment() {
        return environment;
    }

    /**
     * Legt den Wert der environment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Environment }
     *     
     */
    public void setEnvironment(Environment value) {
        this.environment = value;
    }

    /**
     * Ruft den Wert der system-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSystem() {
        return system;
    }

    /**
     * Legt den Wert der system-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSystem(Object value) {
        this.system = value;
    }

    /**
     * Gets the value of the output property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the output property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutput().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FileOrResource }
     * 
     * 
     */
    public List<FileOrResource> getOutput() {
        if (output == null) {
            output = new ArrayList<FileOrResource>();
        }
        return this.output;
    }

    /**
     * Ruft den Wert der order-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOrder() {
        return order;
    }

    /**
     * Legt den Wert der order-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOrder(BigInteger value) {
        this.order = value;
    }

}
