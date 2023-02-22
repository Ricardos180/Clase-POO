public class Cuadrado {
    private long lado;
    private int id;

    public Cuadrado(int id, long lado) {
        this.id = id;
        this.lado = lado;
    }

    public Cuadrado(int id) {
        this.id = id;
        this.lado = 172838;
    }

    public long getLado() {
        return lado;
    }

    public void setLado(long lado) {
        this.lado = lado;
    }

    public double getDiagonal() {
        return lado * Math.sqrt(2);
    }

    public long getPerimetro() {
        return 4 * lado;
    }

    public long getArea() {
        return lado * lado;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        long longitudLado = 5L;
        Cuadrado cuadrado1 = new Cuadrado(1, longitudLado);
        Cuadrado cuadrado2 = new Cuadrado(2);

        System.out.println("Cuadrado " + cuadrado1.getId());
        System.out.println("Longitud del lado: " + cuadrado1.getLado());
        System.out.println("Diagonal: " + cuadrado1.getDiagonal());
        System.out.println("Perímetro: " + cuadrado1.getPerimetro());
        System.out.println("Área: " + cuadrado1.getArea());

        System.out.println();

        System.out.println("Cuadrado " + cuadrado2.getId());
        System.out.println("Longitud del lado: " + cuadrado2.getLado());
        System.out.println("Diagonal: " + cuadrado2.getDiagonal());
        System.out.println("Perímetro: " + cuadrado2.getPerimetro());
        System.out.println("Área: " + cuadrado2.getArea());
    }
}

