package com.app.tv.tvp_puertosACC.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TvpPuertosAcc entity.
 * 
 * @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tvp_puertosACC", catalog = "aprovgrupotv", uniqueConstraints = {})
public class TvpPuertosAcc implements java.io.Serializable {

	// Fields

	private Integer ciudadId;
	private Integer puertoAcc;

	// Constructors

	/** default constructor */
	public TvpPuertosAcc() {
	}

	/** full constructor */
	public TvpPuertosAcc(Integer ciudadId, Integer puertoAcc) {
		this.ciudadId = ciudadId;
		this.puertoAcc = puertoAcc;
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

	@Column(name = "PuertoACC", unique = false, nullable = false, insertable = true, updatable = true)
	public Integer getPuertoAcc() {
		return this.puertoAcc;
	}

	public void setPuertoAcc(Integer puertoAcc) {
		this.puertoAcc = puertoAcc;
	}

}