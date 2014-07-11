
package https.partners_compuredes_com_co.mcafee;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "wsCrTransSvcSoap", targetNamespace = "https://partners.compuredes.com.co/mcafee")
@SOAPBinding(use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public interface wsCrTransSvcSoap {

	@WebMethod(operationName = "wmUpdateProfileTop", action = "https://partners.compuredes.com.co/mcafee/wmUpdateProfileTop")
	@WebResult(name = "wmUpdateProfileTopResult", targetNamespace = "https://partners.compuredes.com.co/mcafee")
	public String wmUpdateProfileTop(
			@WebParam(name = "OrderProfileTOP", targetNamespace = "https://partners.compuredes.com.co/mcafee")
			ClsContactTOP OrderProfileTOP,
			@WebParam(name = "sessionTransaction", targetNamespace = "https://partners.compuredes.com.co/mcafee")
			String sessionTransaction);

	@WebMethod(operationName = "wmOrderConsumer", action = "https://partners.compuredes.com.co/mcafee/wmOrderConsumer")
	@WebResult(name = "wmOrderConsumerResult", targetNamespace = "https://partners.compuredes.com.co/mcafee")
	public String wmOrderConsumer(
			@WebParam(name = "OrderConsumer", targetNamespace = "https://partners.compuredes.com.co/mcafee")
			ClsOrderTransConsumer OrderConsumer,
			@WebParam(name = "sessionTransaction", targetNamespace = "https://partners.compuredes.com.co/mcafee")
			String sessionTransaction);

	@WebMethod(operationName = "wmOrderTOP", action = "https://partners.compuredes.com.co/mcafee/wmOrderTOP")
	@WebResult(name = "wmOrderTOPResult", targetNamespace = "https://partners.compuredes.com.co/mcafee")
	public String wmOrderTOP(
			@WebParam(name = "OrderTransTOP", targetNamespace = "https://partners.compuredes.com.co/mcafee")
			ClsOrderTransTOP OrderTransTOP,
			@WebParam(name = "sessionTransaction", targetNamespace = "https://partners.compuredes.com.co/mcafee")
			String sessionTransaction);

}
