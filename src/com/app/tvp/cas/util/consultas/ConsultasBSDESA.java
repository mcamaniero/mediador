package com.app.tvp.cas.util.consultas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Query;

import com.app.dao.EntityManagerHelperTitanBSDESA;
import com.app.tvp.cas.objetos.ObjetoConsultaMasterCard;
import com.app.tvp.cas.objetos.ObjetoConsultaPacks;
import com.app.tvp.cas.objetos.ObjetoConsultaSetTopBox;

public class ConsultasBSDESA
{
	private String consultaSTB = "Select ID,SERIESMC,SERIESTB,ISPAIRING from yvGetSetTopBoxDTH where SERIESMC=?";
	private String consultaPacks = "Select ID,SERIESMC,PAK,NOMBRE from yvGetPaks where SERIESMC=?";
	private String consultaSmartCards = "select ID,SERIESMC,MASTERCARD from yvGetMasterCard where SERIESMC=?";
	
	@SuppressWarnings("unchecked")
	public ObjetoConsultaSetTopBox obtenerSetTopBox(String smartCard)
	{
		ObjetoConsultaSetTopBox retorno = null;
		EntityManager em = EntityManagerHelperTitanBSDESA.getEntityManager();
		Query q = em.createNativeQuery(consultaSTB);
		q.setParameter(1,smartCard);
		try
		{
			Vector<Object> aux = (Vector<Object>)q.getSingleResult();
			if(aux!=null)
			{
				retorno = new ObjetoConsultaSetTopBox();
				retorno.setId((BigDecimal)aux.get(0));
				retorno.setSerieSMC((String)aux.get(1));
				retorno.setSerieSTB((String)aux.get(2));
				retorno.setIsParing((String)aux.get(3));
			}
		}
		catch(NoResultException nre)
		{
			System.out.println(nre.getMessage());
		}
		catch(NonUniqueResultException nure)
		{
			System.out.println(nure.getMessage());
		}
		return retorno;
	}
	
	@SuppressWarnings("unchecked")
	public List<ObjetoConsultaPacks> obtenerPacks(String smartCard)
	{
		List<ObjetoConsultaPacks> retorno = null;
		EntityManager em = EntityManagerHelperTitanBSDESA.getEntityManager();
		Query q = em.createNativeQuery(consultaPacks);
		q.setParameter(1,smartCard);
		List<Vector<Object>> aux = q.getResultList();
		if(aux!=null&&aux.size()>0)
		{
			retorno = new ArrayList<ObjetoConsultaPacks>();
			for(Vector<Object> i : aux)
			{
				ObjetoConsultaPacks aux2 = new ObjetoConsultaPacks();
				aux2.setId((BigDecimal)i.get(0));
				aux2.setSerieSMC((String)i.get(1));
				aux2.setPack((String)i.get(2));
				aux2.setNombre((String)i.get(3));
				retorno.add(aux2);
			}
		}
		return retorno;
	}
	
	@SuppressWarnings("unchecked")
	public ObjetoConsultaMasterCard obtenerTarjetasPrincipal(String smartCard)
	{
		ObjetoConsultaMasterCard retorno = null;
		EntityManager em = EntityManagerHelperTitanBSDESA.getEntityManager();
		Query q = em.createNativeQuery(consultaSmartCards);
		q.setParameter(1,smartCard);
		try
		{
			Vector<Object> aux = (Vector<Object>)q.getSingleResult();
			if(aux!=null)
			{
				retorno = new ObjetoConsultaMasterCard();
				retorno.setId((BigDecimal)aux.get(0));
				retorno.setSerieSMC((String)aux.get(1));
				retorno.setMastercard((String)aux.get(2));
			}
		}
		catch(NoResultException nre)
		{
			System.out.println(nre.getMessage());
		}
		catch(NonUniqueResultException nure)
		{
			System.out.println(nure.getMessage());
		}
		return retorno;
	}
}