package com.app.tvp.cas.objetos;

import java.math.BigDecimal;

public class ObjetoConsultaSetTopBox 
{
	private BigDecimal id;
	private String serieSMC;
	private String serieSTB;
	private String isParing;
	
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
	public String getSerieSTB() 
	{
		return serieSTB;
	}
	public void setSerieSTB(String serieSTB) 
	{
		this.serieSTB = serieSTB;
	}
	public String getIsParing() 
	{
		return isParing;
	}
	public void setIsParing(String isParing) 
	{
		this.isParing = isParing;
	}
}