package com.app.intraway2;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import ec.com.grupotvcable.wsdlintraway2.Comando;
import tvcable.app.comarch.utils.Codigos;

import ec.com.grupotvcable.wsdlintraway2.Mensaje;
import ec.com.grupotvcable.wsdlintraway2.Respuesta; 

public class AprovisionaIntraway {

	private Comando Cmd = null;
	
	
	public AprovisionaIntraway(Comando comando) {
		this.Cmd = comando;
	}

	public Respuesta Aprovicionar() throws RemoteException, ServiceException {
		Respuesta Resp = new Respuesta();
		Mensaje Men = new Mensaje();
		
		Resp.setCabecera(Cmd.getCabecera());
		
		if(Cmd.getCabecera().getNegocio().equals(""+Codigos.SURATEL)){
			Men = new Interfaces(Cmd).getRespuesta();
		}else{
			Men.setCodError("0");
			Men.setDetMensaje(Codigos.MensNegocioIncorrecto);
		}
		Resp.setMensaje(Men);
		
		return Resp;
	}

	

}
