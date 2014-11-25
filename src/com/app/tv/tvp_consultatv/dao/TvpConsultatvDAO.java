package com.app.tv.tvp_consultatv.dao;

import com.app.dao.EntityManagerHelper;
import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * TvpConsultatv entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see com.app.tv.tvp_consultatv.dao.TvpConsultatv
 * @author MyEclipse Persistence Tools
 */

public class TvpConsultatvDAO implements ITvpConsultatvDAO {
	// property constants
	public static final String ACTIVITYTYPE = "activitytype";
	public static final String CPARTY_ID = "cpartyId";
	public static final String CPARTY_ACCOUNT_ID = "cpartyAccountId";
	public static final String APADDRESS = "apaddress";
	public static final String TARIFF_PLAN_VARIANT_NAME = "tariffPlanVariantName";
	public static final String REQUESTEDDATE = "requesteddate";
	public static final String CITEM_ID = "citemId";
	public static final String CIUDAD_NOMBRE = "ciudadNombre";
	public static final String SYSTEM_ID_ACTIVE = "systemIdActive";
	public static final String SESSION_ID = "sessionId";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TvpConsultatv entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TvpConsultatvDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TvpConsultatv entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TvpConsultatv entity) {
		EntityManagerHelper.log("saving TvpConsultatv instance", Level.INFO,
				null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent TvpConsultatv entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TvpConsultatvDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TvpConsultatv entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TvpConsultatv entity) {
		EntityManagerHelper.log("deleting TvpConsultatv instance", Level.INFO,
				null);
		try {
			entity = getEntityManager().getReference(TvpConsultatv.class,
					entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TvpConsultatv entity and return it or a copy
	 * of it to the sender. A copy of the TvpConsultatv entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TvpConsultatvDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TvpConsultatv entity to update
	 * @returns TvpConsultatv the persisted TvpConsultatv entity instance, may
	 *          not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TvpConsultatv update(TvpConsultatv entity) {
		EntityManagerHelper.log("updating TvpConsultatv instance", Level.INFO,
				null);
		try {
			TvpConsultatv result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TvpConsultatv findById(Integer id) {
		EntityManagerHelper.log(
				"finding TvpConsultatv instance with id: " + id, Level.INFO,
				null);
		try {
			TvpConsultatv instance = getEntityManager().find(
					TvpConsultatv.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all TvpConsultatv entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TvpConsultatv property to query
	 * @param value
	 *            the property value to match
	 * @return List<TvpConsultatv> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TvpConsultatv> findByProperty(String propertyName,
			final Object value) {
		EntityManagerHelper.log(
				"finding TvpConsultatv instance with property: " + propertyName
						+ ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from TvpConsultatv model where model."
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

	public List<TvpConsultatv> findByActivitytype(Object activitytype) {
		return findByProperty(ACTIVITYTYPE, activitytype);
	}

	public List<TvpConsultatv> findByCpartyId(Object cpartyId) {
		return findByProperty(CPARTY_ID, cpartyId);
	}

	public List<TvpConsultatv> findByCpartyAccountId(Object cpartyAccountId) {
		return findByProperty(CPARTY_ACCOUNT_ID, cpartyAccountId);
	}

	public List<TvpConsultatv> findByApaddress(Object apaddress) {
		return findByProperty(APADDRESS, apaddress);
	}

	public List<TvpConsultatv> findByTariffPlanVariantName(
			Object tariffPlanVariantName) {
		return findByProperty(TARIFF_PLAN_VARIANT_NAME, tariffPlanVariantName);
	}

	public List<TvpConsultatv> findByRequesteddate(Object requesteddate) {
		return findByProperty(REQUESTEDDATE, requesteddate);
	}

	public List<TvpConsultatv> findByCitemId(Object citemId) {
		return findByProperty(CITEM_ID, citemId);
	}

	public List<TvpConsultatv> findByCiudadNombre(Object ciudadNombre) {
		return findByProperty(CIUDAD_NOMBRE, ciudadNombre);
	}

	public List<TvpConsultatv> findBySystemIdActive(Object systemIdActive) {
		return findByProperty(SYSTEM_ID_ACTIVE, systemIdActive);
	}

	public List<TvpConsultatv> findBySessionId(Object sessionId) {
		return findByProperty(SESSION_ID, sessionId);
	}

	/**
	 * Find all TvpConsultatv entities.
	 * 
	 * @return List<TvpConsultatv> all TvpConsultatv entities
	 */
	@SuppressWarnings("unchecked")
	public List<TvpConsultatv> findAll() {
		EntityManagerHelper.log("finding all TvpConsultatv instances",
				Level.INFO, null);
		try {
			final String queryString = "select model from TvpConsultatv model";
			Query query = getEntityManager().createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

}