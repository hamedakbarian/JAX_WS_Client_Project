
package DcuServise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for birthInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="birthInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressGeoSerial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="announcer1" type="{http://info.model.dcu}AnnouncerInfo"/>
 *         &lt;element name="announcer2" type="{http://info.model.dcu}AnnouncerInfo"/>
 *         &lt;element name="announcerRelationCode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="birthGeoSerial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="birthRegstSourceCode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="dateOfBirthSun" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fatherAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fatherDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fatherFname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fatherHozehCode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="fatherHozehKind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fatherName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fatherNin" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="fatherOfficeCode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="fatherShenasNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fatherShenasSeri" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fatherShenasSrno" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fatherZipCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="foreginCityName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="foreginStateName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hozehCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hozehKind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mamoorId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="moludSeqCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="motherAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="motherDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="motherFname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="motherHozehCode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="motherHozehKind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="motherName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="motherNin" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="motherOfficeCode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="motherShenasNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="motherShenasSeri" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="motherShenasSrno" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="motherZipCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="officeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ordinaryDehgardeshi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parentDateOfMarriage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parentMarrRegstNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parentRegstOfficeGeo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parentRegstOfficeNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="personAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="personFname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="personName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="personNin" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="personZipCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="religionKind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="remarks" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sanadIssueOffice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sanadPrepDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sanadPrepGeoSerial" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sanadSeri" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sanadSrno" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sexCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shenasnameSeri" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shenasnameSrno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="singleTwinTripleCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timeOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="witness1" type="{http://info.model.dcu}WitnessInfo"/>
 *         &lt;element name="witness2" type="{http://info.model.dcu}WitnessInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "birthInfo", propOrder = {
    "addressGeoSerial",
    "announcer1",
    "announcer2",
    "announcerRelationCode",
    "birthGeoSerial",
    "birthRegstSourceCode",
    "dateOfBirthSun",
    "fatherAddress",
    "fatherDateOfBirth",
    "fatherFname",
    "fatherHozehCode",
    "fatherHozehKind",
    "fatherName",
    "fatherNin",
    "fatherOfficeCode",
    "fatherShenasNo",
    "fatherShenasSeri",
    "fatherShenasSrno",
    "fatherZipCode",
    "foreginCityName",
    "foreginStateName",
    "hozehCode",
    "hozehKind",
    "mamoorId",
    "moludSeqCode",
    "motherAddress",
    "motherDateOfBirth",
    "motherFname",
    "motherHozehCode",
    "motherHozehKind",
    "motherName",
    "motherNin",
    "motherOfficeCode",
    "motherShenasNo",
    "motherShenasSeri",
    "motherShenasSrno",
    "motherZipCode",
    "officeCode",
    "ordinaryDehgardeshi",
    "parentDateOfMarriage",
    "parentMarrRegstNo",
    "parentRegstOfficeGeo",
    "parentRegstOfficeNo",
    "personAddress",
    "personFname",
    "personName",
    "personNin",
    "personZipCode",
    "religionKind",
    "remarks",
    "sanadIssueOffice",
    "sanadPrepDate",
    "sanadPrepGeoSerial",
    "sanadSeri",
    "sanadSrno",
    "sexCode",
    "shenasnameSeri",
    "shenasnameSrno",
    "singleTwinTripleCode",
    "timeOfBirth",
    "userId",
    "witness1",
    "witness2"
})
public class BirthInfo {

