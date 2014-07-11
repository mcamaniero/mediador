package com.app.dao.titan;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;


import com.app.dao.EntityManagerHelper;
import com.app.dao.EntityManagerHelperBILLCC;
import com.app.dao.EntityManagerHelperBSCC;
import com.app.safari.LineaCuarentena;

public class Querys {


	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}


	public List<Vector> findAll(){
		try {
			final String queryString = "Select " +
			"case "+
			"when c.costcenter_id = 3 then '63' "+
			"when c.costcenter_id = 8 then '94' "+
			"when c.costcenter_id = 12 then '65' "+
			"end as ciudad, "+
			"a.cpartyaccount_id as contrato, "+
			"a.citem_id as idproducto,  "+
			"case when b.name='e-Mail' then a.rootcitem_id else nvl(a.reqcitem_id,0) end as idprodpadre, "+  
			"b.name as tipo, a.state , d.address "+
			"From tamcontracteditemd a, tpcproducts b, tamcpartyaccountd c, tamapnames d "+
			"Where a.citem_id Is Not Null  "+
			"and a.citem_id = d.accesscitem_id "+
			"and d.aptypename_id = 51"+
			"And d.isactive='Y' And d.activeto Is Null "+
			"And b.id=a.product_id "+
			"And a.state in('A','S') "+
			"And a.cpartyaccount_id = c.account_id "+	
			"And Sysdate Between a.contractedfrom And nvl(contractedto,Sysdate) "+
			"and c.costcenter_id in (12)  "+
			"And b.name in ('Modem') ";
			//"and exists (select 1 from ytCredMaxTemp x where x.cpartyaccount_id=a.cpartyaccount_id) " +
			//"order by a.cpartyaccount_id ";
			//"and a.cpartyaccount_id = 14572932 ";
			Query query = getEntityManager().createNativeQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}



	public List<Vector> findAll2() {
		try {
			final String queryString = "SELECT case when a.centro_costo = 'Cuenca' then '65' "+
			"when a.centro_costo = 'Machala' then '96' end CIUDAD, A.producto TIPO, A.id_intraway ID_PRODUCTO, "+ 
			"nvl(CASE WHEN A.producto = 'Modem' THEN 0  "+
			"WHEN A.producto = 'e-Mail' AND A.producto_padre='Internet' THEN (select x1.id_intraway from MIGRACION.CONTRACT_ITEM_DATA_LOG X1 WHERE X1.citem_id=A.citem_padre - 1) "+ 
			"ELSE (select x1.id_intraway from MIGRACION.CONTRACT_ITEM_DATA_LOG X1 WHERE X1.citem_id=A.citem_padre)  "+
			"END, '0') ID_PRODPADRE,  "+
			"A.NUMERO_CONTRATO CONTRATO, "+
			"DECODE(A.Producto,'Modem',(Select address From MIGRACION.ACCESS_POINT_DATA_LOG x Where x.citem_id=a.citem_id And X.ACCESS_POINT_NAME='CM MAC Address'), "+
			"'e-Mail',(Select address From MIGRACION.ACCESS_POINT_DATA_LOG x Where x.citem_id=a.citem_id And X.ACCESS_POINT_NAME='Email'), "+
			"'DialUp',(Select address From MIGRACION.ACCESS_POINT_DATA_LOG x Where x.citem_id=a.citem_id And X.ACCESS_POINT_NAME='Username'), "+
			"'') address "+
			"FROM MIGRACION.CONTRACT_ITEM_DATA_LOG A "+ 
			"WHERE CARGA=100031  "+
			"AND producto IN ('Modem','e-Mail','DialUp') "+ 
			"order by CONTRATO_ID, a.citem_id ";
			Query query = getEntityManager().createNativeQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

	public void executeAPI_CreacionCliente(String cuenta, String estado) {
		try {
			getEntityManager().getTransaction().begin();
			final String queryString = "DECLARE "+
			"vi_sessionid       NUMBER; "+
			"vv_encodedpassword VARCHAR2 (2000); "+
			"ACCOUNT_ID         INTEGER; "+
			"ACCION            VARCHAR(2); "+
			"BEGIN "+
			"vv_encodedpassword := ecomsession.fvgetencodedpassword ('jcalle'); "+
			"vi_sessionid       := ecomsession.filogin ('jcalle', vv_encodedpassword, NULL, NULL, NULL, 'EXTERNAL', NULL, NULL ); "+
			"ecomsession.ropentx; "+
			"ACCOUNT_ID    := "+cuenta+"; "+
			"ACCION        := '"+estado+"'; "+
			"xpspengine_test.pgeneratespactions (pi_citem_id => NULL, pi_cparty_id => ACCOUNT_ID , pv_activity_type => 'A', pv_for_all => 'N', pv_usejob => 'Y', pv_target => NULL, pi_wfprocess_id => NULL ); "+
			"BEGIN "+
			"FOR rec IN "+
			"(SELECT citem_id, "+
			"  state "+
			"FROM qamcontracteditemd "+
			"WHERE reqcitem_id                 IS NULL "+
			"AND NVL (contractedfrom, SYSDATE) <= SYSDATE "+
			"AND NVL (contractedto, SYSDATE)   >= SYSDATE "+
			"AND isclosed                      IS NULL "+
			"AND state                         IN ('A', 'O', 'S') "+
			"AND citem_id                       > 0 "+
			"AND cpartyaccount_id               = ACCOUNT_ID "+
			"AND product_id                    IN (56, 9) "+
			") "+
			"LOOP "+
			"xpspengine_test.pgeneratespactions (pi_citem_id => rec.citem_id, pi_cparty_id => NULL, pv_activity_type => ACCION, pv_for_all => 'Y', pv_usejob => 'Y', pv_target => 'A', pi_wfprocess_id => NULL, pv_networkservice => 'Internet Connection' ); "+
			"xpspengine_test.pgeneratespactions (pi_citem_id => rec.citem_id, pi_cparty_id => NULL, pv_activity_type => ACCION, pv_for_all => 'Y', pv_usejob => 'Y', pv_target => 'A', pi_wfprocess_id => NULL ); "+
			"xpspengine_test.pgeneratespactions (pi_citem_id => rec.citem_id, pi_cparty_id => NULL, pv_activity_type => ACCION, pv_for_all => 'Y', pv_usejob => 'Y', pv_target => 'S', pi_wfprocess_id => NULL ); "+
			"END LOOP; "+
			"END; "+
			"COMMIT; "+
			"ecomsession.rclosetx; "+
			"ecomsession.rlogout (vi_sessionid); "+
			"COMMIT; "+
			"END;   ";


			Query query = getEntityManager().createNativeQuery(queryString);
			System.out.println("Procesado... "+query.executeUpdate());

			getEntityManager().getTransaction().commit();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete all failed", Level.SEVERE, re);
			throw re;
		}
	}


	public List<Vector> findAllCMS() {
		try {
			final String queryString = "SELECT * FROM yv_cm";
			Query query = getEntityManager().createNativeQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

	public List<Vector> findAllCMS2() {
		try {
			final String queryString = "Select "+
			"case  "+
			"	when c.costcenter_id = 3 then '63' "+
			"	when c.costcenter_id = 8 then '94' "+
			"	when c.costcenter_id = 12 then '65' "+
			"end as ciudad, "+
			"a.cpartyaccount_id contrato, "+
			"a.citem_id idproducto,  "+
			"b.name tipo, a.state, d.address,  "+

			"  (SELECT value05 FROM qtaratingtableitems "+
			" WHERE ratingtable_id = 9 "+
			" AND value01 = (SELECT xpspengine.fnlovgetproperty (i.citem_id, 'qAMContractedItemD', SYSDATE, "+
			"   (SELECT ID FROM qrepprops  WHERE propertymeaning_id = 500059 "+
			"    AND object_id = i.product_id ) ) access_tech "+
			"    FROM qamcontracteditemd i WHERE citem_id = a.citem_id ) "+
			" AND value02 = (SELECT NVL(MAX('Y'),'N') "+
			"    FROM qamcontracteditemd WHERE reqcitem_id = a.citem_id "+
			"    AND citem_id > 0 AND isclosed IS NULL "+
			"    AND SYSDATE BETWEEN contractedfrom AND NVL (contractedto, SYSDATE) "+
			"    AND product_id = 98 ) "+
			" AND nvl(value03,0) = (SELECT NVL(MAX(tariffplanvariant_id),0) "+
			"    FROM qamcontracteditemd "+
			"    WHERE reqcitem_id = a.citem_id "+
			"    AND citem_id > 0 AND isclosed   IS NULL "+
			"    AND SYSDATE BETWEEN contractedfrom AND NVL (contractedto, SYSDATE) "+
			"    AND product_id = 106 ) "+
			" AND value04 = (SELECT addressdictionary02_id "+
			"    FROM qamcontacts "+ 
			"    WHERE id =(SELECT permanentaddress_id FROM qamcpartyaccountd WHERE account_id = a.cpartyaccount_id)) "+
			" AND NVL(DTO, SYSDATE) >= SYSDATE) ServicePackageCrmID, "+

			" (SELECT value07 + (SELECT COUNT (*) "+
			" FROM qamcontracteditemd cid WHERE cid.rootcitem_id = null "+
			"  AND cid.cparty_id = null AND cid.product_id = 90 "+
			"  AND cid.citem_id > 0 AND cid.isclosed IS NULL "+
			"  AND SYSDATE BETWEEN cid.contractedfrom AND NVL (cid.contractedto, SYSDATE)) "+
			"  FROM qtaratingtableitems WHERE ratingtable_id = 9 "+
			" AND value01 =(SELECT xpspengine.fnlovgetproperty (i.citem_id, 'qAMContractedItemD', SYSDATE, "+
			"  (SELECT ID FROM qrepprops WHERE propertymeaning_id = 500059 "+
			"  AND object_id = i.product_id) ) access_tech "+
			"  FROM qamcontracteditemd i WHERE citem_id = a.citem_id) "+
			" AND value02 = (SELECT NVL(MAX('Y'),'N') "+
			"   FROM qamcontracteditemd  WHERE reqcitem_id = a.citem_id "+
			"   AND citem_id > 0 AND isclosed   IS NULL "+
			"   AND SYSDATE BETWEEN contractedfrom AND NVL (contractedto, SYSDATE) "+
			"   AND product_id = 98) "+
			" AND nvl(value03,0) = (SELECT NVL(MAX(tariffplanvariant_id),0) "+
			"   FROM qamcontracteditemd WHERE reqcitem_id = a.citem_id "+
			"   AND citem_id > 0 AND isclosed   IS NULL "+
			"   AND SYSDATE BETWEEN contractedfrom AND NVL (contractedto, SYSDATE) "+
			"   AND product_id = 106) "+
			" AND value04 =(SELECT addressdictionary02_id "+
			"   FROM qamcontacts WHERE id = "+
			"  (SELECT permanentaddress_id FROM qamcpartyaccountd WHERE account_id = a.cpartyaccount_id)) "+
			" AND NVL(DTO, SYSDATE) >= SYSDATE) pcs, "+
			" Q.ACTIVITYTYPE  "+

			"	From tamcontracteditemd a, tpcproducts b, tamcpartyaccountd c, tamapnames d, tspactionqueue q "+
			"	Where a.citem_id Is Not Null  "+
			"		and a.citem_id = d.accesscitem_id "+
			"		and d.aptypename_id = 51 "+
			"		And b.id=a.product_id "+
			"		And a.state in('A','S') "+
			"		And a.cpartyaccount_id = c.account_id "+	
			"		and c.costcenter_id in (12) "+
			"		And b.name in ('Modem') "+
			"   and q.citem_id = a.citem_id "+
			"   and q.activitytype in ('R','S') "+
			"   and q.requesteddate >=trunc (sysdate) ";
			//"   and q.actiondef_id = 61 ";

			Query query = getEntityManager().createNativeQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

	public List<Vector> findAllTelefonia(String tipo) {
		try {
			final String queryString = "SELECT * FROM yv_mta where tipo = '"+tipo+"'";
			Query query = getEntityManager().createNativeQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}


	public List<Vector> findAllTelefonia2(String tipo) {
		try {
			final String queryString = "SELECT CASE "+
			"WHEN C.COSTCENTER_ID = 3 THEN '63' "+
			"WHEN C.COSTCENTER_ID = 8 THEN '94' "+
			"WHEN C.COSTCENTER_ID = 12 THEN '65' "+
			"WHEN C.COSTCENTER_ID = 13 THEN '95' "+
			"END AS CIUDAD, "+
			"A.CPARTYACCOUNT_ID CONTRATO, "+
			"A.CITEM_ID IDPRODUCTO, "+
			"(SELECT B.NAME FROM TPCPRODUCTS B WHERE B.ID = A.PRODUCT_ID) TIPO, "+
			"A.STATE, "+
			"D.ADDRESS, "+
			"( select xpspengine.fvgethomeexchange(A.CITEM_ID, null, 0) from dual ) HOMEEXCHANGE, " +
			"Q.ACTIVITYTYPE "+
			"FROM TAMCONTRACTEDITEMD A, "+
			"TAMCPARTYACCOUNTD  C, "+
			"TAMAPNAMES         D, "+
			"TSPACTIONQUEUE     Q "+
			"WHERE A.CITEM_ID IS NOT NULL "+
			"AND A.ISVALID = 'Y' "+
			"AND A.CPARTY_ID = D.CPARTY_ID "+
			"AND A.CPARTYACCOUNT_ID = D.CPARTYACCOUNT_ID "+
			"AND A.CITEM_ID = D.ACCESSCITEM_ID "+
			"AND A.STATE IN ('A', 'S') "+
			"AND A.CPARTYACCOUNT_ID = C.ACCOUNT_ID "+
			"AND C.COSTCENTER_ID IN (3, 8) "+
			"AND A.PRODUCT_ID IN (49,53,34) "+
			"AND Q.CITEM_ID = A.CITEM_ID "+
			"AND Q.ID > 300000 "+
			"AND Q.ACTIVITYTYPE IN ('R', 'S') "+
			"AND Q.REQUESTEDDATE >= TRUNC(SYSDATE) "+
			"AND Q.ACTIONDEF_ID IN (63, 94, 156, 157, 176, 183) "+
			"AND Q.SPSYSTEM_ID IN (3, 4) ";
			Query query = getEntityManager().createNativeQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}

	}


	public void executeAPI_UpdateReferenciaAntivirus(String idProducto, String referencia) {
		try {
			getEntityManager().getTransaction().begin();
			final String queryString =
				"begin "+
				"edobjpropval.rSetObjectProperties (null,"+idProducto+","+
				"'tamcontracteditemd','DB',NULL,NULL,sysdate,500642,"+
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


	public List<Vector> findAll_TSPSYSTEMDEFS() {
		try {
			final String queryString = "SELECT ID, NAME FROM TSPSYSTEMDEFS";
			Query query = getEntityManager().createNativeQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed findAll_TSPSYSTEMDEFS", Level.SEVERE, re);
			throw re;
		}
	}

	public int findAll_State_Q(String id) {
		try {
			final String queryString = "select 1 from tspactionqueue s "+
			"where  state = 'Q' "+
			"and s.requesteddate >= trunc(sysdate) "+
			"and s.spsystem_id = "+id;
			Query query = getEntityManager().createNativeQuery(queryString);
			//System.out.println(query.getResultList().size());
			return query.getResultList().size();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed findAll_TSPSYSTEMDEFS", Level.SEVERE, re);
			throw re;
		}
	}


	public int findAll_State_JOB_Activos() {
		try {
			final String queryString = "select * from dba_jobs "+
			" where  schema_user = 'BSCC'  "+
			" and what  like '%SLAVE-DEMON4SP-SYSTEM%'";

			Query query = getEntityManager().createNativeQuery(queryString);
			//System.out.println(query.getResultList().size());
			return query.getResultList().size();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed findAll_TSPSYSTEMDEFS", Level.SEVERE, re);
			throw re;
		}
	}


	public List<Vector> findAll_State_GrupoBy(String id) {
		try {
			final String queryString = "select activitytype, count(*)   " +
			" from tspactionqueue s "+
			" where  state = 'Q' "+
			" and s.requesteddate >= trunc(sysdate) "+
			" and s.spsystem_id = "+id+
			"  group by activitytype ";
			Query query = getEntityManager().createNativeQuery(queryString);
			//System.out.println(query.getResultList().size());
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed findAll_TSPSYSTEMDEFS", Level.SEVERE, re);
			throw re;
		}
	}


	public List<Vector> findAllFacturasBy(int anio, int mes) {
		try {
			final String queryString = " SELECT * FROM yvcabfactwebonline "+
			" WHERE TO_CHAR(ISSUEDATE,'yyyy-mm-dd') = '2011-02-01'";
			Query query = getEntityManager().createNativeQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelperBSCC.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}


	public List<LineaCuarentena> findAll_LineasParaSalirDeCuarentena() {
		try {
			final String queryString = "select num_serie as NUMERO_TELEFONO, "+ 
			" case when CIUDAD = 'Quito' then 63 "+
			" when CIUDAD = 'Guayaquil' then 94 "+
			" else 65 end as CIUDAD  "+
			" from y_lineas_cuarentena  "+
			" where internalstate_prev is null ";

			Query query = getEntityManager().createNativeQuery(queryString);

			ArrayList<String> lineas = new ArrayList<String>();

			List<Vector> datos = query.getResultList();
			ArrayList<LineaCuarentena> array = new ArrayList<LineaCuarentena>();
			if( query.getResultList().size() > 0 )
				for(Vector j : datos){
					array.add(new LineaCuarentena(Integer.parseInt(j.get(1).
							toString()), j.get(0).toString()));
					lineas.add(j.get(0).toString());
				}

			//hago un UPDATE de los datos que se leyeron
			String tmpLineas = "";
			if(lineas.size()>0){
				for(String tmp : lineas)
					tmpLineas += "'"+tmp+"',";

				tmpLineas = tmpLineas.substring(0, tmpLineas.length()-1);

				final String queryString2 = "update y_lineas_cuarentena "+
				" set internalstate_prev = 'Q' "+
				" where NUM_SERIE in ( "+ tmpLineas  +" )";
				getEntityManager().getTransaction().begin();
				Query query2 = getEntityManager().createNativeQuery(queryString2);
				int upd = query2.executeUpdate();
				getEntityManager().getTransaction().commit();
			}
			return array;

		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed findAll_TSPSYSTEMDEFS", Level.SEVERE, re);
			throw re;
		}
	}



	public static void main(String a[]){
		/*List<Vector> res = new Querys().findAll_TSPSYSTEMDEFS();
		for(Vector v : res){
			System.out.println(v.get(0).toString()+" "+v.get(1).toString());
			System.out.println(new Querys().findAll_State_Q(v.get(0).toString()));
		}*/

		/*List<Vector> res = new Querys().findAllFacturasBy(2011,02);
		System.out.println("Total: "+res.get(0));

		for(Vector v : res){
			System.out.println(v.get(0).toString());
			System.out.println(new Querys().findAll_State_Q(v.get(0).toString()));
			break;
		}*/

		List<LineaCuarentena> res = new Querys().findAll_LineasParaSalirDeCuarentena();


	}

}
