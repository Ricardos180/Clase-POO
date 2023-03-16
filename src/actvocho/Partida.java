package actvocho;

import java.time.LocalDateTime;

public class Partida {
    private LocalDateTime fechaHora;
    private Jugador jugador;
    private Personaje personajeSeleccionado;
    private boolean ganado;

    public Partida(Jugador jugador, Personaje personajeSeleccionado) {
        this.fechaHora = LocalDateTime.now();
        this.jugador = jugador;
        this.personajeSeleccionado = personajeSeleccionado;
    }

    public Partida(Personaje personajeSeleccionado2, String genero, String cabello, String ojos, String velloFacial,
			boolean ganado2) {
		// TODO Auto-generated constructor stub
	}

	public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public Personaje getPersonajeSeleccionado() {
        return personajeSeleccionado;
    }

    public boolean isGanado() {
        return ganado;
    }

    public void setGanado(boolean ganado) {
        this.ganado = ganado;
    }

	public char[] getResultado() {
		// TODO Auto-generated method stub
		return null;
	}
}

