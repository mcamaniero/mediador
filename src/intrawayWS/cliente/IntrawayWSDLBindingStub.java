/**
 * IntrawayWSDLBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package intrawayWS.cliente;

public class IntrawayWSDLBindingStub extends org.apache.axis.client.Stub implements intrawayWS.cliente.IntrawayWSDLPortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[16];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Put");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ArrayOfInterfaceObjInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfInterfaceObjInput"), intrawayWS.cliente.InterfaceObjInput[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "doAtomic"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfInterfaceObjOutput"));
        oper.setReturnClass(intrawayWS.cliente.InterfaceObjOutput[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ArrayOfInterfaceObjOutput"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetActivity");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "xmlEncoding"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idError"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "errorStr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ArrayOfActivityObjOutput"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfActivityObjOutput"), intrawayWS.cliente.ActivityObjOutput[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetDocsisStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idEmpresaCRM"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idServicio"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idVenta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idProducto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "xmlEncoding"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idError"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "errorStr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "DocsisStatusObjOutput"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:IntrawayWSDL", "DocsisStatusObjOutput"), intrawayWS.cliente.DocsisStatusObjOutput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Maintenance");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ArrayOfMaintenanceObjInput"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfMaintenanceObjInput"), intrawayWS.cliente.MaintenanceObjInput[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfMaintenanceObjOutput"));
        oper.setReturnClass(intrawayWS.cliente.MaintenanceObjOutput[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ArrayOfMaintenanceObjOutput"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Internal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "xmlEncoding"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "InternalObjOutput"));
        oper.setReturnClass(intrawayWS.cliente.InternalObjOutput.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Output"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createTempMTA");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Input"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:IntrawayWSDL", "createTempMTAInput"), intrawayWS.cliente.CreateTempMTAInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "createTempMTAOutput"));
        oper.setReturnClass(intrawayWS.cliente.CreateTempMTAOutput.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Output"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createTempSIPDevice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Input"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:IntrawayWSDL", "createTempSIPDeviceInput"), intrawayWS.cliente.CreateTempSIPDeviceInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "createTempSIPDeviceOutput"));
        oper.setReturnClass(intrawayWS.cliente.CreateTempSIPDeviceOutput.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Output"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("activateADSL");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Input"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:IntrawayWSDL", "activateADSLInput"), intrawayWS.cliente.ActivateADSLInput.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:IntrawayWSDL", "activateADSLOutput"));
        oper.setReturnClass(intrawayWS.cliente.ActivateADSLOutput.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Output"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idEmpresaCRM"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idClienteCRM"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cantRecords"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "showProducts"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:IntrawayWSDL", "ReportObjInput"), intrawayWS.cliente.ReportObjInput.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idError"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "errorStr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "report"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfReportObjOutput"), intrawayWS.cliente.ReportObjOutput[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCustomReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "showProducts"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idError"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "errorStr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "report"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfReportObjOutput"), intrawayWS.cliente.ReportObjOutput[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetDocsisTrafficReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idEmpresaCRM"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idClienteCRM"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cantRecords"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fromDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "toDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idError"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "errorStr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "report"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfDocsisTrafficReportObjOutput"), intrawayWS.cliente.DocsisTrafficReportObjOutput[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Audit");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idEmpresaCRM"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idClienteCRM"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cantRecords"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "xmlEncoding"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idError"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "errorStr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "report"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfAuditObjOutput"), intrawayWS.cliente.AuditObjOutput[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPPVReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idClienteCRM"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idEmpresaCRM"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idProducto"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idVenta"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idServicio"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "controllerType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "controllerCRMId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "purchaseId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cantRecords"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "xmlEncoding"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idError"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "errorStr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "report"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfPPVReportObjOutput"), intrawayWS.cliente.PPVReportObjOutput[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPPVCatalog");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idEmpresa"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "controllerType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cantRecords"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "xmlEncoding"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idError"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "errorStr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "catalog"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfPpvProducts"), intrawayWS.cliente.PpvProduct[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPPVMenu");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "xmlEncoding"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idError"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "errorStr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Catalog"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfCatalogsOutput"), intrawayWS.cliente.CatalogOutput[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPPVTickets");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ticketId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cantRecords"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "xmlEncoding"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "idError"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "errorStr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "unknownPurchases"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Report "), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfTicketReportOutput"), intrawayWS.cliente.ReportsOutput[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[15] = oper;

    }

    public IntrawayWSDLBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public IntrawayWSDLBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public IntrawayWSDLBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ACC");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.ACC.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ACCServices");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.ACCServices.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "activateADSLInput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.ActivateADSLInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "activateADSLOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.ActivateADSLOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ActivityObjOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.ActivityObjOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfACCReport");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.ACC[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ACC");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfACCServices");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.ACCServices[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ACCServices");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfActivityObjOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.ActivityObjOutput[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ActivityObjOutput");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfAuditDOCSISMessagesObjOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.AuditDOCSISMessagesObjOutput[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "AuditDOCSISMessagesObjOutput");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfAuditDOCSISObjOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.AuditDOCSISObjOutput[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "AuditDOCSISObjOutput");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfAuditObjOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.AuditObjOutput[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "AuditObjOutput");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfAuditPacketCableEndPointObjOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.AuditPacketCableEndPointObjOutput[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "AuditPacketCableEndPointObjOutput");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfAuditPacketCableObjOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.AuditPacketCableObjOutput[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "AuditPacketCableObjOutput");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfCatalogsOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.CatalogOutput[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "CatalogOutput");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfComandosObj");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.ComandosObj[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "comandosObj");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfDACReport");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.DAC[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "DAC");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfDACServices");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.DACServices[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "DACServices");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfDocsisReport");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.DocsisReport[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "DocsisReport");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfDocsisTrafficReportCMObjOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.DocsisTrafficReportCMObjOutput[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "DocsisTrafficReportCMObjOutput");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfDocsisTrafficReportObjOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.DocsisTrafficReportObjOutput[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "DocsisTrafficReportObjOutput");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfEventOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.EventOutput[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "EventOutput");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfEventsOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.EventsOutput[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "EventsOutput");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfFlowsObj");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.FlowsObj[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "flowsObj");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfInterfaceObjInput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.InterfaceObjInput[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "InterfaceObjInput");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfInterfaceObjOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.InterfaceObjOutput[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "InterfaceObjOutput");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfLeasesObj");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.LeasesObj[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "leasesObj");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfMaintenanceObjInput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.MaintenanceObjInput[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "MaintenanceObjInput");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfMaintenanceObjOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.MaintenanceObjOutput[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "MaintenanceObjOutput");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfMensajesObj");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.MensajesObj[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "mensajesObj");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfNAGRAProducts");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.NAGRAProducts[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "NAGRAProducts");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfNAGRAReport");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.NAGRA[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "NAGRA");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfOpcionesObj");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.OpcionesObj[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "opcionesObj");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfPackageOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.PackageOutput[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "PackageOutput");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfPacketCableCallFeaturesReport");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.PacketCableCallFeaturesReport[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "PacketCableCallFeaturesReport");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfPacketCableEndPointsReport");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.PacketCableEndPointsReport[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "PacketCableEndPointsReport");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfPacketCableReport");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.PacketCableReport[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "PacketCableReport");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfPacketCableSoftswitchReport");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.PacketCableSoftswitchReport[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "PacketCableSoftswitchReport");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfPoolingObj");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.PoolingObj[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "poolingObj");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfPpvEvents");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.PpvEvent[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "PpvEvent");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfPpvProducts");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.PpvProduct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "PpvProduct");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfPPVPurchasesObjOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.PPVPurchasesObjOutput[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "PPVPurchasesObjOutput");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfPPVReportObjOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.PPVReportObjOutput[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "PPVReportObjOutput");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfPurchaseOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.PurchaseOutput[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "PurchaseOutput");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfPurchasesOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.PurchasesOutput[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "PurchasesOutput");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfReportObjOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.ReportObjOutput[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ReportObjOutput");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfScheduleOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.ScheduleOutput[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ScheduleOutput");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfSchedulesOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.SchedulesOutput[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "SchedulesOutput");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfSIPCallFeaturesReport");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.SIPCallFeaturesReport[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "SIPCallFeaturesReport");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfSIPEndPointsReport");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.SIPEndPointsReport[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "SIPEndPointsReport");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfSIPReport");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.SIPReport[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "SIPReport");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfSIPSoftswitchReport");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.SIPSoftswitchReport[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "SIPSoftswitchReport");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfSYSMANReport");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.SYSMAN[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "SYSMAN");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfSYSMANServices");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.SYSMANServices[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "SYSMANServices");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfTicketReportOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.ReportsOutput[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ReportsOutput");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfTOCOMReport");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.TOCOM[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "TOCOM");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfTOCOMServices");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.TOCOMServices[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "TOCOMServices");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfVoiceMailMessages");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.VoiceMailMessage[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "VoiceMailMessage");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfVoiceMailReport");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.VoiceMailReport[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "VoiceMailReport");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfVOIPCallFeaturesReport");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.VOIPCallFeaturesReport[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "VOIPCallFeaturesReport");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ArrayOfVOIPReport");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.VOIPReport[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "VOIPReport");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "AuditDOCSISMessagesObjOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.AuditDOCSISMessagesObjOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "AuditDOCSISObjOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.AuditDOCSISObjOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "AuditObjOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.AuditObjOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "AuditPacketCableEndPointObjOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.AuditPacketCableEndPointObjOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "AuditPacketCableObjOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.AuditPacketCableObjOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "CatalogOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.CatalogOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "comandosObj");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.ComandosObj.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "createTempMTAInput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.CreateTempMTAInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "createTempMTAOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.CreateTempMTAOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "createTempSIPDeviceInput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.CreateTempSIPDeviceInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "createTempSIPDeviceOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.CreateTempSIPDeviceOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "DAC");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.DAC.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "DACServices");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.DACServices.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "DocsisReport");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.DocsisReport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "DocsisStatusObjOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.DocsisStatusObjOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "DocsisTrafficReportCMObjOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.DocsisTrafficReportCMObjOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "DocsisTrafficReportObjOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.DocsisTrafficReportObjOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "EventOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.EventOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "EventsOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.EventsOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "flowsObj");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.FlowsObj.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "InterfaceObjInput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.InterfaceObjInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "InterfaceObjOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.InterfaceObjOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "InternalObjOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.InternalObjOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "leasesObj");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.LeasesObj.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "MaintenanceObjInput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.MaintenanceObjInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "MaintenanceObjOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.MaintenanceObjOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "mensajesObj");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.MensajesObj.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "NAGRA");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.NAGRA.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "NAGRAProducts");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.NAGRAProducts.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "NotImplementedYet");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.NotImplementedYet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "opcionesObj");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.OpcionesObj.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "PackageOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.PackageOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "PacketCableCallFeaturesReport");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.PacketCableCallFeaturesReport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "PacketCableEndPointsReport");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.PacketCableEndPointsReport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "PacketCableReport");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.PacketCableReport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "PacketCableSoftswitchReport");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.PacketCableSoftswitchReport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "poolingObj");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.PoolingObj.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "PpvEvent");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.PpvEvent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "PpvProduct");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.PpvProduct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "PPVPurchasesObjOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.PPVPurchasesObjOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "PPVReportObjOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.PPVReportObjOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "PurchaseOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.PurchaseOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "PurchasesOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.PurchasesOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ReportObjInput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.ReportObjInput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ReportObjOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.ReportObjOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ReportsOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.ReportsOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "ScheduleOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.ScheduleOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "SchedulesOutput");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.SchedulesOutput.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "SIPCallFeaturesReport");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.SIPCallFeaturesReport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "SIPEndPointsReport");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.SIPEndPointsReport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "SIPReport");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.SIPReport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "SIPSoftswitchReport");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.SIPSoftswitchReport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "spDescriptionObj");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.SpDescriptionObj.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "SYSMAN");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.SYSMAN.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "SYSMANServices");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.SYSMANServices.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "TOCOM");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.TOCOM.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "TOCOMServices");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.TOCOMServices.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "TVReport");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.TVReport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "VoiceMailMessage");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.VoiceMailMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "VoiceMailReport");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.VoiceMailReport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "VOIPCallFeaturesReport");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.VOIPCallFeaturesReport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:IntrawayWSDL", "VOIPReport");
            cachedSerQNames.add(qName);
            cls = intrawayWS.cliente.VOIPReport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public intrawayWS.cliente.InterfaceObjOutput[] put(java.lang.String authKey, intrawayWS.cliente.InterfaceObjInput[] arrayOfInterfaceObjInput, java.lang.String doAtomic) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:IntrawayWSDL#Put");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:IntrawayWSDL", "Put"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authKey, arrayOfInterfaceObjInput, doAtomic});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (intrawayWS.cliente.InterfaceObjOutput[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (intrawayWS.cliente.InterfaceObjOutput[]) org.apache.axis.utils.JavaUtils.convert(_resp, intrawayWS.cliente.InterfaceObjOutput[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getActivity(java.lang.String authKey, java.lang.String xmlEncoding, javax.xml.rpc.holders.StringHolder idError, javax.xml.rpc.holders.StringHolder errorStr, intrawayWS.cliente.holders.ArrayOfActivityObjOutputHolder arrayOfActivityObjOutput) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:IntrawayWSDL#GetActivity");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:IntrawayWSDL", "GetActivity"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authKey, xmlEncoding});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                idError.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "idError"));
            } catch (java.lang.Exception _exception) {
                idError.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "idError")), java.lang.String.class);
            }
            try {
                errorStr.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "errorStr"));
            } catch (java.lang.Exception _exception) {
                errorStr.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "errorStr")), java.lang.String.class);
            }
            try {
                arrayOfActivityObjOutput.value = (intrawayWS.cliente.ActivityObjOutput[]) _output.get(new javax.xml.namespace.QName("", "ArrayOfActivityObjOutput"));
            } catch (java.lang.Exception _exception) {
                arrayOfActivityObjOutput.value = (intrawayWS.cliente.ActivityObjOutput[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ArrayOfActivityObjOutput")), intrawayWS.cliente.ActivityObjOutput[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getDocsisStatus(java.lang.String authKey, java.lang.String idEmpresaCRM, java.lang.String idServicio, java.lang.String idVenta, java.lang.String idProducto, java.lang.String xmlEncoding, javax.xml.rpc.holders.StringHolder idError, javax.xml.rpc.holders.StringHolder errorStr, intrawayWS.cliente.holders.DocsisStatusObjOutputHolder docsisStatusObjOutput) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:IntrawayWSDL#GetDocsisStatus");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:IntrawayWSDL", "GetDocsisStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authKey, idEmpresaCRM, idServicio, idVenta, idProducto, xmlEncoding});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                idError.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "idError"));
            } catch (java.lang.Exception _exception) {
                idError.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "idError")), java.lang.String.class);
            }
            try {
                errorStr.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "errorStr"));
            } catch (java.lang.Exception _exception) {
                errorStr.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "errorStr")), java.lang.String.class);
            }
            try {
                docsisStatusObjOutput.value = (intrawayWS.cliente.DocsisStatusObjOutput) _output.get(new javax.xml.namespace.QName("", "DocsisStatusObjOutput"));
            } catch (java.lang.Exception _exception) {
                docsisStatusObjOutput.value = (intrawayWS.cliente.DocsisStatusObjOutput) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "DocsisStatusObjOutput")), intrawayWS.cliente.DocsisStatusObjOutput.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public intrawayWS.cliente.MaintenanceObjOutput[] maintenance(java.lang.String authKey, intrawayWS.cliente.MaintenanceObjInput[] arrayOfMaintenanceObjInput) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:IntrawayWSDL#Maintenance");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:IntrawayWSDL", "Maintenance"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authKey, arrayOfMaintenanceObjInput});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (intrawayWS.cliente.MaintenanceObjOutput[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (intrawayWS.cliente.MaintenanceObjOutput[]) org.apache.axis.utils.JavaUtils.convert(_resp, intrawayWS.cliente.MaintenanceObjOutput[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public intrawayWS.cliente.InternalObjOutput internal(java.lang.String authKey, java.lang.String xmlEncoding) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:IntrawayWSDL#Internal");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:IntrawayWSDL", "Internal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authKey, xmlEncoding});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (intrawayWS.cliente.InternalObjOutput) _resp;
            } catch (java.lang.Exception _exception) {
                return (intrawayWS.cliente.InternalObjOutput) org.apache.axis.utils.JavaUtils.convert(_resp, intrawayWS.cliente.InternalObjOutput.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public intrawayWS.cliente.CreateTempMTAOutput createTempMTA(java.lang.String authKey, intrawayWS.cliente.CreateTempMTAInput input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:IntrawayWSDL#createTempMTA");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:IntrawayWSDL", "createTempMTA"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authKey, input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (intrawayWS.cliente.CreateTempMTAOutput) _resp;
            } catch (java.lang.Exception _exception) {
                return (intrawayWS.cliente.CreateTempMTAOutput) org.apache.axis.utils.JavaUtils.convert(_resp, intrawayWS.cliente.CreateTempMTAOutput.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public intrawayWS.cliente.CreateTempSIPDeviceOutput createTempSIPDevice(java.lang.String authKey, intrawayWS.cliente.CreateTempSIPDeviceInput input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:IntrawayWSDL#createTempSIPDevice");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:IntrawayWSDL", "createTempSIPDevice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authKey, input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (intrawayWS.cliente.CreateTempSIPDeviceOutput) _resp;
            } catch (java.lang.Exception _exception) {
                return (intrawayWS.cliente.CreateTempSIPDeviceOutput) org.apache.axis.utils.JavaUtils.convert(_resp, intrawayWS.cliente.CreateTempSIPDeviceOutput.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public intrawayWS.cliente.ActivateADSLOutput activateADSL(java.lang.String authKey, intrawayWS.cliente.ActivateADSLInput input) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:IntrawayWSDL#activateADSL");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:IntrawayWSDL", "activateADSL"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authKey, input});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (intrawayWS.cliente.ActivateADSLOutput) _resp;
            } catch (java.lang.Exception _exception) {
                return (intrawayWS.cliente.ActivateADSLOutput) org.apache.axis.utils.JavaUtils.convert(_resp, intrawayWS.cliente.ActivateADSLOutput.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getReport(java.lang.String authKey, java.lang.String idEmpresaCRM, java.lang.String idClienteCRM, java.lang.String cantRecords, intrawayWS.cliente.ReportObjInput showProducts, javax.xml.rpc.holders.StringHolder idError, javax.xml.rpc.holders.StringHolder errorStr, intrawayWS.cliente.holders.ArrayOfReportObjOutputHolder report) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:IntrawayWSDL#GetReport");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:IntrawayWSDL", "GetReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authKey, idEmpresaCRM, idClienteCRM, cantRecords, showProducts});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                idError.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "idError"));
            } catch (java.lang.Exception _exception) {
                idError.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "idError")), java.lang.String.class);
            }
            try {
                errorStr.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "errorStr"));
            } catch (java.lang.Exception _exception) {
                errorStr.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "errorStr")), java.lang.String.class);
            }
            try {
                report.value = (intrawayWS.cliente.ReportObjOutput[]) _output.get(new javax.xml.namespace.QName("", "report"));
            } catch (java.lang.Exception _exception) {
                report.value = (intrawayWS.cliente.ReportObjOutput[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "report")), intrawayWS.cliente.ReportObjOutput[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getCustomReport(java.lang.String authKey, java.lang.String showProducts, javax.xml.rpc.holders.StringHolder idError, javax.xml.rpc.holders.StringHolder errorStr, intrawayWS.cliente.holders.ArrayOfReportObjOutputHolder report) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:IntrawayWSDL#GetReport");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:IntrawayWSDL", "GetCustomReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authKey, showProducts});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                idError.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "idError"));
            } catch (java.lang.Exception _exception) {
                idError.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "idError")), java.lang.String.class);
            }
            try {
                errorStr.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "errorStr"));
            } catch (java.lang.Exception _exception) {
                errorStr.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "errorStr")), java.lang.String.class);
            }
            try {
                report.value = (intrawayWS.cliente.ReportObjOutput[]) _output.get(new javax.xml.namespace.QName("", "report"));
            } catch (java.lang.Exception _exception) {
                report.value = (intrawayWS.cliente.ReportObjOutput[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "report")), intrawayWS.cliente.ReportObjOutput[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getDocsisTrafficReport(java.lang.String authKey, java.lang.String idEmpresaCRM, java.lang.String idClienteCRM, java.lang.String cantRecords, java.lang.String fromDate, java.lang.String toDate, javax.xml.rpc.holders.StringHolder idError, javax.xml.rpc.holders.StringHolder errorStr, intrawayWS.cliente.holders.ArrayOfDocsisTrafficReportObjOutputHolder report) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:IntrawayWSDL#GetDocsisTrafficReport");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:IntrawayWSDL", "GetDocsisTrafficReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authKey, idEmpresaCRM, idClienteCRM, cantRecords, fromDate, toDate});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                idError.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "idError"));
            } catch (java.lang.Exception _exception) {
                idError.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "idError")), java.lang.String.class);
            }
            try {
                errorStr.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "errorStr"));
            } catch (java.lang.Exception _exception) {
                errorStr.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "errorStr")), java.lang.String.class);
            }
            try {
                report.value = (intrawayWS.cliente.DocsisTrafficReportObjOutput[]) _output.get(new javax.xml.namespace.QName("", "report"));
            } catch (java.lang.Exception _exception) {
                report.value = (intrawayWS.cliente.DocsisTrafficReportObjOutput[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "report")), intrawayWS.cliente.DocsisTrafficReportObjOutput[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void audit(java.lang.String authKey, java.lang.String idEmpresaCRM, java.lang.String idClienteCRM, java.lang.String cantRecords, java.lang.String xmlEncoding, javax.xml.rpc.holders.StringHolder idError, javax.xml.rpc.holders.StringHolder errorStr, intrawayWS.cliente.holders.ArrayOfAuditObjOutputHolder report) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:IntrawayWSDL#Audit");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:IntrawayWSDL", "Audit"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authKey, idEmpresaCRM, idClienteCRM, cantRecords, xmlEncoding});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                idError.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "idError"));
            } catch (java.lang.Exception _exception) {
                idError.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "idError")), java.lang.String.class);
            }
            try {
                errorStr.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "errorStr"));
            } catch (java.lang.Exception _exception) {
                errorStr.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "errorStr")), java.lang.String.class);
            }
            try {
                report.value = (intrawayWS.cliente.AuditObjOutput[]) _output.get(new javax.xml.namespace.QName("", "report"));
            } catch (java.lang.Exception _exception) {
                report.value = (intrawayWS.cliente.AuditObjOutput[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "report")), intrawayWS.cliente.AuditObjOutput[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getPPVReport(java.lang.String authKey, java.lang.String idClienteCRM, java.lang.String idEmpresaCRM, java.lang.String idProducto, java.lang.String idVenta, java.lang.String idServicio, java.lang.String controllerType, java.lang.String controllerCRMId, int purchaseId, int cantRecords, java.lang.String xmlEncoding, javax.xml.rpc.holders.StringHolder idError, javax.xml.rpc.holders.StringHolder errorStr, intrawayWS.cliente.holders.ArrayOfPPVReportObjOutputHolder report) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:IntrawayWSDL#GetPPVReport");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:IntrawayWSDL", "GetPPVReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authKey, idClienteCRM, idEmpresaCRM, idProducto, idVenta, idServicio, controllerType, controllerCRMId, new java.lang.Integer(purchaseId), new java.lang.Integer(cantRecords), xmlEncoding});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                idError.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "idError"));
            } catch (java.lang.Exception _exception) {
                idError.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "idError")), java.lang.String.class);
            }
            try {
                errorStr.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "errorStr"));
            } catch (java.lang.Exception _exception) {
                errorStr.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "errorStr")), java.lang.String.class);
            }
            try {
                report.value = (intrawayWS.cliente.PPVReportObjOutput[]) _output.get(new javax.xml.namespace.QName("", "report"));
            } catch (java.lang.Exception _exception) {
                report.value = (intrawayWS.cliente.PPVReportObjOutput[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "report")), intrawayWS.cliente.PPVReportObjOutput[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getPPVCatalog(java.lang.String authKey, java.lang.String idEmpresa, java.lang.String controllerType, int cantRecords, java.lang.String xmlEncoding, javax.xml.rpc.holders.StringHolder idError, javax.xml.rpc.holders.StringHolder errorStr, intrawayWS.cliente.holders.ArrayOfPpvProductsHolder catalog) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:IntrawayWSDL#GetPPVCatalog");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:IntrawayWSDL", "GetPPVCatalog"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authKey, idEmpresa, controllerType, new java.lang.Integer(cantRecords), xmlEncoding});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                idError.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "idError"));
            } catch (java.lang.Exception _exception) {
                idError.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "idError")), java.lang.String.class);
            }
            try {
                errorStr.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "errorStr"));
            } catch (java.lang.Exception _exception) {
                errorStr.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "errorStr")), java.lang.String.class);
            }
            try {
                catalog.value = (intrawayWS.cliente.PpvProduct[]) _output.get(new javax.xml.namespace.QName("", "catalog"));
            } catch (java.lang.Exception _exception) {
                catalog.value = (intrawayWS.cliente.PpvProduct[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "catalog")), intrawayWS.cliente.PpvProduct[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getPPVMenu(java.lang.String authKey, java.lang.String xmlEncoding, javax.xml.rpc.holders.StringHolder idError, javax.xml.rpc.holders.StringHolder errorStr, intrawayWS.cliente.holders.ArrayOfCatalogsOutputHolder catalog) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:IntrawayWSDL#GetPPVMenu");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:IntrawayWSDL", "GetPPVMenu"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authKey, xmlEncoding});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                idError.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "idError"));
            } catch (java.lang.Exception _exception) {
                idError.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "idError")), java.lang.String.class);
            }
            try {
                errorStr.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "errorStr"));
            } catch (java.lang.Exception _exception) {
                errorStr.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "errorStr")), java.lang.String.class);
            }
            try {
                catalog.value = (intrawayWS.cliente.CatalogOutput[]) _output.get(new javax.xml.namespace.QName("", "Catalog"));
            } catch (java.lang.Exception _exception) {
                catalog.value = (intrawayWS.cliente.CatalogOutput[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Catalog")), intrawayWS.cliente.CatalogOutput[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getPPVTickets(java.lang.String authKey, java.lang.String ticketId, java.lang.String cantRecords, java.lang.String xmlEncoding, javax.xml.rpc.holders.StringHolder idError, javax.xml.rpc.holders.StringHolder errorStr, javax.xml.rpc.holders.StringHolder unknownPurchases, intrawayWS.cliente.holders.ArrayOfTicketReportOutputHolder report) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:IntrawayWSDL#GetPPVTickets");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:IntrawayWSDL", "GetPPVTickets"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authKey, ticketId, cantRecords, xmlEncoding});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                idError.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "idError"));
            } catch (java.lang.Exception _exception) {
                idError.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "idError")), java.lang.String.class);
            }
            try {
                errorStr.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "errorStr"));
            } catch (java.lang.Exception _exception) {
                errorStr.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "errorStr")), java.lang.String.class);
            }
            try {
                unknownPurchases.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "unknownPurchases"));
            } catch (java.lang.Exception _exception) {
                unknownPurchases.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "unknownPurchases")), java.lang.String.class);
            }
            try {
                report.value = (intrawayWS.cliente.ReportsOutput[]) _output.get(new javax.xml.namespace.QName("", "Report "));
            } catch (java.lang.Exception _exception) {
                report.value = (intrawayWS.cliente.ReportsOutput[]) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Report ")), intrawayWS.cliente.ReportsOutput[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
