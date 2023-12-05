package ichigo;

class aluno{
    int idAluno;
    String nomeAluno;
    int serieAluno;

    void exibir(){
        System.out.println("Id do aluno: " + idAluno + "\n" + "Nome do aluno: " + nomeAluno + "\n" + "Serie do aluno: " +serieAluno);
    }

    void se(){
        
        if ((serieAluno <= 5) && (serieAluno >= 1)){
            System.out.println("Ensino Fundamental I");
        }else if (serieAluno <=9){
            System.out.println("Ensino Fundamental II");
        }
    }
}

    public class bankai {

        public static void main(String []args) {
            System.out.println("");
            System.out.println("");

            aluno aluno1 = new aluno();
            aluno1.idAluno = 4321;
            aluno1.nomeAluno = "Hermione";
            aluno1.serieAluno = 1;
            aluno1.exibir();
            aluno1.se();
            

            System.out.println("");
            System.out.println("");


            aluno aluno2 = new aluno();
            aluno2.idAluno = 1234;
            aluno2.nomeAluno = "Ronny";
            aluno2.serieAluno = 6;
            aluno2.exibir();
            aluno2.se();

            System.out.println("");
            System.out.println("");
        }
    }
