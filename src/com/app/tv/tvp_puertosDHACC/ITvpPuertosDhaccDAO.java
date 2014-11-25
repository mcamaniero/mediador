package com.app.tv.tvp_puertosDHACC;

import java.util.List;

/**
 * Interface for TvpPuertosDhaccDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITvpPuertosDhaccDAO {
	/**
	 * Perform an initial save of a previously unsaved TvpPuertosDhacc entity.
	 * All subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITvpPuertosDhaccDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TvpPuertosDhacc entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TvpPuertosDhacc entity);

	/**
	 * Delete a persistent TvpPuertosDhacc entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITvpPuertosDhaccDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TvpPuertosDhacc entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TvpPuertosDhacc entity);

	/**
	 * Persist a previously saved TvpPuertosDhacc entity and return it or a copy
	 * of it to the sender. A copy of the TvpPuertosDhacc entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITvpPuertosDhaccDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TvpPuertosDhacc entity to update
	 * @returns TvpPuertosDhacc the persisted TvpPuertosDhacc entity instance,
	 *          may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TvpPuertosDhacc update(TvpPuertosDhacc entity);

	public TvpPuertosDhacc findById(Integer id);

	/**
	 * Find all TvpPuertosDhacc entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TvpPuertosDhacc property to query
	 * @param value
	 *            the property value to match
	 * @return List<TvpPuertosDhacc> found by query
	 */
	public List<TvpPuertosDhacc> findByProperty(String propertyName,
			Object value);

	public List<TvpPuertosDhacc> findByPuertodesde(Object puertodesde);

	public List<TvpPuertosDhacc> findByPuertohasta(Object puertohasta);

	public List<TvpPuertosDhacc> findBySolouno(Object solouno);

	/**
	 * Find all TvpPuertosDhacc entities.
	 * 
	 * @return List<TvpPuertosDhacc> all TvpPuertosDhacc entities
	 */
	public List<TvpPuertosDhacc> findAll();
}