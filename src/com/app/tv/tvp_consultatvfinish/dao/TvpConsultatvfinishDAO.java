package com.app.tv.tvp_consultatvfinish.dao;

import com.app.dao.EntityManagerHelper;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * TvpConsultatvfinish entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see com.app.tv.tvp_consultatvfinish.dao.TvpConsultatvfinish
 * @author MyEclipse Persistence Tools
 */

public class TvpConsultatvfinishDAO implements ITvpConsultatvfinishDAO {
	// property constants
	public static final String CPARTY_ID = "cpartyId";
	public static final String CPARTY_ID_ACCOUNT = "cpartyIdAccount";
	public static final String DECO_SERIE = "decoSerie";
	public static final String DECO_ID = "decoId";
	public static final String SERVICIO_TITAN = "servicioTitan";
	public static final String SERVICIO_CONTROLADOR = "servicioControlador";
	public static final String ESTADO_TITAN = "estadoTitan";
	public static final String ESTADO_CONTROLADOR = "estadoControlador";
	public static final String CONSULTATV_ID = "consultatvId";
	public static final String SESSION_ID = "sessionId";
	public static final String PAYCHANNELS_TITAN = "paychannelsTitan";
	public static final String PAYCHANNELS_CONTROLADOR = "paychannelsControlador";
	public static final String CIUDAD = "ciudad";
	public static final String DECO_ID_CONTROLADOR = "decoIdControlador";
	public static final String SESSION_REPORT_TYPE = "sessionReportType";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved TvpConsultatvfinish
	 * entity. All subsequent persist actions of this entity should use the
	 * #update() method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TvpConsultatvfinishDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TvpConsultatvfinish entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(TvpConsultatvfinish entity) {
		EntityManagerHelper.log("saving TvpConsultatvfinish instance",
				Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent TvpConsultatvfinish entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * TvpConsultatvfinishDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            TvpConsultatvfinish entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(TvpConsultatvfinish entity) {
		EntityManagerHelper.log("deleting TvpConsultatvfinish instance",
				Level.INFO, null);
		try {
			entity = getEntityManager().getReference(TvpConsultatvfinish.class,
					entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved TvpConsultatvfinish entity and return it or a
	 * copy of it to the sender. A copy of the TvpConsultatvfinish entity
	 * parameter is returned when the JPA persistence mechanism has not
	 * previously been tracking the updated entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently saved to the persistence store, i.e., database. This
	 * method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = TvpConsultatvfinishDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            TvpConsultatvfinish entity to update
	 * @returns TvpConsultatvfinish the persisted TvpConsultatvfinish entity
	 *          instance, may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public TvpConsultatvfinish update(TvpConsultatvfinish entity) {
		EntityManagerHelper.log("updating TvpConsultatvfinish instance",
				Level.INFO, null);
		try {
			TvpConsultatvfinish result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public TvpConsultatvfinish findById(Integer id) {
		EntityManagerHelper.log(
				"finding TvpConsultatvfinish instance with id: " + id,
				Level.INFO, null);
		try {
			TvpConsultatvfinish instance = getEntityManager().find(
					TvpConsultatvfinish.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all TvpConsultatvfinish entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the TvpConsultatvfinish property to query
	 * @param value
	 *            the property value to match
	 * @return List<TvpConsultatvfinish> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<TvpConsultatvfinish> findByProperty(String propertyName,
			final Object value) {
		EntityManagerHelper.log(
				"finding TvpConsultatvfinish instance with property: "
						+ propertyName + ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from TvpConsultatvfinish model where model."
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

	public List<TvpConsultatvfinish> findByCpartyId(Object cpartyId) {
		return findByProperty(CPARTY_ID, cpartyId);
	}

	public List<TvpConsultatvfinish> findByCpartyIdAccount(
			Object cpartyIdAccount) {
		return findByProperty(CPARTY_ID_ACCOUNT, cpartyIdAccount);
	}

	public List<TvpConsultatvfinish> findByDecoSerie(Object decoSerie) {
		return findByProperty(DECO_SERIE, decoSerie);
	}

	public List<TvpConsultatvfinish> findByDecoId(Object decoId) {
		return findByProperty(DECO_ID, decoId);
	}

	public List<TvpConsultatvfinish> findByServicioTitan(Object servicioTitan) {
		return findByProperty(SERVICIO_TITAN, servicioTitan);
	}

	public List<TvpConsultatvfinish> findByServicioControlador(
			Object servicioControlador) {
		return findByProperty(SERVICIO_CONTROLADOR, servicioControlador);
	}

	public List<TvpConsultatvfinish> findByEstadoTitan(Object estadoTitan) {
		return findByProperty(ESTADO_TITAN, estadoTitan);
	}

	public List<TvpConsultatvfinish> findByEstadoControlador(
			Object estadoControlador) {
		return findByProperty(ESTADO_CONTROLADOR, estadoControlador);
	}

	public List<TvpConsultatvfinish> findByConsultatvId(Object consultatvId) {
		return findByProperty(CONSULTATV_ID, consultatvId);
	}

	public List<TvpConsultatvfinish> findBySessionId(Object sessionId) {
		return findByProperty(SESSION_ID, sessionId);
	}

	public List<TvpConsultatvfinish> findByPaychannelsTitan(
			Object paychannelsTitan) {
		return findByProperty(PAYCHANNELS_TITAN, paychannelsTitan);
	}

	public List<TvpConsultatvfinish> findByPaychannelsControlador(
			Object paychannelsControlador) {
		return findByProperty(PAYCHANNELS_CONTROLADOR, paychannelsControlador);
	}

	public List<TvpConsultatvfinish> findByCiudad(Object ciudad) {
		return findByProperty(CIUDAD, ciudad);
	}

	public List<TvpConsultatvfinish> findByDecoIdControlador(
			Object decoIdControlador) {
		return findByProperty(DECO_ID_CONTROLADOR, decoIdControlador);
	}

	public List<TvpConsultatvfinish> findBySessionReportType(
			Object sessionReportType) {
		return findByProperty(SESSION_REPORT_TYPE, sessionReportType);
	}

	/**
	 * Find all TvpConsultatvfinish entities.
	 * 
	 * @return List<TvpConsultatvfinish> all TvpConsultatvfinish entities
	 */
	@SuppressWarnings("unchecked")
	public List<TvpConsultatvfinish> findAll() {
		EntityManagerHelper.log("finding all TvpConsultatvfinish instances",
				Level.INFO, null);
		try {
			final String queryString = "select model from TvpConsultatvfinish model";
			Query query = getEntityManager().createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

	public Integer smax(Object sessionId, Object sessionReportType) {
		EntityManagerHelper.log("finding all TvpConsultatvfinish instances",
				Level.INFO, null);
		try {
			final String queryString = "select distinct model.id from TvpConsultatvfinish model where model.consultatvId="
				+sessionId+" and model.sessionReportType="+sessionReportType;
			Query query = getEntityManager().createQuery(queryString);
			
			System.out.println("Query"+queryString);
			return (Integer) query.getSingleResult();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

}