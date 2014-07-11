package com.app.intraway.parametros2;

public class Interface820Encoding implements IXMLEncoding{

	private String CmsCrmID;
	private String IspMTACrmId;//null
	private String ProfileCrmId;
	private String ProductName;
	private String Provisioning;
	private String Hostname;
	private String ActivationCode;
	private String SendToController;
	
	public Interface820Encoding(String cmsCrmID, String ispMTACrmId, String profileCrmId,
						String productName, String provisioning, String hostname, 
						String activationCode, String sendToController){
		this.setActivationCode(activationCode);
		this.setCmsCrmID(cmsCrmID);
		this.setHostname(hostname);
		this.setIspMTACrmId(ispMTACrmId);
		this.setProductName(productName);
		this.setProfileCrmId(profileCrmId);
		this.setProvisioning(provisioning);
		this.setSendToController(sendToController);
	}
	
	public String getXMLEncoding() {
		StringBuilder str = new StringBuilder(8);
		str.append("<handleMTA>");
		str.append("<cmsCrmID>"+this.getCmsCrmID()+"</cmsCrmID>");//
		
		String tmp="";
		switch (Integer.parseInt(getIspMTACrmId())){
		case 50: tmp = "default-mta"; break;
		case 110: tmp = "default"; break;
		case 322: tmp = "defaultcmcue"; break;
		case 323: tmp = "defaultcmgye"; break;
		case 324: tmp = "defaultcmmch"; break;
		case 325: tmp = "defaultcmmac"; break;		
		case 328: tmp = "defaultcmman"; break;
		case 321: tmp = "defaultcmuio"; break;
		case 329: tmp = "defaultcmamb"; break;
		//Codigo agregado por Jesús Yandún bodega virtual
		case 330: tmp = "defaultcmcf"; break;
		case 337: tmp = "defaultcmwllcue"; break;
		case 327: tmp = "defaultcmwllgye"; break;
		case 326: tmp = "defaultcmwlluio";
		}
		
		str.append("<ispMTACrmId>"+tmp+"</ispMTACrmId>");//
		str.append("<profileCrmId>"+this.getProfileCrmId()+"</profileCrmId>");//
		str.append("<ProductName>"+this.getProductName()+"</ProductName>");//
		str.append("<Provisioning>"+this.getProvisioning()+"</Provisioning>");//
		str.append("<Hostname>"+this.getHostname()+"</Hostname>");//
		str.append("<ActivationCode>"+this.getActivationCode()+"</ActivationCode>");//
		str.append("<SendToController>"+this.getSendToController()+"</SendToController>");//
		str.append("</handleMTA>");
		
		return str.toString();
	}
	
	public String getCmsCrmID() {
		return CmsCrmID;
	}

	public void setCmsCrmID(String cmsCrmID) {
		CmsCrmID = cmsCrmID;
	}

	public String getProvisioning() {
		return this.Provisioning;
	}

	public String getIspMTACrmId() {
		return IspMTACrmId;
	}

	public void setIspMTACrmId(String ispMTACrmId) {
		IspMTACrmId = ispMTACrmId;
	}

	public String getProfileCrmId() {
		return ProfileCrmId == null ? "" : this.ProfileCrmId;
	}

	public void setProfileCrmId(String profileCrmId) {
		ProfileCrmId = profileCrmId;
	}

	public String getProductName() {
		return ProductName == null ? "" : this.ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public String getHostname() {
		return Hostname == null ? "" : this.Hostname;
	}

	public void setHostname(String hostname) {
		Hostname = hostname;
	}

	public String getActivationCode() {
		return ActivationCode == null ? "" : this.ActivationCode;
	}

	public void setActivationCode(String activationCode) {
		ActivationCode = activationCode;
	}

	public String getSendToController() {
		return SendToController == null ? "" : this.SendToController;
	}

	public void setSendToController(String sendToController) {
		SendToController = sendToController;
	}

	public void setProvisioning(String provisioning) {
		Provisioning = provisioning;
	}

	

}
