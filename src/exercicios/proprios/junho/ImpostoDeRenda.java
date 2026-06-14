package exercicios.proprios.junho;

public class ImpostoDeRenda {
    public static void main(String[] args) {
        System.out.println( );

        //Você trabalha em uma empresa e precisa verificar quanto imposto cada funcionário deve pagar.

        // REGRAS

        //Salário menor que R$ 2.000 → Isento
        //Salário entre R$ 2.000 e R$ 5.000 → 10% de imposto
        //Salário acima de R$ 5.000 → 20% de imposto

        // Crie pelo menos 4 funcionários: Guilherme, Beatryz, Damon, Stefan.

        String [] nome = new String[4];
        double [] salario = new double[4];

        nome [0] = "Guilherme";
        salario [0] = 14789.59;

        nome [1] = "Beatryz";
        salario [1] = 10896.78;

        nome [2] = "Damon";
        salario [2] = 3458.94;

        nome [3] = "Stefan";
        salario [3] = 1126.52;

        for(int i = 0; i < 4; i++) {
            if (salario[i] >= 5000){
                double imp1 = salario[i] * 20 / 100;
                System.out.println(nome [i] + " você pagará 20% de impostos ficou um total de " + (int)imp1  + " equivalente ao seu salário de " + salario [i]);
            } else if (salario [i] >= 2000) {
                double imp11 = salario[i] * 10 / 100;
                System.out.println(nome [i] + " você pagará 10% de impostos ficou um total de " + (int)imp11  + " equivalente ao seu salário de " + salario [i]);
            }else System.out.println(nome [i] + " seu imposto está Isento");

            System.out.println( );

        }
    }
}
