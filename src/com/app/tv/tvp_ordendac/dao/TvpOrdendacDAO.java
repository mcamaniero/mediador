package com.app.tv.tvp_ordendac.dao;

import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.app.dao.EntityManagerHelper;
import com.app.tv.log_TvPagada.LogTvPagada;

/**
 * A data access object (DAO) providing persistence and search support for
 * TvpOrdendac entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see com.app.tv.tvp_ordendac.dao.TvpOrdendac
 * @author MyEclipse Persistence Tools
 */

public class TvpOrdendacDAO{
	// property constants
	public static final String PUERTO = "puerto";
	public static final String TAMANIO = "tamanio";
	public static final String COMANDO = "comando";
	public static final String PAQUETE = "paquete";
	public static final String ESTADO = "estado";
	public static final String RESPUESTA = "respuesta";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TvpOrdendac entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TvpOrdendacDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TvpOrdendac entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TvpOrdendac entity) {
		try {
			getEntityManager().persist(entity);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	/**
	 * Delete a persistent TvpOrdendac entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TvpOrdendacDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TvpOrdendac entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TvpOrdendac entity) {
		try {
			entity = getEntityManager().getReference(TvpOrdendac.class,
					entity.getClave());
			getEntityManager().remove(entity);
		} catch (RuntimeException re) {
			throw re;
		}
	}

	/**
	 * Persist a previously saved TvpOrdendac entity and return it or a copy of
	 * it to the sender. A copy of the TvpOrdendac entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TvpOrdendacDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TvpOrdendac entity to update
	 * @returns TvpOrdendac the persisted TvpOrdendac entity instance, may not
	 *          be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TvpOrdendac update(TvpOrdendac entity) {
		try {
			TvpOrdendac result = getEntityManager().merge(entity);
			return result;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	
	
	public TvpOrdendac findById(Long id) {
		try {
			TvpOrdendac instance = getEntityManager().find(TvpOrdendac.class,
					id);
			getEntityManager().refresh(instance);
			return instance;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	/**
	 * Find all TvpOrdendac entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TvpOrdendac property to query
	 * @param value
	 *            the property value to match
	 * @return List<TvpOrdendac> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TvpOrdendac> findByProperty(String propertyName,
			final Object value) {
		try {
			final String queryString = "select model from TvpOrdendac model where model."
					+ propertyName + "= :propertyValue";
			Query query = getEntityManager().createQuery(queryString);
			query.setParameter("propertyValue", value);
			return query.getResultList();
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public List<TvpOrdendac> findByTwoProperties(String strSerie,
			String vSerie, String strFecha, String vFecha, String vTable, String DescEvento, String descEvento) {
		// TODO Auto-generated method stub
		try {
/*			final String queryString = "select model from LogTvPagada "
					+ "join " + vTable + " on " + vTable + ".id = model.id"
					+ "model where model." + strSerie + "= :propertyValue"
					+ " and model." + strFecha + " like :propertyValue1"+"%";
			System.out.println(vTable);
			System.out.println(vFecha);
			System.out.println(vSerie);

			System.out.println(queryString);
			Query query = getEntityManager().createQuery(queryString);
			query.setParameter("propertyValue", vSerie);
			query.setParameter("propertyValue1", vFecha);
			*/
		
//		    Query query = getEntityManager().createQuery("SELECT DISTINCT d FROM Department d, Student e " +
//		    		"WHERE d = e.department");
/*			SELECT serie, coderror, detmensaje
			from log_TvPagada log, tvp_ordendac as tvp
			where log.id = tvp.id
			and serie like '%9705';
			
			*/
		    
//		    Query query = getEntityManager().createQuery(" SELECT log.serie, log.coderror, tvp.puerto "

			
			System.out.println(vFecha);
			
		    Query query = getEntityManager().createQuery(" SELECT tvp "			
		    + " from LogTvPagada log, TvpOrdendac tvp "
		    + " where log.id = tvp.id "
		    + " and log.serie like '%9705'"
		   // + " and log.fecha like '2009-05-11%'" 
		   // + " and log.descevento = '"+descEvento+"'"
		    + " order by log.id DESC ");

		//    query.getResultList();
		    
			return query.getResultList();
		} catch (RuntimeException re) {
			throw re;
		}

	}
	
	
	public List<TvpOrdendac> findByPuerto(Object puerto) {
		return findByProperty(PUERTO, puerto);
	}

	public List<TvpOrdendac> findByTamanio(Object tamanio) {
		return findByProperty(TAMANIO, tamanio);
	}

	public List<TvpOrdendac> findByComando(Object comando) {
		return findByProperty(COMANDO, comando);
	}

	public List<TvpOrdendac> findByPaquete(Object paquete) {
		return findByProperty(PAQUETE, paquete);
	}

	public List<TvpOrdendac> findByEstado(Object estado) {
		return findByProperty(ESTADO, estado);
	}

	public List<TvpOrdendac> findByRespuesta(Object respuesta) {
		return findByProperty(RESPUESTA, respuesta);
	}

	/**
	 * Find all TvpOrdendac entities.
	 * 
	 * @return List<TvpOrdendac> all TvpOrdendac entities
	 */
	@SuppressWarnings("unchecked")
	public List<TvpOrdendac> findAll() {
		try {
			final String queryString = "select model from TvpOrdendac model";
			Query query = getEntityManager().createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			throw re;
		}
	}

}