package com.app.intraway.parametros;

public class Interface824Encoding implements IXMLEncoding {

	private Integer EndpointNumber;
	private String TN;
	private String ProfileCrmId;
	private String HomeExchangeCrmId;
	private Integer Provisioning;
	private String SendToController;
	
	
	public Interface824Encoding(Integer endpointNumber, String tn, String profileCrmId,
			String homeExchangeCrmId, Integer provisioning, String sendToController) {
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
		//str.append("<TN>"+this.getTN().substring(4)+"</TN>");//59346001041 = 6001041
		
		/**
		 * 
		 */
		if (this.getTN().toString().startsWith("5934") || this.getTN().toString().startsWith("5932"))
		{  //Si ciudad  ingresa con prefijo de GYE o UIO se quita
		   //los primeros cuatro digitos para cargar el numero en 
		   //SAFARI UIO y SAFARI GYE
			str.append("<TN>"+this.getTN().substring(4)+"</TN>");//59346001041 = 6001041
		}
		else
		{  //Sino quita
		   //los primeros tres digitos para cargar el prefijo en 
		   //SAFARI NAC
			str.append("<TN>"+this.getTN().substring(3)+"</TN>");//59376001041 = 76001041
		}
		/**
		 * 
		 */
		str.append("<ProfileCrmId>"+this.getProfileCrmId()+"</ProfileCrmId>");//
		str.append("<HomeExchangeCrmId>"+this.getHomeExchangeCrmId()+"</HomeExchangeCrmId>");//
		str.append("<Provisioning>"+this.getProvisioning()+"</Provisioning>");//
		str.append("<SendToController>"+this.getSendToController()+"</SendToController>");//
		str.append("</handleEndPoint>");
		return str.toString();
	}

	public Integer getEndpointNumber() {
		return EndpointNumber;
	}

	public void setEndpointNumber(Integer endpointNumber) {
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

	public Integer getProvisioning() {
		return Provisioning == null ? 0 : this.Provisioning;
	}

	public void setProvisioning(Integer provisioning) {
		Provisioning = provisioning;
	}

	public String getSendToController() {
		return SendToController == null ? "" : this.SendToController;
	}

	public void setSendToController(String sendToController) {
		SendToController = sendToController;
	}

}
