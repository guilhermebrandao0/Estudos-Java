package aulas.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros(int num1, int num2){
        System.out.println(num1 + num2);
    }

    public void subtraiDoisNumeros(int num3, int num4){
        System.out.println(num3 - num4);
    }

    public void multiplicaDoisNumeros(int num5, int num6){
        System.out.println(num5 * num6);
    }

    public  void dividirDoisNumeros(int num7, int num8){
        System.out.println(num7 / num8);
    }

    //

    public  double dividirDoisNumerosD(double num9, double num10){
        return num9/num10;
    }

    //

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("num1 " + num1);
        System.out.println("num2 " + num2);
    }

    }
