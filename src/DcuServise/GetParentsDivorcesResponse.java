
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
 *         &lt;element name="getParentsDivorcesReturn" type="{http://Server}divorcesInfo"/>
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
    "getParentsDivorcesReturn"
})
@XmlRootElement(name = "getParentsDivorcesResponse")
public class GetParentsDivorcesResponse {

    @XmlElement(required = true)
    protected DivorcesInfo getParentsDivorcesReturn;

    /**
     * Gets the value of the getParentsDivorcesReturn property.
     * 
     * @return
     *     possible object is
     *     {@link DivorcesInfo }
     *     
     */
    public DivorcesInfo getGetParentsDivorcesReturn() {
        return getParentsDivorcesReturn;
    }

    /**
     * Sets the value of the getParentsDivorcesReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DivorcesInfo }
     *     
     */
    public void setGetParentsDivorcesReturn(DivorcesInfo value) {
        this.getParentsDivorcesReturn = value;
    }

}
