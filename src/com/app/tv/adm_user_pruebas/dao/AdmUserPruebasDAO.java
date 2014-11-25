package com.app.tv.adm_user_pruebas.dao;

import com.app.dao.EntityManagerHelper;
import com.app.tv.adm_contratos.dao.AdmContratos;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * AdmUserPruebas entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see com.app.tv.adm_user_pruebas.dao.AdmUserPruebas
 * @author MyEclipse Persistence Tools
 */

public class AdmUserPruebasDAO implements IAdmUserPruebasDAO {
	// property constants
	public static final String IDUSUARIO = "idusuario";
	public static final String STRUSUARRIO = "strusuarrio";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved AdmUserPruebas entity.
	 * All subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * AdmUserPruebasDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            AdmUserPruebas entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(AdmUserPruebas entity) {
		EntityManagerHelper.log("saving AdmUserPruebas instance", Level.INFO,
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
	 * Delete a persistent AdmUserPruebas entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * AdmUserPruebasDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            AdmUserPruebas entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(AdmUserPruebas entity) {
		EntityManagerHelper.log("deleting AdmUserPruebas instance", Level.INFO,
				null);
		try {
			entity = getEntityManager().getReference(AdmUserPruebas.class,
					entity.getIduser());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved AdmUserPruebas entity and return it or a copy
	 * of it to the sender. A copy of the AdmUserPruebas entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = AdmUserPruebasDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            AdmUserPruebas entity to update
	 * @returns AdmUserPruebas the persisted AdmUserPruebas entity instance, may
	 *          not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public AdmUserPruebas update(AdmUserPruebas entity) {
		EntityManagerHelper.log("updating AdmUserPruebas instance", Level.INFO,
				null);
		try {
			AdmUserPruebas result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public AdmUserPruebas findById(Integer id) {
		EntityManagerHelper.log("finding AdmUserPruebas instance with id: "
				+ id, Level.INFO, null);
		try {
			AdmUserPruebas instance = getEntityManager().find(
					AdmUserPruebas.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all AdmUserPruebas entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the AdmUserPruebas property to query
	 * @param value
	 *            the property value to match
	 * @return List<AdmUserPruebas> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<AdmUserPruebas> findByProperty(String propertyName,
			final Object value) {
		EntityManagerHelper.log(
				"finding AdmUserPruebas instance with property: "
						+ propertyName + ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from AdmUserPruebas model where model."
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

	public List<AdmUserPruebas> findByIdusuario(Object idusuario) {
		return findByProperty(IDUSUARIO, idusuario);
	}

	public List<AdmUserPruebas> findByStrusuarrio(Object strusuarrio) {
		return findByProperty(STRUSUARRIO, strusuarrio);
	}

	/**
	 * Find all AdmUserPruebas entities.
	 * 
	 * @return List<AdmUserPruebas> all AdmUserPruebas entities
	 */
	@SuppressWarnings("unchecked")
	public List<AdmUserPruebas> findAll() {
		EntityManagerHelper.log("finding all AdmUserPruebas instances",
				Level.INFO, null);
		try {
			final String queryString = "select model from AdmUserPruebas model";
			Query query = getEntityManager().createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<AdmUserPruebas> count(int cparties) {
		try {
			final String queryString = "select count(model) from AdmUserPruebas model where model.idusuario="
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

}