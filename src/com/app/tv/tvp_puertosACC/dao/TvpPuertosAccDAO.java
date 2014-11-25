package com.app.tv.tvp_puertosACC.dao;

import com.app.dao.EntityManagerHelper;
import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * TvpPuertosAcc entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see com.app.tv.tvp_puertosACC.dao.TvpPuertosAcc
 * @author MyEclipse Persistence Tools
 */

public class TvpPuertosAccDAO implements ITvpPuertosAccDAO {
	// property constants
	public static final String PUERTO_ACC = "puertoAcc";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TvpPuertosAcc entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TvpPuertosAccDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TvpPuertosAcc entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TvpPuertosAcc entity) {
//		EntityManagerHelper.log("saving TvpPuertosAcc instance", Level.INFO,
//				null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent TvpPuertosAcc entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TvpPuertosAccDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TvpPuertosAcc entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TvpPuertosAcc entity) {
		try {
			entity = getEntityManager().getReference(TvpPuertosAcc.class,
					entity.getCiudadId());
			getEntityManager().remove(entity);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TvpPuertosAcc entity and return it or a copy
	 * of it to the sender. A copy of the TvpPuertosAcc entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TvpPuertosAccDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TvpPuertosAcc entity to update
	 * @returns TvpPuertosAcc the persisted TvpPuertosAcc entity instance, may
	 *          not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TvpPuertosAcc update(TvpPuertosAcc entity) {
		try {
			TvpPuertosAcc result = getEntityManager().merge(entity);
			return result;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public TvpPuertosAcc findById(Integer id) {
		try {
			TvpPuertosAcc instance = getEntityManager().find(
					TvpPuertosAcc.class, id);
			getEntityManager().refresh(instance);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all TvpPuertosAcc entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TvpPuertosAcc property to query
	 * @param value
	 *            the property value to match
	 * @return List<TvpPuertosAcc> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TvpPuertosAcc> findByProperty(String propertyName,
			final Object value) {
		try {
			final String queryString = "select model from TvpPuertosAcc model where model."
					+ propertyName + "= :propertyValue";
			Query query = getEntityManager().createQuery(queryString);
			query.setParameter("propertyValue", value);
			return query.getResultList();
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public List<TvpPuertosAcc> findByPuertoAcc(Object puertoAcc) {
		return findByProperty(PUERTO_ACC, puertoAcc);
	}

	/**
	 * Find all TvpPuertosAcc entities.
	 * 
	 * @return List<TvpPuertosAcc> all TvpPuertosAcc entities
	 */
	@SuppressWarnings("unchecked")
	public List<TvpPuertosAcc> findAll() {
		try {
			final String queryString = "select model from TvpPuertosAcc model";
			Query query = getEntityManager().createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			throw re;
		}
	}

}