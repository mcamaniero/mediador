package com.app.tvp.cas.util.consultas;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.app.dao.EntityManagerHelper;

public class ConsultasTytanPU
{
	private String consultaPacksActDes = "select t.paqueteDth from tvp_equivalencias t where t.TControlador=? and t.CodigoTitan=?";
	
	@SuppressWarnings("unchecked")
	public List<String> obtenerCodigoPaquetes(int controlador,int codigoTitan)
	{
		List<String> retorno = null;
		EntityManager em = EntityManagerHelper.getEntityManager();
		Query q = em.createNativeQuery(consultaPacksActDes);
		q.setParameter(1,controlador);
		q.setParameter(2,codigoTitan);
		List<Vector<String>> aux = q.getResultList();
		retorno = new ArrayList<String>();
		for(int i=0;i<aux.size();i++)
		{
			retorno.add(aux.get(i).get(0));
		}
		return retorno;
	}
}