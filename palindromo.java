package Examen;

public class palindromo {
	public static void main(String[] args) {
		String[] cadenas = { "sugus", "anitalavalatina", "girafarig", "ricardo" };
		for (String cadena : cadenas) {
			System.out.println(cadena + "' es palíndromo? " + esPalindromo(cadena));
		}
	}


	public static boolean esPalindromo(String cadena) {
		
		String invertida = new StringBuilder(cadena).reverse().toString();
		return invertida.equals(cadena);
	}
}