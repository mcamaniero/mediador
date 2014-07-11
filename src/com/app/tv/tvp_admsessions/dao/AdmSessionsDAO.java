package com.app.tv.tvp_admsessions.dao;

import com.app.dao.EntityManagerHelper;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 	* A data access object (DAO) providing persistence and search support for AdmSessions entities.
 	 		* Transaction control of the save(), update() and delete() operations must be handled externally by senders of these methods 
 		  or must be manually added to each of these methods for data to be persisted to the JPA datastore.	
 	 * @see com.app.tv.tvp_admsessions.dao.AdmSessions
  * @author MyEclipse Persistence Tools 
 */

public class AdmSessionsDAO  implements IAdmSessionsDAO{
	//property constants
	public static final String SESION_TV = "sesionTv";
	public static final String SESION_INT = "sesionInt";
	public static final String SESION_TEL = "sesionTel";
	public static final String SESION_USUARIO = "sesionUsuario";
	public static final String SESSION_USUARIO_MAQUINA = "sessionUsuarioMaquina";
	public static final String SESSION_REPORT_TYPE = "sessionReportType";





	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}	
	
		/**
	 Perform an initial save of a previously unsaved AdmSessions entity. 
	 All subsequent persist actions of this entity should use the #update() method.
	 This operation must be performed within the a database transaction context for the entity's data to be permanently saved to the persistence store, i.e., database. 
	 This method uses the {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist} operation.
	 	 
	 * <pre> 
	 *   EntityManagerHelper.beginTransaction();
	 *   AdmSessionsDAO.save(entity);
	 *   EntityManagerHelper.commit();
	 * </pre>
	   @param entity AdmSessions entity to persist
	  @throws RuntimeException when the operation fails
	 */
    public void save(AdmSessions entity) {
    				EntityManagerHelper.log("saving AdmSessions instance", Level.INFO, null);
	        try {
            getEntityManager().persist(entity);
            			EntityManagerHelper.log("save successful", Level.INFO, null);
	        } catch (RuntimeException re) {
        				EntityManagerHelper.log("save failed", Level.SEVERE, re);
	            throw re;
        }
    }
    
    /**
	 Delete a persistent AdmSessions entity.
	  This operation must be performed 
	 within the a database transaction context for the entity's data to be
	 permanently deleted from the persistence store, i.e., database. 
	 This method uses the {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete} operation.
	 	  
	 * <pre>
	 *   EntityManagerHelper.beginTransaction();
	 *   AdmSessionsDAO.delete(entity);
	 *   EntityManagerHelper.commit();
	 *   entity = null;
	 * </pre>
	   @param entity AdmSessions entity to delete
	 @throws RuntimeException when the operation fails
	 */
    public void delete(AdmSessions entity) {
    				EntityManagerHelper.log("deleting AdmSessions instance", Level.INFO, null);
	        try {
        	entity = getEntityManager().getReference(AdmSessions.class, entity.getId());
            getEntityManager().remove(entity);
            			EntityManagerHelper.log("delete successful", Level.INFO, null);
	        } catch (RuntimeException re) {
        				EntityManagerHelper.log("delete failed", Level.SEVERE, re);
	            throw re;
        }
    }
    
    /**
	 Persist a previously saved AdmSessions entity and return it or a copy of it to the sender. 
	 A copy of the AdmSessions entity parameter is returned when the JPA persistence mechanism has not previously been tracking the updated entity. 
	 This operation must be performed within the a database transaction context for the entity's data to be permanently saved to the persistence
	 store, i.e., database. This method uses the {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge} operation.
	 	 
	 * <pre>
	 *   EntityManagerHelper.beginTransaction();
	 *   entity = AdmSessionsDAO.update(entity);
	 *   EntityManagerHelper.commit();
	 * </pre>
	   @param entity AdmSessions entity to update
	 @returns AdmSessions the persisted AdmSessions entity instance, may not be the same
	 @throws RuntimeException if the operation fails
	 */
    public AdmSessions update(AdmSessions entity) {
    				EntityManagerHelper.log("updating AdmSessions instance", Level.INFO, null);
	        try {
            AdmSessions result = getEntityManager().merge(entity);
            			EntityManagerHelper.log("update successful", Level.INFO, null);
	            return result;
        } catch (RuntimeException re) {
        				EntityManagerHelper.log("update failed", Level.SEVERE, re);
	            throw re;
        }
    }
    
    public AdmSessions findById( Integer id) {
    				EntityManagerHelper.log("finding AdmSessions instance with id: " + id, Level.INFO, null);
	        try {
            AdmSessions instance = getEntityManager().find(AdmSessions.class, id);
            return instance;
        } catch (RuntimeException re) {
        				EntityManagerHelper.log("find failed", Level.SEVERE, re);
	            throw re;
        }
    }    
    

