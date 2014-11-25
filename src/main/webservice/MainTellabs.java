package main.webservice;

import ec.com.grupotvcable.wsdltellabs.Cabecera;
import ec.com.grupotvcable.wsdltellabs.Comando;
import ec.com.grupotvcable.wsdltellabs.Detalle;
import ec.com.grupotvcable.wsdltellabs.Tellabs;
import ec.com.grupotvcable.wsdltellabs.WsdlTellabsImpl;

public class MainTellabs {

	public MainTellabs() {
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
		
		Tellabs tel = new Tellabs();
		
		tel.setCodCircuito("fdfd45");
		tel.setCodEnlace("fdf");
		tel.setDatoT1("ff");
		tel.setDatoT2("fdf");
		tel.setDatoT3("ff");
		tel.setDatoT4("fdf");
		tel.setTipEnlace(45);
	
		det.setTellabs(tel);
		
		cmd.setDetalle(det);
		
		new WsdlTellabsImpl().aprovTellabs(cmd);
	}

}
