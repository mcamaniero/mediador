package com.app.tv.adm_errorestvp.dao;

import com.app.dao.EntityManagerHelper;
import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * AdmErrorestvp entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see com.app.tv.adm_errorestvp.dao.AdmErrorestvp
 * @author MyEclipse Persistence Tools
 */

public class AdmErrorestvpDAO implements IAdmErrorestvpDAO {
	// property constants
	public static final String STR_ERROR_DAC = "strErrorDac";
	public static final String STR_ERROR_ACC = "strErrorAcc";
	public static final String STR_ERROR_DALVI = "strErrorDalvi";
	public static final String STR_ERROR = "strError";
	public static final String STR_ERROR_STRING = "strErrorString";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved AdmErrorestvp entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * AdmErrorestvpDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            AdmErrorestvp entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(AdmErrorestvp entity) {
		EntityManagerHelper.log("saving AdmErrorestvp instance", Level.INFO,
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
	 * Delete a persistent AdmErrorestvp entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * AdmErrorestvpDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            AdmErrorestvp entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(AdmErrorestvp entity) {
		EntityManagerHelper.log("deleting AdmErrorestvp instance", Level.INFO,
				null);
		try {
			entity = getEntityManager().getReference(AdmErrorestvp.class,
					entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved AdmErrorestvp entity and return it or a copy
	 * of it to the sender. A copy of the AdmErrorestvp entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = AdmErrorestvpDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            AdmErrorestvp entity to update
	 * @returns AdmErrorestvp the persisted AdmErrorestvp entity instance, may
	 *          not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public AdmErrorestvp update(AdmErrorestvp entity) {
		EntityManagerHelper.log("updating AdmErrorestvp instance", Level.INFO,
				null);
		try {
			AdmErrorestvp result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public AdmErrorestvp findById(Integer id) {
		EntityManagerHelper.log(
				"finding AdmErrorestvp instance with id: " + id, Level.INFO,
				null);
		try {
			AdmErrorestvp instance = getEntityManager().find(
					AdmErrorestvp.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all AdmErrorestvp entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the AdmErrorestvp property to query
	 * @param value
	 *            the property value to match
	 * @return List<AdmErrorestvp> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<AdmErrorestvp> findByProperty(String propertyName,
			final Object value) {
		EntityManagerHelper.log(
				"finding AdmErrorestvp instance with property: " + propertyName
						+ ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from AdmErrorestvp model where model."
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

	public List<AdmErrorestvp> findByStrErrorDac(Object strErrorDac) {
		return findByProperty(STR_ERROR_DAC, strErrorDac);
	}

	public List<AdmErrorestvp> findByStrErrorAcc(Object strErrorAcc) {
		return findByProperty(STR_ERROR_ACC, strErrorAcc);
	}

	public List<AdmErrorestvp> findByStrErrorDalvi(Object strErrorDalvi) {
		return findByProperty(STR_ERROR_DALVI, strErrorDalvi);
	}

	public List<AdmErrorestvp> findByStrError(Object strError) {
		return findByProperty(STR_ERROR, strError);
	}

	public List<AdmErrorestvp> findByStrErrorString(Object strErrorString) {
		return findByProperty(STR_ERROR_STRING, strErrorString);
	}

	/**
	 * Find all AdmErrorestvp entities.
	 * 
	 * @return List<AdmErrorestvp> all AdmErrorestvp entities
	 */
	@SuppressWarnings("unchecked")
	public List<AdmErrorestvp> findAll() {
		EntityManagerHelper.log("finding all AdmErrorestvp instances",
				Level.INFO, null);
		try {
			final String queryString = "select model from AdmErrorestvp model";
			Query query = getEntityManager().createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

}