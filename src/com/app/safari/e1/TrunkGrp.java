package com.app.safari.e1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import com.cedarpointcom.safariview2.server.oss.config.SVAttribute;
import com.cedarpointcom.safariview2.server.oss.config.SVConfigDesc;
import com.cedarpointcom.www.SVConfigService.SVConfigResp;

public class TrunkGrp {

	private String PhoneNumber;
	private HashMap<String, String> GrpNumber = new HashMap<String, String>();
	
	public TrunkGrp(SVConfigResp response, String phoneNumber) {
		
		this.PhoneNumber = phoneNumber;
		
		SVConfigDesc[] e1 = response.getPayload();
		for(SVConfigDesc pb : e1){
			for(SVAttribute at : pb.getAttributes() ){
				if(at.getKey().equals("billingNumber") && 
						at.getValue().equals(phoneNumber)){
					LlenarAtributos(pb);
					break;
				}
			}
		}
	}

	private void LlenarAtributos(SVConfigDesc pb) {
		for(SVAttribute at : pb.getAttributes())
			GrpNumber.put( at.getKey(), at.getValue());
		
		
		LinkedHashMap newMap = new LinkedHashMap();
		ArrayList<String> values = new ArrayList<String>(GrpNumber.keySet());
		Collections.sort(values);
		Iterator<String> it = values.iterator();
		String tmp="";
		while(it.hasNext()){
			tmp = it.next();
			for(Map.Entry k : GrpNumber.entrySet())
				if(tmp==k.getKey())
					newMap.put(k.getKey(), k.getValue());
		}
		GrpNumber = newMap;
		
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public HashMap<String, String> getGrpNumber() {
		return GrpNumber;
	}

	public void setGrpNumber(HashMap<String, String> grpNumber) {
		GrpNumber = grpNumber;
	}
	
	public String getValues(){
		StringBuilder str = new StringBuilder();
		for(String key : getGrpNumber().keySet())
			str.append(key+" : "+getGrpNumber().get(key)+"\n");
		
		return str.toString();
	}

}
