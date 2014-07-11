package com.app.tv.adm_errores.dao;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.app.dao.EntityManagerHelper;

/**
 * A data access object (DAO) providing persistence and search support for
 * AdmErrores entities. Transaction control of the save(), update() and delete()
 * operations must be handled externally by senders of these methods or must be
 * manually added to each of these methods for data to be persisted to the JPA
 * datastore.
 * 
 * @see com.app.tv.adm_errores.dao.AdmErrores
 * @author MyEclipse Persistence Tools
 */

public class AdmErroresDAO {
	// property constants
	public static final String INT_CODIGO_NEGOCIO = "intCodigoNegocio";
	public static final String STR_MENSAJE = "strMensaje";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved AdmErrores entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * AdmErroresDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            AdmErrores entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(AdmErrores entity) {
		EntityManagerHelper.log("saving AdmErrores instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent AdmErrores entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * AdmErroresDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            AdmErrores entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(AdmErrores entity) {
		EntityManagerHelper.log("deleting AdmErrores instance", Level.INFO,
				null);
		try {
			entity = getEntityManager().getReference(AdmErrores.class,
					entity.getErrorId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved AdmErrores entity and return it or a copy of
	 * it to the sender. A copy of the AdmErrores entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = AdmErroresDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            AdmErrores entity to update
	 * @returns AdmErrores the persisted AdmErrores entity instance, may not be
	 *          the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public AdmErrores update(AdmErrores entity) {
		EntityManagerHelper.log("updating AdmErrores instance", Level.INFO,
				null);
		try {
			AdmErrores result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public AdmErrores findById(String id) {
		EntityManagerHelper.log("finding AdmErrores instance with id: " + id,
				Level.INFO, null);
		try {
			AdmErrores instance = getEntityManager().find(AdmErrores.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all AdmErrores entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the AdmErrores property to query
	 * @param value
	 *            the property value to match
	 * @return List<AdmErrores> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<AdmErrores> findByProperty(String propertyName,
			final Object value) {
		EntityManagerHelper.log("finding AdmErrores instance with property: "
				+ propertyName + ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from AdmErrores model where model."
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

	public List<AdmErrores> findByIntCodigoNegocio(Object intCodigoNegocio) {
		return findByProperty(INT_CODIGO_NEGOCIO, intCodigoNegocio);
	}

	public List<AdmErrores> findByStrMensaje(Object strMensaje) {
		return findByProperty(STR_MENSAJE, strMensaje);
	}

	/**
	 * Find all AdmErrores entities.
	 * 
	 * @return List<AdmErrores> all AdmErrores entities
	 */
	@SuppressWarnings("unchecked")
	public List<AdmErrores> findAll() {
		EntityManagerHelper.log("finding all AdmErrores instances", Level.INFO,
				null);
		try {
			final String queryString = "select model from AdmErrores model";
			Query query = getEntityManager().createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

}