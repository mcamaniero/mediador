package com.app.dao.conciliacion.linea;

import java.util.Date;
import java.util.List;

/**
 * Interface for AdmConciliacionLineaDAO.
 * @author MyEclipse Persistence Tools
 */

public interface IAdmConciliacionLineaDAO {
		/**
	 Perform an initial save of a previously unsaved AdmConciliacionLinea entity. 
	 All subsequent persist actions of this entity should use the #update() method.
	 This operation must be performed within the a database transaction context for the entity's data to be permanently saved to the persistence store, i.e., database. 
	 This method uses the {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist} operation.
	 	 
	 * <pre> 
	 *   EntityManagerHelper.beginTransaction();
	 *   IAdmConciliacionLineaDAO.save(entity);
	 *   EntityManagerHelper.commit();
	 * </pre>
	   @param entity AdmConciliacionLinea entity to persist
	  @throws RuntimeException when the operation fails
	 */
    public void save(AdmConciliacionLinea entity);
    /**
	 Delete a persistent AdmConciliacionLinea entity.
	  This operation must be performed 
	 within the a database transaction context for the entity's data to be
	 permanently deleted from the persistence store, i.e., database. 
	 This method uses the {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete} operation.
	 	  
	 * <pre>
	 *   EntityManagerHelper.beginTransaction();
	 *   IAdmConciliacionLineaDAO.delete(entity);
	 *   EntityManagerHelper.commit();
	 *   entity = null;
	 * </pre>
	   @param entity AdmConciliacionLinea entity to delete
	 @throws RuntimeException when the operation fails
	 */
    public void delete(AdmConciliacionLinea entity);
   /**
	 Persist a previously saved AdmConciliacionLinea entity and return it or a copy of it to the sender. 
	 A copy of the AdmConciliacionLinea entity parameter is returned when the JPA persistence mechanism has not previously been tracking the updated entity. 
	 This operation must be performed within the a database transaction context for the entity's data to be permanently saved to the persistence
	 store, i.e., database. This method uses the {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge} operation.
	 	 
	 * <pre>
	 *   EntityManagerHelper.beginTransaction();
	 *   entity = IAdmConciliacionLineaDAO.update(entity);
	 *   EntityManagerHelper.commit();
	 * </pre>
	   @param entity AdmConciliacionLinea entity to update
	 @returns AdmConciliacionLinea the persisted AdmConciliacionLinea entity instance, may not be the same
	 @throws RuntimeException if the operation fails
	 */
	public AdmConciliacionLinea update(AdmConciliacionLinea entity);
	public AdmConciliacionLinea findById( Integer id);
	 /**
	 * Find all AdmConciliacionLinea entities with a specific property value.  
	 
	  @param propertyName the name of the AdmConciliacionLinea property to query
	  @param value the property value to match
	  	  @return List<AdmConciliacionLinea> found by query
	 */
	public List<AdmConciliacionLinea> findByProperty(String propertyName, Object value
		);
	public List<AdmConciliacionLinea> findByCiudad(Object ciudad
		);
	public List<AdmConciliacionLinea> findByClientecrm(Object clientecrm
		);
	public List<AdmConciliacionLinea> findByIdproducto(Object idproducto
		);
	public List<AdmConciliacionLinea> findByIdproductocm(Object idproductocm
		);
	public List<AdmConciliacionLinea> findByMacT(Object macT
		);
	public List<AdmConciliacionLinea> findByMtamacT(Object mtamacT
		);
	public List<AdmConciliacionLinea> findByServicepackageT(Object servicepackageT
		);
	public List<AdmConciliacionLinea> findByCpsT(Object cpsT
		);
	public List<AdmConciliacionLinea> findByFonoT(Object fonoT
		);
	public List<AdmConciliacionLinea> findByHomeexchangeT(Object homeexchangeT
		);
	public List<AdmConciliacionLinea> findByEstadoT(Object estadoT
		);
	public List<AdmConciliacionLinea> findByMacIw(Object macIw
		);
	public List<AdmConciliacionLinea> findByMtamacIw(Object mtamacIw
		);
	public List<AdmConciliacionLinea> findByServicepackageIw(Object servicepackageIw
		);
	public List<AdmConciliacionLinea> findByCpsIw(Object cpsIw
		);
	public List<AdmConciliacionLinea> findByFonoIw(Object fonoIw
		);
	public List<AdmConciliacionLinea> findByHomeexchangeIw(Object homeexchangeIw
		);
	public List<AdmConciliacionLinea> findByEstadoIw(Object estadoIw
		);
	public List<AdmConciliacionLinea> findBySesion(Object sesion
		);
	/**
	 * Find all AdmConciliacionLinea entities.
	  	  @return List<AdmConciliacionLinea> all AdmConciliacionLinea entities
	 */
	public List<AdmConciliacionLinea> findAll(
		);	
}