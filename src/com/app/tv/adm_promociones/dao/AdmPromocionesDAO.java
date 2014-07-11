package com.app.tv.adm_promociones.dao;

import com.app.dao.EntityManagerHelper;
import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * AdmPromociones entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see com.app.tv.adm_promociones.dao.AdmPromociones
 * @author MyEclipse Persistence Tools
 */

public class AdmPromocionesDAO implements IAdmPromocionesDAO {
	// property constants
	public static final String PROMOCIONID = "promocionid";
	public static final String PROMOCIONACTIVAR = "promocionactivar";
	public static final String CIUDAD = "ciudad";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved AdmPromociones entity.
	 * All subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * AdmPromocionesDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            AdmPromociones entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(AdmPromociones entity) {
		EntityManagerHelper.log("saving AdmPromociones instance", Level.INFO,
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
	 * Delete a persistent AdmPromociones entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * AdmPromocionesDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            AdmPromociones entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(AdmPromociones entity) {
		EntityManagerHelper.log("deleting AdmPromociones instance", Level.INFO,
				null);
		try {
			entity = getEntityManager().getReference(AdmPromociones.class,
					entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved AdmPromociones entity and return it or a copy
	 * of it to the sender. A copy of the AdmPromociones entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = AdmPromocionesDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            AdmPromociones entity to update
	 * @returns AdmPromociones the persisted AdmPromociones entity instance, may
	 *          not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public AdmPromociones update(AdmPromociones entity) {
		EntityManagerHelper.log("updating AdmPromociones instance", Level.INFO,
				null);
		try {
			AdmPromociones result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public AdmPromociones findById(Integer id) {
		EntityManagerHelper.log("finding AdmPromociones instance with id: "
				+ id, Level.INFO, null);
		try {
			AdmPromociones instance = getEntityManager().find(
					AdmPromociones.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all AdmPromociones entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the AdmPromociones property to query
	 * @param value
	 *            the property value to match
	 * @return List<AdmPromociones> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<AdmPromociones> findByProperty(String propertyName,
			final Object value) {
		EntityManagerHelper.log(
				"finding AdmPromociones instance with property: "
						+ propertyName + ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from AdmPromociones model where model."
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
	public List<AdmPromociones> findByPropertyCity(String propertyName,
			final Object value, String propertyName1,
			final Object value1) {
		EntityManagerHelper.log(
				"finding AdmPromociones instance with property: "
						+ propertyName + ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from AdmPromociones model where model."
					+ propertyName + "= :propertyValue and "+ propertyName1 + "= :propertyValue1";
			Query query = getEntityManager().createQuery(queryString);
			query.setParameter("propertyValue", value);
			query.setParameter("propertyValue1", value1);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find by property name failed",
					Level.SEVERE, re);
			throw re;
		}
	}
	

	public List<AdmPromociones> findByPromocionid(Object promocionid) {
		return findByProperty(PROMOCIONID, promocionid);
	}

	public List<AdmPromociones> findByPromocionactivar(Object promocionactivar) {
		return findByProperty(PROMOCIONACTIVAR, promocionactivar);
	}

	public List<AdmPromociones> findByCiudad(Object ciudad) {
		return findByProperty(CIUDAD, ciudad);
	}

	/**
	 * Find all AdmPromociones entities.
	 * 
	 * @return List<AdmPromociones> all AdmPromociones entities
	 */
	@SuppressWarnings("unchecked")
	public List<AdmPromociones> findAll() {
		EntityManagerHelper.log("finding all AdmPromociones instances",
				Level.INFO, null);
		try {
			final String queryString = "select model from AdmPromociones model";
			Query query = getEntityManager().createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

	public List<AdmPromociones> findByPromocion(int tipoPromocion) {
		EntityManagerHelper.log("finding all AdmPromociones instances",
				Level.INFO, null);
		try {
			final String queryString = "select model from AdmPromociones model where model.promocionid="+tipoPromocion;
			Query query = getEntityManager().createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}
    public List<AdmPromociones> findByPromocionCity(int tipoPromocion,int ciudad) {
        EntityManagerHelper.log("finding all AdmPromociones instances",
                                        Level.INFO, null);
        try {
                        final String queryString = "select model from AdmPromociones model where model.promocionid="+tipoPromocion+" and model.ciudad="+ciudad;
                        System.out.println(queryString);
                        Query query = getEntityManager().createQuery(queryString);
                        return query.getResultList();
        } catch (RuntimeException re) {
                        EntityManagerHelper.log("find all failed", Level.SEVERE, re);
                        throw re;
        }
}


}