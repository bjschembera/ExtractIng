//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.02.05 um 05:02:22 PM CET 
//


package exptml;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the exptml package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Description_QNAME = new QName("urn:exptml:schema:draft:0.5", "description");
    private final static QName _Instrument_QNAME = new QName("urn:exptml:schema:draft:0.5", "instrument");
    private final static QName _Title_QNAME = new QName("urn:exptml:schema:draft:0.5", "title");
    private final static QName _Serialnum_QNAME = new QName("urn:exptml:schema:draft:0.5", "serialnum");
    private final static QName _exptml_mass_QNAME = new QName("urn:exptml:schema:draft:0.5", "mass");
    private final static QName _Company_QNAME = new QName("urn:exptml:schema:draft:0.5", "company");
    private final static QName _Location_QNAME = new QName("urn:exptml:schema:draft:0.5", "location");
    private final static QName _Material_QNAME = new QName("urn:exptml:schema:draft:0.5", "material");
    private final static QName _Source_QNAME = new QName("urn:exptml:schema:draft:0.5", "source");
    private final static QName _Symbol_QNAME = new QName("urn:exptml:schema:draft:0.5", "symbol");
    private final static QName _Filetype_QNAME = new QName("urn:exptml:schema:draft:0.5", "filetype");
    private final static QName _Notes_QNAME = new QName("urn:exptml:schema:draft:0.5", "notes");
    private final static QName _Contact_QNAME = new QName("urn:exptml:schema:draft:0.5", "contact");
    private final static QName _Degree_QNAME = new QName("urn:exptml:schema:draft:0.5", "degree");
    private final static QName _Name_QNAME = new QName("urn:exptml:schema:draft:0.5", "name");
    private final static QName _Salutation_QNAME = new QName("urn:exptml:schema:draft:0.5", "salutation");
    private final static QName _Volume_QNAME = new QName("urn:exptml:schema:draft:0.5", "volume");
    private final static QName _Role_QNAME = new QName("urn:exptml:schema:draft:0.5", "role");
    private final static QName _Latitude_QNAME = new QName("urn:exptml:schema:draft:0.5", "latitude");
    private final static QName _AtomicNumber_QNAME = new QName("urn:exptml:schema:draft:0.5", "atomicNumber");
    private final static QName _Email_QNAME = new QName("urn:exptml:schema:draft:0.5", "email");
    private final static QName _Storedin_QNAME = new QName("urn:exptml:schema:draft:0.5", "storedin");
    private final static QName _Xpath_QNAME = new QName("urn:exptml:schema:draft:0.5", "xpath");
    private final static QName _Address_QNAME = new QName("urn:exptml:schema:draft:0.5", "address");
    private final static QName _Employername_QNAME = new QName("urn:exptml:schema:draft:0.5", "employername");
    private final static QName _Component_QNAME = new QName("urn:exptml:schema:draft:0.5", "component");
    private final static QName _Lotnum_QNAME = new QName("urn:exptml:schema:draft:0.5", "lotnum");
    private final static QName _Partnum_QNAME = new QName("urn:exptml:schema:draft:0.5", "partnum");
    private final static QName _State_QNAME = new QName("urn:exptml:schema:draft:0.5", "state");
    private final static QName _Grade_QNAME = new QName("urn:exptml:schema:draft:0.5", "grade");
    private final static QName _Mantissa_QNAME = new QName("urn:exptml:schema:draft:0.5", "mantissa");
    private final static QName _Units_QNAME = new QName("urn:exptml:schema:draft:0.5", "units");
    private final static QName _Error_QNAME = new QName("urn:exptml:schema:draft:0.5", "error");
    private final static QName _Altitude_QNAME = new QName("urn:exptml:schema:draft:0.5", "altitude");
    private final static QName _Part_QNAME = new QName("urn:exptml:schema:draft:0.5", "part");
    private final static QName _Value_QNAME = new QName("urn:exptml:schema:draft:0.5", "value");
    private final static QName _Parameter_QNAME = new QName("urn:exptml:schema:draft:0.5", "parameter");
    private final static QName _Concentration_QNAME = new QName("urn:exptml:schema:draft:0.5", "concentration");
    private final static QName _Amount_QNAME = new QName("urn:exptml:schema:draft:0.5", "amount");
    private final static QName _Tagset_QNAME = new QName("urn:exptml:schema:draft:0.5", "tagset");
    private final static QName _Catnum_QNAME = new QName("urn:exptml:schema:draft:0.5", "catnum");
    private final static QName _Date_QNAME = new QName("urn:exptml:schema:draft:0.5", "date");
    private final static QName _Employer_QNAME = new QName("urn:exptml:schema:draft:0.5", "employer");
    private final static QName _Tag_QNAME = new QName("urn:exptml:schema:draft:0.5", "tag");
    private final static QName _Tolerance_QNAME = new QName("urn:exptml:schema:draft:0.5", "tolerance");
    private final static QName _Longitude_QNAME = new QName("urn:exptml:schema:draft:0.5", "longitude");
    private final static QName _Exponent_QNAME = new QName("urn:exptml:schema:draft:0.5", "exponent");
    private final static QName _Reference_QNAME = new QName("urn:exptml:schema:draft:0.5", "reference");
    private final static QName _exptml_format_QNAME = new QName("urn:exptml:schema:draft:0.5", "format");
    private final static QName _History_QNAME = new QName("urn:exptml:schema:draft:0.5", "history");
    private final static QName _Initials_QNAME = new QName("urn:exptml:schema:draft:0.5", "initials");
    private final static QName _Position_QNAME = new QName("urn:exptml:schema:draft:0.5", "position");
    private final static QName _Condition_QNAME = new QName("urn:exptml:schema:draft:0.5", "condition");
    private final static QName _exptml_unit_QNAME = new QName("urn:exptml:schema:draft:0.5", "unit");
    private final static QName _Employertype_QNAME = new QName("urn:exptml:schema:draft:0.5", "employertype");
    private final static QName _Dilution_QNAME = new QName("urn:exptml:schema:draft:0.5", "dilution");
    private final static QName _Person_QNAME = new QName("urn:exptml:schema:draft:0.5", "person");
    private final static QName _exptml_event_QNAME = new QName("urn:exptml:schema:draft:0.5", "event");
    private final static QName _File_QNAME = new QName("urn:exptml:schema:draft:0.5", "file");
    private final static QName _Datatype_QNAME = new QName("urn:exptml:schema:draft:0.5", "datatype");
    private final static QName _Url_QNAME = new QName("urn:exptml:schema:draft:0.5", "url");
    private final static QName _Type_QNAME = new QName("urn:exptml:schema:draft:0.5", "type");
    private final static QName _Container_QNAME = new QName("urn:exptml:schema:draft:0.5", "container");
    private final static QName _Software_QNAME = new QName("urn:exptml:schema:draft:0.5", "software");
    private final static QName _Preparedin_QNAME = new QName("urn:exptml:schema:draft:0.5", "preparedin");
    private final static QName _Property_QNAME = new QName("urn:exptml:schema:draft:0.5", "property");
    private final static QName _Action_QNAME = new QName("urn:exptml:schema:draft:0.5", "action");
    private final static QName _Text_QNAME = new QName("urn:exptml:schema:draft:0.5", "text");
    private final static QName _Relationships_QNAME = new QName("urn:exptml:schema:draft:0.5", "relationships");
    private final static QName _Sigfigs_QNAME = new QName("urn:exptml:schema:draft:0.5", "sigfigs");
    private final static QName _Phone_QNAME = new QName("urn:exptml:schema:draft:0.5", "phone");
    private final static QName _Companyname_QNAME = new QName("urn:exptml:schema:draft:0.5", "companyname");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: exptml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SmallTextType }
     * 
     */
    public SmallTextType createSmallTextType() {
        return new SmallTextType();
    }

    /**
     * Create an instance of {@link ExptmlDateType }
     * 
     */
    public ExptmlDateType createExptmlDateType() {
        return new ExptmlDateType();
    }

    /**
     * Create an instance of {@link LargeTextType }
     * 
     */
    public LargeTextType createLargeTextType() {
        return new LargeTextType();
    }

    /**
     * Create an instance of {@link SoftwareType }
     * 
     */
    public SoftwareType createSoftwareType() {
        return new SoftwareType();
    }

    /**
     * Create an instance of {@link ContainerType }
     * 
     */
    public ContainerType createContainerType() {
        return new ContainerType();
    }

    /**
     * Create an instance of {@link VendorIdType }
     * 
     */
    public VendorIdType createVendorIdType() {
        return new VendorIdType();
    }

    /**
     * Create an instance of {@link SourceType }
     * 
     */
    public SourceType createSourceType() {
        return new SourceType();
    }

    /**
     * Create an instance of {@link UriType }
     * 
     */
    public UriType createUriType() {
        return new UriType();
    }

    /**
     * Create an instance of {@link AnyXmlType }
     * 
     */
    public AnyXmlType createAnyXmlType() {
        return new AnyXmlType();
    }

    /**
     * Create an instance of {@link PropertyType }
     * 
     */
    public PropertyType createPropertyType() {
        return new PropertyType();
    }

    /**
     * Create an instance of {@link EmployerType }
     * 
     */
    public EmployerType createEmployerType() {
        return new EmployerType();
    }

    /**
     * Create an instance of {@link ExptmlHistoryType }
     * 
     */
    public ExptmlHistoryType createExptmlHistoryType() {
        return new ExptmlHistoryType();
    }

    /**
     * Create an instance of {@link ValueType }
     * 
     */
    public ValueType createValueType() {
        return new ValueType();
    }

    /**
     * Create an instance of {@link ConditionType }
     * 
     */
    public ConditionType createConditionType() {
        return new ConditionType();
    }

    /**
     * Create an instance of {@link PhoneType }
     * 
     */
    public PhoneType createPhoneType() {
        return new PhoneType();
    }

    /**
     * Create an instance of {@link PersonType }
     * 
     */
    public PersonType createPersonType() {
        return new PersonType();
    }

    /**
     * Create an instance of {@link InstrumentType }
     * 
     */
    public InstrumentType createInstrumentType() {
        return new InstrumentType();
    }

    /**
     * Create an instance of {@link UnitsType }
     * 
     */
    public UnitsType createUnitsType() {
        return new UnitsType();
    }

    /**
     * Create an instance of {@link CompanyType }
     * 
     */
    public CompanyType createCompanyType() {
        return new CompanyType();
    }

    /**
     * Create an instance of {@link EventType }
     * 
     */
    public EventType createEventType() {
        return new EventType();
    }

    /**
     * Create an instance of {@link EmailType }
     * 
     */
    public EmailType createEmailType() {
        return new EmailType();
    }

    /**
     * Create an instance of {@link MediumTextType }
     * 
     */
    public MediumTextType createMediumTextType() {
        return new MediumTextType();
    }

    /**
     * Create an instance of {@link TagsetType }
     * 
     */
    public TagsetType createTagsetType() {
        return new TagsetType();
    }

    /**
     * Create an instance of {@link ComponentType }
     * 
     */
    public ComponentType createComponentType() {
        return new ComponentType();
    }

    /**
     * Create an instance of {@link ElementGroupType }
     * 
     */
    public ElementGroupType createElementGroupType() {
        return new ElementGroupType();
    }

    /**
     * Create an instance of {@link TextType }
     * 
     */
    public TextType createTextType() {
        return new TextType();
    }

    /**
     * Create an instance of {@link GiantTextType }
     * 
     */
    public GiantTextType createGiantTextType() {
        return new GiantTextType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LargeTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "description")
    public JAXBElement<LargeTextType> createDescription(LargeTextType value) {
        return new JAXBElement<LargeTextType>(_Description_QNAME, LargeTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InstrumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "instrument")
    public JAXBElement<InstrumentType> createInstrument(InstrumentType value) {
        return new JAXBElement<InstrumentType>(_Instrument_QNAME, InstrumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmallTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "title")
    public JAXBElement<SmallTextType> createTitle(SmallTextType value) {
        return new JAXBElement<SmallTextType>(_Title_QNAME, SmallTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VendorIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "serialnum")
    public JAXBElement<VendorIdType> createSerialnum(VendorIdType value) {
        return new JAXBElement<VendorIdType>(_Serialnum_QNAME, VendorIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "mass")
    public JAXBElement<ValueType> createexptml_mass(ValueType value) {
        return new JAXBElement<ValueType>(_exptml_mass_QNAME, ValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompanyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "company")
    public JAXBElement<CompanyType> createCompany(CompanyType value) {
        return new JAXBElement<CompanyType>(_Company_QNAME, CompanyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmallTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "location")
    public JAXBElement<SmallTextType> createLocation(SmallTextType value) {
        return new JAXBElement<SmallTextType>(_Location_QNAME, SmallTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmallTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "material")
    public JAXBElement<SmallTextType> createMaterial(SmallTextType value) {
        return new JAXBElement<SmallTextType>(_Material_QNAME, SmallTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SourceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "source")
    public JAXBElement<SourceType> createSource(SourceType value) {
        return new JAXBElement<SourceType>(_Source_QNAME, SourceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmallTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "symbol")
    public JAXBElement<SmallTextType> createSymbol(SmallTextType value) {
        return new JAXBElement<SmallTextType>(_Symbol_QNAME, SmallTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmallTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "filetype")
    public JAXBElement<SmallTextType> createFiletype(SmallTextType value) {
        return new JAXBElement<SmallTextType>(_Filetype_QNAME, SmallTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LargeTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "notes")
    public JAXBElement<LargeTextType> createNotes(LargeTextType value) {
        return new JAXBElement<LargeTextType>(_Notes_QNAME, LargeTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmallTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "contact")
    public JAXBElement<SmallTextType> createContact(SmallTextType value) {
        return new JAXBElement<SmallTextType>(_Contact_QNAME, SmallTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmallTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "degree")
    public JAXBElement<SmallTextType> createDegree(SmallTextType value) {
        return new JAXBElement<SmallTextType>(_Degree_QNAME, SmallTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmallTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "name")
    public JAXBElement<SmallTextType> createName(SmallTextType value) {
        return new JAXBElement<SmallTextType>(_Name_QNAME, SmallTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalutationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "salutation")
    public JAXBElement<SalutationType> createSalutation(SalutationType value) {
        return new JAXBElement<SalutationType>(_Salutation_QNAME, SalutationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "volume")
    public JAXBElement<ValueType> createVolume(ValueType value) {
        return new JAXBElement<ValueType>(_Volume_QNAME, ValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmallTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "role")
    public JAXBElement<SmallTextType> createRole(SmallTextType value) {
        return new JAXBElement<SmallTextType>(_Role_QNAME, SmallTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "latitude")
    public JAXBElement<BigDecimal> createLatitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Latitude_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "atomicNumber")
    public JAXBElement<BigInteger> createAtomicNumber(BigInteger value) {
        return new JAXBElement<BigInteger>(_AtomicNumber_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "email")
    public JAXBElement<EmailType> createEmail(EmailType value) {
        return new JAXBElement<EmailType>(_Email_QNAME, EmailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContainerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "storedin")
    public JAXBElement<ContainerType> createStoredin(ContainerType value) {
        return new JAXBElement<ContainerType>(_Storedin_QNAME, ContainerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmallTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "xpath")
    public JAXBElement<SmallTextType> createXpath(SmallTextType value) {
        return new JAXBElement<SmallTextType>(_Xpath_QNAME, SmallTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediumTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "address")
    public JAXBElement<MediumTextType> createAddress(MediumTextType value) {
        return new JAXBElement<MediumTextType>(_Address_QNAME, MediumTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmallTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "employername")
    public JAXBElement<SmallTextType> createEmployername(SmallTextType value) {
        return new JAXBElement<SmallTextType>(_Employername_QNAME, SmallTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ComponentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "component")
    public JAXBElement<ComponentType> createComponent(ComponentType value) {
        return new JAXBElement<ComponentType>(_Component_QNAME, ComponentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VendorIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "lotnum")
    public JAXBElement<VendorIdType> createLotnum(VendorIdType value) {
        return new JAXBElement<VendorIdType>(_Lotnum_QNAME, VendorIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VendorIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "partnum")
    public JAXBElement<VendorIdType> createPartnum(VendorIdType value) {
        return new JAXBElement<VendorIdType>(_Partnum_QNAME, VendorIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmallTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "state")
    public JAXBElement<SmallTextType> createState(SmallTextType value) {
        return new JAXBElement<SmallTextType>(_State_QNAME, SmallTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmallTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "grade")
    public JAXBElement<SmallTextType> createGrade(SmallTextType value) {
        return new JAXBElement<SmallTextType>(_Grade_QNAME, SmallTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "mantissa")
    public JAXBElement<BigDecimal> createMantissa(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Mantissa_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnitsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "units")
    public JAXBElement<UnitsType> createUnits(UnitsType value) {
        return new JAXBElement<UnitsType>(_Units_QNAME, UnitsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "error")
    public JAXBElement<BigDecimal> createError(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Error_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "altitude")
    public JAXBElement<ValueType> createAltitude(ValueType value) {
        return new JAXBElement<ValueType>(_Altitude_QNAME, ValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "part")
    public JAXBElement<PartType> createPart(PartType value) {
        return new JAXBElement<PartType>(_Part_QNAME, PartType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "value")
    public JAXBElement<ValueType> createValue(ValueType value) {
        return new JAXBElement<ValueType>(_Value_QNAME, ValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmallTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "parameter")
    public JAXBElement<SmallTextType> createParameter(SmallTextType value) {
        return new JAXBElement<SmallTextType>(_Parameter_QNAME, SmallTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "concentration")
    public JAXBElement<ValueType> createConcentration(ValueType value) {
        return new JAXBElement<ValueType>(_Concentration_QNAME, ValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "amount")
    public JAXBElement<ValueType> createAmount(ValueType value) {
        return new JAXBElement<ValueType>(_Amount_QNAME, ValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TagsetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "tagset")
    public JAXBElement<TagsetType> createTagset(TagsetType value) {
        return new JAXBElement<TagsetType>(_Tagset_QNAME, TagsetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VendorIdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "catnum")
    public JAXBElement<VendorIdType> createCatnum(VendorIdType value) {
        return new JAXBElement<VendorIdType>(_Catnum_QNAME, VendorIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExptmlDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "date")
    public JAXBElement<ExptmlDateType> createDate(ExptmlDateType value) {
        return new JAXBElement<ExptmlDateType>(_Date_QNAME, ExptmlDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "employer")
    public JAXBElement<EmployerType> createEmployer(EmployerType value) {
        return new JAXBElement<EmployerType>(_Employer_QNAME, EmployerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmallTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "tag")
    public JAXBElement<SmallTextType> createTag(SmallTextType value) {
        return new JAXBElement<SmallTextType>(_Tag_QNAME, SmallTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "tolerance")
    public JAXBElement<BigDecimal> createTolerance(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Tolerance_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "longitude")
    public JAXBElement<BigDecimal> createLongitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Longitude_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "exponent")
    public JAXBElement<BigInteger> createExponent(BigInteger value) {
        return new JAXBElement<BigInteger>(_Exponent_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UriType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "reference")
    public JAXBElement<UriType> createReference(UriType value) {
        return new JAXBElement<UriType>(_Reference_QNAME, UriType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmallTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "format")
    public JAXBElement<SmallTextType> createexptml_format(SmallTextType value) {
        return new JAXBElement<SmallTextType>(_exptml_format_QNAME, SmallTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExptmlHistoryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "history")
    public JAXBElement<ExptmlHistoryType> createHistory(ExptmlHistoryType value) {
        return new JAXBElement<ExptmlHistoryType>(_History_QNAME, ExptmlHistoryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmallTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "initials")
    public JAXBElement<SmallTextType> createInitials(SmallTextType value) {
        return new JAXBElement<SmallTextType>(_Initials_QNAME, SmallTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmallTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "position")
    public JAXBElement<SmallTextType> createPosition(SmallTextType value) {
        return new JAXBElement<SmallTextType>(_Position_QNAME, SmallTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConditionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "condition")
    public JAXBElement<ConditionType> createCondition(ConditionType value) {
        return new JAXBElement<ConditionType>(_Condition_QNAME, ConditionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "unit")
    @XmlIDREF
    public JAXBElement<Object> createexptml_unit(Object value) {
        return new JAXBElement<Object>(_exptml_unit_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmallTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "employertype")
    public JAXBElement<SmallTextType> createEmployertype(SmallTextType value) {
        return new JAXBElement<SmallTextType>(_Employertype_QNAME, SmallTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "dilution")
    public JAXBElement<ValueType> createDilution(ValueType value) {
        return new JAXBElement<ValueType>(_Dilution_QNAME, ValueType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "person")
    public JAXBElement<PersonType> createPerson(PersonType value) {
        return new JAXBElement<PersonType>(_Person_QNAME, PersonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "event")
    public JAXBElement<EventType> createexptml_event(EventType value) {
        return new JAXBElement<EventType>(_exptml_event_QNAME, EventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UriType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "file")
    public JAXBElement<UriType> createFile(UriType value) {
        return new JAXBElement<UriType>(_File_QNAME, UriType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmallTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "datatype")
    public JAXBElement<SmallTextType> createDatatype(SmallTextType value) {
        return new JAXBElement<SmallTextType>(_Datatype_QNAME, SmallTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UriType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "url")
    public JAXBElement<UriType> createUrl(UriType value) {
        return new JAXBElement<UriType>(_Url_QNAME, UriType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmallTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "type")
    public JAXBElement<SmallTextType> createType(SmallTextType value) {
        return new JAXBElement<SmallTextType>(_Type_QNAME, SmallTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmallTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "container")
    public JAXBElement<SmallTextType> createContainer(SmallTextType value) {
        return new JAXBElement<SmallTextType>(_Container_QNAME, SmallTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoftwareType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "software")
    public JAXBElement<SoftwareType> createSoftware(SoftwareType value) {
        return new JAXBElement<SoftwareType>(_Software_QNAME, SoftwareType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContainerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "preparedin")
    public JAXBElement<ContainerType> createPreparedin(ContainerType value) {
        return new JAXBElement<ContainerType>(_Preparedin_QNAME, ContainerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PropertyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "property")
    public JAXBElement<PropertyType> createProperty(PropertyType value) {
        return new JAXBElement<PropertyType>(_Property_QNAME, PropertyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmallTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "action")
    public JAXBElement<SmallTextType> createAction(SmallTextType value) {
        return new JAXBElement<SmallTextType>(_Action_QNAME, SmallTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LargeTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "text")
    public JAXBElement<LargeTextType> createText(LargeTextType value) {
        return new JAXBElement<LargeTextType>(_Text_QNAME, LargeTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnyXmlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "relationships")
    public JAXBElement<AnyXmlType> createRelationships(AnyXmlType value) {
        return new JAXBElement<AnyXmlType>(_Relationships_QNAME, AnyXmlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "sigfigs")
    public JAXBElement<BigInteger> createSigfigs(BigInteger value) {
        return new JAXBElement<BigInteger>(_Sigfigs_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "phone")
    public JAXBElement<PhoneType> createPhone(PhoneType value) {
        return new JAXBElement<PhoneType>(_Phone_QNAME, PhoneType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmallTextType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:exptml:schema:draft:0.5", name = "companyname")
    public JAXBElement<SmallTextType> createCompanyname(SmallTextType value) {
        return new JAXBElement<SmallTextType>(_Companyname_QNAME, SmallTextType.class, null, value);
    }

}
