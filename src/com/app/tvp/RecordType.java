package com.app.tvp;

public class RecordType {
	private String eStatusWork;
	private String eData;
	private String eTrama;
	
	
	public void seteStatusWork(String eStatusWork)
	{
		this.eStatusWork= eStatusWork;	
	}
	public void seteData(String eData)
	{
		this.eData= eData;	
	}
	public void seteTrama(String eTrama)
	{
		this.eTrama= eTrama;	
	}

	public String geteStatusWork()
	{
		return this.eStatusWork;	
	}
	public String geteData()
	{
		return this.eData;	
	}
	public String geteTrama()
	{
		return this.eTrama;	
	}
}
