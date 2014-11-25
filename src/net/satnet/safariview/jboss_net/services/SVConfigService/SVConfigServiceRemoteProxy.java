package net.satnet.safariview.jboss_net.services.SVConfigService;

public class SVConfigServiceRemoteProxy implements net.satnet.safariview.jboss_net.services.SVConfigService.SVConfigServiceRemote {
  private String _endpoint = null;
  private net.satnet.safariview.jboss_net.services.SVConfigService.SVConfigServiceRemote sVConfigServiceRemote = null;
  
  public SVConfigServiceRemoteProxy() {
    _initSVConfigServiceRemoteProxy();
  }
  
  public SVConfigServiceRemoteProxy(String endpoint) {
    _endpoint = endpoint;
    _initSVConfigServiceRemoteProxy();
  }
  
  private void _initSVConfigServiceRemoteProxy() {
    try {
      sVConfigServiceRemote = (new net.satnet.safariview.jboss_net.services.SVConfigService.SVConfigServiceRemoteServiceLocator()).getSVConfigService();
      if (sVConfigServiceRemote != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sVConfigServiceRemote)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sVConfigServiceRemote)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sVConfigServiceRemote != null)
      ((javax.xml.rpc.Stub)sVConfigServiceRemote)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public net.satnet.safariview.jboss_net.services.SVConfigService.SVConfigServiceRemote getSVConfigServiceRemote() {
    if (sVConfigServiceRemote == null)
      _initSVConfigServiceRemoteProxy();
    return sVConfigServiceRemote;
  }
  
  public com.cedarpointcom.www.SVConfigService.SVConfigResp sendRequest(com.cedarpointcom.safariview2.server.oss.config.SVConfigRequest in0) throws java.rmi.RemoteException{
    if (sVConfigServiceRemote == null)
      _initSVConfigServiceRemoteProxy();
    return sVConfigServiceRemote.sendRequest(in0);
  }
  
  public java.lang.String test(java.lang.String in0) throws java.rmi.RemoteException{
    if (sVConfigServiceRemote == null)
      _initSVConfigServiceRemoteProxy();
    return sVConfigServiceRemote.test(in0);
  }
  
  public java.lang.String login(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException{
    if (sVConfigServiceRemote == null)
      _initSVConfigServiceRemoteProxy();
    return sVConfigServiceRemote.login(in0, in1);
  }
  
  public void logout(java.lang.String in0) throws java.rmi.RemoteException{
    if (sVConfigServiceRemote == null)
      _initSVConfigServiceRemoteProxy();
    sVConfigServiceRemote.logout(in0);
  }
  
  
}