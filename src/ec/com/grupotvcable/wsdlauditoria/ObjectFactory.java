
package ec.com.grupotvcable.wsdlauditoria;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ec.com.grupotvcable.wsdlauditoria package. 
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

    private final static QName _Negocio_QNAME = new QName("http://www.grupotvcable.com.ec/WsdlAuditoria/", "Negocio");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.com.grupotvcable.wsdlauditoria
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Auditoria }
     * 
     */
    public Auditoria createAuditoria() {
        return new Auditoria();
    }

    /**
     * Create an instance of {@link AuditoriaResponse }
     * 
     */
    public AuditoriaResponse createAuditoriaResponse() {
        return new AuditoriaResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.grupotvcable.com.ec/WsdlAuditoria/", name = "Negocio")
    public JAXBElement<String> createNegocio(String value) {
        return new JAXBElement<String>(_Negocio_QNAME, String.class, null, value);
    }

}
