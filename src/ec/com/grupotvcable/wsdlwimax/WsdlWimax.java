
package ec.com.grupotvcable.wsdlwimax;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "WsdlWimax", targetNamespace = "http://www.grupotvcable.com.ec/WsdlWimax/")
@SOAPBinding(use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface WsdlWimax {

	@WebMethod(operationName = "AprovWimax", action = "http://www.grupotvcable.com.ec/WsdlWimax/AprovWimax")
	@WebResult(name = "consultaRespuesta", targetNamespace = "http://www.grupotvcable.com.ec/WsdlWimax/")
	public Respuesta aprovWimax(
			@WebParam(name = "ejecutaComando", targetNamespace = "http://www.grupotvcable.com.ec/WsdlWimax/")
			Comando ejecutaComando);

}
