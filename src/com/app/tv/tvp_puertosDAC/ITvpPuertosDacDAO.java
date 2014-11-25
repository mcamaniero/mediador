package com.app.tv.tvp_puertosDAC;

import java.util.List;

/**
 * Interface for TvpPuertosDacDAO.
 * @author MyEclipse Persistence Tools
 */

public interface ITvpPuertosDacDAO {
		/**
	 Perform an initial save of a previously unsaved TvpPuertosDac entity. 
	 All subsequent persist actions of this entity should use the #update() method.
	 This operation must be performed within the a database transaction context for the entity's data to be permanently saved to the persistence store, i.e., database. 
	 This method uses the {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist} operation.
	 	 
	 * <pre> 
	 *   EntityManagerHelper.beginTransaction();
	 *   ITvpPuertosDacDAO.save(entity);
	 *   EntityManagerHelper.commit();
	 * </pre>
	   @param entity TvpPuertosDac entity to persist
	  @throws RuntimeException when the operation fails
	 */
    public void save(TvpPuertosDac entity);
    /**
	 Delete a persistent TvpPuertosDac entity.
	  This operation must be performed 
	 within the a database transaction context for the entity's data to be
	 permanently deleted from the persistence store, i.e., database. 
	 This method uses the {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete} operation.
	 	  
	 * <pre>
	 *   EntityManagerHelper.beginTransaction();
	 *   ITvpPuertosDacDAO.delete(entity);
	 *   EntityManagerHelper.commit();
	 *   entity = null;
	 * </pre>
	   @param entity TvpPuertosDac entity to delete
	 @throws RuntimeException when the operation fails
	 */
    public void delete(TvpPuertosDac entity);
   /**
	 Persist a previously saved TvpPuertosDac entity and return it or a copy of it to the sender. 
	 A copy of the TvpPuertosDac entity parameter is returned when the JPA persistence mechanism has not previously been tracking the updated entity. 
	 This operation must be performed within the a database transaction context for the entity's data to be permanently saved to the persistence
	 store, i.e., database. This method uses the {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge} operation.
	 	 
	 * <pre>
	 *   EntityManagerHelper.beginTransaction();
	 *   entity = ITvpPuertosDacDAO.update(entity);
	 *   EntityManagerHelper.commit();
	 * </pre>
	   @param entity TvpPuertosDac entity to update
	 @returns TvpPuertosDac the persisted TvpPuertosDac entity instance, may not be the same
	 @throws RuntimeException if the operation fails
	 */
	public TvpPuertosDac update(TvpPuertosDac entity);
	public TvpPuertosDac findById( Integer id);
	 /**
	 * Find all TvpPuertosDac entities with a specific property value.  
	 
	  @param propertyName the name of the TvpPuertosDac property to query
	  @param value the property value to match
	  	  @return List<TvpPuertosDac> found by query
	 */
	public List<TvpPuertosDac> findByProperty(String propertyName, Object value
		);
	public List<TvpPuertosDac> findByPuertoDac(Object puertoDac
		);
	/**
	 * Find all TvpPuertosDac entities.
	  	  @return List<TvpPuertosDac> all TvpPuertosDac entities
	 */
	public List<TvpPuertosDac> findAll(
		);	
}