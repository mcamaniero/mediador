package com.app.tv.tvp_serviciospaychannelsciudad.dao;

import com.app.dao.EntityManagerHelper;
import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * TvpServiciosPayChannelsCiudad entities. Transaction control of the save(),
 * update() and delete() operations must be handled externally by senders of
 * these methods or must be manually added to each of these methods for data to
 * be persisted to the JPA datastore.
 * 
 * @see com.app.tv.tvp_serviciospaychannelsciudad.dao.TvpServiciosPayChannelsCiudad
 * @author MyEclipse Persistence Tools
 */

public class TvpServiciosPayChannelsCiudadDAO implements
		ITvpServiciosPayChannelsCiudadDAO {
	// property constants
	public static final String CODIGO_TITAN = "codigoTitan";
	public static final String CIUDAD_SERVICIO = "ciudadServicio";
	public static final String TIPO = "tipo";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved
	 * TvpServiciosPayChannelsCiudad entity. All subsequent persist actions of
	 * this entity should use the #update() method. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently saved to the persistence store, i.e., database. This
	 * method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TvpServiciosPayChannelsCiudadDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TvpServiciosPayChannelsCiudad entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TvpServiciosPayChannelsCiudad entity) {
		EntityManagerHelper.log(
				"saving TvpServiciosPayChannelsCiudad instance", Level.INFO,
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
	 * Delete a persistent TvpServiciosPayChannelsCiudad entity. This operation
	 * must be performed within the a database transaction context for the
	 * entity's data to be permanently deleted from the persistence store, i.e.,
	 * database. This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TvpServiciosPayChannelsCiudadDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TvpServiciosPayChannelsCiudad entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TvpServiciosPayChannelsCiudad entity) {
		EntityManagerHelper.log(
				"deleting TvpServiciosPayChannelsCiudad instance", Level.INFO,
				null);
		try {
			entity = getEntityManager().getReference(
					TvpServiciosPayChannelsCiudad.class, entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TvpServiciosPayChannelsCiudad entity and
	 * return it or a copy of it to the sender. A copy of the
	 * TvpServiciosPayChannelsCiudad entity parameter is returned when the JPA
	 * persistence mechanism has not previously been tracking the updated
	 * entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TvpServiciosPayChannelsCiudadDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TvpServiciosPayChannelsCiudad entity to update
	 * @returns TvpServiciosPayChannelsCiudad the persisted
	 *          TvpServiciosPayChannelsCiudad entity instance, may not be the
	 *          same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TvpServiciosPayChannelsCiudad update(
			TvpServiciosPayChannelsCiudad entity) {
		EntityManagerHelper.log(
				"updating TvpServiciosPayChannelsCiudad instance", Level.INFO,
				null);
		try {
			TvpServiciosPayChannelsCiudad result = getEntityManager().merge(
					entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TvpServiciosPayChannelsCiudad findById(Integer id) {
		EntityManagerHelper
				.log("finding TvpServiciosPayChannelsCiudad instance with id: "
						+ id, Level.INFO, null);
		try {
			TvpServiciosPayChannelsCiudad instance = getEntityManager().find(
					TvpServiciosPayChannelsCiudad.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all TvpServiciosPayChannelsCiudad entities with a specific property
	 * value.
	 * 
	 * @param propertyName
	 *            the name of the TvpServiciosPayChannelsCiudad property to
	 *            query
	 * @param value
	 *            the property value to match
	 * @return List<TvpServiciosPayChannelsCiudad> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TvpServiciosPayChannelsCiudad> findByProperty(
			String propertyName, final Object value) {
		EntityManagerHelper.log(
				"finding TvpServiciosPayChannelsCiudad instance with property: "
						+ propertyName + ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from TvpServiciosPayChannelsCiudad model where model."
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

	public List<TvpServiciosPayChannelsCiudad> findByCodigoTitan(
			Object codigoTitan) {
		return findByProperty(CODIGO_TITAN, codigoTitan);
	}

	public List<TvpServiciosPayChannelsCiudad> findByCiudadServicio(
			Object ciudadServicio) {
		return findByProperty(CIUDAD_SERVICIO, ciudadServicio);
	}

	public List<TvpServiciosPayChannelsCiudad> findByTipo(Object tipo) {
		return findByProperty(TIPO, tipo);
	}

	public List<TvpServiciosPayChannelsCiudad> findByCiudadServicioLike(String ciudadServicio,
			int value, String tipo, int value1) {
		// TODO Auto-generated method stub
				try {
					final String queryString = "select model from TvpServiciosPayChannelsCiudad model where model."
							+ tipo  + "= :propertyValue1 "+" and model."
							+ ciudadServicio + "= :propertyValue" + " order by model.codigoTitan"; 
					//System.out.println("query"+queryString);
					Query query = getEntityManager().createQuery(queryString);
					query.setParameter("propertyValue", value);
					query.setParameter("propertyValue1", value1);

					return query.getResultList();
				} catch (RuntimeException re) {
					throw re;
				}
	}
	


	
	
	/**
	 * Find all TvpServiciosPayChannelsCiudad entities.
	 * 
	 * @return List<TvpServiciosPayChannelsCiudad> all
	 *         TvpServiciosPayChannelsCiudad entities
	 */
	@SuppressWarnings("unchecked")
	public List<TvpServiciosPayChannelsCiudad> findAll() {
		EntityManagerHelper.log(
				"finding all TvpServiciosPayChannelsCiudad instances",
				Level.INFO, null);
		try {
			final String queryString = "select model from TvpServiciosPayChannelsCiudad model";
			Query query = getEntityManager().createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

}