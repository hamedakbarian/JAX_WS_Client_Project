
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
 *         &lt;element name="shenasnameConfirmReturn" type="{http://Server}ReturnMessage"/>
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
    "shenasnameConfirmReturn"
})
@XmlRootElement(name = "shenasnameConfirmResponse")
public class ShenasnameConfirmResponse {

    @XmlElement(required = true)
    protected ReturnMessage shenasnameConfirmReturn;

    /**
     * Gets the value of the shenasnameConfirmReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnMessage }
     *     
     */
    public ReturnMessage getShenasnameConfirmReturn() {
        return shenasnameConfirmReturn;
    }

    /**
     * Sets the value of the shenasnameConfirmReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnMessage }
     *     
     */
    public void setShenasnameConfirmReturn(ReturnMessage value) {
        this.shenasnameConfirmReturn = value;
    }

}
