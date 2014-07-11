package com.app.tv.tvp_Dalvi.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TvpDalvi entity.
 * 
 * @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tvp_Dalvi", catalog = "aprovgrupotv", uniqueConstraints = {})
public class TvpDalvi implements java.io.Serializable {

	// Fields

	private Long id;
	private Integer comando;
	private String estado;
	private String trama;
	private String respuesta;
	private Integer ciudad;

	// Constructors

	/** default constructor */
	public TvpDalvi() {
	}

	/** full constructor */
	public TvpDalvi(Long id, Integer comando, String estado, String trama,
			String respuesta, Integer ciudad) {
		this.id = id;
		this.comando = comando;
		this.estado = estado;
		this.trama = trama;
		this.respuesta = respuesta;
		this.ciudad = ciudad;
	}

	// Property accessors
	@Id
	@Column(name = "id", unique = true, nullable = false, insertable = true, updatable = true)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "comando", unique = false, nullable = false, insertable = true, updatable = true)
	public Integer getComando() {
		return this.comando;
	}

	public void setComando(Integer comando) {
		this.comando = comando;
	}

	@Column(name = "estado", unique = false, nullable = false, insertable = true, updatable = true, length = 2)
	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Column(name = "trama", unique = false, nullable = false, insertable = true, updatable = true, length = 65535)
	public String getTrama() {
		return this.trama;
	}

	public void setTrama(String trama) {
		this.trama = trama;
	}

	@Column(name = "respuesta", unique = false, nullable = false, insertable = true, updatable = true, length = 65535)
	public String getRespuesta() {
		return this.respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	@Column(name = "ciudad", unique = false, nullable = false, insertable = true, updatable = true)
	public Integer getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(Integer ciudad) {
		this.ciudad = ciudad;
	}

}