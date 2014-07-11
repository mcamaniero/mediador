package com.app.tvp.cas.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ImpresionesLog
{
	public static String obtenerFechaAhora()
	{
		String retorno = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd kk:mm:ss:SSS");
		retorno = sdf.format(new Date());
		return retorno;
	}
	
	/*public static void main(String[] args)
	{
		System.out.println(obtenerFechaAhora());
	}*/
}