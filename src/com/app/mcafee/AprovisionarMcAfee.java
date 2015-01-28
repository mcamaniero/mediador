package com.app.mcafee;

import https.partners_compuredes_com_co.mcafee.ArrayOfClsItemsConsumer;
import https.partners_compuredes_com_co.mcafee.ArrayOfClsPreferencesConsumer;
import https.partners_compuredes_com_co.mcafee.ClsClientConsumer;
import https.partners_compuredes_com_co.mcafee.ClsItemsConsumer;
import https.partners_compuredes_com_co.mcafee.ClsOrdenConsumer;
import https.partners_compuredes_com_co.mcafee.ClsOrderTransConsumer;
import https.partners_compuredes_com_co.mcafee.ClsPreferencesConsumer;
import https.partners_compuredes_com_co.mcafee.TypeTipoPeticion;
import https.partners_compuredes_com_co.mcafee.wsCrTransSvcClient;
import https.partners_compuredes_com_co.mcafee.wsCrTransSvcSoap;

import java.rmi.RemoteException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.rpc.ServiceException;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;

import org.apache.axis.client.Stub;
import org.apache.axis.message.SOAPHeaderElement;

import co.com.compuredes.partners.mcafee.WsCrLoginSvcLocator;
import co.com.compuredes.partners.mcafee.WsCrLoginSvcSoap;

import com.app.dao.EntityManagerHelper;
import com.app.dao.titan.Querys;
import com.app.mcafee.dao.McafCliente;
import com.app.mcafee.dao.McafClienteDAO;
import com.app.mcafee.dao.McafDettransaccion;
import com.app.mcafee.dao.McafDettransaccionDAO;
import com.app.mcafee.dao.McafSku;
import com.app.mcafee.dao.McafSkuDAO;
import com.app.mcafee.dao.McafTransaccion;
import com.app.mcafee.dao.McafTransaccionDAO;



public class AprovisionarMcAfee {

	private String IdEstado;
	private String Correo;
	private String IdMcAfee;
	private String Referencia;
	private int IdEmpresa;
	private String Sistema;
	private String Interfaz;
	private String Cuenta;
	private String IdProducto;
	private int PlanMcAfeeTvCable;
	private String ClienteCRM;
	private String IdProductoCRM;
	private int LogId;
	private String Nombre;


	public static final String NuevoProducto = "PD";
	public static final String CancelarProducto = "CN";
	private String SubPartnerID = "107";
	private String SubPartnerID2 = "108";
	private String SubPartnerPass = "tvc@8l3_3c";

	private String NombreTvCable = "Cliente";
	private String ApellidoTvCable = "de Grupo TVCable";

	WsCrLoginSvcLocator locator = new WsCrLoginSvcLocator();
	WsCrLoginSvcSoap client = null;

	private String path = null;

	public AprovisionarMcAfee() {
		
		if(System.getProperty("os.name").startsWith("Windows")){
			System.setProperty("javax.net.ssl.trustStore", "c:\\jssecacerts");
			System.out.println("Windows");
		}else 
			System.setProperty("javax.net.ssl.trustStore", "/usr/jssecacerts");
		
		System.setProperty("javax.net.ssl.trustStorePassword", "changeit");

	}

	public AprovisionarMcAfee(int idEmpresa, String sistema, String interfaz,
			String idEstado, String cuenta, String idProducto, String correo,
			int planMcAfeeTvCable, String clienteCRM, String idProductoCRM,
			String idMcAfee, String referencia, int logId, String Nombre) {


		/*path = getClass().getProtectionDomain().getCodeSource().
		getLocation().toString().substring(5);

    	path = path.substring(0, path.length()-24);


        System.out.println("***********Path: "+path);
		 */

		//instala el certificado
		/* try {
			new InstallCert(Host,"jssecacerts");
			//new InstallCert(Host2,"safariview");
		} catch (Exception e) {
			e.printStackTrace();
		}*/


		if(System.getProperty("os.name").startsWith("Windows")){
			System.setProperty("javax.net.ssl.trustStore", "c:\\jssecacerts");
			System.out.println("Windows");
		}else 
			System.setProperty("javax.net.ssl.trustStore", "/usr/jssecacerts");
		System.setProperty("javax.net.ssl.trustStorePassword", "changeit");


		this.IdEmpresa = idEmpresa;
		this.Sistema = sistema;
		this.Interfaz = interfaz;
		this.IdEstado = idEstado;
		this.Cuenta = cuenta;
		this.IdProducto = idProducto;
		this.Correo = correo;
		this.PlanMcAfeeTvCable = planMcAfeeTvCable;
		this.ClienteCRM = clienteCRM;
		this.IdProductoCRM = idProductoCRM;
		this.IdMcAfee = idMcAfee;
		this.Referencia = referencia;
		this.LogId = logId;
		this.Nombre = Nombre;

	}


	public static boolean isEmail(String correo) {
		Pattern pat = null;
		Matcher mat = null;
		pat = Pattern.compile("[a-zA-Z0-9]+[a-zA-Z0-9_-]*@[a-zA-Z]+\\p{Punct}[a-zA-Z]+");
		mat = pat.matcher(correo);

		return mat.find();

	}

