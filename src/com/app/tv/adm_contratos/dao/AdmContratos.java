package com.app.tv.adm_contratos.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * AdmContratos entity.
 * 
 * @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "adm_contratos", catalog = "aprovgrupotv", uniqueConstraints = {})
public class AdmContratos implements java.io.Serializable {

	// Fields

	private Integer idContratos;
	private Integer cparty;

	// Constructors

	/** default constructor */
	public AdmContratos() {
	}

	/** minimal constructor */
	public AdmContratos(Integer idContratos) {
		this.idContratos = idContratos;
	}

	/** full constructor */
	public AdmContratos(Integer idContratos, Integer cparty) {
		this.idContratos = idContratos;
		this.cparty = cparty;
	}

	// Property accessors
	@Id
	@Column(name = "id_contratos", unique = true, nullable = false, insertable = true, updatable = true)
	public Integer getIdContratos() {
		return this.idContratos;
	}

	public void setIdContratos(Integer idContratos) {
		this.idContratos = idContratos;
	}

	@Column(name = "cparty", unique = false, nullable = true, insertable = true, updatable = true)
	public Integer getCparty() {
		return this.cparty;
	}

	public void setCparty(Integer cparty) {
		this.cparty = cparty;
	}

}