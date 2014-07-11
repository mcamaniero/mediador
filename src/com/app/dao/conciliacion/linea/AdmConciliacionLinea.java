package com.app.dao.conciliacion.linea;

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
 * AdmConciliacionLinea entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="adm_conciliacion_linea"
    ,catalog="aprovgrupotv"
, uniqueConstraints = {  }
)

public class AdmConciliacionLinea  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private String ciudad;
     private String clientecrm;
     private String idproducto;
     private String idproductocm;
     private String macT;
     private String mtamacT;
     private String servicepackageT;
     private String cpsT;
     private String fonoT;
     private String homeexchangeT;
     private String estadoT;
     private String macIw;
     private String mtamacIw;
     private String servicepackageIw;
     private String cpsIw;
     private String fonoIw;
     private String homeexchangeIw;
     private String estadoIw;
     private Date fecha;
     private Integer sesion;
     private String tipo;
     private String activitytype;

    // Constructors

    /** default constructor */
    public AdmConciliacionLinea() {
    }

	/** minimal constructor */
    public AdmConciliacionLinea(Integer id, String ciudad, String clientecrm, String idproducto, String idproductocm, Date fecha, Integer sesion, String tipo) {
        this.id = id;
        this.ciudad = ciudad;
        this.clientecrm = clientecrm;
        this.idproducto = idproducto;
        this.idproductocm = idproductocm;
        this.fecha = fecha;
        this.sesion = sesion;
        this.tipo = tipo;
    }
    
    /** full constructor */
    public AdmConciliacionLinea(Integer id, String ciudad, String clientecrm, String idproducto, String idproductocm, String macT, String mtamacT, String servicepackageT, String cpsT, String fonoT, String homeexchangeT, String estadoT, String macIw, String mtamacIw, String servicepackageIw, String cpsIw, String fonoIw, String homeexchangeIw, String estadoIw, Date fecha, Integer sesion, String tipo, String activitytype) {
        this.id = id;
        this.ciudad = ciudad;
        this.clientecrm = clientecrm;
        this.idproducto = idproducto;
        this.idproductocm = idproductocm;
        this.macT = macT;
        this.mtamacT = mtamacT;
        this.servicepackageT = servicepackageT;
        this.cpsT = cpsT;
        this.fonoT = fonoT;
        this.homeexchangeT = homeexchangeT;
        this.estadoT = estadoT;
        this.macIw = macIw;
        this.mtamacIw = mtamacIw;
        this.servicepackageIw = servicepackageIw;
        this.cpsIw = cpsIw;
        this.fonoIw = fonoIw;
        this.homeexchangeIw = homeexchangeIw;
        this.estadoIw = estadoIw;
        this.fecha = fecha;
        this.sesion = sesion;
        this.tipo = tipo;
        this.activitytype = activitytype;
    }

   
    // Property accessors
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id", unique=true, nullable=false, insertable=true, updatable=true)

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    @Column(name="ciudad", unique=false, nullable=false, insertable=true, updatable=true, length=45)

    public String getCiudad() {
        return this.ciudad;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    @Column(name="clientecrm", unique=false, nullable=false, insertable=true, updatable=true, length=45)

    public String getClientecrm() {
        return this.clientecrm;
    }
    
    public void setClientecrm(String clientecrm) {
        this.clientecrm = clientecrm;
    }
    
    @Column(name="idproducto", unique=false, nullable=false, insertable=true, updatable=true, length=45)

    public String getIdproducto() {
        return this.idproducto;
    }
    
    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }
    
    @Column(name="idproductocm", unique=false, nullable=false, insertable=true, updatable=true, length=45)

    public String getIdproductocm() {
        return this.idproductocm;
    }
    
    public void setIdproductocm(String idproductocm) {
        this.idproductocm = idproductocm;
    }
    
    @Column(name="mac_t", unique=false, nullable=true, insertable=true, updatable=true, length=15)

    public String getMacT() {
        return this.macT;
    }
    
    public void setMacT(String macT) {
        this.macT = macT;
    }
    
    @Column(name="mtamac_t", unique=false, nullable=true, insertable=true, updatable=true, length=15)

    public String getMtamacT() {
        return this.mtamacT;
    }
    
    public void setMtamacT(String mtamacT) {
        this.mtamacT = mtamacT;
    }
    
    @Column(name="servicepackage_t", unique=false, nullable=true, insertable=true, updatable=true, length=20)

    public String getServicepackageT() {
        return this.servicepackageT;
    }
    
    public void setServicepackageT(String servicepackageT) {
        this.servicepackageT = servicepackageT;
    }
    
    @Column(name="cps_t", unique=false, nullable=true, insertable=true, updatable=true, length=3)

    public String getCpsT() {
        return this.cpsT;
    }
    
    public void setCpsT(String cpsT) {
        this.cpsT = cpsT;
    }
    
    @Column(name="fono_t", unique=false, nullable=true, insertable=true, updatable=true, length=255)

    public String getFonoT() {
        return this.fonoT;
    }
    
    public void setFonoT(String fonoT) {
        this.fonoT = fonoT;
    }
    
    @Column(name="homeexchange_t", unique=false, nullable=true, insertable=true, updatable=true, length=25)

    public String getHomeexchangeT() {
        return this.homeexchangeT;
    }
    
    public void setHomeexchangeT(String homeexchangeT) {
        this.homeexchangeT = homeexchangeT;
    }
    
    @Column(name="estado_t", unique=false, nullable=true, insertable=true, updatable=true, length=10)

    public String getEstadoT() {
        return this.estadoT;
    }
    
    public void setEstadoT(String estadoT) {
        this.estadoT = estadoT;
    }
    
    @Column(name="mac_iw", unique=false, nullable=true, insertable=true, updatable=true, length=15)

    public String getMacIw() {
        return this.macIw;
    }
    
    public void setMacIw(String macIw) {
        this.macIw = macIw;
    }
    
    @Column(name="mtamac_iw", unique=false, nullable=true, insertable=true, updatable=true, length=15)

    public String getMtamacIw() {
        return this.mtamacIw;
    }
    
    public void setMtamacIw(String mtamacIw) {
        this.mtamacIw = mtamacIw;
    }
    
    @Column(name="servicepackage_iw", unique=false, nullable=true, insertable=true, updatable=true, length=20)

    public String getServicepackageIw() {
        return this.servicepackageIw;
    }
    
    public void setServicepackageIw(String servicepackageIw) {
        this.servicepackageIw = servicepackageIw;
    }
    
    @Column(name="cps_iw", unique=false, nullable=true, insertable=true, updatable=true, length=3)

    public String getCpsIw() {
        return this.cpsIw;
    }
    
    public void setCpsIw(String cpsIw) {
        this.cpsIw = cpsIw;
    }
    
    @Column(name="fono_iw", unique=false, nullable=true, insertable=true, updatable=true, length=15)

    public String getFonoIw() {
        return this.fonoIw;
    }
    
    public void setFonoIw(String fonoIw) {
        this.fonoIw = fonoIw;
    }
    
    @Column(name="homeexchange_iw", unique=false, nullable=true, insertable=true, updatable=true, length=25)

    public String getHomeexchangeIw() {
        return this.homeexchangeIw;
    }
    
    public void setHomeexchangeIw(String homeexchangeIw) {
        this.homeexchangeIw = homeexchangeIw;
    }
    
    @Column(name="estado_iw", unique=false, nullable=true, insertable=true, updatable=true, length=10)

    public String getEstadoIw() {
        return this.estadoIw;
    }
    
    public void setEstadoIw(String estadoIw) {
        this.estadoIw = estadoIw;
    }
@Temporal(TemporalType.DATE)
    @Column(name="fecha", unique=false, nullable=false, insertable=true, updatable=true, length=19)

    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    @Column(name="sesion", unique=false, nullable=false, insertable=true, updatable=true)

    public Integer getSesion() {
        return this.sesion;
    }
    
    public void setSesion(Integer sesion) {
        this.sesion = sesion;
    }
   

    @Column(name="tipo", unique=false, nullable=true, insertable=true, updatable=true, length=10)

    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    @Column(name="activitytype", unique=false, nullable=true, insertable=true, updatable=true, length=10)
    public String getActivitytype() {
        return this.activitytype;
    }
    
    public void setActivitytype(String activitytype) {
        this.activitytype = activitytype;
    }




}