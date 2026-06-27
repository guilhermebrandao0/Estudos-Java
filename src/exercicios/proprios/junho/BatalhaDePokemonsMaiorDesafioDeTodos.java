package exercicios.proprios.junho;

public class BatalhaDePokemonsMaiorDesafioDeTodos {
    public static void main(String[] args) {

        //# Projeto: Sistema de Batalha Pokémon
        //
        //## Objetivo
        //
        //Criar um jogo de batalha em texto utilizando Java e os conceitos de Programação Orientada a Objetos.
        //
        //---
        //
        //# Classe Pokemon
        //
        //Cada Pokémon deve possuir os seguintes atributos:
        //
        //* Nome
        //* Tipo
        //* HP
        //* Ataque
        //* Defesa
        //* Velocidade
        //* Nível
        //* Experiência
        //
        //---
        //
        //# Métodos
        //
        //Todo Pokémon deve possuir os seguintes métodos:
        //
        //* atacar()
        //* defender()
        //* receberDano()
        //* subirNivel()
        //* mostrarStatus()
        //
        //---
        //
        //# Herança
        //
        //Crie pelo menos quatro Pokémon diferentes.
        //
        //Exemplo:
        //
        //* Pikachu
        //* Charmander
        //* Bulbasaur
        //* Squirtle
        //
        //Cada um deve possuir atributos iniciais diferentes.
        //
        //---
        //
        //# Tipos
        //
        //Implemente um sistema onde o tipo influencia o dano causado.
        //
        //Exemplo:
        //
        //* Fogo > Planta
        //* Planta > Água
        //* Água > Fogo
        //* Elétrico > Água
        //
        //Você decide o multiplicador de dano.
        //
        //---
        //
        //# Ataques Especiais
        //
        //Cada Pokémon deve possuir um ataque especial próprio.
        //
        //Exemplos:
        //
        //Pikachu
        //
        //* Choque do Trovão
        //
        //Charmander
        //
        //* Lança-Chamas
        //
        //Bulbasaur
        //
        //* Chicote de Vinha
        //
        //Squirtle
        //
        //* Jato d'Água
        //
        //Você decide o dano de cada ataque.
        //
        //---
        //
        //# Crítico
        //
        //Existe 15% de chance de um ataque causar dano crítico.
        //
        //Quando ocorrer um crítico:
        //
        //* O dano é dobrado.
        //
        //---
        //
        //# Esquiva
        //
        //A chance de esquivar deve depender da velocidade do Pokémon.
        //
        //Quanto maior a velocidade, maior a chance de esquivar.
        //
        //Se esquivar:
        //
        //* O Pokémon não recebe dano.
        //
        //---
        //
        //# Experiência
        //
        //Quando um Pokémon vencer uma batalha:
        //
        //* Ganha experiência.
        //
        //Ao atingir 100 pontos de experiência:
        //
        //* Sobe de nível.
        //* HP aumenta.
        //* Ataque aumenta.
        //* Defesa aumenta.
        //* A experiência volta para zero (ou mantém o excedente, se preferir).
        //
        //---
        //
        //# Menu
        //
        //Crie um menu semelhante a este:
        //
        //1 - Criar Pokémon
        //
        //2 - Ver Pokémons
        //
        //3 - Treinar Pokémon
        //
        //4 - Iniciar Batalha
        //
        //5 - Mostrar Ranking
        //
        //6 - Sair
        //
        //---
        //
        //# Ranking
        //
        //Ordene os Pokémons utilizando:
        //
        //1. Nível (maior primeiro)
        //2. Experiência
        //3. HP
        //
        //---
        //
        //# Sistema de Batalha
        //
        //A batalha deve acontecer automaticamente.
        //
        //Regras:
        //
        //* O Pokémon com maior velocidade ataca primeiro.
        //* Depois os ataques acontecem alternadamente.
        //* A batalha termina quando um dos Pokémons chegar a 0 de HP.
        //
        //Ao final exiba algo semelhante a:
        //
        //====================
        //
        //PIKACHU VENCEU!
        //
        //XP GANHA: 50
        //
        //====================
        //
        //---
        //
        //# Desafios Extras (Opcional)
        //
        //Se terminar tudo, implemente também:
        //
        //* Sistema de cura utilizando itens.
        //* Inventário de itens.
        //* Poções diferentes (Pequena, Média e Grande).
        //* Reviver Pokémon derrotado.
        //* Limite de usos para ataques especiais.
        //* Sistema de captura de Pokémons.
        //* Pokémons lendários.
        //* Sistema de torneio com vários Pokémons.
        //* Salvar e carregar o jogo em arquivos.
        //
        //---
        //
        //# Regras do Projeto
        //
        //* Não copiar código pronto da internet.
        //* Não assistir tutorial específico deste projeto.
        //* Pesquisar apenas documentação quando necessário.
        //* Organizar o código em várias classes.
        //* Utilizar encapsulamento.
        //* Utilizar herança.
        //* Evitar repetir código.
        //* Manter os métodos pequenos e organizados.
        //
        //---
        //
        //# Objetivo Final
        //
        //Ao terminar o projeto você deverá conseguir:
        //
        //* Criar Pokémons.
        //* Listá-los.
        //* Fazer batalhas completas.
        //* Ganhar experiência.
        //* Subir de nível.
        //* Exibir um ranking.
        //* Ter um código organizado e fácil de entender.
        //
        //Tempo estimado de desenvolvimento:
        //Entre 6 e 10 horas para quem domina os conceitos básicos de Programação Orientada a Objetos.


        String [] pokemons = new String[4];
        String [] tipo = new String[4];
        double [] hp = new double[4];
        double [] ataque = new double[4];
        double [] defesa = new double[4];
        double [] velocidade = new double[4];
        int [] nivel = new int[4];
        int [] experiencia = new int[4];

        pokemons[0] = "Picachu";     tipo[0] = "Elétrico";
        // Continuação dos detalhes do pokemon acima

        nivel[0] = 6767;
        hp[0] = 10;
        ataque[0] = 10;
        defesa[0] = 10;
        velocidade[0] = 111111111;
        experiencia[0] = 99999;

        pokemons[1] = "Charmander";  tipo[1] = "Fogo";
        // Continuação dos detalhes do pokemon acima

        nivel[1] = 6767;
        hp[1] = 10;
        ataque[1] = 10;
        defesa[1] = 10;
        velocidade[1] = 111111111;
        experiencia[1] = 99999;

        pokemons[2] = "Bulbasauro";  tipo[2] = "Planta";
        // Continuação dos detalhes do pokemon acima

        nivel[2] = 6767;
        hp[2] = 10;
        ataque[2] = 10;
        defesa[2] = 10;
        velocidade[2] = 111111111;
        experiencia[2] = 99999;

        pokemons[3] = "Squirtle";    tipo[3] = "Água";
        // Continuação dos detalhes do pokemon acima

        nivel[3] = 6767;
        hp[3] = 11;
        ataque[3] = 10;
        defesa[3] = 10;
        velocidade[3] = 111111111;
        experiencia[3] = 99999;

    }
}
