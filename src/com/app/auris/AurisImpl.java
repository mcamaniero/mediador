package com.app.auris;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.PostMethod;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

import ec.com.grupotvcable.wsdlauris.Auris;
import ec.com.grupotvcable.wsdlauris.DatosExtrasAuris;
import ec.com.grupotvcable.wsdlauris.ListaFono;
import ec.com.grupotvcable.wsdlauris.Mensaje;
import ec.com.grupotvcable.wsdlauris.Telefono;

public class AurisImpl {

	private HttpClient ClienteHttpAuris = new HttpClient();
	private Auris Aur = null;
	//2970707

	private String path = null;
	private static FileInputStream fis = null;
	private static Properties prop = new Properties();

	public AurisImpl(Auris aur) {

		Aur  = aur;

		System.out.println("*****CARGANDO CERTIFICADO AURIS /usr/jssecacerts***************+");

		System.setProperty("javax.net.ssl.trustStore", "/usr/jssecacerts");
		System.setProperty("javax.net.ssl.trustStorePassword", "changeit");

	}


	private Map<String, String> getEtiquetas(InputStream request) throws JDOMException, IOException{
		Map<String,String> values = new HashMap<String,String>();

		SAXBuilder builder = new SAXBuilder(false); 
		Document doc = builder.build(request);

		// Obtenemos la etiqueta raíz  
		Element raiz = doc.getRootElement();  
		// Recorremos los hijos de la etiqueta raíz 
		Element e = raiz.getChild("PrepaidAccount");
		List<Element> hijosRaiz = e.getChildren();  

		for(Element hijo: hijosRaiz) { 
			System.out.println(hijo.getName()+": "+hijo.getValue());  
			values.put(hijo.getName(), hijo.getValue());
		}

		return values;
	}


	public Mensaje CreacionDid() throws HttpException, IOException, JDOMException {
		return this.CreacionDid1800();
	}
	public Mensaje Creacion1800() throws HttpException, IOException, JDOMException {
		return this.CreacionDid1800();
	}	

	public Mensaje EliminacionDid() throws HttpException, IOException, JDOMException {
		return this.EliminacionDid1800();
	}

	public Mensaje Eliminacion1800() throws HttpException, IOException, JDOMException {
		return this.EliminacionDid1800();
	}

	public Mensaje CreacionDid1800() throws HttpException, IOException, JDOMException {
		Mensaje Mens = new Mensaje();  
		DatosExtrasAuris dat = new DatosExtrasAuris();

		ConexionAuris par = new ConexionAuris();
		par.addParametro("transaction_type","121");
		par.addParametro("account_number",Aur.getDatoA2());//pin
		par.addParametro("ani_number","011"+Aur.getDatoA1());//ani numero fono
		par.addParametro("country_code",""+Aur.getCodAcceso());//eeuu
		par.addParametro("area_code",""+Aur.getCodEstado());//las vegas
		par.addParametro("product_id",""+Aur.getProductoPlaneta());//DID  //oro, plata, bronce, etc...

		par.addParametro("callflow_id","1114");


		//paso por referencia el campo del codigo postal y la direccion
		String[] tmp = Aur.getReferencia().split(";");

		if(tmp.length > 1){
			String codigoPostal = tmp[0];
			String direccionDestino = tmp[1];
			par.addParametro("first_name","Cliente");
			par.addParametro("last_name","Grupo TvCable");
			par.addParametro("company_name","Grupo TvCable");
			par.addParametro("address",direccionDestino);
			par.addParametro("building_no","1");
			par.addParametro("city",""+Aur.getCodAcceso());
			par.addParametro("zipcode",codigoPostal);

		}else{
			par.addParametro("reference_id",Aur.getReferencia());
			if (Aur.getDatoA3()!= null && !Aur.getDatoA3().equals("")
					&& Aur.getDatoA4()!= null && !Aur.getDatoA4().equals("")){
				par.addParametro("first_name","Cliente");
				par.addParametro("last_name","Grupo TvCable");
				par.addParametro("company_name","Grupo TvCable");
				par.addParametro("address",Aur.getDatoA4());
				par.addParametro("building_no","1");
				par.addParametro("city",""+Aur.getCodAcceso());
				par.addParametro("zipcode",Aur.getDatoA3());
			}
		}

		System.out.println("Valores.............");
		par.PrintValues();
		System.out.println("Valores.............");


		int statusCode = ClienteHttpAuris.executeMethod(par.getPost());
		System.out.println("statusCode "+statusCode);

		Map<String, String>  etiquetas = this.getEtiquetas(par.getPost().getResponseBodyAsStream());

		Mens.setCodError(Integer.parseInt(etiquetas.get("response_code").toString()));
		Mens.setDetMensaje(etiquetas.get("response_msg").toString()+" : "+etiquetas.get("response_desc").toString());

		dat.setPin(Aur.getDatoA2());
		dat.setDID(etiquetas.get("access_number").toString());
		Mens.setDatosExtrasAuris(dat);

		return Mens;
	}


