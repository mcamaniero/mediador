package com.app.intraway.consulta.ids;

import java.rmi.RemoteException;
import java.util.GregorianCalendar;

import javax.xml.rpc.ServiceException;

import com.app.dao.AllDAO;
import com.app.dao.EntityManagerHelper;
import com.app.dao.Intraway;
import com.app.dao.IntrawayImpl;
import com.app.dao.conciliacion.linea.AdmConciliacionLinea;
import com.app.intraway.parametros2.Interfaces;

import ec.com.grupotvcable.wsdlsafari.Cabecera;
import ec.com.grupotvcable.wsdlsafari.Comando;
import ec.com.grupotvcable.wsdlsafari.Detalle;
import ec.com.grupotvcable.wsdlsafari.Respuesta;
import ec.com.grupotvcable.wsdlsafari.Safari;
import ec.com.grupotvcable.wsdlsafari.WsdlSafari;
import ec.com.grupotvcable.wsdlsafari.WsdlSafariClient;

public class Linea extends Producto{

	private String TN;
	private String EpHomeExchange;
	private String EndPointNumber; //puerto
	private String EpProfile;
	private CallFeature[] CFeatures;
	private Mta MtaPadre;
	
	private AdmConciliacionLinea admConciliacionLinea;
	
	public Linea(){
		super(null, null,null,null,null,null,null);
	}
	
	public Linea(String idproducto, String idProductoPadre) {
		super(null,null,null,null,idproducto,idProductoPadre,null);
	}

	public Linea(String userEliminacion, String remoteHost, String remoteIp, String nombre, String estado, String idProducto, String idProductoPadre, String tn,
			String epHomeExchange, String endPointNumber, String epProfile) {
		super(userEliminacion, remoteHost, remoteIp, nombre, idProducto, idProductoPadre, estado);
		this.setTN(tn);
		this.setEpHomeExchange(epHomeExchange);
		this.setEpProfile(epProfile);
		this.setEndPointNumber(endPointNumber);
	}

	

	public String getTN() {
		return TN;
	}

	public void setTN(String tn) {
		TN = tn;
	}

	public String getEpHomeExchange() {
		return EpHomeExchange;
	}

	public void setEpHomeExchange(String epHomeExchange) {
		EpHomeExchange = epHomeExchange;
		//if(EpHomeExchange.equals("STD-SUS-MORA31"))
			//this.setEstado("Inactivo");
	}

	public CallFeature[] getCFeatures() {
		return CFeatures;
	}

	public void setCFeatures(CallFeature[] features) {
		CFeatures = features;
	}

	public String getEndPointNumber() {
		return EndPointNumber;
	}
	

	public String getEpProfile() {
		return EpProfile;
	}

	public void setEpProfile(String epProfile) {
		EpProfile = epProfile;
	}

	public void setEndPointNumber(String endPointNumber) {
		EndPointNumber = endPointNumber;
	}
	
	public Mta getMtaPadre() {
		return MtaPadre;
	}

	public void setMtaPadre(Mta mtaPadre) {
		MtaPadre = mtaPadre;
	}
	
	
	public void EliminarCallFeature() throws RemoteException, ServiceException{
		for(CallFeature cf : this.getCFeatures())
			cf.EliminarEspacio();
	}
	
	
	public void EliminarEspacio() throws RemoteException, ServiceException{
		new Interfaces(this, Interfaces.INTERFAZ_LINEA, this.UserEliminacion).EjecutarAccion(Interfaces.ACCION_ELIMINAR);

	}
	
	
	public String EjecutarAccion(String accion) throws RemoteException, ServiceException{
		
		Intraway LogIntraway = new IntrawayImpl().Guardar(this, Integer.parseInt(accion));
		String resultado = new Interfaces(this, Interfaces.INTERFAZ_LINEA, this.UserEliminacion).EjecutarAccion(accion);
		
		String[] resul = resultado.split(":");
		String codError = resul[0].trim();
		String detError = resul[1].trim();
		
		LogIntraway.setCodError(codError);
		LogIntraway.setDetMensaje(detError);
		LogIntraway.setFechaResp(GregorianCalendar.getInstance().getTime());

		EntityManagerHelper.beginTransaction();
		new AllDAO().update(LogIntraway);
		EntityManagerHelper.commit();
			
		return codError+","+detError;
	}

	public int getCallFeatureValidos(){
		int cont = 0;
		if(getCFeatures()!=null){
			for(CallFeature cal : getCFeatures()){
				if(!cal.getIdProducto().equals("-1") && !cal.getIdProductoPadre().equals("-1"))
					cont++;
			}
			return cont;
		}else
			return 0;
	}
	
	
	protected int CrearLineaSafari(){

		Comando cmd = new Comando();
		Cabecera cab = new Cabecera();
		
		int ciudad = 0;
		if (this.getMtaPadre().getMtaProfile().equals("MTA-GYE"))
			ciudad = 94;
		else if (this.getMtaPadre().getMtaProfile().equals("MTA_DEFAULT"))
			ciudad = 63;
		
		cab.setIDEmpresa(ciudad);//94 gye    63 uio    65 cue
		cab.setInterface(1101);//interfaz de creacion de linea
		cab.setNegocio(1);
		cab.setSecuencia(101);
		cmd.setCabecera(cab);

		Detalle det = new Detalle();
		Safari saf = new Safari();
		saf.setEstado("1"); //1activo  0suspendido
		saf.setDatoS1("593x"+this.getTN());//TELEFONO
		saf.setAccion("SIP");
		saf.setDatoS4(this.getUserEliminacion());
		
		det.setSafari(saf );
		cmd.setDetalle(det);

		WsdlSafariClient client = new WsdlSafariClient();
		WsdlSafari service = client.getWsdlSafariHttpPort();

		Respuesta res = service.aprovSafari(cmd);
		
		System.out.println("Respuesta de creacion de linea temporal "+res.getMensaje().getCodError());
		System.out.println("Respuesta de creacion de linea temporal "+res.getMensaje().getDetMensaje());
				
		return res.getMensaje().getCodError();

	}

	public AdmConciliacionLinea getAdmConciliacionLinea() {
		return admConciliacionLinea;
	}

	public void setAdmConciliacionLinea(AdmConciliacionLinea admConciliacionLinea) {
		this.admConciliacionLinea = admConciliacionLinea;
	}
	
	
	
}
