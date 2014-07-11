package com.app.tv.adm_errorestvp.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * AdmErrorestvp entity.
 * 
 * @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "adm_errorestvp", catalog = "aprovgrupotv", uniqueConstraints = {})
public class AdmErrorestvp implements java.io.Serializable {

	// Fields

	private Integer id;
	private String strErrorDac;
	private String strErrorAcc;
	private String strErrorDalvi;
	private String strError;
	private String strErrorString;

	// Constructors

	/** default constructor */
	public AdmErrorestvp() {
	}

	/** minimal constructor */
	public AdmErrorestvp(Integer id, String strErrorDac, String strErrorAcc,
			String strErrorDalvi, String strError) {
		this.id = id;
		this.strErrorDac = strErrorDac;
		this.strErrorAcc = strErrorAcc;
		this.strErrorDalvi = strErrorDalvi;
		this.strError = strError;
	}

	/** full constructor */
	public AdmErrorestvp(Integer id, String strErrorDac, String strErrorAcc,
			String strErrorDalvi, String strError, String strErrorString) {
		this.id = id;
		this.strErrorDac = strErrorDac;
		this.strErrorAcc = strErrorAcc;
		this.strErrorDalvi = strErrorDalvi;
		this.strError = strError;
		this.strErrorString = strErrorString;
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

	@Column(name = "str_errorDac", unique = false, nullable = false, insertable = true, updatable = true, length = 8)
	public String getStrErrorDac() {
		return this.strErrorDac;
	}

	public void setStrErrorDac(String strErrorDac) {
		this.strErrorDac = strErrorDac;
	}

	@Column(name = "str_errorAcc", unique = false, nullable = false, insertable = true, updatable = true, length = 8)
	public String getStrErrorAcc() {
		return this.strErrorAcc;
	}

	public void setStrErrorAcc(String strErrorAcc) {
		this.strErrorAcc = strErrorAcc;
	}

	@Column(name = "str_errorDalvi", unique = false, nullable = false, insertable = true, updatable = true, length = 8)
	public String getStrErrorDalvi() {
		return this.strErrorDalvi;
	}

	public void setStrErrorDalvi(String strErrorDalvi) {
		this.strErrorDalvi = strErrorDalvi;
	}

	@Column(name = "str_error", unique = false, nullable = false, insertable = true, updatable = true, length = 5)
	public String getStrError() {
		return this.strError;
	}

	public void setStrError(String strError) {
		this.strError = strError;
	}

	@Column(name = "str_error_string", unique = false, nullable = true, insertable = true, updatable = true, length = 80)
	public String getStrErrorString() {
		return this.strErrorString;
	}

	public void setStrErrorString(String strErrorString) {
		this.strErrorString = strErrorString;
	}

}