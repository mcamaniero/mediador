
package ec.com.grupotvcable.wsdlmcafee;

import java.util.Date;

import javax.jws.WebService;

import com.app.dao.EntityManagerHelper;
import com.app.mcafee.AprovisionarMcAfee;
import com.app.mcafee.dao.LogMcAfee;
import com.app.mcafee.dao.LogMcAfeeDAO;

@WebService(serviceName = "WsdlMcAfee", targetNamespace = "http://www.grupotvcable.com.ec/WsdlMcAfee/", endpointInterface = "ec.com.grupotvcable.wsdlmcafee.WsdlMcAfee")
public class WsdlMcAfeeImpl implements WsdlMcAfee {

	public Respuesta aprovMcAfee(int IdEmpresa, String Sistema,
			String Interfaz, String IdEstado, String Cuenta, String IdProducto,
			String Correo, int PlanMcAfeeTvCable, String ClienteCRM,
			String IdProductoCRM, String IdMcAfee, String Referencia,
			String Nombre) {

		//Registro los logs del Aprovisionamiento del Log del McAfee
		Respuesta resp = new Respuesta();
		try{

			LogMcAfee mc = new LogMcAfee(0, new Date(), IdEmpresa, Sistema, Interfaz, IdEstado, Cuenta,
					IdProducto, Correo, PlanMcAfeeTvCable, ClienteCRM, IdProductoCRM, 
					IdMcAfee, Referencia, null, null, null, Nombre);
			EntityManagerHelper.beginTransaction();
			new LogMcAfeeDAO().save(mc);
			EntityManagerHelper.commit();


			resp = new AprovisionarMcAfee(IdEmpresa, Sistema, Interfaz, IdEstado, Cuenta,
					IdProducto, Correo, PlanMcAfeeTvCable, ClienteCRM, IdProductoCRM,
					IdMcAfee, Referencia, mc.getId(), Nombre).Aprovisionar3();

			/*WsdlMcAfeeClient client = new WsdlMcAfeeClient();
			WsdlMcAfee service = client.getWsdlMcAfeeSOAP();
			
			Respuesta res = service.aprovMcAfee(IdEmpresa, Sistema, Interfaz, IdEstado, 
					Cuenta, IdProducto, Correo, PlanMcAfeeTvCable, ClienteCRM, 
					IdProductoCRM, IdMcAfee, Referencia, Nombre );
			resp = res;*/
			
			
			mc.setCodError(resp.getCodError());
			mc.setDetMensaje(resp.getDetMensaje());
			mc.setFechaResp(new Date());

			EntityManagerHelper.beginTransaction();
			new LogMcAfeeDAO().update(mc);
			EntityManagerHelper.commit();


		}catch(Exception e){
			resp = new Respuesta();
			e.printStackTrace();
			resp.setCodError("999");
			resp.setDetMensaje(e.getMessage());
			//resp.setCodError("2");
			//resp.setDetMensaje("Error de Aprovisionamiento, Suspendido, Intente mas tarde");
		}


		return resp;

	}

}
