
package DcuServise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for marriagesInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="marriagesInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="marriages" type="{http://Server}ArrayOfmarriageInfo"/>
 *         &lt;element name="returnMessage" type="{http://Server}ReturnMessage"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "marriagesInfo", propOrder = {
    "marriages",
    "returnMessage"
})
public class MarriagesInfo {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfmarriageInfo marriages;
    @XmlElement(required = true, nillable = true)
    protected ReturnMessage returnMessage;

    /**
     * Gets the value of the marriages property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfmarriageInfo }
     *     
     */
    public ArrayOfmarriageInfo getMarriages() {
        return marriages;
    }

    /**
     * Sets the value of the marriages property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfmarriageInfo }
     *     
     */
    public void setMarriages(ArrayOfmarriageInfo value) {
        this.marriages = value;
    }

    /**
     * Gets the value of the returnMessage property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnMessage }
     *     
     */
    public ReturnMessage getReturnMessage() {
        return returnMessage;
    }

    /**
     * Sets the value of the returnMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnMessage }
     *     
     */
    public void setReturnMessage(ReturnMessage value) {
        this.returnMessage = value;
    }

}
