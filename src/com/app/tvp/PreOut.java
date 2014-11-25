package com.app.tvp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PreOut {

	
	
// variables para escribir el archivo
	private FileWriter fw = null;
	private BufferedWriter bw = null; 
	private PrintWriter pw = null; 
//	private BufferedReader entrada = null;
		

	
	
	public PreOut(String ruta, String nombreArchivo, String comando) throws IOException {
		fw = new FileWriter(ruta+nombreArchivo);
		bw = new BufferedWriter(fw);
		pw = new PrintWriter(bw);
		this.NuevaLinea("CMD", comando);
		
	}
	
	
	public void NuevaLinea(String dato1, String dato2){
		pw.println(dato1+"="+dato2);
	}
	
	public void Close(){
		pw.close();
	}
	

	

}
