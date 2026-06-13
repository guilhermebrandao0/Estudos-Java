package projetos.treinamento;

public class SistemaDeAprovacaoDeAlunos {
    public static void main(String[] args) {

    // Você deve criar uma classe responsável por:

        //Calcular a média de um aluno.
        //Receber 3 notas como parâmetros.
        //Retornar a média.
        //Verificar se o aluno foi:
        //Aprovado
        //Recuperação
        //Reprovado
        //Regras
        //Média maior ou igual a 7 → Aprovado
        //Média entre 5 e 6.9 → Recuperação
        //Média menor que 5 → Reprovado


        String nome1 = "Guilherme";
        //
        double prova1 = 4;
        double trabalho1 = 3;
        double test1 = 3;
        double media1 = prova1 + trabalho1 + test1;
        //
        String nome2 = "Beatryz";
        //
        double prova2 = 4;
        double trabalho2 = 3;
        double test2 = 3;
        double media2 = prova2 + trabalho2 + test2;
        //
        String nome3 = "Kamilly";
        //
        double prova3 = 2;
        double trabalho3 = 2.9;
        double test3 = 2;
        double media3 = prova3 + trabalho3 + test3;
        //
        String nome4 = "Karol";
        //
        double prova4 = 0;
        double trabalho4 = 1.5;
        double test4 = 2;
        double media4 = prova4 + trabalho4 + test4;

        System.out.println( );

        // Guilherme
        if (media1 >= 7){
            System.out.println("O " + nome1 + " passou de ano, a média dele no trimestre foi " + media1);
        } else if (media1 >= 5) {
            System.out.println("O " + nome1 + " infelizmente está de recuperação, a média dele do trimestre foi " + media1);
        }else System.out.println("O " + nome1 + " infelizmente não atingiu a nota necessária para passar de ano, a média dele no trimestre foi " + media1);

        System.out.println();

        // Bia
        if (media2 >= 7){
            System.out.println("A " + nome2 + " passou de ano, a média dela no trimestre foi " + media2);
        } else if (media2 >= 5) {
            System.out.println("A " + nome2 + " infelizmente está de recuperação, a média dela do trimestre foi " + media2);
        }else System.out.println("A " + nome2 + " infelizmente não atingiu a nota necessária para passar de ano, a média dela no trimestre foi " + media2);

        System.out.println( );

        //Karol
        if (media3 >= 7){
            System.out.println("A " + nome3 + " passou de ano, a média dele no trimestre foi " + media3);
        } else if (media3 >= 5) {
            System.out.println("A " + nome3 + " infelizmente está de recuperação, a média dela do trimestre foi " + media3);
        }else System.out.println("A " + nome3 + " infelizmente não atingiu a nota necessária para passar de ano, a média dela no trimestre foi " + media3);

        System.out.println();

        //Karol
        if (media4 >= 7){
            System.out.println("A " + nome4 + " passou de ano, a média dele no trimestre foi " + media4);
        } else if (media4 >= 5) {
            System.out.println("A " + nome4 + " infelizmente está de recuperação, a média dele do trimestre foi " + media4);
        }else System.out.println("A " + nome4 + " infelizmente não atingiu a nota necessária para passar de ano, a média dela no trimestre foi " + media4);
    }
}
