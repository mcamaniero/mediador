package com.app.tv.tvp_recoleccionPPV.dao;

import com.app.dao.EntityManagerHelper;
import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 	* A data access object (DAO) providing persistence and search support for TvpRecoleccionPpv entities.
 	 		* Transaction control of the save(), update() and delete() operations must be handled externally by senders of these methods 
 		  or must be manually added to each of these methods for data to be persisted to the JPA datastore.	
 	 * @see com.app.tv.tvp_recoleccionPPV.dao.TvpRecoleccionPpv
  * @author MyEclipse Persistence Tools 
 */

public class TvpRecoleccionPpvDAO  implements ITvpRecoleccionPpvDAO{
	//property constants
	public static final String IDEMPRESA = "idempresa";
	public static final String STR_SERIAL = "strSerial";
	public static final String ID_EVENTO = "idEvento";
	public static final String DATE = "date";
	public static final String ID_TIPO_RECOLECCION = "idTipoRecoleccion";
	public static final String POLLDATE = "polldate";
	public static final String STATE = "state";





	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}	
	
		/**
	 Perform an initial save of a previously unsaved TvpRecoleccionPpv entity. 
	 All subsequent persist actions of this entity should use the #update() method.
	 This operation must be performed within the a database transaction context for the entity's data to be permanently saved to the persistence store, i.e., database. 
	 This method uses the {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist} operation.
	 	 
	 * <pre> 
	 *   EntityManagerHelper.beginTransaction();
	 *   TvpRecoleccionPpvDAO.save(entity);
	 *   EntityManagerHelper.commit();
	 * </pre>
	   @param entity TvpRecoleccionPpv entity to persist
	  @throws RuntimeException when the operation fails
	 */
    public void save(TvpRecoleccionPpv entity) {
    				EntityManagerHelper.log("saving TvpRecoleccionPpv instance", Level.INFO, null);
	        try {
            getEntityManager().persist(entity);
            			EntityManagerHelper.log("save successful", Level.INFO, null);
	        } catch (RuntimeException re) {
        				EntityManagerHelper.log("save failed", Level.SEVERE, re);
	            throw re;
        }
    }
    
    /**
	 Delete a persistent TvpRecoleccionPpv entity.
	  This operation must be performed 
	 within the a database transaction context for the entity's data to be
	 permanently deleted from the persistence store, i.e., database. 
	 This method uses the {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete} operation.
	 	  
	 * <pre>
	 *   EntityManagerHelper.beginTransaction();
	 *   TvpRecoleccionPpvDAO.delete(entity);
	 *   EntityManagerHelper.commit();
	 *   entity = null;
	 * </pre>
	   @param entity TvpRecoleccionPpv entity to delete
	 @throws RuntimeException when the operation fails
	 */
    public void delete(TvpRecoleccionPpv entity) {
    				EntityManagerHelper.log("deleting TvpRecoleccionPpv instance", Level.INFO, null);
	        try {
        	entity = getEntityManager().getReference(TvpRecoleccionPpv.class, entity.getId());
            getEntityManager().remove(entity);
            			EntityManagerHelper.log("delete successful", Level.INFO, null);
	        } catch (RuntimeException re) {
        				EntityManagerHelper.log("delete failed", Level.SEVERE, re);
	            throw re;
        }
    }
    
    /**
	 Persist a previously saved TvpRecoleccionPpv entity and return it or a copy of it to the sender. 
	 A copy of the TvpRecoleccionPpv entity parameter is returned when the JPA persistence mechanism has not previously been tracking the updated entity. 
	 This operation must be performed within the a database transaction context for the entity's data to be permanently saved to the persistence
	 store, i.e., database. This method uses the {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge} operation.
	 	 
	 * <pre>
	 *   EntityManagerHelper.beginTransaction();
	 *   entity = TvpRecoleccionPpvDAO.update(entity);
	 *   EntityManagerHelper.commit();
	 * </pre>
	   @param entity TvpRecoleccionPpv entity to update
	 @returns TvpRecoleccionPpv the persisted TvpRecoleccionPpv entity instance, may not be the same
	 @throws RuntimeException if the operation fails
	 */
    public TvpRecoleccionPpv update(TvpRecoleccionPpv entity) {
    				EntityManagerHelper.log("updating TvpRecoleccionPpv instance", Level.INFO, null);
	        try {
            TvpRecoleccionPpv result = getEntityManager().merge(entity);
            			EntityManagerHelper.log("update successful", Level.INFO, null);
	            return result;
        } catch (RuntimeException re) {
        				EntityManagerHelper.log("update failed", Level.SEVERE, re);
	            throw re;
        }
    }
    
    public TvpRecoleccionPpv findById( Long id) {
    				EntityManagerHelper.log("finding TvpRecoleccionPpv instance with id: " + id, Level.INFO, null);
	        try {
            TvpRecoleccionPpv instance = getEntityManager().find(TvpRecoleccionPpv.class, id);
            return instance;
        } catch (RuntimeException re) {
        				EntityManagerHelper.log("find failed", Level.SEVERE, re);
	            throw re;
        }
    }    
    

