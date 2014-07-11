package com.app.safari.e1;

import ec.com.grupotvcable.wsdlsafari.Cabecera;
import ec.com.grupotvcable.wsdlsafari.Comando;
import ec.com.grupotvcable.wsdlsafari.Detalle;
import ec.com.grupotvcable.wsdlsafari.Respuesta;
import ec.com.grupotvcable.wsdlsafari.Safari;
import ec.com.grupotvcable.wsdlsafari.WsdlSafari;
import ec.com.grupotvcable.wsdlsafari.WsdlSafariClient;



public class SubscriberTrunkGrp {

	private String[] Values = null;
	
	//piloto 6002400
	public SubscriberTrunkGrp(int ciudad, String piloto) {
		
		WsdlSafariClient client = new WsdlSafariClient();
		WsdlSafari service = client.getWsdlSafariHttpPort();

		Respuesta res = service.aprovSafari(E1(ciudad,"593x"+piloto) );
		
		if(!res.getMensaje().getDetMensaje().equals(""))
			Values = res.getMensaje().getDetMensaje().split("\n");
		
		System.out.println(Values);
		
	}

	
	private static Comando E1(int ciudad, String piloto){
		
		Comando cmd = new Comando();
		Cabecera cab = new Cabecera();
		cab.setIDEmpresa(ciudad);//94 gye    63 uio    65 cue
		cab.setInterface(3002);
		cab.setNegocio(1);
		cab.setSecuencia(1);
		cmd.setCabecera(cab);

		Detalle det = new Detalle();
		Safari saf = new Safari();
		saf.setEstado("1"); //1activo  0suspendido
		saf.setDatoS1(piloto);//Piloto
		saf.setAccion("E1");

		det.setSafari(saf );
		cmd.setDetalle(det);

		return cmd;

	}


	public String[] getValues() {
		return Values;
	}

}
