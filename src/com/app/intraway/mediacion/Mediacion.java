package com.app.intraway.mediacion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

import tvcable.app.comarch.utils.SunFtpWrapper;

public class Mediacion {

	private static String PathDestino = "";
	private static String HostDestino = "";//192.168.*.*

	private static String NameFileOrigen = "";
	private static String NameFileDestino = "";

	private static String UserDestino = "";

	private static String PasswordDestino = "";

	private static String Path = "";


	static{
		Properties prop = new Properties();
		InputStream is = null;
		
		try {
			is=new FileInputStream("intraway.properties");
			prop.load(is);
		} catch(IOException e) {
			e.printStackTrace();
		}

		PathDestino = prop.getProperty("pathdestino");
		HostDestino = prop.getProperty("hostdestino");
		NameFileOrigen = prop.getProperty("namefileorigen");
		NameFileDestino = prop.getProperty("namefiledestino");
		UserDestino = prop.getProperty("userdestino");
		PasswordDestino = prop.getProperty("passworddestino");

		Path = prop.getProperty("path");

	}

	public Mediacion(){

		FileWriter fw = null;
		try {
			fw = new FileWriter(Path+"MediacionComarch.txt");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter salida = new PrintWriter(bw);

		try {
			FileReader fr = new FileReader(Path+NameFileOrigen);
			BufferedReader entrada = new BufferedReader(fr);
			String s = null;
			while((s = entrada.readLine()) != null)
				salida.println(s.replace('!', ';'));
		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		} 
		
		salida.close();
		

	}


	public static void UpLoadMediacion(){
	
		try {
			SunFtpWrapper ftp = new SunFtpWrapper();
			ftp.openServer(HostDestino);
			if (ftp.serverIsOpen()) {
				System.out.println("Connected to " + HostDestino);
				try {
					ftp.login(UserDestino, PasswordDestino);
					ftp.cd(PathDestino);
					System.out.println("Welcome message:\n" + ftp.welcomeMsg);
					System.out.println("Current Directory: " + ftp.pwd());

					ftp.uploadFile(Path+NameFileDestino, PathDestino+NameFileDestino);

				} catch (Exception ftpe) {
					ftpe.printStackTrace();
				} finally {
					ftp.closeServer();
				}
			} else {
				System.out.println("Unable to connect to" + HostDestino);
			}
			System.out.println("Finished");
		} catch(Exception e) {
			e.printStackTrace();
		}

		
	}


}
