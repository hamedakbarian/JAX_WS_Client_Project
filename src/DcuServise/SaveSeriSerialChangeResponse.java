
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
 *         &lt;element name="saveSeriSerialChangeReturn" type="{http://Server}ReturnMessage"/>
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
    "saveSeriSerialChangeReturn"
})
@XmlRootElement(name = "saveSeriSerialChangeResponse")
public class SaveSeriSerialChangeResponse {

    @XmlElement(required = true)
    protected ReturnMessage saveSeriSerialChangeReturn;

    /**
     * Gets the value of the saveSeriSerialChangeReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnMessage }
     *     
     */
    public ReturnMessage getSaveSeriSerialChangeReturn() {
        return saveSeriSerialChangeReturn;
    }

    /**
     * Sets the value of the saveSeriSerialChangeReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnMessage }
     *     
     */
    public void setSaveSeriSerialChangeReturn(ReturnMessage value) {
        this.saveSeriSerialChangeReturn = value;
    }

}
