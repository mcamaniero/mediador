package main.webservice;

//import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;

import ec.com.grupotvcable.wsdlintraway.Cabecera;
import ec.com.grupotvcable.wsdlintraway.Comando;
import ec.com.grupotvcable.wsdlintraway.Detalle;
import ec.com.grupotvcable.wsdlintraway.Estandar;
import ec.com.grupotvcable.wsdlintraway.Interfaz;
import ec.com.grupotvcable.wsdlintraway.Intraway;
import ec.com.grupotvcable.wsdlintraway.WsdlIntrawayImpl;

public class MainIntraway {

	public MainIntraway() {
		// TODO Auto-generated constructor stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		spRequest600();
		

	}

	
	private static void spRequest500() {
		Comando comando = new Comando();

		Cabecera cab = new Cabecera();
		cab.setIDEmpresa(63);
		cab.setInterface(500);
		cab.setNegocio(2);
		cab.setSecuencia(0);
		comando.setCabecera(cab);

		Detalle det = new Detalle();
		Intraway intra = new Intraway();

		Estandar stan = new Estandar();
		stan.setAuthKey("6167483");
		stan.setClienteCRM(30244295);
		////stan.setFechaDiferida(new XMLGregorianCalendarImpl());
		stan.setIdEstado(1);
		stan.setIdProducto(0);
		stan.setIdProductoPadre(0);
		stan.setIdPromotor("0");
		stan.setIdServicioPadre(0);
		stan.setIdVenta(0);
		stan.setIdVentaPadre(0);
		stan.setIdServicio(0);

		Interfaz inter = new Interfaz();
		inter.setActivactionCode("");
		inter.setActive(0);
		inter.setBandPackageCRMId("0");
		inter.setBuscarTagCRM(0);// tipo de dato
		inter.setCantCPE(0);
		inter.setCantidad(0);
		inter.setCmsCMDID("");
		inter.setCustomer1("");
		inter.setCustomer2("");
		inter.setCustomer3("");
		inter.setCustomer4("BSCATEST");
		inter.setDatoI1("2818");
		inter.setDatoI2("William Morales");
		inter.setDiskQuota(0);
		inter.setDocsis("0");
		inter.setDominio("");
		inter.setDSFreq(0);
		inter.setEmailNoticias("");
		inter.setEnableAccounting("");
		inter.setEndpointNumber(0);
		inter.setFeatureCrmId("");
		inter.setHomeExchangeCRMId("");
		inter.setHostName("");
		inter.setHub("");
		inter.setIdCicloFactCRM("");
		inter.setIdISPCRM("");
		inter.setIdTipoCliente("1");
		inter.setIspMtaCrmId(0);// pendiente tipo de dato
		inter.setLinesQTy(0);
		inter.setMACAddress("");
		inter.setMessageCRMID("");
		inter.setMtaModelCRMId("");
		inter.setName("");
		inter.setNoBoot(false);
		inter.setNodo("");
		inter.setNombre("@Eddie Veder");
		inter.setNoticias(0);
		inter.setPassword("");
		inter.setPeriodicalBaseBalance(0);
		inter.setPrepaidPolicyCRMId("");
		inter.setProductName("");
		inter.setProfileCRMId("");
		inter.setProvisioning(0);
		inter.setQuotamax(0);
		inter.setSendtoController("");
		inter.setServicePackageCRMId("");
		inter.setServicTypeCRMId(0);
		inter.setServidorEmailCRMId("");
		inter.setSnmpGroupCRMID("");
		inter.setStartingBalance(0);
		inter.setTn("");
		inter.setUSChannelID(0);
		inter.setUsername("30244295");

		intra.setEstandar(stan);
		intra.setInterfaz(inter);

		det.setIntraway(intra);

		comando.setDetalle(det);

		new WsdlIntrawayImpl().aprovIntraway(comando);
	}
	
	
	private void spRequest620() {
		Comando comando = new Comando();

		Cabecera cab = new Cabecera();
		cab.setIDEmpresa(63);
		cab.setInterface(620);
		cab.setNegocio(2);
		cab.setSecuencia(0);
		comando.setCabecera(cab);

		Detalle det = new Detalle();
		Intraway intra = new Intraway();

		Estandar stan = new Estandar();
		stan.setAuthKey("");
		stan.setClienteCRM(174);
		//stan.setFechaDiferida(new XMLGregorianCalendarImpl());
		stan.setIdEstado(1);
		stan.setIdProducto(105);
		stan.setIdProductoPadre(0);
		stan.setIdPromotor("0");
		stan.setIdServicioPadre(1);
		stan.setIdVenta(0);
		stan.setIdVentaPadre(0);
		stan.setIdServicio(20);

		Interfaz inter = new Interfaz();
		inter.setActivactionCode("");
		inter.setActive(0);
		inter.setBandPackageCRMId("0");
		inter.setBuscarTagCRM(0);// tipo de dato
		inter.setCantCPE(1);
		inter.setCantidad(0);
		inter.setCmsCMDID("");
		inter.setCustomer1("");
		inter.setCustomer2("");
		inter.setCustomer3("");
		inter.setCustomer4("");
		inter.setDatoI1("");
		inter.setDatoI2("");
		inter.setDiskQuota(0);
		inter.setDocsis("0");
		inter.setDominio("");
		inter.setDSFreq(0);
		inter.setEmailNoticias("");
		inter.setEnableAccounting("1");
		inter.setEndpointNumber(0);
		inter.setFeatureCrmId("");
		inter.setHomeExchangeCRMId("");
		inter.setHostName("");
		inter.setHub("");
		inter.setIdCicloFactCRM("");
		inter.setIdISPCRM("principal");
		inter.setIdTipoCliente("");
		inter.setIspMtaCrmId(0);// pendiente tipo de dato
		inter.setLinesQTy(0);
		inter.setMACAddress("");
		inter.setMessageCRMID("");
		inter.setMtaModelCRMId("");
		inter.setName("");
		inter.setNoBoot(false);
		inter.setNodo("");
		inter.setNombre("");
		inter.setNoticias(0);
		inter.setPassword("");
		inter.setPeriodicalBaseBalance(0);
		inter.setPrepaidPolicyCRMId("1.1");
		inter.setProductName("105-Cable Modem (eMTA)");
		inter.setProfileCRMId("");
		inter.setProvisioning(0);
		inter.setQuotamax(0);
		inter.setSendtoController("");
		inter.setServicePackageCRMId("cm800uiot");
		inter.setServicTypeCRMId(0);
		inter.setServidorEmailCRMId("");
		inter.setSnmpGroupCRMID("");
		inter.setStartingBalance(0);
		inter.setTn("");
		inter.setUSChannelID(0);
		inter.setUsername("");

		intra.setEstandar(stan);
		intra.setInterfaz(inter);

		det.setIntraway(intra);

		comando.setDetalle(det);

		new WsdlIntrawayImpl().aprovIntraway(comando);
	}

