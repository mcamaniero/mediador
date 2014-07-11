package com.app.intraway.consulta;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import intrawayWS.cliente.DocsisStatusObjOutput;
import intrawayWS.cliente.LeasesObj;
import intrawayWS.cliente.SpDescriptionObj;
import intrawayWS.cliente.holders.DocsisStatusObjOutputHolder;

public class GetDocsisStatus extends Consulta{
	
	private String IdClienteCrm = "";
	private String MacCm = "";
	
	
	private DocsisStatusObjOutputHolder docsisStatusObjOutput = new DocsisStatusObjOutputHolder();
	
	final static String xmlEncoding ="<DocsisStatusParameters>" +
	"<getBasicData>" +
		"<status>TRUE</status>" +
	"</getBasicData>" +
	"<getCMLeases>" +
		"<status>TRUE</status>" +
		"<order>DESC</order>" +
		"<cantRecords>50</cantRecords>" +
	"</getCMLeases>" +
	"<getMTALeases>" +
		"<status>TRUE</status>" +
		"<order>DESC</order>" +
		"<cantRecords>50</cantRecords>" +
	"</getMTALeases>" +
	"<getCPELeases>" +
		"<status>TRUE</status>" +
		"<order>DESC</order>" +
		"<cantRecords>50</cantRecords>" +
	"</getCPELeases>" +
	"<getSPDescription>" +
		"<status>TRUE</status>" +
	"</getSPDescription>" +
	"<getPoolingData>" +
		"<status>TRUE</status>" +
		"<order>ASC</order>" +
		"<cantRecords>ALL</cantRecords>" +
	"</getPoolingData>" +
"</DocsisStatusParameters>";
			
	
	
	//<DocsisStatusParameters><getBasicData><status>TRUE</status></getBasicData><getCMLeases><status>TRUE</status><order>DESC</order><cantRecords>50</cantRecords></getCMLeases><getMTALeases><status>TRUE</status><order>DESC</order><cantRecords>50</cantRecords></getMTALeases><getCPELeases><status>TRUE</status><order>DESC</order><cantRecords>50</cantRecords></getCPELeases><getSPDescription><status>TRUE</status></getSPDescription><getPoolingData><status>TRUE</status><order>ASC</order><cantRecords>ALL</cantRecords></getPoolingData></DocsisStatusParameters>
	
	
	public GetDocsisStatus(String idEmpresaCRM, String idVenta, String idProducto, String idServicio) throws ServiceException, RemoteException {
		
		/*idEmpresaCRM = "63";
		idVenta = "0";
		idProducto = "31871";
		idServicio = "1";*/
		
		Cliente.getDocsisStatus(AuthKey, idEmpresaCRM, idServicio, idVenta, idProducto, xmlEncoding, idError, errorStr, docsisStatusObjOutput);
				
		//System.out.println("idError: "+idError.value);
		//System.out.println("errorStr: "+errorStr.value);
		
		
		DocsisStatusObjOutput va = docsisStatusObjOutput.value;
		
		System.out.println("getCantMensajes: "+va.getCantMensajes());
		System.out.println("getCantPCs: "+va.getCantPCs());
		System.out.println("getCmStatus: "+va.getCmStatus());
		System.out.println("getCmts: "+va.getCmts());
		System.out.println("getDisabled: "+va.getDisabled());
		System.out.println("getDocsisVersion: "+va.getDocsisVersion());
		System.out.println("getDownStream: "+va.getDownStream());
		System.out.println("getDownTraffic: "+va.getDownTraffic());
		System.out.println("getDspl: "+va.getDspl());
		System.out.println("getDssnr: "+va.getDssnr());
		System.out.println("getHub: "+va.getHub());
		System.out.println("getHwv: "+va.getHwv());
		System.out.println("getIdClienteCRM: "+va.getIdClienteCRM());

		
		this.IdClienteCrm = va.getIdClienteCRM();
		
		System.out.println("getIp: "+va.getIp());
		System.out.println("getIspCM: "+va.getIspCM());
		System.out.println("getIspCPE: "+va.getIspCPE());
		System.out.println("getIspMTA: "+va.getIspMTA());
		System.out.println("getMacaddress: "+va.getMacaddress());
		
		if(va.getMacaddress() != null && !va.getMacaddress().equals("")){
			String[] tmpMac = va.getMacaddress().split(":");
			this.MacCm = tmpMac[0]+tmpMac[1]+tmpMac[2]+tmpMac[3]+tmpMac[4]+tmpMac[5];
			System.out.println("getMacaddress: "+MacCm);
		}
		
		System.out.println("getManufacturer: "+va.getManufacturer());
		System.out.println("getMtaCMSName: "+va.getMtaCMSName());
		System.out.println("getMtaFQDN: "+va.getMtaFQDN());
		System.out.println("getMtaHostname: "+va.getMtaHostname());
		System.out.println("getMtaIPAddress: "+va.getMtaIPAddress());
		System.out.println("getMtaMacAddress: "+va.getMtaMacAddress());
		//System.out.println("getMensajes: "+va.getMensajes());//arreglo
		//System.out.println("getMtaLeases: "+va.getMtaLeases());//arreglo
		System.out.println("MtaLeases: ");
		/*if(va.getMtaLeases()!=null)
		for(LeasesObj l : va.getMtaLeases()){
			System.out.println("**Fecha: "+l.getFecha());
			System.out.println("**Ip: "+l.getIp());
			System.out.println("**Macaddress: "+l.getMacaddress());
			System.out.println("**Manufacturer: "+l.getManufacturer());
			System.out.println("**Online: "+l.getOnline());
		}*/
		
			System.out.println("getNodo: "+va.getNodo());
		System.out.println("getNombre: "+va.getNombre());
		System.out.println("getPollingage: "+va.getPollingage());
		System.out.println("getPollingDate: "+va.getPollingDate());
		System.out.println("getPollingSource: "+va.getPollingSource());
		System.out.println("getProductName: "+va.getProductName());
		//System.out.println("getPooling: "+va.getPooling());//arreglo
		System.out.println("getServicePackage: "+va.getServicePackage());
		System.out.println("getStatus: "+va.getStatus());
		System.out.println("getSwv: "+va.getSwv());
		System.out.println("getSysuptime: "+va.getSysuptime());
		System.out.println("getSpDescription: "+va.getSpDescription());//objeto
		
		SpDescriptionObj obj = va.getSpDescription();
		System.out.println("--getCOS: "+obj.getCOS());
		System.out.println("--getServicePackageCRMId: "+obj.getServicePackageCRMId());
		System.out.println("--getServicePackageName: "+obj.getServicePackageName());
		
		
		
		System.out.println("getUpStream: "+va.getUpStream());
		System.out.println("getUpTraffic: "+va.getUpTraffic());
		System.out.println("getUsername: "+va.getUsername());
		System.out.println("getUspl: "+va.getUspl());
		System.out.println("getUssnr: "+va.getUssnr());
		//System.out.println("CmStagetCmLeasestus: "+va.getCmLeases());//arreglo
		
		//System.out.println("getCpeLeases: "+va.getCpeLeases());//arreglo
		System.out.println("CpeLeases: ");
		//if(va.getCpeLeases()!=null)
		/*for(LeasesObj l : va.getCpeLeases()){
			System.out.println("**Fecha: "+l.getFecha());
			System.out.println("**Ip: "+l.getIp());
			System.out.println("**Macaddress: "+l.getMacaddress());
			System.out.println("**Manufacturer: "+l.getManufacturer());
			System.out.println("**Online: "+l.getOnline());
		}*/
		
		
		//System.out.println("getCmLeases: "+va.getCmLeases());//objeto
		
		
			
			/*new Thread(){
				public void run(){
					try {
						LeeEscribe();
						Thread.sleep(100);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}.run();*/
			
		
	}
	
