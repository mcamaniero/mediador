package com.app.intraway.parametros;

public class Interface500Encoding implements IXMLEncoding {

	private String Nombre = "";//50 not null
	private String Username = "";//32 null
	private String Password = "";//16 null
	private String IdTipoCliente;//not null
	private String EmailNoticias = "";//50 null
	private String IdCicloFactCRM = "";//16 null
	
	
	public Interface500Encoding(String nombre, String username, String password,
						String idTipoClienteCRM, String emailNoticias, 
						String idCicloFactCRM) {
		// TODO Auto-generated constructor stub
		this.setEmailNoticias(emailNoticias);
		this.setIdCicloFactCRM(idCicloFactCRM);
		this.setIdTipoClienteCRM(idTipoClienteCRM);
		this.setNombre(nombre);
		this.setPassword(password);
		this.setUsername(username);
	}

	
	public String getXMLEncoding(){
		StringBuilder str = new StringBuilder(8);
		str.append("<handleClient>");
		str.append("<Nombre>"+this.getNombre()+"</Nombre>");
		str.append("<Username>"+this.getUsername()+"</Username>");
		str.append("<Password>"+this.getPassword()+"</Password>");
		str.append("<idTipoCliente>"+this.getIdTipoCliente()+"</idTipoCliente>");
		str.append("<EmailNoticias>"+this.getEmailNoticias()+"</EmailNoticias>");
		str.append("<idCicloFactCRM>"+this.getIdCicloFactCRM()+"</idCicloFactCRM>");
		str.append("</handleClient>");
		//System.out.println("XMLEncoding "+str.toString());
		return str.toString();
	}
	
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getUsername() {
		return Username == null ? "" : this.Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password == null ? "" : this.Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getIdTipoCliente() {
		return IdTipoCliente;
	}

	public void setIdTipoClienteCRM(String idTipoCliente) {
		this.IdTipoCliente = idTipoCliente;
	}

	public String getEmailNoticias() {
		return EmailNoticias == null ? "" : this.EmailNoticias;
	}

	public void setEmailNoticias(String emailNoticias) {
		this.EmailNoticias = emailNoticias;
	}

	public String getIdCicloFactCRM() {
		return IdCicloFactCRM == null ? "" : this.IdCicloFactCRM;
	}

	public void setIdCicloFactCRM(String idCicloFactCRM) {
		if(idCicloFactCRM.equals("0"))
			this.IdCicloFactCRM = "";
		else
			this.IdCicloFactCRM = idCicloFactCRM;
	}

		
}
