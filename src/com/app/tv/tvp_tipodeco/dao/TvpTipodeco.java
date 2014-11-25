package com.app.tv.tvp_tipodeco.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TvpTipodeco entity.
 * 
 * @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tvp_tipodeco", catalog = "aprovgrupotv", uniqueConstraints = {})
public class TvpTipodeco implements java.io.Serializable {

	// Fields

	private Integer idTipoDeco;
	private String ippv;
	private Integer tipocontrolador;

	// Constructors

	/** default constructor */
	public TvpTipodeco() {
	}

	/** full constructor */
	public TvpTipodeco(Integer idTipoDeco, String ippv, Integer tipocontrolador) {
		this.idTipoDeco = idTipoDeco;
		this.ippv = ippv;
		this.tipocontrolador = tipocontrolador;
	}

	// Property accessors
	@Id
	@Column(name = "idTipoDeco", unique = true, nullable = false, insertable = true, updatable = true)
	public Integer getIdTipoDeco() {
		return this.idTipoDeco;
	}

	public void setIdTipoDeco(Integer idTipoDeco) {
		this.idTipoDeco = idTipoDeco;
	}

	@Column(name = "Ippv", unique = false, nullable = false, insertable = true, updatable = true, length = 1)
	public String getIppv() {
		return this.ippv;
	}

	public void setIppv(String ippv) {
		this.ippv = ippv;
	}

	@Column(name = "Tipocontrolador", unique = false, nullable = false, insertable = true, updatable = true)
	public Integer getTipocontrolador() {
		return this.tipocontrolador;
	}

	public void setTipocontrolador(Integer tipocontrolador) {
		this.tipocontrolador = tipocontrolador;
	}

}