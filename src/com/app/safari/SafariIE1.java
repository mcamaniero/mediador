package com.app.safari;

import java.io.IOException;

import ec.com.grupotvcable.wsdlsafari.Mensaje;
import ec.com.grupotvcable.wsdlsafari.Safari;
import tvcable.app.comarch.utils.Codigos;


public class SafariIE1 extends Parametros{
	
    private TelnetWrapper Telnet = new TelnetWrapper();
    private String Prompt = "";
    private String TrunkGrpPrompt = "";
    private Safari Saf = null;
		
    public SafariIE1(int ciudad, Safari saf) throws Exception{
    	super();
    	Saf  = saf;
        
        switch(ciudad){
		case Codigos.QUITO:
			Telnet.connect(telnet_uio_host, Integer.parseInt(telnet_uio_port));
			Telnet.login(telnet_uio_username, telnet_uio_password);
			Prompt = prompt_uio;
			TrunkGrpPrompt = prompt_trunkgrp_uio;
			break;
		case Codigos.GUAYAQUIL:
			Telnet.connect(telnet_gye_host, Integer.parseInt(telnet_gye_port));
			Telnet.login(telnet_gye_username, telnet_gye_password);
			Prompt = prompt_gye;
			TrunkGrpPrompt = prompt_trunkgrp_gye;
			break;
		case Codigos.CUENCA:
			Telnet.connect(telnet_cue_host, Integer.parseInt(telnet_cue_port));
			Telnet.login(telnet_cue_username, telnet_cue_password);
			Prompt = prompt_cue;
			TrunkGrpPrompt = prompt_trunkgrp_cue;
		}
    }
    
    
    
    public Mensaje CambioPlan() throws IOException{
    	//HomeExchangeName: 
    	//E1-SUS 
    	//E1-FULL-PRE 
    	//E1-Bx-PRE: 	1>x>8
    	
    	Mensaje mens = new Mensaje();
    	
    	String[] matches = new String[2];
    	String result = "";
    	String tmp;
    	String TrunkGrp = "";
    	
    	Telnet.setPrompt(this.Prompt);
    	Telnet.waitForPrompt();
        Telnet.send("ShowConfig | include billingNumber: " + Saf.getDatoS1().substring(4));
        matches[0] = this.Prompt;
        matches[1] = "--MORE--";
        result = Telnet.waitfor(matches);
        
        while(result.lastIndexOf("--MORE--")!=-1){
            result = result.substring(0,result.lastIndexOf("--MORE--"));
            Telnet.send("\n");
            tmp = Telnet.waitfor(matches);
            result += tmp;
        }
        
        System.out.println("Busqueda: "+result);
        
        String[] filas = result.split("\n");
        for(int i=0;i<filas.length;i++){
            if(filas[i].trim().indexOf("resourceGrpNumber: ")!=-1){
            	String[] value = filas[i].trim().split(":");
                TrunkGrp = value[value.length-1].trim();
            }
        }
    	
		System.out.println("**Resp C3 resourceGrpNumber: "+TrunkGrp);
        
		if(!TrunkGrp.equals("")){

			Telnet.setPrompt(this.TrunkGrpPrompt);
			Telnet.send("TrunkGrp "+Integer.parseInt(TrunkGrp));
			Telnet.waitForPrompt();
			Telnet.send("ExchangeProfileName "+Saf.getDatoS2());
			Telnet.waitForPrompt();
			Telnet.setPrompt(this.Prompt);
			Telnet.send("end");

			String res = Telnet.waitForPrompt();

			System.out.println("Resp 2: "+res);

			if(res.length()==17){       
	        	mens.setCodError(1);//verificar el cod error
	        	mens.setDetMensaje("Proceso realizado con exito");
	        }else{
	        	mens.setCodError(2);//verificar el cod error
	        	mens.setDetMensaje(res.substring(3, res.length()-11));
	        }
		}else{
			mens.setCodError(3);//verificar el cod error
        	mens.setDetMensaje("Numero Piloto "+Saf.getDatoS1()+" no encontrado");
			
			
		}
		
		//mens.setCodError(1);//verificar el cod error
    	//mens.setDetMensaje("Proceso realizado con exito");
		
		Telnet.disconnect();
		return mens;
       
    }
    
 }
