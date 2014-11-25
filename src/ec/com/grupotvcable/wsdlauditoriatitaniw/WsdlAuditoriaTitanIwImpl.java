
package ec.com.grupotvcable.wsdlauditoriatitaniw;

import java.io.IOException;
import java.util.List;

import javax.jws.WebService;
import javax.xml.rpc.ServiceException;

import org.apache.commons.httpclient.HttpException;
import org.jdom.JDOMException;

import com.app.intraway.consulta.GetReport;
import com.app.intraway.consulta.ids.CallFeature;
import com.app.intraway.consulta.ids.Email;
import com.app.intraway.consulta.ids.Linea;


@WebService(serviceName = "WsdlAuditoriaTitanIw", targetNamespace = "http://www.grupotvcable.com.ec/WsdlAuditoriaTitanIw/", endpointInterface = "ec.com.grupotvcable.wsdlauditoriatitaniw.WsdlAuditoriaTitanIw")
public class WsdlAuditoriaTitanIwImpl implements WsdlAuditoriaTitanIw{

	public Respuesta consultaIntraway(ec.com.grupotvcable.wsdlauditoriatitaniw.EjecutaConsulta EjecutaConsulta) {

		GetReport report = null;
		try {
			report = new GetReport(""+EjecutaConsulta.getIDEmpresa(), EjecutaConsulta.getClienteCRM(),
					"","","");
		} catch (HttpException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JDOMException e) {
			e.printStackTrace();
		}

		Respuesta res = new Respuesta();
		res.setCodError("0");
		res.setDetMensaje("Operation success");
		res.setNombre(report.getClienteCrm().getNombre());
		res.setTipoCliente(report.getClienteCrm().getTipoCliente());
		res.setUserName(report.getClienteCrm().getUsername());


		for (com.app.intraway.consulta.ids.CableModem cm 
				: report.getClienteCrm().getCm()){
			CableModem e = new CableModem();
			e.setCpe(cm.getCantCPE());
			e.setEstado(cm.getEstado());
			e.setIdProducto(cm.getIdProducto());
			e.setMacAddress(cm.getMacaddress());
			e.setServicePackege(cm.getServicePackege());

			if(cm.getMta()!=null){
				Mta mt = new Mta();
				mt.setEstado(cm.getMta().getEstado());
				mt.setIdProducto(cm.getMta().getIdProducto());
				mt.setIdProductoPadre(cm.getMta().getIdProductoPadre());
				mt.setMacAddress(cm.getMta().getMacaddress());
				mt.setModelo(cm.getMta().getMtaModel());
				mt.setMtaProfile(cm.getMta().getMtaProfile());
				e.setMta(mt);

				if(cm.getMta().getEndPoint()!=null)
					for (Linea end : cm.getMta().getEndPoint()){
						EndPoints enp = new EndPoints();
						enp.setEstado(end.getEstado());
						enp.setHomeExchange(end.getEpHomeExchange());
						enp.setIdProducto(end.getIdProducto());
						enp.setIdProductoPadre(end.getIdProductoPadre());
						enp.setTelefono(end.getTN());

						if(end.getCFeatures()!=null)
							for(CallFeature cal : end.getCFeatures()){
								if(!cal.getIdProducto().equals("-1") && !cal.getIdProductoPadre().equals("-1")){
									ec.com.grupotvcable.wsdlauditoriatitaniw.CallFeature callf 
									= new ec.com.grupotvcable.wsdlauditoriatitaniw.CallFeature();
									callf.setCallFeature(cal.getNombre());
									callf.setCustom1(cal.getCustom1());
									callf.setCustom2(cal.getCustom2());
									callf.setEstado(cal.getEstado());
									callf.setFeature(cal.getCfName());
									callf.setIdProducto(cal.getIdProducto());
									callf.setIdProductoPadre(cal.getIdProductoPadre());
									enp.getCallFeature().add(callf );
								}
							}
						mt.getEndPoints().add(enp);
					}
			}
			res.getCableModem().add(e );
		}


		for ( Email ma : report.getClienteCrm().getEm()){
			ec.com.grupotvcable.wsdlauditoriatitaniw.Email email 
			= new ec.com.grupotvcable.wsdlauditoriatitaniw.Email();
			email.setDominio(ma.getDominio());
			email.setEstado(ma.getEstado());
			email.setIdProducto(ma.getIdProducto());
			email.setIdProductoPadre(ma.getIdProductoPadre());
			email.setName(ma.getName());
			email.setPassword(ma.getPassword());
			email.setUserName(ma.getUserName());
			res.getEmail().add(email );
		}

		for(com.app.intraway.consulta.ids.DialUp dial
				: report.getClienteCrm().getDial()){
			DialUp d = new DialUp();
			d.setEstado(dial.getEstado());
			d.setIdProducto(dial.getIdProducto());
			d.setPassword(dial.getPassword());
			d.setUserName(dial.getUserName());
			res.getDialUp().add(d);
		}

		return res;
	}

}
