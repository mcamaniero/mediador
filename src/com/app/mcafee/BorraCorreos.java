package com.app.mcafee;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class BorraCorreos extends TimerTask implements ServletContextListener {

	private Timer timer;

	@Override
	public void run() { 
		/*System.out.println("ENTRO A BORRAR CORREOS "+new Date());
		System.out.println("ENTRO A BORRAR CORREOS");
		System.out.println("ENTRO A BORRAR CORREOS");
		System.out.println("+++++++++++++++++++++++++++++++++++");
	*/	
	}

	public void contextDestroyed(ServletContextEvent arg0) {
		 timer.cancel();
	}

	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub

		//timer = new Timer();
		//timer.schedule(this, 0, 10*60*1000);  // Ejemplo: Cada 10 minutos

	}

}