	private void spRequest820() {
		Comando comando = new Comando();

		Cabecera cab = new Cabecera();
		cab.setIDEmpresa(63);
		cab.setInterface(820);
		cab.setNegocio(2);
		cab.setSecuencia(0);
		comando.setCabecera(cab);

		Detalle det = new Detalle();
		Intraway intra = new Intraway();

		Estandar stan = new Estandar();
		stan.setAuthKey("");
		stan.setClienteCRM(174);
		//stan.setFechaDiferida(new XMLGregorianCalendarImpl());
		stan.setIdEstado(1);
		stan.setIdProducto(105);
		stan.setIdProductoPadre(0);
		stan.setIdPromotor("0");
		stan.setIdServicioPadre(1);
		stan.setIdVenta(0);
		stan.setIdVentaPadre(0);
		stan.setIdServicio(20);

		Interfaz inter = new Interfaz();
		inter.setActivactionCode("44154496");
		inter.setActive(0);
		inter.setBandPackageCRMId("");
		inter.setBuscarTagCRM(0);
		inter.setCantCPE(0);
		inter.setCantidad(0);
		inter.setCmsCMDID("uio01");// CmsCRMID
		inter.setCustomer1("");
		inter.setCustomer2("");
		inter.setCustomer3("");
		inter.setCustomer4("");
		inter.setDatoI1("");
		inter.setDatoI2("");
		inter.setDiskQuota(0);
		inter.setDocsis("");
		inter.setDominio("");
		inter.setDSFreq(0);
		inter.setEmailNoticias("");
		inter.setEnableAccounting("");
		inter.setEndpointNumber(0);
		inter.setFeatureCrmId("");
		inter.setHomeExchangeCRMId("");
		inter.setHostName("");
		inter.setHub("");
		inter.setIdCicloFactCRM("");
		inter.setIdISPCRM("");
		inter.setIdTipoCliente("");
		inter.setIspMtaCrmId(0);// TIPO DE DATO
		inter.setLinesQTy(0);
		inter.setMACAddress("");
		inter.setMessageCRMID("");
		inter.setMtaModelCRMId("");
		inter.setName("");
		inter.setNoBoot(false);
		inter.setNodo("");
		inter.setNombre("");
		inter.setNoticias(0);
		inter.setPassword("");
		inter.setPeriodicalBaseBalance(0);
		inter.setPrepaidPolicyCRMId("");
		inter.setProductName("105-Cable Modem (eMTA)");
		inter.setProfileCRMId("MTA-DEFAULT");
		inter.setProvisioning(1);
		inter.setQuotamax(0);
		inter.setSendtoController("true");
		inter.setServicePackageCRMId("");
		inter.setServicTypeCRMId(0);
		inter.setServidorEmailCRMId("");
		inter.setSnmpGroupCRMID("");
		inter.setStartingBalance(0);
		inter.setTn("");
		inter.setUSChannelID(0);
		inter.setUsername("");

		intra.setEstandar(stan);
		intra.setInterfaz(inter);

		det.setIntraway(intra);

		comando.setDetalle(det);

		new WsdlIntrawayImpl().aprovIntraway(comando);
	}

