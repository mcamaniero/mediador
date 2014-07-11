package com.app.tvp;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import javax.xml.datatype.DatatypeConstants;

import com.app.dao.TvPagada;
import com.app.tv.adm_contratos.dao.AdmContratos;
import com.app.tv.adm_contratos.dao.AdmContratosDAO;
import com.app.tv.adm_user_pruebas.dao.AdmUserPruebas;
import com.app.tv.adm_user_pruebas.dao.AdmUserPruebasDAO;
import com.app.tvp.cas.objetos.AprovisionarCAS;
import com.app.tvp.cas.util.ImpresionesLog;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;

import ec.com.grupotvcable.wsdltvpagada.*;

public class AprovisionarTv {

	private static Comando cmd = null;
	private static Integer eventos1;
	private static int tipoAPr;
	private static String[] temp;
	private static int len;
	private static Integer paquetes1;
	private static int paquetes2;
	private static int paquetes3;
	private ParametrosTV parametros = null;
	private ComandosTVP paquete = new ComandosTVP();
	private Respuesta respuesta = null;

	private int[] CodUsuarios = { 938, 34, 38, 1551, 606, 1478, 36, 61, 35, 25,
			1479, 40, 1575 };
	// private int[] CodContratos =
	// {4738080,4738085,4738086,4738082,4738084,4738083,4738081,4738088};
	private int[] CodContratos;
	private static int[] pruebaContrac = null;

	private Mensaje mensaje = new Mensaje();
	private TvPagada log;
	private int ppv;
	private int idEmpresa;
	private int base = 0;
	private boolean aprovisionar = false;
	private boolean esContrato = false;
	private String baseAprovisionar;
	private List<AdmContratos> admContratos;
	private List<AdmContratos> admContratosLinea;
	private List<AdmUserPruebas> admUsuariosLinea;

	/*
	 * Elizabeth Vivero (41) L�nin Villarreal (33) no Gina L�pez (38) si Lili�n
	 * Arroba (69) no Alicia Bonilla (941) si Day�n Jaramillo (15) no Juan de la
	 * Cruz Hidalgo (931) no Jonathan Calle (7) Woijtek (925) Kely (40) Raul
	 * (777) Ronny (802) Titan Administrador(1)
	 */

	/**
	 * @param ejecutaComando
	 * @param logTvPagada
	 */
	public AprovisionarTv(Comando ejecutaComando, TvPagada logTvPagada) {
		// TODO Auto-generated constructor stub
		cmd = ejecutaComando;
		log = logTvPagada;
		parametros = new ParametrosTV(cmd);
	}

