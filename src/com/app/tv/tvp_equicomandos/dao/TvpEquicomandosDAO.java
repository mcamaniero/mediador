package com.app.tv.tvp_equicomandos.dao;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.app.dao.EntityManagerHelper;

/**
 * A data access object (DAO) providing persistence and search support for
 * TvpEquicomandos entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see com.app.tv.tvp_equicomandos.dao.TvpEquicomandos
 * @author MyEclipse Persistence Tools
 */

public class TvpEquicomandosDAO{
	// property constants
	public static final String NOMBRE = "nombre";
	public static final String CODIGO_DAC = "codigoDac";
	public static final String CODIGO_ACC = "codigoAcc";
	public static final String CODIGO_DALVI = "codigoDalvi";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TvpEquicomandos entity.
	 * All subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TvpEquicomandosDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TvpEquicomandos entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TvpEquicomandos entity) {
		EntityManagerHelper.log("saving TvpEquicomandos instance", Level.INFO,
				null);
		try {
			getEntityManager().persist(entity);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	/**
	 * Delete a persistent TvpEquicomandos entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TvpEquicomandosDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TvpEquicomandos entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TvpEquicomandos entity) {
		try {
			entity = getEntityManager().getReference(TvpEquicomandos.class,
					entity.getCodigo());
			getEntityManager().remove(entity);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	/**
	 * Persist a previously saved TvpEquicomandos entity and return it or a copy
	 * of it to the sender. A copy of the TvpEquicomandos entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TvpEquicomandosDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TvpEquicomandos entity to update
	 * @returns TvpEquicomandos the persisted TvpEquicomandos entity instance,
	 *          may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TvpEquicomandos update(TvpEquicomandos entity) {
		try {
			TvpEquicomandos result = getEntityManager().merge(entity);
			return result;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public TvpEquicomandos findById(Integer id) {
		try {
			TvpEquicomandos instance = getEntityManager().find(
					TvpEquicomandos.class, id);
			return instance;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	/**
	 * Find all TvpEquicomandos entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TvpEquicomandos property to query
	 * @param value
	 *            the property value to match
	 * @return List<TvpEquicomandos> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TvpEquicomandos> findByProperty(String propertyName,
			final Object value) {
		try {
			final String queryString = "select model from TvpEquicomandos model where model."
					+ propertyName + "= :propertyValue";
			Query query = getEntityManager().createQuery(queryString);
			query.setParameter("propertyValue", value);
			return query.getResultList();
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public List<TvpEquicomandos> findByNombre(Object nombre) {
		return findByProperty(NOMBRE, nombre);
	}

	public List<TvpEquicomandos> findByCodigoDac(Object codigoDac) {
		return findByProperty(CODIGO_DAC, codigoDac);
	}

	public List<TvpEquicomandos> findByCodigoAcc(Object codigoAcc) {
		return findByProperty(CODIGO_ACC, codigoAcc);
	}

	public List<TvpEquicomandos> findByCodigoDalvi(Object codigoDalvi) {
		return findByProperty(CODIGO_DALVI, codigoDalvi);
	}

	/**
	 * Find all TvpEquicomandos entities.
	 * 
	 * @return List<TvpEquicomandos> all TvpEquicomandos entities
	 */
	@SuppressWarnings("unchecked")
	public List<TvpEquicomandos> findAll() {
		try {
			final String queryString = "select model from TvpEquicomandos model";
			Query query = getEntityManager().createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			throw re;
		}
	}

}