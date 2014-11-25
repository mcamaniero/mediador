package com.app.dao;

import java.util.GregorianCalendar;
import java.util.List;

import ec.com.grupotvcable.wsdlauris.Comando;
import ec.com.grupotvcable.wsdlauris.Pines;
import ec.com.grupotvcable.wsdlauris.Telefono;

public class AurisImpl{

	private Comando cmd = null;
	private Auris auris = null;
	
	public AurisImpl(final Comando cmd) {
		this.cmd = cmd;
	}

	public Auris Guardar() {
		
		StringBuilder fono = new StringBuilder();
		if ( cmd.getDetalle().getAuris().getListaFono()!= null ){
			List<Telefono> Lfono = cmd.getDetalle().getAuris().getListaFono().getTelefono();
			for(Telefono e : Lfono)
				fono.append(e.getTelefono()+",");
		}
		
		StringBuilder pin = new StringBuilder();
		if ( cmd.getDetalle().getAuris().getListaPin()!= null ){
			List<Pines> LPin = cmd.getDetalle().getAuris().getListaPin().getPines();
			for(Pines e : LPin)
				pin.append(e.getPines()+",");
		}
		
		auris = new Auris(GregorianCalendar.getInstance().getTime(), cmd.getCabecera().getIDEmpresa(),
						cmd.getCabecera().getNegocio(), cmd.getCabecera().getInterface(), cmd.getCabecera().getSecuencia(), "","",
						cmd.getDetalle().getAuris().getPin(), cmd.getDetalle().getAuris().getProductoPlaneta(),
						cmd.getDetalle().getAuris().getMonto(), cmd.getDetalle().getAuris().getFono(),
						fono.toString(), cmd.getDetalle().getAuris().getCodEstado(),
						cmd.getDetalle().getAuris().getCodAcceso(), cmd.getDetalle().getAuris().getReferencia(),
						pin.toString(),cmd.getDetalle().getAuris().getDatoA1(),
						cmd.getDetalle().getAuris().getDatoA2(),cmd.getDetalle().getAuris().getDatoA3(),
						cmd.getDetalle().getAuris().getDatoA4(),"","");
		
		try{
			EntityManagerHelper.beginTransaction();
		}catch(Exception e){
			e.printStackTrace();
		}
		Auris aur = new AllDAO().save(auris);
		try{
			EntityManagerHelper.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return aur;
	}
		
}
