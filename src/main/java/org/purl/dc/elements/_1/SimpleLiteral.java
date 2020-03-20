//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.02.05 um 05:13:43 PM CET 
//


package org.purl.dc.elements._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.purl.dc.terms.Box;
import org.purl.dc.terms.DCMIType;
import org.purl.dc.terms.DDC;
import org.purl.dc.terms.IMT;
import org.purl.dc.terms.ISO3166;
import org.purl.dc.terms.ISO6392;
import org.purl.dc.terms.ISO6393;
import org.purl.dc.terms.LCC;
import org.purl.dc.terms.LCSH;
import org.purl.dc.terms.MESH;
import org.purl.dc.terms.Period;
import org.purl.dc.terms.Point;
import org.purl.dc.terms.RFC1766;
import org.purl.dc.terms.RFC3066;
import org.purl.dc.terms.RFC4646;
import org.purl.dc.terms.TGN;
import org.purl.dc.terms.UDC;
import org.purl.dc.terms.URI;
import org.purl.dc.terms.W3CDTF;


/**
 * 
 *             This is the default type for all of the DC elements.
 *             It permits text content only with optional
 *             xml:lang attribute.
 *             Text is allowed because mixed="true", but sub-elements
 *             are disallowed because minOccurs="0" and maxOccurs="0" 
 *             are on the xs:any tag.
 * 
 *     	    This complexType allows for restriction or extension permitting
 *             child elements.
 *     	
 * 
 * <p>Java-Klasse für SimpleLiteral complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SimpleLiteral">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;any processContents='lax' maxOccurs="0" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://www.w3.org/XML/1998/namespace}lang"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleLiteral", propOrder = {
    "content"
})
@XmlSeeAlso({
    DDC.class,
    ISO6392 .class,
    ISO6393 .class,
    MESH.class,
    Period.class,
    RFC4646 .class,
    Box.class,
    Point.class,
    W3CDTF.class,
    RFC1766 .class,
    LCC.class,
    URI.class,
    LCSH.class,
    IMT.class,
    UDC.class,
    DCMIType.class,
    RFC3066 .class,
    ISO3166 .class,
    TGN.class
})
public class SimpleLiteral {

    @XmlMixed
    protected List<String> content;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String lang;

    /**
     * 
     *             This is the default type for all of the DC elements.
     *             It permits text content only with optional
     *             xml:lang attribute.
     *             Text is allowed because mixed="true", but sub-elements
     *             are disallowed because minOccurs="0" and maxOccurs="0" 
     *             are on the xs:any tag.
     * 
     *     	    This complexType allows for restriction or extension permitting
     *             child elements.
     *     	Gets the value of the content property.
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
     * {@link String }
     * 
     * 
     */
    public List<String> getContent() {
        if (content == null) {
            content = new ArrayList<String>();
        }
        return this.content;
    }

    /**
     * Ruft den Wert der lang-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Legt den Wert der lang-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

}
