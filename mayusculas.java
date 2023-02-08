
package Examen;

import java.util.Scanner;

public class mayusculas {

    public static void main(String[] args) {
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
        
        }
     
     
  }

