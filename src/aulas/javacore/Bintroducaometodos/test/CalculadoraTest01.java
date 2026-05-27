package aulas.javacore.Bintroducaometodos.test;

import aulas.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        calculadora.somaDoisNumeros(1, 2);

        System.out.println( );

        calculadora.subtraiDoisNumeros(3, 2);

        System.out.println( );

        calculadora.multiplicaDoisNumeros(10, 20);

        System.out.println( );

        calculadora.dividirDoisNumeros(30, 2);

        System.out.println("Finalizando calculadoraTest01");
    }
}
