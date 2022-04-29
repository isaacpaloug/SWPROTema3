package exercicis;

import utilitats.UtilitatsConsola;

public class Exercici8 {
	// EXERCICI 3
	public void comparador(int num) {
		if(num % 2 == 0) {
			System.out.println("El numero " + num + " és parell");
		} else {
			System.out.println("El numero " + num + " és imparell");
		}
	}
	// EXERCICI 4
	public boolean esParell(int num) {
		if(num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	// EXERCICI 5
	public double mitjana(double a, double b, double c) {
		return (a + b + c) / 3;
	}
	
	public static void main(String[] args) {
		Exercici8 p = new Exercici8();
		
		System.out.println("EXERCICI 3");
		
		int quantitatNotes = UtilitatsConsola.llegirSencer("Introdueix un numero: ");
		p.comparador(quantitatNotes);
		
		System.out.println("EXERCICI 3");
		quantitatNotes = UtilitatsConsola.llegirSencer("Introdueix un altre numero: ");
		if (p.esParell(quantitatNotes)) {
			System.out.println("El numero " + quantitatNotes + " és parell");
		} else {
			System.out.println("El numero " + quantitatNotes + " és imparell");
		}
		
		System.out.println("EXERCICI 4");
		double a = UtilitatsConsola.llegirDouble("Introdueix un numero: ");
		double b = UtilitatsConsola.llegirDouble("Introdueix un altre numero: ");
		double c = UtilitatsConsola.llegirDouble("Introdueix un altre numero: ");
		
		System.out.println("La mitjana és de: " + p.mitjana(a, b, c));
	}

}
