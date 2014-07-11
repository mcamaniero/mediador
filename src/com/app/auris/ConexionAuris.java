package com.app.auris;

import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;

public class ConexionAuris{
	
	public PostMethod Post = null;
	private static final String USER = "setel";
	private static final String PASSWORD = "9093";
	private static final String URL = "https://auristechnology.com/webservices/testtransactions.asp";
	
	public ConexionAuris(){

		Post = new PostMethod(URL);
		Post.setDoAuthentication(false);
		Post.addParameter("user_id", USER);
		Post.addParameter("user_pw", PASSWORD);
		Post.addParameter("response_type", "03");
	}


	public void addParametro(String clave, String valor){
		Post.addParameter(clave, valor);
	}

	public PostMethod getPost(){
		return Post;
	}
	
	public void PrintValues(){
		for(NameValuePair v : Post.getParameters())
			System.out.println(v.getName()+" : "+v.getValue());
	}
	
}