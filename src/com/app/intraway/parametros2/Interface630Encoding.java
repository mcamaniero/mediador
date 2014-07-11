package com.app.intraway.parametros2;

public class Interface630Encoding implements IXMLEncoding{

	private String Cantidad;
	
	//verificar el documento: manual de integracion version 4.1
	
	
	//esta interfaz no esta en el documento: Documentacino del Web Services
	
	public Interface630Encoding(String cantidad){
		this.setCantidad(cantidad);
	}
	
	public String getXMLEncoding() {
		StringBuilder str = new StringBuilder(8);
		str.append("<handlePC>");
		str.append("<Cantidad>"+this.getCantidad()+"</Cantidad>");
		str.append("</handlePC>");
		return str.toString();
	}

	public String getCantidad() {
		return Cantidad;
	}

	public void setCantidad(String cantidad) {
		Cantidad = cantidad;
	}

}
