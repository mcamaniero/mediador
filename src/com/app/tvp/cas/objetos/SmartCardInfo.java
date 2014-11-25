package com.app.tvp.cas.objetos;

import java.io.Serializable;
import java.util.List;

public class SmartCardInfo implements Serializable
{
	private static final long serialVersionUID = 1L;
	private String smartcard;
	private String setTopBox;
	private String mastercard;
	private List<Pack> smartPacks;
	
	public String getSmartcard() 
	{
		return smartcard;
	}
	public void setSmartcard(String smartcard) 
	{
		this.smartcard = smartcard;
	}
	public String getSetTopBox() 
	{
		return setTopBox;
	}
	public void setSetTopBox(String setTopBox) 
	{
		this.setTopBox = setTopBox;
	}
	public String getMastercard() 
	{
		return mastercard;
	}
	public void setMastercard(String mastercard) 
	{
		this.mastercard = mastercard;
	}
	public List<Pack> getSmartPacks() 
	{
		return smartPacks;
	}
	public void setSmartPacks(List<Pack> smartPacks) 
	{
		this.smartPacks = smartPacks;
	}
}