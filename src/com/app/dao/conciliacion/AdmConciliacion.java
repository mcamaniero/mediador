package com.app.dao.conciliacion;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * AdmConciliacion entity.
 * 
 * @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "adm_conciliacion", catalog = "aprovgrupotv", uniqueConstraints = {})
public class AdmConciliacion implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer ciudad;
	private String cuenta;
	private String idproducto;
	private String addressTitan;
	private String tmpcuenta;
	private String tipo;
	private boolean existe;
	private String completo;
	private String estadoIw;
	private String estadoTitan;
	private String addressIw;

	// Constructors

	/** default constructor */
	public AdmConciliacion() {
	}

	/** minimal constructor */
	public AdmConciliacion(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public AdmConciliacion(Integer id, Integer ciudad, String cuenta,
			String idproducto, String addressTitan, String tmpcuenta,
			String tipo, boolean existe, String completo, String estadoIw,
			String estadoTitan, String addressIw) {
		this.id = id;
		this.ciudad = ciudad;
		this.cuenta = cuenta;
		this.idproducto = idproducto;
		this.addressTitan = addressTitan;
		this.tmpcuenta = tmpcuenta;
		this.tipo = tipo;
		this.existe = existe;
		this.completo = completo;
		this.estadoIw = estadoIw;
		this.estadoTitan = estadoTitan;
		this.addressIw = addressIw;
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

	@Column(name = "ciudad", unique = false, nullable = true, insertable = true, updatable = true)
	public Integer getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(Integer ciudad) {
		this.ciudad = ciudad;
	}

	@Column(name = "cuenta", unique = false, nullable = true, insertable = true, updatable = true, length = 45)
	public String getCuenta() {
		return this.cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	@Column(name = "idproducto", unique = false, nullable = true, insertable = true, updatable = true, length = 45)
	public String getIdproducto() {
		return this.idproducto;
	}

	public void setIdproducto(String idproducto) {
		this.idproducto = idproducto;
	}

	@Column(name = "address_titan", unique = false, nullable = true, insertable = true, updatable = true, length = 45)
	public String getAddressTitan() {
		return this.addressTitan;
	}

	public void setAddressTitan(String addressTitan) {
		this.addressTitan = addressTitan;
	}

	@Column(name = "tmpcuenta", unique = false, nullable = true, insertable = true, updatable = true, length = 45)
	public String getTmpcuenta() {
		return this.tmpcuenta;
	}

	public void setTmpcuenta(String tmpcuenta) {
		this.tmpcuenta = tmpcuenta;
	}

	@Column(name = "tipo", unique = false, nullable = true, insertable = true, updatable = true, length = 45)
	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Column(name = "existe", unique = false, nullable = true, insertable = true, updatable = true)
	public boolean getExiste() {
		return this.existe;
	}

	public void setExiste(boolean existe) {
		this.existe = existe;
	}

	@Column(name = "completo", unique = false, nullable = true, insertable = true, updatable = true, length = 45)
	public String getCompleto() {
		return this.completo;
	}

	public void setCompleto(String completo) {
		this.completo = completo;
	}

	@Column(name = "estado_iw", unique = false, nullable = true, insertable = true, updatable = true, length = 45)
	public String getEstadoIw() {
		return this.estadoIw;
	}

	public void setEstadoIw(String estadoIw) {
		this.estadoIw = estadoIw;
	}

	@Column(name = "estado_titan", unique = false, nullable = true, insertable = true, updatable = true, length = 1)
	public String getEstadoTitan() {
		return this.estadoTitan;
	}

	public void setEstadoTitan(String estadoTitan) {
		this.estadoTitan = estadoTitan;
	}

	@Column(name = "address_iw", unique = false, nullable = true, insertable = true, updatable = true, length = 45)
	public String getAddressIw() {
		return this.addressIw;
	}

	public void setAddressIw(String addressIw) {
		this.addressIw = addressIw;
	}

}