	public Mensaje EliminacionDid1800() throws HttpException, IOException, JDOMException {
		Mensaje Mens = new Mensaje();
		DatosExtrasAuris dat = new DatosExtrasAuris();

		System.out.println("Eliminacion de DID");
		ConexionAuris par = new ConexionAuris();
		par.addParametro("transaction_type","122");
		par.addParametro("account_number",	Aur.getDatoA2()		);//PIN
		par.addParametro("access_number",	Aur.getDatoA1()		);//DID
		par.addParametro("reference_id",	Aur.getReferencia()	);

		System.out.println("Valores.............");
		par.PrintValues();
		System.out.println("Valores.............");

		int statusCode = ClienteHttpAuris.executeMethod(par.getPost());
		System.out.println("statusCode "+statusCode);

		Map<String, String>  etiquetas = this.getEtiquetas(par.getPost().getResponseBodyAsStream());

		Mens.setCodError(Integer.parseInt(etiquetas.get("response_code").toString()));
		Mens.setDetMensaje(etiquetas.get("response_msg").toString()+" : "+etiquetas.get("response_desc").toString());

		dat.setPin(Aur.getDatoA2());
		dat.setDID(Aur.getDatoA1());
		Mens.setDatosExtrasAuris(dat);

		return Mens;
	}


	public Mensaje EliminacionPin() throws HttpException, IOException, JDOMException {


		Mensaje Mens = new Mensaje();
		ConexionAuris par = new ConexionAuris();
		par.addParametro("transaction_type","109");
		par.addParametro("account_number",Aur.getDatoA2());//pin
		par.addParametro("ani_number","011"+Aur.getDatoA1());//fono

		par.addParametro("reference_id",Aur.getReferencia());

		int statusCode = ClienteHttpAuris.executeMethod(par.getPost());
		System.out.println("statusCode EliminacionPin: "+statusCode);

		Map<String, String>  etiquetas = this.getEtiquetas(par.getPost().getResponseBodyAsStream());

		Mens.setCodError(Integer.parseInt(etiquetas.get("response_code").toString()));
		Mens.setDetMensaje(etiquetas.get("response_msg").toString()+" : "+etiquetas.get("response_desc").toString());




		ConexionAuris par2 = new ConexionAuris();
		par2.addParametro("transaction_type","105");
		par2.addParametro("account_number",Aur.getDatoA2());//pin
		par2.addParametro("reference_id",Aur.getReferencia());

		int statusCode2 = ClienteHttpAuris.executeMethod(par.getPost());
		System.out.println("statusCode EliminacionPin: "+statusCode2);

		Map<String, String>  etiquetas2 = this.getEtiquetas(par.getPost().getResponseBodyAsStream());

		//Mens.setCodError();
		Mens.setDetMensaje(Mens.getDetMensaje()+" --- "+etiquetas2.get("response_msg").toString()+" : "+etiquetas2.get("response_desc").toString());


		return Mens;
	}



