
package ec.com.grupotvcable.wsdltvpagada;

import java.io.IOException;
import java.text.ParseException;
import java.util.GregorianCalendar;
import java.util.List;

import javax.jws.WebService;
import javax.xml.datatype.DatatypeConstants;

import com.app.dao.AllDAO;
import com.app.dao.EntityManagerHelper;
import com.app.dao.TvPagadaImpl;
import com.app.tvp.AprovisionarTv;
import com.app.tvp.Excepciones;
import com.app.tvp.ParametrosTV;
import com.app.tvp.cas.util.ImpresionesLog;



@WebService(serviceName = "WsdlTvPagada", targetNamespace = "http://www.grupotvcable.com.ec/WsdlTvPagada/", endpointInterface = "ec.com.grupotvcable.wsdltvpagada.WsdlTvPagada")
public class WsdlTvPagadaImpl implements WsdlTvPagada {

	static Comando cmd = new Comando();
	
	public Respuesta aprovTvPagada(Comando ejecutaComando) 
	{
		System.out.println("Inicio todo el web service: "+ImpresionesLog.obtenerFechaAhora());
		com.app.dao.TvPagada LogTvPagada = new TvPagadaImpl(ejecutaComando)
				.Guardar();

		Respuesta Res = null;
		try {
			Res = new AprovisionarTv(ejecutaComando, LogTvPagada).Aprovicionar();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
			Res = new Respuesta();
			Res.setCabecera(ejecutaComando.getCabecera());
			Mensaje mensaje = new Mensaje();
			mensaje.setCodError(0);
			mensaje.setDetMensaje(e.getMessage());
			Res.setMensaje(mensaje);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			Res = new Respuesta();
			Res.setCabecera(ejecutaComando.getCabecera());
			Mensaje mensaje = new Mensaje();
			mensaje.setCodError(0);
			mensaje.setDetMensaje(e.getMessage());
			Res.setMensaje(mensaje);
		} catch (SecurityException e) {
			e.printStackTrace();
			Res = new Respuesta();
			Res.setCabecera(ejecutaComando.getCabecera());
			Mensaje mensaje = new Mensaje();
			mensaje.setCodError(0);
			mensaje.setDetMensaje(e.getMessage());
			Res.setMensaje(mensaje);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			Res = new Respuesta();
			Res.setCabecera(ejecutaComando.getCabecera());
			Mensaje mensaje = new Mensaje();
			mensaje.setCodError(0);
			mensaje.setDetMensaje(e.getMessage());
			Res.setMensaje(mensaje);
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
			Res = new Respuesta();
			Res.setCabecera(ejecutaComando.getCabecera());
			Mensaje mensaje = new Mensaje();
			mensaje.setCodError(0);
			mensaje.setDetMensaje(e.getMessage());
			Res.setMensaje(mensaje);
		} catch (IOException e) {
			e.printStackTrace();
			Res = new Respuesta();
			Res.setCabecera(ejecutaComando.getCabecera());
			Mensaje mensaje = new Mensaje();
			mensaje.setCodError(0);
			mensaje.setDetMensaje(e.getMessage());
			Res.setMensaje(mensaje);
		} catch (Excepciones e) {
			// TODO Auto-generated catch block
			Res = new Respuesta();
			Res.setCabecera(ejecutaComando.getCabecera());
			Mensaje mensaje = new Mensaje();
			mensaje.setCodError(e.GetCodigoError());
			mensaje.setDetMensaje(e.getMessage());
			Res.setMensaje(mensaje);
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("error: "+e.getMessage());
			Res = new Respuesta();
			Res.setCabecera(ejecutaComando.getCabecera());
			Mensaje mensaje = new Mensaje();
			mensaje.setCodError(0);
			mensaje.setDetMensaje(e.getMessage());
			Res.setMensaje(mensaje);
		} 
		System.out.println("Antes del gc: "+ImpresionesLog.obtenerFechaAhora());
		Runtime.getRuntime().gc();
		System.out.println("despues del gc: "+ImpresionesLog.obtenerFechaAhora());
		LogTvPagada.setCodError("" + Res.getMensaje().getCodError());
		LogTvPagada.setDetMensaje(Res.getMensaje().getDetMensaje());
		LogTvPagada.setFechaResp(GregorianCalendar.getInstance().getTime());
		
		
		
		
		EntityManagerHelper.beginTransaction();
		new AllDAO().update(LogTvPagada);
		EntityManagerHelper.commit();
		
		System.out.println("Fin todo el web service: "+ImpresionesLog.obtenerFechaAhora());
		
		return Res;

	}
	

}
