package com.app.intraway.parametros;

public class Interface620Encoding implements IXMLEncoding{

	private Integer USChannelId;
	private Integer StartingBalance;
	private Integer CantCPE;
	private Integer EnableAccounting;
	private String Hub;
	private String Nodo;
	private Integer BuscarTagCM;
	private String Docsis;
	private String ProductName;
	private Integer IspMtaCrmId;
	private String BandPackageCrmId;
	private String PrepaidPolicyCrmId;
	private String IdISPCRM;
	private String ServicePackageCRMID;
	private Integer DSFreq;
	private String ActivationCode;
	private Integer PeriodicalBaseBalance;
	private boolean NoBoot;

	
	public Interface620Encoding(Integer uSChannelId, Integer startingBalance, Integer cantCPE, Integer enableAccounting,
			String hub, String nodo, Integer buscarTagCM, String docsis, String productName, Integer ispMtaCrmId, 
			String bandPackageCrmId, String prepaidPolicyCrmId, String idISPCRM, String servicePackageCRMID, 
			Integer dSFreq, String activationCode, Integer periodicalBaseBalance, boolean noBoot) {
		// TODO Auto-generated constructor stub
		this.setActivationCode(activationCode);
		this.setBandPackageCrmId(bandPackageCrmId);
		this.setBuscarTagCM(buscarTagCM);
		this.setCantCPE(cantCPE);
		this.setDocsis(docsis);
		this.setDSFreq(dSFreq);
		this.setEnableAccounting(enableAccounting);
		this.setHub(hub);
		this.setIdISPCRM(idISPCRM);
		this.setIspMtaCrmId(ispMtaCrmId);
		this.setNoBoot(noBoot);
		this.setNodo(nodo);
		this.setPeriodicalBaseBalance(periodicalBaseBalance);
		this.setPrepaidPolicyCrmId(prepaidPolicyCrmId);
		this.setProductName(productName);
		this.setServicePackageCRMID(servicePackageCRMID);
		this.setStartingBalance(startingBalance);
		this.setUSChannelId(uSChannelId);
	}
	
	public String getXMLEncoding() {
		StringBuilder str = new StringBuilder();
		str.append("<handleCM>");
		//str.append("<USChannelId>"+this.getUSChannelId()+"</USChannelId>");
		//str.append("<StartingBalance></StartingBalance>");
		str.append("<CantCPE>"+this.getCantCPE()+"</CantCPE>");//si
		str.append("<EnableAccounting>"+this.getEnableAccounting()+"</EnableAccounting>");//si
		str.append("<Hub>"+this.getHub()+"</Hub>");//si
		str.append("<Nodo>"+this.getNodo()+"</Nodo>");//si
		String tmp="";
		switch (this.getBuscarTagCM()){
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
		str.append("<BuscarTagCM>"+tmp+"</BuscarTagCM>");//si
		str.append("<Docsis>"+this.getDocsis()+"</Docsis>");//si
		str.append("<ProductName>"+this.getProductName()+"</ProductName>");//si
		tmp="";
		switch (this.getIspMtaCrmId()){
		case 50: tmp = "default-mta"; break;
		case 110: tmp = "default"; break;
		case 322: tmp = "defaultcmcue"; break;
		case 323: tmp = "defaultcmgye"; break;
		case 324: tmp = "defaultcmmch"; break;		
		case 325: tmp = "defaultcmmac"; break;		
		case 321: tmp = "defaultcmuio"; break;
		case 328: tmp = "defaultcmman"; break;
		case 329: tmp = "defaultcmamb"; break;
		//Codigo agregado por Jesús Yandún bodega virtual
		case 330: tmp = "defaultcmcf"; break;
		case 337: tmp = "defaultcmwllcue"; break;
		case 327: tmp = "defaultcmwllgye"; break;
		case 326: tmp = "defaultcmwlluio";
		}
		str.append("<IspMtaCrmId>"+tmp+"</IspMtaCrmId>");//si
		str.append("<BandPackageCrmId>"+this.getBandPackageCrmId()+"</BandPackageCrmId>");//si
		str.append("<PrepaidPolicyCrmId>"+this.getPrepaidPolicyCrmId()+"</PrepaidPolicyCrmId>");//si
		
		str.append("<idISPCRM>"+this.getIdISPCRM()+"</idISPCRM>");
		
		str.append("<ServicePackageCRMID>"+this.getServicePackageCRMID()+"</ServicePackageCRMID>");//si
		//str.append("<DSFreq></DSFreq>");
		str.append("<ActivationCode>"+this.getActivationCode()+"</ActivationCode>");//si
		//str.append("<PeriodicalBaseBalance></PeriodicalBaseBalance>");
		//str.append("<NoBoot>"+this.isNoBoot()+"</NoBoot>");
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



	public Integer getCantCPE() {
		return CantCPE == null ? 0 : this.CantCPE;
	}



	public void setCantCPE(Integer cantCPE) {
		CantCPE = cantCPE;
	}
	 


	public String getActivationCode() {
		return ActivationCode == null ? "" : this.ActivationCode;
	}



	public void setActivationCode(String activationCode) {
		ActivationCode = activationCode;
	}



	public Integer getDSFreq() {
		return DSFreq == null ? 0 : this.DSFreq;
	}



	public void setDSFreq(Integer dSFreq) {
		DSFreq = dSFreq;
	}



	public Integer getPeriodicalBaseBalance() {
		return PeriodicalBaseBalance == null ? 0 : this.PeriodicalBaseBalance;
	}



	public void setPeriodicalBaseBalance(Integer periodicalBaseBalance) {
		PeriodicalBaseBalance = periodicalBaseBalance;
	}

	public Integer getUSChannelId() {
		return USChannelId == null ? 0 : this.USChannelId;
	}
	
	
	public void setUSChannelId(Integer channelId) {
		USChannelId = channelId;
	}

	public Integer getStartingBalance() {
		return StartingBalance == null ? 0 : this.StartingBalance;
	}
	
	public void setStartingBalance(Integer startingBalance) {
		StartingBalance = startingBalance;
	}

	public Integer getEnableAccounting() {
		return EnableAccounting == null ? 0 : this.EnableAccounting ;
	}

	public void setEnableAccounting(Integer enableAccounting) {
		EnableAccounting = enableAccounting;
	}

	public Integer getBuscarTagCM() {
		return BuscarTagCM == null ? 0 : this.BuscarTagCM;
	}
	
	public void setBuscarTagCM(Integer buscarTagCM) {
		BuscarTagCM = buscarTagCM;
	}

	public String getDocsis() {
		return Docsis == null ? "" : Docsis;
	}

	public void setDocsis(String docsis) {
		Docsis = docsis;
	}

	public Integer getIspMtaCrmId() {
		return IspMtaCrmId == null ? 0 : this.IspMtaCrmId ;
	}

	public void setIspMtaCrmId(Integer ispMtaCrmId) {
		IspMtaCrmId = ispMtaCrmId;
	}

	public boolean isNoBoot() {
		return NoBoot;
	}

	public void setNoBoot(boolean noBoot) {
		NoBoot = noBoot;
	}



}
