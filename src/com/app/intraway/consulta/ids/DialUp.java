package com.app.intraway.consulta.ids;

import java.rmi.RemoteException;
import java.util.GregorianCalendar;

import javax.xml.rpc.ServiceException;

import com.app.dao.AllDAO;
import com.app.dao.EntityManagerHelper;
import com.app.dao.Intraway;
import com.app.dao.IntrawayImpl;
import com.app.dao.conciliacion.AdmConciliacionDAO;
import com.app.intraway.parametros2.Interfaces;

public class DialUp extends Producto {

	private String UserName;
	private String Password;
	
	public DialUp(String idProducto, String idProductoPadre){
		super(null, null, null, null, idProducto,
				idProductoPadre, null);
	}
			
	public DialUp(String userEliminacion, String remoteHost, String remoteIp,
			String nombre, String idProducto, String idProductoPadre,
			String estado) {
		super(userEliminacion, remoteHost, remoteIp, nombre, idProducto,
				idProductoPadre, estado);
	}

	
	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	
	
	
	public String EliminarDialUp() throws RemoteException, ServiceException{
		return EliminarEspacio();
	}

	private String EliminarEspacio() throws RemoteException, ServiceException {

		Intraway LogIntraway = new IntrawayImpl().Guardar(this);
		String resultado = new Interfaces(this, Interfaces.INTERFAZ_DIALUP, this.UserEliminacion).EjecutarAccion(Interfaces.ACCION_ELIMINAR);
		
		String[] resul = resultado.split(":");
		String codError = resul[0].trim();
		String detError = resul[1].trim();
		
		LogIntraway.setCodError(codError);
		LogIntraway.setDetMensaje(detError);
		LogIntraway.setFechaResp(GregorianCalendar.getInstance().getTime());

		EntityManagerHelper.beginTransaction();
		new AllDAO().update(LogIntraway);
		EntityManagerHelper.commit();
		
		return codError+","+detError;
		
	}

	public boolean ExiteEnIw(DialUp[] dial) {
		for(DialUp tmp : dial)
			if(this.equals(tmp)){
				//si existe guado en la base que si existe
				tmp.getAdmConciliacion().setExiste(true);
				tmp.getAdmConciliacion().setAddressIw(this.getUserName());
				EntityManagerHelper.beginTransaction();
				new AdmConciliacionDAO().update(tmp.getAdmConciliacion());
				EntityManagerHelper.commit();
				return true;
			}
		
		return false;
	}

	@Override
	public boolean equals(Object obj){
		return (this.IdProducto.equals( ((DialUp)obj).getIdProducto() )) 
				? true : false;
	}

}
