package com.app.tv.tvp_ordenacc.dao;

import java.util.logging.Level;
import javax.persistence.EntityManager;

import com.app.dao.EntityManagerHelper;

/**
 * A data access object (DAO) providing persistence and search support for
 * TvpOrdenacc entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see com.app.tv.tvp_ordenacc.dao.TvpOrdenacc
 * @author MyEclipse Persistence Tools
 */

public class TvpOrdenaccDAO {
	// property constants
	public static final String PUERTO = "puerto";
	public static final String TAMANIO = "tamanio";
	public static final String COMANDO = "comando";
	public static final String PAQUETE = "paquete";
	public static final String ESTADO = "estado";
	public static final String RESPUESTA = "respuesta";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TvpOrdenacc entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TvpOrdenaccDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TvpOrdenacc entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TvpOrdenacc entity) {
		try {
			getEntityManager().persist(entity);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	/**
	 * Delete a persistent TvpOrdenacc entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TvpOrdenaccDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TvpOrdenacc entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TvpOrdenacc entity) {
		try {
			entity = getEntityManager().getReference(TvpOrdenacc.class,
					entity.getClave());
			getEntityManager().remove(entity);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	/**
	 * Persist a previously saved TvpOrdenacc entity and return it or a copy of
	 * it to the sender. A copy of the TvpOrdenacc entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TvpOrdenaccDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TvpOrdenacc entity to update
	 * @returns TvpOrdenacc the persisted TvpOrdenacc entity instance, may not
	 *          be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TvpOrdenacc update(TvpOrdenacc entity) {
		try {
			TvpOrdenacc result = getEntityManager().merge(entity);
			return result;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public TvpOrdenacc findById(Long id) {
		try {
			TvpOrdenacc instance = getEntityManager().find(TvpOrdenacc.class,
					id);
			getEntityManager().refresh(instance);
			return instance;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	
}