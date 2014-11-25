package com.app.tv.log_TvPagada;

import java.util.Date;
import java.util.List;

/**
 * Interface for LogTvPagadaDAO.
 * @author MyEclipse Persistence Tools
 */

public interface ILogTvPagadaDAO {
		/**
	 Perform an initial save of a previously unsaved LogTvPagada entity. 
	 All subsequent persist actions of this entity should use the #update() method.
	 This operation must be performed within the a database transaction context for the entity's data to be permanently saved to the persistence store, i.e., database. 
	 This method uses the {@link javax.persistence.EntityManager#persist(Object) EntityManager#persist} operation.
	 	 
	 * <pre> 
	 *   EntityManagerHelper.beginTransaction();
	 *   ILogTvPagadaDAO.save(entity);
	 *   EntityManagerHelper.commit();
	 * </pre>
	   @param entity LogTvPagada entity to persist
	  @throws RuntimeException when the operation fails
	 */
    public void save(LogTvPagada entity);
    /**
	 Delete a persistent LogTvPagada entity.
	  This operation must be performed 
	 within the a database transaction context for the entity's data to be
	 permanently deleted from the persistence store, i.e., database. 
	 This method uses the {@link javax.persistence.EntityManager#remove(Object) EntityManager#delete} operation.
	 	  
	 * <pre>
	 *   EntityManagerHelper.beginTransaction();
	 *   ILogTvPagadaDAO.delete(entity);
	 *   EntityManagerHelper.commit();
	 *   entity = null;
	 * </pre>
	   @param entity LogTvPagada entity to delete
	 @throws RuntimeException when the operation fails
	 */
    public void delete(LogTvPagada entity);
   /**
	 Persist a previously saved LogTvPagada entity and return it or a copy of it to the sender. 
	 A copy of the LogTvPagada entity parameter is returned when the JPA persistence mechanism has not previously been tracking the updated entity. 
	 This operation must be performed within the a database transaction context for the entity's data to be permanently saved to the persistence
	 store, i.e., database. This method uses the {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge} operation.
	 	 
	 * <pre>
	 *   EntityManagerHelper.beginTransaction();
	 *   entity = ILogTvPagadaDAO.update(entity);
	 *   EntityManagerHelper.commit();
	 * </pre>
	   @param entity LogTvPagada entity to update
	 @returns LogTvPagada the persisted LogTvPagada entity instance, may not be the same
	 @throws RuntimeException if the operation fails
	 */
	public LogTvPagada update(LogTvPagada entity);
	public LogTvPagada findById( Integer id);
	 /**
	 * Find all LogTvPagada entities with a specific property value.  
	 
	  @param propertyName the name of the LogTvPagada property to query
	  @param value the property value to match
	  	  @return List<LogTvPagada> found by query
	 */
	public List<LogTvPagada> findByProperty(String propertyName, Object value
		);
	public List<LogTvPagada> findByIdempresa(Object idempresa
		);
	public List<LogTvPagada> findByNegocio(Object negocio
		);
	public List<LogTvPagada> findByInterfaz(Object interfaz
		);
	public List<LogTvPagada> findBySecuencia(Object secuencia
		);
	public List<LogTvPagada> findByTipoc(Object tipoc
		);
	public List<LogTvPagada> findByCodigocanal(Object codigocanal
		);
	public List<LogTvPagada> findByDescevento(Object descevento
		);
	public List<LogTvPagada> findByComienzo(Object comienzo
		);
	public List<LogTvPagada> findByFinal_(Object final_
		);
	public List<LogTvPagada> findByTipod(Object tipod
		);
	public List<LogTvPagada> findByDuracionevento(Object duracionevento
		);
	public List<LogTvPagada> findByIdaccount(Object idaccount
		);
	public List<LogTvPagada> findByInterstitial(Object interstitial
		);
	public List<LogTvPagada> findByUbicacion(Object ubicacion
		);
	public List<LogTvPagada> findByTiempolibre(Object tiempolibre
		);
	public List<LogTvPagada> findByCredito(Object credito
		);
	public List<LogTvPagada> findByMpaa(Object mpaa
		);
	public List<LogTvPagada> findByIdpaquetes(Object idpaquetes
		);
	public List<LogTvPagada> findByContenidoviolento(Object contenidoviolento
		);
	public List<LogTvPagada> findByTipoa(Object tipoa
		);
	public List<LogTvPagada> findByContenidosexual(Object contenidosexual
		);
	public List<LogTvPagada> findByFormapago(Object formapago
		);
	public List<LogTvPagada> findByLenguaje(Object lenguaje
		);
	public List<LogTvPagada> findByRating(Object rating
		);
	public List<LogTvPagada> findBySerie(Object serie
		);
	public List<LogTvPagada> findByTiempocompra(Object tiempocompra
		);
	public List<LogTvPagada> findByCitem(Object citem
		);
	public List<LogTvPagada> findByPaquete(Object paquete
		);
	public List<LogTvPagada> findByIdservicio(Object idservicio
		);
	public List<LogTvPagada> findByTiempodisplay(Object tiempodisplay
		);
	public List<LogTvPagada> findByEstadoc(Object estadoc
		);
	public List<LogTvPagada> findByCostoevento(Object costoevento
		);
	public List<LogTvPagada> findByPrecioevento(Object precioevento
		);
	public List<LogTvPagada> findByAccion(Object accion
		);
	public List<LogTvPagada> findByAnytime(Object anytime
		);
	public List<LogTvPagada> findByTipopromocion(Object tipopromocion
		);
	public List<LogTvPagada> findByIdeventos(Object ideventos
		);
	public List<LogTvPagada> findByDatoc1(Object datoc1
		);
	public List<LogTvPagada> findByDatoc2(Object datoc2
		);
	public List<LogTvPagada> findByIdconvertidor(Object idconvertidor
		);
	public List<LogTvPagada> findByCoderror(Object coderror
		);
	public List<LogTvPagada> findByDetmensaje(Object detmensaje
		);
	/**
	 * Find all LogTvPagada entities.
	  	  @return List<LogTvPagada> all LogTvPagada entities
	 */
	public List<LogTvPagada> findAll(
		);	
}