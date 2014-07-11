package com.app.dao.conciliacion.cms;

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
 * AdmConciliacionCm entity.
 * 
 * @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "adm_conciliacion_cms", catalog = "aprovgrupotv", uniqueConstraints = {})
public class AdmConciliacionCms implements java.io.Serializable {

	// Fields

	private Integer id;
	private String ciudad;
	private String clientecrm;
	private String idproducto;
	private String macT;
	private String servicepackageT;
	private String cpsT;
	private String estadoT;
	private String macIw;
	private String servicepackageIw;
	private String cpsIw;
	private String estadoIw;
	private Date fecha;
	private Integer sesion;
	private String activitytype;

	// Constructors

	/** default constructor */
	public AdmConciliacionCms() {
	}

	/** minimal constructor */
	public AdmConciliacionCms(Integer id, String ciudad, String clientecrm,
			String idproducto, Date fecha, Integer sesion) {
		this.id = id;
		this.ciudad = ciudad;
		this.clientecrm = clientecrm;
		this.idproducto = idproducto;
		this.fecha = fecha;
		this.sesion = sesion;
	}

	/** full constructor */
	public AdmConciliacionCms(Integer id, String ciudad, String clientecrm,
			String idproducto, String macT, String servicepackageT,
			String cpsT, String estadoT, String macIw, String servicepackageIw,
			String cpsIw, String estadoIw, Date fecha, Integer sesion, String activitytype) {
		this.id = id;
		this.ciudad = ciudad;
		this.clientecrm = clientecrm;
		this.idproducto = idproducto;
		this.macT = macT;
		this.servicepackageT = servicepackageT;
		this.cpsT = cpsT;
		this.estadoT = estadoT;
		this.macIw = macIw;
		this.servicepackageIw = servicepackageIw;
		this.cpsIw = cpsIw;
		this.estadoIw = estadoIw;
		this.fecha = fecha;
		this.sesion = sesion;
		this.activitytype = activitytype;
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

	@Column(name = "ciudad", unique = false, nullable = false, insertable = true, updatable = true, length = 3)
	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Column(name = "clientecrm", unique = false, nullable = false, insertable = true, updatable = true, length = 45)
	public String getClientecrm() {
		return this.clientecrm;
	}

	public void setClientecrm(String clientecrm) {
		this.clientecrm = clientecrm;
	}

	@Column(name = "idproducto", unique = false, nullable = false, insertable = true, updatable = true, length = 45)
	public String getIdproducto() {
		return this.idproducto;
	}

	public void setIdproducto(String idproducto) {
		this.idproducto = idproducto;
	}

	@Column(name = "mac_t", unique = false, nullable = true, insertable = true, updatable = true, length = 15)
	public String getMacT() {
		return this.macT;
	}

	public void setMacT(String macT) {
		this.macT = macT;
	}

	@Column(name = "servicepackage_t", unique = false, nullable = true, insertable = true, updatable = true, length = 20)
	public String getServicepackageT() {
		return this.servicepackageT;
	}

	public void setServicepackageT(String servicepackageT) {
		this.servicepackageT = servicepackageT;
	}

	@Column(name = "cps_t", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
	public String getCpsT() {
		return this.cpsT;
	}

	public void setCpsT(String cpsT) {
		this.cpsT = cpsT;
	}

	@Column(name = "estado_t", unique = false, nullable = true, insertable = true, updatable = true, length = 15)
	public String getEstadoT() {
		return this.estadoT;
	}

	public void setEstadoT(String estadoT) {
		this.estadoT = estadoT;
	}

	@Column(name = "mac_iw", unique = false, nullable = true, insertable = true, updatable = true, length = 15)
	public String getMacIw() {
		return this.macIw;
	}

	public void setMacIw(String macIw) {
		this.macIw = macIw;
	}

	@Column(name = "servicepackage_iw", unique = false, nullable = true, insertable = true, updatable = true, length = 20)
	public String getServicepackageIw() {
		return this.servicepackageIw;
	}

	public void setServicepackageIw(String servicepackageIw) {
		this.servicepackageIw = servicepackageIw;
	}

	@Column(name = "cps_iw", unique = false, nullable = true, insertable = true, updatable = true, length = 4)
	public String getCpsIw() {
		return this.cpsIw;
	}

	public void setCpsIw(String cpsIw) {
		this.cpsIw = cpsIw;
	}

	@Column(name = "estado_iw", unique = false, nullable = true, insertable = true, updatable = true, length = 15)
	public String getEstadoIw() {
		return this.estadoIw;
	}

	public void setEstadoIw(String estadoIw) {
		this.estadoIw = estadoIw;
	}

	
	@Column(name = "fecha", unique = false, nullable = false, insertable = true, updatable = true, length = 19)
	@Temporal(TemporalType.TIMESTAMP)
	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	@Column(name = "sesion", unique = false, nullable = false, insertable = true, updatable = true)
	public Integer getSesion() {
		return this.sesion;
	}

	public void setSesion(Integer sesion) {
		this.sesion = sesion;
	}

	@Column(name="activitytype", unique=false, nullable=true, insertable=true, updatable=true, length=2)

    public String getActivitytype() {
        return this.activitytype;
    }
    
    public void setActivitytype(String activitytype) {
        this.activitytype = activitytype;
    }
}