
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
 *         &lt;element name="finalConfirmedShenasnameReturn" type="{http://Server}ReturnMessage"/>
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
    "finalConfirmedShenasnameReturn"
})
@XmlRootElement(name = "finalConfirmedShenasnameResponse")
public class FinalConfirmedShenasnameResponse {

    @XmlElement(required = true)
    protected ReturnMessage finalConfirmedShenasnameReturn;

    /**
     * Gets the value of the finalConfirmedShenasnameReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnMessage }
     *     
     */
    public ReturnMessage getFinalConfirmedShenasnameReturn() {
        return finalConfirmedShenasnameReturn;
    }

    /**
     * Sets the value of the finalConfirmedShenasnameReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnMessage }
     *     
     */
    public void setFinalConfirmedShenasnameReturn(ReturnMessage value) {
        this.finalConfirmedShenasnameReturn = value;
    }

}