	private String Consulta(String idProducto, String ciudad) throws RemoteException{
		//94 guayaquil
		//63quito
		Cliente.getDocsisStatus(AuthKey, ciudad, "20", "0", idProducto, xmlEncoding, idError, errorStr, docsisStatusObjOutput);
		DocsisStatusObjOutput va = docsisStatusObjOutput.value;

		StringBuilder result = new StringBuilder();
		
		if(va.getManufacturer()!=null){
			result.append(idProducto);
			result.append(",");
			result.append(va.getManufacturer());
			result.append(",");
			result.append(va.getHwv());
			result.append(",");
			result.append(va.getMacaddress());
			result.append(",");
			result.append(va.getMtaMacAddress());
		}
		return result.toString();
	}
	
	private void LeeEscribe() throws IOException{
		// Apertura del fichero y creacion de BufferedReader para poder
		// hacer una lectura comoda (disponer del metodo readLine()).
		File archivo = new File ("/usr/javaSerialLinux/codigo.txt");
		FileReader fr = new FileReader (archivo);
		BufferedReader br = new BufferedReader(fr);

		//FileWriter fichero = new FileWriter("/usr/javaSerialLinux/resultado.txt");
		//PrintWriter pw = new PrintWriter(fichero);

		String linea = null;
		while((linea=br.readLine())!=null){// Lectura del fichero
			//pw.println(Consulta(linea));//escritura del archivo
			//logger.info(Consulta(linea));
			String[] resul = linea.split("\\ ");
			String codigo = resul[0].trim();
			String ciudad = resul[resul.length-1].trim();
			
			if(ciudad.equals("GYE") || ciudad.equals("gye"))
				ciudad = "94";
			else if(ciudad.equals("UIO") || ciudad.equals("uio"))
				ciudad = "63";
			else if(ciudad.equals("CUE") || ciudad.equals("cue"))
				ciudad = "65";
			//System.out.println(codigo+" "+ciudad);
			System.out.println(Consulta(codigo.trim(), ciudad.trim()));
		}
			
		//fichero.close();
		//fr.close(); 
		
		//185763 se quedo
		
		/*for(int i=85060; i<85070; i++){
			String rest = Consulta(""+i);
			if (!rest.equals(""))
				System.out.println(rest);
		}*/
		
	}
	

	
	public static void main(String a[]){
		try {
			new GetDocsisStatus("94","0","7856574","21");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getIdClienteCrm() {
		return IdClienteCrm;
	}

	public String getMacCm() {
		return MacCm;
	}
	


}
