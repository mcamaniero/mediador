/**
 * 
 */
package tvcable.app.comarch.utils;


/**
 * @author wvasquez
 *
 */
public class Paquete {

	
	public static final int CHEKSUM = 65536;
	
	
	/**
	 * Determina el tamaño de una cadena dividido para 2 pero redondeando al
	 * entero superior ej: "JONATHAN7" resp: 7.5 = 8
	 * 
	 * @param value un String con el contenido del paquete
	 * @return un int con el tamaño del paquete.
	 */
	public static int PaqueteLength(String value) {
		return Math.round(((float) value.length() / 2));
	}
	
	
	/**
	 * Metodo que recibe un valor Hexadecimal 000600000001 y convierte en parejas a valor Decimal
	 * y sumar sus resultados. ej:
	 * valor = 00 06 00 00 00 01
	 * ya convertidos a decimal cada par de numero:
	 * 0 + 6 + 0 + 0 + 0 + 1 = 7
	 * 
	 * Ahora, a la constante CHEKSUM se le resta el resultado de la suma de los valores decimales
	 * 65536 - 7 = 65529
	 * 
	 * Por ultimo, este valor de 65529 se convierte a Hexadecimal y
	 * se retorna los dos ultimos dijitos
	 * 
	 * @param valueHexadecimal un String que contiene un valor Hexadecimal
	 * @return un String que devuelve el valor de comprobacion del Paquete.
	 *
	 */
	public static String PaqueteChekSum(String valueHexadecimal) {
		int valueDecimal = 0;
		for(int i = 0; i<valueHexadecimal.length(); i = i+2){
			System.out.println("val "+valueHexadecimal.substring(i, i+2));
			System.out.println("val hexa "+Conversiones.HexadecimalToDecimal(valueHexadecimal.substring(i, i+2)));
			valueDecimal += Integer.parseInt(Conversiones.HexadecimalToDecimal(valueHexadecimal.substring(i, i+2)));
		}

		valueDecimal = CHEKSUM - valueDecimal;

		String valueExa = Conversiones.DecimalToHexadecimal(""+valueDecimal);
		return valueExa.substring(valueExa.length()-2, valueExa.length());
	}
	
	
	

	/**
	 * 
	 */
	public Paquete() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String a[]){
		Paquete.PaqueteChekSum("000600000001");
	}
	

}
