//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2019.02.05 um 05:02:22 PM CET 
//


package exptml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für countryType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="countryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AD"/>
 *     &lt;enumeration value="AE"/>
 *     &lt;enumeration value="AF"/>
 *     &lt;enumeration value="AL"/>
 *     &lt;enumeration value="AM"/>
 *     &lt;enumeration value="AN"/>
 *     &lt;enumeration value="AO"/>
 *     &lt;enumeration value="AQ"/>
 *     &lt;enumeration value="AR"/>
 *     &lt;enumeration value="AT"/>
 *     &lt;enumeration value="AU"/>
 *     &lt;enumeration value="AW"/>
 *     &lt;enumeration value="AZ"/>
 *     &lt;enumeration value="BA"/>
 *     &lt;enumeration value="BD"/>
 *     &lt;enumeration value="BE"/>
 *     &lt;enumeration value="BF"/>
 *     &lt;enumeration value="BG"/>
 *     &lt;enumeration value="BH"/>
 *     &lt;enumeration value="BI"/>
 *     &lt;enumeration value="BJ"/>
 *     &lt;enumeration value="BL"/>
 *     &lt;enumeration value="BN"/>
 *     &lt;enumeration value="BO"/>
 *     &lt;enumeration value="BR"/>
 *     &lt;enumeration value="BT"/>
 *     &lt;enumeration value="BW"/>
 *     &lt;enumeration value="BY"/>
 *     &lt;enumeration value="BZ"/>
 *     &lt;enumeration value="CA"/>
 *     &lt;enumeration value="CC"/>
 *     &lt;enumeration value="CD"/>
 *     &lt;enumeration value="CF"/>
 *     &lt;enumeration value="CG"/>
 *     &lt;enumeration value="CH"/>
 *     &lt;enumeration value="CI"/>
 *     &lt;enumeration value="CK"/>
 *     &lt;enumeration value="CL"/>
 *     &lt;enumeration value="CM"/>
 *     &lt;enumeration value="CN"/>
 *     &lt;enumeration value="CO"/>
 *     &lt;enumeration value="CR"/>
 *     &lt;enumeration value="CU"/>
 *     &lt;enumeration value="CV"/>
 *     &lt;enumeration value="CX"/>
 *     &lt;enumeration value="CY"/>
 *     &lt;enumeration value="CZ"/>
 *     &lt;enumeration value="DE"/>
 *     &lt;enumeration value="DJ"/>
 *     &lt;enumeration value="DK"/>
 *     &lt;enumeration value="DZ"/>
 *     &lt;enumeration value="EC"/>
 *     &lt;enumeration value="EE"/>
 *     &lt;enumeration value="EG"/>
 *     &lt;enumeration value="ER"/>
 *     &lt;enumeration value="ES"/>
 *     &lt;enumeration value="ET"/>
 *     &lt;enumeration value="FI"/>
 *     &lt;enumeration value="FJ"/>
 *     &lt;enumeration value="FK"/>
 *     &lt;enumeration value="FM"/>
 *     &lt;enumeration value="FO"/>
 *     &lt;enumeration value="FR"/>
 *     &lt;enumeration value="GA"/>
 *     &lt;enumeration value="GB"/>
 *     &lt;enumeration value="GE"/>
 *     &lt;enumeration value="GH"/>
 *     &lt;enumeration value="GI"/>
 *     &lt;enumeration value="GL"/>
 *     &lt;enumeration value="GM"/>
 *     &lt;enumeration value="GN"/>
 *     &lt;enumeration value="GQ"/>
 *     &lt;enumeration value="GR"/>
 *     &lt;enumeration value="GT"/>
 *     &lt;enumeration value="GW"/>
 *     &lt;enumeration value="GY"/>
 *     &lt;enumeration value="HK"/>
 *     &lt;enumeration value="HN"/>
 *     &lt;enumeration value="HR"/>
 *     &lt;enumeration value="HT"/>
 *     &lt;enumeration value="HU"/>
 *     &lt;enumeration value="ID"/>
 *     &lt;enumeration value="IE"/>
 *     &lt;enumeration value="IL"/>
 *     &lt;enumeration value="IM"/>
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="IQ"/>
 *     &lt;enumeration value="IR"/>
 *     &lt;enumeration value="IT"/>
 *     &lt;enumeration value="JO"/>
 *     &lt;enumeration value="JP"/>
 *     &lt;enumeration value="KE"/>
 *     &lt;enumeration value="KG"/>
 *     &lt;enumeration value="KH"/>
 *     &lt;enumeration value="KI"/>
 *     &lt;enumeration value="KM"/>
 *     &lt;enumeration value="KP"/>
 *     &lt;enumeration value="KR"/>
 *     &lt;enumeration value="KW"/>
 *     &lt;enumeration value="KZ"/>
 *     &lt;enumeration value="LA"/>
 *     &lt;enumeration value="LB"/>
 *     &lt;enumeration value="LI"/>
 *     &lt;enumeration value="LK"/>
 *     &lt;enumeration value="LR"/>
 *     &lt;enumeration value="LS"/>
 *     &lt;enumeration value="LT"/>
 *     &lt;enumeration value="LU"/>
 *     &lt;enumeration value="LV"/>
 *     &lt;enumeration value="LY"/>
 *     &lt;enumeration value="MA"/>
 *     &lt;enumeration value="MC"/>
 *     &lt;enumeration value="MD"/>
 *     &lt;enumeration value="ME"/>
 *     &lt;enumeration value="MG"/>
 *     &lt;enumeration value="MH"/>
 *     &lt;enumeration value="MK"/>
 *     &lt;enumeration value="ML"/>
 *     &lt;enumeration value="MM"/>
 *     &lt;enumeration value="MN"/>
 *     &lt;enumeration value="MO"/>
 *     &lt;enumeration value="MR"/>
 *     &lt;enumeration value="MT"/>
 *     &lt;enumeration value="MU"/>
 *     &lt;enumeration value="MV"/>
 *     &lt;enumeration value="MW"/>
 *     &lt;enumeration value="MX"/>
 *     &lt;enumeration value="MY"/>
 *     &lt;enumeration value="MZ"/>
 *     &lt;enumeration value="NA"/>
 *     &lt;enumeration value="NC"/>
 *     &lt;enumeration value="NE"/>
 *     &lt;enumeration value="NG"/>
 *     &lt;enumeration value="NI"/>
 *     &lt;enumeration value="NL"/>
 *     &lt;enumeration value="NO"/>
 *     &lt;enumeration value="NP"/>
 *     &lt;enumeration value="NR"/>
 *     &lt;enumeration value="NU"/>
 *     &lt;enumeration value="NZ"/>
 *     &lt;enumeration value="OM"/>
 *     &lt;enumeration value="PA"/>
 *     &lt;enumeration value="PE"/>
 *     &lt;enumeration value="PF"/>
 *     &lt;enumeration value="PG"/>
 *     &lt;enumeration value="PH"/>
 *     &lt;enumeration value="PK"/>
 *     &lt;enumeration value="PL"/>
 *     &lt;enumeration value="PM"/>
 *     &lt;enumeration value="PN"/>
 *     &lt;enumeration value="PR"/>
 *     &lt;enumeration value="PT"/>
 *     &lt;enumeration value="PW"/>
 *     &lt;enumeration value="PY"/>
 *     &lt;enumeration value="QA"/>
 *     &lt;enumeration value="RO"/>
 *     &lt;enumeration value="RS"/>
 *     &lt;enumeration value="RU"/>
 *     &lt;enumeration value="RW"/>
 *     &lt;enumeration value="SA"/>
 *     &lt;enumeration value="SB"/>
 *     &lt;enumeration value="SC"/>
 *     &lt;enumeration value="SD"/>
 *     &lt;enumeration value="SE"/>
 *     &lt;enumeration value="SG"/>
 *     &lt;enumeration value="SH"/>
 *     &lt;enumeration value="SI"/>
 *     &lt;enumeration value="SK"/>
 *     &lt;enumeration value="SL"/>
 *     &lt;enumeration value="SM"/>
 *     &lt;enumeration value="SN"/>
 *     &lt;enumeration value="SO"/>
 *     &lt;enumeration value="SR"/>
 *     &lt;enumeration value="ST"/>
 *     &lt;enumeration value="SV"/>
 *     &lt;enumeration value="SY"/>
 *     &lt;enumeration value="SZ"/>
 *     &lt;enumeration value="TD"/>
 *     &lt;enumeration value="TG"/>
 *     &lt;enumeration value="TH"/>
 *     &lt;enumeration value="TJ"/>
 *     &lt;enumeration value="TK"/>
 *     &lt;enumeration value="TL"/>
 *     &lt;enumeration value="TM"/>
 *     &lt;enumeration value="TN"/>
 *     &lt;enumeration value="TO"/>
 *     &lt;enumeration value="TR"/>
 *     &lt;enumeration value="TV"/>
 *     &lt;enumeration value="TW"/>
 *     &lt;enumeration value="TZ"/>
 *     &lt;enumeration value="UA"/>
 *     &lt;enumeration value="UG"/>
 *     &lt;enumeration value="US"/>
 *     &lt;enumeration value="UY"/>
 *     &lt;enumeration value="UZ"/>
 *     &lt;enumeration value="VA"/>
 *     &lt;enumeration value="VE"/>
 *     &lt;enumeration value="VN"/>
 *     &lt;enumeration value="VU"/>
 *     &lt;enumeration value="WF"/>
 *     &lt;enumeration value="WS"/>
 *     &lt;enumeration value="YE"/>
 *     &lt;enumeration value="YT"/>
 *     &lt;enumeration value="ZA"/>
 *     &lt;enumeration value="ZM"/>
 *     &lt;enumeration value="ZW"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "countryType")