	public ec.com.grupotvcable.wsdlmcafee.Respuesta Aprovisionar() {
		ec.com.grupotvcable.wsdlmcafee.Respuesta RMcAfee = new ec.com.grupotvcable.wsdlmcafee.Respuesta();

		String sesion = this.getSesion(this.SubPartnerID);
		System.out.println("Sesion: "+sesion);

		if(!sesion.substring(0, 5).equals("Error")){

			McafCliente clienteMcAfee = null;
			/*if(new McafClienteDAO().findByMail(Correo).size()>0)
				clienteMcAfee = new McafClienteDAO().findByMail(Correo).get(0);
			 */

			boolean isTrial = false;

			String NombreDelPlan = "";
			//Interfaz del cliente
			if(Interfaz.equals("900") ){

				//creacion del cliente
				if(this.IdEstado.equals("A") || this.IdEstado.equals("R")){

					//if(IdMcAfee != null && !IdMcAfee.equals(""))
					//clienteMcAfee = new McafClienteDAO().findById(Integer.parseInt(this.IdMcAfee));
					//else 

					if(new McafClienteDAO().findByMail(Correo).size()>0)
						clienteMcAfee = new McafClienteDAO().findByMail(Correo).get(0);

					String Clave = "";
					//si no existe el correo en la base del aprovisionamiento lo creo
					if(clienteMcAfee == null){
						SecureRandom secureRand = null;
						long clave = 0;

						try {
							secureRand = SecureRandom.getInstance("SHA1PRNG");
							clave = secureRand.nextInt(900000000);
						} catch (NoSuchAlgorithmException e) {
							e.printStackTrace();
							clave = new Date().getTime();
						}
						Clave = "tvc"+clave+new Date().getMonth();

						EntityManagerHelper.beginTransaction();
						McafCliente entity = new McafCliente(0,this.Correo,this.IdProducto,this.Sistema,Clave);
						new McafClienteDAO().save(entity );
						EntityManagerHelper.commit();
						clienteMcAfee = entity;
						System.out.println(clienteMcAfee.getIdMcAfee()+" CREO NUEVO ID DE CLIENTE :"+Clave);


					}

					System.out.println("Clave "+clienteMcAfee.getPassword());
					//en este momento ya tengo el IdMcAfee y si recien se crea, el sku es con trial
					//McafTransaccion product = new McafTransaccionDAO().findByCitemId(IdProducto).get(0);
					if( new McafTransaccionDAO().findByPlanTvCable(this.PlanMcAfeeTvCable).size() == 0)
						isTrial = true;


					wsCrTransSvcClient client = new wsCrTransSvcClient();
					wsCrTransSvcSoap service = client.getwsCrTransSvcSoap();

					ClsOrderTransConsumer OrderConsumer = new ClsOrderTransConsumer();
					String sessionTransaction = sesion;


					OrderConsumer.setStrSesTransac(sessionTransaction);
					OrderConsumer.setSubPartnerID(SubPartnerID);
					OrderConsumer.setTipoPeticion(TypeTipoPeticion.NEW);//Actualizar

					//Cliente
					ClsClientConsumer clientConsumer = new ClsClientConsumer() ;
					clientConsumer.setId(""+clienteMcAfee.getIdMcAfee()); 
					clientConsumer.setNombres("Grupo");
					clientConsumer.setApellidos("TvCable");
					clientConsumer.setPassword(clienteMcAfee.getPassword());
					clientConsumer.setCorreo(clienteMcAfee.getMail());

					ArrayOfClsPreferencesConsumer pref = new ArrayOfClsPreferencesConsumer();
					List<ClsPreferencesConsumer> lst = pref.getClsPreferencesConsumer();
					ClsPreferencesConsumer e = new ClsPreferencesConsumer();
					e.setPreferenceName("LANG");
					e.setPreferenceValor("es-mx");
					lst.add(e);
					clientConsumer.setPreferences(pref );

					OrderConsumer.setClienteConsumer(clientConsumer);
					//Fin del Cliente

					EntityManagerHelper.beginTransaction();
					McafTransaccion TransacMc = new McafTransaccion(0,""+PlanMcAfeeTvCable,this.PlanMcAfeeTvCable,this.IdProducto,
							this.ClienteCRM, clienteMcAfee.getIdMcAfee(), 0);
					TransacMc.setLogId(this.LogId);
					System.out.println("LogId "+LogId);
					TransacMc.setFechaPeticion(new Date());
					new McafTransaccionDAO().save(TransacMc);
					EntityManagerHelper.commit();

					System.out.println("IDTRansaccion "+TransacMc.getId());

					ClsOrdenConsumer ordenConsumer = new ClsOrdenConsumer();
					ordenConsumer.setId(""+TransacMc.getId()); //id del numero de orden, este dato se debe de controlar

					ArrayOfClsItemsConsumer itemsConsumer = new ArrayOfClsItemsConsumer();
					List<ClsItemsConsumer> lst1 = itemsConsumer.getClsItemsConsumer();

					EntityManagerHelper.beginTransaction();

					//ahora busco los sku referentes al id de tvcable
					List<McafSku> skusTitan = new McafSkuDAO().findByPropertySKUTrial(PlanMcAfeeTvCable, isTrial);
					for(McafSku msku : skusTitan){
						System.out.println("SKU: "+msku.getSku());
						NombreDelPlan = msku.getDescPlanTvCable();
						ClsItemsConsumer e1 = new ClsItemsConsumer();
						e1.setId(msku.getSku());//SKU producto del id de mcaffe
						e1.setAccion(this.NuevoProducto);
						e1.setCantidad(1);
						lst1.add(e1);

						McafDettransaccion detTransacMc = new McafDettransaccion(0,TransacMc.getId(),msku.getSku(),"");
						new McafDettransaccionDAO().save(detTransacMc);

					}
					EntityManagerHelper.commit();

					ordenConsumer.setObjArticulos(itemsConsumer);
					//ordenConsumer.setReferencia("NCS19058534");//referencia dada por la respuesta

					OrderConsumer.setOrdenConsumer(ordenConsumer);


					String resp = service.wmOrderConsumer(OrderConsumer, sessionTransaction);

					//System.out.println(resp);

					Respuesta Res = new ParseRespuesta(resp).getRespuesta();

					EntityManagerHelper.beginTransaction();

					TransacMc.setFechaRespuesta(new Date());
					TransacMc.setPassword(Res.getPASSWORD());
					TransacMc.setReferencia(Res.getREF());
					TransacMc.setRespuestaXML(resp);
					if(Res.getREF()==null || Res.getREF().equals(""))
						TransacMc.setEstado("F");
					else TransacMc.setEstado("A");
					//clienteMcAfee.setPassword(Res.getPASSWORD());
					EntityManagerHelper.commit();


					RMcAfee.setCodError(Res.getRETURNCODE());
					RMcAfee.setDetMensaje(Res.getRETURNDESC());
					RMcAfee.setIdMcAfee(""+clienteMcAfee.getIdMcAfee());

					//envio el id de la tabla como referencia
					RMcAfee.setReferencia(""+TransacMc.getId());

					//modificacion del cliente
				}else if(this.IdEstado.equals("S") || this.IdEstado.equals("T")){

					clienteMcAfee = new McafClienteDAO().findById(Integer.parseInt(this.IdMcAfee));

					if(clienteMcAfee != null){

						wsCrTransSvcClient client = new wsCrTransSvcClient();
						wsCrTransSvcSoap service = client.getwsCrTransSvcSoap();

						ClsOrderTransConsumer OrderConsumer = new ClsOrderTransConsumer();
						String sessionTransaction = sesion;


						OrderConsumer.setStrSesTransac(sessionTransaction);
						OrderConsumer.setSubPartnerID(SubPartnerID);
						OrderConsumer.setTipoPeticion(TypeTipoPeticion.UPDATE);//Actualizar

						//Cliente
						ClsClientConsumer clientConsumer = new ClsClientConsumer() ;
						clientConsumer.setId(""+clienteMcAfee.getIdMcAfee()); 
						clientConsumer.setNombres("Grupo");
						clientConsumer.setApellidos("TvCable");
						clientConsumer.setPassword(clienteMcAfee.getPassword());
						clientConsumer.setCorreo(clienteMcAfee.getMail());

						ArrayOfClsPreferencesConsumer pref = new ArrayOfClsPreferencesConsumer();
						List<ClsPreferencesConsumer> lst = pref.getClsPreferencesConsumer();
						ClsPreferencesConsumer e = new ClsPreferencesConsumer();
						e.setPreferenceName("LANG");
						e.setPreferenceValor("es-mx");
						lst.add(e);
						clientConsumer.setPreferences(pref );

						OrderConsumer.setClienteConsumer(clientConsumer);
						//Fin del Cliente

						McafTransaccion TransacMc = new McafTransaccionDAO().findById(Integer.parseInt(this.Referencia));

						System.out.println("IDTRansaccion "+TransacMc.getId());

						ClsOrdenConsumer ordenConsumer = new ClsOrdenConsumer();
						ordenConsumer.setId(""+TransacMc.getId()); //id del numero de orden, este dato se debe de controlar

						ArrayOfClsItemsConsumer itemsConsumer = new ArrayOfClsItemsConsumer();
						List<ClsItemsConsumer> lst1 = itemsConsumer.getClsItemsConsumer();

						List<McafDettransaccion> detSku = new McafDettransaccionDAO().findByIdTransaccion(""+TransacMc.getId());
						for(McafDettransaccion msku : detSku){
							System.out.println("SKU: "+msku.getSkumcAfee());
							//NombreDelPlan = msku.getDescPlanTvCable();
							ClsItemsConsumer e1 = new ClsItemsConsumer();
							e1.setId(msku.getSkumcAfee());//SKU producto del id de mcaffe
							e1.setAccion(this.CancelarProducto);
							e1.setCantidad(1);
							lst1.add(e1);
						}

						ordenConsumer.setObjArticulos(itemsConsumer);
						ordenConsumer.setReferencia(TransacMc.getReferencia());//referencia dada por la respuesta

						OrderConsumer.setOrdenConsumer(ordenConsumer);

						String resp = service.wmOrderConsumer(OrderConsumer, sessionTransaction);

						//System.out.println(resp);

						Respuesta Res = new ParseRespuesta(resp).getRespuesta();

						EntityManagerHelper.beginTransaction();

						TransacMc.setFechaRespuesta(new Date());
						TransacMc.setRespuestaXML(resp);
						TransacMc.setEstado("T");
						EntityManagerHelper.commit();

						RMcAfee.setCodError(Res.getRETURNCODE());
						RMcAfee.setDetMensaje(Res.getRETURNDESC());
						RMcAfee.setIdMcAfee(""+clienteMcAfee.getIdMcAfee());

						//envio el id de la tabla como referencia
						RMcAfee.setReferencia(""+TransacMc.getId());

					}else{

						RMcAfee.setCodError("2");
						RMcAfee.setDetMensaje("IdMcAfee no Existe en la base de Aprosivionamiento Titan");
					}

				}

			}else if(Interfaz.equals("910") ){

				clienteMcAfee = new McafClienteDAO().findById(Integer.parseInt(this.IdMcAfee));

				if(clienteMcAfee!=null){
					wsCrTransSvcClient client = new wsCrTransSvcClient();
					wsCrTransSvcSoap service = client.getwsCrTransSvcSoap();

					ClsOrderTransConsumer OrderConsumer = new ClsOrderTransConsumer();
					String sessionTransaction = sesion;

					OrderConsumer.setStrSesTransac(sessionTransaction);
					OrderConsumer.setSubPartnerID(SubPartnerID);
					OrderConsumer.setTipoPeticion(TypeTipoPeticion.UPDPROFILE);//Actualizar

					//Cliente
					ClsClientConsumer clientConsumer = new ClsClientConsumer() ;
					clientConsumer.setId(""+clienteMcAfee.getIdMcAfee()); 
					clientConsumer.setNombres("Grupo");
					clientConsumer.setApellidos("TvCable");
					clientConsumer.setPassword(clienteMcAfee.getPassword());
					clientConsumer.setCorreo(this.Correo);//envio el nuevo mail

					ArrayOfClsPreferencesConsumer pref = new ArrayOfClsPreferencesConsumer();
					List<ClsPreferencesConsumer> lst = pref.getClsPreferencesConsumer();
					ClsPreferencesConsumer e = new ClsPreferencesConsumer();
					e.setPreferenceName("LANG");
					e.setPreferenceValor("es-mx");
					lst.add(e);
					clientConsumer.setPreferences(pref);

					OrderConsumer.setClienteConsumer(clientConsumer);
					//Fin del Cliente

					String resp = service.wmOrderConsumer(OrderConsumer, sessionTransaction);
					//System.out.println(resp);

					Respuesta Res = new ParseRespuesta(resp).getRespuesta();

					EntityManagerHelper.beginTransaction();

					clienteMcAfee.setMail(this.Correo);
					EntityManagerHelper.commit();

					RMcAfee.setCodError(Res.getRETURNCODE());
					RMcAfee.setDetMensaje(Res.getRETURNDESC());
					RMcAfee.setIdMcAfee(""+clienteMcAfee.getIdMcAfee());
				}else{

					RMcAfee.setCodError("2");
					RMcAfee.setDetMensaje("IdMcAfee no Existe en la base de Aprosivionamiento Titan");
				}

			}




			if(RMcAfee.getCodError().equals("1000") || RMcAfee.getCodError().equals("5001"))
				RMcAfee.setCodError("1");


			//envio el mail al cliente
			if(RMcAfee.getCodError().equals("1")){
				//new EnvioMailMcAfee(Correo, Nombre, NombreDelPlan, clienteMcAfee.getPasswordWeb());

				if(Sistema.equals("TITAN"))
					new EnvioMailMcAfee(Correo, Nombre, NombreDelPlan, clienteMcAfee.getPassword(),""+this.IdEmpresa);

				if(Sistema.equals("SGN"))
					new EnvioMailMcAfee("mmontoya@tvcable.com.ec", Nombre, NombreDelPlan, clienteMcAfee.getPassword(),""+this.IdEmpresa);

				if(Sistema.equals("GT"))
					new EnvioMailMcAfee("aavila@tvcable.com.ec", Nombre, NombreDelPlan, clienteMcAfee.getPassword(),""+this.IdEmpresa);
			}
		}

		return RMcAfee;
	}






