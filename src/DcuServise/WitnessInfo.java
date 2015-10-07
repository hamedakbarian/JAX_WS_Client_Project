
package DcuServise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WitnessInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WitnessInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addRecSerial" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="personNin" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="radif" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rowId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="witnessAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="witnessAddressGeoSerial" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="witnessDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="witnessFname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="witnessHozeh" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="witnessHozehCode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="witnessHozehKind" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="witnessName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="witnessNin" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="witnessOfficeCode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="witnessShenasIssuePlace" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="witnessShenasNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="witnessZipCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WitnessInfo", namespace = "http://info.model.dcu", propOrder = {
    "addRecSerial",
    "personNin",
    "radif",
    "rowId",
    "witnessAddress",
    "witnessAddressGeoSerial",
    "witnessDateOfBirth",
    "witnessFname",
    "witnessHozeh",
    "witnessHozehCode",
    "witnessHozehKind",
    "witnessName",
    "witnessNin",
    "witnessOfficeCode",
    "witnessShenasIssuePlace",
    "witnessShenasNo",
    "witnessZipCode"
})
public class WitnessInfo {

    protected int addRecSerial;
    protected long personNin;
    protected int radif;
    protected int rowId;
    @XmlElement(required = true, nillable = true)
    protected String witnessAddress;
    protected int witnessAddressGeoSerial;
    @XmlElement(required = true, nillable = true)
    protected String witnessDateOfBirth;
    @XmlElement(required = true, nillable = true)
    protected String witnessFname;
    @XmlElement(required = true, nillable = true)
    protected String witnessHozeh;
    protected short witnessHozehCode;
    @XmlElement(required = true, nillable = true)
    protected String witnessHozehKind;
    @XmlElement(required = true, nillable = true)
    protected String witnessName;
    protected long witnessNin;
    protected short witnessOfficeCode;
    @XmlElement(required = true, nillable = true)
    protected String witnessShenasIssuePlace;
    protected int witnessShenasNo;
    protected long witnessZipCode;

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
     * Gets the value of the radif property.
     * 
     */
    public int getRadif() {
        return radif;
    }

    /**
     * Sets the value of the radif property.
     * 
     */
    public void setRadif(int value) {
        this.radif = value;
    }

    /**
     * Gets the value of the rowId property.
     * 
     */
    public int getRowId() {
        return rowId;
    }

    /**
     * Sets the value of the rowId property.
     * 
     */
    public void setRowId(int value) {
        this.rowId = value;
    }

    /**
     * Gets the value of the witnessAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWitnessAddress() {
        return witnessAddress;
    }

    /**
     * Sets the value of the witnessAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWitnessAddress(String value) {
        this.witnessAddress = value;
    }

    /**
     * Gets the value of the witnessAddressGeoSerial property.
     * 
     */
    public int getWitnessAddressGeoSerial() {
        return witnessAddressGeoSerial;
    }

    /**
     * Sets the value of the witnessAddressGeoSerial property.
     * 
     */
    public void setWitnessAddressGeoSerial(int value) {
        this.witnessAddressGeoSerial = value;
    }

    /**
     * Gets the value of the witnessDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWitnessDateOfBirth() {
        return witnessDateOfBirth;
    }

    /**
     * Sets the value of the witnessDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWitnessDateOfBirth(String value) {
        this.witnessDateOfBirth = value;
    }

    /**
     * Gets the value of the witnessFname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWitnessFname() {
        return witnessFname;
    }

    /**
     * Sets the value of the witnessFname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWitnessFname(String value) {
        this.witnessFname = value;
    }

    /**
     * Gets the value of the witnessHozeh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWitnessHozeh() {
        return witnessHozeh;
    }

    /**
     * Sets the value of the witnessHozeh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWitnessHozeh(String value) {
        this.witnessHozeh = value;
    }

    /**
     * Gets the value of the witnessHozehCode property.
     * 
     */
    public short getWitnessHozehCode() {
        return witnessHozehCode;
    }

    /**
     * Sets the value of the witnessHozehCode property.
     * 
     */
    public void setWitnessHozehCode(short value) {
        this.witnessHozehCode = value;
    }

    /**
     * Gets the value of the witnessHozehKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWitnessHozehKind() {
        return witnessHozehKind;
    }

    /**
     * Sets the value of the witnessHozehKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWitnessHozehKind(String value) {
        this.witnessHozehKind = value;
    }

    /**
     * Gets the value of the witnessName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWitnessName() {
        return witnessName;
    }

    /**
     * Sets the value of the witnessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWitnessName(String value) {
        this.witnessName = value;
    }

    /**
     * Gets the value of the witnessNin property.
     * 
     */
    public long getWitnessNin() {
        return witnessNin;
    }

    /**
     * Sets the value of the witnessNin property.
     * 
     */
    public void setWitnessNin(long value) {
        this.witnessNin = value;
    }

    /**
     * Gets the value of the witnessOfficeCode property.
     * 
     */
    public short getWitnessOfficeCode() {
        return witnessOfficeCode;
    }

    /**
     * Sets the value of the witnessOfficeCode property.
     * 
     */
    public void setWitnessOfficeCode(short value) {
        this.witnessOfficeCode = value;
    }

    /**
     * Gets the value of the witnessShenasIssuePlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWitnessShenasIssuePlace() {
        return witnessShenasIssuePlace;
    }

    /**
     * Sets the value of the witnessShenasIssuePlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWitnessShenasIssuePlace(String value) {
        this.witnessShenasIssuePlace = value;
    }

    /**
     * Gets the value of the witnessShenasNo property.
     * 
     */
    public int getWitnessShenasNo() {
        return witnessShenasNo;
    }

    /**
     * Sets the value of the witnessShenasNo property.
     * 
     */
    public void setWitnessShenasNo(int value) {
        this.witnessShenasNo = value;
    }

    /**
     * Gets the value of the witnessZipCode property.
     * 
     */
    public long getWitnessZipCode() {
        return witnessZipCode;
    }

    /**
     * Sets the value of the witnessZipCode property.
     * 
     */
    public void setWitnessZipCode(long value) {
        this.witnessZipCode = value;
    }

}
