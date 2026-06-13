package projetos.treinamento;

public class SistemaDeImpostoDeRenda {
    public static void main(String[] args) {
        System.out.println( );
        //Você trabalha em uma empresa e precisa verificar quanto imposto cada funcionário deve pagar.

        // REGRAS

        //Salário menor que R$ 2.000 → Isento
        //Salário entre R$ 2.000 e R$ 5.000 → 10% de imposto
        //Salário acima de R$ 5.000 → 20% de imposto

        // Crie pelo menos 4 funcionários: Guilherme, Beatryz, Damon, Stefan.

        // Guilherme
        String nome1 = "Guilherme";

        double sal1 = 14789.59;

        if (sal1 >= 5000){
            double imp1 = sal1 * 20 / 100;
            System.out.println(nome1 + " você pagará 20% de impostos ficou um total de " + (int)imp1  + " equivalente ao seu salário de " + sal1);
        } else if (sal1 >= 2000) {
            double imp11 = sal1 * 10 / 100;
            System.out.println(nome1 + " você pagará 10% de impostos ficou um total de " + (int)imp11  + " equivalente ao seu salário de " + sal1);
        }else System.out.println(nome1 + " seu imposto está Isento");

        System.out.println( );

        // Beatryz
        String nome2 = "Beatryz";

        double sal2 = 10896.78;

        if (sal2 >= 5000){
            double imp2 = sal2 * 20 / 100;
            System.out.println("Beatryz você pagará 20% de impostos ficou um total de " + (int)imp2  + " equivalente ao seu salário de " + sal2);
        } else if (sal2 >= 2000) {
            double imp22 = sal2 * 10 / 100;
            System.out.println("Beatryz você pagará 10% de impostos ficou um total de " + (int)imp22  + " equivalente ao seu salário de " + sal2);
        }else System.out.println("Beatryz seu imposto está Isento");

        System.out.println( );

        // Stefan
        String nome3 = "Stefan";

        double sal3 = 3458.94;

        if (sal3 >= 5000){
            double imp3 = sal3 * 20 / 100;
            System.out.println("Stefan você pagará 20% de impostos ficou um total de " + (int)imp3  + " equivalente ao seu salário de " + sal3);
        } else if (sal3 >= 2000) {
            double imp33 = sal3 * 10 / 100;
            System.out.println("Stefan você pagará 10% de impostos ficou um total de " + (int)imp33  + " equivalente ao seu salário de " + sal3);
        }else System.out.println("Stefan seu imposto está Isento");

        System.out.println( );

        // Damon
        String nome4 = "Damon";

        double sal4 = 1126.52;

        if (sal4 >= 5000){
            double imp4 = sal4 * 20 / 100;
            System.out.println("Damon você pagará 20% de impostos ficou um total de " + (int)imp4  + " equivalente ao seu salário de " + sal4);
        } else if (sal4 >= 2000) {
            double imp44 = sal4 * 10 / 100;
            System.out.println("Damon você pagará 10% de impostos ficou um total de " + (int)imp44  + " equivalente ao seu salário de " + sal4);
        }else System.out.println("Damon seu imposto está Isento");
    }
}
