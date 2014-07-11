package com.app.tv.tvp_puertosDHDAC;

import java.util.List;

/**
 * Interface for TvpPuertosDhdacDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITvpPuertosDhdacDAO {
	/**
	 * Perform an initial save of a previously unsaved TvpPuertosDhdac entity.
	 * All subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITvpPuertosDhdacDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TvpPuertosDhdac entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TvpPuertosDhdac entity);

	/**
	 * Delete a persistent TvpPuertosDhdac entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITvpPuertosDhdacDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TvpPuertosDhdac entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TvpPuertosDhdac entity);

	/**
	 * Persist a previously saved TvpPuertosDhdac entity and return it or a copy
	 * of it to the sender. A copy of the TvpPuertosDhdac entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITvpPuertosDhdacDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TvpPuertosDhdac entity to update
	 * @returns TvpPuertosDhdac the persisted TvpPuertosDhdac entity instance,
	 *          may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TvpPuertosDhdac update(TvpPuertosDhdac entity);

	public TvpPuertosDhdac findById(Integer id);

	/**
	 * Find all TvpPuertosDhdac entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TvpPuertosDhdac property to query
	 * @param value
	 *            the property value to match
	 * @return List<TvpPuertosDhdac> found by query
	 */
	public List<TvpPuertosDhdac> findByProperty(String propertyName,
			Object value);

	public List<TvpPuertosDhdac> findByPuertodesde(Object puertodesde);

	public List<TvpPuertosDhdac> findByPuertohasta(Object puertohasta);

	public List<TvpPuertosDhdac> findBySolouno(Object solouno);

	/**
	 * Find all TvpPuertosDhdac entities.
	 * 
	 * @return List<TvpPuertosDhdac> all TvpPuertosDhdac entities
	 */
	public List<TvpPuertosDhdac> findAll();
}