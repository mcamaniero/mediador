package com.app.auris;

import java.io.IOException;

import org.apache.commons.httpclient.HttpException;
import org.jdom.JDOMException;

import tvcable.app.comarch.utils.Codigos;
import ec.com.grupotvcable.wsdlauris.Cabecera;
import ec.com.grupotvcable.wsdlauris.Comando;
import ec.com.grupotvcable.wsdlauris.Mensaje;
import ec.com.grupotvcable.wsdlauris.Respuesta;

public class AprovisionarAuris {

	private static final int CREACION_PIN 		= 118;
	private static final int CREACION_SOLO_PIN 	= 100;
	private static final int ELIMINACION_PIN	= 109;
	
	private static final int AGREGAR_NUM 		= 106;
	private static final int ELIMINAR_NUM 		= 107;
	
	private static final int CREACION_DID	 	= 120;
	private static final int ELIMINACION_DID	= 121;
	private static final int MOVER_DID_A_ANI 	= 126;
		
	private static final int CREACION_1800	 	= 122;
	private static final int ELIMINACION_1800	= 123;
	
	private static final int RECARGA_SALDO 		= 110;
	private static final int RECARGA_SALDO_NEW_PIN 		= 125;
	private static final int CONSULTA_SALDO 	= 111;

	
	private int[] CodUsuarios = {1,21,34,38,1551,606,1478,36,61,35,25,1479,40,1575,938,358,623,798};
	
		
	private Respuesta Resp = new Respuesta();
	
	private Cabecera Cab = null;
	private AurisImpl AurImpl = null;
	
	int idUsuario;
	
	
	public AprovisionarAuris(Comando ejecutaComando) {
		
		
		Cab = ejecutaComando.getCabecera();
		//idUsuario = Integer.parseInt(ejecutaComando.getDetalle().getAuris().getReferencia()); 
		AurImpl  = new AurisImpl(ejecutaComando.getDetalle().getAuris());
	}

	public Respuesta Aprovisionar() throws HttpException, IOException, JDOMException {
		Resp.setCabecera(Cab);
		Mensaje Mens = new Mensaje();
		boolean esUsuario = false;
		
		/*for(int i : CodUsuarios)
			if(i == idUsuario){
				esUsuario = true;
				break;
			}
		
		if(esUsuario){//pasan los comandos al Auris*/
			if(Cab.getNegocio() == Codigos.SETEL){
				switch (Cab.getInterface()){
				case CREACION_PIN:		Mens = AurImpl.CreacionPin();		break;
				case CREACION_SOLO_PIN:	Mens = AurImpl.CreacionSoloPin();	break;
				case ELIMINACION_PIN:	Mens = AurImpl.EliminacionPin();	break;
				case AGREGAR_NUM:		Mens = AurImpl.AgregarNumAlPin();	break;
				case ELIMINAR_NUM:		Mens = AurImpl.EliminarNumAlPin();	break;
				case CREACION_DID:		Mens = AurImpl.CreacionDid();		break;
				case ELIMINACION_DID:	Mens = AurImpl.EliminacionDid();	break;
				case MOVER_DID_A_ANI:	Mens = AurImpl.MoverDidaAni();		break;
				case CREACION_1800:		Mens = AurImpl.Creacion1800();		break;
				case ELIMINACION_1800:	Mens = AurImpl.Eliminacion1800();	break;
				case RECARGA_SALDO:		Mens = AurImpl.RecargaSaldo();		break;
				case RECARGA_SALDO_NEW_PIN:		Mens = AurImpl.RecargaSaldoDesdeOtroPin();		break;
				case CONSULTA_SALDO:	Mens = AurImpl.ConsultaSaldo();		break;
				
				}
			}else{
				Mens.setCodError(2);
				Mens.setDetMensaje(Codigos.MensNegocioIncorrecto);
			}
		/*}else{//preceso realizado con exito
			Mens.setCodError(1000);
			Mens.setDetMensaje("Usuario no habilitado para Aprovisionar en Auris");
		}*/
		Resp.setMensaje(Mens);
		return Resp;
	}
	
	
}
