package com.app.dao;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "log_TvPagada", catalog = "aprovgrupotv", uniqueConstraints = {})
public class TvPagada extends CabeceraDao implements Serializable {

	private static final long serialVersionUID = -4287888589854650885L;

	
	private String Serie;//
	private int TipoD;//
	private String IdConvertidor;//
	private int IdAccount;//
	private int CItem;//
	private int Ubicacion;//
	private int Accion;//
	private int Credito;//
	private int IdServicio;//
	private String IdPaquetes;//
	private String IdEventos;//
	private int TipoA;//
	private String EstadoC;//
	private String FormaPago;//
	private int TipoC;//
	private int CodigoCanal;//
	private String DescEvento;//
	private String Comienzo;//
	private String Final;//
	private int DuracionEvento;//20
	private int Interstitial;//
	private int TiempoLibre;//
	private int Mpaa;//
	private int ContenidoViolento;//
	private int ContenidoSexual;//
	private int Lenguaje;//
	private int Rating;//
	private int TiempoCompra;//
	private int Paquete;//
	private int TiempoDisplay;//
	private int CostoEvento;//
	private int PrecioEvento;//
	private int AnyTime;
	private int TipoPromocion;
	private String DatoC1;
	private String DatoC2;//16
	
	
	public TvPagada() {
		// TODO Auto-generated constructor stub
	}

	public TvPagada(Date fecha, int idEmpresa, int negocio, int interfaz, int secuencia, String codError, String detMensaje,
			String serie, int tipoD, String idConvertidor, int idAccount, int cItem,
			int ubicacion, int accion, int credito, int idServicio, String idPaquetes,
			String idEventos, int tipoA, String estadoC, String formaPago, int tipoC, 
			int codigoCanal, String descEvento, String comienzo, String _final, int duracionEvento,
			int interstitial, int tiempoLibre, int mpaa, int contenidoViolento, int contenidoSexual,
			int lenguaje, int rating, int tiempoCompra, int paquete, int tiempoDisplay,
			int costoEvento, int precioEvento, int anyTime, int tipoPromocion, 
			String datoC1, String datoC2){
		super(fecha, idEmpresa, negocio, interfaz, secuencia, codError, detMensaje);
		// TODO Auto-generated constructor stub
		this.setAccion(accion);
		this.setAnyTime(anyTime);
		this.setCItem(cItem);
		this.setCodigoCanal(codigoCanal);
		this.setComienzo(comienzo);
		this.setContenidoSexual(contenidoSexual);
		this.setContenidoViolento(contenidoViolento);
		this.setCostoEvento(costoEvento);
		this.setCredito(credito);
		this.setDatoC1(datoC1);
		this.setDatoC2(datoC2);
		this.setDescEvento(descEvento);
		this.setDuracionEvento(duracionEvento);
		this.setEstadoC(estadoC);
		this.setFinal(_final);
		this.setFormaPago(formaPago);
		this.setIdAccount(idAccount);
		this.setIdConvertidor(idConvertidor);
		this.setIdEventos(idEventos);
		this.setIdPaquetes(idPaquetes);//20
		this.setIdServicio(idServicio);
		this.setInterstitial(interstitial);
		this.setLenguaje(lenguaje);
		this.setMpaa(mpaa);
		this.setPaquete(paquete);
		this.setPrecioEvento(precioEvento);
		this.setRating(rating);
		this.setSerie(serie);
		this.setTiempoCompra(tiempoCompra);
		this.setTiempoDisplay(tiempoDisplay);
		this.setTiempoLibre(tiempoLibre);
		this.setTipoA(tipoA);
		this.setTipoC(tipoC);
		this.setTipoD(tipoD);
		this.setTipoPromocion(tipoPromocion);
		this.setUbicacion(ubicacion);
	}

	public String getSerie() {
		return Serie;
	}

	public void setSerie(String serie) {
		Serie = serie;
	}

	public int getTipoD() {
		return TipoD;
	}

	public void setTipoD(int tipoD) {
		TipoD = tipoD;
	}

	public String getIdConvertidor() {
		return IdConvertidor;
	}

	public void setIdConvertidor(String idConvertidor) {
		IdConvertidor = idConvertidor;
	}

	public int getIdAccount() {
		return IdAccount;
	}

	public void setIdAccount(int idAccount) {
		IdAccount = idAccount;
	}

	public int getCItem() {
		return CItem;
	}

	public void setCItem(int item) {
		CItem = item;
	}

	public int getUbicacion() {
		return Ubicacion;
	}

	public void setUbicacion(int ubicacion) {
		Ubicacion = ubicacion;
	}

