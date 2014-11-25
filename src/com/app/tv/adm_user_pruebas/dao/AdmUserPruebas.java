package com.app.tv.adm_user_pruebas.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * AdmUserPruebas entity.
 * 
 * @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "adm_user_pruebas", catalog = "aprovgrupotv", uniqueConstraints = {})
public class AdmUserPruebas implements java.io.Serializable {

	// Fields

	private Integer iduser;
	private Integer idusuario;
	private String strusuarrio;

	// Constructors

	/** default constructor */
	public AdmUserPruebas() {
	}

	/** full constructor */
	public AdmUserPruebas(Integer iduser, Integer idusuario, String strusuarrio) {
		this.iduser = iduser;
		this.idusuario = idusuario;
		this.strusuarrio = strusuarrio;
	}

	// Property accessors
	@Id
	@Column(name = "iduser", unique = true, nullable = false, insertable = true, updatable = true)
	public Integer getIduser() {
		return this.iduser;
	}

	public void setIduser(Integer iduser) {
		this.iduser = iduser;
	}

	@Column(name = "idusuario", unique = false, nullable = false, insertable = true, updatable = true)
	public Integer getIdusuario() {
		return this.idusuario;
	}

	public void setIdusuario(Integer idusuario) {
		this.idusuario = idusuario;
	}

	@Column(name = "strusuarrio", unique = false, nullable = false, insertable = true, updatable = true, length = 45)
	public String getStrusuarrio() {
		return this.strusuarrio;
	}

	public void setStrusuarrio(String strusuarrio) {
		this.strusuarrio = strusuarrio;
	}

}