    @XmlElement(required = true, nillable = true)
    protected String addressGeoSerial;
    @XmlElement(required = true, nillable = true)
    protected AnnouncerInfo announcer1;
    @XmlElement(required = true, nillable = true)
    protected AnnouncerInfo announcer2;
    protected short announcerRelationCode;
    @XmlElement(required = true, nillable = true)
    protected String birthGeoSerial;
    protected short birthRegstSourceCode;
    @XmlElement(required = true, nillable = true)
    protected String dateOfBirthSun;
    @XmlElement(required = true, nillable = true)
    protected String fatherAddress;
    @XmlElement(required = true, nillable = true)
    protected String fatherDateOfBirth;
    @XmlElement(required = true, nillable = true)
    protected String fatherFname;
    protected short fatherHozehCode;
    @XmlElement(required = true, nillable = true)
    protected String fatherHozehKind;
    @XmlElement(required = true, nillable = true)
    protected String fatherName;
    protected long fatherNin;
    protected short fatherOfficeCode;
    protected int fatherShenasNo;
    @XmlElement(required = true, nillable = true)
    protected String fatherShenasSeri;
    protected int fatherShenasSrno;
    protected long fatherZipCode;
    @XmlElement(required = true, nillable = true)
    protected String foreginCityName;
    @XmlElement(required = true, nillable = true)
    protected String foreginStateName;
    @XmlElement(required = true, nillable = true)
    protected String hozehCode;
    @XmlElement(required = true, nillable = true)
    protected String hozehKind;
    @XmlElement(required = true, nillable = true)
    protected String mamoorId;
    @XmlElement(required = true, nillable = true)
    protected String moludSeqCode;
    @XmlElement(required = true, nillable = true)
    protected String motherAddress;
    @XmlElement(required = true, nillable = true)
    protected String motherDateOfBirth;
    @XmlElement(required = true, nillable = true)
    protected String motherFname;
    protected short motherHozehCode;
    @XmlElement(required = true, nillable = true)
    protected String motherHozehKind;
    @XmlElement(required = true, nillable = true)
    protected String motherName;
    protected long motherNin;
    protected short motherOfficeCode;
    protected int motherShenasNo;
    @XmlElement(required = true, nillable = true)
    protected String motherShenasSeri;
    protected int motherShenasSrno;
    protected long motherZipCode;
    @XmlElement(required = true, nillable = true)
    protected String officeCode;
    @XmlElement(required = true, nillable = true)
    protected String ordinaryDehgardeshi;
    @XmlElement(required = true, nillable = true)
    protected String parentDateOfMarriage;
    @XmlElement(required = true, nillable = true)
    protected String parentMarrRegstNo;
    @XmlElement(required = true, nillable = true)
    protected String parentRegstOfficeGeo;
    @XmlElement(required = true, nillable = true)
    protected String parentRegstOfficeNo;
    @XmlElement(required = true, nillable = true)
    protected String personAddress;
    @XmlElement(required = true, nillable = true)
    protected String personFname;
    @XmlElement(required = true, nillable = true)
    protected String personName;
    protected long personNin;
    protected long personZipCode;
    @XmlElement(required = true, nillable = true)
    protected String religionKind;
    @XmlElement(required = true, nillable = true)
    protected String remarks;
    @XmlElement(required = true, nillable = true)
    protected String sanadIssueOffice;
    @XmlElement(required = true, nillable = true)
    protected String sanadPrepDate;
    protected int sanadPrepGeoSerial;
    @XmlElement(required = true, nillable = true)
    protected String sanadSeri;
    protected int sanadSrno;
    @XmlElement(required = true, nillable = true)
    protected String sexCode;
    @XmlElement(required = true, nillable = true)
    protected String shenasnameSeri;
    @XmlElement(required = true, nillable = true)
    protected String shenasnameSrno;
    @XmlElement(required = true, nillable = true)
    protected String singleTwinTripleCode;
    @XmlElement(required = true, nillable = true)
    protected String timeOfBirth;
    @XmlElement(required = true, nillable = true)
    protected String userId;
    @XmlElement(required = true, nillable = true)
    protected WitnessInfo witness1;
    @XmlElement(required = true, nillable = true)
    protected WitnessInfo witness2;

    /**
     * Gets the value of the addressGeoSerial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressGeoSerial() {
        return addressGeoSerial;
    }

    /**
     * Sets the value of the addressGeoSerial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressGeoSerial(String value) {
        this.addressGeoSerial = value;
    }

    /**
     * Gets the value of the announcer1 property.
     * 
     * @return
     *     possible object is
     *     {@link AnnouncerInfo }
     *     
     */
    public AnnouncerInfo getAnnouncer1() {
        return announcer1;
    }