	public ec.com.grupotvcable.wsdlmcafee.Respuesta Aprovisionar2() throws Exception {

		ec.com.grupotvcable.wsdlmcafee.Respuesta RMcAfee = new ec.com.grupotvcable.wsdlmcafee.Respuesta();


		//if(!sesion.substring(0, 5).equals("Error")){

		McafCliente clienteMcAfee = null;

		boolean isTrial = false;
		String NombreDelPlan = "";

		//Interfaz del cliente
		if(Interfaz.equals("900") ){


			//creacion del cliente
			if(this.IdEstado.equals("A") || this.IdEstado.equals("R")){
				if(new McafClienteDAO().findByMail(Correo).size()>0)
					clienteMcAfee = new McafClienteDAO().findByMail(Correo).get(0);

				String Clave = "";
				//si no existe el correo en la base del aprovisionamiento lo creo
				if(clienteMcAfee == null){
					SecureRandom secureRand = null;
					long clave = 0;

					try {
						secureRand = SecureRandom.getInstance("SHA1PRNG");
						clave = secureRand.nextInt(900000000);
					} catch (NoSuchAlgorithmException e) {
						e.printStackTrace();
						clave = new Date().getTime();
					}
					Clave = "tvc"+clave+new Date().getMonth()+""+new Date().getDay();

					EntityManagerHelper.beginTransaction();
					McafCliente entity = new McafCliente(0,this.Correo,this.IdProducto,this.Sistema,Clave);
					new McafClienteDAO().save(entity );
					EntityManagerHelper.commit();
					clienteMcAfee = entity;
					System.out.println(clienteMcAfee.getIdMcAfee()+" CREO NUEVO ID DE CLIENTE :"+Clave);


				}



				//en este momento ya tengo el IdMcAfee y si recien se crea, el sku es con trial
				//McafTransaccion product = new McafTransaccionDAO().findByCitemId(IdProducto).get(0);
				if( new McafTransaccionDAO().findByPropertyMcAfeeIDPlanTvCable(clienteMcAfee.getIdMcAfee(), this.PlanMcAfeeTvCable).size() == 0)
					isTrial = true;

				EntityManagerHelper.beginTransaction();
				McafTransaccion TransacMc = new McafTransaccion(0,""+PlanMcAfeeTvCable,this.PlanMcAfeeTvCable,this.IdProducto,
						this.ClienteCRM, clienteMcAfee.getIdMcAfee(), 0);
				TransacMc.setLogId(this.LogId);
				System.out.println("LogId "+LogId);
				TransacMc.setFechaPeticion(new Date());
				new McafTransaccionDAO().save(TransacMc);
				EntityManagerHelper.commit();


				boolean continueAprov = false;
				//un correo no puede tener mas de un tipo de producto
				//ej: no puede tener 2 familia protegida
				//o no puede tener 2 proteccion total
				if( new McafTransaccionDAO().findByPropertyMcAfeeIDPlanTvCableActivo(clienteMcAfee.getIdMcAfee(), this.PlanMcAfeeTvCable).size() == 0)
					continueAprov = true;


				System.out.println("IDTRansaccion "+TransacMc.getId());

				String RespXML		= "";
				String CodError		= "";
				String DetMensaje	= "";
				String PassWeb 		= "";

				if(continueAprov){

					List<McafSku> skusTitan = new McafSkuDAO().findByPropertySKUTrial(PlanMcAfeeTvCable, isTrial);
					for(McafSku msku : skusTitan){
						System.out.println("SKU: "+msku.getSku());
						NombreDelPlan = msku.getDescPlanTvCable();
						String subPartnerID = "";
						if(msku.getSku().substring(0, 3).equals("594"))//los de familia protegida
							subPartnerID = this.SubPartnerID2;
						else subPartnerID = this.SubPartnerID;

						/////////////////////////////////////
						/////////////////////////////////////
						//String correoo = "prueba37@tvcable.com1";
						String resp = this.Peticion(getSesion(subPartnerID), subPartnerID, ""+clienteMcAfee.getIdMcAfee(), 
								clienteMcAfee.getPassword(), clienteMcAfee.getMail(), 
								""+TransacMc.getId(), this.NuevoProducto, msku.getSku(), "", TypeTipoPeticion.NEW);

						//System.out.println(resp);

						Respuesta Res = null;
						String referencia = "";

						RespXML = RespXML + resp + "\n";

						try{
							Res = new ParseRespuesta(resp).getRespuesta();
							referencia = Res.getREF();

							if(Res.getRETURNCODE().equals("1000") || Res.getRETURNCODE().equals("5001"))
								CodError = "1";
							else CodError += Res.getRETURNCODE();
							DetMensaje += Res.getRETURNDESC();

						}catch(Exception e){
							e.printStackTrace();
							referencia = "ERROR";
						}
						EntityManagerHelper.beginTransaction();
						McafDettransaccion detTransacMc = new McafDettransaccion(0,TransacMc.getId(),msku.getSku(), referencia);
						new McafDettransaccionDAO().save(detTransacMc);
						EntityManagerHelper.commit();
						PassWeb = Res.getPASSWORD();

					}



					EntityManagerHelper.beginTransaction();

					TransacMc.setFechaRespuesta(new Date());
					TransacMc.setRespuestaXML(RespXML);
					if(!CodError.equals("1"))
						TransacMc.setEstado("F");
					else TransacMc.setEstado("A");

					clienteMcAfee.setPasswordWeb(PassWeb);

					EntityManagerHelper.commit();



					RMcAfee.setCodError(CodError);
					RMcAfee.setDetMensaje(DetMensaje);

					RMcAfee.setIdMcAfee(""+clienteMcAfee.getIdMcAfee());

					//envio el id de la tabla como referencia
					RMcAfee.setReferencia(""+TransacMc.getId());


					//SI VIENE POR EL DUNNING.
					//actualizo las Propiedades en Titan.
					if(this.IdEstado.equals("R") && !this.IdProducto.equals(""))
						new Querys().executeAPI_UpdateReferenciaAntivirus(
								this.IdProducto, ""+TransacMc.getId());


				}else{
					//envio error que no se puede aprovisionar ya que ya posee un SKU Activo

					String detError = "Error: no se puede aprovisionar. Correo ya posee un Producto Antivirus Activo";

					EntityManagerHelper.beginTransaction();
					RMcAfee.setCodError("2");
					RMcAfee.setDetMensaje(detError);

					TransacMc.setFechaRespuesta(new Date());
					TransacMc.setRespuestaXML(detError);
					TransacMc.setEstado("F");

					EntityManagerHelper.commit();

				}


				//modificacion del cliente
			}else if(this.IdEstado.equals("S") || this.IdEstado.equals("T")){

				clienteMcAfee = new McafClienteDAO().findById(Integer.parseInt(this.IdMcAfee));
				if(clienteMcAfee != null){

					McafTransaccion TransacMc = new McafTransaccionDAO().findById(Integer.parseInt(this.Referencia));

					System.out.println("IDTRansaccion "+TransacMc.getId());

					String RespXML = "";
					String CodError = "";
					String DetMensaje = "";

					List<McafDettransaccion> detSku = new McafDettransaccionDAO().findByIdTransaccion(""+TransacMc.getId());
					for(McafDettransaccion msku : detSku){
						System.out.println("SKU: "+msku.getSkumcAfee());


						String subPartnerID = "";
						if(msku.getSkumcAfee().substring(0, 3).equals("594"))//los de familia protegida
							subPartnerID = this.SubPartnerID2;
						else subPartnerID = this.SubPartnerID;


						String resp = this.Peticion(getSesion(subPartnerID), subPartnerID, ""+clienteMcAfee.getIdMcAfee(), 
								clienteMcAfee.getPassword(), clienteMcAfee.getMail(), 
								""+TransacMc.getId(), this.CancelarProducto, msku.getSkumcAfee(), 
								""+msku.getReferencia(), TypeTipoPeticion.UPDATE);

						//System.out.println(resp);

						Respuesta Res = null;

						RespXML = RespXML + resp + "\n";

						try{
							Res = new ParseRespuesta(resp).getRespuesta();

							if(Res.getRETURNCODE().equals("1000") || Res.getRETURNCODE().equals("5001"))
								CodError = "1";
							else CodError += Res.getRETURNCODE();
							DetMensaje += Res.getRETURNDESC();

						}catch(Exception e){
							e.printStackTrace();
							CodError = "3";
							DetMensaje = e.getMessage();
						}

					}


					EntityManagerHelper.beginTransaction();

					TransacMc.setFechaRespuesta(new Date());
					TransacMc.setRespuestaXML(RespXML);
					if(!CodError.equals("1"))
						TransacMc.setEstado("FT");//fallo la terminacion
					else TransacMc.setEstado("T");
					EntityManagerHelper.commit();

					RMcAfee.setCodError(CodError);
					RMcAfee.setDetMensaje(DetMensaje);
					RMcAfee.setIdMcAfee(""+clienteMcAfee.getIdMcAfee());

					//envio el id de la tabla como referencia
					RMcAfee.setReferencia(""+TransacMc.getId());

				}else{

					RMcAfee.setCodError("2");
					RMcAfee.setDetMensaje("IdMcAfee no Existe en la base de Aprosivionamiento Titan");
				}
			}

		}else if(Interfaz.equals("910") ){

			System.out.print("Entro 910");

			clienteMcAfee =	 new McafClienteDAO().findById(Integer.parseInt(this.IdMcAfee));

			if(clienteMcAfee!=null){
				String subPartnerID ="";
				if(new McafTransaccionDAO().findByTransaccionProductFamily(""+clienteMcAfee.getIdMcAfee()).size()>0)
					subPartnerID = this.SubPartnerID2;
				else subPartnerID = this.SubPartnerID;

				//subPartnerID="107";

				System.out.println("subPartnerID "+subPartnerID);

				wsCrTransSvcClient client = new wsCrTransSvcClient();
				wsCrTransSvcSoap service = client.getwsCrTransSvcSoap();

				ClsOrderTransConsumer OrderConsumer = new ClsOrderTransConsumer();
				String sessionTransaction = this.getSesion(subPartnerID);

				OrderConsumer.setStrSesTransac(sessionTransaction);
				OrderConsumer.setSubPartnerID(subPartnerID);
				OrderConsumer.setTipoPeticion(TypeTipoPeticion.UPDPROFILE);//Actualizar

				//Cliente
				ClsClientConsumer clientConsumer = new ClsClientConsumer() ;
				clientConsumer.setId(""+clienteMcAfee.getIdMcAfee()); 
				clientConsumer.setNombres(this.NombreTvCable);
				clientConsumer.setApellidos(this.ApellidoTvCable);
				clientConsumer.setPassword(clienteMcAfee.getPassword());
				System.out.println("Clave "+clienteMcAfee.getPassword());
				clientConsumer.setCorreo(this.Correo);//envio el nuevo mail

				System.out.println("Correo Nuevo "+Correo);

				ArrayOfClsPreferencesConsumer pref = new ArrayOfClsPreferencesConsumer();
				List<ClsPreferencesConsumer> lst = pref.getClsPreferencesConsumer();
				ClsPreferencesConsumer e = new ClsPreferencesConsumer();
				e.setPreferenceName("LANG");
				e.setPreferenceValor("es-mx");
				lst.add(e);
				clientConsumer.setPreferences(pref);

				OrderConsumer.setClienteConsumer(clientConsumer);
				//Fin del Cliente

				String resp = service.wmOrderConsumer(OrderConsumer, sessionTransaction);
				System.out.println(resp);

				Respuesta Res = new ParseRespuesta(resp).getRespuesta();


				System.out.println("getRETURNCODE "+Res.getRETURNCODE());
				System.out.println("getRETURNDESC "+Res.getRETURNDESC());
				System.out.println("getPASSWORD "+Res.getPASSWORD());

				String CodError="";
				if(Res.getRETURNCODE().equals("1000") || Res.getRETURNCODE().equals("5001")){
					CodError = "1";

					//grabo los nuevos cambios
					EntityManagerHelper.beginTransaction();
					clienteMcAfee.setMail(this.Correo);
					clienteMcAfee.setPasswordWeb(Res.getPASSWORD());
					EntityManagerHelper.commit();

				}else CodError += Res.getRETURNCODE();


				RMcAfee.setCodError(CodError);
				RMcAfee.setDetMensaje(Res.getRETURNDESC());
				RMcAfee.setIdMcAfee(""+clienteMcAfee.getIdMcAfee());
			}else{

				RMcAfee.setCodError("2");
				RMcAfee.setDetMensaje("IdMcAfee no Existe en la base de Aprosivionamiento Titan");
			}

		}


		//envio el mail al cliente
		if(RMcAfee.getCodError().equals("1") 
				&& (this.IdEstado.equals("A") 
						|| this.IdEstado.equals("R"))){
			new EnvioMailMcAfee(Correo, Nombre, NombreDelPlan, clienteMcAfee.getPassword(), ""+this.IdEmpresa);
		}

		/*if(this.Interfaz.equals("910")){
			if(RMcAfee.getCodError().equals("1") || RMcAfee.getCodError().equals("6001"))
			new EnvioMailMcAfee(Correo, Nombre, NombreDelPlan, clienteMcAfee.getPassword(), ""+this.IdEmpresa);
		}*/

		return RMcAfee;
	}





