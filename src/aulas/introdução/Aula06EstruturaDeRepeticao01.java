package aulas.introdução;

public class Aula06EstruturaDeRepeticao01 {
    public static void main(String[] args) {

        // Perdi arquivo das ultimas 10 aulas.., sobre Tipos Primitivos, Operadores e
        // Estruturas Condicionais.

        // Aqui vamos falar sobre Estruturas de Repetições

        // while, do while, for

        int count = 0;

        while (count < 10){
            count++;
            System.out.println(count);

            // while geralmente e usado quando não sabemos até quando ou quanto vamos ir,
            // por exemplo, eu quero ir até 15 ai eu preciso digir que quero ir até 15.

        }

        System.out.println( );

        do {
            System.out.println("Dentro do do-while tem "+ count);
            count++;

            // do while a gente usa quando precisa que algo seja amostrado pelo menos uma vez,
            // antes de uma verificação, por exemplo em menus, que aparece as vezes assim
            // "menu" você aperta ai tem "play" "exit" "config" isso você usa do while para
            // poder aparecer essas opções e depois o usuário escolhe oque ele ira fazer.

        }while (count < 10);

        System.out.println( );

        for(int i = 0; i <= 10; i++){
            System.out.println("For "+i);
        }
    }
}