    /**
     * Sets the value of the announcer1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnouncerInfo }
     *     
     */
    public void setAnnouncer1(AnnouncerInfo value) {
        this.announcer1 = value;
    }

    /**
     * Gets the value of the announcer2 property.
     * 
     * @return
     *     possible object is
     *     {@link AnnouncerInfo }
     *     
     */
    public AnnouncerInfo getAnnouncer2() {
        return announcer2;
    }

    /**
     * Sets the value of the announcer2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnouncerInfo }
     *     
     */
    public void setAnnouncer2(AnnouncerInfo value) {
        this.announcer2 = value;
    }

    /**
     * Gets the value of the announcerRelationCode property.
     * 
     */
    public short getAnnouncerRelationCode() {
        return announcerRelationCode;
    }

    /**
     * Sets the value of the announcerRelationCode property.
     * 
     */
    public void setAnnouncerRelationCode(short value) {
        this.announcerRelationCode = value;
    }

    /**
     * Gets the value of the birthGeoSerial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthGeoSerial() {
        return birthGeoSerial;
    }

    /**
     * Sets the value of the birthGeoSerial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthGeoSerial(String value) {
        this.birthGeoSerial = value;
    }

    /**
     * Gets the value of the birthRegstSourceCode property.
     * 
     */
    public short getBirthRegstSourceCode() {
        return birthRegstSourceCode;
    }

    /**
     * Sets the value of the birthRegstSourceCode property.
     * 
     */
    public void setBirthRegstSourceCode(short value) {
        this.birthRegstSourceCode = value;
    }

    /**
     * Gets the value of the dateOfBirthSun property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfBirthSun() {
        return dateOfBirthSun;
    }

    /**
     * Sets the value of the dateOfBirthSun property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfBirthSun(String value) {
        this.dateOfBirthSun = value;
    }

    /**
     * Gets the value of the fatherAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherAddress() {
        return fatherAddress;
    }

    /**
     * Sets the value of the fatherAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherAddress(String value) {
        this.fatherAddress = value;
    }

    /**
     * Gets the value of the fatherDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherDateOfBirth() {
        return fatherDateOfBirth;
    }

    /**
     * Sets the value of the fatherDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherDateOfBirth(String value) {
        this.fatherDateOfBirth = value;
    }

    /**
     * Gets the value of the fatherFname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherFname() {
        return fatherFname;
    }

    /**
     * Sets the value of the fatherFname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherFname(String value) {
        this.fatherFname = value;
    }

    /**
     * Gets the value of the fatherHozehCode property.
     * 
     */
    public short getFatherHozehCode() {
        return fatherHozehCode;
    }

    /**
     * Sets the value of the fatherHozehCode property.
     * 
     */
    public void setFatherHozehCode(short value) {
        this.fatherHozehCode = value;
    }

    /**
     * Gets the value of the fatherHozehKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherHozehKind() {
        return fatherHozehKind;
    }

    /**
     * Sets the value of the fatherHozehKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherHozehKind(String value) {
        this.fatherHozehKind = value;
    }

    /**
     * Gets the value of the fatherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherName() {
        return fatherName;
    }

    /**
     * Sets the value of the fatherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherName(String value) {
        this.fatherName = value;
    }

    /**
     * Gets the value of the fatherNin property.
     * 
     */
    public long getFatherNin() {
        return fatherNin;
    }

    /**
     * Sets the value of the fatherNin property.
     * 
     */
    public void setFatherNin(long value) {
        this.fatherNin = value;
    }

    /**
     * Gets the value of the fatherOfficeCode property.
     * 
     */
    public short getFatherOfficeCode() {
        return fatherOfficeCode;
    }

    /**
     * Sets the value of the fatherOfficeCode property.
     * 
     */
    public void setFatherOfficeCode(short value) {
        this.fatherOfficeCode = value;
    }

