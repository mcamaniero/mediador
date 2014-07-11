package com.app.tv.tvp_refreshmasivotitan.dao;

import com.app.dao.EntityManagerHelper;
import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * A data access object (DAO) providing persistence and search support for
 * RefreshMasivoTitan entities. Transaction control of the save(), update() and
 * delete() operations must be handled externally by senders of these methods or
 * must be manually added to each of these methods for data to be persisted to
 * the JPA datastore.
 * 
 * @see com.app.tv.tvp_refreshmasivotitan.dao.RefreshMasivoTitan
 * @author MyEclipse Persistence Tools
 */

public class RefreshMasivoTitanDAO implements IRefreshMasivoTitanDAO {
	// property constants
	public static final String CPARTY_IDACCOUNT = "cpartyIdaccount";
	public static final String AP_ADRDRESS = "apAdrdress";
	public static final String NAME = "name";

	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	/**
	 * Perform an initial save of a previously unsaved RefreshMasivoTitan
	 * entity. All subsequent persist actions of this entity should use the
	 * #update() method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * RefreshMasivoTitanDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            RefreshMasivoTitan entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(RefreshMasivoTitan entity) {
		EntityManagerHelper.log("saving RefreshMasivoTitan instance",
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
	 * Delete a persistent RefreshMasivoTitan entity. This operation must be
	 * performed within the a database transaction context for the entity's data
	 * to be permanently deleted from the persistence store, i.e., database.
	 * This method uses the
	 * {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * RefreshMasivoTitanDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            RefreshMasivoTitan entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(RefreshMasivoTitan entity) {
		EntityManagerHelper.log("deleting RefreshMasivoTitan instance",
				Level.INFO, null);
		try {
			entity = getEntityManager().getReference(RefreshMasivoTitan.class,
					entity.getId());
			getEntityManager().remove(entity);
			EntityManagerHelper.log("delete successful", Level.INFO, null);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("delete failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Persist a previously saved RefreshMasivoTitan entity and return it or a
	 * copy of it to the sender. A copy of the RefreshMasivoTitan entity
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
	 * entity = RefreshMasivoTitanDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            RefreshMasivoTitan entity to update
	 * @returns RefreshMasivoTitan the persisted RefreshMasivoTitan entity
	 *          instance, may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public RefreshMasivoTitan update(RefreshMasivoTitan entity) {
		EntityManagerHelper.log("updating RefreshMasivoTitan instance",
				Level.INFO, null);
		try {
			RefreshMasivoTitan result = getEntityManager().merge(entity);
			EntityManagerHelper.log("update successful", Level.INFO, null);
			return result;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	public RefreshMasivoTitan findById(Integer id) {
		EntityManagerHelper.log("finding RefreshMasivoTitan instance with id: "
				+ id, Level.INFO, null);
		try {
			RefreshMasivoTitan instance = getEntityManager().find(
					RefreshMasivoTitan.class, id);
			return instance;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find failed", Level.SEVERE, re);
			throw re;
		}
	}

	/**
	 * Find all RefreshMasivoTitan entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the RefreshMasivoTitan property to query
	 * @param value
	 *            the property value to match
	 * @return List<RefreshMasivoTitan> found by query
	 */
	@SuppressWarnings("unchecked")
	public List<RefreshMasivoTitan> findByProperty(String propertyName,
			final Object value) {
		EntityManagerHelper.log(
				"finding RefreshMasivoTitan instance with property: "
						+ propertyName + ", value: " + value, Level.INFO, null);
		try {
			final String queryString = "select model from RefreshMasivoTitan model where model."
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

	public List<RefreshMasivoTitan> findByCpartyIdaccount(Object cpartyIdaccount) {
		return findByProperty(CPARTY_IDACCOUNT, cpartyIdaccount);
	}

	public List<RefreshMasivoTitan> findByApAdrdress(Object apAdrdress) {
		return findByProperty(AP_ADRDRESS, apAdrdress);
	}

	public List<RefreshMasivoTitan> findByName(Object name) {
		return findByProperty(NAME, name);
	}

	/**
	 * Find all RefreshMasivoTitan entities.
	 * 
	 * @return List<RefreshMasivoTitan> all RefreshMasivoTitan entities
	 */
	@SuppressWarnings("unchecked")
	public List<RefreshMasivoTitan> findAll() {
		EntityManagerHelper.log("finding all RefreshMasivoTitan instances",
				Level.INFO, null);
		try {
			final String queryString = "select model from RefreshMasivoTitan model";
			Query query = getEntityManager().createQuery(queryString);
			return query.getResultList();
		} catch (RuntimeException re) {
			EntityManagerHelper.log("find all failed", Level.SEVERE, re);
			throw re;
		}
	}

}