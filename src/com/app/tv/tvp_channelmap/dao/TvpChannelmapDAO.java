package com.app.tv.tvp_channelmap.dao;

import com.app.dao.EntityManagerHelper;
import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * TvpChannelmap entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see com.app.tv.tvp_channelmap.dao.TvpChannelmap
 * @author MyEclipse Persistence Tools
 */

public class TvpChannelmapDAO implements ITvpChannelmapDAO {
	// property constants
	public static final String CHANNEL_MAP_ID = "channelMapId";
	public static final String SERVICIO_ID = "servicioId";
	public static final String PAQUETE_ID = "paqueteId";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TvpChannelmap entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TvpChannelmapDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TvpChannelmap entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TvpChannelmap entity) {
		EntityManagerHelper.log("saving TvpChannelmap instance", Level.INFO,
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
	 * Delete a persistent TvpChannelmap entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TvpChannelmapDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TvpChannelmap entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TvpChannelmap entity) {
		EntityManagerHelper.log("deleting TvpChannelmap instance", Level.INFO,
				null);
		try {
			entity = getEntityManager().getReference(TvpChannelmap.class,
					entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TvpChannelmap entity and return it or a copy
	 * of it to the sender. A copy of the TvpChannelmap entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TvpChannelmapDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TvpChannelmap entity to update
	 * @returns TvpChannelmap the persisted TvpChannelmap entity instance, may
	 *          not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TvpChannelmap update(TvpChannelmap entity) {
		EntityManagerHelper.log("updating TvpChannelmap instance", Level.INFO,
				null);
		try {
			TvpChannelmap result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TvpChannelmap findById(Integer id) {
		EntityManagerHelper.log(
				"finding TvpChannelmap instance with id: " + id, Level.INFO,
				null);
		try {
			TvpChannelmap instance = getEntityManager().find(
					TvpChannelmap.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all TvpChannelmap entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TvpChannelmap property to query
	 * @param value
	 *            the property value to match
	 * @return List<TvpChannelmap> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TvpChannelmap> findByProperty(String propertyName,
			final Object value) {
		EntityManagerHelper.log(
				"finding TvpChannelmap instance with property: " + propertyName
						+ ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from TvpChannelmap model where model."
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

	public List<TvpChannelmap> findByChannelMapId(Object channelMapId) {
		return findByProperty(CHANNEL_MAP_ID, channelMapId);
	}

	public List<TvpChannelmap> findByServicioId(Object servicioId) {
		return findByProperty(SERVICIO_ID, servicioId);
	}

	public List<TvpChannelmap> findByServicePay(String propertyName,
			int value, String propertyName1, String value1) {
		// TODO Auto-generated method stub
				try { 
					
							final String queryString = "select model from TvpChannelmap model where model."
									+ propertyName + "= :propertyValue" + " and model." + propertyName1 
									+ "= :propertyValue1";					
					
							//+ " and model." + propertyName2 + "= :propertyValue2" 
							//+ " and model."+propertyName3 + "= :propertyValue3" ;
							//+ " and model.codInt = :propertyValue3" ;
				
					System.out.println(value+"-"+propertyName1+value1+"String "+queryString);
					System.out.println("Entro dasda"+value);
					System.out.println("Entro dasdat"+value1);
					//String propertyValue3 = "codInt";
					Query query = getEntityManager().createQuery(queryString);
					query.setParameter("propertyValue", value);
					query.setParameter("propertyValue1", value1);
					//query.setParameter("propertyValue2", value2);
					//query.setParameter("propertyValue3", value3);
					//query.setParameter("propertyValue3", 1);
					return query.getResultList();
				} catch (RuntimeException re) {
					throw re;
				}
   		
	}

	
	
	public List<TvpChannelmap> findByPaqueteId(Object paqueteId) {
		return findByProperty(PAQUETE_ID, paqueteId);
	}

	/**
	 * Find all TvpChannelmap entities.
	 * 
	 * @return List<TvpChannelmap> all TvpChannelmap entities
	 */
	@SuppressWarnings("unchecked")
	public List<TvpChannelmap> findAll() {
		EntityManagerHelper.log("finding all TvpChannelmap instances",
				Level.INFO, null);
		try {
			final String queryString = "select model from TvpChannelmap model";
			Query query = getEntityManager().createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

}