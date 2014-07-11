package com.app.intraway.parametros2;
import ec.com.grupotvcable.wsdlintraway2.Comando;

public class Interface602Encoding implements IXMLEncoding {

	private String Username;
	private String Dominio;
	private String Password;
	private String DiskQuota;
	private String Noticias;
	private String Name;
	
	
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
	 

	
	public Interface602Encoding(String username, String dominio, String password,
			String diskQuota, String noticias, String name, Comando cmd) {
		this.setDiskQuota(diskQuota);
		this.setDominio(dominio);
		this.setName(name);
		this.setNoticias(noticias);
		if(cmd.getDetalle().getIntraway().getEstandar().getIdEstado().equals("0")
				|| password.equals(""))
			this.setPassword("1234");
		else this.setPassword(password);
		this.setUsername(username);
	}

	public String getXMLEncoding() {
		StringBuilder str = new StringBuilder();
		str.append("<handleEmail>");
		str.append("<Username>"+this.getUsername()+"</Username>");
		str.append("<Dominio>"+this.getDominio()+"</Dominio>");
		str.append("<Password>"+this.getPassword()+"</Password>");
		str.append("<DiskQuota>"+this.getDiskQuota()+"</DiskQuota>");
		str.append("<Noticias>"+this.getNoticias()+"</Noticias>");
		str.append("<Name>"+this.getName()+"</Name>");
		str.append("</handleEmail>");
		return str.toString();
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getDominio() {
		return Dominio;
	}

	public void setDominio(String dominio) {
		Dominio = dominio;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getDiskQuota() {
		return DiskQuota;
	}

	public void setDiskQuota(String diskQuota) {
		DiskQuota = diskQuota;
	}

	public String getNoticias() {
		return Noticias;
	}

	public void setNoticias(String noticias) {
		Noticias = noticias;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

}
