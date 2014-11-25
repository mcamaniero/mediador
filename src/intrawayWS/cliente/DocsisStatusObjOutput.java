/**
 * DocsisStatusObjOutput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package intrawayWS.cliente;

public class DocsisStatusObjOutput  implements java.io.Serializable {
    private java.lang.String idClienteCRM;

    private java.lang.String nombre;

    private java.lang.String username;

    private java.lang.String macaddress;

    private java.lang.String productName;

    private java.lang.String manufacturer;

    private java.lang.String hwv;

    private java.lang.String swv;

    private java.lang.String ip;

    private java.lang.String cmts;

    private java.lang.String upStream;

    private java.lang.String downStream;

    private java.lang.String ispCM;

    private java.lang.String ispMTA;

    private java.lang.String ispCPE;

    private java.lang.String servicePackage;

    private java.lang.String servicePackageID;

    private java.lang.String dpiPackage;

    private java.lang.String docsisVersion;

    private java.lang.String cantPCs;

    private java.lang.String disabled;

    private java.lang.String cantMensajes;

    private java.lang.String upTraffic;

    private java.lang.String downTraffic;

    private java.lang.String hub;

    private java.lang.String nodo;

    private java.lang.String cmStatus;

    private java.lang.String uspl;

    private java.lang.String dspl;

    private java.lang.String dssnr;

    private java.lang.String ussnr;

    private java.lang.String pollingSource;

    private java.lang.String pollingDate;

    private java.lang.String pollingage;

    private java.lang.String sysuptime;

    private java.lang.String status;

    private intrawayWS.cliente.LeasesObj[] cmLeases;

    private intrawayWS.cliente.LeasesObj[] cpeLeases;

    private intrawayWS.cliente.LeasesObj[] mtaLeases;

    private intrawayWS.cliente.MensajesObj[] mensajes;

    private intrawayWS.cliente.PoolingObj[] pooling;

    private intrawayWS.cliente.SpDescriptionObj spDescription;

    private java.lang.String mtaCMSName;

    private java.lang.String mtaMacAddress;

    private java.lang.String mtaHostname;

    private java.lang.String mtaFQDN;

    private java.lang.String mtaIPAddress;

    private java.lang.String pktcMtaDevProvStateCode;

    private java.lang.String pktcMtaDevProvStateString;

    private java.lang.String epStatus;

    private java.lang.String iCmNetworkUsage;

    private java.lang.String iMtaNetworkUsage;

    private java.lang.String iCpeNetworkUsage;

    private java.lang.String cmActivationCode;

    private java.lang.String cmFechaAlta;

    private java.lang.String cmFechaActivacion;

    private java.lang.String cmFechaModificacion;

    private java.lang.String mtaActivationCode;

    private java.lang.String mtaFechaAlta;

    private java.lang.String mtaFechaActivacion;

    private java.lang.String mtaFechaModificacion;

    private java.lang.String serialNumber;

    public DocsisStatusObjOutput() {
    }

    public DocsisStatusObjOutput(
           java.lang.String idClienteCRM,
           java.lang.String nombre,
           java.lang.String username,
           java.lang.String macaddress,
           java.lang.String productName,
           java.lang.String manufacturer,
           java.lang.String hwv,
           java.lang.String swv,
           java.lang.String ip,
           java.lang.String cmts,
           java.lang.String upStream,
           java.lang.String downStream,
           java.lang.String ispCM,
           java.lang.String ispMTA,
           java.lang.String ispCPE,
           java.lang.String servicePackage,
           java.lang.String servicePackageID,
           java.lang.String dpiPackage,
           java.lang.String docsisVersion,
           java.lang.String cantPCs,
           java.lang.String disabled,
           java.lang.String cantMensajes,
           java.lang.String upTraffic,
           java.lang.String downTraffic,
           java.lang.String hub,
           java.lang.String nodo,
           java.lang.String cmStatus,
           java.lang.String uspl,
           java.lang.String dspl,
           java.lang.String dssnr,
           java.lang.String ussnr,
           java.lang.String pollingSource,
           java.lang.String pollingDate,
           java.lang.String pollingage,
           java.lang.String sysuptime,
           java.lang.String status,
           intrawayWS.cliente.LeasesObj[] cmLeases,
           intrawayWS.cliente.LeasesObj[] cpeLeases,
           intrawayWS.cliente.LeasesObj[] mtaLeases,
           intrawayWS.cliente.MensajesObj[] mensajes,
           intrawayWS.cliente.PoolingObj[] pooling,
           intrawayWS.cliente.SpDescriptionObj spDescription,
           java.lang.String mtaCMSName,
           java.lang.String mtaMacAddress,
           java.lang.String mtaHostname,
           java.lang.String mtaFQDN,
           java.lang.String mtaIPAddress,
           java.lang.String pktcMtaDevProvStateCode,
           java.lang.String pktcMtaDevProvStateString,
           java.lang.String epStatus,
           java.lang.String iCmNetworkUsage,
           java.lang.String iMtaNetworkUsage,
           java.lang.String iCpeNetworkUsage,
           java.lang.String cmActivationCode,
           java.lang.String cmFechaAlta,
           java.lang.String cmFechaActivacion,
           java.lang.String cmFechaModificacion,
           java.lang.String mtaActivationCode,
           java.lang.String mtaFechaAlta,
           java.lang.String mtaFechaActivacion,
           java.lang.String mtaFechaModificacion,
           java.lang.String serialNumber) {
           this.idClienteCRM = idClienteCRM;
           this.nombre = nombre;
           this.username = username;
           this.macaddress = macaddress;
           this.productName = productName;
           this.manufacturer = manufacturer;
           this.hwv = hwv;
           this.swv = swv;
           this.ip = ip;
           this.cmts = cmts;
           this.upStream = upStream;
           this.downStream = downStream;
           this.ispCM = ispCM;
           this.ispMTA = ispMTA;
           this.ispCPE = ispCPE;
           this.servicePackage = servicePackage;
           this.servicePackageID = servicePackageID;
           this.dpiPackage = dpiPackage;
           this.docsisVersion = docsisVersion;
           this.cantPCs = cantPCs;
           this.disabled = disabled;
           this.cantMensajes = cantMensajes;
           this.upTraffic = upTraffic;
           this.downTraffic = downTraffic;
           this.hub = hub;
           this.nodo = nodo;
           this.cmStatus = cmStatus;
           this.uspl = uspl;
           this.dspl = dspl;
           this.dssnr = dssnr;
           this.ussnr = ussnr;
           this.pollingSource = pollingSource;
           this.pollingDate = pollingDate;
           this.pollingage = pollingage;
           this.sysuptime = sysuptime;
           this.status = status;
           this.cmLeases = cmLeases;
           this.cpeLeases = cpeLeases;
           this.mtaLeases = mtaLeases;
           this.mensajes = mensajes;
           this.pooling = pooling;
           this.spDescription = spDescription;
           this.mtaCMSName = mtaCMSName;
           this.mtaMacAddress = mtaMacAddress;
           this.mtaHostname = mtaHostname;
           this.mtaFQDN = mtaFQDN;
           this.mtaIPAddress = mtaIPAddress;
           this.pktcMtaDevProvStateCode = pktcMtaDevProvStateCode;
           this.pktcMtaDevProvStateString = pktcMtaDevProvStateString;
           this.epStatus = epStatus;
           this.iCmNetworkUsage = iCmNetworkUsage;
           this.iMtaNetworkUsage = iMtaNetworkUsage;
           this.iCpeNetworkUsage = iCpeNetworkUsage;
           this.cmActivationCode = cmActivationCode;
           this.cmFechaAlta = cmFechaAlta;
           this.cmFechaActivacion = cmFechaActivacion;
           this.cmFechaModificacion = cmFechaModificacion;
           this.mtaActivationCode = mtaActivationCode;
           this.mtaFechaAlta = mtaFechaAlta;
           this.mtaFechaActivacion = mtaFechaActivacion;
           this.mtaFechaModificacion = mtaFechaModificacion;
           this.serialNumber = serialNumber;
    }


    /**
     * Gets the idClienteCRM value for this DocsisStatusObjOutput.
     * 
     * @return idClienteCRM
     */
    public java.lang.String getIdClienteCRM() {
        return idClienteCRM;
    }


    /**
     * Sets the idClienteCRM value for this DocsisStatusObjOutput.
     * 
     * @param idClienteCRM
     */
    public void setIdClienteCRM(java.lang.String idClienteCRM) {
        this.idClienteCRM = idClienteCRM;
    }


    /**
     * Gets the nombre value for this DocsisStatusObjOutput.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this DocsisStatusObjOutput.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the username value for this DocsisStatusObjOutput.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this DocsisStatusObjOutput.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }


    /**
     * Gets the macaddress value for this DocsisStatusObjOutput.
     * 
     * @return macaddress
     */
    public java.lang.String getMacaddress() {
        return macaddress;
    }


    /**
     * Sets the macaddress value for this DocsisStatusObjOutput.
     * 
     * @param macaddress
     */
    public void setMacaddress(java.lang.String macaddress) {
        this.macaddress = macaddress;
    }


    /**
     * Gets the productName value for this DocsisStatusObjOutput.
     * 
     * @return productName
     */
    public java.lang.String getProductName() {
        return productName;
    }


    /**
     * Sets the productName value for this DocsisStatusObjOutput.
     * 
     * @param productName
     */
    public void setProductName(java.lang.String productName) {
        this.productName = productName;
    }


    /**
     * Gets the manufacturer value for this DocsisStatusObjOutput.
     * 
     * @return manufacturer
     */
    public java.lang.String getManufacturer() {
        return manufacturer;
    }


    /**
     * Sets the manufacturer value for this DocsisStatusObjOutput.
     * 
     * @param manufacturer
     */
    public void setManufacturer(java.lang.String manufacturer) {
        this.manufacturer = manufacturer;
    }


    /**
     * Gets the hwv value for this DocsisStatusObjOutput.
     * 
     * @return hwv
     */
    public java.lang.String getHwv() {
        return hwv;
    }


    /**
     * Sets the hwv value for this DocsisStatusObjOutput.
     * 
     * @param hwv
     */
    public void setHwv(java.lang.String hwv) {
        this.hwv = hwv;
    }


    /**
     * Gets the swv value for this DocsisStatusObjOutput.
     * 
     * @return swv
     */
    public java.lang.String getSwv() {
        return swv;
    }


    /**
     * Sets the swv value for this DocsisStatusObjOutput.
     * 
     * @param swv
     */
    public void setSwv(java.lang.String swv) {
        this.swv = swv;
    }


    /**
     * Gets the ip value for this DocsisStatusObjOutput.
     * 
     * @return ip
     */
    public java.lang.String getIp() {
        return ip;
    }


    /**
     * Sets the ip value for this DocsisStatusObjOutput.
     * 
     * @param ip
     */
    public void setIp(java.lang.String ip) {
        this.ip = ip;
    }


    /**
     * Gets the cmts value for this DocsisStatusObjOutput.
     * 
     * @return cmts
     */
    public java.lang.String getCmts() {
        return cmts;
    }


    /**
     * Sets the cmts value for this DocsisStatusObjOutput.
     * 
     * @param cmts
     */
    public void setCmts(java.lang.String cmts) {
        this.cmts = cmts;
    }


    /**
     * Gets the upStream value for this DocsisStatusObjOutput.
     * 
     * @return upStream
     */
    public java.lang.String getUpStream() {
        return upStream;
    }


    /**
     * Sets the upStream value for this DocsisStatusObjOutput.
     * 
     * @param upStream
     */
    public void setUpStream(java.lang.String upStream) {
        this.upStream = upStream;
    }


    /**
     * Gets the downStream value for this DocsisStatusObjOutput.
     * 
     * @return downStream
     */
    public java.lang.String getDownStream() {
        return downStream;
    }


    /**
     * Sets the downStream value for this DocsisStatusObjOutput.
     * 
     * @param downStream
     */
    public void setDownStream(java.lang.String downStream) {
        this.downStream = downStream;
    }


    /**
     * Gets the ispCM value for this DocsisStatusObjOutput.
     * 
     * @return ispCM
     */
    public java.lang.String getIspCM() {
        return ispCM;
    }


    /**
     * Sets the ispCM value for this DocsisStatusObjOutput.
     * 
     * @param ispCM
     */
    public void setIspCM(java.lang.String ispCM) {
        this.ispCM = ispCM;
    }


    /**
     * Gets the ispMTA value for this DocsisStatusObjOutput.
     * 
     * @return ispMTA
     */
    public java.lang.String getIspMTA() {
        return ispMTA;
    }


    /**
     * Sets the ispMTA value for this DocsisStatusObjOutput.
     * 
     * @param ispMTA
     */
    public void setIspMTA(java.lang.String ispMTA) {
        this.ispMTA = ispMTA;
    }


    /**
     * Gets the ispCPE value for this DocsisStatusObjOutput.
     * 
     * @return ispCPE
     */
    public java.lang.String getIspCPE() {
        return ispCPE;
    }


    /**
     * Sets the ispCPE value for this DocsisStatusObjOutput.
     * 
     * @param ispCPE
     */
    public void setIspCPE(java.lang.String ispCPE) {
        this.ispCPE = ispCPE;
    }


    /**
     * Gets the servicePackage value for this DocsisStatusObjOutput.
     * 
     * @return servicePackage
     */
    public java.lang.String getServicePackage() {
        return servicePackage;
    }


    /**
     * Sets the servicePackage value for this DocsisStatusObjOutput.
     * 
     * @param servicePackage
     */
    public void setServicePackage(java.lang.String servicePackage) {
        this.servicePackage = servicePackage;
    }


    /**
     * Gets the servicePackageID value for this DocsisStatusObjOutput.
     * 
     * @return servicePackageID
     */
    public java.lang.String getServicePackageID() {
        return servicePackageID;
    }


    /**
     * Sets the servicePackageID value for this DocsisStatusObjOutput.
     * 
     * @param servicePackageID
     */
    public void setServicePackageID(java.lang.String servicePackageID) {
        this.servicePackageID = servicePackageID;
    }


    /**
     * Gets the dpiPackage value for this DocsisStatusObjOutput.
     * 
     * @return dpiPackage
     */
    public java.lang.String getDpiPackage() {
        return dpiPackage;
    }


    /**
     * Sets the dpiPackage value for this DocsisStatusObjOutput.
     * 
     * @param dpiPackage
     */
    public void setDpiPackage(java.lang.String dpiPackage) {
        this.dpiPackage = dpiPackage;
    }


    /**
     * Gets the docsisVersion value for this DocsisStatusObjOutput.
     * 
     * @return docsisVersion
     */
    public java.lang.String getDocsisVersion() {
        return docsisVersion;
    }


    /**
     * Sets the docsisVersion value for this DocsisStatusObjOutput.
     * 
     * @param docsisVersion
     */
    public void setDocsisVersion(java.lang.String docsisVersion) {
        this.docsisVersion = docsisVersion;
    }


    /**
     * Gets the cantPCs value for this DocsisStatusObjOutput.
     * 
     * @return cantPCs
     */
    public java.lang.String getCantPCs() {
        return cantPCs;
    }


    /**
     * Sets the cantPCs value for this DocsisStatusObjOutput.
     * 
     * @param cantPCs
     */
    public void setCantPCs(java.lang.String cantPCs) {
        this.cantPCs = cantPCs;
    }


    /**
     * Gets the disabled value for this DocsisStatusObjOutput.
     * 
     * @return disabled
     */
    public java.lang.String getDisabled() {
        return disabled;
    }


    /**
     * Sets the disabled value for this DocsisStatusObjOutput.
     * 
     * @param disabled
     */
    public void setDisabled(java.lang.String disabled) {
        this.disabled = disabled;
    }


    /**
     * Gets the cantMensajes value for this DocsisStatusObjOutput.
     * 
     * @return cantMensajes
     */
    public java.lang.String getCantMensajes() {
        return cantMensajes;
    }


    /**
     * Sets the cantMensajes value for this DocsisStatusObjOutput.
     * 
     * @param cantMensajes
     */
    public void setCantMensajes(java.lang.String cantMensajes) {
        this.cantMensajes = cantMensajes;
    }


    /**
     * Gets the upTraffic value for this DocsisStatusObjOutput.
     * 
     * @return upTraffic
     */
    public java.lang.String getUpTraffic() {
        return upTraffic;
    }


    /**
     * Sets the upTraffic value for this DocsisStatusObjOutput.
     * 
     * @param upTraffic
     */
    public void setUpTraffic(java.lang.String upTraffic) {
        this.upTraffic = upTraffic;
    }


    /**
     * Gets the downTraffic value for this DocsisStatusObjOutput.
     * 
     * @return downTraffic
     */
    public java.lang.String getDownTraffic() {
        return downTraffic;
    }


    /**
     * Sets the downTraffic value for this DocsisStatusObjOutput.
     * 
     * @param downTraffic
     */
    public void setDownTraffic(java.lang.String downTraffic) {
        this.downTraffic = downTraffic;
    }


    /**
     * Gets the hub value for this DocsisStatusObjOutput.
     * 
     * @return hub
     */
    public java.lang.String getHub() {
        return hub;
    }


    /**
     * Sets the hub value for this DocsisStatusObjOutput.
     * 
     * @param hub
     */
    public void setHub(java.lang.String hub) {
        this.hub = hub;
    }


    /**
     * Gets the nodo value for this DocsisStatusObjOutput.
     * 
     * @return nodo
     */
    public java.lang.String getNodo() {
        return nodo;
    }


    /**
     * Sets the nodo value for this DocsisStatusObjOutput.
     * 
     * @param nodo
     */
    public void setNodo(java.lang.String nodo) {
        this.nodo = nodo;
    }


    /**
     * Gets the cmStatus value for this DocsisStatusObjOutput.
     * 
     * @return cmStatus
     */
    public java.lang.String getCmStatus() {
        return cmStatus;
    }


    /**
     * Sets the cmStatus value for this DocsisStatusObjOutput.
     * 
     * @param cmStatus
     */
    public void setCmStatus(java.lang.String cmStatus) {
        this.cmStatus = cmStatus;
    }


    /**
     * Gets the uspl value for this DocsisStatusObjOutput.
     * 
     * @return uspl
     */
    public java.lang.String getUspl() {
        return uspl;
    }


    /**
     * Sets the uspl value for this DocsisStatusObjOutput.
     * 
     * @param uspl
     */
    public void setUspl(java.lang.String uspl) {
        this.uspl = uspl;
    }


    /**
     * Gets the dspl value for this DocsisStatusObjOutput.
     * 
     * @return dspl
     */
    public java.lang.String getDspl() {
        return dspl;
    }


    /**
     * Sets the dspl value for this DocsisStatusObjOutput.
     * 
     * @param dspl
     */
    public void setDspl(java.lang.String dspl) {
        this.dspl = dspl;
    }


    /**
     * Gets the dssnr value for this DocsisStatusObjOutput.
     * 
     * @return dssnr
     */
    public java.lang.String getDssnr() {
        return dssnr;
    }


    /**
     * Sets the dssnr value for this DocsisStatusObjOutput.
     * 
     * @param dssnr
     */
    public void setDssnr(java.lang.String dssnr) {
        this.dssnr = dssnr;
    }


    /**
     * Gets the ussnr value for this DocsisStatusObjOutput.
     * 
     * @return ussnr
     */
    public java.lang.String getUssnr() {
        return ussnr;
    }


    /**
     * Sets the ussnr value for this DocsisStatusObjOutput.
     * 
     * @param ussnr
     */
    public void setUssnr(java.lang.String ussnr) {
        this.ussnr = ussnr;
    }


    /**
     * Gets the pollingSource value for this DocsisStatusObjOutput.
     * 
     * @return pollingSource
     */
    public java.lang.String getPollingSource() {
        return pollingSource;
    }


    /**
     * Sets the pollingSource value for this DocsisStatusObjOutput.
     * 
     * @param pollingSource
     */
    public void setPollingSource(java.lang.String pollingSource) {
        this.pollingSource = pollingSource;
    }


    /**
     * Gets the pollingDate value for this DocsisStatusObjOutput.
     * 
     * @return pollingDate
     */
    public java.lang.String getPollingDate() {
        return pollingDate;
    }


    /**
     * Sets the pollingDate value for this DocsisStatusObjOutput.
     * 
     * @param pollingDate
     */
    public void setPollingDate(java.lang.String pollingDate) {
        this.pollingDate = pollingDate;
    }


    /**
     * Gets the pollingage value for this DocsisStatusObjOutput.
     * 
     * @return pollingage
     */
    public java.lang.String getPollingage() {
        return pollingage;
    }


    /**
     * Sets the pollingage value for this DocsisStatusObjOutput.
     * 
     * @param pollingage
     */
    public void setPollingage(java.lang.String pollingage) {
        this.pollingage = pollingage;
    }


    /**
     * Gets the sysuptime value for this DocsisStatusObjOutput.
     * 
     * @return sysuptime
     */
    public java.lang.String getSysuptime() {
        return sysuptime;
    }


    /**
     * Sets the sysuptime value for this DocsisStatusObjOutput.
     * 
     * @param sysuptime
     */
    public void setSysuptime(java.lang.String sysuptime) {
        this.sysuptime = sysuptime;
    }


    /**
     * Gets the status value for this DocsisStatusObjOutput.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this DocsisStatusObjOutput.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the cmLeases value for this DocsisStatusObjOutput.
     * 
     * @return cmLeases
     */
    public intrawayWS.cliente.LeasesObj[] getCmLeases() {
        return cmLeases;
    }


    /**
     * Sets the cmLeases value for this DocsisStatusObjOutput.
     * 
     * @param cmLeases
     */
    public void setCmLeases(intrawayWS.cliente.LeasesObj[] cmLeases) {
        this.cmLeases = cmLeases;
    }


    /**
     * Gets the cpeLeases value for this DocsisStatusObjOutput.
     * 
     * @return cpeLeases
     */
    public intrawayWS.cliente.LeasesObj[] getCpeLeases() {
        return cpeLeases;
    }


    /**
     * Sets the cpeLeases value for this DocsisStatusObjOutput.
     * 
     * @param cpeLeases
     */
    public void setCpeLeases(intrawayWS.cliente.LeasesObj[] cpeLeases) {
        this.cpeLeases = cpeLeases;
    }


    /**
     * Gets the mtaLeases value for this DocsisStatusObjOutput.
     * 
     * @return mtaLeases
     */
    public intrawayWS.cliente.LeasesObj[] getMtaLeases() {
        return mtaLeases;
    }


    /**
     * Sets the mtaLeases value for this DocsisStatusObjOutput.
     * 
     * @param mtaLeases
     */
    public void setMtaLeases(intrawayWS.cliente.LeasesObj[] mtaLeases) {
        this.mtaLeases = mtaLeases;
    }


    /**
     * Gets the mensajes value for this DocsisStatusObjOutput.
     * 
     * @return mensajes
     */
    public intrawayWS.cliente.MensajesObj[] getMensajes() {
        return mensajes;
    }


    /**
     * Sets the mensajes value for this DocsisStatusObjOutput.
     * 
     * @param mensajes
     */
    public void setMensajes(intrawayWS.cliente.MensajesObj[] mensajes) {
        this.mensajes = mensajes;
    }


    /**
     * Gets the pooling value for this DocsisStatusObjOutput.
     * 
     * @return pooling
     */
    public intrawayWS.cliente.PoolingObj[] getPooling() {
        return pooling;
    }


    /**
     * Sets the pooling value for this DocsisStatusObjOutput.
     * 
     * @param pooling
     */
    public void setPooling(intrawayWS.cliente.PoolingObj[] pooling) {
        this.pooling = pooling;
    }


    /**
     * Gets the spDescription value for this DocsisStatusObjOutput.
     * 
     * @return spDescription
     */
    public intrawayWS.cliente.SpDescriptionObj getSpDescription() {
        return spDescription;
    }


    /**
     * Sets the spDescription value for this DocsisStatusObjOutput.
     * 
     * @param spDescription
     */
    public void setSpDescription(intrawayWS.cliente.SpDescriptionObj spDescription) {
        this.spDescription = spDescription;
    }


    /**
     * Gets the mtaCMSName value for this DocsisStatusObjOutput.
     * 
     * @return mtaCMSName
     */
    public java.lang.String getMtaCMSName() {
        return mtaCMSName;
    }


    /**
     * Sets the mtaCMSName value for this DocsisStatusObjOutput.
     * 
     * @param mtaCMSName
     */
    public void setMtaCMSName(java.lang.String mtaCMSName) {
        this.mtaCMSName = mtaCMSName;
    }


    /**
     * Gets the mtaMacAddress value for this DocsisStatusObjOutput.
     * 
     * @return mtaMacAddress
     */
    public java.lang.String getMtaMacAddress() {
        return mtaMacAddress;
    }


    /**
     * Sets the mtaMacAddress value for this DocsisStatusObjOutput.
     * 
     * @param mtaMacAddress
     */
    public void setMtaMacAddress(java.lang.String mtaMacAddress) {
        this.mtaMacAddress = mtaMacAddress;
    }


    /**
     * Gets the mtaHostname value for this DocsisStatusObjOutput.
     * 
     * @return mtaHostname
     */
    public java.lang.String getMtaHostname() {
        return mtaHostname;
    }


    /**
     * Sets the mtaHostname value for this DocsisStatusObjOutput.
     * 
     * @param mtaHostname
     */
    public void setMtaHostname(java.lang.String mtaHostname) {
        this.mtaHostname = mtaHostname;
    }


    /**
     * Gets the mtaFQDN value for this DocsisStatusObjOutput.
     * 
     * @return mtaFQDN
     */
    public java.lang.String getMtaFQDN() {
        return mtaFQDN;
    }


    /**
     * Sets the mtaFQDN value for this DocsisStatusObjOutput.
     * 
     * @param mtaFQDN
     */
    public void setMtaFQDN(java.lang.String mtaFQDN) {
        this.mtaFQDN = mtaFQDN;
    }


    /**
     * Gets the mtaIPAddress value for this DocsisStatusObjOutput.
     * 
     * @return mtaIPAddress
     */
    public java.lang.String getMtaIPAddress() {
        return mtaIPAddress;
    }


    /**
     * Sets the mtaIPAddress value for this DocsisStatusObjOutput.
     * 
     * @param mtaIPAddress
     */
    public void setMtaIPAddress(java.lang.String mtaIPAddress) {
        this.mtaIPAddress = mtaIPAddress;
    }


    /**
     * Gets the pktcMtaDevProvStateCode value for this DocsisStatusObjOutput.
     * 
     * @return pktcMtaDevProvStateCode
     */
    public java.lang.String getPktcMtaDevProvStateCode() {
        return pktcMtaDevProvStateCode;
    }


    /**
     * Sets the pktcMtaDevProvStateCode value for this DocsisStatusObjOutput.
     * 
     * @param pktcMtaDevProvStateCode
     */
    public void setPktcMtaDevProvStateCode(java.lang.String pktcMtaDevProvStateCode) {
        this.pktcMtaDevProvStateCode = pktcMtaDevProvStateCode;
    }


    /**
     * Gets the pktcMtaDevProvStateString value for this DocsisStatusObjOutput.
     * 
     * @return pktcMtaDevProvStateString
     */
    public java.lang.String getPktcMtaDevProvStateString() {
        return pktcMtaDevProvStateString;
    }


    /**
     * Sets the pktcMtaDevProvStateString value for this DocsisStatusObjOutput.
     * 
     * @param pktcMtaDevProvStateString
     */
    public void setPktcMtaDevProvStateString(java.lang.String pktcMtaDevProvStateString) {
        this.pktcMtaDevProvStateString = pktcMtaDevProvStateString;
    }


    /**
     * Gets the epStatus value for this DocsisStatusObjOutput.
     * 
     * @return epStatus
     */
    public java.lang.String getEpStatus() {
        return epStatus;
    }


    /**
     * Sets the epStatus value for this DocsisStatusObjOutput.
     * 
     * @param epStatus
     */
    public void setEpStatus(java.lang.String epStatus) {
        this.epStatus = epStatus;
    }


    /**
     * Gets the iCmNetworkUsage value for this DocsisStatusObjOutput.
     * 
     * @return iCmNetworkUsage
     */
    public java.lang.String getICmNetworkUsage() {
        return iCmNetworkUsage;
    }


    /**
     * Sets the iCmNetworkUsage value for this DocsisStatusObjOutput.
     * 
     * @param iCmNetworkUsage
     */
    public void setICmNetworkUsage(java.lang.String iCmNetworkUsage) {
        this.iCmNetworkUsage = iCmNetworkUsage;
    }


    /**
     * Gets the iMtaNetworkUsage value for this DocsisStatusObjOutput.
     * 
     * @return iMtaNetworkUsage
     */
    public java.lang.String getIMtaNetworkUsage() {
        return iMtaNetworkUsage;
    }


    /**
     * Sets the iMtaNetworkUsage value for this DocsisStatusObjOutput.
     * 
     * @param iMtaNetworkUsage
     */
    public void setIMtaNetworkUsage(java.lang.String iMtaNetworkUsage) {
        this.iMtaNetworkUsage = iMtaNetworkUsage;
    }


    /**
     * Gets the iCpeNetworkUsage value for this DocsisStatusObjOutput.
     * 
     * @return iCpeNetworkUsage
     */
    public java.lang.String getICpeNetworkUsage() {
        return iCpeNetworkUsage;
    }


    /**
     * Sets the iCpeNetworkUsage value for this DocsisStatusObjOutput.
     * 
     * @param iCpeNetworkUsage
     */
    public void setICpeNetworkUsage(java.lang.String iCpeNetworkUsage) {
        this.iCpeNetworkUsage = iCpeNetworkUsage;
    }


    /**
     * Gets the cmActivationCode value for this DocsisStatusObjOutput.
     * 
     * @return cmActivationCode
     */
    public java.lang.String getCmActivationCode() {
        return cmActivationCode;
    }


    /**
     * Sets the cmActivationCode value for this DocsisStatusObjOutput.
     * 
     * @param cmActivationCode
     */
    public void setCmActivationCode(java.lang.String cmActivationCode) {
        this.cmActivationCode = cmActivationCode;
    }


    /**
     * Gets the cmFechaAlta value for this DocsisStatusObjOutput.
     * 
     * @return cmFechaAlta
     */
    public java.lang.String getCmFechaAlta() {
        return cmFechaAlta;
    }


    /**
     * Sets the cmFechaAlta value for this DocsisStatusObjOutput.
     * 
     * @param cmFechaAlta
     */
    public void setCmFechaAlta(java.lang.String cmFechaAlta) {
        this.cmFechaAlta = cmFechaAlta;
    }


    /**
     * Gets the cmFechaActivacion value for this DocsisStatusObjOutput.
     * 
     * @return cmFechaActivacion
     */
    public java.lang.String getCmFechaActivacion() {
        return cmFechaActivacion;
    }


    /**
     * Sets the cmFechaActivacion value for this DocsisStatusObjOutput.
     * 
     * @param cmFechaActivacion
     */
    public void setCmFechaActivacion(java.lang.String cmFechaActivacion) {
        this.cmFechaActivacion = cmFechaActivacion;
    }


    /**
     * Gets the cmFechaModificacion value for this DocsisStatusObjOutput.
     * 
     * @return cmFechaModificacion
     */
    public java.lang.String getCmFechaModificacion() {
        return cmFechaModificacion;
    }


    /**
     * Sets the cmFechaModificacion value for this DocsisStatusObjOutput.
     * 
     * @param cmFechaModificacion
     */
    public void setCmFechaModificacion(java.lang.String cmFechaModificacion) {
        this.cmFechaModificacion = cmFechaModificacion;
    }


    /**
     * Gets the mtaActivationCode value for this DocsisStatusObjOutput.
     * 
     * @return mtaActivationCode
     */
    public java.lang.String getMtaActivationCode() {
        return mtaActivationCode;
    }


    /**
     * Sets the mtaActivationCode value for this DocsisStatusObjOutput.
     * 
     * @param mtaActivationCode
     */
    public void setMtaActivationCode(java.lang.String mtaActivationCode) {
        this.mtaActivationCode = mtaActivationCode;
    }


    /**
     * Gets the mtaFechaAlta value for this DocsisStatusObjOutput.
     * 
     * @return mtaFechaAlta
     */
    public java.lang.String getMtaFechaAlta() {
        return mtaFechaAlta;
    }


    /**
     * Sets the mtaFechaAlta value for this DocsisStatusObjOutput.
     * 
     * @param mtaFechaAlta
     */
    public void setMtaFechaAlta(java.lang.String mtaFechaAlta) {
        this.mtaFechaAlta = mtaFechaAlta;
    }


    /**
     * Gets the mtaFechaActivacion value for this DocsisStatusObjOutput.
     * 
     * @return mtaFechaActivacion
     */
    public java.lang.String getMtaFechaActivacion() {
        return mtaFechaActivacion;
    }


    /**
     * Sets the mtaFechaActivacion value for this DocsisStatusObjOutput.
     * 
     * @param mtaFechaActivacion
     */
    public void setMtaFechaActivacion(java.lang.String mtaFechaActivacion) {
        this.mtaFechaActivacion = mtaFechaActivacion;
    }


    /**
     * Gets the mtaFechaModificacion value for this DocsisStatusObjOutput.
     * 
     * @return mtaFechaModificacion
     */
    public java.lang.String getMtaFechaModificacion() {
        return mtaFechaModificacion;
    }


    /**
     * Sets the mtaFechaModificacion value for this DocsisStatusObjOutput.
     * 
     * @param mtaFechaModificacion
     */
    public void setMtaFechaModificacion(java.lang.String mtaFechaModificacion) {
        this.mtaFechaModificacion = mtaFechaModificacion;
    }


    /**
     * Gets the serialNumber value for this DocsisStatusObjOutput.
     * 
     * @return serialNumber
     */
    public java.lang.String getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this DocsisStatusObjOutput.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(java.lang.String serialNumber) {
        this.serialNumber = serialNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocsisStatusObjOutput)) return false;
        DocsisStatusObjOutput other = (DocsisStatusObjOutput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idClienteCRM==null && other.getIdClienteCRM()==null) || 
             (this.idClienteCRM!=null &&
              this.idClienteCRM.equals(other.getIdClienteCRM()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername()))) &&
            ((this.macaddress==null && other.getMacaddress()==null) || 
             (this.macaddress!=null &&
              this.macaddress.equals(other.getMacaddress()))) &&
            ((this.productName==null && other.getProductName()==null) || 
             (this.productName!=null &&
              this.productName.equals(other.getProductName()))) &&
            ((this.manufacturer==null && other.getManufacturer()==null) || 
             (this.manufacturer!=null &&
              this.manufacturer.equals(other.getManufacturer()))) &&
            ((this.hwv==null && other.getHwv()==null) || 
             (this.hwv!=null &&
              this.hwv.equals(other.getHwv()))) &&
            ((this.swv==null && other.getSwv()==null) || 
             (this.swv!=null &&
              this.swv.equals(other.getSwv()))) &&
            ((this.ip==null && other.getIp()==null) || 
             (this.ip!=null &&
              this.ip.equals(other.getIp()))) &&
            ((this.cmts==null && other.getCmts()==null) || 
             (this.cmts!=null &&
              this.cmts.equals(other.getCmts()))) &&
            ((this.upStream==null && other.getUpStream()==null) || 
             (this.upStream!=null &&
              this.upStream.equals(other.getUpStream()))) &&
            ((this.downStream==null && other.getDownStream()==null) || 
             (this.downStream!=null &&
              this.downStream.equals(other.getDownStream()))) &&
            ((this.ispCM==null && other.getIspCM()==null) || 
             (this.ispCM!=null &&
              this.ispCM.equals(other.getIspCM()))) &&
            ((this.ispMTA==null && other.getIspMTA()==null) || 
             (this.ispMTA!=null &&
              this.ispMTA.equals(other.getIspMTA()))) &&
            ((this.ispCPE==null && other.getIspCPE()==null) || 
             (this.ispCPE!=null &&
              this.ispCPE.equals(other.getIspCPE()))) &&
            ((this.servicePackage==null && other.getServicePackage()==null) || 
             (this.servicePackage!=null &&
              this.servicePackage.equals(other.getServicePackage()))) &&
            ((this.servicePackageID==null && other.getServicePackageID()==null) || 
             (this.servicePackageID!=null &&
              this.servicePackageID.equals(other.getServicePackageID()))) &&
            ((this.dpiPackage==null && other.getDpiPackage()==null) || 
             (this.dpiPackage!=null &&
              this.dpiPackage.equals(other.getDpiPackage()))) &&
            ((this.docsisVersion==null && other.getDocsisVersion()==null) || 
             (this.docsisVersion!=null &&
              this.docsisVersion.equals(other.getDocsisVersion()))) &&
            ((this.cantPCs==null && other.getCantPCs()==null) || 
             (this.cantPCs!=null &&
              this.cantPCs.equals(other.getCantPCs()))) &&
            ((this.disabled==null && other.getDisabled()==null) || 
             (this.disabled!=null &&
              this.disabled.equals(other.getDisabled()))) &&
            ((this.cantMensajes==null && other.getCantMensajes()==null) || 
             (this.cantMensajes!=null &&
              this.cantMensajes.equals(other.getCantMensajes()))) &&
            ((this.upTraffic==null && other.getUpTraffic()==null) || 
             (this.upTraffic!=null &&
              this.upTraffic.equals(other.getUpTraffic()))) &&
            ((this.downTraffic==null && other.getDownTraffic()==null) || 
             (this.downTraffic!=null &&
              this.downTraffic.equals(other.getDownTraffic()))) &&
            ((this.hub==null && other.getHub()==null) || 
             (this.hub!=null &&
              this.hub.equals(other.getHub()))) &&
            ((this.nodo==null && other.getNodo()==null) || 
             (this.nodo!=null &&
              this.nodo.equals(other.getNodo()))) &&
            ((this.cmStatus==null && other.getCmStatus()==null) || 
             (this.cmStatus!=null &&
              this.cmStatus.equals(other.getCmStatus()))) &&
            ((this.uspl==null && other.getUspl()==null) || 
             (this.uspl!=null &&
              this.uspl.equals(other.getUspl()))) &&
            ((this.dspl==null && other.getDspl()==null) || 
             (this.dspl!=null &&
              this.dspl.equals(other.getDspl()))) &&
            ((this.dssnr==null && other.getDssnr()==null) || 
             (this.dssnr!=null &&
              this.dssnr.equals(other.getDssnr()))) &&
            ((this.ussnr==null && other.getUssnr()==null) || 
             (this.ussnr!=null &&
              this.ussnr.equals(other.getUssnr()))) &&
            ((this.pollingSource==null && other.getPollingSource()==null) || 
             (this.pollingSource!=null &&
              this.pollingSource.equals(other.getPollingSource()))) &&
            ((this.pollingDate==null && other.getPollingDate()==null) || 
             (this.pollingDate!=null &&
              this.pollingDate.equals(other.getPollingDate()))) &&
            ((this.pollingage==null && other.getPollingage()==null) || 
             (this.pollingage!=null &&
              this.pollingage.equals(other.getPollingage()))) &&
            ((this.sysuptime==null && other.getSysuptime()==null) || 
             (this.sysuptime!=null &&
              this.sysuptime.equals(other.getSysuptime()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.cmLeases==null && other.getCmLeases()==null) || 
             (this.cmLeases!=null &&
              java.util.Arrays.equals(this.cmLeases, other.getCmLeases()))) &&
            ((this.cpeLeases==null && other.getCpeLeases()==null) || 
             (this.cpeLeases!=null &&
              java.util.Arrays.equals(this.cpeLeases, other.getCpeLeases()))) &&
            ((this.mtaLeases==null && other.getMtaLeases()==null) || 
             (this.mtaLeases!=null &&
              java.util.Arrays.equals(this.mtaLeases, other.getMtaLeases()))) &&
            ((this.mensajes==null && other.getMensajes()==null) || 
             (this.mensajes!=null &&
              java.util.Arrays.equals(this.mensajes, other.getMensajes()))) &&
            ((this.pooling==null && other.getPooling()==null) || 
             (this.pooling!=null &&
              java.util.Arrays.equals(this.pooling, other.getPooling()))) &&
            ((this.spDescription==null && other.getSpDescription()==null) || 
             (this.spDescription!=null &&
              this.spDescription.equals(other.getSpDescription()))) &&
            ((this.mtaCMSName==null && other.getMtaCMSName()==null) || 
             (this.mtaCMSName!=null &&
              this.mtaCMSName.equals(other.getMtaCMSName()))) &&
            ((this.mtaMacAddress==null && other.getMtaMacAddress()==null) || 
             (this.mtaMacAddress!=null &&
              this.mtaMacAddress.equals(other.getMtaMacAddress()))) &&
            ((this.mtaHostname==null && other.getMtaHostname()==null) || 
             (this.mtaHostname!=null &&
              this.mtaHostname.equals(other.getMtaHostname()))) &&
            ((this.mtaFQDN==null && other.getMtaFQDN()==null) || 
             (this.mtaFQDN!=null &&
              this.mtaFQDN.equals(other.getMtaFQDN()))) &&
            ((this.mtaIPAddress==null && other.getMtaIPAddress()==null) || 
             (this.mtaIPAddress!=null &&
              this.mtaIPAddress.equals(other.getMtaIPAddress()))) &&
            ((this.pktcMtaDevProvStateCode==null && other.getPktcMtaDevProvStateCode()==null) || 
             (this.pktcMtaDevProvStateCode!=null &&
              this.pktcMtaDevProvStateCode.equals(other.getPktcMtaDevProvStateCode()))) &&
            ((this.pktcMtaDevProvStateString==null && other.getPktcMtaDevProvStateString()==null) || 
             (this.pktcMtaDevProvStateString!=null &&
              this.pktcMtaDevProvStateString.equals(other.getPktcMtaDevProvStateString()))) &&
            ((this.epStatus==null && other.getEpStatus()==null) || 
             (this.epStatus!=null &&
              this.epStatus.equals(other.getEpStatus()))) &&
            ((this.iCmNetworkUsage==null && other.getICmNetworkUsage()==null) || 
             (this.iCmNetworkUsage!=null &&
              this.iCmNetworkUsage.equals(other.getICmNetworkUsage()))) &&
            ((this.iMtaNetworkUsage==null && other.getIMtaNetworkUsage()==null) || 
             (this.iMtaNetworkUsage!=null &&
              this.iMtaNetworkUsage.equals(other.getIMtaNetworkUsage()))) &&
            ((this.iCpeNetworkUsage==null && other.getICpeNetworkUsage()==null) || 
             (this.iCpeNetworkUsage!=null &&
              this.iCpeNetworkUsage.equals(other.getICpeNetworkUsage()))) &&
            ((this.cmActivationCode==null && other.getCmActivationCode()==null) || 
             (this.cmActivationCode!=null &&
              this.cmActivationCode.equals(other.getCmActivationCode()))) &&
            ((this.cmFechaAlta==null && other.getCmFechaAlta()==null) || 
             (this.cmFechaAlta!=null &&
              this.cmFechaAlta.equals(other.getCmFechaAlta()))) &&
            ((this.cmFechaActivacion==null && other.getCmFechaActivacion()==null) || 
             (this.cmFechaActivacion!=null &&
              this.cmFechaActivacion.equals(other.getCmFechaActivacion()))) &&
            ((this.cmFechaModificacion==null && other.getCmFechaModificacion()==null) || 
             (this.cmFechaModificacion!=null &&
              this.cmFechaModificacion.equals(other.getCmFechaModificacion()))) &&
            ((this.mtaActivationCode==null && other.getMtaActivationCode()==null) || 
             (this.mtaActivationCode!=null &&
              this.mtaActivationCode.equals(other.getMtaActivationCode()))) &&
            ((this.mtaFechaAlta==null && other.getMtaFechaAlta()==null) || 
             (this.mtaFechaAlta!=null &&
              this.mtaFechaAlta.equals(other.getMtaFechaAlta()))) &&
            ((this.mtaFechaActivacion==null && other.getMtaFechaActivacion()==null) || 
             (this.mtaFechaActivacion!=null &&
              this.mtaFechaActivacion.equals(other.getMtaFechaActivacion()))) &&
            ((this.mtaFechaModificacion==null && other.getMtaFechaModificacion()==null) || 
             (this.mtaFechaModificacion!=null &&
              this.mtaFechaModificacion.equals(other.getMtaFechaModificacion()))) &&
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              this.serialNumber.equals(other.getSerialNumber())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getIdClienteCRM() != null) {
            _hashCode += getIdClienteCRM().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        if (getMacaddress() != null) {
            _hashCode += getMacaddress().hashCode();
        }
        if (getProductName() != null) {
            _hashCode += getProductName().hashCode();
        }
        if (getManufacturer() != null) {
            _hashCode += getManufacturer().hashCode();
        }
        if (getHwv() != null) {
            _hashCode += getHwv().hashCode();
        }
        if (getSwv() != null) {
            _hashCode += getSwv().hashCode();
        }
        if (getIp() != null) {
            _hashCode += getIp().hashCode();
        }
        if (getCmts() != null) {
            _hashCode += getCmts().hashCode();
        }
        if (getUpStream() != null) {
            _hashCode += getUpStream().hashCode();
        }
        if (getDownStream() != null) {
            _hashCode += getDownStream().hashCode();
        }
        if (getIspCM() != null) {
            _hashCode += getIspCM().hashCode();
        }
        if (getIspMTA() != null) {
            _hashCode += getIspMTA().hashCode();
        }
        if (getIspCPE() != null) {
            _hashCode += getIspCPE().hashCode();
        }
        if (getServicePackage() != null) {
            _hashCode += getServicePackage().hashCode();
        }
        if (getServicePackageID() != null) {
            _hashCode += getServicePackageID().hashCode();
        }
        if (getDpiPackage() != null) {
            _hashCode += getDpiPackage().hashCode();
        }
        if (getDocsisVersion() != null) {
            _hashCode += getDocsisVersion().hashCode();
        }
        if (getCantPCs() != null) {
            _hashCode += getCantPCs().hashCode();
        }
        if (getDisabled() != null) {
            _hashCode += getDisabled().hashCode();
        }
        if (getCantMensajes() != null) {
            _hashCode += getCantMensajes().hashCode();
        }
        if (getUpTraffic() != null) {
            _hashCode += getUpTraffic().hashCode();
        }
        if (getDownTraffic() != null) {
            _hashCode += getDownTraffic().hashCode();
        }
        if (getHub() != null) {
            _hashCode += getHub().hashCode();
        }
        if (getNodo() != null) {
            _hashCode += getNodo().hashCode();
        }
        if (getCmStatus() != null) {
            _hashCode += getCmStatus().hashCode();
        }
        if (getUspl() != null) {
            _hashCode += getUspl().hashCode();
        }
        if (getDspl() != null) {
            _hashCode += getDspl().hashCode();
        }
        if (getDssnr() != null) {
            _hashCode += getDssnr().hashCode();
        }
        if (getUssnr() != null) {
            _hashCode += getUssnr().hashCode();
        }
        if (getPollingSource() != null) {
            _hashCode += getPollingSource().hashCode();
        }
        if (getPollingDate() != null) {
            _hashCode += getPollingDate().hashCode();
        }
        if (getPollingage() != null) {
            _hashCode += getPollingage().hashCode();
        }
        if (getSysuptime() != null) {
            _hashCode += getSysuptime().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getCmLeases() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCmLeases());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCmLeases(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCpeLeases() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCpeLeases());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCpeLeases(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMtaLeases() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMtaLeases());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMtaLeases(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMensajes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMensajes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMensajes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPooling() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPooling());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPooling(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSpDescription() != null) {
            _hashCode += getSpDescription().hashCode();
        }
        if (getMtaCMSName() != null) {
            _hashCode += getMtaCMSName().hashCode();
        }
        if (getMtaMacAddress() != null) {
            _hashCode += getMtaMacAddress().hashCode();
        }
        if (getMtaHostname() != null) {
            _hashCode += getMtaHostname().hashCode();
        }
        if (getMtaFQDN() != null) {
            _hashCode += getMtaFQDN().hashCode();
        }
        if (getMtaIPAddress() != null) {
            _hashCode += getMtaIPAddress().hashCode();
        }
        if (getPktcMtaDevProvStateCode() != null) {
            _hashCode += getPktcMtaDevProvStateCode().hashCode();
        }
        if (getPktcMtaDevProvStateString() != null) {
            _hashCode += getPktcMtaDevProvStateString().hashCode();
        }
        if (getEpStatus() != null) {
            _hashCode += getEpStatus().hashCode();
        }
        if (getICmNetworkUsage() != null) {
            _hashCode += getICmNetworkUsage().hashCode();
        }
        if (getIMtaNetworkUsage() != null) {
            _hashCode += getIMtaNetworkUsage().hashCode();
        }
        if (getICpeNetworkUsage() != null) {
            _hashCode += getICpeNetworkUsage().hashCode();
        }
        if (getCmActivationCode() != null) {
            _hashCode += getCmActivationCode().hashCode();
        }
        if (getCmFechaAlta() != null) {
            _hashCode += getCmFechaAlta().hashCode();
        }
        if (getCmFechaActivacion() != null) {
            _hashCode += getCmFechaActivacion().hashCode();
        }
        if (getCmFechaModificacion() != null) {
            _hashCode += getCmFechaModificacion().hashCode();
        }
        if (getMtaActivationCode() != null) {
            _hashCode += getMtaActivationCode().hashCode();
        }
        if (getMtaFechaAlta() != null) {
            _hashCode += getMtaFechaAlta().hashCode();
        }
        if (getMtaFechaActivacion() != null) {
            _hashCode += getMtaFechaActivacion().hashCode();
        }
        if (getMtaFechaModificacion() != null) {
            _hashCode += getMtaFechaModificacion().hashCode();
        }
        if (getSerialNumber() != null) {
            _hashCode += getSerialNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocsisStatusObjOutput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "DocsisStatusObjOutput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idClienteCRM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idClienteCRM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("", "username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("macaddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "macaddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "manufacturer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hwv");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hwv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("swv");
        elemField.setXmlName(new javax.xml.namespace.QName("", "swv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upStream");
        elemField.setXmlName(new javax.xml.namespace.QName("", "upStream"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downStream");
        elemField.setXmlName(new javax.xml.namespace.QName("", "downStream"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ispCM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ispCM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ispMTA");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ispMTA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ispCPE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ispCPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicePackage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicePackage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicePackageID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicePackageID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dpiPackage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dpiPackage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docsisVersion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docsisVersion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cantPCs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cantPCs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "disabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cantMensajes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cantMensajes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upTraffic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "upTraffic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downTraffic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "downTraffic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hub");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hub"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nodo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nodo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CmStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uspl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uspl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dspl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dspl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dssnr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dssnr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ussnr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ussnr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pollingSource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pollingSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pollingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pollingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pollingage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pollingage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sysuptime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sysuptime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmLeases");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmLeases"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "leasesObj"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpeLeases");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpeLeases"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "leasesObj"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mtaLeases");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mtaLeases"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "leasesObj"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensajes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mensajes"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "mensajesObj"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pooling");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pooling"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "poolingObj"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "spDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "spDescriptionObj"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mtaCMSName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mtaCMSName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mtaMacAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mtaMacAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mtaHostname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mtaHostname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mtaFQDN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mtaFQDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mtaIPAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mtaIPAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pktcMtaDevProvStateCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pktcMtaDevProvStateCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pktcMtaDevProvStateString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pktcMtaDevProvStateString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("epStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "epStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ICmNetworkUsage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iCmNetworkUsage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMtaNetworkUsage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iMtaNetworkUsage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ICpeNetworkUsage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iCpeNetworkUsage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmActivationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmActivationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmFechaAlta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmFechaAlta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmFechaActivacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmFechaActivacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmFechaModificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmFechaModificacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mtaActivationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mtaActivationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mtaFechaAlta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mtaFechaAlta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mtaFechaActivacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mtaFechaActivacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mtaFechaModificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mtaFechaModificacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
