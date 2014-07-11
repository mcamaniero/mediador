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

public class Email extends Producto {
	
	private String ServidorEmailCrmId = "";
	private String Name = "";
	private String UserName = "";
	private String Password = "";
	private String Dominio = "";
	private String DiskQuota = "";
	
	public Email(String idProducto, String idProductoPadre) {
		super(null, null, null, null, idProducto,
				idProductoPadre, null);
	}

	public Email(String userEliminacion, String remoteHost, String remoteIp,
			String nombre, String idProducto, String idProductoPadre,
			String estado) {
		super(userEliminacion, remoteHost, remoteIp, nombre, idProducto,
				idProductoPadre, estado);
		
	}
	

	public String getServidorEmailCrmId() {
		return ServidorEmailCrmId==null ? "0" : ServidorEmailCrmId;
	}

	public void setServidorEmailCrmId(String servidorEmailCrmId) {
		ServidorEmailCrmId = servidorEmailCrmId;
	}

	public String getName() {
		return Name == null ? "" : Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getUserName() {
		return UserName == null ? "" : UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getPassword() {
		return Password == null ? "" : Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getDominio() {
		return Dominio == null ? "" : Dominio;
	}

	public void setDominio(String dominio) {
		Dominio = dominio;
	}

	public String getDiskQuota() {
		return DiskQuota  == null ? "0" : DiskQuota;
	}

	public void setDiskQuota(String diskQuota) {
		DiskQuota = diskQuota;
	}
	
	
	public String EliminarEmail() throws RemoteException, ServiceException{
		return EliminarEspacio();
	}

	private String EliminarEspacio() throws RemoteException, ServiceException {

		Intraway LogIntraway = new IntrawayImpl().Guardar(this);
		String resultado = new Interfaces(this, Interfaces.INTERFAZ_EMAIL, this.UserEliminacion).EjecutarAccion(Interfaces.ACCION_ELIMINAR);
		
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

	/**
	 * Compara un Mail consultado de IW con una lista de Mails consultados de BaseTitan
	 * @param em
	 * @return
	 */
	public boolean ExiteEnIw(Email[] em) {
		for(Email tmp : em)
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
		//System.out.println("ID1: "+this.getIdProducto()+" "+((Email)obj).getIdProducto());
		//System.out.println("ID2: "+this.getIdProductoPadre()+" "+((Email)obj).getIdProductoPadre());
		/*return (this.IdProducto.equals( ((Email)obj).getIdProducto() ) 
				&& this.getIdProductoPadre().equals(((Email)obj).getIdProductoPadre())) 
				? true : false;*/
		
		return (this.IdProducto.equals( ((Email)obj).getIdProducto() )) 
				? true : false;
	}

}