	public ec.com.grupotvcable.wsdlmcafee.Respuesta Aprovisionar3() throws Exception {

		ec.com.grupotvcable.wsdlmcafee.Respuesta RMcAfee = new ec.com.grupotvcable.wsdlmcafee.Respuesta();


		//if(!sesion.substring(0, 5).equals("Error")){

		McafCliente clienteMcAfee = null;

		boolean isTrial = false;
		String NombreDelPlan = "";

		//Interfaz del cliente
		if(Interfaz.equals("900") ){

			//creacion del cliente
			if(this.IdEstado.equals("A") || this.IdEstado.equals("R")){
				if(new McafClienteDAO().findByMail(Correo).size()>0)
					clienteMcAfee = new McafClienteDAO().findByMail(Correo).get(0);

				String Clave = "";
				//si no existe el correo en la base del aprovisionamiento lo creo
				if(clienteMcAfee == null){
					SecureRandom secureRand = null;
					long clave = 0;

					try {
						secureRand = SecureRandom.getInstance("SHA1PRNG");
						clave = secureRand.nextInt(900000000);
					} catch (NoSuchAlgorithmException e) {
						e.printStackTrace();
						clave = new Date().getTime();
					}
					Clave = "tvc"+clave+new Date().getMonth()+""+new Date().getDay();

					EntityManagerHelper.beginTransaction();
					McafCliente entity = new McafCliente(0,this.Correo,this.IdProducto,this.Sistema,Clave);
					new McafClienteDAO().save(entity );
					EntityManagerHelper.commit();
					clienteMcAfee = entity;
					System.out.println(clienteMcAfee.getIdMcAfee()+" CREO NUEVO ID DE CLIENTE :"+Clave);

				}



				//en este momento ya tengo el IdMcAfee y si recien se crea, el sku es con trial
				//McafTransaccion product = new McafTransaccionDAO().findByCitemId(IdProducto).get(0);
				if( new McafTransaccionDAO().findByPropertyMcAfeeIDPlanTvCable(clienteMcAfee.getIdMcAfee(), this.PlanMcAfeeTvCable).size() == 0)
					isTrial = true;

				EntityManagerHelper.beginTransaction();
				McafTransaccion TransacMc = new McafTransaccion(0,""+PlanMcAfeeTvCable,this.PlanMcAfeeTvCable,this.IdProducto,
						this.ClienteCRM, clienteMcAfee.getIdMcAfee(), 0);
				TransacMc.setLogId(this.LogId);
				System.out.println("LogId "+LogId);
				TransacMc.setFechaPeticion(new Date());
				new McafTransaccionDAO().save(TransacMc);
				EntityManagerHelper.commit();


				boolean continueAprov = false;
				//un correo no puede tener mas de un tipo de producto
				//ej: no puede tener 2 familia protegida
				//o no puede tener 2 proteccion total
				List<McafTransaccion> tmp = new McafTransaccionDAO().findByPropertyMcAfeeIDPlanTvCableActivo(
						clienteMcAfee.getIdMcAfee(), this.PlanMcAfeeTvCable);
				if( tmp.size() == 0)
					continueAprov = true;


				boolean continueAprov2 = true;

				List<Vector> tmpSKU = new McafTransaccionDAO().findByTransaccionSKU(""+clienteMcAfee.getIdMcAfee());
				for(Vector v: tmpSKU){
					String plan = v.get(0).toString();
					//1 internet seguro
					//2 proteccino total
					//3 familia protegida
					if( (PlanMcAfeeTvCable == 1 && plan.equals("4")) || 
							(PlanMcAfeeTvCable == 4 && plan.equals("1")) ){
						continueAprov2 = false;
					}
					if( (PlanMcAfeeTvCable == 2 && plan.equals("5")) || 
							(PlanMcAfeeTvCable == 5 && plan.equals("2")) ){
						continueAprov2 = false;
					}
					
					if( (PlanMcAfeeTvCable == 3 && plan.equals("4")) || 
							(PlanMcAfeeTvCable == 3 && plan.equals("5")) ){
						continueAprov2 = false;
					}
					
					if( (PlanMcAfeeTvCable == 4 && plan.equals("3")) || 
							(PlanMcAfeeTvCable == 4 && plan.equals("5")) ){
						continueAprov2 = false;
					}
					
					if( (PlanMcAfeeTvCable == 5 && plan.equals("3")) || 
							(PlanMcAfeeTvCable == 5 && plan.equals("4")) ){
						continueAprov2 = false;
					}
					
				}


				System.out.println("IDTRansaccion "+TransacMc.getId());

				String RespXML		= "";
				String CodError		= "";
				String DetMensaje	= "";
				String PassWeb 		= "";

				// como no tiene licencias Activas procedo con el Aprovisionamiento
				if(continueAprov){

					if(continueAprov2){

					ArrayOfClsItemsConsumer itemsConsumer = new ArrayOfClsItemsConsumer();
					List<ClsItemsConsumer> lst1 = itemsConsumer.getClsItemsConsumer();

					List<McafSku> skusTitan = new McafSkuDAO().findByPropertySKUTrial(PlanMcAfeeTvCable, isTrial);
					for(McafSku msku : skusTitan){
						//String sk = "";
						//trial
						/*if(msku.getSku().equals("594-33041-mfpo") && skusTitan.size()==1)
							sk="772-33695-mfpo";
						if(msku.getSku().equals("594-33041-mfpo") && skusTitan.size()==2)
							sk="772-33041-mfpo";

						//no trial
						if(msku.getSku().equals("594-34468-mfpo") && skusTitan.size()==1)
							sk="772-34468-mfpo";
						if(msku.getSku().equals("594-34468-mfpo") && skusTitan.size()==2)
							sk="772-36361-mfpo";

						if(sk.equals(""))
							sk = msku.getSku();*/

						ClsItemsConsumer e1 = new ClsItemsConsumer();
						e1.setId(msku.getSku());//SKU producto del id de mcaffe
						//e1.setId(sk);
						e1.setAccion(this.NuevoProducto); //this.NuevoProducto
						e1.setCantidad(1);
						lst1.add(e1);

						EntityManagerHelper.beginTransaction();
						McafDettransaccion detTransacMc = new McafDettransaccion(0,TransacMc.getId(),msku.getSku(), "");
						new McafDettransaccionDAO().save(detTransacMc);
						EntityManagerHelper.commit();

					}

					RespXML = this.Peticion2(getSesion(this.SubPartnerID), this.SubPartnerID, ""+clienteMcAfee.getIdMcAfee(), 
							clienteMcAfee.getPassword(), clienteMcAfee.getMail(), 
							""+TransacMc.getId(), itemsConsumer, "", TypeTipoPeticion.NEW);


					Respuesta Res = null;
					String referencia = "";

					//RespXML = resp;

					try{
						Res = new ParseRespuesta(RespXML).getRespuesta();
						referencia = Res.getREF();

						//actualizo la referencia en el detalle
						EntityManagerHelper.beginTransaction();
						List<McafDettransaccion> det = new McafDettransaccionDAO().findByIdTransaccion(TransacMc.getId());
						for(McafDettransaccion d : det)
							d.setReferencia(referencia);
						EntityManagerHelper.commit();


						if(Res.getRETURNCODE().equals("1000") || Res.getRETURNCODE().equals("5001"))
							CodError = "1";
						else CodError += Res.getRETURNCODE();
						DetMensaje += Res.getRETURNDESC();

					}catch(Exception e){
						e.printStackTrace();
						referencia = "ERROR";
					}

					PassWeb = Res.getPASSWORD();

					EntityManagerHelper.beginTransaction();

					TransacMc.setFechaRespuesta(new Date());
					TransacMc.setRespuestaXML(RespXML);
					TransacMc.setCodError(CodError);
					TransacMc.setDetMensaje(DetMensaje);
					if(!CodError.equals("1"))
						TransacMc.setEstado("F");
					else TransacMc.setEstado("A");
					clienteMcAfee.setPasswordWeb(PassWeb);

					EntityManagerHelper.commit();

					RMcAfee.setCodError(CodError);
					RMcAfee.setDetMensaje(DetMensaje);
					RMcAfee.setIdMcAfee(""+clienteMcAfee.getIdMcAfee());
					RMcAfee.setReferencia(""+TransacMc.getId());


					//SI VIENE POR EL DUNNING.
					//actualizo las Propiedades en Titan.
					if(this.IdEstado.equals("R") && !this.IdProducto.equals(""))
						new Querys().executeAPI_UpdateReferenciaAntivirus(
								this.IdProducto, ""+TransacMc.getId());

					}else{
						
						String detError = "Error: no se puede aprovisionar. Correo ya posee un Producto Antivirus Activo Combinado del mismo Tipo";
						EntityManagerHelper.beginTransaction();
						RMcAfee.setCodError("3");
						RMcAfee.setIdMcAfee(""+clienteMcAfee.getIdMcAfee());
						RMcAfee.setDetMensaje(detError);

						TransacMc.setFechaRespuesta(new Date());
						TransacMc.setRespuestaXML(detError);
						TransacMc.setEstado("F");
						TransacMc.setCodError("3");
						TransacMc.setDetMensaje(detError);
						EntityManagerHelper.commit();
						
						
					}

				}else{
					//envio error que no se puede aprovisionar ya que ya posee un SKU Activo

					String detError = "Error: no se puede aprovisionar. Correo ya posee un Producto Antivirus Activo del mismo Tipo. Referencia N: "+tmp.get(0).getId();
					EntityManagerHelper.beginTransaction();
					RMcAfee.setCodError("2");
					RMcAfee.setReferencia(""+tmp.get(0).getId());
					RMcAfee.setIdMcAfee(""+clienteMcAfee.getIdMcAfee());
					RMcAfee.setDetMensaje(detError);

					TransacMc.setFechaRespuesta(new Date());
					TransacMc.setRespuestaXML(detError);
					TransacMc.setEstado("F");
					TransacMc.setCodError("3");
					TransacMc.setDetMensaje(detError);
					
					EntityManagerHelper.commit();

				}


				//modificacion del cliente
			}else if(this.IdEstado.equals("S") || this.IdEstado.equals("T")){

				clienteMcAfee = new McafClienteDAO().findById(Integer.parseInt(this.IdMcAfee));
				if(clienteMcAfee != null){

					McafTransaccion TransacMc = new McafTransaccionDAO().findById(Integer.parseInt(this.Referencia));

					System.out.println("IDTRansaccion "+TransacMc.getId());

					String RespXML = "";
					String CodError = "";
					String DetMensaje = "";

					List<McafDettransaccion> detSku = new McafDettransaccionDAO().findByIdTransaccion(TransacMc.getId());

					boolean isFamilia_Antigua = false;
					for(McafDettransaccion msku : detSku){
						System.out.println("sku "+msku.getSkumcAfee());

						if(msku.getSkumcAfee().substring(0, 3).equals("594"))//los de familia protegida
							isFamilia_Antigua = true;
					}

					System.out.println("isFamilia_Antigua "+isFamilia_Antigua);


					//para los que tienen el FP antiguo
					if(isFamilia_Antigua){
						for(McafDettransaccion msku : detSku){
							//System.out.println("SKU: "+msku.getSkumcAfee());2

							String subPartnerID = "";
							if(msku.getSkumcAfee().substring(0, 3).equals("594"))//los de familia protegida
								subPartnerID = this.SubPartnerID2;
							else subPartnerID = this.SubPartnerID;

							System.out.println("subPartnerID "+subPartnerID);

							String resp = this.Peticion(getSesion(subPartnerID), subPartnerID, ""+clienteMcAfee.getIdMcAfee(), 
									clienteMcAfee.getPassword(), clienteMcAfee.getMail(), 
									""+TransacMc.getId(), this.CancelarProducto, msku.getSkumcAfee(), 
									""+msku.getReferencia(), TypeTipoPeticion.UPDATE);

							//System.out.println(resp);

							Respuesta Res = null;

							RespXML += resp + "\n";

							try{
								Res = new ParseRespuesta(resp).getRespuesta();

								if(Res.getRETURNCODE().equals("1000") || Res.getRETURNCODE().equals("5001"))
									CodError = "1";
								else CodError += Res.getRETURNCODE();

								DetMensaje += Res.getRETURNDESC();

							}catch(Exception e){
								e.printStackTrace();
								CodError = "3";
								DetMensaje = e.getMessage();
							}
						}


					}else{
						//para los nuevos de Familia
						ArrayOfClsItemsConsumer itemsConsumer = new ArrayOfClsItemsConsumer();
						List<ClsItemsConsumer> lst1 = itemsConsumer.getClsItemsConsumer();

						System.out.println("FAMILIA NUEVO");

						for(McafDettransaccion msku : detSku){
							ClsItemsConsumer e1 = new ClsItemsConsumer();
							System.out.println("SKU "+msku.getSkumcAfee());
							e1.setId(msku.getSkumcAfee());
							e1.setAccion(this.CancelarProducto); //this.NuevoProducto
							e1.setCantidad(1);
							lst1.add(e1);
						}

						String resp = this.Peticion2(getSesion(this.SubPartnerID), this.SubPartnerID, ""+clienteMcAfee.getIdMcAfee(), 
								clienteMcAfee.getPassword(), clienteMcAfee.getMail(), 
								""+TransacMc.getId(), itemsConsumer, "", TypeTipoPeticion.UPDATE);

						System.out.println("FAMILIA NUEVO RESP "+resp);
						System.out.println("RESP CODERROR "+CodError);

						Respuesta Res = null;


						TransacMc.setFechaRespuesta(new Date());
						TransacMc.setRespuestaXML(resp);


						try{
							Res = new ParseRespuesta(resp).getRespuesta();

							if(Res.getRETURNCODE().equals("1000") || Res.getRETURNCODE().equals("5001"))
								CodError = "1";
							else CodError += Res.getRETURNCODE();

							DetMensaje += Res.getRETURNDESC();

						}catch(Exception e){
							e.printStackTrace();
							CodError = "3";
							DetMensaje = e.getMessage();
						}

					}//fin del else..

					EntityManagerHelper.beginTransaction();
					if(!CodError.equals("1")){
						TransacMc.setEstado("FT");//fallo la terminacion
						TransacMc.setFechaRespuesta(new Date());

					}else{
						TransacMc.setEstado("T");
						TransacMc.setFechaRespuesta(new Date());
					}
					TransacMc.setCodError(CodError);
					TransacMc.setDetMensaje(DetMensaje);
					EntityManagerHelper.commit();

					RMcAfee.setCodError(CodError);
					RMcAfee.setDetMensaje(DetMensaje);
					RMcAfee.setIdMcAfee(""+clienteMcAfee.getIdMcAfee());

					//envio el id de la tabla como referencia
					RMcAfee.setReferencia(""+TransacMc.getId());

				}else{
					RMcAfee.setCodError("2");
					RMcAfee.setDetMensaje("IdMcAfee no Existe en la base de Aprosivionamiento Titan");
				}

			}
		}//fin de if, de interfaz 900
		else if(Interfaz.equals("910") ){

			System.out.print("Entro 910");

			clienteMcAfee =	 new McafClienteDAO().findById(Integer.parseInt(this.IdMcAfee));

			if(clienteMcAfee!=null){
				String subPartnerID ="";
				boolean isSubPartnerID = false;
				boolean isSubPartnerID2 = false;

				List<Vector> re = new McafTransaccionDAO().findByTransaccionFamily
				(""+clienteMcAfee.getIdMcAfee());
				for(Vector v : re){
					System.out.println(v.get(0));
					if(v.get(0).toString().substring(0, 3).equals("594"))
						isSubPartnerID2=true;
					else if(!v.get(0).toString().substring(0, 3).equals("594"))
						isSubPartnerID=true;
				}

				System.out.println("isSubPartnerID "+isSubPartnerID);
				System.out.println("isSubPartnerID2 "+isSubPartnerID2);


				Respuesta Res1 = null;
				if(isSubPartnerID)
					Res1 = new ParseRespuesta(upDateProfile(this.SubPartnerID, ""+clienteMcAfee.getIdMcAfee(), 
							clienteMcAfee.getPassword(), this.Correo)).getRespuesta();

				Respuesta Res2 = null;
				if(isSubPartnerID2)
					Res2 = new ParseRespuesta(upDateProfile(this.SubPartnerID2, ""+clienteMcAfee.getIdMcAfee(), 
							clienteMcAfee.getPassword(), this.Correo)).getRespuesta();


				String CodError1 = "";
				String RespMsn1 = "";
				String CodError2 = "";
				String RespMsn2 = "";
				String pass = "";

				if(Res1 != null)
					if(Res1.getRETURNCODE().equals("1000") || Res1.getRETURNCODE().equals("5001")){
						CodError1 = "1";
						RespMsn1 = Res1.getRETURNDESC();
						pass = Res1.getPASSWORD();
					}else{
						RespMsn1 = Res1.getRETURNDESC();
						CodError1 = Res1.getRETURNCODE();
					}

				if(Res2 != null)
					if(Res2.getRETURNCODE().equals("1000") || Res2.getRETURNCODE().equals("5001")){
						CodError2 = "1";
						RespMsn2 = Res2.getRETURNDESC();
						pass = Res2.getPASSWORD();
					} else {
						RespMsn2 = Res2.getRETURNDESC();
						CodError2 = Res2.getRETURNCODE();
					}

				String CodError = "";
				String Res = "";

				if( (CodError1.equals("1") && CodError2.equals(""))
						|| (CodError2.equals("1") && CodError1.equals(""))
						|| (CodError1.equals("1") && CodError2.equals("1"))
				){
					//grabo los nuevos cambios
					EntityManagerHelper.beginTransaction();
					clienteMcAfee.setMail(this.Correo);
					clienteMcAfee.setPasswordWeb(pass);
					EntityManagerHelper.commit();
					CodError="1";
					Res = RespMsn1 + " - "+ RespMsn2;
				}else{
					CodError = CodError1+""+CodError2;
					Res = RespMsn1 + " - "+ RespMsn2;
				}


				RMcAfee.setCodError(CodError);
				RMcAfee.setDetMensaje(Res);
				RMcAfee.setIdMcAfee(""+clienteMcAfee.getIdMcAfee());

			}else{

				RMcAfee.setCodError("2");
				RMcAfee.setDetMensaje("IdMcAfee no Existe en la base de Aprosivionamiento Titan");
			}

		}


		//envio el mail al cliente
		if(RMcAfee.getCodError().equals("1") 
				&& (this.IdEstado.equals("A") 
						|| this.IdEstado.equals("R"))){
			new EnvioMailMcAfee(Correo, Nombre, NombreDelPlan, clienteMcAfee.getPassword(), ""+this.IdEmpresa);
		}

		/*if(this.Interfaz.equals("910")){
			if(RMcAfee.getCodError().equals("1") || RMcAfee.getCodError().equals("6001"))
			new EnvioMailMcAfee(Correo, Nombre, NombreDelPlan, clienteMcAfee.getPassword(), ""+this.IdEmpresa);
		}*/

		return RMcAfee;
	}



