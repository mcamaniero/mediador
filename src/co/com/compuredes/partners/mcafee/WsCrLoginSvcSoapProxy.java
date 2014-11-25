package co.com.compuredes.partners.mcafee;

public class WsCrLoginSvcSoapProxy implements co.com.compuredes.partners.mcafee.WsCrLoginSvcSoap {
  private String _endpoint = null;
  private co.com.compuredes.partners.mcafee.WsCrLoginSvcSoap wsCrLoginSvcSoap = null;
  
  public WsCrLoginSvcSoapProxy() {
    _initWsCrLoginSvcSoapProxy();
  }
  
  public WsCrLoginSvcSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWsCrLoginSvcSoapProxy();
  }
  
  private void _initWsCrLoginSvcSoapProxy() {
    try {
      wsCrLoginSvcSoap = (new co.com.compuredes.partners.mcafee.WsCrLoginSvcLocator()).getwsCrLoginSvcSoap();
      if (wsCrLoginSvcSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wsCrLoginSvcSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wsCrLoginSvcSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wsCrLoginSvcSoap != null)
      ((javax.xml.rpc.Stub)wsCrLoginSvcSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public co.com.compuredes.partners.mcafee.WsCrLoginSvcSoap getWsCrLoginSvcSoap() {
    if (wsCrLoginSvcSoap == null)
      _initWsCrLoginSvcSoapProxy();
    return wsCrLoginSvcSoap;
  }
  
  public java.lang.String wmCreateSession(int tipoLogin) throws java.rmi.RemoteException{
    if (wsCrLoginSvcSoap == null)
      _initWsCrLoginSvcSoapProxy();
    return wsCrLoginSvcSoap.wmCreateSession(tipoLogin);
  }
  
  
}