package com.app.mcafee.dao;

import com.app.dao.EntityManagerHelper;
import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * McafCliente entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see com.app.mcafee.dao.McafCliente
 * @author MyEclipse Persistence Tools
 */

public class McafClienteDAO {
	// property constants
	public static final String MAIL = "mail";
	public static final String ID_PRODUCTO = "idProducto";
	public static final String SISTEMA = "sistema";
	public static final String PASSWORD = "password";
	public static final String PASSWORD_WEB = "passwordWeb";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved McafCliente entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * McafClienteDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            McafCliente entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(McafCliente entity) {
		EntityManagerHelper
				.log("saving McafCliente instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent McafCliente entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * McafClienteDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            McafCliente entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(McafCliente entity) {
		EntityManagerHelper.log("deleting McafCliente instance", Level.INFO,
				null);
		try {
			entity = getEntityManager().getReference(McafCliente.class,
					entity.getIdMcAfee());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved McafCliente entity and return it or a copy of
	 * it to the sender. A copy of the McafCliente entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = McafClienteDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            McafCliente entity to update
	 * @returns McafCliente the persisted McafCliente entity instance, may not
	 *          be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public McafCliente update(McafCliente entity) {
		EntityManagerHelper.log("updating McafCliente instance", Level.INFO,
				null);
		try {
			McafCliente result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public McafCliente findById(Integer id) {
		EntityManagerHelper.log("finding McafCliente instance with id: " + id,
				Level.INFO, null);
		try {
			McafCliente instance = getEntityManager().find(McafCliente.class,
					id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all McafCliente entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the McafCliente property to query
	 * @param value
	 *            the property value to match
	 * @return List<McafCliente> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<McafCliente> findByProperty(String propertyName,
			final Object value) {
		try {
			final String queryString = "select model from McafCliente model where model."
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
	public List<McafCliente> findByMailCorreo(String propertyName,
			final Object value) {
		EntityManagerHelper.log("finding McafCliente instance with property: "
				+ propertyName + ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from McafCliente model where model."
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

	
	public List<McafCliente> findByMail(Object mail) {
		return findByProperty(MAIL, mail);
	}

	public List<McafCliente> findByIdProducto(Object idProducto) {
		return findByProperty(ID_PRODUCTO, idProducto);
	}

	public List<McafCliente> findBySistema(Object sistema) {
		return findByProperty(SISTEMA, sistema);
	}

	public List<McafCliente> findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}

	public List<McafCliente> findByPasswordWeb(Object passwordWeb) {
		return findByProperty(PASSWORD_WEB, passwordWeb);
	}

	/**
	 * Find all McafCliente entities.
	 * 
	 * @return List<McafCliente> all McafCliente entities
	 */
	@SuppressWarnings("unchecked")
	public List<McafCliente> findAll() {
		EntityManagerHelper.log("finding all McafCliente instances",
				Level.INFO, null);
		try {
			final String queryString = "select model from McafCliente model";
			Query query = getEntityManager().createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

}