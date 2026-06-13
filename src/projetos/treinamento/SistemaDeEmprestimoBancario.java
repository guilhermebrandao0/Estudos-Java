package projetos.treinamento;

public class SistemaDeEmprestimoBancario {
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

        String nome1 = "Guilherme";

        double salario1 = 16737.74;

        if (salario1 >= 10000){
            System.out.println(nome1 + " você tem um valor de empréstimo de R$ 100.000");
        } else if (salario1 >= 5000) {
            System.out.println(nome1 + " você tem um valor de empéstimo de R$ 50.000");
        } else if (salario1 >= 2000) {
            System.out.println(nome1 + " você tem um valor de empréstimo de R$ 10.000");
        } else
            System.out.println(nome1 + " seu empréstimo foi NEGADO");

        System.out.println( );
        //

        String nome2 = "Damon";

        double salario2 = 2982.98;

        if (salario2 >= 10000){
            System.out.println(nome2 + " você tem um valor de empréstimo de R$ 100.000");
        } else if (salario2 >= 5000) {
            System.out.println(nome2 + " você tem um valor de empéstimo de R$ 50.000");
        } else if (salario2 >= 2000) {
            System.out.println(nome2 + " você tem um valor de empréstimo de R$ 10.000");
        } else
            System.out.println(nome2 + " seu empréstimo foi NEGADO");

        System.out.println( );
        //

        String nome3 = "Beatryz";

        double salario3 = 11543.95;

        if (salario3 >= 10000){
            System.out.println(nome3 + " você tem um valor de empréstimo de R$ 100.000");
        } else if (salario3 >= 5000) {
            System.out.println(nome3 + " você tem um valor de empéstimo de R$ 50.000");
        } else if (salario3 >= 2000) {
            System.out.println(nome3 + " você tem um valor de empréstimo de R$ 10.000");
        } else
            System.out.println(nome3 + " seu empréstimo foi NEGADO");

        System.out.println( );
        //

        String nome4 = "Stefan";

        double salario4 = 7952.42;

        if (salario4 >= 10000){
            System.out.println(nome4 + " você tem um valor de empréstimo de R$ 100.000");
        } else if (salario4 >= 5000) {
            System.out.println(nome4 + " você tem um valor de empéstimo de R$ 50.000");
        } else if (salario4 >= 2000) {
            System.out.println(nome4 + " você tem um valor de empréstimo de R$ 10.000");
        } else
            System.out.println(nome4 + " seu empréstimo foi NEGADO");

        System.out.println( );
        //
    }
}
