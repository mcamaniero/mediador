package main.webservice;

import ec.com.grupotvcable.wsdlauris.Auris;
import ec.com.grupotvcable.wsdlauris.Cabecera;
import ec.com.grupotvcable.wsdlauris.Comando;
import ec.com.grupotvcable.wsdlauris.Detalle;
import ec.com.grupotvcable.wsdlauris.ListaFono;
import ec.com.grupotvcable.wsdlauris.ListaPin;
import ec.com.grupotvcable.wsdlauris.WsdlAurisImpl;

public class MainAuris {

	public MainAuris() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Comando comando = new Comando();
		
		Cabecera cab = new Cabecera();
		cab.setIDEmpresa(1);
		cab.setInterface(100);
		cab.setNegocio(24);
		cab.setSecuencia(001);
		comando.setCabecera(cab );
		
		
		Detalle det = new Detalle();
		Auris auris = new Auris();
		
		auris.setCodAcceso(124);
		auris.setCodEstado(45);
		auris.setFono(2755660);
		
		ListaFono lFono = new ListaFono();
		lFono.setNum(2);
		//lFono.setTelefono(121245);
		auris.setListaFono(lFono );
		
		ListaPin lPin = new ListaPin();
		auris.setListaPin(lPin );
		lPin.setNum(2);
		//lPin.setPines(4545);
		
		auris.setMonto(1212);
		auris.setPin(5555);
		auris.setProductoPlaneta(5885);
		auris.setReferencia("sin problemas");
		
		det.setAuris(auris );
		
		comando.setDetalle(det );
		
		new WsdlAurisImpl().aprovAuris(comando );
	}

}
