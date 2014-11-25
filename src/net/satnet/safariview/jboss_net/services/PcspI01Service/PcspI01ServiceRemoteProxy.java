package net.satnet.safariview.jboss_net.services.PcspI01Service;

public class PcspI01ServiceRemoteProxy implements net.satnet.safariview.jboss_net.services.PcspI01Service.PcspI01ServiceRemote {
  private String _endpoint = null;
  private net.satnet.safariview.jboss_net.services.PcspI01Service.PcspI01ServiceRemote pcspI01ServiceRemote = null;
  
  public PcspI01ServiceRemoteProxy() {
    _initPcspI01ServiceRemoteProxy();
  }
  
  public PcspI01ServiceRemoteProxy(String endpoint) {
    _endpoint = endpoint;
    _initPcspI01ServiceRemoteProxy();
  }
  
  private void _initPcspI01ServiceRemoteProxy() {
    try {
      pcspI01ServiceRemote = (new net.satnet.safariview.jboss_net.services.PcspI01Service.PcspI01ServiceRemoteServiceLocator()).getPcspI01Service();
      if (pcspI01ServiceRemote != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)pcspI01ServiceRemote)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)pcspI01ServiceRemote)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (pcspI01ServiceRemote != null)
      ((javax.xml.rpc.Stub)pcspI01ServiceRemote)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public net.satnet.safariview.jboss_net.services.PcspI01Service.PcspI01ServiceRemote getPcspI01ServiceRemote() {
    if (pcspI01ServiceRemote == null)
      _initPcspI01ServiceRemoteProxy();
    return pcspI01ServiceRemote;
  }
  
  public com.packetcable.www.pcsp.i01.PcspObj[] get(com.packetcable.www.pcsp.i01.PcspArg[] args) throws java.rmi.RemoteException{
    if (pcspI01ServiceRemote == null)
      _initPcspI01ServiceRemoteProxy();
    return pcspI01ServiceRemote.get(args);
  }
  
  public com.packetcable.www.pcsp.i01.PcspObj[] put(com.packetcable.www.pcsp.i01.PcspObj[] objs) throws java.rmi.RemoteException{
    if (pcspI01ServiceRemote == null)
      _initPcspI01ServiceRemoteProxy();
    return pcspI01ServiceRemote.put(objs);
  }
  
  public com.packetcable.www.pcsp.i01.PcspObj[] delete(com.packetcable.www.pcsp.i01.PcspArg[] args) throws java.rmi.RemoteException{
    if (pcspI01ServiceRemote == null)
      _initPcspI01ServiceRemoteProxy();
    return pcspI01ServiceRemote.delete(args);
  }
  
  public com.packetcable.www.pcsp.i01.PcspObj[] modify(com.packetcable.www.pcsp.i01.PcspObj[] objs) throws java.rmi.RemoteException{
    if (pcspI01ServiceRemote == null)
      _initPcspI01ServiceRemoteProxy();
    return pcspI01ServiceRemote.modify(objs);
  }
  
  public com.packetcable.www.pcsp.i01.PcspObj[] auditMta(com.packetcable.www.pcsp.i01.PcspArg[] args) throws java.rmi.RemoteException{
    if (pcspI01ServiceRemote == null)
      _initPcspI01ServiceRemoteProxy();
    return pcspI01ServiceRemote.auditMta(args);
  }
  
  public int cmdStatus(boolean isCmd, int code, int subCode, java.lang.String vendorExtension) throws java.rmi.RemoteException{
    if (pcspI01ServiceRemote == null)
      _initPcspI01ServiceRemoteProxy();
    return pcspI01ServiceRemote.cmdStatus(isCmd, code, subCode, vendorExtension);
  }
  
  public java.lang.String test(java.lang.String string_1) throws java.rmi.RemoteException{
    if (pcspI01ServiceRemote == null)
      _initPcspI01ServiceRemoteProxy();
    return pcspI01ServiceRemote.test(string_1);
  }
  
  public com.cedarpointcom.safariview2.common.SVResponse makeRequest(com.cedarpointcom.safariview2.common.SVRequest in0) throws java.rmi.RemoteException{
    if (pcspI01ServiceRemote == null)
      _initPcspI01ServiceRemoteProxy();
    return pcspI01ServiceRemote.makeRequest(in0);
  }
  
  public java.lang.String login(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException{
    if (pcspI01ServiceRemote == null)
      _initPcspI01ServiceRemoteProxy();
    return pcspI01ServiceRemote.login(in0, in1, in2);
  }
  
  public void logout(java.lang.String in0) throws java.rmi.RemoteException{
    if (pcspI01ServiceRemote == null)
      _initPcspI01ServiceRemoteProxy();
    pcspI01ServiceRemote.logout(in0);
  }
  
  
}