@XmlEnum
public enum CountryType {

    AD,
    AE,
    AF,
    AL,
    AM,
    AN,
    AO,
    AQ,
    AR,
    AT,
    AU,
    AW,
    AZ,
    BA,
    BD,
    BE,
    BF,
    BG,
    BH,
    BI,
    BJ,
    BL,
    BN,
    BO,
    BR,
    BT,
    BW,
    BY,
    BZ,
    CA,
    CC,
    CD,
    CF,
    CG,
    CH,
    CI,
    CK,
    CL,
    CM,
    CN,
    CO,
    CR,
    CU,
    CV,
    CX,
    CY,
    CZ,
    DE,
    DJ,
    DK,
    DZ,
    EC,
    EE,
    EG,
    ER,
    ES,
    ET,
    FI,
    FJ,
    FK,
    FM,
    FO,
    FR,
    GA,
    GB,
    GE,
    GH,
    GI,
    GL,
    GM,
    GN,
    GQ,
    GR,
    GT,
    GW,
    GY,
    HK,
    HN,
    HR,
    HT,
    HU,
    ID,
    IE,
    IL,
    IM,
    IN,
    IQ,
    IR,
    IT,
    JO,
    JP,
    KE,
    KG,
    KH,
    KI,
    KM,
    KP,
    KR,
    KW,
    KZ,
    LA,
    LB,
    LI,
    LK,
    LR,
    LS,
    LT,
    LU,
    LV,
    LY,
    MA,
    MC,
    MD,
    ME,
    MG,
    MH,
    MK,
    ML,
    MM,
    MN,
    MO,
    MR,
    MT,
    MU,
    MV,
    MW,
    MX,
    MY,
    MZ,
    NA,
    NC,
    NE,
    NG,
    NI,
    NL,
    NO,
    NP,
    NR,
    NU,
    NZ,
    OM,
    PA,
    PE,
    PF,
    PG,
    PH,
    PK,
    PL,
    PM,
    PN,
    PR,
    PT,
    PW,
    PY,
    QA,
    RO,
    RS,
    RU,
    RW,
    SA,
    SB,
    SC,
    SD,
    SE,
    SG,
    SH,
    SI,
    SK,
    SL,
    SM,
    SN,
    SO,
    SR,
    ST,
    SV,
    SY,
    SZ,
    TD,
    TG,
    TH,
    TJ,
    TK,
    TL,
    TM,
    TN,
    TO,
    TR,
    TV,
    TW,
    TZ,
    UA,
    UG,
    US,
    UY,
    UZ,
    VA,
    VE,
    VN,
    VU,
    WF,
    WS,
    YE,
    YT,
    ZA,
    ZM,
    ZW;

    public String value() {
        return name();
    }

    public static CountryType fromValue(String v) {
        return valueOf(v);
    }

}
