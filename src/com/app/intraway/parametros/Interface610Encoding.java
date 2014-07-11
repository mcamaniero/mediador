package com.app.intraway.parametros;

public class Interface610Encoding implements IXMLEncoding {

	private Integer FacTrafico;
	
	public Interface610Encoding(Integer facTrafico) {
		this.setFacTrafico(facTrafico);
	}

	public String getXMLEncoding() {
		StringBuilder str = new StringBuilder();
		str.append("<handleDialup>");
		str.append("<serviceTypeCRMId>1</serviceTypeCRMId>");
		str.append("</handleDialup>");
		return str.toString();
	}

	public Integer getFacTrafico() {
		return FacTrafico;
	}

	public void setFacTrafico(Integer facTrafico) {
		FacTrafico = facTrafico;
	}

}
