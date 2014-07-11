package com.app.tv.adm_contratos.dao;

import java.util.List;

/**
 * Interface for AdmContratosDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface IAdmContratosDAO {
	/**
	 * Perform an initial save of a previously unsaved AdmContratos entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IAdmContratosDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            AdmContratos entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(AdmContratos entity);

	/**
	 * Delete a persistent AdmContratos entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IAdmContratosDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            AdmContratos entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(AdmContratos entity);

	/**
	 * Persist a previously saved AdmContratos entity and return it or a copy of
	 * it to the sender. A copy of the AdmContratos entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = IAdmContratosDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            AdmContratos entity to update
	 * @returns AdmContratos the persisted AdmContratos entity instance, may not
	 *          be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public AdmContratos update(AdmContratos entity);

	public AdmContratos findById(Integer id);

	/**
	 * Find all AdmContratos entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the AdmContratos property to query
	 * @param value
	 *            the property value to match
	 * @return List<AdmContratos> found by query
	 */
	public List<AdmContratos> findByProperty(String propertyName, Object value);

	public List<AdmContratos> findByCparty(Object cparty);

	/**
	 * Find all AdmContratos entities.
	 * 
	 * @return List<AdmContratos> all AdmContratos entities
	 */
	public List<AdmContratos> findAll();
}