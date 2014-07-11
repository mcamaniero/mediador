
package ec.com.grupotvcable.wsdltvpagada;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "WsdlTvPagada", targetNamespace = "http://www.grupotvcable.com.ec/WsdlTvPagada/")
@SOAPBinding(use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface WsdlTvPagada {

	@WebMethod(operationName = "AprovTvPagada", action = "http://www.grupotvcable.com.ec/WsdlTvPagada/AprovTvPagada")
	@WebResult(name = "consultaRespuesta", targetNamespace = "http://www.grupotvcable.com.ec/WsdlTvPagada/")
	public Respuesta aprovTvPagada(
			@WebParam(name = "ejecutaComando", targetNamespace = "http://www.grupotvcable.com.ec/WsdlTvPagada/")
			Comando ejecutaComando);

}
