
package ec.com.grupotvcable.wsdlsafari;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "WsdlSafari", targetNamespace = "http://www.grupotvcable.com.ec/WsdlSafari/")
@SOAPBinding(use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface WsdlSafari {

	@WebMethod(operationName = "AprovSafari", action = "http://www.grupotvcable.com.ec/WsdlSafari/AprovSafari")
	@WebResult(name = "consultaRespuesta", targetNamespace = "http://www.grupotvcable.com.ec/WsdlSafari/")
	public Respuesta aprovSafari(
			@WebParam(name = "ejecutaComando", targetNamespace = "http://www.grupotvcable.com.ec/WsdlSafari/")
			Comando ejecutaComando);

}
