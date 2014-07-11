package com.app.dao.usuarioiw;

import java.util.List;

import com.app.dao.EntityManagerHelper;

public class ConsultaUsuario {

	public ConsultaUsuario() {
		
	}
	
	public AdmUsuarioIntraway getUsuario(String usuario, String clave){

		List<AdmUsuarioIntraway> users = new AdmUsuarioIntrawayDAO().findAll();

		AdmUsuarioIntraway tmp = null;
		AdmUsuarioIntrawayId tmp_sel = null;
		
		for(AdmUsuarioIntraway user : users){
			AdmUsuarioIntrawayId selec_user = user.getId();
			if(selec_user.getUsuario().equals(usuario)){
				tmp = user;
				tmp_sel = selec_user;
			}
		}

		if(tmp == null)//no encontro usuarios
			return null;

		if(!tmp.getClave().equals(clave))
			return null;

		return tmp;
	}
	
	
	public String CambiarClave(AdmUsuarioIntraway user, String clave, String nuevaClave){
		
		if (!user.getClave().equals(clave))
			return "Clave Incorrecta";
		
		user.setClave(nuevaClave);
		
		EntityManagerHelper.beginTransaction();
		new AdmUsuarioIntrawayDAO().update(user);
		EntityManagerHelper.commit();
		
		return "Cambio Exitoso";
	}
	
	
}