	private String upDateProfile(String partnerid, String idCliente, String clave, String correo){

		wsCrTransSvcClient client = new wsCrTransSvcClient();
		wsCrTransSvcSoap service = client.getwsCrTransSvcSoap();

		ClsOrderTransConsumer OrderConsumer = new ClsOrderTransConsumer();
		String sessionTransaction = this.getSesion(partnerid);

		OrderConsumer.setStrSesTransac(sessionTransaction);
		OrderConsumer.setSubPartnerID(partnerid);
		OrderConsumer.setTipoPeticion(TypeTipoPeticion.UPDPROFILE);//Actualizar

		//Cliente
		ClsClientConsumer clientConsumer = new ClsClientConsumer() ;
		clientConsumer.setId(idCliente); 
		clientConsumer.setNombres(this.NombreTvCable);
		clientConsumer.setApellidos(this.ApellidoTvCable);
		clientConsumer.setPassword(clave);
		clientConsumer.setCorreo(correo);//envio el nuevo mail

		ArrayOfClsPreferencesConsumer pref = new ArrayOfClsPreferencesConsumer();
		List<ClsPreferencesConsumer> lst = pref.getClsPreferencesConsumer();
		ClsPreferencesConsumer e = new ClsPreferencesConsumer();
		e.setPreferenceName("LANG");
		e.setPreferenceValor("es-mx");
		lst.add(e);
		clientConsumer.setPreferences(pref);

		OrderConsumer.setClienteConsumer(clientConsumer);
		//Fin del Cliente

		return service.wmOrderConsumer(OrderConsumer, sessionTransaction);

	}




