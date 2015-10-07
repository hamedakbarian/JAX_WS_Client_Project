
package DcuServise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wifeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wifeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressGeoSerial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="educationCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="jobCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="personNin" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="religionCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sexCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="times" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wifeInfo", propOrder = {
    "addressGeoSerial",
    "educationCode",
    "jobCode",
    "personNin",
    "religionCode",
    "sexCode",
    "times"
})
public class WifeInfo {

    @XmlElement(required = true, nillable = true)
    protected String addressGeoSerial;
    @XmlElement(required = true, nillable = true)
    protected String educationCode;
    @XmlElement(required = true, nillable = true)
    protected String jobCode;
    protected long personNin;
    @XmlElement(required = true, nillable = true)
    protected String religionCode;
    @XmlElement(required = true, nillable = true)
    protected String sexCode;
    protected int times;

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
     * Gets the value of the educationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationCode() {
        return educationCode;
    }

    /**
     * Sets the value of the educationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationCode(String value) {
        this.educationCode = value;
    }

    /**
     * Gets the value of the jobCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobCode() {
        return jobCode;
    }

    /**
     * Sets the value of the jobCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobCode(String value) {
        this.jobCode = value;
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
     * Gets the value of the religionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReligionCode() {
        return religionCode;
    }

    /**
     * Sets the value of the religionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReligionCode(String value) {
        this.religionCode = value;
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
     * Gets the value of the times property.
     * 
     */
    public int getTimes() {
        return times;
    }

    /**
     * Sets the value of the times property.
     * 
     */
    public void setTimes(int value) {
        this.times = value;
    }

}
