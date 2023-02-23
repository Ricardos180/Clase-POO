package actividad_tres;

public class circulo {
    private int radio;
    private int id;

    public circulo(int radio) {
        this.radio = radio;
    }

    public circulo() {
        this(0);
        this.id = this.radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public double getCircunferencia() {
        return 2 * Math.PI * radio;
    }

    public double getArea() {
        return Math.PI * radio * radio;
    }

    public int getId() {
        return id;
    }
}

