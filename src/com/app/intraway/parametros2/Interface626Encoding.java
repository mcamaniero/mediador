package com.app.intraway.parametros2;

public class Interface626Encoding implements IXMLEncoding {

	private String SnmpGroupCRMId;
	private String NoBoot;
	
	public Interface626Encoding(String snmpGroupCRMId, String noBoot) {
		this.setNoBoot(noBoot);
		this.setSnmpGroupCRMId(snmpGroupCRMId);
	}

	public String getXMLEncoding() {
		StringBuilder str = new StringBuilder(8);
		str.append("<handleCMFilter>");
		str.append("<snmpGroupCRMId>"+this.getSnmpGroupCRMId()+"</snmpGroupCRMId>");
		str.append("<NoBoot>"+this.isNoBoot()+"</NoBoot>");
		str.append("</handleCMFilter>");
		return str.toString();
	}
	
	public String getSnmpGroupCRMId() {
		return SnmpGroupCRMId;
	}

	public void setSnmpGroupCRMId(String snmpGroupCRMId) {
		this.SnmpGroupCRMId = snmpGroupCRMId;
	}

	public String isNoBoot() {
		return NoBoot;
	}

	public void setNoBoot(String noBoot) {
		NoBoot = noBoot;
	}

	

}
