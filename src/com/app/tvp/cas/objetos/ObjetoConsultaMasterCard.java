package com.app.tvp.cas.objetos;

import java.math.BigDecimal;

public class ObjetoConsultaMasterCard
{
	private BigDecimal id;
	private String serieSMC;
	private String mastercard;
	
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
	public String getMastercard() 
	{
		return mastercard;
	}
	public void setMastercard(String mastercard) 
	{
		this.mastercard = mastercard;
	}
}