	private static void spRequest600() {
		Comando comando = new Comando();

		Cabecera cab = new Cabecera();
		cab.setIDEmpresa(63);
		cab.setInterface(622);
		cab.setNegocio(2);
		cab.setSecuencia(0);
		comando.setCabecera(cab);

		Detalle det = new Detalle();
		Intraway intra = new Intraway();

		Estandar stan = new Estandar();
		stan.setAuthKey("6064343");
		stan.setClienteCRM(38031396);
		//stan.setFechaDiferida(new XMLGregorianCalendarImpl());
		stan.setIdEstado(2);
		stan.setIdProducto(67596345);
		stan.setIdProductoPadre(0);
		stan.setIdPromotor("0");
		stan.setIdServicioPadre(0);
		stan.setIdVenta(0);
		stan.setIdVentaPadre(0);
		stan.setIdServicio(1);

		Interfaz inter = new Interfaz();
		inter.setActivactionCode("");
		inter.setActive(0);
		inter.setBandPackageCRMId("");
		inter.setBuscarTagCRM(0);
		inter.setCantCPE(0);
		inter.setCantidad(0);
		inter.setCmsCMDID("");
		inter.setCustomer1("");
		inter.setCustomer2("");
		inter.setCustomer3("");
		inter.setCustomer4("BSQATEST");
		inter.setDatoI1("296");
		inter.setDatoI2("Gabriel Narvaez");
		inter.setDiskQuota(0);
		inter.setDocsis("");
		inter.setDominio("");
		inter.setDSFreq(0);
		inter.setEmailNoticias("");
		inter.setEnableAccounting("");
		inter.setEndpointNumber(0);
		inter.setFeatureCrmId("");
		inter.setHomeExchangeCRMId("");
		inter.setHostName("");
		inter.setHub("");
		inter.setIdCicloFactCRM("");
		inter.setIdISPCRM("");
		inter.setIdTipoCliente("");
		inter.setIspMtaCrmId(0);
		inter.setLinesQTy(0);
		inter.setMACAddress("");
		inter.setMessageCRMID("");
		inter.setMtaModelCRMId("");
		inter.setName("");
		inter.setNoBoot(false);
		inter.setNodo("");
		inter.setNombre("");
		inter.setNoticias(0);
		inter.setPassword("");
		inter.setPeriodicalBaseBalance(0);
		inter.setPrepaidPolicyCRMId("");
		inter.setProductName("");
		inter.setProfileCRMId("");
		inter.setProvisioning(0);
		inter.setQuotamax(51200);
		inter.setSendtoController("");
		inter.setServicePackageCRMId("");
		inter.setServicTypeCRMId(0);
		inter.setServidorEmailCRMId("");
		inter.setSnmpGroupCRMID("");
		inter.setStartingBalance(0);
		inter.setTn("");
		inter.setUSChannelID(0);
		inter.setUsername("");

		intra.setEstandar(stan);
		intra.setInterfaz(inter);

		det.setIntraway(intra);

		comando.setDetalle(det);

		new WsdlIntrawayImpl().aprovIntraway(comando);
	}

	private void spRequest822() {
		Comando comando = new Comando();

		Cabecera cab = new Cabecera();
		cab.setIDEmpresa(63);
		cab.setInterface(666);
		cab.setNegocio(2);
		cab.setSecuencia(0);
		comando.setCabecera(cab);

		Detalle det = new Detalle();
		Intraway intra = new Intraway();

		Estandar stan = new Estandar();
		stan.setAuthKey("");
		stan.setClienteCRM(174);
		//stan.setFechaDiferida(new XMLGregorianCalendarImpl());
		stan.setIdEstado(2);
		stan.setIdProducto(62122449);// tipo de dato
		stan.setIdProductoPadre(0);
		stan.setIdPromotor("0");
		stan.setIdServicioPadre(1);
		stan.setIdVenta(0);
		stan.setIdVentaPadre(0);
		stan.setIdServicio(1);

		Interfaz inter = new Interfaz();
		inter.setActivactionCode("");
		inter.setActive(0);
		inter.setBandPackageCRMId("");
		inter.setBuscarTagCRM(0);
		inter.setCantCPE(0);
		inter.setCantidad(0);
		inter.setCmsCMDID("");
		inter.setCustomer1("");
		inter.setCustomer2("");
		inter.setCustomer3("");
		inter.setCustomer4("");
		inter.setDatoI1("");
		inter.setDatoI2("");
		inter.setDiskQuota(0);
		inter.setDocsis("");
		inter.setDominio("");
		inter.setDSFreq(0);
		inter.setEmailNoticias("");
		inter.setEnableAccounting("");
		inter.setEndpointNumber(0);
		inter.setFeatureCrmId("");
		inter.setHomeExchangeCRMId("");
		inter.setHostName("");
		inter.setHub("");
		inter.setIdCicloFactCRM("");
		inter.setIdISPCRM("");
		inter.setIdTipoCliente("");
		inter.setIspMtaCrmId(0);
		inter.setLinesQTy(2);
		inter.setMACAddress("0015A4CE8DDE");
		inter.setMessageCRMID("");
		inter.setMtaModelCRMId("TM602G");
		inter.setName("");
		inter.setNoBoot(false);
		inter.setNodo("");
		inter.setNombre("");
		inter.setNoticias(0);
		inter.setPassword("");
		inter.setPeriodicalBaseBalance(0);
		inter.setPrepaidPolicyCRMId("");
		inter.setProductName("");
		inter.setProfileCRMId("");
		inter.setProvisioning(0);
		inter.setQuotamax(0);
		inter.setSendtoController("true");
		inter.setServicePackageCRMId("");
		inter.setServicTypeCRMId(0);
		inter.setServidorEmailCRMId("");
		inter.setSnmpGroupCRMID("");
		inter.setStartingBalance(0);
		inter.setTn("");
		inter.setUSChannelID(0);
		inter.setUsername("");

		intra.setEstandar(stan);
		intra.setInterfaz(inter);

		det.setIntraway(intra);

		comando.setDetalle(det);

		new WsdlIntrawayImpl().aprovIntraway(comando);
	}

