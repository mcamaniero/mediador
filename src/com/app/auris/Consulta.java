package com.app.auris;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

public class Consulta {

	private HttpClient ClienteHttpAuris = new HttpClient();
	private static Map<String, String>  AccountStatuses = new HashMap<String, String>();

	public Consulta(){

		AccountStatuses.put("1", "Account is active.");
		AccountStatuses.put("0", "Account is inactive.");
		AccountStatuses.put("3", "Account has expired.");
		AccountStatuses.put("101", "Account has been deactivated.");
		AccountStatuses.put("222", "Account is destroyed.");

	}

	public static Map getAccountStatuses(){
		return AccountStatuses;
	}

	public  Map getValuesPin(String Pin) throws HttpException, IOException, JDOMException{

		ConexionAuris par = new ConexionAuris();
		par.addParametro("transaction_type","101");
		par.addParametro("account_number",Pin);//pin

		int statusCode = ClienteHttpAuris.executeMethod(par.getPost());

		return getEtiquetasPin(par.getPost().getResponseBodyAsStream());
	}


	public  Map getValuesPinByFono(String fono, String productId) throws HttpException, IOException, JDOMException{

		ConexionAuris par = new ConexionAuris();
		par.addParametro("transaction_type","101");
		par.addParametro("ani_number","011"+fono);
		par.addParametro("product_id",productId);


		int statusCode = ClienteHttpAuris.executeMethod(par.getPost());

		return getEtiquetasPin(par.getPost().getResponseBodyAsStream());
	}


	private Map<String, String> getEtiquetasPin(InputStream request) throws JDOMException, IOException{
		Map<String,String> values = new HashMap<String,String>();

		SAXBuilder builder = new SAXBuilder(false); 
		Document doc = builder.build(request);

		// Obtenemos la etiqueta raíz  
		Element raiz = doc.getRootElement();  
		// Recorremos los hijos de la etiqueta raíz 
		Element e = raiz.getChild("PrepaidAccount");
		List<Element> hijosRaiz = e.getChildren();  

		for(Element hijo: hijosRaiz) { 
			//System.out.println(hijo.getName()+": "+hijo.getValue());  
			values.put(hijo.getName(), hijo.getValue());
		}

		values.put("ProductName", getProductList(values.get("product_id")));

		return values;
	}

	private String getProductList(String id) throws JDOMException, IOException{

		ConexionAuris par = new ConexionAuris();
		par.addParametro("transaction_type","128");
		int statusCode = ClienteHttpAuris.executeMethod(par.getPost());

		InputStream request = par.getPost().getResponseBodyAsStream();
		SAXBuilder builder = new SAXBuilder(false); 

		//String xml="<Auris><PrepaidAccount><response_code>1</response_code><response_msg>Success</response_msg><response_desc></response_desc><transaction_type>128</transaction_type><transaction_id>37647</transaction_id><reference_id></reference_id></PrepaidAccount><RecordList><Record><ProductID>10001</ProductID><ParentProductID></ParentProductID><ProductName>Product1</ProductName></Record><Record><ProductID>10011</ProductID><ParentProductID>10001</ParentProductID><ProductName>Product11</ProductName></Record><Record><ProductID>10002</ProductID><ParentProductID></ParentProductID><ProductName>Product2</ProductName></Record></RecordList></Auris>";
		//Document doc = builder.build(new StringReader(xml));

		Document doc = builder.build(request);

		// Obtenemos la etiqueta raíz  
		Element raiz = doc.getRootElement();  
		// Recorremos los hijos de la etiqueta raíz 
		Element e = raiz.getChild("RecordList");
		List<Element> hijosRaiz = e.getChildren();  

		for(Element hijo: hijosRaiz) { 
			List<Element> hijosRaiz2 = hijo.getChildren();  
			if(hijo.getChildText("ProductID").equals(id))
				for(Element hijo2: hijosRaiz2)
					if(hijo2.getName().equals("ProductName"))
						return hijo2.getValue(); 
		}

		return "";
	}


//	0011 1ae1 dab8

	//ivan bustamante
	//590880


	public Map<String, String> getDIDAccessNumberDisplay(String pin) throws JDOMException, IOException{

		ConexionAuris par = new ConexionAuris();
		par.addParametro("transaction_type","123");
		par.addParametro("account_number",pin);//pin

		int statusCode = ClienteHttpAuris.executeMethod(par.getPost());

		InputStream request = par.getPost().getResponseBodyAsStream();
		SAXBuilder builder = new SAXBuilder(false); 

		//String xml="<Auris><PrepaidAccount><response_code>1</response_code><response_msg>Success</response_msg><response_desc></response_desc><transaction_type>123</transaction_type><transaction_id>37647</transaction_id><account_number>8899775259</account_number><serial_number></serial_number><reference_id></reference_id></PrepaidAccount><RecordList><Record><ANI>3057778899</ANI><DIDAccessNumber>9545556677</DIDAccessNumber></Record><Record><ANI>3057778899</ANI><DIDAccessNumber>011908885554444</DIDAccessNumber></Record><Record><ANI>3057778866</ANI><DIDAccessNumber>2128887766</DIDAccessNumber></Record></RecordList></Auris>";
		//Document doc = builder.build(new StringReader(xml));

		Document doc = builder.build(request);

		// Obtenemos la etiqueta raíz  
		Element raiz = doc.getRootElement();  
		// Recorremos los hijos de la etiqueta raíz 
		Element e = raiz.getChild("RecordList");
		List<Element> hijosRaiz = e.getChildren();  

		Map<String,String> values = new HashMap<String,String>();

		for(Element hijo: hijosRaiz) { 
			//List<Element> hijosRaiz2 = hijo.getChildren();  
			values.put(hijo.getChildText("DIDAccessNumber"), hijo.getChildText("ANI"));
		}
		return values;
	}


