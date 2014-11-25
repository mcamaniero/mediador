package com.app.tvp;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import com.app.dao.EntityManagerHelper;
import com.app.tv.tvp_admsessions.dao.AdmSessions;
import com.app.tv.tvp_admsessions.dao.AdmSessionsDAO;
import com.app.tv.tvp_consultatv.dao.TvpConsultatv;
import com.app.tv.tvp_consultatv.dao.TvpConsultatvDAO;
import com.app.tv.tvp_consultatvfinish.dao.TvpConsultatvfinish;
import com.app.tv.tvp_consultatvfinish.dao.TvpConsultatvfinishDAO;
import com.app.tv.tvp_equivalencias.dao.TvpEquivalencias;
import com.app.tv.tvp_equivalencias.dao.TvpEquivalenciasDAO;
import com.app.tv.tvp_ordenacc.dao.TvpOrdenacc;
import com.app.tv.tvp_ordenacc.dao.TvpOrdenaccDAO;

import ec.com.grupotvcable.wsdltvpagada.Cabecera;
import ec.com.grupotvcable.wsdltvpagada.Respuesta;

import tvcable.app.comarch.utils.Conversiones;
import tvcable.app.comarch.utils.Paquete;

public class Comando801Tv extends Thread {

	private ParametrosTV parametros;
	//private ParametrosTV parametros;
	private StringBuilder converterId = new StringBuilder();;
	private StringBuilder paquete801 = new StringBuilder();
	private Integer sessionid;
	private Integer sessionId;
	private Integer sessionReportType;
	private String tamanio;
	private Cabecera cabecera = new Cabecera();
	private Respuesta respuesta;
	private Integer maxId;
	private int limite;
	private String Activo;
	private String estadoDeco;
	private Integer admsesionid;
	private Integer sesid;

