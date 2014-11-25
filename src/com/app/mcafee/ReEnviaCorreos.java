package com.app.mcafee;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ReEnviaCorreos extends TimerTask implements ServletContextListener {

	private Timer timer = null;

	@Override
	public void run() { 
		/*System.out.println("ENTRO A BORRAR CORREOS "+new Date());
		System.out.println("ENTRO A BORRAR CORREOS");
		System.out.println("ENTRO A BORRAR CORREOS");
		System.out.println("+++++++++++++++++++++++++++++++++++");
		 */	
		
		new CorreoMcAfee("94").ReEnviarCorreo();//Guayaquil
		new CorreoMcAfee("63").ReEnviarCorreo();//Quito
		new CorreoMcAfee("65").ReEnviarCorreo();//Cuenca
		
	}

	public void contextDestroyed(ServletContextEvent arg0) {
		 timer.cancel();
	}

	public void contextInitialized(ServletContextEvent arg0) {
		timer = new Timer();
		timer.schedule(this, 0, 15*60*1000);  // Ejemplo: Cada 15 minutos
	}

}
