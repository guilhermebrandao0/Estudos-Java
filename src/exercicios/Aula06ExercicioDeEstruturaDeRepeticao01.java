package exercicios;

public class Aula06ExercicioDeEstruturaDeRepeticao01 {
    public static void main(String[] args) {
        // imprima todos os números pares de 0 até 1000000

        for (int resu = 0; resu <=1000000; resu ++){
            if (resu % 2 == 0) {
                System.out.println("Os números pares da resolução é  " + resu);
            }
        }
        System.out.println( );

        // Imprima os primeiros 25 números de um dado valor. Um exemplo, 50

        int ValorMax = 50;

        for (int num = 0; num <= ValorMax; num++){

            if (num>25){
                break;
            }

            System.out.println(num);
        }
    }
}
