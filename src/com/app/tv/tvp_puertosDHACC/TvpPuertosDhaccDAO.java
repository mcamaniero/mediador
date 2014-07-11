package com.app.tv.tvp_puertosDHACC;

import com.app.dao.EntityManagerHelper;
import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * TvpPuertosDhacc entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see com.app.tv.tvp_puertosDHACC.TvpPuertosDhacc
 * @author MyEclipse Persistence Tools
 */

public class TvpPuertosDhaccDAO implements ITvpPuertosDhaccDAO {
	// property constants
	public static final String PUERTODESDE = "puertodesde";
	public static final String PUERTOHASTA = "puertohasta";
	public static final String SOLOUNO = "solouno";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TvpPuertosDhacc entity.
	 * All subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TvpPuertosDhaccDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TvpPuertosDhacc entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TvpPuertosDhacc entity) {
		EntityManagerHelper.log("saving TvpPuertosDhacc instance", Level.INFO,
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
	 * Delete a persistent TvpPuertosDhacc entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TvpPuertosDhaccDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TvpPuertosDhacc entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TvpPuertosDhacc entity) {
		EntityManagerHelper.log("deleting TvpPuertosDhacc instance",
				Level.INFO, null);
		try {
			entity = getEntityManager().getReference(TvpPuertosDhacc.class,
					entity.getCiudad());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TvpPuertosDhacc entity and return it or a copy
	 * of it to the sender. A copy of the TvpPuertosDhacc entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TvpPuertosDhaccDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TvpPuertosDhacc entity to update
	 * @returns TvpPuertosDhacc the persisted TvpPuertosDhacc entity instance,
	 *          may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TvpPuertosDhacc update(TvpPuertosDhacc entity) {
		EntityManagerHelper.log("updating TvpPuertosDhacc instance",
				Level.INFO, null);
		try {
			TvpPuertosDhacc result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TvpPuertosDhacc findById(Integer id) {
		EntityManagerHelper.log("finding TvpPuertosDhacc instance with id: "
				+ id, Level.INFO, null);
		try {
			TvpPuertosDhacc instance = getEntityManager().find(
					TvpPuertosDhacc.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all TvpPuertosDhacc entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TvpPuertosDhacc property to query
	 * @param value
	 *            the property value to match
	 * @return List<TvpPuertosDhacc> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TvpPuertosDhacc> findByProperty(String propertyName,
			final Object value) {
		EntityManagerHelper.log(
				"finding TvpPuertosDhacc instance with property: "
						+ propertyName + ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from TvpPuertosDhacc model where model."
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

	public List<TvpPuertosDhacc> findByPuertodesde(Object puertodesde) {
		return findByProperty(PUERTODESDE, puertodesde);
	}

	public List<TvpPuertosDhacc> findByPuertohasta(Object puertohasta) {
		return findByProperty(PUERTOHASTA, puertohasta);
	}

	public List<TvpPuertosDhacc> findBySolouno(Object solouno) {
		return findByProperty(SOLOUNO, solouno);
	}

	/**
	 * Find all TvpPuertosDhacc entities.
	 * 
	 * @return List<TvpPuertosDhacc> all TvpPuertosDhacc entities
	 */
	@SuppressWarnings("unchecked")
	public List<TvpPuertosDhacc> findAll() {
		EntityManagerHelper.log("finding all TvpPuertosDhacc instances",
				Level.INFO, null);
		try {
			final String queryString = "select model from TvpPuertosDhacc model";
			Query query = getEntityManager().createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

}