	//Creacion del Pin
	private String CreacionPin_100(String transaction_amount, String product_id) throws HttpException, IOException, JDOMException{//eliminacion DID al ANI

		ConexionAuris par = new ConexionAuris();
		par.addParametro("transaction_type","100");
		par.addParametro("account_number","4352849178");//pin que exista para q Auris devuelva uno Nuevo
		par.addParametro("reference_id",Aur.getReferencia());
		par.addParametro("transaction_amount",transaction_amount);//el valor de la recarga
		//Amount (in cents) to increment (+credit) or decrement (-debit) account balance. (Exp: 450 = $4.50)

		par.addParametro("product_id",product_id);//oro, plata, bronce, etc
		par.addParametro("status_flag","1");//Status of the new account to be created.
		//Constant value (0=deactive, 1=active). Default is 0.

		int statusCode = ClienteHttpAuris.executeMethod(par.getPost());
		System.out.println("statusCode100: "+statusCode);

		Map<String, String>  etiquetas = this.getEtiquetas(par.getPost().getResponseBodyAsStream());

		System.out.println("response_code100 "+etiquetas.get("response_code").toString());
		System.out.println("response_msg100 "+etiquetas.get("response_msg").toString());

		return etiquetas.get("account_number").toString();
	}


	public Mensaje CreacionSoloPin() throws HttpException, IOException, JDOMException{//eliminacion DID al ANI

		Mensaje Mens = new Mensaje();
		DatosExtrasAuris dat = new DatosExtrasAuris();

		ConexionAuris par = new ConexionAuris();
		par.addParametro("transaction_type","100");
		par.addParametro("account_number","4352849178");//pin que exista para q Auris devuelva uno Nuevo
		par.addParametro("reference_id", Aur.getReferencia());
		par.addParametro("transaction_amount",String.valueOf(Aur.getMonto()*100));//el valor de la recarga
		//Amount (in cents) to increment (+credit) or decrement (-debit) account balance. (Exp: 450 = $4.50)

		par.addParametro("product_id",""+Aur.getProductoPlaneta());//oro, plata, bronce, etc
		par.addParametro("status_flag","1");//Status of the new account to be created.
		//Constant value (0=deactive, 1=active). Default is 0.

		int statusCode = ClienteHttpAuris.executeMethod(par.getPost());
		System.out.println("statusCode100: "+statusCode);

		Map  etiquetas = this.getEtiquetas(par.getPost().getResponseBodyAsStream());

		Mens.setCodError(Integer.parseInt(etiquetas.get("response_code").toString()));
		Mens.setDetMensaje(etiquetas.get("response_msg").toString()+" "+etiquetas.get("response_desc").toString());

		dat.setPin(etiquetas.get("account_number").toString());
		dat.setDID("");
		Mens.setDatosExtrasAuris(dat);

		return Mens;



	}




	public Mensaje CreacionPin() throws HttpException, IOException, JDOMException {
		Mensaje Mens = new Mensaje();
		DatosExtrasAuris dat = new DatosExtrasAuris();

		ConexionAuris par = new ConexionAuris();
		par.addParametro("transaction_type","106");
		par.addParametro("ani_number","011"+Aur.getDatoA1());//numero de telefono
		par.addParametro("account_number",CreacionPin_100(String.valueOf(Aur.getMonto()*100),""+Aur.getProductoPlaneta()));
		par.addParametro("reference_id",Aur.getReferencia());//opcional

		par.addParametro("language_id","1");//Constant value (0=English, 1=Spanish, 2=Portuguese, 3=Korean)
		par.addParametro("callflow_id","1139");//1139 = 1 Stage Dial -BalanceCheck -CallerID

		int statusCode = ClienteHttpAuris.executeMethod(par.getPost());
		System.out.println("statusCode: "+statusCode);

		Map  etiquetas = this.getEtiquetas(par.getPost().getResponseBodyAsStream());

		Mens.setCodError(Integer.parseInt(etiquetas.get("response_code").toString()));
		Mens.setDetMensaje(etiquetas.get("response_msg").toString()+" "+etiquetas.get("response_desc").toString());

		dat.setPin(etiquetas.get("account_number").toString());
		dat.setDID("");
		Mens.setDatosExtrasAuris(dat);


		return Mens;
	}

