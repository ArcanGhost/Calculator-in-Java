package matriz;

import java.io.IOException;
import java.util.Scanner;

public class matrizdistancia {
    public static void main(String[] args) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        int mat[][] = new int[4][4];
        int i, j, c1, c2;
        Scanner ler = new Scanner(System.in);

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                if (i != j) {
                    System.out.println("Informe o valor: ");
                    System.out.println();
                    mat[i][j] = ler.nextInt();
                } else {
                    mat[i][j] = 0;
                }
            }
        }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(" Valor: " + mat[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Informe as cidades das quais você quer saber a distancia: ");
        c1 = ler.nextInt();
        System.out.println("Informe as cidades das quais você quer saber a distancia: ");
        c2 = ler.nextInt();
        System.out.println(mat[c1 - 1][c2 - 1]);
        
    }

}
