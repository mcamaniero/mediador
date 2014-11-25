package com.app.tv.tvp_puertosDHACC;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TvpPuertosDhacc entity.
 * 
 * @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tvp_puertosDHACC", catalog = "aprovgrupotv", uniqueConstraints = {})
public class TvpPuertosDhacc implements java.io.Serializable {

	// Fields

	private Integer ciudad;
	private Integer puertodesde;
	private Integer puertohasta;
	private Integer solouno;

	// Constructors

	/** default constructor */
	public TvpPuertosDhacc() {
	}

	/** full constructor */
	public TvpPuertosDhacc(Integer ciudad, Integer puertodesde,
			Integer puertohasta, Integer solouno) {
		this.ciudad = ciudad;
		this.puertodesde = puertodesde;
		this.puertohasta = puertohasta;
		this.solouno = solouno;
	}

	// Property accessors
	@Id
	@Column(name = "ciudad", unique = true, nullable = false, insertable = true, updatable = true)
	public Integer getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(Integer ciudad) {
		this.ciudad = ciudad;
	}

	@Column(name = "puertodesde", unique = false, nullable = false, insertable = true, updatable = true)
	public Integer getPuertodesde() {
		return this.puertodesde;
	}

	public void setPuertodesde(Integer puertodesde) {
		this.puertodesde = puertodesde;
	}

	@Column(name = "puertohasta", unique = false, nullable = false, insertable = true, updatable = true)
	public Integer getPuertohasta() {
		return this.puertohasta;
	}

	public void setPuertohasta(Integer puertohasta) {
		this.puertohasta = puertohasta;
	}

	@Column(name = "solouno", unique = false, nullable = false, insertable = true, updatable = true)
	public Integer getSolouno() {
		return this.solouno;
	}

	public void setSolouno(Integer solouno) {
		this.solouno = solouno;
	}

}