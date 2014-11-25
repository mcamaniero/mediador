package com.app.intraway.parametros2;

public class Interface824Encoding implements IXMLEncoding {

	private String EndpointNumber;
	private String TN;
	private String ProfileCrmId;
	private String HomeExchangeCrmId;
	private String Provisioning;
	private String SendToController;
	
	
	public Interface824Encoding(String endpointNumber, String tn, String profileCrmId,
			String homeExchangeCrmId, String provisioning, String sendToController) {
		this.setEndpointNumber(endpointNumber);
		this.setHomeExchangeCrmId(homeExchangeCrmId);
		this.setProfileCrmId(profileCrmId);
		this.setProvisioning(provisioning);
		this.setTN(tn);
		this.setSendToController(sendToController);
	}

	public String getXMLEncoding() {
		StringBuilder str = new StringBuilder(8);
		str.append("<handleEndPoint>");
		str.append("<EndpointNumber>"+this.getEndpointNumber()+"</EndpointNumber>");// 
		str.append("<TN>"+this.getTN()+"</TN>");
		str.append("<ProfileCrmId>"+this.getProfileCrmId()+"</ProfileCrmId>");//
		str.append("<HomeExchangeCrmId>"+this.getHomeExchangeCrmId()+"</HomeExchangeCrmId>");//
		str.append("<Provisioning>"+this.getProvisioning()+"</Provisioning>");//
		str.append("<SendToController>"+this.getSendToController()+"</SendToController>");//
		str.append("</handleEndPoint>");
		return str.toString();
	}

	public String getEndpointNumber() {
		return EndpointNumber;
	}

	public void setEndpointNumber(String endpointNumber) {
		EndpointNumber = endpointNumber;
	}

	public String getTN() {
		return TN == null ? "" : this.TN;
	}

	public void setTN(String tn) {
		TN = tn;
	}

	public String getProfileCrmId() {
		return ProfileCrmId == null ? "" : this.ProfileCrmId;
	}

	public void setProfileCrmId(String profileCrmId) {
		ProfileCrmId = profileCrmId;
	}

	public String getHomeExchangeCrmId() {
		return HomeExchangeCrmId == null ? "" : this.HomeExchangeCrmId;
	}

	public void setHomeExchangeCrmId(String homeExchangeCrmId) {
		HomeExchangeCrmId = homeExchangeCrmId;
	}

	public String getProvisioning() {
		return this.Provisioning;
	}

	public void setProvisioning(String provisioning) {
		Provisioning = provisioning;
	}

	public String getSendToController() {
		return SendToController == null ? "" : this.SendToController;
	}

	public void setSendToController(String sendToController) {
		SendToController = sendToController;
	}

}
