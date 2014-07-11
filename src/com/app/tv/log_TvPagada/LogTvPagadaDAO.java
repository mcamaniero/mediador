package com.app.tv.log_TvPagada;

import com.app.dao.EntityManagerHelper;
//import com.app.tv.tvp_equivalencias.dao.TvpEquivalencias;

import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;



/**
 * A data access object (DAO) providing persistence and search support for
 * LogTvPagada entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see com.app.tv.log_TvPagada.LogTvPagada
 * @author MyEclipse Persistence Tools
 */

public class LogTvPagadaDAO implements ILogTvPagadaDAO {
	// property constants
	public static final String IDEMPRESA = "idempresa";
	public static final String NEGOCIO = "negocio";
	public static final String INTERFAZ = "interfaz";
	public static final String SECUENCIA = "secuencia";
	public static final String TIPOC = "tipoc";
	public static final String CODIGOCANAL = "codigocanal";
	public static final String DESCEVENTO = "descevento";
	public static final String COMIENZO = "comienzo";
	public static final String FINAL_ = "final_";
	public static final String TIPOD = "tipod";
	public static final String DURACIONEVENTO = "duracionevento";
	public static final String IDACCOUNT = "idaccount";
	public static final String INTERSTITIAL = "interstitial";
	public static final String UBICACION = "ubicacion";
	public static final String TIEMPOLIBRE = "tiempolibre";
	public static final String CREDITO = "credito";
	public static final String MPAA = "mpaa";
	public static final String IDPAQUETES = "idpaquetes";
	public static final String CONTENIDOVIOLENTO = "contenidoviolento";
	public static final String TIPOA = "tipoa";
	public static final String CONTENIDOSEXUAL = "contenidosexual";
	public static final String FORMAPAGO = "formapago";
	public static final String LENGUAJE = "lenguaje";
	public static final String RATING = "rating";
	public static final String SERIE = "serie";
	public static final String TIEMPOCOMPRA = "tiempocompra";
	public static final String CITEM = "citem";
	public static final String PAQUETE = "paquete";
	public static final String IDSERVICIO = "idservicio";
	public static final String TIEMPODISPLAY = "tiempodisplay";
	public static final String ESTADOC = "estadoc";
	public static final String COSTOEVENTO = "costoevento";
	public static final String PRECIOEVENTO = "precioevento";
	public static final String ACCION = "accion";
	public static final String ANYTIME = "anytime";
	public static final String TIPOPROMOCION = "tipopromocion";
	public static final String IDEVENTOS = "ideventos";
	public static final String DATOC1 = "datoc1";
	public static final String DATOC2 = "datoc2";
	public static final String IDCONVERTIDOR = "idconvertidor";
	public static final String CODERROR = "coderror";
	public static final String DETMENSAJE = "detmensaje";
	