	public Comando801Tv(ParametrosTV parametro) {
		parametros = parametro;
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param args
	 * @throws UnsupportedEncodingException 
	 */
	
	public StringBuilder Comando801() throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException, UnsupportedEncodingException
	{	
		// TODO Auto-generated method stub
		
		//System.out.println("Creacion del Comando 801");
	     //new AdmSessionsDAO().sessionid().get(0).getSesionTv();
	    sessionid = Integer.valueOf(parametros.cmd.getDetalle().getTVpagada().getAccion());
	    System.out.println("sessionid"+sessionid);
	    //sessionid =31;
	    admsesionid = new AdmSessionsDAO().admsesion(sessionid);
	    
	    System.out.println(this.admsesionid);
		//List<TvpConsultatv> tvpconsulta = new TvpConsultatvDAO().findAll();
		List<TvpConsultatv> tvpconsulta = new TvpConsultatvDAO().findByProperty("sessionId",sessionid);
		System.out.println("tvpconsulta"+tvpconsulta.size());
	    for (int p=0; p<tvpconsulta.size();p++)
	    {
	    	System.out.println("Entro al for");
	    	TvpConsultatvfinish tvpconsultafinish = new TvpConsultatvfinish();
	    	System.out.println("getCpartyId"+tvpconsulta.get(p).getCpartyId());
			EntityManagerHelper.beginTransaction();
			 
			 tvpconsultafinish.setCpartyId(tvpconsulta.get(p).getCpartyId());
			 tvpconsultafinish.setCpartyIdAccount(tvpconsulta.get(p).getCpartyAccountId());
			 tvpconsultafinish.setDecoSerie(tvpconsulta.get(p).getApaddress());
			 tvpconsultafinish.setDecoId("");
			 tvpconsultafinish.setDecoIdControlador(0);
			 
			 tvpconsultafinish.setEstadoControlador("");
			 tvpconsultafinish.setEstadoTitan(tvpconsulta.get(p).getActivitytype());
			 tvpconsultafinish.setServicioControlador("");
			 tvpconsultafinish.setServicioTitan(""+tvpconsulta.get(p).getTariffPlanVariantName());
			 tvpconsultafinish.setConsultatvId(tvpconsulta.get(p).getId());
			 sesid = tvpconsulta.get(p).getId();
			 System.out.println("Sesion ID"+sesid);
			 tvpconsultafinish.setSessionId(tvpconsulta.get(p).getSessionId());
			 sessionId = tvpconsulta.get(p).getId();
			 tvpconsultafinish.setPaychannelsTitan("");
			 tvpconsultafinish.setPaychannelsControlador("");
			 tvpconsultafinish.setSessionReportType(tvpconsulta.get(p).getSystemIdActive());
			 sessionReportType = tvpconsulta.get(p).getSystemIdActive();
			 
			 tvpconsultafinish.setCiudad(tvpconsulta.get(p).getSystemIdActive());
			 
			 DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			 java.util.Date date = new java.util.Date();
			// datetime = dateFormat.format(date);
			 
			 tvpconsultafinish.setFecha(date);
			 
			 
			 
			new TvpConsultatvfinishDAO().save(tvpconsultafinish);
			EntityManagerHelper.commit();
			EntityManagerHelper.closeEntityManager();
			
			
				parametros.setValue("numeroserieaudit", tvpconsulta.get(p).getApaddress().toString());
				parametros.setValue("serieidaudit", 0);	
				parametros.setValue("tipoaudit", 30);

				paquete801 = new Comando280Tv(parametros).Comando280();

				tamanio = Integer.toString(Paquete.PaqueteLength(paquete801.toString()));
				tamanio = ""+(Integer.valueOf(tamanio)+6);
				
				parametros.setValue("Tamanio",String.format("%4s",Conversiones.DecimalToHexadecimal(tamanio)).replace(' ','0'));
				parametros.setValue("Paquete", paquete801);
				parametros.setValue("Comando",String.format("%4s",Conversiones.DecimalToHexadecimal(""+280)).replace(' ','0'));
				parametros.setValue("LogId", 0);
				switch(sessionReportType)
				{
				case 3:
					 cabecera.setIDEmpresa(94);
				     break;
				case 4:
					 cabecera.setIDEmpresa(63);
					 break;
				case 5:
					 cabecera.setIDEmpresa(65);
				     break;
				case 6:
					 cabecera.setIDEmpresa(96);
					 break;
				}
				parametros.cmd.setCabecera(cabecera);
				respuesta = new GuardarComandoTV().guardarACC(parametros);
				maxId = new TvpConsultatvfinishDAO().smax(this.sesid,this.sessionReportType);
				
				EntityManagerHelper.beginTransaction();
				 tvpconsultafinish.setId(maxId);
				 tvpconsultafinish.setCpartyId(tvpconsulta.get(p).getCpartyId());
				 tvpconsultafinish.setCpartyIdAccount(tvpconsulta.get(p).getCpartyAccountId());
				 tvpconsultafinish.setDecoId(""+respuesta.getMensaje().getDatosExtrasTVP().getUnitAddres());
				 tvpconsultafinish.setDecoSerie(tvpconsulta.get(p).getApaddress());
				 limite = respuesta.getMensaje().getDatosExtrasTVP().getActivo().length();
				 Activo = respuesta.getMensaje().getDatosExtrasTVP().getActivo().substring(limite-1, limite);
				 if (Integer.valueOf(Activo) == 1)
				 {
					 estadoDeco = "A";
				 }
				 else
				 {
					 estadoDeco = "S";
				 }

				 tvpconsultafinish.setEstadoTitan(tvpconsulta.get(p).getActivitytype());
				 tvpconsultafinish.setEstadoControlador(""+estadoDeco);				 
				 tvpconsultafinish.setServicioTitan(""+tvpconsulta.get(p).getTariffPlanVariantName());
				 tvpconsultafinish.setServicioControlador(""+respuesta.getMensaje().getDatosExtrasTVP().getIdServ());
				 
				 tvpconsultafinish.setConsultatvId(tvpconsulta.get(p).getId());
				 tvpconsultafinish.setSessionId(tvpconsulta.get(p).getSessionId());
				 tvpconsultafinish.setPaychannelsTitan("");

					if (respuesta.getMensaje().getDatosExtrasTVP().getNumPaq() != null)
					{
						for(int i=0;i<respuesta.getMensaje().getDatosExtrasTVP().getNumPaq().getIdPay().size();i++)
						{
							System.out.println("idPaquete"+respuesta.getMensaje().getDatosExtrasTVP().getNumPaq().getIdPay().get(i).getIdPay());
						}
					}
				 
				 tvpconsultafinish.setPaychannelsControlador("");	

				 tvpconsultafinish.setFecha(date);
				 
				new TvpConsultatvfinishDAO().update(tvpconsultafinish);
				EntityManagerHelper.commit();
				EntityManagerHelper.closeEntityManager();				
				
	    }


	      
	    AdmSessions admSesion = new AdmSessionsDAO().findById(admsesionid);
	    //TvpOrdenacc ordenACC = new TvpOrdenaccDAO().findById(clave);
		EntityManagerHelper.beginTransaction();	    
	    admSesion.setId(this.admsesionid);
	    admSesion.setSesionFecha(admSesion.getSesionFecha());
	    admSesion.setSesionInt(0);
	    admSesion.setSesionIntFecha(null);
	    admSesion.setSesionTel(0);
	    admSesion.setSesionTelFecha(null);
	    admSesion.setSesionTv(this.sessionid);
	    System.out.println("usu"+admSesion.getSesionUsuario());
	    admSesion.setSesionTvFecha(admSesion.getSesionFecha());
	    admSesion.setSesionUsuario(admSesion.getSesionUsuario());
	    admSesion.setSessionReportType(sessionReportType);
	    admSesion.setSessionUsuarioMaquina(admSesion.getSessionUsuarioMaquina());
	    
		new AdmSessionsDAO().update(admSesion);
		EntityManagerHelper.commit();
		EntityManagerHelper.closeEntityManager();		
	    
	    System.out.println("Salio del loop");
		/*
	    List<TvpConsultatvfinish> tvpconsultafinish = new TvpConsultatvfinishDAO().findAll();
	    
	    
	    for (int p=0; p<tvpconsultafinish.size();p++)
	    {
	    	
	    }
	    */
	    
		return paquete801;
	}
	
	public StringBuilder Comando801DAC() throws IllegalArgumentException, SecurityException, IllegalAccessException, NoSuchFieldException, IOException, ParseException, Excepciones
	{	
		// TODO Auto-generated method stub
		
		//System.out.println("Creacion del Comando 801");
	     //new AdmSessionsDAO().sessionid().get(0).getSesionTv();
	    sessionid = Integer.valueOf(parametros.cmd.getDetalle().getTVpagada().getAccion());
	    System.out.println("sessionid"+sessionid);
	    //sessionid =31;
	    admsesionid = new AdmSessionsDAO().admsesion(sessionid);
	    
	    System.out.println(this.admsesionid);
		//List<TvpConsultatv> tvpconsulta = new TvpConsultatvDAO().findAll();
		List<TvpConsultatv> tvpconsulta = new TvpConsultatvDAO().findByProperty("sessionId",sessionid);
		System.out.println("tvpconsulta"+tvpconsulta.size());
	    for (int p=0; p<tvpconsulta.size();p++)
	    {
	    	System.out.println("Entro al for");
	    	TvpConsultatvfinish tvpconsultafinish = new TvpConsultatvfinish();
	    	System.out.println("getCpartyId"+tvpconsulta.get(p).getCpartyId());
			EntityManagerHelper.beginTransaction();
			 
			 tvpconsultafinish.setCpartyId(tvpconsulta.get(p).getCpartyId());
			 tvpconsultafinish.setCpartyIdAccount(tvpconsulta.get(p).getCpartyAccountId());
			 tvpconsultafinish.setDecoSerie(tvpconsulta.get(p).getApaddress());
			 tvpconsultafinish.setDecoId("");
			 tvpconsultafinish.setDecoIdControlador(0);
			 
			 tvpconsultafinish.setEstadoControlador("");
			 tvpconsultafinish.setEstadoTitan(tvpconsulta.get(p).getActivitytype());
			 tvpconsultafinish.setServicioControlador("");
			 tvpconsultafinish.setServicioTitan(""+tvpconsulta.get(p).getTariffPlanVariantName());
			 tvpconsultafinish.setConsultatvId(tvpconsulta.get(p).getId());
			 sesid = tvpconsulta.get(p).getId();
			 System.out.println("Sesion ID"+sesid);
			 tvpconsultafinish.setSessionId(tvpconsulta.get(p).getSessionId());
			 sessionId = tvpconsulta.get(p).getId();
			 tvpconsultafinish.setPaychannelsTitan("");
			 tvpconsultafinish.setPaychannelsControlador("");
			 tvpconsultafinish.setSessionReportType(tvpconsulta.get(p).getSystemIdActive());
			 sessionReportType = tvpconsulta.get(p).getSystemIdActive();
			 
			 tvpconsultafinish.setCiudad(tvpconsulta.get(p).getSystemIdActive());
			 
			 DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			 java.util.Date date = new java.util.Date();
			// datetime = dateFormat.format(date);
			 
			 tvpconsultafinish.setFecha(date);
			 
			 
			 
			new TvpConsultatvfinishDAO().save(tvpconsultafinish);
			EntityManagerHelper.commit();
			EntityManagerHelper.closeEntityManager();
			
			
				parametros.setValue("numeroserieaudit", tvpconsulta.get(p).getApaddress().toString());
				parametros.setValue("serieidaudit", 0);	
				parametros.setValue("tipoaudit", 30);

				paquete801 = new Comando280Tv(parametros).Comando280();

				tamanio = Integer.toString(Paquete.PaqueteLength(paquete801.toString()));
				tamanio = ""+(Integer.valueOf(tamanio)+6);
				
				parametros.setValue("Tamanio",String.format("%4s",Conversiones.DecimalToHexadecimal(tamanio)).replace(' ','0'));
				parametros.setValue("Paquete", paquete801);
				parametros.setValue("Comando",String.format("%4s",Conversiones.DecimalToHexadecimal(""+280)).replace(' ','0'));
				parametros.setValue("LogId", 0);
				switch(sessionReportType)
				{
				case 3:
					 cabecera.setIDEmpresa(94);
				     break;
				case 4:
					 cabecera.setIDEmpresa(63);
					 break;
				case 5:
					 cabecera.setIDEmpresa(65);
				     break;
				case 6:
					 cabecera.setIDEmpresa(96);
					 break;
				}
				parametros.cmd.setCabecera(cabecera);
				respuesta = new GuardarComandoTV().guardarDAC(parametros);
				maxId = new TvpConsultatvfinishDAO().smax(this.sesid,this.sessionReportType);
				
				EntityManagerHelper.beginTransaction();
				 tvpconsultafinish.setId(maxId);
				 tvpconsultafinish.setCpartyId(tvpconsulta.get(p).getCpartyId());
				 tvpconsultafinish.setCpartyIdAccount(tvpconsulta.get(p).getCpartyAccountId());
				 tvpconsultafinish.setDecoId(""+respuesta.getMensaje().getDatosExtrasTVP().getUnitAddres());
				 tvpconsultafinish.setDecoSerie(tvpconsulta.get(p).getApaddress());
				 limite = respuesta.getMensaje().getDatosExtrasTVP().getActivo().length();
				 Activo = respuesta.getMensaje().getDatosExtrasTVP().getActivo().substring(limite-1, limite);
				 if (Integer.valueOf(Activo) == 1)
				 {
					 estadoDeco = "A";
				 }
				 else
				 {
					 estadoDeco = "S";
				 }

				 tvpconsultafinish.setEstadoTitan(tvpconsulta.get(p).getActivitytype());
				 tvpconsultafinish.setEstadoControlador(""+estadoDeco);				 
				 tvpconsultafinish.setServicioTitan(""+tvpconsulta.get(p).getTariffPlanVariantName());
				 tvpconsultafinish.setServicioControlador(""+respuesta.getMensaje().getDatosExtrasTVP().getIdServ());
				 
				 tvpconsultafinish.setConsultatvId(tvpconsulta.get(p).getId());
				 tvpconsultafinish.setSessionId(tvpconsulta.get(p).getSessionId());
				 tvpconsultafinish.setPaychannelsTitan("");

					if (respuesta.getMensaje().getDatosExtrasTVP().getNumPaq() != null)
					{
						for(int i=0;i<respuesta.getMensaje().getDatosExtrasTVP().getNumPaq().getIdPay().size();i++)
						{
							System.out.println("idPaquete"+respuesta.getMensaje().getDatosExtrasTVP().getNumPaq().getIdPay().get(i).getIdPay());
						}
					}
				 
				 tvpconsultafinish.setPaychannelsControlador("");	

				 tvpconsultafinish.setFecha(date);
				 
				new TvpConsultatvfinishDAO().update(tvpconsultafinish);
				EntityManagerHelper.commit();
				EntityManagerHelper.closeEntityManager();				
				
	    }


	      
	    AdmSessions admSesion = new AdmSessionsDAO().findById(admsesionid);
	    //TvpOrdenacc ordenACC = new TvpOrdenaccDAO().findById(clave);
		EntityManagerHelper.beginTransaction();	    
	    admSesion.setId(this.admsesionid);
	    admSesion.setSesionFecha(admSesion.getSesionFecha());
	    admSesion.setSesionInt(0);
	    admSesion.setSesionIntFecha(null);
	    admSesion.setSesionTel(0);
	    admSesion.setSesionTelFecha(null);
	    admSesion.setSesionTv(this.sessionid);
	    System.out.println("usu"+admSesion.getSesionUsuario());
	    admSesion.setSesionTvFecha(admSesion.getSesionFecha());
	    admSesion.setSesionUsuario(admSesion.getSesionUsuario());
	    admSesion.setSessionReportType(sessionReportType);
	    admSesion.setSessionUsuarioMaquina(admSesion.getSessionUsuarioMaquina());
	    
		new AdmSessionsDAO().update(admSesion);
		EntityManagerHelper.commit();
		EntityManagerHelper.closeEntityManager();		
	    
	    System.out.println("Salio del loop");
		/*
	    List<TvpConsultatvfinish> tvpconsultafinish = new TvpConsultatvfinishDAO().findAll();
	    
	    
	    for (int p=0; p<tvpconsultafinish.size();p++)
	    {
	    	
	    }
	    */
	    
		return paquete801;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

}
