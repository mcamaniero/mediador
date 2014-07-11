package com.app.safari.huntgroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import com.cedarpointcom.safariview2.server.oss.config.SVAttribute;

public class Groups {
		
	private Integer HuntGroupDN;
	private HashMap<String, String> Members = new HashMap<String, String>();
	
	public Groups(SVAttribute[] attributes) {
		for(SVAttribute at : attributes){
			Members.put(at.getKey().trim(), at.getValue().trim());
			if(at.getKey().trim().equals("huntGroupDN")){
				HuntGroupDN = Integer.parseInt(at.getValue());
			}
		}
		
		LinkedHashMap newMap = new LinkedHashMap();
		ArrayList<String> values = new ArrayList<String>(Members.keySet());
		Collections.sort(values);
		Iterator<String> it = values.iterator();
		String tmp="";
		while(it.hasNext()){
			tmp = it.next();
			for(Map.Entry k : Members.entrySet())
				if(tmp==k.getKey())
					newMap.put(k.getKey(), k.getValue());
		}
		
		Members = newMap;
	}

	public Integer getHuntGroupDN() {
		return HuntGroupDN;
	}

	public void setHuntGroupDN(Integer huntGroupDN) {
		this.HuntGroupDN = huntGroupDN;
	}

	public HashMap<String, String> getMembers() {
		return Members;
	}

	public void setMembers(HashMap<String, String> members) {
		Members = members;
	}



}
