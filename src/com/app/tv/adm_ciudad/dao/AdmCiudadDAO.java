package com.app.tv.adm_ciudad.dao;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.app.dao.EntityManagerHelper;

/**
 * A data access object (DAO) providing persistence and search support for
 * AdmCiudad entities. Transaction control of the save(), update() and delete()
 * operations must be handled externally by senders of these methods or must be
 * manually added to each of these methods for data to be persisted to the JPA
 * datastore.
 * 
 * @see com.app.tv.adm_ciudad.dao.AdmCiudad
 * @author MyEclipse Persistence Tools
 */

public class AdmCiudadDAO {
	// property constants
	public static final String CIUDAD_NOMBRE = "ciudadNombre";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved AdmCiudad entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * AdmCiudadDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            AdmCiudad entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(AdmCiudad entity) {
		EntityManagerHelper.log("saving AdmCiudad instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent AdmCiudad entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * AdmCiudadDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            AdmCiudad entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(AdmCiudad entity) {
		EntityManagerHelper
				.log("deleting AdmCiudad instance", Level.INFO, null);
		try {
			entity = getEntityManager().getReference(AdmCiudad.class,
					entity.getCiudadId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved AdmCiudad entity and return it or a copy of it
	 * to the sender. A copy of the AdmCiudad entity parameter is returned when
	 * the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = AdmCiudadDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            AdmCiudad entity to update
	 * @returns AdmCiudad the persisted AdmCiudad entity instance, may not be
	 *          the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public AdmCiudad update(AdmCiudad entity) {
		EntityManagerHelper
				.log("updating AdmCiudad instance", Level.INFO, null);
		try {
			AdmCiudad result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public AdmCiudad findById(Integer id) {
		EntityManagerHelper.log("finding AdmCiudad instance with id: " + id,
				Level.INFO, null);
		try {
			AdmCiudad instance = getEntityManager().find(AdmCiudad.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all AdmCiudad entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the AdmCiudad property to query
	 * @param value
	 *            the property value to match
	 * @return List<AdmCiudad> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<AdmCiudad> findByProperty(String propertyName,
			final Object value) {
		EntityManagerHelper.log("finding AdmCiudad instance with property: "
				+ propertyName + ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from AdmCiudad model where model."
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

	public List<AdmCiudad> findByCiudadNombre(Object ciudadNombre) {
		return findByProperty(CIUDAD_NOMBRE, ciudadNombre);
	}

	/**
	 * Find all AdmCiudad entities.
	 * 
	 * @return List<AdmCiudad> all AdmCiudad entities
	 */
	@SuppressWarnings("unchecked")
	public List<AdmCiudad> findAll() {
		EntityManagerHelper.log("finding all AdmCiudad instances", Level.INFO,
				null);
		try {
			final String queryString = "select model from AdmCiudad model";
			Query query = getEntityManager().createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

}