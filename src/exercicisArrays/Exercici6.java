package exercicisArrays;

import utilitats.UtilitatsConsola;

public class Exercici6 {
	public boolean ordenaCadena(int[] cadena) {
		int aux;
		boolean resultat = true;
		if (cadena.length == 3) {
	        if (cadena[0] > cadena[1]) {
	            aux = cadena[1];
	            cadena[1] = cadena[0];
	            cadena[0] = aux;
	        }
	        if (cadena[0] > cadena[2]) {
	            aux = cadena[2];
	            cadena[2] = cadena[0];
	            cadena[0] = aux;
	        }
	        if (cadena[1] > cadena[2]) {
	            aux = cadena[2];
	            cadena[2] = cadena[1];
	            cadena[1] = aux;
	        }
		}else {
			resultat = false;
		}
		return resultat;
	}
	public static void main(String[] args) {
		Exercici6 p = new Exercici6();
		int[] cadena1 = {10, 14, 3};
		UtilitatsConsola.mostraCadena(cadena1);
		
		boolean ordenable;
		
		ordenable = p.ordenaCadena(cadena1);
		
		if (ordenable) {
			UtilitatsConsola.mostraCadena(cadena1);
		} else {
			System.out.println("La cadena no té tres posicions, per tant no es pot ordenar");
		}
	}

}
