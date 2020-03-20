//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.02.05 um 05:02:22 PM CET 
//


package unitsml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for the element for a root unit (from an extensive enumerated list) allowing an optional prefix and power. E.g., mm^2
 * 
 * <p>Java-Klasse für EnumeratedRootUnitType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="EnumeratedRootUnitType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}powerRational"/>
 *       &lt;attGroup ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}prefix"/>
 *       &lt;attGroup ref="{urn:oasis:names:tc:unitsml:schema:xsd:UnitsMLSchema-1.0}sourceURL"/>
 *       &lt;attribute name="unit" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="meter"/>
 *             &lt;enumeration value="gram"/>
 *             &lt;enumeration value="second"/>
 *             &lt;enumeration value="ampere"/>
 *             &lt;enumeration value="kelvin"/>
 *             &lt;enumeration value="mole"/>
 *             &lt;enumeration value="candela"/>
 *             &lt;enumeration value="radian"/>
 *             &lt;enumeration value="steradian"/>
 *             &lt;enumeration value="hertz"/>
 *             &lt;enumeration value="newton"/>
 *             &lt;enumeration value="pascal"/>
 *             &lt;enumeration value="joule"/>
 *             &lt;enumeration value="watt"/>
 *             &lt;enumeration value="coulomb"/>
 *             &lt;enumeration value="volt"/>
 *             &lt;enumeration value="farad"/>
 *             &lt;enumeration value="ohm"/>
 *             &lt;enumeration value="siemens"/>
 *             &lt;enumeration value="weber"/>
 *             &lt;enumeration value="tesla"/>
 *             &lt;enumeration value="henry"/>
 *             &lt;enumeration value="degree_Celsius"/>
 *             &lt;enumeration value="lumen"/>
 *             &lt;enumeration value="lux"/>
 *             &lt;enumeration value="katal"/>
 *             &lt;enumeration value="becquerel"/>
 *             &lt;enumeration value="gray"/>
 *             &lt;enumeration value="sievert"/>
 *             &lt;enumeration value="minute"/>
 *             &lt;enumeration value="hour"/>
 *             &lt;enumeration value="day"/>
 *             &lt;enumeration value="arc_degree"/>
 *             &lt;enumeration value="arc_minute"/>
 *             &lt;enumeration value="arc_second"/>
 *             &lt;enumeration value="liter"/>
 *             &lt;enumeration value="metric_ton"/>
 *             &lt;enumeration value="electronvolt"/>
 *             &lt;enumeration value="unified_atomic_mass_unit"/>
 *             &lt;enumeration value="astronomical_unit"/>
 *             &lt;enumeration value="atomic_unit_of_1st_hyperpolarizability"/>
 *             &lt;enumeration value="atomic_unit_of_2nd_hyperpolarizability"/>
 *             &lt;enumeration value="atomic_unit_of_action"/>
 *             &lt;enumeration value="atomic_unit_of_charge"/>
 *             &lt;enumeration value="atomic_unit_of_charge_density"/>
 *             &lt;enumeration value="atomic_unit_of_current"/>
 *             &lt;enumeration value="atomic_unit_of_electric_dipole_moment"/>
 *             &lt;enumeration value="atomic_unit_of_electric_field"/>
 *             &lt;enumeration value="atomic_unit_of_electric_field_gradient"/>
 *             &lt;enumeration value="atomic_unit_of_electric_polarizability"/>
 *             &lt;enumeration value="atomic_unit_of_electric_potential"/>
 *             &lt;enumeration value="atomic_unit_of_electric_quadrupole_moment"/>
 *             &lt;enumeration value="atomic_unit_of_energy"/>
 *             &lt;enumeration value="atomic_unit_of_force"/>
 *             &lt;enumeration value="atomic_unit_of_length"/>
 *             &lt;enumeration value="atomic_unit_of_magnetic_dipole_moment"/>
 *             &lt;enumeration value="atomic_unit_of_magnetic_flux_density"/>
 *             &lt;enumeration value="atomic_unit_of_magnetizability"/>
 *             &lt;enumeration value="atomic_unit_of_mass"/>
 *             &lt;enumeration value="atomic_unit_of_momentum"/>
 *             &lt;enumeration value="atomic_unit_of_permittivity"/>
 *             &lt;enumeration value="atomic_unit_of_time"/>
 *             &lt;enumeration value="atomic_unit_of_velocity"/>
 *             &lt;enumeration value="natural_unit_of_action"/>
 *             &lt;enumeration value="natural_unit_of_action_in_eV_s"/>
 *             &lt;enumeration value="natural_unit_of_energy"/>
 *             &lt;enumeration value="natural_unit_of_energy_in_MeV"/>
 *             &lt;enumeration value="natural_unit_of_length"/>
 *             &lt;enumeration value="natural_unit_of_mass"/>
 *             &lt;enumeration value="natural_unit_of_momentum"/>
 *             &lt;enumeration value="natural_unit_of_momentum_in_MeV_per_c"/>
 *             &lt;enumeration value="natural_unit_of_time"/>
 *             &lt;enumeration value="natural_unit_of_velocity"/>
 *             &lt;enumeration value="nautical_mile"/>
 *             &lt;enumeration value="knot"/>
 *             &lt;enumeration value="angstrom"/>
 *             &lt;enumeration value="are"/>
 *             &lt;enumeration value="hectare"/>
 *             &lt;enumeration value="barn"/>
 *             &lt;enumeration value="bar"/>
 *             &lt;enumeration value="gal"/>
 *             &lt;enumeration value="curie"/>
 *             &lt;enumeration value="roentgen"/>
 *             &lt;enumeration value="rad"/>
 *             &lt;enumeration value="rem"/>
 *             &lt;enumeration value="erg"/>
 *             &lt;enumeration value="dyne"/>
 *             &lt;enumeration value="barye"/>
 *             &lt;enumeration value="poise"/>
 *             &lt;enumeration value="rhe"/>
 *             &lt;enumeration value="stokes"/>
 *             &lt;enumeration value="darcy"/>
 *             &lt;enumeration value="kayser"/>
 *             &lt;enumeration value="lambert"/>
 *             &lt;enumeration value="phot"/>
 *             &lt;enumeration value="thermo_calorie"/>
 *             &lt;enumeration value="table_calorie"/>
 *             &lt;enumeration value="debye"/>
 *             &lt;enumeration value="abampere"/>
 *             &lt;enumeration value="abcoulomb"/>
 *             &lt;enumeration value="abfarad"/>
 *             &lt;enumeration value="abhenry"/>
 *             &lt;enumeration value="abohm"/>
 *             &lt;enumeration value="abmho"/>
 *             &lt;enumeration value="abvolt"/>
 *             &lt;enumeration value="abwatt"/>
 *             &lt;enumeration value="maxwell"/>
 *             &lt;enumeration value="gauss"/>
 *             &lt;enumeration value="gilbert"/>
 *             &lt;enumeration value="oersted"/>
 *             &lt;enumeration value="stilb"/>
 *             &lt;enumeration value="statampere"/>
 *             &lt;enumeration value="statcoulomb"/>
 *             &lt;enumeration value="statfarad"/>
 *             &lt;enumeration value="stathenry"/>
 *             &lt;enumeration value="statohm"/>
 *             &lt;enumeration value="statmho"/>
 *             &lt;enumeration value="statvolt"/>
 *             &lt;enumeration value="statwatt"/>
 *             &lt;enumeration value="statweber"/>
 *             &lt;enumeration value="stattesla"/>
 *             &lt;enumeration value="long_ton"/>
 *             &lt;enumeration value="short_ton"/>
 *             &lt;enumeration value="gross_hundredweight"/>
 *             &lt;enumeration value="hundredweight"/>
 *             &lt;enumeration value="av_pound"/>
 *             &lt;enumeration value="av_ounce"/>
 *             &lt;enumeration value="av_dram"/>
 *             &lt;enumeration value="troy_pound"/>
 *             &lt;enumeration value="troy_ounce"/>
 *             &lt;enumeration value="pennyweight"/>
 *             &lt;enumeration value="apothecaries_dram"/>
 *             &lt;enumeration value="scruple"/>
 *             &lt;enumeration value="grain"/>
 *             &lt;enumeration value="slug"/>
 *             &lt;enumeration value="pound_force"/>
 *             &lt;enumeration value="poundal"/>
 *             &lt;enumeration value="kip"/>
 *             &lt;enumeration value="ton_force"/>
 *             &lt;enumeration value="gram_force"/>
 *             &lt;enumeration value="inch"/>
 *             &lt;enumeration value="foot"/>
 *             &lt;enumeration value="yard"/>
 *             &lt;enumeration value="mile"/>
 *             &lt;enumeration value="us_survey_inch"/>
 *             &lt;enumeration value="us_survey_foot"/>
 *             &lt;enumeration value="us_survey_yard"/>
 *             &lt;enumeration value="us_survey_fathom"/>
 *             &lt;enumeration value="us_survey_rod"/>
 *             &lt;enumeration value="us_survey_chain"/>
 *             &lt;enumeration value="us_survey_link"/>
 *             &lt;enumeration value="us_survey_furlong"/>
 *             &lt;enumeration value="us_survey_mile"/>
 *             &lt;enumeration value="us_acre"/>
 *             &lt;enumeration value="imperial_gallon"/>
 *             &lt;enumeration value="imperial_quart"/>
 *             &lt;enumeration value="imperial_pint"/>
 *             &lt;enumeration value="imperial_gill"/>
 *             &lt;enumeration value="imperial_ounce"/>
 *             &lt;enumeration value="us_gallon"/>
 *             &lt;enumeration value="us_quart"/>
 *             &lt;enumeration value="us_pint"/>
 *             &lt;enumeration value="us_cup"/>
 *             &lt;enumeration value="us_gill"/>
 *             &lt;enumeration value="us_fluid_ounce"/>
 *             &lt;enumeration value="us_fluid_dram"/>
 *             &lt;enumeration value="us_minim"/>
 *             &lt;enumeration value="us_tablespoon"/>
 *             &lt;enumeration value="us_teaspoon"/>
 *             &lt;enumeration value="us_bushel"/>
 *             &lt;enumeration value="us_peck"/>
 *             &lt;enumeration value="us_dry_quart"/>
 *             &lt;enumeration value="us_dry_pint"/>
 *             &lt;enumeration value="thermo_kg_calorie"/>
 *             &lt;enumeration value="table_kg_calorie"/>
 *             &lt;enumeration value="us_label_teaspoon"/>
 *             &lt;enumeration value="us_label_tablespoon"/>
 *             &lt;enumeration value="us_label_cup"/>
 *             &lt;enumeration value="us_label_fluid_ounce"/>
 *             &lt;enumeration value="us_label_ounce"/>
 *             &lt;enumeration value="horsepower"/>
 *             &lt;enumeration value="electric_horsepower"/>
 *             &lt;enumeration value="boiler_horsepower"/>
 *             &lt;enumeration value="metric_horsepower"/>
 *             &lt;enumeration value="water_horsepower"/>
 *             &lt;enumeration value="uk_horsepower"/>
 *             &lt;enumeration value="degree_Fahrenheit"/>
 *             &lt;enumeration value="degree_Rankine"/>
 *             &lt;enumeration value="torr"/>
 *             &lt;enumeration value="standard_atmosphere"/>
 *             &lt;enumeration value="technical_atmosphere"/>
 *             &lt;enumeration value="mm_Hg"/>
 *             &lt;enumeration value="cm_Hg"/>
 *             &lt;enumeration value="0C_cm_Hg"/>
 *             &lt;enumeration value="in_Hg"/>
 *             &lt;enumeration value="32F_in_Hg"/>
 *             &lt;enumeration value="60F_in_Hg"/>
 *             &lt;enumeration value="ft_Hg"/>
 *             &lt;enumeration value="mm_water"/>
 *             &lt;enumeration value="cm_water"/>
 *             &lt;enumeration value="4C_cm_water"/>
 *             &lt;enumeration value="in_water"/>
 *             &lt;enumeration value="39F_in_water"/>
 *             &lt;enumeration value="60F_in_water"/>
 *             &lt;enumeration value="ft_water"/>
 *             &lt;enumeration value="39F_ft_water"/>
 *             &lt;enumeration value="light_year"/>
 *             &lt;enumeration value="light_week"/>
 *             &lt;enumeration value="light_hour"/>
 *             &lt;enumeration value="light_minute"/>
 *             &lt;enumeration value="light_second"/>
 *             &lt;enumeration value="parsec"/>
 *             &lt;enumeration value="printers_pica"/>
 *             &lt;enumeration value="computer_pica"/>
 *             &lt;enumeration value="printers_point"/>
 *             &lt;enumeration value="computer_point"/>
 *             &lt;enumeration value="thermo_btu"/>
 *             &lt;enumeration value="table_btu"/>
 *             &lt;enumeration value="mean_btu"/>
 *             &lt;enumeration value="39F_btu"/>
 *             &lt;enumeration value="59F_btu"/>
 *             &lt;enumeration value="60F_btu"/>
 *             &lt;enumeration value="tons_of_tnt"/>
 *             &lt;enumeration value="ec_therm"/>
 *             &lt;enumeration value="us_therm"/>
 *             &lt;enumeration value="year_365"/>
 *             &lt;enumeration value="tropical_year"/>
 *             &lt;enumeration value="sidereal_year"/>
 *             &lt;enumeration value="sidereal_day"/>
 *             &lt;enumeration value="sidereal_hour"/>
 *             &lt;enumeration value="sidereal_minute"/>
 *             &lt;enumeration value="sidereal_second"/>
 *             &lt;enumeration value="shake"/>
 *             &lt;enumeration value="denier"/>
 *             &lt;enumeration value="tex"/>
 *             &lt;enumeration value="gon"/>
 *             &lt;enumeration value="nato_mil"/>
 *             &lt;enumeration value="pound_mole"/>
 *             &lt;enumeration value="ton_refrigeration"/>
 *             &lt;enumeration value="circular_mil"/>
 *             &lt;enumeration value="bel"/>
 *             &lt;enumeration value="neper"/>
 *             &lt;enumeration value="pH"/>
 *             &lt;enumeration value="petro_barrel"/>
 *             &lt;enumeration value="footlambert"/>
 *             &lt;enumeration value="footcandle"/>
 *             &lt;enumeration value="carat"/>
 *             &lt;enumeration value="bit"/>
 *             &lt;enumeration value="byte"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnumeratedRootUnitType")