	public int getAccion() {
		return Accion;
	}

	public void setAccion(int accion) {
		Accion = accion;
	}

	public int getCredito() {
		return Credito;
	}

	public void setCredito(int credito) {
		Credito = credito;
	}

	public int getIdServicio() {
		return IdServicio;
	}

	public void setIdServicio(int idServicio) {
		IdServicio = idServicio;
	}

	public String getIdPaquetes() {
		return IdPaquetes;
	}

	public void setIdPaquetes(String idPaquetes) {
		IdPaquetes = idPaquetes;
	}

	public String getIdEventos() {
		return IdEventos;
	}

	public void setIdEventos(String idEventos) {
		IdEventos = idEventos;
	}

	public int getTipoA() {
		return TipoA;
	}

	public void setTipoA(int tipoA) {
		TipoA = tipoA;
	}

	public String getEstadoC() {
		return EstadoC;
	}

	public void setEstadoC(String estadoC) {
		EstadoC = estadoC;
	}

	public String getFormaPago() {
		return FormaPago;
	}

	public void setFormaPago(String formaPago) {
		FormaPago = formaPago;
	}

	public int getTipoC() {
		return TipoC;
	}

	public void setTipoC(int tipoC) {
		TipoC = tipoC;
	}

	public int getCodigoCanal() {
		return CodigoCanal;
	}

	public void setCodigoCanal(int codigoCanal) {
		CodigoCanal = codigoCanal;
	}

	public String getDescEvento() {
		return DescEvento;
	}

	public void setDescEvento(String descEvento) {
		DescEvento = descEvento;
	}

	public String getComienzo() {
		return Comienzo;
	}

	public void setComienzo(String comienzo) {
		Comienzo = comienzo;
	}

	public String getFinal() {
		return Final;
	}

	public void setFinal(String final1) {
		Final = final1;
	}

	public int getDuracionEvento() {
		return DuracionEvento;
	}

	public void setDuracionEvento(int duracionEvento) {
		DuracionEvento = duracionEvento;
	}

	public int getInterstitial() {
		return Interstitial;
	}

	public void setInterstitial(int interstitial) {
		Interstitial = interstitial;
	}

	public int getTiempoLibre() {
		return TiempoLibre;
	}

	public void setTiempoLibre(int tiempoLibre) {
		TiempoLibre = tiempoLibre;
	}

	public int getMpaa() {
		return Mpaa;
	}

	public void setMpaa(int mpaa) {
		Mpaa = mpaa;
	}

	public int getContenidoViolento() {
		return ContenidoViolento;
	}

	public void setContenidoViolento(int contenidoViolento) {
		ContenidoViolento = contenidoViolento;
	}

	public int getContenidoSexual() {
		return ContenidoSexual;
	}

	public void setContenidoSexual(int contenidoSexual) {
		ContenidoSexual = contenidoSexual;
	}

	public int getLenguaje() {
		return Lenguaje;
	}

	public void setLenguaje(int lenguaje) {
		Lenguaje = lenguaje;
	}

	public int getRating() {
		return Rating;
	}

	public void setRating(int rating) {
		Rating = rating;
	}

	public int getTiempoCompra() {
		return TiempoCompra;
	}

	public void setTiempoCompra(int tiempoCompra) {
		TiempoCompra = tiempoCompra;
	}

	public int getPaquete() {
		return Paquete;
	}

	public void setPaquete(int paquete) {
		Paquete = paquete;
	}

	public int getTiempoDisplay() {
		return TiempoDisplay;
	}

	public void setTiempoDisplay(int tiempoDisplay) {
		TiempoDisplay = tiempoDisplay;
	}

	public int getCostoEvento() {
		return CostoEvento;
	}

	public void setCostoEvento(int costoEvento) {
		CostoEvento = costoEvento;
	}

	public int getPrecioEvento() {
		return PrecioEvento;
	}

	public void setPrecioEvento(int precioEvento) {
		PrecioEvento = precioEvento;
	}

	public int getAnyTime() {
		return AnyTime;
	}

	public void setAnyTime(int anyTime) {
		AnyTime = anyTime;
	}

	public int getTipoPromocion() {
		return TipoPromocion;
	}

	public void setTipoPromocion(int tipoPromocion) {
		TipoPromocion = tipoPromocion;
	}

	public String getDatoC1() {
		return DatoC1;
	}

	public void setDatoC1(String datoC1) {
		DatoC1 = datoC1;
	}

	public String getDatoC2() {
		return DatoC2;
	}

	public void setDatoC2(String datoC2) {
		DatoC2 = datoC2;
	}

}
