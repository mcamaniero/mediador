
package ec.com.grupotvcable.wsdlauditoria;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "WsdlAuditoria", targetNamespace = "http://www.grupotvcable.com.ec")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface WsdlAuditoria {

	@WebMethod(operationName = "AuditoriaIwSafari", action = "")
	@WebResult(name = "Respuesta", targetNamespace = "http://www.grupotvcable.com.ec")
	public String auditoriaIwSafari(
			@WebParam(name = "Tipo", targetNamespace = "http://www.grupotvcable.com.ec")
			String Tipo,
			@WebParam(name = "Sesion", targetNamespace = "http://www.grupotvcable.com.ec")
			String Sesion,
			@WebParam(name = "AuthKey", targetNamespace = "http://www.grupotvcable.com.ec")
			String AuthKey);

}
