package tvcable.app.comarch.utils;

import java.io.IOException;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.xml.rpc.ServiceException;

import com.app.dao.titan.Querys;
import com.app.safari.LineaCuarentena;

public class EliminacionLineasCuarentenaEnSafari extends TimerTask implements ServletContextListener {

	private Timer timer;
	public static final int MAX = 50;

	@Override
	public void run() { 
		
		List<LineaCuarentena> lineas = new Querys().findAll_LineasParaSalirDeCuarentena();
		if ( lineas.size() > 0){
			for(LineaCuarentena l : lineas){
				
				ec.com.grupotvcable.wsdlsafari.Comando cmd = new ec.com.grupotvcable.wsdlsafari.Comando();
				ec.com.grupotvcable.wsdlsafari.Cabecera cab = new ec.com.grupotvcable.wsdlsafari.Cabecera();

				cab.setIDEmpresa(l.getIdEmpresa());//94 gye    63 uio    65 nac
				cab.setInterface(1005);//interfaz de eliminacion de linea
				cab.setNegocio(1);
				cab.setSecuencia(101);
				cmd.setCabecera(cab);

				ec.com.grupotvcable.wsdlsafari.Detalle det = new ec.com.grupotvcable.wsdlsafari.Detalle();
				ec.com.grupotvcable.wsdlsafari.Safari saf = new ec.com.grupotvcable.wsdlsafari.Safari();
				saf.setDatoS1(l.getLinea());//TELEFONO
				saf.setDatoS4("CUARENTENA");
				saf.setAccion("SIP");

				det.setSafari(saf);
				cmd.setDetalle(det);

				ec.com.grupotvcable.wsdlsafari.Respuesta res = null;
				String mng = "";
				int  error = 0;
				try {
					res = new com.app.safari.AprovisionarSafari(cmd).Aprovisionar();
					mng = res.getMensaje().getDetMensaje();
					error = res.getMensaje().getCodError();
				} catch (IOException e) {
					e.printStackTrace();
					mng = e.getMessage();
					error = 2;
				} catch (ServiceException e) {
					e.printStackTrace();
					mng = e.getMessage();
					error = 2;
				} catch (Exception e) {
					e.printStackTrace();
					mng = e.getMessage();
					error = 2;
				}

				System.out.println("Eliminacion de linea cuarentena "+error);
				System.out.println("Eliminacion de linea cuarentena "+mng);
				
			}
		}
	}

	public void contextDestroyed(ServletContextEvent arg0) {
		 timer.cancel();
	}

	public void contextInitialized(ServletContextEvent arg0) {
		timer = new Timer();
		//timer.schedule(this, new Date(new Date().getYear(), new Date().getMonth(), new Date().getDate(), 6 , 0 ), 15*60*1000);  //Cada 15 minutos
		timer.schedule(this, 0, 8*60*60*1000);  //Cada 12 minutos
	}

}
