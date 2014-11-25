package com.app.tv.adm_contratos.dao;

import com.app.dao.EntityManagerHelper;
import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * AdmContratos entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see com.app.tv.adm_contratos.dao.AdmContratos
 * @author MyEclipse Persistence Tools
 */

public class AdmContratosDAO implements IAdmContratosDAO {
	// property constants
	public static final String CPARTY = "cparty";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved AdmContratos entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * AdmContratosDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            AdmContratos entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(AdmContratos entity) {
		EntityManagerHelper.log("saving AdmContratos instance", Level.INFO,
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
	 * Delete a persistent AdmContratos entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * AdmContratosDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            AdmContratos entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(AdmContratos entity) {
		EntityManagerHelper.log("deleting AdmContratos instance", Level.INFO,
				null);
		try {
			entity = getEntityManager().getReference(AdmContratos.class,
					entity.getIdContratos());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved AdmContratos entity and return it or a copy of
	 * it to the sender. A copy of the AdmContratos entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = AdmContratosDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            AdmContratos entity to update
	 * @returns AdmContratos the persisted AdmContratos entity instance, may not
	 *          be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public AdmContratos update(AdmContratos entity) {
		EntityManagerHelper.log("updating AdmContratos instance", Level.INFO,
				null);
		try {
			AdmContratos result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public AdmContratos findById(Integer id) {
		EntityManagerHelper.log("finding AdmContratos instance with id: " + id,
				Level.INFO, null);
		try {
			AdmContratos instance = getEntityManager().find(AdmContratos.class,
					id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}


	
	/**
	 * Find all AdmContratos entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the AdmContratos property to query
	 * @param value
	 *            the property value to match
	 * @return List<AdmContratos> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<AdmContratos> findByProperty(String propertyName,
			final Object value) {
		EntityManagerHelper.log("finding AdmContratos instance with property: "
				+ propertyName + ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from AdmContratos model where model."
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
	public List<AdmContratos> count(int cparties) {
		try {
			final String queryString = "select count(model) from AdmContratos model where model.cparty="
					+ cparties;
			System.out.println("Query ADM"+queryString);
			Query query = getEntityManager().createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find by property name failed",
					Level.SEVERE, re);
			throw re;
		}
	}
	
	public List<AdmContratos> findByCparty(Object cparty) {
		return findByProperty(CPARTY, cparty);
	}

	/**
	 * Find all AdmContratos entities.
	 * 
	 * @return List<AdmContratos> all AdmContratos entities
	 */
	@SuppressWarnings("unchecked")
	public List<AdmContratos> findAll() {
		EntityManagerHelper.log("finding all AdmContratos instances",
				Level.INFO, null);
		try {
			final String queryString = "select model from AdmContratos model";
			Query query = getEntityManager().createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

}