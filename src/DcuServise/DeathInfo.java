
package DcuServise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deathInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deathInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressGeoSerial" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ancrAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ancrAddressGeoSerial" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ancrDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ancrFname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ancrLetterDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ancrLetterNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ancrName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ancrNin" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ancrOfficeCode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="ancrPosition" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ancrReferenceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ancrShenasIssuePlace" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ancrShenasNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ancrShenasSeri" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ancrShenasSrno" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ancrZipCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateOfDeath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deathCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deathConfirmAutCode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="deathDocumentDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deathDocumentNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deathGeoSerial" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="deathPlaceAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deathReasonCode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="deathRecordStage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deathRegstDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deathRegstNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="deathSanadPrepAuth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deathSanadSeri" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deathSanadSrno" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="deathWitnessInfo1" type="{http://info.model.dcu}DeathWitnessInfo"/>
 *         &lt;element name="deathWitnessInfo2" type="{http://info.model.dcu}DeathWitnessInfo"/>
 *         &lt;element name="fatherAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fatherDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fatherFname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fatherHozeh" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fatherName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fatherNin" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="fatherOfficeCode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="fatherShenasIssuePlace" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fatherShenasNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fatherZipCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="foreignCityStateName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hozehCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hozehKind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mamoorId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="motherAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="motherDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="motherFname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="motherHozeh" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="motherName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="motherNin" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="motherOfficeCode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="motherShenasIssuePlace" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="motherShenasNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="motherZipCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="officeCode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="ordinaryDehgardeshi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="personAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="personFname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="personName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="personNin" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="personOccupation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="personZipCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="remarks" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sanadIssueOffice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sanadIssueOfficeCode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="sexCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shenasSeri" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shenasSrno" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="shenasnameIssueDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shenasnameNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deathInfo", propOrder = {
    "addressGeoSerial",
    "ancrAddress",
    "ancrAddressGeoSerial",
    "ancrDateOfBirth",
    "ancrFname",
    "ancrLetterDate",
    "ancrLetterNo",
    "ancrName",
    "ancrNin",
    "ancrOfficeCode",
    "ancrPosition",
    "ancrReferenceName",
    "ancrShenasIssuePlace",
    "ancrShenasNo",
    "ancrShenasSeri",
    "ancrShenasSrno",
    "ancrZipCode",
    "dateOfBirth",
    "dateOfDeath",
    "deathCategoryCode",
    "deathConfirmAutCode",
    "deathDocumentDate",
    "deathDocumentNo",
    "deathGeoSerial",
    "deathPlaceAddress",
    "deathReasonCode",
    "deathRecordStage",
    "deathRegstDate",
    "deathRegstNo",
    "deathSanadPrepAuth",
    "deathSanadSeri",
    "deathSanadSrno",
    "deathWitnessInfo1",
    "deathWitnessInfo2",
    "fatherAddress",
    "fatherDateOfBirth",
    "fatherFname",
    "fatherHozeh",
    "fatherName",
    "fatherNin",
    "fatherOfficeCode",
    "fatherShenasIssuePlace",
    "fatherShenasNo",
    "fatherZipCode",
    "foreignCityStateName",
    "hozehCode",
    "hozehKind",
    "mamoorId",
    "motherAddress",
    "motherDateOfBirth",
    "motherFname",
    "motherHozeh",
    "motherName",
    "motherNin",
    "motherOfficeCode",
    "motherShenasIssuePlace",
    "motherShenasNo",
    "motherZipCode",
    "officeCode",
    "ordinaryDehgardeshi",
    "personAddress",
    "personFname",
    "personName",
    "personNin",
    "personOccupation",
    "personZipCode",
    "remarks",
    "sanadIssueOffice",
    "sanadIssueOfficeCode",
    "sexCode",
    "shenasSeri",
    "shenasSrno",
    "shenasnameIssueDate",
    "shenasnameNo",
    "userId"
})
public class DeathInfo {

