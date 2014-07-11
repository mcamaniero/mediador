package com.app.mcafee;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

public class ParseRespuesta {

	private String Respuesta;

	public ParseRespuesta(String xml) {
		System.out.println("PARCING XML +++++++++++++++++++++++++++++");
		this.Respuesta = xml;

		/*Respuesta = "<PARTNERRESPONSECONTEXT> "+
		"<HEADER> "+
		"		<PARTNER PARTNER_ID=\"776\" /> "+
		"	</HEADER> "+
		"	<DATA> "+
		"		<RESPONSECONTEXT ID=\"1\"> "+
		"			<RETURNCODE>1000</RETURNCODE> "+
		"			<RETURNDESC>Transaction is successful</RETURNDESC> "+
		"			<ORDER PARTNERREF=\"0\" REF=\"NCS19074515\" /> "+
		"			<ACCOUNT> "+
		"				<EMAILADDRESS>prueba1@tvcable.com</EMAILADDRESS> "+
		"				<PASSWORD><![CDATA[tvcable]]></PASSWORD> "+
		"			</ACCOUNT> "+
		"		</RESPONSECONTEXT> "+
		"	</DATA> "+
		"</PARTNERRESPONSECONTEXT>";
*/
	}


	public Respuesta getRespuesta(){

		SAXBuilder builder = new SAXBuilder(false); 
		Document doc = null;
		
		try {
			System.out.println("respuestaaaaaa" +Respuesta);
			doc = builder.build(new StringReader(Respuesta));
			
		} catch (JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Obtenemos la etiqueta raíz  
		Element e = doc.getRootElement();  

		List<Element> hijosRaiz = e.getChildren();

		Respuesta res = new Respuesta();

		for(Element ee : hijosRaiz){

			if(ee.getName().equals("HEADER")){
				res.setPARTNER_ID(((Element) ee.getChildren().get(0)).getAttributeValue("PARTNER_ID"));
			}

			if(ee.getName().equals("DATA")){

				Element data = (Element) ee.getChildren().get(0);

				res.setRESPONSECONTEXT_ID( data.getAttributeValue("ID"));

				List<Element> datas = data.getChildren();
				for(Element a : datas){
					if(a.getName().equals("RETURNCODE"))
						res.setRETURNCODE(a.getValue());

					if(a.getName().equals("RETURNDESC"))
						res.setRETURNDESC(a.getValue());

					if(a.getName().equals("ORDER")){
						res.setPARTNERREF(a.getAttributeValue("PARTNERREF"));
						res.setREF(a.getAttributeValue("REF"));
					}

					if(a.getName().equals("ACCOUNT")){
						res.setEMAILADDRESS(((Element)a.getChildren().get(0)).getValue());
						res.setPASSWORD( ((Element)a.getChildren().get(1)).getValue());
					}

				}

			}

		}

		return res;
	}


	public static void main(String a[]){

		new ParseRespuesta(null).getRespuesta();

	}



}
