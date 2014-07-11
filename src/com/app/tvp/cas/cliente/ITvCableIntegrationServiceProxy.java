package com.app.tvp.cas.cliente;

public class ITvCableIntegrationServiceProxy implements com.app.tvp.cas.cliente.ITvCableIntegrationService {
  private String _endpoint = null;
  private com.app.tvp.cas.cliente.ITvCableIntegrationService iTvCableIntegrationService = null;
  
  public ITvCableIntegrationServiceProxy() {
    _initITvCableIntegrationServiceProxy();
  }
  
  public ITvCableIntegrationServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initITvCableIntegrationServiceProxy();
  }
  
  private void _initITvCableIntegrationServiceProxy() {
    try {
      iTvCableIntegrationService = (new com.app.tvp.cas.cliente.TvCableIntegrationServiceLocator()).getBasicHttpBinding_ITvCableIntegrationService();
      if (iTvCableIntegrationService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iTvCableIntegrationService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iTvCableIntegrationService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iTvCableIntegrationService != null)
      ((javax.xml.rpc.Stub)iTvCableIntegrationService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.app.tvp.cas.cliente.ITvCableIntegrationService getITvCableIntegrationService() {
    if (iTvCableIntegrationService == null)
      _initITvCableIntegrationServiceProxy();
    return iTvCableIntegrationService;
  }
  
  public com.app.tvp.cas.cliente.objetos.InstallResponse install(java.lang.String userName, java.lang.String password, java.lang.String sequence, java.lang.String smartCards, com.app.tvp.cas.cliente.objetos.SettopBox settopBox, java.lang.String[] packs, java.lang.String masterCard, java.lang.String userId, java.lang.String referenceNumber, java.lang.String notes, java.lang.String customerId, java.lang.String zone) throws java.rmi.RemoteException{
    if (iTvCableIntegrationService == null)
      _initITvCableIntegrationServiceProxy();
    return iTvCableIntegrationService.install(userName, password, sequence, smartCards, settopBox, packs, masterCard, userId, referenceNumber, notes, customerId, zone);
  }
  
  public com.app.tvp.cas.cliente.objetos.DisconnectResponse disconnect(java.lang.String userName, java.lang.String password, java.lang.String sequence, java.lang.String smartCards, java.lang.String userId, java.lang.String referenceNumber, java.lang.String notes, java.lang.String customerId, java.lang.String zone) throws java.rmi.RemoteException{
    if (iTvCableIntegrationService == null)
      _initITvCableIntegrationServiceProxy();
    return iTvCableIntegrationService.disconnect(userName, password, sequence, smartCards, userId, referenceNumber, notes, customerId, zone);
  }
  
  public com.app.tvp.cas.cliente.objetos.UpdateFirmwareResponse updateFirmware(java.lang.String userName, java.lang.String password, java.lang.String sequence, java.lang.String smartCards, java.lang.String userId, java.lang.String referenceNumber, java.lang.String notes, java.lang.String customerId, java.lang.String zone) throws java.rmi.RemoteException{
    if (iTvCableIntegrationService == null)
      _initITvCableIntegrationServiceProxy();
    return iTvCableIntegrationService.updateFirmware(userName, password, sequence, smartCards, userId, referenceNumber, notes, customerId, zone);
  }
  
  public com.app.tvp.cas.cliente.objetos.SendMessageResponse sendMessage(java.lang.String userName, java.lang.String password, java.lang.String sequence, java.lang.String smartCards, java.lang.String message, java.lang.String userId, java.lang.String referenceNumber, java.lang.String notes, java.lang.String customerId, java.lang.String zone) throws java.rmi.RemoteException{
    if (iTvCableIntegrationService == null)
      _initITvCableIntegrationServiceProxy();
    return iTvCableIntegrationService.sendMessage(userName, password, sequence, smartCards, message, userId, referenceNumber, notes, customerId, zone);
  }
  
  public com.app.tvp.cas.cliente.objetos.UpdatePinResponse updatePin(java.lang.String userName, java.lang.String password, java.lang.String sequence, java.lang.String smartCards, java.lang.String pin, java.lang.String userId, java.lang.String referenceNumber, java.lang.String notes, java.lang.String customerId, java.lang.String zone) throws java.rmi.RemoteException{
    if (iTvCableIntegrationService == null)
      _initITvCableIntegrationServiceProxy();
    return iTvCableIntegrationService.updatePin(userName, password, sequence, smartCards, pin, userId, referenceNumber, notes, customerId, zone);
  }
  
  public com.app.tvp.cas.cliente.objetos.ReSendKeyResponse reSendKey(java.lang.String userName, java.lang.String password, java.lang.String sequence, java.lang.String smartCards, java.lang.String userId, java.lang.String referenceNumber, java.lang.String notes, java.lang.String customerId, java.lang.String zone) throws java.rmi.RemoteException{
    if (iTvCableIntegrationService == null)
      _initITvCableIntegrationServiceProxy();
    return iTvCableIntegrationService.reSendKey(userName, password, sequence, smartCards, userId, referenceNumber, notes, customerId, zone);
  }
  
  public com.app.tvp.cas.cliente.objetos.RemovePacksResponse removePacks(java.lang.String userName, java.lang.String password, java.lang.String sequence, java.lang.String smartCards, java.lang.String[] packs, java.lang.String userId, java.lang.String referenceNumber, java.lang.String notes, java.lang.String customerId, java.lang.String zone) throws java.rmi.RemoteException{
    if (iTvCableIntegrationService == null)
      _initITvCableIntegrationServiceProxy();
    return iTvCableIntegrationService.removePacks(userName, password, sequence, smartCards, packs, userId, referenceNumber, notes, customerId, zone);
  }
  
  public com.app.tvp.cas.cliente.objetos.AddPacksResponse addPacks(java.lang.String userName, java.lang.String password, java.lang.String sequence, java.lang.String smartCards, java.lang.String[] packs, java.lang.String userId, java.lang.String referenceNumber, java.lang.String notes, java.lang.String customerId, java.lang.String zone) throws java.rmi.RemoteException{
    if (iTvCableIntegrationService == null)
      _initITvCableIntegrationServiceProxy();
    return iTvCableIntegrationService.addPacks(userName, password, sequence, smartCards, packs, userId, referenceNumber, notes, customerId, zone);
  }
  
  public com.app.tvp.cas.cliente.objetos.UninstallResponse uninstall(java.lang.String userName, java.lang.String password, java.lang.String sequence, java.lang.String smartCards, java.lang.String userId, java.lang.String referenceNumber, java.lang.String notes, java.lang.String customerId, java.lang.String zone) throws java.rmi.RemoteException{
    if (iTvCableIntegrationService == null)
      _initITvCableIntegrationServiceProxy();
    return iTvCableIntegrationService.uninstall(userName, password, sequence, smartCards, userId, referenceNumber, notes, customerId, zone);
  }
  
  public com.app.tvp.cas.cliente.objetos.ReconnectResponse reconnect(java.lang.String userName, java.lang.String password, java.lang.String sequence, java.lang.String smartCards, java.lang.String[] packs, java.lang.String userId, java.lang.String referenceNumber, java.lang.String notes, java.lang.String customerId, java.lang.String zone) throws java.rmi.RemoteException{
    if (iTvCableIntegrationService == null)
      _initITvCableIntegrationServiceProxy();
    return iTvCableIntegrationService.reconnect(userName, password, sequence, smartCards, packs, userId, referenceNumber, notes, customerId, zone);
  }
  
  public com.app.tvp.cas.cliente.objetos.EstatusResponse status(java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException{
    if (iTvCableIntegrationService == null)
      _initITvCableIntegrationServiceProxy();
    return iTvCableIntegrationService.status(userName, password);
  }
  
  public com.app.tvp.cas.cliente.objetos.ReScanChannelsResponse reScanChannels(java.lang.String userName, java.lang.String password, java.lang.String sequence, java.lang.String smartCards, java.lang.String userId, java.lang.String referenceNumber, java.lang.String notes, java.lang.String customerId, java.lang.String zone) throws java.rmi.RemoteException{
    if (iTvCableIntegrationService == null)
      _initITvCableIntegrationServiceProxy();
    return iTvCableIntegrationService.reScanChannels(userName, password, sequence, smartCards, userId, referenceNumber, notes, customerId, zone);
  }
  
  public com.app.tvp.cas.cliente.objetos.AddCarrierResponse addCarrier(java.lang.String userName, java.lang.String password, java.lang.String sequence, java.lang.String smartCards, java.lang.String carrier, java.lang.String userId, java.lang.String referenceNumber, java.lang.String notes, java.lang.String customerId, java.lang.String zone) throws java.rmi.RemoteException{
    if (iTvCableIntegrationService == null)
      _initITvCableIntegrationServiceProxy();
    return iTvCableIntegrationService.addCarrier(userName, password, sequence, smartCards, carrier, userId, referenceNumber, notes, customerId, zone);
  }
  
  public com.app.tvp.cas.cliente.objetos.ViewSetTopBoxIDResponse viewSetTopBoxID(java.lang.String userName, java.lang.String password, java.lang.String sequence, java.lang.String smartCards, java.lang.String userId, java.lang.String referenceNumber, java.lang.String notes, java.lang.String customerId, java.lang.String zone) throws java.rmi.RemoteException{
    if (iTvCableIntegrationService == null)
      _initITvCableIntegrationServiceProxy();
    return iTvCableIntegrationService.viewSetTopBoxID(userName, password, sequence, smartCards, userId, referenceNumber, notes, customerId, zone);
  }
  
  public com.app.tvp.cas.cliente.objetos.ResetSetTopBoxResponse resetSetTopBox(java.lang.String userName, java.lang.String password, java.lang.String sequence, java.lang.String smartCards, java.lang.String userId, java.lang.String referenceNumber, java.lang.String notes, java.lang.String customerId, java.lang.String zone) throws java.rmi.RemoteException{
    if (iTvCableIntegrationService == null)
      _initITvCableIntegrationServiceProxy();
    return iTvCableIntegrationService.resetSetTopBox(userName, password, sequence, smartCards, userId, referenceNumber, notes, customerId, zone);
  }
  
  public com.app.tvp.cas.cliente.objetos.UpdateCodeZoneResponse updateCodeZone(java.lang.String userName, java.lang.String password, java.lang.String sequence, java.lang.String smartCards, java.lang.String code, java.lang.String userId, java.lang.String referenceNumber, java.lang.String notes, java.lang.String customerId, java.lang.String zone) throws java.rmi.RemoteException{
    if (iTvCableIntegrationService == null)
      _initITvCableIntegrationServiceProxy();
    return iTvCableIntegrationService.updateCodeZone(userName, password, sequence, smartCards, code, userId, referenceNumber, notes, customerId, zone);
  }
  
  public com.app.tvp.cas.cliente.objetos.RebootSetTopBoxResponse rebootSetTopBox(java.lang.String userName, java.lang.String password, java.lang.String sequence, java.lang.String smartCards, java.lang.String userId, java.lang.String referenceNumber, java.lang.String notes, java.lang.String customerId, java.lang.String zone) throws java.rmi.RemoteException{
    if (iTvCableIntegrationService == null)
      _initITvCableIntegrationServiceProxy();
    return iTvCableIntegrationService.rebootSetTopBox(userName, password, sequence, smartCards, userId, referenceNumber, notes, customerId, zone);
  }
  
  public com.app.tvp.cas.cliente.objetos.ForceUpdateFirmwareResponse forceUpdateFirmware(java.lang.String userName, java.lang.String password, java.lang.String sequence, java.lang.String smartCards, java.lang.String userId, java.lang.String referenceNumber, java.lang.String notes, java.lang.String customerId, java.lang.String zone) throws java.rmi.RemoteException{
    if (iTvCableIntegrationService == null)
      _initITvCableIntegrationServiceProxy();
    return iTvCableIntegrationService.forceUpdateFirmware(userName, password, sequence, smartCards, userId, referenceNumber, notes, customerId, zone);
  }
  
  public com.app.tvp.cas.cliente.objetos.UpdateControlParentallResponse updateControlParentall(java.lang.String userName, java.lang.String password, java.lang.String sequence, java.lang.String smartCards, java.lang.String pin, java.lang.String userId, java.lang.String referenceNumber, java.lang.String notes, java.lang.String customerId, java.lang.String zone) throws java.rmi.RemoteException{
    if (iTvCableIntegrationService == null)
      _initITvCableIntegrationServiceProxy();
    return iTvCableIntegrationService.updateControlParentall(userName, password, sequence, smartCards, pin, userId, referenceNumber, notes, customerId, zone);
  }
  
  public com.app.tvp.cas.cliente.objetos.UpdateMenuPassResponse updateMenuPass(java.lang.String userName, java.lang.String password, java.lang.String sequence, java.lang.String smartCards, java.lang.String pin, java.lang.String userId, java.lang.String referenceNumber, java.lang.String notes, java.lang.String customerId, java.lang.String zone) throws java.rmi.RemoteException{
    if (iTvCableIntegrationService == null)
      _initITvCableIntegrationServiceProxy();
    return iTvCableIntegrationService.updateMenuPass(userName, password, sequence, smartCards, pin, userId, referenceNumber, notes, customerId, zone);
  }
  
  public com.app.tvp.cas.cliente.objetos.EGetSmartCardsInfoResponse getSmartCardsInfo(java.lang.String userName, java.lang.String password) throws java.rmi.RemoteException{
    if (iTvCableIntegrationService == null)
      _initITvCableIntegrationServiceProxy();
    return iTvCableIntegrationService.getSmartCardsInfo(userName, password);
  }
  
  public com.app.tvp.cas.cliente.objetos.EGetInformationResponse getInformation(java.lang.String userName, java.lang.String password, java.lang.String sequence, java.lang.String smartCards, java.lang.String userId, java.lang.String referenceNumber, java.lang.String notes, java.lang.String customerId, java.lang.String zone) throws java.rmi.RemoteException{
    if (iTvCableIntegrationService == null)
      _initITvCableIntegrationServiceProxy();
    return iTvCableIntegrationService.getInformation(userName, password, sequence, smartCards, userId, referenceNumber, notes, customerId, zone);
  }
  
  
}