package com.app.safari;

import java.util.HashMap;

public class Linea {

	private String ServiceId;
	private String AdminStatus;
	private String DisplayName;
	private String HomeExchangeId;
	private String SipDestAddr;
	private String MtaAddress;
	private String NetworkType;
	private String PasswordSip;
	private HashMap<String, String> ListOfCallFeatures;
	
	private String Error = "";
	private String DetMensaje = "";
	

	public Linea(){
		
	}

	public Linea(String serviceId, String adminStatus, String displayName, 
			String homeExchangeId, String sipDestAddr, String mtaAddress, String networkType,
			HashMap<String, String> listOfCallFeatures) {
		this.setAdminStatus(adminStatus);
		this.setDisplayName(displayName);
		this.setHomeExchangeId(homeExchangeId);
		this.setMtaAddress(mtaAddress);
		this.setServiceId(serviceId);
		this.setSipDestAddr(sipDestAddr);
		this.setNetworkType(networkType);
		this.setListOfCallFeatures(listOfCallFeatures);
	}
	
	public Linea(String serviceId, String adminStatus, String displayName, 
			String homeExchangeId, String sipDestAddr, String mtaAddress, String networkType,
			String password, HashMap<String, String> listOfCallFeatures) {
		this.setAdminStatus(adminStatus);
		this.setDisplayName(displayName);
		this.setHomeExchangeId(homeExchangeId);
		this.setMtaAddress(mtaAddress);
		this.setServiceId(serviceId);
		this.setSipDestAddr(sipDestAddr);
		this.setNetworkType(networkType);
		this.setListOfCallFeatures(listOfCallFeatures);
	}
	
	public String getServiceId() {
		return ServiceId;
	}


	public void setServiceId(String serviceId) {
		ServiceId = serviceId;
	}


	public String getAdminStatus() {
		return AdminStatus;
	}


	public void setAdminStatus(String adminStatus) {
		AdminStatus = adminStatus;
	}


	public String getDisplayName() {
		return DisplayName;
	}


	public void setDisplayName(String displayName) {
		DisplayName = displayName;
	}

	public String getHomeExchangeId() {
		return HomeExchangeId;
	}

	public void setHomeExchangeId(String homeExchangeId) {
		HomeExchangeId = homeExchangeId;
	}

	public String getSipDestAddr() {
		return SipDestAddr;
	}

	public void setSipDestAddr(String sipDestAddr) {
		SipDestAddr = sipDestAddr;
	}

	public String getMtaAddress() {
		return MtaAddress;
	}

	public void setMtaAddress(String mtaAddress) {
		MtaAddress = mtaAddress;
	}

	public String getError() {
		return Error;
	}

	public void setError(String error) {
		Error = error;
	}

	public String getDetMensaje() {
		return DetMensaje;
	}

	public void setDetMensaje(String detMensaje) {
		DetMensaje = detMensaje;
	}

	public String getNetworkType() {
		return NetworkType;
	}

	public void setNetworkType(String networkType) {
		NetworkType = networkType;
	}
	
	public String getPasswordSip() {
		return PasswordSip;
	}

	public void setPasswordSip(String passwordSip) {
		PasswordSip = passwordSip;
	}

	public HashMap<String,String> getListOfCallFeatures() {
		return ListOfCallFeatures;
	}

	public void setListOfCallFeatures(HashMap<String,String> listOfCallFeatures) {
		ListOfCallFeatures = listOfCallFeatures;
	}
	


}
