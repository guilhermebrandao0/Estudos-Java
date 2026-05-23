package aulas;

public class Aula07Arrays01 {
    public static void main(String[] args) {

        // Aqui vamos aprender arrays, preciso separar 3 idades.

        int [] idades = new int[3];
        idades[0] = 21;
        idades[1] = 11;
        idades[2] = 33;

        // Em um Array a gente sempre começa na posição 0, por mas que tenha 3 espaços,
        // contamos a partir do 0 ai vai "0,1,2." = "1,2,3 espaços"

        System.out.println("Idade de Sra.Ana é "+idades[0]);
        System.out.println("Idade de Joãozinho é "+idades[1]);
        System.out.println("Idade do Sr.Pedro é "+idades[2]);
    }
}
