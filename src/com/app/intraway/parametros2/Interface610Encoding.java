package com.app.intraway.parametros2;

public class Interface610Encoding implements IXMLEncoding {

	private String FacTrafico;
	
	public Interface610Encoding(String facTrafico) {
		this.setFacTrafico(facTrafico);
	}

	public String getXMLEncoding() {
		StringBuilder str = new StringBuilder();
		str.append("<handleDialup>");
		str.append("<serviceTypeCRMId>1</serviceTypeCRMId>");
		str.append("</handleDialup>");
		return str.toString();
	}

	public String getFacTrafico() {
		return FacTrafico;
	}

	public void setFacTrafico(String facTrafico) {
		FacTrafico = facTrafico;
	}

}