	private void spRequest622() {
		Comando comando = new Comando();

		Cabecera cab = new Cabecera();
		cab.setIDEmpresa(63);
		cab.setInterface(622);
		cab.setNegocio(2);
		cab.setSecuencia(0);
		comando.setCabecera(cab);

		Detalle det = new Detalle();
		Intraway intra = new Intraway();

		Estandar stan = new Estandar();
		stan.setAuthKey("");
		stan.setClienteCRM(174);
		//stan.setFechaDiferida(new XMLGregorianCalendarImpl());
		stan.setIdEstado(1);
		stan.setIdProducto(105);
		stan.setIdProductoPadre(0);
		stan.setIdPromotor("0");
		stan.setIdServicioPadre(0);
		stan.setIdVenta(0);
		stan.setIdVentaPadre(0);
		stan.setIdServicio(1);

		Interfaz inter = new Interfaz();
		inter.setActivactionCode("");
		inter.setActive(0);
		inter.setBandPackageCRMId("");
		inter.setBuscarTagCRM(0);
		inter.setCantCPE(0);
		inter.setCantidad(0);
		inter.setCmsCMDID("");
		inter.setCustomer1("");
		inter.setCustomer2("");
		inter.setCustomer3("");
		inter.setCustomer4("");
		inter.setDatoI1("");
		inter.setDatoI2("");
		inter.setDiskQuota(0);
		inter.setDocsis("");
		inter.setDominio("");
		inter.setDSFreq(0);
		inter.setEmailNoticias("");
		inter.setEnableAccounting("");
		inter.setEndpointNumber(0);
		inter.setFeatureCrmId("");
		inter.setHomeExchangeCRMId("");
		inter.setHostName("");
		inter.setHub("");
		inter.setIdCicloFactCRM("");
		inter.setIdISPCRM("");
		inter.setIdTipoCliente("");
		inter.setIspMtaCrmId(0);
		inter.setLinesQTy(0);
		inter.setMACAddress("0015A4CE8DDD");
		inter.setMessageCRMID("");
		inter.setMtaModelCRMId("");
		inter.setName("");
		inter.setNoBoot(false);
		inter.setNodo("");
		inter.setNombre("");
		inter.setNoticias(0);
		inter.setPassword("");
		inter.setPeriodicalBaseBalance(0);
		inter.setPrepaidPolicyCRMId("");
		inter.setProductName("");
		inter.setProfileCRMId("");
		inter.setProvisioning(0);
		inter.setQuotamax(0);
		inter.setSendtoController("");
		inter.setServicePackageCRMId("");
		inter.setServicTypeCRMId(0);
		inter.setServidorEmailCRMId("");
		inter.setSnmpGroupCRMID("");
		inter.setStartingBalance(0);
		inter.setTn("");
		inter.setUSChannelID(0);
		inter.setUsername("");

		intra.setEstandar(stan);
		intra.setInterfaz(inter);

		det.setIntraway(intra);

		comando.setDetalle(det);

		new WsdlIntrawayImpl().aprovIntraway(comando);
	}

