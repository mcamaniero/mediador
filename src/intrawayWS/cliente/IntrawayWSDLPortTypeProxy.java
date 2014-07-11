package intrawayWS.cliente;

import intrawayWS.cliente.holders.ArrayOfActivityObjOutputHolder;
import intrawayWS.cliente.holders.ArrayOfAuditObjOutputHolder;
import intrawayWS.cliente.holders.ArrayOfCatalogsOutputHolder;
import intrawayWS.cliente.holders.ArrayOfDocsisTrafficReportObjOutputHolder;
import intrawayWS.cliente.holders.ArrayOfPPVReportObjOutputHolder;
import intrawayWS.cliente.holders.ArrayOfPpvProductsHolder;
import intrawayWS.cliente.holders.ArrayOfReportObjOutputHolder;
import intrawayWS.cliente.holders.ArrayOfTicketReportOutputHolder;
import intrawayWS.cliente.holders.DocsisStatusObjOutputHolder;

import java.rmi.RemoteException;

import javax.xml.rpc.holders.StringHolder;

public class IntrawayWSDLPortTypeProxy implements IntrawayWSDLPortType {
  private String _endpoint = null;
  private IntrawayWSDLPortType intrawayWSDLPortType = null;
  
  public IntrawayWSDLPortTypeProxy() {
    _initIntrawayWSDLPortTypeProxy();
  }
  
  public IntrawayWSDLPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initIntrawayWSDLPortTypeProxy();
  }
  
  private void _initIntrawayWSDLPortTypeProxy() {
    try {
      intrawayWSDLPortType = (new IntrawayWSDLLocator()).getIntrawayWSDLPort();
      if (intrawayWSDLPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)intrawayWSDLPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)intrawayWSDLPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (intrawayWSDLPortType != null)
      ((javax.xml.rpc.Stub)intrawayWSDLPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public IntrawayWSDLPortType getIntrawayWSDLPortType() {
    if (intrawayWSDLPortType == null)
      _initIntrawayWSDLPortTypeProxy();
    return intrawayWSDLPortType;
  }

public ActivateADSLOutput activateADSL(String authKey, ActivateADSLInput input)
		throws RemoteException {
	// TODO Auto-generated method stub
	return null;
}

public void audit(String authKey, String idEmpresaCRM, String idClienteCRM,
		String cantRecords, String xmlEncoding, StringHolder idError,
		StringHolder errorStr, ArrayOfAuditObjOutputHolder report)
		throws RemoteException {
	// TODO Auto-generated method stub
	
}

public CreateTempMTAOutput createTempMTA(String authKey,
		CreateTempMTAInput input) throws RemoteException {
	// TODO Auto-generated method stub
	return null;
}

public CreateTempSIPDeviceOutput createTempSIPDevice(String authKey,
		CreateTempSIPDeviceInput input) throws RemoteException {
	// TODO Auto-generated method stub
	return null;
}

public void getActivity(String authKey, String xmlEncoding,
		StringHolder idError, StringHolder errorStr,
		ArrayOfActivityObjOutputHolder arrayOfActivityObjOutput)
		throws RemoteException {
	// TODO Auto-generated method stub
	
}

public void getCustomReport(String authKey, String showProducts,
		StringHolder idError, StringHolder errorStr,
		ArrayOfReportObjOutputHolder report) throws RemoteException {
	// TODO Auto-generated method stub
	
}

public void getDocsisStatus(String authKey, String idEmpresaCRM,
		String idServicio, String idVenta, String idProducto,
		String xmlEncoding, StringHolder idError, StringHolder errorStr,
		DocsisStatusObjOutputHolder docsisStatusObjOutput)
		throws RemoteException {
	// TODO Auto-generated method stub
	
}

public void getDocsisTrafficReport(String authKey, String idEmpresaCRM,
		String idClienteCRM, String cantRecords, String fromDate,
		String toDate, StringHolder idError, StringHolder errorStr,
		ArrayOfDocsisTrafficReportObjOutputHolder report)
		throws RemoteException {
	// TODO Auto-generated method stub
	
}

public void getPPVCatalog(String authKey, String idEmpresa,
		String controllerType, int cantRecords, String xmlEncoding,
		StringHolder idError, StringHolder errorStr,
		ArrayOfPpvProductsHolder catalog) throws RemoteException {
	// TODO Auto-generated method stub
	
}

public void getPPVMenu(String authKey, String xmlEncoding,
		StringHolder idError, StringHolder errorStr,
		ArrayOfCatalogsOutputHolder catalog) throws RemoteException {
	// TODO Auto-generated method stub
	
}

public void getPPVReport(String authKey, String idClienteCRM,
		String idEmpresaCRM, String idProducto, String idVenta,
		String idServicio, String controllerType, String controllerCRMId,
		int purchaseId, int cantRecords, String xmlEncoding,
		StringHolder idError, StringHolder errorStr,
		ArrayOfPPVReportObjOutputHolder report) throws RemoteException {
	// TODO Auto-generated method stub
	
}

public void getPPVTickets(String authKey, String ticketId, String cantRecords,
		String xmlEncoding, StringHolder idError, StringHolder errorStr,
		StringHolder unknownPurchases, ArrayOfTicketReportOutputHolder report)
		throws RemoteException {
	// TODO Auto-generated method stub
	
}

public void getReport(String authKey, String idEmpresaCRM, String idClienteCRM,
		String cantRecords, ReportObjInput showProducts, StringHolder idError,
		StringHolder errorStr, ArrayOfReportObjOutputHolder report)
		throws RemoteException {
	// TODO Auto-generated method stub
	
}

public InternalObjOutput internal(String authKey, String xmlEncoding)
		throws RemoteException {
	// TODO Auto-generated method stub
	return null;
}

public MaintenanceObjOutput[] maintenance(String authKey,
		MaintenanceObjInput[] arrayOfMaintenanceObjInput)
		throws RemoteException {
	// TODO Auto-generated method stub
	return null;
}

public InterfaceObjOutput[] put(String authKey,
		InterfaceObjInput[] arrayOfInterfaceObjInput, String doAtomic)
		throws RemoteException {
	// TODO Auto-generated method stub
	return null;
}
  
  
}