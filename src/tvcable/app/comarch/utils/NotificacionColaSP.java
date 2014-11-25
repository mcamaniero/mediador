package tvcable.app.comarch.utils;

import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.app.dao.titan.Querys;
import com.app.mail.EnvioMail;

public class NotificacionColaSP extends TimerTask implements ServletContextListener {

	private Timer timer;
	public static final int MAX = 50;

	@Override
	public void run() { 
		
		//Consulto la Cola x spsystem_id
		//select ID, NAME from TSPSYSTEMDEFS order by id
		// TV 		= 1,5,6,7
		// SAFARI	= 3
		// INTRAWAY = 4
		// AURIS	= 2
		
		List<Vector> sysDefs = new Querys().findAll_TSPSYSTEMDEFS();
		for(Vector v : sysDefs){
			int encoladas = new Querys().findAll_State_Q(v.get(0).toString());
			if( encoladas >= MAX){
				
				List<Vector> res = new Querys().findAll_State_GrupoBy(v.get(0).toString());
				String html = "<br/><table width='128' border='0' align='center'>";
				for(Vector vv : res){
					html+="<tr>";
					html+="<td>"+vv.get(0)+"</td>";
					html+="<td>"+vv.get(1)+"</td>";
					html+="</tr>";
				}
				html+="</table>";
				
				new EnvioMail("TvCable","ENCOLAMIENTO: "+v.get(1).toString(),"spsystem_id: "+
						v.get(0).toString(),"TOTAL ENCOLADAS "+encoladas +" "+html ,0);
				
				
			}
		}
		
		
		//notificacion para verificar los JOBs
		// si es 0, no existen jobs activos
		/*if ( new Querys().findAll_State_JOB_Activos() == 0){
			String q = "<br/>select * from dba_jobs  <br/>where  schema_user = 'BSCC'  <br/>and what  like '%SLAVE-DEMON4SP-SYSTEM%'";
			new EnvioMail("TvCable","JOBS BSCC","JOBS APROVISIONAMIENTO","Se ejecuta el siguiente query y no trae datos "+q ,0);
			
		}*/
		
		
		
	}

	public void contextDestroyed(ServletContextEvent arg0) {
		 timer.cancel();
	}

	public void contextInitialized(ServletContextEvent arg0) {
		timer = new Timer();
		timer.schedule(this, 0, 15*60*1000);  //Cada 15 minutos

	}

}
