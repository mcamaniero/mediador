package com.app.intraway.parametros;

public class Interface822Encoding implements IXMLEncoding {

	
	private String MacAddress;
	private Integer LinesQty;
	private String MtaModelCrmId;
	private boolean NoBoot;
	private String SendToController;
	
		
	public Interface822Encoding(String macAddress, Integer linesQty, String mtaModelCrmId,
								boolean noBoot, String sendToController) {
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
		str.append("<NoBoot>"+this.isNoBoot()+"</NoBoot>");
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

	public Integer getLinesQty() {
		return LinesQty == null ? 0 : this.LinesQty;
	}

	public void setLinesQty(Integer linesQty) {
		LinesQty = linesQty;
	}

	public String getMtaModelCrmId() {
		return MtaModelCrmId == null ? "" : this.MtaModelCrmId;
	}

	public void setMtaModelCrmId(String mtaModelCrmId) {
		MtaModelCrmId = mtaModelCrmId;
	}

	public boolean isNoBoot() {
		return NoBoot;
	}

	public void setNoBoot(boolean noBoot) {
		NoBoot = noBoot;
	}

	public String getSendToController() {
		return SendToController == null ? "" : this.SendToController;
	}

	public void setSendToController(String sendToController) {
		SendToController = sendToController;
	}

}
