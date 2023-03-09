package examen2_172838;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class AdivinaQuien {

    @SuppressWarnings("resource")
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Configurar los personajes
        ArrayList<Personaje> personajes = new ArrayList<>();
        personajes.add(new Personaje("María", "Mujer", "Rubia", "Ojos verdes", "Ninguno"));
        personajes.add(new Personaje("Juan", "Hombre", "Moreno", "Ojos marrones", "Bigote"));
        personajes.add(new Personaje("Ana", "Mujer", "Pelirroja", "Ojos azules", "Ninguno"));
        personajes.add(new Personaje("Pedro", "Hombre", "Castaño", "Ojos verdes", "Barba"));

        // Seleccionar el personaje aleatorio
        Random random = new Random();
        int index = random.nextInt(personajes.size());
        Personaje personajeSeleccionado = personajes.get(index);

        // Jugar el juego
        System.out.println("¡Bienvenido a Adivina Quién!");
        System.out.println("Estoy pensando en un personaje...");
        boolean ganado = false;
        while (!ganado) {
            System.out.println("¿Quién crees que es el personaje que estoy pensando?");
            System.out.print("Género(Mujer/Hombre): ");
            String genero = scanner.nextLine();
            System.out.print("Color de cabello(Rubia,Moreno, Pelirroja, Castaño): ");
            String cabello = scanner.nextLine();
            System.out.print("Color de ojos(Ojos verdes, Ojos marrones, Ojos azules, Ojos verdes): ");
            String ojos = scanner.nextLine();
            System.out.print("Tipo de vello facial(Barba, Bigote, Ninguno: ");
            String velloFacial = scanner.nextLine();

            // Comparar con el personaje seleccionado
            if (personajeSeleccionado.esPersonaje(genero, cabello, ojos, velloFacial)) {
                System.out.println("¡Felicidades! Has adivinado el personaje correctamente "+ personajeSeleccionado);
                ganado = true;
            } else {
                System.out.println("Lo siento, ese no es el personaje que estoy pensando. ¡Inténtalo de nuevo!");
            }
        }
    }
}
