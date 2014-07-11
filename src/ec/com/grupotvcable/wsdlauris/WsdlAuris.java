
package ec.com.grupotvcable.wsdlauris;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "WsdlAuris", targetNamespace = "http://www.grupotvcable.com.ec/WsdlAuris/")
@SOAPBinding(use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public interface WsdlAuris {

	@WebMethod(operationName = "AprovAuris", action = "http://www.grupotvcable.com.ec/WsdlAuris/AprovAuris")
	@WebResult(name = "consultaRespuesta", targetNamespace = "http://www.grupotvcable.com.ec/WsdlAuris/")
	public Respuesta aprovAuris(
			@WebParam(name = "ejecutaComando", targetNamespace = "http://www.grupotvcable.com.ec/WsdlAuris/")
			Comando ejecutaComando);

}
