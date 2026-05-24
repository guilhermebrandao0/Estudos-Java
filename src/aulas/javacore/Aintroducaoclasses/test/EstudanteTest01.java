package aulas.javacore.Aintroducaoclasses.test;

import aulas.javacore.Aintroducaoclasses.dominio.Estudante01;

public class EstudanteTest01 {
    public static void main(String[] args) {

        Estudante01 aluno = new Estudante01();

        aluno.nome = "Guilherme";
        aluno.idade = 15;
        aluno.sexo = 'M';

        System.out.print("Meu nome é "+aluno.nome);
        System.out.print(" eu tenho "+aluno.idade);
        System.out.print(" e sou do sexo "+aluno.sexo);
    }
}
