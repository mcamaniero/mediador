package com.app.tv.adm_promociones.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * AdmPromociones entity.
 * 
 * @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "adm_promociones", catalog = "aprovgrupotv", uniqueConstraints = {})
public class AdmPromociones implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer promocionid;
	private Integer promocionactivar;
	private Integer ciudad;

	// Constructors

	/** default constructor */
	public AdmPromociones() {
	}

	/** full constructor */
	public AdmPromociones(Integer id, Integer promocionid,
			Integer promocionactivar, Integer ciudad) {
		this.id = id;
		this.promocionid = promocionid;
		this.promocionactivar = promocionactivar;
		this.ciudad = ciudad;
	}

	// Property accessors
	@Id
	@Column(name = "id", unique = true, nullable = false, insertable = true, updatable = true)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "promocionid", unique = false, nullable = false, insertable = true, updatable = true)
	public Integer getPromocionid() {
		return this.promocionid;
	}

	public void setPromocionid(Integer promocionid) {
		this.promocionid = promocionid;
	}

	@Column(name = "promocionactivar", unique = false, nullable = false, insertable = true, updatable = true)
	public Integer getPromocionactivar() {
		return this.promocionactivar;
	}

	public void setPromocionactivar(Integer promocionactivar) {
		this.promocionactivar = promocionactivar;
	}

	@Column(name = "ciudad", unique = false, nullable = false, insertable = true, updatable = true)
	public Integer getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(Integer ciudad) {
		this.ciudad = ciudad;
	}

}