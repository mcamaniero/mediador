package com.app.mcafee.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * McafSku entity.
 * 
 * @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mcaf_sku", catalog = "aprovgrupotv", uniqueConstraints = {})
public class McafSku implements java.io.Serializable {

	// Fields

	private Integer id;
	private String sku;
	private String descripcion;
	private Integer planTvCable;
	private String descPlanTvCable;
	private Boolean trial;

	// Constructors

	/** default constructor */
	public McafSku() {
	}

	/** full constructor */
	public McafSku(Integer id, String sku, String descripcion,
			Integer planTvCable, String descPlanTvCable, Boolean trial) {
		this.id = id;
		this.sku = sku;
		this.descripcion = descripcion;
		this.planTvCable = planTvCable;
		this.descPlanTvCable = descPlanTvCable;
		this.trial = trial;
	}

	// Property accessors
	@Id
	@Column(name = "Id", unique = true, nullable = false, insertable = true, updatable = true)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "SKU", unique = false, nullable = false, insertable = true, updatable = true, length = 25)
	public String getSku() {
		return this.sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	@Column(name = "Descripcion", unique = false, nullable = false, insertable = true, updatable = true, length = 100)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "PlanTvCable", unique = false, nullable = false, insertable = true, updatable = true)
	public Integer getPlanTvCable() {
		return this.planTvCable;
	}

	public void setPlanTvCable(Integer planTvCable) {
		this.planTvCable = planTvCable;
	}

	@Column(name = "DescPlanTvCable", unique = false, nullable = false, insertable = true, updatable = true, length = 45)
	public String getDescPlanTvCable() {
		return this.descPlanTvCable;
	}

	public void setDescPlanTvCable(String descPlanTvCable) {
		this.descPlanTvCable = descPlanTvCable;
	}

	@Column(name = "Trial", unique = false, nullable = false, insertable = true, updatable = true)
	public Boolean getTrial() {
		return this.trial;
	}

	public void setTrial(Boolean trial) {
		this.trial = trial;
	}

}