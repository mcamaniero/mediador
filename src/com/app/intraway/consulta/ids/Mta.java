package com.app.intraway.consulta.ids;

import java.rmi.RemoteException;
import java.util.GregorianCalendar;

import javax.xml.rpc.ServiceException;

import com.app.dao.AllDAO;
import com.app.dao.EntityManagerHelper;
import com.app.dao.Intraway;
import com.app.dao.IntrawayImpl;
import com.app.dao.conciliacion.AdmConciliacionDAO;
import com.app.intraway.parametros2.Interfaces;


public class Mta extends Producto{

	private String Macaddress;
	private String MtaModel;
	private String MtaProfile;
	private Linea[] EndPoint;
	
	
	public Mta(String userEliminacion, String remoteHost, String remoteIp, String nombre, String estado, String idProducto,  String idProductoPadre, String macaddress,
			String mtaModel, String mtaProfile) {
		super(userEliminacion, remoteHost, remoteIp, nombre, idProducto, idProductoPadre, estado);
		this.setMacaddress(macaddress);
		this.setMtaModel(mtaModel);
		this.setMtaProfile(mtaProfile);
	}
	
	public String getMacaddress() {
		return Macaddress;
	}

	public void setMacaddress(String macaddress) {
		Macaddress = macaddress;
	}

	public String getMtaModel() {
		return MtaModel;
	}

	public void setMtaModel(String mtaModel) {
		MtaModel = mtaModel;
	}

	public Linea[] getEndPoint() {
		return EndPoint;
	}

	public void setEndPoint(Linea[] endPoint) {
		EndPoint = endPoint;
	}

	public String getMtaProfile() {
		return MtaProfile;
	}

	public void setMtaProfile(String mtaProfile) {
		MtaProfile = mtaProfile;
	}

	public void EliminarLinea() throws RemoteException, ServiceException{
		for(Linea cf : this.getEndPoint())
			cf.EliminarEspacio();
	}
	
	
	public String getTodasLineas(){
		StringBuilder lin = new StringBuilder();
		if(getEndPoint()!=null)
			for(Linea e : this.getEndPoint()){
				lin.append(e.getTN());
				lin.append(";");
			}
		return lin.toString().equals("") ? "" : lin.toString().substring(0, lin.toString().length()-1);
	}
	
	
	public String EliminarEspacio() throws RemoteException, ServiceException{
		
		Intraway LogIntraway = new IntrawayImpl().Guardar(this);
		String resultado = new Interfaces(this, Interfaces.INTERFAZ_MTA, this.UserEliminacion).EjecutarAccion(Interfaces.ACCION_ELIMINAR);
		
		String[] resul = resultado.split(":");
		String codError = resul[0].trim();
		String detError = resul[1].trim();
		
		LogIntraway.setCodError(codError);
		LogIntraway.setDetMensaje(detError);
		LogIntraway.setFechaResp(GregorianCalendar.getInstance().getTime());

		EntityManagerHelper.beginTransaction();
		new AllDAO().update(LogIntraway);
		EntityManagerHelper.commit();
			
		return (codError.equals("20004") && CrearLineas() == 1) 
			? EliminarEspacio()	: (codError+","+detError);
	}

	
	private int CrearLineas(){
		int resp = 0;
		for(Linea l : this.getEndPoint()){
			int rsp = l.CrearLineaSafari();
			if(rsp == 1)
				resp = 1;
		}
		return resp;
	}

	/*public boolean ExiteEnIw(Mta mta) {
		if(this.equals(mta)){
			//si existe guardo en la base que si existe
			mta.getAdmConciliacion().setIsExiste(true);
			EntityManagerHelper.beginTransaction();
			new AdmConciliacionDAO().update(mta.getAdmConciliacion());
			EntityManagerHelper.commit();
			
			return true;
		}
		
		return false;
		
	}*/
	
	@Override
	public boolean equals(Object obj){
		//System.out.println("ID: "+this.IdProducto+" "+((Mta)obj).getIdProducto());
		
		return (this.IdProducto.equals( ((Mta)obj).getIdProducto() ) 
				&& this.getIdProductoPadre().equals(((Mta)obj).getIdProductoPadre())) 
				? true : false;
	}
	

}
