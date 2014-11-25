package com.app.dao.conciliacion.cms;

import java.util.Date;
import java.util.List;

/**
 * Interface for AdmConciliacionCmDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface IAdmConciliacionCmsDAO {
	/**
	 * Perform an initial save of a previously unsaved AdmConciliacionCm entity.
	 * All subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IAdmConciliacionCmDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            AdmConciliacionCm entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(AdmConciliacionCms entity);

	/**
	 * Delete a persistent AdmConciliacionCm entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IAdmConciliacionCmDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            AdmConciliacionCm entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(AdmConciliacionCms entity);

	/**
	 * Persist a previously saved AdmConciliacionCm entity and return it or a
	 * copy of it to the sender. A copy of the AdmConciliacionCm entity
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
	 * entity = IAdmConciliacionCmDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            AdmConciliacionCm entity to update
	 * @returns AdmConciliacionCm the persisted AdmConciliacionCm entity
	 *          instance, may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public AdmConciliacionCms update(AdmConciliacionCms entity);

	public AdmConciliacionCms findById(Integer id);

	/**
	 * Find all AdmConciliacionCm entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the AdmConciliacionCm property to query
	 * @param value
	 *            the property value to match
	 * @return List<AdmConciliacionCm> found by query
	 */
	public List<AdmConciliacionCms> findByProperty(String propertyName,
			Object value);

	public List<AdmConciliacionCms> findByCiudad(Object ciudad);

	public List<AdmConciliacionCms> findByClientecrm(Object clientecrm);

	public List<AdmConciliacionCms> findByIdproducto(Object idproducto);

	public List<AdmConciliacionCms> findByMacT(Object macT);

	public List<AdmConciliacionCms> findByServicepackageT(Object servicepackageT);

	public List<AdmConciliacionCms> findByCpsT(Object cpsT);

	public List<AdmConciliacionCms> findByEstadoT(Object estadoT);

	public List<AdmConciliacionCms> findByMacIw(Object macIw);

	public List<AdmConciliacionCms> findByServicepackageIw(
			Object servicepackageIw);

	public List<AdmConciliacionCms> findByCpsIw(Object cpsIw);

	public List<AdmConciliacionCms> findByEstadoIw(Object estadoIw);

	public List<AdmConciliacionCms> findBySesion(Object sesion);

	/**
	 * Find all AdmConciliacionCm entities.
	 * 
	 * @return List<AdmConciliacionCm> all AdmConciliacionCm entities
	 */
	public List<AdmConciliacionCms> findAll();
}