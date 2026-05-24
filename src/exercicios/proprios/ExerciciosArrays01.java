package exercicios.proprios;

public class ExerciciosArrays01 {
    public static void main(String[] args) {

        // Crie um array de nomes com 5 posições.
        // Crie um array de idades com 5 posições.

        // Adicione nomes e idades nos arrays.

        // Use um for para percorrer todos os arrays utilizando o ".length"

        // Se a idade da pessoa for menor que 18 utilize "continue"
        // para não mostrar essa pessoa no System.out.println.

        // Mostre apenas as pessoas válidas no formato:
        // Nome: X | Idade: Y

        String [] nomes = new String[5];

        nomes[0] = "Aline";
        nomes[1] = "Bryan";
        nomes[2] = "Thayná";
        nomes[3] = "Duda";
        nomes[4] = "Luana";

        int [] idades = new int[5];

        idades[0] = 45;
        idades[1] = 10;
        idades[2] = 23;
        idades[3] = 7;
        idades[4] = 26;

        for (int i = 0; i < nomes.length; i++){
            if (idades[i] < 18){
                continue;
            }

            System.out.println(nomes[i]+ " tem "+ idades[i]+ " anos.");

        }
    }
}
