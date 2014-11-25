package com.app.tvp.cas.objetos;

import java.io.Serializable;

public class Pack implements Serializable
{
	private static final long serialVersionUID = 1L;
	private String name;
	private boolean core;
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public boolean isCore() 
	{
		return core;
	}
	public void setCore(boolean core) 
	{
		this.core = core;
	}
}