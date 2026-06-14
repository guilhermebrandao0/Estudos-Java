package exercicios.proprios.maio;

public class ExerciciosArrays02 {
    public static void main(String[] args) {

        // 1. Crie um array de inteiros com 6 posições
        // 2. Coloque os valores: 3, 6, 9, 12, 15, 18
        // 3. Use um for para imprimir todos os valores na tela, um por linha

        int [] numeros = {3, 6, 9, 12, 15, 18};

        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
        System.out.println();

        //Segundo exercicio

        // 1. Crie um array de inteiros com os valores: 5, 12, 8, 21, 3, 14
        // 2. Percorra o array usando um for
        // 3. Some todos os valores do array
        // 4. No final, mostre na tela a soma total

        int [] number = {3, 5, 8, 12, 14, 21};
        int soma = 0;

        for (int j = 0; j < number.length; j++){
            soma = soma + number[j];

            System.out.println(number[j]);
        }
        System.out.println("A soma desses valores é "+soma);

        System.out.println();

        // Terceiro exercicio

        // 1. Crie um array multidimensional int[][] com 2 linhas
        // 2. Na primeira linha coloque: 10, 20, 30
        // 3. Na segunda linha coloque: 40, 50, 60
        // 4. Use dois for para imprimir todos os valores na tela

        int [][] number1 = new int [2][3];

        number1[0][0] = 10;
        number1[0][1] = 20;
        number1[0][2] = 30;

        number1[1][0] = 40;
        number1[1][1] = 50;
        number1[1][2] = 60;

        for (int[] arrBase : number1){
            System.out.println("\n-----");
            for (int resu : arrBase){
                System.out.print(resu +" ");
            }
        }
    }
}
