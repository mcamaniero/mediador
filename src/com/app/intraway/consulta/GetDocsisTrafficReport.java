package com.app.intraway.consulta;

import java.rmi.RemoteException;

import intrawayWS.cliente.DocsisTrafficReportCMObjOutput;
import intrawayWS.cliente.DocsisTrafficReportObjOutput;
import intrawayWS.cliente.holders.ArrayOfDocsisTrafficReportObjOutputHolder;

import javax.xml.rpc.ServiceException;

public class GetDocsisTrafficReport extends Consulta{

	public GetDocsisTrafficReport(String idEmpresa, String idClienteCrm) throws ServiceException, RemoteException{
		
		String cantRecords = "25";
		String fromDate = "01/01/2009";//DD/MM/YYYY.
		String toDate = "26/01/2009";
		ArrayOfDocsisTrafficReportObjOutputHolder report = new ArrayOfDocsisTrafficReportObjOutputHolder();
		
		Cliente.getDocsisTrafficReport(AuthKey, idEmpresa, idClienteCrm, cantRecords, fromDate, toDate, idError, errorStr, report);
		
		DocsisTrafficReportObjOutput[] va = report.value;
		
		//DocsisTrafficReportCMObjOutput[] cm = va[0].getCableModems();
		
		for(int i=0; i<va.length; i++){
			System.out.println("N: "+i);
			//DocsisTrafficReportCMObjOutput[] cm = va[i].getCableModems();
			for(DocsisTrafficReportCMObjOutput cm : va[i].getCableModems()){
				System.out.println(cm.getUSTraffic());
			}
			
		}
		
		
	}

}
