package sorteio;

import java.io.IOException;
import java.util.Scanner;

public class numeros {

    public static void main(String []args)throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        double sortear = Math.random();
        int tentativas = 0;
        int palpite = -1;
        Scanner scan = new Scanner(System.in);
        int rand = (int)(Math.floor(sortear*100));

        while(palpite != rand){
            System.out.println("Qual o seu palpite? ");
            palpite = scan.nextInt();

            System.out.println();

            if (palpite < rand){
                System.out.println("Número Maior");
            }else if (palpite > rand){
                System.out.println("Número Menor");
            }
            System.out.println();
            tentativas++;
        }
        System.out.println("Você acertou!!!");
        System.out.println("Você acertou em " + tentativas + " tentativas.");
    }
}

