/**
 * IntrawayWSDLPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package intrawayWS.cliente;

public interface IntrawayWSDLPortType extends java.rmi.Remote {

    /**
     * Este es el metodo put.....
     */
    public intrawayWS.cliente.InterfaceObjOutput[] put(java.lang.String authKey, intrawayWS.cliente.InterfaceObjInput[] arrayOfInterfaceObjInput, java.lang.String doAtomic) throws java.rmi.RemoteException;

    /**
     * Este es el metodo GetActivity.....
     */
    public void getActivity(java.lang.String authKey, java.lang.String xmlEncoding, javax.xml.rpc.holders.StringHolder idError, javax.xml.rpc.holders.StringHolder errorStr, intrawayWS.cliente.holders.ArrayOfActivityObjOutputHolder arrayOfActivityObjOutput) throws java.rmi.RemoteException;

    /**
     * XMLEncoding: &lt;DocsisStatusParameters&gt;&lt;getBasicData&gt;&lt;status&gt;TRUE&lt;/status&gt;&lt;/getBasicData&gt;&lt;getCMLeases&gt;&lt;status&gt;FALSE&lt;/status&gt;&lt;order&gt;DESC&lt;/order&gt;&lt;cantRecords&gt;50&lt;/cantRecords&gt;&lt;/getCMLeases&gt;&lt;getMTALeases&gt;&lt;status&gt;FALSE&lt;/status&gt;&lt;order&gt;DESC&lt;/order&gt;&lt;cantRecords&gt;50&lt;/cantRecords&gt;&lt;/getMTALeases&gt;&lt;getCPELeases&gt;&lt;status&gt;FALSE&lt;/status&gt;&lt;order&gt;DESC&lt;/order&gt;&lt;cantRecords&gt;50&lt;/cantRecords&gt;&lt;/getCPELeases&gt;&lt;getSPDescription&gt;&lt;status&gt;FALSE&lt;/status&gt;&lt;/getSPDescription&gt;&lt;getPoolingData&gt;&lt;status&gt;FALSE&lt;/status&gt;&lt;order&gt;ASC&lt;/order&gt;&lt;cantRecords&gt;ALL&lt;/cantRecords&gt;&lt;/getPoolingData&gt;&lt;/DocsisStatusParameters&gt;
     */
    public void getDocsisStatus(java.lang.String authKey, java.lang.String idEmpresaCRM, java.lang.String idServicio, java.lang.String idVenta, java.lang.String idProducto, java.lang.String xmlEncoding, javax.xml.rpc.holders.StringHolder idError, javax.xml.rpc.holders.StringHolder errorStr, intrawayWS.cliente.holders.DocsisStatusObjOutputHolder docsisStatusObjOutput) throws java.rmi.RemoteException;

    /**
     * Este es el metodo Maintenance.....
     */
    public intrawayWS.cliente.MaintenanceObjOutput[] maintenance(java.lang.String authKey, intrawayWS.cliente.MaintenanceObjInput[] arrayOfMaintenanceObjInput) throws java.rmi.RemoteException;

    /**
     * Este es el metodo Internal.....
     */
    public intrawayWS.cliente.InternalObjOutput internal(java.lang.String authKey, java.lang.String xmlEncoding) throws java.rmi.RemoteException;

    /**
     * Este es el metodo createTempMTA.....
     */
    public intrawayWS.cliente.CreateTempMTAOutput createTempMTA(java.lang.String authKey, intrawayWS.cliente.CreateTempMTAInput input) throws java.rmi.RemoteException;

    /**
     * Este es el metodo createTempSIPDevice.....
     */
    public intrawayWS.cliente.CreateTempSIPDeviceOutput createTempSIPDevice(java.lang.String authKey, intrawayWS.cliente.CreateTempSIPDeviceInput input) throws java.rmi.RemoteException;

    /**
     * Este es el metodo activateADSL.....
     */
    public intrawayWS.cliente.ActivateADSLOutput activateADSL(java.lang.String authKey, intrawayWS.cliente.ActivateADSLInput input) throws java.rmi.RemoteException;

    /**
     * Este es el metodo GetReport.....
     */
    public void getReport(java.lang.String authKey, java.lang.String idEmpresaCRM, java.lang.String idClienteCRM, java.lang.String cantRecords, intrawayWS.cliente.ReportObjInput showProducts, javax.xml.rpc.holders.StringHolder idError, javax.xml.rpc.holders.StringHolder errorStr, intrawayWS.cliente.holders.ArrayOfReportObjOutputHolder report) throws java.rmi.RemoteException;

    /**
     * Este es el metodo GetCustomReport.....
     */
    public void getCustomReport(java.lang.String authKey, java.lang.String showProducts, javax.xml.rpc.holders.StringHolder idError, javax.xml.rpc.holders.StringHolder errorStr, intrawayWS.cliente.holders.ArrayOfReportObjOutputHolder report) throws java.rmi.RemoteException;

    /**
     * M&eacute;todo SOAP para la obtenci&oacute;n de Reportes de
     * Tr&aacute;fico de Cable Modems DOCSIS entre dos fechas DD/MM/YYYY.
     * idClienteCRM debe ser el C&oacute;d. de Cliente del &uacute;ltimo
     * cliente obtenido o vac&iacute;o.
     */
    public void getDocsisTrafficReport(java.lang.String authKey, java.lang.String idEmpresaCRM, java.lang.String idClienteCRM, java.lang.String cantRecords, java.lang.String fromDate, java.lang.String toDate, javax.xml.rpc.holders.StringHolder idError, javax.xml.rpc.holders.StringHolder errorStr, intrawayWS.cliente.holders.ArrayOfDocsisTrafficReportObjOutputHolder report) throws java.rmi.RemoteException;

    /**
     * M&eacute;todo SOAP para la obtenci&oacute;n de Reportes para
     * Auditor&iacute;a.
     */
    public void audit(java.lang.String authKey, java.lang.String idEmpresaCRM, java.lang.String idClienteCRM, java.lang.String cantRecords, java.lang.String xmlEncoding, javax.xml.rpc.holders.StringHolder idError, javax.xml.rpc.holders.StringHolder errorStr, intrawayWS.cliente.holders.ArrayOfAuditObjOutputHolder report) throws java.rmi.RemoteException;

    /**
     * M&eacute;todo SOAP para la obtenci&oacute;n de Reportes de
     * PPV.
     */
    public void getPPVReport(java.lang.String authKey, java.lang.String idClienteCRM, java.lang.String idEmpresaCRM, java.lang.String idProducto, java.lang.String idVenta, java.lang.String idServicio, java.lang.String controllerType, java.lang.String controllerCRMId, int purchaseId, int cantRecords, java.lang.String xmlEncoding, javax.xml.rpc.holders.StringHolder idError, javax.xml.rpc.holders.StringHolder errorStr, intrawayWS.cliente.holders.ArrayOfPPVReportObjOutputHolder report) throws java.rmi.RemoteException;

    /**
     * M&eacute;todo SOAP para la obtenci&oacute;n del catalogo de
     * productos de PPV.
     */
    public void getPPVCatalog(java.lang.String authKey, java.lang.String idEmpresa, java.lang.String controllerType, int cantRecords, java.lang.String xmlEncoding, javax.xml.rpc.holders.StringHolder idError, javax.xml.rpc.holders.StringHolder errorStr, intrawayWS.cliente.holders.ArrayOfPpvProductsHolder catalog) throws java.rmi.RemoteException;

    /**
     * M&eacute;todo SOAP para la obtenci&oacute;n del Cat&aacute;logo
     * de Productos de PPV.
     */
    public void getPPVMenu(java.lang.String authKey, java.lang.String xmlEncoding, javax.xml.rpc.holders.StringHolder idError, javax.xml.rpc.holders.StringHolder errorStr, intrawayWS.cliente.holders.ArrayOfCatalogsOutputHolder catalog) throws java.rmi.RemoteException;

    /**
     * M&eacute;todo SOAP para la obtenci&oacute;n del Reporte de
     * Tickets de Productos de PPV.
     */
    public void getPPVTickets(java.lang.String authKey, java.lang.String ticketId, java.lang.String cantRecords, java.lang.String xmlEncoding, javax.xml.rpc.holders.StringHolder idError, javax.xml.rpc.holders.StringHolder errorStr, javax.xml.rpc.holders.StringHolder unknownPurchases, intrawayWS.cliente.holders.ArrayOfTicketReportOutputHolder report) throws java.rmi.RemoteException;
}
