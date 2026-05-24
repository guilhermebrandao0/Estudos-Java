package aulas.javacore.Aintroducaoclasses.test;

import aulas.javacore.Aintroducaoclasses.dominio.Estudante01;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante01 aluno = new Estudante01();

        Estudante01 aluno2 = new Estudante01();

        System.out.println(aluno.nome);
        System.out.println(aluno.idade);
        System.out.println(aluno.sexo);

        System.out.println("--------------------------------");

        System.out.println(aluno2.nome);
        System.out.println(aluno2.idade);
        System.out.println(aluno2.sexo);
    }
}
