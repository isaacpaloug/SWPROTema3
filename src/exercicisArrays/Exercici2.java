package exercicisArrays;

public class Exercici2 {

	public int sumarArray(int[] valors) {
		int suma = 0;
		for (int i = 0; i < valors.length; i++) {
			suma += valors[i];
		}
		return suma;
	}
	public static void main(String[] args) {
		Exercici2 p = new Exercici2();
		int[] cadena = {2, 10, 10, 10};
		
		int resultat = p.sumarArray(cadena);
		System.out.println(resultat);
		
	}

}
