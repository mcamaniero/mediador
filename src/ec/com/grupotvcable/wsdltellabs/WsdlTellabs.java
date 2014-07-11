
package ec.com.grupotvcable.wsdltellabs;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "WsdlTellabs", targetNamespace = "http://www.grupotvcable.com.ec/WsdlTellabs/")
@SOAPBinding(use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface WsdlTellabs {

	@WebMethod(operationName = "AprovTellabs", action = "/http://www.grupotvcable.com.ec/WsdlTellabs/AprovTellabs")
	@WebResult(name = "consultaRespuesta", targetNamespace = "http://www.grupotvcable.com.ec/WsdlTellabs/")
	public Respuesta aprovTellabs(
			@WebParam(name = "ejecutaComando", targetNamespace = "http://www.grupotvcable.com.ec/WsdlTellabs/")
			Comando ejecutaComando);

}
