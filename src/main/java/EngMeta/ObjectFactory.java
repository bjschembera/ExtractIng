//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.02.05 um 05:02:22 PM CET 
//


package EngMeta;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
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

    private final static QName _BoundaryConditionFlowComponent_QNAME = new QName("", "component");
    private final static QName _DatasetDescriptionBr_QNAME = new QName("", "br");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Dataset }
     * 
     */
    public Dataset createDataset() {
        return new Dataset();
    }

    /**
     * Create an instance of {@link BoundaryCondition }
     * 
     */
    public BoundaryCondition createBoundaryCondition() {
        return new BoundaryCondition();
    }

    /**
     * Create an instance of {@link Component }
     * 
     */
    public Component createComponent() {
        return new Component();
    }

    /**
     * Create an instance of {@link Environment }
     * 
     */
    public Environment createEnvironment() {
        return new Environment();
    }

    /**
     * Create an instance of {@link SpacialResolution }
     * 
     */
    public SpacialResolution createSpacialResolution() {
        return new SpacialResolution();
    }

    /**
     * Create an instance of {@link Method }
     * 
     */
    public Method createMethod() {
        return new Method();
    }

    /**
     * Create an instance of {@link Dataset.Context }
     * 
     */
    public Dataset.Context createDatasetContext() {
        return new Dataset.Context();
    }

    /**
     * Create an instance of {@link Dataset.System }
     * 
     */
    public Dataset.System createDatasetSystem() {
        return new Dataset.System();
    }

    /**
     * Create an instance of {@link Dataset.Dates }
     * 
     */
    public Dataset.Dates createDatasetDates() {
        return new Dataset.Dates();
    }

    /**
     * Create an instance of {@link Dataset.Subjects }
     * 
     */
    public Dataset.Subjects createDatasetSubjects() {
        return new Dataset.Subjects();
    }

    /**
     * Create an instance of {@link Dataset.Keywords }
     * 
     */
    public Dataset.Keywords createDatasetKeywords() {
        return new Dataset.Keywords();
    }

    /**
     * Create an instance of {@link Dataset.FundingReference }
     * 
     */
    public Dataset.FundingReference createDatasetFundingReference() {
        return new Dataset.FundingReference();
    }

    /**
     * Create an instance of {@link PersonOrOrganization }
     * 
     */
    public PersonOrOrganization createPersonOrOrganization() {
        return new PersonOrOrganization();
    }

    /**
     * Create an instance of {@link Dataset.Project }
     * 
     */
    public Dataset.Project createDatasetProject() {
        return new Dataset.Project();
    }

    /**
     * Create an instance of {@link Dataset.Title }
     * 
     */
    public Dataset.Title createDatasetTitle() {
        return new Dataset.Title();
    }

    /**
     * Create an instance of {@link Dataset.Description }
     * 
     */
    public Dataset.Description createDatasetDescription() {
        return new Dataset.Description();
    }

    /**
     * Create an instance of {@link Dataset.ResourceType }
     * 
     */
    public Dataset.ResourceType createDatasetResourceType() {
        return new Dataset.ResourceType();
    }

    /**
     * Create an instance of {@link Variable }
     * 
     */
    public Variable createVariable() {
        return new Variable();
    }

    /**
     * Create an instance of {@link Dataset.Provenance }
     * 
     */
    public Dataset.Provenance createDatasetProvenance() {
        return new Dataset.Provenance();
    }

    /**
     * Create an instance of {@link Pid }
     * 
     */
    public Pid createPid() {
        return new Pid();
    }

    /**
     * Create an instance of {@link ChecksumType }
     * 
     */
    public ChecksumType createChecksumType() {
        return new ChecksumType();
    }

    /**
     * Create an instance of {@link Software }
     * 
     */
    public Software createSoftware() {
        return new Software();
    }

    /**
     * Create an instance of {@link ProcessingStep }
     * 
     */
    public ProcessingStep createProcessingStep() {
        return new ProcessingStep();
    }

    /**
     * Create an instance of {@link TemporalResolution }
     * 
     */
    public TemporalResolution createTemporalResolution() {
        return new TemporalResolution();
    }

    /**
     * Create an instance of {@link Publication }
     * 
     */
    public Publication createPublication() {
        return new Publication();
    }

    /**
     * Create an instance of {@link FileOrResource }
     * 
     */
    public FileOrResource createFileOrResource() {
        return new FileOrResource();
    }

    /**
     * Create an instance of {@link BoundaryCondition.Flow }
     * 
     */
    public BoundaryCondition.Flow createBoundaryConditionFlow() {
        return new BoundaryCondition.Flow();
    }

    /**
     * Create an instance of {@link Component.Forcefield }
     * 
     */
    public Component.Forcefield createComponentForcefield() {
        return new Component.Forcefield();
    }

    /**
     * Create an instance of {@link Environment.Compiler }
     * 
     */
    public Environment.Compiler createEnvironmentCompiler() {
        return new Environment.Compiler();
    }

    /**
     * Create an instance of {@link SpacialResolution.Point }
     * 
     */
    public SpacialResolution.Point createSpacialResolutionPoint() {
        return new SpacialResolution.Point();
    }

    /**
     * Create an instance of {@link Method.Name }
     * 
     */
    public Method.Name createMethodName() {
        return new Method.Name();
    }

    /**
     * Create an instance of {@link Dataset.Context.RelatedIdentifier }
     * 
     */
    public Dataset.Context.RelatedIdentifier createDatasetContextRelatedIdentifier() {
        return new Dataset.Context.RelatedIdentifier();
    }

    /**
     * Create an instance of {@link Dataset.System.Phase }
     * 
     */
    public Dataset.System.Phase createDatasetSystemPhase() {
        return new Dataset.System.Phase();
    }

    /**
     * Create an instance of {@link Dataset.Dates.Date }
     * 
     */
    public Dataset.Dates.Date createDatasetDatesDate() {
        return new Dataset.Dates.Date();
    }

    /**
     * Create an instance of {@link Dataset.Subjects.Subject }
     * 
     */
    public Dataset.Subjects.Subject createDatasetSubjectsSubject() {
        return new Dataset.Subjects.Subject();
    }

    /**
     * Create an instance of {@link Dataset.Keywords.Keyword }
     * 
     */
    public Dataset.Keywords.Keyword createDatasetKeywordsKeyword() {
        return new Dataset.Keywords.Keyword();
    }

    /**
     * Create an instance of {@link Dataset.FundingReference.FunderIdentifier }
     * 
     */
    public Dataset.FundingReference.FunderIdentifier createDatasetFundingReferenceFunderIdentifier() {
        return new Dataset.FundingReference.FunderIdentifier();
    }

    /**
     * Create an instance of {@link Dataset.FundingReference.AwardNumber }
     * 
     */
    public Dataset.FundingReference.AwardNumber createDatasetFundingReferenceAwardNumber() {
        return new Dataset.FundingReference.AwardNumber();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "component", scope = BoundaryCondition.Flow.class)
    @XmlIDREF
    public JAXBElement<Object> createBoundaryConditionFlowComponent(Object value) {
        return new JAXBElement<Object>(_BoundaryConditionFlowComponent_QNAME, Object.class, BoundaryCondition.Flow.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "br", scope = Dataset.Description.class)
    public JAXBElement<String> createDatasetDescriptionBr(String value) {
        return new JAXBElement<String>(_DatasetDescriptionBr_QNAME, String.class, Dataset.Description.class, value);
    }

}