	public Mensaje AgregarNumAlPin() throws HttpException, IOException, JDOMException {
		Mensaje Mens = new Mensaje();

		ConexionAuris par = new ConexionAuris();
		par.addParametro("transaction_type","106");
		par.addParametro("ani_number","011"+Aur.getDatoA1());//numero de telefono
		par.addParametro("account_number",Aur.getDatoA2());//pin
		par.addParametro("reference_id",Aur.getReferencia());//opcional

		par.addParametro("language_id","1");//Constant value (0=English, 1=Spanish, 2=Portuguese, 3=Korean)
		par.addParametro("callflow_id","1139");//1139 = 1 Stage Dial -BalanceCheck -CallerID

		int statusCode = ClienteHttpAuris.executeMethod(par.getPost());
		System.out.println("statusCode: "+statusCode);

		Map  etiquetas = this.getEtiquetas(par.getPost().getResponseBodyAsStream());

		Mens.setCodError(Integer.parseInt(etiquetas.get("response_code").toString()));
		Mens.setDetMensaje(etiquetas.get("response_msg").toString()+" "+etiquetas.get("response_desc").toString());


		return Mens;
	}


	public Mensaje EliminarNumAlPin() throws HttpException, IOException, JDOMException {
		Mensaje Mens = new Mensaje();
		ConexionAuris par = new ConexionAuris();

		par.addParametro("transaction_type","109");
		par.addParametro("ani_number","011"+Aur.getDatoA1());//numero de telefono
		par.addParametro("account_number",Aur.getDatoA2());//pin
		par.addParametro("reference_id",Aur.getReferencia());//opcional

		int statusCode = ClienteHttpAuris.executeMethod(par.getPost());
		System.out.println("statusCode: "+statusCode);

		Map  etiquetas = this.getEtiquetas(par.getPost().getResponseBodyAsStream());

		Mens.setCodError(Integer.parseInt(etiquetas.get("response_code").toString()));
		Mens.setDetMensaje(etiquetas.get("response_msg").toString()+" "+etiquetas.get("response_desc").toString());

		return Mens;
	}


	public Mensaje RecargaSaldo() throws HttpException, IOException, JDOMException {
		Mensaje Mens = new Mensaje();
		ConexionAuris par = new ConexionAuris();
		DatosExtrasAuris dat = new DatosExtrasAuris();

		par.addParametro("transaction_type","102");
		par.addParametro("account_number",Aur.getDatoA2());//pin

		par.addParametro("transaction_amount",""+String.valueOf(Aur.getMonto()*100));//el valor de la recarga
		//Amount (in cents) to increment (+credit) or decrement (-debit) account balance. (Exp: 450 = $4.50)

		par.addParametro("reference_id",Aur.getReferencia());//opcional

		par.addParametro("recharge_type","2");//Default is 1. Use 2 for your internal reporting purposes.


		int statusCode = ClienteHttpAuris.executeMethod(par.getPost());
		System.out.println("statusCode: "+statusCode);
		System.out.println("ResponseBodyAsString: "+par.getPost().getResponseBodyAsString());

		Map  etiquetas = this.getEtiquetas(par.getPost().getResponseBodyAsStream());

		Mens.setCodError(Integer.parseInt(etiquetas.get("response_code").toString()));
		Mens.setDetMensaje(etiquetas.get("response_msg").toString()+" "+etiquetas.get("response_desc").toString());

		dat.setPin(etiquetas.get("pre_transaction_balance").toString());
		dat.setDID(etiquetas.get("post_transaction_balance").toString());

		ClienteHttpAuris.getParams().setAuthenticationPreemptive(true);

		return Mens;	

	}

