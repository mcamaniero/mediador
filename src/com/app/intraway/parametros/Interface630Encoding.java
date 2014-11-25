package com.app.intraway.parametros;

public class Interface630Encoding implements IXMLEncoding{

	private Integer Cantidad;
	
	//verificar el documento: manual de integracion version 4.1
	
	
	//esta interfaz no esta en el documento: Documentacino del Web Services
	
	public Interface630Encoding(Integer cantidad){
		this.setCantidad(cantidad);
	}
	
	public String getXMLEncoding() {
		StringBuilder str = new StringBuilder(8);
		str.append("<handlePC>");
		str.append("<Cantidad>"+this.getCantidad()+"</Cantidad>");
		str.append("</handlePC>");
		return str.toString();
	}

	public Integer getCantidad() {
		return Cantidad;
	}

	public void setCantidad(Integer cantidad) {
		Cantidad = cantidad;
	}

}
