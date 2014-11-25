package com.app.intraway.parametros;

public class Interface628Encoding implements IXMLEncoding {

	private String idMensajeCRM;
	private String Datos;
	
	public Interface628Encoding(String idMensajeCRM, String Datos) {
		this.setIdMensajeCRM(idMensajeCRM);
		this.setDatos(Datos);
	}

	public String getXMLEncoding() {
		StringBuilder str = new StringBuilder(8);
		str.append("<handleCMMsg>");
		str.append("<idMensajeCRM>"+this.getIdMensajeCRM()+"</idMensajeCRM>");
		str.append("<Datos>"+this.getDatos()+"</Datos>");
		str.append("</handleCMMsg>");
		return str.toString();
	}

	public String getIdMensajeCRM() {
		return idMensajeCRM;
	}

	public void setIdMensajeCRM(String idMensajeCRM) {
		this.idMensajeCRM = idMensajeCRM;
	}

	public String getDatos() {
		return Datos;
	}

	public void setDatos(String datos) {
		Datos = datos;
	}
	
	

	

}
