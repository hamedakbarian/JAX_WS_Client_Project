
package DcuServise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnnouncerInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnnouncerInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addRecSerial" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ancrAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ancrAddressGeoSerial" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ancrDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ancrFname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ancrHozeh" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ancrHozehCode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="ancrHozehKind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ancrLetterDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ancrLetterNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ancrName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ancrNin" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ancrOfficeCode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="ancrReferenceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ancrRelationCode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="ancrShenasIssuePlace" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ancrShenasNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ancrZipCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="personNin" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnouncerInfo", namespace = "http://info.model.dcu", propOrder = {
    "addRecSerial",
    "ancrAddress",
    "ancrAddressGeoSerial",
    "ancrDateOfBirth",
    "ancrFname",
    "ancrHozeh",
    "ancrHozehCode",
    "ancrHozehKind",
    "ancrLetterDate",
    "ancrLetterNo",
    "ancrName",
    "ancrNin",
    "ancrOfficeCode",
    "ancrReferenceName",
    "ancrRelationCode",
    "ancrShenasIssuePlace",
    "ancrShenasNo",
    "ancrZipCode",
    "personNin"
})
public class AnnouncerInfo {

    protected int addRecSerial;
    @XmlElement(required = true, nillable = true)
    protected String ancrAddress;
    protected int ancrAddressGeoSerial;
    @XmlElement(required = true, nillable = true)
    protected String ancrDateOfBirth;
    @XmlElement(required = true, nillable = true)
    protected String ancrFname;
    @XmlElement(required = true, nillable = true)
    protected String ancrHozeh;
    protected short ancrHozehCode;
    @XmlElement(required = true, nillable = true)
    protected String ancrHozehKind;
    @XmlElement(required = true, nillable = true)
    protected String ancrLetterDate;
    @XmlElement(required = true, nillable = true)
    protected String ancrLetterNo;
    @XmlElement(required = true, nillable = true)
    protected String ancrName;
    protected long ancrNin;
    protected short ancrOfficeCode;
    @XmlElement(required = true, nillable = true)
    protected String ancrReferenceName;
    protected short ancrRelationCode;
    @XmlElement(required = true, nillable = true)
    protected String ancrShenasIssuePlace;
    protected int ancrShenasNo;
    protected long ancrZipCode;
    protected long personNin;

    /**
     * Gets the value of the addRecSerial property.
     * 
     */
    public int getAddRecSerial() {
        return addRecSerial;
    }

    /**
     * Sets the value of the addRecSerial property.
     * 
     */
    public void setAddRecSerial(int value) {
        this.addRecSerial = value;
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
     * Gets the value of the ancrHozeh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAncrHozeh() {
        return ancrHozeh;
    }

    /**
     * Sets the value of the ancrHozeh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAncrHozeh(String value) {
        this.ancrHozeh = value;
    }

    /**
     * Gets the value of the ancrHozehCode property.
     * 
     */
    public short getAncrHozehCode() {
        return ancrHozehCode;
    }

    /**
     * Sets the value of the ancrHozehCode property.
     * 
     */
    public void setAncrHozehCode(short value) {
        this.ancrHozehCode = value;
    }

    /**
     * Gets the value of the ancrHozehKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAncrHozehKind() {
        return ancrHozehKind;
    }

    /**
     * Sets the value of the ancrHozehKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAncrHozehKind(String value) {
        this.ancrHozehKind = value;
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
     * Gets the value of the ancrRelationCode property.
     * 
     */
    public short getAncrRelationCode() {
        return ancrRelationCode;
    }

    /**
     * Sets the value of the ancrRelationCode property.
     * 
     */
    public void setAncrRelationCode(short value) {
        this.ancrRelationCode = value;
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

}
