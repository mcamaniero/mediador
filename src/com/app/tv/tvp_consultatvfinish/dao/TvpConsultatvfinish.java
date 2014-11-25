package com.app.tv.tvp_consultatvfinish.dao;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TvpConsultatvfinish entity.
 * 
 * @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tvp_consultatvfinish", catalog = "aprovgrupotv", uniqueConstraints = {})
public class TvpConsultatvfinish implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer cpartyId;
	private Integer cpartyIdAccount;
	private String decoSerie;
	private String decoId;
	private String servicioTitan;
	private String servicioControlador;
	private String estadoTitan;
	private String estadoControlador;
	private Integer consultatvId;
	private Integer sessionId;
	private String paychannelsTitan;
	private String paychannelsControlador;
	private Integer ciudad;
	private Integer decoIdControlador;
	private Date fecha;
	private Integer sessionReportType;

	// Constructors

	/** default constructor */
	public TvpConsultatvfinish() {
	}

	/** full constructor */
	public TvpConsultatvfinish(Integer id, Integer cpartyId,
			Integer cpartyIdAccount, String decoSerie, String decoId,
			String servicioTitan, String servicioControlador,
			String estadoTitan, String estadoControlador, Integer consultatvId,
			Integer sessionId, String paychannelsTitan,
			String paychannelsControlador, Integer ciudad,
			Integer decoIdControlador, Date fecha, Integer sessionReportType) {
		this.id = id;
		this.cpartyId = cpartyId;
		this.cpartyIdAccount = cpartyIdAccount;
		this.decoSerie = decoSerie;
		this.decoId = decoId;
		this.servicioTitan = servicioTitan;
		this.servicioControlador = servicioControlador;
		this.estadoTitan = estadoTitan;
		this.estadoControlador = estadoControlador;
		this.consultatvId = consultatvId;
		this.sessionId = sessionId;
		this.paychannelsTitan = paychannelsTitan;
		this.paychannelsControlador = paychannelsControlador;
		this.ciudad = ciudad;
		this.decoIdControlador = decoIdControlador;
		this.fecha = fecha;
		this.sessionReportType = sessionReportType;
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

	@Column(name = "cparty_id", unique = false, nullable = false, insertable = true, updatable = true)
	public Integer getCpartyId() {
		return this.cpartyId;
	}

	public void setCpartyId(Integer cpartyId) {
		this.cpartyId = cpartyId;
	}

	@Column(name = "cparty_id_account", unique = false, nullable = false, insertable = true, updatable = true)
	public Integer getCpartyIdAccount() {
		return this.cpartyIdAccount;
	}

	public void setCpartyIdAccount(Integer cpartyIdAccount) {
		this.cpartyIdAccount = cpartyIdAccount;
	}

	@Column(name = "deco_serie", unique = false, nullable = false, insertable = true, updatable = true, length = 45)
	public String getDecoSerie() {
		return this.decoSerie;
	}

	public void setDecoSerie(String decoSerie) {
		this.decoSerie = decoSerie;
	}

	@Column(name = "deco_id", unique = false, nullable = false, insertable = true, updatable = true, length = 45)
	public String getDecoId() {
		return this.decoId;
	}

	public void setDecoId(String decoId) {
		this.decoId = decoId;
	}

	@Column(name = "servicio_titan", unique = false, nullable = false, insertable = true, updatable = true, length = 45)
	public String getServicioTitan() {
		return this.servicioTitan;
	}

	public void setServicioTitan(String servicioTitan) {
		this.servicioTitan = servicioTitan;
	}

	@Column(name = "servicio_controlador", unique = false, nullable = false, insertable = true, updatable = true, length = 45)
	public String getServicioControlador() {
		return this.servicioControlador;
	}

	public void setServicioControlador(String servicioControlador) {
		this.servicioControlador = servicioControlador;
	}

	@Column(name = "estado_titan", unique = false, nullable = false, insertable = true, updatable = true, length = 45)
	public String getEstadoTitan() {
		return this.estadoTitan;
	}

	public void setEstadoTitan(String estadoTitan) {
		this.estadoTitan = estadoTitan;
	}

	@Column(name = "estado_controlador", unique = false, nullable = false, insertable = true, updatable = true, length = 45)
	public String getEstadoControlador() {
		return this.estadoControlador;
	}

	public void setEstadoControlador(String estadoControlador) {
		this.estadoControlador = estadoControlador;
	}

	@Column(name = "consultatv_id", unique = false, nullable = false, insertable = true, updatable = true)
	public Integer getConsultatvId() {
		return this.consultatvId;
	}

	public void setConsultatvId(Integer consultatvId) {
		this.consultatvId = consultatvId;
	}

	@Column(name = "session_id", unique = false, nullable = false, insertable = true, updatable = true)
	public Integer getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(Integer sessionId) {
		this.sessionId = sessionId;
	}

	@Column(name = "paychannels_titan", unique = false, nullable = false, insertable = true, updatable = true, length = 45)
	public String getPaychannelsTitan() {
		return this.paychannelsTitan;
	}

	public void setPaychannelsTitan(String paychannelsTitan) {
		this.paychannelsTitan = paychannelsTitan;
	}

	@Column(name = "paychannels_controlador", unique = false, nullable = false, insertable = true, updatable = true, length = 45)
	public String getPaychannelsControlador() {
		return this.paychannelsControlador;
	}

	public void setPaychannelsControlador(String paychannelsControlador) {
		this.paychannelsControlador = paychannelsControlador;
	}

	@Column(name = "ciudad", unique = false, nullable = false, insertable = true, updatable = true)
	public Integer getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(Integer ciudad) {
		this.ciudad = ciudad;
	}

	@Column(name = "deco_id_controlador", unique = false, nullable = false, insertable = true, updatable = true)
	public Integer getDecoIdControlador() {
		return this.decoIdControlador;
	}

	public void setDecoIdControlador(Integer decoIdControlador) {
		this.decoIdControlador = decoIdControlador;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha", unique = false, nullable = false, insertable = true, updatable = true, length = 19)
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Column(name = "session_report_type", unique = false, nullable = false, insertable = true, updatable = true)
	public Integer getSessionReportType() {
		return this.sessionReportType;
	}

	public void setSessionReportType(Integer sessionReportType) {
		this.sessionReportType = sessionReportType;
	}

}