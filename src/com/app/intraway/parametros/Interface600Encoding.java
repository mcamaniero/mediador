package com.app.intraway.parametros;

public class Interface600Encoding implements IXMLEncoding {

	private Integer Cantidad;
	private Integer QuotaMax;
	private String ServidorEmailCRMId;
	
	/*
	IDSERVIDOREMAIL	 NOMBRE DOMINIO	 EMPRESA
	 1	 		cablemodem.com.ec	Quito
	 1	 		uio.satnet.net	 	Quito
	 2	 		amb.satnet.net		Ambato
	 25	 		cue.satnet.net		Cuenca
	 1	 		cablemodem.com.ec	Cuenca
	 3	 		gye.satnet.net	 	Guayaquil
	 3	 		cablemodem.com.ec	Guayaquil
	 27	 		mnb.satnet.net		Manta
	 26	 		oro.satnet.net		Machala
	 
	 */
	
	
	public Interface600Encoding(Integer cantidad, Integer  quotaMax, 
			String servidorEmailCRMId) {
		this.setCantidad(cantidad);
		this.setQuotaMax(quotaMax);
		this.setServidorEmailCRMId(servidorEmailCRMId);
	}

	public String getXMLEncoding() {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder(8);
		str.append("<handleEmailPackage>");
		str.append("<Cantidad>"+this.getCantidad()+"</Cantidad>");
		str.append("<QuotaMax>"+this.getQuotaMax()+"</QuotaMax>");
		str.append("<ServidorEmailCRMId>"+this.getServidorEmailCRMId()+"</ServidorEmailCRMId>");
		str.append("</handleEmailPackage>");
		return str.toString();
	}

	public Integer getCantidad() {
		return Cantidad;
	}

	public void setCantidad(Integer cantidad) {
		Cantidad = cantidad;
	}

	public Integer getQuotaMax() {
		return QuotaMax;
	}

	public void setQuotaMax(Integer quotaMax) {
		QuotaMax = quotaMax;
	}

	public String getServidorEmailCRMId() {
		return ServidorEmailCRMId;
	}

	public void setServidorEmailCRMId(String servidorEmailCRMId) {
		ServidorEmailCRMId = servidorEmailCRMId;
	}

}
