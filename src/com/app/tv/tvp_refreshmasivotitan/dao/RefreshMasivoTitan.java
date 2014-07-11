package com.app.tv.tvp_refreshmasivotitan.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * RefreshMasivoTitan entity.
 * 
 * @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "RefreshMasivoTitan", catalog = "aprovgrupotv", uniqueConstraints = {})
public class RefreshMasivoTitan implements java.io.Serializable {

	// Fields

	private Integer id;
	private String cpartyIdaccount;
	private String apAdrdress;
	private String name;

	// Constructors

	/** default constructor */
	public RefreshMasivoTitan() {
	}

	/** minimal constructor */
	public RefreshMasivoTitan(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public RefreshMasivoTitan(Integer id, String cpartyIdaccount,
			String apAdrdress, String name) {
		this.id = id;
		this.cpartyIdaccount = cpartyIdaccount;
		this.apAdrdress = apAdrdress;
		this.name = name;
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

	@Column(name = "CpartyIDAccount", unique = false, nullable = true, insertable = true, updatable = true, length = 45)
	public String getCpartyIdaccount() {
		return this.cpartyIdaccount;
	}

	public void setCpartyIdaccount(String cpartyIdaccount) {
		this.cpartyIdaccount = cpartyIdaccount;
	}

	@Column(name = "ApAdrdress", unique = false, nullable = true, insertable = true, updatable = true, length = 45)
	public String getApAdrdress() {
		return this.apAdrdress;
	}

	public void setApAdrdress(String apAdrdress) {
		this.apAdrdress = apAdrdress;
	}

	@Column(name = "Name", unique = false, nullable = true, insertable = true, updatable = true, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}