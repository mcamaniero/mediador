package main.webservice;

import ec.com.grupotvcable.wsdlsafari.Cabecera;
import ec.com.grupotvcable.wsdlsafari.Comando;
import ec.com.grupotvcable.wsdlsafari.Detalle;
import ec.com.grupotvcable.wsdlsafari.Safari;
import ec.com.grupotvcable.wsdlsafari.WsdlSafariImpl;

public class MainSafari {

	public MainSafari() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Comando cmd = new Comando();
		
		Cabecera cab = new Cabecera();
		cab.setIDEmpresa(1);
		cab.setInterface(100);
		cab.setNegocio(24);
		cab.setSecuencia(001);
		cmd.setCabecera(cab);
		
		Detalle det = new Detalle();
		Safari saf = new Safari();
		
		saf.setDatoS1("asdf");
		saf.setDatoS2("df");
		saf.setDatoS3("df");
		saf.setDatoS4("ffff");
		saf.setEstado("fff");
		saf.setIdTroncal(4545);
		saf.setNumPiloto(4545);
		saf.setPlan(444);
		saf.setTelefono(54545);
		
		det.setSafari(saf);
		
		cmd.setDetalle(det);
		
		new WsdlSafariImpl().aprovSafari(cmd);
		
	}

}
