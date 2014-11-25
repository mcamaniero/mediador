package com.app.dao;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "log_Intraway", catalog = "aprovgrupotv", uniqueConstraints = {})
public class Intraway extends CabeceraDao implements Serializable{

	private static final long serialVersionUID = -5078262826159727577L;

	//Estandar
	private String AuthKey;//
	private String ClienteCRM;//
	private String IdProducto;//
	private String IdProductoPadre;//
	private int IdServicioPadre;//
	private int IdVenta;//
	private int IdVentaPadre;//
	private String IdPromotor;//
	@Temporal(TemporalType.TIMESTAMP)
	private Date FechaDiferida;//
	private int IdEstado;//10
	private int IdServicio;
	
	
	//Interfaz
	private String Nombre;//
	private String Username;//
	private String Password;//
	private String IdTipoCliente;//
	private String EmailNoticias;//
	private String IdCicloFactCRM;//
	private int ServicTypeCRMId;//
	private String MessageCRMID;//
	private int Cantidad;//
	private int Quotamax;//
	private String ServidorEmailCRMId;//
	private String Dominio;//
	private int DiskQuota;//
	private int Noticias;//
	private String Name;//
	private String ServicePackageCRMId;//
	private String Hub;//
	private String Nodo;//
	private String IdISPCRM;//
	private String ActivactionCode;//20
	private int IspMtaCrmId;//
	private int BuscarTagCRM;//
	private String Docsis;//
	private String EnableAccounting;//
	private String ProductName;//
	private String BandPackageCRMId;//
	private String PrepaidPolicyCRMId;//
	private int CantCPE;//
	private int USChannelID;//
	private int StartingBalance;//
	private int DSFreq;//
	private int PeriodicalBaseBalance;//
	private boolean NoBoot;//
	private String MACAddress;//
	private String SnmpGroupCRMID;//
	private String HostName;//
	private String CmsCMDID;//
	private int Provisioning;//
	private String ProfileCRMId;//
	private String SendtoController;//20
	private int LinesQTy;//
	private String MtaModelCRMId;//
	private int EndpointNumber;//
	private String Tn;//
	private String HomeExchangeCRMId;//
	private String FeatureCrmId;//
	private int Active;//
	private String DatoI1;//
	private String DatoI2;//
	private String Customer1;//
	private String Customer2;//
	private String Customer3;//
	private String Customer4;//63
	
	
	
	public Intraway() {
	
	}

