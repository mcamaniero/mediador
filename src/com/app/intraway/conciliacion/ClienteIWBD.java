package com.app.intraway.conciliacion;

import java.io.IOException;
import java.util.List;

import javax.xml.rpc.ServiceException;

import org.apache.commons.httpclient.HttpException;
import org.jdom.JDOMException;

import com.app.dao.conciliacion.AdmConciliacion;
import com.app.dao.conciliacion.AdmConciliacionDAO;
import com.app.dao.titan.Querys;
import com.app.intraway.consulta.GetReport;
import com.app.intraway.consulta.ids.CableModem;
import com.app.intraway.consulta.ids.ClienteCrm;
import com.app.intraway.consulta.ids.DialUp;
import com.app.intraway.consulta.ids.Email;

public class ClienteIWBD implements Runnable {

	private List<AdmConciliacion> RegistrosCM;
	private List<AdmConciliacion> RegistrosEmail;
	private List<AdmConciliacion> RegistrosDialUp;

	private String Ciudad;
	private String Contrato;
	
	
	public ClienteIWBD(String ciudad, String contrato) {
		this.setCiudad(ciudad);
		this.setContrato(contrato);
	}
	

	public void run() {

		ClienteCrm clientIW = null;
		
		try {
			clientIW = new GetReport(this.getCiudad(), this.getContrato(), 
					null, null, null, false, false).getClienteCrm();
			
			if(!clientIW.getNombre().equals("NO EXISTE EL CLIENTE")){
				
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				RegistrosCM = new AdmConciliacionDAO().findByProperty(
						AdmConciliacionDAO.CIUDAD, Ciudad,
						AdmConciliacionDAO.CUENTA, Contrato,
						AdmConciliacionDAO.TIPO, "Modem");
			
				RegistrosEmail = new AdmConciliacionDAO().findByProperty(
						AdmConciliacionDAO.CIUDAD, Ciudad,
						AdmConciliacionDAO.CUENTA, Contrato,
						AdmConciliacionDAO.TIPO, "e-Mail");
				
				/*RegistrosDialUp = new AdmConciliacionDAO().findByProperty(
						AdmConciliacionDAO.CIUDAD, Ciudad,
						AdmConciliacionDAO.CUENTA, Contrato,
						AdmConciliacionDAO.TIPO, "DialUp");
				*/
				
				//cliente creado con los ids d la base de datos
				ClienteCrm clienteBD = new ClienteCrm(this.getCiudad(), this.getContrato());
				
				
				CableModem	[] cm = new CableModem[RegistrosCM.size()];
				Email		[] em = new Email[RegistrosEmail.size()];
				//DialUp		[] dial = new DialUp[RegistrosDialUp.size()];
				
				
				int i = 0;
				for(AdmConciliacion tmpCm : RegistrosCM){
					cm[i] = new CableModem(tmpCm.getIdproducto(), "0");
					cm[i].setAdmConciliacion(tmpCm);
					cm[i].setIdClienteCRM(this.getContrato());
					cm[i].setIdEmpresaCRM(this.getCiudad());
					i++;
				}
				clienteBD.setCm(cm );
				
				int j = 0;
				for(AdmConciliacion tmpEmail : RegistrosEmail){
					em[j] = new Email(tmpEmail.getIdproducto(), "0");
					em[j].setAdmConciliacion(tmpEmail);
					j++;
				}
				clienteBD.setEm(em);
				
				/*int k = 0;
				for(AdmConciliacion tmpDialUp : RegistrosDialUp){
					dial[k] = new DialUp(tmpDialUp.getIdproducto(), "0");
					dial[k].setAdmConciliacion(tmpDialUp);
					k++;
				}
				clienteBD.setDial(dial);*/

				//comparo Cliente consultado en IW con el de la BASE
				boolean exist = clientIW.equals(clienteBD);
				
				/*if(!exist){
					clientIW.EliminarTodoProductos();
					
					new Querys().executeAPI_CreacionCliente(clientIW.getIdClienteCRM(), "A");
					//new Querys().executeAPI_CreacionCliente(clientIW.getIdClienteCRM(), "S");
					
				}*/
				
				
				
			}

		} catch (HttpException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JDOMException e) {
			e.printStackTrace();
		}
	}


	public String getCiudad() {
		return Ciudad;
	}

	public void setCiudad(String ciudad) {
		Ciudad = ciudad;
	}

	public String getContrato() {
		return Contrato;
	}

	public void setContrato(String contrato) {
		Contrato = contrato;
	}


	

}
