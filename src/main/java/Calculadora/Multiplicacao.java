package Calculadora;

public class Multiplicacao implements Calculo{
    @Override
    public double calcular(Double n1, Double n2) {
        return (n1 * n2);
    }
}
