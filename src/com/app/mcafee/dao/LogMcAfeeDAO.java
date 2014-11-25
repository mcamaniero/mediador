package com.app.mcafee.dao;

import com.app.dao.EntityManagerHelper;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * LogMcAfee entities. Transaction control of the save(), update() and delete()
 * operations must be handled externally by senders of these methods or must be
 * manually added to each of these methods for data to be persisted to the JPA
 * datastore.
 * 
 * @see com.app.mcafee.dao.LogMcAfee
 * @author MyEclipse Persistence Tools
 */

public class LogMcAfeeDAO {
	// property constants
	public static final String ID_EMPRESA = "idEmpresa";
	public static final String SISTEMA = "sistema";
	public static final String INTERFAZ = "interfaz";
	public static final String ID_ESTADO = "idEstado";
	public static final String CUENTA = "cuenta";
	public static final String ID_PRODUCTO = "idProducto";
	public static final String CORREO = "correo";
	public static final String PLAN_MC_AFEE_TV_CABLE = "planMcAfeeTvCable";
	public static final String CLIENTE_CRM = "clienteCrm";
	public static final String ID_PRODUCTO_CRM = "idProductoCrm";
	public static final String ID_MC_AFEE = "idMcAfee";
	public static final String REFERENCIA = "referencia";
	public static final String COD_ERROR = "codError";
	public static final String DET_MENSAJE = "detMensaje";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved LogMcAfee entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * LogMcAfeeDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            LogMcAfee entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(LogMcAfee entity) {
		EntityManagerHelper.log("saving LogMcAfee instance", Level.INFO, null);
		try {
			getEntityManager().persist(entity);
			EntityManagerHelper.log("save successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Delete a persistent LogMcAfee entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * LogMcAfeeDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            LogMcAfee entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(LogMcAfee entity) {
		EntityManagerHelper
				.log("deleting LogMcAfee instance", Level.INFO, null);
		try {
			entity = getEntityManager().getReference(LogMcAfee.class,
					entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved LogMcAfee entity and return it or a copy of it
	 * to the sender. A copy of the LogMcAfee entity parameter is returned when
	 * the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = LogMcAfeeDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            LogMcAfee entity to update
	 * @returns LogMcAfee the persisted LogMcAfee entity instance, may not be
	 *          the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public LogMcAfee update(LogMcAfee entity) {
		EntityManagerHelper
				.log("updating LogMcAfee instance", Level.INFO, null);
		try {
			LogMcAfee result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public LogMcAfee findById(Integer id) {
		EntityManagerHelper.log("finding LogMcAfee instance with id: " + id,
				Level.INFO, null);
		try {
			LogMcAfee instance = getEntityManager().find(LogMcAfee.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all LogMcAfee entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the LogMcAfee property to query
	 * @param value
	 *            the property value to match
	 * @return List<LogMcAfee> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<LogMcAfee> findByProperty(String propertyName,
			final Object value) {
		try {
			final String queryString = "select model from LogMcAfee model where model."
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

	public List<LogMcAfee> findByIdEmpresa(Object idEmpresa) {
		return findByProperty(ID_EMPRESA, idEmpresa);
	}

	public List<LogMcAfee> findBySistema(Object sistema) {
		return findByProperty(SISTEMA, sistema);
	}

	public List<LogMcAfee> findByInterfaz(Object interfaz) {
		return findByProperty(INTERFAZ, interfaz);
	}

	public List<LogMcAfee> findByIdEstado(Object idEstado) {
		return findByProperty(ID_ESTADO, idEstado);
	}

	public List<LogMcAfee> findByCuenta(Object cuenta) {
		return findByProperty(CUENTA, cuenta);
	}

	public List<LogMcAfee> findByIdProducto(Object idProducto) {
		return findByProperty(ID_PRODUCTO, idProducto);
	}

	public List<LogMcAfee> findByCorreo(Object correo) {
		return findByProperty(CORREO, correo);
	}

	public List<LogMcAfee> findByPlanMcAfeeTvCable(Object planMcAfeeTvCable) {
		return findByProperty(PLAN_MC_AFEE_TV_CABLE, planMcAfeeTvCable);
	}

	public List<LogMcAfee> findByClienteCrm(Object clienteCrm) {
		return findByProperty(CLIENTE_CRM, clienteCrm);
	}

	public List<LogMcAfee> findByIdProductoCrm(Object idProductoCrm) {
		return findByProperty(ID_PRODUCTO_CRM, idProductoCrm);
	}

	public List<LogMcAfee> findByIdMcAfee(Object idMcAfee) {
		return findByProperty(ID_MC_AFEE, idMcAfee);
	}

	public List<LogMcAfee> findByReferencia(Object referencia) {
		return findByProperty(REFERENCIA, referencia);
	}

	public List<LogMcAfee> findByCodError(Object codError) {
		return findByProperty(COD_ERROR, codError);
	}

	public List<LogMcAfee> findByDetMensaje(Object detMensaje) {
		return findByProperty(DET_MENSAJE, detMensaje);
	}

	/**
	 * Find all LogMcAfee entities.
	 * 
	 * @return List<LogMcAfee> all LogMcAfee entities
	 */
	@SuppressWarnings("unchecked")
	public List<LogMcAfee> findAll() {
		EntityManagerHelper.log("finding all LogMcAfee instances", Level.INFO,
				null);
		try {
			final String queryString = "select model from LogMcAfee model";
			Query query = getEntityManager().createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

}