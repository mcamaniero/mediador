package com.app.tvp;

public class Excepciones extends Exception
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	//public static String mensaje;
	protected static String mensaje;
	protected static int error_code;
	
	public Excepciones(int problema)
	{
		super (Message(problema));
	}
   
	public static void SetCodigoError(int error)
	{
		error_code = error;
	}
	
	public int GetCodigoError()
	{
		return this.error_code;
	}
	
	public static String Message(int problema) 
	{
		SetCodigoError(problema);
	    switch(problema)
	    {
	    
		    case 1:
		    	mensaje = "Error Valor Nulo";
		    break;
		    
		    case 2:
		    	mensaje = "Error Cadena No recibida";
		    break;
		    
		    case 3:
		    	mensaje = "No se admite valor NULL";
		    break;
		    
		    case 4:
		    	mensaje = "Tamaño de texto excede numero de carecteres";
		    break;
		    
		    case 5:
		    	mensaje = "Falto Indicar Codigo de Ciudad";
		    break;
		    
		    case 6:
		    	mensaje = "No se ha configurado el Servicio/Paychannel";
		    break;
		    
		    case 7:
		    	mensaje = "No se ha indicado el codigo de la ciudad";
		    break;
		    
		    case 8:
		    	mensaje = "Esta ciudad no adminte PPV";
		    break;
		    
		    case 9:
		    	mensaje = "No se ha indicado ninguna Accion Valida";
		    break;
		    
		    case 10:
		    	mensaje = "Falto Ingresar el Codigo del Evento";
		    break;
		    
		    case 11:
		    	mensaje = "Asegurese que el codigo sea Mayor que 0";
		    break;
		    
		    case 12:
		    	mensaje = "No se ha especificado la accion a ejecutar";
			break;
			
		    case 13:
		    	mensaje = "Channel Map no se encuentra configurado";
			break;
			
		    case 14:
		    	mensaje = "Usuario no tiene permitido el uso de Aprovisionamiento";
			break;
		    	
		    case 15:
		    	mensaje = "No se ha configurado el Paychannel";
		    break;
			
	    }
	    return mensaje;
	}

}

