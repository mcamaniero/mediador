package com.app.tv.tvp_consultatv.dao;

import java.util.List;

/**
 * Interface for TvpConsultatvDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITvpConsultatvDAO {
	/**
	 * Perform an initial save of a previously unsaved TvpConsultatv entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITvpConsultatvDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TvpConsultatv entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TvpConsultatv entity);

	/**
	 * Delete a persistent TvpConsultatv entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITvpConsultatvDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TvpConsultatv entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TvpConsultatv entity);

	/**
	 * Persist a previously saved TvpConsultatv entity and return it or a copy
	 * of it to the sender. A copy of the TvpConsultatv entity parameter is
	 * returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITvpConsultatvDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TvpConsultatv entity to update
	 * @returns TvpConsultatv the persisted TvpConsultatv entity instance, may
	 *          not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TvpConsultatv update(TvpConsultatv entity);

	public TvpConsultatv findById(Integer id);

	/**
	 * Find all TvpConsultatv entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TvpConsultatv property to query
	 * @param value
	 *            the property value to match
	 * @return List<TvpConsultatv> found by query
	 */
	public List<TvpConsultatv> findByProperty(String propertyName, Object value);

	public List<TvpConsultatv> findByActivitytype(Object activitytype);

	public List<TvpConsultatv> findByCpartyId(Object cpartyId);

	public List<TvpConsultatv> findByCpartyAccountId(Object cpartyAccountId);

	public List<TvpConsultatv> findByApaddress(Object apaddress);

	public List<TvpConsultatv> findByTariffPlanVariantName(
			Object tariffPlanVariantName);

	public List<TvpConsultatv> findByRequesteddate(Object requesteddate);

	public List<TvpConsultatv> findByCitemId(Object citemId);

	public List<TvpConsultatv> findByCiudadNombre(Object ciudadNombre);

	public List<TvpConsultatv> findBySystemIdActive(Object systemIdActive);

	public List<TvpConsultatv> findBySessionId(Object sessionId);

	/**
	 * Find all TvpConsultatv entities.
	 * 
	 * @return List<TvpConsultatv> all TvpConsultatv entities
	 */
	public List<TvpConsultatv> findAll();
}