	public static final String RESPUESTA = "respuesta";
	//public static final String DETMENSAJE = "detmensaje";
	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved LogTvPagada entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * LogTvPagadaDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            LogTvPagada entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(LogTvPagada entity) {
		EntityManagerHelper
				.log("saving LogTvPagada instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent LogTvPagada entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * LogTvPagadaDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            LogTvPagada entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(LogTvPagada entity) {
		EntityManagerHelper.log("deleting LogTvPagada instance", Level.INFO,
				null);
		try {
			entity = getEntityManager().getReference(LogTvPagada.class,
					entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved LogTvPagada entity and return it or a copy of
	 * it to the sender. A copy of the LogTvPagada entity parameter is returned
	 * when the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = LogTvPagadaDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            LogTvPagada entity to update
	 * @returns LogTvPagada the persisted LogTvPagada entity instance, may not
	 *          be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public LogTvPagada update(LogTvPagada entity) {
		EntityManagerHelper.log("updating LogTvPagada instance", Level.INFO,
				null);
		try {
			LogTvPagada result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public LogTvPagada findById(Integer id) {
		EntityManagerHelper.log("finding LogTvPagada instance with id: " + id,
				Level.INFO, null);
		try {
			LogTvPagada instance = getEntityManager().find(LogTvPagada.class,
					id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all LogTvPagada entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the LogTvPagada property to query
	 * @param value
	 *            the property value to match
	 * @return List<LogTvPagada> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<LogTvPagada> findByProperty(String propertyName,
			final Object value) {
		EntityManagerHelper.log("finding LogTvPagada instance with property: "
				+ propertyName + ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from LogTvPagada model where model."
					+ propertyName + "= :propertyValue";
			Query query = getEntityManager().createQuery(queryString);
			query.setParameter("propertyValue", value);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find by property name failed",
					Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * 
	 * @param strSerie
	 * @param vSerie
	 * @param strFecha
	 * @param vFecha
	 * @param vTable
	 * @return
	 */
	public List<LogTvPagada> findByTwoProperties(String strSerie,
			String vSerie, String strFecha, String vFecha, String vTable) {
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
		    Query query = getEntityManager().createQuery(" SELECT tvp "			
		    + " from LogTvPagada log, TvpOrdendac tvp "
		    + " where log.id = tvp.id "
		    + " and log.serie like '%9705'"
		    + " and log.descevento = '192.168.0.1'");
		    
		    
			return query.getResultList();
		} catch (RuntimeException re) {
			throw re;
		}

	}

	public List<LogTvPagada> findByIdempresa(Object idempresa) {
		return findByProperty(IDEMPRESA, idempresa);
	}

	public List<LogTvPagada> findByNegocio(Object negocio) {
		return findByProperty(NEGOCIO, negocio);
	}

	public List<LogTvPagada> findByInterfaz(Object interfaz) {
		return findByProperty(INTERFAZ, interfaz);
	}

	public List<LogTvPagada> findBySecuencia(Object secuencia) {
		return findByProperty(SECUENCIA, secuencia);
	}

	public List<LogTvPagada> findByTipoc(Object tipoc) {
		return findByProperty(TIPOC, tipoc);
	}

	public List<LogTvPagada> findByCodigocanal(Object codigocanal) {
		return findByProperty(CODIGOCANAL, codigocanal);
	}

	public List<LogTvPagada> findByDescevento(Object descevento) {
		return findByProperty(DESCEVENTO, descevento);
	}

	public List<LogTvPagada> findByComienzo(Object comienzo) {
		return findByProperty(COMIENZO, comienzo);
	}

	public List<LogTvPagada> findByFinal_(Object final_) {
		return findByProperty(FINAL_, final_);
	}

	public List<LogTvPagada> findByTipod(Object tipod) {
		return findByProperty(TIPOD, tipod);
	}

	public List<LogTvPagada> findByDuracionevento(Object duracionevento) {
		return findByProperty(DURACIONEVENTO, duracionevento);
	}

	public List<LogTvPagada> findByIdaccount(Object idaccount) {
		return findByProperty(IDACCOUNT, idaccount);
	}

	public List<LogTvPagada> findByInterstitial(Object interstitial) {
		return findByProperty(INTERSTITIAL, interstitial);
	}

	public List<LogTvPagada> findByUbicacion(Object ubicacion) {
		return findByProperty(UBICACION, ubicacion);
	}

	public List<LogTvPagada> findByTiempolibre(Object tiempolibre) {
		return findByProperty(TIEMPOLIBRE, tiempolibre);
	}

	public List<LogTvPagada> findByCredito(Object credito) {
		return findByProperty(CREDITO, credito);
	}

	public List<LogTvPagada> findByMpaa(Object mpaa) {
		return findByProperty(MPAA, mpaa);
	}

	public List<LogTvPagada> findByIdpaquetes(Object idpaquetes) {
		return findByProperty(IDPAQUETES, idpaquetes);
	}

	public List<LogTvPagada> findByContenidoviolento(Object contenidoviolento) {
		return findByProperty(CONTENIDOVIOLENTO, contenidoviolento);
	}

	public List<LogTvPagada> findByTipoa(Object tipoa) {
		return findByProperty(TIPOA, tipoa);
	}

	public List<LogTvPagada> findByContenidosexual(Object contenidosexual) {
		return findByProperty(CONTENIDOSEXUAL, contenidosexual);
	}

	public List<LogTvPagada> findByFormapago(Object formapago) {
		return findByProperty(FORMAPAGO, formapago);
	}

	public List<LogTvPagada> findByLenguaje(Object lenguaje) {
		return findByProperty(LENGUAJE, lenguaje);
	}

	public List<LogTvPagada> findByRating(Object rating) {
		return findByProperty(RATING, rating);
	}

	public List<LogTvPagada> findBySerie(Object serie) {
		return findByProperty(SERIE, serie);
	}

	public List<LogTvPagada> findByTiempocompra(Object tiempocompra) {
		return findByProperty(TIEMPOCOMPRA, tiempocompra);
	}

	public List<LogTvPagada> findByCitem(Object citem) {
		return findByProperty(CITEM, citem);
	}

	public List<LogTvPagada> findByPaquete(Object paquete) {
		return findByProperty(PAQUETE, paquete);
	}

	public List<LogTvPagada> findByIdservicio(Object idservicio) {
		return findByProperty(IDSERVICIO, idservicio);
	}

	public List<LogTvPagada> findByTiempodisplay(Object tiempodisplay) {
		return findByProperty(TIEMPODISPLAY, tiempodisplay);
	}

	public List<LogTvPagada> findByEstadoc(Object estadoc) {
		return findByProperty(ESTADOC, estadoc);
	}

	public List<LogTvPagada> findByCostoevento(Object costoevento) {
		return findByProperty(COSTOEVENTO, costoevento);
	}

	public List<LogTvPagada> findByPrecioevento(Object precioevento) {
		return findByProperty(PRECIOEVENTO, precioevento);
	}

	public List<LogTvPagada> findByAccion(Object accion) {
		return findByProperty(ACCION, accion);
	}

	public List<LogTvPagada> findByAnytime(Object anytime) {
		return findByProperty(ANYTIME, anytime);
	}

	public List<LogTvPagada> findByTipopromocion(Object tipopromocion) {
		return findByProperty(TIPOPROMOCION, tipopromocion);
	}

	public List<LogTvPagada> findByIdeventos(Object ideventos) {
		return findByProperty(IDEVENTOS, ideventos);
	}

	public List<LogTvPagada> findByDatoc1(Object datoc1) {
		return findByProperty(DATOC1, datoc1);
	}

	public List<LogTvPagada> findByDatoc2(Object datoc2) {
		return findByProperty(DATOC2, datoc2);
	}

	public List<LogTvPagada> findByIdconvertidor(Object idconvertidor) {
		return findByProperty(IDCONVERTIDOR, idconvertidor);
	}

	public List<LogTvPagada> findByCoderror(Object coderror) {
		return findByProperty(CODERROR, coderror);
	}

	public List<LogTvPagada> findByDetmensaje(Object detmensaje) {
		return findByProperty(DETMENSAJE, detmensaje);
	}

	/**
	 * Find all LogTvPagada entities.
	 * 
	 * @return List<LogTvPagada> all LogTvPagada entities
	 */
	@SuppressWarnings("unchecked")
	public List<LogTvPagada> findAll() {
		EntityManagerHelper.log("finding all LogTvPagada instances",
				Level.INFO, null);
		try {
			final String queryString = "select model from LogTvPagada model";
			Query query = getEntityManager().createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

}