public class EnumeratedRootUnitType {

    @XmlAttribute(name = "unit", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String unit;
    @XmlAttribute(name = "powerNumerator")
    protected Byte powerNumerator;
    @XmlAttribute(name = "powerDenominator")
    protected Byte powerDenominator;
    @XmlAttribute(name = "prefix")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String prefix;
    @XmlAttribute(name = "sourceURL")
    @XmlSchemaType(name = "anyURI")
    protected String sourceURL;

    /**
     * Ruft den Wert der unit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Legt den Wert der unit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Ruft den Wert der powerNumerator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public byte getPowerNumerator() {
        if (powerNumerator == null) {
            return ((byte) 1);
        } else {
            return powerNumerator;
        }
    }

    /**
     * Legt den Wert der powerNumerator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setPowerNumerator(Byte value) {
        this.powerNumerator = value;
    }

    /**
     * Ruft den Wert der powerDenominator-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public byte getPowerDenominator() {
        if (powerDenominator == null) {
            return ((byte) 1);
        } else {
            return powerDenominator;
        }
    }

    /**
     * Legt den Wert der powerDenominator-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setPowerDenominator(Byte value) {
        this.powerDenominator = value;
    }

    /**
     * Ruft den Wert der prefix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Legt den Wert der prefix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefix(String value) {
        this.prefix = value;
    }

    /**
     * Ruft den Wert der sourceURL-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceURL() {
        return sourceURL;
    }

    /**
     * Legt den Wert der sourceURL-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceURL(String value) {
        this.sourceURL = value;
    }

}
