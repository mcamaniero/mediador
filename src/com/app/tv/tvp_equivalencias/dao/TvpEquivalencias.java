package com.app.tv.tvp_equivalencias.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TvpEquivalencias entity.
 * 
 * @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tvp_equivalencias", catalog = "aprovgrupotv", uniqueConstraints = {})
public class TvpEquivalencias implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer codigoTitan;
	private Integer codigoInterno;
	private Integer tcontrolador;
	private String tequivalencia;
	private Integer cprincipal;
	private Integer cadicional;
	private Integer codInt;
	private Integer ciudadServicio;

	// Constructors

	/** default constructor */
	public TvpEquivalencias() {
	}

	/** full constructor */
	public TvpEquivalencias(Integer id, Integer codigoTitan,
			Integer codigoInterno, Integer tcontrolador, String tequivalencia,
			Integer cprincipal, Integer cadicional, Integer codInt) {
		this.id = id;
		this.codigoTitan = codigoTitan;
		this.codigoInterno = codigoInterno;
		this.tcontrolador = tcontrolador;
		this.tequivalencia = tequivalencia;
		this.cprincipal = cprincipal;
		this.cadicional = cadicional;
		this.codInt = codInt;
		this.ciudadServicio = ciudadServicio;
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

	@Column(name = "CodigoInterno", unique = false, nullable = false, insertable = true, updatable = true)
	public Integer getCodigoInterno() {
		return this.codigoInterno;
	}

	public void setCodigoInterno(Integer codigoInterno) {
		this.codigoInterno = codigoInterno;
	}

	@Column(name = "TControlador", unique = false, nullable = false, insertable = true, updatable = true)
	public Integer getTcontrolador() {
		return this.tcontrolador;
	}

	public void setTcontrolador(Integer tcontrolador) {
		this.tcontrolador = tcontrolador;
	}

	@Column(name = "TEquivalencia", unique = false, nullable = false, insertable = true, updatable = true, length = 45)
	public String getTequivalencia() {
		return this.tequivalencia;
	}

	public void setTequivalencia(String tequivalencia) {
		this.tequivalencia = tequivalencia;
	}

	@Column(name = "CPrincipal", unique = false, nullable = false, insertable = true, updatable = true)
	public Integer getCprincipal() {
		return this.cprincipal;
	}

	public void setCprincipal(Integer cprincipal) {
		this.cprincipal = cprincipal;
	}

	@Column(name = "CAdicional", unique = false, nullable = false, insertable = true, updatable = true)
	public Integer getCadicional() {
		return this.cadicional;
	}

	public void setCadicional(Integer cadicional) {
		this.cadicional = cadicional;
	}

	@Column(name = "CodInt", unique = false, nullable = false, insertable = true, updatable = true)
	public Integer getCodInt() {
		return this.codInt;
	}

	public void setCodInt(Integer codInt) {
		this.codInt = codInt;
	}

	@Column(name = "CiudadServicio", unique = false, nullable = false, insertable = true, updatable = true)
	public Integer getCiudadServicio() {
		return this.ciudadServicio;
	}

	public void setCiudadServicio(Integer ciudadServicio) {
		this.ciudadServicio = ciudadServicio;
	}
	
}