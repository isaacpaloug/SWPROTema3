package exercicisArrays;

import utilitats.UtilitatsConsola;

public class Exercici5 {

	public void ordenaCadena(int[] cadena) {
		if (cadena.length == 3) {
	        int aux;
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