    /**
     * Gets the value of the fatherShenasNo property.
     * 
     */
    public int getFatherShenasNo() {
        return fatherShenasNo;
    }

    /**
     * Sets the value of the fatherShenasNo property.
     * 
     */
    public void setFatherShenasNo(int value) {
        this.fatherShenasNo = value;
    }

    /**
     * Gets the value of the fatherShenasSeri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherShenasSeri() {
        return fatherShenasSeri;
    }

    /**
     * Sets the value of the fatherShenasSeri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherShenasSeri(String value) {
        this.fatherShenasSeri = value;
    }

    /**
     * Gets the value of the fatherShenasSrno property.
     * 
     */
    public int getFatherShenasSrno() {
        return fatherShenasSrno;
    }

    /**
     * Sets the value of the fatherShenasSrno property.
     * 
     */
    public void setFatherShenasSrno(int value) {
        this.fatherShenasSrno = value;
    }

    /**
     * Gets the value of the fatherZipCode property.
     * 
     */
    public long getFatherZipCode() {
        return fatherZipCode;
    }

    /**
     * Sets the value of the fatherZipCode property.
     * 
     */
    public void setFatherZipCode(long value) {
        this.fatherZipCode = value;
    }

    /**
     * Gets the value of the foreginCityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeginCityName() {
        return foreginCityName;
    }

    /**
     * Sets the value of the foreginCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeginCityName(String value) {
        this.foreginCityName = value;
    }

    /**
     * Gets the value of the foreginStateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeginStateName() {
        return foreginStateName;
    }

    /**
     * Sets the value of the foreginStateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeginStateName(String value) {
        this.foreginStateName = value;
    }

    /**
     * Gets the value of the hozehCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHozehCode() {
        return hozehCode;
    }

    /**
     * Sets the value of the hozehCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHozehCode(String value) {
        this.hozehCode = value;
    }

    /**
     * Gets the value of the hozehKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHozehKind() {
        return hozehKind;
    }

    /**
     * Sets the value of the hozehKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHozehKind(String value) {
        this.hozehKind = value;
    }

    /**
     * Gets the value of the mamoorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMamoorId() {
        return mamoorId;
    }

    /**
     * Sets the value of the mamoorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMamoorId(String value) {
        this.mamoorId = value;
    }

    /**
     * Gets the value of the moludSeqCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoludSeqCode() {
        return moludSeqCode;
    }

    /**
     * Sets the value of the moludSeqCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoludSeqCode(String value) {
        this.moludSeqCode = value;
    }

    /**
     * Gets the value of the motherAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherAddress() {
        return motherAddress;
    }

    /**
     * Sets the value of the motherAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherAddress(String value) {
        this.motherAddress = value;
    }

    /**
     * Gets the value of the motherDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherDateOfBirth() {
        return motherDateOfBirth;
    }

    /**
     * Sets the value of the motherDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherDateOfBirth(String value) {
        this.motherDateOfBirth = value;
    }

    /**
     * Gets the value of the motherFname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherFname() {
        return motherFname;
    }

    /**
     * Sets the value of the motherFname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherFname(String value) {
        this.motherFname = value;
    }

    /**
     * Gets the value of the motherHozehCode property.
     * 
     */
    public short getMotherHozehCode() {
        return motherHozehCode;
    }

    /**
     * Sets the value of the motherHozehCode property.
     * 
     */
    public void setMotherHozehCode(short value) {
        this.motherHozehCode = value;
    }

    /**
     * Gets the value of the motherHozehKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherHozehKind() {
        return motherHozehKind;
    }

    /**
     * Sets the value of the motherHozehKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherHozehKind(String value) {
        this.motherHozehKind = value;
    }

    /**
     * Gets the value of the motherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherName() {
        return motherName;
    }

    /**
     * Sets the value of the motherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherName(String value) {
        this.motherName = value;
    }

    /**
     * Gets the value of the motherNin property.
     * 
     */
    public long getMotherNin() {
        return motherNin;
    }

