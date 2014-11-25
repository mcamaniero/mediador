
package ec.com.grupotvcable.wsdlauditoriatitaniw;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "WsdlAuditoriaTitanIw", targetNamespace = "http://www.grupotvcable.com.ec/WsdlAuditoriaTitanIw/")
@SOAPBinding(use = SOAPBinding.Use.LITERAL, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface WsdlAuditoriaTitanIw {


    @WebMethod(operationName = "ConsultaIntraway", action = "http://www.grupotvcable.com.ec/WsdlAuditoriaTitanIw/ConsultaIntraway")
    @WebResult(name = "Respuesta", targetNamespace = "http://www.grupotvcable.com.ec/WsdlAuditoriaTitanIw/")
    public Respuesta consultaIntraway(
        @WebParam(name = "EjecutaConsulta", targetNamespace = "http://www.grupotvcable.com.ec/WsdlAuditoriaTitanIw/")
        ec.com.grupotvcable.wsdlauditoriatitaniw.EjecutaConsulta EjecutaConsulta);

}
