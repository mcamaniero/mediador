package com.app.tv.tvp_recoleccionPPV.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TvpRecoleccionPpv entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="tvp_recoleccionPPV"
    ,catalog="aprovgrupotv"
, uniqueConstraints = {  }
)

public class TvpRecoleccionPpv  implements java.io.Serializable {


    // Fields    

     private Long id;
     private Integer idempresa;
     private String strSerial;
     private String idEvento;
     private String date;
     private Integer idTipoRecoleccion;
     private String polldate;
     private String state;


    // Constructors

    /** default constructor */
    public TvpRecoleccionPpv() {
    }

    
    /** full constructor */
    public TvpRecoleccionPpv(Long id, Integer idempresa, String strSerial, String idEvento, String date, Integer idTipoRecoleccion, String polldate, String state) {
        this.id = id;
        this.idempresa = idempresa;
        this.strSerial = strSerial;
        this.idEvento = idEvento;
        this.date = date;
        this.idTipoRecoleccion = idTipoRecoleccion;
        this.polldate = polldate;
        this.state = state;
    }

   
    // Property accessors
    @Id
    
    @Column(name="id", unique=true, nullable=false, insertable=true, updatable=true)

    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    @Column(name="idempresa", unique=false, nullable=false, insertable=true, updatable=true)

    public Integer getIdempresa() {
        return this.idempresa;
    }
    
    public void setIdempresa(Integer idempresa) {
        this.idempresa = idempresa;
    }
    
    @Column(name="strSerial", unique=false, nullable=false, insertable=true, updatable=true, length=45)

    public String getStrSerial() {
        return this.strSerial;
    }
    
    public void setStrSerial(String strSerial) {
        this.strSerial = strSerial;
    }
    
    @Column(name="idEvento", unique=false, nullable=false, insertable=true, updatable=true, length=45)

    public String getIdEvento() {
        return this.idEvento;
    }
    
    public void setIdEvento(String idEvento) {
        this.idEvento = idEvento;
    }
    
    @Column(name="date", unique=false, nullable=false, insertable=true, updatable=true, length=45)

    public String getDate() {
        return this.date;
    }
    
    public void setDate(String date) {
        this.date = date;
    }
    
    @Column(name="idTipoRecoleccion", unique=false, nullable=false, insertable=true, updatable=true)

    public Integer getIdTipoRecoleccion() {
        return this.idTipoRecoleccion;
    }
    
    public void setIdTipoRecoleccion(Integer idTipoRecoleccion) {
        this.idTipoRecoleccion = idTipoRecoleccion;
    }
    
    @Column(name="polldate", unique=false, nullable=false, insertable=true, updatable=true, length=45)

    public String getPolldate() {
        return this.polldate;
    }
    
    public void setPolldate(String polldate) {
        this.polldate = polldate;
    }
    
    @Column(name="state", unique=false, nullable=false, insertable=true, updatable=true, length=1)

    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }
   








}