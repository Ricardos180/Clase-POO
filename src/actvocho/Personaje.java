package actvocho;

public class Personaje {
    private String nombre;
    private String genero;
    private String cabello;
    private String ojos;
    private String velloFacial;

    public Personaje(String nombre, String genero, String cabello, String ojos, String velloFacial) {
        this.nombre = nombre;
        this.genero = genero;
        this.cabello = cabello;
        this.ojos = ojos;
        this.velloFacial = velloFacial;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public String getCabello() {
        return cabello;
    }

    public String getOjos() {
        return ojos;
    }

    public String getVelloFacial() {
        return velloFacial;
    }

    public boolean esPersonaje(String genero, String cabello, String ojos, String velloFacial) {
        if (this.genero.equalsIgnoreCase(genero) && this.cabello.equalsIgnoreCase(cabello) && this.ojos.equalsIgnoreCase(ojos) && this.velloFacial.equalsIgnoreCase(velloFacial)) {
            return true;
        } else {
            return false;
        }
    }
}