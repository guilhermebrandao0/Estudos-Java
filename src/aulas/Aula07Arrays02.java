package aulas;

public class Aula07Arrays02 {
    public static void main(String[] args) {

        // byte, short, int, long, float, long e double = 0
        // char = '\u0000' ' '
        // boolean = false
        // String = null

        // aqui vamos utilizar nomes e idades

        String [] nomes = new String[3];
        nomes[0] = "Ana";
        nomes[1] = "Joãozinho";
        nomes[2] = "Mário";
        int [] idades = new int[3];
        idades[0] = 21;
        idades[1] = 11;
        idades[2] = 33;

        System.out.println("Meu nome é "+nomes[0]+" e eu tenho "+idades[0]+" anos.");
        System.out.println("Meu nome é "+nomes[1]+" e eu tenho "+idades[1]+" anos.");
        System.out.println("Meu nome é "+nomes[2]+" e eu tenho "+idades[2]+" anos.");

        System.out.println( );

        // Outra forma de fazer arrays

        for (int i = 0; i < nomes.length; i++){
            System.out.println("Meu nome é "+nomes[i]+" e eu tenho "+idades[i]+" anos.");
        }
    }
}
