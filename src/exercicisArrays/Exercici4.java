package exercicisArrays;

import utilitats.UtilitatsConsola;

public class Exercici4 {

	public boolean comparaArrays(int[] cadena1, int[] cadena2) {
		if (cadena1.length == cadena2.length) {
			for (int i = 0; i < cadena1.length; i++) {
				if (cadena1[i] != cadena2[i]) {
					return false;
				} 
			}
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		Exercici4 p = new Exercici4();
		int[] cadena1 = {1, 2, 4, 4, 5};
		int[] cadena2 = {1, 2, 4, 4, 5};
		UtilitatsConsola.mostraCadena(cadena1);
		UtilitatsConsola.mostraCadena(cadena2);
		System.out.println(p.comparaArrays(cadena1, cadena2));
	}

}