	private void spRequest824() {
		Comando comando = new Comando();

		Cabecera cab = new Cabecera();
		cab.setIDEmpresa(63);
		cab.setInterface(824);
		cab.setNegocio(2);
		cab.setSecuencia(0);
		comando.setCabecera(cab);

		Detalle det = new Detalle();
		Intraway intra = new Intraway();

		Estandar stan = new Estandar();
		stan.setAuthKey("");
		stan.setClienteCRM(174);
		//stan.setFechaDiferida(new XMLGregorianCalendarImpl());
		stan.setIdEstado(1);
		stan.setIdProducto(106);
		stan.setIdProductoPadre(112);
		stan.setIdPromotor("0");
		stan.setIdServicioPadre(20);
		stan.setIdVenta(0);
		stan.setIdVentaPadre(0);
		stan.setIdServicio(21);

		Interfaz inter = new Interfaz();
		inter.setActivactionCode("");
		inter.setActive(0);
		inter.setBandPackageCRMId("");
		inter.setBuscarTagCRM(0);
		inter.setCantCPE(0);
		inter.setCantidad(0);
		inter.setCmsCMDID("");
		inter.setCustomer1("");
		inter.setCustomer2("");
		inter.setCustomer3("");
		inter.setCustomer4("");
		inter.setDatoI1("");
		inter.setDatoI2("");
		inter.setDiskQuota(0);
		inter.setDocsis("");
		inter.setDominio("");
		inter.setDSFreq(0);
		inter.setEmailNoticias("");
		inter.setEnableAccounting("");
		inter.setEndpointNumber(2);
		inter.setFeatureCrmId("");
		inter.setHomeExchangeCRMId("STD-FULL-POST");
		inter.setHostName("");
		inter.setHub("");
		inter.setIdCicloFactCRM("");
		inter.setIdISPCRM("");
		inter.setIdTipoCliente("");
		inter.setIspMtaCrmId(0);
		inter.setLinesQTy(0);
		inter.setMACAddress("");
		inter.setMessageCRMID("");
		inter.setMtaModelCRMId("");
		inter.setName("");
		inter.setNoBoot(false);
		inter.setNodo("");
		inter.setNombre("");
		inter.setNoticias(0);
		inter.setPassword("");
		inter.setPeriodicalBaseBalance(0);
		inter.setPrepaidPolicyCRMId("");
		inter.setProductName("");
		inter.setProfileCRMId("HFC-QUITO");
		inter.setProvisioning(0);
		inter.setQuotamax(0);
		inter.setSendtoController("");
		inter.setServicePackageCRMId("");
		inter.setServicTypeCRMId(0);
		inter.setServidorEmailCRMId("");
		inter.setSnmpGroupCRMID("");
		inter.setStartingBalance(0);
		inter.setTn("59326014600");
		inter.setUSChannelID(0);
		inter.setUsername("");

		intra.setEstandar(stan);
		intra.setInterfaz(inter);

		det.setIntraway(intra);

		comando.setDetalle(det);

		new WsdlIntrawayImpl().aprovIntraway(comando);
	}

	private void spRequest830() {
		Comando comando = new Comando();

		Cabecera cab = new Cabecera();
		cab.setIDEmpresa(63);
		cab.setInterface(830);
		cab.setNegocio(2);
		cab.setSecuencia(0);
		comando.setCabecera(cab);

		Detalle det = new Detalle();
		Intraway intra = new Intraway();

		Estandar stan = new Estandar();
		stan.setAuthKey("");
		stan.setClienteCRM(174);
		//stan.setFechaDiferida(new XMLGregorianCalendarImpl());
		stan.setIdEstado(1);
		stan.setIdProducto(0);
		stan.setIdProductoPadre(0);
		stan.setIdPromotor("0");
		stan.setIdServicioPadre(21);
		stan.setIdVenta(0);
		stan.setIdVentaPadre(0);
		stan.setIdServicio(22);

		Interfaz inter = new Interfaz();
		inter.setActivactionCode("");
		inter.setActive(0);
		inter.setBandPackageCRMId("");
		inter.setBuscarTagCRM(0);
		inter.setCantCPE(0);
		inter.setCantidad(0);
		inter.setCmsCMDID("");
		inter.setCustomer1("");
		inter.setCustomer2("");
		inter.setCustomer3("");
		inter.setCustomer4("");
		inter.setDatoI1("");
		inter.setDatoI2("");
		inter.setDiskQuota(0);
		inter.setDocsis("");
		inter.setDominio("");
		inter.setDSFreq(0);
		inter.setEmailNoticias("");
		inter.setEnableAccounting("");
		inter.setEndpointNumber(0);
		inter.setFeatureCrmId("0");
		inter.setHomeExchangeCRMId("");
		inter.setHostName("");
		inter.setHub("");
		inter.setIdCicloFactCRM("");
		inter.setIdISPCRM("");
		inter.setIdTipoCliente("");
		inter.setIspMtaCrmId(0);
		inter.setLinesQTy(0);
		inter.setMACAddress("");
		inter.setMessageCRMID("");
		inter.setMtaModelCRMId("");
		inter.setName("");
		inter.setNoBoot(false);
		inter.setNodo("");
		inter.setNombre("");
		inter.setNoticias(0);
		inter.setPassword("");
		inter.setPeriodicalBaseBalance(0);
		inter.setPrepaidPolicyCRMId("");
		inter.setProductName("");
		inter.setProfileCRMId("");
		inter.setProvisioning(0);
		inter.setQuotamax(0);
		inter.setSendtoController("1");
		inter.setServicePackageCRMId("");
		inter.setServicTypeCRMId(0);
		inter.setServidorEmailCRMId("");
		inter.setSnmpGroupCRMID("");
		inter.setStartingBalance(0);
		inter.setTn("");
		inter.setUSChannelID(0);
		inter.setUsername("");

		intra.setEstandar(stan);
		intra.setInterfaz(inter);

		det.setIntraway(intra);

		comando.setDetalle(det);

		new WsdlIntrawayImpl().aprovIntraway(comando);
	}

