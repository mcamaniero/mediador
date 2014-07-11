package com.app.tv.tvp_admsessions.dao;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * AdmSessions entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="adm_sessions"
    ,catalog="aprovgrupotv"
, uniqueConstraints = {  }
)

public class AdmSessions  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Date sesionFecha;
     private Integer sesionTv;
     private Date sesionTvFecha;
     private Integer sesionInt;
     private Date sesionIntFecha;
     private Integer sesionTel;
     private Date sesionTelFecha;
     private String sesionUsuario;
     private String sessionUsuarioMaquina;
     private Integer sessionReportType;


    // Constructors

    /** default constructor */
    public AdmSessions() {
    }

	/** minimal constructor */
    public AdmSessions(Integer id, Integer sesionTv, Integer sesionInt, Integer sesionTel, String sesionUsuario, String sessionUsuarioMaquina, Integer sessionReportType) {
        this.id = id;
        this.sesionTv = sesionTv;
        this.sesionInt = sesionInt;
        this.sesionTel = sesionTel;
        this.sesionUsuario = sesionUsuario;
        this.sessionUsuarioMaquina = sessionUsuarioMaquina;
        this.sessionReportType = sessionReportType;
    }
    
    /** full constructor */
    public AdmSessions(Integer id, Date sesionFecha, Integer sesionTv, Date sesionTvFecha, Integer sesionInt, Date sesionIntFecha, Integer sesionTel, Date sesionTelFecha, String sesionUsuario, String sessionUsuarioMaquina, Integer sessionReportType) {
        this.id = id;
        this.sesionFecha = sesionFecha;
        this.sesionTv = sesionTv;
        this.sesionTvFecha = sesionTvFecha;
        this.sesionInt = sesionInt;
        this.sesionIntFecha = sesionIntFecha;
        this.sesionTel = sesionTel;
        this.sesionTelFecha = sesionTelFecha;
        this.sesionUsuario = sesionUsuario;
        this.sessionUsuarioMaquina = sessionUsuarioMaquina;
        this.sessionReportType = sessionReportType;
    }

   
    // Property accessors
    @Id
    
    @Column(name="id", unique=true, nullable=false, insertable=true, updatable=true)

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
@Temporal(TemporalType.DATE)
    @Column(name="sesion_fecha", unique=false, nullable=true, insertable=true, updatable=true, length=19)

    public Date getSesionFecha() {
        return this.sesionFecha;
    }
    
    public void setSesionFecha(Date sesionFecha) {
        this.sesionFecha = sesionFecha;
    }
    
    @Column(name="sesion_tv", unique=false, nullable=false, insertable=true, updatable=true)

    public Integer getSesionTv() {
        return this.sesionTv;
    }
    
    public void setSesionTv(Integer sesionTv) {
        this.sesionTv = sesionTv;
    }
@Temporal(TemporalType.DATE)
    @Column(name="sesion_tv_fecha", unique=false, nullable=true, insertable=true, updatable=true, length=19)

    public Date getSesionTvFecha() {
        return this.sesionTvFecha;
    }
    
    public void setSesionTvFecha(Date sesionTvFecha) {
        this.sesionTvFecha = sesionTvFecha;
    }
    
    @Column(name="sesion_int", unique=false, nullable=false, insertable=true, updatable=true)

    public Integer getSesionInt() {
        return this.sesionInt;
    }
    
    public void setSesionInt(Integer sesionInt) {
        this.sesionInt = sesionInt;
    }
@Temporal(TemporalType.DATE)
    @Column(name="sesion_int_fecha", unique=false, nullable=true, insertable=true, updatable=true, length=19)

    public Date getSesionIntFecha() {
        return this.sesionIntFecha;
    }
    
    public void setSesionIntFecha(Date sesionIntFecha) {
        this.sesionIntFecha = sesionIntFecha;
    }
    
    @Column(name="sesion_tel", unique=false, nullable=false, insertable=true, updatable=true)

    public Integer getSesionTel() {
        return this.sesionTel;
    }
    
    public void setSesionTel(Integer sesionTel) {
        this.sesionTel = sesionTel;
    }
@Temporal(TemporalType.DATE)
    @Column(name="sesion_tel_fecha", unique=false, nullable=true, insertable=true, updatable=true, length=19)

    public Date getSesionTelFecha() {
        return this.sesionTelFecha;
    }
    
    public void setSesionTelFecha(Date sesionTelFecha) {
        this.sesionTelFecha = sesionTelFecha;
    }
    
    @Column(name="sesion_usuario", unique=false, nullable=false, insertable=true, updatable=true, length=45)

    public String getSesionUsuario() {
        return this.sesionUsuario;
    }
    
    public void setSesionUsuario(String sesionUsuario) {
        this.sesionUsuario = sesionUsuario;
    }
    
    @Column(name="session_usuario_maquina", unique=false, nullable=false, insertable=true, updatable=true, length=45)

    public String getSessionUsuarioMaquina() {
        return this.sessionUsuarioMaquina;
    }
    
    public void setSessionUsuarioMaquina(String sessionUsuarioMaquina) {
        this.sessionUsuarioMaquina = sessionUsuarioMaquina;
    }
    
    @Column(name="session_report_type", unique=false, nullable=false, insertable=true, updatable=true)

    public Integer getSessionReportType() {
        return this.sessionReportType;
    }
    
    public void setSessionReportType(Integer sessionReportType) {
        this.sessionReportType = sessionReportType;
    }
   








}