	public Mensaje RecargaSaldoDesdeOtroPin() throws HttpException, IOException, JDOMException {
		Mensaje Mens = new Mensaje();
		ConexionAuris par = new ConexionAuris();
		DatosExtrasAuris dat = new DatosExtrasAuris();

		par.addParametro("transaction_type","125");
		par.addParametro("account_number",Aur.getDatoA1());//PIN
		par.addParametro("new_pin",Aur.getDatoA2());//NEW PIN CON EL SALDO

		par.addParametro("reference_id",Aur.getReferencia());//opcional
		
		int statusCode = ClienteHttpAuris.executeMethod(par.getPost());
		
		Map  etiquetas = this.getEtiquetas(par.getPost().getResponseBodyAsStream());

		Mens.setCodError(Integer.parseInt(etiquetas.get("response_code").toString()));
		Mens.setDetMensaje(etiquetas.get("response_msg").toString()+" "+etiquetas.get("response_desc").toString());

		dat.setPin(etiquetas.get("pre_transaction_balance").toString());
		dat.setDID(etiquetas.get("post_transaction_balance").toString());

		ClienteHttpAuris.getParams().setAuthenticationPreemptive(true);

		return Mens;	

	}

	
	private String getListafono(ListaFono listaFonos){
		String lstFonos="";
		if( listaFonos != null && listaFonos.getTelefono() != null && listaFonos.getNum() > 0){
			StringBuilder strFonos = new StringBuilder();

			for(Telefono tel : listaFonos.getTelefono())
				if(!tel.equals(""))
					strFonos.append("011593"+tel.getTelefono()+",");

			if(!strFonos.equals(""))
				lstFonos = strFonos.toString().substring(0, strFonos.toString().length()-1);
		}

		return lstFonos;
	}


	public Mensaje MoverDidaAni() throws HttpException, IOException, JDOMException {
		Mensaje Mens = new Mensaje();

		ConexionAuris par = new ConexionAuris();
		par.addParametro("transaction_type","126");

		par.addParametro("account_number",Aur.getDatoA2());//PIN --
		par.addParametro("access_number",Aur.getDatoA3());//DID --
		par.addParametro("ani_number","011"+Aur.getDatoA1());//ANI -- numero de telefono

		par.addParametro("reference_id",Aur.getReferencia());//opcional

		int statusCode = ClienteHttpAuris.executeMethod(par.getPost());
		System.out.println("statusCode: "+statusCode);

		Map  etiquetas = this.getEtiquetas(par.getPost().getResponseBodyAsStream());

		Mens.setCodError(Integer.parseInt(etiquetas.get("response_code").toString()));
		Mens.setDetMensaje(etiquetas.get("response_msg").toString()+" "+etiquetas.get("response_desc").toString());


		return Mens;

	}


	public Mensaje ConsultaSaldo() throws HttpException, IOException, JDOMException {
		Mensaje Mens = new Mensaje();
		
		Map resp = new Consulta().getValuesPin(Aur.getDatoA2());
		String codError = "0";
		StringBuilder values = new StringBuilder();
		values.append("<consulta>");
		Iterator it = new Consulta().getValuesPin(Aur.getDatoA2()).entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			values.append("<"+e.getKey()+">"+e.getValue()+"</"+e.getKey()+">");
			if(e.getKey().toString().equals("response_code"))
				codError = e.getValue().toString();
		}
		
		//agrego los anis
		values.append("<anis>");
		Map<String, String> values2 = new Consulta().getANIDisplayRequest(Aur.getDatoA2());
		for(String key : values2.keySet())
			values.append("<ani>"+key+"</ani>");
		values.append("</anis>");
		
		//agrego los did
		values.append("<dids>");
		Map<String, String> did = new Consulta().getDIDAccessNumberDisplay(Aur.getDatoA2());
		for(String key2 : did.keySet())
			values.append("<did>"+did.get(key2)+":"+key2+"</did>");
		values.append("</dids>");
		
		values.append("</consulta>");

		Mens.setCodError(Integer.parseInt(codError));
		Mens.setDetMensaje(values.toString());
		return Mens;
	}


}