	public Respuesta Aprovicionar() throws NumberFormatException,
			IllegalArgumentException, SecurityException,
			IllegalAccessException, NoSuchFieldException, IOException,
			Excepciones, ParseException {
		// TODO Auto-generated method stub
		int tipoDeco = cmd.getDetalle().getTVpagada().getTipoD();
		int comando = cmd.getCabecera().getInterface();
		respuesta = new ObjectFactory().createRespuesta();

		// Busca el valor del Equip Type para los tipos de decos y el comando
		// correcto para el
		// controlador especifico.

		parametros
				.Definircontrolador(cmd.getDetalle().getTVpagada().getTipoD());
		int controlador = Integer.valueOf(parametros.getValue("controlador")
				.toString());

		parametros.Definircomando(controlador, comando, tipoDeco);
		idEmpresa = cmd.getCabecera().getIDEmpresa();
		parametros.setValue("ciudadservicio", idEmpresa);
		int idUsuario = parametros.cmd.getDetalle().getTVpagada().getTipoA();
		int idContrato = parametros.cmd.getDetalle().getTVpagada().getCItem();
		boolean esUsuario = false;
		baseAprovisionar = parametros.cmd.getDetalle().getTVpagada()
				.getDatoC2();
		if (idUsuario == 500003 || idUsuario == 500004 || idUsuario == 500005
				|| parametros.cmd.getCabecera().getInterface() == 703) {
			aprovisionar = true;
		} else {

			admContratos = new AdmContratosDAO().findAll();
			admContratosLinea = new AdmContratosDAO().count(idContrato);
			admUsuariosLinea = new AdmUserPruebasDAO().count(idUsuario);
			// new YvdecodificadoresDAO().findByProperty("cliente", "4684849");
			// new YvdecodificadoresDAO().findAll();

			int contrato = Integer.valueOf("" + admContratosLinea.get(0));
			int usuario = Integer.valueOf("" + admUsuariosLinea.get(0));

			if (baseAprovisionar.equals("BSCC")) {
				base = 1;
				System.out.println("BASE APROVISIONAR ---" + base);
			} else if (baseAprovisionar.equals("BSCCR")) {
				base = 2;
			} else if (baseAprovisionar.equals("TYTAN")) {
				if (contrato == 1) {
					esContrato = true;
				}

				if (esContrato) {
					base = 2;
				} else {
					base = 1;
				}
			} else if (baseAprovisionar.equals("TYTANE")) {
				if (contrato == 1) {
					esContrato = true;
				}

				if (usuario == 1) {
					esUsuario = true;
				}

				if (esContrato) {
					base = 2;
				} else {
					base = 1;
				}
			}

			switch (base) {
			case 1:

				if (usuario == 1) {
					esUsuario = true;
				}
				if (!esUsuario)
					aprovisionar = true;

				break;

			case 2:

				if (comando == 703 || comando == 710 || comando == 711
						|| comando == 712 || idUsuario == 500003
						|| idUsuario == 500004 || idUsuario == 500005) {
					aprovisionar = true;
				} else {
					/*
					 * for(int i : CodUsuarios) if(i == idUsuario){ esUsuario =
					 * true; break; } for(int j : this.CodContratos) if(j ==
					 * idContrato){ esContrato = true; break; }
					 */

					if (contrato == 1) {
						esContrato = true;
					}
					if (usuario == 1) {
						esUsuario = true;
					}
					if ((esUsuario && esContrato)
							|| (idUsuario == 1 && esContrato))
						aprovisionar = true;
				}
				break;
			}
		}
		if (aprovisionar) {
			if (idEmpresa != 0) {
				// if ((idEmpresa == 65 && comando == 710) || (idEmpresa == 96
				// && comando == 710))
				if (idEmpresa == 196 && comando == 710) {
					ppv = 1;
				} else {
					ppv = 2;
				}
				switch (ppv) {

				case 1:

					throw new Excepciones(8);

				case 2:
					parametros.Setearciudad(cmd.getCabecera().getIDEmpresa());
					parametros.setValue("LogId", log.getId());

					// parametros.SetearServicio(parametros);
					/*
					 * boolean esUsuario = false; for(int i : CodUsuarios) if(i
					 * == idUsuario){ esUsuario = true; break; } if (esUsuario)
					 * {
					 */
					switch (controlador) {
					case 100: // DAC
						ParametrosTV paqueteTDAC = paquete
								.EjecutaComandoTVPDAC(parametros);
						respuesta = new GuardarComandoTV()
								.guardarDAC(paqueteTDAC);
						break;

					case 101: // ACC
						// parametros.Establecerserie(parametros.cmd.getDetalle().getTVpagada().getIdConvertidor().toString());
						ParametrosTV paqueteTACC = paquete
								.EjecutaComandoTVPACC(parametros);
						respuesta = new GuardarComandoTV()
								.guardarACC(paqueteTACC);
						break;

					case 102: // DALVI
						ParametrosTV paqueteDalvi = paquete
								.EjecutaComandoTVDalvi(parametros);
						respuesta = new GuardarComandoTV()
								.guardarDalvi(paqueteDalvi);
						break;
					case 103 : //DTH
						System.out.println("Inicio codigo que ejecuta comandos: "+ImpresionesLog.obtenerFechaAhora());
						AprovisionarCAS cas = new AprovisionarCAS(parametros);
						respuesta = cas.aprovisionar();
						System.out.println("Fin codigo que ejecuta comandos: "+ImpresionesLog.obtenerFechaAhora());
						break;
					}
					/*
					 * } else {
					 * respuesta.setCabecera(parametros.cmd.getCabecera());
					 * mensaje.setCodError(1); mensaje.setDetMensaje(
					 * "Proceso Realizado con Exito - Pruebas Aprovisionamiento"
					 * ); respuesta.setMensaje(mensaje);
					 * 
					 * }
					 */

				}
				// }

				return respuesta;
			} else {
				throw new Excepciones(7);
			}// End if Empresa
		} else {
			throw new Excepciones(14);
		}// End if Aprovisionamiento

	}

