package com.app.tv.tvp_channelmap.dao;

import java.util.List;

/**
 * Interface for TvpChannelmapDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITvpChannelmapDAO {
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
	 * ITvpChannelmapDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TvpChannelmap entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TvpChannelmap entity);

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
	 * ITvpChannelmapDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TvpChannelmap entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TvpChannelmap entity);

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
	 * entity = ITvpChannelmapDAO.update(entity);
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
	public TvpChannelmap update(TvpChannelmap entity);

	public TvpChannelmap findById(Integer id);

	/**
	 * Find all TvpChannelmap entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TvpChannelmap property to query
	 * @param value
	 *            the property value to match
	 * @return List<TvpChannelmap> found by query
	 */
	public List<TvpChannelmap> findByProperty(String propertyName, Object value);

	public List<TvpChannelmap> findByChannelMapId(Object channelMapId);

	public List<TvpChannelmap> findByServicioId(Object servicioId);

	public List<TvpChannelmap> findByPaqueteId(Object paqueteId);

	/**
	 * Find all TvpChannelmap entities.
	 * 
	 * @return List<TvpChannelmap> all TvpChannelmap entities
	 */
	public List<TvpChannelmap> findAll();
}