	/**
	 * @param fecha
	 * @param idEmpresa
	 * @param negocio
	 * @param interfaz
	 * @param secuencia
	 * @param authKey
	 * @param clienteCRM
	 * @param idProducto
	 * @param idProductoPadre
	 * @param idServicioPadre
	 * @param idVenta
	 * @param idVentaPadre
	 * @param idPromotor
	 * @param fechaDiferida
	 * @param idEstado
	 * @param nombre
	 * @param username
	 * @param password
	 * @param idTipoCliente
	 * @param emailNoticias
	 * @param idCicloFactCRM
	 * @param servicTypeCRMId
	 * @param messageCRMID
	 * @param cantidad
	 * @param quotamax
	 * @param servidorEmailCRMId
	 * @param dominio
	 * @param diskQuota
	 * @param noticias
	 * @param name
	 * @param servicePackageCRMId
	 * @param hub
	 * @param nodo
	 * @param idISPCRM
	 * @param activactionCode
	 * @param ispMtaCrmId
	 * @param buscarTagCRM
	 * @param docsis
	 * @param enableAccounting
	 * @param productName
	 * @param bandPackageCRMId
	 * @param prepaidPolicyCRMId
	 * @param cantCPE
	 * @param uSChannelID
	 * @param startingBalance
	 * @param dSFreq
	 * @param periodicalBaseBalance
	 * @param noBoot
	 * @param mACAddress
	 * @param snmpGroupCRMID
	 * @param hostName
	 * @param cmsCMDID
	 * @param provisioning
	 * @param profileCRMId
	 * @param sendtoController
	 * @param linesQTy
	 * @param mtaModelCRMId
	 * @param endpointNumber
	 * @param tn
	 * @param homeExchangeCRMId
	 * @param featureCrmId
	 * @param active
	 * @param datoI1
	 * @param datoI2
	 * @param customer1
	 * @param customer2
	 * @param customer3
	 * @param customer4
	 */
	public Intraway(Date fecha, int idEmpresa, int negocio, int interfaz, int secuencia, String codError, String detMensaje,
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
			int provisioning, String profileCRMId, String sendtoController, int linesQTy, String mtaModelCRMId,
			int endpointNumber, String tn, String homeExchangeCRMId, String featureCrmId, int active,
			String datoI1, String datoI2, String customer1, String customer2, String customer3, String customer4) {
		super(fecha, idEmpresa, negocio, interfaz, secuencia, codError, detMensaje);
		
		this.setActivactionCode(activactionCode);
		this.setActive(active);
		this.setAuthKey(authKey);
		this.setBandPackageCRMId(bandPackageCRMId);
		this.setBuscarTagCRM(buscarTagCRM);
		this.setCantCPE(cantCPE);
		this.setCantidad(cantidad);
		this.setClienteCRM(clienteCRM);
		this.setCmsCMDID(cmsCMDID);
		this.setCustomer1(customer1);
		this.setCustomer2(customer2);
		this.setCustomer3(customer3);
		this.setCustomer4(customer4);
		this.setDatoI1(datoI1);
		this.setDatoI2(datoI2);
		this.setDiskQuota(diskQuota);
		this.setDocsis(docsis);
		this.setDominio(dominio);
		this.setDSFreq(dSFreq);
		this.setEmailNoticias(emailNoticias);//20
		this.setEnableAccounting(enableAccounting);
		this.setEndpointNumber(endpointNumber);
		this.setFeatureCrmId(featureCrmId);
		this.setFechaDiferida(fechaDiferida);
		this.setHomeExchangeCRMId(homeExchangeCRMId);
		this.setHostName(hostName);
		this.setHub(hub);
		this.setIdCicloFactCRM(idCicloFactCRM);
		this.setIdEstado(idEstado);
		this.setIdISPCRM(idISPCRM);
		this.setIdProducto(idProducto);
		this.setIdProductoPadre(idProductoPadre);
		this.setIdPromotor(idPromotor);
		this.setIdServicioPadre(idServicioPadre);
		this.setIdTipoCliente(idTipoCliente);
		this.setIdVenta(idVenta);
		this.setIdVentaPadre(idVentaPadre);
		this.setIspMtaCrmId(ispMtaCrmId);
		this.setLinesQTy(linesQTy);
		this.setMACAddress(mACAddress);//20
		this.setMessageCRMID(messageCRMID);
		this.setMtaModelCRMId(mtaModelCRMId);
		this.setName(name);
		this.setNoBoot(noBoot);
		this.setNodo(nodo);
		this.setNombre(nombre);
		this.setNoticias(noticias);
		this.setPassword(password);
		this.setPeriodicalBaseBalance(periodicalBaseBalance);
		this.setPrepaidPolicyCRMId(prepaidPolicyCRMId);
		this.setProductName(productName);
		this.setProfileCRMId(profileCRMId);
		this.setProvisioning(provisioning);
		this.setQuotamax(quotamax);
		this.setSendtoController(sendtoController);
		this.setServicePackageCRMId(servicePackageCRMId);
		this.setServicTypeCRMId(servicTypeCRMId);
		this.setServidorEmailCRMId(servidorEmailCRMId);
		this.setSnmpGroupCRMID(snmpGroupCRMID);
		this.setStartingBalance(startingBalance);//20
		this.setTn(tn);
		this.setUSChannelID(uSChannelID);
		this.setUsername(username);
		this.setIdServicio(idServicio);
	}

	public String getAuthKey() {
		return AuthKey;
	}

	public void setAuthKey(String authKey) {
		AuthKey = authKey;
	}

	public String getClienteCRM() {
		return ClienteCRM;
	}

	public void setClienteCRM(String clienteCRM) {
		ClienteCRM = clienteCRM;
	}

	public String getIdProducto() {
		return IdProducto;
	}

	public void setIdProducto(String idProducto) {
		IdProducto = idProducto;
	}

	public String getIdProductoPadre() {
		return IdProductoPadre;
	}

	public void setIdProductoPadre(String idProductoPadre) {
		IdProductoPadre = idProductoPadre;
	}

	public int getIdServicioPadre() {
		return IdServicioPadre;
	}

	public void setIdServicioPadre(int idServicioPadre) {
		IdServicioPadre = idServicioPadre;
	}

	public int getIdVenta() {
		return IdVenta;
	}

	public void setIdVenta(int idVenta) {
		IdVenta = idVenta;
	}

	public int getIdVentaPadre() {
		return IdVentaPadre;
	}

