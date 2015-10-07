
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
 *         &lt;element name="getPersonDivorcesReturn" type="{http://Server}divorcesInfo"/>
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
    "getPersonDivorcesReturn"
})
@XmlRootElement(name = "getPersonDivorcesResponse")
public class GetPersonDivorcesResponse {

    @XmlElement(required = true)
    protected DivorcesInfo getPersonDivorcesReturn;

    /**
     * Gets the value of the getPersonDivorcesReturn property.
     * 
     * @return
     *     possible object is
     *     {@link DivorcesInfo }
     *     
     */
    public DivorcesInfo getGetPersonDivorcesReturn() {
        return getPersonDivorcesReturn;
    }

    /**
     * Sets the value of the getPersonDivorcesReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DivorcesInfo }
     *     
     */
    public void setGetPersonDivorcesReturn(DivorcesInfo value) {
        this.getPersonDivorcesReturn = value;
    }

}
