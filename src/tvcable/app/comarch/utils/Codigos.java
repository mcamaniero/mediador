package tvcable.app.comarch.utils;

public abstract class Codigos {

	//1. IdEmpresa.- Código de la ciudad del negocio.
	public static final int GUAYAQUIL = 94;
	public static final int QUITO = 63;
	public static final int CUENCA = 65;
	public static final int AMBATO = 64;
	public static final int MANTA = 95;
	public static final int MACHALA = 96;
	public static final int IBARRA = 97;
	
	
	//2. Negocio.- Se especifica el negocio, para el proceso de aprovisionamiento 
	//el negocio no es lo mismo que las empresas definidas por Comarch 
	//para el Grupo TvCable.
	public static final int SETEL = 1;
	public static final int SURATEL = 2;
	public static final int TVPAGADA = 3;
	public static final int BANCOS = 4;
	public static final int SERVINFO = 5;
	public static final int HIPERK = 6;
	public static final int CRM = 7;
	
	public static final String MensNegocioIncorrecto = "Codigo del negocio incorrecto ";
	public static final String CampoInvalido_1001 = "Error: Campo Invalido ";
	public static final String FalloConeccion_1002 = "Error: Fallo la coneccion con el controlador ";
	
	
}
