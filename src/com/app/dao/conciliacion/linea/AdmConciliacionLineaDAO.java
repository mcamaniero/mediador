package com.app.dao.conciliacion.linea;

import java.util.List;
import java.util.logging.Level;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.app.dao.EntityManagerHelper;

/**
 	* A data access object (DAO) providing persistence and search support for AdmConciliacionLinea entities.
 	 		* Transaction control of the save(), update() and delete() operations must be handled externally by senders of these methods 
 		  or must be manually added to each of these methods for data to be persisted to the JPA datastore.	
 	 * @see com.app.dao.conciliacion.linea.AdmConciliacionLinea
  * @author MyEclipse Persistence Tools 
 */

public class AdmConciliacionLineaDAO  implements IAdmConciliacionLineaDAO{
	//property constants
	public static final String CIUDAD = "ciudad";
	public static final String CLIENTECRM = "clientecrm";
	public static final String IDPRODUCTO = "idproducto";
	public static final String IDPRODUCTOCM = "idproductocm";
	public static final String MAC_T = "macT";
	public static final String MTAMAC_T = "mtamacT";
	public static final String SERVICEPACKAGE_T = "servicepackageT";
	public static final String CPS_T = "cpsT";
	public static final String FONO_T = "fonoT";
	public static final String HOMEEXCHANGE_T = "homeexchangeT";
	public static final String ESTADO_T = "estadoT";
	public static final String MAC_IW = "macIw";
	public static final String MTAMAC_IW = "mtamacIw";
	public static final String SERVICEPACKAGE_IW = "servicepackageIw";
	public static final String CPS_IW = "cpsIw";
	public static final String FONO_IW = "fonoIw";
	public static final String HOMEEXCHANGE_IW = "homeexchangeIw";
	public static final String ESTADO_IW = "estadoIw";
	public static final String SESION = "sesion";
	public static final String TIPO = "tipo";





	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}	
	
		/**
	 Perform an initial save of a previously unsaved AdmConciliacionLinea entity. 
	 All subsequent persist actions of this entity should use the #update() method.
	 This operation must be performed within the a database transaction context for the entity's data to be permanently saved to the persistence store, i.e., database. 
	 This method uses the {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist} operation.
	 	 
	 * <pre> 
	 *   EntityManagerHelper.beginTransaction();
	 *   AdmConciliacionLineaDAO.save(entity);
	 *   EntityManagerHelper.commit();
	 * </pre>
	   @param entity AdmConciliacionLinea entity to persist
	  @throws RuntimeException when the operation fails
	 */
    public void save(AdmConciliacionLinea entity) {
    		try {
            getEntityManager().persist(entity);
            } catch (RuntimeException re) {
        				EntityManagerHelper.log("save failed", Level.SEVERE, re);
	            throw re;
        }
    }
    
    /**
	 Delete a persistent AdmConciliacionLinea entity.
	  This operation must be performed 
	 within the a database transaction context for the entity's data to be
	 permanently deleted from the persistence store, i.e., database. 
	 This method uses the {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete} operation.
	 	  
	 * <pre>
	 *   EntityManagerHelper.beginTransaction();
	 *   AdmConciliacionLineaDAO.delete(entity);
	 *   EntityManagerHelper.commit();
	 *   entity = null;
	 * </pre>
	   @param entity AdmConciliacionLinea entity to delete
	 @throws RuntimeException when the operation fails
	 */
    public void delete(AdmConciliacionLinea entity) {
    				EntityManagerHelper.log("deleting AdmConciliacionLinea instance", Level.INFO, null);
	        try {
        	entity = getEntityManager().getReference(AdmConciliacionLinea.class, entity.getId());
            getEntityManager().remove(entity);
            			EntityManagerHelper.log("delete successful", Level.INFO, null);
	        } catch (RuntimeException re) {
        				EntityManagerHelper.log("delete failed", Level.SEVERE, re);
	            throw re;
        }
    }
    
    /**
	 Persist a previously saved AdmConciliacionLinea entity and return it or a copy of it to the sender. 
	 A copy of the AdmConciliacionLinea entity parameter is returned when the JPA persistence mechanism has not previously been tracking the updated entity. 
	 This operation must be performed within the a database transaction context for the entity's data to be permanently saved to the persistence
	 store, i.e., database. This method uses the {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge} operation.
	 	 
	 * <pre>
	 *   EntityManagerHelper.beginTransaction();
	 *   entity = AdmConciliacionLineaDAO.update(entity);
	 *   EntityManagerHelper.commit();
	 * </pre>
	   @param entity AdmConciliacionLinea entity to update
	 @returns AdmConciliacionLinea the persisted AdmConciliacionLinea entity instance, may not be the same
	 @throws RuntimeException if the operation fails
	 */
    public AdmConciliacionLinea update(AdmConciliacionLinea entity) {
    		try {
            AdmConciliacionLinea result = getEntityManager().merge(entity);
                return result;
        } catch (RuntimeException re) {
        				EntityManagerHelper.log("update failed", Level.SEVERE, re);
	            throw re;
        }
    }
    
    public AdmConciliacionLinea findById( Integer id) {
    		try {
            AdmConciliacionLinea instance = getEntityManager().find(AdmConciliacionLinea.class, id);
            return instance;
        } catch (RuntimeException re) {
        				EntityManagerHelper.log("find failed", Level.SEVERE, re);
	            throw re;
        }
    }    
    

