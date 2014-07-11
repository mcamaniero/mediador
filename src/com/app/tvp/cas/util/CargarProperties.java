package com.app.tvp.cas.util;

import java.io.IOException;
import java.util.Properties;

public class CargarProperties 
{
	private static CargarProperties instancia = new CargarProperties();
	private Properties parametrosLogin;
	
	private CargarProperties()
	{
		
	}
	
	public static CargarProperties instanciar()
	{
		return instancia;
	}
	
	private void obtenerInstancia()
	{
		try
		{
			if(parametrosLogin==null)
			{
				parametrosLogin = new Properties();
			}
			parametrosLogin.load(this.getClass().getClassLoader().getResourceAsStream("parametrosLogin.properties"));
		}
		catch(IOException ioe)
		{
			System.out.println("Error al leer archivo de propiedades: "+ioe.getMessage());
		}
	}
	
	public String getUser()
	{
		String retorno = null;
		if(parametrosLogin==null)
		{
			obtenerInstancia();
		}
		retorno = parametrosLogin.getProperty("usuario");
		return retorno;
	}
	public String getKey()
	{
		String retorno = null;
		if(parametrosLogin==null)
		{
			obtenerInstancia();
		}
		retorno = parametrosLogin.getProperty("pass");
		return retorno;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException 
	{
        throw new CloneNotSupportedException("No se permite clonar un singleton"); 
	}
}