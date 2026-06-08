package aulas.javacore.Bintroducaometodos.test;

import aulas.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {

        // continuação dos execicios de calculadora

        Calculadora calculadora2 = new Calculadora();

       double result = calculadora2.dividirDoisNumerosD(20, 2);
        System.out.println((int)result);
    }
}
