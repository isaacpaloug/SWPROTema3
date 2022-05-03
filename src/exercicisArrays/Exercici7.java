package exercicisArrays;

public class Exercici7 {
	public void omplirMatriu(int[][] matriu) {
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                matriu[i][j] = i + j;
            }
        }
    }
	
    public void mostrarMatriu(int[][] matriu) {
        for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu[i].length; j++) {
                System.out.print(matriu[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
    public void mostrarDiagonalPrincipal(int[][] matriu) {
        for (int i = 0; i < matriu.length; i++) {
            System.out.print(matriu[i][i] + " ");
        }
        System.out.println();
    }
    public void mostrarDiagonalSecundaria(int[][] matriu) {
        for (int i = 0, j=matriu.length-1; i < matriu.length; i++, j--) {
            System.out.print(matriu[i][j] + " ");
        }
        System.out.println();
    }
    
	public static void main(String[] args) {
		final int MIDA=50;
        Exercici7 p = new Exercici7();

        int[][] matriu = new int[MIDA][MIDA];

        System.out.println();
        p.omplirMatriu(matriu);
        p.mostrarMatriu(matriu);
        System.out.println();
        p.mostrarDiagonalPrincipal(matriu);
        System.out.println();
        p.mostrarDiagonalSecundaria(matriu);

	}

}
