package exercicios.proprios.maio;

public class ExercicioMaiorQueEComparacao {
    public static void main(String[] args) {

        // Criar um verificador de maior que, menor que ou igual


        // Por enquanto não sei usar scanner, então podemos mudar aqui os números
        int numero1 = 10;
        int numero2 = 10;

        if (numero1 > numero2){
            System.out.println(numero1 + " > " + numero2);
        } else if (numero1 < numero2) {
            System.out.println(numero1 + " < " + numero2);
        }else {
            System.out.println(numero1 + " = " + numero2);
        } System.out.println();

        // Agora eu quero que você crie algo que verifica quando algum número é Impar ou Par

        int number = 17;

        if (number % 2 == 0){
            System.out.println(number + " É um número PAR");
        }else{
            System.out.println(number + " É um número IMPAR");
        } System.out.println( );

        System.out.println("Finalizando exercícios propostos por mim mesmo.");

    }
}
