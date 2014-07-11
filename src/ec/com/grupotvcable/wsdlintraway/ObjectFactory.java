
package ec.com.grupotvcable.wsdlintraway;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ec.com.grupotvcable.wsdlintraway package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.com.grupotvcable.wsdlintraway
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Interfaz }
     * 
     */
    public Interfaz createInterfaz() {
        return new Interfaz();
    }

    /**
     * Create an instance of {@link Mensaje }
     * 
     */
    public Mensaje createMensaje() {
        return new Mensaje();
    }

    /**
     * Create an instance of {@link Cabecera }
     * 
     */
    public Cabecera createCabecera() {
        return new Cabecera();
    }

    /**
     * Create an instance of {@link Respuesta }
     * 
     */
    public Respuesta createRespuesta() {
        return new Respuesta();
    }

    /**
     * Create an instance of {@link Estandar }
     * 
     */
    public Estandar createEstandar() {
        return new Estandar();
    }

    /**
     * Create an instance of {@link Comando }
     * 
     */
    public Comando createComando() {
        return new Comando();
    }

    /**
     * Create an instance of {@link Detalle }
     * 
     */
    public Detalle createDetalle() {
        return new Detalle();
    }

    /**
     * Create an instance of {@link AprovIntraway }
     * 
     */
    public AprovIntraway createAprovIntraway() {
        return new AprovIntraway();
    }

    /**
     * Create an instance of {@link AprovIntrawayResponse }
     * 
     */
    public AprovIntrawayResponse createAprovIntrawayResponse() {
        return new AprovIntrawayResponse();
    }

    /**
     * Create an instance of {@link Intraway }
     * 
     */
    public Intraway createIntraway() {
        return new Intraway();
    }

}
