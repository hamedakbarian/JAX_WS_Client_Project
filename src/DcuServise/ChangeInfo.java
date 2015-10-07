
package DcuServise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for changeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="changeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="changeActionTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="changeFormTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="formDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="newValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="personNin" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
@XmlType(name = "changeInfo", propOrder = {
    "changeActionTypeCode",
    "changeFormTypeCode",
    "formDate",
    "newValue",
    "personNin",
    "userId"
})
public class ChangeInfo {

    @XmlElement(required = true, nillable = true)
    protected String changeActionTypeCode;
    @XmlElement(required = true, nillable = true)
    protected String changeFormTypeCode;
    @XmlElement(required = true, nillable = true)
    protected String formDate;
    @XmlElement(required = true, nillable = true)
    protected String newValue;
    protected long personNin;
    @XmlElement(required = true, nillable = true)
    protected String userId;

    /**
     * Gets the value of the changeActionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeActionTypeCode() {
        return changeActionTypeCode;
    }

    /**
     * Sets the value of the changeActionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeActionTypeCode(String value) {
        this.changeActionTypeCode = value;
    }

    /**
     * Gets the value of the changeFormTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeFormTypeCode() {
        return changeFormTypeCode;
    }

    /**
     * Sets the value of the changeFormTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeFormTypeCode(String value) {
        this.changeFormTypeCode = value;
    }

    /**
     * Gets the value of the formDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormDate() {
        return formDate;
    }

    /**
     * Sets the value of the formDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormDate(String value) {
        this.formDate = value;
    }

    /**
     * Gets the value of the newValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewValue() {
        return newValue;
    }

    /**
     * Sets the value of the newValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewValue(String value) {
        this.newValue = value;
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
