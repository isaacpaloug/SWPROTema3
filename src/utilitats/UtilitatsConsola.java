package utilitats;

import java.util.Scanner;

public class UtilitatsConsola {
	
	public static int llegirSencer(String prompt) {
		Scanner teclat = new Scanner(System.in);
		System.out.print(prompt);
		int sencer = teclat.nextInt();
		return sencer;
	}
	public static double llegirDouble(String prompt) {
		Scanner teclat = new Scanner(System.in);
		System.out.print(prompt);
		double doble = teclat.nextDouble();
		return doble;
	}
	
	public static String llegirCadena(String prompt) {
		Scanner teclat = new Scanner(System.in);
		System.out.print(prompt);
		String cadena = teclat.nextLine();
		return cadena;
	}
	
}
