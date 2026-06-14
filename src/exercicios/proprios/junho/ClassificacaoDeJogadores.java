package exercicios.proprios.junho;

public class ClassificacaoDeJogadores {
    public static void main(String[] args) {
        System.out.println( );

        // Crie 5 jogadores.
        //
        //Cada jogador deve ter:
        //
        //Nome
        //Quantidade de pontos
        //
        //Use arrays.
        //
        //Regras
        //
        //Se os pontos forem:
        //
        //Menor que 1000 → Bronze
        //Entre 1000 e 4999 → Prata
        //Entre 5000 e 9999 → Ouro
        //10000 ou mais → Diamante

        String [] nome = new String[5];
        double [] pontos = new double[5];

        nome [0] = "Guilherme";  pontos [0] = 12500;
        nome [1] = "Beatryz";    pontos [1] = 7500;
        nome [2] = "Kamilly";    pontos [2] = 3200;
        nome [3] = "Karol";      pontos [3] = 850;
        nome [4] = "Kaiky";      pontos [4] = 10200;

        for (int i = 0; i < 5; i++){

            System.out.println(nome [i]);
            System.out.println("Com: " + (int)pontos [i]+ " pontos");

            if (pontos [i] >= 10000){
                System.out.println("Hank: Diamante");
            } else if (pontos [i] >= 5000) {
                System.out.println("Hank: Ouro");
            } else if (pontos [i] >= 1000) {
                System.out.println("Hank: Prata");
            }else{
                System.out.println("Hank: Bronze");
            }
            System.out.println( );
        }
    }
}
