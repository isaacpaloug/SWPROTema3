package exercicis;

import java.util.Scanner;

public class Exercici4 {
	public boolean comparador(int num) {
		if(num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	public int llegirTeclat(String prompt) {
		Scanner teclat = new Scanner(System.in);
		System.out.print(prompt);
		int num = teclat.nextInt();
		return num;
	}
	public static void main(String[] args) {
		Exercici4 p = new Exercici4();
		int num = p.llegirTeclat("Introdueix un num: ");
		if (p.comparador(num)) {
			System.out.println("El numero " + num + " és parell");
		} else {
			System.out.println("El numero " + num + " és imparell");
		}
	}

}
