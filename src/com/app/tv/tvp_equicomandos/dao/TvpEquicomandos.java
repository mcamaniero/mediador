package com.app.tv.tvp_equicomandos.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TvpEquicomandos entity.
 * 
 * @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tvp_equicomandos", catalog = "aprovgrupotv", uniqueConstraints = {})
public class TvpEquicomandos implements java.io.Serializable {

	// Fields

	private Integer codigo;
	private String nombre;
	private Integer codigoDac;
	private Integer codigoAcc;
	private Integer codigoDalvi;
	private String codigoDth;

	// Constructors

	/** default constructor */
	public TvpEquicomandos() {
	}

	/** minimal constructor */
	public TvpEquicomandos(Integer codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}

	/** full constructor */
	public TvpEquicomandos(Integer codigo, String nombre, Integer codigoDac,
			Integer codigoAcc, Integer codigoDalvi,String codigoDth) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.codigoDac = codigoDac;
		this.codigoAcc = codigoAcc;
		this.codigoDalvi = codigoDalvi;
		this.codigoDth = codigoDth;
	}

	// Property accessors
	@Id
	@Column(name = "Codigo", unique = true, nullable = false, insertable = true, updatable = true)
	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	@Column(name = "Nombre", unique = false, nullable = false, insertable = true, updatable = true, length = 45)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "CodigoDAC", unique = false, nullable = true, insertable = true, updatable = true)
	public Integer getCodigoDac() {
		return this.codigoDac;
	}

	public void setCodigoDac(Integer codigoDac) {
		this.codigoDac = codigoDac;
	}

	@Column(name = "CodigoACC", unique = false, nullable = true, insertable = true, updatable = true)
	public Integer getCodigoAcc() {
		return this.codigoAcc;
	}

	public void setCodigoAcc(Integer codigoAcc) {
		this.codigoAcc = codigoAcc;
	}

	@Column(name = "CodigoDalvi", unique = false, nullable = true, insertable = true, updatable = true)
	public Integer getCodigoDalvi() {
		return this.codigoDalvi;
	}

	public void setCodigoDalvi(Integer codigoDalvi) {
		this.codigoDalvi = codigoDalvi;
	}
	
	@Column(name = "CodigoDth", unique = false, nullable = true, insertable = true, updatable = true)
	public String getCodigoDth() 
	{
		return codigoDth;
	}

	public void setCodigoDth(String codigoDth) 
	{
		this.codigoDth = codigoDth;
	}
}