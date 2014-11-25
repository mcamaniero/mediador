
package ec.com.grupotvcable.wsdlintraway2;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "WsdlIntraway", targetNamespace = "http://www.grupotvcable.com.ec/WsdlIntraway2/")
@SOAPBinding(use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface WsdlIntraway {


    @WebMethod(operationName = "AprovIntraway", action = "http://www.grupotvcable.com.ec/WsdlIntraway/AprovIntraway")
    @WebResult(name = "consultaRespuesta", targetNamespace = "http://www.grupotvcable.com.ec/WsdlIntraway2/")
    public Respuesta aprovIntraway(
        @WebParam(name = "ejecutaComando", targetNamespace = "http://www.grupotvcable.com.ec/WsdlIntraway2/")
        Comando ejecutaComando);

}