	public static Comando setDacPr(int idEmpresaPr, int interfasePr,
			String accionPr, int idServicioPr, String idPaquetesPr,
			String idEventosPr, String seriePr, int clientePr, int tipoDPr)
			throws Excepciones {
		Cabecera cab = new Cabecera();

		System.out.println(idEmpresaPr);
		cab.setIDEmpresa(idEmpresaPr);
		cab.setInterface(interfasePr);
		cab.setNegocio(03);
		cab.setSecuencia(001);

		cmd.setCabecera(cab);

		Detalle det = new Detalle();

		TVpagada tv = new TVpagada();

		switch (interfasePr) {
		case 702:
			if (accionPr.equals("R")) {
				tv.setAccion(6);
				tv.setDescEvento("Reconectar/Suspender Manual" + tv.getAccion());
			} else if (accionPr.equals("S")) {
				tv.setAccion(5);
				tv.setDescEvento("Reconectar/Suspender Manual" + tv.getAccion());
			} else {
				throw new Excepciones(9);
			}
			break;
		case 700:
			tv.setAccion(3);
			tv.setDescEvento("Refresh Manual" + tv.getAccion());
			break;
		case 703:
			if (accionPr.equals("A")) {
				tv.setAccion(3);
				tv.setDescEvento("Activacion Evento Manual");
			}
			if (accionPr.equals("C")) {
				tv.setAccion(2);
				tv.setDescEvento("Desactivacion Evento Manual");
			}

			try {
				eventos1 = Integer.valueOf(idEventosPr);
				System.out.println("Eventos" + eventos1);
				if (eventos1 > 0) {
					IdEventos ideventos = new IdEventos();

					ideventos.setCantE(1);

					List<IdEvento> lstevento = ideventos.getIdEvento();

					IdEvento eve = new IdEvento();
					eve.setIdEvento(eventos1); // 200010 //880154 //880156 90763
					lstevento.add(eve);

					ideventos.getIdEvento().addAll(lstevento);
					tv.setIdEventos(ideventos);

				} else {
					throw new Excepciones(11);
				}

			} catch (Exception e) {
				throw new Excepciones(10);
			}

			break;

		case 704:
			tv.setTipoC(5);
		}

		Comienzo FechIni = new Comienzo();
		FechIni.setFechaIni(XMLGregorianCalendarImpl.createDate(2008, 07, 29,
				DatatypeConstants.FIELD_UNDEFINED));
		FechIni.setTiempoIni(XMLGregorianCalendarImpl.createTime(20, 0, 0,
				DatatypeConstants.FIELD_UNDEFINED));
		tv.setComienzo(FechIni);

		Final Fecfin = new Final();
		Fecfin.setFechaFin(XMLGregorianCalendarImpl.createDate(2008, 7, 29,
				DatatypeConstants.FIELD_UNDEFINED));
		Fecfin.setTiempoFin(XMLGregorianCalendarImpl.createTime(20, 30, 0,
				DatatypeConstants.FIELD_UNDEFINED));
		tv.setFinal(Fecfin);

		tv.setDatoC1("0");
		tv.setDatoC2("102;101");

		tv.setCItem(clientePr);
		tv.setSerie(seriePr);
		tv.setIdConvertidor(seriePr);
		tv.setIdServicio(idServicioPr);
		tipoAPr = 500005;
		tv.setTipoA(tipoAPr);
		tv.setCredito(10);

		tv.setUbicacion(20);

		tv.setTipoD(tipoDPr);
		// tv.setTipoD(4002); //4002 para DAC, 6072 DC30
		tv.setTipoPromocion(101);

		String delimitador = "-";
		temp = idPaquetesPr.split(delimitador);

		len = temp.length;

		if (len == 1) {
			paquetes1 = Integer.valueOf(idPaquetesPr);
			paquetes2 = 0;
			paquetes3 = 0;
		} else {

			for (int i = 1; i < len; i++) {
				if (i == 1) {
					if (Integer.valueOf(temp[i - 1].toString()) > 0) {
						paquetes1 = Integer.valueOf(temp[i - 1].toString());
						if (len == 2) {
							paquetes2 = Integer.valueOf(temp[i].toString());
						}
						if (len == 3) {
							paquetes3 = Integer.valueOf(temp[i + 1].toString());
						}
					}
				}
			}
		}
		// Paquetes

		if (paquetes1 != 0) {

			if (paquetes2 == 0) {
				IdPaquetes idpaquetes = new IdPaquetes();
				idpaquetes.setCantP(1);
				List<IdPaquete> lstpaquete = idpaquetes.getIdPaquete();

				IdPaquete paq = new IdPaquete();
				paq.setIdPaquete(paquetes1);// 200010 //880154 //880156
				lstpaquete.add(paq);

				idpaquetes.getIdPaquete().addAll(lstpaquete);
				tv.setIdPaquetes(idpaquetes);
			} else if (paquetes2 > 0) {
				if (paquetes3 == 0) {
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
				} else if (paquetes3 > 0) {
					IdPaquetes idpaquetes = new IdPaquetes();
					idpaquetes.setCantP(2);
					List<IdPaquete> lstpaquete = idpaquetes.getIdPaquete();

					IdPaquete paq = new IdPaquete();
					paq.setIdPaquete(paquetes1);
					lstpaquete.add(paq);

					IdPaquete paq2 = new IdPaquete();
					paq2.setIdPaquete(paquetes2);
					lstpaquete.add(paq2);

					IdPaquete paq3 = new IdPaquete();
					paq2.setIdPaquete(paquetes3);
					lstpaquete.add(paq3);

					idpaquetes.getIdPaquete().addAll(lstpaquete);
					tv.setIdPaquetes(idpaquetes);
				}
			}
		}

		// Eventos
		if (interfasePr != 703) {
			eventos1 = Integer.valueOf(idEventosPr);

			if (eventos1 != 0) {
				IdEventos ideventos = new IdEventos();

				ideventos.setCantE(1);

				List<IdEvento> lstevento = ideventos.getIdEvento();

				IdEvento eve = new IdEvento();
				eve.setIdEvento(eventos1); // 200010 //880154 //880156 90763
				lstevento.add(eve);
				/*
				 * IdEvento eve = new IdEvento(); eve.setIdEvento(111393);
				 * //200010 //880154 //880156 lstevento.add(eve);
				 */
				/*
				 * IdEvento eve2 = new IdEvento(); eve2.setIdEvento(100205);
				 * lstevento.add(eve2);
				 * 
				 * IdEvento eve3 = new IdEvento(); eve3.setIdEvento(100114);
				 * lstevento.add(eve3);
				 * 
				 * IdEvento eve4 = new IdEvento(); eve4.setIdEvento(37191);
				 * lstevento.add(eve4);
				 */
				/*
				 * IdPaquete paq5 = new IdPaquete(); paq5.setIdPaquete(100250);
				 * lstpaquete.add(paq5);
				 */

				ideventos.getIdEvento().addAll(lstevento);
				tv.setIdEventos(ideventos);

			}
		}

		det.setTVpagada(tv);
		cmd.setDetalle(det);
		return cmd;
	}

}