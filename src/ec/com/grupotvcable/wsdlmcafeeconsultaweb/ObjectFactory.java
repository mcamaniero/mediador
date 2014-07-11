
package ec.com.grupotvcable.wsdlmcafeeconsultaweb;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ec.com.grupotvcable.wsdlmcafeeconsultaweb package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.com.grupotvcable.wsdlmcafeeconsultaweb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultaResponse }
     * 
     */
    public ConsultaResponse createConsultaResponse() {
        return new ConsultaResponse();
    }

    /**
     * Create an instance of {@link RespuestaClave }
     * 
     */
    public RespuestaClave createRespuestaClave() {
        return new RespuestaClave();
    }

    /**
     * Create an instance of {@link Consulta }
     * 
     */
    public Consulta createConsulta() {
        return new Consulta();
    }

    /**
     * Create an instance of {@link Respuesta }
     * 
     */
    public Respuesta createRespuesta() {
        return new Respuesta();
    }

}
