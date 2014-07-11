package com.app.tv.tvp_channelmap.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TvpChannelmap entity.
 * 
 * @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tvp_channelmap", catalog = "aprovgrupotv", uniqueConstraints = {})
public class TvpChannelmap implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer channelMapId;
	private Integer servicioId;
	private String paqueteId;

	// Constructors

	/** default constructor */
	public TvpChannelmap() {
	}

	/** full constructor */
	public TvpChannelmap(Integer id, Integer channelMapId, Integer servicioId,
			String paqueteId) {
		this.id = id;
		this.channelMapId = channelMapId;
		this.servicioId = servicioId;
		this.paqueteId = paqueteId;
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

	@Column(name = "channel_map_id", unique = false, nullable = false, insertable = true, updatable = true)
	public Integer getChannelMapId() {
		return this.channelMapId;
	}

	public void setChannelMapId(Integer channelMapId) {
		this.channelMapId = channelMapId;
	}

	@Column(name = "servicio_id", unique = false, nullable = false, insertable = true, updatable = true)
	public Integer getServicioId() {
		return this.servicioId;
	}

	public void setServicioId(Integer servicioId) {
		this.servicioId = servicioId;
	}

	@Column(name = "paquete_id", unique = false, nullable = false, insertable = true, updatable = true, length = 40)
	public String getPaqueteId() {
		return this.paqueteId;
	}

	public void setPaqueteId(String paqueteId) {
		this.paqueteId = paqueteId;
	}

}