    protected int addressGeoSerial;
    @XmlElement(required = true, nillable = true)
    protected String ancrAddress;
    protected int ancrAddressGeoSerial;
    @XmlElement(required = true, nillable = true)
    protected String ancrDateOfBirth;
    @XmlElement(required = true, nillable = true)
    protected String ancrFname;
    @XmlElement(required = true, nillable = true)
    protected String ancrLetterDate;
    @XmlElement(required = true, nillable = true)
    protected String ancrLetterNo;
    @XmlElement(required = true, nillable = true)
    protected String ancrName;
    protected long ancrNin;
    protected short ancrOfficeCode;
    @XmlElement(required = true, nillable = true)
    protected String ancrPosition;
    @XmlElement(required = true, nillable = true)
    protected String ancrReferenceName;
    @XmlElement(required = true, nillable = true)
    protected String ancrShenasIssuePlace;
    protected int ancrShenasNo;
    @XmlElement(required = true, nillable = true)
    protected String ancrShenasSeri;
    protected int ancrShenasSrno;
    protected long ancrZipCode;
    @XmlElement(required = true, nillable = true)
    protected String dateOfBirth;
    @XmlElement(required = true, nillable = true)
    protected String dateOfDeath;
    @XmlElement(required = true, nillable = true)
    protected String deathCategoryCode;
    protected short deathConfirmAutCode;
    @XmlElement(required = true, nillable = true)
    protected String deathDocumentDate;
    @XmlElement(required = true, nillable = true)
    protected String deathDocumentNo;
    protected int deathGeoSerial;
    @XmlElement(required = true, nillable = true)
    protected String deathPlaceAddress;
    protected short deathReasonCode;
    @XmlElement(required = true, nillable = true)
    protected String deathRecordStage;
    @XmlElement(required = true, nillable = true)
    protected String deathRegstDate;
    protected long deathRegstNo;
    @XmlElement(required = true, nillable = true)
    protected String deathSanadPrepAuth;
    @XmlElement(required = true, nillable = true)
    protected String deathSanadSeri;
    protected int deathSanadSrno;
    @XmlElement(required = true, nillable = true)
    protected DeathWitnessInfo deathWitnessInfo1;
    @XmlElement(required = true, nillable = true)
    protected DeathWitnessInfo deathWitnessInfo2;
    @XmlElement(required = true, nillable = true)
    protected String fatherAddress;
    @XmlElement(required = true, nillable = true)
    protected String fatherDateOfBirth;
    @XmlElement(required = true, nillable = true)
    protected String fatherFname;
    @XmlElement(required = true, nillable = true)
    protected String fatherHozeh;
    @XmlElement(required = true, nillable = true)
    protected String fatherName;
    protected long fatherNin;
    protected short fatherOfficeCode;
    @XmlElement(required = true, nillable = true)
    protected String fatherShenasIssuePlace;
    protected int fatherShenasNo;
    protected long fatherZipCode;
    @XmlElement(required = true, nillable = true)
    protected String foreignCityStateName;
    @XmlElement(required = true, nillable = true)
    protected String hozehCode;
    @XmlElement(required = true, nillable = true)
    protected String hozehKind;
    @XmlElement(required = true, nillable = true)
    protected String mamoorId;
    @XmlElement(required = true, nillable = true)
    protected String motherAddress;
    @XmlElement(required = true, nillable = true)
    protected String motherDateOfBirth;
    @XmlElement(required = true, nillable = true)
    protected String motherFname;
    @XmlElement(required = true, nillable = true)
    protected String motherHozeh;
    @XmlElement(required = true, nillable = true)
    protected String motherName;
    protected long motherNin;
    protected short motherOfficeCode;
    @XmlElement(required = true, nillable = true)
    protected String motherShenasIssuePlace;
    protected int motherShenasNo;
    protected long motherZipCode;
    protected short officeCode;
    @XmlElement(required = true, nillable = true)
    protected String ordinaryDehgardeshi;
    @XmlElement(required = true, nillable = true)
    protected String personAddress;
    @XmlElement(required = true, nillable = true)
    protected String personFname;
    @XmlElement(required = true, nillable = true)
    protected String personName;
    protected long personNin;
    @XmlElement(required = true, nillable = true)
    protected String personOccupation;
    protected long personZipCode;
    @XmlElement(required = true, nillable = true)
    protected String remarks;
    @XmlElement(required = true, nillable = true)
    protected String sanadIssueOffice;
    protected short sanadIssueOfficeCode;
    @XmlElement(required = true, nillable = true)
    protected String sexCode;
    @XmlElement(required = true, nillable = true)
    protected String shenasSeri;
    protected int shenasSrno;
    @XmlElement(required = true, nillable = true)
    protected String shenasnameIssueDate;
    protected int shenasnameNo;
    @XmlElement(required = true, nillable = true)
    protected String userId;

