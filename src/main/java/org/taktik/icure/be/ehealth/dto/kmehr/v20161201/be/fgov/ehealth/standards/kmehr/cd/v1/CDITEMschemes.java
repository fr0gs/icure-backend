//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.14 at 03:49:53 PM CEST 
//


package org.taktik.icure.be.ehealth.dto.kmehr.v20161201.be.fgov.ehealth.standards.kmehr.cd.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CD-ITEMschemes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CD-ITEMschemes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CD-ITEM"/>
 *     &lt;enumeration value="CD-ITEM-MAA"/>
 *     &lt;enumeration value="CD-ITEM-CARENET"/>
 *     &lt;enumeration value="CD-LAB"/>
 *     &lt;enumeration value="CD-TECHNICAL"/>
 *     &lt;enumeration value="CD-CONTACT-PERSON"/>
 *     &lt;enumeration value="ICD"/>
 *     &lt;enumeration value="ICPC"/>
 *     &lt;enumeration value="LOCAL"/>
 *     &lt;enumeration value="CD-VACCINE"/>
 *     &lt;enumeration value="CD-ECG"/>
 *     &lt;enumeration value="CD-ECARE-CLINICAL"/>
 *     &lt;enumeration value="CD-ECARE-LAB"/>
 *     &lt;enumeration value="CD-ECARE-HAQ"/>
 *     &lt;enumeration value="CD-ITEM-EBIRTH"/>
 *     &lt;enumeration value="CD-PARAMETER"/>
 *     &lt;enumeration value="CD-ITEM-BVT"/>
 *     &lt;enumeration value="CD-BVT-AVAILABLEMATERIALS"/>
 *     &lt;enumeration value="CD-BVT-CONSERVATIONDELAY"/>
 *     &lt;enumeration value="CD-BVT-CONSERVATIONMODE"/>
 *     &lt;enumeration value="CD-BVT-SAMPLETYPE"/>
 *     &lt;enumeration value="CD-BCR-DIFFERENTATIONDEGREE"/>
 *     &lt;enumeration value="CD-BVT-LATERALITY"/>
 *     &lt;enumeration value="CD-BVT-PATIENTOPPOSITION"/>
 *     &lt;enumeration value="CD-BVT-STATUS"/>
 *     &lt;enumeration value="CD-ITEM-REG"/>
 *     &lt;enumeration value="CD-ITEM-MYCARENET"/>
 *     &lt;enumeration value="CD-DEFIB-DIAGNOSIS"/>
 *     &lt;enumeration value="CD-ACTS-NURSING"/>
 *     &lt;enumeration value="CD-QERMID-INTERVENTIONTYPE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CD-ITEMschemes")
@XmlEnum
public enum CDITEMschemes {

    @XmlEnumValue("CD-ITEM")
    CD_ITEM("CD-ITEM", "1.11"),
    @XmlEnumValue("CD-ITEM-MAA")
    CD_ITEM_MAA("CD-ITEM-MAA", "1.0"),
    @XmlEnumValue("CD-ITEM-CARENET")
    CD_ITEM_CARENET("CD-ITEM-CARENET", "1.0"),
    @XmlEnumValue("CD-LAB")
    CD_LAB("CD-LAB", "1.1"),
    @XmlEnumValue("CD-TECHNICAL")
    CD_TECHNICAL("CD-TECHNICAL", "1.0"),
    @XmlEnumValue("CD-CONTACT-PERSON")
    CD_CONTACT_PERSON("CD-CONTACT-PERSON", "1.2"),
    ICD("ICD", "1.0"),
    ICPC("ICPC", "1.0"),
    LOCAL("LOCAL", "1.0"),
    @XmlEnumValue("CD-VACCINE")
    CD_VACCINE("CD-VACCINE", "2.0"),
    @XmlEnumValue("CD-ECG")
    CD_ECG("CD-ECG", "1.0"),
    @XmlEnumValue("CD-ECARE-CLINICAL")
    CD_ECARE_CLINICAL("CD-ECARE-CLINICAL", "1.0"),
    @XmlEnumValue("CD-ECARE-LAB")
    CD_ECARE_LAB("CD-ECARE-LAB", "1.0"),
    @XmlEnumValue("CD-ECARE-HAQ")
    CD_ECARE_HAQ("CD-ECARE-HAQ", "1.0"),
    @XmlEnumValue("CD-ITEM-EBIRTH")
    CD_ITEM_EBIRTH("CD-ITEM-EBIRTH", "1.1"),
    @XmlEnumValue("CD-PARAMETER")
    CD_PARAMETER("CD-PARAMETER", "1.1"),
    @XmlEnumValue("CD-ITEM-BVT")
    CD_ITEM_BVT("CD-ITEM-BVT", "1.0"),
    @XmlEnumValue("CD-BVT-AVAILABLEMATERIALS")
    CD_BVT_AVAILABLEMATERIALS("CD-BVT-AVAILABLEMATERIALS", "1.0"),
    @XmlEnumValue("CD-BVT-CONSERVATIONDELAY")
    CD_BVT_CONSERVATIONDELAY("CD-BVT-CONSERVATIONDELAY", "1.0"),
    @XmlEnumValue("CD-BVT-CONSERVATIONMODE")
    CD_BVT_CONSERVATIONMODE("CD-BVT-CONSERVATIONMODE", "1.0"),
    @XmlEnumValue("CD-BVT-SAMPLETYPE")
    CD_BVT_SAMPLETYPE("CD-BVT-SAMPLETYPE", "1.0"),
    @XmlEnumValue("CD-BCR-DIFFERENTATIONDEGREE")
    CD_BCR_DIFFERENTATIONDEGREE("CD-BCR-DIFFERENTATIONDEGREE", "1.0"),
    @XmlEnumValue("CD-BVT-LATERALITY")
    CD_BVT_LATERALITY("CD-BVT-LATERALITY", "1.0"),
    @XmlEnumValue("CD-BVT-PATIENTOPPOSITION")
    CD_BVT_PATIENTOPPOSITION("CD-BVT-PATIENTOPPOSITION", "1.0"),
    @XmlEnumValue("CD-BVT-STATUS")
    CD_BVT_STATUS("CD-BVT-STATUS", "1.0"),
    @XmlEnumValue("CD-ITEM-REG")
    CD_ITEM_REG("CD-ITEM-REG", "1.6"),
    @XmlEnumValue("CD-ITEM-MYCARENET")
    CD_ITEM_MYCARENET("CD-ITEM-MYCARENET", "1.3"),
    @XmlEnumValue("CD-DEFIB-DIAGNOSIS")
    CD_DEFIB_DIAGNOSIS("CD-DEFIB-DIAGNOSIS", "1.0"),
    @XmlEnumValue("CD-ACTS-NURSING")
    CD_ACTS_NURSING("CD-ACTS-NURSING", "1.0"),
    @XmlEnumValue("CD-QERMID-INTERVENTIONTYPE")
    CD_QERMID_INTERVENTIONTYPE("CD-QERMID-INTERVENTIONTYPE", "1.0");
    private final String value; //
    private final String version;
    CDITEMschemes(String v, String vs) {
        value = v;
        version = vs;
    }

    public String value() {
        return value;
    } //

    public String version() {
        return version;
    }

    public static CDITEMschemes fromValue(String v) {
        for (CDITEMschemes c: CDITEMschemes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
