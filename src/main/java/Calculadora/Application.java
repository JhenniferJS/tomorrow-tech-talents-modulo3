package Calculadora;

public class Application {

    public static void main(String[] args) {
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();

        double n1 = 10.0;
        double n2 = 5.0;

        System.out.println("Soma: " + soma.calcular(n1, n2));
        System.out.println("Subtracao: " + subtracao.calcular(n1, n2));
        System.out.println("Multiplicacao: " + multiplicacao.calcular(n1, n2));
        System.out.println("Divisao: " + divisao.calcular(n1, n2));
    }

}
