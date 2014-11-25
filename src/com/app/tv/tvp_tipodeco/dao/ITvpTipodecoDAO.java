package com.app.tv.tvp_tipodeco.dao;

import java.util.List;

/**
 * Interface for TvpTipodecoDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITvpTipodecoDAO {
	/**
	 * Perform an initial save of a previously unsaved TvpTipodeco entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITvpTipodecoDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TvpTipodeco entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TvpTipodeco entity);

	/**
	 * Delete a persistent TvpTipodeco entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITvpTipodecoDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TvpTipodeco entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TvpTipodeco entity);

	/**
	 * Persist a previously saved TvpTipodeco entity and return it or a copy of
	 * it to the sender. A copy of the TvpTipodeco entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ITvpTipodecoDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TvpTipodeco entity to update
	 * @returns TvpTipodeco the persisted TvpTipodeco entity instance, may not
	 *          be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TvpTipodeco update(TvpTipodeco entity);

	public TvpTipodeco findById(Integer id);

	/**
	 * Find all TvpTipodeco entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TvpTipodeco property to query
	 * @param value
	 *            the property value to match
	 * @return List<TvpTipodeco> found by query
	 */
	public List<TvpTipodeco> findByProperty(String propertyName, Object value);

	public List<TvpTipodeco> findByIppv(Object ippv);

	public List<TvpTipodeco> findByTipocontrolador(Object tipocontrolador);

	/**
	 * Find all TvpTipodeco entities.
	 * 
	 * @return List<TvpTipodeco> all TvpTipodeco entities
	 */
	public List<TvpTipodeco> findAll();
}