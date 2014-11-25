package com.app.tv.tvp_parametros.dao;

import com.app.dao.EntityManagerHelper;
import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 	* A data access object (DAO) providing persistence and search support for TvpParametros entities.
 	 		* Transaction control of the save(), update() and delete() operations must be handled externally by senders of these methods 
 		  or must be manually added to each of these methods for data to be persisted to the JPA datastore.	
 	 * @see com.app.tv.tvp_parametros.dao.TvpParametros
  * @author MyEclipse Persistence Tools 
 */

public class TvpParametrosDAO  {
	//property constants
	public static final String CIUDAD = "ciudad";
	public static final String BSI = "bsi";
	public static final String VCM = "vcm";
	public static final String HEADEND = "headend";
	public static final String UP = "up";
	public static final String DOWN = "down";
	public static final String REGION = "region";





	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}	
	
		/**
	 Perform an initial save of a previously unsaved TvpParametros entity. 
	 All subsequent persist actions of this entity should use the #update() method.
	 This operation must be performed within the a database transaction context for the entity's data to be permanently saved to the persistence store, i.e., database. 
	 This method uses the {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist} operation.
	 	 
	 * <pre> 
	 *   EntityManagerHelper.beginTransaction();
	 *   TvpParametrosDAO.save(entity);
	 *   EntityManagerHelper.commit();
	 * </pre>
	   @param entity TvpParametros entity to persist
	  @throws RuntimeException when the operation fails
	 */
    public void save(TvpParametros entity) {
    				EntityManagerHelper.log("saving TvpParametros instance", Level.INFO, null);
	        try {
            getEntityManager().persist(entity);
            			EntityManagerHelper.log("save successful", Level.INFO, null);
	        } catch (RuntimeException re) {
        				EntityManagerHelper.log("save failed", Level.SEVERE, re);
	            throw re;
        }
    }
    
    /**
	 Delete a persistent TvpParametros entity.
	  This operation must be performed 
	 within the a database transaction context for the entity's data to be
	 permanently deleted from the persistence store, i.e., database. 
	 This method uses the {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete} operation.
	 	  
	 * <pre>
	 *   EntityManagerHelper.beginTransaction();
	 *   TvpParametrosDAO.delete(entity);
	 *   EntityManagerHelper.commit();
	 *   entity = null;
	 * </pre>
	   @param entity TvpParametros entity to delete
	 @throws RuntimeException when the operation fails
	 */
    public void delete(TvpParametros entity) {
    				EntityManagerHelper.log("deleting TvpParametros instance", Level.INFO, null);
	        try {
        	entity = getEntityManager().getReference(TvpParametros.class, entity.getId());
            getEntityManager().remove(entity);
            			EntityManagerHelper.log("delete successful", Level.INFO, null);
	        } catch (RuntimeException re) {
        				EntityManagerHelper.log("delete failed", Level.SEVERE, re);
	            throw re;
        }
    }
    
    /**
	 Persist a previously saved TvpParametros entity and return it or a copy of it to the sender. 
	 A copy of the TvpParametros entity parameter is returned when the JPA persistence mechanism has not previously been tracking the updated entity. 
	 This operation must be performed within the a database transaction context for the entity's data to be permanently saved to the persistence
	 store, i.e., database. This method uses the {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge} operation.
	 	 
	 * <pre>
	 *   EntityManagerHelper.beginTransaction();
	 *   entity = TvpParametrosDAO.update(entity);
	 *   EntityManagerHelper.commit();
	 * </pre>
	   @param entity TvpParametros entity to update
	 @returns TvpParametros the persisted TvpParametros entity instance, may not be the same
	 @throws RuntimeException if the operation fails
	 */
    public TvpParametros update(TvpParametros entity) {
    				EntityManagerHelper.log("updating TvpParametros instance", Level.INFO, null);
	        try {
            TvpParametros result = getEntityManager().merge(entity);
            			EntityManagerHelper.log("update successful", Level.INFO, null);
	            return result;
        } catch (RuntimeException re) {
        				EntityManagerHelper.log("update failed", Level.SEVERE, re);
	            throw re;
        }
    }
    
    public TvpParametros findById( Integer id) {
    				EntityManagerHelper.log("finding TvpParametros instance with id: " + id, Level.INFO, null);
	        try {
            TvpParametros instance = getEntityManager().find(TvpParametros.class, id);
            return instance;
        } catch (RuntimeException re) {
        				EntityManagerHelper.log("find failed", Level.SEVERE, re);
	            throw re;
        }
    }    
    

/**
	 * Find all TvpParametros entities with a specific property value.  
	 
	  @param propertyName the name of the TvpParametros property to query
	  @param value the property value to match
	  	  @return List<TvpParametros> found by query
	 */
    @SuppressWarnings("unchecked")
    public List<TvpParametros> findByProperty(String propertyName, final Object value
        ) {
    				EntityManagerHelper.log("finding TvpParametros instance with property: " + propertyName + ", value: " + value, Level.INFO, null);
			try {
			final String queryString = "select model from TvpParametros model where model." 
			 						+ propertyName + "= :propertyValue";
								Query query = getEntityManager().createQuery(queryString);
					query.setParameter("propertyValue", value);
					return query.getResultList();
		} catch (RuntimeException re) {
						EntityManagerHelper.log("find by property name failed", Level.SEVERE, re);
				throw re;
		}
	}			
	public List<TvpParametros> findByCiudad(Object ciudad
	) {
		return findByProperty(CIUDAD, ciudad
		);
	}
	
	public List<TvpParametros> findByBsi(Object bsi
	) {
		return findByProperty(BSI, bsi
		);
	}
	
	public List<TvpParametros> findByVcm(Object vcm
	) {
		return findByProperty(VCM, vcm
		);
	}
	
	public List<TvpParametros> findByHeadend(Object headend
	) {
		return findByProperty(HEADEND, headend
		);
	}
	
	public List<TvpParametros> findByUp(Object up
	) {
		return findByProperty(UP, up
		);
	}
	
	public List<TvpParametros> findByDown(Object down
	) {
		return findByProperty(DOWN, down
		);
	}
	
	public List<TvpParametros> findByRegion(Object region
	) {
		return findByProperty(REGION, region
		);
	}
	
	
	/**
	 * Find all TvpParametros entities.
	  	  @return List<TvpParametros> all TvpParametros entities
	 */
	@SuppressWarnings("unchecked")
	public List<TvpParametros> findAll(
		) {
					EntityManagerHelper.log("finding all TvpParametros instances", Level.INFO, null);
			try {
			final String queryString = "select model from TvpParametros model";
								Query query = getEntityManager().createQuery(queryString);
					return query.getResultList();
		} catch (RuntimeException re) {
						EntityManagerHelper.log("find all failed", Level.SEVERE, re);
				throw re;
		}
	}
	
}