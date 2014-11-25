

package ec.com.grupotvcable.wsdlauris;
import java.io.IOException;
import java.util.GregorianCalendar;

import javax.jws.WebService;
import org.apache.commons.httpclient.HttpException;
import org.jdom.JDOMException;

import com.app.auris.AprovisionarAuris;
import com.app.dao.AllDAO;
import com.app.dao.AurisImpl;
import com.app.dao.EntityManagerHelper;
import com.app.mail.EnvioMail;

@WebService(serviceName = "WsdlAuris", targetNamespace = "http://www.grupotvcable.com.ec/WsdlAuris/", endpointInterface = "ec.com.grupotvcable.wsdlauris.WsdlAuris")
public class WsdlAurisImpl implements WsdlAuris {

	public Respuesta aprovAuris(Comando ejecutaComando) {
		
		Respuesta Res = new Respuesta();
		Res.setCabecera(ejecutaComando.getCabecera());
		
		Mensaje men = new Mensaje();
		
		
		com.app.dao.Auris LogAuris = new AurisImpl(ejecutaComando).Guardar();
		
		try {
			Res = new AprovisionarAuris(ejecutaComando).Aprovisionar();
		} catch (HttpException e) {
			e.printStackTrace();
			men.setCodError(2);
			men.setDetMensaje("HttpException: "+e.getMessage());
			Res.setMensaje(men );
			new EnvioMail(""+ejecutaComando.getCabecera().getIDEmpresa(),"SAFARI","N/A",e.getMessage(),0);
			
		} catch (IOException e) {
			e.printStackTrace();
			men.setCodError(2);
			men.setDetMensaje("IOException: "+e.getMessage());
			Res.setMensaje(men );
			new EnvioMail(""+ejecutaComando.getCabecera().getIDEmpresa(),"SAFARI","N/A",e.getMessage(),0);
			
		} catch (JDOMException e) {
			e.printStackTrace();
			Res = new Respuesta();
			men.setCodError(2);
			men.setDetMensaje("JDOMException: "+e.getMessage());
			Res.setMensaje(men );
			new EnvioMail(""+ejecutaComando.getCabecera().getIDEmpresa(),"SAFARI","N/A",e.getMessage(),0);
			
		}
		
		Runtime.getRuntime().gc();

		LogAuris.setCodError("" + Res.getMensaje().getCodError());
		LogAuris.setDetMensaje(Res.getMensaje().getDetMensaje());
		LogAuris.setResp_Pin(Res.getMensaje().getDatosExtrasAuris() == null ? "" : Res.getMensaje().getDatosExtrasAuris().getPin());
		LogAuris.setResp_Did(Res.getMensaje().getDatosExtrasAuris() == null ? "" : Res.getMensaje().getDatosExtrasAuris().getDID());
		LogAuris.setFechaResp(GregorianCalendar.getInstance().getTime());
		
		EntityManagerHelper.beginTransaction();
		new AllDAO().update(LogAuris);
		EntityManagerHelper.commit();
		
		return Res;
		
		/*WsdlAurisClient client = new WsdlAurisClient();
        WsdlAuris service = client.getWsdlAurisSOAP();
		
        return service.aprovAuris(ejecutaComando);
        */
		
		
	}

}
