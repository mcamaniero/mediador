package com.app.tv.tvp_serviciospaychannelsciudad.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TvpServiciosPayChannelsCiudad entity.
 * 
 * @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tvp_ServiciosPayChannelsCiudad", catalog = "aprovgrupotv", uniqueConstraints = {})
public class TvpServiciosPayChannelsCiudad implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer codigoTitan;
	private Integer ciudadServicio;
	private Integer tipo;

	// Constructors

	/** default constructor */
	public TvpServiciosPayChannelsCiudad() {
	}

	/** full constructor */
	public TvpServiciosPayChannelsCiudad(Integer id, Integer codigoTitan,
			Integer ciudadServicio, Integer tipo) {
		this.id = id;
		this.codigoTitan = codigoTitan;
		this.ciudadServicio = ciudadServicio;
		this.tipo = tipo;
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

	@Column(name = "CodigoTitan", unique = false, nullable = false, insertable = true, updatable = true)
	public Integer getCodigoTitan() {
		return this.codigoTitan;
	}

	public void setCodigoTitan(Integer codigoTitan) {
		this.codigoTitan = codigoTitan;
	}

	@Column(name = "CiudadServicio", unique = false, nullable = false, insertable = true, updatable = true)
	public Integer getCiudadServicio() {
		return this.ciudadServicio;
	}

	public void setCiudadServicio(Integer ciudadServicio) {
		this.ciudadServicio = ciudadServicio;
	}

	@Column(name = "Tipo", unique = false, nullable = false, insertable = true, updatable = true)
	public Integer getTipo() {
		return this.tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

}