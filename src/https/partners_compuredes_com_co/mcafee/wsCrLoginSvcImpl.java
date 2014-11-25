
package https.partners_compuredes_com_co.mcafee;

import javax.jws.WebService;
import javax.xml.ws.Holder;

@WebService(serviceName = "wsCrLoginSvc", targetNamespace = "https://partners.compuredes.com.co/mcafee", endpointInterface = "https.partners_compuredes_com_co.mcafee.wsCrLoginSvcSoap")
public class wsCrLoginSvcImpl implements wsCrLoginSvcSoap {

	public String wmCreateSession(int tipoLogin, Holder<ClsHeader> clsHeader) {
		throw new UnsupportedOperationException();
	}

}
