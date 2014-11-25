package com.app.safari.huntgroup;

import java.util.LinkedHashMap;

import com.cedarpointcom.safariview2.server.oss.config.SVAttribute;
import com.cedarpointcom.safariview2.server.oss.config.SVConfigDesc;
import com.cedarpointcom.www.SVConfigService.SVConfigResp;

public class HuntGroup {

	private LinkedHashMap<Integer,Groups> HuntGroups = new LinkedHashMap<Integer,Groups>(); 
	private String PhoneNumber;
	


	public HuntGroup(SVConfigResp response, String phoneNumber) {
		SVConfigDesc[] pbxs = response.getPayload();
		for(SVConfigDesc pb : pbxs){
			Groups gr = new Groups(pb.getAttributes());
			HuntGroups.put(gr.getHuntGroupDN(), gr);
		}
		
		this.setPhoneNumber(phoneNumber);
	}

	private String SVConfigRespToString(SVConfigResp resp ) {
		StringBuffer sb = new StringBuffer("SVConfigResp: ");
		sb.append("\n status = ").append(resp.getStatus()).append("\n message = ").
		append( resp.getMessage() );
		SVConfigDesc[] descs = resp.getPayload();
		sb.append("\n payload = ");
		
		if ( resp.getPayload() != null ) {
			for ( int i=0; i<resp.getPayload().length; i++) {
				sb.append("\n").append(SVConfigDescToString(descs[i]));
			}
		}
		return sb.toString();
	}
	
	private String SVConfigDescToString(SVConfigDesc desc ) {
		StringBuffer sb = new StringBuffer();
		SVAttribute[] retattrs = desc.getAttributes();
		sb.append(" SVConfigDesc ").append(": objType = ").	append(desc.getObjType());
		sb.append(" attrs = ").append( SVAttrsToString(retattrs) );
		return sb.toString();
	}
	
	// Takes an SVAttribute[] array and prints it out
	private String SVAttrsToString(SVAttribute[] attrarray ) {
		if ( attrarray == null || attrarray.length == 0 )
			return new String( "SVAttributes: count = 0");
		
		StringBuffer sb = new StringBuffer();
		sb.append(" SVAttributes: count = ").append( attrarray.length ).append(", ");
		if ( attrarray != null && attrarray.length > 0 ) {
			for ( int i=0; i<attrarray.length; i++ ){
				sb.append("\n "+i+": ").append(attrarray[i].getKey()).
				append(", ").append(attrarray[i].getValue());
			}
		}
		return sb.toString();
	}
	
	
	public LinkedHashMap<Integer, Groups> getHuntGroups() {
		return HuntGroups;
	}

	public void setHuntGroups(LinkedHashMap<Integer, Groups> huntGroups) {
		HuntGroups = huntGroups;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}


	public String getMembers() {
		
		Groups grupo = null;
		Integer Key = null;
		
		grupo = HuntGroups.get(Integer.parseInt(this.PhoneNumber));
		
		//recorro todas las hunts grupos en busca de donde este ese numero
		if(grupo == null){
			for(Groups grp: HuntGroups.values() ){
				for (String value : grp.getMembers().values()){
					if(this.PhoneNumber.equals(value.trim())){
						Key = grp.getHuntGroupDN();
						break;
					}
				}
			}
			
			grupo = HuntGroups.get(Key);
		}
		
		
		
		if(grupo != null){
			StringBuilder resp = new StringBuilder();
			for(String str : grupo.getMembers().keySet())
				resp.append(str+" : "+grupo.getMembers().get(str)+" \n");
			
			return resp.toString();
		}else
			return "No existe";
	}

}
