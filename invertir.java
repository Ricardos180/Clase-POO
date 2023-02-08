package Examen;
public class invertir {
	public static void main(String[] args) {
		String cadena = "anita";
		String invertida = "";
		for (int indice = cadena.length() - 1; indice >= 0; indice--) {
			invertida += cadena.charAt(indice);
		}
		System.out.println("Palabra original: " + cadena);
		System.out.println("Palabra invertida: " + invertida);

	}
}