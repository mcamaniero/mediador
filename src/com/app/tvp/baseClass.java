/*
 * baseClass.java
 *
 * Created on 19 de octubre de 2007, 06:13 PM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package com.app.tvp;

/**
 *
 * @author Admin
 */


public class baseClass {

	/** Creates a new instance of baseClass */
	public baseClass() {
	}

	/** Extrae los valores de las variables declaras en una clase.
	 * @param field nombre de la variable
	 * @return campo retorna el valor de la variable.
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 * @throws SecurityException 
	 * @throws IllegalArgumentException 
	 * @throws Exception
	 */

	public Object getValue(String field) throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException 
	{
		Object campo = this.getClass().getDeclaredField(field).get(this);
		return campo;
	}

	/** Setea las variables declaras en una clase.
	 * @param field nombre de la variable
	 * @param value valor de la varibale
	 * @throws NoSuchFieldException 
	 * @throws IllegalAccessException 
	 * @throws SecurityException 
	 * @throws IllegalArgumentException 
	 * @throws Exception
	 */
	public void setValue(String field, Object value) throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException 
	{
		this.getClass().getDeclaredField(field).set(this,value);
	}

}
