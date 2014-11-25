
package ec.com.grupotvcable.wsdlsafari;

import java.io.IOException;
import java.util.GregorianCalendar;

import javax.jws.WebService;
import javax.xml.rpc.ServiceException;

import com.app.dao.AllDAO;
import com.app.dao.EntityManagerHelper;
import com.app.dao.SafariImpl;
import com.app.mail.EnvioMail;
import com.app.safari.AprovisionarSafari;

@WebService(serviceName = "WsdlSafari", targetNamespace = "http://www.grupotvcable.com.ec/WsdlSafari/", endpointInterface = "ec.com.grupotvcable.wsdlsafari.WsdlSafari")
public class WsdlSafariImpl implements WsdlSafari{

	public Respuesta aprovSafari(Comando ejecutaComando) {

		Respuesta Res = new Respuesta();
		Mensaje men = new Mensaje();
		Res.setCabecera(ejecutaComando.getCabecera());
		
		com.app.dao.Safari LogSafari = new SafariImpl(ejecutaComando).Guardar();
		try {
			Res = new AprovisionarSafari(ejecutaComando).Aprovisionar();
		} catch (IOException e) {
			e.printStackTrace();
			men.setCodError(0);
			men.setDetMensaje("IOException "+e.getMessage());
			Res.setMensaje(men);
			new EnvioMail(""+ejecutaComando.getCabecera().getIDEmpresa(),"SAFARI","IOException",e.getMessage(),0);
			
		} catch (ServiceException e) {
			e.printStackTrace();
			men.setCodError(0);
			men.setDetMensaje("ServiceException "+e.getMessage());
			Res.setMensaje(men);
			new EnvioMail(""+ejecutaComando.getCabecera().getIDEmpresa(),"SAFARI","ServiceException",e.getMessage(),0);
			
		} catch (Exception e) {
			e.printStackTrace();
			men.setCodError(0);
			men.setDetMensaje("Exception "+e.getMessage());
			Res.setMensaje(men);
			new EnvioMail(""+ejecutaComando.getCabecera().getIDEmpresa(),"SAFARI","Exception",e.getMessage(),0);
			
		}
		
		if(Res.getMensaje()!=null){
			LogSafari.setCodError(""+Res.getMensaje().getCodError());
			LogSafari.setDetMensaje(Res.getMensaje().getDetMensaje());
		}else{
			LogSafari.setCodError("5001");
			LogSafari.setDetMensaje("No hubo comunicacion con el Controlador");
			new EnvioMail(""+ejecutaComando.getCabecera().getIDEmpresa(),"SAFARI","N/A","No hubo comunicacion con el Controlador",0);
			
		}
		
		LogSafari.setFechaResp(GregorianCalendar.getInstance().getTime());

		EntityManagerHelper.beginTransaction();
		new AllDAO().update(LogSafari);
		EntityManagerHelper.commit();	

		Runtime.getRuntime().gc();

		return Res;

	}

}
