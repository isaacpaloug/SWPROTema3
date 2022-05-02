package exercicisArrays;

import utilitats.UtilitatsConsola;

public class Exercici5 {

	public void ordenaCadena(int[] vector) {
		if (vector.length == 3) {
	        int aux;
	        if (vector[0] > vector[1]) {
	            aux = vector[1];
	            vector[1] = vector[0];
	            vector[0] = aux;
	        }
	        if (vector[0] > vector[2]) {
	            aux = vector[2];
	            vector[2] = vector[0];
	            vector[0] = aux;
	        }
	        if (vector[1] > vector[2]) {
	            aux = vector[2];
	            vector[2] = vector[1];
	            vector[1] = aux;
	        }
		}
	}
	public static void main(String[] args) {
        Exercici5 p = new Exercici5();

        int[] a = {10, 17, 13};
        UtilitatsConsola.mostraCadena(a);
        p.ordenaCadena(a);
        UtilitatsConsola.mostraCadena(a);

	}

}