	public void setIdVentaPadre(int idVentaPadre) {
		IdVentaPadre = idVentaPadre;
	}

	public String getIdPromotor() {
		return IdPromotor;
	}

	public void setIdPromotor(String idPromotor) {
		IdPromotor = idPromotor;
	}

	public Date getFechaDiferida() {
		return FechaDiferida;
	}

	public void setFechaDiferida(Date fechaDiferida) {
		FechaDiferida = fechaDiferida;
	}

	public int getIdEstado() {
		return IdEstado;
	}

	public void setIdEstado(int idEstado) {
		IdEstado = idEstado;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getIdTipoCliente() {
		return IdTipoCliente;
	}

	public void setIdTipoCliente(String idTipoCliente) {
		IdTipoCliente = idTipoCliente;
	}

	public String getEmailNoticias() {
		return EmailNoticias;
	}

	public void setEmailNoticias(String emailNoticias) {
		EmailNoticias = emailNoticias;
	}

	public String getIdCicloFactCRM() {
		return IdCicloFactCRM;
	}

	public void setIdCicloFactCRM(String idCicloFactCRM) {
		this.IdCicloFactCRM = idCicloFactCRM;
	}

	public int getServicTypeCRMId() {
		return ServicTypeCRMId;
	}

	public void setServicTypeCRMId(int servicTypeCRMId) {
		ServicTypeCRMId = servicTypeCRMId;
	}

	public String getMessageCRMID() {
		return MessageCRMID;
	}

	public void setMessageCRMID(String messageCRMID) {
		MessageCRMID = messageCRMID;
	}

	public int getCantidad() {
		return Cantidad;
	}

	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}

	public int getQuotamax() {
		return Quotamax;
	}

	public void setQuotamax(int quotamax) {
		Quotamax = quotamax;
	}

	public String getServidorEmailCRMId() {
		return ServidorEmailCRMId;
	}

	public void setServidorEmailCRMId(String servidorEmailCRMId) {
		ServidorEmailCRMId = servidorEmailCRMId;
	}

	public String getDominio() {
		return Dominio;
	}

	public void setDominio(String dominio) {
		Dominio = dominio;
	}

	public int getDiskQuota() {
		return DiskQuota;
	}

	public void setDiskQuota(int diskQuota) {
		DiskQuota = diskQuota;
	}

	public int getNoticias() {
		return Noticias;
	}

