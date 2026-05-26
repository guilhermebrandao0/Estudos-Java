package aulas.javacore.Bintroducaometodos.test;

import aulas.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();

        System.out.println( );

        calculadora.subtraiDoisNumeros();

        System.out.println( );

        calculadora.multiplicaDoisNumeros(10, 20);

        System.out.println( );

        System.out.println("Finalizando calculadoraTest01");

    }
}