	private void spRequest830_2() {
		Comando comando = new Comando();

		Cabecera cab = new Cabecera();
		cab.setIDEmpresa(63);
		cab.setInterface(830);
		cab.setNegocio(2);
		cab.setSecuencia(0);
		comando.setCabecera(cab);

		Detalle det = new Detalle();
		Intraway intra = new Intraway();

		Estandar stan = new Estandar();
		stan.setAuthKey("");
		stan.setClienteCRM(174);
		//stan.setFechaDiferida(new XMLGregorianCalendarImpl());
		stan.setIdEstado(1);
		stan.setIdProducto(0);
		stan.setIdProductoPadre(0);
		stan.setIdPromotor("0");
		stan.setIdServicioPadre(21);
		stan.setIdVenta(0);
		stan.setIdVentaPadre(0);
		stan.setIdServicio(22);

		Interfaz inter = new Interfaz();
		inter.setActivactionCode("");
		inter.setActive(0);
		inter.setBandPackageCRMId("");
		inter.setBuscarTagCRM(0);
		inter.setCantCPE(0);
		inter.setCantidad(0);
		inter.setCmsCMDID("");
		inter.setCustomer1("");
		inter.setCustomer2("");
		inter.setCustomer3("");
		inter.setCustomer4("");
		inter.setDatoI1("");
		inter.setDatoI2("");
		inter.setDiskQuota(0);
		inter.setDocsis("");
		inter.setDominio("");
		inter.setDSFreq(0);
		inter.setEmailNoticias("");
		inter.setEnableAccounting("");
		inter.setEndpointNumber(0);
		inter.setFeatureCrmId("0");
		inter.setHomeExchangeCRMId("");
		inter.setHostName("");
		inter.setHub("");
		inter.setIdCicloFactCRM("");
		inter.setIdISPCRM("");
		inter.setIdTipoCliente("");
		inter.setIspMtaCrmId(0);
		inter.setLinesQTy(0);
		inter.setMACAddress("");
		inter.setMessageCRMID("");
		inter.setMtaModelCRMId("");
		inter.setName("");
		inter.setNoBoot(false);
		inter.setNodo("");
		inter.setNombre("");
		inter.setNoticias(0);
		inter.setPassword("");
		inter.setPeriodicalBaseBalance(0);
		inter.setPrepaidPolicyCRMId("");
		inter.setProductName("");
		inter.setProfileCRMId("");
		inter.setProvisioning(0);
		inter.setQuotamax(0);
		inter.setSendtoController("1");
		inter.setServicePackageCRMId("");
		inter.setServicTypeCRMId(0);
		inter.setServidorEmailCRMId("");
		inter.setSnmpGroupCRMID("");
		inter.setStartingBalance(0);
		inter.setTn("");
		inter.setUSChannelID(0);
		inter.setUsername("");

		intra.setEstandar(stan);
		intra.setInterfaz(inter);

		det.setIntraway(intra);

		comando.setDetalle(det);

		new WsdlIntrawayImpl().aprovIntraway(comando);
	}

	private void spRequest830_3() {
		Comando comando = new Comando();

		Cabecera cab = new Cabecera();
		cab.setIDEmpresa(63);
		cab.setInterface(830);
		cab.setNegocio(2);
		cab.setSecuencia(0);
		comando.setCabecera(cab);

		Detalle det = new Detalle();
		Intraway intra = new Intraway();

		Estandar stan = new Estandar();
		stan.setAuthKey("");
		stan.setClienteCRM(174);
		//stan.setFechaDiferida(new XMLGregorianCalendarImpl());
		stan.setIdEstado(1);
		stan.setIdProducto(0);
		stan.setIdProductoPadre(0);
		stan.setIdPromotor("0");
		stan.setIdServicioPadre(0);
		stan.setIdVenta(0);
		stan.setIdVentaPadre(0);
		stan.setIdServicio(21);

		Interfaz inter = new Interfaz();
		inter.setActivactionCode("");
		inter.setActive(0);
		inter.setBandPackageCRMId("");
		inter.setBuscarTagCRM(0);
		inter.setCantCPE(0);
		inter.setCantidad(0);
		inter.setCmsCMDID("");
		inter.setCustomer1("");
		inter.setCustomer2("");
		inter.setCustomer3("");
		inter.setCustomer4("");
		inter.setDatoI1("");
		inter.setDatoI2("");
		inter.setDiskQuota(0);
		inter.setDocsis("");
		inter.setDominio("");
		inter.setDSFreq(0);
		inter.setEmailNoticias("");
		inter.setEnableAccounting("");
		inter.setEndpointNumber(0);
		inter.setFeatureCrmId("0");
		inter.setHomeExchangeCRMId("");
		inter.setHostName("");
		inter.setHub("");
		inter.setIdCicloFactCRM("");
		inter.setIdISPCRM("");
		inter.setIdTipoCliente("");
		inter.setIspMtaCrmId(0);
		inter.setLinesQTy(0);
		inter.setMACAddress("");
		inter.setMessageCRMID("");
		inter.setMtaModelCRMId("");
		inter.setName("");
		inter.setNoBoot(false);
		inter.setNodo("");
		inter.setNombre("");
		inter.setNoticias(0);
		inter.setPassword("");
		inter.setPeriodicalBaseBalance(0);
		inter.setPrepaidPolicyCRMId("");
		inter.setProductName("");
		inter.setProfileCRMId("");
		inter.setProvisioning(0);
		inter.setQuotamax(0);
		inter.setSendtoController("1");
		inter.setServicePackageCRMId("");
		inter.setServicTypeCRMId(0);
		inter.setServidorEmailCRMId("");
		inter.setSnmpGroupCRMID("");
		inter.setStartingBalance(0);
		inter.setTn("");
		inter.setUSChannelID(0);
		inter.setUsername("");

		intra.setEstandar(stan);
		intra.setInterfaz(inter);

		det.setIntraway(intra);

		comando.setDetalle(det);

		new WsdlIntrawayImpl().aprovIntraway(comando);
	}

