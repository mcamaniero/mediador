package com.app.intraway.consulta.ids;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.app.intraway.parametros2.Interfaces;

public class CallFeature extends Producto{

	private String CfName;
	private String Custom1="";
	private String Custom2="";
	
	
	public CallFeature(){
		super(null, null,null, null, null, null, null);
	}
	
	public CallFeature(String userEliminacion, String remoteHost, String remoteIp, String nombre, String estado, String idProducto, String idProductoPadre, String cfName,
			String custom1, String custom2) {
		super(userEliminacion, remoteHost, remoteIp, nombre, idProducto, idProductoPadre, estado);
		this.setCfName(cfName);
		
		this.setCustom1(custom1==null?"":custom1);
		this.setCustom2(custom2==null?"":custom2);
	}
	
	
	public String getCfName() {
		return CfName;
	}

	public void setCfName(String cfName) {
		CfName = cfName;
	}
	
	public String getCustom1() {
		return Custom1;
	}

	public void setCustom1(String custom1) {
		Custom1 = custom1;
	}

	public String getCustom2() {
		return Custom2;
	}

	public void setCustom2(String custom2) {
		Custom2 = custom2;
	}
	
	
	public void EliminarEspacio() throws RemoteException, ServiceException{
		if(!getIdProducto().equals("-1") && !getIdProductoPadre().equals("-1"))
			new Interfaces(this, Interfaces.INTERFAZ_CALLFEATURE, this.UserEliminacion).EjecutarAccion(Interfaces.ACCION_ELIMINAR);
		
	}


}
