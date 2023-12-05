package trabalho;

import java.io.IOException;
import java.util.Scanner;

public class aep {

    public static void main(String[] args) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        double result;
        try (Scanner sc = new Scanner(System.in)) {
            while(true){
            System.out.println("Qual sua opção?");
            System.out.println("");
            System.out.println("1 Adição");
            System.out.println("2 Subtração");
            System.out.println("3 Multiplicação");
            System.out.println("4 Divisão");
            System.out.println("5 Porcentagem");
            System.out.println("6 Raiz quadrada");
            System.out.println("7 Minimo e máximo entre x e y");
            System.out.println("8 Expoenciação");
            System.out.println("");
            int op = sc.nextInt();
            System.out.println("");
            System.out.println("Opção " + op + " escolhida.");
            System.out.println("");
            
            switch (op){
                case 1:
                    System.out.println("Adição: ");
                    System.out.println("");
                    System.out.println("Digite o primeiro valor: ");
                        int n1adicao = sc.nextInt();
                        System.out.println("");
                    System.out.println("Digite o segundo valor: ");
                        int n2adicao = sc.nextInt();
                        result = n1adicao + n2adicao;
                        System.out.println("");
                    System.out.println("Resultado da adição: " + result);
                break;
                case 2:
                    System.out.println("Subtração: ");
                    System.out.println("");
                    System.out.println("Digite o primeiro valor: ");
                        int n1sub = sc.nextInt();
                        System.out.println("");
                    System.out.println("Digite o segundo valor: ");
                        int n2sub = sc.nextInt();
                        result = n1sub - n2sub;
                        System.out.println("");
                    System.out.println("Resultado da subtração: " + result);
                break;
                case 3: 
                    System.out.println("Multiplicação: ");
                    System.out.println("");
                    System.out.println("Digite o primeiro valor: ");
                        int n1mult = sc.nextInt();
                        System.out.println("");
                    System.out.println("Digite o segundo valor: ");
                        int n2mult = sc.nextInt();
                        result = n1mult * n2mult;
                        System.out.println("");
                    System.out.println("Resultado da multiplicação: " + result);
                break;
                case 4:
                    System.out.println("Divisão: ");
                    System.out.println("");
                    System.out.println("Digite o primeiro valor: ");
                        int n1div = sc.nextInt();
                        System.out.println("");
                    System.out.println("Digite o segundo valor: ");
                        int n2div = sc.nextInt();
                        result = n1div / n2div;
                        System.out.println("");
                    System.out.println("Resultado da divisão: " + result);
                break;
                case 5:
                    System.out.println("Porcentagem: ");
                    System.out.println("");
                    System.out.println("Digite o primeiro valor: ");
                        float n1por = sc.nextFloat();
                        System.out.println("");
                    System.out.println("Digite o segundo valor: ");
                        float n2por = sc.nextFloat();
                        result = (n1por/100)* n2por;
                        System.out.println("");
                    System.out.println("Resultado da porcentagem: " + result + "%");
                break;
                case 6:
                    System.out.println("Raiz Quadrada: ");
                    System.out.println("");
                    System.out.println("Digite o primeiro valor: ");
                        int x = sc.nextInt();
                        result = Math.sqrt(x);
                        System.out.println("");
                    System.out.println("Resultado da raiz quadrada de " + x + " é: " + result);
                break;
                case 7:
                    System.out.println("Minino e Máximo entre x e y: ");
                    System.out.println("");
                    System.out.println("Digite o primeiro valor: ");
                        float x1 = sc.nextFloat();
                        System.out.println("");
                    System.out.println("Digite o segundo valor: ");
                        float y1 = sc.nextFloat();
                        System.out.println("");
                        
                        if (x1 > y1){
                            System.out.println("Resultado do minimo e máximo entre x e y é: " + x1);
                        }else{
                            System.out.println("Resultado do minimo e máximo entre x e y é: " + y1);
                        }    
                break;
                case 8:
                    System.out.println("Exponenciação: ");
                    System.out.println("");
                    System.out.println("Digite o valor: ");
                        double xexp1 = sc.nextDouble();
                    System.out.println("Elevado á");
                        double xexp2 = sc.nextDouble();
                        result = Math.pow(xexp1,xexp2);
                        System.out.println("");
                    System.out.println("Resultado da exponenciação de é: " + result);
                break;    
                default:
                        System.out.println("Opção escolhida é invalida!!");
                break;
                }
                System.out.println("");
                System.out.println("Digite C e aperte ENTER para limpar o console: ");
                String c = sc.next();
                System.out.println(c);
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }           
        }
    }
}
            
               
        
    
    
    

