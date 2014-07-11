package com.app.dao.mails;

import java.util.List;
import java.util.Vector;
import java.util.logging.Level;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.app.dao.EntityManagerHelper;
import com.app.dao.EntityManagerHelperIW;

public class MailsDialUpDAO {

	public MailsDialUpDAO() {
		// TODO Auto-generated constructor stub
	}
	
	private EntityManager getEntityManager() {
		return EntityManagerHelperIW.getEntityManager();
	}
	
	
	public List<Vector> findAllViewEMails(String idEmpresaCRM, String idClienteCRM) {
		try {
			final String queryString = "SELECT * FROM iwaydata.emails where idempresa = "+idEmpresaCRM
										+" and idclientecrm = "+idClienteCRM;
			Query query = getEntityManager().createNativeQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}
	
	public List<Vector> findAllViewDialUp(String idEmpresaCRM, String idClienteCRM) {
		try {
			final String queryString = "SELECT * FROM iwaydata.dial_up where idempresa = "+idEmpresaCRM
										+" and idclientecrm = "+idClienteCRM;
			Query query = getEntityManager().createNativeQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}
	
	public String findPasswordByUserNameAndDominio(String username, String dominio) {
		try {
			final String queryString = "SELECT password FROM iwaydata.emails  where username = '"+username
										+"' and dominio = '"+dominio+"'";
			Query query = getEntityManager().createNativeQuery(queryString);
			if(query.getResultList().size() > 0)
				return query.getResultList().get(0).toString();
			else return "";
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

}
