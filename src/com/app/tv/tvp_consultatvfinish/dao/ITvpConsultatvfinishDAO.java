package com.app.tv.tvp_consultatvfinish.dao;

import java.util.Date;
import java.util.List;

/**
 * Interface for TvpConsultatvfinishDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ITvpConsultatvfinishDAO {
	/**
	 * Perform an initial save of a previously unsaved TvpConsultatvfinish
	 * entity. All subsequent persist actions of this entity should use the
	 * #update() method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITvpConsultatvfinishDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TvpConsultatvfinish entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TvpConsultatvfinish entity);

	/**
	 * Delete a persistent TvpConsultatvfinish entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ITvpConsultatvfinishDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TvpConsultatvfinish entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TvpConsultatvfinish entity);

	/**
	 * Persist a previously saved TvpConsultatvfinish entity and return it or a
	 * copy of it to the sender. A copy of the TvpConsultatvfinish entity
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
	 * entity = ITvpConsultatvfinishDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TvpConsultatvfinish entity to update
	 * @returns TvpConsultatvfinish the persisted TvpConsultatvfinish entity
	 *          instance, may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TvpConsultatvfinish update(TvpConsultatvfinish entity);

	public TvpConsultatvfinish findById(Integer id);

	/**
	 * Find all TvpConsultatvfinish entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TvpConsultatvfinish property to query
	 * @param value
	 *            the property value to match
	 * @return List<TvpConsultatvfinish> found by query
	 */
	public List<TvpConsultatvfinish> findByProperty(String propertyName,
			Object value);

	public List<TvpConsultatvfinish> findByCpartyId(Object cpartyId);

	public List<TvpConsultatvfinish> findByCpartyIdAccount(
			Object cpartyIdAccount);

	public List<TvpConsultatvfinish> findByDecoSerie(Object decoSerie);

	public List<TvpConsultatvfinish> findByDecoId(Object decoId);

	public List<TvpConsultatvfinish> findByServicioTitan(Object servicioTitan);

	public List<TvpConsultatvfinish> findByServicioControlador(
			Object servicioControlador);

	public List<TvpConsultatvfinish> findByEstadoTitan(Object estadoTitan);

	public List<TvpConsultatvfinish> findByEstadoControlador(
			Object estadoControlador);

	public List<TvpConsultatvfinish> findByConsultatvId(Object consultatvId);

	public List<TvpConsultatvfinish> findBySessionId(Object sessionId);

	public List<TvpConsultatvfinish> findByPaychannelsTitan(
			Object paychannelsTitan);

	public List<TvpConsultatvfinish> findByPaychannelsControlador(
			Object paychannelsControlador);

	public List<TvpConsultatvfinish> findByCiudad(Object ciudad);

	public List<TvpConsultatvfinish> findByDecoIdControlador(
			Object decoIdControlador);

	public List<TvpConsultatvfinish> findBySessionReportType(
			Object sessionReportType);

	/**
	 * Find all TvpConsultatvfinish entities.
	 * 
	 * @return List<TvpConsultatvfinish> all TvpConsultatvfinish entities
	 */
	public List<TvpConsultatvfinish> findAll();
}