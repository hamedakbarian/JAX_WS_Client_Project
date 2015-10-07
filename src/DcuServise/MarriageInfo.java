
package DcuServise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for marriageInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="marriageInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeActiveFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dbCommitDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="expiryDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="foHusbandPersonalityNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="foWifePersonalityNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="foreignStatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="grantDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="husbandNin" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="inactiveMarriageReasonCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mamoorId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="marriageConfirmAutCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="marriageDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="marriageId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="marriageRegstRefCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="marriageTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="officeCode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="regstAu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="regstDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="regstGeoSerial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="regstNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wifeNin" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "marriageInfo", propOrder = {
    "codeActiveFlag",
    "dbCommitDate",
    "expiryDate",
    "foHusbandPersonalityNo",
    "foWifePersonalityNo",
    "foreignStatusCode",
    "grantDate",
    "husbandNin",
    "inactiveMarriageReasonCode",
    "mamoorId",
    "marriageConfirmAutCode",
    "marriageDate",
    "marriageId",
    "marriageRegstRefCode",
    "marriageTypeCode",
    "officeCode",
    "regstAu",
    "regstDate",
    "regstGeoSerial",
    "regstNo",
    "userId",
    "wifeNin"
})
public class MarriageInfo {

    @XmlElement(required = true, nillable = true)
    protected String codeActiveFlag;
    @XmlElement(required = true, nillable = true)
    protected String dbCommitDate;
    @XmlElement(required = true, nillable = true)
    protected String expiryDate;
    @XmlElement(required = true, nillable = true)
    protected String foHusbandPersonalityNo;
    @XmlElement(required = true, nillable = true)
    protected String foWifePersonalityNo;
    @XmlElement(required = true, nillable = true)
    protected String foreignStatusCode;
    @XmlElement(required = true, nillable = true)
    protected String grantDate;
    protected long husbandNin;
    @XmlElement(required = true, nillable = true)
    protected String inactiveMarriageReasonCode;
    @XmlElement(required = true, nillable = true)
    protected String mamoorId;
    @XmlElement(required = true, nillable = true)
    protected String marriageConfirmAutCode;
    @XmlElement(required = true, nillable = true)
    protected String marriageDate;
    protected long marriageId;
    @XmlElement(required = true, nillable = true)
    protected String marriageRegstRefCode;
    @XmlElement(required = true, nillable = true)
    protected String marriageTypeCode;
    protected short officeCode;
    @XmlElement(required = true, nillable = true)
    protected String regstAu;
    @XmlElement(required = true, nillable = true)
    protected String regstDate;
    @XmlElement(required = true, nillable = true)
    protected String regstGeoSerial;
    @XmlElement(required = true, nillable = true)
    protected String regstNo;
    @XmlElement(required = true, nillable = true)
    protected String userId;
    protected long wifeNin;

    /**
     * Gets the value of the codeActiveFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeActiveFlag() {
        return codeActiveFlag;
    }

    /**
     * Sets the value of the codeActiveFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeActiveFlag(String value) {
        this.codeActiveFlag = value;
    }

    /**
     * Gets the value of the dbCommitDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbCommitDate() {
        return dbCommitDate;
    }

    /**
     * Sets the value of the dbCommitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbCommitDate(String value) {
        this.dbCommitDate = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryDate(String value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the foHusbandPersonalityNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoHusbandPersonalityNo() {
        return foHusbandPersonalityNo;
    }

    /**
     * Sets the value of the foHusbandPersonalityNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoHusbandPersonalityNo(String value) {
        this.foHusbandPersonalityNo = value;
    }

    /**
     * Gets the value of the foWifePersonalityNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoWifePersonalityNo() {
        return foWifePersonalityNo;
    }

    /**
     * Sets the value of the foWifePersonalityNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoWifePersonalityNo(String value) {
        this.foWifePersonalityNo = value;
    }

    /**
     * Gets the value of the foreignStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignStatusCode() {
        return foreignStatusCode;
    }

    /**
     * Sets the value of the foreignStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignStatusCode(String value) {
        this.foreignStatusCode = value;
    }

    /**
     * Gets the value of the grantDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrantDate() {
        return grantDate;
    }

    /**
     * Sets the value of the grantDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrantDate(String value) {
        this.grantDate = value;
    }

    /**
     * Gets the value of the husbandNin property.
     * 
     */
    public long getHusbandNin() {
        return husbandNin;
    }

    /**
     * Sets the value of the husbandNin property.
     * 
     */
    public void setHusbandNin(long value) {
        this.husbandNin = value;
    }

    /**
     * Gets the value of the inactiveMarriageReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInactiveMarriageReasonCode() {
        return inactiveMarriageReasonCode;
    }

    /**
     * Sets the value of the inactiveMarriageReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInactiveMarriageReasonCode(String value) {
        this.inactiveMarriageReasonCode = value;
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
     * Gets the value of the marriageConfirmAutCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriageConfirmAutCode() {
        return marriageConfirmAutCode;
    }

    /**
     * Sets the value of the marriageConfirmAutCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriageConfirmAutCode(String value) {
        this.marriageConfirmAutCode = value;
    }

    /**
     * Gets the value of the marriageDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriageDate() {
        return marriageDate;
    }

    /**
     * Sets the value of the marriageDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriageDate(String value) {
        this.marriageDate = value;
    }

    /**
     * Gets the value of the marriageId property.
     * 
     */
    public long getMarriageId() {
        return marriageId;
    }

    /**
     * Sets the value of the marriageId property.
     * 
     */
    public void setMarriageId(long value) {
        this.marriageId = value;
    }

    /**
     * Gets the value of the marriageRegstRefCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriageRegstRefCode() {
        return marriageRegstRefCode;
    }

    /**
     * Sets the value of the marriageRegstRefCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriageRegstRefCode(String value) {
        this.marriageRegstRefCode = value;
    }

    /**
     * Gets the value of the marriageTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriageTypeCode() {
        return marriageTypeCode;
    }

    /**
     * Sets the value of the marriageTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriageTypeCode(String value) {
        this.marriageTypeCode = value;
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
     * Gets the value of the regstAu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegstAu() {
        return regstAu;
    }

    /**
     * Sets the value of the regstAu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegstAu(String value) {
        this.regstAu = value;
    }

    /**
     * Gets the value of the regstDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegstDate() {
        return regstDate;
    }

    /**
     * Sets the value of the regstDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegstDate(String value) {
        this.regstDate = value;
    }

    /**
     * Gets the value of the regstGeoSerial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegstGeoSerial() {
        return regstGeoSerial;
    }

    /**
     * Sets the value of the regstGeoSerial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegstGeoSerial(String value) {
        this.regstGeoSerial = value;
    }

    /**
     * Gets the value of the regstNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegstNo() {
        return regstNo;
    }

    /**
     * Sets the value of the regstNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegstNo(String value) {
        this.regstNo = value;
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
     * Gets the value of the wifeNin property.
     * 
     */
    public long getWifeNin() {
        return wifeNin;
    }

    /**
     * Sets the value of the wifeNin property.
     * 
     */
    public void setWifeNin(long value) {
        this.wifeNin = value;
    }

}
