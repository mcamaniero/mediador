package com.app.tvp.cas.objetos;

import java.math.BigDecimal;

public class ObjetoConsultaPacks 
{
	private BigDecimal id;
	private String serieSMC;
	private String pack;
	private String nombre;
	
	public BigDecimal getId() 
	{
		return id;
	}
	public void setId(BigDecimal id) 
	{
		this.id = id;
	}
	public String getSerieSMC() 
	{
		return serieSMC;
	}
	public void setSerieSMC(String serieSMC) 
	{
		this.serieSMC = serieSMC;
	}
	public String getPack() 
	{
		return pack;
	}
	public void setPack(String pack) 
	{
		this.pack = pack;
	}
	public String getNombre() 
	{
		return nombre;
	}
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
}