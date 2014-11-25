package com.app.tv.tvp_recoleccionPPV.dao;

import java.util.List;

/**
 * Interface for TvpRecoleccionPpvDAO.
 * @author MyEclipse Persistence Tools
 */

public interface ITvpRecoleccionPpvDAO {
		/**
	 Perform an initial save of a previously unsaved TvpRecoleccionPpv entity. 
	 All subsequent persist actions of this entity should use the #update() method.
	 This operation must be performed within the a database transaction context for the entity's data to be permanently saved to the persistence store, i.e., database. 
	 This method uses the {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist} operation.
	 	 
	 * <pre> 
	 *   EntityManagerHelper.beginTransaction();
	 *   ITvpRecoleccionPpvDAO.save(entity);
	 *   EntityManagerHelper.commit();
	 * </pre>
	   @param entity TvpRecoleccionPpv entity to persist
	  @throws RuntimeException when the operation fails
	 */
    public void save(TvpRecoleccionPpv entity);
    /**
	 Delete a persistent TvpRecoleccionPpv entity.
	  This operation must be performed 
	 within the a database transaction context for the entity's data to be
	 permanently deleted from the persistence store, i.e., database. 
	 This method uses the {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete} operation.
	 	  
	 * <pre>
	 *   EntityManagerHelper.beginTransaction();
	 *   ITvpRecoleccionPpvDAO.delete(entity);
	 *   EntityManagerHelper.commit();
	 *   entity = null;
	 * </pre>
	   @param entity TvpRecoleccionPpv entity to delete
	 @throws RuntimeException when the operation fails
	 */
    public void delete(TvpRecoleccionPpv entity);
   /**
	 Persist a previously saved TvpRecoleccionPpv entity and return it or a copy of it to the sender. 
	 A copy of the TvpRecoleccionPpv entity parameter is returned when the JPA persistence mechanism has not previously been tracking the updated entity. 
	 This operation must be performed within the a database transaction context for the entity's data to be permanently saved to the persistence
	 store, i.e., database. This method uses the {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge} operation.
	 	 
	 * <pre>
	 *   EntityManagerHelper.beginTransaction();
	 *   entity = ITvpRecoleccionPpvDAO.update(entity);
	 *   EntityManagerHelper.commit();
	 * </pre>
	   @param entity TvpRecoleccionPpv entity to update
	 @returns TvpRecoleccionPpv the persisted TvpRecoleccionPpv entity instance, may not be the same
	 @throws RuntimeException if the operation fails
	 */
	public TvpRecoleccionPpv update(TvpRecoleccionPpv entity);
	public TvpRecoleccionPpv findById( Long id);
	 /**
	 * Find all TvpRecoleccionPpv entities with a specific property value.  
	 
	  @param propertyName the name of the TvpRecoleccionPpv property to query
	  @param value the property value to match
	  	  @return List<TvpRecoleccionPpv> found by query
	 */
	public List<TvpRecoleccionPpv> findByProperty(String propertyName, Object value
		);
	public List<TvpRecoleccionPpv> findByIdempresa(Object idempresa
		);
	public List<TvpRecoleccionPpv> findByStrSerial(Object strSerial
		);
	public List<TvpRecoleccionPpv> findByIdEvento(Object idEvento
		);
	public List<TvpRecoleccionPpv> findByDate(Object date
		);
	public List<TvpRecoleccionPpv> findByIdTipoRecoleccion(Object idTipoRecoleccion
		);
	public List<TvpRecoleccionPpv> findByPolldate(Object polldate
		);
	public List<TvpRecoleccionPpv> findByState(Object state
		);
	/**
	 * Find all TvpRecoleccionPpv entities.
	  	  @return List<TvpRecoleccionPpv> all TvpRecoleccionPpv entities
	 */
	public List<TvpRecoleccionPpv> findAll(
		);	
}