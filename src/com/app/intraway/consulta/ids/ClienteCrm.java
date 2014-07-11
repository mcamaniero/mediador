package com.app.intraway.consulta.ids;

import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.xml.rpc.ServiceException;



public class ClienteCrm{

	private String IdEmpresaCRM;
	private String Empresa;
	private String IdClienteCRM;
	private String Nombre;
	private String Username;
	private String TipoCliente;

	private CableModem Cm[];
	private Email Em[];
	private DialUp Dial[];


	public ClienteCrm(String idEmpresaCRM, String idClienteCRM){
		this.setIdClienteCRM(idClienteCRM);
		this.setIdEmpresaCRM(idEmpresaCRM);
	}

	public ClienteCrm(String idEmpresaCRM, String empresa, String idClienteCRM, String nombre,
			String username, String tipoCliente) {
		this.setEmpresa(empresa);
		this.setIdClienteCRM(idClienteCRM);
		this.setIdEmpresaCRM(idEmpresaCRM);
		this.setNombre(nombre);
		this.setTipoCliente(tipoCliente);
		this.setUsername(username);
	}

	public String getIdEmpresaCRM() {
		return IdEmpresaCRM;
	}


	public void setIdEmpresaCRM(String idEmpresaCRM) {
		IdEmpresaCRM = idEmpresaCRM;
	}


	public String getEmpresa() {
		return Empresa;
	}


	public void setEmpresa(String empresa) {
		Empresa = empresa;
	}


	public String getIdClienteCRM() {
		return IdClienteCRM;
	}


	public void setIdClienteCRM(String idClienteCRM) {
		IdClienteCRM = idClienteCRM;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public String getUsername() {
		return Username;
	}


	public void setUsername(String username) {
		Username = username;
	}


	public String getTipoCliente() {
		return TipoCliente;
	}


	public void setTipoCliente(String tipoCliente) {
		TipoCliente = tipoCliente;
	}

	public CableModem[] getCm() {
		return Cm;
	}

	public void setCm(CableModem cm[]) {
		Cm = cm;
	}

	public Email[] getEm() {
		return Em;
	}

	public void setEm(Email[] em) {
		Em = em;
	}

	public DialUp[] getDial() {
		return Dial;
	}

	public void setDial(DialUp[] dial) {
		Dial = dial;
	}


	//comparo Cliente consultado en IW con el cliente de la baseTitan
	public boolean equals(Object obj){

		//cliente de la base
		ClienteCrm clienteBD = (ClienteCrm)obj;


		boolean esIgual = true;

		if(getCm()!=null){
			for(CableModem cm : this.getCm())
				if ( ! cm.ExiteEnIw(clienteBD.getCm()) )
					esIgual = false;
		}/*else{
			for(CableModem cmBD : clienteBD.getCm()){
				if ( ! cmBD.ExiteEnIwByIdProducto())
					esIgual = false;
			}
		}*/

		if(getEm()!=null)
			for(Email em : this.getEm())
				if ( ! em.ExiteEnIw(clienteBD.getEm()) )
					esIgual = false;

		if(getDial()!=null)
			for(DialUp di : this.getDial())
				if ( ! di.ExiteEnIw(clienteBD.getDial()) )
					esIgual = false;


		return esIgual;
	}




	public void EliminarTodoProductos(){
		try {
			if(this.getCm() != null)
				for(CableModem cm : this.getCm())
					cm.EliminarArbol();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		}

		try {
			if(this.getEm() != null)
				for(Email email : this.getEm())
					email.EliminarEmail();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		}

		try {
			if(this.getDial() != null)
				for(DialUp dial : this.getDial())
					dial.EliminarDialUp();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		}

	}



	public ArrayList<Linea> getLineas(){
		ArrayList<Linea> lin = new ArrayList<Linea>();
		for(CableModem cm : this.getCm())
			if(cm.getAllLineas()!=null)
				for(Linea li : cm.getAllLineas()){
					lin.add(li);
				}

		return lin;
	}



}
