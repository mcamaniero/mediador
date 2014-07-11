package com.app.tvp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CDR {

	
	
// variables para escribir el archivo
	private FileWriter fw = null;
	private BufferedWriter bw = null; 
	private PrintWriter pw = null; 
//	private BufferedReader entrada = null;
		

	public CDR(String ruta, String nombreArchivo) throws IOException {
		fw = new FileWriter(ruta+nombreArchivo);
		bw = new BufferedWriter(fw);
		pw = new PrintWriter(bw);
	}

	public void NuevaLineaCDR(int evento,StringBuilder cadena)
	{
		pw.println(evento+cadena.toString());
	}
	
	public void Close(){
		pw.close();
	}
	

	

}
