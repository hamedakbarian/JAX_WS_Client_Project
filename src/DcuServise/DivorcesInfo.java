
package DcuServise;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for divorcesInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="divorcesInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="divorces" type="{http://Server}ArrayOfdivorceInfo"/>
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
@XmlType(name = "divorcesInfo", propOrder = {
    "divorces",
    "returnMessage"
})
public class DivorcesInfo {

    @XmlElement(required = true, nillable = true)
    protected ArrayOfdivorceInfo divorces;
    @XmlElement(required = true, nillable = true)
    protected ReturnMessage returnMessage;

    /**
     * Gets the value of the divorces property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfdivorceInfo }
     *     
     */
    public ArrayOfdivorceInfo getDivorces() {
        return divorces;
    }

    /**
     * Sets the value of the divorces property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfdivorceInfo }
     *     
     */
    public void setDivorces(ArrayOfdivorceInfo value) {
        this.divorces = value;
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
