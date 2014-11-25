package com.app.dao;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(catalog = "aprovgrupotv", uniqueConstraints = {}, name = "log_Auris")
public class Auris extends CabeceraDao implements Serializable{

	private static final long serialVersionUID = 3509765100415666816L;
	
	private int Pin;
	private int ProductoPlaneta;
	private int Monto;
	private int Fono;
	private String ListaFono;
	private int CodEstado;
	private int CodAcceso;
	private String Referencia;
	private String ListaPin;
	private String DatoA1;
	private String DatoA2;
	private String DatoA3;
	private String DatoA4;
	private String Resp_Pin;
	private String Resp_Did;
	
	
	
	public Auris(){
		super();
	}
	
	
	public Auris(Date fecha, int idEmpresa, int negocio, int interfaz, int secuencia, String codError, String detMensaje,
					int pin, int productoPlaneta, int monto, int fono, String listaFono,
					int codEstado, int codAcceso, String referencia, String listaPin, String datoA1, String datoA2,
					String datoA3, String datoA4, String resp_Pin, String resp_Did){
		super(fecha, idEmpresa, negocio, interfaz, secuencia, codError, detMensaje);
		
		this.setCodAcceso(codAcceso);
		this.setCodEstado(codEstado);
		this.setFono(fono);
		this.setListaFono(listaFono);
		this.setListaPin(listaPin);
		this.setMonto(monto);
		this.setPin(pin);
		this.setProductoPlaneta(productoPlaneta);
		this.setReferencia(referencia);
		this.setDatoA1(datoA1);
		this.setDatoA2(datoA2);
		this.setDatoA3(datoA3);
		this.setDatoA4(datoA4);
		this.setResp_Pin(resp_Pin);
		this.setResp_Did(resp_Did);
	}
	
	
	public void setResp_Did(String resp_Did) {
		this.Resp_Did = resp_Did;
	}
	public void setResp_Pin(String resp_Pin) {
		this.Resp_Pin = resp_Pin;
	}

	public String getResp_Did() {
		return Resp_Did;
	}
	public String getResp_Pin() {
		return Resp_Pin;
	}
	
	public double getPin() {
		return Pin;
	}
	public void setPin(int pin) {
		Pin = pin;
	}
	public int getProductoPlaneta() {
		return ProductoPlaneta;
	}
	public void setProductoPlaneta(int productoPlaneta) {
		ProductoPlaneta = productoPlaneta;
	}
	public int getMonto() {
		return Monto;
	}
	public void setMonto(int monto) {
		Monto = monto;
	}
	public int getFono() {
		return Fono;
	}
	public void setFono(int fono) {
		Fono = fono;
	}
	public String getListaFono() {
		return ListaFono;
	}
	public void setListaFono(String listaFono) {
		ListaFono = listaFono;
	}
	public int getCodEstado() {
		return CodEstado;
	}
	public void setCodEstado(int codEstado) {
		CodEstado = codEstado;
	}
	public double getCodAcceso() {
		return CodAcceso;
	}
	public void setCodAcceso(int codAcceso) {
		CodAcceso = codAcceso;
	}
	public String getReferencia() {
		return Referencia;
	}
	public void setReferencia(String referencia) {
		Referencia = referencia;
	}
	public String getListaPin() {
		return ListaPin;
	}
	public void setListaPin(String listaPin) {
		ListaPin = listaPin;
	}
	public String getDatoA1() {
		return DatoA1;
	}
	public void setDatoA1(String datoA1) {
		DatoA1 = datoA1;
	}
	public String getDatoA2() {
		return DatoA2;
	}
	public void setDatoA2(String datoA2) {
		DatoA2 = datoA2;
	}
	
	public String getDatoA3() {
		return DatoA3;
	}
	public void setDatoA3(String datoA3) {
		DatoA3 = datoA3;
	}
	
	public String getDatoA4() {
		return DatoA4;
	}
	public void setDatoA4(String datoA4) {
		DatoA4 = datoA4;
	}
	
	
}
