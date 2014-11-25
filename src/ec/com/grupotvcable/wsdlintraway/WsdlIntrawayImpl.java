
package ec.com.grupotvcable.wsdlintraway;

import java.rmi.RemoteException;
import java.util.GregorianCalendar;

import javax.jws.WebService;
import javax.xml.rpc.ServiceException;

import com.app.dao.AllDAO;
import com.app.dao.EntityManagerHelper;
import com.app.dao.IntrawayImpl;
import com.app.intraway.AprovisionaIntraway;
import com.app.intraway.IntrawayExceptions;
import com.app.mail.EnvioMail;

@WebService(serviceName = "WsdlIntraway", targetNamespace = "http://www.grupotvcable.com.ec/WsdlIntraway/", endpointInterface = "ec.com.grupotvcable.wsdlintraway.WsdlIntraway")
public class WsdlIntrawayImpl implements WsdlIntraway {

	public Respuesta aprovIntraway(Comando ejecutaComando) {
		//guardo en la base en log

		com.app.dao.Intraway LogIntraway = new IntrawayImpl(ejecutaComando).Guardar();

		Respuesta Res = null;

		try {
			Res = new AprovisionaIntraway(ejecutaComando).Aprovisionar();

		} catch (RemoteException e) {
			e.printStackTrace();
			Res = new Respuesta();
			Res.setCabecera(ejecutaComando.getCabecera());
			Mensaje men = new Mensaje();
			men.setCodError(50001);
			men.setDetMensaje("No hubo comunicación con el Controlador "+e.getMessage());
			Res.setMensaje(men);
			
			new EnvioMail(""+ejecutaComando.getCabecera().getIDEmpresa(),"INTRAWAY","LogID: "+LogIntraway.getId(),e.getMessage(),0);
			
		} catch (ServiceException e) {
			e.printStackTrace();
			Res = new Respuesta();
			Res.setCabecera(ejecutaComando.getCabecera());
			Mensaje men = new Mensaje();
			men.setCodError(50001);
			men.setDetMensaje("No hubo comunicación con el Controlador "+e.getMessage());
			Res.setMensaje(men);
			e.printStackTrace();
			
			new EnvioMail(""+ejecutaComando.getCabecera().getIDEmpresa(),"INTRAWAY","LogID: "+LogIntraway.getId(),e.getMessage(),0);
			
		} catch (IntrawayExceptions e) {
			e.printStackTrace();
			Res = new Respuesta();
			Res.setCabecera(ejecutaComando.getCabecera());
			Mensaje men = new Mensaje();
			men.setCodError(e.getCodError());
			men.setDetMensaje(e.getMessage());
			Res.setMensaje(men);
			e.printStackTrace();
			
			new EnvioMail(""+ejecutaComando.getCabecera().getIDEmpresa(),"INTRAWAY","LogID: "+LogIntraway.getId(),e.getMessage(),0);
			
		}catch (Exception e) {
			e.printStackTrace();
			Res = new Respuesta();
			Res.setCabecera(ejecutaComando.getCabecera());
			Mensaje men = new Mensaje();
			men.setCodError(100);
			men.setDetMensaje(e.getMessage());
			Res.setMensaje(men);
			e.printStackTrace();
			
			new EnvioMail(""+ejecutaComando.getCabecera().getIDEmpresa(),"INTRAWAY","LogID: "+LogIntraway.getId(),e.getMessage(),0);
			
		}

		Runtime.getRuntime().gc();

		LogIntraway.setCodError("" + Res.getMensaje().getCodError());
		LogIntraway.setDetMensaje(Res.getMensaje().getDetMensaje());
		LogIntraway.setFechaResp(GregorianCalendar.getInstance().getTime());

		EntityManagerHelper.beginTransaction();
		new AllDAO().update(LogIntraway);
		EntityManagerHelper.commit();

		return Res;

	}

}