/**
	 * Find all TvpRecoleccionPpv entities with a specific property value.  
	 
	  @param propertyName the name of the TvpRecoleccionPpv property to query
	  @param value the property value to match
	  	  @return List<TvpRecoleccionPpv> found by query
	 */
    @SuppressWarnings("unchecked")
    public List<TvpRecoleccionPpv> findByProperty(String propertyName, final Object value
        ) {
    				EntityManagerHelper.log("finding TvpRecoleccionPpv instance with property: " + propertyName + ", value: " + value, Level.INFO, null);
			try {
			final String queryString = "select model from TvpRecoleccionPpv model where model." 
			 						+ propertyName + "= :propertyValue";
								Query query = getEntityManager().createQuery(queryString);
					query.setParameter("propertyValue", value);
					return query.getResultList();
		} catch (RuntimeException re) {
						EntityManagerHelper.log("find by property name failed", Level.SEVERE, re);
				throw re;
		}
	}			
	public List<TvpRecoleccionPpv> findByIdempresa(Object idempresa
	) {
		return findByProperty(IDEMPRESA, idempresa
		);
	}
	
	public List<TvpRecoleccionPpv> findByStrSerial(Object strSerial
	) {
		return findByProperty(STR_SERIAL, strSerial
		);
	}
	
	public List<TvpRecoleccionPpv> findByIdEvento(Object idEvento
	) {
		return findByProperty(ID_EVENTO, idEvento
		);
	}
	
	public List<TvpRecoleccionPpv> findByDate(Object date
	) {
		return findByProperty(DATE, date
		);
	}
	
	public List<TvpRecoleccionPpv> findByIdTipoRecoleccion(Object idTipoRecoleccion
	) {
		return findByProperty(ID_TIPO_RECOLECCION, idTipoRecoleccion
		);
	}
	
	public List<TvpRecoleccionPpv> findByPolldate(Object polldate
	) {
		return findByProperty(POLLDATE, polldate
		);
	}
	
	public List<TvpRecoleccionPpv> findByState(Object state
	) {
		return findByProperty(STATE, state
		);
	}
	
	
	/**
	 * Find all TvpRecoleccionPpv entities.
	  	  @return List<TvpRecoleccionPpv> all TvpRecoleccionPpv entities
	 */
	@SuppressWarnings("unchecked")
	public List<TvpRecoleccionPpv> findAll(
		) {
					EntityManagerHelper.log("finding all TvpRecoleccionPpv instances", Level.INFO, null);
			try {
			final String queryString = "select model from TvpRecoleccionPpv model";
								Query query = getEntityManager().createQuery(queryString);
					return query.getResultList();
		} catch (RuntimeException re) {
						EntityManagerHelper.log("find all failed", Level.SEVERE, re);
				throw re;
		}
	}
	
}