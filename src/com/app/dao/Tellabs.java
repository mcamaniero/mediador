package com.app.dao;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
@Table(name = "Log_Tellabs", catalog = "aprovgrupotv", uniqueConstraints = {})
public class Tellabs extends CabeceraDao implements Serializable {

	private static final long serialVersionUID = 5197813037475323723L;

	private String CodEnlace;
	private int TipEnlace;
	private String CodCircuito;
	private String DatoT1;
	private String DatoT2;
	private String DatoT3;
	private String DatoT4;
	
	
	public Tellabs() {
		// TODO Auto-generated constructor stub
	}

	public Tellabs(Date fecha, int idEmpresa, int negocio, int interfaz, int secuencia, String codError, String detMensaje,
				String codEnlace, int tipEnlace, String codCircuito, String datoT1,
				String datoT2, String datoT3, String datoT4) {
		super(fecha, idEmpresa, negocio, interfaz, secuencia, codError, detMensaje);
		// TODO Auto-generated constructor stub
		
		this.setCodCircuito(codCircuito);
		this.setCodEnlace(codEnlace);
		this.setDatoT1(datoT1);
		this.setDatoT2(datoT2);
		this.setDatoT3(datoT3);
		this.setDatoT4(datoT4);
		this.setTipEnlace(tipEnlace);
	}

	public String getCodEnlace() {
		return CodEnlace;
	}

	public void setCodEnlace(String codEnlace) {
		CodEnlace = codEnlace;
	}

	public int getTipEnlace() {
		return TipEnlace;
	}

	public void setTipEnlace(int tipEnlace) {
		TipEnlace = tipEnlace;
	}

	public String getCodCircuito() {
		return CodCircuito;
	}

	public void setCodCircuito(String codCircuito) {
		CodCircuito = codCircuito;
	}

	public String getDatoT1() {
		return DatoT1;
	}

	public void setDatoT1(String datoT1) {
		DatoT1 = datoT1;
	}

	public String getDatoT2() {
		return DatoT2;
	}

	public void setDatoT2(String datoT2) {
		DatoT2 = datoT2;
	}

	public String getDatoT3() {
		return DatoT3;
	}

	public void setDatoT3(String datoT3) {
		DatoT3 = datoT3;
	}

	public String getDatoT4() {
		return DatoT4;
	}

	public void setDatoT4(String datoT4) {
		DatoT4 = datoT4;
	}

}
