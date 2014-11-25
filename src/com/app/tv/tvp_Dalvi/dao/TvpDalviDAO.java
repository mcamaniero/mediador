package com.app.tv.tvp_Dalvi.dao;

import com.app.dao.EntityManagerHelper;
import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * TvpDalvi entities. Transaction control of the save(), update() and delete()
 * operations must be handled externally by senders of these methods or must be
 * manually added to each of these methods for data to be persisted to the JPA
 * datastore.
 * 
 * @see com.app.tv.tvp_Dalvi.dao.TvpDalvi
 * @author MyEclipse Persistence Tools
 */

public class TvpDalviDAO implements ITvpDalviDAO {
	// property constants
	public static final String COMANDO = "comando";
	public static final String ESTADO = "estado";
	public static final String TRAMA = "trama";
	public static final String RESPUESTA = "respuesta";
	public static final String CIUDAD = "ciudad";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TvpDalvi entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TvpDalviDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TvpDalvi entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TvpDalvi entity) {
		EntityManagerHelper.log("saving TvpDalvi instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent TvpDalvi entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TvpDalviDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TvpDalvi entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TvpDalvi entity) {
		EntityManagerHelper.log("deleting TvpDalvi instance", Level.INFO, null);
		try {
			entity = getEntityManager().getReference(TvpDalvi.class,
					entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TvpDalvi entity and return it or a copy of it
	 * to the sender. A copy of the TvpDalvi entity parameter is returned when
	 * the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TvpDalviDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TvpDalvi entity to update
	 * @returns TvpDalvi the persisted TvpDalvi entity instance, may not be the
	 *          same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TvpDalvi update(TvpDalvi entity) {
		EntityManagerHelper.log("updating TvpDalvi instance", Level.INFO, null);
		try {
			TvpDalvi result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TvpDalvi findById(Long id) {
		//EntityManagerHelper.log("finding TvpDalvi instance with id: " + id,
//				Level.INFO, null);
		try {
			TvpDalvi instance = getEntityManager().find(TvpDalvi.class, id);
			getEntityManager().refresh(instance);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all TvpDalvi entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TvpDalvi property to query
	 * @param value
	 *            the property value to match
	 * @return List<TvpDalvi> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TvpDalvi> findByProperty(String propertyName, final Object value) {
		EntityManagerHelper.log("finding TvpDalvi instance with property: "
				+ propertyName + ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from TvpDalvi model where model."
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

	public List<TvpDalvi> findByComando(Object comando) {
		return findByProperty(COMANDO, comando);
	}

	public List<TvpDalvi> findByEstado(Object estado) {
		return findByProperty(ESTADO, estado);
	}

	public List<TvpDalvi> findByTrama(Object trama) {
		return findByProperty(TRAMA, trama);
	}

	public List<TvpDalvi> findByRespuesta(Object respuesta) {
		return findByProperty(RESPUESTA, respuesta);
	}

	public List<TvpDalvi> findByCiudad(Object ciudad) {
		return findByProperty(CIUDAD, ciudad);
	}

	/**
	 * Find all TvpDalvi entities.
	 * 
	 * @return List<TvpDalvi> all TvpDalvi entities
	 */
	@SuppressWarnings("unchecked")
	public List<TvpDalvi> findAll() {
		EntityManagerHelper.log("finding all TvpDalvi instances", Level.INFO,
				null);
		try {
			final String queryString = "select model from TvpDalvi model";
			Query query = getEntityManager().createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

}