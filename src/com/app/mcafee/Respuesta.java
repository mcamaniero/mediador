package com.app.mcafee;

public class Respuesta {

	private String PARTNER_ID;
	private String RESPONSECONTEXT_ID;
	private String RETURNCODE;
	private String RETURNDESC;
	private String PARTNERREF;
	private String REF;
	private String EMAILADDRESS;
	private String PASSWORD;
	
	
	public Respuesta() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Respuesta(String partner_id, String responsecontext_id, String returncode, 
			String returndesc, String partnerref, String ref, String emailaddress, 
			String password) {
		
		this.setEMAILADDRESS(emailaddress);
		this.setPARTNER_ID(partner_id);
		this.setPARTNERREF(partnerref);
		this.setPASSWORD(password);
		this.setREF(ref);
		this.setRESPONSECONTEXT_ID(responsecontext_id);
		this.setRETURNCODE(returncode);
		this.setRETURNDESC(returndesc);
		
	}
	
	
	public String getPARTNER_ID() {
		return PARTNER_ID;
	}

	public void setPARTNER_ID(String partner_id) {
		PARTNER_ID = partner_id;
	}

	public String getRESPONSECONTEXT_ID() {
		return RESPONSECONTEXT_ID;
	}

	public void setRESPONSECONTEXT_ID(String responsecontext_id) {
		RESPONSECONTEXT_ID = responsecontext_id;
	}

	public String getRETURNCODE() {
		return RETURNCODE;
	}

	public void setRETURNCODE(String returncode) {
		RETURNCODE = returncode;
	}

	public String getRETURNDESC() {
		return RETURNDESC;
	}

	public void setRETURNDESC(String returndesc) {
		RETURNDESC = returndesc;
	}

	public String getPARTNERREF() {
		return PARTNERREF;
	}

	public void setPARTNERREF(String partnerref) {
		PARTNERREF = partnerref;
	}

	public String getREF() {
		return REF;
	}

	public void setREF(String ref) {
		REF = ref;
	}

	public String getEMAILADDRESS() {
		return EMAILADDRESS;
	}

	public void setEMAILADDRESS(String emailaddress) {
		EMAILADDRESS = emailaddress;
	}

	public String getPASSWORD() {
		return PASSWORD;
	}

	public void setPASSWORD(String password) {
		PASSWORD = password;
	}

	

}
