
package ec.com.grupotvcable.wsdlauditoria;

import javax.jws.WebService;

import com.app.intraway.conciliacion.Internet;
import com.app.intraway.conciliacion.Telefonia;

@WebService(serviceName = "WsdlAuditoria", targetNamespace = "http://www.grupotvcable.com.ec/WsdlAuditoria", endpointInterface = "ec.com.grupotvcable.wsdlauditoria.WsdlAuditoria")
public class WsdlAuditoriaImpl implements WsdlAuditoria {

	public String auditoriaIwSafari(final String Tipo, final String Sesion,
			String AuthKey) {

		System.out.println("Tipo: " + Tipo);
		System.out.println("Sesion: " + Sesion);
		System.out.println("AuthKey: " + AuthKey);

		/* Tipo
		 * 101 Internet 
		 * 102 Telefonia eMTA
		 * 103 Telefonia SIP
		 * 104 E1s
		 * 105 Internet y Telefonia(SIP/eMTA)
		 */

		if (AuthKey.equals("key-secreto-auditoria-titan")) {
			new Thread() {
				public void run() {
					switch (Integer.parseInt(Tipo)) {
					case 101: {
						new Internet(Integer.parseInt(Sesion), false, false);
						break;
					}
					case 102: {
						new Telefonia(Integer.parseInt(Sesion), false, false, "eMTA Line");
						break;
					}
					case 103: {
						new Telefonia(Integer.parseInt(Sesion), false, false, "SIP Line");
						break;
					}
					case 104: {
						new Telefonia(Integer.parseInt(Sesion), false, false, "Troncal E1");
						break;
					}
					case 105: {
						new Thread(){
							public void run(){
								new Internet(Integer.parseInt(Sesion), false, false);
							}
						}.start();

						new Thread(){
							public void run(){
								new Telefonia(Integer.parseInt(Sesion), false, false,"");
							}
						}.start();


						break;
					}
					}

				}
			}.start();
			return "Procesando";
		} else {
			return "AuthKey Incorrecto";
		}

	}

}
