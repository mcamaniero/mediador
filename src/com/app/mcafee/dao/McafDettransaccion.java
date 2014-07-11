package com.app.mcafee.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * McafDettransaccion entity.
 * 
 * @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mcaf_dettransaccion", catalog = "aprovgrupotv", uniqueConstraints = {})
public class McafDettransaccion implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer idTransaccion;
	private String skumcAfee;
	private String referencia;

	// Constructors

	/** default constructor */
	public McafDettransaccion() {
	}

	/** full constructor */
	public McafDettransaccion(Integer id, Integer idTransaccion, String skumcAfee, String referencia) {
		this.id = id;
		this.idTransaccion = idTransaccion;
		this.skumcAfee = skumcAfee;
		this.referencia = referencia;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false, insertable = true, updatable = true)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "idTransaccion", unique = false, nullable = false, insertable = true, updatable = true, length = 45)
	public Integer getIdTransaccion() {
		return this.idTransaccion;
	}

	public void setIdTransaccion(Integer idTransaccion) {
		this.idTransaccion = idTransaccion;
	}

	@Column(name = "SKUMcAfee", unique = false, nullable = false, insertable = true, updatable = true, length = 100)
	public String getSkumcAfee() {
		return this.skumcAfee;
	}

	public void setSkumcAfee(String skumcAfee) {
		this.skumcAfee = skumcAfee;
	}

	@Column(name = "referencia", unique = false, nullable = false, insertable = true, updatable = true, length = 100)
	public String getReferencia() {
		return this.referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	
}