package com.app.mcafee.dao;

import com.app.dao.EntityManagerHelper;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * McafTransaccion entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see com.app.mcafee.dao.McafTransaccion
 * @author MyEclipse Persistence Tools
 */

public class McafTransaccionDAO {
	// property constants
	public static final String SKU = "sku";
	public static final String PLAN_TV_CABLE = "planTvCable";
	public static final String CITEM_ID = "citemId";
	public static final String ACCOUNT_ID = "accountId";
	public static final String CLIENTE_MC_AFEE_ID = "clienteMcAfeeId";
	public static final String REFERENCIA = "referencia";
	public static final String PASSWORD = "password";
	public static final String LOG_ID = "logId";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved McafTransaccion entity.
	 * All subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * McafTransaccionDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            McafTransaccion entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(McafTransaccion entity) {

		try {
			getEntityManager().persist(entity);
			getEntityManager().flush();
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent McafTransaccion entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * McafTransaccionDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            McafTransaccion entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(McafTransaccion entity) {
		EntityManagerHelper.log("deleting McafTransaccion instance",
				Level.INFO, null);
		try {
			entity = getEntityManager().getReference(McafTransaccion.class,
					entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved McafTransaccion entity and return it or a copy
	 * of it to the sender. A copy of the McafTransaccion entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = McafTransaccionDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            McafTransaccion entity to update
	 * @returns McafTransaccion the persisted McafTransaccion entity instance,
	 *          may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public McafTransaccion update(McafTransaccion entity) {
		EntityManagerHelper.log("updating McafTransaccion instance",
				Level.INFO, null);
		try {
			McafTransaccion result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public McafTransaccion findById(Integer id) {
		EntityManagerHelper.log("finding McafTransaccion instance with id: "
				+ id, Level.INFO, null);
		try {
			McafTransaccion instance = getEntityManager().find(
					McafTransaccion.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all McafTransaccion entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the McafTransaccion property to query
	 * @param value
	 *            the property value to match
	 * @return List<McafTransaccion> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<McafTransaccion> findByProperty(String propertyName,
			final Object value) {
		EntityManagerHelper.log(
				"finding McafTransaccion instance with property: "
				+ propertyName + ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from McafTransaccion model where model."
				+ propertyName + "= :propertyValue";
			Query query = getEntityManager().createQuery(queryString);
			query.setParameter("propertyValue", value);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find by property name failed",
					Level.SEVERE, re);
			throw re;
		}
	}


	@SuppressWarnings("unchecked")
	public String findByProductFamily(final String mcAfeeId) {

		boolean is0 = false;
		boolean is1 = false;
		boolean is2 = false;
		String resp = "";

		try {

			//no tiene familia protegida
			String queryString = "select model from McafTransaccion model where " +
			"model.clienteMcAfeeId = :mcAfeeId and " +
			"model.estado = 'A' and " +
			"model.planTvCable in (1,2) ";
			Query query = getEntityManager().createQuery(queryString);
			query.setParameter("mcAfeeId", mcAfeeId);
			is0 = query.getResultList().size()>0;


			//si solo tiene familia protegida
			queryString = "select model from McafTransaccion model where " +
			"model.clienteMcAfeeId = :mcAfeeId and " +
			"model.estado = 'A' and " +
			"model.planTvCable in (3) ";
			query = getEntityManager().createQuery(queryString);
			query.setParameter("mcAfeeId", mcAfeeId);
			is1 = query.getResultList().size()>0;

			//familia protegida y todos los demas
			queryString = "select model from McafTransaccion model where " +
			"model.clienteMcAfeeId = :mcAfeeId and " +
			"model.estado = 'A' and " +
			"model.planTvCable in (4,5) ";
			query = getEntityManager().createQuery(queryString);
			query.setParameter("mcAfeeId", mcAfeeId);
			is2 = query.getResultList().size()>0;

			if(is0 && !is1 && !is2)
				resp = "0";

			if(!is0 && is1 && !is2)
				resp = "1";

			if((is0 && is1) || (is0 && is2 ) || (is1 && is2 ) || is2)
				resp = "2";


		} catch (RuntimeException re) {
			EntityManagerHelper.log("find by property name failed",
					Level.SEVERE, re);
			throw re;
		}

		return resp;

	}


	@SuppressWarnings("unchecked")
	public String findByProductFamilySKU(Object mcAfeeId) {

		boolean is0 = false;
		boolean is1 = false;
		boolean is2 = false;
		String resp = "";

		List<McafTransaccion> mcfs = this.findByClienteMcAfeeId(mcAfeeId);
		System.out.println(mcfs.size());
		for(McafTransaccion t : mcfs){
			if(t.getEstado() !=null && t.getEstado().equals("A")){
				List<McafDettransaccion> det = new McafDettransaccionDAO().findByIdTransaccion(t.getId());
				for(McafDettransaccion d : det){
					//valida los FP que tienen el codigo antiguo
					if ( d.getSkumcAfee().equals("594-33041-mfpo")
							|| d.getSkumcAfee().equals("594-34468-mfpo")){
						is1 = true;
						is2 = true;
					}else
						is0 = true;
				}
			}
		}

		if(is0 && !is1 && !is2)
			resp = "0";

		if(!is0 && is1 && !is2)
			resp = "1";

		if((is0 && is1) || (is0 && is2 ) || (is1 && is2 ) || is2)
			resp = "2";

		return resp;

	}

	@SuppressWarnings("unchecked")
	public List<McafTransaccion> findByTransaccionProductFamily(final String mcAfeeId) {

		try {
			final String queryString = "select model from McafTransaccion model where " +
			"model.clienteMcAfeeId = :mcAfeeId and " +
			"model.estado = 'A' and " +
			"model.planTvCable in (3,4,5) ";
			Query query = getEntityManager().createQuery(queryString);
			query.setParameter("mcAfeeId", mcAfeeId);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find by property name failed",
					Level.SEVERE, re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Vector> findByTransaccionFamily(final String mcAfeeId) {
		try {
			final String queryString = "SELECT d.skumcafee " +
					" FROM aprovgrupotv.mcaf_transaccion t, mcaf_dettransaccion d " +
					" where clientemcafee_id = "+mcAfeeId+
					" and estado = 'A' " +
					" and t.id = d.idtransaccion ";
					
			Query query = getEntityManager().createNativeQuery(queryString);
			return query.getResultList();
			
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find by property name failed",	Level.SEVERE, re);
			throw re;
		}
	}

	
	@SuppressWarnings("unchecked")
	public List<Vector> findByTransaccionSKU(final String mcAfeeId) {
		try {
			final String queryString = "SELECT sku " +
					" FROM aprovgrupotv.mcaf_transaccion " +
					" where clientemcafee_id = "+mcAfeeId+
					" and estado = 'A' ";
					
			Query query = getEntityManager().createNativeQuery(queryString);
			return query.getResultList();
			
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find by property name failed",	Level.SEVERE, re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public List<McafTransaccion> findByPropertyMcAfeeIDPlanTvCable(final Integer mcAfeeID,
			final Integer planTvCable) {
		try {
			final String queryString = "select model from McafTransaccion model where " +
			"model.clienteMcAfeeId = :propertyValue and " +
			"model.planTvCable = :propertyValue2 ";

			Query query = getEntityManager().createQuery(queryString);
			query.setParameter("propertyValue", mcAfeeID);
			query.setParameter("propertyValue2",planTvCable);

			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find by property name failed", Level.SEVERE, re);
			throw re;
		}
	}


	@SuppressWarnings("unchecked")
	public List<McafTransaccion> findByPropertyMcAfeeIDActive(final Integer mcAfeeID) {
		try {
			final String queryString = "select model from McafTransaccion model where " +
			"model.clienteMcAfeeId = :propertyValue and model.estado = 'A' ";

			Query query = getEntityManager().createQuery(queryString);
			query.setParameter("propertyValue", mcAfeeID);

			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find by property name failed", Level.SEVERE, re);
			throw re;
		}
	}



	@SuppressWarnings("unchecked")
	public List<McafTransaccion> findByPropertyMcAfeeIDPlanTvCableActivo(final Integer mcAfeeID,
			final Integer planTvCable) {
		try {
			final String queryString = "select model from McafTransaccion model where " +
			"model.clienteMcAfeeId = :propertyValue and " +
			"model.planTvCable = :propertyValue2 and "  +
			"model.estado = 'A' ";

			Query query = getEntityManager().createQuery(queryString);
			query.setParameter("propertyValue", mcAfeeID);
			query.setParameter("propertyValue2",planTvCable);

			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find by property name failed", Level.SEVERE, re);
			throw re;
		}
	}

	public List<McafTransaccion> findBySku(Object sku) {
		return findByProperty(SKU, sku);
	}

	public List<McafTransaccion> findByPlanTvCable(Object planTvCable) {
		return findByProperty(PLAN_TV_CABLE, planTvCable);
	}

	public List<McafTransaccion> findByCitemId(Object citemId) {
		return findByProperty(CITEM_ID, citemId);
	}

	public List<McafTransaccion> findByAccountId(Object accountId) {
		return findByProperty(ACCOUNT_ID, accountId);
	}

	public List<McafTransaccion> findByClienteMcAfeeId(Object clienteMcAfeeId) {
		return findByProperty(CLIENTE_MC_AFEE_ID, clienteMcAfeeId);
	}

	public List<McafTransaccion> findByReferencia(Object referencia) {
		return findByProperty(REFERENCIA, referencia);
	}

	public List<McafTransaccion> findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}

	public List<McafTransaccion> findByLogId(Object logId) {
		return findByProperty(LOG_ID, logId);
	}

	/**
	 * Find all McafTransaccion entities.
	 * 
	 * @return List<McafTransaccion> all McafTransaccion entities
	 */
	@SuppressWarnings("unchecked")
	public List<McafTransaccion> findAll() {
		EntityManagerHelper.log("finding all McafTransaccion instances",
				Level.INFO, null);
		try {
			final String queryString = "select model from McafTransaccion model";
			Query query = getEntityManager().createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

}