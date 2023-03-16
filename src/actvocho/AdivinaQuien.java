package actvocho;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class AdivinaQuien {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear una lista de jugadores
        ArrayList<Jugador> jugadores = new ArrayList<>();
        Jugador jugadorActual = null;

        // Preguntar el nombre del jugador
        System.out.print("Introduce tu nombre: ");
        String nombreJugador = scanner.nextLine();

        // Buscar si el jugador ya existe en la lista de jugadores
        for (Jugador jugador : jugadores) {
            if (jugador.getNombre().equals(nombreJugador)) {
                jugadorActual = jugador;
                break;
            }
        }

        // Si no existe, crear un nuevo jugador y agregarlo a la lista
        if (jugadorActual == null) {
            jugadorActual = new Jugador(nombreJugador);
            jugadores.add(jugadorActual);
        }

        // Mostrar las estadísticas del jugador
        System.out.println("Hola, " + jugadorActual.getNombre() + ".");
        System.out.println("Has jugado " + jugadorActual.getPartidasJugadas() + " partidas.");
        System.out.println("Has ganado " + jugadorActual.getPartidasGanadas() + " partidas.");

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
                System.out.println("¡Felicidades! Has adivinado el personaje correctamente " + personajeSeleccionado);
                ganado = true;
            } else {
                System.out.println("Lo siento, ese no es el personaje que estoy pensando. ¡Inténtalo de nuevo!");
            }

            // Actualizar estadísticas del jugador
            Jugador.incrementarJuegosJugados();
            if (ganado) {
                Jugador.incrementarJuegosGanados();
            }

         // Guardar estadísticas del jugador en archivo
            try {
                FileOutputStream fileOut = new FileOutputStream(nombreJugador + ".ser");
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(jugadores);
                out.close();
                fileOut.close();
                System.out.println("Estadísticas del jugador guardadas en " + nombreJugador + ".ser");
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
         // Mostrar las estadísticas del jugador
            System.out.println("Hola, " + jugadorActual.getNombre() + ".");
            System.out.println("Has jugado " + jugadorActual.getPartidasJugadas() + " partidas.");
            System.out.println("Has ganado " + jugadorActual.getPartidasGanadas() + " partidas.");

            
            
         // Actualizar estadísticas del jugador
            Jugador.incrementarJuegosJugados();
            if (ganado) {
                Jugador.incrementarJuegosGanados();
            }

            // Guardar la partida y actualizar estadísticas de partidas anteriores del jugador
            Partida partidaActual = new Partida(personajeSeleccionado, genero, cabello, ojos, velloFacial, ganado);
            jugadorActual.agregarPartidaAnterior(partidaActual);

            // Guardar estadísticas del jugador en archivo
            try {
                FileOutputStream fileOut = new FileOutputStream(nombreJugador + ".ser");
                ObjectOutputStream out = new ObjectOutputStream(fileOut);
                out.writeObject(jugadores);
                out.close();
                fileOut.close();
                System.out.println("Estadísticas del jugador guardadas en " + nombreJugador + ".ser");
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }



            // Preguntar si el usuario quiere seguir jugando o salir
            System.out.println("¿Quieres seguir jugando? (Sí/No)");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("No")) {
                ganado = false;
            }
        }
    }
}
           
