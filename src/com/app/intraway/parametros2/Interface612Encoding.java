package com.app.intraway.parametros2;

public class Interface612Encoding implements IXMLEncoding {

	private String Password;
	private String Username;
	
	public Interface612Encoding(String password, String username) {
		this.setPassword(password);
		this.setUsername(username);
	}

	public String getXMLEncoding() {
		StringBuilder str = new StringBuilder(8);
		str.append("<handleDialupAccount>");
		str.append("<username>"+this.getUsername()+"</username>");
		str.append("<password>"+this.getPassword()+"</password>");
		str.append("</handleDialupAccount>");
		return str.toString();
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

}
