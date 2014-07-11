package com.app.dao.usuarioiw;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AdmUsuarioIntrawayId entity.
 * 
 * @author MyEclipse Persistence Tools
 */
@Embeddable
public class AdmUsuarioIntrawayId implements java.io.Serializable {

	// Fields

	private Integer id;
	private String usuario;

	// Constructors

	/** default constructor */
	public AdmUsuarioIntrawayId() {
	}

	/** full constructor */
	public AdmUsuarioIntrawayId(Integer id, String usuario) {
		this.id = id;
		this.usuario = usuario;
	}

	// Property accessors

	@Column(name = "id", unique = false, nullable = false, insertable = true, updatable = true)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "usuario", unique = false, nullable = false, insertable = true, updatable = true, length = 45)
	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AdmUsuarioIntrawayId))
			return false;
		AdmUsuarioIntrawayId castOther = (AdmUsuarioIntrawayId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getUsuario() == castOther.getUsuario()) || (this
						.getUsuario() != null
						&& castOther.getUsuario() != null && this.getUsuario()
						.equals(castOther.getUsuario())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getUsuario() == null ? 0 : this.getUsuario().hashCode());
		return result;
	}

}