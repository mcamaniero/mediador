package com.app.tvp.cas.objetos;

import java.io.Serializable;
import java.util.List;

import com.app.tvp.cas.cliente.objetos.SettopBox;

public class DatosCAS implements Serializable 
{
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	private String sequence;
	private String smartcard;
	private SettopBox setTopBox;
	private List<String> packs;
	private String mastercard;
	private String user_id;
	private String reference_number;
	private String notes;
	private String customer_id;
	private String zone;
	private String pin;
	private String message;
	private String carrier;
	private String code;
	///Datos de Retorno
	private String retorno;
	private String answer;
	private Information information;
	private SmartCardInfo smartCardInfo;
	
	public String getUsername() 
	{
		return username;
	}
	public void setUsername(String username) 
	{
		this.username = username;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	public String getSequence() 
	{
		return sequence;
	}
	public void setSequence(String sequence) 
	{
		this.sequence = sequence;
	}
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
	public String getUser_id() 
	{
		return user_id;
	}
	public void setUser_id(String user_id) 
	{
		this.user_id = user_id;
	}
	public String getReference_number() 
	{
		return reference_number;
	}
	public void setReference_number(String reference_number) 
	{
		this.reference_number = reference_number;
	}
	public String getNotes() 
	{
		return notes;
	}
	public void setNotes(String notes) 
	{
		this.notes = notes;
	}
	public String getCustomer_id() 
	{
		return customer_id;
	}
	public void setCustomer_id(String customer_id) 
	{
		this.customer_id = customer_id;
	}
	public String getZone() 
	{
		return zone;
	}
	public void setZone(String zone) 
	{
		this.zone = zone;
	}
	public String getPin() 
	{
		return pin;
	}
	public void setPin(String pin) 
	{
		this.pin = pin;
	}
	public String getMessage() 
	{
		return message;
	}
	public void setMessage(String message) 
	{
		this.message = message;
	}
	public String getCarrier() 
	{
		return carrier;
	}
	public void setCarrier(String carrier) 
	{
		this.carrier = carrier;
	}
	public String getCode() 
	{
		return code;
	}
	public void setCode(String code) 
	{
		this.code = code;
	}
	public String getRetorno() 
	{
		return retorno;
	}
	public void setRetorno(String retorno) 
	{
		StringBuilder sb = new StringBuilder();
		if(this.retorno!=null)
		{
			sb.append(this.retorno);
		}
		sb.append(retorno);
		this.retorno = sb.toString();
	}
	public String getAnswer() 
	{
		return answer;
	}
	public void setAnswer(String answer) 
	{
		StringBuilder sb = new StringBuilder();
		if(this.answer!=null)
		{
			sb.append(this.answer);
		}
		sb.append(answer);
		this.answer = sb.toString();
	}
	public Information getInformation() 
	{
		return information;
	}
	public void setInformation(Information information) 
	{
		this.information = information;
	}
	public SmartCardInfo getSmartCardInfo() 
	{
		return smartCardInfo;
	}
	public void setSmartCardInfo(SmartCardInfo smartCardInfo) 
	{
		this.smartCardInfo = smartCardInfo;
	}
}