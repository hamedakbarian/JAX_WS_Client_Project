
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
 *         &lt;element name="saveDivorceReturn" type="{http://Server}ReturnMessage"/>
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
    "saveDivorceReturn"
})
@XmlRootElement(name = "saveDivorceResponse")
public class SaveDivorceResponse {

    @XmlElement(required = true)
    protected ReturnMessage saveDivorceReturn;

    /**
     * Gets the value of the saveDivorceReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnMessage }
     *     
     */
    public ReturnMessage getSaveDivorceReturn() {
        return saveDivorceReturn;
    }

    /**
     * Sets the value of the saveDivorceReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnMessage }
     *     
     */
    public void setSaveDivorceReturn(ReturnMessage value) {
        this.saveDivorceReturn = value;
    }

}
