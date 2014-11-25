package com.app.tvp.cas.objetos;

import java.io.Serializable;
import java.util.List;

import com.app.tvp.cas.cliente.objetos.SettopBox;

public class Information implements Serializable 
{
	private static final long serialVersionUID = 1L;
	private String smartcard;
	private SettopBox setTopBox;
	private String pin;
	private List<String> packs;
	private String mastercard;
	private List<String> slaveMasterCards;
	private String distributor;
	
	public String getSmartcard() 
	{
		return smartcard;
	}
	public void setSmartcard(String smartcard) 
	{
		this.smartcard = smartcard;
	}
	public SettopBox getSetTopBox() 
	{
		return setTopBox;
	}
	public void setSetTopBox(SettopBox setTopBox) 
	{
		this.setTopBox = setTopBox;
	}
	public String getPin() 
	{
		return pin;
	}
	public void setPin(String pin) 
	{
		this.pin = pin;
	}
	public List<String> getPacks() 
	{
		return packs;
	}
	public void setPacks(List<String> packs) 
	{
		this.packs = packs;
	}
	public String getMastercard() 
	{
		return mastercard;
	}
	public void setMastercard(String mastercard) 
	{
		this.mastercard = mastercard;
	}
	public List<String> getSlaveMasyerCards() 
	{
		return slaveMasterCards;
	}
	public void setSlaveMasyerCards(List<String> slaveMasyerCards) 
	{
		this.slaveMasterCards = slaveMasyerCards;
	}
	public String getDistributor() 
	{
		return distributor;
	}
	public void setDistributor(String distributor) 
	{
		this.distributor = distributor;
	}
}