package com.app.dao.titan;

import java.util.List;
import java.util.Vector;
import java.util.logging.Level;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.app.dao.EntityManagerHelper;
import com.app.dao.EntityManagerHelperBSCCR;

public class QuerysBSCCR {


	private EntityManager getEntityManager() {
		return EntityManagerHelperBSCCR.getEntityManager();
	}



	public void executeAPI_UpdateReferenciaAntivirus(String idProducto, String referencia) {
		try {
			getEntityManager().getTransaction().begin();
			final String queryString =
				"begin "+
				"edobjpropval.rSetObjectProperties (null,"+idProducto+","+
                "'tamcontracteditemd','DB',NULL,NULL,sysdate,500627,"+
                referencia+",NULL,NULL,null); "+
				"COMMIT; "+
				"end; ";

			Query query = getEntityManager().createNativeQuery(queryString);
			System.out.println("Procesado... UpdateReferenciaAntivirus: "+query.executeUpdate());
			getEntityManager().getTransaction().commit();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete all failed", Level.SEVERE, re);
			throw re;
		}
	}





}
