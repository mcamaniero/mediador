package com.app.tv.tvp_tipodeco.dao;

import com.app.dao.EntityManagerHelper;
import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * TvpTipodeco entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see com.app.tv.tvp_tipodeco.dao.TvpTipodeco
 * @author MyEclipse Persistence Tools
 */

public class TvpTipodecoDAO implements ITvpTipodecoDAO {
	// property constants
	public static final String IPPV = "ippv";
	public static final String TIPOCONTROLADOR = "tipocontrolador";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TvpTipodeco entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TvpTipodecoDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TvpTipodeco entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TvpTipodeco entity) {
		try {
			getEntityManager().persist(entity);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	/**
	 * Delete a persistent TvpTipodeco entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TvpTipodecoDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TvpTipodeco entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TvpTipodeco entity) {
		try {
			entity = getEntityManager().getReference(TvpTipodeco.class,
					entity.getIdTipoDeco());
			getEntityManager().remove(entity);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	/**
	 * Persist a previously saved TvpTipodeco entity and return it or a copy of
	 * it to the sender. A copy of the TvpTipodeco entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TvpTipodecoDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TvpTipodeco entity to update
	 * @returns TvpTipodeco the persisted TvpTipodeco entity instance, may not
	 *          be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TvpTipodeco update(TvpTipodeco entity) {
		try {
			TvpTipodeco result = getEntityManager().merge(entity);
			return result;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public TvpTipodeco findById(Integer id) {
		try {
			TvpTipodeco instance = getEntityManager().find(TvpTipodeco.class,id);
			return instance;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	/**
	 * Find all TvpTipodeco entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TvpTipodeco property to query
	 * @param value
	 *            the property value to match
	 * @return List<TvpTipodeco> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TvpTipodeco> findByProperty(String propertyName,
			final Object value) {
		try {
			final String queryString = "select model from TvpTipodeco model where model."
					+ propertyName + "= :propertyValue";
			Query query = getEntityManager().createQuery(queryString);
			query.setParameter("propertyValue", value);
			return query.getResultList();
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public List<TvpTipodeco> findByIppv(Object ippv) {
		return findByProperty(IPPV, ippv);
	}

	public List<TvpTipodeco> findByTipocontrolador(Object tipocontrolador) {
		return findByProperty(TIPOCONTROLADOR, tipocontrolador);
	}

	/**
	 * Find all TvpTipodeco entities.
	 * 
	 * @return List<TvpTipodeco> all TvpTipodeco entities
	 */
	@SuppressWarnings("unchecked")
	public List<TvpTipodeco> findAll() {
		try {
			final String queryString = "select model from TvpTipodeco model";
			Query query = getEntityManager().createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			throw re;
		}
	}

}