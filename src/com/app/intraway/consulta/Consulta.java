package com.app.intraway.consulta;

import javax.xml.rpc.ServiceException;
import javax.xml.rpc.holders.StringHolder;

import intrawayWS.cliente.IntrawayWSDLLocator;
import intrawayWS.cliente.IntrawayWSDLPortType;

public class Consulta {

public static final String AuthKey = "key-secreto-titan";
	
	protected final IntrawayWSDLLocator locator = new IntrawayWSDLLocator();
	protected IntrawayWSDLPortType Cliente = locator.getIntrawayWSDLPort(); 
	
	protected StringHolder idError = new StringHolder();
	protected StringHolder errorStr = new StringHolder();

	public Consulta() throws ServiceException {
		
	}

}
