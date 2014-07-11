package com.app.tv.tvp_puertosDAC;

import com.app.dao.EntityManagerHelper;
import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 	* A data access object (DAO) providing persistence and search support for TvpPuertosDac entities.
 	 		* Transaction control of the save(), update() and delete() operations must be handled externally by senders of these methods 
 		  or must be manually added to each of these methods for data to be persisted to the JPA datastore.	
 	 * @see com.app.tv.tvp_puertosDAC.TvpPuertosDac
  * @author MyEclipse Persistence Tools 
 */

public class TvpPuertosDacDAO  implements ITvpPuertosDacDAO{
	//property constants
	public static final String PUERTO_DAC = "puertoDac";





	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}	
	
		/**
	 Perform an initial save of a previously unsaved TvpPuertosDac entity. 
	 All subsequent persist actions of this entity should use the #update() method.
	 This operation must be performed within the a database transaction context for the entity's data to be permanently saved to the persistence store, i.e., database. 
	 This method uses the {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist} operation.
	 	 
	 * <pre> 
	 *   EntityManagerHelper.beginTransaction();
	 *   TvpPuertosDacDAO.save(entity);
	 *   EntityManagerHelper.commit();
	 * </pre>
	   @param entity TvpPuertosDac entity to persist
	  @throws RuntimeException when the operation fails
	 */
    public void save(TvpPuertosDac entity) {
    		//		EntityManagerHelper.log("saving TvpPuertosDac instance", Level.INFO, null);
	        try {
            getEntityManager().persist(entity);
            			EntityManagerHelper.log("save successful", Level.INFO, null);
	        } catch (RuntimeException re) {
        				EntityManagerHelper.log("save failed", Level.SEVERE, re);
	            throw re;
        }
    }
    
    /**
	 Delete a persistent TvpPuertosDac entity.
	  This operation must be performed 
	 within the a database transaction context for the entity's data to be
	 permanently deleted from the persistence store, i.e., database. 
	 This method uses the {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete} operation.
	 	  
	 * <pre>
	 *   EntityManagerHelper.beginTransaction();
	 *   TvpPuertosDacDAO.delete(entity);
	 *   EntityManagerHelper.commit();
	 *   entity = null;
	 * </pre>
	   @param entity TvpPuertosDac entity to delete
	 @throws RuntimeException when the operation fails
	 */
    public void delete(TvpPuertosDac entity) {
    		//		EntityManagerHelper.log("deleting TvpPuertosDac instance", Level.INFO, null);
	        try {
        	entity = getEntityManager().getReference(TvpPuertosDac.class, entity.getCiudadId());
            getEntityManager().remove(entity);
            			EntityManagerHelper.log("delete successful", Level.INFO, null);
	        } catch (RuntimeException re) {
        				EntityManagerHelper.log("delete failed", Level.SEVERE, re);
	            throw re;
        }
    }
    
    /**
	 Persist a previously saved TvpPuertosDac entity and return it or a copy of it to the sender. 
	 A copy of the TvpPuertosDac entity parameter is returned when the JPA persistence mechanism has not previously been tracking the updated entity. 
	 This operation must be performed within the a database transaction context for the entity's data to be permanently saved to the persistence
	 store, i.e., database. This method uses the {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge} operation.
	 	 
	 * <pre>
	 *   EntityManagerHelper.beginTransaction();
	 *   entity = TvpPuertosDacDAO.update(entity);
	 *   EntityManagerHelper.commit();
	 * </pre>
	   @param entity TvpPuertosDac entity to update
	 @returns TvpPuertosDac the persisted TvpPuertosDac entity instance, may not be the same
	 @throws RuntimeException if the operation fails
	 */
    public TvpPuertosDac update(TvpPuertosDac entity) {
    		//		EntityManagerHelper.log("updating TvpPuertosDac instance", Level.INFO, null);
	        try {
            TvpPuertosDac result = getEntityManager().merge(entity);
            			EntityManagerHelper.log("update successful", Level.INFO, null);
	            return result;
        } catch (RuntimeException re) {
        				EntityManagerHelper.log("update failed", Level.SEVERE, re);
	            throw re;
        }
    }
    
    public TvpPuertosDac findById( Integer id) {
    		//		EntityManagerHelper.log("finding TvpPuertosDac instance with id: " + id, Level.INFO, null);
	        try {
            TvpPuertosDac instance = getEntityManager().find(TvpPuertosDac.class, id);
            getEntityManager().refresh(instance);
            return instance;
        } catch (RuntimeException re) {
        				EntityManagerHelper.log("find failed", Level.SEVERE, re);
	            throw re;
        }
    }    
    

/**
	 * Find all TvpPuertosDac entities with a specific property value.  
	 
	  @param propertyName the name of the TvpPuertosDac property to query
	  @param value the property value to match
	  	  @return List<TvpPuertosDac> found by query
	 */
    @SuppressWarnings("unchecked")
    public List<TvpPuertosDac> findByProperty(String propertyName, final Object value
        ) {
    		//		EntityManagerHelper.log("finding TvpPuertosDac instance with property: " + propertyName + ", value: " + value, Level.INFO, null);
			try {
			final String queryString = "select model from TvpPuertosDac model where model." 
			 						+ propertyName + "= :propertyValue";
								Query query = getEntityManager().createQuery(queryString);
					query.setParameter("propertyValue", value);
					return query.getResultList();
		} catch (RuntimeException re) {
						EntityManagerHelper.log("find by property name failed", Level.SEVERE, re);
				throw re;
		}
	}			
	public List<TvpPuertosDac> findByPuertoDac(Object puertoDac
	) {
		return findByProperty(PUERTO_DAC, puertoDac
		);
	}
	
	
	/**
	 * Find all TvpPuertosDac entities.
	  	  @return List<TvpPuertosDac> all TvpPuertosDac entities
	 */
	@SuppressWarnings("unchecked")
	public List<TvpPuertosDac> findAll(
		) {
					EntityManagerHelper.log("finding all TvpPuertosDac instances", Level.INFO, null);
			try {
			final String queryString = "select model from TvpPuertosDac model";
								Query query = getEntityManager().createQuery(queryString);
					return query.getResultList();
		} catch (RuntimeException re) {
						EntityManagerHelper.log("find all failed", Level.SEVERE, re);
				throw re;
		}
	}
	
}