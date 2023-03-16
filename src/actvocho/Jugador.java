package actvocho;

import java.io.Serializable;

public class Jugador implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre;
    private static int juegosJugados;
    private static int juegosGanados;

   
       
        private int partidasJugadas;
        private int partidasGanadas;
       

        public Jugador(String nombre) {
            this.nombre = nombre;
            this.partidasJugadas = 0;
            this.partidasGanadas = 0;
            
        }

        

    public String getNombre() {
        return nombre;
    }

    public int getJuegosJugados() {
        return juegosJugados;
    }

    public int getJuegosGanados() {
        return juegosGanados;
    }

    public static void incrementarJuegosJugados() {
        juegosJugados++;
    }

    public static void incrementarJuegosGanados() {
        juegosGanados++;
    }

    @Override
    public String toString() {
        return "Jugador [nombre=" + nombre + ", juegosJugados=" + juegosJugados + ", juegosGanados=" + juegosGanados
                + "]";
    }

    public String getPartidasGanadas() {
        return String.valueOf(juegosGanados);
    }

    public String getPartidasJugadas() {
        return String.valueOf(juegosJugados);
    }



	public void agregarPartidaAnterior(Partida partidaActual) {
		// TODO Auto-generated method stub
		
	}



	}



