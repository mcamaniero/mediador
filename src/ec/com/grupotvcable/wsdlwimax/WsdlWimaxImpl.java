
package ec.com.grupotvcable.wsdlwimax;

import javax.jws.WebService;

@WebService(serviceName = "WsdlWimax", targetNamespace = "http://www.grupotvcable.com.ec/WsdlWimax/", endpointInterface = "ec.com.grupotvcable.wsdlwimax.WsdlWimax")
public class WsdlWimaxImpl implements WsdlWimax {

	public Respuesta aprovWimax(Comando ejecutaComando) {
		Respuesta res = new Respuesta();
		res.setCabecera(ejecutaComando.getCabecera());
		Mensaje men = new Mensaje();
		men.setCodError(1);
		men.setDetMensaje("Comunicacion exitosa");
		res.setMensaje(men );
		
		return res;
	}

}
