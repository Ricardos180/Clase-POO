package examen3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Lector {
	
	private final String archivoCSV = "C:/Users/Ricar/OneDrive/Documentos/emails.csv";

    private final String archivoSalida = "172838.txt";
    private final int cantidadFilas = 50; 
    private final int inicioFilas = 838; 
    public void ejecutar(int id) {
        // Calcula el número de fila de inicio para la suma
        int inicioSuma = (id + inicioFilas % 5172);
        
        // Crea un mapa para almacenar las sumas de las palabras
        Map<String, Integer> sumasPalabras = new HashMap<>();
        
        try (BufferedReader lector = new BufferedReader(new FileReader(archivoCSV))) {
            // Lee la primera línea del archivo para obtener los nombres de las palabras
            String[] nombresPalabras = lector.readLine().split(",");
            
            // Lee las filas del archivo y realiza la suma para cada palabra en las filas seleccionadas
            String linea;
            int filaActual = 1;
            while ((linea = lector.readLine()) != null && filaActual <= 5172) {
                if (filaActual >= inicioSuma && filaActual < inicioSuma + cantidadFilas) {
                    String[] valores = linea.split(",");
                    for (int i = 1; i < valores.length - 1; i++) {
                        String palabra = nombresPalabras[i];
                        int cantidad = Integer.parseInt(valores[i]);
                        sumasPalabras.put(palabra, sumasPalabras.getOrDefault(palabra, 0) + cantidad);
                    }
                }
                filaActual++;
            }
            for (String palabra : sumasPalabras.keySet()) {
                System.out.println(palabra + ", " + sumasPalabras.get(palabra));
            }

            // Guarda los resultados en un archivo de texto
            try (FileWriter escritor = new FileWriter(archivoSalida)) {
                for (String palabra : sumasPalabras.keySet()) {
                    escritor.write(palabra + ", " + sumasPalabras.get(palabra) + "\n");
                }
            }
            
            System.out.println("Proceso completado. Los resultados se han guardado en el archivo \"" + archivoSalida + "\".");
            
        } catch (IOException e) {
            System.out.println("Error al leer o escribir el archivo: " + e.getMessage());
        }
    }
}

