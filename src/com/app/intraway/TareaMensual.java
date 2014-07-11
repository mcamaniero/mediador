package com.app.intraway;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class TareaMensual extends TimerTask implements ServletContextListener {

	private Timer Tiempo;
	
	public TareaMensual() {
		Calendar cal = Calendar.getInstance();
		cal.set(2008, 8, 0, 0, 0);
		Tiempo = new Timer();
		Tiempo.schedule(this, cal.getTime(), 1000*3600*24);
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		Tiempo.cancel();
	}

	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub

	}

}
