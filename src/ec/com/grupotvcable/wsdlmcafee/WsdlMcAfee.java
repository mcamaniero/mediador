
package ec.com.grupotvcable.wsdlmcafee;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "WsdlMcAfee", targetNamespace = "http://www.grupotvcable.com.ec/WsdlMcAfee/")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface WsdlMcAfee {

	@WebMethod(operationName = "AprovMcAfee", action = "http://www.grupotvcable.com.ec/WsdlMcAfee/AprovMcAfee")
	@WebResult(name = "Respuesta", targetNamespace = "http://www.grupotvcable.com.ec/WsdlMcAfee/")
	public Respuesta aprovMcAfee(
			@WebParam(name = "IdEmpresa", targetNamespace = "http://www.grupotvcable.com.ec/WsdlMcAfee/")
			int IdEmpresa,
			@WebParam(name = "Sistema", targetNamespace = "http://www.grupotvcable.com.ec/WsdlMcAfee/")
			String Sistema,
			@WebParam(name = "Interfaz", targetNamespace = "http://www.grupotvcable.com.ec/WsdlMcAfee/")
			String Interfaz,
			@WebParam(name = "IdEstado", targetNamespace = "http://www.grupotvcable.com.ec/WsdlMcAfee/")
			String IdEstado,
			@WebParam(name = "Cuenta", targetNamespace = "http://www.grupotvcable.com.ec/WsdlMcAfee/")
			String Cuenta,
			@WebParam(name = "IdProducto", targetNamespace = "http://www.grupotvcable.com.ec/WsdlMcAfee/")
			String IdProducto,
			@WebParam(name = "Correo", targetNamespace = "http://www.grupotvcable.com.ec/WsdlMcAfee/")
			String Correo,
			@WebParam(name = "PlanMcAfeeTvCable", targetNamespace = "http://www.grupotvcable.com.ec/WsdlMcAfee/")
			int PlanMcAfeeTvCable,
			@WebParam(name = "ClienteCRM", targetNamespace = "http://www.grupotvcable.com.ec/WsdlMcAfee/")
			String ClienteCRM,
			@WebParam(name = "IdProductoCRM", targetNamespace = "http://www.grupotvcable.com.ec/WsdlMcAfee/")
			String IdProductoCRM,
			@WebParam(name = "IdMcAfee", targetNamespace = "http://www.grupotvcable.com.ec/WsdlMcAfee/")
			String IdMcAfee,
			@WebParam(name = "Referencia", targetNamespace = "http://www.grupotvcable.com.ec/WsdlMcAfee/")
			String Referencia,
			@WebParam(name = "Nombre", targetNamespace = "http://www.grupotvcable.com.ec/WsdlMcAfee/")
			String Nombre);

}
