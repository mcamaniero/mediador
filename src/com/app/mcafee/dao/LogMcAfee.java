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
 * LogMcAfee entity.
 * 
 * @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "log_McAfee", catalog = "aprovgrupotv", uniqueConstraints = {})
public class LogMcAfee implements java.io.Serializable {

	// Fields

	private Integer id;
	private Date fecha;
	private Integer idEmpresa;
	private String sistema;
	private String interfaz;
	private String idEstado;
	private String cuenta;
	private String idProducto;
	private String correo;
	private Integer planMcAfeeTvCable;
	private String clienteCrm;
	private String idProductoCrm;
	private String idMcAfee;
	private String referencia;
	private String codError;
	private String detMensaje;
	private Date fechaResp;
	private String Nombre;
	
	
	// Constructors

	/** default constructor */
	public LogMcAfee() {
	}

	/** minimal constructor */
	public LogMcAfee(Integer id, Date fecha, Integer idEmpresa, String sistema,
			String interfaz, String idEstado, String cuenta, String idProducto,
			String correo, Integer planMcAfeeTvCable, String clienteCrm,
			String idProductoCrm, String nombre) {
		this.id = id;
		this.fecha = fecha;
		this.idEmpresa = idEmpresa;
		this.sistema = sistema;
		this.interfaz = interfaz;
		this.idEstado = idEstado;
		this.cuenta = cuenta;
		this.idProducto = idProducto;
		this.correo = correo;
		this.planMcAfeeTvCable = planMcAfeeTvCable;
		this.clienteCrm = clienteCrm;
		this.idProductoCrm = idProductoCrm;
		this.Nombre = nombre;
	}

	/** full constructor */
	public LogMcAfee(Integer id, Date fecha, Integer idEmpresa, String sistema,
			String interfaz, String idEstado, String cuenta, String idProducto,
			String correo, Integer planMcAfeeTvCable, String clienteCrm,
			String idProductoCrm, String idMcAfee, String referencia,
			String codError, String detMensaje, Date fechaResp, String nombre) {
		this.id = id;
		this.fecha = fecha;
		this.idEmpresa = idEmpresa;
		this.sistema = sistema;
		this.interfaz = interfaz;
		this.idEstado = idEstado;
		this.cuenta = cuenta;
		this.idProducto = idProducto;
		this.correo = correo;
		this.planMcAfeeTvCable = planMcAfeeTvCable;
		this.clienteCrm = clienteCrm;
		this.idProductoCrm = idProductoCrm;
		this.idMcAfee = idMcAfee;
		this.referencia = referencia;
		this.codError = codError;
		this.detMensaje = detMensaje;
		this.fechaResp = fechaResp;
		this.Nombre = nombre;
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Fecha", unique = false, nullable = false, insertable = true, updatable = true, length = 19)
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Column(name = "IdEmpresa", unique = false, nullable = false, insertable = true, updatable = true)
	public Integer getIdEmpresa() {
		return this.idEmpresa;
	}

	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	@Column(name = "Sistema", unique = false, nullable = false, insertable = true, updatable = true, length = 45)
	public String getSistema() {
		return this.sistema;
	}

	public void setSistema(String sistema) {
		this.sistema = sistema;
	}

	@Column(name = "Interfaz", unique = false, nullable = false, insertable = true, updatable = true, length = 45)
	public String getInterfaz() {
		return this.interfaz;
	}

	public void setInterfaz(String interfaz) {
		this.interfaz = interfaz;
	}

	@Column(name = "IdEstado", unique = false, nullable = false, insertable = true, updatable = true, length = 45)
	public String getIdEstado() {
		return this.idEstado;
	}

	public void setIdEstado(String idEstado) {
		this.idEstado = idEstado;
	}

	@Column(name = "Cuenta", unique = false, nullable = false, insertable = true, updatable = true, length = 45)
	public String getCuenta() {
		return this.cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	@Column(name = "IdProducto", unique = false, nullable = false, insertable = true, updatable = true, length = 45)
	public String getIdProducto() {
		return this.idProducto;
	}

	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}

	@Column(name = "Correo", unique = false, nullable = false, insertable = true, updatable = true, length = 100)
	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Column(name = "PlanMcAfeeTvCable", unique = false, nullable = false, insertable = true, updatable = true)
	public Integer getPlanMcAfeeTvCable() {
		return this.planMcAfeeTvCable;
	}

	public void setPlanMcAfeeTvCable(Integer planMcAfeeTvCable) {
		this.planMcAfeeTvCable = planMcAfeeTvCable;
	}

	@Column(name = "ClienteCRM", unique = false, nullable = false, insertable = true, updatable = true, length = 45)
	public String getClienteCrm() {
		return this.clienteCrm;
	}

	public void setClienteCrm(String clienteCrm) {
		this.clienteCrm = clienteCrm;
	}

	@Column(name = "IdProductoCRM", unique = false, nullable = false, insertable = true, updatable = true, length = 45)
	public String getIdProductoCrm() {
		return this.idProductoCrm;
	}

	public void setIdProductoCrm(String idProductoCrm) {
		this.idProductoCrm = idProductoCrm;
	}

	@Column(name = "IdMcAfee", unique = false, nullable = true, insertable = true, updatable = true, length = 45)
	public String getIdMcAfee() {
		return this.idMcAfee;
	}

	public void setIdMcAfee(String idMcAfee) {
		this.idMcAfee = idMcAfee;
	}

	@Column(name = "Referencia", unique = false, nullable = true, insertable = true, updatable = true, length = 45)
	public String getReferencia() {
		return this.referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	@Column(name = "CodError", unique = false, nullable = true, insertable = true, updatable = true, length = 45)
	public String getCodError() {
		return this.codError;
	}

	public void setCodError(String codError) {
		this.codError = codError;
	}

	@Column(name = "DetMensaje", unique = false, nullable = true, insertable = true, updatable = true, length = 45)
	public String getDetMensaje() {
		return this.detMensaje;
	}

	public void setDetMensaje(String detMensaje) {
		this.detMensaje = detMensaje;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FechaResp", unique = false, nullable = true, insertable = true, updatable = true, length = 19)
	public Date getFechaResp() {
		return this.fechaResp;
	}

	public void setFechaResp(Date fechaResp) {
		this.fechaResp = fechaResp;
	}
	
	@Column(name = "Nombre", unique = false, nullable = true, insertable = true, updatable = true, length = 200)
	public String getNombre() {
		return this.Nombre;
	}

	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}

}