	public void setNoticias(int noticias) {
		Noticias = noticias;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getServicePackageCRMId() {
		return ServicePackageCRMId;
	}

	public void setServicePackageCRMId(String servicePackageCRMId) {
		ServicePackageCRMId = servicePackageCRMId;
	}

	public String getHub() {
		return Hub;
	}

	public void setHub(String hub) {
		Hub = hub;
	}

	public String getNodo() {
		return Nodo;
	}

	public void setNodo(String nodo) {
		Nodo = nodo;
	}

	public String getIdISPCRM() {
		return IdISPCRM;
	}

	public void setIdISPCRM(String idISPCRM) {
		IdISPCRM = idISPCRM;
	}

	public String getActivactionCode() {
		return ActivactionCode;
	}

	public void setActivactionCode(String activactionCode) {
		ActivactionCode = activactionCode;
	}

	public int getIspMtaCrmId() {
		return IspMtaCrmId;
	}

	public void setIspMtaCrmId(int ispMtaCrmId) {
		IspMtaCrmId = ispMtaCrmId;
	}

	public int getBuscarTagCRM() {
		return BuscarTagCRM;
	}

	public void setBuscarTagCRM(int buscarTagCRM) {
		BuscarTagCRM = buscarTagCRM;
	}

	public String getDocsis() {
		return Docsis;
	}

	public void setDocsis(String docsis) {
		Docsis = docsis;
	}

	public String getEnableAccounting() {
		return EnableAccounting;
	}

	public void setEnableAccounting(String enableAccounting) {
		EnableAccounting = enableAccounting;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public String getBandPackageCRMId() {
		return BandPackageCRMId;
	}

	public void setBandPackageCRMId(String bandPackageCRMId) {
		BandPackageCRMId = bandPackageCRMId;
	}

	public String getPrepaidPolicyCRMId() {
		return PrepaidPolicyCRMId;
	}

	public void setPrepaidPolicyCRMId(String prepaidPolicyCRMId) {
		PrepaidPolicyCRMId = prepaidPolicyCRMId;
	}

	public int getCantCPE() {
		return CantCPE;
	}

	public void setCantCPE(int cantCPE) {
		CantCPE = cantCPE;
	}

	public int getUSChannelID() {
		return USChannelID;
	}

	public void setUSChannelID(int uSChannelID) {
		USChannelID = uSChannelID;
	}

	public int getStartingBalance() {
		return StartingBalance;
	}

	public void setStartingBalance(int startingBalance) {
		StartingBalance = startingBalance;
	}

	public int getDSFreq() {
		return DSFreq;
	}

	public void setDSFreq(int dSFreq) {
		DSFreq = dSFreq;
	}

	public int getPeriodicalBaseBalance() {
		return PeriodicalBaseBalance;
	}

	public void setPeriodicalBaseBalance(int periodicalBaseBalance) {
		PeriodicalBaseBalance = periodicalBaseBalance;
	}

	public boolean isNoBoot() {
		return NoBoot;
	}

	public void setNoBoot(boolean noBoot) {
		NoBoot = noBoot;
	}

	public String getMACAddress() {
		return MACAddress;
	}

	public void setMACAddress(String mACAddress) {
		MACAddress = mACAddress;
	}

	public String getSnmpGroupCRMID() {
		return SnmpGroupCRMID;
	}

	public void setSnmpGroupCRMID(String snmpGroupCRMID) {
		SnmpGroupCRMID = snmpGroupCRMID;
	}

	public String getHostName() {
		return HostName;
	}

	public void setHostName(String hostName) {
		HostName = hostName;
	}

	public String getCmsCMDID() {
		return CmsCMDID;
	}

	public void setCmsCMDID(String cmsCMDID) {
		CmsCMDID = cmsCMDID;
	}

	public int getProvisioning() {
		return Provisioning;
	}

	public void setProvisioning(int provisioning) {
		Provisioning = provisioning;
	}

	public String getProfileCRMId() {
		return ProfileCRMId;
	}

	public void setProfileCRMId(String profileCRMId) {
		ProfileCRMId = profileCRMId;
	}

	public String getSendtoController() {
		return SendtoController;
	}

	public void setSendtoController(String sendtoController) {
		SendtoController = sendtoController;
	}

	public int getLinesQTy() {
		return LinesQTy;
	}

	public void setLinesQTy(int linesQTy) {
		LinesQTy = linesQTy;
	}

	public String getMtaModelCRMId() {
		return MtaModelCRMId;
	}

	public void setMtaModelCRMId(String mtaModelCRMId) {
		MtaModelCRMId = mtaModelCRMId;
	}

	public int getEndpointNumber() {
		return EndpointNumber;
	}

	public void setEndpointNumber(int endpointNumber) {
		EndpointNumber = endpointNumber;
	}

	public String getTn() {
		return Tn;
	}

	public void setTn(String tn) {
		Tn = tn;
	}

	public String getHomeExchangeCRMId() {
		return HomeExchangeCRMId;
	}

	public void setHomeExchangeCRMId(String homeExchangeCRMId) {
		HomeExchangeCRMId = homeExchangeCRMId;
	}

	public String getFeatureCrmId() {
		return FeatureCrmId;
	}

	public void setFeatureCrmId(String featureCrmId) {
		FeatureCrmId = featureCrmId;
	}

	public int getActive() {
		return Active;
	}

	public void setActive(int active) {
		Active = active;
	}

	public String getDatoI1() {
		return DatoI1;
	}

	public void setDatoI1(String datoI1) {
		DatoI1 = datoI1;
	}

	public String getDatoI2() {
		return DatoI2;
	}

	public void setDatoI2(String datoI2) {
		DatoI2 = datoI2;
	}

	public String getCustomer1() {
		return Customer1;
	}

	public void setCustomer1(String customer1) {
		Customer1 = customer1;
	}

	public String getCustomer2() {
		return Customer2;
	}

	public void setCustomer2(String customer2) {
		Customer2 = customer2;
	}

	public String getCustomer3() {
		return Customer3;
	}

	public void setCustomer3(String customer3) {
		Customer3 = customer3;
	}

	public String getCustomer4() {
		return Customer4;
	}

	public void setCustomer4(String customer4) {
		Customer4 = customer4;
	}

	public int getIdServicio() {
		return IdServicio;
	}

	public void setIdServicio(int idServicio) {
		IdServicio = idServicio;
	}
	
	public Integer getId() {
		return Id;
	}
	
}
