package com.app.safari.sip;

public class ValuesLinksys {

	private String Key;
	private String Value;
	private String Coment;
	
	public ValuesLinksys() {
		this.Key="";
		this.Value="";
		this.Coment="";
	}
	
	public ValuesLinksys(String key, String value, String coment) {
		this.Key = key;
		this.Value = value;
		this.Coment = coment;
	}

	
	public String getKey() {
		return Key;
	}

	public void setKey(String key) {
		Key = key;
	}

	public String getValue() {
		return Value;
	}

	public void setValue(String value) {
		Value = value;
	}

	public String getComent() {
		return Coment;
	}

	public void setComent(String coment) {
		Coment = coment;
	}
	
	

}
