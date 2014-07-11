package com.app.mcafee.dao;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * McafTransaccion entity.
 * 
 * @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "mcaf_transaccion", catalog = "aprovgrupotv", uniqueConstraints = {})
public class McafTransaccion implements java.io.Serializable {

	// Fields

	private Integer id;
	private String sku;
	private Integer planTvCable;
	private String citemId;
	private String accountId;
	private Integer clienteMcAfeeId;
	private String referencia;
	private String password;
	private Integer logId;
	private Date fechaPeticion;
	private Date fechaRespuesta;
	private String respuestaXML;
	private String estado;
	private String codError;
	private String detMensaje;
	
	
	// Constructors

	/** default constructor */
	public McafTransaccion() {
	}

	/** minimal constructor */
	public McafTransaccion(Integer id, String sku, Integer planTvCable,
			String citemId, String accountId, Integer clienteMcAfeeId,
			Integer logId) {
		//this.id = id;
		this.sku = sku;
		this.planTvCable = planTvCable;
		this.citemId = citemId;
		this.accountId = accountId;
		this.clienteMcAfeeId = clienteMcAfeeId;
		this.logId = logId;
	}

	/** full constructor */
	public McafTransaccion(Integer id, String sku, Integer planTvCable,
			String citemId, String accountId, Integer clienteMcAfeeId,
			String referencia, String password, Integer logId,
			Date fechaPeticion, Date fechaRespuesta) {
		this.id = id;
		this.sku = sku;
		this.planTvCable = planTvCable;
		this.citemId = citemId;
		this.accountId = accountId;
		this.clienteMcAfeeId = clienteMcAfeeId;
		this.referencia = referencia;
		this.password = password;
		this.logId = logId;
		this.fechaPeticion = fechaPeticion;
		this.fechaRespuesta = fechaRespuesta;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false, insertable = true, updatable = true)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "SKU", unique = false, nullable = false, insertable = true, updatable = true, length = 45)
	public String getSku() {
		return this.sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	@Column(name = "PlanTvCable", unique = false, nullable = false, insertable = true, updatable = true)
	public Integer getPlanTvCable() {
		return this.planTvCable;
	}

	public void setPlanTvCable(Integer planTvCable) {
		this.planTvCable = planTvCable;
	}

	@Column(name = "citem_id", unique = false, nullable = false, insertable = true, updatable = true, length = 45)
	public String getCitemId() {
		return this.citemId;
	}

	public void setCitemId(String citemId) {
		this.citemId = citemId;
	}

	@Column(name = "account_id", unique = false, nullable = false, insertable = true, updatable = true, length = 45)
	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	@Column(name = "clienteMcAfee_id", unique = false, nullable = false, insertable = true, updatable = true, length = 45)
	public Integer getClienteMcAfeeId() {
		return this.clienteMcAfeeId;
	}

	public void setClienteMcAfeeId(Integer clienteMcAfeeId) {
		this.clienteMcAfeeId = clienteMcAfeeId;
	}

	@Column(name = "referencia", unique = false, nullable = true, insertable = true, updatable = true, length = 45)
	public String getReferencia() {
		return this.referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	@Column(name = "password", unique = false, nullable = true, insertable = true, updatable = true, length = 45)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "Log_id", unique = false, nullable = false, insertable = true, updatable = true)
	public Integer getLogId() {
		return this.logId;
	}

	public void setLogId(Integer logId) {
		this.logId = logId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FechaPeticion", unique = false, nullable = true, insertable = true, updatable = true, length = 19)
	public Date getFechaPeticion() {
		return this.fechaPeticion;
	}

	public void setFechaPeticion(Date fechaPeticion) {
		this.fechaPeticion = fechaPeticion;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FechaRespuesta", unique = false, nullable = true, insertable = true, updatable = true, length = 19)
	public Date getFechaRespuesta() {
		return this.fechaRespuesta;
	}

	public void setFechaRespuesta(Date fechaRespuesta) {
		this.fechaRespuesta = fechaRespuesta;
	}
	
	
	@Column(name = "respuestaXML", unique = false, nullable = true, insertable = true, updatable = true)
	public String getRespuestaXML() {
		return this.respuestaXML;
	}

	public void setRespuestaXML(String respuestaXML) {
		this.respuestaXML = respuestaXML;
	}
	
	@Column(name = "estado", unique = false, nullable = true, insertable = true, updatable = true)
	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	@Column(name = "codError", unique = false, nullable = true, insertable = true, updatable = true)
	public String getCodError() {
		return this.codError;
	}

	public void setCodError(String codError) {
		this.codError = codError;
	}
	
	@Column(name = "detMensaje", unique = false, nullable = true, insertable = true, updatable = true)
	public String getDetMensaje() {
		return this.detMensaje;
	}

	public void setDetMensaje(String detmensaje) {
		this.detMensaje = detmensaje;
	}

}