	private String Peticion(String sesion, String subPartnerID, String idMcAfee,
			String password, String mail, String transaccionID, String accion,
			String sku, String referencia, TypeTipoPeticion tipoPeticion)throws Exception{


		wsCrTransSvcClient client = new wsCrTransSvcClient();
		wsCrTransSvcSoap service = client.getwsCrTransSvcSoap();

		ClsOrderTransConsumer OrderConsumer = new ClsOrderTransConsumer();
		String sessionTransaction = sesion;


		OrderConsumer.setStrSesTransac(sessionTransaction);
		OrderConsumer.setSubPartnerID(subPartnerID);
		OrderConsumer.setTipoPeticion(tipoPeticion);//Actualizar

		//Cliente
		ClsClientConsumer clientConsumer = new ClsClientConsumer() ;
		clientConsumer.setId(idMcAfee); 
		clientConsumer.setNombres(this.NombreTvCable);
		clientConsumer.setApellidos(this.ApellidoTvCable);
		clientConsumer.setPassword(password);
		clientConsumer.setCorreo(mail);

		ArrayOfClsPreferencesConsumer pref = new ArrayOfClsPreferencesConsumer();
		List<ClsPreferencesConsumer> lst = pref.getClsPreferencesConsumer();
		ClsPreferencesConsumer e = new ClsPreferencesConsumer();
		e.setPreferenceName("LANG");
		e.setPreferenceValor("es-mx");
		lst.add(e);
		clientConsumer.setPreferences(pref );

		OrderConsumer.setClienteConsumer(clientConsumer);
		//Fin del Cliente


		//System.out.println("IDTRansaccion "+transaccionID);

		ClsOrdenConsumer ordenConsumer = new ClsOrdenConsumer();
		ordenConsumer.setId(transaccionID); //id del numero de orden, este dato se debe de controlar

		System.out.println("REferenciaaaa: "+transaccionID);

		ArrayOfClsItemsConsumer itemsConsumer = new ArrayOfClsItemsConsumer();
		List<ClsItemsConsumer> lst1 = itemsConsumer.getClsItemsConsumer();
		//System.out.println("SKU: "+sku);
		ClsItemsConsumer e1 = new ClsItemsConsumer();
		e1.setId(sku);//SKU producto del id de mcaffe
		e1.setAccion(accion); //this.NuevoProducto
		e1.setCantidad(1);
		lst1.add(e1);

		ordenConsumer.setObjArticulos(itemsConsumer);
		ordenConsumer.setReferencia(referencia);//referencia dada por la respuesta

		OrderConsumer.setOrdenConsumer(ordenConsumer);

		return service.wmOrderConsumer(OrderConsumer, sessionTransaction);

	}


