package com.app.dao;

import java.util.Date;
import java.util.GregorianCalendar;

import com.app.intraway.consulta.ids.CableModem;
import com.app.intraway.consulta.ids.DialUp;
import com.app.intraway.consulta.ids.Email;
import com.app.intraway.consulta.ids.Linea;
import com.app.intraway.consulta.ids.Mta;

import ec.com.grupotvcable.wsdlintraway.Comando;
import ec.com.grupotvcable.wsdlintraway.Estandar;
import ec.com.grupotvcable.wsdlintraway.Interfaz;

public class IntrawayImpl {

	private Comando cmd = null;
	private ec.com.grupotvcable.wsdlintraway2.Comando cmd2 = null;
	private Intraway IntraWay= null;
	
	public IntrawayImpl(final Comando cmd) {
		this.cmd = cmd;
	}
	
	public IntrawayImpl(final ec.com.grupotvcable.wsdlintraway2.Comando cmd2) {
		this.cmd2 = cmd2;
	}

	public IntrawayImpl() {
		
	}

	public Intraway Guardar() {
		
		Estandar standar = cmd.getDetalle().getIntraway().getEstandar();
		Interfaz interfaz =  cmd.getDetalle().getIntraway().getInterfaz();
		
		Date fechaDi = null;
		if(standar.getFechaDiferida()==null)
			fechaDi = new Date();
		else fechaDi = standar.getFechaDiferida().toGregorianCalendar().getTime();
		
		IntraWay = new Intraway(GregorianCalendar.getInstance().getTime(), cmd.getCabecera().getIDEmpresa(),
				cmd.getCabecera().getNegocio(), cmd.getCabecera().getInterface(), cmd.getCabecera().getSecuencia(),"","",
				standar.getAuthKey(), ""+standar.getClienteCRM(), ""+standar.getIdProducto(), ""+standar.getIdProductoPadre(),
				standar.getIdServicioPadre(), standar.getIdVenta(), standar.getIdServicio(), standar.getIdVentaPadre(), standar.getIdPromotor(),
				fechaDi, standar.getIdEstado(), interfaz.getNombre(), interfaz.getUsername(),
				interfaz.getPassword(), interfaz.getIdTipoCliente(), interfaz.getEmailNoticias(), interfaz.getIdCicloFactCRM(),
				interfaz.getServicTypeCRMId(), interfaz.getMessageCRMID(), interfaz.getCantidad(), interfaz.getQuotamax(),
				interfaz.getServidorEmailCRMId(), interfaz.getDominio(), interfaz.getDiskQuota(), interfaz.getNoticias(),
				interfaz.getName(), interfaz.getServicePackageCRMId(), interfaz.getHub(), interfaz.getNodo(), interfaz.getIdISPCRM(),
				interfaz.getActivactionCode(), interfaz.getIspMtaCrmId(), interfaz.getBuscarTagCRM(), interfaz.getDocsis(),
				interfaz.getEnableAccounting(), interfaz.getProductName(), interfaz.getBandPackageCRMId(),
				interfaz.getPrepaidPolicyCRMId(), interfaz.getCantCPE(), interfaz.getUSChannelID(), interfaz.getStartingBalance(),
				interfaz.getDSFreq(), interfaz.getPeriodicalBaseBalance(), interfaz.isNoBoot(), interfaz.getMACAddress(),
				interfaz.getSnmpGroupCRMID(), interfaz.getHostName(), interfaz.getCmsCMDID(), interfaz.getProvisioning(),
				interfaz.getProfileCRMId(), interfaz.getSendtoController(), interfaz.getLinesQTy(), interfaz.getMtaModelCRMId(),
				interfaz.getEndpointNumber(), interfaz.getTn(), interfaz.getHomeExchangeCRMId(), interfaz.getFeatureCrmId(),
				interfaz.getActive(), interfaz.getDatoI1(), interfaz.getDatoI2(), interfaz.getCustomer1(), interfaz.getCustomer2(),
				interfaz.getCustomer3(), interfaz.getCustomer4());
		
		try{
		EntityManagerHelper.beginTransaction();
		}catch(Exception e){
			e.printStackTrace();
		}
		Intraway obj = new AllDAO().save(IntraWay);
		
		try{
			EntityManagerHelper.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return obj;
		
	}

	//logs para los mensajes enviados desde el crm
	public Intraway Guardar2() {
		
		ec.com.grupotvcable.wsdlintraway2.Estandar standar = cmd2.getDetalle().getIntraway().getEstandar();
		ec.com.grupotvcable.wsdlintraway2.Interfaz interfaz =  cmd2.getDetalle().getIntraway().getInterfaz();
		
		
		/*IntraWay = new Intraway(GregorianCalendar.getInstance().getTime(), Integer.parseInt(cmd2.getCabecera().getIDEmpresa()),
				Integer.parseInt(cmd2.getCabecera().getNegocio()), Integer.parseInt(cmd2.getCabecera().getInterface()), Integer.parseInt(cmd2.getCabecera().getSecuencia()),"","",
				standar.getAuthKey(), standar.getClienteCRM(), standar.getIdProducto(), standar.getIdProductoPadre(),
				Integer.parseInt(standar.getIdServicioPadre()), Integer.parseInt(standar.getIdVenta()), Integer.parseInt(standar.getIdServicio()), Integer.parseInt(standar.getIdVentaPadre()), 
				standar.getIdPromotor(),
				null, Integer.parseInt(standar.getIdEstado()), interfaz.getNombre(), interfaz.getUsername(),
				interfaz.getPassword(), interfaz.getIdTipoCliente(), interfaz.getEmailNoticias(), interfaz.getIdCicloFactCRM(),
				Integer.parseInt(interfaz.getServicTypeCRMId()), interfaz.getMessageCRMID(), Integer.parseInt(interfaz.getCantidad()), 
				Integer.parseInt(interfaz.getQuotamax()),
				interfaz.getServidorEmailCRMId(), interfaz.getDominio(), Integer.parseInt(interfaz.getDiskQuota()), Integer.parseInt(interfaz.getNoticias()),
				interfaz.getName(), interfaz.getServicePackageCRMId(), interfaz.getHub(), interfaz.getNodo(), interfaz.getIdISPCRM(),
				interfaz.getActivactionCode(), Integer.parseInt(interfaz.getIspMtaCrmId()), Integer.parseInt(interfaz.getBuscarTagCRM()), interfaz.getDocsis(),
				interfaz.getEnableAccounting(), interfaz.getProductName(), interfaz.getBandPackageCRMId(),
				interfaz.getPrepaidPolicyCRMId(), Integer.parseInt(interfaz.getCantCPE()), Integer.parseInt(interfaz.getUSChannelID()), 
				Integer.parseInt(interfaz.getStartingBalance()),
				Integer.parseInt(interfaz.getDSFreq()), Integer.parseInt(interfaz.getPeriodicalBaseBalance()), Boolean.valueOf(interfaz.getNoBoot()), interfaz.getMACAddress(),
				interfaz.getSnmpGroupCRMID(), interfaz.getHostName(), interfaz.getCmsCMDID(), Integer.parseInt(interfaz.getProvisioning()),
				interfaz.getProfileCRMId(), interfaz.getSendtoController(), Integer.parseInt(interfaz.getLinesQTy()), interfaz.getMtaModelCRMId(),
				Integer.parseInt(interfaz.getEndpointNumber()), interfaz.getTn(), interfaz.getHomeExchangeCRMId(), interfaz.getFeatureCrmId(),
				Integer.parseInt(interfaz.getActive()), interfaz.getDatoI1(), interfaz.getDatoI2(), interfaz.getCustomer1(), interfaz.getCustomer2(),
				interfaz.getCustomer3(), interfaz.getCustomer4());*/
		
		IntraWay = new Intraway(GregorianCalendar.getInstance().getTime(), Integer.parseInt(cmd2.getCabecera().getIDEmpresa()),
				2, 628, Integer.parseInt(cmd2.getCabecera().getSecuencia()),"","",
				"", standar.getClienteCRM(), standar.getIdProducto(), standar.getIdProductoPadre(),
				Integer.parseInt(standar.getIdServicioPadre()), Integer.parseInt(standar.getIdVenta()), Integer.parseInt(standar.getIdServicio()), Integer.parseInt(standar.getIdVentaPadre()), 
				standar.getIdPromotor(), null, Integer.parseInt(standar.getIdEstado()), "",
				"", "", "", "",
				"", 0, "", 0,
				0, "", "", 0,
				0, "", "", "", "",
				"", "", 0, 0, 
				"", "", "", "",
				"",	0, 0, 0, 0, 0,
				false, "", "", "", "",
				0, "", "TRUE", 0, "",
				0, "", "", "", 0,
				interfaz.getDatoI1(), interfaz.getDatoI2(), interfaz.getCustomer1(), interfaz.getCustomer2(),
				interfaz.getCustomer3(), interfaz.getCustomer4());

		try{
			EntityManagerHelper.beginTransaction();
		}catch(Exception e){
			e.printStackTrace();
		}
		Intraway obj = new AllDAO().save(IntraWay);
		
		try{
			EntityManagerHelper.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return obj;
		
	}

	
	
	public Intraway Guardar(CableModem cm) {
		
		IntraWay = new Intraway(GregorianCalendar.getInstance().getTime(), Integer.parseInt(cm.getIdEmpresaCRM()),
				2, 620, 100,"","",
				"", cm.getIdClienteCRM(), cm.getIdProducto(), cm.getIdProductoPadre(),
				0, 0, 0, 0, "",
				null, 0, "",
				"", "", "", "",
				"", 0, "", 0,
				0, "", "", 0,
				0, "", cm.getServicePackege(), "", "",
				"", "", 0, 0, 
				"", "", "", "",
				"",	0, 0, 0, 0, 0,
				false, cm.getMacaddress(), "", "", "",
				0, "", "TRUE", 0, "",
				0, "", "", "", 0,
				"", cm.getUserEliminacion(), "", "", cm.getRemoteHost(), cm.getRemoteIp());
		
		try{
		EntityManagerHelper.beginTransaction();
		}catch(Exception e){
			e.printStackTrace();
		}
		Intraway obj = new AllDAO().save(IntraWay);
		
		try{
			EntityManagerHelper.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return obj;
		
	}
	
	public Intraway Guardar(Mta mta) {
		
		IntraWay = new Intraway(GregorianCalendar.getInstance().getTime(), Integer.parseInt(mta.getIdEmpresaCRM()),
				2, 820, 100,"","",
				"", mta.getIdClienteCRM(), mta.getIdProducto(), mta.getIdProductoPadre(),
				0, 0, 0, 0, "",
				null, 0, "",
				"", "", "", "",
				"", 0, "", 0,
				0, "", "", 0,
				0, "", "", "", "",
				"", "", 0, 0, 
				"", "", "", "",
				"",	0, 0, 0, 0, 0,
				false, mta.getMacaddress(), "", "", "",
				0, "", "TRUE", 0, mta.getMtaModel(),
				0, mta.getTodasLineas(), "", "", 0,
				"", mta.getUserEliminacion(), "", "", mta.getRemoteHost(), mta.getRemoteIp());
		
		try{
		EntityManagerHelper.beginTransaction();
		}catch(Exception e){
			e.printStackTrace();
		}
		Intraway obj = new AllDAO().save(IntraWay);
		
		try{
			EntityManagerHelper.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return obj;
		
	}
	
	public Intraway Guardar(Linea linea, int accion) {
		
		IntraWay = new Intraway(GregorianCalendar.getInstance().getTime(), Integer.parseInt(linea.getIdEmpresaCRM()),
				2, 824, 100,"","",
				"", linea.getIdClienteCRM(), linea.getIdProducto(), linea.getIdProductoPadre(),
				0, 0, 0, 0, "",
				null, accion, "",
				"", "", "", "",
				"", 0, "", 0,
				0, "", "", 0,
				0, "", "", "", "",
				"", "", 0, 0, 
				"", "", "", "",
				"",	0, 0, 0, 0, 0,
				false, "", "", "", "",
				0, linea.getEpProfile(), "TRUE", 0, "",
				Integer.parseInt(linea.getEndPointNumber()), linea.getTN(), linea.getEpHomeExchange(), "", 0,
				"", linea.getUserEliminacion(), "", "", linea.getRemoteHost(), linea.getRemoteIp());
		/*
		Date fecha, int idEmpresa, int negocio, int interfaz, int secuencia, String codError, String detMensaje,
		String authKey, String clienteCRM, String idProducto, String idProductoPadre, int idServicioPadre, int idVenta, int idServicio,
		int idVentaPadre, String idPromotor, Date fechaDiferida, int idEstado, String nombre,
		String username, String password, String idTipoCliente, String emailNoticias,
		String idCicloFactCRM, int servicTypeCRMId, String messageCRMID, int cantidad,
		int quotamax, String servidorEmailCRMId, String dominio, int diskQuota,
		int noticias, String name, String servicePackageCRMId, String hub, String nodo,
		String idISPCRM, String activactionCode, int ispMtaCrmId, int buscarTagCRM, 
		String docsis, String enableAccounting, String productName, String bandPackageCRMId,
		String prepaidPolicyCRMId,
		int cantCPE, int uSChannelID, int startingBalance, int dSFreq, int periodicalBaseBalance,
		boolean noBoot, String mACAddress, String snmpGroupCRMID, String hostName, String cmsCMDID,
		int provisioning, String profileCRMId, String sendtoController, int linesQTy, String mtaModelCRMId
		*/
		
		try{
		EntityManagerHelper.beginTransaction();
		}catch(Exception e){
			e.printStackTrace();
		}
		Intraway obj = new AllDAO().save(IntraWay);
		
		try{
			EntityManagerHelper.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return obj;
		
	}
	
	
	
	public Intraway Guardar(Email email) {
		
		IntraWay = new Intraway(GregorianCalendar.getInstance().getTime(), Integer.parseInt(email.getIdEmpresaCRM()),
				2, 600, 100,"","",
				"", email.getIdClienteCRM(), email.getIdProducto(), email.getIdProductoPadre(),
				0, 0, 0, 0, "",
				null, 0, "",
				email.getUserName(), email.getPassword(), "", "",
				"", 0, "", 0,
				0, email.getServidorEmailCrmId(), email.getDominio(), Integer.parseInt(email.getDiskQuota()),
				0, email.getName(), "", "", "",
				"", "", 0, 0, 
				"", "", "", "",
				"",	0, 0, 0, 0, 0,
				false, "", "", "", "",
				0, "", "", 0, "",
				0, "", "", "", 0,
				"", email.getUserEliminacion(), "", "", email.getRemoteHost(), email.getRemoteIp());
		
		try{
		EntityManagerHelper.beginTransaction();
		}catch(Exception e){
			e.printStackTrace();
		}
		Intraway obj = new AllDAO().save(IntraWay);
		
		try{
			EntityManagerHelper.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return obj;
	}
	
	
	public Intraway Guardar(DialUp dialUp) {
		
		IntraWay = new Intraway(GregorianCalendar.getInstance().getTime(), Integer.parseInt(dialUp.getIdEmpresaCRM()),
				2, 600, 100,"","",
				"", dialUp.getIdClienteCRM(), dialUp.getIdProducto(), dialUp.getIdProductoPadre(),
				0, 0, 0, 0, "",
				null, 0, "",
				dialUp.getUserName(), dialUp.getPassword(), "", "",
				"", 0, "", 0,
				0, "", "", 0,
				0, "", "", "", "",
				"", "", 0, 0, 
				"", "", "", "",
				"",	0, 0, 0, 0, 0,
				false, "", "", "", "",
				0, "", "", 0, "",
				0, "", "", "", 0,
				"", dialUp.getUserEliminacion(), "", "", dialUp.getRemoteHost(), dialUp.getRemoteIp());
		
		try{
		EntityManagerHelper.beginTransaction();
		}catch(Exception e){
			e.printStackTrace();
		}
		Intraway obj = new AllDAO().save(IntraWay);
		
		try{
			EntityManagerHelper.commit();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return obj;
	}

	
}
