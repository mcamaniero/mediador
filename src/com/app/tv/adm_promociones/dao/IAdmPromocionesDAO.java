package com.app.tv.adm_promociones.dao;

import java.util.List;

/**
 * Interface for AdmPromocionesDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface IAdmPromocionesDAO {
	/**
	 * Perform an initial save of a previously unsaved AdmPromociones entity.
	 * All subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IAdmPromocionesDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            AdmPromociones entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(AdmPromociones entity);

	/**
	 * Delete a persistent AdmPromociones entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IAdmPromocionesDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            AdmPromociones entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(AdmPromociones entity);

	/**
	 * Persist a previously saved AdmPromociones entity and return it or a copy
	 * of it to the sender. A copy of the AdmPromociones entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = IAdmPromocionesDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            AdmPromociones entity to update
	 * @returns AdmPromociones the persisted AdmPromociones entity instance, may
	 *          not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public AdmPromociones update(AdmPromociones entity);

	public AdmPromociones findById(Integer id);

	/**
	 * Find all AdmPromociones entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the AdmPromociones property to query
	 * @param value
	 *            the property value to match
	 * @return List<AdmPromociones> found by query
	 */
	public List<AdmPromociones> findByProperty(String propertyName, Object value);

	public List<AdmPromociones> findByPromocionid(Object promocionid);

	public List<AdmPromociones> findByPromocionactivar(Object promocionactivar);

	public List<AdmPromociones> findByCiudad(Object ciudad);

	/**
	 * Find all AdmPromociones entities.
	 * 
	 * @return List<AdmPromociones> all AdmPromociones entities
	 */
	public List<AdmPromociones> findAll();
}