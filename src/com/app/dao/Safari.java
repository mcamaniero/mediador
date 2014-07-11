package com.app.dao;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "log_Safari", catalog = "aprovgrupotv", uniqueConstraints = {})
public class Safari extends CabeceraDao implements Serializable{

	private static final long serialVersionUID = 663608066033789575L;

	private String Estado;
	private double Telefono;
	private int IdTroncal;
	private int Plan;
	private double NumPiloto;
	
	private String Ip;
	private String EndpointProfile;
	private String Citem;
	private String User;
	private String Password;
	private String Lenguaje;
	private String BarredLevelType;
	private String TarriffPlan;
	private String BarredPin;
	private String Feature;
	private String Accion;
	
	private String DatosS1;
	private String DatosS2;
	private String DatosS3;
	private String DatosS4;
	
	public Safari() {
		// TODO Auto-generated constructor stub
	}

	public Safari(Date fecha, int idEmpresa, int negocio, int interfaz, int secuencia, String codError, String detMensaje,
			String estado, double telefono, int idTroncal, int plan, double numPiloto,
			String datosS1, String datosS2, String datosS3, String datosS4, String ip, 
			String endpointProfile, String citem, String user, String password, String lenguaje,
			String barredLevelType, String tarriffPlan, String barredPin, String feature, String accion) {
		super(fecha, idEmpresa, negocio, interfaz, secuencia, codError, detMensaje);
		// TODO Auto-generated constructor stub
		this.setDatosS1(datosS1);
		this.setDatosS2(datosS2);
		this.setDatosS3(datosS3);
		this.setDatosS4(datosS4);
		this.setEstado(estado);
		this.setIdTroncal(idTroncal);
		this.setNumPiloto(numPiloto);
		this.setPlan(plan);
		this.setTelefono(telefono);
		
		this.setIp(ip);
		this.setEndpointProfile(endpointProfile);
		this.setCitem(citem);
		this.setUser(user);
		this.setPassword(password);
		this.setLenguaje(lenguaje);
		this.setBarredLevelType(barredLevelType);
		this.setTarriffPlan(tarriffPlan);
		this.setBarredPin(barredPin);
		this.setFeature(feature);
		this.setAccion(accion);
		
	}
	
	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public double getTelefono() {
		return Telefono;
	}

	public void setTelefono(double telefono) {
		Telefono = telefono;
	}

	public int getIdTroncal() {
		return IdTroncal;
	}

	public void setIdTroncal(int idTroncal) {
		IdTroncal = idTroncal;
	}

	public int getPlan() {
		return Plan;
	}

	public void setPlan(int plan) {
		Plan = plan;
	}

	public double getNumPiloto() {
		return NumPiloto;
	}

	public void setNumPiloto(double numPiloto) {
		NumPiloto = numPiloto;
	}

	public String getDatosS1() {
		return DatosS1;
	}

	public void setDatosS1(String datosS1) {
		DatosS1 = datosS1;
	}

	public String getDatosS2() {
		return DatosS2;
	}

	public void setDatosS2(String datosS2) {
		DatosS2 = datosS2;
	}

	public String getDatosS3() {
		return DatosS3;
	}

	public void setDatosS3(String datosS3) {
		DatosS3 = datosS3;
	}

	public String getDatosS4() {
		return DatosS4;
	}

	public void setDatosS4(String datosS4) {
		DatosS4 = datosS4;
	}

	public String getIp() {
		return Ip;
	}

	public void setIp(String ip) {
		Ip = ip;
	}

	public String getEndpointProfile() {
		return EndpointProfile;
	}

	public void setEndpointProfile(String endpointProfile) {
		EndpointProfile = endpointProfile;
	}

	public String getCitem() {
		return Citem;
	}

	public void setCitem(String citem) {
		Citem = citem;
	}

	public String getUser() {
		return User;
	}

	public void setUser(String user) {
		User = user;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getLenguaje() {
		return Lenguaje;
	}

	public void setLenguaje(String lenguaje) {
		Lenguaje = lenguaje;
	}

	public String getBarredLevelType() {
		return BarredLevelType;
	}

	public void setBarredLevelType(String barredLevelType) {
		BarredLevelType = barredLevelType;
	}

	public String getTarriffPlan() {
		return TarriffPlan;
	}

	public void setTarriffPlan(String tarriffPlan) {
		TarriffPlan = tarriffPlan;
	}

	public String getBarredPin() {
		return BarredPin;
	}

	public void setBarredPin(String barredPin) {
		BarredPin = barredPin;
	}

	public String getFeature() {
		return Feature;
	}

	public void setFeature(String feature) {
		Feature = feature;
	}

	public String getAccion() {
		return Accion;
	}

	public void setAccion(String accion) {
		Accion = accion;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	

}