    /**
     * Sets the value of the motherNin property.
     * 
     */
    public void setMotherNin(long value) {
        this.motherNin = value;
    }

    /**
     * Gets the value of the motherOfficeCode property.
     * 
     */
    public short getMotherOfficeCode() {
        return motherOfficeCode;
    }

    /**
     * Sets the value of the motherOfficeCode property.
     * 
     */
    public void setMotherOfficeCode(short value) {
        this.motherOfficeCode = value;
    }

    /**
     * Gets the value of the motherShenasNo property.
     * 
     */
    public int getMotherShenasNo() {
        return motherShenasNo;
    }

    /**
     * Sets the value of the motherShenasNo property.
     * 
     */
    public void setMotherShenasNo(int value) {
        this.motherShenasNo = value;
    }

    /**
     * Gets the value of the motherShenasSeri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherShenasSeri() {
        return motherShenasSeri;
    }

    /**
     * Sets the value of the motherShenasSeri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherShenasSeri(String value) {
        this.motherShenasSeri = value;
    }

    /**
     * Gets the value of the motherShenasSrno property.
     * 
     */
    public int getMotherShenasSrno() {
        return motherShenasSrno;
    }

    /**
     * Sets the value of the motherShenasSrno property.
     * 
     */
    public void setMotherShenasSrno(int value) {
        this.motherShenasSrno = value;
    }

    /**
     * Gets the value of the motherZipCode property.
     * 
     */
    public long getMotherZipCode() {
        return motherZipCode;
    }

    /**
     * Sets the value of the motherZipCode property.
     * 
     */
    public void setMotherZipCode(long value) {
        this.motherZipCode = value;
    }

    /**
     * Gets the value of the officeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeCode() {
        return officeCode;
    }

    /**
     * Sets the value of the officeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeCode(String value) {
        this.officeCode = value;
    }

    /**
     * Gets the value of the ordinaryDehgardeshi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdinaryDehgardeshi() {
        return ordinaryDehgardeshi;
    }

    /**
     * Sets the value of the ordinaryDehgardeshi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrdinaryDehgardeshi(String value) {
        this.ordinaryDehgardeshi = value;
    }

    /**
     * Gets the value of the parentDateOfMarriage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentDateOfMarriage() {
        return parentDateOfMarriage;
    }

    /**
     * Sets the value of the parentDateOfMarriage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentDateOfMarriage(String value) {
        this.parentDateOfMarriage = value;
    }

    /**
     * Gets the value of the parentMarrRegstNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentMarrRegstNo() {
        return parentMarrRegstNo;
    }

    /**
     * Sets the value of the parentMarrRegstNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentMarrRegstNo(String value) {
        this.parentMarrRegstNo = value;
    }

    /**
     * Gets the value of the parentRegstOfficeGeo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentRegstOfficeGeo() {
        return parentRegstOfficeGeo;
    }

    /**
     * Sets the value of the parentRegstOfficeGeo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentRegstOfficeGeo(String value) {
        this.parentRegstOfficeGeo = value;
    }

    /**
     * Gets the value of the parentRegstOfficeNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentRegstOfficeNo() {
        return parentRegstOfficeNo;
    }

    /**
     * Sets the value of the parentRegstOfficeNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentRegstOfficeNo(String value) {
        this.parentRegstOfficeNo = value;
    }

    /**
     * Gets the value of the personAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonAddress() {
        return personAddress;
    }

    /**
     * Sets the value of the personAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonAddress(String value) {
        this.personAddress = value;
    }

    /**
     * Gets the value of the personFname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonFname() {
        return personFname;
    }

    /**
     * Sets the value of the personFname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonFname(String value) {
        this.personFname = value;
    }

    /**
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonName(String value) {
        this.personName = value;
    }

    /**
     * Gets the value of the personNin property.
     * 
     */
    public long getPersonNin() {
        return personNin;
    }

