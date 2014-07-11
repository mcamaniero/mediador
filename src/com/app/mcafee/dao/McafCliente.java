package com.app.mcafee.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * McafCliente entity.
 * 
 * @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mcaf_cliente", catalog = "aprovgrupotv", uniqueConstraints = {})
public class McafCliente implements java.io.Serializable {

	// Fields

	private Integer idMcAfee;
	private String mail;
	private String idProducto;
	private String sistema;
	private String password;
	private String passwordWeb;
	private Integer clic;

	// Constructors

	/** default constructor */
	public McafCliente() {
	}

	/** minimal constructor */
	public McafCliente(Integer idMcAfee, String mail, String idProducto,
			String sistema) {
		this.idMcAfee = idMcAfee;
		this.mail = mail;
		this.idProducto = idProducto;
		this.sistema = sistema;
	}

	/** full constructor */
	public McafCliente(Integer idMcAfee, String mail, String idProducto,
			String sistema, String password) {
		this.idMcAfee = idMcAfee;
		this.mail = mail;
		this.idProducto = idProducto;
		this.sistema = sistema;
		this.password = password;
		this.clic = 0;
		
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "IdMcAfee", unique = true, nullable = false, insertable = true, updatable = true)
	public Integer getIdMcAfee() {
		return this.idMcAfee;
	}

	public void setIdMcAfee(Integer idMcAfee) {
		this.idMcAfee = idMcAfee;
	}

	@Column(name = "Mail", unique = false, nullable = false, insertable = true, updatable = true, length = 100)
	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Column(name = "IdProducto", unique = false, nullable = false, insertable = true, updatable = true, length = 100)
	public String getIdProducto() {
		return this.idProducto;
	}

	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}

	@Column(name = "Sistema", unique = false, nullable = false, insertable = true, updatable = true, length = 45)
	public String getSistema() {
		return this.sistema;
	}

	public void setSistema(String sistema) {
		this.sistema = sistema;
	}

	@Column(name = "Password", unique = false, nullable = true, insertable = true, updatable = true, length = 45)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "PasswordWeb", unique = false, nullable = true, insertable = true, updatable = true, length = 45)
	public String getPasswordWeb() {
		return this.passwordWeb;
	}

	public void setPasswordWeb(String passwordWeb) {
		this.passwordWeb = passwordWeb;
	}
	
	@Column(name = "clic", unique = true, nullable = false, insertable = true, updatable = true)
	public Integer getClic() {
		return this.clic;
	}

	public void setClic(Integer clic) {
		this.clic = clic;
	}


}