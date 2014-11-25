package com.app.tv.adm_errores.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * AdmErrores entity.
 * 
 * @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "adm_errores", catalog = "aprovgrupotv", uniqueConstraints = {})
public class AdmErrores implements java.io.Serializable {

	// Fields

	private String errorId;
	private Integer intCodigoNegocio;
	private String strMensaje;

	// Constructors

	/** default constructor */
	public AdmErrores() {
	}

	/** full constructor */
	public AdmErrores(String errorId, Integer intCodigoNegocio,
			String strMensaje) {
		this.errorId = errorId;
		this.intCodigoNegocio = intCodigoNegocio;
		this.strMensaje = strMensaje;
	}

	// Property accessors
	@Id
	@Column(name = "error_id", unique = true, nullable = false, insertable = true, updatable = true, length = 5)
	public String getErrorId() {
		return this.errorId;
	}

	public void setErrorId(String errorId) {
		this.errorId = errorId;
	}

	@Column(name = "int_codigo_negocio", unique = false, nullable = false, insertable = true, updatable = true)
	public Integer getIntCodigoNegocio() {
		return this.intCodigoNegocio;
	}

	public void setIntCodigoNegocio(Integer intCodigoNegocio) {
		this.intCodigoNegocio = intCodigoNegocio;
	}

	@Column(name = "str_mensaje", unique = false, nullable = false, insertable = true, updatable = true, length = 254)
	public String getStrMensaje() {
		return this.strMensaje;
	}

	public void setStrMensaje(String strMensaje) {
		this.strMensaje = strMensaje;
	}

}