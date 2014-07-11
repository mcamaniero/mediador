package com.app.tv.tvp_puertosDAC;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * TvpPuertosDac entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="tvp_puertosDAC"
    ,catalog="aprovgrupotv"
, uniqueConstraints = {  }
)

public class TvpPuertosDac  implements java.io.Serializable {


    // Fields    

     private Integer ciudadId;
     private Integer puertoDac;


    // Constructors

    /** default constructor */
    public TvpPuertosDac() {
    }

    
    /** full constructor */
    public TvpPuertosDac(Integer ciudadId, Integer puertoDac) {
        this.ciudadId = ciudadId;
        this.puertoDac = puertoDac;
    }

   
    // Property accessors
    @Id
    
    @Column(name="ciudad_id", unique=true, nullable=false, insertable=true, updatable=true)

    public Integer getCiudadId() {
        return this.ciudadId;
    }
    
    public void setCiudadId(Integer ciudadId) {
        this.ciudadId = ciudadId;
    }
    
    @Column(name="PuertoDAC", unique=false, nullable=false, insertable=true, updatable=true)

    public Integer getPuertoDac() {
        return this.puertoDac;
    }
    
    public void setPuertoDac(Integer puertoDac) {
        this.puertoDac = puertoDac;
    }
   








}