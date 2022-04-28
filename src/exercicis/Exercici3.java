package exercicis;

import java.util.Scanner;

public class Exercici3 {
	
	public void comparador(int num) {
		if(num % 2 == 0) {
			System.out.println("El numero " + num + " és parell");
		} else {
			System.out.println("El numero " + num + " és imparell");
		}
	}
	public int llegirTeclat(String prompt) {
		Scanner teclat = new Scanner(System.in);
		System.out.print(prompt);
		int num = teclat.nextInt();
		return num;
	}
	
	public static void main(String[] args) {
		Exercici3 p = new Exercici3();
		int num = p.llegirTeclat("Introdueix un num: ");
		p.comparador(num);
	}
}
