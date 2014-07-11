package com.app.tv.tvp_serviciospaychannelsciudad.dao;

import java.util.List;

/**
 * Interface for TvpServiciosPayChannelsCiudadDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITvpServiciosPayChannelsCiudadDAO {
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
	 * ITvpServiciosPayChannelsCiudadDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TvpServiciosPayChannelsCiudad entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TvpServiciosPayChannelsCiudad entity);

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
	 * ITvpServiciosPayChannelsCiudadDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TvpServiciosPayChannelsCiudad entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TvpServiciosPayChannelsCiudad entity);

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
	 * entity = ITvpServiciosPayChannelsCiudadDAO.update(entity);
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
			TvpServiciosPayChannelsCiudad entity);

	public TvpServiciosPayChannelsCiudad findById(Integer id);

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
	public List<TvpServiciosPayChannelsCiudad> findByProperty(
			String propertyName, Object value);

	public List<TvpServiciosPayChannelsCiudad> findByCodigoTitan(
			Object codigoTitan);

	public List<TvpServiciosPayChannelsCiudad> findByCiudadServicio(
			Object ciudadServicio);

	public List<TvpServiciosPayChannelsCiudad> findByTipo(Object tipo);

	/**
	 * Find all TvpServiciosPayChannelsCiudad entities.
	 * 
	 * @return List<TvpServiciosPayChannelsCiudad> all
	 *         TvpServiciosPayChannelsCiudad entities
	 */
	public List<TvpServiciosPayChannelsCiudad> findAll();
}