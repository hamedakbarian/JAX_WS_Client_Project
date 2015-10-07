
package DcuServise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="husbandInfo" type="{http://Server}wifeInfo"/>
 *         &lt;element name="wifeInfo" type="{http://Server}wifeInfo"/>
 *         &lt;element name="marriageInfo" type="{http://Server}marriageInfo"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "husbandInfo",
    "wifeInfo",
    "marriageInfo",
    "username",
    "password"
})
@XmlRootElement(name = "saveMarriage")
public class SaveMarriage {

    @XmlElement(required = true)
    protected WifeInfo husbandInfo;
    @XmlElement(required = true)
    protected WifeInfo wifeInfo;
    @XmlElement(required = true)
    protected MarriageInfo marriageInfo;
    @XmlElement(required = true)
    protected String username;
    @XmlElement(required = true)
    protected String password;

    /**
     * Gets the value of the husbandInfo property.
     * 
     * @return
     *     possible object is
     *     {@link WifeInfo }
     *     
     */
    public WifeInfo getHusbandInfo() {
        return husbandInfo;
    }

    /**
     * Sets the value of the husbandInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link WifeInfo }
     *     
     */
    public void setHusbandInfo(WifeInfo value) {
        this.husbandInfo = value;
    }

    /**
     * Gets the value of the wifeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link WifeInfo }
     *     
     */
    public WifeInfo getWifeInfo() {
        return wifeInfo;
    }

    /**
     * Sets the value of the wifeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link WifeInfo }
     *     
     */
    public void setWifeInfo(WifeInfo value) {
        this.wifeInfo = value;
    }

    /**
     * Gets the value of the marriageInfo property.
     * 
     * @return
     *     possible object is
     *     {@link MarriageInfo }
     *     
     */
    public MarriageInfo getMarriageInfo() {
        return marriageInfo;
    }

    /**
     * Sets the value of the marriageInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarriageInfo }
     *     
     */
    public void setMarriageInfo(MarriageInfo value) {
        this.marriageInfo = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

}
