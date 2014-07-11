package com.app.intraway.consulta.ids;

public abstract class General {

	protected String RemoteHost;
	protected String RemoteIp;
	
	protected String UserEliminacion;
	protected String UserPerfil;
	
	
	public General(String remoteHost, String remoteIp, String userEliminacion) {
		this.setRemoteHost(remoteHost);
		this.setRemoteIp(remoteIp);
		this.setUserEliminacion(userEliminacion);
		//this.setUserPerfil(userPerfil);
	}
	
	public String getRemoteHost() {
		return RemoteHost;
	}


	public void setRemoteHost(String remoteHost) {
		RemoteHost = remoteHost;
	}


	public String getRemoteIp() {
		return RemoteIp;
	}


	public void setRemoteIp(String remoteIp) {
		RemoteIp = remoteIp;
	}


	public String getUserEliminacion() {
		return UserEliminacion;
	}


	public void setUserEliminacion(String userEliminacion) {
		UserEliminacion = userEliminacion;
	}


	public String getUserPerfil() {
		return UserPerfil;
	}


	public void setUserPerfil(String userPerfil) {
		UserPerfil = userPerfil;
	}


	

}
