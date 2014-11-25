package com.app.dao.conciliacion.cms;

import com.app.dao.EntityManagerHelper;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * AdmConciliacionCm entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see com.app.dao.conciliacion.cms.AdmConciliacionCms
 * @author MyEclipse Persistence Tools
 */

public class AdmConciliacionCmsDAO implements IAdmConciliacionCmsDAO {
	// property constants
	public static final String CIUDAD = "ciudad";
	public static final String CLIENTECRM = "clientecrm";
	public static final String IDPRODUCTO = "idproducto";
	public static final String MAC_T = "macT";
	public static final String SERVICEPACKAGE_T = "servicepackageT";
	public static final String CPS_T = "cpsT";
	public static final String ESTADO_T = "estadoT";
	public static final String MAC_IW = "macIw";
	public static final String SERVICEPACKAGE_IW = "servicepackageIw";
	public static final String CPS_IW = "cpsIw";
	public static final String ESTADO_IW = "estadoIw";
	public static final String SESION = "sesion";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved AdmConciliacionCm entity.
	 * All subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * AdmConciliacionCmDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            AdmConciliacionCm entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(AdmConciliacionCms entity) {
		try {
			getEntityManager().persist(entity);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent AdmConciliacionCms entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * AdmConciliacionCmDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            AdmConciliacionCms entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(AdmConciliacionCms entity) {
		EntityManagerHelper.log("deleting AdmConciliacionCms instance",
				Level.INFO, null);
		try {
			entity = getEntityManager().getReference(AdmConciliacionCms.class,
					entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved AdmConciliacionCms entity and return it or a
	 * copy of it to the sender. A copy of the AdmConciliacionCms entity
	 * parameter is returned when the JPA persistence mechanism has not
	 * previously been tracking the updated entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently saved to the persistence store, i.e., database. This
	 * method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = AdmConciliacionCmDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            AdmConciliacionCms entity to update
	 * @returns AdmConciliacionCms the persisted AdmConciliacionCms entity
	 *          instance, may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public AdmConciliacionCms update(AdmConciliacionCms entity) {
		try {
			AdmConciliacionCms result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful: "+entity.getClientecrm()+" "+entity.getIdproducto(), Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public AdmConciliacionCms findById(Integer id) {
		EntityManagerHelper.log("finding AdmConciliacionCms instance with id: "
				+ id, Level.INFO, null);
		try {
			AdmConciliacionCms instance = getEntityManager().find(
					AdmConciliacionCms.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all AdmConciliacionCms entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the AdmConciliacionCms property to query
	 * @param value
	 *            the property value to match
	 * @return List<AdmConciliacionCms> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<AdmConciliacionCms> findByProperty(String propertyName,
			final Object value) {
		EntityManagerHelper.log(
				"finding AdmConciliacionCms instance with property: "
						+ propertyName + ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from AdmConciliacionCms model where model."
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

	public List<AdmConciliacionCms> findByCiudad(Object ciudad) {
		return findByProperty(CIUDAD, ciudad);
	}

	public List<AdmConciliacionCms> findByClientecrm(Object clientecrm) {
		return findByProperty(CLIENTECRM, clientecrm);
	}

	public List<AdmConciliacionCms> findByIdproducto(Object idproducto) {
		return findByProperty(IDPRODUCTO, idproducto);
	}

	public List<AdmConciliacionCms> findByMacT(Object macT) {
		return findByProperty(MAC_T, macT);
	}

	public List<AdmConciliacionCms> findByServicepackageT(Object servicepackageT) {
		return findByProperty(SERVICEPACKAGE_T, servicepackageT);
	}

	public List<AdmConciliacionCms> findByCpsT(Object cpsT) {
		return findByProperty(CPS_T, cpsT);
	}

	public List<AdmConciliacionCms> findByEstadoT(Object estadoT) {
		return findByProperty(ESTADO_T, estadoT);
	}

	public List<AdmConciliacionCms> findByMacIw(Object macIw) {
		return findByProperty(MAC_IW, macIw);
	}

	public List<AdmConciliacionCms> findByServicepackageIw(
			Object servicepackageIw) {
		return findByProperty(SERVICEPACKAGE_IW, servicepackageIw);
	}

	public List<AdmConciliacionCms> findByCpsIw(Object cpsIw) {
		return findByProperty(CPS_IW, cpsIw);
	}

	public List<AdmConciliacionCms> findByEstadoIw(Object estadoIw) {
		return findByProperty(ESTADO_IW, estadoIw);
	}

	public List<AdmConciliacionCms> findBySesion(Object sesion) {
		return findByProperty(SESION, sesion);
	}

	/**
	 * Find all AdmConciliacionCms entities.
	 * 
	 * @return List<AdmConciliacionCms> all AdmConciliacionCms entities
	 */
	@SuppressWarnings("unchecked")
	public List<AdmConciliacionCms> findAll() {
		EntityManagerHelper.log("finding all AdmConciliacionCms instances",
				Level.INFO, null);
		try {
			final String queryString = "select model from AdmConciliacionCms model";
			Query query = getEntityManager().createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}
	
	
	public List<AdmConciliacionCms> findByProperty(String propertyName, final Object value,
			String propertyName2, final Object value2,
			String propertyName3, final Object value3
	) {
		try {
			final String queryString = "select model from AdmConciliacionCms model where model." 
				+ propertyName + "= :propertyValue and model."+propertyName2+"= :propertyValue2 "
				+ "and model."+propertyName3 + "= :propertyValue3";
			
			Query query = getEntityManager().createQuery(queryString);
			query.setParameter("propertyValue", value);
			query.setParameter("propertyValue2", value2);
			query.setParameter("propertyValue3", value3);
			
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find by property name failed", Level.SEVERE, re);
			throw re;
		}
	}

	
	public List<Vector> findAllViewCM() {
		try {
			final String queryString = "SELECT ciudad, clientecrm FROM distinctContratoCms";
			Query query = getEntityManager().createNativeQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

	public List<Vector> findAllViewTelefonia() {
		try {
			final String queryString = "SELECT ciudad, clientecrm, tipo FROM distinctContratoTelf";
			Query query = getEntityManager().createNativeQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

}