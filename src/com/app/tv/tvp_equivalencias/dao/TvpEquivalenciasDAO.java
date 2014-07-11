package com.app.tv.tvp_equivalencias.dao;

import com.app.dao.EntityManagerHelper;
import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * TvpEquivalencias entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see com.app.tv.tvp_equivalencias.dao.TvpEquivalencias
 * @author MyEclipse Persistence Tools
 */

public class TvpEquivalenciasDAO implements ITvpEquivalenciasDAO {
	// property constants
	public static final String CODIGO_TITAN = "codigoTitan";
	public static final String CODIGO_INTERNO = "codigoInterno";
	public static final String TCONTROLADOR = "tcontrolador";
	public static final String TEQUIVALENCIA = "tequivalencia";
	public static final String CPRINCIPAL = "cprincipal";
	public static final String CADICIONAL = "cadicional";
	public static final String COD_INT = "codInt";
	public static final String CIUDADSERVICIO = "ciudadServicio";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TvpEquivalencias entity.
	 * All subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TvpEquivalenciasDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TvpEquivalencias entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TvpEquivalencias entity) {
		try {
			getEntityManager().persist(entity);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	/**
	 * Delete a persistent TvpEquivalencias entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TvpEquivalenciasDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TvpEquivalencias entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TvpEquivalencias entity) {
		try {
			entity = getEntityManager().getReference(TvpEquivalencias.class,
					entity.getId());
			getEntityManager().remove(entity);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	/**
	 * Persist a previously saved TvpEquivalencias entity and return it or a
	 * copy of it to the sender. A copy of the TvpEquivalencias entity parameter
	 * is returned when the JPA persistence mechanism has not previously been
	 * tracking the updated entity. This operation must be performed within the
	 * a database transaction context for the entity's data to be permanently
	 * saved to the persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TvpEquivalenciasDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TvpEquivalencias entity to update
	 * @returns TvpEquivalencias the persisted TvpEquivalencias entity instance,
	 *          may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TvpEquivalencias update(TvpEquivalencias entity) {
		try {
			TvpEquivalencias result = getEntityManager().merge(entity);
			return result;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public TvpEquivalencias findById(Integer id) {
		try {
			TvpEquivalencias instance = getEntityManager().find(
					TvpEquivalencias.class, id);
			return instance;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	/**
	 * Find all TvpEquivalencias entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TvpEquivalencias property to query
	 * @param value
	 *            the property value to match
	 * @return List<TvpEquivalencias> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TvpEquivalencias> findByProperty(String propertyName,
			final Object value) {
		try {
			final String queryString = "select model from TvpEquivalencias model where model."
					+ propertyName + "= :propertyValue";
			Query query = getEntityManager().createQuery(queryString);
			query.setParameter("propertyValue", value);
			return query.getResultList();
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public List<TvpEquivalencias> findByCodigoTitan(Object codigoTitan) {
		return findByProperty(CODIGO_TITAN, codigoTitan);
	}

	public List<TvpEquivalencias> findByCodigoInterno(Object codigoInterno) {
		return findByProperty(CODIGO_INTERNO, codigoInterno);
	}

	public List<TvpEquivalencias> findByTcontrolador(Object tcontrolador) {
		return findByProperty(TCONTROLADOR, tcontrolador);
	}

	public List<TvpEquivalencias> findByTequivalencia(Object tequivalencia) {
		return findByProperty(TEQUIVALENCIA, tequivalencia);
	}

	public List<TvpEquivalencias> findByCprincipal(Object cprincipal) {
		return findByProperty(CPRINCIPAL, cprincipal);
	}

	public List<TvpEquivalencias> findByCadicional(Object cadicional) {
		return findByProperty(CADICIONAL, cadicional);
	}

	public List<TvpEquivalencias> findByCodInt(Object codInt) {
		return findByProperty(COD_INT, codInt);
	}

	/**
	 * Find all TvpEquivalencias entities.
	 * 
	 * @return List<TvpEquivalencias> all TvpEquivalencias entities
	 */
	@SuppressWarnings("unchecked")
	public List<TvpEquivalencias> findAll() {
		try {
			final String queryString = "select model from TvpEquivalencias model";
			Query query = getEntityManager().createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public List<TvpEquivalencias> findByTwoProperties(String propertyName,
			int value, String propertyName1, int value1) {
		// TODO Auto-generated method stub
				try {
					final String queryString = "select model from TvpEquivalencias model where model."
							+ propertyName + "= :propertyValue" + " and model." + propertyName1 
							+ "= :propertyValue1" ;
					

					Query query = getEntityManager().createQuery(queryString);
					query.setParameter("propertyValue", value);
					query.setParameter("propertyValue1", value1);
					return query.getResultList();
				} catch (RuntimeException re) {
					throw re;
				}
   		
	}
	
	public List<TvpEquivalencias> findByServicios(String propertyName,
			int value, String propertyName1, int value1, String propertyName2, Integer value2, String propertyName3, String value3) {
		// TODO Auto-generated method stub
				try {
					final String queryString = "select model from TvpEquivalencias model where model."
							+ propertyName  + "= :propertyValue" + " and model." 
							+ propertyName1 + "= :propertyValue1" + " and model." 
					        + propertyName2 + "= :propertyValue2" + " and model."
					        + propertyName3 + "= :propertyValue3";
					
					//System.out.println(queryString);
					Query query = getEntityManager().createQuery(queryString);
					query.setParameter("propertyValue", value);
					query.setParameter("propertyValue1", value1);
					query.setParameter("propertyValue2", value2);
					query.setParameter("propertyValue3", value3);

					return query.getResultList();
				} catch (RuntimeException re) {
					throw re;
				}
   		
	}

	public List<TvpEquivalencias> findAllServiciosGroupBy(String propertyName,
			int value, String propertyName1, String c) {
		// TODO Auto-generated method stub
				try {
					final String queryString = "select distinct model.codigoTitan, count(model.codigoTitan), model from TvpEquivalencias model where model."
							+ propertyName  + "= :propertyValue" + " and model." 
							+ propertyName1 + "= :propertyValue1"
							+ " GROUP BY model.codigoTitan";
					
					Query query = getEntityManager().createQuery(queryString);
					
					query.setParameter("propertyValue", value);
					query.setParameter("propertyValue1", c);

					return query.getResultList();
				} catch (RuntimeException re) {
					throw re;
				}
   		
	}
	

	public List<TvpEquivalencias> findAllServiciosCodInt(String ciudad,
			int value, String servicioTitan, int value1) {
		// TODO Auto-generated method stub
				try {
					final String queryString = "select model from TvpEquivalencias model where model."
							+ ciudad  + "= :propertyValue" + " and model." 
							+ servicioTitan + "= :propertyValue1" + " order by model.codigoInterno";
					/*if (servicioTitan == "307")
					{
						System.out.println("ServiciosGroupBy-"+queryString);
					}*/
					Query query = getEntityManager().createQuery(queryString);
					query.setParameter("propertyValue", value);
					query.setParameter("propertyValue1", value1);

					return query.getResultList();
				} catch (RuntimeException re) {
					throw re;
				}
	}
	
	public List<TvpEquivalencias> findByCodInt (String ciudad,
			int value, String servicioTitan, int value1, String codigoInterno, int value2 ) {
		// TODO Auto-generated method stub
				try {
					final String queryString = "select model from TvpEquivalencias model where model."
							+ ciudad  + "= :propertyValue" + " and model." 
							+ servicioTitan + "= :propertyValue1 and model." 
							+ codigoInterno + "= :propertyValue2"
							+ " order by model.codigoInterno";
					
					//System.out.println("ServiciosGroupBy-"+queryString);
					Query query = getEntityManager().createQuery(queryString);
					query.setParameter("propertyValue", value);
					query.setParameter("propertyValue1", value1);
					query.setParameter("propertyValue2", value2);

					return query.getResultList();
				} catch (RuntimeException re) {
					throw re;
				}
	}
	
	public List<TvpEquivalencias> findAllPayChannelsCodInt(String ciudad,
			int value) {
		// TODO Auto-generated method stub
				try {
					/*final String queryString = "select distinct model.codigoTitan from TvpEquivalencias model where model."
							+ ciudad  + "= :propertyValue" //+ " and model." 
							//+ servicioTitan + "= :propertyValue1" 
							+ " and model.tequivalencia = 'P'"
							+ " order by model.codigoInterno";
					        */
					
					//final String queryString = "select distinct model.codigoInterno, count(model.codigoInterno), model from TvpEquivalencias model where model."
					final String queryString = "select model.codigoInterno from TvpEquivalencias model where model."
						+ ciudad  + "= :propertyValue" + " and model.tequivalencia = 'P'" 
	        			+ " GROUP BY model.codigoInterno";
					
					//System.out.println("ServiciosGroupBy"+queryString);
					Query query = getEntityManager().createQuery(queryString);
					
					query.setParameter("propertyValue", value);
					//query.setParameter("propertyValue1", value1);

					return query.getResultList();
				} catch (RuntimeException re) {
					throw re;
				}
   		
	}
	
	
	
	public List<TvpEquivalencias> findByServiciosPayChannels(String propertyName,
			int value, String propertyName1, int value1, String propertyName2, Integer value2) {
		// TODO Auto-generated method stub
				try {
					final String queryString = "select model from TvpEquivalencias model where model."
							+ propertyName  + "= :propertyValue" + " and model." 
							+ propertyName1 + "= :propertyValue1" + " and model." 
					        + propertyName2 + "= :propertyValue2" ;
					//System.out.println(queryString);
					Query query = getEntityManager().createQuery(queryString);
					query.setParameter("propertyValue", value);
					query.setParameter("propertyValue1", value1);
					query.setParameter("propertyValue2", value2);

					return query.getResultList();
				} catch (RuntimeException re) {
					throw re;
				}
   		
	}
	
	
	public List<TvpEquivalencias> findByThreePropertiesString(String propertyName,
			int value, String propertyName1, String value1, String propertyName2, int value2) {
		// TODO Auto-generated method stub
				try {
					final String queryString = "select model from TvpEquivalencias model where model."
							+ propertyName + "= :propertyValue" + " and model." 
							+ propertyName1 + "= :propertyValue1" + " and model."
							+ propertyName2 + "= :propertyValue2" + " and model."
					        + "ciudadServicio = 94";
					//System.out.println("Query para Eventos"+queryString);
					//System.out.println("Query para Eventos-"+value);
					//System.out.println("Query para Eventos-"+value1);
					//System.out.println("Query para Eventos-"+value2);
					Query query = getEntityManager().createQuery(queryString);
					query.setParameter("propertyValue", value);
					query.setParameter("propertyValue1", value1);
					query.setParameter("propertyValue2", value2);
										
					return query.getResultList();
				} catch (RuntimeException re) {
					throw re;
				}
   		
	}
	//consulta datos de base segun tres propiedades, usado para traer servicios DAC-ACC
	public List<TvpEquivalencias> findByThreeProperties(String propertyName,
			int value, String propertyName1, int value1, String propertyName2, String value2) {
		// TODO Auto-generated method stub
				try { 
					
					final String queryString = "select model from TvpEquivalencias model where model."
							+ propertyName + "= :propertyValue" + " and model." + propertyName1 
							+ "= :propertyValue1" + " and model." + propertyName2 + "= :propertyValue2" 
							+ " and model.codInt = :propertyValue3" 
							+ " and model.tequivalencia <> 'C'";
					String propertyValue3 = "codInt";
					//System.out.println("String"+queryString);
					Query query = getEntityManager().createQuery(queryString);
					query.setParameter("propertyValue", value);
					query.setParameter("propertyValue1", value1);
					query.setParameter("propertyValue2", value2);
					query.setParameter("propertyValue3", 1);
					return query.getResultList();
				} catch (RuntimeException re) {
					throw re;
				}
   		
	}
	
	
	//consulta datos de base segun tres propiedades, usado para traer servicios DAC-ACC todos sus paquetes
	
	public List<TvpEquivalencias> findByThreePropertiesSP(String propertyName,
			int value, String propertyName1, int value1, String propertyName2, String value2, String propertyName3, int value3) {
		// TODO Auto-generated method stub
				try { 
					
					final String queryString = "select model from TvpEquivalencias model where model."
							+ propertyName + "= :propertyValue" + " and model." + propertyName1 
							+ "= :propertyValue1" + " and model." + propertyName2 + "= :propertyValue2" 
							+ " and model."+propertyName3 + "= :propertyValue3" ;
							//+ " and model.codInt = :propertyValue3" ;
				
					//System.out.println(value+"String+++ "+queryString);
					//System.out.println(value+"String+++ "+value);
					//System.out.println(value+"String+++ "+value1);
					//System.out.println(value+"String+++ "+value2);
					//System.out.println(value+"String+++ "+value3);
					String propertyValue3 = "codInt";
					Query query = getEntityManager().createQuery(queryString);
					query.setParameter("propertyValue", value);
					query.setParameter("propertyValue1", value1);
					query.setParameter("propertyValue2", value2);
					query.setParameter("propertyValue3", value3);
					//query.setParameter("propertyValue3", 1);
					return query.getResultList();
				} catch (RuntimeException re) {
					throw re;
				}
   		
	}
	
	//consulta datos de base segun tres propiedades Encontrar Servicio, 
	// usado para traer servicios ACC Cuenca-Machala
	public List<TvpEquivalencias> findByThreePropertiesCiudad(String propertyName,
			int value, String propertyName1, int value1, String propertyName2, String value2, String propertyName3, int value3) {
		// TODO Auto-generated method stub
				try { 
					
					final String queryString = "select model from TvpEquivalencias model where model."
							+ propertyName + "= :propertyValue" + " and model." + propertyName1 
							+ "= :propertyValue1" + " and model." + propertyName2 + "= :propertyValue2" 
							+ " and model.codInt = :propertyValue3" + " and model."
							+ propertyName3 + "= :propertyValue4";
				
					String propertyValue3 = "codInt";
					//System.out.println("Query"+queryString);
					Query query = getEntityManager().createQuery(queryString);
					query.setParameter("propertyValue", value);
					query.setParameter("propertyValue1", value1);
					query.setParameter("propertyValue2", value2);
					query.setParameter("propertyValue3", 1);
					query.setParameter("propertyValue4", value3);
					return query.getResultList();
				} catch (RuntimeException re) {
					throw re;
				}
   		
	}
	//consulta datos de base segun tres propiedades, usado para traer servicios DALVI
	public List<TvpEquivalencias> findByThreePropertiesDALVI(String propertyName,
			int value, String propertyName1, int value1, String propertyName2, String value2, String propertyName4, 
			int value4) {
		// TODO Auto-generated method stub
				try { 
					
					final String queryString = "select model from TvpEquivalencias model where model."
							+ propertyName + "= :propertyValue" + " and model." + propertyName1 
							+ "= :propertyValue1" + " and model." + propertyName2 + "= :propertyValue2" 
							+ " and model.codInt = :propertyValue3" + " and model." + 
							propertyName4 + "= :propertyValue4";
				
					String propertyValue3 = "codInt";
					Query query = getEntityManager().createQuery(queryString);
					query.setParameter("propertyValue", value);
					query.setParameter("propertyValue1", value1);
					query.setParameter("propertyValue2", value2);
					query.setParameter("propertyValue3", 1);
					query.setParameter("propertyValue4", value4);
					return query.getResultList();
				} catch (RuntimeException re) {
					throw re;
				}
   		
	}
	public List<TvpEquivalencias> findByFourProperties(String propertyName,
			int value, String propertyName1, int value1, String propertyName2, String value2, String propertyName3, int value3) {
		// TODO Auto-generated method stub
				try {
					final String queryString = "select model from TvpEquivalencias model where model."
							+ propertyName + "= :propertyValue" + " and model." + propertyName1 
							+ "= :propertyValue1" + " and model." + propertyName2 + "= :propertyValue2" 
							+ " and model." + propertyName3 + "<> :propertyValue3";
					Query query = getEntityManager().createQuery(queryString);
					query.setParameter("propertyValue", value);
					query.setParameter("propertyValue1", value1);
					query.setParameter("propertyValue2", value2);
					query.setParameter("propertyValue3", value3);
					return query.getResultList();
				} catch (RuntimeException re) {
					throw re;
				}
   		
	}
								  
	public List<TvpEquivalencias> findByThreePropertiesFull(String propertyName,
			int value, String propertyName1, String value1, String propertyName2, int value2) {
		// TODO Auto-generated method stub
				try {
					final String queryString = "select model from TvpEquivalencias model where model."
							+ propertyName + "= :propertyValue" + " and model." + propertyName1 
							+ "= :propertyValue1" + " and model." + propertyName2 + "<> :propertyValue2" ;
					Query query = getEntityManager().createQuery(queryString);
					query.setParameter("propertyValue", value);
					query.setParameter("propertyValue1", value1);
					query.setParameter("propertyValue2", value2);
					return query.getResultList();
				} catch (RuntimeException re) {
					throw re;
				}
   		
	}
	public List<TvpEquivalencias> findByThreePropertiesPackage(String propertyName,
			int value, String propertyName1, String value1, String propertyName2, int value2) {
		// TODO Auto-generated method stub
		//		EntityManagerHelper.log(
		//				"findByThreePropertiesString finding TvpEquivalencias instance with properties: "
		//						+ propertyName + ", value:++ " + value + propertyName1 + ", value1: " +value1
		//						+ propertyName2 + ", value2: " +value2
		//						, Level.INFO, null);
				try {
					final String queryString = "select model from TvpEquivalencias model where model."
							+ propertyName + "= :propertyValue" + " and model." 
							+ propertyName1 + "= :propertyValue1" + " and model."
							+ propertyName2 + "= :propertyValue2"
							+ " and model.codInt = :propertyValue3" ;

					Query query = getEntityManager().createQuery(queryString);
					String propertyValue3 = "codInt";
					query.setParameter("propertyValue", value);
					query.setParameter("propertyValue1", value1);
					query.setParameter("propertyValue2", value2);
					query.setParameter("propertyValue3",0);
					return query.getResultList();
				} catch (RuntimeException re) {
					EntityManagerHelper.log("find by property name failed",
							Level.SEVERE, re);
					throw re;
				}
   		
	}
	public List<TvpEquivalencias> findByThreePropertiesPackageTitan(String propertyName,
			int value, String propertyName1, String value1, String propertyName2, int value2) {
		// TODO Auto-generated method stub
				//EntityManagerHelper.log(
				//		"findByThreePropertiesString finding TvpEquivalencias instance with properties: "
				//				+ propertyName + ", value:++ " + value + propertyName1 + ", value1: " +value1
				//				+ propertyName2 + ", value2: " +value2
				//				, Level.INFO, null);
				try {
					final String queryString = "select model from TvpEquivalencias model where model."
							+ propertyName + "= :propertyValue" + " and model." 
							+ propertyName1 + "= :propertyValue1" + " and model."
							+ propertyName2 + "= :propertyValue2"
							+ " and model.codInt = :propertyValue3" ;
					Query query = getEntityManager().createQuery(queryString);
					String propertyValue3 = "codInt";
					query.setParameter("propertyValue", value);
					query.setParameter("propertyValue1", value1);
					query.setParameter("propertyValue2", value2);
					query.setParameter("propertyValue3",1	);
					return query.getResultList();
				} catch (RuntimeException re) {
					EntityManagerHelper.log("find by property name failed",
							Level.SEVERE, re);
					throw re;
				}
   		
	}
	
	
	public List<TvpEquivalencias> findByThreePropertiesPackageTitanDigital(String propertyName,
			int value, String propertyName1, String value1, String propertyName2, int value2) {
		// TODO Auto-generated method stub
				//EntityManagerHelper.log(
				//		"findByThreePropertiesString finding TvpEquivalencias instance with properties: "
				//				+ propertyName + ", value:++ " + value + propertyName1 + ", value1: " +value1
				//				+ propertyName2 + ", value2: " +value2
				//				, Level.INFO, null);
				try {
					final String queryString = "select model from TvpEquivalencias model where model."
							+ propertyName + "= :propertyValue" + " and model." 
							+ propertyName1 + "= :propertyValue1" + " and model."
							+ propertyName2 + "= :propertyValue2"
							+ " and model.codInt = :propertyValue3" ;
					Query query = getEntityManager().createQuery(queryString);
					String propertyValue3 = "codInt";
					query.setParameter("propertyValue", value);
					query.setParameter("propertyValue1", value1);
					query.setParameter("propertyValue2", value2);
					query.setParameter("propertyValue3",1	);
					return query.getResultList();
				} catch (RuntimeException re) {
					EntityManagerHelper.log("find by property name failed",
							Level.SEVERE, re);
					throw re;
				}
   		
	}
	
	public List<TvpEquivalencias> findByThreePropertiesPackageControlador(String propertyName,
			int value, String propertyName1, String value1, String propertyName2, int value2) {
		// TODO Auto-generated method stub
				//EntityManagerHelper.log(
				//		"findByThreePropertiesString finding TvpEquivalencias instance with properties: "
				//				+ propertyName + ", value:++ " + value + propertyName1 + ", value1: " +value1
				//				+ propertyName2 + ", value2: " +value2
				//				, Level.INFO, null);
				try {
					final String queryString = "select model from TvpEquivalencias model where model."
							+ propertyName + "= :propertyValue" + " and model." 
							+ propertyName1 + "= :propertyValue1" + " and model."
							+ propertyName2 + "= :propertyValue2"
							+ " and model.codInt = :propertyValue3" ;
					Query query = getEntityManager().createQuery(queryString);
					String propertyValue3 = "codInt";
					query.setParameter("propertyValue", value);
					query.setParameter("propertyValue1", value1);
					query.setParameter("propertyValue2", value2);
					query.setParameter("propertyValue3",0	);
					return query.getResultList();
				} catch (RuntimeException re) {
					EntityManagerHelper.log("find by property name failed",
							Level.SEVERE, re);
					throw re;
				}
   		
	}
	public List<TvpEquivalencias> findByThreePropertiesPackageDigitalControlador(String propertyName,
			int value, String propertyName1, String value1, String propertyName2, int value2, String propertyName3, int value3) {
		// TODO Auto-generated method stub
				//EntityManagerHelper.log(
				//		"findByThreePropertiesString finding TvpEquivalencias instance with properties: "
				//				+ propertyName + ", value:++ " + value + propertyName1 + ", value1: " +value1
				//				+ propertyName2 + ", value2: " +value2
				//				, Level.INFO, null);
				try {
					final String queryString = "select model from TvpEquivalencias model where model."
							+ propertyName + "= :propertyValue" + " and model." 
							+ propertyName1 + "= :propertyValue1" + " and model."
							+ propertyName2 + "= :propertyValue2"
							+ " and model.codInt = :propertyValue3" + " and model."
							+ propertyName3 + "= :propertyValue4";
					Query query = getEntityManager().createQuery(queryString);
					String propertyValue3 = "codInt";
					query.setParameter("propertyValue", value);
					query.setParameter("propertyValue1", value1);
					query.setParameter("propertyValue2", value2);
					query.setParameter("propertyValue3",0	);
					query.setParameter("propertyValue4",value3	);
					return query.getResultList();
				} catch (RuntimeException re) {
					EntityManagerHelper.log("find by property name failed",
							Level.SEVERE, re);
					throw re;
				}
   		
	}
	
	
	public List<TvpEquivalencias> findByContarCodigos(String Servicio, int codigoServicio, String Ciudad, int codigoCiudad) {
		// TODO Auto-generated method stub
				try {
					final String queryString = "select count(model) from TvpEquivalencias model where model."
							+ Servicio + "= :propertyValue" + " and model." 
							+ Ciudad + "= :propertyValue1" + " and model.tcontrolador = 100" ;
					/*if (codigoServicio == 202)
					{
						System.out.println("queryString"+queryString);
					}*/
					Query query = getEntityManager().createQuery(queryString);
					query.setParameter("propertyValue", codigoServicio);
					query.setParameter("propertyValue1", codigoCiudad);					
					return query.getResultList();
				} catch (RuntimeException re) {
					throw re;
				}
   		
	}
	
	
	public List<TvpEquivalencias> findByFourPropertiesFull(String ServicioTitan,
			int servicioTitan, String Equivalencia, String tequivalencia, String CodigoInterno,
			int servicio, String Controlador, int controlador, String Ciudad, int ciudad) {
		// TODO Auto-generated method stub
		try {
			final String queryString = "select model from TvpEquivalencias model where model."
					+ ServicioTitan + "= :propertyValue" + " and model." 
					+ Equivalencia + "= :propertyValue1" + " and model." 
					+ CodigoInterno + "<> :propertyValue2" + " and model." 
					+ Controlador + "= :propertyValue3 and model."
					+ Ciudad + "= :propertyValue4";
			
			//System.out.println(""+queryString);
			
			Query query = getEntityManager().createQuery(queryString);
			query.setParameter("propertyValue", servicioTitan);
			query.setParameter("propertyValue1", tequivalencia);
			query.setParameter("propertyValue2", servicio);
			query.setParameter("propertyValue3", controlador);
			query.setParameter("propertyValue4", ciudad);
			return query.getResultList();
		} catch (RuntimeException re) {
			throw re;
		}
	}
	
}