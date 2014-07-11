package com.app.safari.sip;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class Linksys {

	private File archivo = null;
	private FileReader fr = null;
	private BufferedReader br = null;

	String pathLinksys = "/usr/SIP/Linksys/";


	public Linksys() {


		/*Iterator it = getDataFromFile().entrySet().iterator();
		while (it.hasNext()) {
		Map.Entry e = (Map.Entry)it.next();
			//if ( e.getKey() instanceof String)
				System.out.println(e.getKey() + " " + ((ValuesLinksys)e.getValue()).getValue()  );
		}*/


	}


	private Map getDataFromFile(){

		Map<Object, ValuesLinksys> valores = new HashMap<Object, ValuesLinksys>();

		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			archivo = new File ("C:\\linksys.txt");
			fr = new FileReader (archivo);
			br = new BufferedReader(fr);

			// Lectura del fichero
			String linea;
			String a1 = "";
			String a2 = "";
			String a3 = "";
			int countComent = 0; 
			while((linea=br.readLine()) != null){
				a1 = "";
				a2 = "";
				a3 = "";
				countComent++;
				if(linea.length() > 0 && !linea.substring(0,1).equals("#")){
					String tmp = "";
					int count = 0;
					int tcount = 0;
					boolean pass1 = true;
					for(byte v : linea.getBytes()){
						count++;
						//System.out.println((char)v);
						tmp += new Character((char)v).toString();
						if( (char)v == ' ' && pass1){
							a1 = tmp.substring(0, tmp.length()-1);
							tmp = "";
							tcount = count;
							pass1 = false;
						}
					}
					int count2 = 0;
					tmp = "";
					pass1 = true;
					int tcount2 = 0;

					String linea2 = linea.substring(tcount, linea.length()).trim();
					for(byte v : linea2.getBytes()){
						count2++;
						tmp += new Character((char)v).toString();
						if( (char)v == ';' && pass1){
							a2 = tmp.substring(0, tmp.length());
							pass1 = false;
							tcount2 = count2;
						}
					}

					if(linea2.length() > tcount2)
						a3 = linea2.substring(tcount2, linea2.length()).trim();

					//System.out.println(a1+" : "+a2+" : "+a3);
					//return;

					valores.put(a1, new ValuesLinksys(a1, a2, a3));

				}else{
					valores.put(countComent, new ValuesLinksys(linea, a2, a3));
				}
				//return valores;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}finally{
			// En el finally cerramos el fichero, para asegurarnos
			// que se cierra tanto si todo va bien como si salta 
			// una excepcion.
			try{                    
				if( null != fr ){   
					fr.close();     
				}                  
			}catch (Exception e2){ 
				e2.printStackTrace();
			}
		}


		return valores;

	}

	private void setProperties(String mac, Map values) throws IOException{

		FileInputStream archivoLinksys = null;
		Properties propiedades = new Properties();

		try {
			archivoLinksys = new FileInputStream(pathLinksys+"linksys");
			propiedades.load(archivoLinksys);

			// propiedades.setProperty("DHCP", "! \"NODHCP\" ;");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				archivoLinksys.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}


		FileWriter fichero = null;
		PrintWriter pw = null;
		try
		{
			fichero = new FileWriter(pathLinksys+""+mac);
			pw = new PrintWriter(fichero);


			for (Enumeration e = propiedades.keys(); e.hasMoreElements() ; ) {
				// Obtenemos el objeto
				Object obj = e.nextElement();
				System.out.println(obj + ": " + propiedades.getProperty(obj.toString()));
				String linea = obj.toString() +" "+propiedades.getProperty(obj.toString());
				pw.println(linea);
			}

			
				

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// Nuevamente aprovechamos el finally para 
				// asegurarnos que se cierra el fichero.
				pw.close();
				if (null != fichero)
					fichero.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

		
		Runtime cmd = Runtime.getRuntime();/*Obtener un objeto runtime*/
        String comando = "c:/pap2.exe "+mac+" "+mac+".cfg";/*Aqui ponemos el comando a ejecutarse*/
        Process proceso = cmd.exec(comando);/*Ejecuta el comando en un nuevo proceso*/

        InputStreamReader entrada = new InputStreamReader(proceso.getInputStream());
        BufferedReader buffer = new BufferedReader(entrada);/*Con este leeremos el resultado*/
        String linea = "";
        StringBuilder mensaje = new StringBuilder(); 
        while( (linea = buffer.readLine()) != null ){                
            mensaje.append(linea+"\n");/*Concatenamos el mensaje*/
        }
        buffer.close(); 

        System.out.println(mensaje);/*Mostrar el mensaje*/ 
	}



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Map<String, String> values = new HashMap<String, String>();
			new Linksys().setProperties("0011af123546", values );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}






}
