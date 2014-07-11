package com.app.dao;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.MappedSuperclass;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public abstract class CabeceraDao implements Serializable{

	private static final long serialVersionUID = -5327330265764494976L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected Integer Id = null;
	@Temporal(TemporalType.TIMESTAMP)
	protected Date Fecha = null;
	protected int idEmpresa;
	protected int Negocio;
	protected int Interfaz;
	protected int Secuencia;
	protected String CodError;
	protected String DetMensaje;
	
	@Temporal(TemporalType.TIMESTAMP)
	protected Date FechaResp = null;
	

	public CabeceraDao(){
		
	}
	
	public CabeceraDao(Date fecha, int idEmpresa, int negocio, int interfaz, int secuencia, String codError, 
			String detMensaje) {
		this.setFecha(fecha);
		this.setIdEmpresa(idEmpresa);
		this.setInterfaz(interfaz);
		this.setNegocio(negocio);
		this.setSecuencia(secuencia);
		this.setCodError(codError);
		this.setDetMensaje(detMensaje);
	}


	public int getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(int idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public int getNegocio() {
		return Negocio;
	}

	public void setNegocio(int negocio) {
		Negocio = negocio;
	}

	public int getInterfaz() {
		return Interfaz;
	}

	public void setInterfaz(int interfaz) {
		Interfaz = interfaz;
	}

	public int getSecuencia() {
		return Secuencia;
	}

	public void setSecuencia(int secuencia) {
		Secuencia = secuencia;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date fecha) {
		Fecha = fecha;
	}

	public String getCodError() {
		return CodError;
	}

	public void setCodError(String codError) {
		CodError = codError;
	}

	public String getDetMensaje() {
		return DetMensaje;
	}

	public void setDetMensaje(String detMensaje) {
		DetMensaje = detMensaje;
	}

	public Date getFechaResp() {
		return FechaResp;
	}

	public void setFechaResp(Date fecha) {
		FechaResp = fecha;
	}
	
}
