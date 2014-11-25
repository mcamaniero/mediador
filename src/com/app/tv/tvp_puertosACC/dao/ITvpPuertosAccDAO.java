package com.app.tv.tvp_puertosACC.dao;

import java.util.List;

/**
 * Interface for TvpPuertosAccDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITvpPuertosAccDAO {
	/**
	 * Perform an initial save of a previously unsaved TvpPuertosAcc entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITvpPuertosAccDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TvpPuertosAcc entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TvpPuertosAcc entity);

	/**
	 * Delete a persistent TvpPuertosAcc entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITvpPuertosAccDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TvpPuertosAcc entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TvpPuertosAcc entity);

	/**
	 * Persist a previously saved TvpPuertosAcc entity and return it or a copy
	 * of it to the sender. A copy of the TvpPuertosAcc entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITvpPuertosAccDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TvpPuertosAcc entity to update
	 * @returns TvpPuertosAcc the persisted TvpPuertosAcc entity instance, may
	 *          not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TvpPuertosAcc update(TvpPuertosAcc entity);

	public TvpPuertosAcc findById(Integer id);

	/**
	 * Find all TvpPuertosAcc entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TvpPuertosAcc property to query
	 * @param value
	 *            the property value to match
	 * @return List<TvpPuertosAcc> found by query
	 */
	public List<TvpPuertosAcc> findByProperty(String propertyName, Object value);

	public List<TvpPuertosAcc> findByPuertoAcc(Object puertoAcc);

	/**
	 * Find all TvpPuertosAcc entities.
	 * 
	 * @return List<TvpPuertosAcc> all TvpPuertosAcc entities
	 */
	public List<TvpPuertosAcc> findAll();
}