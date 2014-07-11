package com.app.dao;

import java.util.GregorianCalendar;

import ec.com.grupotvcable.wsdlsafari.Comando;

public class SafariImpl {

	private Comando cmd = null;;
	private Safari saf = null;
	public SafariImpl(Comando cmd) {
		// TODO Auto-generated constructor stub
		this.cmd = cmd;
	}

	public Safari Guardar() {
		// TODO Auto-generated method stub

		saf = new Safari(GregorianCalendar.getInstance().getTime(), cmd.getCabecera().getIDEmpresa(),
				cmd.getCabecera().getNegocio(), cmd.getCabecera().getInterface(), cmd.getCabecera().getSecuencia(), "","",
				cmd.getDetalle().getSafari().getEstado(), cmd.getDetalle().getSafari().getTelefono(),
				cmd.getDetalle().getSafari().getIdTroncal(), cmd.getDetalle().getSafari().getPlan(),
				cmd.getDetalle().getSafari().getNumPiloto(), cmd.getDetalle().getSafari().getDatoS1(),
				cmd.getDetalle().getSafari().getDatoS2(), cmd.getDetalle().getSafari().getDatoS3(),
				cmd.getDetalle().getSafari().getDatoS4(), cmd.getDetalle().getSafari().getIp(),
				cmd.getDetalle().getSafari().getEndpointProfile(), ""+cmd.getDetalle().getSafari().getCitem(),
				""+cmd.getDetalle().getSafari().getUser(), ""+cmd.getDetalle().getSafari().getPassword(),
				""+cmd.getDetalle().getSafari().getLenguaje(), cmd.getDetalle().getSafari().getBarredLevelType(),
				""+cmd.getDetalle().getSafari().getTarriffPlan(),cmd.getDetalle().getSafari().getBarredPin(),
				cmd.getDetalle().getSafari().getFeature(), cmd.getDetalle().getSafari().getAccion());
		
		try{
			EntityManagerHelper.beginTransaction();
		}catch(Exception e){
			e.printStackTrace();
		}
		new AllDAO().save(saf);
		try{
			EntityManagerHelper.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
		return saf;
		
	}

}
