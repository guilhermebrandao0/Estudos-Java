package projetos.treinamento;

public class SistemaDeAprovacaoDeAlunosComArrays {
    public static void main(String[] args) {
        System.out.println( );

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

        String [] nome = new String [4];
        double [][] nota = new double[4][3];

        nome [0] = "Guilherme";  nota [0][0] = 3; nota [0][1] = 2.5; nota [0][2] = 2;
        nome [1] = "Beatryz";    nota [1][0] = 3; nota [1][1] = 1;   nota [1][2] = 3;
        nome [2] = "Kamilly";    nota [2][0] = 3; nota [2][1] = 0;   nota [2][2] = 1.5;
        nome [3] = "Karol";      nota [3][0] = 1; nota [3][1] = 0.5; nota [3][2] = 1.5;

        for (int i = 0; i < 4; i++) {

            double soma = 0;

            for (int j = 0; j < 3; j++) {
                soma += nota[i][j];
            }

            double total = soma;

            System.out.println("Nome: " + nome[i]);
            System.out.println("Média: " + total);

            if (total >= 5) {
                System.out.println("Situação: Aprovado");
            } else {
                System.out.println("Situação: Recuperação");
            }

            System.out.println();
        }

    }
}
