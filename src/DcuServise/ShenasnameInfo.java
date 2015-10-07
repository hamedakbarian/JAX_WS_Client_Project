
package DcuServise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for shenasnameInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="shenasnameInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="docIssueDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="personNin" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="shenasnameSeri" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shenasnameSrno" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "shenasnameInfo", propOrder = {
    "docIssueDate",
    "personNin",
    "shenasnameSeri",
    "shenasnameSrno",
    "userId"
})
public class ShenasnameInfo {

    @XmlElement(required = true, nillable = true)
    protected String docIssueDate;
    protected long personNin;
    @XmlElement(required = true, nillable = true)
    protected String shenasnameSeri;
    @XmlElement(required = true, nillable = true)
    protected String shenasnameSrno;
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
