package com.app.intraway.consulta;

import intrawayWS.cliente.DocsisReport;
import intrawayWS.cliente.PacketCableCallFeaturesReport;
import intrawayWS.cliente.PacketCableEndPointsReport;
import intrawayWS.cliente.PacketCableReport;
import intrawayWS.cliente.ReportObjInput;
import intrawayWS.cliente.ReportObjOutput;
import intrawayWS.cliente.holders.ArrayOfReportObjOutputHolder;

import java.io.IOException;
import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Vector;

import javax.xml.rpc.ServiceException;

import org.apache.commons.httpclient.HttpException;
import org.jdom.JDOMException;

import com.app.dao.mails.MailsDialUpDAO;
import com.app.intraway.consulta.ids.CableModem;
import com.app.intraway.consulta.ids.CallFeature;
import com.app.intraway.consulta.ids.ClienteCrm;
import com.app.intraway.consulta.ids.DialUp;
import com.app.intraway.consulta.ids.Email;
import com.app.intraway.consulta.ids.Linea;
import com.app.intraway.consulta.ids.Mta;

public class GetReport extends Consulta {


	private ClienteCrm clienteCrm = null;

	public GetReport(String idEmpresaCRM, String idClienteCRM, int cantRecords) throws ServiceException, RemoteException {

		System.out.println("Comienzo GetReport");

		//String cantRecords = "1";
		ReportObjInput showProducts = new ReportObjInput();
		showProducts.setShowPacketCable("true");
		showProducts.setShowDocsis("true");
		showProducts.setShowCom21("false");
		showProducts.setShowDialUp("false");
		showProducts.setShowEmail("false");
		showProducts.setShowHosting("false");
		showProducts.setShowSIP("false");
		showProducts.setShowTelevision("false");
		showProducts.setShowVoiceMail("false");
		showProducts.setShowVoipLine("false");

		ArrayOfReportObjOutputHolder report = new ArrayOfReportObjOutputHolder();

		double tiempoInicio = System.currentTimeMillis();
		Cliente.getReport(AuthKey, idEmpresaCRM, idClienteCRM, ""+cantRecords, showProducts, idError, errorStr, report);
		ReportObjOutput[] va = report.value;
		System.out.println("ReportObjOutput length: "+va.length);
		double tiempoFin = System.currentTimeMillis();
		double tiempo = (tiempoFin - tiempoInicio)/1000;
		System.out.println("segundos: "+tiempo);

		//ReportObjOutput v : va
		int cantRegistros = 0;
		
		for(ReportObjOutput v : va){
			cantRegistros++;
			
			System.out.println("******************Cliente "+cantRegistros+"******************");
			
			StringBuilder cliente = new StringBuilder();
			cliente.append(v.getIdClienteCRM());cliente.append(",");
			cliente.append(v.getIdEmpresaCRM());cliente.append(",");
			cliente.append(v.getEmpresa());cliente.append(",");
			cliente.append(v.getFechaAlta());cliente.append(",");
			cliente.append(v.getNombre());cliente.append(",");
			cliente.append(v.getUsername());cliente.append(",");
			cliente.append(v.getPassword());cliente.append(",");
			cliente.append(v.getTipoCliente());

			for(DocsisReport doc : v.getDocsis()){
				StringBuilder docsis = new StringBuilder();
				docsis.append(doc.getIdProducto());docsis.append(",");
				docsis.append(doc.getMacaddress());
				System.out.println(cliente.toString()+","+docsis.toString());
			}

			/*for(PacketCableReport pac : v.getPacketCable()){
				StringBuilder packet = new StringBuilder();
				packet.append(pac.getIdProducto());packet.append(",");
				packet.append(pac.getIdProductoPadre());packet.append(",");
				packet.append(pac.getMacaddress());packet.append(",");
				packet.append(pac.getMtaModel());packet.append(",");
				packet.append(pac.getMtaProfile());


				for(PacketCableEndPointsReport lines : pac.getEndPoints()){
					StringBuilder tns = new StringBuilder();
					tns.append(lines.getIdProducto()+",");
					tns.append(lines.getIdProductoPadre()+",");
					tns.append(lines.getTN()+",");
					tns.append(lines.getEpHomeExchange()+",");


					PacketCableCallFeaturesReport[] calF = lines.getCallFeatures();
					for(PacketCableCallFeaturesReport cal : calF){
						if(!cal.getIdProducto().equals("-1")){
							StringBuilder callFeatures = new StringBuilder();
							callFeatures.append(cal.getCfName()+",");
							callFeatures.append(cal.getCfCRMId()+",");
							callFeatures.append(cal.getIdProducto()+",");
							callFeatures.append(cal.getIdProductoPadre());
							System.out.println(callFeatures.toString());
						}
					}

				}

			}*/

			
		}

		System.out.println("Termino GetReport");


		/*System.out.println("getIdClienteCRM"+v.getIdClienteCRM());
		System.out.println("getIdEmpresaCRM"+v.getIdEmpresaCRM());
		System.out.println("getEmpresa"+v.getEmpresa());
		System.out.println("getFechaAlta"+v.getFechaAlta());
		System.out.println("getNombre"+v.getNombre());
		System.out.println("getUsername"+v.getUsername());
		System.out.println("getPassword"+v.getPassword());
		System.out.println("getTipoCliente"+v.getTipoCliente());*/


		/*DocsisReport[] doc = va[0].getDocsis();
		System.out.println("getIdProducto "+doc[0].getIdProducto());
		System.out.println("getIdProductoPadre "+doc[0].getIdProductoPadre());
		System.out.println("getMacaddress "+doc[0].getMacaddress());*/


		/*PacketCableReport[] pac = va[0].getPacketCable();
		System.out.println("IdProducto "+pac[0].getIdProducto());
		System.out.println("IdProductoPadre "+pac[0].getIdProductoPadre());
		System.out.println("IdServicio "+pac[0].getIdServicio());
		System.out.println("Macaddress "+pac[0].getMacaddress());
		System.out.println("MtaModel "+pac[0].getMtaModel());
		System.out.println("MtaProfile "+pac[0].getMtaProfile());*/


		/*PacketCableEndPointsReport[] point = pac[0].getEndPoints();
		System.out.println("point "+point+" point "+point.length);

		PacketCableEndPointsReport p = point[0];
		System.out.println("p "+p);

		System.out.println("Linea; "+p.getTN());*/

	}


