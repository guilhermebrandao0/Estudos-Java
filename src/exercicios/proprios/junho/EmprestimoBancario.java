package exercicios.proprios.junho;

public class EmprestimoBancario {
    public static void main(String[] args) {
        System.out.println( );

        // Um banco analisa se uma pessoa pode pegar um empréstimo.

        //

        //Regras
        //Se o salário for menor que R$ 2.000 → Empréstimo negado.
        //Se o salário for entre R$ 2.000 e R$ 5.000 → Empréstimo máximo de R$ 10.000.
        //Se o salário for entre R$ 5.000 e R$ 10.000 → Empréstimo máximo de R$ 50.000.
        //Se o salário for maior ou igual a R$ 10.000 → Empréstimo máximo de R$ 100.000.
        //Pessoas

        //

        //Crie pelo menos 4 pessoas:
        //Guilherme
        //Beatryz
        //Stefan
        //Damon
        // Cada uma com um salário diferente.

        //

        //O programa deve mostrar
        //
        //Exemplo:
        //
        //Nome: Guilherme
        //Salário: R$ 1800.00
        //Status: Empréstimo negado
        //
        //ou
        //
        //Nome: Stefan
        //Salário: R$ 3500.00
        //Status: Empréstimo aprovado
        //Valor máximo disponível: R$ 10000.00
        //
        //ou
        //
        //Nome: Beatryz
        //Salário: R$ 7000.00
        //Status: Empréstimo aprovado
        //Valor máximo disponível: R$ 50000.00

        String [] nome = new String[4];
        double [] salario = new double[4];

        nome [0] = "Guilherme";    salario [0] = 16737.74;
        nome [1] = "Beatryz";      salario [1] = 11543.95;
        nome [2] = "Stefan";       salario [2] = 7952.42;
        nome [3] = "Damon";        salario [3] = 2982.98;

        for (int i = 0; i < 4; i++){
            if (salario [i] >= 10000){
                System.out.println(nome [i] + " você tem um valor de empréstimo de R$ 100.000");
            } else if (salario [i] >= 5000) {
                System.out.println(nome [i] + " você tem um valor de empéstimo de R$ 50.000");
            } else if (salario [i] >= 2000) {
                System.out.println(nome [i] + " você tem um valor de empréstimo de R$ 10.000");
            } else
                System.out.println(nome [i] + " seu empréstimo foi NEGADO");
            System.out.println();
        }
    }
}
