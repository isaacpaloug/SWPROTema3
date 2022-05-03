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
	
	
	public static void main(String[] args) {

	}

}
