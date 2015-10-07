
package DcuServise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sanadInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sanadInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="docIssueDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="personNin" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="sanadSeri" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sanadSerialNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "sanadInfo", propOrder = {
    "docIssueDate",
    "personNin",
    "sanadSeri",
    "sanadSerialNo",
    "userId"
})
public class SanadInfo {

    @XmlElement(required = true, nillable = true)
    protected String docIssueDate;
    protected long personNin;
    @XmlElement(required = true, nillable = true)
    protected String sanadSeri;
    @XmlElement(required = true, nillable = true)
    protected String sanadSerialNo;
    @XmlElement(required = true, nillable = true)
    protected String userId;

    /**
     * Gets the value of the docIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocIssueDate() {
        return docIssueDate;
    }

    /**
     * Sets the value of the docIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocIssueDate(String value) {
        this.docIssueDate = value;
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
     * Gets the value of the sanadSerialNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSanadSerialNo() {
        return sanadSerialNo;
    }

    /**
     * Sets the value of the sanadSerialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSanadSerialNo(String value) {
        this.sanadSerialNo = value;
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
