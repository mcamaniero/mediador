package com.app.intraway;

public class IntrawayExceptions extends Exception {

	private static final long serialVersionUID = -5944380431604305393L;
	private int CodError;
	
	public IntrawayExceptions() {
	}
	
	public IntrawayExceptions(int codError, String message) {
		super(message);
		this.CodError = codError;
	}
	
	
	public int getCodError(){
		return this.CodError;
	}
	
}