	public Map<String, String> getANIDisplayRequest(String pin) throws JDOMException, IOException{

		ConexionAuris par = new ConexionAuris();
		par.addParametro("transaction_type","114");
		par.addParametro("account_number",pin);//pin

		int statusCode = ClienteHttpAuris.executeMethod(par.getPost());

		InputStream request = par.getPost().getResponseBodyAsStream();
		SAXBuilder builder = new SAXBuilder(false); 

		//String xml="<Auris><PrepaidAccount><response_code>1</response_code><response_msg>Success</response_msg><response_desc></response_desc><transaction_type>123</transaction_type><transaction_id>37647</transaction_id><account_number>8899775259</account_number><serial_number></serial_number><reference_id></reference_id></PrepaidAccount><RecordList><Record><ANI>3057778899</ANI><DIDAccessNumber>9545556677</DIDAccessNumber></Record><Record><ANI>3057778899</ANI><DIDAccessNumber>011908885554444</DIDAccessNumber></Record><Record><ANI>3057778866</ANI><DIDAccessNumber>2128887766</DIDAccessNumber></Record></RecordList></Auris>";
		//Document doc = builder.build(new StringReader(xml));

		Document doc = builder.build(request);

		// Obtenemos la etiqueta raíz  
		Element raiz = doc.getRootElement();  
		// Recorremos los hijos de la etiqueta raíz 
		Element e = raiz.getChild("RecordList");
		List<Element> hijosRaiz = e.getChildren();  

		Map<String,String> values = new HashMap<String,String>();

		for(Element hijo: hijosRaiz) { 
			//List<Element> hijosRaiz2 = hijo.getChildren();  
			values.put(hijo.getChildText("ANI"), hijo.getChildText("DateEntered"));
		}
		return values;
	}





	private List<String> getCodesCountryParentProductID() throws HttpException, IOException, JDOMException{

		List<String> listProductID = new ArrayList<String>();

		ConexionAuris par = new ConexionAuris();
		par.addParametro("transaction_type","128");

		int statusCode = ClienteHttpAuris.executeMethod(par.getPost());

		System.out.println("statusCode ConsultaCodesCountry2"+statusCode);

		InputStream request = par.getPost().getResponseBodyAsStream();
		SAXBuilder builder = new SAXBuilder(false); 

		Document doc = builder.build(request);

		Element raiz = doc.getRootElement();  
		//Element ee = raiz.getChild("PrepaidAccount");
		//List<Element> hijosRaiz = ee.getChildren();  

		//for(Element hijo: hijosRaiz)  
		//System.out.println(hijo.getName()+": "+hijo.getValue());  

		Element ee2 = raiz.getChild("RecordList");
		System.out.println("detalle**************************");  
		List<Element> hijosRaiz2 = ee2.getChildren();  

		for(Element hijo: hijosRaiz2){  
			List<Element> hijosRaiz3 = hijo.getChildren();  
			if (hijo.getChild("ParentProductID").getValue().equals("")
			/*&& !hijo.getChild("ProductName").getValue().substring(0, 1).equals("[")*/){
				//System.out.println("detalle**************************"); 
				for(Element hijoInt: hijosRaiz3){
					//System.out.println(hijoInt.getName()+": "+hijoInt.getValue()); 
					if(hijoInt.getName().equals("ProductID")){
						listProductID.add(hijoInt.getValue());
						//System.out.println(hijoInt.getName()+": "+hijoInt.getValue()); 

					}
				}
			}
		}
		return listProductID;
	}



	public String getPINbyFONO(String fono){
		String pin = "";
		try {
			List<String> lst = new Consulta().getCodesCountryParentProductID();
			boolean sigue = false;
			for(String v : lst){
				Iterator it = new Consulta().getValuesPinByFono(fono, v).entrySet().iterator();
				while (it.hasNext()) {
					Map.Entry e = (Map.Entry)it.next();
					if(e.getKey().toString().equals("account_number") && !e.getValue().toString().equals("")){
						pin = e.getValue().toString();
						sigue = true;
						break;
					}
				}
				if (sigue)break;
			}
			System.out.println("PIN: "+pin);
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return pin;
	}



	public static void main(String a[]){
		try {
			String pin = "";
			String fono = "59326002400";
			List<String> lst = new Consulta().getCodesCountryParentProductID();
			boolean sigue = false;
			for(String v : lst){
				//System.out.println("------------");
				//Map res = new Consulta().getValuesPinByFono(fono, v);

				Iterator it = new Consulta().getValuesPinByFono(fono, v).entrySet().iterator();

				while (it.hasNext()) {
					Map.Entry e = (Map.Entry)it.next();
					if(e.getKey().toString().equals("account_number") && !e.getValue().toString().equals("")){
						pin = e.getValue().toString();
						sigue = true;
						break;
					}

					//System.out.println(e.getKey() + " : " + e.getValue());

				}

				if (sigue)break;

			}
			System.out.println(pin);

		} catch (JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
