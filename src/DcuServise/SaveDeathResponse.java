
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
 *         &lt;element name="saveDeathReturn" type="{http://Server}ReturnMessage"/>
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
    "saveDeathReturn"
})
@XmlRootElement(name = "saveDeathResponse")
public class SaveDeathResponse {

    @XmlElement(required = true)
    protected ReturnMessage saveDeathReturn;

    /**
     * Gets the value of the saveDeathReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnMessage }
     *     
     */
    public ReturnMessage getSaveDeathReturn() {
        return saveDeathReturn;
    }

    /**
     * Sets the value of the saveDeathReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnMessage }
     *     
     */
    public void setSaveDeathReturn(ReturnMessage value) {
        this.saveDeathReturn = value;
    }

}
