
package https.partners_compuredes_com_co.mcafee;

import javax.jws.WebService;

@WebService(serviceName = "wsCrTransSvc", targetNamespace = "https://partners.compuredes.com.co/mcafee", endpointInterface = "https.partners_compuredes_com_co.mcafee.wsCrTransSvcSoap")
public class wsCrTransSvcImpl implements wsCrTransSvcSoap {

	public String wmUpdateProfileTop(ClsContactTOP OrderProfileTOP,
			String sessionTransaction) {
		throw new UnsupportedOperationException();
	}

	public String wmOrderConsumer(ClsOrderTransConsumer OrderConsumer,
			String sessionTransaction) {
		throw new UnsupportedOperationException();
	}

	public String wmOrderTOP(ClsOrderTransTOP OrderTransTOP,
			String sessionTransaction) {
		throw new UnsupportedOperationException();
	}

}
