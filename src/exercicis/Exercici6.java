package exercicis;
/*
 * @ AUTHOR ISAAC
 */
public class Exercici6 {

	public void comparador(int a, int b, int c) {
		int aux;
        //Ens asseguram que a tengui el valor petit
        if (a > b) {
            aux = a;
            a = b;
            b = aux;
        }
        if (a > c) {
            aux = a;
            a = c;
            c = aux;
        }
        //Ordenam els altres dos valors
        if (b > c) {
            aux = b;
            b = c;
            c = aux;
        }
        System.out.println("a = " + a + " b = " + b + " c = " + c);
	}
	public static void main(String[] args) {
		int x = 20;
		int y = 35;
		int z = 12;
		Exercici6 p = new Exercici6();
		System.out.println("x = " + x + " y = " + y + " z = " + x);
		p.comparador(x, y, z);
		System.out.println("x = " + x + " y = " + y + " z = " + x);
		
		System.out.println("No apareixen ordenats ja que s'ordenen dins el metode pero a les variables de main no se modifiquen");
	}

}
