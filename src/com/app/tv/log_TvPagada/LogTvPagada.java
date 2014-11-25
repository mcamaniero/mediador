package com.app.tv.log_TvPagada;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.app.tv.tvp_ordendac.*;


/**
 * LogTvPagada entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="log_TvPagada"
    ,catalog="aprovgrupotv"
, uniqueConstraints = {  }
)

public class LogTvPagada  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Date fecha;
     private Integer idempresa;
     private Integer negocio;
     private Integer interfaz;
     private Integer secuencia;
     private Integer tipoc;
     private Integer codigocanal;
     private String descevento;
     private String comienzo;
     private String final_;
     private Integer tipod;
     private Integer duracionevento;
     private Integer idaccount;
     private Integer interstitial;
     private Integer ubicacion;
     private Integer tiempolibre;
     private Integer credito;
     private Integer mpaa;
     private String idpaquetes;
     private Integer contenidoviolento;
     private Integer tipoa;
     private Integer contenidosexual;
     private String formapago;
     private Integer lenguaje;
     private Integer rating;
     private String serie;
     private Integer tiempocompra;
     private Integer citem;
     private Integer paquete;
     private Integer idservicio;
     private Integer tiempodisplay;
     private String estadoc;
     private Integer costoevento;
     private Integer precioevento;
     private Integer accion;
     private Integer anytime;
     private Integer tipopromocion;
     private String ideventos;
     private String datoc1;
     private String datoc2;
     private String idconvertidor;
     private String coderror;
     private String detmensaje;
     private Date fecharesp;



    // Constructors

    /** default constructor */
    public LogTvPagada() {
    }

	/** minimal constructor */
    public LogTvPagada(Integer id) {
        this.id = id;
    }
    
    /** full constructor */
    public LogTvPagada(Integer id, Date fecha, Integer idempresa, Integer negocio, Integer interfaz, Integer secuencia, Integer tipoc, Integer codigocanal, String descevento, String comienzo, String final_, Integer tipod, Integer duracionevento, Integer idaccount, Integer interstitial, Integer ubicacion, Integer tiempolibre, Integer credito, Integer mpaa, String idpaquetes, Integer contenidoviolento, Integer tipoa, Integer contenidosexual, String formapago, Integer lenguaje, Integer rating, String serie, Integer tiempocompra, Integer citem, Integer paquete, Integer idservicio, Integer tiempodisplay, String estadoc, Integer costoevento, Integer precioevento, Integer accion, Integer anytime, Integer tipopromocion, String ideventos, String datoc1, String datoc2, String idconvertidor, String coderror, String detmensaje, Date fecharesp) {
        this.id = id;
        this.fecha = fecha;
        this.idempresa = idempresa;
        this.negocio = negocio;
        this.interfaz = interfaz;
        this.secuencia = secuencia;
        this.tipoc = tipoc;
        this.codigocanal = codigocanal;
        this.descevento = descevento;
        this.comienzo = comienzo;
        this.final_ = final_;
        this.tipod = tipod;
        this.duracionevento = duracionevento;
        this.idaccount = idaccount;
        this.interstitial = interstitial;
        this.ubicacion = ubicacion;
        this.tiempolibre = tiempolibre;
        this.credito = credito;
        this.mpaa = mpaa;
        this.idpaquetes = idpaquetes;
        this.contenidoviolento = contenidoviolento;
        this.tipoa = tipoa;
        this.contenidosexual = contenidosexual;
        this.formapago = formapago;
        this.lenguaje = lenguaje;
        this.rating = rating;
        this.serie = serie;
        this.tiempocompra = tiempocompra;
        this.citem = citem;
        this.paquete = paquete;
        this.idservicio = idservicio;
        this.tiempodisplay = tiempodisplay;
        this.estadoc = estadoc;
        this.costoevento = costoevento;
        this.precioevento = precioevento;
        this.accion = accion;
        this.anytime = anytime;
        this.tipopromocion = tipopromocion;
        this.ideventos = ideventos;
        this.datoc1 = datoc1;
        this.datoc2 = datoc2;
        this.idconvertidor = idconvertidor;
        this.coderror = coderror;
        this.detmensaje = detmensaje;
        this.fecharesp = fecharesp;
    }

   
    // Property accessors
    @Id
    
    @Column(name="ID", unique=true, nullable=false, insertable=true, updatable=true)

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
@Temporal(TemporalType.DATE)
    @Column(name="FECHA", unique=false, nullable=true, insertable=true, updatable=true, length=19)

    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    @Column(name="IDEMPRESA", unique=false, nullable=true, insertable=true, updatable=true)

    public Integer getIdempresa() {
        return this.idempresa;
    }
    
    public void setIdempresa(Integer idempresa) {
        this.idempresa = idempresa;
    }
    
    @Column(name="NEGOCIO", unique=false, nullable=true, insertable=true, updatable=true)

    public Integer getNegocio() {
        return this.negocio;
    }
    
    public void setNegocio(Integer negocio) {
        this.negocio = negocio;
    }
    
    @Column(name="INTERFAZ", unique=false, nullable=true, insertable=true, updatable=true)

    public Integer getInterfaz() {
        return this.interfaz;
    }
    
    public void setInterfaz(Integer interfaz) {
        this.interfaz = interfaz;
    }
    
    @Column(name="SECUENCIA", unique=false, nullable=true, insertable=true, updatable=true)

    public Integer getSecuencia() {
        return this.secuencia;
    }
    
    public void setSecuencia(Integer secuencia) {
        this.secuencia = secuencia;
    }
    
    @Column(name="TIPOC", unique=false, nullable=true, insertable=true, updatable=true)

    public Integer getTipoc() {
        return this.tipoc;
    }
    
    public void setTipoc(Integer tipoc) {
        this.tipoc = tipoc;
    }
    
    @Column(name="CODIGOCANAL", unique=false, nullable=true, insertable=true, updatable=true)

    public Integer getCodigocanal() {
        return this.codigocanal;
    }
    
    public void setCodigocanal(Integer codigocanal) {
        this.codigocanal = codigocanal;
    }
    
    @Column(name="DESCEVENTO", unique=false, nullable=true, insertable=true, updatable=true)

    public String getDescevento() {
        return this.descevento;
    }
    
    public void setDescevento(String descevento) {
        this.descevento = descevento;
    }
    
    @Column(name="COMIENZO", unique=false, nullable=true, insertable=true, updatable=true)

    public String getComienzo() {
        return this.comienzo;
    }
    
    public void setComienzo(String comienzo) {
        this.comienzo = comienzo;
    }
    
    @Column(name="FINAL", unique=false, nullable=true, insertable=true, updatable=true)

    public String getFinal_() {
        return this.final_;
    }
    
    public void setFinal_(String final_) {
        this.final_ = final_;
    }
    
    @Column(name="TIPOD", unique=false, nullable=true, insertable=true, updatable=true)

    public Integer getTipod() {
        return this.tipod;
    }
    
    public void setTipod(Integer tipod) {
        this.tipod = tipod;
    }
    
    @Column(name="DURACIONEVENTO", unique=false, nullable=true, insertable=true, updatable=true)

    public Integer getDuracionevento() {
        return this.duracionevento;
    }
    
    public void setDuracionevento(Integer duracionevento) {
        this.duracionevento = duracionevento;
    }
    
    @Column(name="IDACCOUNT", unique=false, nullable=true, insertable=true, updatable=true)

    public Integer getIdaccount() {
        return this.idaccount;
    }
    
    public void setIdaccount(Integer idaccount) {
        this.idaccount = idaccount;
    }
    
    @Column(name="INTERSTITIAL", unique=false, nullable=true, insertable=true, updatable=true)

    public Integer getInterstitial() {
        return this.interstitial;
    }
    
    public void setInterstitial(Integer interstitial) {
        this.interstitial = interstitial;
    }
    
    @Column(name="UBICACION", unique=false, nullable=true, insertable=true, updatable=true)

    public Integer getUbicacion() {
        return this.ubicacion;
    }
    
    public void setUbicacion(Integer ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    @Column(name="TIEMPOLIBRE", unique=false, nullable=true, insertable=true, updatable=true)

    public Integer getTiempolibre() {
        return this.tiempolibre;
    }
    
    public void setTiempolibre(Integer tiempolibre) {
        this.tiempolibre = tiempolibre;
    }
    
    @Column(name="CREDITO", unique=false, nullable=true, insertable=true, updatable=true)

    public Integer getCredito() {
        return this.credito;
    }
    
    public void setCredito(Integer credito) {
        this.credito = credito;
    }
    
    @Column(name="MPAA", unique=false, nullable=true, insertable=true, updatable=true)

    public Integer getMpaa() {
        return this.mpaa;
    }
    
    public void setMpaa(Integer mpaa) {
        this.mpaa = mpaa;
    }
    
    @Column(name="IDPAQUETES", unique=false, nullable=true, insertable=true, updatable=true)

    public String getIdpaquetes() {
        return this.idpaquetes;
    }
    
    public void setIdpaquetes(String idpaquetes) {
        this.idpaquetes = idpaquetes;
    }
    
    @Column(name="CONTENIDOVIOLENTO", unique=false, nullable=true, insertable=true, updatable=true)

    public Integer getContenidoviolento() {
        return this.contenidoviolento;
    }
    
    public void setContenidoviolento(Integer contenidoviolento) {
        this.contenidoviolento = contenidoviolento;
    }
    
    @Column(name="TIPOA", unique=false, nullable=true, insertable=true, updatable=true)

    public Integer getTipoa() {
        return this.tipoa;
    }
    
    public void setTipoa(Integer tipoa) {
        this.tipoa = tipoa;
    }
    
    @Column(name="CONTENIDOSEXUAL", unique=false, nullable=true, insertable=true, updatable=true)

    public Integer getContenidosexual() {
        return this.contenidosexual;
    }
    
    public void setContenidosexual(Integer contenidosexual) {
        this.contenidosexual = contenidosexual;
    }
    
    @Column(name="FORMAPAGO", unique=false, nullable=true, insertable=true, updatable=true)

    public String getFormapago() {
        return this.formapago;
    }
    
    public void setFormapago(String formapago) {
        this.formapago = formapago;
    }
    
    @Column(name="LENGUAJE", unique=false, nullable=true, insertable=true, updatable=true)

    public Integer getLenguaje() {
        return this.lenguaje;
    }
    
    public void setLenguaje(Integer lenguaje) {
        this.lenguaje = lenguaje;
    }
    
    @Column(name="RATING", unique=false, nullable=true, insertable=true, updatable=true)

    public Integer getRating() {
        return this.rating;
    }
    
    public void setRating(Integer rating) {
        this.rating = rating;
    }
    
    @Column(name="SERIE", unique=false, nullable=true, insertable=true, updatable=true)

    public String getSerie() {
        return this.serie;
    }
    
    public void setSerie(String serie) {
        this.serie = serie;
    }
    
    @Column(name="TIEMPOCOMPRA", unique=false, nullable=true, insertable=true, updatable=true)

    public Integer getTiempocompra() {
        return this.tiempocompra;
    }
    
    public void setTiempocompra(Integer tiempocompra) {
        this.tiempocompra = tiempocompra;
    }
    
    @Column(name="CITEM", unique=false, nullable=true, insertable=true, updatable=true)

    public Integer getCitem() {
        return this.citem;
    }
    
    public void setCitem(Integer citem) {
        this.citem = citem;
    }
    
    @Column(name="PAQUETE", unique=false, nullable=true, insertable=true, updatable=true)

    public Integer getPaquete() {
        return this.paquete;
    }
    
    public void setPaquete(Integer paquete) {
        this.paquete = paquete;
    }
    
    @Column(name="IDSERVICIO", unique=false, nullable=true, insertable=true, updatable=true)

    public Integer getIdservicio() {
        return this.idservicio;
    }
    
    public void setIdservicio(Integer idservicio) {
        this.idservicio = idservicio;
    }
    
    @Column(name="TIEMPODISPLAY", unique=false, nullable=true, insertable=true, updatable=true)

    public Integer getTiempodisplay() {
        return this.tiempodisplay;
    }
    
    public void setTiempodisplay(Integer tiempodisplay) {
        this.tiempodisplay = tiempodisplay;
    }
    
    @Column(name="ESTADOC", unique=false, nullable=true, insertable=true, updatable=true)

    public String getEstadoc() {
        return this.estadoc;
    }
    
    public void setEstadoc(String estadoc) {
        this.estadoc = estadoc;
    }
    
    @Column(name="COSTOEVENTO", unique=false, nullable=true, insertable=true, updatable=true)

    public Integer getCostoevento() {
        return this.costoevento;
    }
    
    public void setCostoevento(Integer costoevento) {
        this.costoevento = costoevento;
    }
    
    @Column(name="PRECIOEVENTO", unique=false, nullable=true, insertable=true, updatable=true)

    public Integer getPrecioevento() {
        return this.precioevento;
    }
    
    public void setPrecioevento(Integer precioevento) {
        this.precioevento = precioevento;
    }
    
    @Column(name="ACCION", unique=false, nullable=true, insertable=true, updatable=true)

    public Integer getAccion() {
        return this.accion;
    }
    
    public void setAccion(Integer accion) {
        this.accion = accion;
    }
    
    @Column(name="ANYTIME", unique=false, nullable=true, insertable=true, updatable=true)

    public Integer getAnytime() {
        return this.anytime;
    }
    
    public void setAnytime(Integer anytime) {
        this.anytime = anytime;
    }
    
    @Column(name="TIPOPROMOCION", unique=false, nullable=true, insertable=true, updatable=true)

    public Integer getTipopromocion() {
        return this.tipopromocion;
    }
    
    public void setTipopromocion(Integer tipopromocion) {
        this.tipopromocion = tipopromocion;
    }
    
    @Column(name="IDEVENTOS", unique=false, nullable=true, insertable=true, updatable=true)

    public String getIdeventos() {
        return this.ideventos;
    }
    
    public void setIdeventos(String ideventos) {
        this.ideventos = ideventos;
    }
    
    @Column(name="DATOC1", unique=false, nullable=true, insertable=true, updatable=true)

    public String getDatoc1() {
        return this.datoc1;
    }
    
    public void setDatoc1(String datoc1) {
        this.datoc1 = datoc1;
    }
    
    @Column(name="DATOC2", unique=false, nullable=true, insertable=true, updatable=true)

    public String getDatoc2() {
        return this.datoc2;
    }
    
    public void setDatoc2(String datoc2) {
        this.datoc2 = datoc2;
    }
    
    @Column(name="IDCONVERTIDOR", unique=false, nullable=true, insertable=true, updatable=true)

    public String getIdconvertidor() {
        return this.idconvertidor;
    }
    
    public void setIdconvertidor(String idconvertidor) {
        this.idconvertidor = idconvertidor;
    }
    
    @Column(name="CODERROR", unique=false, nullable=true, insertable=true, updatable=true, length=45)

    public String getCoderror() {
        return this.coderror;
    }
    
    public void setCoderror(String coderror) {
        this.coderror = coderror;
    }
    
    @Column(name="DETMENSAJE", unique=false, nullable=true, insertable=true, updatable=true, length=65535)

    public String getDetmensaje() {
        return this.detmensaje;
    }
    
    public void setDetmensaje(String detmensaje) {
        this.detmensaje = detmensaje;
    }
@Temporal(TemporalType.DATE)
    @Column(name="FECHARESP", unique=false, nullable=true, insertable=true, updatable=true, length=19)

    public Date getFecharesp() {
        return this.fecharesp;
    }
    
    public void setFecharesp(Date fecharesp) {
        this.fecharesp = fecharesp;
    }
   

}