
package ec.com.grupotvcable.agenciavirtual;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "AgenciaVirtual", targetNamespace = "http://www.grupotvcable.com.ec/AgenciaVirtual/")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface AgenciaVirtual {

	@WebMethod(operationName = "RecuperarClave", action = "http://www.grupotvcable.com.ec/AgenciaVirtual/RecuperarClave")
	@WebResult(name = "Respuesta", targetNamespace = "http://www.grupotvcable.com.ec/AgenciaVirtual/")
	public Respuesta recuperarClave(
			@WebParam(name = "username", targetNamespace = "http://www.grupotvcable.com.ec/AgenciaVirtual/")
			String username,
			@WebParam(name = "dominio", targetNamespace = "http://www.grupotvcable.com.ec/AgenciaVirtual/")
			String dominio);

}
