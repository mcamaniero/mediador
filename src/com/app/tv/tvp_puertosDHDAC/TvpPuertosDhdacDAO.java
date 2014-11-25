package com.app.tv.tvp_puertosDHDAC;

import com.app.dao.EntityManagerHelper;
import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * TvpPuertosDhdac entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see com.app.tv.tvp_puertosDHDAC.TvpPuertosDhdac
 * @author MyEclipse Persistence Tools
 */

public class TvpPuertosDhdacDAO implements ITvpPuertosDhdacDAO {
	// property constants
	public static final String PUERTODESDE = "puertodesde";
	public static final String PUERTOHASTA = "puertohasta";
	public static final String SOLOUNO = "solouno";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TvpPuertosDhdac entity.
	 * All subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TvpPuertosDhdacDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TvpPuertosDhdac entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TvpPuertosDhdac entity) {
		EntityManagerHelper.log("saving TvpPuertosDhdac instance", Level.INFO,
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
	 * Delete a persistent TvpPuertosDhdac entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TvpPuertosDhdacDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TvpPuertosDhdac entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TvpPuertosDhdac entity) {
		EntityManagerHelper.log("deleting TvpPuertosDhdac instance",
				Level.INFO, null);
		try {
			entity = getEntityManager().getReference(TvpPuertosDhdac.class,
					entity.getCiudad());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TvpPuertosDhdac entity and return it or a copy
	 * of it to the sender. A copy of the TvpPuertosDhdac entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TvpPuertosDhdacDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TvpPuertosDhdac entity to update
	 * @returns TvpPuertosDhdac the persisted TvpPuertosDhdac entity instance,
	 *          may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TvpPuertosDhdac update(TvpPuertosDhdac entity) {
		EntityManagerHelper.log("updating TvpPuertosDhdac instance",
				Level.INFO, null);
		try {
			TvpPuertosDhdac result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TvpPuertosDhdac findById(Integer id) {
		EntityManagerHelper.log("finding TvpPuertosDhdac instance with id: "
				+ id, Level.INFO, null);
		try {
			TvpPuertosDhdac instance = getEntityManager().find(
					TvpPuertosDhdac.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all TvpPuertosDhdac entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TvpPuertosDhdac property to query
	 * @param value
	 *            the property value to match
	 * @return List<TvpPuertosDhdac> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TvpPuertosDhdac> findByProperty(String propertyName,
			final Object value) {
		EntityManagerHelper.log(
				"finding TvpPuertosDhdac instance with property: "
						+ propertyName + ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from TvpPuertosDhdac model where model."
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

	public List<TvpPuertosDhdac> findByPuertodesde(Object puertodesde) {
		return findByProperty(PUERTODESDE, puertodesde);
	}

	public List<TvpPuertosDhdac> findByPuertohasta(Object puertohasta) {
		return findByProperty(PUERTOHASTA, puertohasta);
	}

	public List<TvpPuertosDhdac> findBySolouno(Object solouno) {
		return findByProperty(SOLOUNO, solouno);
	}

	/**
	 * Find all TvpPuertosDhdac entities.
	 * 
	 * @return List<TvpPuertosDhdac> all TvpPuertosDhdac entities
	 */
	@SuppressWarnings("unchecked")
	public List<TvpPuertosDhdac> findAll() {
		EntityManagerHelper.log("finding all TvpPuertosDhdac instances",
				Level.INFO, null);
		try {
			final String queryString = "select model from TvpPuertosDhdac model";
			Query query = getEntityManager().createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

}