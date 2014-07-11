package com.app.intraway.parametros2;

public class Interface622Encoding implements IXMLEncoding {

	private String MacAddress;
	private String NoBoot;
	
	public Interface622Encoding(String macAddress, String noBoot ) {
		this.setMacAddress(macAddress);
		this.setNoBoot(noBoot);
	}

	public String getXMLEncoding() {
		StringBuilder str = new StringBuilder(8);
		str.append("<handleCMActivation>");
		str.append("<NoBoot>"+this.getNoBoot()+"</NoBoot>");
		str.append("<MacAddress>"+this.getMacAddress()+"</MacAddress>");
		str.append("</handleCMActivation>");
		return str.toString();
	}
	
	
	public String getMacAddress() {
		return MacAddress;
	}

	public void setMacAddress(String macAddress) {
		MacAddress = macAddress;
	}

	public String getNoBoot() {
		return NoBoot;
	}

	public void setNoBoot(String noBoot) {
		NoBoot = noBoot;
	}

}