    /**
     * Gets the value of the addressGeoSerial property.
     * 
     */
    public int getAddressGeoSerial() {
        return addressGeoSerial;
    }

    /**
     * Sets the value of the addressGeoSerial property.
     * 
     */
    public void setAddressGeoSerial(int value) {
        this.addressGeoSerial = value;
    }

    /**
     * Gets the value of the ancrAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAncrAddress() {
        return ancrAddress;
    }

    /**
     * Sets the value of the ancrAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAncrAddress(String value) {
        this.ancrAddress = value;
    }

    /**
     * Gets the value of the ancrAddressGeoSerial property.
     * 
     */
    public int getAncrAddressGeoSerial() {
        return ancrAddressGeoSerial;
    }

    /**
     * Sets the value of the ancrAddressGeoSerial property.
     * 
     */
    public void setAncrAddressGeoSerial(int value) {
        this.ancrAddressGeoSerial = value;
    }

    /**
     * Gets the value of the ancrDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAncrDateOfBirth() {
        return ancrDateOfBirth;
    }

    /**
     * Sets the value of the ancrDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAncrDateOfBirth(String value) {
        this.ancrDateOfBirth = value;
    }

    /**
     * Gets the value of the ancrFname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAncrFname() {
        return ancrFname;
    }

    /**
     * Sets the value of the ancrFname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAncrFname(String value) {
        this.ancrFname = value;
    }

    /**
     * Gets the value of the ancrLetterDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAncrLetterDate() {
        return ancrLetterDate;
    }

    /**
     * Sets the value of the ancrLetterDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAncrLetterDate(String value) {
        this.ancrLetterDate = value;
    }

    /**
     * Gets the value of the ancrLetterNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAncrLetterNo() {
        return ancrLetterNo;
    }

    /**
     * Sets the value of the ancrLetterNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAncrLetterNo(String value) {
        this.ancrLetterNo = value;
    }

    /**
     * Gets the value of the ancrName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAncrName() {
        return ancrName;
    }

    /**
     * Sets the value of the ancrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAncrName(String value) {
        this.ancrName = value;
    }

    /**
     * Gets the value of the ancrNin property.
     * 
     */
    public long getAncrNin() {
        return ancrNin;
    }

    /**
     * Sets the value of the ancrNin property.
     * 
     */
    public void setAncrNin(long value) {
        this.ancrNin = value;
    }

    /**
     * Gets the value of the ancrOfficeCode property.
     * 
     */
    public short getAncrOfficeCode() {
        return ancrOfficeCode;
    }

    /**
     * Sets the value of the ancrOfficeCode property.
     * 
     */
    public void setAncrOfficeCode(short value) {
        this.ancrOfficeCode = value;
    }

    /**
     * Gets the value of the ancrPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAncrPosition() {
        return ancrPosition;
    }

    /**
     * Sets the value of the ancrPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAncrPosition(String value) {
        this.ancrPosition = value;
    }

    /**
     * Gets the value of the ancrReferenceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAncrReferenceName() {
        return ancrReferenceName;
    }

    /**
     * Sets the value of the ancrReferenceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAncrReferenceName(String value) {
        this.ancrReferenceName = value;
    }

    /**
     * Gets the value of the ancrShenasIssuePlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAncrShenasIssuePlace() {
        return ancrShenasIssuePlace;
    }

    /**
     * Sets the value of the ancrShenasIssuePlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAncrShenasIssuePlace(String value) {
        this.ancrShenasIssuePlace = value;
    }

    /**
     * Gets the value of the ancrShenasNo property.
     * 
     */
    public int getAncrShenasNo() {
        return ancrShenasNo;
    }

    /**
     * Sets the value of the ancrShenasNo property.
     * 
     */
    public void setAncrShenasNo(int value) {
        this.ancrShenasNo = value;
    }

    /**
     * Gets the value of the ancrShenasSeri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAncrShenasSeri() {
        return ancrShenasSeri;
    }

    /**
     * Sets the value of the ancrShenasSeri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAncrShenasSeri(String value) {
        this.ancrShenasSeri = value;
    }

    /**
     * Gets the value of the ancrShenasSrno property.
     * 
     */
    public int getAncrShenasSrno() {
        return ancrShenasSrno;
    }

