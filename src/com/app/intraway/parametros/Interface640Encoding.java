package com.app.intraway.parametros;

public class Interface640Encoding implements IXMLEncoding {

	private String startdate = "";//Fecha de inicio del evento de tráfico
	private String enddate = "";//Fecha de finalización del evento de tráfico
	private String ds_rate = "";//Tasa de Downstream (En kilobits)
	private String us_rate;//Tasa de Upstream (En kilobits)
	private String ds_limit = "";//Límite de Upstream (En kilobytes)
	private String us_limit = "";//Límite de Downstream (En kilobytes)
	
	
	public Interface640Encoding(String startdate, String enddate, String ds_rate,
						String us_rate, String ds_limit, 
						String us_limit) {
		// TODO Auto-generated constructor stub
		this.setDs_limit(ds_limit);
		this.setDs_rate(ds_rate);
		this.setEnddate(enddate);
		this.setStartdate(startdate);
		this.setUs_limit(us_limit);
		this.setUs_rate(us_rate);
		
	}

	
	public String getXMLEncoding(){
		StringBuilder str = new StringBuilder(8);
		str.append("<handleCMTrafficEvent>");
		str.append("<startdate>"+this.getStartdate()+"</startdate>"); //"mm/dd/yyyy hh24:mi"
		str.append("<enddate>"+this.getEnddate()+"</enddate>");//"mm/dd/yyyy hh24:mi"
		str.append("<ds_rate>"+this.getDs_rate()+"</Password>");//NUMBER
		str.append("<us_rate>"+this.getUs_rate()+"</us_rate>");//NUMBER
		str.append("<ds_limit>"+this.getDs_limit()+"</ds_limit>");//NUMBER
		str.append("<us_limit>"+this.getUs_limit()+"</us_limit>");//NUMBER
		str.append("</handleCMTrafficEvent>");
		return str.toString();
	}


	public String getStartdate() {
		return startdate;
	}


	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}


	public String getEnddate() {
		return enddate;
	}


	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}


	public String getDs_rate() {
		return ds_rate;
	}


	public void setDs_rate(String ds_rate) {
		this.ds_rate = ds_rate;
	}


	public String getUs_rate() {
		return us_rate;
	}


	public void setUs_rate(String us_rate) {
		this.us_rate = us_rate;
	}


	public String getDs_limit() {
		return ds_limit;
	}


	public void setDs_limit(String ds_limit) {
		this.ds_limit = ds_limit;
	}


	public String getUs_limit() {
		return us_limit;
	}


	public void setUs_limit(String us_limit) {
		this.us_limit = us_limit;
	}
	
	
		
}
