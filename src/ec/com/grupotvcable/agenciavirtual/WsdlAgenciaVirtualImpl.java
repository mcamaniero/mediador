
package ec.com.grupotvcable.agenciavirtual;

import javax.jws.WebService;

import com.app.dao.mails.MailsDialUpDAO;

@WebService(serviceName = "WsdlAgenciaVirtual", targetNamespace = "http://www.grupotvcable.com.ec/AgenciaVirtual/", endpointInterface = "ec.com.grupotvcable.agenciavirtual.AgenciaVirtual")
public class WsdlAgenciaVirtualImpl implements AgenciaVirtual {

	public Respuesta recuperarClave(String username, String dominio) {
		Respuesta res = new Respuesta();
		String error = "";
		String passw = "";
		try {
			passw = new MailsDialUpDAO().findPasswordByUserNameAndDominio(
					username, dominio);
		} catch (Exception e) {
			error = e.getMessage();
		}
		if (!passw.equals("")) {
			res.setCodError("1");
			res.setDetMensaje("Proceso realizado con Exito");
			res.setClave(passw);
		} else {
			res.setCodError("2");
			res.setDetMensaje("Password no encontrado");
			res.setClave("");
			if (!error.equals("")) {
				res.setCodError("3");
				res.setDetMensaje(error);
			}
		}

		return res;

	}

}
