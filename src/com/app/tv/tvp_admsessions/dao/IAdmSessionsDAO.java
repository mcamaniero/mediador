package com.app.tv.tvp_admsessions.dao;

import java.util.Date;
import java.util.List;

/**
 * Interface for AdmSessionsDAO.
 * @author MyEclipse Persistence Tools
 */

public interface IAdmSessionsDAO {
		/**
	 Perform an initial save of a previously unsaved AdmSessions entity. 
	 All subsequent persist actions of this entity should use the #update() method.
	 This operation must be performed within the a database transaction context for the entity's data to be permanently saved to the persistence store, i.e., database. 
	 This method uses the {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist} operation.
	 	 
	 * <pre> 
	 *   EntityManagerHelper.beginTransaction();
	 *   IAdmSessionsDAO.save(entity);
	 *   EntityManagerHelper.commit();
	 * </pre>
	   @param entity AdmSessions entity to persist
	  @throws RuntimeException when the operation fails
	 */
    public void save(AdmSessions entity);
    /**
	 Delete a persistent AdmSessions entity.
	  This operation must be performed 
	 within the a database transaction context for the entity's data to be
	 permanently deleted from the persistence store, i.e., database. 
	 This method uses the {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete} operation.
	 	  
	 * <pre>
	 *   EntityManagerHelper.beginTransaction();
	 *   IAdmSessionsDAO.delete(entity);
	 *   EntityManagerHelper.commit();
	 *   entity = null;
	 * </pre>
	   @param entity AdmSessions entity to delete
	 @throws RuntimeException when the operation fails
	 */
    public void delete(AdmSessions entity);
   /**
	 Persist a previously saved AdmSessions entity and return it or a copy of it to the sender. 
	 A copy of the AdmSessions entity parameter is returned when the JPA persistence mechanism has not previously been tracking the updated entity. 
	 This operation must be performed within the a database transaction context for the entity's data to be permanently saved to the persistence
	 store, i.e., database. This method uses the {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge} operation.
	 	 
	 * <pre>
	 *   EntityManagerHelper.beginTransaction();
	 *   entity = IAdmSessionsDAO.update(entity);
	 *   EntityManagerHelper.commit();
	 * </pre>
	   @param entity AdmSessions entity to update
	 @returns AdmSessions the persisted AdmSessions entity instance, may not be the same
	 @throws RuntimeException if the operation fails
	 */
	public AdmSessions update(AdmSessions entity);
	public AdmSessions findById( Integer id);
	 /**
	 * Find all AdmSessions entities with a specific property value.  
	 
	  @param propertyName the name of the AdmSessions property to query
	  @param value the property value to match
	  	  @return List<AdmSessions> found by query
	 */
	public List<AdmSessions> findByProperty(String propertyName, Object value
		);
	public List<AdmSessions> findBySesionTv(Object sesionTv
		);
	public List<AdmSessions> findBySesionInt(Object sesionInt
		);
	public List<AdmSessions> findBySesionTel(Object sesionTel
		);
	public List<AdmSessions> findBySesionUsuario(Object sesionUsuario
		);
	public List<AdmSessions> findBySessionUsuarioMaquina(Object sessionUsuarioMaquina
		);
	public List<AdmSessions> findBySessionReportType(Object sessionReportType
		);
	/**
	 * Find all AdmSessions entities.
	  	  @return List<AdmSessions> all AdmSessions entities
	 */
	public List<AdmSessions> findAll(
		);	
}