	private String Peticion2(String sesion, String subPartnerID, String idMcAfee,
			String password, String mail, String transaccionID, ArrayOfClsItemsConsumer itemsConsumer, 
			String referencia, TypeTipoPeticion tipoPeticion)throws Exception{

		wsCrTransSvcClient client = new wsCrTransSvcClient();
		wsCrTransSvcSoap service = client.getwsCrTransSvcSoap();

		ClsOrderTransConsumer OrderConsumer = new ClsOrderTransConsumer();
		OrderConsumer.setStrSesTransac(sesion);
		OrderConsumer.setSubPartnerID(subPartnerID);
		OrderConsumer.setTipoPeticion(tipoPeticion);//Actualizar

		//Cliente
		ClsClientConsumer clientConsumer = new ClsClientConsumer() ;
		clientConsumer.setId(idMcAfee); 
		clientConsumer.setNombres(this.NombreTvCable);
		clientConsumer.setApellidos(this.ApellidoTvCable);
		clientConsumer.setPassword(password);
		clientConsumer.setCorreo(mail);

		ArrayOfClsPreferencesConsumer pref = new ArrayOfClsPreferencesConsumer();
		List<ClsPreferencesConsumer> lst = pref.getClsPreferencesConsumer();
		ClsPreferencesConsumer e = new ClsPreferencesConsumer();
		e.setPreferenceName("LANG");
		e.setPreferenceValor("es-mx");
		lst.add(e);
		clientConsumer.setPreferences(pref );
		OrderConsumer.setClienteConsumer(clientConsumer);
		//Fin del Cliente

		ClsOrdenConsumer ordenConsumer = new ClsOrdenConsumer();
		ordenConsumer.setId(transaccionID); //id del numero de orden, este dato se debe de controlar

		ordenConsumer.setObjArticulos(itemsConsumer);
		ordenConsumer.setReferencia(referencia);//referencia dada por la respuesta
		OrderConsumer.setOrdenConsumer(ordenConsumer);

		return service.wmOrderConsumer(OrderConsumer, sesion);

	}


