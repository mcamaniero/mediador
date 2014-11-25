package com.app.tv.adm_errorestvp.dao;

import java.util.List;

/**
 * Interface for AdmErrorestvpDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface IAdmErrorestvpDAO {
	/**
	 * Perform an initial save of a previously unsaved AdmErrorestvp entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IAdmErrorestvpDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            AdmErrorestvp entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(AdmErrorestvp entity);

	/**
	 * Delete a persistent AdmErrorestvp entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IAdmErrorestvpDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            AdmErrorestvp entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(AdmErrorestvp entity);

	/**
	 * Persist a previously saved AdmErrorestvp entity and return it or a copy
	 * of it to the sender. A copy of the AdmErrorestvp entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = IAdmErrorestvpDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            AdmErrorestvp entity to update
	 * @returns AdmErrorestvp the persisted AdmErrorestvp entity instance, may
	 *          not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public AdmErrorestvp update(AdmErrorestvp entity);

	public AdmErrorestvp findById(Integer id);

	/**
	 * Find all AdmErrorestvp entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the AdmErrorestvp property to query
	 * @param value
	 *            the property value to match
	 * @return List<AdmErrorestvp> found by query
	 */
	public List<AdmErrorestvp> findByProperty(String propertyName, Object value);

	public List<AdmErrorestvp> findByStrErrorDac(Object strErrorDac);

	public List<AdmErrorestvp> findByStrErrorAcc(Object strErrorAcc);

	public List<AdmErrorestvp> findByStrErrorDalvi(Object strErrorDalvi);

	public List<AdmErrorestvp> findByStrError(Object strError);

	public List<AdmErrorestvp> findByStrErrorString(Object strErrorString);

	/**
	 * Find all AdmErrorestvp entities.
	 * 
	 * @return List<AdmErrorestvp> all AdmErrorestvp entities
	 */
	public List<AdmErrorestvp> findAll();
}