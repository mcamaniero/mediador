package com.app.tv.tvp_refreshmasivotitan.dao;

import java.util.List;

/**
 * Interface for RefreshMasivoTitanDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface IRefreshMasivoTitanDAO {
	/**
	 * Perform an initial save of a previously unsaved RefreshMasivoTitan
	 * entity. All subsequent persist actions of this entity should use the
	 * #update() method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IRefreshMasivoTitanDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            RefreshMasivoTitan entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(RefreshMasivoTitan entity);

	/**
	 * Delete a persistent RefreshMasivoTitan entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IRefreshMasivoTitanDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            RefreshMasivoTitan entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(RefreshMasivoTitan entity);

	/**
	 * Persist a previously saved RefreshMasivoTitan entity and return it or a
	 * copy of it to the sender. A copy of the RefreshMasivoTitan entity
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
	 * entity = IRefreshMasivoTitanDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            RefreshMasivoTitan entity to update
	 * @returns RefreshMasivoTitan the persisted RefreshMasivoTitan entity
	 *          instance, may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public RefreshMasivoTitan update(RefreshMasivoTitan entity);

	public RefreshMasivoTitan findById(Integer id);

	/**
	 * Find all RefreshMasivoTitan entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the RefreshMasivoTitan property to query
	 * @param value
	 *            the property value to match
	 * @return List<RefreshMasivoTitan> found by query
	 */
	public List<RefreshMasivoTitan> findByProperty(String propertyName,
			Object value);

	public List<RefreshMasivoTitan> findByCpartyIdaccount(Object cpartyIdaccount);

	public List<RefreshMasivoTitan> findByApAdrdress(Object apAdrdress);

	public List<RefreshMasivoTitan> findByName(Object name);

	/**
	 * Find all RefreshMasivoTitan entities.
	 * 
	 * @return List<RefreshMasivoTitan> all RefreshMasivoTitan entities
	 */
	public List<RefreshMasivoTitan> findAll();
}