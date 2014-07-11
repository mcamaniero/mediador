package com.app.dao.usuarioiw;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * AdmUsuarioIntraway entity.
 * 
 * @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "adm_usuario_intraway", catalog = "aprovgrupotv", uniqueConstraints = {})
public class AdmUsuarioIntraway implements java.io.Serializable {

	// Fields

	private AdmUsuarioIntrawayId id;
	private String clave;
	private String nombre;
	private String perfil;

	// Constructors

	/** default constructor */
	public AdmUsuarioIntraway() {
	}

	/** full constructor */
	public AdmUsuarioIntraway(AdmUsuarioIntrawayId id, String clave,
			String nombre, String perfil) {
		this.id = id;
		this.clave = clave;
		this.nombre = nombre;
		this.perfil = perfil;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "id", column = @Column(name = "id", unique = false, nullable = false, insertable = true, updatable = true)),
			@AttributeOverride(name = "usuario", column = @Column(name = "usuario", unique = false, nullable = false, insertable = true, updatable = true, length = 45)) })
	public AdmUsuarioIntrawayId getId() {
		return this.id;
	}

	public void setId(AdmUsuarioIntrawayId id) {
		this.id = id;
	}

	@Column(name = "clave", unique = false, nullable = false, insertable = true, updatable = true, length = 100)
	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	@Column(name = "nombre", unique = false, nullable = false, insertable = true, updatable = true, length = 100)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "perfil", unique = false, nullable = false, insertable = true, updatable = true)
	public String getPerfil() {
		return this.perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

}