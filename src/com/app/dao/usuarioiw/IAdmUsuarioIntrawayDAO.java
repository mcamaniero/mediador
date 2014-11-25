package com.app.dao.usuarioiw;

import java.util.List;

/**
 * Interface for AdmUsuarioIntrawayDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface IAdmUsuarioIntrawayDAO {
	/**
	 * Perform an initial save of a previously unsaved AdmUsuarioIntraway
	 * entity. All subsequent persist actions of this entity should use the
	 * #update() method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IAdmUsuarioIntrawayDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            AdmUsuarioIntraway entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(AdmUsuarioIntraway entity);

	/**
	 * Delete a persistent AdmUsuarioIntraway entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IAdmUsuarioIntrawayDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            AdmUsuarioIntraway entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(AdmUsuarioIntraway entity);

	/**
	 * Persist a previously saved AdmUsuarioIntraway entity and return it or a
	 * copy of it to the sender. A copy of the AdmUsuarioIntraway entity
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
	 * entity = IAdmUsuarioIntrawayDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            AdmUsuarioIntraway entity to update
	 * @returns AdmUsuarioIntraway the persisted AdmUsuarioIntraway entity
	 *          instance, may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public AdmUsuarioIntraway update(AdmUsuarioIntraway entity);

	public AdmUsuarioIntraway findById(AdmUsuarioIntrawayId id);

	/**
	 * Find all AdmUsuarioIntraway entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the AdmUsuarioIntraway property to query
	 * @param value
	 *            the property value to match
	 * @return List<AdmUsuarioIntraway> found by query
	 */
	public List<AdmUsuarioIntraway> findByProperty(String propertyName,
			Object value);

	public List<AdmUsuarioIntraway> findByClave(Object clave);

	public List<AdmUsuarioIntraway> findByNombre(Object nombre);

	public List<AdmUsuarioIntraway> findByPerfil(Object perfil);

	/**
	 * Find all AdmUsuarioIntraway entities.
	 * 
	 * @return List<AdmUsuarioIntraway> all AdmUsuarioIntraway entities
	 */
	public List<AdmUsuarioIntraway> findAll();
}