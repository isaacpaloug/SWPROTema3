package exercicis;

import utilitats.UtilitatsConsola;

/**
 *Realitza un programa que permeti executar les següents accions:
 *1. Trobar el major de dos sencers.
 *2. Trobar el major de tres sencers.
 *3. Mostrar la relació entre dos sencers a<b o a=b o a> b
 *Per a cada una d'elles has de crear un mètode que faci els càlculs necessaris. El main s'encarregarà de
 *• Mostrar a l'usuari les opcions possibles i demanar-li quina vol executar.
 *• Llegir l'opció que ha pitjat l'usuari.
 *• Per a cada opció llegir les dades necessàries.
 *• Cridar al mètode adequat passant-li les dades necessàries com a paràmetres.
 *• Aquest cicle es repetirà fins que l'usuari vulgui acabar el programa.
 *
 * @author Isaac Palou Gijón
 */
public class Exercici9 {
	public String majorDeDos(int a, int b) {
		if (a > b) {
			return "a";
		} else {
			return "b";
		}
	}
	
	public String majorDeTres(int a, int b, int c) {
		if ((a >= b) && (a >= c)) {
			return "a";
		} else if ((b >= a) && (b >= c)) {
			return "b";
		} else {
			return "c";
		}
	}
	
	public String relacio(int a, int b) {
		if (a > b) {
			return "a > b";
		} else if (a < b) {
			return "a < b";
		} else {
			return "a = b";
		}
	}
	public void mostraMenu() {
		System.out.println("TRIA UNA OPCIÓ:");
		System.out.println("1. Troba el major de dos sencers");
		System.out.println("2. Troba el major de tres sencers");
		System.out.println("3. Mostra la relacio entre dos sencers a<b o a=b o a>b");
		System.out.println("4. Acabar");
	}
	
	public static void main(String[] args) {
		Exercici9 p = new Exercici9();
		int opcio;
		String tornada;
		int a;
		int b;
		int c;
		
		do {
			p.mostraMenu();
			do {
				opcio = UtilitatsConsola.llegirSencer("Tria un numero entre 1 - 4: ");
			} while ((opcio < 1) || (opcio > 4));
			
			switch (opcio) {
			case 1:
				a = UtilitatsConsola.llegirSencer("Introdueix el primer numero: ");
				b = UtilitatsConsola.llegirSencer("Introdueix el segon numero: ");
				tornada = p.majorDeDos(a, b);
				System.out.println("El numero més gran és: " + tornada);
				break;
			case 2:
				a = UtilitatsConsola.llegirSencer("Introdueix el primer numero: ");
				b = UtilitatsConsola.llegirSencer("Introdueix el segon numero: ");
				c = UtilitatsConsola.llegirSencer("Introdueix el tercer numero: ");
				tornada = p.majorDeTres(a, b, c);
				System.out.println("El numero més gran és: " + tornada);
				break;
			case 3:
				a = UtilitatsConsola.llegirSencer("Introdueix el primer numero: ");
				b = UtilitatsConsola.llegirSencer("Introdueix el segon numero: ");
				tornada = p.relacio(a, b);
				System.out.println("Relacio: " + tornada);
				break;
			}
		} while (opcio != 4);
		
	}
} 