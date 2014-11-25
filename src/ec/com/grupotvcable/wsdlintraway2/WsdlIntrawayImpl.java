
package ec.com.grupotvcable.wsdlintraway2;

import java.rmi.RemoteException;
import java.util.GregorianCalendar;

import javax.jws.WebService;
import javax.xml.rpc.ServiceException;

import com.app.dao.AllDAO;
import com.app.dao.EntityManagerHelper;
import com.app.dao.IntrawayImpl;
import com.app.intraway2.AprovisionaIntraway;

import ec.com.grupotvcable.wsdlintraway2.Mensaje;
import ec.com.grupotvcable.wsdlintraway2.Respuesta;

@WebService(serviceName = "WsdlIntraway", targetNamespace = "http://www.grupotvcable.com.ec/WsdlIntraway2/", endpointInterface = "ec.com.grupotvcable.wsdlintraway2.WsdlIntraway")
public class WsdlIntrawayImpl
    implements WsdlIntraway
{


    public Respuesta aprovIntraway(Comando ejecutaComando) {
		//guardo en la base en log

		com.app.dao.Intraway LogIntraway = new IntrawayImpl(ejecutaComando).Guardar2();

		Respuesta Res = null;

		try {
			Res = new AprovisionaIntraway(ejecutaComando).Aprovicionar();

		} catch (RemoteException e) {
			e.printStackTrace();
			Res = new Respuesta();
			Res.setCabecera(ejecutaComando.getCabecera());
			Mensaje men = new Mensaje();
			men.setCodError("50001");
			men.setDetMensaje("No hubo comunicación con el Controlador "+e.getMessage());
			Res.setMensaje(men);
		} catch (ServiceException e) {
			e.printStackTrace();
			Res = new Respuesta();
			Res.setCabecera(ejecutaComando.getCabecera());
			Mensaje men = new Mensaje();
			men.setCodError("50001");
			men.setDetMensaje("No hubo comunicación con el Controlador "+e.getMessage());
			Res.setMensaje(men);
			e.printStackTrace();
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
