
package ec.com.grupotvcable.wsdlmcafeeconsultaweb;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "WsdlMcAfeeConsultaWeb", targetNamespace = "http://www.grupotvcable.com.ec/WsdlMcAfeeConsultaWeb/")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface WsdlMcAfeeConsultaWeb {

	@WebMethod(operationName = "Consultar", action = "http://www.grupotvcable.com.ec/WsdlMcAfeeConsultaWeb/WsdlMcAfeeConsultaWeb")
	@WebResult(name = "Respuesta", targetNamespace = "http://www.grupotvcable.com.ec/WsdlMcAfeeConsultaWeb/")
	public Respuesta consultar(
			@WebParam(name = "Correo", targetNamespace = "http://www.grupotvcable.com.ec/WsdlMcAfeeConsultaWeb/")
			String Correo,
			@WebParam(name = "Clave", targetNamespace = "http://www.grupotvcable.com.ec/WsdlMcAfeeConsultaWeb/")
			String Clave);

	@WebMethod(operationName = "RecuperarClave", action = "")
	@WebResult(name = "RespuestaClave", targetNamespace = "http://www.grupotvcable.com.ec/WsdlMcAfeeConsultaWeb/")
	public RespuestaClave recuperarClave(
			@WebParam(name = "Correo", targetNamespace = "http://www.grupotvcable.com.ec/WsdlMcAfeeConsultaWeb/")
			String Correo);

}
