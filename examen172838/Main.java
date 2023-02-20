package examen172838;

public class Main {
	public static void main (String args[]){
		examen examen = new examen();
		String unaFrase = "Hasta luego cocodrilo";
		
		// Ejecutando el método para imprimir los números de FizzBuzz
		System.out.println("FizzBuzz:");
		examen.fizzBuzz();
		
		// Ejecutando el método para imprimir las vocales en mayúscula
		System.out.println("\nVocales en mayúscula:");
		char[] vocales = examen.vocales(unaFrase);
		System.out.println(vocales);
		
		// Ejecutando el método para imprimir la palabra invertida
		String cadena = "anita";
		String invertida = examen.invertirPalabra(cadena);
		System.out.println("\nPalabra invertida:");
		System.out.println(invertida);
		
		// Ejecutando el método para convertir un caracter a mayúscula
		char caracter = 'a';
		char caracterMayuscula = examen.convertirAMayuscula(caracter);
		System.out.println("\nCaracter convertido a mayúscula:");
		System.out.println(caracterMayuscula);
		
		// Ejecutando el método para verificar si una cadena es un palíndromo
		String[] cadenas = { "sugus", "anitalavalatina", "girafarig", "ricardo" };
		for (String cadena1 : cadenas) {
			System.out.println("\n" + cadena1 + " es palíndromo? " + examen172838.examen.esPalindromo(cadena1));
		}
	}

	public static examen newExamen() {
		return new examen();
	}
}


	

	
	
	

	



	
	
	

	
		 
	
	

