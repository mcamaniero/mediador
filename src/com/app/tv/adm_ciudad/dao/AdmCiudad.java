package com.app.tv.adm_ciudad.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * AdmCiudad entity.
 * 
 * @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "adm_ciudad", catalog = "aprovgrupotv", uniqueConstraints = {})
public class AdmCiudad implements java.io.Serializable {

	// Fields

	private Integer ciudadId;
	private String ciudadNombre;

	// Constructors

	/** default constructor */
	public AdmCiudad() {
	}

	/** full constructor */
	public AdmCiudad(Integer ciudadId, String ciudadNombre) {
		this.ciudadId = ciudadId;
		this.ciudadNombre = ciudadNombre;
	}

	// Property accessors
	@Id
	@Column(name = "ciudad_id", unique = true, nullable = false, insertable = true, updatable = true)
	public Integer getCiudadId() {
		return this.ciudadId;
	}

	public void setCiudadId(Integer ciudadId) {
		this.ciudadId = ciudadId;
	}

	@Column(name = "ciudad_nombre", unique = false, nullable = false, insertable = true, updatable = true, length = 45)
	public String getCiudadNombre() {
		return this.ciudadNombre;
	}

	public void setCiudadNombre(String ciudadNombre) {
		this.ciudadNombre = ciudadNombre;
	}

}