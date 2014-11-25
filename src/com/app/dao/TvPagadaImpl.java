package com.app.dao;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.List;

import ec.com.grupotvcable.wsdltvpagada.*;

public class TvPagadaImpl {

	private Comando cmd = null;
	private TvPagada tv = null;
	
	private static SimpleDateFormat FormatoH = new SimpleDateFormat("HH:mm:ss");

	private static SimpleDateFormat FormatoF = new SimpleDateFormat("dd/MM/yyyy");

	
	public TvPagadaImpl(Comando cmd) {
		// TODO Auto-generated constructor stub
		this.cmd = cmd;
	}

	public TvPagada Guardar() {
		// TODO Auto-generated method stub
	
		String fechaIni = "";
		String fechaFin = "";
		String tiempoIni = "";
		String tiempoFin = "";
		
		if ( cmd.getDetalle().getTVpagada().getComienzo().getFechaIni() != null )
			fechaIni = FormatoF.format(cmd.getDetalle().getTVpagada().getComienzo().getFechaIni().toGregorianCalendar().getTime());
		
		if ( cmd.getDetalle().getTVpagada().getFinal().getFechaFin() != null )
			fechaFin = FormatoF.format(cmd.getDetalle().getTVpagada().getFinal().getFechaFin().toGregorianCalendar().getTime());
		
		if ( cmd.getDetalle().getTVpagada().getComienzo().getTiempoIni() != null )
			tiempoIni = FormatoH.format(cmd.getDetalle().getTVpagada().getComienzo().getTiempoIni().toGregorianCalendar().getTime());
		
		if ( cmd.getDetalle().getTVpagada().getFinal().getTiempoFin() != null )
			tiempoFin = FormatoH.format(cmd.getDetalle().getTVpagada().getFinal().getTiempoFin().toGregorianCalendar().getTime());
		
		StringBuilder paq = new StringBuilder();
		if ( cmd.getDetalle().getTVpagada().getIdPaquetes()!= null ){
			List<IdPaquete> lstPaq = cmd.getDetalle().getTVpagada().getIdPaquetes().getIdPaquete();
			for(IdPaquete p : lstPaq)
				paq.append(p.getIdPaquete()+",");
		}

		StringBuilder eve = new StringBuilder();
		if ( cmd.getDetalle().getTVpagada().getIdEventos()!= null ){
			List<IdEvento> lstEve = cmd.getDetalle().getTVpagada().getIdEventos().getIdEvento();
			for(IdEvento e : lstEve)
				eve.append(e.getIdEvento()+",");
		}
		
		
		tv = new TvPagada(GregorianCalendar.getInstance().getTime(), cmd.getCabecera().getIDEmpresa(),
				cmd.getCabecera().getNegocio(), cmd.getCabecera().getInterface(),  cmd.getCabecera().getSecuencia(), "","",
				cmd.getDetalle().getTVpagada().getSerie(), cmd.getDetalle().getTVpagada().getTipoD(),
				cmd.getDetalle().getTVpagada().getIdConvertidor() == null ? "" :  cmd.getDetalle().getTVpagada().getIdConvertidor(),
				cmd.getDetalle().getTVpagada().getIdAccount(), 
				cmd.getDetalle().getTVpagada().getCItem(),
				cmd.getDetalle().getTVpagada().getUbicacion(), cmd.getDetalle().getTVpagada().getAccion(),
				cmd.getDetalle().getTVpagada().getCredito(), cmd.getDetalle().getTVpagada().getIdServicio(),
				paq.toString(), 
				eve.toString(),
				cmd.getDetalle().getTVpagada().getTipoA(), cmd.getDetalle().getTVpagada().getEstadoC(),
				cmd.getDetalle().getTVpagada().getFormaPago(), cmd.getDetalle().getTVpagada().getTipoC(),
				cmd.getDetalle().getTVpagada().getCodigoCanal(), cmd.getDetalle().getTVpagada().getDescEvento(),
				fechaIni+" - "+tiempoIni,
				fechaFin+" - "+tiempoFin,
				cmd.getDetalle().getTVpagada().getDuracionEvento(), cmd.getDetalle().getTVpagada().getInterstitial(),
				cmd.getDetalle().getTVpagada().getTiempoLibre(), cmd.getDetalle().getTVpagada().getMpaa(),
				cmd.getDetalle().getTVpagada().getContenidoViolento(), cmd.getDetalle().getTVpagada().getContenidoViolento(),
				cmd.getDetalle().getTVpagada().getLenguaje(), cmd.getDetalle().getTVpagada().getRating(),
				cmd.getDetalle().getTVpagada().getTiempoCompra(), cmd.getDetalle().getTVpagada().getPaquete(),
				cmd.getDetalle().getTVpagada().getTiempoDisplay(), cmd.getDetalle().getTVpagada().getCostoEvento(), 
				cmd.getDetalle().getTVpagada().getPrecioEvento(), cmd.getDetalle().getTVpagada().getAnyTime(), 
				cmd.getDetalle().getTVpagada().getTipoPromocion(), cmd.getDetalle().getTVpagada().getDatoC1(),
				cmd.getDetalle().getTVpagada().getDatoC2());
		
			
		try{
			EntityManagerHelper.beginTransaction();
		}catch(Exception e){
			e.printStackTrace();
		}
		TvPagada obj = new AllDAO().save(tv);
		try{
			EntityManagerHelper.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return obj;
	}

}
