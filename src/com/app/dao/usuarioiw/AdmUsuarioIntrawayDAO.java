package com.app.dao.usuarioiw;

import com.app.dao.EntityManagerHelper;
import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * AdmUsuarioIntraway entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see com.app.dao.usuarioiw.AdmUsuarioIntraway
 * @author MyEclipse Persistence Tools
 */

public class AdmUsuarioIntrawayDAO implements IAdmUsuarioIntrawayDAO {
	// property constants
	public static final String CLAVE = "clave";
	public static final String NOMBRE = "nombre";
	public static final String PERFIL = "perfil";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved AdmUsuarioIntraway
	 * entity. All subsequent persist actions of this entity should use the
	 * #update() method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * AdmUsuarioIntrawayDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            AdmUsuarioIntraway entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(AdmUsuarioIntraway entity) {
		EntityManagerHelper.log("saving AdmUsuarioIntraway instance",
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
	 * Delete a persistent AdmUsuarioIntraway entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * AdmUsuarioIntrawayDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            AdmUsuarioIntraway entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(AdmUsuarioIntraway entity) {
		EntityManagerHelper.log("deleting AdmUsuarioIntraway instance",
				Level.INFO, null);
		try {
			entity = getEntityManager().getReference(AdmUsuarioIntraway.class,
					entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved AdmUsuarioIntraway entity and return it or a
	 * copy of it to the sender. A copy of the AdmUsuarioIntraway entity
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
	 * entity = AdmUsuarioIntrawayDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            AdmUsuarioIntraway entity to update
	 * @returns AdmUsuarioIntraway the persisted AdmUsuarioIntraway entity
	 *          instance, may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public AdmUsuarioIntraway update(AdmUsuarioIntraway entity) {
		EntityManagerHelper.log("updating AdmUsuarioIntraway instance",
				Level.INFO, null);
		try {
			AdmUsuarioIntraway result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public AdmUsuarioIntraway findById(AdmUsuarioIntrawayId id) {
		EntityManagerHelper.log("finding AdmUsuarioIntraway instance with id: "
				+ id, Level.INFO, null);
		try {
			AdmUsuarioIntraway instance = getEntityManager().find(
					AdmUsuarioIntraway.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all AdmUsuarioIntraway entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the AdmUsuarioIntraway property to query
	 * @param value
	 *            the property value to match
	 * @return List<AdmUsuarioIntraway> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<AdmUsuarioIntraway> findByProperty(String propertyName,
			final Object value) {
		EntityManagerHelper.log(
				"finding AdmUsuarioIntraway instance with property: "
						+ propertyName + ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from AdmUsuarioIntraway model where model."
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

	public List<AdmUsuarioIntraway> findByClave(Object clave) {
		return findByProperty(CLAVE, clave);
	}

	public List<AdmUsuarioIntraway> findByNombre(Object nombre) {
		return findByProperty(NOMBRE, nombre);
	}

	public List<AdmUsuarioIntraway> findByPerfil(Object perfil) {
		return findByProperty(PERFIL, perfil);
	}

	/**
	 * Find all AdmUsuarioIntraway entities.
	 * 
	 * @return List<AdmUsuarioIntraway> all AdmUsuarioIntraway entities
	 */
	@SuppressWarnings("unchecked")
	public List<AdmUsuarioIntraway> findAll() {
		EntityManagerHelper.log("finding all AdmUsuarioIntraway instances",
				Level.INFO, null);
		try {
			final String queryString = "select model from AdmUsuarioIntraway model";
			Query query = getEntityManager().createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

}