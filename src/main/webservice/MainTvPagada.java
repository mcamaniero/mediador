package main.webservice;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import javax.xml.datatype.DatatypeConstants;

import com.app.tvp.Excepciones;

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
//import tvc_srvcomgye.wsaprovisionamiento.services.wsdltvpagada.*;

//import tvc_srvcomgye.wsaprovisionamiento.services.wsdltvpagada.WsdlTvPagadaImpl;
import ec.com.grupotvcable.wsdltvpagada.*;

public class MainTvPagada {

	Comando cmd = new Comando();
	private int eventos1;

	static String nombreArchivoIn = "CrearConsultarAntesdeCrear.txt";

	static String rutaPreIn = "C:/";
	static String rutaCdr = "C:/ArchivosTitan/Partidos/";
	private static Integer paquetes1;
	private static Integer paquetes2;

	public MainTvPagada() {
		// TODO Auto-generated constructor stub
		//setDAC();
	}

// COMANDO QUE SE USA PARA GENERAR LOS COMANDOS DAC
	public Comando setDAC() {
		Cabecera cab = new Cabecera();
		cab.setIDEmpresa(64);
		cab.setInterface(700);// crear 713 702 714 701 713 crea 714 eliminas
									// 702 acitvas 701 init
		cab.setNegocio(3);
		cab.setSecuencia(28570691);
		cmd.setCabecera(cab);

		Detalle det = new Detalle();

		TVpagada tv = new TVpagada();
		
		tv.setAccion(6); // 3 Creación - 2 inicializacion - 5 CORTAR

		Comienzo FechIni = new Comienzo();
		//FechIni.setFechaIni(XMLGregorianCalendarImpl.createDate(2008, 07, 29,DatatypeConstants.FIELD_UNDEFINED));
		//FechIni.setTiempoIni(XMLGregorianCalendarImpl.createTime(20, 0, 0,DatatypeConstants.FIELD_UNDEFINED));
		tv.setComienzo(FechIni);
		Final Fecfin = new Final();
		//Fecfin.setFechaFin(XMLGregorianCalendarImpl.createDate(2008, 7, 29,DatatypeConstants.FIELD_UNDEFINED));
		//Fecfin.setTiempoFin(XMLGregorianCalendarImpl.createTime(20, 30, 0,DatatypeConstants.FIELD_UNDEFINED));
		tv.setFinal(Fecfin);
		tv.setDatoC2("TYTAN");
		tv.setSerie("GI1301TD3540");
		tv.setIdConvertidor("0000301498023048");
		tv.setCItem(5933436);

		tv.setIdServicio(202); //208 super premium
		tv.setTipoA(1666);
		tv.setCredito(0); //50
		tv.setEstadoC("Y");
		tv.setUbicacion(20);
		tv.setDescEvento(null);
		tv.setTipoD(4000);
		tv.setTipoPromocion(3080);
		tv.setDatoC1("0");
		//TODO: eliminar
		tv.setCodigoCanal(0);
		paquetes1 = 0;
		paquetes2 = 0;
		if (paquetes1 != 0) {
			if (paquetes2 == 0) {
				IdPaquetes idpaquetes = new IdPaquetes();
				idpaquetes.setCantP(1);
				List<IdPaquete> lstpaquete = idpaquetes.getIdPaquete();

				IdPaquete paq = new IdPaquete();
				paq.setIdPaquete(paquetes1);// 200010 //880154 //880156 500004
				lstpaquete.add(paq);

				idpaquetes.getIdPaquete().addAll(lstpaquete);
				tv.setIdPaquetes(idpaquetes);
			} else {
				IdPaquetes idpaquetes = new IdPaquetes();
				idpaquetes.setCantP(2);
				List<IdPaquete> lstpaquete = idpaquetes.getIdPaquete();

				IdPaquete paq = new IdPaquete();
				paq.setIdPaquete(paquetes1);
				lstpaquete.add(paq);

				IdPaquete paq2 = new IdPaquete();
				paq2.setIdPaquete(paquetes2);
				lstpaquete.add(paq2);

				idpaquetes.getIdPaquete().addAll(lstpaquete);
				tv.setIdPaquetes(idpaquetes);
			}
		}

		eventos1 = 0;
		//if (eventos1 != 0) {
		if (eventos1 == 0) {
			IdEventos ideventos = new IdEventos();

			ideventos.setCantE(1);

			List<IdEvento> lstevento = ideventos.getIdEvento();

			IdEvento eve = new IdEvento();
			eve.setIdEvento(eventos1); // 200010 //880154 //880156 90763
			lstevento.add(eve);

			ideventos.getIdEvento().addAll(lstevento);
			tv.setIdEventos(ideventos);
		}

		det.setTVpagada(tv);
		// 0911334050
		cmd.setDetalle(det);
		System.out.println(tv.getSerie());
		System.out.println("Datoc1="+tv.getDatoC1());

		return cmd;

	}


	public static void main(String[] args) throws NumberFormatException,
			IllegalArgumentException, SecurityException,
			IllegalAccessException, NoSuchFieldException, IOException,
			ParseException, Excepciones {
		// TODO Auto-generated method stub
		System.out.println(" INICIO DEL PROCESO");
		System.out.println(" --------------------- CAS");
		Respuesta response = new WsdlTvPagadaImpl()
					.aprovTvPagada(new MainTvPagada().setDAC());

		System.out.println("Codigo Error  "+response.getMensaje().getCodError());
		System.out.println("Mensaje Error "+response.getMensaje().getDetMensaje());
/*		System.out.println("Cuenta # "
					+ response.getMensaje().getDatosExtrasTVP().getPlant());
/*			System.out.println("Activo Si 1/ Inactivo Si 0 ="
					+ response.getMensaje().getDatosExtrasTVP().getIdServ());
			// 716 respondingFlag
			// System.out.println("Numero de CodMap/Resp"+response.getMensaje().getDatosExtrasTVP().getCodMap());
			System.out.println("Problema de Retorno si es 1 ="
					+ response.getMensaje().getDatosExtrasTVP().getCodMap());
			// 716 idaccount
			// System.out.println("Numero de Plant/idAcco"+response.getMensaje().getDatosExtrasTVP().getPlant());
			System.out
					.println("Unit Address"
							+ response.getMensaje().getDatosExtrasTVP()
									.getUnitAddres());
			System.out.println("idServicio"
					+ response.getMensaje().getDatosExtrasTVP().getIdServ());
			System.out.println("Creditos"
					+ response.getMensaje().getDatosExtrasTVP().getCredito());
			for (int i = 0; i < response.getMensaje().getDatosExtrasTVP()
					.getCodMap(); i++) {
				System.out
						.println("idServicio"
								+ response.getMensaje().getDatosExtrasTVP()
										.getIdServ());
			}
			// System.out.println("Numero de Paquetes"+response.getMensaje().getDatosExtrasTVP().getNumPaq().getCantP());
			for (int i = 0; i < response.getMensaje().getDatosExtrasTVP()
					.getNumPaq().getIdPay().size(); i++) {
				System.out.println("Service -" + i + 1);
				System.out.println("idPaquete"
						+ response.getMensaje().getDatosExtrasTVP().getNumPaq()
								.getIdPay().get(i).getIdPay());
			}*/
	}
	
}