/**
	 * Find all AdmSessions entities with a specific property value.  
	 
	  @param propertyName the name of the AdmSessions property to query
	  @param value the property value to match
	  	  @return List<AdmSessions> found by query
	 */
    @SuppressWarnings("unchecked")
    public List<AdmSessions> findByProperty(String propertyName, final Object value
        ) {
    				EntityManagerHelper.log("finding AdmSessions instance with property: " + propertyName + ", value: " + value, Level.INFO, null);
			try {
			final String queryString = "select model from AdmSessions model where model." 
			 						+ propertyName + "= :propertyValue";
								System.out.println("QUERY CARAMBA"+queryString);
								Query query = getEntityManager().createQuery(queryString);
								
					query.setParameter("propertyValue", value);
					return query.getResultList();
		} catch (RuntimeException re) {
						EntityManagerHelper.log("find by property name failed", Level.SEVERE, re);
				throw re;
		}
	}			
	public List<AdmSessions> findBySesionTv(Object sesionTv
	) {
		return findByProperty(SESION_TV, sesionTv
		);
	}
	
	public List<AdmSessions> findBySesionInt(Object sesionInt
	) {
		return findByProperty(SESION_INT, sesionInt
		);
	}
	
	public List<AdmSessions> findBySesionTel(Object sesionTel
	) {
		return findByProperty(SESION_TEL, sesionTel
		);
	}
	
	public List<AdmSessions> findBySesionUsuario(Object sesionUsuario
	) {
		return findByProperty(SESION_USUARIO, sesionUsuario
		);
	}
	
	public List<AdmSessions> findBySessionUsuarioMaquina(Object sessionUsuarioMaquina
	) {
		return findByProperty(SESSION_USUARIO_MAQUINA, sessionUsuarioMaquina
		);
	}
	
	public List<AdmSessions> findBySessionReportType(Object sessionReportType
	) {
		return findByProperty(SESSION_REPORT_TYPE, sessionReportType
		);
	}
	
	
	/**
	 * Find all AdmSessions entities.
	  	  @return List<AdmSessions> all AdmSessions entities
	 */
	@SuppressWarnings("unchecked")
	public List<AdmSessions> findAll(
		) {
					EntityManagerHelper.log("finding all AdmSessions instances", Level.INFO, null);
			try {
			final String queryString = "select model from AdmSessions model";
								Query query = getEntityManager().createQuery(queryString);
					return query.getResultList();
		} catch (RuntimeException re) {
						EntityManagerHelper.log("find all failed", Level.SEVERE, re);
				throw re;
		}
	}
	
	/**
	 * Find all AdmSessions entities.
	  	  @return List<AdmSessions> all AdmSessions entities
	 */
	@SuppressWarnings("unchecked")
	public List<AdmSessions> sessionid (
		) {
					EntityManagerHelper.log("finding all AdmSessions instances", Level.INFO, null);
			try {
			final String queryString = "select model from AdmSessions model where model.sesionTvFecha is null and model.sesionTv <> 0 order by model.sesionTv ";
			System.out.println("Query"+queryString);
								Query query = getEntityManager().createQuery(queryString);
					return query.getResultList();
		} catch (RuntimeException re) {
						EntityManagerHelper.log("find all failed", Level.SEVERE, re);
				throw re;
		}
	}
	
	@SuppressWarnings("unchecked")
	public Integer admsesion (Integer sesIdTv) {
					EntityManagerHelper.log("finding all AdmSessions instances", Level.INFO, null);
			try {
			final String queryString = "select model.id from AdmSessions model where model.sesionTv = "
				+ sesIdTv;
			System.out.println("Query"+queryString);
								Query query = getEntityManager().createQuery(queryString);
					return (Integer) query.getSingleResult();
		} catch (RuntimeException re) {
						EntityManagerHelper.log("find all failed", Level.SEVERE, re);
				throw re;
		}
	}
	
	//SELECT sesion_tv FROM adm_sessions a where a.sesion_tv_fecha is null and sesion_tv !=0 order by sesion_tv limit 1 ;
	
}