/**
	 * Find all AdmConciliacionLinea entities with a specific property value.  
	 
	  @param propertyName the name of the AdmConciliacionLinea property to query
	  @param value the property value to match
	  	  @return List<AdmConciliacionLinea> found by query
	 */
    @SuppressWarnings("unchecked")
    public List<AdmConciliacionLinea> findByProperty(String propertyName, final Object value
        ) {
    		try {
			final String queryString = "select model from AdmConciliacionLinea model where model." 
			 						+ propertyName + "= :propertyValue";
								Query query = getEntityManager().createQuery(queryString);
					query.setParameter("propertyValue", value);
					return query.getResultList();
		} catch (RuntimeException re) {
						EntityManagerHelper.log("find by property name failed", Level.SEVERE, re);
				throw re;
		}
	}			
	public List<AdmConciliacionLinea> findByCiudad(Object ciudad
	) {
		return findByProperty(CIUDAD, ciudad
		);
	}
	
	public List<AdmConciliacionLinea> findByClientecrm(Object clientecrm
	) {
		return findByProperty(CLIENTECRM, clientecrm
		);
	}
	
	public List<AdmConciliacionLinea> findByIdproducto(Object idproducto
	) {
		return findByProperty(IDPRODUCTO, idproducto
		);
	}
	
	public List<AdmConciliacionLinea> findByIdproductocm(Object idproductocm
	) {
		return findByProperty(IDPRODUCTOCM, idproductocm
		);
	}
	
	public List<AdmConciliacionLinea> findByMacT(Object macT
	) {
		return findByProperty(MAC_T, macT
		);
	}
	
	public List<AdmConciliacionLinea> findByMtamacT(Object mtamacT
	) {
		return findByProperty(MTAMAC_T, mtamacT
		);
	}
	
	public List<AdmConciliacionLinea> findByServicepackageT(Object servicepackageT
	) {
		return findByProperty(SERVICEPACKAGE_T, servicepackageT
		);
	}
	
	public List<AdmConciliacionLinea> findByCpsT(Object cpsT
	) {
		return findByProperty(CPS_T, cpsT
		);
	}
	
	public List<AdmConciliacionLinea> findByFonoT(Object fonoT
	) {
		return findByProperty(FONO_T, fonoT
		);
	}
	
	public List<AdmConciliacionLinea> findByHomeexchangeT(Object homeexchangeT
	) {
		return findByProperty(HOMEEXCHANGE_T, homeexchangeT
		);
	}
	
	public List<AdmConciliacionLinea> findByEstadoT(Object estadoT
	) {
		return findByProperty(ESTADO_T, estadoT
		);
	}
	
	public List<AdmConciliacionLinea> findByMacIw(Object macIw
	) {
		return findByProperty(MAC_IW, macIw
		);
	}
	
	public List<AdmConciliacionLinea> findByMtamacIw(Object mtamacIw
	) {
		return findByProperty(MTAMAC_IW, mtamacIw
		);
	}
	
	public List<AdmConciliacionLinea> findByServicepackageIw(Object servicepackageIw
	) {
		return findByProperty(SERVICEPACKAGE_IW, servicepackageIw
		);
	}
	
	public List<AdmConciliacionLinea> findByCpsIw(Object cpsIw
	) {
		return findByProperty(CPS_IW, cpsIw
		);
	}
	
	public List<AdmConciliacionLinea> findByFonoIw(Object fonoIw
	) {
		return findByProperty(FONO_IW, fonoIw
		);
	}
	
	public List<AdmConciliacionLinea> findByHomeexchangeIw(Object homeexchangeIw
	) {
		return findByProperty(HOMEEXCHANGE_IW, homeexchangeIw
		);
	}
	
	public List<AdmConciliacionLinea> findByEstadoIw(Object estadoIw
	) {
		return findByProperty(ESTADO_IW, estadoIw
		);
	}
	
	public List<AdmConciliacionLinea> findBySesion(Object sesion
	) {
		return findByProperty(SESION, sesion
		);
	}
	
	
	/**
	 * Find all AdmConciliacionLinea entities.
	  	  @return List<AdmConciliacionLinea> all AdmConciliacionLinea entities
	 */
	@SuppressWarnings("unchecked")
	public List<AdmConciliacionLinea> findAll(
		) {
					EntityManagerHelper.log("finding all AdmConciliacionLinea instances", Level.INFO, null);
			try {
			final String queryString = "select model from AdmConciliacionLinea model";
								Query query = getEntityManager().createQuery(queryString);
					return query.getResultList();
		} catch (RuntimeException re) {
						EntityManagerHelper.log("find all failed", Level.SEVERE, re);
				throw re;
		}
	}
	
	
	public List<AdmConciliacionLinea> findByProperty(String propertyName, final Object value,
			String propertyName2, final Object value2,
			String propertyName3, final Object value3,
			String propertyName4, final Object value4
	) {
		try {
			final String queryString = "select model from AdmConciliacionLinea model where model." 
				+ propertyName + "= :propertyValue and model."+propertyName2+"= :propertyValue2 "
				+ "and model."+propertyName3 + "= :propertyValue3";
			
			Query query = getEntityManager().createQuery(queryString);
			query.setParameter("propertyValue", value);
			query.setParameter("propertyValue2", value2);
			query.setParameter("propertyValue3", value3);
			
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find by property name failed", Level.SEVERE, re);
			throw re;
		}
	}
	
	
}