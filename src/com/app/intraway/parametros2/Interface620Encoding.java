package com.app.intraway.parametros2;

public class Interface620Encoding implements IXMLEncoding{

	private String CantCPE;
	private String Hub;
	private String Nodo;
	private String BuscarTagCM;
	private String Docsis;
	private String ProductName;
	private String IspMtaCrmId;
	private String BandPackageCrmId;
	private String PrepaidPolicyCrmId;
	private String IdISPCRM;
	private String ServicePackageCRMID;
	private String ActivationCode;
	private String EnableAccounting;
	
	
	public Interface620Encoding(String cantCPE, String enableAccounting,
			String hub, String nodo, String buscarTagCM, String docsis, String productName, String ispMtaCrmId, 
			String bandPackageCrmId, String prepaidPolicyCrmId, String idISPCRM, String servicePackageCRMID, 
			String activationCode) {
		// TODO Auto-generated constructor stub
		this.setActivationCode(activationCode);
		this.setBandPackageCrmId(bandPackageCrmId);
		this.setBuscarTagCM(buscarTagCM);
		this.setCantCPE(cantCPE);
		this.setDocsis(docsis);
		this.setEnableAccounting(enableAccounting);
		this.setHub(hub);
		this.setIdISPCRM(idISPCRM);
		this.setIspMtaCrmId(ispMtaCrmId);
		this.setNodo(nodo);
		this.setPrepaidPolicyCrmId(prepaidPolicyCrmId);
		this.setProductName(productName);
		this.setServicePackageCRMID(servicePackageCRMID);
	}
	
	public String getXMLEncoding() {
		StringBuilder str = new StringBuilder();
		str.append("<handleCM>");
		str.append("<CantCPE>"+this.getCantCPE()+"</CantCPE>");//si
		str.append("<EnableAccounting>"+this.getEnableAccounting()+"</EnableAccounting>");//si
		str.append("<Hub>"+this.getHub()+"</Hub>");//si
		str.append("<Nodo>"+this.getNodo()+"</Nodo>");//si
		String tmp="";
		
		if(getBuscarTagCM()!=null && !getBuscarTagCM().equals(""))
		switch (Integer.parseInt(getBuscarTagCM())){
		case 50: tmp = "default-mta"; break;
		case 110: tmp = "default"; break;
		case 322: tmp = "defaultcmcue"; break;
		case 323: tmp = "defaultcmgye"; break;
		case 321: tmp = "defaultcmuio"; break;
		case 337: tmp = "defaultcmwllcue"; break;
		case 327: tmp = "defaultcmwllgye"; break;
		case 324: tmp = "defaultcmmch"; break;
		case 325: tmp = "defaultcmmac"; break;		
		case 328: tmp = "defaultcmman"; break;
		case 329: tmp = "defaultcmamb"; break;
		//Codigo agregado por Jesús Yandún bodega virtual
		case 330: tmp = "defaultcmcf"; break;
		case 326: tmp = "defaultcmwlluio";
		}
		str.append("<BuscarTagCM>"+tmp+"</BuscarTagCM>");//si
		str.append("<Docsis>"+this.getDocsis()+"</Docsis>");//si
		str.append("<ProductName>"+this.getProductName()+"</ProductName>");//si
		tmp="";
		
		if(getIspMtaCrmId()!=null && !getIspMtaCrmId().equals(""))
		switch (Integer.parseInt(this.getIspMtaCrmId())){
		case 50: tmp = "default-mta"; break;
		case 110: tmp = "default"; break;
		case 322: tmp = "defaultcmcue"; break;
		case 323: tmp = "defaultcmgye"; break;
		case 321: tmp = "defaultcmuio"; break;
		case 337: tmp = "defaultcmwllcue"; break;
		case 327: tmp = "defaultcmwllgye"; break;
		case 326: tmp = "defaultcmwlluio";
		}
		str.append("<IspMtaCrmId>"+tmp+"</IspMtaCrmId>");//si
		str.append("<BandPackageCrmId>"+this.getBandPackageCrmId()+"</BandPackageCrmId>");//si
		str.append("<PrepaidPolicyCrmId>"+this.getPrepaidPolicyCrmId()+"</PrepaidPolicyCrmId>");//si
		str.append("<idISPCRM>"+this.getIdISPCRM()+"</idISPCRM>");//si
		str.append("<ServicePackageCRMID>"+this.getServicePackageCRMID()+"</ServicePackageCRMID>");//si
		str.append("<ActivationCode>"+this.getActivationCode()+"</ActivationCode>");//si
		str.append("</handleCM>");
			
		return str.toString();
	}

	public String getServicePackageCRMID() {
		return ServicePackageCRMID == null ? "" : ServicePackageCRMID;
	}



	public void setServicePackageCRMID(String servicePackageCRMID) {
		ServicePackageCRMID = servicePackageCRMID;
	}



	public String getHub() {
		return Hub == null ? "" : Hub;
	}



	public void setHub(String hub) {
		Hub = hub;
	}



	public String getNodo() {
		return Nodo == null ? "" : Nodo;
	}



	public void setNodo(String nodo) {
		Nodo = nodo;
	}



	public String getIdISPCRM() {
		return IdISPCRM == null ? "" : IdISPCRM;
	}



	public void setIdISPCRM(String idISPCRM) {
		IdISPCRM = idISPCRM;
	}


	public String getProductName() {
		return ProductName == null ? "" : this.ProductName;
	}



	public void setProductName(String productName) {
		ProductName = productName;
	}



	public String getBandPackageCrmId() {
		return BandPackageCrmId == null ? "" : this.BandPackageCrmId;
	}



	public void setBandPackageCrmId(String bandPackageCrmId) {
		BandPackageCrmId = bandPackageCrmId;
	}



	public String getPrepaidPolicyCrmId() {
		return PrepaidPolicyCrmId == null ? "" : this.PrepaidPolicyCrmId;
	}



	public void setPrepaidPolicyCrmId(String prepaidPolicyCrmId) {
		PrepaidPolicyCrmId = prepaidPolicyCrmId;
	}



	public String getCantCPE() {
		return this.CantCPE;
	}



	public void setCantCPE(String cantCPE) {
		CantCPE = cantCPE;
	}
	 


	public String getActivationCode() {
		return ActivationCode == null ? "" : this.ActivationCode;
	}



	public void setActivationCode(String activationCode) {
		ActivationCode = activationCode;
	}

	public String getBuscarTagCM() {
		return this.BuscarTagCM;
	}
	
	public void setBuscarTagCM(String buscarTagCM) {
		BuscarTagCM = buscarTagCM;
	}

	public String getDocsis() {
		return Docsis == null ? "" : Docsis;
	}

	public void setDocsis(String docsis) {
		Docsis = docsis;
	}

	public String getIspMtaCrmId() {
		return this.IspMtaCrmId ;
	}

	public void setIspMtaCrmId(String ispMtaCrmId) {
		IspMtaCrmId = ispMtaCrmId;
	}

	public String getEnableAccounting() {
		return EnableAccounting;
	}

	public void setEnableAccounting(String enableAccounting) {
		EnableAccounting = enableAccounting;
	}



}
