package exercicis;

import java.util.Scanner;

public class Exercici5 {
	public double mitjana(double a, double b, double c) {
		return (a + b + c) / 3;
	}
	
	public double lletgirTeclat(String prompt) {
		Scanner teclat = new Scanner(System.in);
		System.out.print(prompt);
		double c = teclat.nextDouble();
		return c;
	}
	public static void main(String[] args) {
		Exercici5 p = new Exercici5();
		double a = p.lletgirTeclat("Primer num: ");
		double b = p.lletgirTeclat("Segon num: ");
		double c = p.lletgirTeclat("Tercer num: ");
		System.out.println("La mitja és de: " + p.mitjana(a, b, c));
	}
}
