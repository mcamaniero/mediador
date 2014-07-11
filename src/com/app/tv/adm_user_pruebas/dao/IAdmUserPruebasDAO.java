package com.app.tv.adm_user_pruebas.dao;

import java.util.List;

/**
 * Interface for AdmUserPruebasDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface IAdmUserPruebasDAO {
	/**
	 * Perform an initial save of a previously unsaved AdmUserPruebas entity.
	 * All subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IAdmUserPruebasDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            AdmUserPruebas entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(AdmUserPruebas entity);

	/**
	 * Delete a persistent AdmUserPruebas entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IAdmUserPruebasDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            AdmUserPruebas entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(AdmUserPruebas entity);

	/**
	 * Persist a previously saved AdmUserPruebas entity and return it or a copy
	 * of it to the sender. A copy of the AdmUserPruebas entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = IAdmUserPruebasDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            AdmUserPruebas entity to update
	 * @returns AdmUserPruebas the persisted AdmUserPruebas entity instance, may
	 *          not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public AdmUserPruebas update(AdmUserPruebas entity);

	public AdmUserPruebas findById(Integer id);

	/**
	 * Find all AdmUserPruebas entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the AdmUserPruebas property to query
	 * @param value
	 *            the property value to match
	 * @return List<AdmUserPruebas> found by query
	 */
	public List<AdmUserPruebas> findByProperty(String propertyName, Object value);

	public List<AdmUserPruebas> findByIdusuario(Object idusuario);

	public List<AdmUserPruebas> findByStrusuarrio(Object strusuarrio);

	/**
	 * Find all AdmUserPruebas entities.
	 * 
	 * @return List<AdmUserPruebas> all AdmUserPruebas entities
	 */
	public List<AdmUserPruebas> findAll();
}