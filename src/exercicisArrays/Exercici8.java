package exercicisArrays;

public class Exercici8 {

	public void mostraNotes(double[] valors) {
		System.out.print("[");
		String separador = "";
		for (int i = 0; i < valors.length; i++) {
			System.out.print(separador + valors[i]);
			separador = ", ";
		}
		System.out.println("]");
	}
	
	public double calcularMitjana(double[] cadena) {
		double suma = 0;
		double mitjana;
		for (int i = 0; i < cadena.length; i++) {
			suma+=cadena[i];
		}
		mitjana = suma / cadena.length;
		return mitjana;
	}
	
	
	public static void main(String[] args) {
		Exercici8 p = new Exercici8();
		double[] cadenaDouble = {7, 8, 5, 7, 3, 2};
		p.mostraNotes(cadenaDouble);
		
		System.out.println("La mitjana de la classe és: " + p.calcularMitjana(cadenaDouble));
	}

}
