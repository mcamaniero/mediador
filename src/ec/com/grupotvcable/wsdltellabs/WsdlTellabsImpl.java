
package ec.com.grupotvcable.wsdltellabs;

import javax.jws.WebService;


@WebService(serviceName = "WsdlTellabs", targetNamespace = "http://www.grupotvcable.com.ec/WsdlTellabs/", endpointInterface = "ec.com.grupotvcable.wsdltellabs.WsdlTellabs")
public class WsdlTellabsImpl implements WsdlTellabs {

	public Respuesta aprovTellabs(Comando ejecutaComando) {
		Respuesta res = new Respuesta();
		res.setCabecera(ejecutaComando.getCabecera());
		Mensaje men = new Mensaje();
		
		men.setCodError(1);
		men.setDetMensaje("Comunicacion Exitosa");
		men.setDatosExtrasTDD(new DatosExtrasTDD());
		
		res.setMensaje(men );
		
		return res;
		
	}

}
