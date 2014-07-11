package com.app.tv.tvp_Dalvi.dao;

import java.util.List;

/**
 * Interface for TvpDalviDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITvpDalviDAO {
	/**
	 * Perform an initial save of a previously unsaved TvpDalvi entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITvpDalviDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TvpDalvi entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TvpDalvi entity);

	/**
	 * Delete a persistent TvpDalvi entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITvpDalviDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TvpDalvi entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TvpDalvi entity);

	/**
	 * Persist a previously saved TvpDalvi entity and return it or a copy of it
	 * to the sender. A copy of the TvpDalvi entity parameter is returned when
	 * the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITvpDalviDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TvpDalvi entity to update
	 * @returns TvpDalvi the persisted TvpDalvi entity instance, may not be the
	 *          same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TvpDalvi update(TvpDalvi entity);

	public TvpDalvi findById(Long id);

	/**
	 * Find all TvpDalvi entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TvpDalvi property to query
	 * @param value
	 *            the property value to match
	 * @return List<TvpDalvi> found by query
	 */
	public List<TvpDalvi> findByProperty(String propertyName, Object value);

	public List<TvpDalvi> findByComando(Object comando);

	public List<TvpDalvi> findByEstado(Object estado);

	public List<TvpDalvi> findByTrama(Object trama);

	public List<TvpDalvi> findByRespuesta(Object respuesta);

	public List<TvpDalvi> findByCiudad(Object ciudad);

	/**
	 * Find all TvpDalvi entities.
	 * 
	 * @return List<TvpDalvi> all TvpDalvi entities
	 */
	public List<TvpDalvi> findAll();
}