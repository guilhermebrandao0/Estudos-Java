package exercicios.proprios.junho;

public class CampeonatoDeRPG {
    public static void main(String[] args) {
        System.out.println( );

        // DESAFIO: SISTEMA DE CAMPEONATO DE RPG
        //
        //Você é responsável por criar um sistema que classifica os jogadores de um campeonato.
        //
        //DADOS
        //
        //Crie arrays para armazenar:
        //
        //- Nome dos jogadores
        //- Nível dos jogadores
        //- Quantidade de monstros derrotados
        //
        //Crie pelo menos 6 jogadores.
        //
        //--------------------------------------------------
        //
        //REGRAS DE PONTUAÇÃO
        //
        //A pontuação final de cada jogador é:
        //
        //Pontuação = (Nível × 100) + (Monstros derrotados × 10)
        //
        //--------------------------------------------------
        //
        //CLASSIFICAÇÃO
        //
        //Se a pontuação final for:
        //
        //- Menor que 1000 → Iniciante
        //- Entre 1000 e 2999 → Aventureiro
        //- Entre 3000 e 5999 → Guerreiro
        //- Entre 6000 e 9999 → Mestre
        //- 10000 ou mais → Lenda
        //
        //--------------------------------------------------
        //
        //O PROGRAMA DEVE MOSTRAR
        //
        //Para cada jogador:
        //
        //Nome:
        //Nível:
        //Monstros derrotados:
        //Pontuação final:
        //Classificação:
        //
        //Exemplo:
        //
        //Nome: Guilherme
        //Nível: 50
        //Monstros derrotados: 600
        //Pontuação final: 11000
        //Classificação: Lenda
        //
        //--------------------------------------------------
        //
        //DESAFIO EXTRA 1
        //
        //Conte quantos jogadores ficaram em cada classificação.
        //
        //Exemplo:
        //
        //Iniciantes: 2
        //Aventureiros: 1
        //Guerreiros: 2
        //Mestres: 1
        //Lendas: 0
        //
        //--------------------------------------------------
        //
        //DESAFIO EXTRA 2
        //
        //Descubra quem teve a maior pontuação do campeonato.
        //
        //No final mostre:
        //
        //Campeão: Guilherme
        //Pontuação: 15480
        //
        //--------------------------------------------------
        //
        //REGRAS
        //
        //- Usar Arrays
        //- Usar For
        //- Usar If / Else If / Else
        //- Usar Variáveis
        //- Fazer tudo sozinho
        //- Não usar conteúdos que ainda não estudou
        //
        //OBJETIVO
        //
        //Treinar:
        //- Arrays
        //- For
        //- If / Else If / Else
        //- Lógica de programação
        //- Comparações
        //- Cálculos
        //- Organização de código

        String [] nome = new String [6];
        int [] monstrosDerrotados = new int[6];
        int [] nivel = new int[6];
        int [] pontuacao = new int[6];

        nome[0] = "Guilherme"; monstrosDerrotados[0] = 750; nivel[0] = 85;
        nome[1] = "Mike";      monstrosDerrotados[1] = 180; nivel[1] = 22;
        nome[2] = "Max";       monstrosDerrotados[2] = 420; nivel[2] = 48;
        nome[3] = "Dustin";    monstrosDerrotados[3] = 950; nivel[3] = 99;
        nome[4] = "Lucas";     monstrosDerrotados[4] = 60;  nivel[4] = 14;
        nome[5] = "Eleven";    monstrosDerrotados[5] = 15;  nivel[5] = 5;

        for (int i = 0; i < 6; i++){

           pontuacao [i] = nivel[i] * 100 + monstrosDerrotados[i] * 10;

            System.out.println("-----------------------------------------------------------");
            System.out.println(nome[i]);
            System.out.println("Nivel: " + nivel[i]);
            System.out.println("Quantidade de monstros derrotados: " + monstrosDerrotados[i]);
            System.out.println("Pontuação final: " + pontuacao[i]);

            if (pontuacao[i] >= 10000){
                System.out.println("Lenda");
            } else if (pontuacao[i] >= 6000) {
                System.out.println("Mestre");
            }else if (pontuacao[i] >= 3000) {
                System.out.println("Guerreiro");
            } else if (pontuacao[i] >= 1000) {
                System.out.println("Aventureiro");
            }else
                System.out.println("Iniciante");
            System.out.println( );
        }
        System.out.println("-----------------------------------------------------------");
    }
}
