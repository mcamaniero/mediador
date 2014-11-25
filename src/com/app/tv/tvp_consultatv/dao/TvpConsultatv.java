package com.app.tv.tvp_consultatv.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TvpConsultatv entity.
 * 
 * @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tvp_consultatv", catalog = "aprovgrupotv", uniqueConstraints = {})
public class TvpConsultatv implements java.io.Serializable {

	// Fields

	private Integer id;
	private String activitytype;
	private Integer cpartyId;
	private Integer cpartyAccountId;
	private String apaddress;
	private Integer tariffPlanVariantName;
	private String requesteddate;
	private Integer citemId;
	private String ciudadNombre;
	private Integer systemIdActive;
	private Integer sessionId;

	// Constructors

	/** default constructor */
	public TvpConsultatv() {
	}

	/** full constructor */
	public TvpConsultatv(Integer id, String activitytype, Integer cpartyId,
			Integer cpartyAccountId, String apaddress,
			Integer tariffPlanVariantName, String requesteddate,
			Integer citemId, String ciudadNombre, Integer systemIdActive,
			Integer sessionId) {
		this.id = id;
		this.activitytype = activitytype;
		this.cpartyId = cpartyId;
		this.cpartyAccountId = cpartyAccountId;
		this.apaddress = apaddress;
		this.tariffPlanVariantName = tariffPlanVariantName;
		this.requesteddate = requesteddate;
		this.citemId = citemId;
		this.ciudadNombre = ciudadNombre;
		this.systemIdActive = systemIdActive;
		this.sessionId = sessionId;
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

	@Column(name = "activitytype", unique = false, nullable = false, insertable = true, updatable = true, length = 45)
	public String getActivitytype() {
		return this.activitytype;
	}

	public void setActivitytype(String activitytype) {
		this.activitytype = activitytype;
	}

	@Column(name = "cparty_id", unique = false, nullable = false, insertable = true, updatable = true)
	public Integer getCpartyId() {
		return this.cpartyId;
	}

	public void setCpartyId(Integer cpartyId) {
		this.cpartyId = cpartyId;
	}

	@Column(name = "CPartyAccount_Id", unique = false, nullable = false, insertable = true, updatable = true)
	public Integer getCpartyAccountId() {
		return this.cpartyAccountId;
	}

	public void setCpartyAccountId(Integer cpartyAccountId) {
		this.cpartyAccountId = cpartyAccountId;
	}

	@Column(name = "APAddress", unique = false, nullable = false, insertable = true, updatable = true, length = 45)
	public String getApaddress() {
		return this.apaddress;
	}

	public void setApaddress(String apaddress) {
		this.apaddress = apaddress;
	}

	@Column(name = "TariffPlanVariantName", unique = false, nullable = false, insertable = true, updatable = true)
	public Integer getTariffPlanVariantName() {
		return this.tariffPlanVariantName;
	}

	public void setTariffPlanVariantName(Integer tariffPlanVariantName) {
		this.tariffPlanVariantName = tariffPlanVariantName;
	}

	@Column(name = "requesteddate", unique = false, nullable = false, insertable = true, updatable = true, length = 45)
	public String getRequesteddate() {
		return this.requesteddate;
	}

	public void setRequesteddate(String requesteddate) {
		this.requesteddate = requesteddate;
	}

	@Column(name = "citem_id", unique = false, nullable = false, insertable = true, updatable = true)
	public Integer getCitemId() {
		return this.citemId;
	}

	public void setCitemId(Integer citemId) {
		this.citemId = citemId;
	}

	@Column(name = "ciudad_nombre", unique = false, nullable = false, insertable = true, updatable = true, length = 45)
	public String getCiudadNombre() {
		return this.ciudadNombre;
	}

	public void setCiudadNombre(String ciudadNombre) {
		this.ciudadNombre = ciudadNombre;
	}

	@Column(name = "system_id_active", unique = false, nullable = false, insertable = true, updatable = true)
	public Integer getSystemIdActive() {
		return this.systemIdActive;
	}

	public void setSystemIdActive(Integer systemIdActive) {
		this.systemIdActive = systemIdActive;
	}

	@Column(name = "session_id", unique = false, nullable = false, insertable = true, updatable = true)
	public Integer getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(Integer sessionId) {
		this.sessionId = sessionId;
	}

}