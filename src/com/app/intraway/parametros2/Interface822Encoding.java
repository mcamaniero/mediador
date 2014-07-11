package com.app.intraway.parametros2;

public class Interface822Encoding implements IXMLEncoding {

	
	private String MacAddress;
	private String LinesQty;
	private String MtaModelCrmId;
	private String NoBoot;
	private String SendToController;
	
		
	public Interface822Encoding(String macAddress, String linesQty, String mtaModelCrmId,
								String noBoot, String sendToController) {
		this.setLinesQty(linesQty);
		this.setMacAddress(macAddress);
		this.setMtaModelCrmId(mtaModelCrmId);
		this.setNoBoot(noBoot);
		this.setSendToController(sendToController);
	}

	public String getXMLEncoding() {
		StringBuilder str = new StringBuilder(8);
		str.append("<handleMTAActivation>");
		str.append("<MacAddress>"+this.getMacAddress()+"</MacAddress>");
		str.append("<LinesQty>"+this.getLinesQty()+"</LinesQty>");
		str.append("<MtaModelCrmId>"+this.getMtaModelCrmId()+"</MtaModelCrmId>");
		str.append("<NoBoot>"+this.getNoBoot()+"</NoBoot>");
		str.append("<SendToController>"+this.getSendToController()+"</SendToController>");
		str.append("</handleMTAActivation>");
		return str.toString();
	}

	public String getMacAddress() {
		return MacAddress == null ? "" : this.MacAddress;
	}

	public void setMacAddress(String macAddress) {
		MacAddress = macAddress;
	}

	public String getLinesQty() {
		return LinesQty == null ? "0" : this.LinesQty;
	}

	public void setLinesQty(String linesQty) {
		LinesQty = linesQty;
	}

	public String getMtaModelCrmId() {
		return MtaModelCrmId == null ? "" : this.MtaModelCrmId;
	}

	public void setMtaModelCrmId(String mtaModelCrmId) {
		MtaModelCrmId = mtaModelCrmId;
	}

	public String getNoBoot() {
		return NoBoot;
	}

	public void setNoBoot(String noBoot) {
		NoBoot = noBoot;
	}

	public String getSendToController() {
		return SendToController == null ? "" : this.SendToController;
	}

	public void setSendToController(String sendToController) {
		SendToController = sendToController;
	}

}
