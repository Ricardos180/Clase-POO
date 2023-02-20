package examen172838;

import java.util.Scanner;

public class examen {

	
		public static void main(String[] args) {
			
			int n = 100; 

			for (int i = 1; i <= n; i++)   
			{  
			  
			if (i%3==0 && i%5==0)   
			{   

			System.out.print("FizzBuzz");  
			}   
			else if (i%3==0)   
			{  

			System.out.print("Fizz");  
			}   

			else if (i%5==0)   
			{   
			 
			System.out.print("Buzz");  
			}   
			else   
			{  
			    
			System.out.print(i);  
			} 

			System.out.print(","+" ");}
			
			
			String vocal = "Hasta luego cocodrilo";
			
			
			 for (int i = 0; i < vocal.length(); i++){

			        if (vocal.charAt(i) == 'a'){
			             System.out.println("a".toUpperCase());
			        }
			        if (vocal.charAt(i) == 'e'){
			             System.out.println("e".toUpperCase());
			        }
			        if (vocal.charAt(i) == 'i'){
			             System.out.println("i".toUpperCase());
			        }
			        if (vocal.charAt(i) == 'o'){
			             System.out.println("o".toUpperCase());
			        }
			        if (vocal.charAt(i) == 'u'){
			             System.out.println("u".toUpperCase());}
	}


			 String cadena = "anita";
				String invertida = "";
				for (int indice = cadena.length() - 1; indice >= 0; indice--) {
					invertida += cadena.charAt(indice);
				}
				System.out.println("Palabra original: " + cadena);
				System.out.println("Palabra invertida: " + invertida);
				
				
				
				
				
				try (Scanner entrada = new Scanner(System.in)) {
					char caracter;
					  int opcion = 0;
					  char caracter_mayuscula = 0;
					  
					  
					    System.out.println("Dígite una palabra: ");
					    caracter = entrada.next().charAt(0);
					    
					    	    
					    if(opcion == 1) {
					        if(Character.isUpperCase(caracter)) {
					            System.out.println("El caracter ya está en mayuscula");
					        }
					    }
					    else {
					         caracter_mayuscula = Character.toUpperCase(caracter);
					        System.out.println("El caracter convertido a mayuscula: " + caracter_mayuscula);
					        }
				}
				
				String[] cadenas = { "sugus", "anitalavalatina", "girafarig", "ricardo" };
				for (String cadena1 : cadenas) {
					System.out.println(cadena1 + "' es palíndromo? " + esPalindromo(cadena1));
				}
				
			
				
				
		
		}


			public static boolean esPalindromo(String cadena) {
				
				String invertida = new StringBuilder(cadena).reverse().toString();
				return invertida.equals(cadena);
				
				
				
	}


			public char[] vocales(String unaFrase) {
			    char[] vocalesMayusculas = new char[5]; // un arreglo de tamaño 5 para almacenar las vocales mayúsculas
			    int j = 0; // un contador para llevar la cuenta de cuántas vocales hemos encontrado

			    for (int i = 0; i < unaFrase.length(); i++) {
			        char c = unaFrase.charAt(i);

			        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			            // Si encontramos una vocal minúscula, la convertimos a mayúscula y la agregamos al arreglo
			            vocalesMayusculas[j] = Character.toUpperCase(c);
			            j++;

			            if (j == 5) {
			                // Si ya encontramos las 5 vocales, salimos del ciclo
			                break;
			            }
			        }
			    }

			    return vocalesMayusculas;
			}


			public void fizzBuzz() {
				int n = 100;
		        for (int i = 1; i <= n; i++) {  
		            if (i % 3 == 0 && i % 5 == 0) {   
		                System.out.print("FizzBuzz");  
		            } else if (i % 3 == 0) {  
		                System.out.print("Fizz");  
		            } else if (i % 5 == 0) {   
		                System.out.print("Buzz");  
		            } else {  
		                System.out.print(i);  
		            } 
		            System.out.print("," + " ");
				
			}
			}


			public String invertirPalabra(String cadena) {
				String invertida = "";
		        for (int indice = cadena.length() - 1; indice >= 0; indice--) {
		            invertida += cadena.charAt(indice);
		        }
		        return invertida;
		    }
			


			public char convertirAMayuscula(char caracter) {
				if (Character.isUpperCase(caracter)) {
		            System.out.println("El caracter ya está en mayúscula");
		            return caracter;
		        } else {
		            char caracterMayuscula = Character.toUpperCase(caracter);
		            System.out.println("El caracter convertido a mayúscula: " + caracterMayuscula);
		            return caracterMayuscula;
		        }
			}

			}


			
			  
			


		
		
			

			
		
	
	


