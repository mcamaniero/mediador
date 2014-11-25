package com.app.tvp.cas.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encriptacion 
{
	public static String encriptar(String key)
	{
		String retorno = null;
		try
		{
			MessageDigest encriptador = MessageDigest.getInstance("MD5");
			encriptador.reset();
			byte[] baits = key.getBytes();
			encriptador.update(baits);
			byte[] baitsEncriptados = encriptador.digest();
			StringBuilder cadenaHex = new StringBuilder();
			for(int i=0;i<baitsEncriptados.length;i++)
			{
				String hex = Integer.toHexString(0xff & baitsEncriptados[i]);
	            if (hex.length() == 1) 
	            {
	            	cadenaHex.append('0');
	            }
	            cadenaHex.append(hex);
			}
			retorno = cadenaHex.toString();
		}
		catch(NoSuchAlgorithmException nsae)
		{
			nsae.printStackTrace();
		}
		return retorno;
	}
}