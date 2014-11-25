package com.app.safari;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public abstract class Parametros {

	 //Servidor Safari de UIO
    public static String telnet_uio_host ;
    public static String telnet_uio_port ;
    public static String telnet_uio_username ;
    public static String telnet_uio_password ;
    public static String prompt_uio ;
    public static String prompt_trunkgrp_uio ;
    
    //Servidor Safari de GYE
    public static String telnet_gye_host ;
    public static String telnet_gye_port ;
    public static String telnet_gye_username ;
    public static String telnet_gye_password ;
    public static String prompt_gye ;
    public static String prompt_trunkgrp_gye ;
    
    //Servidor Safari de PRUEBA
    public static String telnet_cue_host ;
    public static String telnet_cue_port ;
    public static String telnet_cue_username ;
    public static String telnet_cue_password ;
    public static String prompt_cue ;
    public static String prompt_trunkgrp_cue ;
    
    //Corte E1's
    public static String exchangeprofilename_e1;
    
    
    //User web service
    public static String user_webservice;
    public static String password_webservice;
    
    //autentication
    public static String path_file_svkeystore;
    
    
    
    public static String ssh_uio_host ;
    public static String ssh_uio_port ;
    public static String ssh_uio_username ;
    public static String ssh_uio_password ;
    public static String ssh_gye_host ;
    public static String ssh_gye_port ;
    public static String ssh_gye_username ;
    public static String ssh_gye_password ;
    public static String ssh_nac_host ;
    public static String ssh_nac_port ;
    public static String ssh_nac_username ;
    public static String ssh_nac_password ;
    
    public static String tipo_coneccion ;
    
    
    
    private String path = null;
    
    
    private static FileInputStream fis = null;
    
    private static Properties prop = new Properties();
	
    protected Parametros(){
    	
    	path = getClass().getProtectionDomain().getCodeSource().
		getLocation().toString().substring(5);
    	
    	path = path.substring(0, path.length()-16);
    	
        System.out.println("***********Path: "+path);
		
    	try {
    		fis = new FileInputStream(new File( path + "/safari.properties"));
    		//fis = new FileInputStream(new File("/usr/apache-tomcat-6.0.18/webapps/WsAprovisionamiento/WEB-INF/classes/com/app/safari/safari.properties"));
			prop.load(fis);
		} catch(IOException e) {
			System.out.println("Error IOException "+e.getMessage());
			e.printStackTrace();
		}
		
		//certificado del webservice de safariView
		//System.setProperty("javax.net.ssl.trustStore", path+"/svkeystore");
		//System.setProperty("javax.net.ssl.trustStorePassword", "public");
		
		System.setProperty("javax.net.ssl.trustStore", "/usr/jssecacerts");
		System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
		
		
			
		telnet_uio_host = prop.getProperty("telnet_uio_host");		
		telnet_uio_port = prop.getProperty("telnet_uio_port");		
		telnet_uio_username = prop.getProperty("telnet_uio_username");		
		telnet_uio_password = prop.getProperty("telnet_uio_password");		
		prompt_uio = prop.getProperty("prompt_uio");		
		prompt_trunkgrp_uio = prop.getProperty("prompt_trunkgrp_uio");		
		
		telnet_gye_host = prop.getProperty("telnet_gye_host");		
		telnet_gye_port = prop.getProperty("telnet_gye_port");		
		telnet_gye_username = prop.getProperty("telnet_gye_username");		
		telnet_gye_password = prop.getProperty("telnet_gye_password");		
		prompt_gye = prop.getProperty("prompt_gye");		
		prompt_trunkgrp_gye = prop.getProperty("prompt_trunkgrp_gye");		
		
		telnet_cue_host = prop.getProperty("telnet_cue_host");		
		telnet_cue_port = prop.getProperty("telnet_cue_port");		
		telnet_cue_username = prop.getProperty("telnet_cue_username");		
		telnet_cue_password = prop.getProperty("telnet_cue_password");		
		prompt_cue = prop.getProperty("prompt_cue");		
		prompt_trunkgrp_cue = prop.getProperty("prompt_trunkgrp_cue");		
		
		exchangeprofilename_e1 = prop.getProperty("exchangeprofilename_e1");
		
		user_webservice = prop.getProperty("user_webservice");
		password_webservice = prop.getProperty("password_webservice");
		
		
		ssh_uio_host 		= prop.getProperty("ssh_uio_host");	
	    ssh_uio_port 		= prop.getProperty("ssh_uio_port");
	    ssh_uio_username 	= prop.getProperty("ssh_uio_username");
	    ssh_uio_password 	= prop.getProperty("ssh_uio_password");
	    ssh_gye_host 		= prop.getProperty("ssh_gye_host");
	    ssh_gye_port 		= prop.getProperty("ssh_gye_port");
	    ssh_gye_username 	= prop.getProperty("ssh_gye_username");
	    ssh_gye_password 	= prop.getProperty("ssh_gye_password");
	    ssh_nac_host 		= prop.getProperty("ssh_nac_host");
	    ssh_nac_port 		= prop.getProperty("ssh_nac_port");
	    ssh_nac_username 	= prop.getProperty("ssh_nac_username");
	    ssh_nac_password 	= prop.getProperty("ssh_nac_password");
		
	    tipo_coneccion		= prop.getProperty("tipo_coneccion");
		
    }
    
        
}
