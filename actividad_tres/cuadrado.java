package actividad_tres;

public class cuadrado {
    private int lado;
    private int id;

    public cuadrado(int lado) {
        this.lado = lado;
    }

    public cuadrado() {
        this(0);
        this.id = this.lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getDiagonal() {
        return (int) (lado * Math.sqrt(2));
    }

    public int getPerimetro() {
        return 4 * lado;
    }

    public int getArea() {
        return lado * lado;
    }

    public int getId() {
        return id;
    }
}

