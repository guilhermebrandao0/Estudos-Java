package aulas.javacore.Aintroducaoclasses.test;

import aulas.javacore.Aintroducaoclasses.dominio.Professor01;

public class ProfessorTest01 {
    public static void main(String[] args) {

        Professor01 professor = new Professor01();

        professor.nome = "Amauri";
        professor.idade = 47;
        professor.sexo = "Homem";
        professor.disciplina = "Português";

        System.out.println("Meu nome é "+professor.nome+" eu tenho "+professor.idade+" anos, sou "+professor.sexo+", e dou aula de "+professor.disciplina);
    }
}
