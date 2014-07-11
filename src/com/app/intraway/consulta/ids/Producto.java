package com.app.intraway.consulta.ids;

import com.app.dao.conciliacion.AdmConciliacion;
import com.app.dao.conciliacion.cms.AdmConciliacionCms;


public abstract class Producto extends General{
	
	protected String Nombre;
	protected String IdProducto;
	protected String IdProductoPadre;
	protected String Estado = "";
	protected boolean IsIdCero = false;
	protected String IdEmpresaCRM;
	protected String IdClienteCRM;
	
	protected AdmConciliacion admConciliacion = null;
	private AdmConciliacionCms admConciliacionCm = null;
	
	
	public Producto(){
		super(null,null,null);
	}
	
	public Producto(String userEliminacion, String remoteHost, String remoteIp, String nombre, String idProducto, String idProductoPadre, String estado){
		
		super(remoteHost, remoteIp, userEliminacion);
		
		this.setUserEliminacion(userEliminacion);
		this.setIdProducto(idProducto);
		this.setIdProductoPadre(idProductoPadre);
		this.setNombre(nombre);
		this.setRemoteHost(remoteHost);
		this.setRemoteIp(remoteIp);
		if(estado!=null){
			this.setEstado(estado.equals("SI")?"Activo":"Inactivo");
			if(this.getNombre().equals("Email") || getNombre().equals("DialUp"))
				this.setEstado(estado.equals("0")?"Activo":"Inactivo");
		}
		
		if(idProducto.equals("0") || idProductoPadre.equals("0"))
			IsIdCero = true;
	}

	
	
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getIdProducto() {
		return IdProducto;
	}

	public void setIdProducto(String idProducto) {
		IdProducto = idProducto;
	}

	public String getIdProductoPadre() {
		return IdProductoPadre;
	}

	public void setIdProductoPadre(String idProductoPadre) {
		IdProductoPadre = idProductoPadre;
	}
	
	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public boolean isIdCero(){
		return IsIdCero;
	}

	public String getIdEmpresaCRM() {
		return IdEmpresaCRM;
	}

	public void setIdEmpresaCRM(String idEmpresaCRM) {
		IdEmpresaCRM = idEmpresaCRM;
	}

	public String getIdClienteCRM() {
		return IdClienteCRM;
	}

	public void setIdClienteCRM(String idClienteCRM) {
		IdClienteCRM = idClienteCRM;
	}

	public AdmConciliacion getAdmConciliacion() {
		return admConciliacion;
	}

	public void setAdmConciliacion(AdmConciliacion admConciliacion) {
		this.admConciliacion = admConciliacion;
	}

	public AdmConciliacionCms getAdmConciliacionCm() {
		return admConciliacionCm;
	}
	public void setAdmConciliacionCm(AdmConciliacionCms admConciliacionCm) {
		this.admConciliacionCm  = admConciliacionCm;
	}
	
}
