
package https.partners_compuredes_com_co.mcafee;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Holder;

@WebService(name = "wsCrLoginSvcSoap", targetNamespace = "https://partners.compuredes.com.co/mcafee")
@SOAPBinding(use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.WRAPPED)
public interface wsCrLoginSvcSoap {

	@WebMethod(operationName = "wmCreateSession", action = "https://partners.compuredes.com.co/mcafee/wmCreateSession")
	@WebResult(name = "wmCreateSessionResult", targetNamespace = "https://partners.compuredes.com.co/mcafee")
	public String wmCreateSession(
			@WebParam(name = "tipoLogin", targetNamespace = "https://partners.compuredes.com.co/mcafee")
			int tipoLogin,
			@WebParam(name = "clsHeader", targetNamespace = "https://partners.compuredes.com.co/mcafee", header = true, mode = WebParam.Mode.INOUT)
			Holder<ClsHeader> clsHeader);

}
