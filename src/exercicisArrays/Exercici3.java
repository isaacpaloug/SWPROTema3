package exercicisArrays;

import utilitats.UtilitatsConsola;

public class Exercici3 {

	public int[] generarArray(int longitud, int min, int max) {
		int cadena[] = new int[longitud];
		for (int i = 0; i < cadena.length; i++) {
			cadena[i] =  min + (int) (Math.random() * (max - min + 1));
		}
		return cadena;
	}
	public static void main(String[] args) {
		Exercici3 p = new Exercici3();
		
		UtilitatsConsola.mostraCadena(p.generarArray(10, 1, 20));
		UtilitatsConsola.mostraCadena(p.generarArray(5, 1, 10));
		UtilitatsConsola.mostraCadena(p.generarArray(4, 1, 100));

	}

}