	private void spRequest830_4() {
		Comando comando = new Comando();

		Cabecera cab = new Cabecera();
		cab.setIDEmpresa(63);
		cab.setInterface(830);
		cab.setNegocio(2);
		cab.setSecuencia(0);
		comando.setCabecera(cab);

		Detalle det = new Detalle();
		Intraway intra = new Intraway();

		Estandar stan = new Estandar();
		stan.setAuthKey("");
		stan.setClienteCRM(174);
		//stan.setFechaDiferida(new XMLGregorianCalendarImpl());
		stan.setIdEstado(1);
		stan.setIdProducto(0);
		stan.setIdProductoPadre(0);
		stan.setIdPromotor("0");
		stan.setIdServicioPadre(21);
		stan.setIdVenta(0);
		stan.setIdVentaPadre(0);
		stan.setIdServicio(0);

		Interfaz inter = new Interfaz();
		inter.setActivactionCode("");
		inter.setActive(0);
		inter.setBandPackageCRMId("");
		inter.setBuscarTagCRM(0);
		inter.setCantCPE(0);
		inter.setCantidad(0);
		inter.setCmsCMDID("");
		inter.setCustomer1("");
		inter.setCustomer2("");
		inter.setCustomer3("");
		inter.setCustomer4("");
		inter.setDatoI1("");
		inter.setDatoI2("");
		inter.setDiskQuota(0);
		inter.setDocsis("");
		inter.setDominio("");
		inter.setDSFreq(0);
		inter.setEmailNoticias("");
		inter.setEnableAccounting("");
		inter.setEndpointNumber(0);
		inter.setFeatureCrmId("0");
		inter.setHomeExchangeCRMId("");
		inter.setHostName("");
		inter.setHub("");
		inter.setIdCicloFactCRM("");
		inter.setIdISPCRM("");
		inter.setIdTipoCliente("");
		inter.setIspMtaCrmId(0);
		inter.setLinesQTy(0);
		inter.setMACAddress("");
		inter.setMessageCRMID("");
		inter.setMtaModelCRMId("");
		inter.setName("");
		inter.setNoBoot(false);
		inter.setNodo("");
		inter.setNombre("");
		inter.setNoticias(0);
		inter.setPassword("");
		inter.setPeriodicalBaseBalance(0);
		inter.setPrepaidPolicyCRMId("");
		inter.setProductName("");
		inter.setProfileCRMId("");
		inter.setProvisioning(0);
		inter.setQuotamax(0);
		inter.setSendtoController("1");
		inter.setServicePackageCRMId("");
		inter.setServicTypeCRMId(0);
		inter.setServidorEmailCRMId("");
		inter.setSnmpGroupCRMID("");
		inter.setStartingBalance(0);
		inter.setTn("");
		inter.setUSChannelID(0);
		inter.setUsername("");

		intra.setEstandar(stan);
		intra.setInterfaz(inter);

		det.setIntraway(intra);

		comando.setDetalle(det);

		new WsdlIntrawayImpl().aprovIntraway(comando);
	}

