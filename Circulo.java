public class Circulo {

    private int id;
    private int radio;

    public Circulo(int id, int radio) {
        this.id = id;
        this.radio = radio;
    }
    
    public Circulo(int id) {
        this.id = id;
        this.radio = 172838;
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

    public static void main(String[] args) {
        int radio = 5;
        int id = 1;
        Circulo circulo = new Circulo(id, radio);

        System.out.println("Círculo " + circulo.getId());
        System.out.println("Radio: " + circulo.getRadio());
        System.out.println("Circunferencia: " + circulo.getCircunferencia());
        System.out.println("Área: " + circulo.getArea());

        id = 2;
        circulo = new Circulo(id);
        
        System.out.println("Círculo " + circulo.getId());
        System.out.println("Radio: " + circulo.getRadio());
        System.out.println("Circunferencia: " + circulo.getCircunferencia());
        System.out.println("Área: " + circulo.getArea());
    }
}

