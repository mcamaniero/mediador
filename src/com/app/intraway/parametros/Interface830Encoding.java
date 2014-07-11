package com.app.intraway.parametros;

public class Interface830Encoding implements IXMLEncoding {

	
	private String FeatureCrmId;
	private Integer Active;
	private String Custom1;//null
	private String Custom2;//null
	private String Custom3;//null
	private String Custom4;//null
	private String SendToController;
	
	
	public Interface830Encoding(String featureCrmId, Integer active, String custom1,
			String custom2, String custom3, String custom4, String sendToController) {
		this.setActive(active);
		
		this.setFeatureCrmId(featureCrmId);
		if(featureCrmId.equals("CfVN"))
			this.setCustom1(custom1.substring(4));//59346001041 = 6001041
		else this.setCustom1(custom1);
		this.setCustom2(custom2);
		this.setCustom3(custom3);
		this.setCustom4(custom4);
		
		
		this.setSendToController(sendToController);
	}

	public String getXMLEncoding() {
		StringBuilder str = new StringBuilder(8);
		str.append("<handleEndPointFeature>");
		str.append("<FeatureCrmId>"+this.getFeatureCrmId()+"</FeatureCrmId>");
		str.append("<Active>"+ this.getActive() +"</Active>");
		
		if(getCustom1()!=null && !getCustom1().equals(""))
			str.append("<custom1>"+ this.getCustom1() +"</custom1>");
		if(getCustom2()!=null && !getCustom1().equals(""))
			str.append("<custom2>"+ this.getCustom2() +"</custom2>");
		/*if(getCustom3()!=null && !getCustom1().equals(""))
			str.append("<custom3>"+ this.getCustom3() +"</custom3>");
		if(getCustom4()!=null && !getCustom1().equals(""))
			str.append("<custom4>"+ this.getCustom4() +"</custom4>");
		*/
		str.append("<SendToController>"+ this.getSendToController() +"</SendToController>");
		str.append("</handleEndPointFeature>");
		return str.toString();
	}

	public String getFeatureCrmId() {
		return FeatureCrmId;
	}

	public void setFeatureCrmId(String featureCrmId) {
		FeatureCrmId = featureCrmId;
	}

	public Integer getActive() {
		return Active;
	}

	public void setActive(Integer active) {
		Active = active;
	}

	public String getCustom1() {
		return Custom1;
	}

	public void setCustom1(String custom1) {
		Custom1 = custom1;
	}

	public String getCustom2() {
		return Custom2;
	}

	public void setCustom2(String custom2) {
		Custom2 = custom2;
	}

	public String getCustom3() {
		return Custom3;
	}

	public void setCustom3(String custom3) {
		Custom3 = custom3;
	}

	public String getCustom4() {
		return Custom4;
	}

	public void setCustom4(String custom4) {
		Custom4 = custom4;
	}

	public String getSendToController() {
		return SendToController;
	}

	public void setSendToController(String sendToController) {
		SendToController = sendToController;
	}

}
