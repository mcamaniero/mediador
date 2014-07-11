package com.app.tv.tvp_equivalencias.dao;

import java.util.List;

/**
 * Interface for TvpEquivalenciasDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITvpEquivalenciasDAO {
	/**
	 * Perform an initial save of a previously unsaved TvpEquivalencias entity.
	 * All subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITvpEquivalenciasDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TvpEquivalencias entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TvpEquivalencias entity);

	/**
	 * Delete a persistent TvpEquivalencias entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITvpEquivalenciasDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TvpEquivalencias entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TvpEquivalencias entity);

	/**
	 * Persist a previously saved TvpEquivalencias entity and return it or a
	 * copy of it to the sender. A copy of the TvpEquivalencias entity parameter
	 * is returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITvpEquivalenciasDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TvpEquivalencias entity to update
	 * @returns TvpEquivalencias the persisted TvpEquivalencias entity instance,
	 *          may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TvpEquivalencias update(TvpEquivalencias entity);

	public TvpEquivalencias findById(Integer id);

	/**
	 * Find all TvpEquivalencias entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TvpEquivalencias property to query
	 * @param value
	 *            the property value to match
	 * @return List<TvpEquivalencias> found by query
	 */
	public List<TvpEquivalencias> findByProperty(String propertyName,
			Object value);

	public List<TvpEquivalencias> findByCodigoTitan(Object codigoTitan);

	public List<TvpEquivalencias> findByCodigoInterno(Object codigoInterno);

	public List<TvpEquivalencias> findByTcontrolador(Object tcontrolador);

	public List<TvpEquivalencias> findByTequivalencia(Object tequivalencia);

	public List<TvpEquivalencias> findByCprincipal(Object cprincipal);

	public List<TvpEquivalencias> findByCadicional(Object cadicional);

	public List<TvpEquivalencias> findByCodInt(Object codInt);

	/**
	 * Find all TvpEquivalencias entities.
	 * 
	 * @return List<TvpEquivalencias> all TvpEquivalencias entities
	 */
	public List<TvpEquivalencias> findAll();
}