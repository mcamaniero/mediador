package com.app.dao.conciliacion;

import com.app.dao.EntityManagerHelper;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * AdmConciliacion entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see com.app.dao.conciliacion.AdmConciliacion
 * @author MyEclipse Persistence Tools
 */

public class AdmConciliacionDAO {
	// property constants
	public static final String CIUDAD = "ciudad";
	public static final String CUENTA = "cuenta";
	public static final String IDPRODUCTO = "idproducto";
	public static final String ADDRESS_TITAN = "addressTitan";
	public static final String TMPCUENTA = "tmpcuenta";
	public static final String TIPO = "tipo";
	public static final String EXISTE = "existe";
	public static final String COMPLETO = "completo";
	public static final String ESTADO_IW = "estadoIw";
	public static final String ESTADO_TITAN = "estadoTitan";
	public static final String ADDRESS_IW = "addressIw";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved AdmConciliacion entity.
	 * All subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * AdmConciliacionDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            AdmConciliacion entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(AdmConciliacion entity) {
		EntityManagerHelper.log("saving AdmConciliacion instance", Level.INFO,
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
	 * Delete a persistent AdmConciliacion entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * AdmConciliacionDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            AdmConciliacion entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(AdmConciliacion entity) {
		EntityManagerHelper.log("deleting AdmConciliacion instance",
				Level.INFO, null);
		try {
			entity = getEntityManager().getReference(AdmConciliacion.class,
					entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved AdmConciliacion entity and return it or a copy
	 * of it to the sender. A copy of the AdmConciliacion entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = AdmConciliacionDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            AdmConciliacion entity to update
	 * @returns AdmConciliacion the persisted AdmConciliacion entity instance,
	 *          may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public AdmConciliacion update(AdmConciliacion entity) {
		EntityManagerHelper.log("updating AdmConciliacion instance",
				Level.INFO, null);
		try {
			AdmConciliacion result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public AdmConciliacion findById(Integer id) {
		EntityManagerHelper.log("finding AdmConciliacion instance with id: "
				+ id, Level.INFO, null);
		try {
			AdmConciliacion instance = getEntityManager().find(
					AdmConciliacion.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all AdmConciliacion entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the AdmConciliacion property to query
	 * @param value
	 *            the property value to match
	 * @return List<AdmConciliacion> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<AdmConciliacion> findByProperty(
			String propertyName1, final Object value1,
			String propertyName2, final Object value2,
			String propertyName3, final Object value3
													) {
		try {
			final String queryString = "select model from AdmConciliacion model where model."
					+ propertyName1 + "= :propertyValue1 " +
							"and model."+ propertyName2 + "= :propertyValue2 "+
							"and model."+ propertyName3 + "= :propertyValue3";
			System.out.println(value1.toString());
			Query query = getEntityManager().createQuery(queryString);
			query.setParameter("propertyValue1", new Integer(value1.toString()));
			query.setParameter("propertyValue2", value2.toString());
			query.setParameter("propertyValue3", value3.toString());
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find by property name failed",
					Level.SEVERE, re);
			throw re;
		}
	}

	
	/**
	 * Find all AdmConciliacion entities.
	 * 
	 * @return List<AdmConciliacion> all AdmConciliacion entities
	 */
	@SuppressWarnings("unchecked")
	public List<AdmConciliacion> findAll() {
		EntityManagerHelper.log("finding all AdmConciliacion instances",
				Level.INFO, null);
		try {
			final String queryString = "select model from AdmConciliacion model";
			Query query = getEntityManager().createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

	public List<Vector> findAllView() {
		try {
			final String queryString = "select ciudad, cuenta from distinctContrato";
			Query query = getEntityManager().createNativeQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

}