    /**
     * Sets the value of the ancrShenasSrno property.
     * 
     */
    public void setAncrShenasSrno(int value) {
        this.ancrShenasSrno = value;
    }

    /**
     * Gets the value of the ancrZipCode property.
     * 
     */
    public long getAncrZipCode() {
        return ancrZipCode;
    }

    /**
     * Sets the value of the ancrZipCode property.
     * 
     */
    public void setAncrZipCode(long value) {
        this.ancrZipCode = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfBirth(String value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the dateOfDeath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfDeath() {
        return dateOfDeath;
    }

    /**
     * Sets the value of the dateOfDeath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfDeath(String value) {
        this.dateOfDeath = value;
    }

    /**
     * Gets the value of the deathCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeathCategoryCode() {
        return deathCategoryCode;
    }

    /**
     * Sets the value of the deathCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeathCategoryCode(String value) {
        this.deathCategoryCode = value;
    }

    /**
     * Gets the value of the deathConfirmAutCode property.
     * 
     */
    public short getDeathConfirmAutCode() {
        return deathConfirmAutCode;
    }

    /**
     * Sets the value of the deathConfirmAutCode property.
     * 
     */
    public void setDeathConfirmAutCode(short value) {
        this.deathConfirmAutCode = value;
    }

    /**
     * Gets the value of the deathDocumentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeathDocumentDate() {
        return deathDocumentDate;
    }

    /**
     * Sets the value of the deathDocumentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeathDocumentDate(String value) {
        this.deathDocumentDate = value;
    }

    /**
     * Gets the value of the deathDocumentNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeathDocumentNo() {
        return deathDocumentNo;
    }

    /**
     * Sets the value of the deathDocumentNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeathDocumentNo(String value) {
        this.deathDocumentNo = value;
    }

    /**
     * Gets the value of the deathGeoSerial property.
     * 
     */
    public int getDeathGeoSerial() {
        return deathGeoSerial;
    }

    /**
     * Sets the value of the deathGeoSerial property.
     * 
     */
    public void setDeathGeoSerial(int value) {
        this.deathGeoSerial = value;
    }

    /**
     * Gets the value of the deathPlaceAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeathPlaceAddress() {
        return deathPlaceAddress;
    }

    /**
     * Sets the value of the deathPlaceAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeathPlaceAddress(String value) {
        this.deathPlaceAddress = value;
    }

    /**
     * Gets the value of the deathReasonCode property.
     * 
     */
    public short getDeathReasonCode() {
        return deathReasonCode;
    }

    /**
     * Sets the value of the deathReasonCode property.
     * 
     */
    public void setDeathReasonCode(short value) {
        this.deathReasonCode = value;
    }

    /**
     * Gets the value of the deathRecordStage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeathRecordStage() {
        return deathRecordStage;
    }

    /**
     * Sets the value of the deathRecordStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeathRecordStage(String value) {
        this.deathRecordStage = value;
    }

    /**
     * Gets the value of the deathRegstDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeathRegstDate() {
        return deathRegstDate;
    }

    /**
     * Sets the value of the deathRegstDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeathRegstDate(String value) {
        this.deathRegstDate = value;
    }

    /**
     * Gets the value of the deathRegstNo property.
     * 
     */
    public long getDeathRegstNo() {
        return deathRegstNo;
    }

    /**
     * Sets the value of the deathRegstNo property.
     * 
     */
    public void setDeathRegstNo(long value) {
        this.deathRegstNo = value;
    }

    /**
     * Gets the value of the deathSanadPrepAuth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeathSanadPrepAuth() {
        return deathSanadPrepAuth;
    }

    /**
     * Sets the value of the deathSanadPrepAuth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeathSanadPrepAuth(String value) {
        this.deathSanadPrepAuth = value;
    }

    /**
     * Gets the value of the deathSanadSeri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeathSanadSeri() {
        return deathSanadSeri;
    }

    /**
     * Sets the value of the deathSanadSeri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeathSanadSeri(String value) {
        this.deathSanadSeri = value;
    }

    /**
     * Gets the value of the deathSanadSrno property.
     * 
     */
    public int getDeathSanadSrno() {
        return deathSanadSrno;
    }

    /**
     * Sets the value of the deathSanadSrno property.
     * 
     */
    public void setDeathSanadSrno(int value) {
        this.deathSanadSrno = value;
    }

    /**
     * Gets the value of the deathWitnessInfo1 property.
     * 
     * @return
     *     possible object is
     *     {@link DeathWitnessInfo }
     *     
     */
    public DeathWitnessInfo getDeathWitnessInfo1() {
        return deathWitnessInfo1;
    }

    /**
     * Sets the value of the deathWitnessInfo1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeathWitnessInfo }
     *     
     */
    public void setDeathWitnessInfo1(DeathWitnessInfo value) {
        this.deathWitnessInfo1 = value;
    }

    /**
     * Gets the value of the deathWitnessInfo2 property.
     * 
     * @return
     *     possible object is
     *     {@link DeathWitnessInfo }
     *     
     */
    public DeathWitnessInfo getDeathWitnessInfo2() {
        return deathWitnessInfo2;
    }

    /**
     * Sets the value of the deathWitnessInfo2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeathWitnessInfo }
     *     
     */
    public void setDeathWitnessInfo2(DeathWitnessInfo value) {
        this.deathWitnessInfo2 = value;
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
     * Gets the value of the fatherHozeh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherHozeh() {
        return fatherHozeh;
    }

    /**
     * Sets the value of the fatherHozeh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherHozeh(String value) {
        this.fatherHozeh = value;
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
     * Gets the value of the fatherShenasIssuePlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFatherShenasIssuePlace() {
        return fatherShenasIssuePlace;
    }

    /**
     * Sets the value of the fatherShenasIssuePlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFatherShenasIssuePlace(String value) {
        this.fatherShenasIssuePlace = value;
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
     * Gets the value of the foreignCityStateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignCityStateName() {
        return foreignCityStateName;
    }

    /**
     * Sets the value of the foreignCityStateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignCityStateName(String value) {
        this.foreignCityStateName = value;
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
     * Gets the value of the motherHozeh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherHozeh() {
        return motherHozeh;
    }

    /**
     * Sets the value of the motherHozeh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherHozeh(String value) {
        this.motherHozeh = value;
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
     * Gets the value of the motherShenasIssuePlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherShenasIssuePlace() {
        return motherShenasIssuePlace;
    }

    /**
     * Sets the value of the motherShenasIssuePlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherShenasIssuePlace(String value) {
        this.motherShenasIssuePlace = value;
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
     */
    public short getOfficeCode() {
        return officeCode;
    }

    /**
     * Sets the value of the officeCode property.
     * 
     */
    public void setOfficeCode(short value) {
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
     * Gets the value of the personOccupation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonOccupation() {
        return personOccupation;
    }

    /**
     * Sets the value of the personOccupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonOccupation(String value) {
        this.personOccupation = value;
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
     * Gets the value of the sanadIssueOfficeCode property.
     * 
     */
    public short getSanadIssueOfficeCode() {
        return sanadIssueOfficeCode;
    }

    /**
     * Sets the value of the sanadIssueOfficeCode property.
     * 
     */
    public void setSanadIssueOfficeCode(short value) {
        this.sanadIssueOfficeCode = value;
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
     * Gets the value of the shenasSeri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShenasSeri() {
        return shenasSeri;
    }

    /**
     * Sets the value of the shenasSeri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShenasSeri(String value) {
        this.shenasSeri = value;
    }

    /**
     * Gets the value of the shenasSrno property.
     * 
     */
    public int getShenasSrno() {
        return shenasSrno;
    }

    /**
     * Sets the value of the shenasSrno property.
     * 
     */
    public void setShenasSrno(int value) {
        this.shenasSrno = value;
    }

    /**
     * Gets the value of the shenasnameIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShenasnameIssueDate() {
        return shenasnameIssueDate;
    }

    /**
     * Sets the value of the shenasnameIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShenasnameIssueDate(String value) {
        this.shenasnameIssueDate = value;
    }

    /**
     * Gets the value of the shenasnameNo property.
     * 
     */
    public int getShenasnameNo() {
        return shenasnameNo;
    }

    /**
     * Sets the value of the shenasnameNo property.
     * 
     */
    public void setShenasnameNo(int value) {
        this.shenasnameNo = value;
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

}
