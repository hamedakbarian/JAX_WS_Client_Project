
package Axis;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the Axis package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Temp_QNAME = new QName("http://example", "temp");
    private final static QName _SayHowAreYouFromReturn_QNAME = new QName("http://example", "sayHowAreYouFromReturn");
    private final static QName _HiWord_QNAME = new QName("http://example", "hiWord");
    private final static QName _SayHelloWorldFromReturn_QNAME = new QName("http://example", "sayHelloWorldFromReturn");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: Axis
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example", name = "temp")
    public JAXBElement<String> createTemp(String value) {
        return new JAXBElement<String>(_Temp_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example", name = "sayHowAreYouFromReturn")
    public JAXBElement<String> createSayHowAreYouFromReturn(String value) {
        return new JAXBElement<String>(_SayHowAreYouFromReturn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example", name = "hiWord")
    public JAXBElement<String> createHiWord(String value) {
        return new JAXBElement<String>(_HiWord_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://example", name = "sayHelloWorldFromReturn")
    public JAXBElement<String> createSayHelloWorldFromReturn(String value) {
        return new JAXBElement<String>(_SayHelloWorldFromReturn_QNAME, String.class, null, value);
    }

}