	public GetReport(String idEmpresaCRM, String idClienteCRM, 
			String userEliminacion, String remoteHost, String remoteIp) 
			throws ServiceException, HttpException, IOException, JDOMException {
			
		this.setCMs(idEmpresaCRM, idClienteCRM, userEliminacion, remoteHost, remoteIp);
		//this.setDialUp(idEmpresaCRM, idClienteCRM, userEliminacion, remoteHost, remoteIp);
		this.setEmail(idEmpresaCRM, idClienteCRM, userEliminacion, remoteHost, remoteIp);		
		
	}

	
	public GetReport(String idEmpresaCRM, String idClienteCRM, 
			String userEliminacion, String remoteHost, String remoteIp,
			boolean buscarDialUp, boolean buscarEmail) 
			throws ServiceException, HttpException, IOException, JDOMException {
			
		this.setCMs(idEmpresaCRM, idClienteCRM, userEliminacion, remoteHost, remoteIp);
		
		/*if(buscarDialUp)
			this.setDialUp(idEmpresaCRM, idClienteCRM, userEliminacion, remoteHost, remoteIp);
		if(buscarEmail)
			this.setEmail(idEmpresaCRM, idClienteCRM, userEliminacion, remoteHost, remoteIp);		
		*/
	}
	
	
	private void setCMs(String idEmpresaCRM, String idClienteCRM, 
			String userEliminacion, String remoteHost, String remoteIp)
			throws ServiceException, HttpException, IOException, JDOMException{
		
		ReportObjInput showProducts = new ReportObjInput();
		showProducts.setShowPacketCable("true");
		showProducts.setShowDocsis("true");
		showProducts.setShowCom21("false");
		showProducts.setShowDialUp("false");
		showProducts.setShowEmail("flase");
		showProducts.setShowHosting("false");
		showProducts.setShowSIP("false");
		showProducts.setShowTelevision("false");
		showProducts.setShowVoiceMail("false");
		showProducts.setShowVoipLine("false");

		ArrayOfReportObjOutputHolder report = new ArrayOfReportObjOutputHolder();

		
		Cliente.getReport(AuthKey, idEmpresaCRM, ""+(Double.parseDouble(idClienteCRM)-1), "1", showProducts, idError, errorStr, report);

		
		ReportObjOutput[] va = report.value;
		ReportObjOutput client = va[0];

		if(!client.getIdClienteCRM().trim().equals(idClienteCRM)){

			//obtengo los datos del Cliente de Intraway
			clienteCrm = new ClienteCrm("0", idEmpresaCRM,
					idClienteCRM, "NO EXISTE EL CLIENTE", "", "");
		}else{


			//obtengo los datos del Cliente de Intraway
			clienteCrm = new ClienteCrm(client.getIdEmpresaCRM(), client.getEmpresa(),
					client.getIdClienteCRM(), client.getNombre(), client.getUsername(), client.getTipoCliente());

			DocsisReport[] cableModemAll = client.getDocsis();
			CableModem CM[] = new CableModem[cableModemAll.length];

			//estas con los mtas
			PacketCableReport pacCR[] = client.getPacketCable();

			for(int cable = 0; cable < cableModemAll.length; cable++){
				DocsisReport cableModem = cableModemAll[cable];

				String mac = cableModem.getMacaddress();
				if(mac!=null && !mac.equals(""))
					mac = mac.substring(0, 2) + mac.substring(3, 5)+ mac.substring(6, 8)+ 
					mac.substring(9, 11)+ mac.substring(12, 14) + mac.substring(15);

				CableModem cm = new CableModem(userEliminacion, remoteHost, remoteIp, "Cable Modem", cableModem.getActivo(), cableModem.getIdProducto(),
						"0",
						 mac, cableModem.getCantCPE(), cableModem.getServicePackage()+"<br/>"+cableModem.getIspCM()+"<br/>"+cableModem.getIspCPE(),
				/*new GetSerial(idEmpresaCRM,idClienteCRM).getSerial()*/ "");
				//agrego el Cm al Cliente consultado;
				cm.setIdClienteCRM(idClienteCRM);
				cm.setIdEmpresaCRM(idEmpresaCRM);
				cm.setSerial(cableModem.getSerialNumber());
				
				

				CM[cable] = cm;

				String MAC = mac;

				//new GetDocsisStatus(idEmpresaCRM,cableModem.getIdVenta(),cableModem.getIdProducto(),cableModem.getIdServicio());


				//Obtengo los datos del MTA
				PacketCableReport pac = this.getMTAbyCM(pacCR, cableModem.getIdProducto());
				if(pac != null ){
					Mta mta = new Mta(userEliminacion, remoteHost, remoteIp, "MTA", pac.getActivo(), pac.getIdProducto(),pac.getIdProductoPadre(),
							pac.getMacaddress(), pac.getMtaModel(), pac.getMtaProfile());

					mta.setIdClienteCRM(idClienteCRM);
					mta.setIdEmpresaCRM(idEmpresaCRM);

					//agrego el Mta al Cm
					cm.setMta(mta);

					MAC = MAC +","+ pac.getMacaddress();

					//new GetDocsisStatus(idEmpresaCRM,pac.getIdVenta(),pac.getIdProducto(),pac.getIdServicio());

					//creo las lineas
					Linea linea[] = new Linea[pac.getEndPoints().length];

					int numLin = pac.getEndPoints().length;
					for(int i=0; i<pac.getEndPoints().length; i++){ //PacketCableEndPointsReport lines : pac.getEndPoints()){
						Linea line = new Linea(userEliminacion, remoteHost, remoteIp, "Linea Mta", pac.getEndPoints()[i].getActivo(), pac.getEndPoints()[i].getIdProducto(),
								pac.getEndPoints()[i].getIdProductoPadre(), pac.getEndPoints()[i].getTN(),
								pac.getEndPoints()[i].getEpHomeExchange(),""+(pac.getEndPoints().length-i), pac.getEndPoints()[i].getEpProfile());

						line.setIdClienteCRM(idClienteCRM);
						line.setIdEmpresaCRM(idEmpresaCRM);
						line.setMtaPadre(mta);

						/*
						 * Consulta datos adicionales
						 * new GetDocsisStatus(idEmpresaCRM,pac.getEndPoints()[i].getIdVenta(),
							pac.getEndPoints()[i].getIdProducto(),
							pac.getEndPoints()[i].getIdServicio());
						 */

						MAC =MAC + ","+ pac.getEndPoints()[i].getTN();


						CallFeature call[] = new CallFeature[pac.getEndPoints()[i].getCallFeatures().length];
						//agrego los callfeatures a las lineas
						for(int j=0; j<pac.getEndPoints()[i].getCallFeatures().length; j++){
							PacketCableCallFeaturesReport calfe = pac.getEndPoints()[i].getCallFeatures()[j];

							CallFeature calf = new CallFeature(userEliminacion, remoteHost, remoteIp, calfe.getCfCRMId(), calfe.getCfActive(), calfe.getIdProducto(), 
									calfe.getIdProductoPadre(), calfe.getCfName(), calfe.getCfCustom1(), calfe.getCfCustom2());

							calf.setIdClienteCRM(idClienteCRM);
							calf.setIdEmpresaCRM(idEmpresaCRM);

							call[j] = calf;		

						}
						line.setCFeatures(call);
						linea[i]=line;
					}
					mta.setEndPoint(linea);
				}
			}

			clienteCrm.setCm(CM);
		}

		
		
	}
	
	
	private void setEmail(String idEmpresaCRM, String idClienteCRM, String userEliminacion, String remoteHost, String remoteIp){
		
		List<Vector> listMails = new MailsDialUpDAO().findAllViewEMails(idEmpresaCRM, idClienteCRM);
		
		Email[] emails = new Email[listMails.size()]; 

		int i = 0;
		for(Vector<Object> vecMail : listMails){
			String idProducto = vecMail.get(2).toString();
			String idProdPadre = vecMail.get(3).toString();
			String estado = vecMail.get(12)==null ? vecMail.get(11).toString():vecMail.get(12).toString();
			
			Email em = new Email(userEliminacion, remoteHost, remoteIp, "Email", idProducto, idProdPadre, estado);
			
			em.setIdEmpresaCRM(idEmpresaCRM);
			em.setIdClienteCRM(idClienteCRM);
			em.setServidorEmailCrmId(vecMail.get(5)==null ? vecMail.get(4).toString():vecMail.get(5).toString());
			em.setName( (vecMail.get(6)!=null) ? vecMail.get(6).toString() : "null" );
			em.setUserName(  (vecMail.get(7)!=null) ? vecMail.get(7).toString() : "null" );
			em.setPassword(  (vecMail.get(8)!=null) ? vecMail.get(8).toString() : "null" );
			em.setDominio(   (vecMail.get(9)!=null) ? vecMail.get(9).toString() : "null" );
			em.setDiskQuota( (vecMail.get(10)!=null) ? vecMail.get(10).toString() : "0" );
			
			emails[i] = em;
			i++;
		}
		
		
		clienteCrm.setEm(emails);
	}
	
	
	private void setDialUp(String idEmpresaCRM, String idClienteCRM, String userEliminacion, String remoteHost, String remoteIp){
		
		List<Vector> listDialUp = new MailsDialUpDAO().findAllViewDialUp(idEmpresaCRM, idClienteCRM);
		
		DialUp[] dial = new DialUp[listDialUp.size()];
		
		int i = 0;
		for(Vector<Object> vecDialUp : listDialUp){
			String idProducto = vecDialUp.get(2).toString();
			String idProdPadre = vecDialUp.get(3).toString();
			String estado = vecDialUp.get(6).toString();
			
			DialUp em = new DialUp(userEliminacion, remoteHost, remoteIp, "DialUp", idProducto, idProdPadre, estado);
			
			em.setIdEmpresaCRM(idEmpresaCRM);
			em.setIdClienteCRM(idClienteCRM);
			em.setUserName(vecDialUp.get(4).toString());
			em.setPassword(vecDialUp.get(5).toString());
			
			
			dial[i] = em;
			i++;
		}
		
		clienteCrm.setDial(dial);
	}
	

	private PacketCableReport getMTAbyCM(PacketCableReport[] mtas, String idproductoCM ){
		for(int i=0; i<mtas.length; i++)
			if(mtas[i].getIdProductoPadre().equals(idproductoCM))
				return mtas[i];
		return null;
	}

	public ClienteCrm getClienteCrm() {
		return clienteCrm;
	}

	public void setClienteCrm(ClienteCrm clienteCrm) {
		this.clienteCrm = clienteCrm;
	}


}
