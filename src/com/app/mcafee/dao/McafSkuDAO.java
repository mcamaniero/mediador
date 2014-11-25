package com.app.mcafee.dao;

import com.app.dao.EntityManagerHelper;
import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * McafSku entities. Transaction control of the save(), update() and delete()
 * operations must be handled externally by senders of these methods or must be
 * manually added to each of these methods for data to be persisted to the JPA
 * datastore.
 * 
 * @see com.app.mcafee.dao.McafSku
 * @author MyEclipse Persistence Tools
 */

public class McafSkuDAO {
	// property constants
	public static final String SKU = "sku";
	public static final String DESCRIPCION = "descripcion";
	public static final String PLAN_TV_CABLE = "planTvCable";
	public static final String DESC_PLAN_TV_CABLE = "descPlanTvCable";
	public static final String TRIAL = "trial";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved McafSku entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * McafSkuDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            McafSku entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(McafSku entity) {
		EntityManagerHelper.log("saving McafSku instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent McafSku entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * McafSkuDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            McafSku entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(McafSku entity) {
		EntityManagerHelper.log("deleting McafSku instance", Level.INFO, null);
		try {
			entity = getEntityManager().getReference(McafSku.class,
					entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved McafSku entity and return it or a copy of it
	 * to the sender. A copy of the McafSku entity parameter is returned when
	 * the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = McafSkuDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            McafSku entity to update
	 * @returns McafSku the persisted McafSku entity instance, may not be the
	 *          same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public McafSku update(McafSku entity) {
		EntityManagerHelper.log("updating McafSku instance", Level.INFO, null);
		try {
			McafSku result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public McafSku findById(Integer id) {
		EntityManagerHelper.log("finding McafSku instance with id: " + id,
				Level.INFO, null);
		try {
			McafSku instance = getEntityManager().find(McafSku.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all McafSku entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the McafSku property to query
	 * @param value
	 *            the property value to match
	 * @return List<McafSku> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<McafSku> findByProperty(String propertyName, final Object value) {
		EntityManagerHelper.log("finding McafSku instance with property: "
				+ propertyName + ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from McafSku model where model."
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
	public List<McafSku> findByPropertySKUTrial(final Object value1, final Object value2) {
		
		try {
			final String queryString = "select model from McafSku model where " +
					"model.planTvCable = :propertyValue1 and model.trial = :propertyValue2";
			Query query = getEntityManager().createQuery(queryString);
			query.setParameter("propertyValue1", value1);
			query.setParameter("propertyValue2", value2);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find by property name failed",
					Level.SEVERE, re);
			throw re;
		}
	}
	
	
	public List<McafSku> findBySku(Object sku) {
		return findByProperty(SKU, sku);
	}

	public List<McafSku> findByDescripcion(Object descripcion) {
		return findByProperty(DESCRIPCION, descripcion);
	}

	public List<McafSku> findByPlanTvCable(Object planTvCable) {
		return findByProperty(PLAN_TV_CABLE, planTvCable);
	}

	public List<McafSku> findByDescPlanTvCable(Object descPlanTvCable) {
		return findByProperty(DESC_PLAN_TV_CABLE, descPlanTvCable);
	}

	public List<McafSku> findByTrial(Object trial) {
		return findByProperty(TRIAL, trial);
	}

	/**
	 * Find all McafSku entities.
	 * 
	 * @return List<McafSku> all McafSku entities
	 */
	@SuppressWarnings("unchecked")
	public List<McafSku> findAll() {
		EntityManagerHelper.log("finding all McafSku instances", Level.INFO,
				null);
		try {
			final String queryString = "select model from McafSku model";
			Query query = getEntityManager().createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

}