    /**
     * Sets the value of the personNin property.
     * 
     */
    public void setPersonNin(long value) {
        this.personNin = value;
    }

    /**
     * Gets the value of the personZipCode property.
     * 
     */
    public long getPersonZipCode() {
        return personZipCode;
    }

    /**
     * Sets the value of the personZipCode property.
     * 
     */
    public void setPersonZipCode(long value) {
        this.personZipCode = value;
    }

    /**
     * Gets the value of the religionKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReligionKind() {
        return religionKind;
    }

    /**
     * Sets the value of the religionKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReligionKind(String value) {
        this.religionKind = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the sanadIssueOffice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSanadIssueOffice() {
        return sanadIssueOffice;
    }

    /**
     * Sets the value of the sanadIssueOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSanadIssueOffice(String value) {
        this.sanadIssueOffice = value;
    }

    /**
     * Gets the value of the sanadPrepDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSanadPrepDate() {
        return sanadPrepDate;
    }

    /**
     * Sets the value of the sanadPrepDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSanadPrepDate(String value) {
        this.sanadPrepDate = value;
    }

    /**
     * Gets the value of the sanadPrepGeoSerial property.
     * 
     */
    public int getSanadPrepGeoSerial() {
        return sanadPrepGeoSerial;
    }

    /**
     * Sets the value of the sanadPrepGeoSerial property.
     * 
     */
    public void setSanadPrepGeoSerial(int value) {
        this.sanadPrepGeoSerial = value;
    }

    /**
     * Gets the value of the sanadSeri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSanadSeri() {
        return sanadSeri;
    }

    /**
     * Sets the value of the sanadSeri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSanadSeri(String value) {
        this.sanadSeri = value;
    }

    /**
     * Gets the value of the sanadSrno property.
     * 
     */
    public int getSanadSrno() {
        return sanadSrno;
    }

    /**
     * Sets the value of the sanadSrno property.
     * 
     */
    public void setSanadSrno(int value) {
        this.sanadSrno = value;
    }

    /**
     * Gets the value of the sexCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexCode() {
        return sexCode;
    }

    /**
     * Sets the value of the sexCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexCode(String value) {
        this.sexCode = value;
    }

    /**
     * Gets the value of the shenasnameSeri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShenasnameSeri() {
        return shenasnameSeri;
    }

    /**
     * Sets the value of the shenasnameSeri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShenasnameSeri(String value) {
        this.shenasnameSeri = value;
    }

    /**
     * Gets the value of the shenasnameSrno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShenasnameSrno() {
        return shenasnameSrno;
    }

    /**
     * Sets the value of the shenasnameSrno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShenasnameSrno(String value) {
        this.shenasnameSrno = value;
    }

    /**
     * Gets the value of the singleTwinTripleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSingleTwinTripleCode() {
        return singleTwinTripleCode;
    }

    /**
     * Sets the value of the singleTwinTripleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSingleTwinTripleCode(String value) {
        this.singleTwinTripleCode = value;
    }

    /**
     * Gets the value of the timeOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeOfBirth() {
        return timeOfBirth;
    }

    /**
     * Sets the value of the timeOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeOfBirth(String value) {
        this.timeOfBirth = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the witness1 property.
     * 
     * @return
     *     possible object is
     *     {@link WitnessInfo }
     *     
     */
    public WitnessInfo getWitness1() {
        return witness1;
    }

    /**
     * Sets the value of the witness1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link WitnessInfo }
     *     
     */
    public void setWitness1(WitnessInfo value) {
        this.witness1 = value;
    }

    /**
     * Gets the value of the witness2 property.
     * 
     * @return
     *     possible object is
     *     {@link WitnessInfo }
     *     
     */
    public WitnessInfo getWitness2() {
        return witness2;
    }

    /**
     * Sets the value of the witness2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link WitnessInfo }
     *     
     */
    public void setWitness2(WitnessInfo value) {
        this.witness2 = value;
    }

}
