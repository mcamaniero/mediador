package com.app.intraway.conciliacion;

import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.app.dao.conciliacion.AdmConciliacion;
import com.app.dao.conciliacion.AdmConciliacionDAO;
import com.app.dao.titan.Querys;

public class ConciliacionIntraway {


	List<Vector> conciliacion = null;
	ExecutorService execSvc = null;

	public ConciliacionIntraway() {

	}

	public void Conciliar(){
		
		
		//lee los productos de las tablas de titan
		/*List<Vector> products = new Querys().findAll();
		
		//borro los datos de la tabla de conciliacion
		new AdmConciliacionDAO().deleteAll();
		
		int key = 1;
		for(Vector tmp : products){
			new AdmConciliacionDAO().save(new AdmConciliacion(key,tmp.get(0).toString(),tmp.get(1).toString(),
					tmp.get(2).toString(),tmp.get(3).toString(),tmp.get(4).toString(),false,"",tmp.get(6).toString(),"","",tmp.get(5).toString()));
			//System.out.println(tmp);
			
			//new AdmConciliacionDAO().save(new AdmConciliacion(key,tmp.get(0).toString(),tmp.get(4).toString().substring(0,tmp.get(4).toString().length()-1),
				//	tmp.get(2).toString(),tmp.get(3).toString(),tmp.get(1).toString(),false,"",tmp.get(5).toString(),"","",""));
			
			key++;
		}*/
		
		
		conciliacion =  new AdmConciliacionDAO().findAllView();

		execSvc = Executors.newFixedThreadPool(1);
		
		double tiempoInicio = System.currentTimeMillis();

		for(Vector l : conciliacion ){
			//System.out.println("Contrato "+l.get(1).toString());
			execSvc.execute( new ClienteIWBD(l.get(0).toString(), l.get(1).toString()) );
		}

		execSvc.shutdown();
		
		double tiempoFin = System.currentTimeMillis();
		double tiempo = (tiempoFin - tiempoInicio)/1000;
		System.out.println("SEGUNDOS EN QUE SE PROCESO: "+tiempo);


	}



	public static void main(String a[]){
		new ConciliacionIntraway().Conciliar();
		
		//new Querys().executeAPI_CreacionCliente("14572932", "A");
		
	}

}
