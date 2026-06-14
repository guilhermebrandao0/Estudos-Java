package exercicios.proprios.junho;

public class TorneioDeLutadores {
    public static void main(String[] args) {
        System.out.println( );

        //// DESAFIO: SISTEMA DE TORNEIO DE LUTADORES
        ////
        //// DADOS
        ////
        //// Crie arrays para armazenar:
        ////
        //// - Nome do lutador
        //// - Quantidade de vitórias
        //// - Quantidade de derrotas
        ////
        //// Crie pelo menos 8 lutadores.
        ////
        //// --------------------------------------------------
        ////
        //// REGRAS
        ////
        //// Cada vitória vale:
        ////
        //// +3 pontos
        ////
        //// Cada derrota vale:
        ////
        //// -1 ponto
        ////
        //// Fórmula:
        ////
        //// Pontuação = (Vitórias × 3) - Derrotas
        ////
        //// --------------------------------------------------
        ////
        //// CLASSIFICAÇÃO
        ////
        //// Se a pontuação for:
        ////
        //// Menor que 10 → Iniciante
        //// Entre 10 e 29 → Amador
        //// Entre 30 e 59 → Profissional
        //// Entre 60 e 99 → Elite
        //// 100 ou mais → Lenda
        ////
        //// --------------------------------------------------
        ////
        //// O PROGRAMA DEVE MOSTRAR
        ////
        //// Para cada lutador:
        ////
        //// Nome:
        //// Vitórias:
        //// Derrotas:
        //// Pontuação:
        //// Classificação:
        ////
        //// Exemplo:
        ////
        //// Nome: Guilherme
        //// Vitórias: 40
        //// Derrotas: 10
        //// Pontuação: 110
        //// Classificação: Lenda
        ////
        //// --------------------------------------------------
        ////
        //// DESAFIO EXTRA 1
        ////
        //// Conte quantos lutadores ficaram em cada categoria.
        ////
        //// Exemplo:
        ////
        //// Iniciantes: 2
        //// Amadores: 1
        //// Profissionais: 3
        //// Elite: 1
        //// Lendas: 1
        ////
        //// --------------------------------------------------
        ////
        //// DESAFIO EXTRA 2
        ////
        //// Descubra quem teve a maior pontuação do torneio.
        ////
        //// No final mostre:
        ////
        //// Campeão do torneio:
        //// Pontuação:
        ////
        //// Exemplo:
        ////
        //// Campeão do torneio: Guilherme
        //// Pontuação: 110
        ////
        //// --------------------------------------------------
        ////
        //// DESAFIO EXTRA 3
        ////
        //// Descubra quem teve o maior número de vitórias.
        ////
        //// No final mostre:
        ////
        //// Rei das Vitórias:
        //// Vitórias:
        ////
        //// Exemplo:
        ////
        //// Rei das Vitórias: Stefan
        //// Vitórias: 52
        ////
        //// --------------------------------------------------
        ////
        //// DESAFIO EXTRA 4
        ////
        //// Descubra quem teve o menor número de derrotas.
        ////
        //// No final mostre:
        ////
        //// Melhor Defesa:
        //// Derrotas:
        ////
        //// Exemplo:
        ////
        //// Melhor Defesa: Damon
        //// Derrotas: 2
        ////
        //// --------------------------------------------------
        ////
        //// REGRAS
        ////
        //// - Usar Arrays
        //// - Usar For
        //// - Usar If / Else If / Else
        //// - Usar Variáveis
        //// - Fazer tudo sozinho
        //// - Não usar conteúdos que ainda não estudou
        ////
        //// OBJETIVO
        ////
        //// Treinar:
        //// - Arrays
        //// - For
        //// - If / Else If / Else
        //// - Lógica de programação
        //// - Comparações
        //// - Cálculos
        //// - Organização de código
        //// - Encontrar maior valor
        //// - Encontrar menor valor
        //// - Contadores

        String [] lutador = new String[8];
        String [] classificacao = new String[8];
        int [] vitorias = new int[8];
        int [] derrotas = new int[8];
        int [] pontuacao = new int[8];

        lutador[0] = "Guilherme"; vitorias[0] = 45; derrotas[0] = 8;
        lutador[1] = "Thomas";    vitorias[1] = 28; derrotas[1] = 12;
        lutador[2] = "Jhon";      vitorias[2] = 15; derrotas[2] = 10;
        lutador[3] = "Jeremy";    vitorias[3] = 38; derrotas[3] = 4;
        lutador[4] = "Miguel";    vitorias[4] = 8;  derrotas[4] = 5;
        lutador[5] = "Damon";     vitorias[5] = 3;  derrotas[5] = 2;
        lutador[6] = "Isobel";    vitorias[6] = 22; derrotas[6] = 6;
        lutador[7] = "Tyler";     vitorias[7] = 55; derrotas[7] = 3;

        // Inicio repetição
        for (int i = 0; i < 8; i++){

            // junção
            pontuacao[i] = vitorias[i] * 3 - derrotas[i];

            // names
            System.out.println(lutador[i]);
            System.out.println("Com: " + vitorias[i] + " Vitórias");
            System.out.println("Com: " + derrotas[i] + " Derrotas");
            System.out.println("Pontuação total: " + pontuacao[i]);

            if (pontuacao[i] >= 100){
                classificacao[i] = "Lenda";
                System.out.println("Classificacao: " + classificacao[i]);
            } else if (pontuacao[i] >= 60) {
                classificacao[i] = "Elite";
                System.out.println("Classificacao: " + classificacao[i]);
            } else if (pontuacao[i] >= 30) {
                classificacao[i] = "Profissional";
                System.out.println("Classificacao: " + classificacao[i]);
            } else if (pontuacao[i] >= 10) {
                classificacao[i] = "Amador";
                System.out.println("Classificacao: " + classificacao[i]);
            }else{
                classificacao[i] = "Iniciante";
                System.out.println("Classificacao: " + classificacao[i]);
            }
            System.out.println( );
        }
        // Fim repetição


    }
}
