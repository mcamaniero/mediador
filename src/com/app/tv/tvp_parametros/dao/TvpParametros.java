package com.app.tv.tvp_parametros.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TvpParametros entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="tvp_parametros"
    ,catalog="aprovgrupotv"
, uniqueConstraints = {  }
)

public class TvpParametros  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Integer ciudad;
     private Integer bsi;
     private Integer vcm;
     private Integer headend;
     private Integer up;
     private Integer down;
     private Integer region;


    // Constructors

    /** default constructor */
    public TvpParametros() {
    }

    
    /** full constructor */
    public TvpParametros(Integer id, Integer ciudad, Integer bsi, Integer vcm, Integer headend, Integer up, Integer down, Integer region) {
        this.id = id;
        this.ciudad = ciudad;
        this.bsi = bsi;
        this.vcm = vcm;
        this.headend = headend;
        this.up = up;
        this.down = down;
        this.region = region;
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
    
    @Column(name="ciudad", unique=false, nullable=false, insertable=true, updatable=true)

    public Integer getCiudad() {
        return this.ciudad;
    }
    
    public void setCiudad(Integer ciudad) {
        this.ciudad = ciudad;
    }
    
    @Column(name="bsi", unique=false, nullable=false, insertable=true, updatable=true)

    public Integer getBsi() {
        return this.bsi;
    }
    
    public void setBsi(Integer bsi) {
        this.bsi = bsi;
    }
    
    @Column(name="vcm", unique=false, nullable=false, insertable=true, updatable=true)

    public Integer getVcm() {
        return this.vcm;
    }
    
    public void setVcm(Integer vcm) {
        this.vcm = vcm;
    }
    
    @Column(name="headend", unique=false, nullable=false, insertable=true, updatable=true)

    public Integer getHeadend() {
        return this.headend;
    }
    
    public void setHeadend(Integer headend) {
        this.headend = headend;
    }
    
    @Column(name="up", unique=false, nullable=false, insertable=true, updatable=true)

    public Integer getUp() {
        return this.up;
    }
    
    public void setUp(Integer up) {
        this.up = up;
    }
    
    @Column(name="down", unique=false, nullable=false, insertable=true, updatable=true)

    public Integer getDown() {
        return this.down;
    }
    
    public void setDown(Integer down) {
        this.down = down;
    }
    
    @Column(name="region", unique=false, nullable=false, insertable=true, updatable=true)

    public Integer getRegion() {
        return this.region;
    }
    
    public void setRegion(Integer region) {
        this.region = region;
    }
   








}