	private String getSesion(String subPartnerID){
		String sesion = "";
		try {
			client = locator.getwsCrLoginSvcSoap();
			SOAPHeaderElement header = new SOAPHeaderElement("https://partners.compuredes.com.co/mcafee", "clsHeader");
			
			SOAPElement node = header.addChildElement("SubPartnerID");
			node.addTextNode(subPartnerID);
			
			SOAPElement node2 = header.addChildElement("SubPartnerPass");
			node2.addTextNode(SubPartnerPass);
			((Stub) client).setHeader(header);

			System.out.println(header);
			
			sesion = client.wmCreateSession(1);

		} catch (ServiceException e) {
			e.printStackTrace();
			sesion = "Error0: "+e.getMessage();
		}catch (SOAPException e) {
			e.printStackTrace();
			sesion = "Error1: "+e.getMessage();
		} catch (RemoteException e) {
			e.printStackTrace();
			sesion = "Error2: "+e.getMessage();
		}catch (Exception e) {
			e.printStackTrace();
			sesion = "Error3: "+e.getMessage();
		}

		System.out.println("Sesion: "+sesion);

		return sesion;
	}



	public static void main(String a[]) {
		try{

			String IdEstado 		= "T";
			String Correo 			= "gvillegas@cablemodem.com.ec";
			int IdEmpresa 			= 63;
			String Sistema 			= "TITAN";
			String Interfaz 		= "900";
			String Cuenta 			= "0";
			String IdProducto 		= "0";
			int PlanMcAfeeTvCable 	= 2; //proteccion total, etc
			String ClienteCRM 		= "0";
			String IdProductoCRM 	= "0";
			String Nombre 			= "";

			String IdMcAfee 		= "2533";
			String Referencia 		= "4963";//referencia

			ec.com.grupotvcable.wsdlmcafee.Respuesta res = new AprovisionarMcAfee(IdEmpresa,Sistema,Interfaz,IdEstado,Cuenta,IdProducto,
					Correo,PlanMcAfeeTvCable,ClienteCRM,IdProductoCRM,IdMcAfee,Referencia, 0, "Jcalle")
			.Aprovisionar3();

			System.out.println(res.getCodError());
			System.out.println(res.getDetMensaje());
			System.out.println(res.getIdMcAfee());
			System.out.println(res.getReferencia());


			//System.out.println(new AprovisionarMcAfee().getSesion("107"));
		}catch(Exception e){


		}
	}



	public static void main2(String a[]) {


	}




}