	private void spRequest630() {
		Comando comando = new Comando();

		Cabecera cab = new Cabecera();
		cab.setIDEmpresa(63);
		cab.setInterface(630);
		cab.setNegocio(2);
		cab.setSecuencia(0);
		comando.setCabecera(cab);

		Detalle det = new Detalle();
		Intraway intra = new Intraway();

		Estandar stan = new Estandar();
		stan.setAuthKey("");
		stan.setClienteCRM(174);
		//stan.setFechaDiferida(new XMLGregorianCalendarImpl());
		stan.setIdEstado(1);
		stan.setIdProducto(0);
		stan.setIdProductoPadre(0);
		stan.setIdPromotor("0");
		stan.setIdServicioPadre(21);
		stan.setIdVenta(0);
		stan.setIdVentaPadre(0);
		stan.setIdServicio(22);

		Interfaz inter = new Interfaz();
		inter.setActivactionCode("");
		inter.setActive(0);
		inter.setBandPackageCRMId("");
		inter.setBuscarTagCRM(0);
		inter.setCantCPE(0);
		inter.setCantidad(0);
		inter.setCmsCMDID("");
		inter.setCustomer1("");
		inter.setCustomer2("");
		inter.setCustomer3("");
		inter.setCustomer4("");
		inter.setDatoI1("");
		inter.setDatoI2("");
		inter.setDiskQuota(0);
		inter.setDocsis("");
		inter.setDominio("");
		inter.setDSFreq(0);
		inter.setEmailNoticias("");
		inter.setEnableAccounting("");
		inter.setEndpointNumber(0);
		inter.setFeatureCrmId("0");
		inter.setHomeExchangeCRMId("");
		inter.setHostName("");
		inter.setHub("");
		inter.setIdCicloFactCRM("");
		inter.setIdISPCRM("");
		inter.setIdTipoCliente("");
		inter.setIspMtaCrmId(0);
		inter.setLinesQTy(0);
		inter.setMACAddress("");
		inter.setMessageCRMID("");
		inter.setMtaModelCRMId("");
		inter.setName("");
		inter.setNoBoot(false);
		inter.setNodo("");
		inter.setNombre("");
		inter.setNoticias(0);
		inter.setPassword("");
		inter.setPeriodicalBaseBalance(0);
		inter.setPrepaidPolicyCRMId("");
		inter.setProductName("");
		inter.setProfileCRMId("");
		inter.setProvisioning(0);
		inter.setQuotamax(0);
		inter.setSendtoController("1");
		inter.setServicePackageCRMId("");
		inter.setServicTypeCRMId(0);
		inter.setServidorEmailCRMId("");
		inter.setSnmpGroupCRMID("");
		inter.setStartingBalance(0);
		inter.setTn("");
		inter.setUSChannelID(0);
		inter.setUsername("");

		intra.setEstandar(stan);
		intra.setInterfaz(inter);

		det.setIntraway(intra);

		comando.setDetalle(det);

		new WsdlIntrawayImpl().aprovIntraway(comando);
	}

	private void spRequest602() {
		Comando comando = new Comando();

		Cabecera cab = new Cabecera();
		cab.setIDEmpresa(63);
		cab.setInterface(602);
		cab.setNegocio(2);
		cab.setSecuencia(0);
		comando.setCabecera(cab);

		Detalle det = new Detalle();
		Intraway intra = new Intraway();

		Estandar stan = new Estandar();
		stan.setAuthKey("");
		stan.setClienteCRM(174);
		//stan.setFechaDiferida(new XMLGregorianCalendarImpl());
		stan.setIdEstado(1);
		stan.setIdProducto(2281);
		stan.setIdProductoPadre(105);
		stan.setIdPromotor("0");
		stan.setIdServicioPadre(1);
		stan.setIdVenta(0);
		stan.setIdVentaPadre(0);
		stan.setIdServicio(3);

		Interfaz inter = new Interfaz();
		inter.setActivactionCode("");
		inter.setActive(0);
		inter.setBandPackageCRMId("");
		inter.setBuscarTagCRM(0);
		inter.setCantCPE(0);
		inter.setCantidad(0);
		inter.setCmsCMDID("");
		inter.setCustomer1("");
		inter.setCustomer2("");
		inter.setCustomer3("");
		inter.setCustomer4("");
		inter.setDatoI1("");
		inter.setDatoI2("");
		inter.setDiskQuota(51200);
		inter.setDocsis("");
		inter.setDominio("uio.satnet.net");
		inter.setDSFreq(0);
		inter.setEmailNoticias("");
		inter.setEnableAccounting("");
		inter.setEndpointNumber(0);
		inter.setFeatureCrmId("");
		inter.setHomeExchangeCRMId("");
		inter.setHostName("");
		inter.setHub("");
		inter.setIdCicloFactCRM("");
		inter.setIdISPCRM("");
		inter.setIdTipoCliente("");
		inter.setIspMtaCrmId(0);
		inter.setLinesQTy(0);
		inter.setMACAddress("");
		inter.setMessageCRMID("");
		inter.setMtaModelCRMId("");
		inter.setName("@Eddie Veder");
		inter.setNoBoot(false);
		inter.setNodo("");
		inter.setNombre("");
		inter.setNoticias(0);
		inter.setPassword("");
		inter.setPeriodicalBaseBalance(0);
		inter.setPrepaidPolicyCRMId("");
		inter.setProductName("");
		inter.setProfileCRMId("");
		inter.setProvisioning(0);
		inter.setQuotamax(0);
		inter.setSendtoController("");
		inter.setServicePackageCRMId("");
		inter.setServicTypeCRMId(0);
		inter.setServidorEmailCRMId("");
		inter.setSnmpGroupCRMID("");
		inter.setStartingBalance(0);
		inter.setTn("");
		inter.setUSChannelID(0);
		inter.setUsername("eddie.veder@pearljam.com");

		intra.setEstandar(stan);
		intra.setInterfaz(inter);

		det.setIntraway(intra);

		comando.setDetalle(det);

		new WsdlIntrawayImpl().aprovIntraway(comando);
	}

}
