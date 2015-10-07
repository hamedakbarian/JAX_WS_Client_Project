
package DcuServise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for divorceInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="divorceInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeActiveFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dbCommitDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="divorceConfirmAutCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="divorceDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="divorceId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="divorceRegstRefCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="divorceTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="foHusbandPersonalityNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="foWifePersonalityNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="foreignStatusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="graceDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="husbandNin" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="inactiveDivorceReasonCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mamoorId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="marriageDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="officeCode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="regstAu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="regstDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="regstGeoSerial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="regstNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reversionDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "divorceInfo", propOrder = {
    "codeActiveFlag",
    "dbCommitDate",
    "divorceConfirmAutCode",
    "divorceDate",
    "divorceId",
    "divorceRegstRefCode",
    "divorceTypeCode",
    "foHusbandPersonalityNo",
    "foWifePersonalityNo",
    "foreignStatusCode",
    "graceDate",
    "husbandNin",
    "inactiveDivorceReasonCode",
    "mamoorId",
    "marriageDate",
    "officeCode",
    "regstAu",
    "regstDate",
    "regstGeoSerial",
    "regstNo",
    "reversionDate",
    "userId",
    "wifeNin"
})
public class DivorceInfo {

    @XmlElement(required = true, nillable = true)
    protected String codeActiveFlag;
    @XmlElement(required = true, nillable = true)
    protected String dbCommitDate;
    @XmlElement(required = true, nillable = true)
    protected String divorceConfirmAutCode;
    @XmlElement(required = true, nillable = true)
    protected String divorceDate;
    protected long divorceId;
    @XmlElement(required = true, nillable = true)
    protected String divorceRegstRefCode;
    @XmlElement(required = true, nillable = true)
    protected String divorceTypeCode;
    @XmlElement(required = true, nillable = true)
    protected String foHusbandPersonalityNo;
    @XmlElement(required = true, nillable = true)
    protected String foWifePersonalityNo;
    @XmlElement(required = true, nillable = true)
    protected String foreignStatusCode;
    @XmlElement(required = true, nillable = true)
    protected String graceDate;
    protected long husbandNin;
    @XmlElement(required = true, nillable = true)
    protected String inactiveDivorceReasonCode;
    @XmlElement(required = true, nillable = true)
    protected String mamoorId;
    @XmlElement(required = true, nillable = true)
    protected String marriageDate;
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
    protected String reversionDate;
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
     * Gets the value of the divorceConfirmAutCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivorceConfirmAutCode() {
        return divorceConfirmAutCode;
    }

    /**
     * Sets the value of the divorceConfirmAutCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivorceConfirmAutCode(String value) {
        this.divorceConfirmAutCode = value;
    }

    /**
     * Gets the value of the divorceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivorceDate() {
        return divorceDate;
    }

    /**
     * Sets the value of the divorceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivorceDate(String value) {
        this.divorceDate = value;
    }

    /**
     * Gets the value of the divorceId property.
     * 
     */
    public long getDivorceId() {
        return divorceId;
    }

    /**
     * Sets the value of the divorceId property.
     * 
     */
    public void setDivorceId(long value) {
        this.divorceId = value;
    }

    /**
     * Gets the value of the divorceRegstRefCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivorceRegstRefCode() {
        return divorceRegstRefCode;
    }

    /**
     * Sets the value of the divorceRegstRefCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivorceRegstRefCode(String value) {
        this.divorceRegstRefCode = value;
    }

    /**
     * Gets the value of the divorceTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDivorceTypeCode() {
        return divorceTypeCode;
    }

    /**
     * Sets the value of the divorceTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDivorceTypeCode(String value) {
        this.divorceTypeCode = value;
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
     * Gets the value of the graceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraceDate() {
        return graceDate;
    }

    /**
     * Sets the value of the graceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraceDate(String value) {
        this.graceDate = value;
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
     * Gets the value of the inactiveDivorceReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInactiveDivorceReasonCode() {
        return inactiveDivorceReasonCode;
    }

    /**
     * Sets the value of the inactiveDivorceReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInactiveDivorceReasonCode(String value) {
        this.inactiveDivorceReasonCode = value;
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
     * Gets the value of the reversionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReversionDate() {
        return reversionDate;
    }

    /**
     * Sets the value of the reversionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReversionDate(String value) {
        this.reversionDate = value;
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
