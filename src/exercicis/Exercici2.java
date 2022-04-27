package exercicis;

import java.util.Scanner;

public class Exercici2 {
	
	public void simpatic(String nom){
		System.out.println("Hola " + nom);
	}
	public String llegirTeclat(String nom) {
		Scanner teclat = new Scanner(System.in);
		System.out.print(nom);
		String n = teclat.nextLine();
		return n;
	}
	public static void main(String[] args) {
		Exercici2 p = new Exercici2();
		String nom = p.llegirTeclat("Nom: ");
		p.simpatic(nom);

	}

}
