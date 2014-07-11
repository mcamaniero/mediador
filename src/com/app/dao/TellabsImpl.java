package com.app.dao;

import java.util.GregorianCalendar;

import ec.com.grupotvcable.wsdltellabs.Comando;

public class TellabsImpl implements IOperaciones {

	private Comando cmd = null;
	private Tellabs tel = null;
	
	public TellabsImpl(Comando cmd) {
		// TODO Auto-generated constructor stub
		this.cmd = cmd;
	}

	public void Guardar() {
		// TODO Auto-generated method stub
		tel = new Tellabs(GregorianCalendar.getInstance().getTime(), cmd.getCabecera().getIDEmpresa(),
				cmd.getCabecera().getInterface(), cmd.getCabecera().getNegocio(), cmd.getCabecera().getSecuencia(), "","",
				cmd.getDetalle().getTellabs().getCodEnlace(), cmd.getDetalle().getTellabs().getTipEnlace(),
				cmd.getDetalle().getTellabs().getCodCircuito(), cmd.getDetalle().getTellabs().getDatoT1(),
				cmd.getDetalle().getTellabs().getDatoT2(), cmd.getDetalle().getTellabs().getDatoT3(),
				cmd.getDetalle().getTellabs().getDatoT4());
		
		EntityManagerHelper.beginTransaction();
		new AllDAO().save(tel);
		EntityManagerHelper.commit();
		
	}
	
	

}
