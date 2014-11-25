/**
 * 
 */
package tvcable.app.comarch.utils;

/**
 * @author wvasquez
 *
 */

public final class Conversiones {

	/**
	 * Convierte una cadena de Ascii a un Decimal
	 * 
	 * @param ascii	un String para convertir a Decimal 
	 * @return  un String convertido a Decimal.
	 */
	public static String AsciiToDecimal(String ascii) {
		byte[] dec = ascii.getBytes();
		StringBuilder value = new StringBuilder();
		for (int d : dec)
			value.append(d);

		return value.toString();
	}

	/**
	 * Convierte de una cadena Ascii a Hexadecimal
	 * 
	 * @param ascii un String para convertir a Hexadecimal
	 * @return un String convertido a Hexadecimal
	 */
	public static String AsciiToHexadecimal(String ascii) {
		StringBuilder value = new StringBuilder();
		for (int i = 0; i < ascii.length(); i++) {
			String tmp = AsciiToDecimal(ascii.substring(i, i + 1));
			value.append(DecimalToHexadecimal(tmp));
		}
		return value.toString();
	}
	
	
	/**
	 * Convierte de una cadena Hexadecimal a Ascii
	 * 
	 * @param hexa un String para convertir a Hexadecimal
	 * @return un String convertido a Ascii
	 */
	public static String HexadecimalToAscii(String hexa) {
		StringBuilder value = new StringBuilder();
		for (int i = 0; i < hexa.length(); i=i+2) {
			String tmp = HexadecimalToDecimal(hexa.substring(i, i + 2));
			value.append(DecimalToAscii(tmp));
		}
		return value.toString();
	}


	/**
	 * convierte un numero binario a Decimal
	 * @param binario un String para convertir a Decimal 
	 * @return  un String convertido a Decimal.
	 */
	public static String BinarioToDecimal(String binario) {
		return Integer.toString(Integer.parseInt(binario, 2), 10);
	}

	/**
	 * Convierte un numero Binario a Hexadecimal
	 *  
	 * @param binario un String para convertir a Hexadecimal 
	 * @return  un String convertido a Hexadecimal.
	 */
	public static String BinarioToHexadecimal(String binario) {
		return Long.toString(Long.parseLong(binario, 2), 16).toUpperCase();
	}
	
	

	/**
	 * Convierte un numero Decimal a Ascii 
	 * 
	 * @param decimal un String para convertir a Ascii 
	 * @return  un String convertido a Ascii.
	 */
	public static String DecimalToAscii(String decimal) {
		return "" + (char) Integer.parseInt(decimal);
	}

	/**
	 * Convierte un numero Decimal a Binario
	 * 
	 * @param decimal un String para convertir a Binario 
	 * @return  un String convertido a Binario.
	 */
	public static String DecimalToBinario(String decimal) {
		return Integer.toString(Integer.parseInt(decimal, 10), 2);
	}

	/**
	 * Convierte un numero Decimal a Hexadecimal
	 * 
	 * @param decimal un String para convertir a Hexadecimal 
	 * @return  un String convertido a Hexadecimal.
	 */
	public static String DecimalToHexadecimal(String decimal) {
		return Integer.toString(Integer.parseInt(decimal, 10), 16)
				.toUpperCase();
	}
	
   
	
	/**
	 * Convierte un numero Hexadecimal a Binario
	 * 
	 * @param hexadecimal un String para convertir a Binario 
	 * @return  un String convertido a Binario.
	 */
	public static String HexadecimalToBinario(String hexadecimal) {
		return Integer.toString(Integer.parseInt(hexadecimal, 16), 2);
	}
	
		
	/**
	 * Convierte un numero Hexadecimal a Decimal
	 * 
	 * @param hexadecimal un String para convertir a Decimal 
	 * @return un String convertido a Decimal.
	 */
	public static String HexadecimalToDecimal(String hexadecimal) {
		return Integer.toString(Integer.parseInt(hexadecimal, 16), 10);
	}
	
	public static void main(String []a){
		System.out.println(Conversiones.HexadecimalToAscii("543142383135303539324239"));
	}
}
