package com.app.tv.tvp_ordendac.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TvpOrdendac entity.
 * 
 * @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tvp_ordendac", catalog = "aprovgrupotv", uniqueConstraints = {})
public class TvpOrdendac implements java.io.Serializable {

	// Fields

	private Long clave;
	private Integer Id = null;
	private String puerto;
	private String tamanio;
	private String comando;
	private String paquete;
	private String estado;
	private byte[] respuesta;

	// Constructors

	/** default constructor */
	public TvpOrdendac() {
	}

	/** full constructor */
	public TvpOrdendac(Long clave, Integer id, String puerto, String tamanio,
			String comando, String paquete, String estado, byte[] respuesta) {
		this.clave = clave;
		this.puerto = puerto;
		this.tamanio = tamanio;
		this.comando = comando;
		this.paquete = paquete;
		this.estado = estado;
		this.respuesta = respuesta;
		this.setId(id);
	}
	/*@Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 @Column(name = "Clave", unique = true, nullable = false, insertable = true, updatable = true)
	 public Long getClave() {
	  return this.clave;
	 }
	*/
	// Property accessors
	@Id
	@Column(name = "Clave", unique = true, nullable = false, insertable = true, updatable = true)
	public Long getClave() {
		return this.clave;
	}

	public void setClave(Long clave) {
		this.clave = clave;
	}
	
	@Column(name = "Id", unique = true, nullable = false, insertable = true, updatable = true)
	public Integer getId() {
		return this.Id;
	}

	public void setId(Integer id) {
		this.Id = id;
	}

	@Column(name = "Puerto", unique = false, nullable = false, insertable = true, updatable = true, length = 10)
	public String getPuerto() {
		return this.puerto;
	}

	public void setPuerto(String puerto) {
		this.puerto = puerto;
	}

	@Column(name = "Tamanio", unique = false, nullable = false, insertable = true, updatable = true, length = 45)
	public String getTamanio() {
		return this.tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	@Column(name = "Comando", unique = false, nullable = false, insertable = true, updatable = true, length = 4)
	public String getComando() {
		return this.comando;
	}

	public void setComando(String comando) {
		this.comando = comando;
	}

	@Column(name = "Paquete", unique = false, nullable = false, insertable = true, updatable = true)
	public String getPaquete() {
		return this.paquete;
	}

	public void setPaquete(String paquete) {
		this.paquete = paquete;
	}

	@Column(name = "Estado", unique = false, nullable = false, insertable = true, updatable = true, length = 2)
	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Column(name = "Respuesta", unique = false, nullable = true, insertable = true, updatable = true)
	public byte[] getRespuesta() {
		return this.respuesta;
	}

	public void setRespuesta(byte[] respuesta) {
		this.respuesta = respuesta;
	}


}