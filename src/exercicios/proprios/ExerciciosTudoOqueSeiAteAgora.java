package exercicios.proprios;

public class ExerciciosTudoOqueSeiAteAgora {
    public static void main(String[] args) {

        // DESAFIO 01

        // 1. Crie uma classe chamada Carro
        // 2. Dentro dela crie os atributos:
        //    nome
        //    marca
        //    ano
        //    velocidadeMaxima
        //
        // 3. No main, crie um objeto dessa classe
        //
        // 4. Preencha os atributos com informações de um carro
        //
        // 5. Mostre todas as informações na tela
        //
        // 6. Crie um array com 3 velocidades:
        //    120, 150, 180
        //
        // 7. Use um for-each para mostrar as velocidades

        Carro carro = new Carro();

        carro.marca = "BMW";
        carro.nome = "M4 COMPETITION G82";
        carro.ano = 2020;
        carro.velocidadeMaxima = 250;

        System.out.print("Eu tenho uma "+ carro.marca);
        System.out.print(" "+ carro.nome);
        System.out.print(" " + carro.ano);
        System.out.print(" que pega " + carro.velocidadeMaxima + "Km/h");

        System.out.println( );
        System.out.println( );

        System.out.println("Eu tenho uma "+ carro.marca +" "+ carro.nome + " " + carro.ano + " que pega " + carro.velocidadeMaxima + "Km/h");
    }

    public static class Carro {

        public  String marca;
        public String nome;
        public int ano;
        public int velocidadeMaxima;

    }
}
