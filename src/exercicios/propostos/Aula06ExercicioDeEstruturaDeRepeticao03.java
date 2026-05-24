package exercicios.propostos;

public class Aula06ExercicioDeEstruturaDeRepeticao03 {
    public static void main(String[] args) {

        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condição é que o ValorParcela >= 1000
        // O ValorCarro = 48000

        double ValorTotal = 30000;

        for (int Parcela = (int) 30000; Parcela >= 1; Parcela--) {
            double ValorParcela = ValorTotal / Parcela;
            if (ValorParcela < 1000){
                continue;
            }
            System.out.println("Parcela " + Parcela + " R$ " + ValorParcela);
        }
    }
}