
package ec.com.grupotvcable.wsdlmcafeeconsultaweb;

import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.jws.WebService;

import com.app.dao.EntityManagerHelper;
import com.app.mcafee.EnvioMailMcAfeeRecuperaClave;
import com.app.mcafee.dao.LogMcAfee;
import com.app.mcafee.dao.LogMcAfeeDAO;
import com.app.mcafee.dao.McafCliente;
import com.app.mcafee.dao.McafClienteDAO;
import com.app.mcafee.dao.McafTransaccionDAO;

@WebService(serviceName = "WsdlMcAfeeConsultaWeb", targetNamespace = "http://www.grupotvcable.com.ec/WsdlMcAfeeConsultaWeb/", endpointInterface = "ec.com.grupotvcable.wsdlmcafeeconsultaweb.WsdlMcAfeeConsultaWeb")
public class WsdlMcAfeeConsultaWebImpl implements WsdlMcAfeeConsultaWeb {

	public Respuesta consultar(String Correo, String Clave) {

		LogMcAfee mc = new LogMcAfee(0, new Date(), 0, "WEB", "consultar", "",
				"", "", Correo, 0, "", "", Clave, "", null, null, null, "");
		EntityManagerHelper.beginTransaction();
		new LogMcAfeeDAO().save(mc);
		EntityManagerHelper.commit();

		Respuesta resp = new Respuesta();

		boolean existe = true;
		boolean clave = true;

		List<McafCliente> cli = new McafClienteDAO().findByMail(Correo);

		if (cli.size() == 0) {
			resp.setCodError("2");
			resp.setDetMensaje("Correo no existe");
			resp.setIdMcAfee("");
			existe = false;
			clave = false;
		}

		if (clave && cli.size() == 0) {
			resp.setCodError("3");
			resp.setDetMensaje("Clave incorrecta");
			resp.setIdMcAfee("");
			existe = false;
		}

		if (existe) {

			//si existe valido que tenga productos ACTIVOS
			if (new McafTransaccionDAO().findByPropertyMcAfeeIDActive(cli.get(0).getIdMcAfee()).size()==0){
				resp.setCodError("2");
				resp.setDetMensaje("Correo no posee Productos Activos");


			}else{

				resp.setCodError("1");
				resp.setDetMensaje("Proceso realizado con Exito");

				McafCliente clientMcAfee = new McafClienteDAO().findByMail(Correo).get(0);

				String clienteMcAfeeId = ""+ clientMcAfee.getIdMcAfee();

				resp.setIdMcAfee(clienteMcAfeeId);
				resp.setIsFamiliaProtegida(new McafTransaccionDAO()
				.findByProductFamilySKU(clientMcAfee.getIdMcAfee()));
				resp.setPasswordMcAfee(clientMcAfee.getPasswordWeb());

				//actualizo los clic de cada correo
				EntityManagerHelper.beginTransaction();
				clientMcAfee.setClic(clientMcAfee.getClic()+1);
				EntityManagerHelper.commit();


			}
		}
		mc.setCodError(resp.getCodError());
		mc.setDetMensaje(resp.getDetMensaje());
		mc.setFechaResp(new Date());

		EntityManagerHelper.beginTransaction();
		new LogMcAfeeDAO().update(mc);
		EntityManagerHelper.commit();

		return resp;


	}

	public RespuestaClave recuperarClave(String Correo) {

		LogMcAfee mc = new LogMcAfee(0, new Date(), 0, "WEB", "recuperarClave",
				"", "", "", Correo, 0, "", "", "", "", null, null, null, "");
		EntityManagerHelper.beginTransaction();
		new LogMcAfeeDAO().save(mc);
		EntityManagerHelper.commit();

		RespuestaClave resp = new RespuestaClave();

		boolean existe = true;

		List<McafCliente> cli = new McafClienteDAO().findByMail(Correo);

		if (cli.size() == 0) {
			resp.setCodError("2");
			resp.setDetMensaje("Correo no se encuentra registrado");
			resp.setClave("");
			existe = false;
		}

		if (existe) {
			//si existe valido que tenga productos ACTIVOS
			if (new McafTransaccionDAO().findByPropertyMcAfeeIDActive(cli.get(0).getIdMcAfee()).size()==0){
				resp.setCodError("2");
				resp.setDetMensaje("Correo no posee Productos Activos");
				resp.setClave("");

			}else{

				//envio correo al usuario.
				resp.setCodError("1");
				resp.setDetMensaje("Proceso realizado con Exito");
				resp.setClave("");

				McafCliente cliente = new McafClienteDAO().findByMail(Correo).get(0);
				List<LogMcAfee> log = new LogMcAfeeDAO().findByCorreo(Correo);
				//System.out.println(log.get(0).getId());
				new EnvioMailMcAfeeRecuperaClave(Correo, log.get(0).getNombre(), cliente.getPassword(), ""+log.get(0).getIdEmpresa());
			}
		}

		mc.setCodError(resp.getCodError());
		mc.setDetMensaje(resp.getDetMensaje());
		mc.setFechaResp(new Date());

		EntityManagerHelper.beginTransaction();
		new LogMcAfeeDAO().update(mc);
		EntityManagerHelper.commit();

		return resp;

	}

	public static boolean isEmail(String correo) {
		Pattern pat = null;
		Matcher mat = null;
		pat = Pattern.compile("[a-zA-Z0-9]+[a-zA-Z0-9_-]*@[a-zA-Z]+\\p{Punct}[a-zA-Z]+");
		mat = pat.matcher(correo);
		if (mat.find()) {
			System.out.println("[" + mat.group() + "]");
			return true;
		}else{
			return false;
		}
	}

	public static void main(String a[]) {
		//RespuestaClave resp = new WsdlMcAfeeConsultaWebImpl().recuperarClave("gwerewr@cablemodem.com.ec");
		//Respuesta resp = new WsdlMcAfeeConsultaWebImpl().consultar(
			//	"f.tamayo@uio.satnet.net", "tvc14638901803");

		RespuestaClave resp = new WsdlMcAfeeConsultaWebImpl().recuperarClave("fabian.fonseca@lafarge.com");

		System.out.println(resp.getCodError());
		System.out.println(resp.getDetMensaje());
		//System.out.println(resp.getPasswordMcAfee());
		//System.out.println(resp.getIsFamiliaProtegida());

	//	System.out.println(isEmail("j@g.c"));


	}

}



