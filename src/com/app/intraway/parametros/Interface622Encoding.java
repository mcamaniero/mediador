package com.app.intraway.parametros;

public class Interface622Encoding implements IXMLEncoding {

	private String MacAddress;
	private boolean NoBoot;
	
	public Interface622Encoding(String macAddress, boolean noBoot ) {
		this.setMacAddress(macAddress);
		this.setNoBoot(noBoot);
	}

	public String getXMLEncoding() {
		StringBuilder str = new StringBuilder(8);
		str.append("<handleCMActivation>");
		str.append("<NoBoot>"+this.isNoBoot()+"</NoBoot>");
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

	public boolean isNoBoot() {
		return NoBoot;
	}

	public void setNoBoot(boolean noBoot) {
		NoBoot = noBoot;
	}

}
