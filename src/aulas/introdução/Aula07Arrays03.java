package aulas.introdução;

public class Aula07Arrays03 {
    public static void main(String[] args) {

        // Formas de se usar Arrays

        int [] number = new int[5];
        number[0] = 999;
        number[1] = 999;
        number[2] = 999;
        number[3] = 999;
        number[4] = 999;

        int [] number2 = {45, 10, 23, 7, 26};

        for (int i = 0; i < number2.length; i++){
            System.out.println(number2[i]);
        }

        System.out.println( );

        for (int f:number2){
            System.out.println(f);
        }
    }
}
