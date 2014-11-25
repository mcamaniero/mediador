package com.app.dao;

import java.util.logging.Level;

import javax.persistence.EntityManager;

public class AllDAO {
	
	private EntityManager getEntityManager() {
		return EntityManagerHelper.getEntityManager();
	}

	public Auris save(Auris entity) {
		try {
			getEntityManager().persist(entity);
			getEntityManager().flush();
			return entity;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}
	public Auris update(Auris entity) {
		try {
			return getEntityManager().merge(entity);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}
	
	public Intraway save(Intraway entity) {
		try {
			getEntityManager().persist(entity);
			getEntityManager().flush();
			return entity;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}
	public Intraway update(Intraway entity) {
		try {
			return getEntityManager().merge(entity);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}

	
	public Safari save(Safari entity) {
		try {
			getEntityManager().persist(entity);
			getEntityManager().flush();
			return entity;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}
	public Safari update(Safari entity) {
		try {
			return getEntityManager().merge(entity);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}
	
	public Tellabs save(Tellabs entity) {
		try {
			getEntityManager().persist(entity);
			getEntityManager().flush();
			return entity;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}
	public Tellabs update(Tellabs entity) {
		try {
			return getEntityManager().merge(entity);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}
	
	public TvPagada save(TvPagada entity) {
		try {
			getEntityManager().persist(entity);
			getEntityManager().flush();
			return entity;
		} catch (RuntimeException re) {
			EntityManagerHelper.log("save failed", Level.SEVERE, re);
			throw re;
		}
	}
	public TvPagada update(TvPagada entity) {
		try {
			return getEntityManager().merge(entity);
		} catch (RuntimeException re) {
			EntityManagerHelper.log("update failed", Level.SEVERE, re);
			throw re;
		}
	}
	
}